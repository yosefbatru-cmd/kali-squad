# Kali Squad Architecture

## Layers

1. **UI** — Jetpack Compose, Material 3, navigation, responsive layouts
2. **Presentation** — ViewModels, UI state, one-shot events
3. **Domain** — Use cases, pure business rules
4. **Data** — Repositories, Room, DataStore, file I/O, cloud
5. **VPN** — `KaliSquadVpnService` + modular `TunnelEngine`

## Key components

| Component | Responsibility |
|-----------|----------------|
| `KaliSquadVpnService` | Official VpnService, TUN interface, foreground notification |
| `TunnelEngine` | Abstract transport (capabilities, connect, stats, events) |
| `.Linux` Parser / Serializer | Strict schema, validation, no code execution |
| Configuration Repository | Room + version history |
| Server Repository | Room + health metadata |
| Preferences (DataStore) | Theme, defaults, reconnect, UI flags |
| Cloud Repository | Optional encrypted sync (later) |

## Connection lifecycle

1. Validate configuration  
2. Check VPN permission (`VpnService.prepare`)  
3. Start foreground service  
4. Establish TUN via `Builder`  
5. Hand packets to engine  
6. Publish real state + statistics  

Never report CONNECTED until the service reaches that state.

## Phase map

Phases 1–35 are defined in the product specification.  
Phase 1 delivers foundation only.

# Kali Squad

Premium production Android VPN / tunnel application.

**Package:** `com.kalisquad.app`  
**Format:** `.Linux` configuration files  
**Stack:** Kotlin · Jetpack Compose · Material 3 · Hilt · Room · DataStore · VpnService

## Status

**Phase 1 — Project foundation** complete.

- Android application module with modern Gradle (Version Catalog)
- Official `android.net.VpnService` integration
- Jetpack Compose + Material 3 design system scaffold
- Bottom navigation (Home, Servers, Configs, Cloud, Settings)
- Hilt DI ready
- Room / DataStore dependencies prepared
- Localization-ready string resources
- Secure backup / extraction rules
- `.Linux` file association in manifest
- Foreground service notification channel

Later phases implement server manager, configuration editor, `.Linux` parser, encrypted export, tunnel engines, cloud sync, diagnostics, and the full premium experience.

## Architecture (target)

```
UI (Compose)
  → ViewModels
    → Use Cases
      → Repositories
        → Room / DataStore / Secure Storage / .Linux / Cloud
          → Tunnel Engine
            → KaliSquadVpnService (VpnService)
```

## Build

```bash
./gradlew :app:assembleDebug
```

Requires Android SDK 35, JDK 17+.

## Security principles

- `.Linux` files are **data only** — never executed
- Explicit Android VPN permission required
- No hard-coded credentials
- Sensitive data excluded from auto-backup
- Authenticated encryption for protected exports (later phases)

## License

Proprietary / All rights reserved unless otherwise stated.

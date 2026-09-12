# Security

## Principles

- Least privilege permissions
- Explicit user consent for VPN
- `.Linux` is data-only (no execution)
- Sensitive fields excluded from automatic backups
- Keystore-backed secrets (later phases)
- Authenticated encryption for protected exports
- Log redaction for sensitive values
- Input validation on all external data

## VPN

Uses official `android.net.VpnService`.  
Permission is requested via `VpnService.prepare()`.  
Never bypassed.

## Reporting

Security issues should be reported privately to the repository owner.

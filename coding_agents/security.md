# Security

Practical guardrails for this CV/portfolio app. The repository is intended to be publicly readable.

## Secrets

- Never commit API keys, tokens, or credentials. This project does not currently call any authenticated service; if that changes, route secrets through `local.properties` (gitignored) or platform-specific keystores, never through source files.
- `local.properties` is gitignored — leave it that way. It contains local SDK paths and is environment-specific.

## Personally identifiable information (PII)

- The app ships personal contact data (name, address, phone, email) for Leonardo Ruland under `feature/personal`. This is a deliberate choice — it is the point of a CV app.
- Do not add logging that emits this data at runtime.
- Do not add analytics, telemetry, or crash reporting without explicit owner approval. The current build is telemetry-free and should stay that way.

## Dependencies

- All dependencies live in `gradle/libs.versions.toml`. When bumping versions or adding a library:
  - Prefer JetBrains, Google, and androidx-published artifacts.
  - Spot-check the artifact's source repository for any recent security advisory before adopting.
  - Do not introduce ad-hoc third-party Compose libraries without prior owner approval.

## Web build

- The service worker (`app/src/wasmJsMain/resources/sw.js`) caches static assets only. Do not extend its cache list to include external origins, third-party scripts, or user-generated content.
- The web build must remain installable without any runtime network calls beyond loading the bundled resources.

## Build & CI

- Never use `--no-verify`, `-c commit.gpgsign=false`, or other hook/signing bypass flags without explicit owner approval.
- Never force-push to `main`.
- Do not weaken Android `minSdk` to expose APIs that are unsafe on older OS versions; raise an explicit question if a feature requires it.

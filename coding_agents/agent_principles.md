# Agent Principles

Binding rules for any AI/coding agent working in this repository.

## Core rules

- **Never assume anything — ask the owner for any decision.** When scope, naming, structure, behavior, or trade-offs are ambiguous, stop and ask before implementing. A clarifying question is always cheaper than a wrong refactor.
- **Reuse before invention.** Search the codebase for existing composables, utilities, modules, or patterns that solve the problem before adding new ones.
- **Modules stay self-contained.** Feature-specific strings, routes, and composables live in the feature module that owns them. Only genuinely shared building blocks belong in `:core`, `:theming`, or `:navigation`.
- **No comments by default.** Identifiers should explain *what*. Write a comment only when the *why* is non-obvious (a hidden constraint, a workaround, a surprising invariant).
- **Verify before declaring done.** At minimum run `./gradlew compileDebugKotlinAndroid` and confirm `BUILD SUCCESSFUL`. See [build_commands.md](./build_commands.md).
- **No hardcoded user-visible strings.** Every label, headline, or content description that a user can read goes through Compose Resources. See [coding_guidelines.md](./coding_guidelines.md#strings--i18n).

## Workflow rules

- Prefer editing existing files over creating new ones.
- Do not add features, abstractions, or refactors beyond what the task requires.
- Do not introduce error handling, fallbacks, or validation for scenarios that cannot happen.
- Do not bypass safety checks (`--no-verify`, `--force`, etc.) without explicit owner approval.
- Do not commit on behalf of the owner unless explicitly asked.
- Match the scope of actions to what was requested; authorization is per-task, not blanket.

## When to stop and ask

Stop and ask when any of the following is true:

- The requested change touches more than one module and the cross-module contract is not obvious.
- A naming decision would shape future code (interface names, package names, file names).
- A library/dependency would be added.
- The change overlaps with security, PII, or build/release configuration.
- The owner-visible behavior could change (UI text, layout, navigation).

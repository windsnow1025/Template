# Coding Patterns

- Constants use `PascalCase`.
- Avoid default and optional parameters unless there is a use case for calling without the argument.
- Avoid silencing errors (e.g., try-catch and conditional guards that skip failures).
- Avoid patch-style fallback logic (e.g., adding workarounds or special-case handling instead of fixing the root cause).
- Parameter ordering follows functional intent.
- Use official SDKs for external APIs and encapsulate request methods in client files.

## Directory Structure

```
project/
├── .env
├── .env.example
├── .gitignore
```

## Template Files

- Template files (`.gitignore`, `Dockerfile`, `.dockerignore`, GitHub Actions `.yaml`, etc.) start with a comment linking to the source template.
- Ignore files (`.gitignore`, `.dockerignore`) append a `# Custom` section at the end for project-specific entries.

## Python

### Non-ML Project Requirements

- Type annotations for all function signatures.
- Type annotations for variables when the type cannot be inferred.

### ML Project Requirements

- No type annotations.

#### Directory Structure

```
project/
├── app/
│   ├── config.py
│   ├── utils/
│   │   ├── input.py
│   │   └── output.py
│   └── core/
├── data/
├── output/
└── docs/
```

- Single main script:
```
project/
├── app/
│   ├── main.py
```

- Multiple scripts:
```
project/
├── app/
│   ├── scripts/
```

## React

CSS priority: global CSS > Tailwind > inline style

### Directory Structure

```
project/
├── src/
│   ├── components/
│   ├── data/
│   └── lib/
```

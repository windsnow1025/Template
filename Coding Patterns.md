# Coding Patterns

- Constants use `Pascal_Case`.
- Avoid silencing errors (e.g., try-catch and conditional guards that skip failures).
- Parameter ordering follows functional intent.
- Use official SDKs for external APIs and encapsulate request methods in client files.

## Directory Structure

```
project/
├── .env
├── .env.example
```

## Python

### Parameters & Arguments

- Avoid default parameter values unless `None`.
- Avoid keyword arguments unless default value.

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
│   ├── utils.py
│   ├── input.py
│   ├── output.py
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

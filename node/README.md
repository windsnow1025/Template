# <Project Name>

## Development

### pnpm

1. Install Node.js
2. Install pnpm: `npm install -g pnpm`
3. Install dependencies: `pnpm install`

### WebStorm

Settings >> Languages & Frameworks >> JavaScript Runtime >> Package manager: `~\AppData\Roaming\npm\pnpm.cmd`

## OpenAPI (Optional)

### Requirements

1. Install openapi-generator-cli globally.
    ```bash
    npm i -g @openapitools/openapi-generator-cli@latest
    ```
2. Install Java.
3. Install Python.
4. Install openapi-python-client.
    ```bash
    pip install --upgrade openapi-python-client
    ```

### Generate Client Package

```bash
rm -r <TypeScript Target File Path> # TypeScript
rm -r <Python Target File Path> # Python
```

```bash
# TypeScript
openapi-generator-cli generate -i http://localhost:3001/docs-json -g typescript-axios -o <TypeScript Target File Path>

# Python
openapi-python-client generate --url http://localhost:3001/docs-json --output-path <Python Target File Path>
```

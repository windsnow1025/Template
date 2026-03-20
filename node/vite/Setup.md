# Vite Setup

```bash
pnpm create vite
```

## Test

```bash
pnpm add -D vitest
```

## package.json

Add:

```json
{
  "packageManager": "pnpm@<version>",
}
```

## Dependencies

### MUI

```bash
pnpm add @mui/material @emotion/react @emotion/styled
pnpm add @mui/icons-material
```

### Tailwind CSS

```bash
pnpm install tailwindcss @tailwindcss/vite
```

Add in `vite.config.ts`:
```ts
import tailwindcss from '@tailwindcss/vite'
export default defineConfig({
  plugins: [
    tailwindcss(),
  ],
})
```
# Vite Setup

```bash
pnpm create vite
```

## Test

```bash
pnpm add -D vitest
```

## package.json

```json
{
  "packageManager": "pnpm@<version>",
}
```

## Dependencies

### Tailwind CSS

```bash
pnpm install tailwindcss @tailwindcss/vite
```

#### vite.config.ts

```ts
import tailwindcss from '@tailwindcss/vite'
export default defineConfig({
  plugins: [
    tailwindcss(),
  ],
})
```
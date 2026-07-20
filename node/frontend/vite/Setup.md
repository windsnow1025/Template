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
  "packageManager": "pnpm@<version>"
}
```

## Dependencies

### Tailwind CSS

```bash
pnpm add tailwindcss @tailwindcss/vite
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

### Vite PWA

```bash
pnpm add -D vite-plugin-pwa
```

#### vite.config.ts

```ts
import { VitePWA } from 'vite-plugin-pwa'

export default defineConfig({
  plugins: [
    VitePWA({ registerType: 'autoUpdate' })
  ]
})
```

# Python Setup

## Script

Add New Configuration >> uv run >> Script: `./app/main.py`

### Test

```bash
uv run pytest
```

## uvicorn

Add New Configuration >> uv run
- Run: `Module`
- Module: `uvicorn`
- Arguments: `app.main:app --reload --host 127.0.0.1 --port 8000`

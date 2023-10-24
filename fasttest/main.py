from fastapi import FastAPI
app=FastAPI()

@app.get("/")
async def hi():
	return {"hello","from","here"}
@app.get("/hola")
async def holaa():
	return {"hola amigo"}
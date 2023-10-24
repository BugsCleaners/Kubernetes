FROM alpine

RUN mkdir /fastttest
WORKDIR /fasttest
COPY requirements.txt .


COPY . .
CMD ["uvicorn","main:app","--host=0.0.0.0","--port=80"]
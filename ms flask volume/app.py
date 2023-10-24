from flask import Flask
import os
app = Flask(__name__)

@app.route("/")
def hi():
    #path=os.getenv('')



    with open("/home/sari/data.txt", "r") as file:
        data = file.read()
        print("this data: ",data)

    return data

if __name__ == "__main__":
    app.run(debug=True, host='0.0.0.0',port=80)

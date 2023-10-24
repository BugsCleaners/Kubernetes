from flask import Flask
import os
app = Flask(__name__)
@app.route("/")
def hello():

    pass0=os.getenv('USERNAME')
    return pass0

#    return app.config['USERNAME']


if __name__ == "__main__":
    # Only for debugging while developing
    app.run(host='0.0.0.0', debug=True, port=80)
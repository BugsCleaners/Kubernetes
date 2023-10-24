from flask import Flask
import os

app = Flask(__name__)

@app.route('/')
def hello():
    app.config.from_pyfile('config.cfg')
   try:
    return app.config[USERNAME]
   except:
    return "error found"
    #return 'Hello, {}!'.format(os.environ.get('USERNAME'))

if __name__ == '__main__':
    app.run(debug=True)

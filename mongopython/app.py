from flask import Flask, jsonify
from pymongo import MongoClient
app = Flask(__name__)
@app.route('/items')
def get_items():
    client = MongoClient("mongodb+srv://khalidwalamri:pass123@cluster2.igujuut.mongodb.net/?retryWrites=true&w=majority")
    db = client.mydatabase
    items = []
    for item in db.items.find():
        item['_id'] = str(item['_id'])
        items.append(item)
    return jsonify(items)
@app.route("/")
def hi():
    return "hi from flask"
if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')

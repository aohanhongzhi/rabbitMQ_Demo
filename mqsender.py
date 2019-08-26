#!/usr/bin/env python
import pika

connection =pika.BlockingConnection(pika.ConnectionParameters(host='127.0.0.1'))
channel = connection.channel()

channel.queue_declare(queue='hello')
for i in range(0,20):
    channel.basic_publish(exchange='',
                      routing_key='hello',
                      body=str(i)+'Hello World!Python')
print(" [x] Sent 'Hello World!'")
connection.close()

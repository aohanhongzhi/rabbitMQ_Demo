#!/usr/bin/env python
import pika ,time

connection = pika.BlockingConnection(
    pika.ConnectionParameters(host='localhost'))
channel = connection.channel()

channel.queue_declare(queue='hello')
# channel.basic_qos(1)


def callback(ch, method, properties, body):
    # time.sleep(3)
    print(" [x] Received %r" % body)
    ch.basic_ack(delivery_tag = method.delivery_tag)


channel.basic_consume(
    queue='hello', on_message_callback=callback, auto_ack=False)

print(' [*] Waiting for messages. To exit press CTRL+C')
channel.start_consuming()

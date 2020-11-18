import java.util.concurrent.CompletionStage
import java.util.concurrent.atomic.AtomicLong

import akka.Done
import akka.actor.ActorSystem
import akka.kafka.{ConsumerSettings, ProducerSettings, Subscriptions}
import akka.kafka.javadsl.Producer
import akka.kafka.scaladsl.Consumer
import akka.kafka.scaladsl.Consumer.DrainingControl
import akka.stream.scaladsl.{Keep, RunnableGraph, Sink, Source}
import org.apache.kafka.clients.consumer.{ConsumerConfig, ConsumerRecord}
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.TopicPartition
import org.apache.kafka.common.serialization.{StringDeserializer, StringSerializer}

import scala.concurrent.Future
import scala.util.{Failure, Success}

object MainApp extends App {
  implicit val system = ActorSystem("QuickStart")
  implicit val ec = system.dispatcher

  def f6() {
    val config = system.settings.config.getConfig("akka.kafka.producer")

    val producerSettings =
      ProducerSettings(config, new StringSerializer, new StringSerializer)
        .withBootstrapServers("localhost:9092")
    val r = scala.util.Random
    val done: CompletionStage[Done] =
      Source(1 to 1)
        .map(_.toString)
        .map(value => new ProducerRecord[String, String]("ads8", r.nextInt(300).toString))
        .runWith(Producer.plainSink(producerSettings))
  }
  def f6s() {
    val config = system.settings.config.getConfig("akka.kafka.producer")

    val producerSettings =
      ProducerSettings(config, new StringSerializer, new StringSerializer)
        .withBootstrapServers("localhost:9092")
    val r = scala.util.Random
    val done: CompletionStage[Done] =
      Source(1 to 1)
        .map(_.toString)
        .map(value => new ProducerRecord[String, String]("ads9", r.nextInt(300).toString))
        .runWith(Producer.plainSink(producerSettings))
  }
  def f6s1(string: String) {
    val config = system.settings.config.getConfig("akka.kafka.producer")

    val producerSettings =
      ProducerSettings(config, new StringSerializer, new StringSerializer)
        .withBootstrapServers("localhost:9092")
    val r = scala.util.Random
    val done: CompletionStage[Done] =
      Source(1 to 1)
        .map(_.toString)
        .map(value => new ProducerRecord[String, String]("ads10", string))
        .runWith(Producer.plainSink(producerSettings))
  }
  def f8() = {
    class OffsetStore {
      private val offset = new AtomicLong
      def businessLogicAndStoreOffset(record: ConsumerRecord[String, String]): Future[Done] = {
        println(record.value)
        val r = record.value.toString.toInt + 10

        f6s1(r.toString)
        offset.set(record.offset)
        Future.successful(Done)
      }
      def loadOffset(): Future[Long] = {
        Future.successful(offset.get)
      }



    }

    val topic = system.settings.config.getString("akka.kafka.producer.kafka-clients.topic")
    val bootstrapServers = system.settings.config.getString("akka.kafka.producer.kafka-clients.server")

    val consumerSettings = ConsumerSettings(system, new StringDeserializer, new StringDeserializer)
      .withBootstrapServers("localhost:9092")
      .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")
      .withClientId("externalOffsetStorage")

    val db = new OffsetStore
    db.loadOffset().map { fromOffset =>
      Consumer
        .plainSource(
          consumerSettings,
          Subscriptions.assignmentWithOffset(
            new TopicPartition("ads8", 0) -> fromOffset
          )
        )
        .mapAsync(1)(db.businessLogicAndStoreOffset)
        .toMat(Sink.seq)(DrainingControl.apply)
        .run()
    }


  }
  def f8ss() = {
    class OffsetStore {
      private val offset = new AtomicLong
      def businessLogicAndStoreOffset(record: ConsumerRecord[String, String]): Future[Done] = {
        println(record.value)

        offset.set(record.offset)
        Future.successful(Done)
      }
      def loadOffset(): Future[Long] = {
        Future.successful(offset.get)
      }



    }

    val topic = system.settings.config.getString("akka.kafka.producer.kafka-clients.topic")
    val bootstrapServers = system.settings.config.getString("akka.kafka.producer.kafka-clients.server")

    val consumerSettings = ConsumerSettings(system, new StringDeserializer, new StringDeserializer)
      .withBootstrapServers("localhost:9092")
      .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")
      .withClientId("externalOffsetStorage")

    val db = new OffsetStore
    db.loadOffset().map { fromOffset =>
      Consumer
        .plainSource(
          consumerSettings,
          Subscriptions.assignmentWithOffset(
            new TopicPartition("ads10", 0) -> fromOffset
          )
        )
        .mapAsync(1)(db.businessLogicAndStoreOffset)
        .toMat(Sink.seq)(DrainingControl.apply)
        .run()
    }


  }
  def f8s() = {
    class OffsetStore {
      private val offset = new AtomicLong
      def businessLogicAndStoreOffset(record: ConsumerRecord[String, String]): Future[Done] = {
        println(record.value)
        val r = record.value.toString.toInt + 10

        f6s1(r.toString)
        offset.set(record.offset)
        Future.successful(Done)
      }
      def loadOffset(): Future[Long] = {
        Future.successful(offset.get)
      }



    }
    val topic = system.settings.config.getString("akka.kafka.producer.kafka-clients.topic")
    val bootstrapServers = system.settings.config.getString("akka.kafka.producer.kafka-clients.server")

    val consumerSettings = ConsumerSettings(system, new StringDeserializer, new StringDeserializer)
      .withBootstrapServers("localhost:9092")
      .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")
      .withClientId("externalOffsetStorage")

    val db = new OffsetStore
    db.loadOffset().map { fromOffset =>
      Consumer
        .plainSource(
          consumerSettings,
          Subscriptions.assignmentWithOffset(
            new TopicPartition("ads9", 0) -> fromOffset
          )
        )
        .mapAsync(1)(db.businessLogicAndStoreOffset)
        .toMat(Sink.seq)(DrainingControl.apply)
        .run()
    }


  }
  f6()
  f6s()
  f8()
  f8s()
  f8ss()








}

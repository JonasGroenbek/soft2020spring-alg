package dk.cphbusiness.alg.basics

interface Selection<T> : Iterable<T> {
  fun isEmpty() = size == 0
  val size: Int
  }

interface Bag<T> : Selection<T> {
  fun add(item: T)
  }

interface Queue<T> : Selection<T> {
  fun enqueue(item: T)
  fun dequeue() : T
  }

interface Stack<T> : Selection<T> {
  fun push(item: T)
  fun pop() : T
  }

package com.monsss.queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: zt
 * @time: 2021/2/1 16:28
 */
public class Test {

    public static void main(String[] args) {

        ArrayBlockingQueue arrayBlockingQueue;

        PriorityQueue priorityQueue=new PriorityQueue();

        Queue queue2=new ArrayDeque(10);

        Queue queue3=new ArrayBlockingQueue(10);


        Queue queue=new BlockingQueue() {
            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean offer(Object o) {
                return false;
            }

            @Override
            public void put(Object o) throws InterruptedException {

            }

            @Override
            public boolean offer(Object o, long timeout, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public Object take() throws InterruptedException {
                return null;
            }

            @Override
            public Object poll(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public int remainingCapacity() {
                return 0;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int drainTo(Collection c) {
                return 0;
            }

            @Override
            public int drainTo(Collection c, int maxElements) {
                return 0;
            }

            @Override
            public Object remove() {
                return null;
            }

            @Override
            public Object poll() {
                return null;
            }

            @Override
            public Object element() {
                return null;
            }

            @Override
            public Object peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        Queue queue1=new BlockingDeque() {
            @Override
            public void addFirst(Object o) {

            }

            @Override
            public void addLast(Object o) {

            }

            @Override
            public boolean offerFirst(Object o) {
                return false;
            }

            @Override
            public boolean offerLast(Object o) {
                return false;
            }

            @Override
            public void putFirst(Object o) throws InterruptedException {

            }

            @Override
            public void putLast(Object o) throws InterruptedException {

            }

            @Override
            public boolean offerFirst(Object o, long timeout, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public boolean offerLast(Object o, long timeout, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public Object takeFirst() throws InterruptedException {
                return null;
            }

            @Override
            public Object takeLast() throws InterruptedException {
                return null;
            }

            @Override
            public Object pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public Object pollLast(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public boolean removeFirstOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean offer(Object o) {
                return false;
            }

            @Override
            public void put(Object o) throws InterruptedException {

            }

            @Override
            public boolean offer(Object o, long timeout, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public Object remove() {
                return null;
            }

            @Override
            public Object poll() {
                return null;
            }

            @Override
            public Object take() throws InterruptedException {
                return null;
            }

            @Override
            public Object poll(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public Object element() {
                return null;
            }

            @Override
            public Object peek() {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public void push(Object o) {

            }

            @Override
            public Object removeFirst() {
                return null;
            }

            @Override
            public Object removeLast() {
                return null;
            }

            @Override
            public Object pollFirst() {
                return null;
            }

            @Override
            public Object pollLast() {
                return null;
            }

            @Override
            public Object getFirst() {
                return null;
            }

            @Override
            public Object getLast() {
                return null;
            }

            @Override
            public Object peekFirst() {
                return null;
            }

            @Override
            public Object peekLast() {
                return null;
            }

            @Override
            public Object pop() {
                return null;
            }

            @Override
            public Iterator descendingIterator() {
                return null;
            }

            @Override
            public int remainingCapacity() {
                return 0;
            }

            @Override
            public int drainTo(Collection c) {
                return 0;
            }

            @Override
            public int drainTo(Collection c, int maxElements) {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }
}

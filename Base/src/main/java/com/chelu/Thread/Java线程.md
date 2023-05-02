# Java线程

程序是指令和数据的集合是一个静态的概念

线程是为了更好的利用计算机CPU资源

并行表示：多个CPU实例或者多台机器同时执行一段处理逻辑

并发表示：通过CPU调度算法，让用户看上去同时执行多个任务



线程安全：在多个线程中常常会共同使用一些共同变量，保证这些使用中按照一定的顺序执行

同步：Java中的同步指的是通过人为的控制和调度，保证共享资源的多线程访问成为线程安全，来保证结果的准确

## 线程的状态

![img](https://upload-images.jianshu.io/upload_images/1689841-383f7101e6588094.png?imageMogr2/auto-orient/strip%7CimageView2/2)

![image-20230311152232046](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20230311152232046.png)

Java中线程的状态分为6种。

> 1. **初始(NEW)**：新创建了一个线程对象，但还没有调用start()方法。
> 2. **运行(RUNNABLE)**：Java线程中将就绪（ready）和运行中（running）两种状态笼统的称为“运行”。线程对象创建后，其他线程(比如main线程）调用了该对象的start()方法。该状态的线程位于可运行线程池中，等待被线程调度选中，获取CPU的使用权，此时处于就绪状态（ready）。就绪状态的线程在获得CPU时间片后变为运行中状态（running）。
>
> 3. **阻塞(BLOCKED)**：表示线程阻塞于锁。
>
> 4. **等待(WAITING)**：进入该状态的线程需要等待其他线程做出一些特定动作（通知或中断）。
>
> 5. **超时等待(TIMED_WAITING)**：该状态不同于WAITING，它可以在指定的时间后自行返回。
>
> 6**终止(TERMINATED)**：表示该线程已经执行完毕。

这6种状态定义在Thread类的State枚举中

## 实现方式

Runnable,Callable,Thread

实现接口会更好一些，因为:

- Java 不支持多重继承，因此继承了 Thread 类就无法继承其它类，但是可以实现多个接口；
- 类可能只要求可执行就行，继承整个 Thread 类开销过大





## 静态代理

真实对象和代理对象实现同一个接口

代理对象代理真实角色



## Lamda表达式

(params) -> expression[表达式]

(params) -> statement[语句]

(params) -> {statements}

函数式接口 任何接口只包含唯一一个抽象方法，那便是一个函数式接口

可以使用lambda表达式来创建该接口



## 线程方法

setPriority

sleep

join

sleep



## 守护线程 daemon





## 线程同步

使用synchronized关键字，同步方法，加在方法上  锁是this

使用 synchronized(obj){代码}  同步块



## 死锁

使用lock
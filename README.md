# IK-Analyze Java开源中文分词器

IK Analyzer是一个开源的，基于java语言开发的轻量级的中文分词工具包。从2006年12月推出1.0版开始， IKAnalyzer已经推出了4个大版本。最初，它是以开源项目Luence为应用主体的，结合词典分词和文法分析算法的中文分词组件。从3.0版本开始，IK发展为面向Java的公用分词组件，独立于Lucene项目，同时提供了对Lucene的默认优化实现。在2012版本中，IK实现了简单的分词歧义排除算法，标志着IK分词器从单纯的词典分词向模拟语义分词衍化。

## IK Analyzer 2012特性

* 采用了特有的“正向迭代最细粒度切分算法“，支持细粒度和智能分词两种切分模式；
* 在系统环境：Core2 i7 3.4G双核，4G内存，window 7 64位， Sun JDK 1.6_29 64位 普通pc环境测试，IK2012具有160万字/秒（3000KB/S）的高速处理能力。
* 2012版本的智能分词模式支持简单的分词排歧义处理和数量词合并输出。
* 采用了多子处理器分析模式，支持：英文字母、数字、中文词汇等分词处理，兼容韩文、日文字符
* 优化的词典存储，更小的内存占用。支持用户词典扩展定义。特别的，在2012版本，词典支持中文，英文，数字混合词语

## 说明

IKAnalyzer的原作者为林良益[linliangyi2007@gmail.com](mailto:linliangyi2007@gmail.com) ，原始代码库为[http://code.google.com/p/ik-analyzer](http://code.google.com/p/ik-analyzer)

我的仓库「[https://github.com/renfei/ik-analyzer](https://github.com/renfei/ik-analyzer)」并不是官方仓库，是为了方便克隆的哦。

原始仓库的内容我放在了「[original分支](https://github.com/renfei/ik-analyzer/tree/original)」，「[master分支](https://github.com/renfei/ik-analyzer/tree/master)」是我自己修改的。
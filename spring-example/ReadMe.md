```
push代码报错：
fatal: unable to access 'https://github.com/Jackshufu/spring5.git/': OpenSSL SSL_read: Connection was aborted, errno 10053
15:26:47.928: [spring-framework-5.2.19.RELEASE] git -c credential.helper= -c core.quotepath=false -c log.showSignature=false push --progress --porcelain origin refs/heads/master:master
fatal: unable to access 'https://github.com/Jackshufu/spring5.git/': Failed to connect to github.com port 443: Timed out

在git设置   git config http.sslVerify "false"
也可尝试设置全局配置
```
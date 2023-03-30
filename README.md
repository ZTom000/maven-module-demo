# maven-module-demo
## 说明：
项目结构:

``` shell
+---maven-module-demo
|   \---maven-module-demo-common
|       \---target
|           \---classes
+---maven-module-demo-common
|   +---src
|    \- +---main
|       |   +---java
|       |   |   \---org
|       |   |       \---ztom
|       |   |           \---mmd
|       |   |               \---common
|       |   |                   +---contant
|       |   |                   +---entity
|       |   |                   \---utils
|       |   \---resources
|       \---test
|           \---java
|              \---org
|                   \---ztom
|                       \---mmd
\---maven-module-demo-module1
    +---src
     \--+---main
        |   +---java
        |   |   \---org
        |   |       \---ztom
        |   |           \---mmd
        |   |               +---controller
        |   |               \---service
        |   |                   \---impl
        |   \---resources
        \---test
            \---java
                \---org
                    \---ztom
                        \---mmd
```

module1 项目的 controller `/module1/test/{val}` 下调用 common 包的 `Result` 返回接口测试 maven 项目模块依赖

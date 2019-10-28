### 骨架屏弹性块
![在这里插入图片描述](https://github.com/TanZhiL/SkeletonBlock/blob/master/1.gif)

## Installation：
1.project.gradle
```java
    buildscript {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
2.app.gradle 添加
```java
dependencies {
   implementation 'com.github.TanZhiL:SkeletonBlock:1.0.3'
}

```
## Usage：
1. xml

```java
        <com.gykj.thomas.widget.SkeletonBlock
            android:id="@+id/tv_title1"
            android:layout_width="0dp"
            app:sb_duration="600"
            android:layout_height="12dp"
            android:layout_marginStart="8dp"
            android:background="#eeeeee"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toEndOf="@+id/iv_cover1"
            app:layout_constraintTop_toTopOf="@+id/iv_cover1" />

```

### 致谢
* 感谢所有开源库的大佬
### 问题反馈
欢迎加星，打call https://github.com/TanZhiL/SkeletonBlock
* email：1071931588@qq.com
### 关于作者
谭志龙
### 开源项目
* 快速切面编程开源库 https://github.com/TanZhiL/OkAspectj
* 高仿喜马拉雅听Android客户端 https://github.com/TanZhiL/Zhumulangma
* 骨架屏弹性块 https://github.com/TanZhiL/SkeletonBlock
### License
```
Copyright (C)  tanzhilong SkeletonBlock Framework Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

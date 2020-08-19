# EhViewer Mod version by Epix

WARN: The apk file signature is NOT same as official version(by seven332). You may have to uninstall official version to install this one. Export your data in official version, uninstall and install this one, import your data in this version. You can use Titanium Backup or other common method to keep data.

注意, 下载的 APK 签名与原版不同, 可能需要先卸载官方版. 可以通过 app 内置的导出功能: 官方版内导出数据, 卸载官方版, 安装 mod 版, mod 版内导入数据. 也可以直接使用钛备份等一般方法保留数据.

More info (Chinese): https://blog.exz.me/post/ehviewer-mod/

Modifications:

* Add more buttons to upper right menu in download scene. Select all, Edit mode, Selec below, Select read(at least read 2 pages), Start All (Reversed), Select done.
* Add a button to each gallery item in list view. Click it to add to download queue immediately without open detail or long press. Only show when the gallery has not been added to download or read yet.
* Show read progress/total page count in download and gallery scene. Use color to indicate read process. Red for not read yet and green for finished reading.
* When viewing pictures, press/hold on slide bar to jump to page immediately without releasing touch.
* Stop all downloads when encountering 509 or IP ban.
* Allow delay between picture downloads to slow down to prevent IP ban.
* Fix torrent download. ref: https://t.me/ehviewer/1090404

修改内容:

* 在下载界面内, 右上角菜单增加若干按钮, 分别是: 全选, 进入选择模式, 选择已选择条目及以下所有条目, 选择已读条目(阅读进度至少2页), 倒序开始下载全部, 选择已下载条目.
* 在画廊列表界面内, 每个条目上增加一个按钮, 点击可以直接添加到下载, 而无需打开详情再下载. 如果条目已经在下载列表内, 或者已经阅读过, 则按钮隐藏.
* 在下载/画廊列表界面, 显示 阅读进度/总页数, 并且使用渐变颜色指示进度, 完全没读过为红色, 读完为绿色.
* 阅读时, 滑动阅读进度条, 不需要松手就直接显示进度条指示的页面.
* 如果出现509或者IP ban, 停止所有下载.
* 添加新的三方tag翻译源.
* 允许在每张图片下载直接延迟一会儿, 以防止网速过快导致被 IP ban.
* 修正无法识别 torrent 的问题. ref: https://t.me/ehviewer/1090404

original README by seven332

----
# DEPRECATED

[![Telegram](https://img.shields.io/badge/chat-Telegram-blue.svg)](https://t.me/ehviewer)

# EhViewer

![Icon](art/launcher_icon-web.png)

这是一个 E-Hentai Android 平台的浏览器。

An E-Hentai Application for Android.


# Screenshot

![screenshot-01](art/screenshot-01.png)


# Build

Windows

    > git clone https://github.com/seven332/EhViewer
    > cd EhViewer
    > gradlew app:assembleDebug

Linux

    $ git clone https://github.com/seven332/EhViewer
    $ cd EhViewer
    $ ./gradlew app:assembleDebug

生成的 apk 文件在 app\build\outputs\apk 目录下

The apk is in app\build\outputs\apk


# Download

[下载](https://github.com/seven332/EhViewer/releases)

[Download](https://github.com/seven332/EhViewer/releases)


# Thanks

本项目受到了诸多开源项目的帮助

Here is the libraries

- [AOSP](http://source.android.com/)
- [android-advancedrecyclerview](https://github.com/h6ah4i/android-advancedrecyclerview)
- [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/)
- [apng](http://apng.sourceforge.net/)
- [giflib](http://giflib.sourceforge.net)
- [greenDAO](https://github.com/greenrobot/greenDAO)
- [jsoup](https://github.com/jhy/jsoup)
- [libjpeg-turbo](http://libjpeg-turbo.virtualgl.org/)
- [libpng](http://www.libpng.org/pub/png/libpng.html)
- [okhttp](https://github.com/square/okhttp)
- [roaster](https://github.com/forge/roaster)
- [ShowcaseView](https://github.com/amlcurran/ShowcaseView)
- [Slabo](https://github.com/TiroTypeworks/Slabo)
- [TagSoup](http://home.ccil.org/~cowan/tagsoup/)


# License

    Copyright (C) 2014-2019 Hippo Seven

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

ic_launcher 图标为 Hippo Seven 所有，所有权利保留

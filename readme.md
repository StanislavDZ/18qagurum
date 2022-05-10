# Запуск Appium mobile tests

## Запуск в browserstack
* Создать файл с настройками:
> ```src/test/resources/config/browserstack.properties```
>
* Добавить данные:
>```
>deviceName=Google Pixel 4
>platformVersion=11.0
>user="***" - генерируется на browserstack
>key="***" - генерируется на browserstack
>app=bs://95f5d0ef3fe39cdf5ac84d7d4124e588eae68bd2
>url=http://hub.browserstack.com/wd/hub
>```
* Запуск тестов
> ```./gradlew clean selenide_android_test -Ddevice=browserstack```

## Запуск в emulator
* Создать файл с настройками:
> ```src/test/resources/config/emulator.properties```
* Добавить данные:
>```
>deviceName='***' - @DefaultValue("Pixel_4")
>platformName=Android
>platformVersion='***' -  @DefaultValue("11.0")
>app=https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/app-alpha-universal-release.apk?raw=true
>url=http://localhost:4723/wd/hub
>```
* Запустить Appium на 4723 порту
* Запуск тестов
> ```./gradlew clean selenide_android_test -Ddevice=emulator```


## Запуск в реальном девайсе
* Создать файл с настройками:
> ```src/test/resources/config/real.properties```
>
* Узнать deviceName через adb:
>Команда: ```adb devices```
* Добавить данные:
>```
>deviceName=******** - deviceName из adb
>platformName=Android
>platformVersion='***' -  platformVersion из мобилы
>app=https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/app-alpha-universal-release.apk?raw=true
>url=http://localhost:4723/wd/hub
>```
* Запустить Appium на 4723 порту
* Запуск тестов
> ```./gradlew clean selenide_android_test -Ddevice=real```
>  
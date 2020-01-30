In this project run automated BDD tests for Android whit APK FasTip included in the repository.

## Prerequisites

## Mac

Android SDK: https://developer.android.com/studio
Java JDK: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Homebrew: https://brew.sh/
Xcode installed: https://stackoverflow.com/questions/10335747/how-to-download-xcode-dmg-or-xip-file

## If you use zsh use the following environment variables

```
$ source ~/.zshrc
$ open ~/.zshrc
```

## If you use bash use the following environment variables

```
$ source .bash_profile
$ open .bash_profile
```

```
#Android SDK Environment
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=${PATH}$JAVA_HOME/bin
export ANDROID_HOME=/Users/haroldpinedavaliente/Library/Android/sdk
                          >>>>  your user  <<<<
export ANDROID_SDK=$ANDROID_HOME
PATH=$PATH:$ANDROID_HOME/build-tools
PATH=$PATH:$ANDROID_HOME/tools
PATH=$PATH:$ANDROID_HOME/platform-tools
export PATH
```
Save, close the terminal and reopen it.

## Install appium and dependecies
This will install the command line version of appium.

```
$ brew install node
$ npm install -g appium
$ npm install wd
Verify appium installation
$ appium-doctor
```

## Clone the framework
```
git clone 'git@github.com:DiegoZaraza/TestingSudameris.git'
```

gem install bundler
## Start the appium server in console using:

```
$ appium
```

## INSTALL MAVEN DEPENDENCIES

In the project source execute:

```
$ mvn install
````

For execute test case

```
$ mvn test
```

# DotsLoader
> Android dotsloader

> A replacement of default android material progressbar with dots loader

### LinearDotsLoader
![loaders](https://cloud.githubusercontent.com/assets/12999622/24325203/bc34912e-11b9-11e7-9983-4b3fdd39276c.gif)
![dialog](https://cloud.githubusercontent.com/assets/12999622/22540867/a7c15658-e948-11e6-81a4-533b48f7d0d3.gif)

### Circular DotsLoader
![dialog](https://cloud.githubusercontent.com/assets/12999622/22540867/a7c15658-e948-11e6-81a4-533b48f7d0d3.gif)



## How To use
include below dependency in build.gradle of application and compile it
```
compile 'com.agrawalsuneet.androidlibs:dotsloader:0.3'
```

### LinearDotsLoader
* Through XML
```
<com.agrawalsuneet.dotsloader.ui.LinearDotsLoader
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:loader_animDur="1000"
        app:loader_noOfDots="8"
        app:loader_circleRadius="6dp"
        app:loader_defaultColor="@color/pink_default"
        app:loader_selectedColor="@color/pink_selected"
        app:loader_dotsDist="3dp"
        app:loader_expandOnSelect="true"
        app:loader_isSingleDir="false"
        app:loader_selectedRadius="10dp" />
```

*  Through Code
```
        LinearLayout containerLL = (LinearLayout) findViewById(R.id.container);

        LinearDotsLoader loader = new LinearDotsLoader(this);
        loader.setDefaultColor(R.color.loader_defalut);
        loader.setSelectedColor(R.color.loader_selected);
        loader.setIsSingleDir(true);
        loader.setNoOfDots(5);
        loader.setSelRadius(40);
        loader.setExpandOnSelect(true);
        loader.setRadius(30);
        loader.setDotsDist(20);
        loader.setAnimDur(500);
        containerLL.addView(loader);
```


### CircularDotsLoader
* Through XML
```
<com.agrawalsuneet.dotsloader.ui.CircularDotsLoader
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:loader_animDur="100"
        app:loader_bigCircleRadius="40dp"
        app:loader_circleRadius="12dp"
        app:loader_selectedColor="@color/purple_selected"
        app:loader_defaultColor="@color/purple_default"/>
```

*  Through Code
```
CircularDotsLoader loader = new CircularDotsLoader(MainActivity.this);
        loader.setDefaultColor(R.color.blue_delfault);
        loader.setSelectedColor(R.color.blue_selected);
        loader.setBigCircleRadius(80);
        loader.setRadius(24);
        loader.setAnimDur(300);
```

> For avoiding overlapping in CircularDotsLoader, set BigCircleLoader nearly four times of dotsRadius.

Feel free to drop a mail at agrawalsuneet@gmail.com if face any issue or require any additional functionality in it.

```
Copyright 2017 Suneet Agrawal

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

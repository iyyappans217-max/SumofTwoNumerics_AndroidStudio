# 🧮 Addition Calculator – Android Application

## 📌 Project Description

The Addition Calculator is a simple Android application developed using **Android Studio and Java**. It allows users to enter two numbers and calculate their sum by clicking the ADD button.

This project is developed to understand the basics of Android application development, XML UI designing, and Java event handling.

## 🎯 Aim

To develop a simple Android application that accepts two numbers from the user and displays their sum.

## 🛠️ Technologies Used

- **IDE:** Android Studio
- **Output** Android Mobile (connected with Android studio using USB)
- **Programming Language:** Java
- **UI Design:** XML
- **Layout:** ConstraintLayout
- **Platform:** Android

## ✨ Features

- Simple and user-friendly interface.
- Accepts two numerical inputs.
- Calculates the sum of two numbers.
- Displays the calculated result.
- Validates empty input fields.
- Interactive ADD button.

## ⚙️ How It Works

1. Launch the Addition Calculator application.
2. Enter the first number.
3. Enter the second number.
4. Click the ADD button.
5. The application calculates the sum.
6. The result is displayed on the screen.

## 📂 Project Structure

```text
AdditionCalculator/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── MainActivity.java
│           │
│           ├── res/
│           │   ├── drawable/
│           │   ├── layout/
│           │   │   └── activity_main.xml
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
├── build.gradle
└── README.md
```

## 🚀 How to Run the Project

1. Clone this repository.

```bash
git clone https://github.com/iyyappans217-max/SumofTwoNumerics_AndroidStudio
```

2. Open Android Studio.
3. Select **Open** and choose the downloaded project folder.
4. Wait for Gradle synchronization.
5. Connect an Android device or start an emulator.
6. Click the green **Run ▶** button.
7. The Addition Calculator application will launch.

## Program:
activity_main_xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#AAAAAA"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="176dp"
        android:layout_height="42dp"
        android:layout_marginTop="92dp"
        android:background="#7E5555"
        android:gravity="center"
        android:text="Sum of Two Numbers"
        android:textColor="#FFFFFF"
        android:textSize="18sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/textView2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="139dp"
        android:layout_height="33dp"
        android:layout_marginBottom="24dp"
        android:text="Enter First Number:"
        android:textColor="#9E6752"
        android:textSize="14sp"
        app:layout_constraintBottom_toTopOf="@+id/editTextText2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <EditText
        android:id="@+id/editTextText2"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="52dp"
        android:backgroundTint="#DE851E"
        android:gravity="center"
        android:hint="First Number"
        android:inputType="number"
        android:textSize="16sp"
        app:layout_constraintBottom_toTopOf="@+id/textView3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="153dp"
        android:layout_height="31dp"
        android:layout_marginBottom="12dp"
        android:text="Enter Second Number:"
        android:textColor="#9E6752"
        android:textSize="14sp"
        app:layout_constraintBottom_toTopOf="@+id/editTextText3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <EditText
        android:id="@+id/editTextText3"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="64dp"
        android:backgroundTint="#DE851E"
        android:gravity="center"
        android:hint="Second Number"
        android:inputType="number"
        android:textSize="16sp"
        app:layout_constraintBottom_toTopOf="@+id/button"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/button"
        android:layout_width="120dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="36dp"
        android:backgroundTint="#1ADB7D"
        android:text="ADD"
        android:textColor="#FFFFFF"
        android:textSize="16sp"
        app:layout_constraintBottom_toTopOf="@+id/editTextNumber"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/editTextNumber"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="120dp"
        android:background="#FFFFFF"
        android:gravity="center"
        android:hint="Result"
        android:padding="12dp"
        android:textColor="#00B0FF"
        android:textSize="18sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>

```
<br><hr>


MainActivity.java
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#AAAAAA"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="176dp"
        android:layout_height="42dp"
        android:layout_marginTop="92dp"
        android:background="#7E5555"
        android:gravity="center"
        android:text="Sum of Two Numbers"
        android:textColor="#FFFFFF"
        android:textSize="18sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/textView2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="139dp"
        android:layout_height="33dp"
        android:layout_marginBottom="24dp"
        android:text="Enter First Number:"
        android:textColor="#9E6752"
        android:textSize="14sp"
        app:layout_constraintBottom_toTopOf="@+id/editTextText2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <EditText
        android:id="@+id/editTextText2"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="52dp"
        android:backgroundTint="#DE851E"
        android:gravity="center"
        android:hint="First Number"
        android:inputType="number"
        android:textSize="16sp"
        app:layout_constraintBottom_toTopOf="@+id/textView3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="153dp"
        android:layout_height="31dp"
        android:layout_marginBottom="12dp"
        android:text="Enter Second Number:"
        android:textColor="#9E6752"
        android:textSize="14sp"
        app:layout_constraintBottom_toTopOf="@+id/editTextText3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <EditText
        android:id="@+id/editTextText3"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="64dp"
        android:backgroundTint="#DE851E"
        android:gravity="center"
        android:hint="Second Number"
        android:inputType="number"
        android:textSize="16sp"
        app:layout_constraintBottom_toTopOf="@+id/button"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/button"
        android:layout_width="120dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="36dp"
        android:backgroundTint="#1ADB7D"
        android:text="ADD"
        android:textColor="#FFFFFF"
        android:textSize="16sp"
        app:layout_constraintBottom_toTopOf="@+id/editTextNumber"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/editTextNumber"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="120dp"
        android:background="#FFFFFF"
        android:gravity="center"
        android:hint="Result"
        android:padding="12dp"
        android:textColor="#00B0FF"
        android:textSize="18sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>

```

## Output:
<img width="1541" height="868" alt="ApplicationOutput1" src="https://github.com/user-attachments/assets/0590de78-d0ba-4bd6-87bd-789b182d2ba8" />
<img width="1541" height="868" alt="ApplicationOutput2" src="https://github.com/user-attachments/assets/941b424d-1fcc-41a6-85a3-c462a1686571" />
<img width="1541" height="868" alt="ApplicationOutput3" src="https://github.com/user-attachments/assets/94d7a749-e47c-401f-8166-ef2bea5b61c1" />


## Final Result:
Program and Design for Addition of two numerics has been done and output is verified and seen through android Mobile coneected using android studio.



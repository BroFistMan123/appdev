# Mobile App Development by Merhamdin Umbukan

## Part 1: Hello World
* Hello + "input" with the use of a button
1. Create a button via design on activity_main.xml and insert this code in the button scope.
```java android:onClick="onBtnClick" ```
What it does is that it calls the method "onBtnClick" from the mainActivity.java.
2. Create the "onBtnClick" method inside MainActivity class but outside onCreate.
```java public void onBtnClick(View view){
        TextView txtHello = findViewById(R.id.txtMessage); //txtMessage is the id of the text that displays Hello World. It gives the identity as a TextView in here rather than just only being an id.
        EditText edtTxtName=findViewById(R.id.editTextName);//editTextName is the id of the editText(editable Text)
String name=edtTxtName.getText().toString(); //converts it to a String
        txtHello.setText("Hello " +name); //sets the TextView into a specific string
    } ```
* Result is in https://www.youtube.com/watch?v=fis26HvvDII at 59:00

## Part 2: Registration Form +View Form
* Create a registration form and show their values in the press of a button.
1. Create a button via design on activity_main.xml and insert this code in the button scope.
```java android:onClick="onBtnClick" ```
What it does is that it calls the method "onBtnClick" from the mainActivity.java.
Create three PlainTexts that corresponds to the First Name, Last Name and Email. Also with three textviews for displaying. Do not forget to name the ids.
Take care of the placement by using constraints.

2. Create the "onBtnClick" method inside MainActivity class but outside onCreate.
```java   public void onBtnClick(View view){
        TextView txtFname = findViewById(R.id.viewFname);
        TextView txtLname = findViewById(R.id.viewLname);
        TextView txtEmail = findViewById(R.id.viewemail);
        EditText edtFName=findViewById(R.id.firstName);
        EditText edtLName=findViewById(R.id.lastName);
        EditText edtEName=findViewById(R.id.email);
String fname=edtFName.getText().toString();
        String lname=edtLName.getText().toString();
        String ename=edtEName.getText().toString();
        txtFname.setText("First name:"+fname);
        txtLname.setText("Last name:"+lname);
        txtEmail.setText("Email:"+ename);
    } ```
* Result is in https://www.youtube.com/watch?v=fis26HvvDII at 01:06:49
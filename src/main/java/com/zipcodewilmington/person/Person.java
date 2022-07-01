package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {


    private String name;
    private Integer age;

    // roomNumber
    private Integer roomNumber;
    // teacherName
    private String teacherName;
    // favoriteFood
    private String favoriteFood;
    // favoriteColor
    private String favoriteColor;
    // favoriteNumber
    private Integer favoriteNumber;



    public Person() {


        name = "";
        age = Integer.MAX_VALUE;
        roomNumber = Integer.MAX_VALUE;
        teacherName = "Mrs.Frizzle";
        favoriteFood = "Pizza";
        favoriteColor = "Green";
        favoriteNumber = Integer.MAX_VALUE;

    }

    public Person(int age) {
        this.age = 5;
    }

    public Person(String name) {

        this.name = "Leon";
    }

    public Person(String name, int age) {

        this.name = "Leon";
        this.age = 5;
    }

    public String setName(String name) {
        return this.name="Leon";
    }

    public Integer setAge(int age) {
        return this.age=5;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

//    roomNumber = 201;
//    teacherName = "Mrs.Frizzle";
//    favoriteFood = "Pizza";
//    favoriteColor = "Green";
//    favoriteNumber = Integer.MAX_VALUE;

    public Integer setRoomNumber(int roomNumber) {

        return this.roomNumber = 201;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    //teacherName

    public String setTeacherName(String teacherName) {

        return this.teacherName = "Mrs.Frizzle";
    }

    public String getTeacherName() {
        return teacherName;
    }

    //favoriteFood

    public String setFavoriteFood(String favoriteFood) {

        return this.favoriteFood = "Pizza";
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    //favoriteColor
    public String setFavoriteColor(String favoriteColor) {

        return this.favoriteColor = "Green";
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    //favoriteNumber

    public Integer setFavoriteNumber(int favoriteNumber) {

        return this.favoriteNumber = 10;
    }

    public Integer getFavoriteNumber() {
        return favoriteNumber;
    }


}

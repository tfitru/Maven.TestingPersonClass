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
        teacherName = "";
        favoriteFood = "";
        favoriteColor = "";
        favoriteNumber = Integer.MAX_VALUE;

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String setName(String name) {
        return this.name= name;
    }

    public Integer setAge(int age) {
        return this.age=age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public Integer setRoomNumber(int roomNumber) {

        return this.roomNumber = roomNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    //teacherName

    public String setTeacherName(String teacherName) {

        return this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    //favoriteFood

    public String setFavoriteFood(String favoriteFood) {

        return this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    //favoriteColor
    public String setFavoriteColor(String favoriteColor) {

        return this.favoriteColor = favoriteColor;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    //favoriteNumber

    public Integer setFavoriteNumber(int favoriteNumber) {

        return this.favoriteNumber = favoriteNumber;
    }

    public Integer getFavoriteNumber() {
        return favoriteNumber;
    }


}

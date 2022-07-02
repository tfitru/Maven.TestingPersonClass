package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {


        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Integer expRoomNumber = Integer.MAX_VALUE;
        String expTeacherName = "";
        String expFavoriteFood = "";
        String expFavoriteColor = "";
        Integer expFavoriteNumber = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Integer actualRoomNumber = person.getRoomNumber();
        String actualTeacherName = person.getTeacherName();
        String actualFavoriteFood = person.getFavoriteFood();
        String actualFavoriteColor = person.getFavoriteColor();
        Integer actualFavoriteNumber = person.getFavoriteNumber();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expRoomNumber, actualRoomNumber);
        Assert.assertEquals(expTeacherName, actualTeacherName);
        Assert.assertEquals(expFavoriteFood, actualFavoriteFood);
        Assert.assertEquals(expFavoriteColor, actualFavoriteColor);
        Assert.assertEquals(expFavoriteNumber, actualFavoriteNumber);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }



    // roomNumber = 201;
    @Test
    public void testSetRoomNumber() {
        // Given
        Person person = new Person();
        Integer expected = 201;

        // When
        person.setRoomNumber(expected);

        // Then
        Integer actual = person.getRoomNumber();
        Assert.assertEquals(expected,actual);


    }



    // teacherName = "Mrs.Frizzle";
    @Test
    public void testTeacherName() {
        // Given
        Person person = new Person();
        String expected = "Mrs.Frizzle";

        // When
        person.setTeacherName(expected);

        // Then
        String actual = person.getTeacherName();
        Assert.assertEquals(expected, actual);

    }

    //    favoriteFood = "Pizza";
    @Test
    public void testSetFavoriteFood() {
        // Given
        Person person = new Person();
        String expected = "Pizza";

        // When
        person.setFavoriteFood(expected);

        // Then
        String actual = person.getFavoriteFood();
        Assert.assertEquals(expected, actual);
    }

    //    favoriteColor = "Green";

    @Test
    public void testFavoriteColor() {
        // Given
        Person person = new Person();
        String expected = "Green";

        // When
        person.setFavoriteColor(expected);

        // Then
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected,actual);



    }

    //    favoriteNumber = 10;
    @Test
    public void testFavoriteNumber() {
        // Given
        Person person = new Person();
        Integer expected = 10;

        // When
        person.setFavoriteNumber(expected);

        // Then
        Integer actual = person.getFavoriteNumber();
        Assert.assertEquals(expected, actual);
    }

}

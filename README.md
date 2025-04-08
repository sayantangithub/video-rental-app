# 🎬 Video Rental Inventory System

A simple inventory control system built in Java to manage video rentals for a small store. This project demonstrates the use of **Object-Oriented Programming (OOP)** concepts such as classes, objects, arrays, and encapsulation.

---

## 📌 Features

- Add new videos to the inventory
- Check out and return videos
- Receive and store user ratings
- List current video inventory with status
- Menu-driven console interface

---

## 🧱 Class Structure

### 1. `Video` Class

Represents an individual video.

**Attributes:**
- `String videoName` – Name of the video
- `boolean checkout` – Status of checkout
- `int rating` – User rating

**Methods:**
- `String getName()`
- `void doCheckout()`
- `void doReturn()`
- `void receiveRating(int rating)`
- `int getRating()`
- `boolean getCheckout()`

**Constructor:**
```java
Video(String name)

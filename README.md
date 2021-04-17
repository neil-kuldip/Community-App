# Community-App
App created by: Lucas Goldman, Neil Kuldip, Ambonique Thomas

Original App Design Project - README Template
===

# Community App

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
A location based community app where users can chat or meetup with other users in their area

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Social, Lifestyle
- **Mobile:** This app would be developed primarily for Android devices.
- **Story:** The app functions as a social medium for nearby people in a local community to be matched by common interests to communicate and become friends. Users can choose their top three interests and the radius of proximity for matching. However, the catch is that the AI decides who that person is paired to but the user decides whether to continue the conversation.
- **Market:** For ages 18+.
- **Habit:** The app can be used daily at any time of the day. There will be notifications for the user if there are responses from the chats.
- **Scope:** First we have our users create accounts and that will direct them to choose their top three interests. Afterwards, they will choose the proximity in miles from their location. From there, whether they choose to close the app or not, they will get a notification when they are matched to another user. This will take them to a chat with the other user to communicate.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User can login
* User can register an account
* User can make a profile
* Chats - matched by interests
* An interests tab
    * 3 column boxes w/ popular interests & search bar to find specific interests
    * name of interest + photo from google images of that interest? - should be found automatically
* ...

**Optional Nice-to-have Stories**

* A timeline of all chats
* A search feature to look for chats
* A map to view meetups
* Gamify app usage with coins (profile section) to increase usage in the app
* ...

### 2. Screen Archetypes

* Login
   * Register 
       * For first time users this should take them to interests page
       * Let them select stuff theyre interested in - make a profile
   * Profile
       * Finding users screen - feel free to close the app - or select more interests
       * Give a notification when a chat has been opened between 2 users
* Chats
   * Should be able give notifications of a new chat 
   * All chats -> clicking on a specific chat leads to different screen
   * Specific chat
       * Close chat
       * Send messages
       * No sending photos
* [stretch stories]
    * map
    * timeline
    * search

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* We dont need to worry about navigation until stretch stories
    * Fragments
        * Map
        * Profile
        * Timeline
        * Chats

**Flow Navigation** (Screen to Screen)

* First login (register)
   * Interests
   * Profile
   * Close the app / Select more interests
* Opening after logging in for the first time
   * Chats
   * Timeline [stretch goal] - fragments for stretch goals

## Wireframes

<img src="wireframe.png" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models
[Add table of models]
### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]

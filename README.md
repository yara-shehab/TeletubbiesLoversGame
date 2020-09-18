# TeletubbiesLoversGame
1) Brief description
Our game is designed for Teletubbies’ lovers. The player is a Teletubbies’ character and he should avoid the obstacles (foxes) moving in front of him by jumping over them or getting below them. When an obstacle hits him, he loses. The implementation of the game is based on creating objects from classes we have:
Class Game: responsible for creating the character and making him move up and down only.
Class Obstacle: responsible for creating obstacles and making them appear every some time using a timer. They move from right to left by a fixed value for x and a random value for y.
Class Open: responsible for the opening screen of the game that leads to the game. The player enters his name to save his score then he clicks the button "Play" to start the game.
Class Play: is a frame for the game play, it initializes the character and the obstacles that are drawn in a separate class that extends JPanel which is PanelPlay. PanelPlay has an overriden method "paint" which uses graphics to draw the character and the obstacles.
As a bonus we added a hall of fame to save the best scores that has been recorded in the game.

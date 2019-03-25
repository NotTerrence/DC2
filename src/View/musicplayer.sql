CREATE DATABASE musicplayer;
USE musicplayer;

CREATE TABLE account (
	accountID int(11) AUTO_INCREMENT,
	username varchar(50) UNIQUE,
    password varchar(50),
    type varchar(50) NOT NULL,
    PRIMARY KEY (accountID)
    );
    
CREATE TABLE album (
	albumID int(11) AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    albumCover varchar(255) UNIQUE,
    artist varchar(50),
    uploaderID int(11) NOT NULL,
    PRIMARY KEY (albumID),
    FOREIGN KEY (uploaderID) REFERENCES account(accountID)
    );
    
CREATE TABLE song (
	songID int(11) AUTO_INCREMENT,
    uploaderID int (11) NOT NULL,
    title varchar(50) NOT NULL,
    year int(11),
    genre varchar(50),
    artist varchar(50),
    albumID int (11),
    filePath varchar(255) NOT NULL UNIQUE,
    PRIMARY KEY (songID),
    FOREIGN KEY (uploaderID) REFERENCES account(accountID),
    FOREIGN KEY (albumID) REFERENCES album(albumID)
    );

CREATE TABLE playlist (
	playlistID int(11) AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    accountID int(11) NOT NULL,
    PRIMARY KEY (playlistID),
    FOREIGN KEY (accountID) REFERENCES account(accountID)
    );

CREATE TABLE playlistSongs (
	playlistID int(11),
    songID int(11),
    PRIMARY KEY (playlistID, songID),
    FOREIGN KEY (playlistID) REFERENCES playlist(playlistID),
    FOREIGN KEY (songID) REFERENCES song(songID)
    );

CREATE TABLE accountSongActivity (
	songID int(11),
    accountID int(11),
    farovite boolean NOT NULL,
    numPlays int(11) NOT NULL,
    PRIMARY KEY (songID, accountID),
    FOREIGN KEY (accountID) REFERENCES account(accountID),
    FOREIGN KEY (songID) REFERENCES song(songID)
    );

CREATE TABLE accountPlaylistActivity (
	playlistID int(11),
    accountID int(11),
    favorite boolean NOT NULL,
    PRIMARY KEY (playlistID, accountID),
    FOREIGN KEY (accountID) REFERENCES account(accountID),
    FOREIGN KEY (playlistID) REFERENCES playlist(playlistID)
    );
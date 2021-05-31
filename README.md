**IMAGE VIEWER**
------------------

_Introduction_

This project creates a user interface to assist in the managing and critique
of an imported directory of images. The code works by first creating the basic 
user interface structure, which includes the navigation buttons, import directory button,
and removal button (for the critique of photos). After a directory is inserted into the 
directory text box, all photos are then registered into a list and displayed for viewage. 

_Instructions_

Its usage is simple. Find a directory of images you would like to be interfaced, grab the 
directory's path, insert it in the text box, and click "Open Folder." Afterwards,
you will be able to view the first image in the folder, which should appear on the screen
immediately. You can then further navigate throughout the folder using the "Next" and "Back"
buttons. Additionally, if you think a photo doesn't make the cut, you can remove it from the list
with the "Remove" button. Don't worry, though! The photo isn't permanently deleted. In fact,
it still exists in the folder. It is just prevented from being shown on the screen to help give a
larger picture presentation of your final photography project. 

_Files_

MAIN: Creates a new ImageUI object, initializing the program's execution. 

IMAGEUI: Houses all the buttons, panels, and text fields that go into the project's functionality.

IMAGEPANEL: Interprets and displays an image from an inputted & specified path.

LTPANEL: Combines JLabels and JTextFields for easier panel creation. 

_Sources_

Used for the ImagePanel file to display an image within Java Swing. See ImagePanel.java
https://stackoverflow.com/questions/299495/how-to-add-an-image-to-a-jpanel

Used for the registration of images into a list from the inputted directory. See ImageUI.java button functions
https://stackoverflow.com/questions/4917326/how-to-iterate-over-the-files-of-a-certain-directory-in-java

Used for improved java swing production. See LTPanel.java
(One of your slides)




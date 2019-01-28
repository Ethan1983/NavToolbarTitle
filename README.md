# NavToolbarTitle
Back arrow not shown in release build

Back arrow is not shown in tool bar (set as support action bar) in release build with minifyEnabled.
Hamburger icon is still shown and is functional (navigates back to previous fragment).
The fragment having the issue is not set as a topLevelDestinationIds in AppBarConfiguration
(used in setupActionBarWithNavController).

Instructions

1) Compile and launch the app in debug mode.
2) Click on "Launch Nested Fragment" button
3) Toolbar title changes from "Home" to "SecondFragment"
4) Toolbar icon changes from Hamburger icon to back arrow
5) Compile and launch the app in release mode (with minifyEnabled and using debug keys and keystore)
6) Click on "Launch Nested Fragment" button
7) Toolbar title changes from "Home" to "SecondFragment"
8) Toolbar icon stays as Hamburger icon

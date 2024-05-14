# woof-app

## FutureMe Notes

- learnt to use a `Scaffold` to create my custom screen layout. To add a top bar pass the lambda to topBar property a composable with a TopBar element.
    ```kotlin
    Scaffold(
            topBar = { WoofTopAppBar() } // top app bar
    ) {}
    ```
- TopBar takes parameters like title (text), back navigation arrow, action button, a scrollable behavior on whether to collapse or not when scrolling etc. The BottomAppBar works almost the same too but is placed at the bottom
- For better looking UI use Material Theme (shapes, color, typography)
- Define shapes in `ui.theme/Shapes.kt`. Shapes describe the corner shapes (border-radius) of elements
- Define colors in `ui.theme/Color.kt`. This file lists & defines variables for all the colors you'll use in your app. Use [material theme builder]([https://material-foundation.github.io/material-theme-builder/) to make a custom color palette for your app then export them to use them in the project
- Define the theme in `ui.theme/Color.kt`. It uses the colors defined in Color.kt to group them into light + dark mode, creating a light & dark theme for users to use. For phones with android version 12 and above turn dynamic color in Theme.kt app theme to true to enable the app to use the color from the users phone wallpaper.
- Define the typography (fonts styles) in `ui.theme/Type.kt`. Here you can variables for the custom fonts imported in the `res/font` folder. You can then use these fonts in different sizes based on their use in the Typography class.
- In the appTheme composable in Theme.kt, these code maps to the above material theme classes.
    ```kotlin
    MaterialTheme(
            colorScheme = colorScheme, // defined in Theme.kt based on light/dark mode selected
            shapes = Shapes, // defined in Shape.kt. use case example: MaterialTheme.shapes.small
            typography = Typography, // defined in Type.kt. use case example: MaterialTheme.typography.bodyLarge
            content = content // composable components passed in MainActivity.kt
    )
    ```
  - animateContentSize adds animation transition for a ui element that shifts in size
    ```kotlin
    Column(
        // animating a smooth transition when the list's height changes when expanded
        modifier = Modifier.animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy, // adding a little card bounce
                        stiffness = Spring.StiffnessMediumLow // make the height change transition a little bit slower
                    )
                )
    ) {}
    ```
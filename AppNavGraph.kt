import com.yourname.superapp.feature.builder.BuilderScreen
import com.yourname.superapp.feature.settings.SettingsScreen

// Inside your NavHost:
composable(Screen.AppBuilder.route) {
    BuilderScreen(onNavigateBack = { navController.popBackStack() })
}

composable(Screen.Settings.route) {
    SettingsScreen(
        onNavigateToAccountDeletion = { navController.navigate(Screen.DeleteAccount.route) },
        onNavigateBack = { navController.popBackStack() }
    )
}

import { View, Text } from 'react-native'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import { ConfirmRequests, 
    DashboadScreen, 
    EmailVerificationScreen, 
    LoginScreen, MapScreen, 
    ProfileScreen, 
    RegisterScreen, 
    RequestsScreen, 
    ResetPasswordScreen } from '../screens/index.jsx'
    
import React from 'react'


const BottomTabNavigation = () => {
  return (
    <View>
      <Text>BottomTabNavigation</Text>
    </View>
  )
}

export default BottomTabNavigation;
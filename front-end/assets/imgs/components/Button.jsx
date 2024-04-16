import { StyleSheet, Text, View, Button, TouchableOpacity } from 'react-native'
import React from 'react'

const ButtoComp = ({onPress, title, boolen}) => {
  return (
    <View>
        <TouchableOpacity
            onPress={onPress}
            style={boolen ? styles.buttonOrange : styles.buttonGreen}
            
        >
            <Text style={styles.text}>{title}</Text>
        </TouchableOpacity>
    </View>
  )
}

export default ButtoComp;

const styles = StyleSheet.create({
    buttonOrange: {
        backgroundColor: "#FF8A5B",
        width: 228,
        height: 50,
        borderRadius: 40,
        justifyContent: 'center',
        alignItems: 'center',

        
    },
    buttonGreen: {
        backgroundColor: "#259D25",
        width: 228,
        height: 50,
        justifyContent: 'center',
        alignItems: 'center',
    },
    text: {
        color: '#ffff',
        fontSize: 18,
        textAlign: 'center',
        justifyContent: 'center',
        fontWeight: '600'
    }

})
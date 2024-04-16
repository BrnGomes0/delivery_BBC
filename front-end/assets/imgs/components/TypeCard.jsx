import { View, Text, TouchableOpacity } from 'react-native'
import React from 'react'
import { StyleSheet } from 'react-native'

const TypeCard = () => {
  return (
    <View style={styles.container}>
      <TouchableOpacity style={styles.touch}>
        <Text style={styles.text}>A</Text>
      </TouchableOpacity>
      <TouchableOpacity style={styles.touch}>
        <Text style={styles.text}>B</Text>
      </TouchableOpacity >
      <TouchableOpacity style={styles.touch}>
        <Text style={styles.text}>C</Text>
      </TouchableOpacity>
      <TouchableOpacity style={styles.touch}>
        <Text style={styles.text}>D</Text>
      </TouchableOpacity>
      <TouchableOpacity style={styles.touch}>
        <Text style={styles.text}>E</Text>
      </TouchableOpacity>
    </View>
  )
}

export default TypeCard;


const styles = StyleSheet.create({
    container: {
        flexDirection: 'row'
    },
    touch: {
        marginHorizontal: 4,
        borderRadius: 9999999,
        borderColor: '#BABABA',
        borderWidth: 1,
        width: 26,
        height: 26,
    },
    text: {
        textAlign: 'center'
    }
})
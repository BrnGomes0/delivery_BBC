import { View, Text, TextInput, StyleSheet } from 'react-native'
import React from 'react'
import { useState } from 'react';

export default function Input({value, placeholder}) {
  return (
    <TextInput
        value={value}
        placeholder={placeholder}
        style={styles.input}
        onChangeText={value}
    />
  )
}

const styles = StyleSheet.create({
    input: {
        width: 294,
        height: 50,
        borderColor: '#BABABA',
        borderWidth: 1,
        borderRadius: 40,
        padding: 14,
        fontWeight: 'normal',
        color: '#BABABA',
        marginBottom: 12,
    },
})
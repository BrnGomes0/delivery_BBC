import { 
  View, 
  Text, 
  StyleSheet,
  Image,
  TextInput
} from 'react-native'
import React, { useState } from 'react'
import Input from '../assets/imgs/components/Input';
import TypeCard from '../assets/imgs/components/TypeCard';
import Button from '../assets/imgs/components/Button';

const LoginScreen = () => {
  const [value, setValue] = useState('');
  return (
    <View style={styles.container}>
      <View>
        <Text style={styles.tittle}>REGISTER</Text>
      </View>
      <View style={styles.image}>
        <Image
          source={require('../assets/imgs/registerImage.png')}
        />
      </View>
      <View>
        <Text style={styles.text_normal}> Personal Data: </Text>
      </View>
      <View style={styles.formulario}>
        <Input
          value={value}
          placeholder="Complet Name:"
        />
        <Input
          value={value}
          placeholder="Password:"
        />
        <Input
          value={value}
          placeholder="Password again: "
        />
        <Input
          value={value}
          placeholder="N° CNH: "
        />
      </View>
      <View>
        <Text style={styles.text_normal}>What Category? You drive: </Text>
      </View>
      <View style={{justifyContent: 'center', alignItems: 'center'}}>
        <TypeCard/>
      </View>
      <View style={styles.}>
        <Button
          title="REGISTER"
          onPress={() => {return "OLÁ"}}
          boolen="true"
        />
      </View>

    </View> 
  )
}

export default LoginScreen;

const styles = StyleSheet.create({
  container: {
    flex: 1
  },
  image: {
    width: '50',
    height: '50',
    alignItems: 'center',
    paddingTop: -10,
  },
  tittle: {
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'center',
    paddingTop: 18,
  },
  text_normal:{
      fontSize: 13,
      padding: 10,
      textAlign: 'center',
      padding: 20,
  },
  text_little:{
    fontSize: 8,
    color: '#BABABA',
    padding: 2
  },
  formulario: {
    justifyContent: 'center',
    alignItems: 'center'
  }
});
import { View, Text, Image, StyleSheet } from 'react-native'
import React from 'react'
import AppIntroSlider from 'react-native-app-intro-slider'
import { useState } from 'react';
import RegisterScreen from '../RegisterScreen';
import LoginScreen from '../LoginScreen';

const slides = [
    {
        key: 1,
        title: <Text>The best delivery app makes ordering <Text style={{fontWeight:'bold'}}>quick</Text> and <Text style={{fontWeight: 'bold'}}>easy</Text> on the go</Text>,
        image: require('../../assets/imgs/HomeOne.png')
    },
    {
        key: 2,
        title: <Text>Our app offers an intuitive solution for <Text style={{fontWeight:'bold'}}>efficient logistics</Text> and transportation management</Text>,
        image: require('../../assets/imgs/HomeTwo.png')
    },
    {
        key: 3,
        title: <Text>Our app ensures the <Text style={{fontWeight:'bold'}}>speed required</Text> to meet market demands and maintain the flow of your supply chain</Text>,
        image: require('../../assets/imgs/HomeThree.png')
    },
    {
        key: 4,
        title: <Text><Text style={{fontWeight:'bold'}}>Relationship</Text> with the client app</Text>,
        image: require('../../assets/imgs/HomeFour.png')
    },
];

export default function TimeLane() {
    const [showHome, setShowHome] = useState(true);
    function renderSlides ({item}){
        return(
            <View style={{flex: 1}}>
                <View style={styles.slideContainer}>
                    <Text style={styles.title}>{item.title}</Text>
                    <Image
                        source={item.image}
                        style={styles.image}
                    />
                </View>
            </View>
        );
    }

    if(showHome){
        return <LoginScreen/>
    }else{
        return(
            <View style={styles.container}>
                <AppIntroSlider
                renderItem={renderSlides}
                data={slides}
                activeDotStyle={{
                    backgroundColor: '#DEDBFA',
                    width: 40,
                    
                }}
            />
            </View>
        );
    }
}


const styles = StyleSheet.create({
    image:{
        resizeMode: 'contain',
    },
    container: {
        flex: 1,
    },
    title: {
        textAlign: 'center',
        paddingTop: 133,
        fontSize: 15,
        lineHeight:20,
        paddingRight: 50,
        paddingLeft: 50,
        
    },
    slideContainer:{
        alignItems: 'center',
        justifyContent: 'center',
    }
});
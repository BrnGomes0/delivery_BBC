import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import TimeLane from './screens/Timeline/TimeLane';
export default function App() {
  return (
    <View style={styles.container}>
      <TimeLane/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
});

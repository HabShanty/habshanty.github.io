const int dry = 700;

const int pumpPin = 12;
const int soilSensor = A4;
const int sensorPower = 11;


void setup() {
  pinMode(sensorPower, OUTPUT);
  digitalWrite(sensorPower, LOW); //Activate sensor only when sensing Pin 11
  
  pinMode(pumpPin, OUTPUT); // Power for pump Pin 12
  pinMode(soilSensor, INPUT); // Reading from soil sensor Pin A4
  
  Serial.begin(9600);
  delay(5000); //Delay to pull up serial monitor
}

void loop() {
     //read moisture
  delay(15000);
  int moisture = analogRead(readSensor());
  //Serial.print("Moisture is: ");
  Serial.println(moisture);
  delay(3000);

    if(moisture >= dry){
      //Serial.println("Watering now, moisture is: " + String(moisture));
      digitalWrite(pumpPin, HIGH);

      //water for 3 seconds
      delay(3000);

      digitalWrite(pumpPin, LOW);
      //Serial.println("Done watering.");
    }
    else{
      //Serial.println("There is enough moisture in the plant, no watering necessary " + String(moisture));
    }
 }



int readSensor(){
  digitalWrite(sensorPower, HIGH);
  delay(100);
  int val = analogRead(soilSensor);
  digitalWrite(sensorPower, LOW);
  return val;
  
}
 
      

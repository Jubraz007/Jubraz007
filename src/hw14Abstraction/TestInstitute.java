package hw14Abstraction;

public class TestInstitute {

  public static void main(String[] args) {
System.out.println("----Columbia University----");
ColumbiaUniversity cu = new ColumbiaUniversity();
University uni = new ColumbiaUniversity();
MedicalSchool ms = new ColumbiaUniversity();


cu.biology();
cu.anatomyLab();
cu.classSize();
cu.playGround();
cu.teacher();
cu.vocationalInfo();
cu.commonRoom();
cu.laboratory();
cu.languageClub();
cu.emergencyRoom();
cu.surgeryRoom();
cu.cafeteria();
cu.lawInfo();
cu.hygiene();
cu.biochemistryLab();
cu.maths();
cu.aeronauticalInfo();
cu.mechanicalLab();
cu.caring();
cu.anthropology();
cu.gymnasium();
cu.dorm();
cu.morgue();

uni.gymnasium();
University.library(); // Static method, thats why its called by class name
uni.classSize();
uni.playGround();
uni.teacher();
uni.commonRoom();
uni.laboratory();
uni.languageClub();
uni.dorm();
uni.emergencyRoom();
uni.surgeryRoom();
uni.cafeteria();
uni.morgue();

ms.biochemistryLab();
ms.mechanicalLab();
ms.anatomyLab();
ms.caring();
ms.maths();
ms.aeronauticalInfo();
ms.computerLab();
ms.anthropology();
ms.lawInfo();

}


   
  
  }
  
 
  


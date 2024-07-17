import dataStatic.Data;

public class Tugas160724 {
  public static void main(String[] args) {
    System.out.println(login("alexx","alex123"));
    System.out.println("-------------------------------------------");
    
    String[][] assetList = getAssetList();
    
    for(int i = 0; i < assetList.length; i++){
      System.out.println(assetList[i][0] + " " + assetList[i][1]);
    }
    
    // String[][][] assetListWithStatus = getAssetListWithStatus(assetName, assetType, assetStatus);

    // for(int i = 0; i < assetListWithStatus.length; i++){
    //   System.out.println(assetListWithStatus[i][0][0] + " " + assetListWithStatus[i][1][i] + " " + assetListWithStatus[i][i][2]);
    // }

  }

  public static String login(String username, String password){
    if(username.length() == 0 || password.length() == 0) return "Invalid Login Attempt";

    for(int i = 0; i < Data.users.length; i++){
        if(Data.users[i][0] == username && Data.users[i][1] == password){
          return "Login Berhasil";
        }
      }  
      
      return "Username atau Password salah";
    }

  public static String[][] getAssetList(){
    String[][] assets = new String[10][10];

    for(int i = 0; i < Data.assetName.length; i++){
      assets[i][0] = Data.assetName[i];

      if(Data.assetType[i] == 1) {
        assets[i][1] = "Laptop";
      }
      if(Data.assetType[i] == 2){
        assets[i][1] = "Handphone";
      }
    }

    return assets;
  }

  public static String[][][] getAssetListWithStatus(String[] assetName, int[] assetType, int[] assetStatus){
    String[][][] assets = new String[10][10][10];

    for(int i = 0; i < assetName.length; i++){
      assets[i][0][0] = assetName[i];

      if(assetType[i] == 1) {
        assets[i][1][i] = "Laptop";
      }
      if(assetType[i] == 2){
        assets[i][1][i] = "Handphone";
      }

      if(assetStatus[i] == 1) {
        assets[i][i][2] = "Available";
      }
      if(assetStatus[i] == 2){
        assets[i][i][2] = "Borrowed";
      }
    }

    return assets;
  }
}




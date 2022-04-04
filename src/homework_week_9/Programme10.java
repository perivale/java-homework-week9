package homework_week_9;

public class Programme10 {
  //create  main method
    public static void main(String[] args) {
        String Stationname[]={"waterloo","embankment","london brigde","Canada water"};
        String tubename[][]=new String[3][3];
        tubename[0][1]="waterloo";
        tubename[0][2]="london bridge";

        tubename[1][0]="jubilee line";
        tubename[1][1]="london brigde";
        tubename[1][2]="canada water";

        tubename[2][0]="bakerloo line";
        tubename[2][1]="waterloo";
        tubename[2][2]="embankment";

        for(int i=0;i< tubename.length;i++){
            for(int j=1;j<tubename[i].length;j++){
                if(tubename[i][j]==Stationname[2]) {
                    System.out.println(Stationname[2] + "has pass line is");
                    System.out.println(tubename[0][0]);
                }
                if(tubename[i][j]==Stationname[i]) {
                    System.out.println(Stationname[i] + "has pass line is");
                    System.out.println(tubename[0][0]);
                    System.out.println(tubename[2][0]);
                    break;
                }
                if(tubename[i][j]==Stationname[1]) {
                    System.out.println(Stationname[1] + "has pass line is");
                    System.out.println(tubename[2][0]);
                    break;
                }
                if(tubename[i][j]==Stationname[3]) {
                    System.out.println(Stationname[3] + "has pass line is");
                    System.out.println(tubename[1][0]);
                    break;
                }
            }
        }
    }

}

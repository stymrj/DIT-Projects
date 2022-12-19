package OS_Mini_Project;

	public class FinalFrame {
    FinalFrame(int index,String arrival,String burst)
    {
        if(index == 0)
        {
//            converting the arrival string to arrival integer array - SATYAM RAJ
            String[] arrivalStringArray = arrival.split(" ");
            int[] arrivalArray = new int[arrivalStringArray.length];
            for(int i=0;i<arrivalArray.length;i++)
            {
                arrivalArray[i] = Integer.parseInt(arrivalStringArray[i]);
            }
//            converting the burst string to burst array - jatin bisht
            String[] burstStringArray = burst.split(" ");
            int[] burstArray = new int[burstStringArray.length];
            for(int i=0;i<burstArray.length;i++)
            {
                burstArray[i] = Integer.parseInt(burstStringArray[i]);
            }
//        Calling fcfs class
            new FCFS(arrivalArray,burstArray);
        }
        if(index!=0 && index!=1) {//            converting the arrival string to arrival integer array - SATYAM RAJ
            String[] arrivalStringArray = arrival.split(" ");
            int[] arrivalArray = new int[arrivalStringArray.length];
            for (int i = 0; i < arrivalArray.length; i++) {
                arrivalArray[i] = Integer.parseInt(arrivalStringArray[i]);
            }
//            converting the burst string to burst array -SATYAM RAJ
            String[] burstStringArray = burst.split(" ");
            int[] burstArray = new int[burstStringArray.length];
            for (int i = 0; i < burstArray.length; i++) {
                burstArray[i] = Integer.parseInt(burstStringArray[i]);
            }
//            calling SJF-P
            new SJFP(arrivalArray,burstArray);
        }
        if(index==1)
        {
            // converting the arrival string to arrival integer array - SATYAM RAJ
            String[] arrivalStringArray = arrival.split(" ");
            int[] arrivalArray = new int[arrivalStringArray.length];
            for(int i=0;i<arrivalArray.length;i++)
            {
                arrivalArray[i] = Integer.parseInt(arrivalStringArray[i]);
            }
//            converting the burst string to burst array - SATYAM RAJ
            String[] burstStringArray = burst.split(" ");
            int[] burstArray = new int[burstStringArray.length];
            for(int i=0;i<burstArray.length;i++)
            {
                burstArray[i] = Integer.parseInt(burstStringArray[i]);
            }
//        Calling SJFNP class
            new SJFNP(arrivalArray,burstArray);
        }
    }
}


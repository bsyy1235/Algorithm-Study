import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    String[] a = br.readLine().split(" ");
    String[] b = br.readLine().split(" ");
    
    Set<String> aSet = new TreeSet<>(Arrays.asList(a));
    Set<String> bSet = new TreeSet<>(Arrays.asList(b));
    
    Set<String> set = new TreeSet<>(Arrays.asList(a));

    aSet.removeAll(bSet);
    bSet.removeAll(set);
    
    bw.write(aSet.size()+bSet.size()+"\n");
    bw.close();
  }
}

import java.util.List;

public class DownloadThread implements Runnable{
    public List<String> url;
    private int index = 0;
    public DownloadThread(List<String> l,int i){
        url = l;
        index = i;
    }
    public DownloadThread(int i){
        index = i;
    }
    @Override
    public void run() {
        synchronized(this){
            index++;
        }
        DownloadFile.downloadFile(url.get(index),"AnnualReport//");
        System.out.println(Thread.currentThread().getName()+":"+index);

    }

}
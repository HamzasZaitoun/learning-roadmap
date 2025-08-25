package concurrency;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private boolean isDone;
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public void incrementTotalBytes() {
        totalBytes.increment();
    }

    public void incrementTotalFiles() {
        totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}


//public void incrementTotalBytes()
//{
////        lock.lock();
////        totalBytes++;
////        lock.unlock();
//    synchronized (totalBytesLock)
//    {
//        totalBytes++;
//    }
//
//}
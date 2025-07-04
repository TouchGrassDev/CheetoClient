package xyz.apfelmus.cheeto.client.utils.math;

public class TimeHelper {
   private long lastMS = 0L;

   public TimeHelper() {
      this.reset();
   }

   public int convertToMS(int d) {
      return 1000 / d;
   }

   public long getCurrentMS() {
      return System.nanoTime() / 1000000L;
   }

   public boolean hasReached(long milliseconds) {
      return this.getCurrentMS() - this.lastMS >= milliseconds;
   }

   public boolean hasTimeReached(long delay) {
      return System.currentTimeMillis() - this.lastMS >= delay;
   }

   public long getDelay() {
      return System.currentTimeMillis() - this.lastMS;
   }

   public void reset() {
      this.lastMS = this.getCurrentMS();
   }

   public void setLastMS() {
      this.lastMS = System.currentTimeMillis();
   }

   public void setLastMS(long lastMS) {
      this.lastMS = lastMS;
   }
}

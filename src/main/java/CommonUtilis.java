public class CommonUtilis {

    /**
     * In some cases selenium is unable to detect when page load is completed.
     * It's bad solution to use Thread.sleep(), but sometimes the only solution.
     *
     * @param ms Time for Thread.sleep() in ms
     */
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

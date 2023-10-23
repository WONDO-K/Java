package fc.java.poly;

public class Radio implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("Radio 채널 올라감");
    }

    @Override
    public void chDown() {
        System.out.println("Radio 채널 내려감");
    }

    @Override
    public void volUp() {
        System.out.println("Radio 볼륨 올라감");
    }

    @Override
    public void volDown() {
        System.out.println("Radio 볼륨 내려감");
    }

    @Override
    public void internet() {
        System.out.println("Radio에서는 인터넷 지원이 안됩니다.");
    }


}

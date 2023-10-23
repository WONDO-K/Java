package fc.java.poly;

public class Tv implements RemoCon{
    // chUp(), chDown(), volUp(), volDown()
    @Override
    public void chUp() {
        System.out.println("Tv의 채널이 올라감");
    }

    @Override
    public void chDown() {
        System.out.println("Tv의 채널이 내려감");
    }

    @Override
    public void volUp() {
        System.out.println("Tv의 불륨이 올라감");
    }

    @Override
    public void volDown() {
        System.out.println("Tv의 볼룸이 내려감");
    }

    @Override
    public void internet() {
        System.out.println("Tv에서는 인터넷 지원이 안됩니다.");
    }

}

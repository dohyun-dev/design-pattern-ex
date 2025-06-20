package com.dohyundev.adapter;

/**
 * 호환되지 않는 인터페이스들을 연결하는 디자인 패턴
 */
public class Adapter {

    // Target
    interface MediaPlayer {
        void play(String filename);
    }

    // Adaptee
    static class VLCPlayer {
        public void use(String filename) {
            System.out.println("VLCPlayer used " + filename);
        }
    }

    // Adapter
    static class VLCPlayerAdapter implements MediaPlayer {

        private final VLCPlayer player;

        public VLCPlayerAdapter(VLCPlayer player) {
            this.player = player;
        }

        @Override
        public void play(String filename) {
            player.use(filename);
        }
    }

    public static void main(String[] args) {
        MediaPlayer player = new VLCPlayerAdapter(new VLCPlayer());
        player.play("sss");
    }
}

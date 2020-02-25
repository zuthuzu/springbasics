package ua.kpi.tef.zu.springbasics.music;

/**
 * Created by Anton Domin on 2020-02-25
 */
public class MusicPlayer {
	private Music music;

	public MusicPlayer(Music music) {
		this.music = music;
	}

	public String playMusic() {
		return "NP: " + music.getSong();
	}
}

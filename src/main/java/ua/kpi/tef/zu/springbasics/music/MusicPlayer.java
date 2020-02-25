package ua.kpi.tef.zu.springbasics.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anton Domin on 2020-02-25
 */
public class MusicPlayer {
	private List<Music> playList = new ArrayList<>();
	private int volume;

	public MusicPlayer() {
	}

	public void setPlayList(List<Music> music) {
		playList.clear();
		playList.addAll(music);
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String playMusic() {
		StringBuilder result = new StringBuilder();

		for (Music currentSong : playList) {
			result.append("NP: ").append(currentSong.getSong()).append(" at volume ").append(volume).append('\n');
		}

		return result.toString();
	}
}

package ua.kpi.tef.zu.springbasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kpi.tef.zu.springbasics.music.MusicPlayer;

/**
 * Created by Anton Domin on 2020-02-25
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

		MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

		System.out.println(player.playMusic());

		context.close();
	}
}

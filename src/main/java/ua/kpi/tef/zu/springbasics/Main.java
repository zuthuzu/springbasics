package ua.kpi.tef.zu.springbasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kpi.tef.zu.springbasics.music.Music;
import ua.kpi.tef.zu.springbasics.music.MusicPlayer;

/**
 * Created by Anton Domin on 2020-02-25
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

		//SomeBean tmp = context.getBean("someBean", SomeBean.class);
		//System.out.println(tmp);

		Music music = context.getBean("musicBean", Music.class);
		MusicPlayer player = new MusicPlayer(music);

		System.out.println(player.playMusic());

		context.close();
	}
}

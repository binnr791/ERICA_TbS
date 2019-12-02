package com.model;

import java.util.Random;

public class MapData {
	/** MapData manages saving and loading data = GameMap
	 ** GameMap manages rooms
	 ** Rooms manages room
	 */
	public final int ROOM_NUM = 10;
	public MapData() {}
	
	public class GameMap
	{
		public int difficulty;
		
				public class Room
				{
					protected int roomId;
					protected int level;
					protected int roomDifficulty;
					protected boolean isCleared = false;
					protected boolean isPlayerIn = false;
					
					public Room(int id, int level)
					{
					this.roomId= id;
					this.level = level;
					this.roomDifficulty = difficulty;
		//			this.isPlayerIn = false;
					}
					
					public boolean isPlayerIn() { return this.isPlayerIn; }
					public boolean isCleared() { return this.isCleared; }
					public int getRoomId() { return this.roomId; }
				}
		
		public GameMap(int difficulty)
		{
			Random random = new Random();
			Room[] rooms = new Room[ROOM_NUM];
			for(int i = 0; i < ROOM_NUM; ++i)
			{
				int randomId = random.nextInt(10);
				rooms[i] = new Room(randomId, i);
			}
			rooms[0].isPlayerIn = true;
		}
		
		public GameMap(String filename)
		{
			// not writed
		}
	}
	
	////// Method of MapData //////
	
	public GameMap createMap(int difficulty)
	{
		GameMap newMap = new GameMap(difficulty);
		return newMap;
	}
	
	public GameMap loadMap(String filename)
	{
		GameMap loadedMap = new GameMap(filename);
		return loadedMap;
	}
	
	/////////////////////////////////////
}

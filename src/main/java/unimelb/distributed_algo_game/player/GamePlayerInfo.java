package unimelb.distributed_algo_game.player;

import java.io.Serializable;

public class GamePlayerInfo implements Serializable{
	//0: nodeid, 1: ip address, 2: port
	private String mGamePlayerInfo[];
	public GamePlayerInfo(String mGamePlayerInfo[]) {
		this.mGamePlayerInfo = mGamePlayerInfo;
	}
	
	public String getIPAddress() {
		return mGamePlayerInfo[0];
	}
	
	public String getPort() {
		return mGamePlayerInfo[1];
	}
	
	public int getNodeID() {
		return new Integer(mGamePlayerInfo[2]);
	}

}
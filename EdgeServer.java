package sisaku;

public class EdgeServer {
	final static int ID = 3000;;//エッジサーバのID

	Udp udp;

	EdgeServer(){
		udp = new Udp(ID);//UDPインスタンスにID付与
		udp.makeMulticastSocket();//ソケット生成
		udp.startListener();//受信
		//udp.sendMsgFromServer();//送信
	}

	void receiveData() {//受信メソッド
		byte[] rcvData = udp.lisner.getData();//受信データ

		if(rcvData != null) {

			//System.out.println(rcvData);
			String str = new String(rcvData);//byte型から文字に変換
			System.out.println("(エッジサーバ受信データ) "+str);


			udp.lisner.resetData();//バッファの中のデータをリセット
		}

	}

	void  judgmentData(){

	}

}

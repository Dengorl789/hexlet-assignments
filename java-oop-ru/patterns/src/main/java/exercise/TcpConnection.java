package exercise;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection implements Connection{
	private String ipAdress;
	private int port;
	private List<String> buffer;
	private TcpConnection tcpConnection;
	private Connection connection;
	public TcpConnection(String ipAdress, int port) {
		this.ipAdress = ipAdress;
		this.port = port;
		this.buffer = new ArrayList<>();
		this.connection = new Disconnected(this);
	}
	@Override
	public String getCurrentState() {
		return this.connection.getCurrentState();
	}

	@Override
	public void connect() {
		this.connection.connect();
	}

	@Override
	public void disconnect() {
		this.connection.disconnect();
	}

	@Override
	public void write(String data) {
		this.connection.write(data);
	}
	public void setState(Connection connection) {
		this.connection = connection;
	}
}
// END


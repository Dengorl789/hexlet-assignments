package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {
	private TcpConnection connection;
	public Connected(TcpConnection connection) {
		this.connection = connection;
	}
	@Override
	public String getCurrentState() {
		return "connected";
	}

	@Override
	public void connect() {
		System.out.println("Error! Connection already established");
	}

	@Override
	public void disconnect() {
		this.connection.setState(new Disconnected(connection));
	}

	@Override
	public void write(String data) {

	}
}
// END

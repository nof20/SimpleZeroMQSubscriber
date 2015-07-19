import java.util.logging.Logger;

import org.zeromq.ZMQ;

public class SimpleZeroMQSubscriber {

	final static Logger log = Logger.getLogger("SimpleZeroMQSubscriber");

	public static void main(String[] args) {
		log.info("Initializing ZeroMQ subscriber on port "+ args[0]);
		ZMQ.Context context = ZMQ.context(1);
		ZMQ.Socket socket = context.socket(ZMQ.SUB);
		socket.connect("tcp://localhost:" + args[0]);
		String filter = ""; // Get everything
		socket.subscribe(filter.getBytes());
		while (!Thread.currentThread().isInterrupted()) {
			String string = socket.recvStr();
			log.info(string);
		}

	}

}

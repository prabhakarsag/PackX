

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Random;
// --- <<IS-END-IMPORTS>> ---

public final class Serv_1

{
	// ---( internal utility methods )---

	final static Serv_1 _instance = new Serv_1();

	static Serv_1 _newInstance() { return new Serv_1(); }

	static Serv_1 _cast(Object o) { return (Serv_1)o; }

	// ---( server methods )---




	public static final void new_javaService_2 (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(new_javaService_2)>> ---
		// @sigtype java 3.5
		Random rand = new Random();
		 int randomNum = rand.nextInt(10000);
		 String outRandomNum=""+randomNum;
		 
		// pipeline
		 IDataCursor pipelineCursor = pipeline.getCursor();
		 IDataUtil.put( pipelineCursor, "outRandomNum", outRandomNum);
		 pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}


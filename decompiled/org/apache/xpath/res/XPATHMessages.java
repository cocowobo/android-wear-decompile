package org.apache.xpath.res;

import java.util.ListResourceBundle;
import org.apache.xml.res.XMLMessages;

public class XPATHMessages extends XMLMessages {
    private static ListResourceBundle XPATHBundle = null;
    private static final String XPATH_ERROR_RESOURCES = "org.apache.xpath.res.XPATHErrorResources";

    public static final java.lang.String createXPATHMsg(java.util.ListResourceBundle r1, java.lang.String r2, java.lang.Object[] r3) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: org.apache.xpath.res.XPATHMessages.createXPATHMsg(java.util.ListResourceBundle, java.lang.String, java.lang.Object[]):java.lang.String
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:256)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
Caused by: jadx.core.utils.exceptions.DecodeException:  in method: org.apache.xpath.res.XPATHMessages.createXPATHMsg(java.util.ListResourceBundle, java.lang.String, java.lang.Object[]):java.lang.String
	at jadx.core.dex.instructions.InsnDecoder.decodeInsns(InsnDecoder.java:46)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:98)
	... 5 more
Caused by: java.lang.IllegalArgumentException: bogus opcode: 00e9
	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1196)
	at com.android.dx.io.OpcodeInfo.getFormat(OpcodeInfo.java:1212)
	at com.android.dx.io.instructions.DecodedInstruction.decode(DecodedInstruction.java:72)
	at jadx.core.dex.instructions.InsnDecoder.decodeInsns(InsnDecoder.java:43)
	... 6 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xpath.res.XPATHMessages.createXPATHMsg(java.util.ListResourceBundle, java.lang.String, java.lang.Object[]):java.lang.String");
    }

    static {
        XPATHBundle = new XPATHErrorResources();
    }

    public static final String createXPATHMessage(String msgKey, Object[] args) {
        return createXPATHMsg(XPATHBundle, msgKey, args);
    }

    public static final String createXPATHWarning(String msgKey, Object[] args) {
        return createXPATHMsg(XPATHBundle, msgKey, args);
    }
}
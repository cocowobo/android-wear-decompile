package com.android.org.bouncycastle.crypto.params;

import com.android.org.bouncycastle.math.ec.ECPoint;

public class ECPublicKeyParameters extends ECKeyParameters {
    ECPoint Q;

    public ECPublicKeyParameters(com.android.org.bouncycastle.math.ec.ECPoint r1, com.android.org.bouncycastle.crypto.params.ECDomainParameters r2) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.android.org.bouncycastle.crypto.params.ECPublicKeyParameters.<init>(com.android.org.bouncycastle.math.ec.ECPoint, com.android.org.bouncycastle.crypto.params.ECDomainParameters):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:256)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
Caused by: jadx.core.utils.exceptions.DecodeException:  in method: com.android.org.bouncycastle.crypto.params.ECPublicKeyParameters.<init>(com.android.org.bouncycastle.math.ec.ECPoint, com.android.org.bouncycastle.crypto.params.ECDomainParameters):void
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.org.bouncycastle.crypto.params.ECPublicKeyParameters.<init>(com.android.org.bouncycastle.math.ec.ECPoint, com.android.org.bouncycastle.crypto.params.ECDomainParameters):void");
    }

    public com.android.org.bouncycastle.math.ec.ECPoint getQ() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.android.org.bouncycastle.crypto.params.ECPublicKeyParameters.getQ():com.android.org.bouncycastle.math.ec.ECPoint
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:256)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
Caused by: jadx.core.utils.exceptions.DecodeException:  in method: com.android.org.bouncycastle.crypto.params.ECPublicKeyParameters.getQ():com.android.org.bouncycastle.math.ec.ECPoint
	at jadx.core.dex.instructions.InsnDecoder.decodeInsns(InsnDecoder.java:46)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:98)
	... 5 more
Caused by: java.lang.IllegalArgumentException: bogus opcode: 00e5
	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1196)
	at com.android.dx.io.OpcodeInfo.getFormat(OpcodeInfo.java:1212)
	at com.android.dx.io.instructions.DecodedInstruction.decode(DecodedInstruction.java:72)
	at jadx.core.dex.instructions.InsnDecoder.decodeInsns(InsnDecoder.java:43)
	... 6 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.org.bouncycastle.crypto.params.ECPublicKeyParameters.getQ():com.android.org.bouncycastle.math.ec.ECPoint");
    }
}

package io.github.mininutlet.agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class SimpleTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        if (className.contains("YourTargetClass")) {
            System.out.println("[Agent] Transforming: " + className);
            // 通过 ASM 和 ByteBuddy 修改字节码
            // return ......
        }

        // 原样返回字节码
        return classfileBuffer;
    }
}

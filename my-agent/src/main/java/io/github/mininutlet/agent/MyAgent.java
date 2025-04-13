package io.github.mininutlet.agent;

import java.lang.instrument.Instrumentation;

public class MyAgent {
    public static void premain(String agentArgs,  Instrumentation inst) {
        System.out.println("[Agent] premain  called！");
        inst.addTransformer(new SimpleTransformer());
    }
}

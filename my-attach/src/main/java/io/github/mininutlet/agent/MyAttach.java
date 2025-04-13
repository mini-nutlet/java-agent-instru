package io.github.mininutlet.agent;

import java.lang.instrument.Instrumentation;

public class MyAttach {
    public static void agentmain(String agentArgs, Instrumentation inst) {
        System.out.println("[Agent] agentmain called with args: " + agentArgs);
        System.out.println("[Agent] Instrumentation: " + inst);
        // 你可以添加 transformer 或做内存监控等操作
    }
}

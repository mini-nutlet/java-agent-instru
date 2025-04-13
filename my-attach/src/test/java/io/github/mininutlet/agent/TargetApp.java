package io.github.mininutlet.agent;

public class TargetApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Running TargetApp... pid = " + ProcessHandle.current().pid());
        Thread.sleep(600_000); // 保持运行 10 分钟供 attach
    }
}

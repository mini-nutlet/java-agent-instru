package io.github.mininutlet.agent;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class AttachAgent {
    public static void main(String[] args) throws IOException, AttachNotSupportedException, AgentLoadException, AgentInitializationException {
        if (args.length < 2) {
            System.out.println("Usage: AttachAgent <pid> <path_to_target_jar>");
            return;
        }

        String pid = args[0];
        String agentPath = args[1];

        VirtualMachine vm = VirtualMachine.attach(pid);
        System.out.println("[Attach] Attached to target JVM with PID: " + pid);

        vm.loadAgent(agentPath, "hello-from-attach");
        System.out.println();
        vm.detach();
    }
}

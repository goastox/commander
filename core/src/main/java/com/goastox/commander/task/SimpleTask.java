package com.goastox.commander.task;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SimpleTask implements ITask{
    @Override
    public boolean execute() {
        return true;
    }
}

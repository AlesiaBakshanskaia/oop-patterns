package events.listeners;

import java.util.List;

public interface Observer {
    void handlEvent(List<String> vacansies);
}

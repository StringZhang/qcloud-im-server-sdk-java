package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/4 11:39
 */
public class GroupMsgRecallResult extends GenericResult {
    @JsonProperty("RecallRetList")
    private List<RecallRetItem> recallRetList;

    @Override
    public String toString() {
        return "GroupMsgRecallResult{" +
                "recallRetList=" + recallRetList +
                '}';
    }
}

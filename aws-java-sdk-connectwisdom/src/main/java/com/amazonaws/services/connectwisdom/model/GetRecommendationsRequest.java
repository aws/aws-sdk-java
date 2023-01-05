/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetRecommendations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String assistantId;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The duration (in seconds) for which the call waits for a recommendation to be made available before returning. If
     * a recommendation is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     * available and the wait time expires, the call returns successfully with an empty list.
     * </p>
     */
    private Integer waitTimeSeconds;

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withAssistantId(String assistantId) {
        setAssistantId(assistantId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a recommendation to be made available before returning. If
     * a recommendation is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     * available and the wait time expires, the call returns successfully with an empty list.
     * </p>
     * 
     * @param waitTimeSeconds
     *        The duration (in seconds) for which the call waits for a recommendation to be made available before
     *        returning. If a recommendation is available, the call returns sooner than <code>WaitTimeSeconds</code>. If
     *        no messages are available and the wait time expires, the call returns successfully with an empty list.
     */

    public void setWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a recommendation to be made available before returning. If
     * a recommendation is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     * available and the wait time expires, the call returns successfully with an empty list.
     * </p>
     * 
     * @return The duration (in seconds) for which the call waits for a recommendation to be made available before
     *         returning. If a recommendation is available, the call returns sooner than <code>WaitTimeSeconds</code>.
     *         If no messages are available and the wait time expires, the call returns successfully with an empty list.
     */

    public Integer getWaitTimeSeconds() {
        return this.waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a recommendation to be made available before returning. If
     * a recommendation is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     * available and the wait time expires, the call returns successfully with an empty list.
     * </p>
     * 
     * @param waitTimeSeconds
     *        The duration (in seconds) for which the call waits for a recommendation to be made available before
     *        returning. If a recommendation is available, the call returns sooner than <code>WaitTimeSeconds</code>. If
     *        no messages are available and the wait time expires, the call returns successfully with an empty list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withWaitTimeSeconds(Integer waitTimeSeconds) {
        setWaitTimeSeconds(waitTimeSeconds);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssistantId() != null)
            sb.append("AssistantId: ").append(getAssistantId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getWaitTimeSeconds() != null)
            sb.append("WaitTimeSeconds: ").append(getWaitTimeSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationsRequest == false)
            return false;
        GetRecommendationsRequest other = (GetRecommendationsRequest) obj;
        if (other.getAssistantId() == null ^ this.getAssistantId() == null)
            return false;
        if (other.getAssistantId() != null && other.getAssistantId().equals(this.getAssistantId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getWaitTimeSeconds() == null ^ this.getWaitTimeSeconds() == null)
            return false;
        if (other.getWaitTimeSeconds() != null && other.getWaitTimeSeconds().equals(this.getWaitTimeSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssistantId() == null) ? 0 : getAssistantId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getWaitTimeSeconds() == null) ? 0 : getWaitTimeSeconds().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationsRequest clone() {
        return (GetRecommendationsRequest) super.clone();
    }

}

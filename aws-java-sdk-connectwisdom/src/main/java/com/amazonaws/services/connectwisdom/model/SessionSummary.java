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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SessionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     */
    private String assistantArn;
    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     */
    private String assistantId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session.
     * </p>
     */
    private String sessionArn;
    /**
     * <p>
     * The identifier of the session.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @param assistantArn
     *        The Amazon Resource Name (ARN) of the Wisdom assistant.
     */

    public void setAssistantArn(String assistantArn) {
        this.assistantArn = assistantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Wisdom assistant.
     */

    public String getAssistantArn() {
        return this.assistantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @param assistantArn
     *        The Amazon Resource Name (ARN) of the Wisdom assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSummary withAssistantArn(String assistantArn) {
        setAssistantArn(assistantArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant.
     */

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @return The identifier of the Wisdom assistant.
     */

    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSummary withAssistantId(String assistantId) {
        setAssistantId(assistantId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session.
     * </p>
     * 
     * @param sessionArn
     *        The Amazon Resource Name (ARN) of the session.
     */

    public void setSessionArn(String sessionArn) {
        this.sessionArn = sessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the session.
     */

    public String getSessionArn() {
        return this.sessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session.
     * </p>
     * 
     * @param sessionArn
     *        The Amazon Resource Name (ARN) of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSummary withSessionArn(String sessionArn) {
        setSessionArn(sessionArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session.
     * </p>
     * 
     * @return The identifier of the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSummary withSessionId(String sessionId) {
        setSessionId(sessionId);
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
        if (getAssistantArn() != null)
            sb.append("AssistantArn: ").append(getAssistantArn()).append(",");
        if (getAssistantId() != null)
            sb.append("AssistantId: ").append(getAssistantId()).append(",");
        if (getSessionArn() != null)
            sb.append("SessionArn: ").append(getSessionArn()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionSummary == false)
            return false;
        SessionSummary other = (SessionSummary) obj;
        if (other.getAssistantArn() == null ^ this.getAssistantArn() == null)
            return false;
        if (other.getAssistantArn() != null && other.getAssistantArn().equals(this.getAssistantArn()) == false)
            return false;
        if (other.getAssistantId() == null ^ this.getAssistantId() == null)
            return false;
        if (other.getAssistantId() != null && other.getAssistantId().equals(this.getAssistantId()) == false)
            return false;
        if (other.getSessionArn() == null ^ this.getSessionArn() == null)
            return false;
        if (other.getSessionArn() != null && other.getSessionArn().equals(this.getSessionArn()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssistantArn() == null) ? 0 : getAssistantArn().hashCode());
        hashCode = prime * hashCode + ((getAssistantId() == null) ? 0 : getAssistantId().hashCode());
        hashCode = prime * hashCode + ((getSessionArn() == null) ? 0 : getSessionArn().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public SessionSummary clone() {
        try {
            return (SessionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.SessionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

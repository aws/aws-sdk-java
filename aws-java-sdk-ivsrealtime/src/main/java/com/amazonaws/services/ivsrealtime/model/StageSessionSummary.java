/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a stage session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StageSessionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageSessionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when the stage session ended. This is null if the stage is active.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * ID of the session within the stage.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when this stage session began.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when the stage session ended. This is null if the stage is active.
     * </p>
     * 
     * @param endTime
     *        ISO 8601 timestamp (returned as a string) when the stage session ended. This is null if the stage is
     *        active.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when the stage session ended. This is null if the stage is active.
     * </p>
     * 
     * @return ISO 8601 timestamp (returned as a string) when the stage session ended. This is null if the stage is
     *         active.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when the stage session ended. This is null if the stage is active.
     * </p>
     * 
     * @param endTime
     *        ISO 8601 timestamp (returned as a string) when the stage session ended. This is null if the stage is
     *        active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageSessionSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * ID of the session within the stage.
     * </p>
     * 
     * @param sessionId
     *        ID of the session within the stage.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * ID of the session within the stage.
     * </p>
     * 
     * @return ID of the session within the stage.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * ID of the session within the stage.
     * </p>
     * 
     * @param sessionId
     *        ID of the session within the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageSessionSummary withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when this stage session began.
     * </p>
     * 
     * @param startTime
     *        ISO 8601 timestamp (returned as a string) when this stage session began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when this stage session began.
     * </p>
     * 
     * @return ISO 8601 timestamp (returned as a string) when this stage session began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when this stage session began.
     * </p>
     * 
     * @param startTime
     *        ISO 8601 timestamp (returned as a string) when this stage session began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageSessionSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StageSessionSummary == false)
            return false;
        StageSessionSummary other = (StageSessionSummary) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public StageSessionSummary clone() {
        try {
            return (StageSessionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.StageSessionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

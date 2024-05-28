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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information from a specified run of a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneyRunResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyRunResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the journey run was created or scheduled, in ISO 8601 format.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The last time the journey run was updated, in ISO 8601 format..
     * </p>
     */
    private String lastUpdateTime;
    /**
     * <p>
     * The unique identifier for the run.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The current status of the journey run.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The time when the journey run was created or scheduled, in ISO 8601 format.
     * </p>
     * 
     * @param creationTime
     *        The time when the journey run was created or scheduled, in ISO 8601 format.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the journey run was created or scheduled, in ISO 8601 format.
     * </p>
     * 
     * @return The time when the journey run was created or scheduled, in ISO 8601 format.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the journey run was created or scheduled, in ISO 8601 format.
     * </p>
     * 
     * @param creationTime
     *        The time when the journey run was created or scheduled, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyRunResponse withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the journey run was updated, in ISO 8601 format..
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the journey run was updated, in ISO 8601 format..
     */

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time the journey run was updated, in ISO 8601 format..
     * </p>
     * 
     * @return The last time the journey run was updated, in ISO 8601 format..
     */

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last time the journey run was updated, in ISO 8601 format..
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the journey run was updated, in ISO 8601 format..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyRunResponse withLastUpdateTime(String lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the run.
     * </p>
     * 
     * @param runId
     *        The unique identifier for the run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The unique identifier for the run.
     * </p>
     * 
     * @return The unique identifier for the run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The unique identifier for the run.
     * </p>
     * 
     * @param runId
     *        The unique identifier for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyRunResponse withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The current status of the journey run.
     * </p>
     * 
     * @param status
     *        The current status of the journey run.
     * @see JourneyRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the journey run.
     * </p>
     * 
     * @return The current status of the journey run.
     * @see JourneyRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the journey run.
     * </p>
     * 
     * @param status
     *        The current status of the journey run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JourneyRunStatus
     */

    public JourneyRunResponse withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the journey run.
     * </p>
     * 
     * @param status
     *        The current status of the journey run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JourneyRunStatus
     */

    public JourneyRunResponse withStatus(JourneyRunStatus status) {
        this.status = status.toString();
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyRunResponse == false)
            return false;
        JourneyRunResponse other = (JourneyRunResponse) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public JourneyRunResponse clone() {
        try {
            return (JourneyRunResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyRunResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

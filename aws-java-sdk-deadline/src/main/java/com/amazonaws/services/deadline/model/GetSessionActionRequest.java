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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID for the session action.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The job ID for the session.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The queue ID for the session action.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The session action ID for the session.
     * </p>
     */
    private String sessionActionId;

    /**
     * <p>
     * The farm ID for the session action.
     * </p>
     * 
     * @param farmId
     *        The farm ID for the session action.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID for the session action.
     * </p>
     * 
     * @return The farm ID for the session action.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID for the session action.
     * </p>
     * 
     * @param farmId
     *        The farm ID for the session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The job ID for the session.
     * </p>
     * 
     * @param jobId
     *        The job ID for the session.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for the session.
     * </p>
     * 
     * @return The job ID for the session.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID for the session.
     * </p>
     * 
     * @param jobId
     *        The job ID for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The queue ID for the session action.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the session action.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID for the session action.
     * </p>
     * 
     * @return The queue ID for the session action.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID for the session action.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The session action ID for the session.
     * </p>
     * 
     * @param sessionActionId
     *        The session action ID for the session.
     */

    public void setSessionActionId(String sessionActionId) {
        this.sessionActionId = sessionActionId;
    }

    /**
     * <p>
     * The session action ID for the session.
     * </p>
     * 
     * @return The session action ID for the session.
     */

    public String getSessionActionId() {
        return this.sessionActionId;
    }

    /**
     * <p>
     * The session action ID for the session.
     * </p>
     * 
     * @param sessionActionId
     *        The session action ID for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionRequest withSessionActionId(String sessionActionId) {
        setSessionActionId(sessionActionId);
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
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getSessionActionId() != null)
            sb.append("SessionActionId: ").append(getSessionActionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionActionRequest == false)
            return false;
        GetSessionActionRequest other = (GetSessionActionRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getSessionActionId() == null ^ this.getSessionActionId() == null)
            return false;
        if (other.getSessionActionId() != null && other.getSessionActionId().equals(this.getSessionActionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getSessionActionId() == null) ? 0 : getSessionActionId().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionActionRequest clone() {
        return (GetSessionActionRequest) super.clone();
    }

}

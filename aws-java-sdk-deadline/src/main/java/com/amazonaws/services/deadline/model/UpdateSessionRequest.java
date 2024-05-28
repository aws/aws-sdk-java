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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The farm ID to update in the session.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The job ID to update in the session.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The queue ID to update in the session.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The session ID to update.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The life cycle status to update in the session.
     * </p>
     */
    private String targetLifecycleStatus;

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSessionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The farm ID to update in the session.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update in the session.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID to update in the session.
     * </p>
     * 
     * @return The farm ID to update in the session.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID to update in the session.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update in the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSessionRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The job ID to update in the session.
     * </p>
     * 
     * @param jobId
     *        The job ID to update in the session.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID to update in the session.
     * </p>
     * 
     * @return The job ID to update in the session.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID to update in the session.
     * </p>
     * 
     * @param jobId
     *        The job ID to update in the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSessionRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The queue ID to update in the session.
     * </p>
     * 
     * @param queueId
     *        The queue ID to update in the session.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID to update in the session.
     * </p>
     * 
     * @return The queue ID to update in the session.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID to update in the session.
     * </p>
     * 
     * @param queueId
     *        The queue ID to update in the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSessionRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The session ID to update.
     * </p>
     * 
     * @param sessionId
     *        The session ID to update.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The session ID to update.
     * </p>
     * 
     * @return The session ID to update.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The session ID to update.
     * </p>
     * 
     * @param sessionId
     *        The session ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSessionRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The life cycle status to update in the session.
     * </p>
     * 
     * @param targetLifecycleStatus
     *        The life cycle status to update in the session.
     * @see SessionLifecycleTargetStatus
     */

    public void setTargetLifecycleStatus(String targetLifecycleStatus) {
        this.targetLifecycleStatus = targetLifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status to update in the session.
     * </p>
     * 
     * @return The life cycle status to update in the session.
     * @see SessionLifecycleTargetStatus
     */

    public String getTargetLifecycleStatus() {
        return this.targetLifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status to update in the session.
     * </p>
     * 
     * @param targetLifecycleStatus
     *        The life cycle status to update in the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleTargetStatus
     */

    public UpdateSessionRequest withTargetLifecycleStatus(String targetLifecycleStatus) {
        setTargetLifecycleStatus(targetLifecycleStatus);
        return this;
    }

    /**
     * <p>
     * The life cycle status to update in the session.
     * </p>
     * 
     * @param targetLifecycleStatus
     *        The life cycle status to update in the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleTargetStatus
     */

    public UpdateSessionRequest withTargetLifecycleStatus(SessionLifecycleTargetStatus targetLifecycleStatus) {
        this.targetLifecycleStatus = targetLifecycleStatus.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getTargetLifecycleStatus() != null)
            sb.append("TargetLifecycleStatus: ").append(getTargetLifecycleStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSessionRequest == false)
            return false;
        UpdateSessionRequest other = (UpdateSessionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
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
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getTargetLifecycleStatus() == null ^ this.getTargetLifecycleStatus() == null)
            return false;
        if (other.getTargetLifecycleStatus() != null && other.getTargetLifecycleStatus().equals(this.getTargetLifecycleStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getTargetLifecycleStatus() == null) ? 0 : getTargetLifecycleStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSessionRequest clone() {
        return (UpdateSessionRequest) super.clone();
    }

}

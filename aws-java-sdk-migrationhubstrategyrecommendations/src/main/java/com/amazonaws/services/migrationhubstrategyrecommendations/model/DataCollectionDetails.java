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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about an assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/DataCollectionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCollectionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time the assessment completes.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The number of failed servers in the assessment.
     * </p>
     */
    private Integer failed;
    /**
     * <p>
     * The number of servers with the assessment status <code>IN_PROGESS</code>.
     * </p>
     */
    private Integer inProgress;
    /**
     * <p>
     * The total number of servers in the assessment.
     * </p>
     */
    private Integer servers;
    /**
     * <p>
     * The start time of assessment.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The status of the assessment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message of the assessment.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The number of successful servers in the assessment.
     * </p>
     */
    private Integer success;

    /**
     * <p>
     * The time the assessment completes.
     * </p>
     * 
     * @param completionTime
     *        The time the assessment completes.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The time the assessment completes.
     * </p>
     * 
     * @return The time the assessment completes.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The time the assessment completes.
     * </p>
     * 
     * @param completionTime
     *        The time the assessment completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCollectionDetails withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The number of failed servers in the assessment.
     * </p>
     * 
     * @param failed
     *        The number of failed servers in the assessment.
     */

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The number of failed servers in the assessment.
     * </p>
     * 
     * @return The number of failed servers in the assessment.
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The number of failed servers in the assessment.
     * </p>
     * 
     * @param failed
     *        The number of failed servers in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCollectionDetails withFailed(Integer failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * The number of servers with the assessment status <code>IN_PROGESS</code>.
     * </p>
     * 
     * @param inProgress
     *        The number of servers with the assessment status <code>IN_PROGESS</code>.
     */

    public void setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * <p>
     * The number of servers with the assessment status <code>IN_PROGESS</code>.
     * </p>
     * 
     * @return The number of servers with the assessment status <code>IN_PROGESS</code>.
     */

    public Integer getInProgress() {
        return this.inProgress;
    }

    /**
     * <p>
     * The number of servers with the assessment status <code>IN_PROGESS</code>.
     * </p>
     * 
     * @param inProgress
     *        The number of servers with the assessment status <code>IN_PROGESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCollectionDetails withInProgress(Integer inProgress) {
        setInProgress(inProgress);
        return this;
    }

    /**
     * <p>
     * The total number of servers in the assessment.
     * </p>
     * 
     * @param servers
     *        The total number of servers in the assessment.
     */

    public void setServers(Integer servers) {
        this.servers = servers;
    }

    /**
     * <p>
     * The total number of servers in the assessment.
     * </p>
     * 
     * @return The total number of servers in the assessment.
     */

    public Integer getServers() {
        return this.servers;
    }

    /**
     * <p>
     * The total number of servers in the assessment.
     * </p>
     * 
     * @param servers
     *        The total number of servers in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCollectionDetails withServers(Integer servers) {
        setServers(servers);
        return this;
    }

    /**
     * <p>
     * The start time of assessment.
     * </p>
     * 
     * @param startTime
     *        The start time of assessment.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of assessment.
     * </p>
     * 
     * @return The start time of assessment.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of assessment.
     * </p>
     * 
     * @param startTime
     *        The start time of assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCollectionDetails withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The status of the assessment.
     * </p>
     * 
     * @param status
     *        The status of the assessment.
     * @see AssessmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the assessment.
     * </p>
     * 
     * @return The status of the assessment.
     * @see AssessmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the assessment.
     * </p>
     * 
     * @param status
     *        The status of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public DataCollectionDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the assessment.
     * </p>
     * 
     * @param status
     *        The status of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public DataCollectionDetails withStatus(AssessmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message of the assessment.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the assessment.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message of the assessment.
     * </p>
     * 
     * @return The status message of the assessment.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message of the assessment.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCollectionDetails withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The number of successful servers in the assessment.
     * </p>
     * 
     * @param success
     *        The number of successful servers in the assessment.
     */

    public void setSuccess(Integer success) {
        this.success = success;
    }

    /**
     * <p>
     * The number of successful servers in the assessment.
     * </p>
     * 
     * @return The number of successful servers in the assessment.
     */

    public Integer getSuccess() {
        return this.success;
    }

    /**
     * <p>
     * The number of successful servers in the assessment.
     * </p>
     * 
     * @param success
     *        The number of successful servers in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCollectionDetails withSuccess(Integer success) {
        setSuccess(success);
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
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getInProgress() != null)
            sb.append("InProgress: ").append(getInProgress()).append(",");
        if (getServers() != null)
            sb.append("Servers: ").append(getServers()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getSuccess() != null)
            sb.append("Success: ").append(getSuccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCollectionDetails == false)
            return false;
        DataCollectionDetails other = (DataCollectionDetails) obj;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getInProgress() == null ^ this.getInProgress() == null)
            return false;
        if (other.getInProgress() != null && other.getInProgress().equals(this.getInProgress()) == false)
            return false;
        if (other.getServers() == null ^ this.getServers() == null)
            return false;
        if (other.getServers() != null && other.getServers().equals(this.getServers()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getSuccess() == null ^ this.getSuccess() == null)
            return false;
        if (other.getSuccess() != null && other.getSuccess().equals(this.getSuccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getInProgress() == null) ? 0 : getInProgress().hashCode());
        hashCode = prime * hashCode + ((getServers() == null) ? 0 : getServers().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        return hashCode;
    }

    @Override
    public DataCollectionDetails clone() {
        try {
            return (DataCollectionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.DataCollectionDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

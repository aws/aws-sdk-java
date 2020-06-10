/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a recommendation export job.
 * </p>
 * <p>
 * Use the <code>DescribeRecommendationExportJobs</code> action to view your recommendation export jobs.
 * </p>
 * <p>
 * Use the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions
 * to request an export of your recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RecommendationExportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationExportJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identification number of the export job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * An object that describes the destination of the export file.
     * </p>
     */
    private ExportDestination destination;
    /**
     * <p>
     * The resource type of the exported recommendations.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The status of the export job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of when the export job was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The timestamp of when the export job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The reason for an export job failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The identification number of the export job.
     * </p>
     * 
     * @param jobId
     *        The identification number of the export job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identification number of the export job.
     * </p>
     * 
     * @return The identification number of the export job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identification number of the export job.
     * </p>
     * 
     * @param jobId
     *        The identification number of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationExportJob withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * An object that describes the destination of the export file.
     * </p>
     * 
     * @param destination
     *        An object that describes the destination of the export file.
     */

    public void setDestination(ExportDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * An object that describes the destination of the export file.
     * </p>
     * 
     * @return An object that describes the destination of the export file.
     */

    public ExportDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * An object that describes the destination of the export file.
     * </p>
     * 
     * @param destination
     *        An object that describes the destination of the export file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationExportJob withDestination(ExportDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The resource type of the exported recommendations.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the exported recommendations.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type of the exported recommendations.
     * </p>
     * 
     * @return The resource type of the exported recommendations.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type of the exported recommendations.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the exported recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecommendationExportJob withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type of the exported recommendations.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the exported recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecommendationExportJob withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the export job.
     * </p>
     * 
     * @param status
     *        The status of the export job.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the export job.
     * </p>
     * 
     * @return The status of the export job.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the export job.
     * </p>
     * 
     * @param status
     *        The status of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public RecommendationExportJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the export job.
     * </p>
     * 
     * @param status
     *        The status of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public RecommendationExportJob withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the export job was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The timestamp of when the export job was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was created.
     * </p>
     * 
     * @return The timestamp of when the export job was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The timestamp of when the export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationExportJob withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the export job was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the export job was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was last updated.
     * </p>
     * 
     * @return The timestamp of when the export job was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the export job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationExportJob withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The reason for an export job failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for an export job failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for an export job failure.
     * </p>
     * 
     * @return The reason for an export job failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason for an export job failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for an export job failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationExportJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationExportJob == false)
            return false;
        RecommendationExportJob other = (RecommendationExportJob) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationExportJob clone() {
        try {
            return (RecommendationExportJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RecommendationExportJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

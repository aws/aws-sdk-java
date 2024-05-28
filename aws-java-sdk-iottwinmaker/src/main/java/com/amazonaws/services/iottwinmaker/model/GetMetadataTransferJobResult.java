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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetMetadataTransferJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetadataTransferJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     */
    private String metadataTransferJobId;
    /**
     * <p>
     * The metadata transfer job ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The metadata transfer job description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The metadata transfer job's sources.
     * </p>
     */
    private java.util.List<SourceConfiguration> sources;
    /**
     * <p>
     * The metadata transfer job's destination.
     * </p>
     */
    private DestinationConfiguration destination;
    /**
     * <p>
     * The metadata transfer job's role.
     * </p>
     */
    private String metadataTransferJobRole;
    /**
     * <p>
     * The metadata transfer job's report URL.
     * </p>
     */
    private String reportUrl;
    /**
     * <p>
     * The metadata transfer job's creation DateTime property.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The metadata transfer job's update DateTime property.
     * </p>
     */
    private java.util.Date updateDateTime;
    /**
     * <p>
     * The metadata transfer job's status.
     * </p>
     */
    private MetadataTransferJobStatus status;
    /**
     * <p>
     * The metadata transfer job's progress.
     * </p>
     */
    private MetadataTransferJobProgress progress;

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job Id.
     */

    public void setMetadataTransferJobId(String metadataTransferJobId) {
        this.metadataTransferJobId = metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @return The metadata transfer job Id.
     */

    public String getMetadataTransferJobId() {
        return this.metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withMetadataTransferJobId(String metadataTransferJobId) {
        setMetadataTransferJobId(metadataTransferJobId);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job ARN.
     * </p>
     * 
     * @param arn
     *        The metadata transfer job ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The metadata transfer job ARN.
     * </p>
     * 
     * @return The metadata transfer job ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The metadata transfer job ARN.
     * </p>
     * 
     * @param arn
     *        The metadata transfer job ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job description.
     * </p>
     * 
     * @param description
     *        The metadata transfer job description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The metadata transfer job description.
     * </p>
     * 
     * @return The metadata transfer job description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The metadata transfer job description.
     * </p>
     * 
     * @param description
     *        The metadata transfer job description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's sources.
     * </p>
     * 
     * @return The metadata transfer job's sources.
     */

    public java.util.List<SourceConfiguration> getSources() {
        return sources;
    }

    /**
     * <p>
     * The metadata transfer job's sources.
     * </p>
     * 
     * @param sources
     *        The metadata transfer job's sources.
     */

    public void setSources(java.util.Collection<SourceConfiguration> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<SourceConfiguration>(sources);
    }

    /**
     * <p>
     * The metadata transfer job's sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The metadata transfer job's sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withSources(SourceConfiguration... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<SourceConfiguration>(sources.length));
        }
        for (SourceConfiguration ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's sources.
     * </p>
     * 
     * @param sources
     *        The metadata transfer job's sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withSources(java.util.Collection<SourceConfiguration> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's destination.
     * </p>
     * 
     * @param destination
     *        The metadata transfer job's destination.
     */

    public void setDestination(DestinationConfiguration destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The metadata transfer job's destination.
     * </p>
     * 
     * @return The metadata transfer job's destination.
     */

    public DestinationConfiguration getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The metadata transfer job's destination.
     * </p>
     * 
     * @param destination
     *        The metadata transfer job's destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withDestination(DestinationConfiguration destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's role.
     * </p>
     * 
     * @param metadataTransferJobRole
     *        The metadata transfer job's role.
     */

    public void setMetadataTransferJobRole(String metadataTransferJobRole) {
        this.metadataTransferJobRole = metadataTransferJobRole;
    }

    /**
     * <p>
     * The metadata transfer job's role.
     * </p>
     * 
     * @return The metadata transfer job's role.
     */

    public String getMetadataTransferJobRole() {
        return this.metadataTransferJobRole;
    }

    /**
     * <p>
     * The metadata transfer job's role.
     * </p>
     * 
     * @param metadataTransferJobRole
     *        The metadata transfer job's role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withMetadataTransferJobRole(String metadataTransferJobRole) {
        setMetadataTransferJobRole(metadataTransferJobRole);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's report URL.
     * </p>
     * 
     * @param reportUrl
     *        The metadata transfer job's report URL.
     */

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    /**
     * <p>
     * The metadata transfer job's report URL.
     * </p>
     * 
     * @return The metadata transfer job's report URL.
     */

    public String getReportUrl() {
        return this.reportUrl;
    }

    /**
     * <p>
     * The metadata transfer job's report URL.
     * </p>
     * 
     * @param reportUrl
     *        The metadata transfer job's report URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withReportUrl(String reportUrl) {
        setReportUrl(reportUrl);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's creation DateTime property.
     * </p>
     * 
     * @param creationDateTime
     *        The metadata transfer job's creation DateTime property.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The metadata transfer job's creation DateTime property.
     * </p>
     * 
     * @return The metadata transfer job's creation DateTime property.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The metadata transfer job's creation DateTime property.
     * </p>
     * 
     * @param creationDateTime
     *        The metadata transfer job's creation DateTime property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's update DateTime property.
     * </p>
     * 
     * @param updateDateTime
     *        The metadata transfer job's update DateTime property.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The metadata transfer job's update DateTime property.
     * </p>
     * 
     * @return The metadata transfer job's update DateTime property.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The metadata transfer job's update DateTime property.
     * </p>
     * 
     * @param updateDateTime
     *        The metadata transfer job's update DateTime property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's status.
     * </p>
     * 
     * @param status
     *        The metadata transfer job's status.
     */

    public void setStatus(MetadataTransferJobStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The metadata transfer job's status.
     * </p>
     * 
     * @return The metadata transfer job's status.
     */

    public MetadataTransferJobStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The metadata transfer job's status.
     * </p>
     * 
     * @param status
     *        The metadata transfer job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withStatus(MetadataTransferJobStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's progress.
     * </p>
     * 
     * @param progress
     *        The metadata transfer job's progress.
     */

    public void setProgress(MetadataTransferJobProgress progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The metadata transfer job's progress.
     * </p>
     * 
     * @return The metadata transfer job's progress.
     */

    public MetadataTransferJobProgress getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The metadata transfer job's progress.
     * </p>
     * 
     * @param progress
     *        The metadata transfer job's progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobResult withProgress(MetadataTransferJobProgress progress) {
        setProgress(progress);
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
        if (getMetadataTransferJobId() != null)
            sb.append("MetadataTransferJobId: ").append(getMetadataTransferJobId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getMetadataTransferJobRole() != null)
            sb.append("MetadataTransferJobRole: ").append(getMetadataTransferJobRole()).append(",");
        if (getReportUrl() != null)
            sb.append("ReportUrl: ").append(getReportUrl()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetadataTransferJobResult == false)
            return false;
        GetMetadataTransferJobResult other = (GetMetadataTransferJobResult) obj;
        if (other.getMetadataTransferJobId() == null ^ this.getMetadataTransferJobId() == null)
            return false;
        if (other.getMetadataTransferJobId() != null && other.getMetadataTransferJobId().equals(this.getMetadataTransferJobId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getMetadataTransferJobRole() == null ^ this.getMetadataTransferJobRole() == null)
            return false;
        if (other.getMetadataTransferJobRole() != null && other.getMetadataTransferJobRole().equals(this.getMetadataTransferJobRole()) == false)
            return false;
        if (other.getReportUrl() == null ^ this.getReportUrl() == null)
            return false;
        if (other.getReportUrl() != null && other.getReportUrl().equals(this.getReportUrl()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataTransferJobId() == null) ? 0 : getMetadataTransferJobId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getMetadataTransferJobRole() == null) ? 0 : getMetadataTransferJobRole().hashCode());
        hashCode = prime * hashCode + ((getReportUrl() == null) ? 0 : getReportUrl().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        return hashCode;
    }

    @Override
    public GetMetadataTransferJobResult clone() {
        try {
            return (GetMetadataTransferJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

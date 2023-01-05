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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the import.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinations;
    /**
     * <p>
     * The source S3 bucket for the import.
     * </p>
     */
    private ImportSource importSource;
    /**
     * <p>
     * Used with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period.
     * </p>
     */
    private java.util.Date startEventTime;
    /**
     * <p>
     * Used with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     * events to only those events logged within a specified time period.
     * </p>
     */
    private java.util.Date endEventTime;
    /**
     * <p>
     * Shows the status of the import after a <code>StartImport</code> request. An import finishes with a status of
     * <code>COMPLETED</code> if there were no failures, or <code>FAILED</code> if there were failures.
     * </p>
     */
    private String importStatus;
    /**
     * <p>
     * The timestamp for the import's creation.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The timestamp of the import's last update, if applicable.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The ID of the import.
     * </p>
     * 
     * @param importId
     *        The ID of the import.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The ID of the import.
     * </p>
     * 
     * @return The ID of the import.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * The ID of the import.
     * </p>
     * 
     * @param importId
     *        The ID of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * 
     * @return The ARN of the destination event data store.
     */

    public java.util.List<String> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return destinations;
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * 
     * @param destinations
     *        The ARN of the destination event data store.
     */

    public void setDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<String>(destinations);
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The ARN of the destination event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withDestinations(String... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<String>(destinations.length));
        }
        for (String ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * 
     * @param destinations
     *        The ARN of the destination event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withDestinations(java.util.Collection<String> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The source S3 bucket for the import.
     * </p>
     * 
     * @param importSource
     *        The source S3 bucket for the import.
     */

    public void setImportSource(ImportSource importSource) {
        this.importSource = importSource;
    }

    /**
     * <p>
     * The source S3 bucket for the import.
     * </p>
     * 
     * @return The source S3 bucket for the import.
     */

    public ImportSource getImportSource() {
        return this.importSource;
    }

    /**
     * <p>
     * The source S3 bucket for the import.
     * </p>
     * 
     * @param importSource
     *        The source S3 bucket for the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withImportSource(ImportSource importSource) {
        setImportSource(importSource);
        return this;
    }

    /**
     * <p>
     * Used with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period.
     * </p>
     * 
     * @param startEventTime
     *        Used with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     *        events to only those events logged within a specified time period.
     */

    public void setStartEventTime(java.util.Date startEventTime) {
        this.startEventTime = startEventTime;
    }

    /**
     * <p>
     * Used with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period.
     * </p>
     * 
     * @return Used with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     *         events to only those events logged within a specified time period.
     */

    public java.util.Date getStartEventTime() {
        return this.startEventTime;
    }

    /**
     * <p>
     * Used with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period.
     * </p>
     * 
     * @param startEventTime
     *        Used with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     *        events to only those events logged within a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withStartEventTime(java.util.Date startEventTime) {
        setStartEventTime(startEventTime);
        return this;
    }

    /**
     * <p>
     * Used with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     * events to only those events logged within a specified time period.
     * </p>
     * 
     * @param endEventTime
     *        Used with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported
     *        trail events to only those events logged within a specified time period.
     */

    public void setEndEventTime(java.util.Date endEventTime) {
        this.endEventTime = endEventTime;
    }

    /**
     * <p>
     * Used with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     * events to only those events logged within a specified time period.
     * </p>
     * 
     * @return Used with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported
     *         trail events to only those events logged within a specified time period.
     */

    public java.util.Date getEndEventTime() {
        return this.endEventTime;
    }

    /**
     * <p>
     * Used with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     * events to only those events logged within a specified time period.
     * </p>
     * 
     * @param endEventTime
     *        Used with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported
     *        trail events to only those events logged within a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withEndEventTime(java.util.Date endEventTime) {
        setEndEventTime(endEventTime);
        return this;
    }

    /**
     * <p>
     * Shows the status of the import after a <code>StartImport</code> request. An import finishes with a status of
     * <code>COMPLETED</code> if there were no failures, or <code>FAILED</code> if there were failures.
     * </p>
     * 
     * @param importStatus
     *        Shows the status of the import after a <code>StartImport</code> request. An import finishes with a status
     *        of <code>COMPLETED</code> if there were no failures, or <code>FAILED</code> if there were failures.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * Shows the status of the import after a <code>StartImport</code> request. An import finishes with a status of
     * <code>COMPLETED</code> if there were no failures, or <code>FAILED</code> if there were failures.
     * </p>
     * 
     * @return Shows the status of the import after a <code>StartImport</code> request. An import finishes with a status
     *         of <code>COMPLETED</code> if there were no failures, or <code>FAILED</code> if there were failures.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * Shows the status of the import after a <code>StartImport</code> request. An import finishes with a status of
     * <code>COMPLETED</code> if there were no failures, or <code>FAILED</code> if there were failures.
     * </p>
     * 
     * @param importStatus
     *        Shows the status of the import after a <code>StartImport</code> request. An import finishes with a status
     *        of <code>COMPLETED</code> if there were no failures, or <code>FAILED</code> if there were failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public StartImportResult withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * Shows the status of the import after a <code>StartImport</code> request. An import finishes with a status of
     * <code>COMPLETED</code> if there were no failures, or <code>FAILED</code> if there were failures.
     * </p>
     * 
     * @param importStatus
     *        Shows the status of the import after a <code>StartImport</code> request. An import finishes with a status
     *        of <code>COMPLETED</code> if there were no failures, or <code>FAILED</code> if there were failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public StartImportResult withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp for the import's creation.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp for the import's creation.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp for the import's creation.
     * </p>
     * 
     * @return The timestamp for the import's creation.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp for the import's creation.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp for the import's creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp of the import's last update, if applicable.
     * </p>
     * 
     * @param updatedTimestamp
     *        The timestamp of the import's last update, if applicable.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of the import's last update, if applicable.
     * </p>
     * 
     * @return The timestamp of the import's last update, if applicable.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of the import's last update, if applicable.
     * </p>
     * 
     * @param updatedTimestamp
     *        The timestamp of the import's last update, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportResult withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getImportId() != null)
            sb.append("ImportId: ").append(getImportId()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getImportSource() != null)
            sb.append("ImportSource: ").append(getImportSource()).append(",");
        if (getStartEventTime() != null)
            sb.append("StartEventTime: ").append(getStartEventTime()).append(",");
        if (getEndEventTime() != null)
            sb.append("EndEventTime: ").append(getEndEventTime()).append(",");
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportResult == false)
            return false;
        StartImportResult other = (StartImportResult) obj;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getImportSource() == null ^ this.getImportSource() == null)
            return false;
        if (other.getImportSource() != null && other.getImportSource().equals(this.getImportSource()) == false)
            return false;
        if (other.getStartEventTime() == null ^ this.getStartEventTime() == null)
            return false;
        if (other.getStartEventTime() != null && other.getStartEventTime().equals(this.getStartEventTime()) == false)
            return false;
        if (other.getEndEventTime() == null ^ this.getEndEventTime() == null)
            return false;
        if (other.getEndEventTime() != null && other.getEndEventTime().equals(this.getEndEventTime()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getImportSource() == null) ? 0 : getImportSource().hashCode());
        hashCode = prime * hashCode + ((getStartEventTime() == null) ? 0 : getStartEventTime().hashCode());
        hashCode = prime * hashCode + ((getEndEventTime() == null) ? 0 : getEndEventTime().hashCode());
        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StartImportResult clone() {
        try {
            return (StartImportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

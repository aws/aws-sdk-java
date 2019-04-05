/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetBulkDeploymentStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBulkDeploymentStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Relevant metrics on input records processed during bulk deployment. */
    private BulkDeploymentMetrics bulkDeploymentMetrics;
    /** The status of the bulk deployment. */
    private String bulkDeploymentStatus;
    /** The time, in ISO format, when the deployment was created. */
    private String createdAt;
    /** Error details */
    private java.util.List<ErrorDetail> errorDetails;
    /** Error message */
    private String errorMessage;
    /** The tags for the definition. */
    private java.util.Map<String, String> tags;

    /**
     * Relevant metrics on input records processed during bulk deployment.
     * 
     * @param bulkDeploymentMetrics
     *        Relevant metrics on input records processed during bulk deployment.
     */

    public void setBulkDeploymentMetrics(BulkDeploymentMetrics bulkDeploymentMetrics) {
        this.bulkDeploymentMetrics = bulkDeploymentMetrics;
    }

    /**
     * Relevant metrics on input records processed during bulk deployment.
     * 
     * @return Relevant metrics on input records processed during bulk deployment.
     */

    public BulkDeploymentMetrics getBulkDeploymentMetrics() {
        return this.bulkDeploymentMetrics;
    }

    /**
     * Relevant metrics on input records processed during bulk deployment.
     * 
     * @param bulkDeploymentMetrics
     *        Relevant metrics on input records processed during bulk deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkDeploymentStatusResult withBulkDeploymentMetrics(BulkDeploymentMetrics bulkDeploymentMetrics) {
        setBulkDeploymentMetrics(bulkDeploymentMetrics);
        return this;
    }

    /**
     * The status of the bulk deployment.
     * 
     * @param bulkDeploymentStatus
     *        The status of the bulk deployment.
     * @see BulkDeploymentStatus
     */

    public void setBulkDeploymentStatus(String bulkDeploymentStatus) {
        this.bulkDeploymentStatus = bulkDeploymentStatus;
    }

    /**
     * The status of the bulk deployment.
     * 
     * @return The status of the bulk deployment.
     * @see BulkDeploymentStatus
     */

    public String getBulkDeploymentStatus() {
        return this.bulkDeploymentStatus;
    }

    /**
     * The status of the bulk deployment.
     * 
     * @param bulkDeploymentStatus
     *        The status of the bulk deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BulkDeploymentStatus
     */

    public GetBulkDeploymentStatusResult withBulkDeploymentStatus(String bulkDeploymentStatus) {
        setBulkDeploymentStatus(bulkDeploymentStatus);
        return this;
    }

    /**
     * The status of the bulk deployment.
     * 
     * @param bulkDeploymentStatus
     *        The status of the bulk deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BulkDeploymentStatus
     */

    public GetBulkDeploymentStatusResult withBulkDeploymentStatus(BulkDeploymentStatus bulkDeploymentStatus) {
        this.bulkDeploymentStatus = bulkDeploymentStatus.toString();
        return this;
    }

    /**
     * The time, in ISO format, when the deployment was created.
     * 
     * @param createdAt
     *        The time, in ISO format, when the deployment was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time, in ISO format, when the deployment was created.
     * 
     * @return The time, in ISO format, when the deployment was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The time, in ISO format, when the deployment was created.
     * 
     * @param createdAt
     *        The time, in ISO format, when the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkDeploymentStatusResult withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * Error details
     * 
     * @return Error details
     */

    public java.util.List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    /**
     * Error details
     * 
     * @param errorDetails
     *        Error details
     */

    public void setErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        if (errorDetails == null) {
            this.errorDetails = null;
            return;
        }

        this.errorDetails = new java.util.ArrayList<ErrorDetail>(errorDetails);
    }

    /**
     * Error details
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorDetails(java.util.Collection)} or {@link #withErrorDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorDetails
     *        Error details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkDeploymentStatusResult withErrorDetails(ErrorDetail... errorDetails) {
        if (this.errorDetails == null) {
            setErrorDetails(new java.util.ArrayList<ErrorDetail>(errorDetails.length));
        }
        for (ErrorDetail ele : errorDetails) {
            this.errorDetails.add(ele);
        }
        return this;
    }

    /**
     * Error details
     * 
     * @param errorDetails
     *        Error details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkDeploymentStatusResult withErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        setErrorDetails(errorDetails);
        return this;
    }

    /**
     * Error message
     * 
     * @param errorMessage
     *        Error message
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Error message
     * 
     * @return Error message
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Error message
     * 
     * @param errorMessage
     *        Error message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkDeploymentStatusResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * The tags for the definition.
     * 
     * @return The tags for the definition.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The tags for the definition.
     * 
     * @param tags
     *        The tags for the definition.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The tags for the definition.
     * 
     * @param tags
     *        The tags for the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkDeploymentStatusResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public GetBulkDeploymentStatusResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkDeploymentStatusResult clearTagsEntries() {
        this.tags = null;
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
        if (getBulkDeploymentMetrics() != null)
            sb.append("BulkDeploymentMetrics: ").append(getBulkDeploymentMetrics()).append(",");
        if (getBulkDeploymentStatus() != null)
            sb.append("BulkDeploymentStatus: ").append(getBulkDeploymentStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBulkDeploymentStatusResult == false)
            return false;
        GetBulkDeploymentStatusResult other = (GetBulkDeploymentStatusResult) obj;
        if (other.getBulkDeploymentMetrics() == null ^ this.getBulkDeploymentMetrics() == null)
            return false;
        if (other.getBulkDeploymentMetrics() != null && other.getBulkDeploymentMetrics().equals(this.getBulkDeploymentMetrics()) == false)
            return false;
        if (other.getBulkDeploymentStatus() == null ^ this.getBulkDeploymentStatus() == null)
            return false;
        if (other.getBulkDeploymentStatus() != null && other.getBulkDeploymentStatus().equals(this.getBulkDeploymentStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBulkDeploymentMetrics() == null) ? 0 : getBulkDeploymentMetrics().hashCode());
        hashCode = prime * hashCode + ((getBulkDeploymentStatus() == null) ? 0 : getBulkDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetBulkDeploymentStatusResult clone() {
        try {
            return (GetBulkDeploymentStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

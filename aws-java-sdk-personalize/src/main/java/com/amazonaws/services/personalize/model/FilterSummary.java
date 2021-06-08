/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A short summary of a filter's attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/FilterSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the filter.
     * </p>
     */
    private String filterArn;
    /**
     * <p>
     * The time at which the filter was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The time at which the filter was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The ARN of the dataset group to which the filter belongs.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * If the filter failed, the reason for the failure.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The status of the filter.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the filter.
     * </p>
     * 
     * @param filterArn
     *        The ARN of the filter.
     */

    public void setFilterArn(String filterArn) {
        this.filterArn = filterArn;
    }

    /**
     * <p>
     * The ARN of the filter.
     * </p>
     * 
     * @return The ARN of the filter.
     */

    public String getFilterArn() {
        return this.filterArn;
    }

    /**
     * <p>
     * The ARN of the filter.
     * </p>
     * 
     * @param filterArn
     *        The ARN of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterSummary withFilterArn(String filterArn) {
        setFilterArn(filterArn);
        return this;
    }

    /**
     * <p>
     * The time at which the filter was created.
     * </p>
     * 
     * @param creationDateTime
     *        The time at which the filter was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The time at which the filter was created.
     * </p>
     * 
     * @return The time at which the filter was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The time at which the filter was created.
     * </p>
     * 
     * @param creationDateTime
     *        The time at which the filter was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The time at which the filter was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The time at which the filter was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the filter was last updated.
     * </p>
     * 
     * @return The time at which the filter was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the filter was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The time at which the filter was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset group to which the filter belongs.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group to which the filter belongs.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group to which the filter belongs.
     * </p>
     * 
     * @return The ARN of the dataset group to which the filter belongs.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group to which the filter belongs.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group to which the filter belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterSummary withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * If the filter failed, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        If the filter failed, the reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the filter failed, the reason for the failure.
     * </p>
     * 
     * @return If the filter failed, the reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the filter failed, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        If the filter failed, the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The status of the filter.
     * </p>
     * 
     * @param status
     *        The status of the filter.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the filter.
     * </p>
     * 
     * @return The status of the filter.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the filter.
     * </p>
     * 
     * @param status
     *        The status of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterSummary withStatus(String status) {
        setStatus(status);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFilterArn() != null)
            sb.append("FilterArn: ").append(getFilterArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
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

        if (obj instanceof FilterSummary == false)
            return false;
        FilterSummary other = (FilterSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFilterArn() == null ^ this.getFilterArn() == null)
            return false;
        if (other.getFilterArn() != null && other.getFilterArn().equals(this.getFilterArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilterArn() == null) ? 0 : getFilterArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public FilterSummary clone() {
        try {
            return (FilterSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.FilterSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

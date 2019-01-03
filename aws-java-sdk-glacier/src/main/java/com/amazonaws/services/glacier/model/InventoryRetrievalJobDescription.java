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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the options for a range inventory retrieval job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryRetrievalJobDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The output format for the vault inventory list, which is set by the <b>InitiateJob</b> request when initiating a
     * job to retrieve a vault inventory. Valid values are <code>CSV</code> and <code>JSON</code>.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes
     * archives created on or after this date. This value should be a string in the ISO 8601 date format, for example
     * <code>2013-03-20T17:03:43Z</code>.
     * </p>
     */
    private String startDate;
    /**
     * <p>
     * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date.
     * This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.
     * </p>
     */
    private String endDate;
    /**
     * <p>
     * The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when
     * initiating the job with the a <b>InitiateJob</b> request.
     * </p>
     */
    private String limit;
    /**
     * <p>
     * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use
     * the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are no more
     * inventory items, this value is <code>null</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering"
     * > Range Inventory Retrieval</a>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The output format for the vault inventory list, which is set by the <b>InitiateJob</b> request when initiating a
     * job to retrieve a vault inventory. Valid values are <code>CSV</code> and <code>JSON</code>.
     * </p>
     * 
     * @param format
     *        The output format for the vault inventory list, which is set by the <b>InitiateJob</b> request when
     *        initiating a job to retrieve a vault inventory. Valid values are <code>CSV</code> and <code>JSON</code>.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The output format for the vault inventory list, which is set by the <b>InitiateJob</b> request when initiating a
     * job to retrieve a vault inventory. Valid values are <code>CSV</code> and <code>JSON</code>.
     * </p>
     * 
     * @return The output format for the vault inventory list, which is set by the <b>InitiateJob</b> request when
     *         initiating a job to retrieve a vault inventory. Valid values are <code>CSV</code> and <code>JSON</code>.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The output format for the vault inventory list, which is set by the <b>InitiateJob</b> request when initiating a
     * job to retrieve a vault inventory. Valid values are <code>CSV</code> and <code>JSON</code>.
     * </p>
     * 
     * @param format
     *        The output format for the vault inventory list, which is set by the <b>InitiateJob</b> request when
     *        initiating a job to retrieve a vault inventory. Valid values are <code>CSV</code> and <code>JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryRetrievalJobDescription withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes
     * archives created on or after this date. This value should be a string in the ISO 8601 date format, for example
     * <code>2013-03-20T17:03:43Z</code>.
     * </p>
     * 
     * @param startDate
     *        The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that
     *        includes archives created on or after this date. This value should be a string in the ISO 8601 date
     *        format, for example <code>2013-03-20T17:03:43Z</code>.
     */

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes
     * archives created on or after this date. This value should be a string in the ISO 8601 date format, for example
     * <code>2013-03-20T17:03:43Z</code>.
     * </p>
     * 
     * @return The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that
     *         includes archives created on or after this date. This value should be a string in the ISO 8601 date
     *         format, for example <code>2013-03-20T17:03:43Z</code>.
     */

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes
     * archives created on or after this date. This value should be a string in the ISO 8601 date format, for example
     * <code>2013-03-20T17:03:43Z</code>.
     * </p>
     * 
     * @param startDate
     *        The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that
     *        includes archives created on or after this date. This value should be a string in the ISO 8601 date
     *        format, for example <code>2013-03-20T17:03:43Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryRetrievalJobDescription withStartDate(String startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date.
     * This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.
     * </p>
     * 
     * @param endDate
     *        The end of the date range in UTC for vault inventory retrieval that includes archives created before this
     *        date. This value should be a string in the ISO 8601 date format, for example
     *        <code>2013-03-20T17:03:43Z</code>.
     */

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date.
     * This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.
     * </p>
     * 
     * @return The end of the date range in UTC for vault inventory retrieval that includes archives created before this
     *         date. This value should be a string in the ISO 8601 date format, for example
     *         <code>2013-03-20T17:03:43Z</code>.
     */

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date.
     * This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.
     * </p>
     * 
     * @param endDate
     *        The end of the date range in UTC for vault inventory retrieval that includes archives created before this
     *        date. This value should be a string in the ISO 8601 date format, for example
     *        <code>2013-03-20T17:03:43Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryRetrievalJobDescription withEndDate(String endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when
     * initiating the job with the a <b>InitiateJob</b> request.
     * </p>
     * 
     * @param limit
     *        The maximum number of inventory items returned per vault inventory retrieval request. This limit is set
     *        when initiating the job with the a <b>InitiateJob</b> request.
     */

    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when
     * initiating the job with the a <b>InitiateJob</b> request.
     * </p>
     * 
     * @return The maximum number of inventory items returned per vault inventory retrieval request. This limit is set
     *         when initiating the job with the a <b>InitiateJob</b> request.
     */

    public String getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when
     * initiating the job with the a <b>InitiateJob</b> request.
     * </p>
     * 
     * @param limit
     *        The maximum number of inventory items returned per vault inventory retrieval request. This limit is set
     *        when initiating the job with the a <b>InitiateJob</b> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryRetrievalJobDescription withLimit(String limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use
     * the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are no more
     * inventory items, this value is <code>null</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering"
     * > Range Inventory Retrieval</a>.
     * </p>
     * 
     * @param marker
     *        An opaque string that represents where to continue pagination of the vault inventory retrieval results.
     *        You use the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are
     *        no more inventory items, this value is <code>null</code>. For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering"
     *        > Range Inventory Retrieval</a>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use
     * the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are no more
     * inventory items, this value is <code>null</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering"
     * > Range Inventory Retrieval</a>.
     * </p>
     * 
     * @return An opaque string that represents where to continue pagination of the vault inventory retrieval results.
     *         You use the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are
     *         no more inventory items, this value is <code>null</code>. For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering"
     *         > Range Inventory Retrieval</a>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use
     * the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are no more
     * inventory items, this value is <code>null</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering"
     * > Range Inventory Retrieval</a>.
     * </p>
     * 
     * @param marker
     *        An opaque string that represents where to continue pagination of the vault inventory retrieval results.
     *        You use the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are
     *        no more inventory items, this value is <code>null</code>. For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering"
     *        > Range Inventory Retrieval</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryRetrievalJobDescription withMarker(String marker) {
        setMarker(marker);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryRetrievalJobDescription == false)
            return false;
        InventoryRetrievalJobDescription other = (InventoryRetrievalJobDescription) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public InventoryRetrievalJobDescription clone() {
        try {
            return (InventoryRetrievalJobDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.InventoryRetrievalJobDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

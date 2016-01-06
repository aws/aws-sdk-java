/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the options for a range inventory retrieval job.
 * </p>
 */
public class InventoryRetrievalJobDescription implements Serializable, Cloneable {

    /**
     * The output format for the vault inventory list, which is set by the
     * <b>InitiateJob</b> request when initiating a job to retrieve a vault
     * inventory. Valid values are "CSV" and "JSON".
     */
    private String format;

    /**
     * The start of the date range in UTC for vault inventory retrieval that
     * includes archives created on or after this date. A string
     * representation of ISO 8601 date format, for example,
     * 2013-03-20T17:03:43Z.
     */
    private String startDate;

    /**
     * The end of the date range in UTC for vault inventory retrieval that
     * includes archives created before this date. A string representation of
     * ISO 8601 date format, for example, 2013-03-20T17:03:43Z.
     */
    private String endDate;

    /**
     * Specifies the maximum number of inventory items returned per vault
     * inventory retrieval request. This limit is set when initiating the job
     * with the a <b>InitiateJob</b> request.
     */
    private String limit;

    /**
     * An opaque string that represents where to continue pagination of the
     * vault inventory retrieval results. You use the marker in a new
     * <b>InitiateJob</b> request to obtain additional inventory items. If
     * there are no more inventory items, this value is <code>null</code>.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering">
     * Range Inventory Retrieval</a>.
     */
    private String marker;

    /**
     * The output format for the vault inventory list, which is set by the
     * <b>InitiateJob</b> request when initiating a job to retrieve a vault
     * inventory. Valid values are "CSV" and "JSON".
     *
     * @return The output format for the vault inventory list, which is set by the
     *         <b>InitiateJob</b> request when initiating a job to retrieve a vault
     *         inventory. Valid values are "CSV" and "JSON".
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The output format for the vault inventory list, which is set by the
     * <b>InitiateJob</b> request when initiating a job to retrieve a vault
     * inventory. Valid values are "CSV" and "JSON".
     *
     * @param format The output format for the vault inventory list, which is set by the
     *         <b>InitiateJob</b> request when initiating a job to retrieve a vault
     *         inventory. Valid values are "CSV" and "JSON".
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The output format for the vault inventory list, which is set by the
     * <b>InitiateJob</b> request when initiating a job to retrieve a vault
     * inventory. Valid values are "CSV" and "JSON".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param format The output format for the vault inventory list, which is set by the
     *         <b>InitiateJob</b> request when initiating a job to retrieve a vault
     *         inventory. Valid values are "CSV" and "JSON".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InventoryRetrievalJobDescription withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The start of the date range in UTC for vault inventory retrieval that
     * includes archives created on or after this date. A string
     * representation of ISO 8601 date format, for example,
     * 2013-03-20T17:03:43Z.
     *
     * @return The start of the date range in UTC for vault inventory retrieval that
     *         includes archives created on or after this date. A string
     *         representation of ISO 8601 date format, for example,
     *         2013-03-20T17:03:43Z.
     */
    public String getStartDate() {
        return startDate;
    }
    
    /**
     * The start of the date range in UTC for vault inventory retrieval that
     * includes archives created on or after this date. A string
     * representation of ISO 8601 date format, for example,
     * 2013-03-20T17:03:43Z.
     *
     * @param startDate The start of the date range in UTC for vault inventory retrieval that
     *         includes archives created on or after this date. A string
     *         representation of ISO 8601 date format, for example,
     *         2013-03-20T17:03:43Z.
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    /**
     * The start of the date range in UTC for vault inventory retrieval that
     * includes archives created on or after this date. A string
     * representation of ISO 8601 date format, for example,
     * 2013-03-20T17:03:43Z.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDate The start of the date range in UTC for vault inventory retrieval that
     *         includes archives created on or after this date. A string
     *         representation of ISO 8601 date format, for example,
     *         2013-03-20T17:03:43Z.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InventoryRetrievalJobDescription withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The end of the date range in UTC for vault inventory retrieval that
     * includes archives created before this date. A string representation of
     * ISO 8601 date format, for example, 2013-03-20T17:03:43Z.
     *
     * @return The end of the date range in UTC for vault inventory retrieval that
     *         includes archives created before this date. A string representation of
     *         ISO 8601 date format, for example, 2013-03-20T17:03:43Z.
     */
    public String getEndDate() {
        return endDate;
    }
    
    /**
     * The end of the date range in UTC for vault inventory retrieval that
     * includes archives created before this date. A string representation of
     * ISO 8601 date format, for example, 2013-03-20T17:03:43Z.
     *
     * @param endDate The end of the date range in UTC for vault inventory retrieval that
     *         includes archives created before this date. A string representation of
     *         ISO 8601 date format, for example, 2013-03-20T17:03:43Z.
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    /**
     * The end of the date range in UTC for vault inventory retrieval that
     * includes archives created before this date. A string representation of
     * ISO 8601 date format, for example, 2013-03-20T17:03:43Z.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDate The end of the date range in UTC for vault inventory retrieval that
     *         includes archives created before this date. A string representation of
     *         ISO 8601 date format, for example, 2013-03-20T17:03:43Z.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InventoryRetrievalJobDescription withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Specifies the maximum number of inventory items returned per vault
     * inventory retrieval request. This limit is set when initiating the job
     * with the a <b>InitiateJob</b> request.
     *
     * @return Specifies the maximum number of inventory items returned per vault
     *         inventory retrieval request. This limit is set when initiating the job
     *         with the a <b>InitiateJob</b> request.
     */
    public String getLimit() {
        return limit;
    }
    
    /**
     * Specifies the maximum number of inventory items returned per vault
     * inventory retrieval request. This limit is set when initiating the job
     * with the a <b>InitiateJob</b> request.
     *
     * @param limit Specifies the maximum number of inventory items returned per vault
     *         inventory retrieval request. This limit is set when initiating the job
     *         with the a <b>InitiateJob</b> request.
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }
    
    /**
     * Specifies the maximum number of inventory items returned per vault
     * inventory retrieval request. This limit is set when initiating the job
     * with the a <b>InitiateJob</b> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param limit Specifies the maximum number of inventory items returned per vault
     *         inventory retrieval request. This limit is set when initiating the job
     *         with the a <b>InitiateJob</b> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InventoryRetrievalJobDescription withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * An opaque string that represents where to continue pagination of the
     * vault inventory retrieval results. You use the marker in a new
     * <b>InitiateJob</b> request to obtain additional inventory items. If
     * there are no more inventory items, this value is <code>null</code>.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering">
     * Range Inventory Retrieval</a>.
     *
     * @return An opaque string that represents where to continue pagination of the
     *         vault inventory retrieval results. You use the marker in a new
     *         <b>InitiateJob</b> request to obtain additional inventory items. If
     *         there are no more inventory items, this value is <code>null</code>.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering">
     *         Range Inventory Retrieval</a>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string that represents where to continue pagination of the
     * vault inventory retrieval results. You use the marker in a new
     * <b>InitiateJob</b> request to obtain additional inventory items. If
     * there are no more inventory items, this value is <code>null</code>.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering">
     * Range Inventory Retrieval</a>.
     *
     * @param marker An opaque string that represents where to continue pagination of the
     *         vault inventory retrieval results. You use the marker in a new
     *         <b>InitiateJob</b> request to obtain additional inventory items. If
     *         there are no more inventory items, this value is <code>null</code>.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering">
     *         Range Inventory Retrieval</a>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string that represents where to continue pagination of the
     * vault inventory retrieval results. You use the marker in a new
     * <b>InitiateJob</b> request to obtain additional inventory items. If
     * there are no more inventory items, this value is <code>null</code>.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering">
     * Range Inventory Retrieval</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An opaque string that represents where to continue pagination of the
     *         vault inventory retrieval results. You use the marker in a new
     *         <b>InitiateJob</b> request to obtain additional inventory items. If
     *         there are no more inventory items, this value is <code>null</code>.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering">
     *         Range Inventory Retrieval</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InventoryRetrievalJobDescription withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getStartDate() != null) sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null) sb.append("EndDate: " + getEndDate() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InventoryRetrievalJobDescription == false) return false;
        InventoryRetrievalJobDescription other = (InventoryRetrievalJobDescription)obj;
        
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getStartDate() == null ^ this.getStartDate() == null) return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false) return false; 
        if (other.getEndDate() == null ^ this.getEndDate() == null) return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public InventoryRetrievalJobDescription clone() {
        try {
            return (InventoryRetrievalJobDescription) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
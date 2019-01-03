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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Returned for a successful ListRecordsRequest.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of all records. */
    private com.amazonaws.internal.SdkInternalList<Record> records;
    /** A pagination token for obtaining the next page of results. */
    private String nextToken;
    /** Total number of records. */
    private Integer count;
    /** Server sync count for this dataset. */
    private Long datasetSyncCount;
    /** The user/device that made the last change to this record. */
    private String lastModifiedBy;
    /** Names of merged datasets. */
    private com.amazonaws.internal.SdkInternalList<String> mergedDatasetNames;
    /** Indicates whether the dataset exists. */
    private Boolean datasetExists;
    /** A boolean value specifying whether to delete the dataset locally. */
    private Boolean datasetDeletedAfterRequestedSyncCount;
    /** A token containing a session ID, identity ID, and expiration. */
    private String syncSessionToken;

    /**
     * A list of all records.
     * 
     * @return A list of all records.
     */

    public java.util.List<Record> getRecords() {
        if (records == null) {
            records = new com.amazonaws.internal.SdkInternalList<Record>();
        }
        return records;
    }

    /**
     * A list of all records.
     * 
     * @param records
     *        A list of all records.
     */

    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new com.amazonaws.internal.SdkInternalList<Record>(records);
    }

    /**
     * A list of all records.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        A list of all records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withRecords(Record... records) {
        if (this.records == null) {
            setRecords(new com.amazonaws.internal.SdkInternalList<Record>(records.length));
        }
        for (Record ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * A list of all records.
     * 
     * @param records
     *        A list of all records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withRecords(java.util.Collection<Record> records) {
        setRecords(records);
        return this;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @param nextToken
     *        A pagination token for obtaining the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @return A pagination token for obtaining the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @param nextToken
     *        A pagination token for obtaining the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Total number of records.
     * 
     * @param count
     *        Total number of records.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Total number of records.
     * 
     * @return Total number of records.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * Total number of records.
     * 
     * @param count
     *        Total number of records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * Server sync count for this dataset.
     * 
     * @param datasetSyncCount
     *        Server sync count for this dataset.
     */

    public void setDatasetSyncCount(Long datasetSyncCount) {
        this.datasetSyncCount = datasetSyncCount;
    }

    /**
     * Server sync count for this dataset.
     * 
     * @return Server sync count for this dataset.
     */

    public Long getDatasetSyncCount() {
        return this.datasetSyncCount;
    }

    /**
     * Server sync count for this dataset.
     * 
     * @param datasetSyncCount
     *        Server sync count for this dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withDatasetSyncCount(Long datasetSyncCount) {
        setDatasetSyncCount(datasetSyncCount);
        return this;
    }

    /**
     * The user/device that made the last change to this record.
     * 
     * @param lastModifiedBy
     *        The user/device that made the last change to this record.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * The user/device that made the last change to this record.
     * 
     * @return The user/device that made the last change to this record.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * The user/device that made the last change to this record.
     * 
     * @param lastModifiedBy
     *        The user/device that made the last change to this record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * Names of merged datasets.
     * 
     * @return Names of merged datasets.
     */

    public java.util.List<String> getMergedDatasetNames() {
        if (mergedDatasetNames == null) {
            mergedDatasetNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return mergedDatasetNames;
    }

    /**
     * Names of merged datasets.
     * 
     * @param mergedDatasetNames
     *        Names of merged datasets.
     */

    public void setMergedDatasetNames(java.util.Collection<String> mergedDatasetNames) {
        if (mergedDatasetNames == null) {
            this.mergedDatasetNames = null;
            return;
        }

        this.mergedDatasetNames = new com.amazonaws.internal.SdkInternalList<String>(mergedDatasetNames);
    }

    /**
     * Names of merged datasets.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMergedDatasetNames(java.util.Collection)} or {@link #withMergedDatasetNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param mergedDatasetNames
     *        Names of merged datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withMergedDatasetNames(String... mergedDatasetNames) {
        if (this.mergedDatasetNames == null) {
            setMergedDatasetNames(new com.amazonaws.internal.SdkInternalList<String>(mergedDatasetNames.length));
        }
        for (String ele : mergedDatasetNames) {
            this.mergedDatasetNames.add(ele);
        }
        return this;
    }

    /**
     * Names of merged datasets.
     * 
     * @param mergedDatasetNames
     *        Names of merged datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withMergedDatasetNames(java.util.Collection<String> mergedDatasetNames) {
        setMergedDatasetNames(mergedDatasetNames);
        return this;
    }

    /**
     * Indicates whether the dataset exists.
     * 
     * @param datasetExists
     *        Indicates whether the dataset exists.
     */

    public void setDatasetExists(Boolean datasetExists) {
        this.datasetExists = datasetExists;
    }

    /**
     * Indicates whether the dataset exists.
     * 
     * @return Indicates whether the dataset exists.
     */

    public Boolean getDatasetExists() {
        return this.datasetExists;
    }

    /**
     * Indicates whether the dataset exists.
     * 
     * @param datasetExists
     *        Indicates whether the dataset exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withDatasetExists(Boolean datasetExists) {
        setDatasetExists(datasetExists);
        return this;
    }

    /**
     * Indicates whether the dataset exists.
     * 
     * @return Indicates whether the dataset exists.
     */

    public Boolean isDatasetExists() {
        return this.datasetExists;
    }

    /**
     * A boolean value specifying whether to delete the dataset locally.
     * 
     * @param datasetDeletedAfterRequestedSyncCount
     *        A boolean value specifying whether to delete the dataset locally.
     */

    public void setDatasetDeletedAfterRequestedSyncCount(Boolean datasetDeletedAfterRequestedSyncCount) {
        this.datasetDeletedAfterRequestedSyncCount = datasetDeletedAfterRequestedSyncCount;
    }

    /**
     * A boolean value specifying whether to delete the dataset locally.
     * 
     * @return A boolean value specifying whether to delete the dataset locally.
     */

    public Boolean getDatasetDeletedAfterRequestedSyncCount() {
        return this.datasetDeletedAfterRequestedSyncCount;
    }

    /**
     * A boolean value specifying whether to delete the dataset locally.
     * 
     * @param datasetDeletedAfterRequestedSyncCount
     *        A boolean value specifying whether to delete the dataset locally.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withDatasetDeletedAfterRequestedSyncCount(Boolean datasetDeletedAfterRequestedSyncCount) {
        setDatasetDeletedAfterRequestedSyncCount(datasetDeletedAfterRequestedSyncCount);
        return this;
    }

    /**
     * A boolean value specifying whether to delete the dataset locally.
     * 
     * @return A boolean value specifying whether to delete the dataset locally.
     */

    public Boolean isDatasetDeletedAfterRequestedSyncCount() {
        return this.datasetDeletedAfterRequestedSyncCount;
    }

    /**
     * A token containing a session ID, identity ID, and expiration.
     * 
     * @param syncSessionToken
     *        A token containing a session ID, identity ID, and expiration.
     */

    public void setSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
    }

    /**
     * A token containing a session ID, identity ID, and expiration.
     * 
     * @return A token containing a session ID, identity ID, and expiration.
     */

    public String getSyncSessionToken() {
        return this.syncSessionToken;
    }

    /**
     * A token containing a session ID, identity ID, and expiration.
     * 
     * @param syncSessionToken
     *        A token containing a session ID, identity ID, and expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsResult withSyncSessionToken(String syncSessionToken) {
        setSyncSessionToken(syncSessionToken);
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
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getDatasetSyncCount() != null)
            sb.append("DatasetSyncCount: ").append(getDatasetSyncCount()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getMergedDatasetNames() != null)
            sb.append("MergedDatasetNames: ").append(getMergedDatasetNames()).append(",");
        if (getDatasetExists() != null)
            sb.append("DatasetExists: ").append(getDatasetExists()).append(",");
        if (getDatasetDeletedAfterRequestedSyncCount() != null)
            sb.append("DatasetDeletedAfterRequestedSyncCount: ").append(getDatasetDeletedAfterRequestedSyncCount()).append(",");
        if (getSyncSessionToken() != null)
            sb.append("SyncSessionToken: ").append(getSyncSessionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecordsResult == false)
            return false;
        ListRecordsResult other = (ListRecordsResult) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getDatasetSyncCount() == null ^ this.getDatasetSyncCount() == null)
            return false;
        if (other.getDatasetSyncCount() != null && other.getDatasetSyncCount().equals(this.getDatasetSyncCount()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getMergedDatasetNames() == null ^ this.getMergedDatasetNames() == null)
            return false;
        if (other.getMergedDatasetNames() != null && other.getMergedDatasetNames().equals(this.getMergedDatasetNames()) == false)
            return false;
        if (other.getDatasetExists() == null ^ this.getDatasetExists() == null)
            return false;
        if (other.getDatasetExists() != null && other.getDatasetExists().equals(this.getDatasetExists()) == false)
            return false;
        if (other.getDatasetDeletedAfterRequestedSyncCount() == null ^ this.getDatasetDeletedAfterRequestedSyncCount() == null)
            return false;
        if (other.getDatasetDeletedAfterRequestedSyncCount() != null
                && other.getDatasetDeletedAfterRequestedSyncCount().equals(this.getDatasetDeletedAfterRequestedSyncCount()) == false)
            return false;
        if (other.getSyncSessionToken() == null ^ this.getSyncSessionToken() == null)
            return false;
        if (other.getSyncSessionToken() != null && other.getSyncSessionToken().equals(this.getSyncSessionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getDatasetSyncCount() == null) ? 0 : getDatasetSyncCount().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getMergedDatasetNames() == null) ? 0 : getMergedDatasetNames().hashCode());
        hashCode = prime * hashCode + ((getDatasetExists() == null) ? 0 : getDatasetExists().hashCode());
        hashCode = prime * hashCode + ((getDatasetDeletedAfterRequestedSyncCount() == null) ? 0 : getDatasetDeletedAfterRequestedSyncCount().hashCode());
        hashCode = prime * hashCode + ((getSyncSessionToken() == null) ? 0 : getSyncSessionToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecordsResult clone() {
        try {
            return (ListRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

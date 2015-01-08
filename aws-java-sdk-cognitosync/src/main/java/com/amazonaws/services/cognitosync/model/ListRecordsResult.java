/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * Returned for a successful ListRecordsRequest.
 * </p>
 */
public class ListRecordsResult implements Serializable {

    /**
     * A list of all records.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Record> records;

    /**
     * A pagination token for obtaining the next page of results.
     */
    private String nextToken;

    /**
     * Total number of records.
     */
    private Integer count;

    /**
     * Server sync count for this dataset.
     */
    private Long datasetSyncCount;

    /**
     * The user/device that made the last change to this record.
     */
    private String lastModifiedBy;

    /**
     * Names of merged datasets.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> mergedDatasetNames;

    /**
     * Indicates whether the dataset exists.
     */
    private Boolean datasetExists;

    /**
     * A boolean value specifying whether to delete the dataset locally.
     */
    private Boolean datasetDeletedAfterRequestedSyncCount;

    /**
     * A token containing a session ID, identity ID, and expiration.
     */
    private String syncSessionToken;

    /**
     * A list of all records.
     *
     * @return A list of all records.
     */
    public java.util.List<Record> getRecords() {
        if (records == null) {
              records = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>();
              records.setAutoConstruct(true);
        }
        return records;
    }
    
    /**
     * A list of all records.
     *
     * @param records A list of all records.
     */
    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
        recordsCopy.addAll(records);
        this.records = recordsCopy;
    }
    
    /**
     * A list of all records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param records A list of all records.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withRecords(Record... records) {
        if (getRecords() == null) setRecords(new java.util.ArrayList<Record>(records.length));
        for (Record value : records) {
            getRecords().add(value);
        }
        return this;
    }
    
    /**
     * A list of all records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param records A list of all records.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
            recordsCopy.addAll(records);
            this.records = recordsCopy;
        }

        return this;
    }

    /**
     * A pagination token for obtaining the next page of results.
     *
     * @return A pagination token for obtaining the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A pagination token for obtaining the next page of results.
     *
     * @param nextToken A pagination token for obtaining the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A pagination token for obtaining the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A pagination token for obtaining the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Total number of records.
     *
     * @return Total number of records.
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * Total number of records.
     *
     * @param count Total number of records.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * Total number of records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count Total number of records.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Server sync count for this dataset.
     *
     * @return Server sync count for this dataset.
     */
    public Long getDatasetSyncCount() {
        return datasetSyncCount;
    }
    
    /**
     * Server sync count for this dataset.
     *
     * @param datasetSyncCount Server sync count for this dataset.
     */
    public void setDatasetSyncCount(Long datasetSyncCount) {
        this.datasetSyncCount = datasetSyncCount;
    }
    
    /**
     * Server sync count for this dataset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datasetSyncCount Server sync count for this dataset.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withDatasetSyncCount(Long datasetSyncCount) {
        this.datasetSyncCount = datasetSyncCount;
        return this;
    }

    /**
     * The user/device that made the last change to this record.
     *
     * @return The user/device that made the last change to this record.
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }
    
    /**
     * The user/device that made the last change to this record.
     *
     * @param lastModifiedBy The user/device that made the last change to this record.
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    
    /**
     * The user/device that made the last change to this record.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedBy The user/device that made the last change to this record.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Names of merged datasets.
     *
     * @return Names of merged datasets.
     */
    public java.util.List<String> getMergedDatasetNames() {
        if (mergedDatasetNames == null) {
              mergedDatasetNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              mergedDatasetNames.setAutoConstruct(true);
        }
        return mergedDatasetNames;
    }
    
    /**
     * Names of merged datasets.
     *
     * @param mergedDatasetNames Names of merged datasets.
     */
    public void setMergedDatasetNames(java.util.Collection<String> mergedDatasetNames) {
        if (mergedDatasetNames == null) {
            this.mergedDatasetNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> mergedDatasetNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(mergedDatasetNames.size());
        mergedDatasetNamesCopy.addAll(mergedDatasetNames);
        this.mergedDatasetNames = mergedDatasetNamesCopy;
    }
    
    /**
     * Names of merged datasets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mergedDatasetNames Names of merged datasets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withMergedDatasetNames(String... mergedDatasetNames) {
        if (getMergedDatasetNames() == null) setMergedDatasetNames(new java.util.ArrayList<String>(mergedDatasetNames.length));
        for (String value : mergedDatasetNames) {
            getMergedDatasetNames().add(value);
        }
        return this;
    }
    
    /**
     * Names of merged datasets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mergedDatasetNames Names of merged datasets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withMergedDatasetNames(java.util.Collection<String> mergedDatasetNames) {
        if (mergedDatasetNames == null) {
            this.mergedDatasetNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> mergedDatasetNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(mergedDatasetNames.size());
            mergedDatasetNamesCopy.addAll(mergedDatasetNames);
            this.mergedDatasetNames = mergedDatasetNamesCopy;
        }

        return this;
    }

    /**
     * Indicates whether the dataset exists.
     *
     * @return Indicates whether the dataset exists.
     */
    public Boolean isDatasetExists() {
        return datasetExists;
    }
    
    /**
     * Indicates whether the dataset exists.
     *
     * @param datasetExists Indicates whether the dataset exists.
     */
    public void setDatasetExists(Boolean datasetExists) {
        this.datasetExists = datasetExists;
    }
    
    /**
     * Indicates whether the dataset exists.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datasetExists Indicates whether the dataset exists.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withDatasetExists(Boolean datasetExists) {
        this.datasetExists = datasetExists;
        return this;
    }

    /**
     * Indicates whether the dataset exists.
     *
     * @return Indicates whether the dataset exists.
     */
    public Boolean getDatasetExists() {
        return datasetExists;
    }

    /**
     * A boolean value specifying whether to delete the dataset locally.
     *
     * @return A boolean value specifying whether to delete the dataset locally.
     */
    public Boolean isDatasetDeletedAfterRequestedSyncCount() {
        return datasetDeletedAfterRequestedSyncCount;
    }
    
    /**
     * A boolean value specifying whether to delete the dataset locally.
     *
     * @param datasetDeletedAfterRequestedSyncCount A boolean value specifying whether to delete the dataset locally.
     */
    public void setDatasetDeletedAfterRequestedSyncCount(Boolean datasetDeletedAfterRequestedSyncCount) {
        this.datasetDeletedAfterRequestedSyncCount = datasetDeletedAfterRequestedSyncCount;
    }
    
    /**
     * A boolean value specifying whether to delete the dataset locally.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datasetDeletedAfterRequestedSyncCount A boolean value specifying whether to delete the dataset locally.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withDatasetDeletedAfterRequestedSyncCount(Boolean datasetDeletedAfterRequestedSyncCount) {
        this.datasetDeletedAfterRequestedSyncCount = datasetDeletedAfterRequestedSyncCount;
        return this;
    }

    /**
     * A boolean value specifying whether to delete the dataset locally.
     *
     * @return A boolean value specifying whether to delete the dataset locally.
     */
    public Boolean getDatasetDeletedAfterRequestedSyncCount() {
        return datasetDeletedAfterRequestedSyncCount;
    }

    /**
     * A token containing a session ID, identity ID, and expiration.
     *
     * @return A token containing a session ID, identity ID, and expiration.
     */
    public String getSyncSessionToken() {
        return syncSessionToken;
    }
    
    /**
     * A token containing a session ID, identity ID, and expiration.
     *
     * @param syncSessionToken A token containing a session ID, identity ID, and expiration.
     */
    public void setSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
    }
    
    /**
     * A token containing a session ID, identity ID, and expiration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param syncSessionToken A token containing a session ID, identity ID, and expiration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
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
        if (getRecords() != null) sb.append("Records: " + getRecords() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getCount() != null) sb.append("Count: " + getCount() + ",");
        if (getDatasetSyncCount() != null) sb.append("DatasetSyncCount: " + getDatasetSyncCount() + ",");
        if (getLastModifiedBy() != null) sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getMergedDatasetNames() != null) sb.append("MergedDatasetNames: " + getMergedDatasetNames() + ",");
        if (isDatasetExists() != null) sb.append("DatasetExists: " + isDatasetExists() + ",");
        if (isDatasetDeletedAfterRequestedSyncCount() != null) sb.append("DatasetDeletedAfterRequestedSyncCount: " + isDatasetDeletedAfterRequestedSyncCount() + ",");
        if (getSyncSessionToken() != null) sb.append("SyncSessionToken: " + getSyncSessionToken() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isDatasetExists() == null) ? 0 : isDatasetExists().hashCode()); 
        hashCode = prime * hashCode + ((isDatasetDeletedAfterRequestedSyncCount() == null) ? 0 : isDatasetDeletedAfterRequestedSyncCount().hashCode()); 
        hashCode = prime * hashCode + ((getSyncSessionToken() == null) ? 0 : getSyncSessionToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListRecordsResult == false) return false;
        ListRecordsResult other = (ListRecordsResult)obj;
        
        if (other.getRecords() == null ^ this.getRecords() == null) return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        if (other.getDatasetSyncCount() == null ^ this.getDatasetSyncCount() == null) return false;
        if (other.getDatasetSyncCount() != null && other.getDatasetSyncCount().equals(this.getDatasetSyncCount()) == false) return false; 
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null) return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false) return false; 
        if (other.getMergedDatasetNames() == null ^ this.getMergedDatasetNames() == null) return false;
        if (other.getMergedDatasetNames() != null && other.getMergedDatasetNames().equals(this.getMergedDatasetNames()) == false) return false; 
        if (other.isDatasetExists() == null ^ this.isDatasetExists() == null) return false;
        if (other.isDatasetExists() != null && other.isDatasetExists().equals(this.isDatasetExists()) == false) return false; 
        if (other.isDatasetDeletedAfterRequestedSyncCount() == null ^ this.isDatasetDeletedAfterRequestedSyncCount() == null) return false;
        if (other.isDatasetDeletedAfterRequestedSyncCount() != null && other.isDatasetDeletedAfterRequestedSyncCount().equals(this.isDatasetDeletedAfterRequestedSyncCount()) == false) return false; 
        if (other.getSyncSessionToken() == null ^ this.getSyncSessionToken() == null) return false;
        if (other.getSyncSessionToken() != null && other.getSyncSessionToken().equals(this.getSyncSessionToken()) == false) return false; 
        return true;
    }
    
}
    
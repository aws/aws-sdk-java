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
 * A collection of data for an identity pool. An identity pool can have
 * multiple datasets. A dataset is per identity and can be general or
 * associated with a particular entity in an application (like a saved
 * game). Datasets are automatically created if they don't exist. Data is
 * synced by dataset, and a dataset can hold up to 1MB of key-value
 * pairs.
 * </p>
 */
public class Dataset implements Serializable {

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     */
    private String datasetName;

    /**
     * Date on which the dataset was created.
     */
    private java.util.Date creationDate;

    /**
     * Date when the dataset was last modified.
     */
    private java.util.Date lastModifiedDate;

    /**
     * The device that made the last change to this dataset.
     */
    private String lastModifiedBy;

    /**
     * Total size in bytes of the records in this dataset.
     */
    private Long dataStorage;

    /**
     * Number of records in this dataset.
     */
    private Long numRecords;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @return A string of up to 128 characters. Allowed characters are a-z, A-Z,
     *         0-9, '_' (underscore), '-' (dash), and '.' (dot).
     */
    public String getDatasetName() {
        return datasetName;
    }
    
    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @param datasetName A string of up to 128 characters. Allowed characters are a-z, A-Z,
     *         0-9, '_' (underscore), '-' (dash), and '.' (dot).
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }
    
    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @param datasetName A string of up to 128 characters. Allowed characters are a-z, A-Z,
     *         0-9, '_' (underscore), '-' (dash), and '.' (dot).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * Date on which the dataset was created.
     *
     * @return Date on which the dataset was created.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * Date on which the dataset was created.
     *
     * @param creationDate Date on which the dataset was created.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * Date on which the dataset was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate Date on which the dataset was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Date when the dataset was last modified.
     *
     * @return Date when the dataset was last modified.
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    
    /**
     * Date when the dataset was last modified.
     *
     * @param lastModifiedDate Date when the dataset was last modified.
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    /**
     * Date when the dataset was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate Date when the dataset was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * The device that made the last change to this dataset.
     *
     * @return The device that made the last change to this dataset.
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }
    
    /**
     * The device that made the last change to this dataset.
     *
     * @param lastModifiedBy The device that made the last change to this dataset.
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    
    /**
     * The device that made the last change to this dataset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedBy The device that made the last change to this dataset.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Total size in bytes of the records in this dataset.
     *
     * @return Total size in bytes of the records in this dataset.
     */
    public Long getDataStorage() {
        return dataStorage;
    }
    
    /**
     * Total size in bytes of the records in this dataset.
     *
     * @param dataStorage Total size in bytes of the records in this dataset.
     */
    public void setDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
    }
    
    /**
     * Total size in bytes of the records in this dataset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataStorage Total size in bytes of the records in this dataset.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
        return this;
    }

    /**
     * Number of records in this dataset.
     *
     * @return Number of records in this dataset.
     */
    public Long getNumRecords() {
        return numRecords;
    }
    
    /**
     * Number of records in this dataset.
     *
     * @param numRecords Number of records in this dataset.
     */
    public void setNumRecords(Long numRecords) {
        this.numRecords = numRecords;
    }
    
    /**
     * Number of records in this dataset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numRecords Number of records in this dataset.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withNumRecords(Long numRecords) {
        this.numRecords = numRecords;
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
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getDatasetName() != null) sb.append("DatasetName: " + getDatasetName() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getLastModifiedBy() != null) sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getDataStorage() != null) sb.append("DataStorage: " + getDataStorage() + ",");
        if (getNumRecords() != null) sb.append("NumRecords: " + getNumRecords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode()); 
        hashCode = prime * hashCode + ((getDataStorage() == null) ? 0 : getDataStorage().hashCode()); 
        hashCode = prime * hashCode + ((getNumRecords() == null) ? 0 : getNumRecords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Dataset == false) return false;
        Dataset other = (Dataset)obj;
        
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getDatasetName() == null ^ this.getDatasetName() == null) return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false; 
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null) return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false) return false; 
        if (other.getDataStorage() == null ^ this.getDataStorage() == null) return false;
        if (other.getDataStorage() != null && other.getDataStorage().equals(this.getDataStorage()) == false) return false; 
        if (other.getNumRecords() == null ^ this.getNumRecords() == null) return false;
        if (other.getNumRecords() != null && other.getNumRecords().equals(this.getNumRecords()) == false) return false; 
        return true;
    }
    
}
    
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSetDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The size of the block on disk.
     * </p>
     */
    private Integer blocksize;
    /**
     * <p>
     * The timestamp when the data set was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String dataSetName;
    /**
     * <p>
     * The type of data set. The only supported value is VSAM.
     * </p>
     */
    private DatasetDetailOrgAttributes dataSetOrg;
    /**
     * <p>
     * The last time the data set was referenced.
     * </p>
     */
    private java.util.Date lastReferencedTime;
    /**
     * <p>
     * The last time the data set was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The location where the data set is stored.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The length of records in the data set.
     * </p>
     */
    private Integer recordLength;

    /**
     * <p>
     * The size of the block on disk.
     * </p>
     * 
     * @param blocksize
     *        The size of the block on disk.
     */

    public void setBlocksize(Integer blocksize) {
        this.blocksize = blocksize;
    }

    /**
     * <p>
     * The size of the block on disk.
     * </p>
     * 
     * @return The size of the block on disk.
     */

    public Integer getBlocksize() {
        return this.blocksize;
    }

    /**
     * <p>
     * The size of the block on disk.
     * </p>
     * 
     * @param blocksize
     *        The size of the block on disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsResult withBlocksize(Integer blocksize) {
        setBlocksize(blocksize);
        return this;
    }

    /**
     * <p>
     * The timestamp when the data set was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the data set was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the data set was created.
     * </p>
     * 
     * @return The timestamp when the data set was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the data set was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the data set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param dataSetName
     *        The name of the data set.
     */

    public void setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @return The name of the data set.
     */

    public String getDataSetName() {
        return this.dataSetName;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param dataSetName
     *        The name of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsResult withDataSetName(String dataSetName) {
        setDataSetName(dataSetName);
        return this;
    }

    /**
     * <p>
     * The type of data set. The only supported value is VSAM.
     * </p>
     * 
     * @param dataSetOrg
     *        The type of data set. The only supported value is VSAM.
     */

    public void setDataSetOrg(DatasetDetailOrgAttributes dataSetOrg) {
        this.dataSetOrg = dataSetOrg;
    }

    /**
     * <p>
     * The type of data set. The only supported value is VSAM.
     * </p>
     * 
     * @return The type of data set. The only supported value is VSAM.
     */

    public DatasetDetailOrgAttributes getDataSetOrg() {
        return this.dataSetOrg;
    }

    /**
     * <p>
     * The type of data set. The only supported value is VSAM.
     * </p>
     * 
     * @param dataSetOrg
     *        The type of data set. The only supported value is VSAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsResult withDataSetOrg(DatasetDetailOrgAttributes dataSetOrg) {
        setDataSetOrg(dataSetOrg);
        return this;
    }

    /**
     * <p>
     * The last time the data set was referenced.
     * </p>
     * 
     * @param lastReferencedTime
     *        The last time the data set was referenced.
     */

    public void setLastReferencedTime(java.util.Date lastReferencedTime) {
        this.lastReferencedTime = lastReferencedTime;
    }

    /**
     * <p>
     * The last time the data set was referenced.
     * </p>
     * 
     * @return The last time the data set was referenced.
     */

    public java.util.Date getLastReferencedTime() {
        return this.lastReferencedTime;
    }

    /**
     * <p>
     * The last time the data set was referenced.
     * </p>
     * 
     * @param lastReferencedTime
     *        The last time the data set was referenced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsResult withLastReferencedTime(java.util.Date lastReferencedTime) {
        setLastReferencedTime(lastReferencedTime);
        return this;
    }

    /**
     * <p>
     * The last time the data set was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time the data set was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time the data set was updated.
     * </p>
     * 
     * @return The last time the data set was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time the data set was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time the data set was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The location where the data set is stored.
     * </p>
     * 
     * @param location
     *        The location where the data set is stored.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location where the data set is stored.
     * </p>
     * 
     * @return The location where the data set is stored.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location where the data set is stored.
     * </p>
     * 
     * @param location
     *        The location where the data set is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The length of records in the data set.
     * </p>
     * 
     * @param recordLength
     *        The length of records in the data set.
     */

    public void setRecordLength(Integer recordLength) {
        this.recordLength = recordLength;
    }

    /**
     * <p>
     * The length of records in the data set.
     * </p>
     * 
     * @return The length of records in the data set.
     */

    public Integer getRecordLength() {
        return this.recordLength;
    }

    /**
     * <p>
     * The length of records in the data set.
     * </p>
     * 
     * @param recordLength
     *        The length of records in the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsResult withRecordLength(Integer recordLength) {
        setRecordLength(recordLength);
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
        if (getBlocksize() != null)
            sb.append("Blocksize: ").append(getBlocksize()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDataSetName() != null)
            sb.append("DataSetName: ").append(getDataSetName()).append(",");
        if (getDataSetOrg() != null)
            sb.append("DataSetOrg: ").append(getDataSetOrg()).append(",");
        if (getLastReferencedTime() != null)
            sb.append("LastReferencedTime: ").append(getLastReferencedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getRecordLength() != null)
            sb.append("RecordLength: ").append(getRecordLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataSetDetailsResult == false)
            return false;
        GetDataSetDetailsResult other = (GetDataSetDetailsResult) obj;
        if (other.getBlocksize() == null ^ this.getBlocksize() == null)
            return false;
        if (other.getBlocksize() != null && other.getBlocksize().equals(this.getBlocksize()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDataSetName() == null ^ this.getDataSetName() == null)
            return false;
        if (other.getDataSetName() != null && other.getDataSetName().equals(this.getDataSetName()) == false)
            return false;
        if (other.getDataSetOrg() == null ^ this.getDataSetOrg() == null)
            return false;
        if (other.getDataSetOrg() != null && other.getDataSetOrg().equals(this.getDataSetOrg()) == false)
            return false;
        if (other.getLastReferencedTime() == null ^ this.getLastReferencedTime() == null)
            return false;
        if (other.getLastReferencedTime() != null && other.getLastReferencedTime().equals(this.getLastReferencedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getRecordLength() == null ^ this.getRecordLength() == null)
            return false;
        if (other.getRecordLength() != null && other.getRecordLength().equals(this.getRecordLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlocksize() == null) ? 0 : getBlocksize().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDataSetName() == null) ? 0 : getDataSetName().hashCode());
        hashCode = prime * hashCode + ((getDataSetOrg() == null) ? 0 : getDataSetOrg().hashCode());
        hashCode = prime * hashCode + ((getLastReferencedTime() == null) ? 0 : getLastReferencedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getRecordLength() == null) ? 0 : getRecordLength().hashCode());
        return hashCode;
    }

    @Override
    public GetDataSetDetailsResult clone() {
        try {
            return (GetDataSetDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

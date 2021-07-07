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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeStorageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorageConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     */
    private String storageType;
    /**
     * <p>
     * Contains information about the storage destination.
     * </p>
     */
    private MultiLayerStorage multiLayerStorage;

    private ConfigurationStatus configurationStatus;
    /**
     * <p>
     * The date the storage configuration was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The type of storage that you specified for your data. The storage type can be one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and
     *        saves a copy of your raw data and metadata in an Amazon S3 object that you specified.
     *        </p>
     *        </li>
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of storage that you specified for your data. The storage type can be one of the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed
     *         database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and
     *         saves a copy of your raw data and metadata in an Amazon S3 object that you specified.
     *         </p>
     *         </li>
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The type of storage that you specified for your data. The storage type can be one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and
     *        saves a copy of your raw data and metadata in an Amazon S3 object that you specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public DescribeStorageConfigurationResult withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The type of storage that you specified for your data. The storage type can be one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and
     *        saves a copy of your raw data and metadata in an Amazon S3 object that you specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public DescribeStorageConfigurationResult withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the storage destination.
     * </p>
     * 
     * @param multiLayerStorage
     *        Contains information about the storage destination.
     */

    public void setMultiLayerStorage(MultiLayerStorage multiLayerStorage) {
        this.multiLayerStorage = multiLayerStorage;
    }

    /**
     * <p>
     * Contains information about the storage destination.
     * </p>
     * 
     * @return Contains information about the storage destination.
     */

    public MultiLayerStorage getMultiLayerStorage() {
        return this.multiLayerStorage;
    }

    /**
     * <p>
     * Contains information about the storage destination.
     * </p>
     * 
     * @param multiLayerStorage
     *        Contains information about the storage destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageConfigurationResult withMultiLayerStorage(MultiLayerStorage multiLayerStorage) {
        setMultiLayerStorage(multiLayerStorage);
        return this;
    }

    /**
     * @param configurationStatus
     */

    public void setConfigurationStatus(ConfigurationStatus configurationStatus) {
        this.configurationStatus = configurationStatus;
    }

    /**
     * @return
     */

    public ConfigurationStatus getConfigurationStatus() {
        return this.configurationStatus;
    }

    /**
     * @param configurationStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageConfigurationResult withConfigurationStatus(ConfigurationStatus configurationStatus) {
        setConfigurationStatus(configurationStatus);
        return this;
    }

    /**
     * <p>
     * The date the storage configuration was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the storage configuration was last updated, in Unix epoch time.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the storage configuration was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the storage configuration was last updated, in Unix epoch time.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date the storage configuration was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the storage configuration was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageConfigurationResult withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
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
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getMultiLayerStorage() != null)
            sb.append("MultiLayerStorage: ").append(getMultiLayerStorage()).append(",");
        if (getConfigurationStatus() != null)
            sb.append("ConfigurationStatus: ").append(getConfigurationStatus()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStorageConfigurationResult == false)
            return false;
        DescribeStorageConfigurationResult other = (DescribeStorageConfigurationResult) obj;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getMultiLayerStorage() == null ^ this.getMultiLayerStorage() == null)
            return false;
        if (other.getMultiLayerStorage() != null && other.getMultiLayerStorage().equals(this.getMultiLayerStorage()) == false)
            return false;
        if (other.getConfigurationStatus() == null ^ this.getConfigurationStatus() == null)
            return false;
        if (other.getConfigurationStatus() != null && other.getConfigurationStatus().equals(this.getConfigurationStatus()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getMultiLayerStorage() == null) ? 0 : getMultiLayerStorage().hashCode());
        hashCode = prime * hashCode + ((getConfigurationStatus() == null) ? 0 : getConfigurationStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorageConfigurationResult clone() {
        try {
            return (DescribeStorageConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

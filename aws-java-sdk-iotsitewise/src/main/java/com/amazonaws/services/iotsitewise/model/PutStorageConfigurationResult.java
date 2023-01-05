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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutStorageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutStorageConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The storage tier that you specified for your data. The <code>storageType</code> parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise saves your data into the hot tier. The hot tier is a
     * service-managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise saves your data in both the cold tier and the hot tier. The cold
     * tier is a customer-managed Amazon S3 bucket.
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
    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     */
    private String disassociatedDataStorage;

    private RetentionPeriod retentionPeriod;

    private ConfigurationStatus configurationStatus;

    /**
     * <p>
     * The storage tier that you specified for your data. The <code>storageType</code> parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise saves your data into the hot tier. The hot tier is a
     * service-managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise saves your data in both the cold tier and the hot tier. The cold
     * tier is a customer-managed Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The storage tier that you specified for your data. The <code>storageType</code> parameter can be one of
     *        the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise saves your data into the hot tier. The hot tier is a
     *        service-managed database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise saves your data in both the cold tier and the hot tier.
     *        The cold tier is a customer-managed Amazon S3 bucket.
     *        </p>
     *        </li>
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage tier that you specified for your data. The <code>storageType</code> parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise saves your data into the hot tier. The hot tier is a
     * service-managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise saves your data in both the cold tier and the hot tier. The cold
     * tier is a customer-managed Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The storage tier that you specified for your data. The <code>storageType</code> parameter can be one of
     *         the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise saves your data into the hot tier. The hot tier is a
     *         service-managed database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise saves your data in both the cold tier and the hot tier.
     *         The cold tier is a customer-managed Amazon S3 bucket.
     *         </p>
     *         </li>
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage tier that you specified for your data. The <code>storageType</code> parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise saves your data into the hot tier. The hot tier is a
     * service-managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise saves your data in both the cold tier and the hot tier. The cold
     * tier is a customer-managed Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The storage tier that you specified for your data. The <code>storageType</code> parameter can be one of
     *        the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise saves your data into the hot tier. The hot tier is a
     *        service-managed database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise saves your data in both the cold tier and the hot tier.
     *        The cold tier is a customer-managed Amazon S3 bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public PutStorageConfigurationResult withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The storage tier that you specified for your data. The <code>storageType</code> parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise saves your data into the hot tier. The hot tier is a
     * service-managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise saves your data in both the cold tier and the hot tier. The cold
     * tier is a customer-managed Amazon S3 bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The storage tier that you specified for your data. The <code>storageType</code> parameter can be one of
     *        the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise saves your data into the hot tier. The hot tier is a
     *        service-managed database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise saves your data in both the cold tier and the hot tier.
     *        The cold tier is a customer-managed Amazon S3 bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public PutStorageConfigurationResult withStorageType(StorageType storageType) {
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

    public PutStorageConfigurationResult withMultiLayerStorage(MultiLayerStorage multiLayerStorage) {
        setMultiLayerStorage(multiLayerStorage);
        return this;
    }

    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     * 
     * @param disassociatedDataStorage
     *        Contains the storage configuration for time series (data streams) that aren't associated with asset
     *        properties. The <code>disassociatedDataStorage</code> can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     *        </p>
     *        <important>
     *        <p>
     *        After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with
     *        asset properties.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the
     *        <i>IoT SiteWise User Guide</i>.
     * @see DisassociatedDataStorageState
     */

    public void setDisassociatedDataStorage(String disassociatedDataStorage) {
        this.disassociatedDataStorage = disassociatedDataStorage;
    }

    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     * 
     * @return Contains the storage configuration for time series (data streams) that aren't associated with asset
     *         properties. The <code>disassociatedDataStorage</code> can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     *         </p>
     *         <important>
     *         <p>
     *         After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated
     *         with asset properties.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in
     *         the <i>IoT SiteWise User Guide</i>.
     * @see DisassociatedDataStorageState
     */

    public String getDisassociatedDataStorage() {
        return this.disassociatedDataStorage;
    }

    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     * 
     * @param disassociatedDataStorage
     *        Contains the storage configuration for time series (data streams) that aren't associated with asset
     *        properties. The <code>disassociatedDataStorage</code> can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     *        </p>
     *        <important>
     *        <p>
     *        After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with
     *        asset properties.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the
     *        <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisassociatedDataStorageState
     */

    public PutStorageConfigurationResult withDisassociatedDataStorage(String disassociatedDataStorage) {
        setDisassociatedDataStorage(disassociatedDataStorage);
        return this;
    }

    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     * 
     * @param disassociatedDataStorage
     *        Contains the storage configuration for time series (data streams) that aren't associated with asset
     *        properties. The <code>disassociatedDataStorage</code> can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     *        </p>
     *        <important>
     *        <p>
     *        After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with
     *        asset properties.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the
     *        <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisassociatedDataStorageState
     */

    public PutStorageConfigurationResult withDisassociatedDataStorage(DisassociatedDataStorageState disassociatedDataStorage) {
        this.disassociatedDataStorage = disassociatedDataStorage.toString();
        return this;
    }

    /**
     * @param retentionPeriod
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * @return
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * @param retentionPeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStorageConfigurationResult withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
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

    public PutStorageConfigurationResult withConfigurationStatus(ConfigurationStatus configurationStatus) {
        setConfigurationStatus(configurationStatus);
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
        if (getDisassociatedDataStorage() != null)
            sb.append("DisassociatedDataStorage: ").append(getDisassociatedDataStorage()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getConfigurationStatus() != null)
            sb.append("ConfigurationStatus: ").append(getConfigurationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutStorageConfigurationResult == false)
            return false;
        PutStorageConfigurationResult other = (PutStorageConfigurationResult) obj;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getMultiLayerStorage() == null ^ this.getMultiLayerStorage() == null)
            return false;
        if (other.getMultiLayerStorage() != null && other.getMultiLayerStorage().equals(this.getMultiLayerStorage()) == false)
            return false;
        if (other.getDisassociatedDataStorage() == null ^ this.getDisassociatedDataStorage() == null)
            return false;
        if (other.getDisassociatedDataStorage() != null && other.getDisassociatedDataStorage().equals(this.getDisassociatedDataStorage()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getConfigurationStatus() == null ^ this.getConfigurationStatus() == null)
            return false;
        if (other.getConfigurationStatus() != null && other.getConfigurationStatus().equals(this.getConfigurationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getMultiLayerStorage() == null) ? 0 : getMultiLayerStorage().hashCode());
        hashCode = prime * hashCode + ((getDisassociatedDataStorage() == null) ? 0 : getDisassociatedDataStorage().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getConfigurationStatus() == null) ? 0 : getConfigurationStatus().hashCode());
        return hashCode;
    }

    @Override
    public PutStorageConfigurationResult clone() {
        try {
            return (PutStorageConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about an Amazon Web Services storage service that DataSync Discovery recommends for a resource in your
 * on-premises storage system.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
 * >Recommendations provided by DataSync Discovery</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/Recommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A recommended Amazon Web Services storage service that you can migrate data to based on information that DataSync
     * Discovery collects about your on-premises storage system.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * Information about how you can set up a recommended Amazon Web Services storage service.
     * </p>
     */
    private java.util.Map<String, String> storageConfiguration;
    /**
     * <p>
     * The estimated monthly cost of the recommended Amazon Web Services storage service.
     * </p>
     */
    private String estimatedMonthlyStorageCost;

    /**
     * <p>
     * A recommended Amazon Web Services storage service that you can migrate data to based on information that DataSync
     * Discovery collects about your on-premises storage system.
     * </p>
     * 
     * @param storageType
     *        A recommended Amazon Web Services storage service that you can migrate data to based on information that
     *        DataSync Discovery collects about your on-premises storage system.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * A recommended Amazon Web Services storage service that you can migrate data to based on information that DataSync
     * Discovery collects about your on-premises storage system.
     * </p>
     * 
     * @return A recommended Amazon Web Services storage service that you can migrate data to based on information that
     *         DataSync Discovery collects about your on-premises storage system.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * A recommended Amazon Web Services storage service that you can migrate data to based on information that DataSync
     * Discovery collects about your on-premises storage system.
     * </p>
     * 
     * @param storageType
     *        A recommended Amazon Web Services storage service that you can migrate data to based on information that
     *        DataSync Discovery collects about your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * Information about how you can set up a recommended Amazon Web Services storage service.
     * </p>
     * 
     * @return Information about how you can set up a recommended Amazon Web Services storage service.
     */

    public java.util.Map<String, String> getStorageConfiguration() {
        return storageConfiguration;
    }

    /**
     * <p>
     * Information about how you can set up a recommended Amazon Web Services storage service.
     * </p>
     * 
     * @param storageConfiguration
     *        Information about how you can set up a recommended Amazon Web Services storage service.
     */

    public void setStorageConfiguration(java.util.Map<String, String> storageConfiguration) {
        this.storageConfiguration = storageConfiguration;
    }

    /**
     * <p>
     * Information about how you can set up a recommended Amazon Web Services storage service.
     * </p>
     * 
     * @param storageConfiguration
     *        Information about how you can set up a recommended Amazon Web Services storage service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withStorageConfiguration(java.util.Map<String, String> storageConfiguration) {
        setStorageConfiguration(storageConfiguration);
        return this;
    }

    /**
     * Add a single StorageConfiguration entry
     *
     * @see Recommendation#withStorageConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation addStorageConfigurationEntry(String key, String value) {
        if (null == this.storageConfiguration) {
            this.storageConfiguration = new java.util.HashMap<String, String>();
        }
        if (this.storageConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.storageConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StorageConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation clearStorageConfigurationEntries() {
        this.storageConfiguration = null;
        return this;
    }

    /**
     * <p>
     * The estimated monthly cost of the recommended Amazon Web Services storage service.
     * </p>
     * 
     * @param estimatedMonthlyStorageCost
     *        The estimated monthly cost of the recommended Amazon Web Services storage service.
     */

    public void setEstimatedMonthlyStorageCost(String estimatedMonthlyStorageCost) {
        this.estimatedMonthlyStorageCost = estimatedMonthlyStorageCost;
    }

    /**
     * <p>
     * The estimated monthly cost of the recommended Amazon Web Services storage service.
     * </p>
     * 
     * @return The estimated monthly cost of the recommended Amazon Web Services storage service.
     */

    public String getEstimatedMonthlyStorageCost() {
        return this.estimatedMonthlyStorageCost;
    }

    /**
     * <p>
     * The estimated monthly cost of the recommended Amazon Web Services storage service.
     * </p>
     * 
     * @param estimatedMonthlyStorageCost
     *        The estimated monthly cost of the recommended Amazon Web Services storage service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withEstimatedMonthlyStorageCost(String estimatedMonthlyStorageCost) {
        setEstimatedMonthlyStorageCost(estimatedMonthlyStorageCost);
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
        if (getStorageConfiguration() != null)
            sb.append("StorageConfiguration: ").append(getStorageConfiguration()).append(",");
        if (getEstimatedMonthlyStorageCost() != null)
            sb.append("EstimatedMonthlyStorageCost: ").append(getEstimatedMonthlyStorageCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getStorageConfiguration() == null ^ this.getStorageConfiguration() == null)
            return false;
        if (other.getStorageConfiguration() != null && other.getStorageConfiguration().equals(this.getStorageConfiguration()) == false)
            return false;
        if (other.getEstimatedMonthlyStorageCost() == null ^ this.getEstimatedMonthlyStorageCost() == null)
            return false;
        if (other.getEstimatedMonthlyStorageCost() != null && other.getEstimatedMonthlyStorageCost().equals(this.getEstimatedMonthlyStorageCost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getStorageConfiguration() == null) ? 0 : getStorageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlyStorageCost() == null) ? 0 : getEstimatedMonthlyStorageCost().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.RecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

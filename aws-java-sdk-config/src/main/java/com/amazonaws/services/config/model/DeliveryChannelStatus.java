/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The status of a specified delivery channel.
 * </p>
 * <p>
 * Valid values: <code>Success</code> |
 * <code>Failure</code>
 * </p>
 */
public class DeliveryChannelStatus implements Serializable {

    /**
     * The name of the delivery channel.
     */
    private String name;

    /**
     * A list containing the status of the delivery of the snapshot to the
     * specified Amazon S3 bucket.
     */
    private ConfigExportDeliveryInfo configSnapshotDeliveryInfo;

    /**
     * A list that contains the status of the delivery of the configuration
     * history to the specified Amazon S3 bucket.
     */
    private ConfigExportDeliveryInfo configHistoryDeliveryInfo;

    /**
     * A list containing the status of the delivery of the configuration
     * stream notification to the specified Amazon SNS topic.
     */
    private ConfigStreamDeliveryInfo configStreamDeliveryInfo;

    /**
     * The name of the delivery channel.
     *
     * @return The name of the delivery channel.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the delivery channel.
     *
     * @param name The name of the delivery channel.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the delivery channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the delivery channel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeliveryChannelStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A list containing the status of the delivery of the snapshot to the
     * specified Amazon S3 bucket.
     *
     * @return A list containing the status of the delivery of the snapshot to the
     *         specified Amazon S3 bucket.
     */
    public ConfigExportDeliveryInfo getConfigSnapshotDeliveryInfo() {
        return configSnapshotDeliveryInfo;
    }
    
    /**
     * A list containing the status of the delivery of the snapshot to the
     * specified Amazon S3 bucket.
     *
     * @param configSnapshotDeliveryInfo A list containing the status of the delivery of the snapshot to the
     *         specified Amazon S3 bucket.
     */
    public void setConfigSnapshotDeliveryInfo(ConfigExportDeliveryInfo configSnapshotDeliveryInfo) {
        this.configSnapshotDeliveryInfo = configSnapshotDeliveryInfo;
    }
    
    /**
     * A list containing the status of the delivery of the snapshot to the
     * specified Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configSnapshotDeliveryInfo A list containing the status of the delivery of the snapshot to the
     *         specified Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeliveryChannelStatus withConfigSnapshotDeliveryInfo(ConfigExportDeliveryInfo configSnapshotDeliveryInfo) {
        this.configSnapshotDeliveryInfo = configSnapshotDeliveryInfo;
        return this;
    }

    /**
     * A list that contains the status of the delivery of the configuration
     * history to the specified Amazon S3 bucket.
     *
     * @return A list that contains the status of the delivery of the configuration
     *         history to the specified Amazon S3 bucket.
     */
    public ConfigExportDeliveryInfo getConfigHistoryDeliveryInfo() {
        return configHistoryDeliveryInfo;
    }
    
    /**
     * A list that contains the status of the delivery of the configuration
     * history to the specified Amazon S3 bucket.
     *
     * @param configHistoryDeliveryInfo A list that contains the status of the delivery of the configuration
     *         history to the specified Amazon S3 bucket.
     */
    public void setConfigHistoryDeliveryInfo(ConfigExportDeliveryInfo configHistoryDeliveryInfo) {
        this.configHistoryDeliveryInfo = configHistoryDeliveryInfo;
    }
    
    /**
     * A list that contains the status of the delivery of the configuration
     * history to the specified Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configHistoryDeliveryInfo A list that contains the status of the delivery of the configuration
     *         history to the specified Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeliveryChannelStatus withConfigHistoryDeliveryInfo(ConfigExportDeliveryInfo configHistoryDeliveryInfo) {
        this.configHistoryDeliveryInfo = configHistoryDeliveryInfo;
        return this;
    }

    /**
     * A list containing the status of the delivery of the configuration
     * stream notification to the specified Amazon SNS topic.
     *
     * @return A list containing the status of the delivery of the configuration
     *         stream notification to the specified Amazon SNS topic.
     */
    public ConfigStreamDeliveryInfo getConfigStreamDeliveryInfo() {
        return configStreamDeliveryInfo;
    }
    
    /**
     * A list containing the status of the delivery of the configuration
     * stream notification to the specified Amazon SNS topic.
     *
     * @param configStreamDeliveryInfo A list containing the status of the delivery of the configuration
     *         stream notification to the specified Amazon SNS topic.
     */
    public void setConfigStreamDeliveryInfo(ConfigStreamDeliveryInfo configStreamDeliveryInfo) {
        this.configStreamDeliveryInfo = configStreamDeliveryInfo;
    }
    
    /**
     * A list containing the status of the delivery of the configuration
     * stream notification to the specified Amazon SNS topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configStreamDeliveryInfo A list containing the status of the delivery of the configuration
     *         stream notification to the specified Amazon SNS topic.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeliveryChannelStatus withConfigStreamDeliveryInfo(ConfigStreamDeliveryInfo configStreamDeliveryInfo) {
        this.configStreamDeliveryInfo = configStreamDeliveryInfo;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getConfigSnapshotDeliveryInfo() != null) sb.append("ConfigSnapshotDeliveryInfo: " + getConfigSnapshotDeliveryInfo() + ",");
        if (getConfigHistoryDeliveryInfo() != null) sb.append("ConfigHistoryDeliveryInfo: " + getConfigHistoryDeliveryInfo() + ",");
        if (getConfigStreamDeliveryInfo() != null) sb.append("ConfigStreamDeliveryInfo: " + getConfigStreamDeliveryInfo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getConfigSnapshotDeliveryInfo() == null) ? 0 : getConfigSnapshotDeliveryInfo().hashCode()); 
        hashCode = prime * hashCode + ((getConfigHistoryDeliveryInfo() == null) ? 0 : getConfigHistoryDeliveryInfo().hashCode()); 
        hashCode = prime * hashCode + ((getConfigStreamDeliveryInfo() == null) ? 0 : getConfigStreamDeliveryInfo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeliveryChannelStatus == false) return false;
        DeliveryChannelStatus other = (DeliveryChannelStatus)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getConfigSnapshotDeliveryInfo() == null ^ this.getConfigSnapshotDeliveryInfo() == null) return false;
        if (other.getConfigSnapshotDeliveryInfo() != null && other.getConfigSnapshotDeliveryInfo().equals(this.getConfigSnapshotDeliveryInfo()) == false) return false; 
        if (other.getConfigHistoryDeliveryInfo() == null ^ this.getConfigHistoryDeliveryInfo() == null) return false;
        if (other.getConfigHistoryDeliveryInfo() != null && other.getConfigHistoryDeliveryInfo().equals(this.getConfigHistoryDeliveryInfo()) == false) return false; 
        if (other.getConfigStreamDeliveryInfo() == null ^ this.getConfigStreamDeliveryInfo() == null) return false;
        if (other.getConfigStreamDeliveryInfo() != null && other.getConfigStreamDeliveryInfo().equals(this.getConfigStreamDeliveryInfo()) == false) return false; 
        return true;
    }
    
}
    
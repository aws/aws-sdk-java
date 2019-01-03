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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of a specified delivery channel.
 * </p>
 * <p>
 * Valid values: <code>Success</code> | <code>Failure</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeliveryChannelStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryChannelStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the delivery channel.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
     * </p>
     */
    private ConfigExportDeliveryInfo configSnapshotDeliveryInfo;
    /**
     * <p>
     * A list that contains the status of the delivery of the configuration history to the specified Amazon S3 bucket.
     * </p>
     */
    private ConfigExportDeliveryInfo configHistoryDeliveryInfo;
    /**
     * <p>
     * A list containing the status of the delivery of the configuration stream notification to the specified Amazon SNS
     * topic.
     * </p>
     */
    private ConfigStreamDeliveryInfo configStreamDeliveryInfo;

    /**
     * <p>
     * The name of the delivery channel.
     * </p>
     * 
     * @param name
     *        The name of the delivery channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the delivery channel.
     * </p>
     * 
     * @return The name of the delivery channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the delivery channel.
     * </p>
     * 
     * @param name
     *        The name of the delivery channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryChannelStatus withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
     * </p>
     * 
     * @param configSnapshotDeliveryInfo
     *        A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
     */

    public void setConfigSnapshotDeliveryInfo(ConfigExportDeliveryInfo configSnapshotDeliveryInfo) {
        this.configSnapshotDeliveryInfo = configSnapshotDeliveryInfo;
    }

    /**
     * <p>
     * A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
     * </p>
     * 
     * @return A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
     */

    public ConfigExportDeliveryInfo getConfigSnapshotDeliveryInfo() {
        return this.configSnapshotDeliveryInfo;
    }

    /**
     * <p>
     * A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
     * </p>
     * 
     * @param configSnapshotDeliveryInfo
     *        A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryChannelStatus withConfigSnapshotDeliveryInfo(ConfigExportDeliveryInfo configSnapshotDeliveryInfo) {
        setConfigSnapshotDeliveryInfo(configSnapshotDeliveryInfo);
        return this;
    }

    /**
     * <p>
     * A list that contains the status of the delivery of the configuration history to the specified Amazon S3 bucket.
     * </p>
     * 
     * @param configHistoryDeliveryInfo
     *        A list that contains the status of the delivery of the configuration history to the specified Amazon S3
     *        bucket.
     */

    public void setConfigHistoryDeliveryInfo(ConfigExportDeliveryInfo configHistoryDeliveryInfo) {
        this.configHistoryDeliveryInfo = configHistoryDeliveryInfo;
    }

    /**
     * <p>
     * A list that contains the status of the delivery of the configuration history to the specified Amazon S3 bucket.
     * </p>
     * 
     * @return A list that contains the status of the delivery of the configuration history to the specified Amazon S3
     *         bucket.
     */

    public ConfigExportDeliveryInfo getConfigHistoryDeliveryInfo() {
        return this.configHistoryDeliveryInfo;
    }

    /**
     * <p>
     * A list that contains the status of the delivery of the configuration history to the specified Amazon S3 bucket.
     * </p>
     * 
     * @param configHistoryDeliveryInfo
     *        A list that contains the status of the delivery of the configuration history to the specified Amazon S3
     *        bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryChannelStatus withConfigHistoryDeliveryInfo(ConfigExportDeliveryInfo configHistoryDeliveryInfo) {
        setConfigHistoryDeliveryInfo(configHistoryDeliveryInfo);
        return this;
    }

    /**
     * <p>
     * A list containing the status of the delivery of the configuration stream notification to the specified Amazon SNS
     * topic.
     * </p>
     * 
     * @param configStreamDeliveryInfo
     *        A list containing the status of the delivery of the configuration stream notification to the specified
     *        Amazon SNS topic.
     */

    public void setConfigStreamDeliveryInfo(ConfigStreamDeliveryInfo configStreamDeliveryInfo) {
        this.configStreamDeliveryInfo = configStreamDeliveryInfo;
    }

    /**
     * <p>
     * A list containing the status of the delivery of the configuration stream notification to the specified Amazon SNS
     * topic.
     * </p>
     * 
     * @return A list containing the status of the delivery of the configuration stream notification to the specified
     *         Amazon SNS topic.
     */

    public ConfigStreamDeliveryInfo getConfigStreamDeliveryInfo() {
        return this.configStreamDeliveryInfo;
    }

    /**
     * <p>
     * A list containing the status of the delivery of the configuration stream notification to the specified Amazon SNS
     * topic.
     * </p>
     * 
     * @param configStreamDeliveryInfo
     *        A list containing the status of the delivery of the configuration stream notification to the specified
     *        Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryChannelStatus withConfigStreamDeliveryInfo(ConfigStreamDeliveryInfo configStreamDeliveryInfo) {
        setConfigStreamDeliveryInfo(configStreamDeliveryInfo);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfigSnapshotDeliveryInfo() != null)
            sb.append("ConfigSnapshotDeliveryInfo: ").append(getConfigSnapshotDeliveryInfo()).append(",");
        if (getConfigHistoryDeliveryInfo() != null)
            sb.append("ConfigHistoryDeliveryInfo: ").append(getConfigHistoryDeliveryInfo()).append(",");
        if (getConfigStreamDeliveryInfo() != null)
            sb.append("ConfigStreamDeliveryInfo: ").append(getConfigStreamDeliveryInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryChannelStatus == false)
            return false;
        DeliveryChannelStatus other = (DeliveryChannelStatus) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfigSnapshotDeliveryInfo() == null ^ this.getConfigSnapshotDeliveryInfo() == null)
            return false;
        if (other.getConfigSnapshotDeliveryInfo() != null && other.getConfigSnapshotDeliveryInfo().equals(this.getConfigSnapshotDeliveryInfo()) == false)
            return false;
        if (other.getConfigHistoryDeliveryInfo() == null ^ this.getConfigHistoryDeliveryInfo() == null)
            return false;
        if (other.getConfigHistoryDeliveryInfo() != null && other.getConfigHistoryDeliveryInfo().equals(this.getConfigHistoryDeliveryInfo()) == false)
            return false;
        if (other.getConfigStreamDeliveryInfo() == null ^ this.getConfigStreamDeliveryInfo() == null)
            return false;
        if (other.getConfigStreamDeliveryInfo() != null && other.getConfigStreamDeliveryInfo().equals(this.getConfigStreamDeliveryInfo()) == false)
            return false;
        return true;
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
    public DeliveryChannelStatus clone() {
        try {
            return (DeliveryChannelStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.DeliveryChannelStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

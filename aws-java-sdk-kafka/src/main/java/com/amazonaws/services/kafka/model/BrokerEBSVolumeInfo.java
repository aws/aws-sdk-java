/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Specifies the EBS volume upgrade information. The broker identifier must be set to the keyword ALL. This means the
 * changes apply to all the brokers in the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/BrokerEBSVolumeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerEBSVolumeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the broker to update.
     * </p>
     */
    private String kafkaBrokerNodeId;
    /**
     * <p>
     * Size of the EBS volume to update.
     * </p>
     */
    private Integer volumeSizeGB;

    /**
     * <p>
     * The ID of the broker to update.
     * </p>
     * 
     * @param kafkaBrokerNodeId
     *        <p>
     *        The ID of the broker to update.
     *        </p>
     */

    public void setKafkaBrokerNodeId(String kafkaBrokerNodeId) {
        this.kafkaBrokerNodeId = kafkaBrokerNodeId;
    }

    /**
     * <p>
     * The ID of the broker to update.
     * </p>
     * 
     * @return <p>
     *         The ID of the broker to update.
     *         </p>
     */

    public String getKafkaBrokerNodeId() {
        return this.kafkaBrokerNodeId;
    }

    /**
     * <p>
     * The ID of the broker to update.
     * </p>
     * 
     * @param kafkaBrokerNodeId
     *        <p>
     *        The ID of the broker to update.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerEBSVolumeInfo withKafkaBrokerNodeId(String kafkaBrokerNodeId) {
        setKafkaBrokerNodeId(kafkaBrokerNodeId);
        return this;
    }

    /**
     * <p>
     * Size of the EBS volume to update.
     * </p>
     * 
     * @param volumeSizeGB
     *        <p>
     *        Size of the EBS volume to update.
     *        </p>
     */

    public void setVolumeSizeGB(Integer volumeSizeGB) {
        this.volumeSizeGB = volumeSizeGB;
    }

    /**
     * <p>
     * Size of the EBS volume to update.
     * </p>
     * 
     * @return <p>
     *         Size of the EBS volume to update.
     *         </p>
     */

    public Integer getVolumeSizeGB() {
        return this.volumeSizeGB;
    }

    /**
     * <p>
     * Size of the EBS volume to update.
     * </p>
     * 
     * @param volumeSizeGB
     *        <p>
     *        Size of the EBS volume to update.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerEBSVolumeInfo withVolumeSizeGB(Integer volumeSizeGB) {
        setVolumeSizeGB(volumeSizeGB);
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
        if (getKafkaBrokerNodeId() != null)
            sb.append("KafkaBrokerNodeId: ").append(getKafkaBrokerNodeId()).append(",");
        if (getVolumeSizeGB() != null)
            sb.append("VolumeSizeGB: ").append(getVolumeSizeGB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerEBSVolumeInfo == false)
            return false;
        BrokerEBSVolumeInfo other = (BrokerEBSVolumeInfo) obj;
        if (other.getKafkaBrokerNodeId() == null ^ this.getKafkaBrokerNodeId() == null)
            return false;
        if (other.getKafkaBrokerNodeId() != null && other.getKafkaBrokerNodeId().equals(this.getKafkaBrokerNodeId()) == false)
            return false;
        if (other.getVolumeSizeGB() == null ^ this.getVolumeSizeGB() == null)
            return false;
        if (other.getVolumeSizeGB() != null && other.getVolumeSizeGB().equals(this.getVolumeSizeGB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKafkaBrokerNodeId() == null) ? 0 : getKafkaBrokerNodeId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeGB() == null) ? 0 : getVolumeSizeGB().hashCode());
        return hashCode;
    }

    @Override
    public BrokerEBSVolumeInfo clone() {
        try {
            return (BrokerEBSVolumeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.BrokerEBSVolumeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

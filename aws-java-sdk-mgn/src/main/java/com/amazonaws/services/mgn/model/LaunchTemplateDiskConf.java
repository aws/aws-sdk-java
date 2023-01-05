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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Launch template disk configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/LaunchTemplateDiskConf" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateDiskConf implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Launch template disk iops configuration.
     * </p>
     */
    private Long iops;
    /**
     * <p>
     * Launch template disk throughput configuration.
     * </p>
     */
    private Long throughput;
    /**
     * <p>
     * Launch template disk volume type configuration.
     * </p>
     */
    private String volumeType;

    /**
     * <p>
     * Launch template disk iops configuration.
     * </p>
     * 
     * @param iops
     *        Launch template disk iops configuration.
     */

    public void setIops(Long iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Launch template disk iops configuration.
     * </p>
     * 
     * @return Launch template disk iops configuration.
     */

    public Long getIops() {
        return this.iops;
    }

    /**
     * <p>
     * Launch template disk iops configuration.
     * </p>
     * 
     * @param iops
     *        Launch template disk iops configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateDiskConf withIops(Long iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Launch template disk throughput configuration.
     * </p>
     * 
     * @param throughput
     *        Launch template disk throughput configuration.
     */

    public void setThroughput(Long throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * Launch template disk throughput configuration.
     * </p>
     * 
     * @return Launch template disk throughput configuration.
     */

    public Long getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * Launch template disk throughput configuration.
     * </p>
     * 
     * @param throughput
     *        Launch template disk throughput configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateDiskConf withThroughput(Long throughput) {
        setThroughput(throughput);
        return this;
    }

    /**
     * <p>
     * Launch template disk volume type configuration.
     * </p>
     * 
     * @param volumeType
     *        Launch template disk volume type configuration.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * Launch template disk volume type configuration.
     * </p>
     * 
     * @return Launch template disk volume type configuration.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * Launch template disk volume type configuration.
     * </p>
     * 
     * @param volumeType
     *        Launch template disk volume type configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public LaunchTemplateDiskConf withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * Launch template disk volume type configuration.
     * </p>
     * 
     * @param volumeType
     *        Launch template disk volume type configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public LaunchTemplateDiskConf withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
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
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateDiskConf == false)
            return false;
        LaunchTemplateDiskConf other = (LaunchTemplateDiskConf) obj;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateDiskConf clone() {
        try {
            return (LaunchTemplateDiskConf) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.LaunchTemplateDiskConfMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

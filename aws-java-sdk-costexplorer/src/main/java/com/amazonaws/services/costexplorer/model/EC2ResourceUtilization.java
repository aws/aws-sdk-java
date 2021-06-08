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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Utilization metrics of the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/EC2ResourceUtilization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2ResourceUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum observed or expected CPU utilization of the instance.
     * </p>
     */
    private String maxCpuUtilizationPercentage;
    /**
     * <p>
     * Maximum observed or expected memory utilization of the instance.
     * </p>
     */
    private String maxMemoryUtilizationPercentage;
    /**
     * <p>
     * Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
     * </p>
     */
    private String maxStorageUtilizationPercentage;
    /**
     * <p>
     * The EBS field that contains a list of EBS metrics associated with the current instance.
     * </p>
     */
    private EBSResourceUtilization eBSResourceUtilization;
    /**
     * <p>
     * The field that contains a list of disk (local storage) metrics associated with the current instance.
     * </p>
     */
    private DiskResourceUtilization diskResourceUtilization;
    /**
     * <p>
     * The network field that contains a list of network metrics associated with the current instance.
     * </p>
     */
    private NetworkResourceUtilization networkResourceUtilization;

    /**
     * <p>
     * Maximum observed or expected CPU utilization of the instance.
     * </p>
     * 
     * @param maxCpuUtilizationPercentage
     *        Maximum observed or expected CPU utilization of the instance.
     */

    public void setMaxCpuUtilizationPercentage(String maxCpuUtilizationPercentage) {
        this.maxCpuUtilizationPercentage = maxCpuUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected CPU utilization of the instance.
     * </p>
     * 
     * @return Maximum observed or expected CPU utilization of the instance.
     */

    public String getMaxCpuUtilizationPercentage() {
        return this.maxCpuUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected CPU utilization of the instance.
     * </p>
     * 
     * @param maxCpuUtilizationPercentage
     *        Maximum observed or expected CPU utilization of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceUtilization withMaxCpuUtilizationPercentage(String maxCpuUtilizationPercentage) {
        setMaxCpuUtilizationPercentage(maxCpuUtilizationPercentage);
        return this;
    }

    /**
     * <p>
     * Maximum observed or expected memory utilization of the instance.
     * </p>
     * 
     * @param maxMemoryUtilizationPercentage
     *        Maximum observed or expected memory utilization of the instance.
     */

    public void setMaxMemoryUtilizationPercentage(String maxMemoryUtilizationPercentage) {
        this.maxMemoryUtilizationPercentage = maxMemoryUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected memory utilization of the instance.
     * </p>
     * 
     * @return Maximum observed or expected memory utilization of the instance.
     */

    public String getMaxMemoryUtilizationPercentage() {
        return this.maxMemoryUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected memory utilization of the instance.
     * </p>
     * 
     * @param maxMemoryUtilizationPercentage
     *        Maximum observed or expected memory utilization of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceUtilization withMaxMemoryUtilizationPercentage(String maxMemoryUtilizationPercentage) {
        setMaxMemoryUtilizationPercentage(maxMemoryUtilizationPercentage);
        return this;
    }

    /**
     * <p>
     * Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
     * </p>
     * 
     * @param maxStorageUtilizationPercentage
     *        Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
     */

    public void setMaxStorageUtilizationPercentage(String maxStorageUtilizationPercentage) {
        this.maxStorageUtilizationPercentage = maxStorageUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
     * </p>
     * 
     * @return Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
     */

    public String getMaxStorageUtilizationPercentage() {
        return this.maxStorageUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
     * </p>
     * 
     * @param maxStorageUtilizationPercentage
     *        Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceUtilization withMaxStorageUtilizationPercentage(String maxStorageUtilizationPercentage) {
        setMaxStorageUtilizationPercentage(maxStorageUtilizationPercentage);
        return this;
    }

    /**
     * <p>
     * The EBS field that contains a list of EBS metrics associated with the current instance.
     * </p>
     * 
     * @param eBSResourceUtilization
     *        The EBS field that contains a list of EBS metrics associated with the current instance.
     */

    public void setEBSResourceUtilization(EBSResourceUtilization eBSResourceUtilization) {
        this.eBSResourceUtilization = eBSResourceUtilization;
    }

    /**
     * <p>
     * The EBS field that contains a list of EBS metrics associated with the current instance.
     * </p>
     * 
     * @return The EBS field that contains a list of EBS metrics associated with the current instance.
     */

    public EBSResourceUtilization getEBSResourceUtilization() {
        return this.eBSResourceUtilization;
    }

    /**
     * <p>
     * The EBS field that contains a list of EBS metrics associated with the current instance.
     * </p>
     * 
     * @param eBSResourceUtilization
     *        The EBS field that contains a list of EBS metrics associated with the current instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceUtilization withEBSResourceUtilization(EBSResourceUtilization eBSResourceUtilization) {
        setEBSResourceUtilization(eBSResourceUtilization);
        return this;
    }

    /**
     * <p>
     * The field that contains a list of disk (local storage) metrics associated with the current instance.
     * </p>
     * 
     * @param diskResourceUtilization
     *        The field that contains a list of disk (local storage) metrics associated with the current instance.
     */

    public void setDiskResourceUtilization(DiskResourceUtilization diskResourceUtilization) {
        this.diskResourceUtilization = diskResourceUtilization;
    }

    /**
     * <p>
     * The field that contains a list of disk (local storage) metrics associated with the current instance.
     * </p>
     * 
     * @return The field that contains a list of disk (local storage) metrics associated with the current instance.
     */

    public DiskResourceUtilization getDiskResourceUtilization() {
        return this.diskResourceUtilization;
    }

    /**
     * <p>
     * The field that contains a list of disk (local storage) metrics associated with the current instance.
     * </p>
     * 
     * @param diskResourceUtilization
     *        The field that contains a list of disk (local storage) metrics associated with the current instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceUtilization withDiskResourceUtilization(DiskResourceUtilization diskResourceUtilization) {
        setDiskResourceUtilization(diskResourceUtilization);
        return this;
    }

    /**
     * <p>
     * The network field that contains a list of network metrics associated with the current instance.
     * </p>
     * 
     * @param networkResourceUtilization
     *        The network field that contains a list of network metrics associated with the current instance.
     */

    public void setNetworkResourceUtilization(NetworkResourceUtilization networkResourceUtilization) {
        this.networkResourceUtilization = networkResourceUtilization;
    }

    /**
     * <p>
     * The network field that contains a list of network metrics associated with the current instance.
     * </p>
     * 
     * @return The network field that contains a list of network metrics associated with the current instance.
     */

    public NetworkResourceUtilization getNetworkResourceUtilization() {
        return this.networkResourceUtilization;
    }

    /**
     * <p>
     * The network field that contains a list of network metrics associated with the current instance.
     * </p>
     * 
     * @param networkResourceUtilization
     *        The network field that contains a list of network metrics associated with the current instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceUtilization withNetworkResourceUtilization(NetworkResourceUtilization networkResourceUtilization) {
        setNetworkResourceUtilization(networkResourceUtilization);
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
        if (getMaxCpuUtilizationPercentage() != null)
            sb.append("MaxCpuUtilizationPercentage: ").append(getMaxCpuUtilizationPercentage()).append(",");
        if (getMaxMemoryUtilizationPercentage() != null)
            sb.append("MaxMemoryUtilizationPercentage: ").append(getMaxMemoryUtilizationPercentage()).append(",");
        if (getMaxStorageUtilizationPercentage() != null)
            sb.append("MaxStorageUtilizationPercentage: ").append(getMaxStorageUtilizationPercentage()).append(",");
        if (getEBSResourceUtilization() != null)
            sb.append("EBSResourceUtilization: ").append(getEBSResourceUtilization()).append(",");
        if (getDiskResourceUtilization() != null)
            sb.append("DiskResourceUtilization: ").append(getDiskResourceUtilization()).append(",");
        if (getNetworkResourceUtilization() != null)
            sb.append("NetworkResourceUtilization: ").append(getNetworkResourceUtilization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2ResourceUtilization == false)
            return false;
        EC2ResourceUtilization other = (EC2ResourceUtilization) obj;
        if (other.getMaxCpuUtilizationPercentage() == null ^ this.getMaxCpuUtilizationPercentage() == null)
            return false;
        if (other.getMaxCpuUtilizationPercentage() != null && other.getMaxCpuUtilizationPercentage().equals(this.getMaxCpuUtilizationPercentage()) == false)
            return false;
        if (other.getMaxMemoryUtilizationPercentage() == null ^ this.getMaxMemoryUtilizationPercentage() == null)
            return false;
        if (other.getMaxMemoryUtilizationPercentage() != null
                && other.getMaxMemoryUtilizationPercentage().equals(this.getMaxMemoryUtilizationPercentage()) == false)
            return false;
        if (other.getMaxStorageUtilizationPercentage() == null ^ this.getMaxStorageUtilizationPercentage() == null)
            return false;
        if (other.getMaxStorageUtilizationPercentage() != null
                && other.getMaxStorageUtilizationPercentage().equals(this.getMaxStorageUtilizationPercentage()) == false)
            return false;
        if (other.getEBSResourceUtilization() == null ^ this.getEBSResourceUtilization() == null)
            return false;
        if (other.getEBSResourceUtilization() != null && other.getEBSResourceUtilization().equals(this.getEBSResourceUtilization()) == false)
            return false;
        if (other.getDiskResourceUtilization() == null ^ this.getDiskResourceUtilization() == null)
            return false;
        if (other.getDiskResourceUtilization() != null && other.getDiskResourceUtilization().equals(this.getDiskResourceUtilization()) == false)
            return false;
        if (other.getNetworkResourceUtilization() == null ^ this.getNetworkResourceUtilization() == null)
            return false;
        if (other.getNetworkResourceUtilization() != null && other.getNetworkResourceUtilization().equals(this.getNetworkResourceUtilization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxCpuUtilizationPercentage() == null) ? 0 : getMaxCpuUtilizationPercentage().hashCode());
        hashCode = prime * hashCode + ((getMaxMemoryUtilizationPercentage() == null) ? 0 : getMaxMemoryUtilizationPercentage().hashCode());
        hashCode = prime * hashCode + ((getMaxStorageUtilizationPercentage() == null) ? 0 : getMaxStorageUtilizationPercentage().hashCode());
        hashCode = prime * hashCode + ((getEBSResourceUtilization() == null) ? 0 : getEBSResourceUtilization().hashCode());
        hashCode = prime * hashCode + ((getDiskResourceUtilization() == null) ? 0 : getDiskResourceUtilization().hashCode());
        hashCode = prime * hashCode + ((getNetworkResourceUtilization() == null) ? 0 : getNetworkResourceUtilization().hashCode());
        return hashCode;
    }

    @Override
    public EC2ResourceUtilization clone() {
        try {
            return (EC2ResourceUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.EC2ResourceUtilizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

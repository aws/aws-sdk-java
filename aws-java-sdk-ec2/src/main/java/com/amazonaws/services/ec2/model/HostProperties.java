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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes properties of a Dedicated Host.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/HostProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostProperties implements Serializable, Cloneable {

    /**
     * <p>
     * The number of cores on the Dedicated Host.
     * </p>
     */
    private Integer cores;
    /**
     * <p>
     * The instance type size that the Dedicated Host supports (for example, <code>m3.medium</code>).
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of sockets on the Dedicated Host.
     * </p>
     */
    private Integer sockets;
    /**
     * <p>
     * The number of vCPUs on the Dedicated Host.
     * </p>
     */
    private Integer totalVCpus;

    /**
     * <p>
     * The number of cores on the Dedicated Host.
     * </p>
     * 
     * @param cores
     *        The number of cores on the Dedicated Host.
     */

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    /**
     * <p>
     * The number of cores on the Dedicated Host.
     * </p>
     * 
     * @return The number of cores on the Dedicated Host.
     */

    public Integer getCores() {
        return this.cores;
    }

    /**
     * <p>
     * The number of cores on the Dedicated Host.
     * </p>
     * 
     * @param cores
     *        The number of cores on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostProperties withCores(Integer cores) {
        setCores(cores);
        return this;
    }

    /**
     * <p>
     * The instance type size that the Dedicated Host supports (for example, <code>m3.medium</code>).
     * </p>
     * 
     * @param instanceType
     *        The instance type size that the Dedicated Host supports (for example, <code>m3.medium</code>).
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type size that the Dedicated Host supports (for example, <code>m3.medium</code>).
     * </p>
     * 
     * @return The instance type size that the Dedicated Host supports (for example, <code>m3.medium</code>).
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type size that the Dedicated Host supports (for example, <code>m3.medium</code>).
     * </p>
     * 
     * @param instanceType
     *        The instance type size that the Dedicated Host supports (for example, <code>m3.medium</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostProperties withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of sockets on the Dedicated Host.
     * </p>
     * 
     * @param sockets
     *        The number of sockets on the Dedicated Host.
     */

    public void setSockets(Integer sockets) {
        this.sockets = sockets;
    }

    /**
     * <p>
     * The number of sockets on the Dedicated Host.
     * </p>
     * 
     * @return The number of sockets on the Dedicated Host.
     */

    public Integer getSockets() {
        return this.sockets;
    }

    /**
     * <p>
     * The number of sockets on the Dedicated Host.
     * </p>
     * 
     * @param sockets
     *        The number of sockets on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostProperties withSockets(Integer sockets) {
        setSockets(sockets);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs on the Dedicated Host.
     * </p>
     * 
     * @param totalVCpus
     *        The number of vCPUs on the Dedicated Host.
     */

    public void setTotalVCpus(Integer totalVCpus) {
        this.totalVCpus = totalVCpus;
    }

    /**
     * <p>
     * The number of vCPUs on the Dedicated Host.
     * </p>
     * 
     * @return The number of vCPUs on the Dedicated Host.
     */

    public Integer getTotalVCpus() {
        return this.totalVCpus;
    }

    /**
     * <p>
     * The number of vCPUs on the Dedicated Host.
     * </p>
     * 
     * @param totalVCpus
     *        The number of vCPUs on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostProperties withTotalVCpus(Integer totalVCpus) {
        setTotalVCpus(totalVCpus);
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
        if (getCores() != null)
            sb.append("Cores: ").append(getCores()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getSockets() != null)
            sb.append("Sockets: ").append(getSockets()).append(",");
        if (getTotalVCpus() != null)
            sb.append("TotalVCpus: ").append(getTotalVCpus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostProperties == false)
            return false;
        HostProperties other = (HostProperties) obj;
        if (other.getCores() == null ^ this.getCores() == null)
            return false;
        if (other.getCores() != null && other.getCores().equals(this.getCores()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getSockets() == null ^ this.getSockets() == null)
            return false;
        if (other.getSockets() != null && other.getSockets().equals(this.getSockets()) == false)
            return false;
        if (other.getTotalVCpus() == null ^ this.getTotalVCpus() == null)
            return false;
        if (other.getTotalVCpus() != null && other.getTotalVCpus().equals(this.getTotalVCpus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCores() == null) ? 0 : getCores().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSockets() == null) ? 0 : getSockets().hashCode());
        hashCode = prime * hashCode + ((getTotalVCpus() == null) ? 0 : getTotalVCpus().hashCode());
        return hashCode;
    }

    @Override
    public HostProperties clone() {
        try {
            return (HostProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class HostProperties implements Serializable, Cloneable {

    /**
     * The number of sockets on the Dedicated host.
     */
    private Integer sockets;

    /**
     * The number of cores on the Dedicated host.
     */
    private Integer cores;

    /**
     * The number of vCPUs on the Dedicated host.
     */
    private Integer totalVCpus;

    /**
     * The instance type size that the Dedicated host supports (e.g.,
     * m3.medium).
     */
    private String instanceType;

    /**
     * The number of sockets on the Dedicated host.
     *
     * @return The number of sockets on the Dedicated host.
     */
    public Integer getSockets() {
        return sockets;
    }
    
    /**
     * The number of sockets on the Dedicated host.
     *
     * @param sockets The number of sockets on the Dedicated host.
     */
    public void setSockets(Integer sockets) {
        this.sockets = sockets;
    }
    
    /**
     * The number of sockets on the Dedicated host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sockets The number of sockets on the Dedicated host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HostProperties withSockets(Integer sockets) {
        this.sockets = sockets;
        return this;
    }

    /**
     * The number of cores on the Dedicated host.
     *
     * @return The number of cores on the Dedicated host.
     */
    public Integer getCores() {
        return cores;
    }
    
    /**
     * The number of cores on the Dedicated host.
     *
     * @param cores The number of cores on the Dedicated host.
     */
    public void setCores(Integer cores) {
        this.cores = cores;
    }
    
    /**
     * The number of cores on the Dedicated host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cores The number of cores on the Dedicated host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HostProperties withCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    /**
     * The number of vCPUs on the Dedicated host.
     *
     * @return The number of vCPUs on the Dedicated host.
     */
    public Integer getTotalVCpus() {
        return totalVCpus;
    }
    
    /**
     * The number of vCPUs on the Dedicated host.
     *
     * @param totalVCpus The number of vCPUs on the Dedicated host.
     */
    public void setTotalVCpus(Integer totalVCpus) {
        this.totalVCpus = totalVCpus;
    }
    
    /**
     * The number of vCPUs on the Dedicated host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param totalVCpus The number of vCPUs on the Dedicated host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HostProperties withTotalVCpus(Integer totalVCpus) {
        this.totalVCpus = totalVCpus;
        return this;
    }

    /**
     * The instance type size that the Dedicated host supports (e.g.,
     * m3.medium).
     *
     * @return The instance type size that the Dedicated host supports (e.g.,
     *         m3.medium).
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type size that the Dedicated host supports (e.g.,
     * m3.medium).
     *
     * @param instanceType The instance type size that the Dedicated host supports (e.g.,
     *         m3.medium).
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type size that the Dedicated host supports (e.g.,
     * m3.medium).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type size that the Dedicated host supports (e.g.,
     *         m3.medium).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HostProperties withInstanceType(String instanceType) {
        this.instanceType = instanceType;
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
        if (getSockets() != null) sb.append("Sockets: " + getSockets() + ",");
        if (getCores() != null) sb.append("Cores: " + getCores() + ",");
        if (getTotalVCpus() != null) sb.append("TotalVCpus: " + getTotalVCpus() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSockets() == null) ? 0 : getSockets().hashCode()); 
        hashCode = prime * hashCode + ((getCores() == null) ? 0 : getCores().hashCode()); 
        hashCode = prime * hashCode + ((getTotalVCpus() == null) ? 0 : getTotalVCpus().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HostProperties == false) return false;
        HostProperties other = (HostProperties)obj;
        
        if (other.getSockets() == null ^ this.getSockets() == null) return false;
        if (other.getSockets() != null && other.getSockets().equals(this.getSockets()) == false) return false; 
        if (other.getCores() == null ^ this.getCores() == null) return false;
        if (other.getCores() != null && other.getCores().equals(this.getCores()) == false) return false; 
        if (other.getTotalVCpus() == null ^ this.getTotalVCpus() == null) return false;
        if (other.getTotalVCpus() != null && other.getTotalVCpus().equals(this.getTotalVCpus()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        return true;
    }
    
    @Override
    public HostProperties clone() {
        try {
            return (HostProperties) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
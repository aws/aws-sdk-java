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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Source server properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/SourceProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Source Server CPUs.
     * </p>
     */
    private java.util.List<CPU> cpus;
    /**
     * <p>
     * Source Server disks.
     * </p>
     */
    private java.util.List<Disk> disks;
    /**
     * <p>
     * Source server identification hints.
     * </p>
     */
    private IdentificationHints identificationHints;
    /**
     * <p>
     * Source server last update date and time.
     * </p>
     */
    private String lastUpdatedDateTime;
    /**
     * <p>
     * Source server network interfaces.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;
    /**
     * <p>
     * Source server OS.
     * </p>
     */
    private OS os;
    /**
     * <p>
     * Source server RAM in bytes.
     * </p>
     */
    private Long ramBytes;
    /**
     * <p>
     * Source server recommended instance type.
     * </p>
     */
    private String recommendedInstanceType;

    /**
     * <p>
     * Source Server CPUs.
     * </p>
     * 
     * @return Source Server CPUs.
     */

    public java.util.List<CPU> getCpus() {
        return cpus;
    }

    /**
     * <p>
     * Source Server CPUs.
     * </p>
     * 
     * @param cpus
     *        Source Server CPUs.
     */

    public void setCpus(java.util.Collection<CPU> cpus) {
        if (cpus == null) {
            this.cpus = null;
            return;
        }

        this.cpus = new java.util.ArrayList<CPU>(cpus);
    }

    /**
     * <p>
     * Source Server CPUs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCpus(java.util.Collection)} or {@link #withCpus(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cpus
     *        Source Server CPUs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withCpus(CPU... cpus) {
        if (this.cpus == null) {
            setCpus(new java.util.ArrayList<CPU>(cpus.length));
        }
        for (CPU ele : cpus) {
            this.cpus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Source Server CPUs.
     * </p>
     * 
     * @param cpus
     *        Source Server CPUs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withCpus(java.util.Collection<CPU> cpus) {
        setCpus(cpus);
        return this;
    }

    /**
     * <p>
     * Source Server disks.
     * </p>
     * 
     * @return Source Server disks.
     */

    public java.util.List<Disk> getDisks() {
        return disks;
    }

    /**
     * <p>
     * Source Server disks.
     * </p>
     * 
     * @param disks
     *        Source Server disks.
     */

    public void setDisks(java.util.Collection<Disk> disks) {
        if (disks == null) {
            this.disks = null;
            return;
        }

        this.disks = new java.util.ArrayList<Disk>(disks);
    }

    /**
     * <p>
     * Source Server disks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisks(java.util.Collection)} or {@link #withDisks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param disks
     *        Source Server disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withDisks(Disk... disks) {
        if (this.disks == null) {
            setDisks(new java.util.ArrayList<Disk>(disks.length));
        }
        for (Disk ele : disks) {
            this.disks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Source Server disks.
     * </p>
     * 
     * @param disks
     *        Source Server disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withDisks(java.util.Collection<Disk> disks) {
        setDisks(disks);
        return this;
    }

    /**
     * <p>
     * Source server identification hints.
     * </p>
     * 
     * @param identificationHints
     *        Source server identification hints.
     */

    public void setIdentificationHints(IdentificationHints identificationHints) {
        this.identificationHints = identificationHints;
    }

    /**
     * <p>
     * Source server identification hints.
     * </p>
     * 
     * @return Source server identification hints.
     */

    public IdentificationHints getIdentificationHints() {
        return this.identificationHints;
    }

    /**
     * <p>
     * Source server identification hints.
     * </p>
     * 
     * @param identificationHints
     *        Source server identification hints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withIdentificationHints(IdentificationHints identificationHints) {
        setIdentificationHints(identificationHints);
        return this;
    }

    /**
     * <p>
     * Source server last update date and time.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        Source server last update date and time.
     */

    public void setLastUpdatedDateTime(String lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * Source server last update date and time.
     * </p>
     * 
     * @return Source server last update date and time.
     */

    public String getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * Source server last update date and time.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        Source server last update date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withLastUpdatedDateTime(String lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * Source server network interfaces.
     * </p>
     * 
     * @return Source server network interfaces.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * Source server network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        Source server network interfaces.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * Source server network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        Source server network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new java.util.ArrayList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Source server network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        Source server network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * Source server OS.
     * </p>
     * 
     * @param os
     *        Source server OS.
     */

    public void setOs(OS os) {
        this.os = os;
    }

    /**
     * <p>
     * Source server OS.
     * </p>
     * 
     * @return Source server OS.
     */

    public OS getOs() {
        return this.os;
    }

    /**
     * <p>
     * Source server OS.
     * </p>
     * 
     * @param os
     *        Source server OS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withOs(OS os) {
        setOs(os);
        return this;
    }

    /**
     * <p>
     * Source server RAM in bytes.
     * </p>
     * 
     * @param ramBytes
     *        Source server RAM in bytes.
     */

    public void setRamBytes(Long ramBytes) {
        this.ramBytes = ramBytes;
    }

    /**
     * <p>
     * Source server RAM in bytes.
     * </p>
     * 
     * @return Source server RAM in bytes.
     */

    public Long getRamBytes() {
        return this.ramBytes;
    }

    /**
     * <p>
     * Source server RAM in bytes.
     * </p>
     * 
     * @param ramBytes
     *        Source server RAM in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withRamBytes(Long ramBytes) {
        setRamBytes(ramBytes);
        return this;
    }

    /**
     * <p>
     * Source server recommended instance type.
     * </p>
     * 
     * @param recommendedInstanceType
     *        Source server recommended instance type.
     */

    public void setRecommendedInstanceType(String recommendedInstanceType) {
        this.recommendedInstanceType = recommendedInstanceType;
    }

    /**
     * <p>
     * Source server recommended instance type.
     * </p>
     * 
     * @return Source server recommended instance type.
     */

    public String getRecommendedInstanceType() {
        return this.recommendedInstanceType;
    }

    /**
     * <p>
     * Source server recommended instance type.
     * </p>
     * 
     * @param recommendedInstanceType
     *        Source server recommended instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceProperties withRecommendedInstanceType(String recommendedInstanceType) {
        setRecommendedInstanceType(recommendedInstanceType);
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
        if (getCpus() != null)
            sb.append("Cpus: ").append(getCpus()).append(",");
        if (getDisks() != null)
            sb.append("Disks: ").append(getDisks()).append(",");
        if (getIdentificationHints() != null)
            sb.append("IdentificationHints: ").append(getIdentificationHints()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getOs() != null)
            sb.append("Os: ").append(getOs()).append(",");
        if (getRamBytes() != null)
            sb.append("RamBytes: ").append(getRamBytes()).append(",");
        if (getRecommendedInstanceType() != null)
            sb.append("RecommendedInstanceType: ").append(getRecommendedInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceProperties == false)
            return false;
        SourceProperties other = (SourceProperties) obj;
        if (other.getCpus() == null ^ this.getCpus() == null)
            return false;
        if (other.getCpus() != null && other.getCpus().equals(this.getCpus()) == false)
            return false;
        if (other.getDisks() == null ^ this.getDisks() == null)
            return false;
        if (other.getDisks() != null && other.getDisks().equals(this.getDisks()) == false)
            return false;
        if (other.getIdentificationHints() == null ^ this.getIdentificationHints() == null)
            return false;
        if (other.getIdentificationHints() != null && other.getIdentificationHints().equals(this.getIdentificationHints()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getOs() == null ^ this.getOs() == null)
            return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false)
            return false;
        if (other.getRamBytes() == null ^ this.getRamBytes() == null)
            return false;
        if (other.getRamBytes() != null && other.getRamBytes().equals(this.getRamBytes()) == false)
            return false;
        if (other.getRecommendedInstanceType() == null ^ this.getRecommendedInstanceType() == null)
            return false;
        if (other.getRecommendedInstanceType() != null && other.getRecommendedInstanceType().equals(this.getRecommendedInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpus() == null) ? 0 : getCpus().hashCode());
        hashCode = prime * hashCode + ((getDisks() == null) ? 0 : getDisks().hashCode());
        hashCode = prime * hashCode + ((getIdentificationHints() == null) ? 0 : getIdentificationHints().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getOs() == null) ? 0 : getOs().hashCode());
        hashCode = prime * hashCode + ((getRamBytes() == null) ? 0 : getRamBytes().hashCode());
        hashCode = prime * hashCode + ((getRecommendedInstanceType() == null) ? 0 : getRecommendedInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public SourceProperties clone() {
        try {
            return (SourceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.SourcePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties of the Recovery Instance machine.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RecoveryInstanceProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstanceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of CPUs.
     * </p>
     */
    private java.util.List<CPU> cpus;
    /**
     * <p>
     * An array of disks.
     * </p>
     */
    private java.util.List<RecoveryInstanceDisk> disks;
    /**
     * <p>
     * Hints used to uniquely identify a machine.
     * </p>
     */
    private IdentificationHints identificationHints;
    /**
     * <p>
     * The date and time the Recovery Instance properties were last updated on.
     * </p>
     */
    private String lastUpdatedDateTime;
    /**
     * <p>
     * An array of network interfaces.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;
    /**
     * <p>
     * Operating system.
     * </p>
     */
    private OS os;
    /**
     * <p>
     * The amount of RAM in bytes.
     * </p>
     */
    private Long ramBytes;

    /**
     * <p>
     * An array of CPUs.
     * </p>
     * 
     * @return An array of CPUs.
     */

    public java.util.List<CPU> getCpus() {
        return cpus;
    }

    /**
     * <p>
     * An array of CPUs.
     * </p>
     * 
     * @param cpus
     *        An array of CPUs.
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
     * An array of CPUs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCpus(java.util.Collection)} or {@link #withCpus(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cpus
     *        An array of CPUs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withCpus(CPU... cpus) {
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
     * An array of CPUs.
     * </p>
     * 
     * @param cpus
     *        An array of CPUs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withCpus(java.util.Collection<CPU> cpus) {
        setCpus(cpus);
        return this;
    }

    /**
     * <p>
     * An array of disks.
     * </p>
     * 
     * @return An array of disks.
     */

    public java.util.List<RecoveryInstanceDisk> getDisks() {
        return disks;
    }

    /**
     * <p>
     * An array of disks.
     * </p>
     * 
     * @param disks
     *        An array of disks.
     */

    public void setDisks(java.util.Collection<RecoveryInstanceDisk> disks) {
        if (disks == null) {
            this.disks = null;
            return;
        }

        this.disks = new java.util.ArrayList<RecoveryInstanceDisk>(disks);
    }

    /**
     * <p>
     * An array of disks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisks(java.util.Collection)} or {@link #withDisks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param disks
     *        An array of disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withDisks(RecoveryInstanceDisk... disks) {
        if (this.disks == null) {
            setDisks(new java.util.ArrayList<RecoveryInstanceDisk>(disks.length));
        }
        for (RecoveryInstanceDisk ele : disks) {
            this.disks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of disks.
     * </p>
     * 
     * @param disks
     *        An array of disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withDisks(java.util.Collection<RecoveryInstanceDisk> disks) {
        setDisks(disks);
        return this;
    }

    /**
     * <p>
     * Hints used to uniquely identify a machine.
     * </p>
     * 
     * @param identificationHints
     *        Hints used to uniquely identify a machine.
     */

    public void setIdentificationHints(IdentificationHints identificationHints) {
        this.identificationHints = identificationHints;
    }

    /**
     * <p>
     * Hints used to uniquely identify a machine.
     * </p>
     * 
     * @return Hints used to uniquely identify a machine.
     */

    public IdentificationHints getIdentificationHints() {
        return this.identificationHints;
    }

    /**
     * <p>
     * Hints used to uniquely identify a machine.
     * </p>
     * 
     * @param identificationHints
     *        Hints used to uniquely identify a machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withIdentificationHints(IdentificationHints identificationHints) {
        setIdentificationHints(identificationHints);
        return this;
    }

    /**
     * <p>
     * The date and time the Recovery Instance properties were last updated on.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time the Recovery Instance properties were last updated on.
     */

    public void setLastUpdatedDateTime(String lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time the Recovery Instance properties were last updated on.
     * </p>
     * 
     * @return The date and time the Recovery Instance properties were last updated on.
     */

    public String getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time the Recovery Instance properties were last updated on.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time the Recovery Instance properties were last updated on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withLastUpdatedDateTime(String lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * An array of network interfaces.
     * </p>
     * 
     * @return An array of network interfaces.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * An array of network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        An array of network interfaces.
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
     * An array of network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        An array of network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withNetworkInterfaces(NetworkInterface... networkInterfaces) {
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
     * An array of network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        An array of network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * Operating system.
     * </p>
     * 
     * @param os
     *        Operating system.
     */

    public void setOs(OS os) {
        this.os = os;
    }

    /**
     * <p>
     * Operating system.
     * </p>
     * 
     * @return Operating system.
     */

    public OS getOs() {
        return this.os;
    }

    /**
     * <p>
     * Operating system.
     * </p>
     * 
     * @param os
     *        Operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withOs(OS os) {
        setOs(os);
        return this;
    }

    /**
     * <p>
     * The amount of RAM in bytes.
     * </p>
     * 
     * @param ramBytes
     *        The amount of RAM in bytes.
     */

    public void setRamBytes(Long ramBytes) {
        this.ramBytes = ramBytes;
    }

    /**
     * <p>
     * The amount of RAM in bytes.
     * </p>
     * 
     * @return The amount of RAM in bytes.
     */

    public Long getRamBytes() {
        return this.ramBytes;
    }

    /**
     * <p>
     * The amount of RAM in bytes.
     * </p>
     * 
     * @param ramBytes
     *        The amount of RAM in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceProperties withRamBytes(Long ramBytes) {
        setRamBytes(ramBytes);
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
            sb.append("RamBytes: ").append(getRamBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryInstanceProperties == false)
            return false;
        RecoveryInstanceProperties other = (RecoveryInstanceProperties) obj;
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
        return hashCode;
    }

    @Override
    public RecoveryInstanceProperties clone() {
        try {
            return (RecoveryInstanceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.RecoveryInstancePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

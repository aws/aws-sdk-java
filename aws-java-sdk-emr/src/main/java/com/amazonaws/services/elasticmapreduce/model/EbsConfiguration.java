/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * 
 */
public class EbsConfiguration implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<EbsBlockDeviceConfig> ebsBlockDeviceConfigs;

    private Boolean ebsOptimized;

    /**
     * @return
     */

    public java.util.List<EbsBlockDeviceConfig> getEbsBlockDeviceConfigs() {
        if (ebsBlockDeviceConfigs == null) {
            ebsBlockDeviceConfigs = new com.amazonaws.internal.SdkInternalList<EbsBlockDeviceConfig>();
        }
        return ebsBlockDeviceConfigs;
    }

    /**
     * @param ebsBlockDeviceConfigs
     */

    public void setEbsBlockDeviceConfigs(java.util.Collection<EbsBlockDeviceConfig> ebsBlockDeviceConfigs) {
        if (ebsBlockDeviceConfigs == null) {
            this.ebsBlockDeviceConfigs = null;
            return;
        }

        this.ebsBlockDeviceConfigs = new com.amazonaws.internal.SdkInternalList<EbsBlockDeviceConfig>(ebsBlockDeviceConfigs);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEbsBlockDeviceConfigs(java.util.Collection)} or
     * {@link #withEbsBlockDeviceConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ebsBlockDeviceConfigs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsConfiguration withEbsBlockDeviceConfigs(EbsBlockDeviceConfig... ebsBlockDeviceConfigs) {
        if (this.ebsBlockDeviceConfigs == null) {
            setEbsBlockDeviceConfigs(new com.amazonaws.internal.SdkInternalList<EbsBlockDeviceConfig>(ebsBlockDeviceConfigs.length));
        }
        for (EbsBlockDeviceConfig ele : ebsBlockDeviceConfigs) {
            this.ebsBlockDeviceConfigs.add(ele);
        }
        return this;
    }

    /**
     * @param ebsBlockDeviceConfigs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsConfiguration withEbsBlockDeviceConfigs(java.util.Collection<EbsBlockDeviceConfig> ebsBlockDeviceConfigs) {
        setEbsBlockDeviceConfigs(ebsBlockDeviceConfigs);
        return this;
    }

    /**
     * @param ebsOptimized
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * @return
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * @param ebsOptimized
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsConfiguration withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * @return
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEbsBlockDeviceConfigs() != null)
            sb.append("EbsBlockDeviceConfigs: " + getEbsBlockDeviceConfigs() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsConfiguration == false)
            return false;
        EbsConfiguration other = (EbsConfiguration) obj;
        if (other.getEbsBlockDeviceConfigs() == null ^ this.getEbsBlockDeviceConfigs() == null)
            return false;
        if (other.getEbsBlockDeviceConfigs() != null && other.getEbsBlockDeviceConfigs().equals(this.getEbsBlockDeviceConfigs()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEbsBlockDeviceConfigs() == null) ? 0 : getEbsBlockDeviceConfigs().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        return hashCode;
    }

    @Override
    public EbsConfiguration clone() {
        try {
            return (EbsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

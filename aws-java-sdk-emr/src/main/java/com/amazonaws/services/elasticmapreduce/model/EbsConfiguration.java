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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon EBS configuration of a cluster instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/EbsConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of Amazon EBS volume specifications attached to a cluster instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EbsBlockDeviceConfig> ebsBlockDeviceConfigs;
    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * An array of Amazon EBS volume specifications attached to a cluster instance.
     * </p>
     * 
     * @return An array of Amazon EBS volume specifications attached to a cluster instance.
     */

    public java.util.List<EbsBlockDeviceConfig> getEbsBlockDeviceConfigs() {
        if (ebsBlockDeviceConfigs == null) {
            ebsBlockDeviceConfigs = new com.amazonaws.internal.SdkInternalList<EbsBlockDeviceConfig>();
        }
        return ebsBlockDeviceConfigs;
    }

    /**
     * <p>
     * An array of Amazon EBS volume specifications attached to a cluster instance.
     * </p>
     * 
     * @param ebsBlockDeviceConfigs
     *        An array of Amazon EBS volume specifications attached to a cluster instance.
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
     * An array of Amazon EBS volume specifications attached to a cluster instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEbsBlockDeviceConfigs(java.util.Collection)} or
     * {@link #withEbsBlockDeviceConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ebsBlockDeviceConfigs
     *        An array of Amazon EBS volume specifications attached to a cluster instance.
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
     * <p>
     * An array of Amazon EBS volume specifications attached to a cluster instance.
     * </p>
     * 
     * @param ebsBlockDeviceConfigs
     *        An array of Amazon EBS volume specifications attached to a cluster instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsConfiguration withEbsBlockDeviceConfigs(java.util.Collection<EbsBlockDeviceConfig> ebsBlockDeviceConfigs) {
        setEbsBlockDeviceConfigs(ebsBlockDeviceConfigs);
        return this;
    }

    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether an Amazon EBS volume is EBS-optimized.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     * 
     * @return Indicates whether an Amazon EBS volume is EBS-optimized.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether an Amazon EBS volume is EBS-optimized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsConfiguration withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     * </p>
     * 
     * @return Indicates whether an Amazon EBS volume is EBS-optimized.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
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
        if (getEbsBlockDeviceConfigs() != null)
            sb.append("EbsBlockDeviceConfigs: ").append(getEbsBlockDeviceConfigs()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.EbsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

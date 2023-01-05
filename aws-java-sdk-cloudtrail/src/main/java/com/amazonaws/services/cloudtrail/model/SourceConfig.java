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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration information about the channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/SourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the channel applies to a single region or to all regions.
     * </p>
     */
    private Boolean applyToAllRegions;
    /**
     * <p>
     * The advanced event selectors that are configured for the channel.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdvancedEventSelector> advancedEventSelectors;

    /**
     * <p>
     * Specifies whether the channel applies to a single region or to all regions.
     * </p>
     * 
     * @param applyToAllRegions
     *        Specifies whether the channel applies to a single region or to all regions.
     */

    public void setApplyToAllRegions(Boolean applyToAllRegions) {
        this.applyToAllRegions = applyToAllRegions;
    }

    /**
     * <p>
     * Specifies whether the channel applies to a single region or to all regions.
     * </p>
     * 
     * @return Specifies whether the channel applies to a single region or to all regions.
     */

    public Boolean getApplyToAllRegions() {
        return this.applyToAllRegions;
    }

    /**
     * <p>
     * Specifies whether the channel applies to a single region or to all regions.
     * </p>
     * 
     * @param applyToAllRegions
     *        Specifies whether the channel applies to a single region or to all regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfig withApplyToAllRegions(Boolean applyToAllRegions) {
        setApplyToAllRegions(applyToAllRegions);
        return this;
    }

    /**
     * <p>
     * Specifies whether the channel applies to a single region or to all regions.
     * </p>
     * 
     * @return Specifies whether the channel applies to a single region or to all regions.
     */

    public Boolean isApplyToAllRegions() {
        return this.applyToAllRegions;
    }

    /**
     * <p>
     * The advanced event selectors that are configured for the channel.
     * </p>
     * 
     * @return The advanced event selectors that are configured for the channel.
     */

    public java.util.List<AdvancedEventSelector> getAdvancedEventSelectors() {
        if (advancedEventSelectors == null) {
            advancedEventSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>();
        }
        return advancedEventSelectors;
    }

    /**
     * <p>
     * The advanced event selectors that are configured for the channel.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that are configured for the channel.
     */

    public void setAdvancedEventSelectors(java.util.Collection<AdvancedEventSelector> advancedEventSelectors) {
        if (advancedEventSelectors == null) {
            this.advancedEventSelectors = null;
            return;
        }

        this.advancedEventSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>(advancedEventSelectors);
    }

    /**
     * <p>
     * The advanced event selectors that are configured for the channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvancedEventSelectors(java.util.Collection)} or
     * {@link #withAdvancedEventSelectors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that are configured for the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfig withAdvancedEventSelectors(AdvancedEventSelector... advancedEventSelectors) {
        if (this.advancedEventSelectors == null) {
            setAdvancedEventSelectors(new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>(advancedEventSelectors.length));
        }
        for (AdvancedEventSelector ele : advancedEventSelectors) {
            this.advancedEventSelectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The advanced event selectors that are configured for the channel.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that are configured for the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfig withAdvancedEventSelectors(java.util.Collection<AdvancedEventSelector> advancedEventSelectors) {
        setAdvancedEventSelectors(advancedEventSelectors);
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
        if (getApplyToAllRegions() != null)
            sb.append("ApplyToAllRegions: ").append(getApplyToAllRegions()).append(",");
        if (getAdvancedEventSelectors() != null)
            sb.append("AdvancedEventSelectors: ").append(getAdvancedEventSelectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceConfig == false)
            return false;
        SourceConfig other = (SourceConfig) obj;
        if (other.getApplyToAllRegions() == null ^ this.getApplyToAllRegions() == null)
            return false;
        if (other.getApplyToAllRegions() != null && other.getApplyToAllRegions().equals(this.getApplyToAllRegions()) == false)
            return false;
        if (other.getAdvancedEventSelectors() == null ^ this.getAdvancedEventSelectors() == null)
            return false;
        if (other.getAdvancedEventSelectors() != null && other.getAdvancedEventSelectors().equals(this.getAdvancedEventSelectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplyToAllRegions() == null) ? 0 : getApplyToAllRegions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedEventSelectors() == null) ? 0 : getAdvancedEventSelectors().hashCode());
        return hashCode;
    }

    @Override
    public SourceConfig clone() {
        try {
            return (SourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.SourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

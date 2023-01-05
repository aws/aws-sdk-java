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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of TCP flags and masks to inspect for.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSourceStatelessRuleMatchAttributesTcpFlags"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSourceStatelessRuleMatchAttributesTcpFlags implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the flags from the <code>Masks</code> setting that must be set in order for the packet to match. Flags
     * that are listed must be set. Flags that are not listed must not be set.
     * </p>
     */
    private java.util.List<String> flags;
    /**
     * <p>
     * The set of flags to consider in the inspection. If not specified, then all flags are inspected.
     * </p>
     */
    private java.util.List<String> masks;

    /**
     * <p>
     * Defines the flags from the <code>Masks</code> setting that must be set in order for the packet to match. Flags
     * that are listed must be set. Flags that are not listed must not be set.
     * </p>
     * 
     * @return Defines the flags from the <code>Masks</code> setting that must be set in order for the packet to match.
     *         Flags that are listed must be set. Flags that are not listed must not be set.
     */

    public java.util.List<String> getFlags() {
        return flags;
    }

    /**
     * <p>
     * Defines the flags from the <code>Masks</code> setting that must be set in order for the packet to match. Flags
     * that are listed must be set. Flags that are not listed must not be set.
     * </p>
     * 
     * @param flags
     *        Defines the flags from the <code>Masks</code> setting that must be set in order for the packet to match.
     *        Flags that are listed must be set. Flags that are not listed must not be set.
     */

    public void setFlags(java.util.Collection<String> flags) {
        if (flags == null) {
            this.flags = null;
            return;
        }

        this.flags = new java.util.ArrayList<String>(flags);
    }

    /**
     * <p>
     * Defines the flags from the <code>Masks</code> setting that must be set in order for the packet to match. Flags
     * that are listed must be set. Flags that are not listed must not be set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlags(java.util.Collection)} or {@link #withFlags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param flags
     *        Defines the flags from the <code>Masks</code> setting that must be set in order for the packet to match.
     *        Flags that are listed must be set. Flags that are not listed must not be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributesTcpFlags withFlags(String... flags) {
        if (this.flags == null) {
            setFlags(new java.util.ArrayList<String>(flags.length));
        }
        for (String ele : flags) {
            this.flags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the flags from the <code>Masks</code> setting that must be set in order for the packet to match. Flags
     * that are listed must be set. Flags that are not listed must not be set.
     * </p>
     * 
     * @param flags
     *        Defines the flags from the <code>Masks</code> setting that must be set in order for the packet to match.
     *        Flags that are listed must be set. Flags that are not listed must not be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributesTcpFlags withFlags(java.util.Collection<String> flags) {
        setFlags(flags);
        return this;
    }

    /**
     * <p>
     * The set of flags to consider in the inspection. If not specified, then all flags are inspected.
     * </p>
     * 
     * @return The set of flags to consider in the inspection. If not specified, then all flags are inspected.
     */

    public java.util.List<String> getMasks() {
        return masks;
    }

    /**
     * <p>
     * The set of flags to consider in the inspection. If not specified, then all flags are inspected.
     * </p>
     * 
     * @param masks
     *        The set of flags to consider in the inspection. If not specified, then all flags are inspected.
     */

    public void setMasks(java.util.Collection<String> masks) {
        if (masks == null) {
            this.masks = null;
            return;
        }

        this.masks = new java.util.ArrayList<String>(masks);
    }

    /**
     * <p>
     * The set of flags to consider in the inspection. If not specified, then all flags are inspected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMasks(java.util.Collection)} or {@link #withMasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param masks
     *        The set of flags to consider in the inspection. If not specified, then all flags are inspected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributesTcpFlags withMasks(String... masks) {
        if (this.masks == null) {
            setMasks(new java.util.ArrayList<String>(masks.length));
        }
        for (String ele : masks) {
            this.masks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of flags to consider in the inspection. If not specified, then all flags are inspected.
     * </p>
     * 
     * @param masks
     *        The set of flags to consider in the inspection. If not specified, then all flags are inspected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatelessRuleMatchAttributesTcpFlags withMasks(java.util.Collection<String> masks) {
        setMasks(masks);
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
        if (getFlags() != null)
            sb.append("Flags: ").append(getFlags()).append(",");
        if (getMasks() != null)
            sb.append("Masks: ").append(getMasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupSourceStatelessRuleMatchAttributesTcpFlags == false)
            return false;
        RuleGroupSourceStatelessRuleMatchAttributesTcpFlags other = (RuleGroupSourceStatelessRuleMatchAttributesTcpFlags) obj;
        if (other.getFlags() == null ^ this.getFlags() == null)
            return false;
        if (other.getFlags() != null && other.getFlags().equals(this.getFlags()) == false)
            return false;
        if (other.getMasks() == null ^ this.getMasks() == null)
            return false;
        if (other.getMasks() != null && other.getMasks().equals(this.getMasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlags() == null) ? 0 : getFlags().hashCode());
        hashCode = prime * hashCode + ((getMasks() == null) ? 0 : getMasks().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSourceStatelessRuleMatchAttributesTcpFlags clone() {
        try {
            return (RuleGroupSourceStatelessRuleMatchAttributesTcpFlags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

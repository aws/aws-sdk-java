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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * TCP flags and masks to inspect packets for, used in stateless rules <a>MatchAttributes</a> settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/TCPFlagField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TCPFlagField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags that must
     * not be set in order for the packet to match. This setting can only specify values that are also specified in the
     * <code>Masks</code> setting.
     * </p>
     * <p>
     * For the flags that are specified in the masks setting, the following must be true for the packet to match:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ones that are set in this flags setting must be set in the packet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ones that are not set in this flags setting must also not be set in the packet.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> flags;
    /**
     * <p>
     * The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this with no
     * setting.
     * </p>
     */
    private java.util.List<String> masks;

    /**
     * <p>
     * Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags that must
     * not be set in order for the packet to match. This setting can only specify values that are also specified in the
     * <code>Masks</code> setting.
     * </p>
     * <p>
     * For the flags that are specified in the masks setting, the following must be true for the packet to match:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ones that are set in this flags setting must be set in the packet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ones that are not set in this flags setting must also not be set in the packet.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags
     *         that must not be set in order for the packet to match. This setting can only specify values that are also
     *         specified in the <code>Masks</code> setting.</p>
     *         <p>
     *         For the flags that are specified in the masks setting, the following must be true for the packet to
     *         match:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The ones that are set in this flags setting must be set in the packet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ones that are not set in this flags setting must also not be set in the packet.
     *         </p>
     *         </li>
     * @see TCPFlag
     */

    public java.util.List<String> getFlags() {
        return flags;
    }

    /**
     * <p>
     * Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags that must
     * not be set in order for the packet to match. This setting can only specify values that are also specified in the
     * <code>Masks</code> setting.
     * </p>
     * <p>
     * For the flags that are specified in the masks setting, the following must be true for the packet to match:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ones that are set in this flags setting must be set in the packet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ones that are not set in this flags setting must also not be set in the packet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param flags
     *        Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags
     *        that must not be set in order for the packet to match. This setting can only specify values that are also
     *        specified in the <code>Masks</code> setting.</p>
     *        <p>
     *        For the flags that are specified in the masks setting, the following must be true for the packet to match:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The ones that are set in this flags setting must be set in the packet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ones that are not set in this flags setting must also not be set in the packet.
     *        </p>
     *        </li>
     * @see TCPFlag
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
     * Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags that must
     * not be set in order for the packet to match. This setting can only specify values that are also specified in the
     * <code>Masks</code> setting.
     * </p>
     * <p>
     * For the flags that are specified in the masks setting, the following must be true for the packet to match:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ones that are set in this flags setting must be set in the packet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ones that are not set in this flags setting must also not be set in the packet.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlags(java.util.Collection)} or {@link #withFlags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param flags
     *        Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags
     *        that must not be set in order for the packet to match. This setting can only specify values that are also
     *        specified in the <code>Masks</code> setting.</p>
     *        <p>
     *        For the flags that are specified in the masks setting, the following must be true for the packet to match:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The ones that are set in this flags setting must be set in the packet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ones that are not set in this flags setting must also not be set in the packet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TCPFlag
     */

    public TCPFlagField withFlags(String... flags) {
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
     * Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags that must
     * not be set in order for the packet to match. This setting can only specify values that are also specified in the
     * <code>Masks</code> setting.
     * </p>
     * <p>
     * For the flags that are specified in the masks setting, the following must be true for the packet to match:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ones that are set in this flags setting must be set in the packet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ones that are not set in this flags setting must also not be set in the packet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param flags
     *        Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags
     *        that must not be set in order for the packet to match. This setting can only specify values that are also
     *        specified in the <code>Masks</code> setting.</p>
     *        <p>
     *        For the flags that are specified in the masks setting, the following must be true for the packet to match:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The ones that are set in this flags setting must be set in the packet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ones that are not set in this flags setting must also not be set in the packet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TCPFlag
     */

    public TCPFlagField withFlags(java.util.Collection<String> flags) {
        setFlags(flags);
        return this;
    }

    /**
     * <p>
     * Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags that must
     * not be set in order for the packet to match. This setting can only specify values that are also specified in the
     * <code>Masks</code> setting.
     * </p>
     * <p>
     * For the flags that are specified in the masks setting, the following must be true for the packet to match:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ones that are set in this flags setting must be set in the packet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ones that are not set in this flags setting must also not be set in the packet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param flags
     *        Used in conjunction with the <code>Masks</code> setting to define the flags that must be set and flags
     *        that must not be set in order for the packet to match. This setting can only specify values that are also
     *        specified in the <code>Masks</code> setting.</p>
     *        <p>
     *        For the flags that are specified in the masks setting, the following must be true for the packet to match:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The ones that are set in this flags setting must be set in the packet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ones that are not set in this flags setting must also not be set in the packet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TCPFlag
     */

    public TCPFlagField withFlags(TCPFlag... flags) {
        java.util.ArrayList<String> flagsCopy = new java.util.ArrayList<String>(flags.length);
        for (TCPFlag value : flags) {
            flagsCopy.add(value.toString());
        }
        if (getFlags() == null) {
            setFlags(flagsCopy);
        } else {
            getFlags().addAll(flagsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this with no
     * setting.
     * </p>
     * 
     * @return The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this
     *         with no setting.
     * @see TCPFlag
     */

    public java.util.List<String> getMasks() {
        return masks;
    }

    /**
     * <p>
     * The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this with no
     * setting.
     * </p>
     * 
     * @param masks
     *        The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this
     *        with no setting.
     * @see TCPFlag
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
     * The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this with no
     * setting.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMasks(java.util.Collection)} or {@link #withMasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param masks
     *        The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this
     *        with no setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TCPFlag
     */

    public TCPFlagField withMasks(String... masks) {
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
     * The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this with no
     * setting.
     * </p>
     * 
     * @param masks
     *        The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this
     *        with no setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TCPFlag
     */

    public TCPFlagField withMasks(java.util.Collection<String> masks) {
        setMasks(masks);
        return this;
    }

    /**
     * <p>
     * The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this with no
     * setting.
     * </p>
     * 
     * @param masks
     *        The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this
     *        with no setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TCPFlag
     */

    public TCPFlagField withMasks(TCPFlag... masks) {
        java.util.ArrayList<String> masksCopy = new java.util.ArrayList<String>(masks.length);
        for (TCPFlag value : masks) {
            masksCopy.add(value.toString());
        }
        if (getMasks() == null) {
            setMasks(masksCopy);
        } else {
            getMasks().addAll(masksCopy);
        }
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

        if (obj instanceof TCPFlagField == false)
            return false;
        TCPFlagField other = (TCPFlagField) obj;
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
    public TCPFlagField clone() {
        try {
            return (TCPFlagField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.TCPFlagFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

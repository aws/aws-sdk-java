/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about overrides to an on-call rotation shift.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ShiftDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShiftDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was created. If
     * the override is deleted, these contacts are restored to the shift.
     * </p>
     */
    private java.util.List<String> overriddenContactIds;

    /**
     * <p>
     * The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was created. If
     * the override is deleted, these contacts are restored to the shift.
     * </p>
     * 
     * @return The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was
     *         created. If the override is deleted, these contacts are restored to the shift.
     */

    public java.util.List<String> getOverriddenContactIds() {
        return overriddenContactIds;
    }

    /**
     * <p>
     * The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was created. If
     * the override is deleted, these contacts are restored to the shift.
     * </p>
     * 
     * @param overriddenContactIds
     *        The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was
     *        created. If the override is deleted, these contacts are restored to the shift.
     */

    public void setOverriddenContactIds(java.util.Collection<String> overriddenContactIds) {
        if (overriddenContactIds == null) {
            this.overriddenContactIds = null;
            return;
        }

        this.overriddenContactIds = new java.util.ArrayList<String>(overriddenContactIds);
    }

    /**
     * <p>
     * The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was created. If
     * the override is deleted, these contacts are restored to the shift.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverriddenContactIds(java.util.Collection)} or {@link #withOverriddenContactIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param overriddenContactIds
     *        The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was
     *        created. If the override is deleted, these contacts are restored to the shift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShiftDetails withOverriddenContactIds(String... overriddenContactIds) {
        if (this.overriddenContactIds == null) {
            setOverriddenContactIds(new java.util.ArrayList<String>(overriddenContactIds.length));
        }
        for (String ele : overriddenContactIds) {
            this.overriddenContactIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was created. If
     * the override is deleted, these contacts are restored to the shift.
     * </p>
     * 
     * @param overriddenContactIds
     *        The Amazon Resources Names (ARNs) of the contacts who were replaced in a shift when an override was
     *        created. If the override is deleted, these contacts are restored to the shift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShiftDetails withOverriddenContactIds(java.util.Collection<String> overriddenContactIds) {
        setOverriddenContactIds(overriddenContactIds);
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
        if (getOverriddenContactIds() != null)
            sb.append("OverriddenContactIds: ").append(getOverriddenContactIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShiftDetails == false)
            return false;
        ShiftDetails other = (ShiftDetails) obj;
        if (other.getOverriddenContactIds() == null ^ this.getOverriddenContactIds() == null)
            return false;
        if (other.getOverriddenContactIds() != null && other.getOverriddenContactIds().equals(this.getOverriddenContactIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverriddenContactIds() == null) ? 0 : getOverriddenContactIds().hashCode());
        return hashCode;
    }

    @Override
    public ShiftDetails clone() {
        try {
            return (ShiftDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.ShiftDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

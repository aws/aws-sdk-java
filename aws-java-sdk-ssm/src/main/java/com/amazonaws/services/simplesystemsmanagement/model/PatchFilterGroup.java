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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of patch filters, typically used for approval rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PatchFilterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchFilterGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The set of patch filters that make up the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PatchFilter> patchFilters;

    /**
     * <p>
     * The set of patch filters that make up the group.
     * </p>
     * 
     * @return The set of patch filters that make up the group.
     */

    public java.util.List<PatchFilter> getPatchFilters() {
        if (patchFilters == null) {
            patchFilters = new com.amazonaws.internal.SdkInternalList<PatchFilter>();
        }
        return patchFilters;
    }

    /**
     * <p>
     * The set of patch filters that make up the group.
     * </p>
     * 
     * @param patchFilters
     *        The set of patch filters that make up the group.
     */

    public void setPatchFilters(java.util.Collection<PatchFilter> patchFilters) {
        if (patchFilters == null) {
            this.patchFilters = null;
            return;
        }

        this.patchFilters = new com.amazonaws.internal.SdkInternalList<PatchFilter>(patchFilters);
    }

    /**
     * <p>
     * The set of patch filters that make up the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPatchFilters(java.util.Collection)} or {@link #withPatchFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param patchFilters
     *        The set of patch filters that make up the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchFilterGroup withPatchFilters(PatchFilter... patchFilters) {
        if (this.patchFilters == null) {
            setPatchFilters(new com.amazonaws.internal.SdkInternalList<PatchFilter>(patchFilters.length));
        }
        for (PatchFilter ele : patchFilters) {
            this.patchFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of patch filters that make up the group.
     * </p>
     * 
     * @param patchFilters
     *        The set of patch filters that make up the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchFilterGroup withPatchFilters(java.util.Collection<PatchFilter> patchFilters) {
        setPatchFilters(patchFilters);
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
        if (getPatchFilters() != null)
            sb.append("PatchFilters: ").append(getPatchFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchFilterGroup == false)
            return false;
        PatchFilterGroup other = (PatchFilterGroup) obj;
        if (other.getPatchFilters() == null ^ this.getPatchFilters() == null)
            return false;
        if (other.getPatchFilters() != null && other.getPatchFilters().equals(this.getPatchFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatchFilters() == null) ? 0 : getPatchFilters().hashCode());
        return hashCode;
    }

    @Override
    public PatchFilterGroup clone() {
        try {
            return (PatchFilterGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchFilterGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

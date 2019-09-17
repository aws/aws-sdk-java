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
 * The EffectivePatch structure defines metadata about a patch along with the approval state of the patch in a
 * particular patch baseline. The approval state includes information about whether the patch is currently approved, due
 * to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/EffectivePatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectivePatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for
     * where more information can be obtained about the patch.
     * </p>
     */
    private Patch patch;
    /**
     * <p>
     * The status of the patch in a patch baseline. This includes information about whether the patch is currently
     * approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or
     * will be approved.
     * </p>
     */
    private PatchStatus patchStatus;

    /**
     * <p>
     * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for
     * where more information can be obtained about the patch.
     * </p>
     * 
     * @param patch
     *        Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL
     *        for where more information can be obtained about the patch.
     */

    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    /**
     * <p>
     * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for
     * where more information can be obtained about the patch.
     * </p>
     * 
     * @return Provides metadata for a patch, including information such as the KB ID, severity, classification and a
     *         URL for where more information can be obtained about the patch.
     */

    public Patch getPatch() {
        return this.patch;
    }

    /**
     * <p>
     * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for
     * where more information can be obtained about the patch.
     * </p>
     * 
     * @param patch
     *        Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL
     *        for where more information can be obtained about the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePatch withPatch(Patch patch) {
        setPatch(patch);
        return this;
    }

    /**
     * <p>
     * The status of the patch in a patch baseline. This includes information about whether the patch is currently
     * approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or
     * will be approved.
     * </p>
     * 
     * @param patchStatus
     *        The status of the patch in a patch baseline. This includes information about whether the patch is
     *        currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date
     *        the patch was or will be approved.
     */

    public void setPatchStatus(PatchStatus patchStatus) {
        this.patchStatus = patchStatus;
    }

    /**
     * <p>
     * The status of the patch in a patch baseline. This includes information about whether the patch is currently
     * approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or
     * will be approved.
     * </p>
     * 
     * @return The status of the patch in a patch baseline. This includes information about whether the patch is
     *         currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the
     *         date the patch was or will be approved.
     */

    public PatchStatus getPatchStatus() {
        return this.patchStatus;
    }

    /**
     * <p>
     * The status of the patch in a patch baseline. This includes information about whether the patch is currently
     * approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or
     * will be approved.
     * </p>
     * 
     * @param patchStatus
     *        The status of the patch in a patch baseline. This includes information about whether the patch is
     *        currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date
     *        the patch was or will be approved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePatch withPatchStatus(PatchStatus patchStatus) {
        setPatchStatus(patchStatus);
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
        if (getPatch() != null)
            sb.append("Patch: ").append(getPatch()).append(",");
        if (getPatchStatus() != null)
            sb.append("PatchStatus: ").append(getPatchStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EffectivePatch == false)
            return false;
        EffectivePatch other = (EffectivePatch) obj;
        if (other.getPatch() == null ^ this.getPatch() == null)
            return false;
        if (other.getPatch() != null && other.getPatch().equals(this.getPatch()) == false)
            return false;
        if (other.getPatchStatus() == null ^ this.getPatchStatus() == null)
            return false;
        if (other.getPatchStatus() != null && other.getPatchStatus().equals(this.getPatchStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatch() == null) ? 0 : getPatch().hashCode());
        hashCode = prime * hashCode + ((getPatchStatus() == null) ? 0 : getPatchStatus().hashCode());
        return hashCode;
    }

    @Override
    public EffectivePatch clone() {
        try {
            return (EffectivePatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.EffectivePatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

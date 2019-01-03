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
 * The mapping between a patch group and the patch baseline the patch group is registered with.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PatchGroupPatchBaselineMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchGroupPatchBaselineMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the patch group registered with the patch baseline.
     * </p>
     */
    private String patchGroup;
    /**
     * <p>
     * The patch baseline the patch group is registered with.
     * </p>
     */
    private PatchBaselineIdentity baselineIdentity;

    /**
     * <p>
     * The name of the patch group registered with the patch baseline.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group registered with the patch baseline.
     */

    public void setPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
    }

    /**
     * <p>
     * The name of the patch group registered with the patch baseline.
     * </p>
     * 
     * @return The name of the patch group registered with the patch baseline.
     */

    public String getPatchGroup() {
        return this.patchGroup;
    }

    /**
     * <p>
     * The name of the patch group registered with the patch baseline.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group registered with the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchGroupPatchBaselineMapping withPatchGroup(String patchGroup) {
        setPatchGroup(patchGroup);
        return this;
    }

    /**
     * <p>
     * The patch baseline the patch group is registered with.
     * </p>
     * 
     * @param baselineIdentity
     *        The patch baseline the patch group is registered with.
     */

    public void setBaselineIdentity(PatchBaselineIdentity baselineIdentity) {
        this.baselineIdentity = baselineIdentity;
    }

    /**
     * <p>
     * The patch baseline the patch group is registered with.
     * </p>
     * 
     * @return The patch baseline the patch group is registered with.
     */

    public PatchBaselineIdentity getBaselineIdentity() {
        return this.baselineIdentity;
    }

    /**
     * <p>
     * The patch baseline the patch group is registered with.
     * </p>
     * 
     * @param baselineIdentity
     *        The patch baseline the patch group is registered with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchGroupPatchBaselineMapping withBaselineIdentity(PatchBaselineIdentity baselineIdentity) {
        setBaselineIdentity(baselineIdentity);
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
        if (getPatchGroup() != null)
            sb.append("PatchGroup: ").append(getPatchGroup()).append(",");
        if (getBaselineIdentity() != null)
            sb.append("BaselineIdentity: ").append(getBaselineIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchGroupPatchBaselineMapping == false)
            return false;
        PatchGroupPatchBaselineMapping other = (PatchGroupPatchBaselineMapping) obj;
        if (other.getPatchGroup() == null ^ this.getPatchGroup() == null)
            return false;
        if (other.getPatchGroup() != null && other.getPatchGroup().equals(this.getPatchGroup()) == false)
            return false;
        if (other.getBaselineIdentity() == null ^ this.getBaselineIdentity() == null)
            return false;
        if (other.getBaselineIdentity() != null && other.getBaselineIdentity().equals(this.getBaselineIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatchGroup() == null) ? 0 : getPatchGroup().hashCode());
        hashCode = prime * hashCode + ((getBaselineIdentity() == null) ? 0 : getBaselineIdentity().hashCode());
        return hashCode;
    }

    @Override
    public PatchGroupPatchBaselineMapping clone() {
        try {
            return (PatchGroupPatchBaselineMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchGroupPatchBaselineMappingMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}

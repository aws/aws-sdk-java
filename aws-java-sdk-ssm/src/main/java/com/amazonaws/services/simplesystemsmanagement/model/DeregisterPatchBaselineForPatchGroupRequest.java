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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterPatchBaselineForPatchGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterPatchBaselineForPatchGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the patch baseline to deregister the patch group from.
     * </p>
     */
    private String baselineId;
    /**
     * <p>
     * The name of the patch group that should be deregistered from the patch baseline.
     * </p>
     */
    private String patchGroup;

    /**
     * <p>
     * The ID of the patch baseline to deregister the patch group from.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline to deregister the patch group from.
     */

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline to deregister the patch group from.
     * </p>
     * 
     * @return The ID of the patch baseline to deregister the patch group from.
     */

    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline to deregister the patch group from.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline to deregister the patch group from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterPatchBaselineForPatchGroupRequest withBaselineId(String baselineId) {
        setBaselineId(baselineId);
        return this;
    }

    /**
     * <p>
     * The name of the patch group that should be deregistered from the patch baseline.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group that should be deregistered from the patch baseline.
     */

    public void setPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
    }

    /**
     * <p>
     * The name of the patch group that should be deregistered from the patch baseline.
     * </p>
     * 
     * @return The name of the patch group that should be deregistered from the patch baseline.
     */

    public String getPatchGroup() {
        return this.patchGroup;
    }

    /**
     * <p>
     * The name of the patch group that should be deregistered from the patch baseline.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group that should be deregistered from the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterPatchBaselineForPatchGroupRequest withPatchGroup(String patchGroup) {
        setPatchGroup(patchGroup);
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
        if (getBaselineId() != null)
            sb.append("BaselineId: ").append(getBaselineId()).append(",");
        if (getPatchGroup() != null)
            sb.append("PatchGroup: ").append(getPatchGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterPatchBaselineForPatchGroupRequest == false)
            return false;
        DeregisterPatchBaselineForPatchGroupRequest other = (DeregisterPatchBaselineForPatchGroupRequest) obj;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        if (other.getPatchGroup() == null ^ this.getPatchGroup() == null)
            return false;
        if (other.getPatchGroup() != null && other.getPatchGroup().equals(this.getPatchGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getPatchGroup() == null) ? 0 : getPatchGroup().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterPatchBaselineForPatchGroupRequest clone() {
        return (DeregisterPatchBaselineForPatchGroupRequest) super.clone();
    }

}

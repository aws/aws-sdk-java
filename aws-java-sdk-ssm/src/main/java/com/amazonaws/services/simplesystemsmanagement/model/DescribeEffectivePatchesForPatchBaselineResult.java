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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectivePatchesForPatchBaseline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEffectivePatchesForPatchBaselineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EffectivePatch> effectivePatches;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     * 
     * @return An array of patches and patch status.
     */

    public java.util.List<EffectivePatch> getEffectivePatches() {
        if (effectivePatches == null) {
            effectivePatches = new com.amazonaws.internal.SdkInternalList<EffectivePatch>();
        }
        return effectivePatches;
    }

    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     * 
     * @param effectivePatches
     *        An array of patches and patch status.
     */

    public void setEffectivePatches(java.util.Collection<EffectivePatch> effectivePatches) {
        if (effectivePatches == null) {
            this.effectivePatches = null;
            return;
        }

        this.effectivePatches = new com.amazonaws.internal.SdkInternalList<EffectivePatch>(effectivePatches);
    }

    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEffectivePatches(java.util.Collection)} or {@link #withEffectivePatches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param effectivePatches
     *        An array of patches and patch status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEffectivePatchesForPatchBaselineResult withEffectivePatches(EffectivePatch... effectivePatches) {
        if (this.effectivePatches == null) {
            setEffectivePatches(new com.amazonaws.internal.SdkInternalList<EffectivePatch>(effectivePatches.length));
        }
        for (EffectivePatch ele : effectivePatches) {
            this.effectivePatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     * 
     * @param effectivePatches
     *        An array of patches and patch status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEffectivePatchesForPatchBaselineResult withEffectivePatches(java.util.Collection<EffectivePatch> effectivePatches) {
        setEffectivePatches(effectivePatches);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEffectivePatchesForPatchBaselineResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEffectivePatches() != null)
            sb.append("EffectivePatches: ").append(getEffectivePatches()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEffectivePatchesForPatchBaselineResult == false)
            return false;
        DescribeEffectivePatchesForPatchBaselineResult other = (DescribeEffectivePatchesForPatchBaselineResult) obj;
        if (other.getEffectivePatches() == null ^ this.getEffectivePatches() == null)
            return false;
        if (other.getEffectivePatches() != null && other.getEffectivePatches().equals(this.getEffectivePatches()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEffectivePatches() == null) ? 0 : getEffectivePatches().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEffectivePatchesForPatchBaselineResult clone() {
        try {
            return (DescribeEffectivePatchesForPatchBaselineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

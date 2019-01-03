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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAvailablePatches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAvailablePatchesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of patches. Each entry in the array is a patch structure.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Patch> patches;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of patches. Each entry in the array is a patch structure.
     * </p>
     * 
     * @return An array of patches. Each entry in the array is a patch structure.
     */

    public java.util.List<Patch> getPatches() {
        if (patches == null) {
            patches = new com.amazonaws.internal.SdkInternalList<Patch>();
        }
        return patches;
    }

    /**
     * <p>
     * An array of patches. Each entry in the array is a patch structure.
     * </p>
     * 
     * @param patches
     *        An array of patches. Each entry in the array is a patch structure.
     */

    public void setPatches(java.util.Collection<Patch> patches) {
        if (patches == null) {
            this.patches = null;
            return;
        }

        this.patches = new com.amazonaws.internal.SdkInternalList<Patch>(patches);
    }

    /**
     * <p>
     * An array of patches. Each entry in the array is a patch structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPatches(java.util.Collection)} or {@link #withPatches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param patches
     *        An array of patches. Each entry in the array is a patch structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailablePatchesResult withPatches(Patch... patches) {
        if (this.patches == null) {
            setPatches(new com.amazonaws.internal.SdkInternalList<Patch>(patches.length));
        }
        for (Patch ele : patches) {
            this.patches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of patches. Each entry in the array is a patch structure.
     * </p>
     * 
     * @param patches
     *        An array of patches. Each entry in the array is a patch structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailablePatchesResult withPatches(java.util.Collection<Patch> patches) {
        setPatches(patches);
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

    public DescribeAvailablePatchesResult withNextToken(String nextToken) {
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
        if (getPatches() != null)
            sb.append("Patches: ").append(getPatches()).append(",");
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

        if (obj instanceof DescribeAvailablePatchesResult == false)
            return false;
        DescribeAvailablePatchesResult other = (DescribeAvailablePatchesResult) obj;
        if (other.getPatches() == null ^ this.getPatches() == null)
            return false;
        if (other.getPatches() != null && other.getPatches().equals(this.getPatches()) == false)
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

        hashCode = prime * hashCode + ((getPatches() == null) ? 0 : getPatches().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAvailablePatchesResult clone() {
        try {
            return (DescribeAvailablePatchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

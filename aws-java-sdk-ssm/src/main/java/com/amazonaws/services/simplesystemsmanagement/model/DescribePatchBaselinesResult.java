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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchBaselines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePatchBaselinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of PatchBaselineIdentity elements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PatchBaselineIdentity> baselineIdentities;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of PatchBaselineIdentity elements.
     * </p>
     * 
     * @return An array of PatchBaselineIdentity elements.
     */

    public java.util.List<PatchBaselineIdentity> getBaselineIdentities() {
        if (baselineIdentities == null) {
            baselineIdentities = new com.amazonaws.internal.SdkInternalList<PatchBaselineIdentity>();
        }
        return baselineIdentities;
    }

    /**
     * <p>
     * An array of PatchBaselineIdentity elements.
     * </p>
     * 
     * @param baselineIdentities
     *        An array of PatchBaselineIdentity elements.
     */

    public void setBaselineIdentities(java.util.Collection<PatchBaselineIdentity> baselineIdentities) {
        if (baselineIdentities == null) {
            this.baselineIdentities = null;
            return;
        }

        this.baselineIdentities = new com.amazonaws.internal.SdkInternalList<PatchBaselineIdentity>(baselineIdentities);
    }

    /**
     * <p>
     * An array of PatchBaselineIdentity elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaselineIdentities(java.util.Collection)} or {@link #withBaselineIdentities(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param baselineIdentities
     *        An array of PatchBaselineIdentity elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchBaselinesResult withBaselineIdentities(PatchBaselineIdentity... baselineIdentities) {
        if (this.baselineIdentities == null) {
            setBaselineIdentities(new com.amazonaws.internal.SdkInternalList<PatchBaselineIdentity>(baselineIdentities.length));
        }
        for (PatchBaselineIdentity ele : baselineIdentities) {
            this.baselineIdentities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of PatchBaselineIdentity elements.
     * </p>
     * 
     * @param baselineIdentities
     *        An array of PatchBaselineIdentity elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchBaselinesResult withBaselineIdentities(java.util.Collection<PatchBaselineIdentity> baselineIdentities) {
        setBaselineIdentities(baselineIdentities);
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

    public DescribePatchBaselinesResult withNextToken(String nextToken) {
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
        if (getBaselineIdentities() != null)
            sb.append("BaselineIdentities: ").append(getBaselineIdentities()).append(",");
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

        if (obj instanceof DescribePatchBaselinesResult == false)
            return false;
        DescribePatchBaselinesResult other = (DescribePatchBaselinesResult) obj;
        if (other.getBaselineIdentities() == null ^ this.getBaselineIdentities() == null)
            return false;
        if (other.getBaselineIdentities() != null && other.getBaselineIdentities().equals(this.getBaselineIdentities()) == false)
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

        hashCode = prime * hashCode + ((getBaselineIdentities() == null) ? 0 : getBaselineIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePatchBaselinesResult clone() {
        try {
            return (DescribePatchBaselinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

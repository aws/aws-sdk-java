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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribePolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The scaling policies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScalingPolicy> scalingPolicies;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The scaling policies.
     * </p>
     * 
     * @return The scaling policies.
     */

    public java.util.List<ScalingPolicy> getScalingPolicies() {
        if (scalingPolicies == null) {
            scalingPolicies = new com.amazonaws.internal.SdkInternalList<ScalingPolicy>();
        }
        return scalingPolicies;
    }

    /**
     * <p>
     * The scaling policies.
     * </p>
     * 
     * @param scalingPolicies
     *        The scaling policies.
     */

    public void setScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        if (scalingPolicies == null) {
            this.scalingPolicies = null;
            return;
        }

        this.scalingPolicies = new com.amazonaws.internal.SdkInternalList<ScalingPolicy>(scalingPolicies);
    }

    /**
     * <p>
     * The scaling policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingPolicies(java.util.Collection)} or {@link #withScalingPolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scalingPolicies
     *        The scaling policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoliciesResult withScalingPolicies(ScalingPolicy... scalingPolicies) {
        if (this.scalingPolicies == null) {
            setScalingPolicies(new com.amazonaws.internal.SdkInternalList<ScalingPolicy>(scalingPolicies.length));
        }
        for (ScalingPolicy ele : scalingPolicies) {
            this.scalingPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scaling policies.
     * </p>
     * 
     * @param scalingPolicies
     *        The scaling policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoliciesResult withScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        setScalingPolicies(scalingPolicies);
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

    public DescribePoliciesResult withNextToken(String nextToken) {
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
        if (getScalingPolicies() != null)
            sb.append("ScalingPolicies: ").append(getScalingPolicies()).append(",");
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

        if (obj instanceof DescribePoliciesResult == false)
            return false;
        DescribePoliciesResult other = (DescribePoliciesResult) obj;
        if (other.getScalingPolicies() == null ^ this.getScalingPolicies() == null)
            return false;
        if (other.getScalingPolicies() != null && other.getScalingPolicies().equals(this.getScalingPolicies()) == false)
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

        hashCode = prime * hashCode + ((getScalingPolicies() == null) ? 0 : getScalingPolicies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePoliciesResult clone() {
        try {
            return (DescribePoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

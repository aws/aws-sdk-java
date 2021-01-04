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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListEffectiveDeployments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEffectiveDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each deployment on the core device.
     * </p>
     */
    private java.util.List<EffectiveDeployment> effectiveDeployments;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each deployment on the core device.
     * </p>
     * 
     * @return A list that summarizes each deployment on the core device.
     */

    public java.util.List<EffectiveDeployment> getEffectiveDeployments() {
        return effectiveDeployments;
    }

    /**
     * <p>
     * A list that summarizes each deployment on the core device.
     * </p>
     * 
     * @param effectiveDeployments
     *        A list that summarizes each deployment on the core device.
     */

    public void setEffectiveDeployments(java.util.Collection<EffectiveDeployment> effectiveDeployments) {
        if (effectiveDeployments == null) {
            this.effectiveDeployments = null;
            return;
        }

        this.effectiveDeployments = new java.util.ArrayList<EffectiveDeployment>(effectiveDeployments);
    }

    /**
     * <p>
     * A list that summarizes each deployment on the core device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEffectiveDeployments(java.util.Collection)} or {@link #withEffectiveDeployments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param effectiveDeployments
     *        A list that summarizes each deployment on the core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEffectiveDeploymentsResult withEffectiveDeployments(EffectiveDeployment... effectiveDeployments) {
        if (this.effectiveDeployments == null) {
            setEffectiveDeployments(new java.util.ArrayList<EffectiveDeployment>(effectiveDeployments.length));
        }
        for (EffectiveDeployment ele : effectiveDeployments) {
            this.effectiveDeployments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each deployment on the core device.
     * </p>
     * 
     * @param effectiveDeployments
     *        A list that summarizes each deployment on the core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEffectiveDeploymentsResult withEffectiveDeployments(java.util.Collection<EffectiveDeployment> effectiveDeployments) {
        setEffectiveDeployments(effectiveDeployments);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEffectiveDeploymentsResult withNextToken(String nextToken) {
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
        if (getEffectiveDeployments() != null)
            sb.append("EffectiveDeployments: ").append(getEffectiveDeployments()).append(",");
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

        if (obj instanceof ListEffectiveDeploymentsResult == false)
            return false;
        ListEffectiveDeploymentsResult other = (ListEffectiveDeploymentsResult) obj;
        if (other.getEffectiveDeployments() == null ^ this.getEffectiveDeployments() == null)
            return false;
        if (other.getEffectiveDeployments() != null && other.getEffectiveDeployments().equals(this.getEffectiveDeployments()) == false)
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

        hashCode = prime * hashCode + ((getEffectiveDeployments() == null) ? 0 : getEffectiveDeployments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEffectiveDeploymentsResult clone() {
        try {
            return (ListEffectiveDeploymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

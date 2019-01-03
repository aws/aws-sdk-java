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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeActivations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeActivationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of activations for your AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Activation> activationList;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of activations for your AWS account.
     * </p>
     * 
     * @return A list of activations for your AWS account.
     */

    public java.util.List<Activation> getActivationList() {
        if (activationList == null) {
            activationList = new com.amazonaws.internal.SdkInternalList<Activation>();
        }
        return activationList;
    }

    /**
     * <p>
     * A list of activations for your AWS account.
     * </p>
     * 
     * @param activationList
     *        A list of activations for your AWS account.
     */

    public void setActivationList(java.util.Collection<Activation> activationList) {
        if (activationList == null) {
            this.activationList = null;
            return;
        }

        this.activationList = new com.amazonaws.internal.SdkInternalList<Activation>(activationList);
    }

    /**
     * <p>
     * A list of activations for your AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActivationList(java.util.Collection)} or {@link #withActivationList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param activationList
     *        A list of activations for your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivationsResult withActivationList(Activation... activationList) {
        if (this.activationList == null) {
            setActivationList(new com.amazonaws.internal.SdkInternalList<Activation>(activationList.length));
        }
        for (Activation ele : activationList) {
            this.activationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of activations for your AWS account.
     * </p>
     * 
     * @param activationList
     *        A list of activations for your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivationsResult withActivationList(java.util.Collection<Activation> activationList) {
        setActivationList(activationList);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivationsResult withNextToken(String nextToken) {
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
        if (getActivationList() != null)
            sb.append("ActivationList: ").append(getActivationList()).append(",");
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

        if (obj instanceof DescribeActivationsResult == false)
            return false;
        DescribeActivationsResult other = (DescribeActivationsResult) obj;
        if (other.getActivationList() == null ^ this.getActivationList() == null)
            return false;
        if (other.getActivationList() != null && other.getActivationList().equals(this.getActivationList()) == false)
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

        hashCode = prime * hashCode + ((getActivationList() == null) ? 0 : getActivationList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeActivationsResult clone() {
        try {
            return (DescribeActivationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of dedicated IP pools.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDedicatedIpPools"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDedicatedIpPoolsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
     * </p>
     */
    private java.util.List<String> dedicatedIpPools;
    /**
     * <p>
     * A token that indicates that there are additional IP pools to list. To view additional IP pools, issue another
     * request to <code>ListDedicatedIpPools</code>, passing this token in the <code>NextToken</code> parameter.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @return A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
     */

    public java.util.List<String> getDedicatedIpPools() {
        return dedicatedIpPools;
    }

    /**
     * <p>
     * A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param dedicatedIpPools
     *        A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
     */

    public void setDedicatedIpPools(java.util.Collection<String> dedicatedIpPools) {
        if (dedicatedIpPools == null) {
            this.dedicatedIpPools = null;
            return;
        }

        this.dedicatedIpPools = new java.util.ArrayList<String>(dedicatedIpPools);
    }

    /**
     * <p>
     * A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDedicatedIpPools(java.util.Collection)} or {@link #withDedicatedIpPools(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dedicatedIpPools
     *        A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDedicatedIpPoolsResult withDedicatedIpPools(String... dedicatedIpPools) {
        if (this.dedicatedIpPools == null) {
            setDedicatedIpPools(new java.util.ArrayList<String>(dedicatedIpPools.length));
        }
        for (String ele : dedicatedIpPools) {
            this.dedicatedIpPools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param dedicatedIpPools
     *        A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDedicatedIpPoolsResult withDedicatedIpPools(java.util.Collection<String> dedicatedIpPools) {
        setDedicatedIpPools(dedicatedIpPools);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there are additional IP pools to list. To view additional IP pools, issue another
     * request to <code>ListDedicatedIpPools</code>, passing this token in the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional IP pools to list. To view additional IP pools, issue
     *        another request to <code>ListDedicatedIpPools</code>, passing this token in the <code>NextToken</code>
     *        parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional IP pools to list. To view additional IP pools, issue another
     * request to <code>ListDedicatedIpPools</code>, passing this token in the <code>NextToken</code> parameter.
     * </p>
     * 
     * @return A token that indicates that there are additional IP pools to list. To view additional IP pools, issue
     *         another request to <code>ListDedicatedIpPools</code>, passing this token in the <code>NextToken</code>
     *         parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there are additional IP pools to list. To view additional IP pools, issue another
     * request to <code>ListDedicatedIpPools</code>, passing this token in the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there are additional IP pools to list. To view additional IP pools, issue
     *        another request to <code>ListDedicatedIpPools</code>, passing this token in the <code>NextToken</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDedicatedIpPoolsResult withNextToken(String nextToken) {
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
        if (getDedicatedIpPools() != null)
            sb.append("DedicatedIpPools: ").append(getDedicatedIpPools()).append(",");
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

        if (obj instanceof ListDedicatedIpPoolsResult == false)
            return false;
        ListDedicatedIpPoolsResult other = (ListDedicatedIpPoolsResult) obj;
        if (other.getDedicatedIpPools() == null ^ this.getDedicatedIpPools() == null)
            return false;
        if (other.getDedicatedIpPools() != null && other.getDedicatedIpPools().equals(this.getDedicatedIpPools()) == false)
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

        hashCode = prime * hashCode + ((getDedicatedIpPools() == null) ? 0 : getDedicatedIpPools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDedicatedIpPoolsResult clone() {
        try {
            return (ListDedicatedIpPoolsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

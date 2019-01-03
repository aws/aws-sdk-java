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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentMemberships"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentMembershipsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the environment members for the environment.
     * </p>
     */
    private java.util.List<EnvironmentMember> memberships;
    /**
     * <p>
     * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the environment members for the environment.
     * </p>
     * 
     * @return Information about the environment members for the environment.
     */

    public java.util.List<EnvironmentMember> getMemberships() {
        return memberships;
    }

    /**
     * <p>
     * Information about the environment members for the environment.
     * </p>
     * 
     * @param memberships
     *        Information about the environment members for the environment.
     */

    public void setMemberships(java.util.Collection<EnvironmentMember> memberships) {
        if (memberships == null) {
            this.memberships = null;
            return;
        }

        this.memberships = new java.util.ArrayList<EnvironmentMember>(memberships);
    }

    /**
     * <p>
     * Information about the environment members for the environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberships(java.util.Collection)} or {@link #withMemberships(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param memberships
     *        Information about the environment members for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentMembershipsResult withMemberships(EnvironmentMember... memberships) {
        if (this.memberships == null) {
            setMemberships(new java.util.ArrayList<EnvironmentMember>(memberships.length));
        }
        for (EnvironmentMember ele : memberships) {
            this.memberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the environment members for the environment.
     * </p>
     * 
     * @param memberships
     *        Information about the environment members for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentMembershipsResult withMemberships(java.util.Collection<EnvironmentMember> memberships) {
        setMemberships(memberships);
        return this;
    }

    /**
     * <p>
     * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     * 
     * @param nextToken
     *        If there are more than 25 items in the list, only the first 25 items are returned, along with a unique
     *        string called a <i>next token</i>. To get the next batch of items in the list, call this operation again,
     *        adding the next token to the call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     * 
     * @return If there are more than 25 items in the list, only the first 25 items are returned, along with a unique
     *         string called a <i>next token</i>. To get the next batch of items in the list, call this operation again,
     *         adding the next token to the call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string
     * called a <i>next token</i>. To get the next batch of items in the list, call this operation again, adding the
     * next token to the call.
     * </p>
     * 
     * @param nextToken
     *        If there are more than 25 items in the list, only the first 25 items are returned, along with a unique
     *        string called a <i>next token</i>. To get the next batch of items in the list, call this operation again,
     *        adding the next token to the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentMembershipsResult withNextToken(String nextToken) {
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
        if (getMemberships() != null)
            sb.append("Memberships: ").append(getMemberships()).append(",");
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

        if (obj instanceof DescribeEnvironmentMembershipsResult == false)
            return false;
        DescribeEnvironmentMembershipsResult other = (DescribeEnvironmentMembershipsResult) obj;
        if (other.getMemberships() == null ^ this.getMemberships() == null)
            return false;
        if (other.getMemberships() != null && other.getMemberships().equals(this.getMemberships()) == false)
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

        hashCode = prime * hashCode + ((getMemberships() == null) ? 0 : getMemberships().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentMembershipsResult clone() {
        try {
            return (DescribeEnvironmentMembershipsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

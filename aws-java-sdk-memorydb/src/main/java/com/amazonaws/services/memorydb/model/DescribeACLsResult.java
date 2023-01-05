/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeACLs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeACLsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of ACLs
     * </p>
     */
    private java.util.List<ACL> aCLs;
    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of ACLs
     * </p>
     * 
     * @return The list of ACLs
     */

    public java.util.List<ACL> getACLs() {
        return aCLs;
    }

    /**
     * <p>
     * The list of ACLs
     * </p>
     * 
     * @param aCLs
     *        The list of ACLs
     */

    public void setACLs(java.util.Collection<ACL> aCLs) {
        if (aCLs == null) {
            this.aCLs = null;
            return;
        }

        this.aCLs = new java.util.ArrayList<ACL>(aCLs);
    }

    /**
     * <p>
     * The list of ACLs
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setACLs(java.util.Collection)} or {@link #withACLs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param aCLs
     *        The list of ACLs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeACLsResult withACLs(ACL... aCLs) {
        if (this.aCLs == null) {
            setACLs(new java.util.ArrayList<ACL>(aCLs.length));
        }
        for (ACL ele : aCLs) {
            this.aCLs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ACLs
     * </p>
     * 
     * @param aCLs
     *        The list of ACLs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeACLsResult withACLs(java.util.Collection<ACL> aCLs) {
        setACLs(aCLs);
        return this;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     * 
     * @return If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *         other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments
     * unchanged.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeACLsResult withNextToken(String nextToken) {
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
        if (getACLs() != null)
            sb.append("ACLs: ").append(getACLs()).append(",");
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

        if (obj instanceof DescribeACLsResult == false)
            return false;
        DescribeACLsResult other = (DescribeACLsResult) obj;
        if (other.getACLs() == null ^ this.getACLs() == null)
            return false;
        if (other.getACLs() != null && other.getACLs().equals(this.getACLs()) == false)
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

        hashCode = prime * hashCode + ((getACLs() == null) ? 0 : getACLs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeACLsResult clone() {
        try {
            return (DescribeACLsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

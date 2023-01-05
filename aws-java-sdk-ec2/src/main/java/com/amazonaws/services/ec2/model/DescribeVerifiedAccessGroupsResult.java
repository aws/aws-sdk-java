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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedAccessGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VerifiedAccessGroup> verifiedAccessGroups;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * 
     * @return The ID of the Verified Access group.
     */

    public java.util.List<VerifiedAccessGroup> getVerifiedAccessGroups() {
        if (verifiedAccessGroups == null) {
            verifiedAccessGroups = new com.amazonaws.internal.SdkInternalList<VerifiedAccessGroup>();
        }
        return verifiedAccessGroups;
    }

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroups
     *        The ID of the Verified Access group.
     */

    public void setVerifiedAccessGroups(java.util.Collection<VerifiedAccessGroup> verifiedAccessGroups) {
        if (verifiedAccessGroups == null) {
            this.verifiedAccessGroups = null;
            return;
        }

        this.verifiedAccessGroups = new com.amazonaws.internal.SdkInternalList<VerifiedAccessGroup>(verifiedAccessGroups);
    }

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVerifiedAccessGroups(java.util.Collection)} or {@link #withVerifiedAccessGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param verifiedAccessGroups
     *        The ID of the Verified Access group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessGroupsResult withVerifiedAccessGroups(VerifiedAccessGroup... verifiedAccessGroups) {
        if (this.verifiedAccessGroups == null) {
            setVerifiedAccessGroups(new com.amazonaws.internal.SdkInternalList<VerifiedAccessGroup>(verifiedAccessGroups.length));
        }
        for (VerifiedAccessGroup ele : verifiedAccessGroups) {
            this.verifiedAccessGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroups
     *        The ID of the Verified Access group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessGroupsResult withVerifiedAccessGroups(java.util.Collection<VerifiedAccessGroup> verifiedAccessGroups) {
        setVerifiedAccessGroups(verifiedAccessGroups);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessGroupsResult withNextToken(String nextToken) {
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
        if (getVerifiedAccessGroups() != null)
            sb.append("VerifiedAccessGroups: ").append(getVerifiedAccessGroups()).append(",");
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

        if (obj instanceof DescribeVerifiedAccessGroupsResult == false)
            return false;
        DescribeVerifiedAccessGroupsResult other = (DescribeVerifiedAccessGroupsResult) obj;
        if (other.getVerifiedAccessGroups() == null ^ this.getVerifiedAccessGroups() == null)
            return false;
        if (other.getVerifiedAccessGroups() != null && other.getVerifiedAccessGroups().equals(this.getVerifiedAccessGroups()) == false)
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

        hashCode = prime * hashCode + ((getVerifiedAccessGroups() == null) ? 0 : getVerifiedAccessGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVerifiedAccessGroupsResult clone() {
        try {
            return (DescribeVerifiedAccessGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

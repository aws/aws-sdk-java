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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeIpGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the IP access control groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<WorkspacesIpGroup> result;
    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the IP access control groups.
     * </p>
     * 
     * @return Information about the IP access control groups.
     */

    public java.util.List<WorkspacesIpGroup> getResult() {
        if (result == null) {
            result = new com.amazonaws.internal.SdkInternalList<WorkspacesIpGroup>();
        }
        return result;
    }

    /**
     * <p>
     * Information about the IP access control groups.
     * </p>
     * 
     * @param result
     *        Information about the IP access control groups.
     */

    public void setResult(java.util.Collection<WorkspacesIpGroup> result) {
        if (result == null) {
            this.result = null;
            return;
        }

        this.result = new com.amazonaws.internal.SdkInternalList<WorkspacesIpGroup>(result);
    }

    /**
     * <p>
     * Information about the IP access control groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResult(java.util.Collection)} or {@link #withResult(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param result
     *        Information about the IP access control groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpGroupsResult withResult(WorkspacesIpGroup... result) {
        if (this.result == null) {
            setResult(new com.amazonaws.internal.SdkInternalList<WorkspacesIpGroup>(result.length));
        }
        for (WorkspacesIpGroup ele : result) {
            this.result.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IP access control groups.
     * </p>
     * 
     * @param result
     *        Information about the IP access control groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpGroupsResult withResult(java.util.Collection<WorkspacesIpGroup> result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @return The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpGroupsResult withNextToken(String nextToken) {
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
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

        if (obj instanceof DescribeIpGroupsResult == false)
            return false;
        DescribeIpGroupsResult other = (DescribeIpGroupsResult) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
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

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIpGroupsResult clone() {
        try {
            return (DescribeIpGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

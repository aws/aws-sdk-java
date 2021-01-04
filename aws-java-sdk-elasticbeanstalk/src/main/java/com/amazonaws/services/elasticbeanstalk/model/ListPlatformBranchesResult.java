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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListPlatformBranches"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlatformBranchesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlatformBranchSummary> platformBranchSummaryList;
    /**
     * <p>
     * In a paginated request, if this value isn't <code>null</code>, it's the token that you can pass in a subsequent
     * request to get the next response page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     * 
     * @return Summary information about the platform branches.
     */

    public java.util.List<PlatformBranchSummary> getPlatformBranchSummaryList() {
        if (platformBranchSummaryList == null) {
            platformBranchSummaryList = new com.amazonaws.internal.SdkInternalList<PlatformBranchSummary>();
        }
        return platformBranchSummaryList;
    }

    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     * 
     * @param platformBranchSummaryList
     *        Summary information about the platform branches.
     */

    public void setPlatformBranchSummaryList(java.util.Collection<PlatformBranchSummary> platformBranchSummaryList) {
        if (platformBranchSummaryList == null) {
            this.platformBranchSummaryList = null;
            return;
        }

        this.platformBranchSummaryList = new com.amazonaws.internal.SdkInternalList<PlatformBranchSummary>(platformBranchSummaryList);
    }

    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformBranchSummaryList(java.util.Collection)} or
     * {@link #withPlatformBranchSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param platformBranchSummaryList
     *        Summary information about the platform branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformBranchesResult withPlatformBranchSummaryList(PlatformBranchSummary... platformBranchSummaryList) {
        if (this.platformBranchSummaryList == null) {
            setPlatformBranchSummaryList(new com.amazonaws.internal.SdkInternalList<PlatformBranchSummary>(platformBranchSummaryList.length));
        }
        for (PlatformBranchSummary ele : platformBranchSummaryList) {
            this.platformBranchSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     * 
     * @param platformBranchSummaryList
     *        Summary information about the platform branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformBranchesResult withPlatformBranchSummaryList(java.util.Collection<PlatformBranchSummary> platformBranchSummaryList) {
        setPlatformBranchSummaryList(platformBranchSummaryList);
        return this;
    }

    /**
     * <p>
     * In a paginated request, if this value isn't <code>null</code>, it's the token that you can pass in a subsequent
     * request to get the next response page.
     * </p>
     * 
     * @param nextToken
     *        In a paginated request, if this value isn't <code>null</code>, it's the token that you can pass in a
     *        subsequent request to get the next response page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * In a paginated request, if this value isn't <code>null</code>, it's the token that you can pass in a subsequent
     * request to get the next response page.
     * </p>
     * 
     * @return In a paginated request, if this value isn't <code>null</code>, it's the token that you can pass in a
     *         subsequent request to get the next response page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * In a paginated request, if this value isn't <code>null</code>, it's the token that you can pass in a subsequent
     * request to get the next response page.
     * </p>
     * 
     * @param nextToken
     *        In a paginated request, if this value isn't <code>null</code>, it's the token that you can pass in a
     *        subsequent request to get the next response page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformBranchesResult withNextToken(String nextToken) {
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
        if (getPlatformBranchSummaryList() != null)
            sb.append("PlatformBranchSummaryList: ").append(getPlatformBranchSummaryList()).append(",");
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

        if (obj instanceof ListPlatformBranchesResult == false)
            return false;
        ListPlatformBranchesResult other = (ListPlatformBranchesResult) obj;
        if (other.getPlatformBranchSummaryList() == null ^ this.getPlatformBranchSummaryList() == null)
            return false;
        if (other.getPlatformBranchSummaryList() != null && other.getPlatformBranchSummaryList().equals(this.getPlatformBranchSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getPlatformBranchSummaryList() == null) ? 0 : getPlatformBranchSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPlatformBranchesResult clone() {
        try {
            return (ListPlatformBranchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

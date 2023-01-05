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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for response returned by <code>GetPackageVersionHistory</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPackageVersionHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the package.
     * </p>
     */
    private String packageID;
    /**
     * <p>
     * A list of package versions, along with their creation time and commit message.
     * </p>
     */
    private java.util.List<PackageVersionHistory> packageVersionHistoryList;
    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the package.
     * </p>
     * 
     * @param packageID
     *        The unique identifier of the package.
     */

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    /**
     * <p>
     * The unique identifier of the package.
     * </p>
     * 
     * @return The unique identifier of the package.
     */

    public String getPackageID() {
        return this.packageID;
    }

    /**
     * <p>
     * The unique identifier of the package.
     * </p>
     * 
     * @param packageID
     *        The unique identifier of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionHistoryResult withPackageID(String packageID) {
        setPackageID(packageID);
        return this;
    }

    /**
     * <p>
     * A list of package versions, along with their creation time and commit message.
     * </p>
     * 
     * @return A list of package versions, along with their creation time and commit message.
     */

    public java.util.List<PackageVersionHistory> getPackageVersionHistoryList() {
        return packageVersionHistoryList;
    }

    /**
     * <p>
     * A list of package versions, along with their creation time and commit message.
     * </p>
     * 
     * @param packageVersionHistoryList
     *        A list of package versions, along with their creation time and commit message.
     */

    public void setPackageVersionHistoryList(java.util.Collection<PackageVersionHistory> packageVersionHistoryList) {
        if (packageVersionHistoryList == null) {
            this.packageVersionHistoryList = null;
            return;
        }

        this.packageVersionHistoryList = new java.util.ArrayList<PackageVersionHistory>(packageVersionHistoryList);
    }

    /**
     * <p>
     * A list of package versions, along with their creation time and commit message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackageVersionHistoryList(java.util.Collection)} or
     * {@link #withPackageVersionHistoryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param packageVersionHistoryList
     *        A list of package versions, along with their creation time and commit message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionHistoryResult withPackageVersionHistoryList(PackageVersionHistory... packageVersionHistoryList) {
        if (this.packageVersionHistoryList == null) {
            setPackageVersionHistoryList(new java.util.ArrayList<PackageVersionHistory>(packageVersionHistoryList.length));
        }
        for (PackageVersionHistory ele : packageVersionHistoryList) {
            this.packageVersionHistoryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of package versions, along with their creation time and commit message.
     * </p>
     * 
     * @param packageVersionHistoryList
     *        A list of package versions, along with their creation time and commit message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionHistoryResult withPackageVersionHistoryList(java.util.Collection<PackageVersionHistory> packageVersionHistoryList) {
        setPackageVersionHistoryList(packageVersionHistoryList);
        return this;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionHistoryResult withNextToken(String nextToken) {
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
        if (getPackageID() != null)
            sb.append("PackageID: ").append(getPackageID()).append(",");
        if (getPackageVersionHistoryList() != null)
            sb.append("PackageVersionHistoryList: ").append(getPackageVersionHistoryList()).append(",");
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

        if (obj instanceof GetPackageVersionHistoryResult == false)
            return false;
        GetPackageVersionHistoryResult other = (GetPackageVersionHistoryResult) obj;
        if (other.getPackageID() == null ^ this.getPackageID() == null)
            return false;
        if (other.getPackageID() != null && other.getPackageID().equals(this.getPackageID()) == false)
            return false;
        if (other.getPackageVersionHistoryList() == null ^ this.getPackageVersionHistoryList() == null)
            return false;
        if (other.getPackageVersionHistoryList() != null && other.getPackageVersionHistoryList().equals(this.getPackageVersionHistoryList()) == false)
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

        hashCode = prime * hashCode + ((getPackageID() == null) ? 0 : getPackageID().hashCode());
        hashCode = prime * hashCode + ((getPackageVersionHistoryList() == null) ? 0 : getPackageVersionHistoryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetPackageVersionHistoryResult clone() {
        try {
            return (GetPackageVersionHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

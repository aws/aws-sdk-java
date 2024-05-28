/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStorageLensGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more Storage Lens groups results available. The value of
     * <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned token
     * to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of Storage Lens groups that exist in the specified home Region.
     * </p>
     */
    private java.util.List<ListStorageLensGroupEntry> storageLensGroupList;

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more Storage Lens groups results available. The value of
     * <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned token
     * to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more Storage Lens groups results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more Storage Lens groups results available. The value of
     * <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned token
     * to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @return If <code>NextToken</code> is returned, there are more Storage Lens groups results available. The value of
     *         <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more Storage Lens groups results available. The value of
     * <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned token
     * to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more Storage Lens groups results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of Storage Lens groups that exist in the specified home Region.
     * </p>
     * 
     * @return The list of Storage Lens groups that exist in the specified home Region.
     */

    public java.util.List<ListStorageLensGroupEntry> getStorageLensGroupList() {
        return storageLensGroupList;
    }

    /**
     * <p>
     * The list of Storage Lens groups that exist in the specified home Region.
     * </p>
     * 
     * @param storageLensGroupList
     *        The list of Storage Lens groups that exist in the specified home Region.
     */

    public void setStorageLensGroupList(java.util.Collection<ListStorageLensGroupEntry> storageLensGroupList) {
        if (storageLensGroupList == null) {
            this.storageLensGroupList = null;
            return;
        }

        this.storageLensGroupList = new java.util.ArrayList<ListStorageLensGroupEntry>(storageLensGroupList);
    }

    /**
     * <p>
     * The list of Storage Lens groups that exist in the specified home Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageLensGroupList(java.util.Collection)} or {@link #withStorageLensGroupList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param storageLensGroupList
     *        The list of Storage Lens groups that exist in the specified home Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensGroupsResult withStorageLensGroupList(ListStorageLensGroupEntry... storageLensGroupList) {
        if (this.storageLensGroupList == null) {
            setStorageLensGroupList(new java.util.ArrayList<ListStorageLensGroupEntry>(storageLensGroupList.length));
        }
        for (ListStorageLensGroupEntry ele : storageLensGroupList) {
            this.storageLensGroupList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Storage Lens groups that exist in the specified home Region.
     * </p>
     * 
     * @param storageLensGroupList
     *        The list of Storage Lens groups that exist in the specified home Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensGroupsResult withStorageLensGroupList(java.util.Collection<ListStorageLensGroupEntry> storageLensGroupList) {
        setStorageLensGroupList(storageLensGroupList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStorageLensGroupList() != null)
            sb.append("StorageLensGroupList: ").append(getStorageLensGroupList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStorageLensGroupsResult == false)
            return false;
        ListStorageLensGroupsResult other = (ListStorageLensGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStorageLensGroupList() == null ^ this.getStorageLensGroupList() == null)
            return false;
        if (other.getStorageLensGroupList() != null && other.getStorageLensGroupList().equals(this.getStorageLensGroupList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStorageLensGroupList() == null) ? 0 : getStorageLensGroupList().hashCode());
        return hashCode;
    }

    @Override
    public ListStorageLensGroupsResult clone() {
        try {
            return (ListStorageLensGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

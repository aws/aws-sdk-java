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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListFolderMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFolderMembersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status. If succeeded, the status is <code>SC_OK</code>
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
     * </p>
     */
    private java.util.List<MemberIdArnPair> folderMemberList;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The request ID.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The status. If succeeded, the status is <code>SC_OK</code>
     * </p>
     * 
     * @param status
     *        The status. If succeeded, the status is <code>SC_OK</code>
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The status. If succeeded, the status is <code>SC_OK</code>
     * </p>
     * 
     * @return The status. If succeeded, the status is <code>SC_OK</code>
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status. If succeeded, the status is <code>SC_OK</code>
     * </p>
     * 
     * @param status
     *        The status. If succeeded, the status is <code>SC_OK</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFolderMembersResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
     * </p>
     * 
     * @return A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
     */

    public java.util.List<MemberIdArnPair> getFolderMemberList() {
        return folderMemberList;
    }

    /**
     * <p>
     * A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
     * </p>
     * 
     * @param folderMemberList
     *        A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
     */

    public void setFolderMemberList(java.util.Collection<MemberIdArnPair> folderMemberList) {
        if (folderMemberList == null) {
            this.folderMemberList = null;
            return;
        }

        this.folderMemberList = new java.util.ArrayList<MemberIdArnPair>(folderMemberList);
    }

    /**
     * <p>
     * A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFolderMemberList(java.util.Collection)} or {@link #withFolderMemberList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param folderMemberList
     *        A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFolderMembersResult withFolderMemberList(MemberIdArnPair... folderMemberList) {
        if (this.folderMemberList == null) {
            setFolderMemberList(new java.util.ArrayList<MemberIdArnPair>(folderMemberList.length));
        }
        for (MemberIdArnPair ele : folderMemberList) {
            this.folderMemberList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
     * </p>
     * 
     * @param folderMemberList
     *        A structure that contains all of the folder members (dashboards, analyses, and datasets) in the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFolderMembersResult withFolderMemberList(java.util.Collection<MemberIdArnPair> folderMemberList) {
        setFolderMemberList(folderMemberList);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFolderMembersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The request ID.
     * </p>
     * 
     * @param requestId
     *        The request ID.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID.
     * </p>
     * 
     * @return The request ID.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID.
     * </p>
     * 
     * @param requestId
     *        The request ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFolderMembersResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFolderMemberList() != null)
            sb.append("FolderMemberList: ").append(getFolderMemberList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFolderMembersResult == false)
            return false;
        ListFolderMembersResult other = (ListFolderMembersResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFolderMemberList() == null ^ this.getFolderMemberList() == null)
            return false;
        if (other.getFolderMemberList() != null && other.getFolderMemberList().equals(this.getFolderMemberList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFolderMemberList() == null) ? 0 : getFolderMemberList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public ListFolderMembersResult clone() {
        try {
            return (ListFolderMembersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

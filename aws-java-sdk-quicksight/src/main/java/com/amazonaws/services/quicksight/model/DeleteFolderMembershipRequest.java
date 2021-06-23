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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteFolderMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFolderMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Folder ID.
     * </p>
     */
    private String folderId;
    /**
     * <p>
     * The ID of the asset (the dashboard, analysis, or dataset) that you want to delete.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The type of the member, including <code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>
     * </p>
     */
    private String memberType;

    /**
     * <p>
     * The AWS Account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS Account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS Account ID.
     * </p>
     * 
     * @return The AWS Account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS Account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS Account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFolderMembershipRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Folder ID.
     * </p>
     * 
     * @param folderId
     *        The Folder ID.
     */

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    /**
     * <p>
     * The Folder ID.
     * </p>
     * 
     * @return The Folder ID.
     */

    public String getFolderId() {
        return this.folderId;
    }

    /**
     * <p>
     * The Folder ID.
     * </p>
     * 
     * @param folderId
     *        The Folder ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFolderMembershipRequest withFolderId(String folderId) {
        setFolderId(folderId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset (the dashboard, analysis, or dataset) that you want to delete.
     * </p>
     * 
     * @param memberId
     *        The ID of the asset (the dashboard, analysis, or dataset) that you want to delete.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The ID of the asset (the dashboard, analysis, or dataset) that you want to delete.
     * </p>
     * 
     * @return The ID of the asset (the dashboard, analysis, or dataset) that you want to delete.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The ID of the asset (the dashboard, analysis, or dataset) that you want to delete.
     * </p>
     * 
     * @param memberId
     *        The ID of the asset (the dashboard, analysis, or dataset) that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFolderMembershipRequest withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The type of the member, including <code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>
     * </p>
     * 
     * @param memberType
     *        The type of the member, including <code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>
     * @see MemberType
     */

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    /**
     * <p>
     * The type of the member, including <code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>
     * </p>
     * 
     * @return The type of the member, including <code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>
     * @see MemberType
     */

    public String getMemberType() {
        return this.memberType;
    }

    /**
     * <p>
     * The type of the member, including <code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>
     * </p>
     * 
     * @param memberType
     *        The type of the member, including <code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberType
     */

    public DeleteFolderMembershipRequest withMemberType(String memberType) {
        setMemberType(memberType);
        return this;
    }

    /**
     * <p>
     * The type of the member, including <code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>
     * </p>
     * 
     * @param memberType
     *        The type of the member, including <code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberType
     */

    public DeleteFolderMembershipRequest withMemberType(MemberType memberType) {
        this.memberType = memberType.toString();
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getFolderId() != null)
            sb.append("FolderId: ").append(getFolderId()).append(",");
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getMemberType() != null)
            sb.append("MemberType: ").append(getMemberType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFolderMembershipRequest == false)
            return false;
        DeleteFolderMembershipRequest other = (DeleteFolderMembershipRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getFolderId() == null ^ this.getFolderId() == null)
            return false;
        if (other.getFolderId() != null && other.getFolderId().equals(this.getFolderId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getMemberType() == null ^ this.getMemberType() == null)
            return false;
        if (other.getMemberType() != null && other.getMemberType().equals(this.getMemberType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getFolderId() == null) ? 0 : getFolderId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFolderMembershipRequest clone() {
        return (DeleteFolderMembershipRequest) super.clone();
    }

}

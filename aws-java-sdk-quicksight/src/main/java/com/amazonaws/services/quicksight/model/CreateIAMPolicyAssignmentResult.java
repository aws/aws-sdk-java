/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIAMPolicyAssignment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIAMPolicyAssignmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the assignment. This name must be unique within the AWS account.
     * </p>
     */
    private String assignmentName;
    /**
     * <p>
     * The ID for the assignment.
     * </p>
     */
    private String assignmentId;
    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't used when creating the data source.
     * </p>
     * </li>
     * </ul>
     */
    private String assignmentStatus;
    /**
     * <p>
     * The ARN for the IAM policy that is applied to the QuickSight users and groups specified in this assignment.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * The QuickSight users, groups, or both that the IAM policy is assigned to.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> identities;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The name of the assignment. This name must be unique within the AWS account.
     * </p>
     * 
     * @param assignmentName
     *        The name of the assignment. This name must be unique within the AWS account.
     */

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * The name of the assignment. This name must be unique within the AWS account.
     * </p>
     * 
     * @return The name of the assignment. This name must be unique within the AWS account.
     */

    public String getAssignmentName() {
        return this.assignmentName;
    }

    /**
     * <p>
     * The name of the assignment. This name must be unique within the AWS account.
     * </p>
     * 
     * @param assignmentName
     *        The name of the assignment. This name must be unique within the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentResult withAssignmentName(String assignmentName) {
        setAssignmentName(assignmentName);
        return this;
    }

    /**
     * <p>
     * The ID for the assignment.
     * </p>
     * 
     * @param assignmentId
     *        The ID for the assignment.
     */

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * The ID for the assignment.
     * </p>
     * 
     * @return The ID for the assignment.
     */

    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * <p>
     * The ID for the assignment.
     * </p>
     * 
     * @param assignmentId
     *        The ID for the assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentResult withAssignmentId(String assignmentId) {
        setAssignmentId(assignmentId);
        return this;
    }

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assignmentStatus
     *        The status of the assignment. Possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Anything specified in this assignment is used when creating the data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - This assignment isn't used when creating the data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DRAFT</code> - This assignment is an unfinished draft and isn't used when creating the data source.
     *        </p>
     *        </li>
     * @see AssignmentStatus
     */

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the assignment. Possible values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Anything specified in this assignment is used when creating the data source.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - This assignment isn't used when creating the data source.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DRAFT</code> - This assignment is an unfinished draft and isn't used when creating the data source.
     *         </p>
     *         </li>
     * @see AssignmentStatus
     */

    public String getAssignmentStatus() {
        return this.assignmentStatus;
    }

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assignmentStatus
     *        The status of the assignment. Possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Anything specified in this assignment is used when creating the data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - This assignment isn't used when creating the data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DRAFT</code> - This assignment is an unfinished draft and isn't used when creating the data source.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public CreateIAMPolicyAssignmentResult withAssignmentStatus(String assignmentStatus) {
        setAssignmentStatus(assignmentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assignmentStatus
     *        The status of the assignment. Possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Anything specified in this assignment is used when creating the data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - This assignment isn't used when creating the data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DRAFT</code> - This assignment is an unfinished draft and isn't used when creating the data source.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public CreateIAMPolicyAssignmentResult withAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM policy that is applied to the QuickSight users and groups specified in this assignment.
     * </p>
     * 
     * @param policyArn
     *        The ARN for the IAM policy that is applied to the QuickSight users and groups specified in this
     *        assignment.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The ARN for the IAM policy that is applied to the QuickSight users and groups specified in this assignment.
     * </p>
     * 
     * @return The ARN for the IAM policy that is applied to the QuickSight users and groups specified in this
     *         assignment.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The ARN for the IAM policy that is applied to the QuickSight users and groups specified in this assignment.
     * </p>
     * 
     * @param policyArn
     *        The ARN for the IAM policy that is applied to the QuickSight users and groups specified in this
     *        assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentResult withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that the IAM policy is assigned to.
     * </p>
     * 
     * @return The QuickSight users, groups, or both that the IAM policy is assigned to.
     */

    public java.util.Map<String, java.util.List<String>> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that the IAM policy is assigned to.
     * </p>
     * 
     * @param identities
     *        The QuickSight users, groups, or both that the IAM policy is assigned to.
     */

    public void setIdentities(java.util.Map<String, java.util.List<String>> identities) {
        this.identities = identities;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that the IAM policy is assigned to.
     * </p>
     * 
     * @param identities
     *        The QuickSight users, groups, or both that the IAM policy is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentResult withIdentities(java.util.Map<String, java.util.List<String>> identities) {
        setIdentities(identities);
        return this;
    }

    /**
     * Add a single Identities entry
     *
     * @see CreateIAMPolicyAssignmentResult#withIdentities
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentResult addIdentitiesEntry(String key, java.util.List<String> value) {
        if (null == this.identities) {
            this.identities = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.identities.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.identities.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Identities.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentResult clearIdentitiesEntries() {
        this.identities = null;
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentResult withStatus(Integer status) {
        setStatus(status);
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
        if (getAssignmentName() != null)
            sb.append("AssignmentName: ").append(getAssignmentName()).append(",");
        if (getAssignmentId() != null)
            sb.append("AssignmentId: ").append(getAssignmentId()).append(",");
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: ").append(getAssignmentStatus()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getIdentities() != null)
            sb.append("Identities: ").append(getIdentities()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIAMPolicyAssignmentResult == false)
            return false;
        CreateIAMPolicyAssignmentResult other = (CreateIAMPolicyAssignmentResult) obj;
        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null && other.getAssignmentName().equals(this.getAssignmentName()) == false)
            return false;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getAssignmentStatus() == null ^ this.getAssignmentStatus() == null)
            return false;
        if (other.getAssignmentStatus() != null && other.getAssignmentStatus().equals(this.getAssignmentStatus()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getIdentities() == null ^ this.getIdentities() == null)
            return false;
        if (other.getIdentities() != null && other.getIdentities().equals(this.getIdentities()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateIAMPolicyAssignmentResult clone() {
        try {
            return (CreateIAMPolicyAssignmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

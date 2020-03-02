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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIAMPolicyAssignment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIAMPolicyAssignmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account where you want to assign an IAM policy to QuickSight users or groups.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The name of the assignment. It must be unique within an AWS account.
     * </p>
     */
    private String assignmentName;
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
     * The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * The QuickSight users, groups, or both that you want to assign the policy to.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> identities;
    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The ID of the AWS account where you want to assign an IAM policy to QuickSight users or groups.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you want to assign an IAM policy to QuickSight users or groups.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to assign an IAM policy to QuickSight users or groups.
     * </p>
     * 
     * @return The ID of the AWS account where you want to assign an IAM policy to QuickSight users or groups.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to assign an IAM policy to QuickSight users or groups.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you want to assign an IAM policy to QuickSight users or groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The name of the assignment. It must be unique within an AWS account.
     * </p>
     * 
     * @param assignmentName
     *        The name of the assignment. It must be unique within an AWS account.
     */

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * The name of the assignment. It must be unique within an AWS account.
     * </p>
     * 
     * @return The name of the assignment. It must be unique within an AWS account.
     */

    public String getAssignmentName() {
        return this.assignmentName;
    }

    /**
     * <p>
     * The name of the assignment. It must be unique within an AWS account.
     * </p>
     * 
     * @param assignmentName
     *        The name of the assignment. It must be unique within an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentRequest withAssignmentName(String assignmentName) {
        setAssignmentName(assignmentName);
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

    public CreateIAMPolicyAssignmentRequest withAssignmentStatus(String assignmentStatus) {
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

    public CreateIAMPolicyAssignmentRequest withAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
     * </p>
     * 
     * @param policyArn
     *        The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
     * </p>
     * 
     * @return The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
     * </p>
     * 
     * @param policyArn
     *        The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that you want to assign the policy to.
     * </p>
     * 
     * @return The QuickSight users, groups, or both that you want to assign the policy to.
     */

    public java.util.Map<String, java.util.List<String>> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that you want to assign the policy to.
     * </p>
     * 
     * @param identities
     *        The QuickSight users, groups, or both that you want to assign the policy to.
     */

    public void setIdentities(java.util.Map<String, java.util.List<String>> identities) {
        this.identities = identities;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that you want to assign the policy to.
     * </p>
     * 
     * @param identities
     *        The QuickSight users, groups, or both that you want to assign the policy to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentRequest withIdentities(java.util.Map<String, java.util.List<String>> identities) {
        setIdentities(identities);
        return this;
    }

    /**
     * Add a single Identities entry
     *
     * @see CreateIAMPolicyAssignmentRequest#withIdentities
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentRequest addIdentitiesEntry(String key, java.util.List<String> value) {
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

    public CreateIAMPolicyAssignmentRequest clearIdentitiesEntries() {
        this.identities = null;
        return this;
    }

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * 
     * @param namespace
     *        The namespace that contains the assignment.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * 
     * @return The namespace that contains the assignment.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * 
     * @param namespace
     *        The namespace that contains the assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIAMPolicyAssignmentRequest withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getAssignmentName() != null)
            sb.append("AssignmentName: ").append(getAssignmentName()).append(",");
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: ").append(getAssignmentStatus()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getIdentities() != null)
            sb.append("Identities: ").append(getIdentities()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIAMPolicyAssignmentRequest == false)
            return false;
        CreateIAMPolicyAssignmentRequest other = (CreateIAMPolicyAssignmentRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null && other.getAssignmentName().equals(this.getAssignmentName()) == false)
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
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public CreateIAMPolicyAssignmentRequest clone() {
        return (CreateIAMPolicyAssignmentRequest) super.clone();
    }

}

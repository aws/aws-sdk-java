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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An IAM policy assignment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/IAMPolicyAssignment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IAMPolicyAssignment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * Assignment ID.
     * </p>
     */
    private String assignmentId;
    /**
     * <p>
     * Assignment name.
     * </p>
     */
    private String assignmentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM policy.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * Identities.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> identities;
    /**
     * <p>
     * Assignment status.
     * </p>
     */
    private String assignmentStatus;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IAMPolicyAssignment withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * Assignment ID.
     * </p>
     * 
     * @param assignmentId
     *        Assignment ID.
     */

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * Assignment ID.
     * </p>
     * 
     * @return Assignment ID.
     */

    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * <p>
     * Assignment ID.
     * </p>
     * 
     * @param assignmentId
     *        Assignment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IAMPolicyAssignment withAssignmentId(String assignmentId) {
        setAssignmentId(assignmentId);
        return this;
    }

    /**
     * <p>
     * Assignment name.
     * </p>
     * 
     * @param assignmentName
     *        Assignment name.
     */

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * Assignment name.
     * </p>
     * 
     * @return Assignment name.
     */

    public String getAssignmentName() {
        return this.assignmentName;
    }

    /**
     * <p>
     * Assignment name.
     * </p>
     * 
     * @param assignmentName
     *        Assignment name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IAMPolicyAssignment withAssignmentName(String assignmentName) {
        setAssignmentName(assignmentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM policy.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) for the IAM policy.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the IAM policy.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM policy.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) for the IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IAMPolicyAssignment withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * Identities.
     * </p>
     * 
     * @return Identities.
     */

    public java.util.Map<String, java.util.List<String>> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * Identities.
     * </p>
     * 
     * @param identities
     *        Identities.
     */

    public void setIdentities(java.util.Map<String, java.util.List<String>> identities) {
        this.identities = identities;
    }

    /**
     * <p>
     * Identities.
     * </p>
     * 
     * @param identities
     *        Identities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IAMPolicyAssignment withIdentities(java.util.Map<String, java.util.List<String>> identities) {
        setIdentities(identities);
        return this;
    }

    /**
     * Add a single Identities entry
     *
     * @see IAMPolicyAssignment#withIdentities
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IAMPolicyAssignment addIdentitiesEntry(String key, java.util.List<String> value) {
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

    public IAMPolicyAssignment clearIdentitiesEntries() {
        this.identities = null;
        return this;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * 
     * @param assignmentStatus
     *        Assignment status.
     * @see AssignmentStatus
     */

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * 
     * @return Assignment status.
     * @see AssignmentStatus
     */

    public String getAssignmentStatus() {
        return this.assignmentStatus;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * 
     * @param assignmentStatus
     *        Assignment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public IAMPolicyAssignment withAssignmentStatus(String assignmentStatus) {
        setAssignmentStatus(assignmentStatus);
        return this;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * 
     * @param assignmentStatus
     *        Assignment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public IAMPolicyAssignment withAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
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
        if (getAssignmentId() != null)
            sb.append("AssignmentId: ").append(getAssignmentId()).append(",");
        if (getAssignmentName() != null)
            sb.append("AssignmentName: ").append(getAssignmentName()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getIdentities() != null)
            sb.append("Identities: ").append(getIdentities()).append(",");
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: ").append(getAssignmentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IAMPolicyAssignment == false)
            return false;
        IAMPolicyAssignment other = (IAMPolicyAssignment) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null && other.getAssignmentName().equals(this.getAssignmentName()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getIdentities() == null ^ this.getIdentities() == null)
            return false;
        if (other.getIdentities() != null && other.getIdentities().equals(this.getIdentities()) == false)
            return false;
        if (other.getAssignmentStatus() == null ^ this.getAssignmentStatus() == null)
            return false;
        if (other.getAssignmentStatus() != null && other.getAssignmentStatus().equals(this.getAssignmentStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        hashCode = prime * hashCode + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        return hashCode;
    }

    @Override
    public IAMPolicyAssignment clone() {
        try {
            return (IAMPolicyAssignment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.IAMPolicyAssignmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

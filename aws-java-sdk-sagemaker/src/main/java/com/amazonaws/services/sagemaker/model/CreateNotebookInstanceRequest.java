/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNotebookInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new notebook instance.
     * </p>
     */
    private String notebookInstanceName;
    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute instance.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role to
     * perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can perform
     * these tasks. The policy must allow the Amazon SageMaker service principal (sagemaker.amazonaws.com) permissions
     * to assume this role. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that
     * is attached to your notebook instance.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of tags to associate with the notebook instance. You can add tags later by using the
     * <code>CreateTags</code> API.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the new notebook instance.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the new notebook instance.
     */

    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the new notebook instance.
     * </p>
     * 
     * @return The name of the new notebook instance.
     */

    public String getNotebookInstanceName() {
        return this.notebookInstanceName;
    }

    /**
     * <p>
     * The name of the new notebook instance.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the new notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withNotebookInstanceName(String notebookInstanceName) {
        setNotebookInstanceName(notebookInstanceName);
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
     * </p>
     * 
     * @param instanceType
     *        The type of ML compute instance to launch for the notebook instance.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
     * </p>
     * 
     * @return The type of ML compute instance to launch for the notebook instance.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
     * </p>
     * 
     * @param instanceType
     *        The type of ML compute instance to launch for the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public CreateNotebookInstanceRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance to launch for the notebook instance.
     * </p>
     * 
     * @param instanceType
     *        The type of ML compute instance to launch for the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public CreateNotebookInstanceRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute
     *        instance.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute instance.
     * </p>
     * 
     * @return The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute
     *         instance.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     * 
     * @return The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as
     *         specified in the subnet.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     * 
     * @param securityGroupIds
     *        The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as
     *        specified in the subnet.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as
     *        specified in the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     * 
     * @param securityGroupIds
     *        The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as
     *        specified in the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role to
     * perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can perform
     * these tasks. The policy must allow the Amazon SageMaker service principal (sagemaker.amazonaws.com) permissions
     * to assume this role. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * 
     * @param roleArn
     *        When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role
     *        to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can
     *        perform these tasks. The policy must allow the Amazon SageMaker service principal
     *        (sagemaker.amazonaws.com) permissions to assume this role. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role to
     * perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can perform
     * these tasks. The policy must allow the Amazon SageMaker service principal (sagemaker.amazonaws.com) permissions
     * to assume this role. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * 
     * @return When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this
     *         role to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker
     *         can perform these tasks. The policy must allow the Amazon SageMaker service principal
     *         (sagemaker.amazonaws.com) permissions to assume this role. For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role to
     * perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can perform
     * these tasks. The policy must allow the Amazon SageMaker service principal (sagemaker.amazonaws.com) permissions
     * to assume this role. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * 
     * @param roleArn
     *        When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role
     *        to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can
     *        perform these tasks. The policy must allow the Amazon SageMaker service principal
     *        (sagemaker.amazonaws.com) permissions to assume this role. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that
     * is attached to your notebook instance.
     * </p>
     * 
     * @param kmsKeyId
     *        If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume
     *        that is attached to your notebook instance.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that
     * is attached to your notebook instance.
     * </p>
     * 
     * @return If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage
     *         volume that is attached to your notebook instance.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that
     * is attached to your notebook instance.
     * </p>
     * 
     * @param kmsKeyId
     *        If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume
     *        that is attached to your notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the notebook instance. You can add tags later by using the
     * <code>CreateTags</code> API.
     * </p>
     * 
     * @return A list of tags to associate with the notebook instance. You can add tags later by using the
     *         <code>CreateTags</code> API.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the notebook instance. You can add tags later by using the
     * <code>CreateTags</code> API.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the notebook instance. You can add tags later by using the
     *        <code>CreateTags</code> API.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to associate with the notebook instance. You can add tags later by using the
     * <code>CreateTags</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the notebook instance. You can add tags later by using the
     *        <code>CreateTags</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the notebook instance. You can add tags later by using the
     * <code>CreateTags</code> API.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the notebook instance. You can add tags later by using the
     *        <code>CreateTags</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNotebookInstanceName() != null)
            sb.append("NotebookInstanceName: ").append(getNotebookInstanceName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNotebookInstanceRequest == false)
            return false;
        CreateNotebookInstanceRequest other = (CreateNotebookInstanceRequest) obj;
        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateNotebookInstanceRequest clone() {
        return (CreateNotebookInstanceRequest) super.clone();
    }

}

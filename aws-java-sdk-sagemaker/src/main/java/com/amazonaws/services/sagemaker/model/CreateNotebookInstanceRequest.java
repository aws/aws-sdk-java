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
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     */
    private String roleArn;
    /**
     * <p>
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that
     * is attached to your notebook instance. The KMS key you provide must be enabled. For information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and Disabling Keys</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
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
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle
     * configurations, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step
     * 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     */
    private String lifecycleConfigName;
    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to
     * <code>Disabled</code> this notebook instance will be able to access resources only in your VPC, and will not be
     * able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your
     * VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the value of this parameter to
     * <code>Disabled</code> only if you set a value for the <code>SubnetId</code> parameter.
     * </p>
     */
    private String directInternetAccess;
    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * </p>
     */
    private Integer volumeSizeInGB;
    /**
     * <p>
     * A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only one
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;
    /**
     * <p>
     * A Git repository to associate with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     */
    private String defaultCodeRepository;
    /**
     * <p>
     * An array of up to three Git repositories to associate with the notebook instance. These can be either the names
     * of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating
     * Git Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     */
    private java.util.List<String> additionalCodeRepositories;
    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance. The default value is
     * <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle
     * configurations associated with a notebook instance always run with root access even if you disable root access
     * for users.
     * </p>
     * </note>
     */
    private String rootAccess;

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
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role
     *        to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can
     *        perform these tasks. The policy must allow the Amazon SageMaker service principal
     *        (sagemaker.amazonaws.com) permissions to assume this role. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *        </p> <note>
     *        <p>
     *        To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *        <code>iam:PassRole</code> permission.
     *        </p>
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
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @return When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this
     *         role to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker
     *         can perform these tasks. The policy must allow the Amazon SageMaker service principal
     *         (sagemaker.amazonaws.com) permissions to assume this role. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *         </p> <note>
     *         <p>
     *         To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *         <code>iam:PassRole</code> permission.
     *         </p>
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
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role
     *        to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can
     *        perform these tasks. The policy must allow the Amazon SageMaker service principal
     *        (sagemaker.amazonaws.com) permissions to assume this role. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *        </p> <note>
     *        <p>
     *        To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *        <code>iam:PassRole</code> permission.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that
     * is attached to your notebook instance. The KMS key you provide must be enabled. For information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and Disabling Keys</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume
     *        that is attached to your notebook instance. The KMS key you provide must be enabled. For information, see
     *        <a href="http://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and Disabling
     *        Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that
     * is attached to your notebook instance. The KMS key you provide must be enabled. For information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and Disabling Keys</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage
     *         volume that is attached to your notebook instance. The KMS key you provide must be enabled. For
     *         information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and Disabling
     *         Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that
     * is attached to your notebook instance. The KMS key you provide must be enabled. For information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and Disabling Keys</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume
     *        that is attached to your notebook instance. The KMS key you provide must be enabled. For information, see
     *        <a href="http://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and Disabling
     *        Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
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
     * <p>
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle
     * configurations, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step
     * 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param lifecycleConfigName
     *        The name of a lifecycle configuration to associate with the notebook instance. For information about
     *        lifestyle configurations, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     *        Customize a Notebook Instance</a>.
     */

    public void setLifecycleConfigName(String lifecycleConfigName) {
        this.lifecycleConfigName = lifecycleConfigName;
    }

    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle
     * configurations, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step
     * 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * 
     * @return The name of a lifecycle configuration to associate with the notebook instance. For information about
     *         lifestyle configurations, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1:
     *         (Optional) Customize a Notebook Instance</a>.
     */

    public String getLifecycleConfigName() {
        return this.lifecycleConfigName;
    }

    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle
     * configurations, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step
     * 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param lifecycleConfigName
     *        The name of a lifecycle configuration to associate with the notebook instance. For information about
     *        lifestyle configurations, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     *        Customize a Notebook Instance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withLifecycleConfigName(String lifecycleConfigName) {
        setLifecycleConfigName(lifecycleConfigName);
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to
     * <code>Disabled</code> this notebook instance will be able to access resources only in your VPC, and will not be
     * able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your
     * VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the value of this parameter to
     * <code>Disabled</code> only if you set a value for the <code>SubnetId</code> parameter.
     * </p>
     * 
     * @param directInternetAccess
     *        Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to
     *        <code>Disabled</code> this notebook instance will be able to access resources only in your VPC, and will
     *        not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT
     *        Gateway in your VPC.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *        >Notebook Instances Are Internet-Enabled by Default</a>. You can set the value of this parameter to
     *        <code>Disabled</code> only if you set a value for the <code>SubnetId</code> parameter.
     * @see DirectInternetAccess
     */

    public void setDirectInternetAccess(String directInternetAccess) {
        this.directInternetAccess = directInternetAccess;
    }

    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to
     * <code>Disabled</code> this notebook instance will be able to access resources only in your VPC, and will not be
     * able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your
     * VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the value of this parameter to
     * <code>Disabled</code> only if you set a value for the <code>SubnetId</code> parameter.
     * </p>
     * 
     * @return Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to
     *         <code>Disabled</code> this notebook instance will be able to access resources only in your VPC, and will
     *         not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT
     *         Gateway in your VPC.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *         >Notebook Instances Are Internet-Enabled by Default</a>. You can set the value of this parameter to
     *         <code>Disabled</code> only if you set a value for the <code>SubnetId</code> parameter.
     * @see DirectInternetAccess
     */

    public String getDirectInternetAccess() {
        return this.directInternetAccess;
    }

    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to
     * <code>Disabled</code> this notebook instance will be able to access resources only in your VPC, and will not be
     * able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your
     * VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the value of this parameter to
     * <code>Disabled</code> only if you set a value for the <code>SubnetId</code> parameter.
     * </p>
     * 
     * @param directInternetAccess
     *        Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to
     *        <code>Disabled</code> this notebook instance will be able to access resources only in your VPC, and will
     *        not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT
     *        Gateway in your VPC.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *        >Notebook Instances Are Internet-Enabled by Default</a>. You can set the value of this parameter to
     *        <code>Disabled</code> only if you set a value for the <code>SubnetId</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectInternetAccess
     */

    public CreateNotebookInstanceRequest withDirectInternetAccess(String directInternetAccess) {
        setDirectInternetAccess(directInternetAccess);
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to
     * <code>Disabled</code> this notebook instance will be able to access resources only in your VPC, and will not be
     * able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your
     * VPC.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>. You can set the value of this parameter to
     * <code>Disabled</code> only if you set a value for the <code>SubnetId</code> parameter.
     * </p>
     * 
     * @param directInternetAccess
     *        Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to
     *        <code>Disabled</code> this notebook instance will be able to access resources only in your VPC, and will
     *        not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT
     *        Gateway in your VPC.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *        >Notebook Instances Are Internet-Enabled by Default</a>. You can set the value of this parameter to
     *        <code>Disabled</code> only if you set a value for the <code>SubnetId</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectInternetAccess
     */

    public CreateNotebookInstanceRequest withDirectInternetAccess(DirectInternetAccess directInternetAccess) {
        this.directInternetAccess = directInternetAccess.toString();
        return this;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * </p>
     * 
     * @return The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
        return this;
    }

    /**
     * <p>
     * A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only one
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @return A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only
     *         one instance type can be associated with a notebook instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *         SageMaker</a>.
     * @see NotebookInstanceAcceleratorType
     */

    public java.util.List<String> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only one
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only
     *        one instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @see NotebookInstanceAcceleratorType
     */

    public void setAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        if (acceleratorTypes == null) {
            this.acceleratorTypes = null;
            return;
        }

        this.acceleratorTypes = new java.util.ArrayList<String>(acceleratorTypes);
    }

    /**
     * <p>
     * A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only one
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorTypes(java.util.Collection)} or {@link #withAcceleratorTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only
     *        one instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceAcceleratorType
     */

    public CreateNotebookInstanceRequest withAcceleratorTypes(String... acceleratorTypes) {
        if (this.acceleratorTypes == null) {
            setAcceleratorTypes(new java.util.ArrayList<String>(acceleratorTypes.length));
        }
        for (String ele : acceleratorTypes) {
            this.acceleratorTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only one
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only
     *        one instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceAcceleratorType
     */

    public CreateNotebookInstanceRequest withAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only one
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only
     *        one instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceAcceleratorType
     */

    public CreateNotebookInstanceRequest withAcceleratorTypes(NotebookInstanceAcceleratorType... acceleratorTypes) {
        java.util.ArrayList<String> acceleratorTypesCopy = new java.util.ArrayList<String>(acceleratorTypes.length);
        for (NotebookInstanceAcceleratorType value : acceleratorTypes) {
            acceleratorTypesCopy.add(value.toString());
        }
        if (getAcceleratorTypes() == null) {
            setAcceleratorTypes(acceleratorTypesCopy);
        } else {
            getAcceleratorTypes().addAll(acceleratorTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A Git repository to associate with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param defaultCodeRepository
     *        A Git repository to associate with the notebook instance as its default code repository. This can be
     *        either the name of a Git repository stored as a resource in your account, or the URL of a Git repository
     *        in <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in
     *        any other Git repository. When you open a notebook instance, it opens in the directory that contains this
     *        repository. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *        Amazon SageMaker Notebook Instances</a>.
     */

    public void setDefaultCodeRepository(String defaultCodeRepository) {
        this.defaultCodeRepository = defaultCodeRepository;
    }

    /**
     * <p>
     * A Git repository to associate with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @return A Git repository to associate with the notebook instance as its default code repository. This can be
     *         either the name of a Git repository stored as a resource in your account, or the URL of a Git repository
     *         in <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in
     *         any other Git repository. When you open a notebook instance, it opens in the directory that contains this
     *         repository. For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *         Amazon SageMaker Notebook Instances</a>.
     */

    public String getDefaultCodeRepository() {
        return this.defaultCodeRepository;
    }

    /**
     * <p>
     * A Git repository to associate with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param defaultCodeRepository
     *        A Git repository to associate with the notebook instance as its default code repository. This can be
     *        either the name of a Git repository stored as a resource in your account, or the URL of a Git repository
     *        in <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in
     *        any other Git repository. When you open a notebook instance, it opens in the directory that contains this
     *        repository. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *        Amazon SageMaker Notebook Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withDefaultCodeRepository(String defaultCodeRepository) {
        setDefaultCodeRepository(defaultCodeRepository);
        return this;
    }

    /**
     * <p>
     * An array of up to three Git repositories to associate with the notebook instance. These can be either the names
     * of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating
     * Git Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @return An array of up to three Git repositories to associate with the notebook instance. These can be either the
     *         names of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     *         href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *         other Git repository. These repositories are cloned at the same level as the default repository of your
     *         notebook instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *         Amazon SageMaker Notebook Instances</a>.
     */

    public java.util.List<String> getAdditionalCodeRepositories() {
        return additionalCodeRepositories;
    }

    /**
     * <p>
     * An array of up to three Git repositories to associate with the notebook instance. These can be either the names
     * of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating
     * Git Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param additionalCodeRepositories
     *        An array of up to three Git repositories to associate with the notebook instance. These can be either the
     *        names of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     *        href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *        other Git repository. These repositories are cloned at the same level as the default repository of your
     *        notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *        Amazon SageMaker Notebook Instances</a>.
     */

    public void setAdditionalCodeRepositories(java.util.Collection<String> additionalCodeRepositories) {
        if (additionalCodeRepositories == null) {
            this.additionalCodeRepositories = null;
            return;
        }

        this.additionalCodeRepositories = new java.util.ArrayList<String>(additionalCodeRepositories);
    }

    /**
     * <p>
     * An array of up to three Git repositories to associate with the notebook instance. These can be either the names
     * of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating
     * Git Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalCodeRepositories(java.util.Collection)} or
     * {@link #withAdditionalCodeRepositories(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalCodeRepositories
     *        An array of up to three Git repositories to associate with the notebook instance. These can be either the
     *        names of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     *        href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *        other Git repository. These repositories are cloned at the same level as the default repository of your
     *        notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *        Amazon SageMaker Notebook Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withAdditionalCodeRepositories(String... additionalCodeRepositories) {
        if (this.additionalCodeRepositories == null) {
            setAdditionalCodeRepositories(new java.util.ArrayList<String>(additionalCodeRepositories.length));
        }
        for (String ele : additionalCodeRepositories) {
            this.additionalCodeRepositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of up to three Git repositories to associate with the notebook instance. These can be either the names
     * of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating
     * Git Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param additionalCodeRepositories
     *        An array of up to three Git repositories to associate with the notebook instance. These can be either the
     *        names of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     *        href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *        other Git repository. These repositories are cloned at the same level as the default repository of your
     *        notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *        Amazon SageMaker Notebook Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceRequest withAdditionalCodeRepositories(java.util.Collection<String> additionalCodeRepositories) {
        setAdditionalCodeRepositories(additionalCodeRepositories);
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance. The default value is
     * <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle
     * configurations associated with a notebook instance always run with root access even if you disable root access
     * for users.
     * </p>
     * </note>
     * 
     * @param rootAccess
     *        Whether root access is enabled or disabled for users of the notebook instance. The default value is
     *        <code>Enabled</code>.</p> <note>
     *        <p>
     *        Lifecycle configurations need root access to be able to set up a notebook instance. Because of this,
     *        lifecycle configurations associated with a notebook instance always run with root access even if you
     *        disable root access for users.
     *        </p>
     * @see RootAccess
     */

    public void setRootAccess(String rootAccess) {
        this.rootAccess = rootAccess;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance. The default value is
     * <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle
     * configurations associated with a notebook instance always run with root access even if you disable root access
     * for users.
     * </p>
     * </note>
     * 
     * @return Whether root access is enabled or disabled for users of the notebook instance. The default value is
     *         <code>Enabled</code>.</p> <note>
     *         <p>
     *         Lifecycle configurations need root access to be able to set up a notebook instance. Because of this,
     *         lifecycle configurations associated with a notebook instance always run with root access even if you
     *         disable root access for users.
     *         </p>
     * @see RootAccess
     */

    public String getRootAccess() {
        return this.rootAccess;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance. The default value is
     * <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle
     * configurations associated with a notebook instance always run with root access even if you disable root access
     * for users.
     * </p>
     * </note>
     * 
     * @param rootAccess
     *        Whether root access is enabled or disabled for users of the notebook instance. The default value is
     *        <code>Enabled</code>.</p> <note>
     *        <p>
     *        Lifecycle configurations need root access to be able to set up a notebook instance. Because of this,
     *        lifecycle configurations associated with a notebook instance always run with root access even if you
     *        disable root access for users.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootAccess
     */

    public CreateNotebookInstanceRequest withRootAccess(String rootAccess) {
        setRootAccess(rootAccess);
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance. The default value is
     * <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle
     * configurations associated with a notebook instance always run with root access even if you disable root access
     * for users.
     * </p>
     * </note>
     * 
     * @param rootAccess
     *        Whether root access is enabled or disabled for users of the notebook instance. The default value is
     *        <code>Enabled</code>.</p> <note>
     *        <p>
     *        Lifecycle configurations need root access to be able to set up a notebook instance. Because of this,
     *        lifecycle configurations associated with a notebook instance always run with root access even if you
     *        disable root access for users.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootAccess
     */

    public CreateNotebookInstanceRequest withRootAccess(RootAccess rootAccess) {
        this.rootAccess = rootAccess.toString();
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
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLifecycleConfigName() != null)
            sb.append("LifecycleConfigName: ").append(getLifecycleConfigName()).append(",");
        if (getDirectInternetAccess() != null)
            sb.append("DirectInternetAccess: ").append(getDirectInternetAccess()).append(",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB()).append(",");
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: ").append(getAcceleratorTypes()).append(",");
        if (getDefaultCodeRepository() != null)
            sb.append("DefaultCodeRepository: ").append(getDefaultCodeRepository()).append(",");
        if (getAdditionalCodeRepositories() != null)
            sb.append("AdditionalCodeRepositories: ").append(getAdditionalCodeRepositories()).append(",");
        if (getRootAccess() != null)
            sb.append("RootAccess: ").append(getRootAccess());
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
        if (other.getLifecycleConfigName() == null ^ this.getLifecycleConfigName() == null)
            return false;
        if (other.getLifecycleConfigName() != null && other.getLifecycleConfigName().equals(this.getLifecycleConfigName()) == false)
            return false;
        if (other.getDirectInternetAccess() == null ^ this.getDirectInternetAccess() == null)
            return false;
        if (other.getDirectInternetAccess() != null && other.getDirectInternetAccess().equals(this.getDirectInternetAccess()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        if (other.getDefaultCodeRepository() == null ^ this.getDefaultCodeRepository() == null)
            return false;
        if (other.getDefaultCodeRepository() != null && other.getDefaultCodeRepository().equals(this.getDefaultCodeRepository()) == false)
            return false;
        if (other.getAdditionalCodeRepositories() == null ^ this.getAdditionalCodeRepositories() == null)
            return false;
        if (other.getAdditionalCodeRepositories() != null && other.getAdditionalCodeRepositories().equals(this.getAdditionalCodeRepositories()) == false)
            return false;
        if (other.getRootAccess() == null ^ this.getRootAccess() == null)
            return false;
        if (other.getRootAccess() != null && other.getRootAccess().equals(this.getRootAccess()) == false)
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
        hashCode = prime * hashCode + ((getLifecycleConfigName() == null) ? 0 : getLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getDirectInternetAccess() == null) ? 0 : getDirectInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime * hashCode + ((getDefaultCodeRepository() == null) ? 0 : getDefaultCodeRepository().hashCode());
        hashCode = prime * hashCode + ((getAdditionalCodeRepositories() == null) ? 0 : getAdditionalCodeRepositories().hashCode());
        hashCode = prime * hashCode + ((getRootAccess() == null) ? 0 : getRootAccess().hashCode());
        return hashCode;
    }

    @Override
    public CreateNotebookInstanceRequest clone() {
        return (CreateNotebookInstanceRequest) super.clone();
    }

}

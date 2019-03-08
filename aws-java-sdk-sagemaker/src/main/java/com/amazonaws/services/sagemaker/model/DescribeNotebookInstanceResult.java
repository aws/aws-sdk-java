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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNotebookInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     */
    private String notebookInstanceArn;
    /**
     * <p>
     * The name of the Amazon SageMaker notebook instance.
     * </p>
     */
    private String notebookInstanceName;
    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     */
    private String notebookInstanceStatus;
    /**
     * <p>
     * If status is <code>Failed</code>, the reason it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The ID of the VPC subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the instance.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the
     * instance.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The network interface IDs that Amazon SageMaker created at the time of creating the instance.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * A timestamp. Use this parameter to return the time when the notebook instance was created
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Returns the name of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>
     * </p>
     */
    private String notebookInstanceLifecycleConfigName;
    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set to
     * <i>Disabled</i>, the notebook instance does not have internet access, and cannot connect to Amazon SageMaker
     * training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     */
    private String directInternetAccess;
    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the notebook instance.
     * </p>
     */
    private Integer volumeSizeInGB;
    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;
    /**
     * <p>
     * The Git repository associated with the notebook instance as its default code repository. This can be either the
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
     * An array of up to three Git repositories associated with the notebook instance. These can be either the names of
     * Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating
     * Git Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     */
    private java.util.List<String> additionalCodeRepositories;
    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance.
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
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceArn
     *        The Amazon Resource Name (ARN) of the notebook instance.
     */

    public void setNotebookInstanceArn(String notebookInstanceArn) {
        this.notebookInstanceArn = notebookInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the notebook instance.
     */

    public String getNotebookInstanceArn() {
        return this.notebookInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceArn
     *        The Amazon Resource Name (ARN) of the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withNotebookInstanceArn(String notebookInstanceArn) {
        setNotebookInstanceArn(notebookInstanceArn);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker notebook instance.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the Amazon SageMaker notebook instance.
     */

    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker notebook instance.
     * </p>
     * 
     * @return The name of the Amazon SageMaker notebook instance.
     */

    public String getNotebookInstanceName() {
        return this.notebookInstanceName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker notebook instance.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the Amazon SageMaker notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withNotebookInstanceName(String notebookInstanceName) {
        setNotebookInstanceName(notebookInstanceName);
        return this;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceStatus
     *        The status of the notebook instance.
     * @see NotebookInstanceStatus
     */

    public void setNotebookInstanceStatus(String notebookInstanceStatus) {
        this.notebookInstanceStatus = notebookInstanceStatus;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * 
     * @return The status of the notebook instance.
     * @see NotebookInstanceStatus
     */

    public String getNotebookInstanceStatus() {
        return this.notebookInstanceStatus;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceStatus
     *        The status of the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceStatus
     */

    public DescribeNotebookInstanceResult withNotebookInstanceStatus(String notebookInstanceStatus) {
        setNotebookInstanceStatus(notebookInstanceStatus);
        return this;
    }

    /**
     * <p>
     * The status of the notebook instance.
     * </p>
     * 
     * @param notebookInstanceStatus
     *        The status of the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceStatus
     */

    public DescribeNotebookInstanceResult withNotebookInstanceStatus(NotebookInstanceStatus notebookInstanceStatus) {
        this.notebookInstanceStatus = notebookInstanceStatus.toString();
        return this;
    }

    /**
     * <p>
     * If status is <code>Failed</code>, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If status is <code>Failed</code>, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If status is <code>Failed</code>, the reason it failed.
     * </p>
     * 
     * @return If status is <code>Failed</code>, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If status is <code>Failed</code>, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If status is <code>Failed</code>, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * </p>
     * 
     * @param url
     *        The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * </p>
     * 
     * @return The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * </p>
     * 
     * @param url
     *        The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * 
     * @param instanceType
     *        The type of ML compute instance running on the notebook instance.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * 
     * @return The type of ML compute instance running on the notebook instance.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * 
     * @param instanceType
     *        The type of ML compute instance running on the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeNotebookInstanceResult withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The type of ML compute instance running on the notebook instance.
     * </p>
     * 
     * @param instanceType
     *        The type of ML compute instance running on the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeNotebookInstanceResult withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the VPC subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the VPC subnet.
     * </p>
     * 
     * @return The ID of the VPC subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the VPC subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the VPC subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     * 
     * @return The IDs of the VPC security groups.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the VPC security groups.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the VPC security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the VPC security groups.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the VPC security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the instance.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the instance.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role associated with the instance.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the instance.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the
     * instance.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached
     *        to the instance.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the
     * instance.
     * </p>
     * 
     * @return The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume
     *         attached to the instance.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the
     * instance.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached
     *        to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The network interface IDs that Amazon SageMaker created at the time of creating the instance.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface IDs that Amazon SageMaker created at the time of creating the instance.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface IDs that Amazon SageMaker created at the time of creating the instance.
     * </p>
     * 
     * @return The network interface IDs that Amazon SageMaker created at the time of creating the instance.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The network interface IDs that Amazon SageMaker created at the time of creating the instance.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface IDs that Amazon SageMaker created at the time of creating the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified.
     * </p>
     * 
     * @return A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to return the time when the notebook instance was created
     * </p>
     * 
     * @param creationTime
     *        A timestamp. Use this parameter to return the time when the notebook instance was created
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to return the time when the notebook instance was created
     * </p>
     * 
     * @return A timestamp. Use this parameter to return the time when the notebook instance was created
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp. Use this parameter to return the time when the notebook instance was created
     * </p>
     * 
     * @param creationTime
     *        A timestamp. Use this parameter to return the time when the notebook instance was created
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Returns the name of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigName
     *        Returns the name of a notebook instance lifecycle configuration.</p>
     *        <p>
     *        For information about notebook instance lifestyle configurations, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     *        Customize a Notebook Instance</a>
     */

    public void setNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * Returns the name of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>
     * </p>
     * 
     * @return Returns the name of a notebook instance lifecycle configuration.</p>
     *         <p>
     *         For information about notebook instance lifestyle configurations, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1:
     *         (Optional) Customize a Notebook Instance</a>
     */

    public String getNotebookInstanceLifecycleConfigName() {
        return this.notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * Returns the name of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigName
     *        Returns the name of a notebook instance lifecycle configuration.</p>
     *        <p>
     *        For information about notebook instance lifestyle configurations, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     *        Customize a Notebook Instance</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        setNotebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName);
        return this;
    }

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set to
     * <i>Disabled</i>, the notebook instance does not have internet access, and cannot connect to Amazon SageMaker
     * training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * 
     * @param directInternetAccess
     *        Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set
     *        to <i>Disabled</i>, the notebook instance does not have internet access, and cannot connect to Amazon
     *        SageMaker training and endpoint services.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *        >Notebook Instances Are Internet-Enabled by Default</a>.
     * @see DirectInternetAccess
     */

    public void setDirectInternetAccess(String directInternetAccess) {
        this.directInternetAccess = directInternetAccess;
    }

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set to
     * <i>Disabled</i>, the notebook instance does not have internet access, and cannot connect to Amazon SageMaker
     * training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * 
     * @return Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is
     *         set to <i>Disabled</i>, the notebook instance does not have internet access, and cannot connect to Amazon
     *         SageMaker training and endpoint services.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *         >Notebook Instances Are Internet-Enabled by Default</a>.
     * @see DirectInternetAccess
     */

    public String getDirectInternetAccess() {
        return this.directInternetAccess;
    }

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set to
     * <i>Disabled</i>, the notebook instance does not have internet access, and cannot connect to Amazon SageMaker
     * training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * 
     * @param directInternetAccess
     *        Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set
     *        to <i>Disabled</i>, the notebook instance does not have internet access, and cannot connect to Amazon
     *        SageMaker training and endpoint services.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *        >Notebook Instances Are Internet-Enabled by Default</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectInternetAccess
     */

    public DescribeNotebookInstanceResult withDirectInternetAccess(String directInternetAccess) {
        setDirectInternetAccess(directInternetAccess);
        return this;
    }

    /**
     * <p>
     * Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set to
     * <i>Disabled</i>, the notebook instance does not have internet access, and cannot connect to Amazon SageMaker
     * training and endpoint services.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     * >Notebook Instances Are Internet-Enabled by Default</a>.
     * </p>
     * 
     * @param directInternetAccess
     *        Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set
     *        to <i>Disabled</i>, the notebook instance does not have internet access, and cannot connect to Amazon
     *        SageMaker training and endpoint services.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/appendix-additional-considerations.html#appendix-notebook-and-internet-access"
     *        >Notebook Instances Are Internet-Enabled by Default</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectInternetAccess
     */

    public DescribeNotebookInstanceResult withDirectInternetAccess(DirectInternetAccess directInternetAccess) {
        this.directInternetAccess = directInternetAccess.toString();
        return this;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the notebook instance.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume attached to the notebook instance.
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the notebook instance.
     * </p>
     * 
     * @return The size, in GB, of the ML storage volume attached to the notebook instance.
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the notebook instance.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume attached to the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
        return this;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @return A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently
     *         only one EI instance type can be associated with a notebook instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *         SageMaker</a>.
     * @see NotebookInstanceAcceleratorType
     */

    public java.util.List<String> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only
     *        one EI instance type can be associated with a notebook instance. For more information, see <a
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
     * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI
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
     *        A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only
     *        one EI instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceAcceleratorType
     */

    public DescribeNotebookInstanceResult withAcceleratorTypes(String... acceleratorTypes) {
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
     * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only
     *        one EI instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceAcceleratorType
     */

    public DescribeNotebookInstanceResult withAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI
     * instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only
     *        one EI instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceAcceleratorType
     */

    public DescribeNotebookInstanceResult withAcceleratorTypes(NotebookInstanceAcceleratorType... acceleratorTypes) {
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
     * The Git repository associated with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param defaultCodeRepository
     *        The Git repository associated with the notebook instance as its default code repository. This can be
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
     * The Git repository associated with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @return The Git repository associated with the notebook instance as its default code repository. This can be
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
     * The Git repository associated with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param defaultCodeRepository
     *        The Git repository associated with the notebook instance as its default code repository. This can be
     *        either the name of a Git repository stored as a resource in your account, or the URL of a Git repository
     *        in <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in
     *        any other Git repository. When you open a notebook instance, it opens in the directory that contains this
     *        repository. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *        Amazon SageMaker Notebook Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withDefaultCodeRepository(String defaultCodeRepository) {
        setDefaultCodeRepository(defaultCodeRepository);
        return this;
    }

    /**
     * <p>
     * An array of up to three Git repositories associated with the notebook instance. These can be either the names of
     * Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating
     * Git Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @return An array of up to three Git repositories associated with the notebook instance. These can be either the
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
     * An array of up to three Git repositories associated with the notebook instance. These can be either the names of
     * Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating
     * Git Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param additionalCodeRepositories
     *        An array of up to three Git repositories associated with the notebook instance. These can be either the
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
     * An array of up to three Git repositories associated with the notebook instance. These can be either the names of
     * Git repositories stored as resources in your account, or the URL of Git repositories in <a
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
     *        An array of up to three Git repositories associated with the notebook instance. These can be either the
     *        names of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     *        href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *        other Git repository. These repositories are cloned at the same level as the default repository of your
     *        notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *        Amazon SageMaker Notebook Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withAdditionalCodeRepositories(String... additionalCodeRepositories) {
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
     * An array of up to three Git repositories associated with the notebook instance. These can be either the names of
     * Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating
     * Git Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param additionalCodeRepositories
     *        An array of up to three Git repositories associated with the notebook instance. These can be either the
     *        names of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     *        href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *        other Git repository. These repositories are cloned at the same level as the default repository of your
     *        notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *        Amazon SageMaker Notebook Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotebookInstanceResult withAdditionalCodeRepositories(java.util.Collection<String> additionalCodeRepositories) {
        setAdditionalCodeRepositories(additionalCodeRepositories);
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance.
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
     *        Whether root access is enabled or disabled for users of the notebook instance.</p> <note>
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
     * Whether root access is enabled or disabled for users of the notebook instance.
     * </p>
     * <note>
     * <p>
     * Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle
     * configurations associated with a notebook instance always run with root access even if you disable root access
     * for users.
     * </p>
     * </note>
     * 
     * @return Whether root access is enabled or disabled for users of the notebook instance.</p> <note>
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
     * Whether root access is enabled or disabled for users of the notebook instance.
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
     *        Whether root access is enabled or disabled for users of the notebook instance.</p> <note>
     *        <p>
     *        Lifecycle configurations need root access to be able to set up a notebook instance. Because of this,
     *        lifecycle configurations associated with a notebook instance always run with root access even if you
     *        disable root access for users.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootAccess
     */

    public DescribeNotebookInstanceResult withRootAccess(String rootAccess) {
        setRootAccess(rootAccess);
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance.
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
     *        Whether root access is enabled or disabled for users of the notebook instance.</p> <note>
     *        <p>
     *        Lifecycle configurations need root access to be able to set up a notebook instance. Because of this,
     *        lifecycle configurations associated with a notebook instance always run with root access even if you
     *        disable root access for users.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootAccess
     */

    public DescribeNotebookInstanceResult withRootAccess(RootAccess rootAccess) {
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
        if (getNotebookInstanceArn() != null)
            sb.append("NotebookInstanceArn: ").append(getNotebookInstanceArn()).append(",");
        if (getNotebookInstanceName() != null)
            sb.append("NotebookInstanceName: ").append(getNotebookInstanceName()).append(",");
        if (getNotebookInstanceStatus() != null)
            sb.append("NotebookInstanceStatus: ").append(getNotebookInstanceStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getNotebookInstanceLifecycleConfigName() != null)
            sb.append("NotebookInstanceLifecycleConfigName: ").append(getNotebookInstanceLifecycleConfigName()).append(",");
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

        if (obj instanceof DescribeNotebookInstanceResult == false)
            return false;
        DescribeNotebookInstanceResult other = (DescribeNotebookInstanceResult) obj;
        if (other.getNotebookInstanceArn() == null ^ this.getNotebookInstanceArn() == null)
            return false;
        if (other.getNotebookInstanceArn() != null && other.getNotebookInstanceArn().equals(this.getNotebookInstanceArn()) == false)
            return false;
        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getNotebookInstanceStatus() == null ^ this.getNotebookInstanceStatus() == null)
            return false;
        if (other.getNotebookInstanceStatus() != null && other.getNotebookInstanceStatus().equals(this.getNotebookInstanceStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() == null ^ this.getNotebookInstanceLifecycleConfigName() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() != null
                && other.getNotebookInstanceLifecycleConfigName().equals(this.getNotebookInstanceLifecycleConfigName()) == false)
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

        hashCode = prime * hashCode + ((getNotebookInstanceArn() == null) ? 0 : getNotebookInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceStatus() == null) ? 0 : getNotebookInstanceStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceLifecycleConfigName() == null) ? 0 : getNotebookInstanceLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getDirectInternetAccess() == null) ? 0 : getDirectInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime * hashCode + ((getDefaultCodeRepository() == null) ? 0 : getDefaultCodeRepository().hashCode());
        hashCode = prime * hashCode + ((getAdditionalCodeRepositories() == null) ? 0 : getAdditionalCodeRepositories().hashCode());
        hashCode = prime * hashCode + ((getRootAccess() == null) ? 0 : getRootAccess().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNotebookInstanceResult clone() {
        try {
            return (DescribeNotebookInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

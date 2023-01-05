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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Amazon SageMaker notebook instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsSageMakerNotebookInstanceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSageMakerNotebookInstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently, only one
     * instance type can be associated with a notebook instance.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;
    /**
     * <p>
     * An array of up to three Git repositories associated with the notebook instance. These can be either the names of
     * Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository. These repositories are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     * SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> additionalCodeRepositories;
    /**
     * <p>
     * The Git repository associated with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * repositories with SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     */
    private String defaultCodeRepository;
    /**
     * <p>
     * Sets whether SageMaker provides internet access to the notebook instance. If you set this to
     * <code>Disabled</code>, this notebook instance is able to access resources only in your VPC, and is not be able to
     * connect to SageMaker training and endpoint services unless you configure a Network Address Translation (NAT)
     * Gateway in your VPC.
     * </p>
     */
    private String directInternetAccess;
    /**
     * <p>
     * If status of the instance is <code>Failed</code>, the reason it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Information on the IMDS configuration of the notebook instance.
     * </p>
     */
    private AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails instanceMetadataServiceConfiguration;
    /**
     * <p>
     * The type of machine learning (ML) compute instance to launch for the notebook instance.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Key Management Service (KMS) key that SageMaker uses to encrypt data on the
     * storage volume attached to your notebook instance. The KMS key you provide must be enabled. For information, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and disabling
     * keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The network interface ID that SageMaker created when the instance was created.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook instance.
     * </p>
     */
    private String notebookInstanceArn;
    /**
     * <p>
     * The name of a notebook instance lifecycle configuration.
     * </p>
     */
    private String notebookInstanceLifecycleConfigName;
    /**
     * <p>
     * The name of the new notebook instance.
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
     * The platform identifier of the notebook instance runtime environment.
     * </p>
     */
    private String platformIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the instance.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance.
     * </p>
     */
    private String rootAccess;
    /**
     * <p>
     * The VPC security group IDs.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The ID of the VPC subnet to which you have a connectivity from your ML compute instance.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook instance.
     * </p>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently, only one
     * instance type can be associated with a notebook instance.
     * </p>
     * 
     * @return A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently,
     *         only one instance type can be associated with a notebook instance.
     */

    public java.util.List<String> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently, only one
     * instance type can be associated with a notebook instance.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently, only
     *        one instance type can be associated with a notebook instance.
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
     * A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently, only one
     * instance type can be associated with a notebook instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorTypes(java.util.Collection)} or {@link #withAcceleratorTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently, only
     *        one instance type can be associated with a notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withAcceleratorTypes(String... acceleratorTypes) {
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
     * A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently, only one
     * instance type can be associated with a notebook instance.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently, only
     *        one instance type can be associated with a notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * An array of up to three Git repositories associated with the notebook instance. These can be either the names of
     * Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository. These repositories are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     * SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * 
     * @return An array of up to three Git repositories associated with the notebook instance. These can be either the
     *         names of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *         other Git repository. These repositories are cloned at the same level as the default repository of your
     *         notebook instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories
     *         with SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     */

    public java.util.List<String> getAdditionalCodeRepositories() {
        return additionalCodeRepositories;
    }

    /**
     * <p>
     * An array of up to three Git repositories associated with the notebook instance. These can be either the names of
     * Git repositories stored as resources in your account, or the URL of Git repositories in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository. These repositories are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     * SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * 
     * @param additionalCodeRepositories
     *        An array of up to three Git repositories associated with the notebook instance. These can be either the
     *        names of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     *        href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *        other Git repository. These repositories are cloned at the same level as the default repository of your
     *        notebook instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     *        SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
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
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository. These repositories are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     * SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
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
     *        href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *        other Git repository. These repositories are cloned at the same level as the default repository of your
     *        notebook instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     *        SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withAdditionalCodeRepositories(String... additionalCodeRepositories) {
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
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository. These repositories are cloned at the same level as the default repository of your notebook
     * instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     * SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * 
     * @param additionalCodeRepositories
     *        An array of up to three Git repositories associated with the notebook instance. These can be either the
     *        names of Git repositories stored as resources in your account, or the URL of Git repositories in <a
     *        href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any
     *        other Git repository. These repositories are cloned at the same level as the default repository of your
     *        notebook instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     *        SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withAdditionalCodeRepositories(java.util.Collection<String> additionalCodeRepositories) {
        setAdditionalCodeRepositories(additionalCodeRepositories);
        return this;
    }

    /**
     * <p>
     * The Git repository associated with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * repositories with SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * 
     * @param defaultCodeRepository
     *        The Git repository associated with the notebook instance as its default code repository. This can be
     *        either the name of a Git repository stored as a resource in your account, or the URL of a Git repository
     *        in <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in
     *        any other Git repository. When you open a notebook instance, it opens in the directory that contains this
     *        repository. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     *        SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     */

    public void setDefaultCodeRepository(String defaultCodeRepository) {
        this.defaultCodeRepository = defaultCodeRepository;
    }

    /**
     * <p>
     * The Git repository associated with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * repositories with SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * 
     * @return The Git repository associated with the notebook instance as its default code repository. This can be
     *         either the name of a Git repository stored as a resource in your account, or the URL of a Git repository
     *         in <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or
     *         in any other Git repository. When you open a notebook instance, it opens in the directory that contains
     *         this repository. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories
     *         with SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     */

    public String getDefaultCodeRepository() {
        return this.defaultCodeRepository;
    }

    /**
     * <p>
     * The Git repository associated with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For
     * more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * repositories with SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * </p>
     * 
     * @param defaultCodeRepository
     *        The Git repository associated with the notebook instance as its default code repository. This can be
     *        either the name of a Git repository stored as a resource in your account, or the URL of a Git repository
     *        in <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in
     *        any other Git repository. When you open a notebook instance, it opens in the directory that contains this
     *        repository. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git repositories with
     *        SageMaker notebook instances</a> in the <i>Amazon SageMaker Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withDefaultCodeRepository(String defaultCodeRepository) {
        setDefaultCodeRepository(defaultCodeRepository);
        return this;
    }

    /**
     * <p>
     * Sets whether SageMaker provides internet access to the notebook instance. If you set this to
     * <code>Disabled</code>, this notebook instance is able to access resources only in your VPC, and is not be able to
     * connect to SageMaker training and endpoint services unless you configure a Network Address Translation (NAT)
     * Gateway in your VPC.
     * </p>
     * 
     * @param directInternetAccess
     *        Sets whether SageMaker provides internet access to the notebook instance. If you set this to
     *        <code>Disabled</code>, this notebook instance is able to access resources only in your VPC, and is not be
     *        able to connect to SageMaker training and endpoint services unless you configure a Network Address
     *        Translation (NAT) Gateway in your VPC.
     */

    public void setDirectInternetAccess(String directInternetAccess) {
        this.directInternetAccess = directInternetAccess;
    }

    /**
     * <p>
     * Sets whether SageMaker provides internet access to the notebook instance. If you set this to
     * <code>Disabled</code>, this notebook instance is able to access resources only in your VPC, and is not be able to
     * connect to SageMaker training and endpoint services unless you configure a Network Address Translation (NAT)
     * Gateway in your VPC.
     * </p>
     * 
     * @return Sets whether SageMaker provides internet access to the notebook instance. If you set this to
     *         <code>Disabled</code>, this notebook instance is able to access resources only in your VPC, and is not be
     *         able to connect to SageMaker training and endpoint services unless you configure a Network Address
     *         Translation (NAT) Gateway in your VPC.
     */

    public String getDirectInternetAccess() {
        return this.directInternetAccess;
    }

    /**
     * <p>
     * Sets whether SageMaker provides internet access to the notebook instance. If you set this to
     * <code>Disabled</code>, this notebook instance is able to access resources only in your VPC, and is not be able to
     * connect to SageMaker training and endpoint services unless you configure a Network Address Translation (NAT)
     * Gateway in your VPC.
     * </p>
     * 
     * @param directInternetAccess
     *        Sets whether SageMaker provides internet access to the notebook instance. If you set this to
     *        <code>Disabled</code>, this notebook instance is able to access resources only in your VPC, and is not be
     *        able to connect to SageMaker training and endpoint services unless you configure a Network Address
     *        Translation (NAT) Gateway in your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withDirectInternetAccess(String directInternetAccess) {
        setDirectInternetAccess(directInternetAccess);
        return this;
    }

    /**
     * <p>
     * If status of the instance is <code>Failed</code>, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If status of the instance is <code>Failed</code>, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If status of the instance is <code>Failed</code>, the reason it failed.
     * </p>
     * 
     * @return If status of the instance is <code>Failed</code>, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If status of the instance is <code>Failed</code>, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If status of the instance is <code>Failed</code>, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Information on the IMDS configuration of the notebook instance.
     * </p>
     * 
     * @param instanceMetadataServiceConfiguration
     *        Information on the IMDS configuration of the notebook instance.
     */

    public void setInstanceMetadataServiceConfiguration(AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails instanceMetadataServiceConfiguration) {
        this.instanceMetadataServiceConfiguration = instanceMetadataServiceConfiguration;
    }

    /**
     * <p>
     * Information on the IMDS configuration of the notebook instance.
     * </p>
     * 
     * @return Information on the IMDS configuration of the notebook instance.
     */

    public AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails getInstanceMetadataServiceConfiguration() {
        return this.instanceMetadataServiceConfiguration;
    }

    /**
     * <p>
     * Information on the IMDS configuration of the notebook instance.
     * </p>
     * 
     * @param instanceMetadataServiceConfiguration
     *        Information on the IMDS configuration of the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withInstanceMetadataServiceConfiguration(
            AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails instanceMetadataServiceConfiguration) {
        setInstanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of machine learning (ML) compute instance to launch for the notebook instance.
     * </p>
     * 
     * @param instanceType
     *        The type of machine learning (ML) compute instance to launch for the notebook instance.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of machine learning (ML) compute instance to launch for the notebook instance.
     * </p>
     * 
     * @return The type of machine learning (ML) compute instance to launch for the notebook instance.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of machine learning (ML) compute instance to launch for the notebook instance.
     * </p>
     * 
     * @param instanceType
     *        The type of machine learning (ML) compute instance to launch for the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Key Management Service (KMS) key that SageMaker uses to encrypt data on the
     * storage volume attached to your notebook instance. The KMS key you provide must be enabled. For information, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and disabling
     * keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of an Key Management Service (KMS) key that SageMaker uses to encrypt data
     *        on the storage volume attached to your notebook instance. The KMS key you provide must be enabled. For
     *        information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and disabling
     *        keys</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Key Management Service (KMS) key that SageMaker uses to encrypt data on the
     * storage volume attached to your notebook instance. The KMS key you provide must be enabled. For information, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and disabling
     * keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Key Management Service (KMS) key that SageMaker uses to encrypt data
     *         on the storage volume attached to your notebook instance. The KMS key you provide must be enabled. For
     *         information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and disabling
     *         keys</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Key Management Service (KMS) key that SageMaker uses to encrypt data on the
     * storage volume attached to your notebook instance. The KMS key you provide must be enabled. For information, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and disabling
     * keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of an Key Management Service (KMS) key that SageMaker uses to encrypt data
     *        on the storage volume attached to your notebook instance. The KMS key you provide must be enabled. For
     *        information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/enabling-keys.html">Enabling and disabling
     *        keys</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The network interface ID that SageMaker created when the instance was created.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID that SageMaker created when the instance was created.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID that SageMaker created when the instance was created.
     * </p>
     * 
     * @return The network interface ID that SageMaker created when the instance was created.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID that SageMaker created when the instance was created.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID that SageMaker created when the instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

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

    public AwsSageMakerNotebookInstanceDetails withNotebookInstanceArn(String notebookInstanceArn) {
        setNotebookInstanceArn(notebookInstanceArn);
        return this;
    }

    /**
     * <p>
     * The name of a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigName
     *        The name of a notebook instance lifecycle configuration.
     */

    public void setNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of a notebook instance lifecycle configuration.
     * </p>
     * 
     * @return The name of a notebook instance lifecycle configuration.
     */

    public String getNotebookInstanceLifecycleConfigName() {
        return this.notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigName
     *        The name of a notebook instance lifecycle configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        setNotebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName);
        return this;
    }

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

    public AwsSageMakerNotebookInstanceDetails withNotebookInstanceName(String notebookInstanceName) {
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
     */

    public AwsSageMakerNotebookInstanceDetails withNotebookInstanceStatus(String notebookInstanceStatus) {
        setNotebookInstanceStatus(notebookInstanceStatus);
        return this;
    }

    /**
     * <p>
     * The platform identifier of the notebook instance runtime environment.
     * </p>
     * 
     * @param platformIdentifier
     *        The platform identifier of the notebook instance runtime environment.
     */

    public void setPlatformIdentifier(String platformIdentifier) {
        this.platformIdentifier = platformIdentifier;
    }

    /**
     * <p>
     * The platform identifier of the notebook instance runtime environment.
     * </p>
     * 
     * @return The platform identifier of the notebook instance runtime environment.
     */

    public String getPlatformIdentifier() {
        return this.platformIdentifier;
    }

    /**
     * <p>
     * The platform identifier of the notebook instance runtime environment.
     * </p>
     * 
     * @param platformIdentifier
     *        The platform identifier of the notebook instance runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withPlatformIdentifier(String platformIdentifier) {
        setPlatformIdentifier(platformIdentifier);
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

    public AwsSageMakerNotebookInstanceDetails withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance.
     * </p>
     * 
     * @param rootAccess
     *        Whether root access is enabled or disabled for users of the notebook instance.
     */

    public void setRootAccess(String rootAccess) {
        this.rootAccess = rootAccess;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance.
     * </p>
     * 
     * @return Whether root access is enabled or disabled for users of the notebook instance.
     */

    public String getRootAccess() {
        return this.rootAccess;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance.
     * </p>
     * 
     * @param rootAccess
     *        Whether root access is enabled or disabled for users of the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withRootAccess(String rootAccess) {
        setRootAccess(rootAccess);
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs.
     * </p>
     * 
     * @return The VPC security group IDs.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The VPC security group IDs.
     * </p>
     * 
     * @param securityGroups
     *        The VPC security group IDs.
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
     * The VPC security group IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The VPC security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withSecurityGroups(String... securityGroups) {
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
     * The VPC security group IDs.
     * </p>
     * 
     * @param securityGroups
     *        The VPC security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC subnet to which you have a connectivity from your ML compute instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the VPC subnet to which you have a connectivity from your ML compute instance.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the VPC subnet to which you have a connectivity from your ML compute instance.
     * </p>
     * 
     * @return The ID of the VPC subnet to which you have a connectivity from your ML compute instance.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the VPC subnet to which you have a connectivity from your ML compute instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the VPC subnet to which you have a connectivity from your ML compute instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withSubnetId(String subnetId) {
        setSubnetId(subnetId);
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

    public AwsSageMakerNotebookInstanceDetails withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook instance.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume to attach to the notebook instance.
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook instance.
     * </p>
     * 
     * @return The size, in GB, of the ML storage volume to attach to the notebook instance.
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook instance.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume to attach to the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceDetails withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
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
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: ").append(getAcceleratorTypes()).append(",");
        if (getAdditionalCodeRepositories() != null)
            sb.append("AdditionalCodeRepositories: ").append(getAdditionalCodeRepositories()).append(",");
        if (getDefaultCodeRepository() != null)
            sb.append("DefaultCodeRepository: ").append(getDefaultCodeRepository()).append(",");
        if (getDirectInternetAccess() != null)
            sb.append("DirectInternetAccess: ").append(getDirectInternetAccess()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getInstanceMetadataServiceConfiguration() != null)
            sb.append("InstanceMetadataServiceConfiguration: ").append(getInstanceMetadataServiceConfiguration()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getNotebookInstanceArn() != null)
            sb.append("NotebookInstanceArn: ").append(getNotebookInstanceArn()).append(",");
        if (getNotebookInstanceLifecycleConfigName() != null)
            sb.append("NotebookInstanceLifecycleConfigName: ").append(getNotebookInstanceLifecycleConfigName()).append(",");
        if (getNotebookInstanceName() != null)
            sb.append("NotebookInstanceName: ").append(getNotebookInstanceName()).append(",");
        if (getNotebookInstanceStatus() != null)
            sb.append("NotebookInstanceStatus: ").append(getNotebookInstanceStatus()).append(",");
        if (getPlatformIdentifier() != null)
            sb.append("PlatformIdentifier: ").append(getPlatformIdentifier()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRootAccess() != null)
            sb.append("RootAccess: ").append(getRootAccess()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSageMakerNotebookInstanceDetails == false)
            return false;
        AwsSageMakerNotebookInstanceDetails other = (AwsSageMakerNotebookInstanceDetails) obj;
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        if (other.getAdditionalCodeRepositories() == null ^ this.getAdditionalCodeRepositories() == null)
            return false;
        if (other.getAdditionalCodeRepositories() != null && other.getAdditionalCodeRepositories().equals(this.getAdditionalCodeRepositories()) == false)
            return false;
        if (other.getDefaultCodeRepository() == null ^ this.getDefaultCodeRepository() == null)
            return false;
        if (other.getDefaultCodeRepository() != null && other.getDefaultCodeRepository().equals(this.getDefaultCodeRepository()) == false)
            return false;
        if (other.getDirectInternetAccess() == null ^ this.getDirectInternetAccess() == null)
            return false;
        if (other.getDirectInternetAccess() != null && other.getDirectInternetAccess().equals(this.getDirectInternetAccess()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getInstanceMetadataServiceConfiguration() == null ^ this.getInstanceMetadataServiceConfiguration() == null)
            return false;
        if (other.getInstanceMetadataServiceConfiguration() != null
                && other.getInstanceMetadataServiceConfiguration().equals(this.getInstanceMetadataServiceConfiguration()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNotebookInstanceArn() == null ^ this.getNotebookInstanceArn() == null)
            return false;
        if (other.getNotebookInstanceArn() != null && other.getNotebookInstanceArn().equals(this.getNotebookInstanceArn()) == false)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() == null ^ this.getNotebookInstanceLifecycleConfigName() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() != null
                && other.getNotebookInstanceLifecycleConfigName().equals(this.getNotebookInstanceLifecycleConfigName()) == false)
            return false;
        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getNotebookInstanceStatus() == null ^ this.getNotebookInstanceStatus() == null)
            return false;
        if (other.getNotebookInstanceStatus() != null && other.getNotebookInstanceStatus().equals(this.getNotebookInstanceStatus()) == false)
            return false;
        if (other.getPlatformIdentifier() == null ^ this.getPlatformIdentifier() == null)
            return false;
        if (other.getPlatformIdentifier() != null && other.getPlatformIdentifier().equals(this.getPlatformIdentifier()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRootAccess() == null ^ this.getRootAccess() == null)
            return false;
        if (other.getRootAccess() != null && other.getRootAccess().equals(this.getRootAccess()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime * hashCode + ((getAdditionalCodeRepositories() == null) ? 0 : getAdditionalCodeRepositories().hashCode());
        hashCode = prime * hashCode + ((getDefaultCodeRepository() == null) ? 0 : getDefaultCodeRepository().hashCode());
        hashCode = prime * hashCode + ((getDirectInternetAccess() == null) ? 0 : getDirectInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getInstanceMetadataServiceConfiguration() == null) ? 0 : getInstanceMetadataServiceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceArn() == null) ? 0 : getNotebookInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceLifecycleConfigName() == null) ? 0 : getNotebookInstanceLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceStatus() == null) ? 0 : getNotebookInstanceStatus().hashCode());
        hashCode = prime * hashCode + ((getPlatformIdentifier() == null) ? 0 : getPlatformIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRootAccess() == null) ? 0 : getRootAccess().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        return hashCode;
    }

    @Override
    public AwsSageMakerNotebookInstanceDetails clone() {
        try {
            return (AwsSageMakerNotebookInstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsSageMakerNotebookInstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

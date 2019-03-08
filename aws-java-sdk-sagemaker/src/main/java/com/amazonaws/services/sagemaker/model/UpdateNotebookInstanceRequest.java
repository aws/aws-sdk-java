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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNotebookInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     */
    private String notebookInstanceName;
    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance.
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
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
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle
     * configurations, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step
     * 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     */
    private String lifecycleConfigName;
    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     */
    private Boolean disassociateLifecycleConfig;
    /**
     * <p>
     * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * </p>
     */
    private Integer volumeSizeInGB;
    /**
     * <p>
     * The Git repository to associate with the notebook instance as its default code repository. This can be either the
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
     * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one
     * EI instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;
    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
     * </p>
     */
    private Boolean disassociateAcceleratorTypes;
    /**
     * <p>
     * The name or URL of the default Git repository to remove from this notebook instance.
     * </p>
     */
    private Boolean disassociateDefaultCodeRepository;
    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from this notebook instance.
     * </p>
     */
    private Boolean disassociateAdditionalCodeRepositories;
    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance. The default value is
     * <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you set this to <code>Disabled</code>, users don't have root access on the notebook instance, but lifecycle
     * configuration scripts still run with root permissions.
     * </p>
     * </note>
     */
    private String rootAccess;

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the notebook instance to update.
     */

    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     * 
     * @return The name of the notebook instance to update.
     */

    public String getNotebookInstanceName() {
        return this.notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the notebook instance to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withNotebookInstanceName(String notebookInstanceName) {
        setNotebookInstanceName(notebookInstanceName);
        return this;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The Amazon ML compute instance type.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     * 
     * @return The Amazon ML compute instance type.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The Amazon ML compute instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public UpdateNotebookInstanceRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The Amazon ML compute instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public UpdateNotebookInstanceRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance.
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook
     *        instance. For more information, see <a
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
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance.
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook
     *         instance. For more information, see <a
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
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance.
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook
     *        instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *        </p> <note>
     *        <p>
     *        To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *        <code>iam:PassRole</code> permission.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public UpdateNotebookInstanceRequest withLifecycleConfigName(String lifecycleConfigName) {
        setLifecycleConfigName(lifecycleConfigName);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     * 
     * @param disassociateLifecycleConfig
     *        Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with
     *        the notebook instance.
     */

    public void setDisassociateLifecycleConfig(Boolean disassociateLifecycleConfig) {
        this.disassociateLifecycleConfig = disassociateLifecycleConfig;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     * 
     * @return Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated
     *         with the notebook instance.
     */

    public Boolean getDisassociateLifecycleConfig() {
        return this.disassociateLifecycleConfig;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     * 
     * @param disassociateLifecycleConfig
     *        Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with
     *        the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withDisassociateLifecycleConfig(Boolean disassociateLifecycleConfig) {
        setDisassociateLifecycleConfig(disassociateLifecycleConfig);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     * 
     * @return Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated
     *         with the notebook instance.
     */

    public Boolean isDisassociateLifecycleConfig() {
        return this.disassociateLifecycleConfig;
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

    public UpdateNotebookInstanceRequest withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
        return this;
    }

    /**
     * <p>
     * The Git repository to associate with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param defaultCodeRepository
     *        The Git repository to associate with the notebook instance as its default code repository. This can be
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
     * The Git repository to associate with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @return The Git repository to associate with the notebook instance as its default code repository. This can be
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
     * The Git repository to associate with the notebook instance as its default code repository. This can be either the
     * name of a Git repository stored as a resource in your account, or the URL of a Git repository in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository. When you open a notebook instance, it opens in the directory that contains this repository. For more
     * information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git
     * Repositories with Amazon SageMaker Notebook Instances</a>.
     * </p>
     * 
     * @param defaultCodeRepository
     *        The Git repository to associate with the notebook instance as its default code repository. This can be
     *        either the name of a Git repository stored as a resource in your account, or the URL of a Git repository
     *        in <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in
     *        any other Git repository. When you open a notebook instance, it opens in the directory that contains this
     *        repository. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/nbi-git-repo.html">Associating Git Repositories with
     *        Amazon SageMaker Notebook Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withDefaultCodeRepository(String defaultCodeRepository) {
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

    public UpdateNotebookInstanceRequest withAdditionalCodeRepositories(String... additionalCodeRepositories) {
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

    public UpdateNotebookInstanceRequest withAdditionalCodeRepositories(java.util.Collection<String> additionalCodeRepositories) {
        setAdditionalCodeRepositories(additionalCodeRepositories);
        return this;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one
     * EI instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @return A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently
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
     * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one
     * EI instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently
     *        only one EI instance type can be associated with a notebook instance. For more information, see <a
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
     * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one
     * EI instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorTypes(java.util.Collection)} or {@link #withAcceleratorTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently
     *        only one EI instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceAcceleratorType
     */

    public UpdateNotebookInstanceRequest withAcceleratorTypes(String... acceleratorTypes) {
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
     * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one
     * EI instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently
     *        only one EI instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceAcceleratorType
     */

    public UpdateNotebookInstanceRequest withAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one
     * EI instance type can be associated with a notebook instance. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * 
     * @param acceleratorTypes
     *        A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently
     *        only one EI instance type can be associated with a notebook instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using Elastic Inference in Amazon
     *        SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookInstanceAcceleratorType
     */

    public UpdateNotebookInstanceRequest withAcceleratorTypes(NotebookInstanceAcceleratorType... acceleratorTypes) {
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
     * A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
     * </p>
     * 
     * @param disassociateAcceleratorTypes
     *        A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
     */

    public void setDisassociateAcceleratorTypes(Boolean disassociateAcceleratorTypes) {
        this.disassociateAcceleratorTypes = disassociateAcceleratorTypes;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
     * </p>
     * 
     * @return A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
     */

    public Boolean getDisassociateAcceleratorTypes() {
        return this.disassociateAcceleratorTypes;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
     * </p>
     * 
     * @param disassociateAcceleratorTypes
     *        A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withDisassociateAcceleratorTypes(Boolean disassociateAcceleratorTypes) {
        setDisassociateAcceleratorTypes(disassociateAcceleratorTypes);
        return this;
    }

    /**
     * <p>
     * A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
     * </p>
     * 
     * @return A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
     */

    public Boolean isDisassociateAcceleratorTypes() {
        return this.disassociateAcceleratorTypes;
    }

    /**
     * <p>
     * The name or URL of the default Git repository to remove from this notebook instance.
     * </p>
     * 
     * @param disassociateDefaultCodeRepository
     *        The name or URL of the default Git repository to remove from this notebook instance.
     */

    public void setDisassociateDefaultCodeRepository(Boolean disassociateDefaultCodeRepository) {
        this.disassociateDefaultCodeRepository = disassociateDefaultCodeRepository;
    }

    /**
     * <p>
     * The name or URL of the default Git repository to remove from this notebook instance.
     * </p>
     * 
     * @return The name or URL of the default Git repository to remove from this notebook instance.
     */

    public Boolean getDisassociateDefaultCodeRepository() {
        return this.disassociateDefaultCodeRepository;
    }

    /**
     * <p>
     * The name or URL of the default Git repository to remove from this notebook instance.
     * </p>
     * 
     * @param disassociateDefaultCodeRepository
     *        The name or URL of the default Git repository to remove from this notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withDisassociateDefaultCodeRepository(Boolean disassociateDefaultCodeRepository) {
        setDisassociateDefaultCodeRepository(disassociateDefaultCodeRepository);
        return this;
    }

    /**
     * <p>
     * The name or URL of the default Git repository to remove from this notebook instance.
     * </p>
     * 
     * @return The name or URL of the default Git repository to remove from this notebook instance.
     */

    public Boolean isDisassociateDefaultCodeRepository() {
        return this.disassociateDefaultCodeRepository;
    }

    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from this notebook instance.
     * </p>
     * 
     * @param disassociateAdditionalCodeRepositories
     *        A list of names or URLs of the default Git repositories to remove from this notebook instance.
     */

    public void setDisassociateAdditionalCodeRepositories(Boolean disassociateAdditionalCodeRepositories) {
        this.disassociateAdditionalCodeRepositories = disassociateAdditionalCodeRepositories;
    }

    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from this notebook instance.
     * </p>
     * 
     * @return A list of names or URLs of the default Git repositories to remove from this notebook instance.
     */

    public Boolean getDisassociateAdditionalCodeRepositories() {
        return this.disassociateAdditionalCodeRepositories;
    }

    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from this notebook instance.
     * </p>
     * 
     * @param disassociateAdditionalCodeRepositories
     *        A list of names or URLs of the default Git repositories to remove from this notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withDisassociateAdditionalCodeRepositories(Boolean disassociateAdditionalCodeRepositories) {
        setDisassociateAdditionalCodeRepositories(disassociateAdditionalCodeRepositories);
        return this;
    }

    /**
     * <p>
     * A list of names or URLs of the default Git repositories to remove from this notebook instance.
     * </p>
     * 
     * @return A list of names or URLs of the default Git repositories to remove from this notebook instance.
     */

    public Boolean isDisassociateAdditionalCodeRepositories() {
        return this.disassociateAdditionalCodeRepositories;
    }

    /**
     * <p>
     * Whether root access is enabled or disabled for users of the notebook instance. The default value is
     * <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * If you set this to <code>Disabled</code>, users don't have root access on the notebook instance, but lifecycle
     * configuration scripts still run with root permissions.
     * </p>
     * </note>
     * 
     * @param rootAccess
     *        Whether root access is enabled or disabled for users of the notebook instance. The default value is
     *        <code>Enabled</code>.</p> <note>
     *        <p>
     *        If you set this to <code>Disabled</code>, users don't have root access on the notebook instance, but
     *        lifecycle configuration scripts still run with root permissions.
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
     * If you set this to <code>Disabled</code>, users don't have root access on the notebook instance, but lifecycle
     * configuration scripts still run with root permissions.
     * </p>
     * </note>
     * 
     * @return Whether root access is enabled or disabled for users of the notebook instance. The default value is
     *         <code>Enabled</code>.</p> <note>
     *         <p>
     *         If you set this to <code>Disabled</code>, users don't have root access on the notebook instance, but
     *         lifecycle configuration scripts still run with root permissions.
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
     * If you set this to <code>Disabled</code>, users don't have root access on the notebook instance, but lifecycle
     * configuration scripts still run with root permissions.
     * </p>
     * </note>
     * 
     * @param rootAccess
     *        Whether root access is enabled or disabled for users of the notebook instance. The default value is
     *        <code>Enabled</code>.</p> <note>
     *        <p>
     *        If you set this to <code>Disabled</code>, users don't have root access on the notebook instance, but
     *        lifecycle configuration scripts still run with root permissions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootAccess
     */

    public UpdateNotebookInstanceRequest withRootAccess(String rootAccess) {
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
     * If you set this to <code>Disabled</code>, users don't have root access on the notebook instance, but lifecycle
     * configuration scripts still run with root permissions.
     * </p>
     * </note>
     * 
     * @param rootAccess
     *        Whether root access is enabled or disabled for users of the notebook instance. The default value is
     *        <code>Enabled</code>.</p> <note>
     *        <p>
     *        If you set this to <code>Disabled</code>, users don't have root access on the notebook instance, but
     *        lifecycle configuration scripts still run with root permissions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootAccess
     */

    public UpdateNotebookInstanceRequest withRootAccess(RootAccess rootAccess) {
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLifecycleConfigName() != null)
            sb.append("LifecycleConfigName: ").append(getLifecycleConfigName()).append(",");
        if (getDisassociateLifecycleConfig() != null)
            sb.append("DisassociateLifecycleConfig: ").append(getDisassociateLifecycleConfig()).append(",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB()).append(",");
        if (getDefaultCodeRepository() != null)
            sb.append("DefaultCodeRepository: ").append(getDefaultCodeRepository()).append(",");
        if (getAdditionalCodeRepositories() != null)
            sb.append("AdditionalCodeRepositories: ").append(getAdditionalCodeRepositories()).append(",");
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: ").append(getAcceleratorTypes()).append(",");
        if (getDisassociateAcceleratorTypes() != null)
            sb.append("DisassociateAcceleratorTypes: ").append(getDisassociateAcceleratorTypes()).append(",");
        if (getDisassociateDefaultCodeRepository() != null)
            sb.append("DisassociateDefaultCodeRepository: ").append(getDisassociateDefaultCodeRepository()).append(",");
        if (getDisassociateAdditionalCodeRepositories() != null)
            sb.append("DisassociateAdditionalCodeRepositories: ").append(getDisassociateAdditionalCodeRepositories()).append(",");
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

        if (obj instanceof UpdateNotebookInstanceRequest == false)
            return false;
        UpdateNotebookInstanceRequest other = (UpdateNotebookInstanceRequest) obj;
        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLifecycleConfigName() == null ^ this.getLifecycleConfigName() == null)
            return false;
        if (other.getLifecycleConfigName() != null && other.getLifecycleConfigName().equals(this.getLifecycleConfigName()) == false)
            return false;
        if (other.getDisassociateLifecycleConfig() == null ^ this.getDisassociateLifecycleConfig() == null)
            return false;
        if (other.getDisassociateLifecycleConfig() != null && other.getDisassociateLifecycleConfig().equals(this.getDisassociateLifecycleConfig()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        if (other.getDefaultCodeRepository() == null ^ this.getDefaultCodeRepository() == null)
            return false;
        if (other.getDefaultCodeRepository() != null && other.getDefaultCodeRepository().equals(this.getDefaultCodeRepository()) == false)
            return false;
        if (other.getAdditionalCodeRepositories() == null ^ this.getAdditionalCodeRepositories() == null)
            return false;
        if (other.getAdditionalCodeRepositories() != null && other.getAdditionalCodeRepositories().equals(this.getAdditionalCodeRepositories()) == false)
            return false;
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        if (other.getDisassociateAcceleratorTypes() == null ^ this.getDisassociateAcceleratorTypes() == null)
            return false;
        if (other.getDisassociateAcceleratorTypes() != null && other.getDisassociateAcceleratorTypes().equals(this.getDisassociateAcceleratorTypes()) == false)
            return false;
        if (other.getDisassociateDefaultCodeRepository() == null ^ this.getDisassociateDefaultCodeRepository() == null)
            return false;
        if (other.getDisassociateDefaultCodeRepository() != null
                && other.getDisassociateDefaultCodeRepository().equals(this.getDisassociateDefaultCodeRepository()) == false)
            return false;
        if (other.getDisassociateAdditionalCodeRepositories() == null ^ this.getDisassociateAdditionalCodeRepositories() == null)
            return false;
        if (other.getDisassociateAdditionalCodeRepositories() != null
                && other.getDisassociateAdditionalCodeRepositories().equals(this.getDisassociateAdditionalCodeRepositories()) == false)
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
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLifecycleConfigName() == null) ? 0 : getLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getDisassociateLifecycleConfig() == null) ? 0 : getDisassociateLifecycleConfig().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getDefaultCodeRepository() == null) ? 0 : getDefaultCodeRepository().hashCode());
        hashCode = prime * hashCode + ((getAdditionalCodeRepositories() == null) ? 0 : getAdditionalCodeRepositories().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime * hashCode + ((getDisassociateAcceleratorTypes() == null) ? 0 : getDisassociateAcceleratorTypes().hashCode());
        hashCode = prime * hashCode + ((getDisassociateDefaultCodeRepository() == null) ? 0 : getDisassociateDefaultCodeRepository().hashCode());
        hashCode = prime * hashCode + ((getDisassociateAdditionalCodeRepositories() == null) ? 0 : getDisassociateAdditionalCodeRepositories().hashCode());
        hashCode = prime * hashCode + ((getRootAccess() == null) ? 0 : getRootAccess().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNotebookInstanceRequest clone() {
        return (UpdateNotebookInstanceRequest) super.clone();
    }

}

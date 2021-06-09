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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the code repository branch that holds the code that's deployed in AWS Proton. <i>Don't</i> include
     * this parameter if your service template <i>doesn't</i> include a service pipeline.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * A description of the AWS Proton service.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The service name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the repository connection. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#settingSS-up-vcontrol">Set
     * up repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1">Getting
     * started</a> in the <i>AWS Proton User Guide</i>. <i>Don't</i> include this parameter if your service template
     * <i>doesn't</i> include a service pipeline.
     * </p>
     */
    private String repositoryConnectionArn;
    /**
     * <p>
     * The ID of the code repository. <i>Don't</i> include this parameter if your service template <i>doesn't</i>
     * include a service pipeline.
     * </p>
     */
    private String repositoryId;
    /**
     * <p>
     * A link to a spec file that provides inputs as defined in the service template bundle schema file. The spec file
     * is in YAML format. Don’t include pipeline inputs in the spec if your service template doesn’t include a service
     * pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-create-svc.html.html">Create a service</a> in the
     * <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-create.html">Create a service</a> in the <i>AWS
     * Proton User Guide</i>.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * Create tags for your service. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The ID of the major version of the service template that was used to create the service.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * The ID of the minor version of the service template that was used to create the service.
     * </p>
     */
    private String templateMinorVersion;
    /**
     * <p>
     * The name of the service template that's used to create the service.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The name of the code repository branch that holds the code that's deployed in AWS Proton. <i>Don't</i> include
     * this parameter if your service template <i>doesn't</i> include a service pipeline.
     * </p>
     * 
     * @param branchName
     *        The name of the code repository branch that holds the code that's deployed in AWS Proton. <i>Don't</i>
     *        include this parameter if your service template <i>doesn't</i> include a service pipeline.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the code repository branch that holds the code that's deployed in AWS Proton. <i>Don't</i> include
     * this parameter if your service template <i>doesn't</i> include a service pipeline.
     * </p>
     * 
     * @return The name of the code repository branch that holds the code that's deployed in AWS Proton. <i>Don't</i>
     *         include this parameter if your service template <i>doesn't</i> include a service pipeline.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of the code repository branch that holds the code that's deployed in AWS Proton. <i>Don't</i> include
     * this parameter if your service template <i>doesn't</i> include a service pipeline.
     * </p>
     * 
     * @param branchName
     *        The name of the code repository branch that holds the code that's deployed in AWS Proton. <i>Don't</i>
     *        include this parameter if your service template <i>doesn't</i> include a service pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * A description of the AWS Proton service.
     * </p>
     * 
     * @param description
     *        A description of the AWS Proton service.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the AWS Proton service.
     * </p>
     * 
     * @return A description of the AWS Proton service.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the AWS Proton service.
     * </p>
     * 
     * @param description
     *        A description of the AWS Proton service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @param name
     *        The service name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @return The service name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @param name
     *        The service name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the repository connection. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#settingSS-up-vcontrol">Set
     * up repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1">Getting
     * started</a> in the <i>AWS Proton User Guide</i>. <i>Don't</i> include this parameter if your service template
     * <i>doesn't</i> include a service pipeline.
     * </p>
     * 
     * @param repositoryConnectionArn
     *        The ARN of the repository connection. For more information, see <a href=
     *        "https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#settingSS-up-vcontrol"
     *        >Set up repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1"
     *        >Getting started</a> in the <i>AWS Proton User Guide</i>. <i>Don't</i> include this parameter if your
     *        service template <i>doesn't</i> include a service pipeline.
     */

    public void setRepositoryConnectionArn(String repositoryConnectionArn) {
        this.repositoryConnectionArn = repositoryConnectionArn;
    }

    /**
     * <p>
     * The ARN of the repository connection. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#settingSS-up-vcontrol">Set
     * up repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1">Getting
     * started</a> in the <i>AWS Proton User Guide</i>. <i>Don't</i> include this parameter if your service template
     * <i>doesn't</i> include a service pipeline.
     * </p>
     * 
     * @return The ARN of the repository connection. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#settingSS-up-vcontrol"
     *         >Set up repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a href=
     *         "https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1"
     *         >Getting started</a> in the <i>AWS Proton User Guide</i>. <i>Don't</i> include this parameter if your
     *         service template <i>doesn't</i> include a service pipeline.
     */

    public String getRepositoryConnectionArn() {
        return this.repositoryConnectionArn;
    }

    /**
     * <p>
     * The ARN of the repository connection. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#settingSS-up-vcontrol">Set
     * up repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1">Getting
     * started</a> in the <i>AWS Proton User Guide</i>. <i>Don't</i> include this parameter if your service template
     * <i>doesn't</i> include a service pipeline.
     * </p>
     * 
     * @param repositoryConnectionArn
     *        The ARN of the repository connection. For more information, see <a href=
     *        "https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#settingSS-up-vcontrol"
     *        >Set up repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1"
     *        >Getting started</a> in the <i>AWS Proton User Guide</i>. <i>Don't</i> include this parameter if your
     *        service template <i>doesn't</i> include a service pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withRepositoryConnectionArn(String repositoryConnectionArn) {
        setRepositoryConnectionArn(repositoryConnectionArn);
        return this;
    }

    /**
     * <p>
     * The ID of the code repository. <i>Don't</i> include this parameter if your service template <i>doesn't</i>
     * include a service pipeline.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the code repository. <i>Don't</i> include this parameter if your service template <i>doesn't</i>
     *        include a service pipeline.
     */

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * <p>
     * The ID of the code repository. <i>Don't</i> include this parameter if your service template <i>doesn't</i>
     * include a service pipeline.
     * </p>
     * 
     * @return The ID of the code repository. <i>Don't</i> include this parameter if your service template
     *         <i>doesn't</i> include a service pipeline.
     */

    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * <p>
     * The ID of the code repository. <i>Don't</i> include this parameter if your service template <i>doesn't</i>
     * include a service pipeline.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the code repository. <i>Don't</i> include this parameter if your service template <i>doesn't</i>
     *        include a service pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withRepositoryId(String repositoryId) {
        setRepositoryId(repositoryId);
        return this;
    }

    /**
     * <p>
     * A link to a spec file that provides inputs as defined in the service template bundle schema file. The spec file
     * is in YAML format. Don’t include pipeline inputs in the spec if your service template doesn’t include a service
     * pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-create-svc.html.html">Create a service</a> in the
     * <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-create.html">Create a service</a> in the <i>AWS
     * Proton User Guide</i>.
     * </p>
     * 
     * @param spec
     *        A link to a spec file that provides inputs as defined in the service template bundle schema file. The spec
     *        file is in YAML format. Don’t include pipeline inputs in the spec if your service template doesn’t include
     *        a service pipeline. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-create-svc.html.html">Create a service</a>
     *        in the <i>AWS Proton Administration Guide</i> and <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-create.html">Create a service</a> in the
     *        <i>AWS Proton User Guide</i>.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * A link to a spec file that provides inputs as defined in the service template bundle schema file. The spec file
     * is in YAML format. Don’t include pipeline inputs in the spec if your service template doesn’t include a service
     * pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-create-svc.html.html">Create a service</a> in the
     * <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-create.html">Create a service</a> in the <i>AWS
     * Proton User Guide</i>.
     * </p>
     * 
     * @return A link to a spec file that provides inputs as defined in the service template bundle schema file. The
     *         spec file is in YAML format. Don’t include pipeline inputs in the spec if your service template doesn’t
     *         include a service pipeline. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-create-svc.html.html">Create a service</a>
     *         in the <i>AWS Proton Administration Guide</i> and <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-create.html">Create a service</a> in the
     *         <i>AWS Proton User Guide</i>.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * A link to a spec file that provides inputs as defined in the service template bundle schema file. The spec file
     * is in YAML format. Don’t include pipeline inputs in the spec if your service template doesn’t include a service
     * pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-create-svc.html.html">Create a service</a> in the
     * <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-create.html">Create a service</a> in the <i>AWS
     * Proton User Guide</i>.
     * </p>
     * 
     * @param spec
     *        A link to a spec file that provides inputs as defined in the service template bundle schema file. The spec
     *        file is in YAML format. Don’t include pipeline inputs in the spec if your service template doesn’t include
     *        a service pipeline. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-create-svc.html.html">Create a service</a>
     *        in the <i>AWS Proton Administration Guide</i> and <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-create.html">Create a service</a> in the
     *        <i>AWS Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * Create tags for your service. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @return Create tags for your service. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     *         Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     *         Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Create tags for your service. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param tags
     *        Create tags for your service. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     *        Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     *        Guide</a>.
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
     * Create tags for your service. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Create tags for your service. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     *        Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(Tag... tags) {
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
     * Create tags for your service. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param tags
     *        Create tags for your service. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     *        Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the major version of the service template that was used to create the service.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the service template that was used to create the service.
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the service template that was used to create the service.
     * </p>
     * 
     * @return The ID of the major version of the service template that was used to create the service.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the service template that was used to create the service.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the service template that was used to create the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the minor version of the service template that was used to create the service.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the service template that was used to create the service.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the service template that was used to create the service.
     * </p>
     * 
     * @return The ID of the minor version of the service template that was used to create the service.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the service template that was used to create the service.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the service template that was used to create the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTemplateMinorVersion(String templateMinorVersion) {
        setTemplateMinorVersion(templateMinorVersion);
        return this;
    }

    /**
     * <p>
     * The name of the service template that's used to create the service.
     * </p>
     * 
     * @param templateName
     *        The name of the service template that's used to create the service.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the service template that's used to create the service.
     * </p>
     * 
     * @return The name of the service template that's used to create the service.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the service template that's used to create the service.
     * </p>
     * 
     * @param templateName
     *        The name of the service template that's used to create the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
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
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRepositoryConnectionArn() != null)
            sb.append("RepositoryConnectionArn: ").append(getRepositoryConnectionArn()).append(",");
        if (getRepositoryId() != null)
            sb.append("RepositoryId: ").append(getRepositoryId()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateMajorVersion() != null)
            sb.append("TemplateMajorVersion: ").append(getTemplateMajorVersion()).append(",");
        if (getTemplateMinorVersion() != null)
            sb.append("TemplateMinorVersion: ").append(getTemplateMinorVersion()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceRequest == false)
            return false;
        CreateServiceRequest other = (CreateServiceRequest) obj;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRepositoryConnectionArn() == null ^ this.getRepositoryConnectionArn() == null)
            return false;
        if (other.getRepositoryConnectionArn() != null && other.getRepositoryConnectionArn().equals(this.getRepositoryConnectionArn()) == false)
            return false;
        if (other.getRepositoryId() == null ^ this.getRepositoryId() == null)
            return false;
        if (other.getRepositoryId() != null && other.getRepositoryId().equals(this.getRepositoryId()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateMajorVersion() == null ^ this.getTemplateMajorVersion() == null)
            return false;
        if (other.getTemplateMajorVersion() != null && other.getTemplateMajorVersion().equals(this.getTemplateMajorVersion()) == false)
            return false;
        if (other.getTemplateMinorVersion() == null ^ this.getTemplateMinorVersion() == null)
            return false;
        if (other.getTemplateMinorVersion() != null && other.getTemplateMinorVersion().equals(this.getTemplateMinorVersion()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryConnectionArn() == null) ? 0 : getRepositoryConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getRepositoryId() == null) ? 0 : getRepositoryId().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceRequest clone() {
        return (CreateServiceRequest) super.clone();
    }

}

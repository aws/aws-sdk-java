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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the environment that's being created and deployed.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the environment account connection that you provide if you're provisioning your environment
     * infrastructure resources to an environment account. You must include either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and value. For more
     * information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     */
    private String environmentAccountConnectionId;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Proton service role that allows AWS Proton to make calls to other
     * services on your behalf. You must include either the <code>environmentAccountConnectionId</code> or
     * <code>protonServiceRoleArn</code> parameter and value.
     * </p>
     */
    private String protonServiceRoleArn;
    /**
     * <p>
     * A link to a YAML formatted spec file that provides inputs as defined in the environment template bundle schema
     * file. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-managing-environments.html">Environments</a> in the
     * <i>AWS Proton Administration Guide</i>.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * Create tags for your environment. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The ID of the major version of the environment template.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * The ID of the minor version of the environment template.
     * </p>
     */
    private String templateMinorVersion;
    /**
     * <p>
     * The name of the environment template. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-templates.html">Environment Templates</a> in
     * the <i>AWS Proton Administration Guide</i>.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * A description of the environment that's being created and deployed.
     * </p>
     * 
     * @param description
     *        A description of the environment that's being created and deployed.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the environment that's being created and deployed.
     * </p>
     * 
     * @return A description of the environment that's being created and deployed.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the environment that's being created and deployed.
     * </p>
     * 
     * @param description
     *        A description of the environment that's being created and deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the environment account connection that you provide if you're provisioning your environment
     * infrastructure resources to an environment account. You must include either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and value. For more
     * information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param environmentAccountConnectionId
     *        The ID of the environment account connection that you provide if you're provisioning your environment
     *        infrastructure resources to an environment account. You must include either the
     *        <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and value. For
     *        more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment
     *        account connections</a> in the <i>AWS Proton Administration guide</i>.
     */

    public void setEnvironmentAccountConnectionId(String environmentAccountConnectionId) {
        this.environmentAccountConnectionId = environmentAccountConnectionId;
    }

    /**
     * <p>
     * The ID of the environment account connection that you provide if you're provisioning your environment
     * infrastructure resources to an environment account. You must include either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and value. For more
     * information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @return The ID of the environment account connection that you provide if you're provisioning your environment
     *         infrastructure resources to an environment account. You must include either the
     *         <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and value. For
     *         more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment
     *         account connections</a> in the <i>AWS Proton Administration guide</i>.
     */

    public String getEnvironmentAccountConnectionId() {
        return this.environmentAccountConnectionId;
    }

    /**
     * <p>
     * The ID of the environment account connection that you provide if you're provisioning your environment
     * infrastructure resources to an environment account. You must include either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and value. For more
     * information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param environmentAccountConnectionId
     *        The ID of the environment account connection that you provide if you're provisioning your environment
     *        infrastructure resources to an environment account. You must include either the
     *        <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and value. For
     *        more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment
     *        account connections</a> in the <i>AWS Proton Administration guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withEnvironmentAccountConnectionId(String environmentAccountConnectionId) {
        setEnvironmentAccountConnectionId(environmentAccountConnectionId);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Proton service role that allows AWS Proton to make calls to other
     * services on your behalf. You must include either the <code>environmentAccountConnectionId</code> or
     * <code>protonServiceRoleArn</code> parameter and value.
     * </p>
     * 
     * @param protonServiceRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Proton service role that allows AWS Proton to make calls to
     *        other services on your behalf. You must include either the <code>environmentAccountConnectionId</code> or
     *        <code>protonServiceRoleArn</code> parameter and value.
     */

    public void setProtonServiceRoleArn(String protonServiceRoleArn) {
        this.protonServiceRoleArn = protonServiceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Proton service role that allows AWS Proton to make calls to other
     * services on your behalf. You must include either the <code>environmentAccountConnectionId</code> or
     * <code>protonServiceRoleArn</code> parameter and value.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Proton service role that allows AWS Proton to make calls to
     *         other services on your behalf. You must include either the <code>environmentAccountConnectionId</code> or
     *         <code>protonServiceRoleArn</code> parameter and value.
     */

    public String getProtonServiceRoleArn() {
        return this.protonServiceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Proton service role that allows AWS Proton to make calls to other
     * services on your behalf. You must include either the <code>environmentAccountConnectionId</code> or
     * <code>protonServiceRoleArn</code> parameter and value.
     * </p>
     * 
     * @param protonServiceRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Proton service role that allows AWS Proton to make calls to
     *        other services on your behalf. You must include either the <code>environmentAccountConnectionId</code> or
     *        <code>protonServiceRoleArn</code> parameter and value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withProtonServiceRoleArn(String protonServiceRoleArn) {
        setProtonServiceRoleArn(protonServiceRoleArn);
        return this;
    }

    /**
     * <p>
     * A link to a YAML formatted spec file that provides inputs as defined in the environment template bundle schema
     * file. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-managing-environments.html">Environments</a> in the
     * <i>AWS Proton Administration Guide</i>.
     * </p>
     * 
     * @param spec
     *        A link to a YAML formatted spec file that provides inputs as defined in the environment template bundle
     *        schema file. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-managing-environments.html">Environments</a>
     *        in the <i>AWS Proton Administration Guide</i>.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * A link to a YAML formatted spec file that provides inputs as defined in the environment template bundle schema
     * file. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-managing-environments.html">Environments</a> in the
     * <i>AWS Proton Administration Guide</i>.
     * </p>
     * 
     * @return A link to a YAML formatted spec file that provides inputs as defined in the environment template bundle
     *         schema file. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-managing-environments.html"
     *         >Environments</a> in the <i>AWS Proton Administration Guide</i>.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * A link to a YAML formatted spec file that provides inputs as defined in the environment template bundle schema
     * file. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-managing-environments.html">Environments</a> in the
     * <i>AWS Proton Administration Guide</i>.
     * </p>
     * 
     * @param spec
     *        A link to a YAML formatted spec file that provides inputs as defined in the environment template bundle
     *        schema file. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-managing-environments.html">Environments</a>
     *        in the <i>AWS Proton Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * Create tags for your environment. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @return Create tags for your environment. For more information, see <i>AWS Proton resources and tagging</i> in
     *         the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton
     *         Administration Guide</a> or <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Create tags for your environment. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param tags
     *        Create tags for your environment. For more information, see <i>AWS Proton resources and tagging</i> in the
     *        <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
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
     * Create tags for your environment. For more information, see <i>AWS Proton resources and tagging</i> in the <a
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
     *        Create tags for your environment. For more information, see <i>AWS Proton resources and tagging</i> in the
     *        <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     *        Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(Tag... tags) {
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
     * Create tags for your environment. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param tags
     *        Create tags for your environment. For more information, see <i>AWS Proton resources and tagging</i> in the
     *        <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     *        Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the major version of the environment template.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the environment template.
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the environment template.
     * </p>
     * 
     * @return The ID of the major version of the environment template.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the environment template.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the minor version of the environment template.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the environment template.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the environment template.
     * </p>
     * 
     * @return The ID of the minor version of the environment template.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the environment template.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTemplateMinorVersion(String templateMinorVersion) {
        setTemplateMinorVersion(templateMinorVersion);
        return this;
    }

    /**
     * <p>
     * The name of the environment template. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-templates.html">Environment Templates</a> in
     * the <i>AWS Proton Administration Guide</i>.
     * </p>
     * 
     * @param templateName
     *        The name of the environment template. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-templates.html">Environment
     *        Templates</a> in the <i>AWS Proton Administration Guide</i>.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the environment template. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-templates.html">Environment Templates</a> in
     * the <i>AWS Proton Administration Guide</i>.
     * </p>
     * 
     * @return The name of the environment template. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-templates.html">Environment
     *         Templates</a> in the <i>AWS Proton Administration Guide</i>.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the environment template. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-templates.html">Environment Templates</a> in
     * the <i>AWS Proton Administration Guide</i>.
     * </p>
     * 
     * @param templateName
     *        The name of the environment template. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-templates.html">Environment
     *        Templates</a> in the <i>AWS Proton Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTemplateName(String templateName) {
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEnvironmentAccountConnectionId() != null)
            sb.append("EnvironmentAccountConnectionId: ").append(getEnvironmentAccountConnectionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProtonServiceRoleArn() != null)
            sb.append("ProtonServiceRoleArn: ").append(getProtonServiceRoleArn()).append(",");
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

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironmentAccountConnectionId() == null ^ this.getEnvironmentAccountConnectionId() == null)
            return false;
        if (other.getEnvironmentAccountConnectionId() != null
                && other.getEnvironmentAccountConnectionId().equals(this.getEnvironmentAccountConnectionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtonServiceRoleArn() == null ^ this.getProtonServiceRoleArn() == null)
            return false;
        if (other.getProtonServiceRoleArn() != null && other.getProtonServiceRoleArn().equals(this.getProtonServiceRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentAccountConnectionId() == null) ? 0 : getEnvironmentAccountConnectionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtonServiceRoleArn() == null) ? 0 : getProtonServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}

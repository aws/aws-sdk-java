/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The client token of the service instance to create.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the service instance to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the service the service instance is added to.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The spec for the service instance you want to create.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton service instance. A tag is a key-value
     * pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * To create a new minor version of the service template, include a <code>major Version</code>.
     * </p>
     */
    private String templateMinorVersion;

    /**
     * <p>
     * The client token of the service instance to create.
     * </p>
     * 
     * @param clientToken
     *        The client token of the service instance to create.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token of the service instance to create.
     * </p>
     * 
     * @return The client token of the service instance to create.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token of the service instance to create.
     * </p>
     * 
     * @param clientToken
     *        The client token of the service instance to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceInstanceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the service instance to create.
     * </p>
     * 
     * @param name
     *        The name of the service instance to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service instance to create.
     * </p>
     * 
     * @return The name of the service instance to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service instance to create.
     * </p>
     * 
     * @param name
     *        The name of the service instance to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceInstanceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the service the service instance is added to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service the service instance is added to.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service the service instance is added to.
     * </p>
     * 
     * @return The name of the service the service instance is added to.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service the service instance is added to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service the service instance is added to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceInstanceRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The spec for the service instance you want to create.
     * </p>
     * 
     * @param spec
     *        The spec for the service instance you want to create.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The spec for the service instance you want to create.
     * </p>
     * 
     * @return The spec for the service instance you want to create.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The spec for the service instance you want to create.
     * </p>
     * 
     * @param spec
     *        The spec for the service instance you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceInstanceRequest withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton service instance. A tag is a key-value
     * pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @return An optional list of metadata items that you can associate with the Proton service instance. A tag is a
     *         key-value pair.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and
     *         tagging</a> in the <i>Proton User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton service instance. A tag is a key-value
     * pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton service instance. A tag is a
     *        key-value pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
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
     * An optional list of metadata items that you can associate with the Proton service instance. A tag is a key-value
     * pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton service instance. A tag is a
     *        key-value pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceInstanceRequest withTags(Tag... tags) {
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
     * An optional list of metadata items that you can associate with the Proton service instance. A tag is a key-value
     * pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton service instance. A tag is a
     *        key-value pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     * </p>
     * 
     * @param templateMajorVersion
     *        To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>
     *        .
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     * </p>
     * 
     * @return To create a new major and minor version of the service template, <i>exclude</i>
     *         <code>major Version</code>.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     * </p>
     * 
     * @param templateMajorVersion
     *        To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceInstanceRequest withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * To create a new minor version of the service template, include a <code>major Version</code>.
     * </p>
     * 
     * @param templateMinorVersion
     *        To create a new minor version of the service template, include a <code>major Version</code>.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * To create a new minor version of the service template, include a <code>major Version</code>.
     * </p>
     * 
     * @return To create a new minor version of the service template, include a <code>major Version</code>.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * To create a new minor version of the service template, include a <code>major Version</code>.
     * </p>
     * 
     * @param templateMinorVersion
     *        To create a new minor version of the service template, include a <code>major Version</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceInstanceRequest withTemplateMinorVersion(String templateMinorVersion) {
        setTemplateMinorVersion(templateMinorVersion);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateMajorVersion() != null)
            sb.append("TemplateMajorVersion: ").append(getTemplateMajorVersion()).append(",");
        if (getTemplateMinorVersion() != null)
            sb.append("TemplateMinorVersion: ").append(getTemplateMinorVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceInstanceRequest == false)
            return false;
        CreateServiceInstanceRequest other = (CreateServiceInstanceRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceInstanceRequest clone() {
        return (CreateServiceInstanceRequest) super.clone();
    }

}

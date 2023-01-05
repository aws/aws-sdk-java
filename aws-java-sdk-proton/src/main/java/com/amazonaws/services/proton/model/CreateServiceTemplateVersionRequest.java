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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplateVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceTemplateVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When included, if two identical requests are made with the same client token, Proton returns the service template
     * version that the first request created.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * An array of environment template objects that are compatible with the new service template version. A service
     * instance based on this service template version can run in environments based on compatible templates.
     * </p>
     */
    private java.util.List<CompatibleEnvironmentTemplateInput> compatibleEnvironmentTemplates;
    /**
     * <p>
     * A description of the new version of a service template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * To create a new minor version of the service template, include a <code>major Version</code>.
     * </p>
     * <p>
     * To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     * </p>
     */
    private String majorVersion;
    /**
     * <p>
     * An object that includes the template bundle S3 bucket path and name for the new version of a service template.
     * </p>
     */
    private TemplateVersionSourceInput source;
    /**
     * <p>
     * An array of supported component sources. Components with supported sources can be attached to service instances
     * based on this service template version.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     */
    private java.util.List<String> supportedComponentSources;
    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton service template version. A tag is a
     * key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The name of the service template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * When included, if two identical requests are made with the same client token, Proton returns the service template
     * version that the first request created.
     * </p>
     * 
     * @param clientToken
     *        When included, if two identical requests are made with the same client token, Proton returns the service
     *        template version that the first request created.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * When included, if two identical requests are made with the same client token, Proton returns the service template
     * version that the first request created.
     * </p>
     * 
     * @return When included, if two identical requests are made with the same client token, Proton returns the service
     *         template version that the first request created.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * When included, if two identical requests are made with the same client token, Proton returns the service template
     * version that the first request created.
     * </p>
     * 
     * @param clientToken
     *        When included, if two identical requests are made with the same client token, Proton returns the service
     *        template version that the first request created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * An array of environment template objects that are compatible with the new service template version. A service
     * instance based on this service template version can run in environments based on compatible templates.
     * </p>
     * 
     * @return An array of environment template objects that are compatible with the new service template version. A
     *         service instance based on this service template version can run in environments based on compatible
     *         templates.
     */

    public java.util.List<CompatibleEnvironmentTemplateInput> getCompatibleEnvironmentTemplates() {
        return compatibleEnvironmentTemplates;
    }

    /**
     * <p>
     * An array of environment template objects that are compatible with the new service template version. A service
     * instance based on this service template version can run in environments based on compatible templates.
     * </p>
     * 
     * @param compatibleEnvironmentTemplates
     *        An array of environment template objects that are compatible with the new service template version. A
     *        service instance based on this service template version can run in environments based on compatible
     *        templates.
     */

    public void setCompatibleEnvironmentTemplates(java.util.Collection<CompatibleEnvironmentTemplateInput> compatibleEnvironmentTemplates) {
        if (compatibleEnvironmentTemplates == null) {
            this.compatibleEnvironmentTemplates = null;
            return;
        }

        this.compatibleEnvironmentTemplates = new java.util.ArrayList<CompatibleEnvironmentTemplateInput>(compatibleEnvironmentTemplates);
    }

    /**
     * <p>
     * An array of environment template objects that are compatible with the new service template version. A service
     * instance based on this service template version can run in environments based on compatible templates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleEnvironmentTemplates(java.util.Collection)} or
     * {@link #withCompatibleEnvironmentTemplates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param compatibleEnvironmentTemplates
     *        An array of environment template objects that are compatible with the new service template version. A
     *        service instance based on this service template version can run in environments based on compatible
     *        templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionRequest withCompatibleEnvironmentTemplates(CompatibleEnvironmentTemplateInput... compatibleEnvironmentTemplates) {
        if (this.compatibleEnvironmentTemplates == null) {
            setCompatibleEnvironmentTemplates(new java.util.ArrayList<CompatibleEnvironmentTemplateInput>(compatibleEnvironmentTemplates.length));
        }
        for (CompatibleEnvironmentTemplateInput ele : compatibleEnvironmentTemplates) {
            this.compatibleEnvironmentTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of environment template objects that are compatible with the new service template version. A service
     * instance based on this service template version can run in environments based on compatible templates.
     * </p>
     * 
     * @param compatibleEnvironmentTemplates
     *        An array of environment template objects that are compatible with the new service template version. A
     *        service instance based on this service template version can run in environments based on compatible
     *        templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionRequest withCompatibleEnvironmentTemplates(
            java.util.Collection<CompatibleEnvironmentTemplateInput> compatibleEnvironmentTemplates) {
        setCompatibleEnvironmentTemplates(compatibleEnvironmentTemplates);
        return this;
    }

    /**
     * <p>
     * A description of the new version of a service template.
     * </p>
     * 
     * @param description
     *        A description of the new version of a service template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the new version of a service template.
     * </p>
     * 
     * @return A description of the new version of a service template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the new version of a service template.
     * </p>
     * 
     * @param description
     *        A description of the new version of a service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * To create a new minor version of the service template, include a <code>major Version</code>.
     * </p>
     * <p>
     * To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     * </p>
     * 
     * @param majorVersion
     *        To create a new minor version of the service template, include a <code>major Version</code>.</p>
     *        <p>
     *        To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     */

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    /**
     * <p>
     * To create a new minor version of the service template, include a <code>major Version</code>.
     * </p>
     * <p>
     * To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     * </p>
     * 
     * @return To create a new minor version of the service template, include a <code>major Version</code>.</p>
     *         <p>
     *         To create a new major and minor version of the service template, <i>exclude</i>
     *         <code>major Version</code>.
     */

    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * <p>
     * To create a new minor version of the service template, include a <code>major Version</code>.
     * </p>
     * <p>
     * To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     * </p>
     * 
     * @param majorVersion
     *        To create a new minor version of the service template, include a <code>major Version</code>.</p>
     *        <p>
     *        To create a new major and minor version of the service template, <i>exclude</i> <code>major Version</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionRequest withMajorVersion(String majorVersion) {
        setMajorVersion(majorVersion);
        return this;
    }

    /**
     * <p>
     * An object that includes the template bundle S3 bucket path and name for the new version of a service template.
     * </p>
     * 
     * @param source
     *        An object that includes the template bundle S3 bucket path and name for the new version of a service
     *        template.
     */

    public void setSource(TemplateVersionSourceInput source) {
        this.source = source;
    }

    /**
     * <p>
     * An object that includes the template bundle S3 bucket path and name for the new version of a service template.
     * </p>
     * 
     * @return An object that includes the template bundle S3 bucket path and name for the new version of a service
     *         template.
     */

    public TemplateVersionSourceInput getSource() {
        return this.source;
    }

    /**
     * <p>
     * An object that includes the template bundle S3 bucket path and name for the new version of a service template.
     * </p>
     * 
     * @param source
     *        An object that includes the template bundle S3 bucket path and name for the new version of a service
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionRequest withSource(TemplateVersionSourceInput source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * An array of supported component sources. Components with supported sources can be attached to service instances
     * based on this service template version.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @return An array of supported component sources. Components with supported sources can be attached to service
     *         instances based on this service template version.</p>
     *         <p>
     *         For more information about components, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in
     *         the <i>Proton User Guide</i>.
     * @see ServiceTemplateSupportedComponentSourceType
     */

    public java.util.List<String> getSupportedComponentSources() {
        return supportedComponentSources;
    }

    /**
     * <p>
     * An array of supported component sources. Components with supported sources can be attached to service instances
     * based on this service template version.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param supportedComponentSources
     *        An array of supported component sources. Components with supported sources can be attached to service
     *        instances based on this service template version.</p>
     *        <p>
     *        For more information about components, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     *        <i>Proton User Guide</i>.
     * @see ServiceTemplateSupportedComponentSourceType
     */

    public void setSupportedComponentSources(java.util.Collection<String> supportedComponentSources) {
        if (supportedComponentSources == null) {
            this.supportedComponentSources = null;
            return;
        }

        this.supportedComponentSources = new java.util.ArrayList<String>(supportedComponentSources);
    }

    /**
     * <p>
     * An array of supported component sources. Components with supported sources can be attached to service instances
     * based on this service template version.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedComponentSources(java.util.Collection)} or
     * {@link #withSupportedComponentSources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedComponentSources
     *        An array of supported component sources. Components with supported sources can be attached to service
     *        instances based on this service template version.</p>
     *        <p>
     *        For more information about components, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     *        <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceTemplateSupportedComponentSourceType
     */

    public CreateServiceTemplateVersionRequest withSupportedComponentSources(String... supportedComponentSources) {
        if (this.supportedComponentSources == null) {
            setSupportedComponentSources(new java.util.ArrayList<String>(supportedComponentSources.length));
        }
        for (String ele : supportedComponentSources) {
            this.supportedComponentSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of supported component sources. Components with supported sources can be attached to service instances
     * based on this service template version.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param supportedComponentSources
     *        An array of supported component sources. Components with supported sources can be attached to service
     *        instances based on this service template version.</p>
     *        <p>
     *        For more information about components, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     *        <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceTemplateSupportedComponentSourceType
     */

    public CreateServiceTemplateVersionRequest withSupportedComponentSources(java.util.Collection<String> supportedComponentSources) {
        setSupportedComponentSources(supportedComponentSources);
        return this;
    }

    /**
     * <p>
     * An array of supported component sources. Components with supported sources can be attached to service instances
     * based on this service template version.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param supportedComponentSources
     *        An array of supported component sources. Components with supported sources can be attached to service
     *        instances based on this service template version.</p>
     *        <p>
     *        For more information about components, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     *        <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceTemplateSupportedComponentSourceType
     */

    public CreateServiceTemplateVersionRequest withSupportedComponentSources(ServiceTemplateSupportedComponentSourceType... supportedComponentSources) {
        java.util.ArrayList<String> supportedComponentSourcesCopy = new java.util.ArrayList<String>(supportedComponentSources.length);
        for (ServiceTemplateSupportedComponentSourceType value : supportedComponentSources) {
            supportedComponentSourcesCopy.add(value.toString());
        }
        if (getSupportedComponentSources() == null) {
            setSupportedComponentSources(supportedComponentSourcesCopy);
        } else {
            getSupportedComponentSources().addAll(supportedComponentSourcesCopy);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton service template version. A tag is a
     * key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @return An optional list of metadata items that you can associate with the Proton service template version. A tag
     *         is a key-value pair.</p>
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
     * An optional list of metadata items that you can associate with the Proton service template version. A tag is a
     * key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton service template version. A tag
     *        is a key-value pair.</p>
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
     * An optional list of metadata items that you can associate with the Proton service template version. A tag is a
     * key-value pair.
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
     *        An optional list of metadata items that you can associate with the Proton service template version. A tag
     *        is a key-value pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionRequest withTags(Tag... tags) {
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
     * An optional list of metadata items that you can associate with the Proton service template version. A tag is a
     * key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton service template version. A tag
     *        is a key-value pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @param templateName
     *        The name of the service template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @return The name of the service template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @param templateName
     *        The name of the service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionRequest withTemplateName(String templateName) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCompatibleEnvironmentTemplates() != null)
            sb.append("CompatibleEnvironmentTemplates: ").append(getCompatibleEnvironmentTemplates()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getMajorVersion() != null)
            sb.append("MajorVersion: ").append(getMajorVersion()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSupportedComponentSources() != null)
            sb.append("SupportedComponentSources: ").append(getSupportedComponentSources()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateServiceTemplateVersionRequest == false)
            return false;
        CreateServiceTemplateVersionRequest other = (CreateServiceTemplateVersionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCompatibleEnvironmentTemplates() == null ^ this.getCompatibleEnvironmentTemplates() == null)
            return false;
        if (other.getCompatibleEnvironmentTemplates() != null
                && other.getCompatibleEnvironmentTemplates().equals(this.getCompatibleEnvironmentTemplates()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMajorVersion() == null ^ this.getMajorVersion() == null)
            return false;
        if (other.getMajorVersion() != null && other.getMajorVersion().equals(this.getMajorVersion()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSupportedComponentSources() == null ^ this.getSupportedComponentSources() == null)
            return false;
        if (other.getSupportedComponentSources() != null && other.getSupportedComponentSources().equals(this.getSupportedComponentSources()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCompatibleEnvironmentTemplates() == null) ? 0 : getCompatibleEnvironmentTemplates().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMajorVersion() == null) ? 0 : getMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSupportedComponentSources() == null) ? 0 : getSupportedComponentSources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceTemplateVersionRequest clone() {
        return (CreateServiceTemplateVersionRequest) super.clone();
    }

}

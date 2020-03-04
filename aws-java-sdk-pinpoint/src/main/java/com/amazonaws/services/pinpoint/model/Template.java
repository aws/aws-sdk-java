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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the name and version of the message template to use for the message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/Template" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Template implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the message template to use for the message. If specified, this value must match the name of an
     * existing message template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier for the version of the message template to use for the message. If specified, this value
     * must match the identifier for an existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The name of the message template to use for the message. If specified, this value must match the name of an
     * existing message template.
     * </p>
     * 
     * @param name
     *        The name of the message template to use for the message. If specified, this value must match the name of
     *        an existing message template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the message template to use for the message. If specified, this value must match the name of an
     * existing message template.
     * </p>
     * 
     * @return The name of the message template to use for the message. If specified, this value must match the name of
     *         an existing message template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the message template to use for the message. If specified, this value must match the name of an
     * existing message template.
     * </p>
     * 
     * @param name
     *        The name of the message template to use for the message. If specified, this value must match the name of
     *        an existing message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for the message. If specified, this value
     * must match the identifier for an existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     * 
     * @param version
     *        The unique identifier for the version of the message template to use for the message. If specified, this
     *        value must match the identifier for an existing template version. To retrieve a list of versions and
     *        version identifiers for a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *        <p>
     *        If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the
     *        template. The <i>active version</i> is typically the version of a template that's been most recently
     *        reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a
     *        template.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for the message. If specified, this value
     * must match the identifier for an existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     * 
     * @return The unique identifier for the version of the message template to use for the message. If specified, this
     *         value must match the identifier for an existing template version. To retrieve a list of versions and
     *         version identifiers for a template, use the <link
     *         linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *         <p>
     *         If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the
     *         template. The <i>active version</i> is typically the version of a template that's been most recently
     *         reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a
     *         template.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for the message. If specified, this value
     * must match the identifier for an existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     * 
     * @param version
     *        The unique identifier for the version of the message template to use for the message. If specified, this
     *        value must match the identifier for an existing template version. To retrieve a list of versions and
     *        version identifiers for a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *        <p>
     *        If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the
     *        template. The <i>active version</i> is typically the version of a template that's been most recently
     *        reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withVersion(String version) {
        setVersion(version);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Template == false)
            return false;
        Template other = (Template) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public Template clone() {
        try {
            return (Template) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.TemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

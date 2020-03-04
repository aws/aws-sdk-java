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
 * Specifies which version of a message template to use as the active version of the template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TemplateActiveVersionRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateActiveVersionRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the message template to use as the active version of the template. Valid values are: latest, for
     * the most recent version of the template; or, the unique identifier for any existing version of the template. If
     * you specify an identifier, the value must match the identifier for an existing template version. To retrieve a
     * list of versions and version identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The version of the message template to use as the active version of the template. Valid values are: latest, for
     * the most recent version of the template; or, the unique identifier for any existing version of the template. If
     * you specify an identifier, the value must match the identifier for an existing template version. To retrieve a
     * list of versions and version identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     * </p>
     * 
     * @param version
     *        The version of the message template to use as the active version of the template. Valid values are:
     *        latest, for the most recent version of the template; or, the unique identifier for any existing version of
     *        the template. If you specify an identifier, the value must match the identifier for an existing template
     *        version. To retrieve a list of versions and version identifiers for a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the message template to use as the active version of the template. Valid values are: latest, for
     * the most recent version of the template; or, the unique identifier for any existing version of the template. If
     * you specify an identifier, the value must match the identifier for an existing template version. To retrieve a
     * list of versions and version identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     * </p>
     * 
     * @return The version of the message template to use as the active version of the template. Valid values are:
     *         latest, for the most recent version of the template; or, the unique identifier for any existing version
     *         of the template. If you specify an identifier, the value must match the identifier for an existing
     *         template version. To retrieve a list of versions and version identifiers for a template, use the <link
     *         linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the message template to use as the active version of the template. Valid values are: latest, for
     * the most recent version of the template; or, the unique identifier for any existing version of the template. If
     * you specify an identifier, the value must match the identifier for an existing template version. To retrieve a
     * list of versions and version identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     * </p>
     * 
     * @param version
     *        The version of the message template to use as the active version of the template. Valid values are:
     *        latest, for the most recent version of the template; or, the unique identifier for any existing version of
     *        the template. If you specify an identifier, the value must match the identifier for an existing template
     *        version. To retrieve a list of versions and version identifiers for a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateActiveVersionRequest withVersion(String version) {
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

        if (obj instanceof TemplateActiveVersionRequest == false)
            return false;
        TemplateActiveVersionRequest other = (TemplateActiveVersionRequest) obj;
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

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public TemplateActiveVersionRequest clone() {
        try {
            return (TemplateActiveVersionRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.TemplateActiveVersionRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

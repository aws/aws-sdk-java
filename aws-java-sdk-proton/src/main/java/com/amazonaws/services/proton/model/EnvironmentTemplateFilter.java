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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A search filter for environment templates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/EnvironmentTemplateFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentTemplateFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Include <code>majorVersion</code> to filter search for a major version.
     * </p>
     */
    private String majorVersion;
    /**
     * <p>
     * Include <code>templateName</code> to filter search for a template name.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * Include <code>majorVersion</code> to filter search for a major version.
     * </p>
     * 
     * @param majorVersion
     *        Include <code>majorVersion</code> to filter search for a major version.
     */

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    /**
     * <p>
     * Include <code>majorVersion</code> to filter search for a major version.
     * </p>
     * 
     * @return Include <code>majorVersion</code> to filter search for a major version.
     */

    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * <p>
     * Include <code>majorVersion</code> to filter search for a major version.
     * </p>
     * 
     * @param majorVersion
     *        Include <code>majorVersion</code> to filter search for a major version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateFilter withMajorVersion(String majorVersion) {
        setMajorVersion(majorVersion);
        return this;
    }

    /**
     * <p>
     * Include <code>templateName</code> to filter search for a template name.
     * </p>
     * 
     * @param templateName
     *        Include <code>templateName</code> to filter search for a template name.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * Include <code>templateName</code> to filter search for a template name.
     * </p>
     * 
     * @return Include <code>templateName</code> to filter search for a template name.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * Include <code>templateName</code> to filter search for a template name.
     * </p>
     * 
     * @param templateName
     *        Include <code>templateName</code> to filter search for a template name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateFilter withTemplateName(String templateName) {
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
        if (getMajorVersion() != null)
            sb.append("MajorVersion: ").append(getMajorVersion()).append(",");
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

        if (obj instanceof EnvironmentTemplateFilter == false)
            return false;
        EnvironmentTemplateFilter other = (EnvironmentTemplateFilter) obj;
        if (other.getMajorVersion() == null ^ this.getMajorVersion() == null)
            return false;
        if (other.getMajorVersion() != null && other.getMajorVersion().equals(this.getMajorVersion()) == false)
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

        hashCode = prime * hashCode + ((getMajorVersion() == null) ? 0 : getMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentTemplateFilter clone() {
        try {
            return (EnvironmentTemplateFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.EnvironmentTemplateFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

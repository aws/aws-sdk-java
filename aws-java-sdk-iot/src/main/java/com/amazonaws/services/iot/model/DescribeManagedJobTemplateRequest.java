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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeManagedJobTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of a managed job template, which is required.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * An optional parameter to specify version of a managed template. If not specified, the pre-defined default version
     * is returned.
     * </p>
     */
    private String templateVersion;

    /**
     * <p>
     * The unique name of a managed job template, which is required.
     * </p>
     * 
     * @param templateName
     *        The unique name of a managed job template, which is required.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The unique name of a managed job template, which is required.
     * </p>
     * 
     * @return The unique name of a managed job template, which is required.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The unique name of a managed job template, which is required.
     * </p>
     * 
     * @param templateName
     *        The unique name of a managed job template, which is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedJobTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * An optional parameter to specify version of a managed template. If not specified, the pre-defined default version
     * is returned.
     * </p>
     * 
     * @param templateVersion
     *        An optional parameter to specify version of a managed template. If not specified, the pre-defined default
     *        version is returned.
     */

    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    /**
     * <p>
     * An optional parameter to specify version of a managed template. If not specified, the pre-defined default version
     * is returned.
     * </p>
     * 
     * @return An optional parameter to specify version of a managed template. If not specified, the pre-defined default
     *         version is returned.
     */

    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * <p>
     * An optional parameter to specify version of a managed template. If not specified, the pre-defined default version
     * is returned.
     * </p>
     * 
     * @param templateVersion
     *        An optional parameter to specify version of a managed template. If not specified, the pre-defined default
     *        version is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedJobTemplateRequest withTemplateVersion(String templateVersion) {
        setTemplateVersion(templateVersion);
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateVersion() != null)
            sb.append("TemplateVersion: ").append(getTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeManagedJobTemplateRequest == false)
            return false;
        DescribeManagedJobTemplateRequest other = (DescribeManagedJobTemplateRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeManagedJobTemplateRequest clone() {
        return (DescribeManagedJobTemplateRequest) super.clone();
    }

}

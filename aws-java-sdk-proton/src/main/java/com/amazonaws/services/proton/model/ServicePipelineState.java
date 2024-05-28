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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The detailed data about the current state of the service pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ServicePipelineState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServicePipelineState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The service spec that was used to create the service pipeline.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * The major version of the service template that was used to create the service pipeline.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * The minor version of the service template that was used to create the service pipeline.
     * </p>
     */
    private String templateMinorVersion;
    /**
     * <p>
     * The name of the service template that was used to create the service pipeline.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The service spec that was used to create the service pipeline.
     * </p>
     * 
     * @param spec
     *        The service spec that was used to create the service pipeline.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The service spec that was used to create the service pipeline.
     * </p>
     * 
     * @return The service spec that was used to create the service pipeline.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The service spec that was used to create the service pipeline.
     * </p>
     * 
     * @param spec
     *        The service spec that was used to create the service pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServicePipelineState withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The major version of the service template that was used to create the service pipeline.
     * </p>
     * 
     * @param templateMajorVersion
     *        The major version of the service template that was used to create the service pipeline.
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * The major version of the service template that was used to create the service pipeline.
     * </p>
     * 
     * @return The major version of the service template that was used to create the service pipeline.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * The major version of the service template that was used to create the service pipeline.
     * </p>
     * 
     * @param templateMajorVersion
     *        The major version of the service template that was used to create the service pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServicePipelineState withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * The minor version of the service template that was used to create the service pipeline.
     * </p>
     * 
     * @param templateMinorVersion
     *        The minor version of the service template that was used to create the service pipeline.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * The minor version of the service template that was used to create the service pipeline.
     * </p>
     * 
     * @return The minor version of the service template that was used to create the service pipeline.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * The minor version of the service template that was used to create the service pipeline.
     * </p>
     * 
     * @param templateMinorVersion
     *        The minor version of the service template that was used to create the service pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServicePipelineState withTemplateMinorVersion(String templateMinorVersion) {
        setTemplateMinorVersion(templateMinorVersion);
        return this;
    }

    /**
     * <p>
     * The name of the service template that was used to create the service pipeline.
     * </p>
     * 
     * @param templateName
     *        The name of the service template that was used to create the service pipeline.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the service template that was used to create the service pipeline.
     * </p>
     * 
     * @return The name of the service template that was used to create the service pipeline.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the service template that was used to create the service pipeline.
     * </p>
     * 
     * @param templateName
     *        The name of the service template that was used to create the service pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServicePipelineState withTemplateName(String templateName) {
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
        if (getSpec() != null)
            sb.append("Spec: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof ServicePipelineState == false)
            return false;
        ServicePipelineState other = (ServicePipelineState) obj;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
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

        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public ServicePipelineState clone() {
        try {
            return (ServicePipelineState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ServicePipelineStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

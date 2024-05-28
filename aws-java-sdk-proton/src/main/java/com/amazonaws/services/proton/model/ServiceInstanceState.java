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
 * The detailed data about the current state of this service instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ServiceInstanceState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceInstanceState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IDs for the last successful components deployed for this service instance.
     * </p>
     */
    private java.util.List<String> lastSuccessfulComponentDeploymentIds;
    /**
     * <p>
     * The ID for the last successful environment deployed for this service instance.
     * </p>
     */
    private String lastSuccessfulEnvironmentDeploymentId;
    /**
     * <p>
     * The ID for the last successful service pipeline deployed for this service instance.
     * </p>
     */
    private String lastSuccessfulServicePipelineDeploymentId;
    /**
     * <p>
     * The service spec that was used to create the service instance.
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
     * The name of the service template that was used to create the service instance.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The IDs for the last successful components deployed for this service instance.
     * </p>
     * 
     * @return The IDs for the last successful components deployed for this service instance.
     */

    public java.util.List<String> getLastSuccessfulComponentDeploymentIds() {
        return lastSuccessfulComponentDeploymentIds;
    }

    /**
     * <p>
     * The IDs for the last successful components deployed for this service instance.
     * </p>
     * 
     * @param lastSuccessfulComponentDeploymentIds
     *        The IDs for the last successful components deployed for this service instance.
     */

    public void setLastSuccessfulComponentDeploymentIds(java.util.Collection<String> lastSuccessfulComponentDeploymentIds) {
        if (lastSuccessfulComponentDeploymentIds == null) {
            this.lastSuccessfulComponentDeploymentIds = null;
            return;
        }

        this.lastSuccessfulComponentDeploymentIds = new java.util.ArrayList<String>(lastSuccessfulComponentDeploymentIds);
    }

    /**
     * <p>
     * The IDs for the last successful components deployed for this service instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLastSuccessfulComponentDeploymentIds(java.util.Collection)} or
     * {@link #withLastSuccessfulComponentDeploymentIds(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param lastSuccessfulComponentDeploymentIds
     *        The IDs for the last successful components deployed for this service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstanceState withLastSuccessfulComponentDeploymentIds(String... lastSuccessfulComponentDeploymentIds) {
        if (this.lastSuccessfulComponentDeploymentIds == null) {
            setLastSuccessfulComponentDeploymentIds(new java.util.ArrayList<String>(lastSuccessfulComponentDeploymentIds.length));
        }
        for (String ele : lastSuccessfulComponentDeploymentIds) {
            this.lastSuccessfulComponentDeploymentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs for the last successful components deployed for this service instance.
     * </p>
     * 
     * @param lastSuccessfulComponentDeploymentIds
     *        The IDs for the last successful components deployed for this service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstanceState withLastSuccessfulComponentDeploymentIds(java.util.Collection<String> lastSuccessfulComponentDeploymentIds) {
        setLastSuccessfulComponentDeploymentIds(lastSuccessfulComponentDeploymentIds);
        return this;
    }

    /**
     * <p>
     * The ID for the last successful environment deployed for this service instance.
     * </p>
     * 
     * @param lastSuccessfulEnvironmentDeploymentId
     *        The ID for the last successful environment deployed for this service instance.
     */

    public void setLastSuccessfulEnvironmentDeploymentId(String lastSuccessfulEnvironmentDeploymentId) {
        this.lastSuccessfulEnvironmentDeploymentId = lastSuccessfulEnvironmentDeploymentId;
    }

    /**
     * <p>
     * The ID for the last successful environment deployed for this service instance.
     * </p>
     * 
     * @return The ID for the last successful environment deployed for this service instance.
     */

    public String getLastSuccessfulEnvironmentDeploymentId() {
        return this.lastSuccessfulEnvironmentDeploymentId;
    }

    /**
     * <p>
     * The ID for the last successful environment deployed for this service instance.
     * </p>
     * 
     * @param lastSuccessfulEnvironmentDeploymentId
     *        The ID for the last successful environment deployed for this service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstanceState withLastSuccessfulEnvironmentDeploymentId(String lastSuccessfulEnvironmentDeploymentId) {
        setLastSuccessfulEnvironmentDeploymentId(lastSuccessfulEnvironmentDeploymentId);
        return this;
    }

    /**
     * <p>
     * The ID for the last successful service pipeline deployed for this service instance.
     * </p>
     * 
     * @param lastSuccessfulServicePipelineDeploymentId
     *        The ID for the last successful service pipeline deployed for this service instance.
     */

    public void setLastSuccessfulServicePipelineDeploymentId(String lastSuccessfulServicePipelineDeploymentId) {
        this.lastSuccessfulServicePipelineDeploymentId = lastSuccessfulServicePipelineDeploymentId;
    }

    /**
     * <p>
     * The ID for the last successful service pipeline deployed for this service instance.
     * </p>
     * 
     * @return The ID for the last successful service pipeline deployed for this service instance.
     */

    public String getLastSuccessfulServicePipelineDeploymentId() {
        return this.lastSuccessfulServicePipelineDeploymentId;
    }

    /**
     * <p>
     * The ID for the last successful service pipeline deployed for this service instance.
     * </p>
     * 
     * @param lastSuccessfulServicePipelineDeploymentId
     *        The ID for the last successful service pipeline deployed for this service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstanceState withLastSuccessfulServicePipelineDeploymentId(String lastSuccessfulServicePipelineDeploymentId) {
        setLastSuccessfulServicePipelineDeploymentId(lastSuccessfulServicePipelineDeploymentId);
        return this;
    }

    /**
     * <p>
     * The service spec that was used to create the service instance.
     * </p>
     * 
     * @param spec
     *        The service spec that was used to create the service instance.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The service spec that was used to create the service instance.
     * </p>
     * 
     * @return The service spec that was used to create the service instance.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The service spec that was used to create the service instance.
     * </p>
     * 
     * @param spec
     *        The service spec that was used to create the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstanceState withSpec(String spec) {
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

    public ServiceInstanceState withTemplateMajorVersion(String templateMajorVersion) {
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

    public ServiceInstanceState withTemplateMinorVersion(String templateMinorVersion) {
        setTemplateMinorVersion(templateMinorVersion);
        return this;
    }

    /**
     * <p>
     * The name of the service template that was used to create the service instance.
     * </p>
     * 
     * @param templateName
     *        The name of the service template that was used to create the service instance.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the service template that was used to create the service instance.
     * </p>
     * 
     * @return The name of the service template that was used to create the service instance.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the service template that was used to create the service instance.
     * </p>
     * 
     * @param templateName
     *        The name of the service template that was used to create the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstanceState withTemplateName(String templateName) {
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
        if (getLastSuccessfulComponentDeploymentIds() != null)
            sb.append("LastSuccessfulComponentDeploymentIds: ").append(getLastSuccessfulComponentDeploymentIds()).append(",");
        if (getLastSuccessfulEnvironmentDeploymentId() != null)
            sb.append("LastSuccessfulEnvironmentDeploymentId: ").append(getLastSuccessfulEnvironmentDeploymentId()).append(",");
        if (getLastSuccessfulServicePipelineDeploymentId() != null)
            sb.append("LastSuccessfulServicePipelineDeploymentId: ").append(getLastSuccessfulServicePipelineDeploymentId()).append(",");
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

        if (obj instanceof ServiceInstanceState == false)
            return false;
        ServiceInstanceState other = (ServiceInstanceState) obj;
        if (other.getLastSuccessfulComponentDeploymentIds() == null ^ this.getLastSuccessfulComponentDeploymentIds() == null)
            return false;
        if (other.getLastSuccessfulComponentDeploymentIds() != null
                && other.getLastSuccessfulComponentDeploymentIds().equals(this.getLastSuccessfulComponentDeploymentIds()) == false)
            return false;
        if (other.getLastSuccessfulEnvironmentDeploymentId() == null ^ this.getLastSuccessfulEnvironmentDeploymentId() == null)
            return false;
        if (other.getLastSuccessfulEnvironmentDeploymentId() != null
                && other.getLastSuccessfulEnvironmentDeploymentId().equals(this.getLastSuccessfulEnvironmentDeploymentId()) == false)
            return false;
        if (other.getLastSuccessfulServicePipelineDeploymentId() == null ^ this.getLastSuccessfulServicePipelineDeploymentId() == null)
            return false;
        if (other.getLastSuccessfulServicePipelineDeploymentId() != null
                && other.getLastSuccessfulServicePipelineDeploymentId().equals(this.getLastSuccessfulServicePipelineDeploymentId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getLastSuccessfulComponentDeploymentIds() == null) ? 0 : getLastSuccessfulComponentDeploymentIds().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulEnvironmentDeploymentId() == null) ? 0 : getLastSuccessfulEnvironmentDeploymentId().hashCode());
        hashCode = prime * hashCode
                + ((getLastSuccessfulServicePipelineDeploymentId() == null) ? 0 : getLastSuccessfulServicePipelineDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public ServiceInstanceState clone() {
        try {
            return (ServiceInstanceState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ServiceInstanceStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

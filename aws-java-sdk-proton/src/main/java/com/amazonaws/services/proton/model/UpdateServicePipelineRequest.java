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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServicePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServicePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The deployment type.
     * </p>
     * <p>
     * There are four modes for updating a service pipeline as described in the following. The
     * <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can also specify a different minor version of the current
     * major version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     */
    private String deploymentType;
    /**
     * <p>
     * The name of the service to that the pipeline is associated with.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The spec for the service pipeline to update.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * The major version of the service template that was used to create the service that the pipeline is associated
     * with.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * The minor version of the service template that was used to create the service that the pipeline is associated
     * with.
     * </p>
     */
    private String templateMinorVersion;

    /**
     * <p>
     * The deployment type.
     * </p>
     * <p>
     * There are four modes for updating a service pipeline as described in the following. The
     * <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can also specify a different minor version of the current
     * major version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        The deployment type.</p>
     *        <p>
     *        There are four modes for updating a service pipeline as described in the following. The
     *        <code>deploymentType</code> field defines the mode.
     *        </p>
     *        <dl>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        <p>
     *        In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>CURRENT_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only
     *        requested parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     *        <code>deployment-type</code>.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MINOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor
     *        version of the current major version in use, by default. You can also specify a different minor version of
     *        the current major version in use.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MAJOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major
     *        and minor version of the current template, by default. You can also specify a different major version that
     *        is higher than the major version in use and a minor version (optional).
     *        </p>
     *        </dd>
     * @see DeploymentUpdateType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * The deployment type.
     * </p>
     * <p>
     * There are four modes for updating a service pipeline as described in the following. The
     * <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can also specify a different minor version of the current
     * major version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The deployment type.</p>
     *         <p>
     *         There are four modes for updating a service pipeline as described in the following. The
     *         <code>deploymentType</code> field defines the mode.
     *         </p>
     *         <dl>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>NONE</code>
     *         </p>
     *         <p>
     *         In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     *         </p>
     *         </dd>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>CURRENT_VERSION</code>
     *         </p>
     *         <p>
     *         In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only
     *         requested parameters are updated. <i>Don’t</i> include minor or major version parameters when you use
     *         this <code>deployment-type</code>.
     *         </p>
     *         </dd>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>MINOR_VERSION</code>
     *         </p>
     *         <p>
     *         In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor
     *         version of the current major version in use, by default. You can also specify a different minor version
     *         of the current major version in use.
     *         </p>
     *         </dd>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>MAJOR_VERSION</code>
     *         </p>
     *         <p>
     *         In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major
     *         and minor version of the current template, by default. You can also specify a different major version
     *         that is higher than the major version in use and a minor version (optional).
     *         </p>
     *         </dd>
     * @see DeploymentUpdateType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * The deployment type.
     * </p>
     * <p>
     * There are four modes for updating a service pipeline as described in the following. The
     * <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can also specify a different minor version of the current
     * major version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        The deployment type.</p>
     *        <p>
     *        There are four modes for updating a service pipeline as described in the following. The
     *        <code>deploymentType</code> field defines the mode.
     *        </p>
     *        <dl>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        <p>
     *        In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>CURRENT_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only
     *        requested parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     *        <code>deployment-type</code>.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MINOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor
     *        version of the current major version in use, by default. You can also specify a different minor version of
     *        the current major version in use.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MAJOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major
     *        and minor version of the current template, by default. You can also specify a different major version that
     *        is higher than the major version in use and a minor version (optional).
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentUpdateType
     */

    public UpdateServicePipelineRequest withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * The deployment type.
     * </p>
     * <p>
     * There are four modes for updating a service pipeline as described in the following. The
     * <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can also specify a different minor version of the current
     * major version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        The deployment type.</p>
     *        <p>
     *        There are four modes for updating a service pipeline as described in the following. The
     *        <code>deploymentType</code> field defines the mode.
     *        </p>
     *        <dl>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        <p>
     *        In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>CURRENT_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only
     *        requested parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     *        <code>deployment-type</code>.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MINOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor
     *        version of the current major version in use, by default. You can also specify a different minor version of
     *        the current major version in use.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MAJOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major
     *        and minor version of the current template, by default. You can also specify a different major version that
     *        is higher than the major version in use and a minor version (optional).
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentUpdateType
     */

    public UpdateServicePipelineRequest withDeploymentType(DeploymentUpdateType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the service to that the pipeline is associated with.
     * </p>
     * 
     * @param serviceName
     *        The name of the service to that the pipeline is associated with.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service to that the pipeline is associated with.
     * </p>
     * 
     * @return The name of the service to that the pipeline is associated with.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service to that the pipeline is associated with.
     * </p>
     * 
     * @param serviceName
     *        The name of the service to that the pipeline is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServicePipelineRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The spec for the service pipeline to update.
     * </p>
     * 
     * @param spec
     *        The spec for the service pipeline to update.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The spec for the service pipeline to update.
     * </p>
     * 
     * @return The spec for the service pipeline to update.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The spec for the service pipeline to update.
     * </p>
     * 
     * @param spec
     *        The spec for the service pipeline to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServicePipelineRequest withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The major version of the service template that was used to create the service that the pipeline is associated
     * with.
     * </p>
     * 
     * @param templateMajorVersion
     *        The major version of the service template that was used to create the service that the pipeline is
     *        associated with.
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * The major version of the service template that was used to create the service that the pipeline is associated
     * with.
     * </p>
     * 
     * @return The major version of the service template that was used to create the service that the pipeline is
     *         associated with.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * The major version of the service template that was used to create the service that the pipeline is associated
     * with.
     * </p>
     * 
     * @param templateMajorVersion
     *        The major version of the service template that was used to create the service that the pipeline is
     *        associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServicePipelineRequest withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * The minor version of the service template that was used to create the service that the pipeline is associated
     * with.
     * </p>
     * 
     * @param templateMinorVersion
     *        The minor version of the service template that was used to create the service that the pipeline is
     *        associated with.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * The minor version of the service template that was used to create the service that the pipeline is associated
     * with.
     * </p>
     * 
     * @return The minor version of the service template that was used to create the service that the pipeline is
     *         associated with.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * The minor version of the service template that was used to create the service that the pipeline is associated
     * with.
     * </p>
     * 
     * @param templateMinorVersion
     *        The minor version of the service template that was used to create the service that the pipeline is
     *        associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServicePipelineRequest withTemplateMinorVersion(String templateMinorVersion) {
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
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof UpdateServicePipelineRequest == false)
            return false;
        UpdateServicePipelineRequest other = (UpdateServicePipelineRequest) obj;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServicePipelineRequest clone() {
        return (UpdateServicePipelineRequest) super.clone();
    }

}

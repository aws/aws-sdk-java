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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The deployment type.
     * </p>
     * <p>
     * There are four modes for updating a service instance as described in the following. The
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
     * In this mode, the service instance is deployed and updated with the new spec that you provide. Only requested
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) minor version
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     */
    private String deploymentType;
    /**
     * <p>
     * The name of the service instance to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The formatted specification that defines the service instance update.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * The major version of the service template to update.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * The minor version of the service template to update.
     * </p>
     */
    private String templateMinorVersion;

    /**
     * <p>
     * The deployment type.
     * </p>
     * <p>
     * There are four modes for updating a service instance as described in the following. The
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
     * In this mode, the service instance is deployed and updated with the new spec that you provide. Only requested
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) minor version
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        The deployment type.</p>
     *        <p>
     *        There are four modes for updating a service instance as described in the following. The
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
     *        In this mode, the service instance is deployed and updated with the new spec that you provide. Only
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
     *        In this mode, the service instance is deployed and updated with the published, recommended (latest) minor
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
     *        In this mode, the service instance is deployed and updated with the published, recommended (latest) major
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
     * There are four modes for updating a service instance as described in the following. The
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
     * In this mode, the service instance is deployed and updated with the new spec that you provide. Only requested
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) minor version
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The deployment type.</p>
     *         <p>
     *         There are four modes for updating a service instance as described in the following. The
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
     *         In this mode, the service instance is deployed and updated with the new spec that you provide. Only
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
     *         In this mode, the service instance is deployed and updated with the published, recommended (latest) minor
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
     *         In this mode, the service instance is deployed and updated with the published, recommended (latest) major
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
     * There are four modes for updating a service instance as described in the following. The
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
     * In this mode, the service instance is deployed and updated with the new spec that you provide. Only requested
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) minor version
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        The deployment type.</p>
     *        <p>
     *        There are four modes for updating a service instance as described in the following. The
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
     *        In this mode, the service instance is deployed and updated with the new spec that you provide. Only
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
     *        In this mode, the service instance is deployed and updated with the published, recommended (latest) minor
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
     *        In this mode, the service instance is deployed and updated with the published, recommended (latest) major
     *        and minor version of the current template, by default. You can also specify a different major version that
     *        is higher than the major version in use and a minor version (optional).
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentUpdateType
     */

    public UpdateServiceInstanceRequest withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * The deployment type.
     * </p>
     * <p>
     * There are four modes for updating a service instance as described in the following. The
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
     * In this mode, the service instance is deployed and updated with the new spec that you provide. Only requested
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) minor version
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
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        The deployment type.</p>
     *        <p>
     *        There are four modes for updating a service instance as described in the following. The
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
     *        In this mode, the service instance is deployed and updated with the new spec that you provide. Only
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
     *        In this mode, the service instance is deployed and updated with the published, recommended (latest) minor
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
     *        In this mode, the service instance is deployed and updated with the published, recommended (latest) major
     *        and minor version of the current template, by default. You can also specify a different major version that
     *        is higher than the major version in use and a minor version (optional).
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentUpdateType
     */

    public UpdateServiceInstanceRequest withDeploymentType(DeploymentUpdateType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the service instance to update.
     * </p>
     * 
     * @param name
     *        The name of the service instance to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service instance to update.
     * </p>
     * 
     * @return The name of the service instance to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service instance to update.
     * </p>
     * 
     * @param name
     *        The name of the service instance to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceInstanceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @return The name of the service that the service instance belongs to.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceInstanceRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The formatted specification that defines the service instance update.
     * </p>
     * 
     * @param spec
     *        The formatted specification that defines the service instance update.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The formatted specification that defines the service instance update.
     * </p>
     * 
     * @return The formatted specification that defines the service instance update.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The formatted specification that defines the service instance update.
     * </p>
     * 
     * @param spec
     *        The formatted specification that defines the service instance update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceInstanceRequest withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The major version of the service template to update.
     * </p>
     * 
     * @param templateMajorVersion
     *        The major version of the service template to update.
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * The major version of the service template to update.
     * </p>
     * 
     * @return The major version of the service template to update.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * The major version of the service template to update.
     * </p>
     * 
     * @param templateMajorVersion
     *        The major version of the service template to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceInstanceRequest withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * The minor version of the service template to update.
     * </p>
     * 
     * @param templateMinorVersion
     *        The minor version of the service template to update.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * The minor version of the service template to update.
     * </p>
     * 
     * @return The minor version of the service template to update.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * The minor version of the service template to update.
     * </p>
     * 
     * @param templateMinorVersion
     *        The minor version of the service template to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceInstanceRequest withTemplateMinorVersion(String templateMinorVersion) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof UpdateServiceInstanceRequest == false)
            return false;
        UpdateServiceInstanceRequest other = (UpdateServiceInstanceRequest) obj;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceInstanceRequest clone() {
        return (UpdateServiceInstanceRequest) super.clone();
    }

}

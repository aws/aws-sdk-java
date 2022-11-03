/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The deployment type. It defines the mode for updating a component, as follows:
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated. You can only
     * specify <code>description</code> in this mode.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the component is deployed and updated with the new <code>serviceSpec</code>,
     * <code>templateSource</code>, and/or <code>type</code> that you provide. Only requested parameters are updated.
     * </p>
     * </dd>
     * </dl>
     */
    private String deploymentType;
    /**
     * <p>
     * An optional customer-provided description of the component.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the component to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the service instance that you want to attach this component to. Don't specify to keep the component's
     * current service instance attachment. Specify an empty string to detach the component from the service instance
     * it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and <code>serviceName</code>
     * or for neither of them.
     * </p>
     */
    private String serviceInstanceName;
    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Don't specify to keep the
     * component's current service instance attachment. Specify an empty string to detach the component from the service
     * instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or for neither of them.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The service spec that you want the component to use to access service inputs. Set this only when the component is
     * attached to a service instance.
     * </p>
     */
    private String serviceSpec;
    /**
     * <p>
     * A path to the Infrastructure as Code (IaC) file describing infrastructure that a custom component provisions.
     * </p>
     * <note>
     * <p>
     * Components support a single IaC file, even if you use Terraform as your template language.
     * </p>
     * </note>
     */
    private String templateFile;

    /**
     * <p>
     * The deployment type. It defines the mode for updating a component, as follows:
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated. You can only
     * specify <code>description</code> in this mode.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the component is deployed and updated with the new <code>serviceSpec</code>,
     * <code>templateSource</code>, and/or <code>type</code> that you provide. Only requested parameters are updated.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        The deployment type. It defines the mode for updating a component, as follows:</p>
     *        <dl>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        <p>
     *        In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated. You
     *        can only specify <code>description</code> in this mode.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>CURRENT_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the component is deployed and updated with the new <code>serviceSpec</code>,
     *        <code>templateSource</code>, and/or <code>type</code> that you provide. Only requested parameters are
     *        updated.
     *        </p>
     *        </dd>
     * @see ComponentDeploymentUpdateType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * The deployment type. It defines the mode for updating a component, as follows:
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated. You can only
     * specify <code>description</code> in this mode.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the component is deployed and updated with the new <code>serviceSpec</code>,
     * <code>templateSource</code>, and/or <code>type</code> that you provide. Only requested parameters are updated.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The deployment type. It defines the mode for updating a component, as follows:</p>
     *         <dl>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>NONE</code>
     *         </p>
     *         <p>
     *         In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated. You
     *         can only specify <code>description</code> in this mode.
     *         </p>
     *         </dd>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>CURRENT_VERSION</code>
     *         </p>
     *         <p>
     *         In this mode, the component is deployed and updated with the new <code>serviceSpec</code>,
     *         <code>templateSource</code>, and/or <code>type</code> that you provide. Only requested parameters are
     *         updated.
     *         </p>
     *         </dd>
     * @see ComponentDeploymentUpdateType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * The deployment type. It defines the mode for updating a component, as follows:
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated. You can only
     * specify <code>description</code> in this mode.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the component is deployed and updated with the new <code>serviceSpec</code>,
     * <code>templateSource</code>, and/or <code>type</code> that you provide. Only requested parameters are updated.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        The deployment type. It defines the mode for updating a component, as follows:</p>
     *        <dl>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        <p>
     *        In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated. You
     *        can only specify <code>description</code> in this mode.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>CURRENT_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the component is deployed and updated with the new <code>serviceSpec</code>,
     *        <code>templateSource</code>, and/or <code>type</code> that you provide. Only requested parameters are
     *        updated.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentDeploymentUpdateType
     */

    public UpdateComponentRequest withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * The deployment type. It defines the mode for updating a component, as follows:
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated. You can only
     * specify <code>description</code> in this mode.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the component is deployed and updated with the new <code>serviceSpec</code>,
     * <code>templateSource</code>, and/or <code>type</code> that you provide. Only requested parameters are updated.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        The deployment type. It defines the mode for updating a component, as follows:</p>
     *        <dl>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        <p>
     *        In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated. You
     *        can only specify <code>description</code> in this mode.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>CURRENT_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the component is deployed and updated with the new <code>serviceSpec</code>,
     *        <code>templateSource</code>, and/or <code>type</code> that you provide. Only requested parameters are
     *        updated.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentDeploymentUpdateType
     */

    public UpdateComponentRequest withDeploymentType(ComponentDeploymentUpdateType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * An optional customer-provided description of the component.
     * </p>
     * 
     * @param description
     *        An optional customer-provided description of the component.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional customer-provided description of the component.
     * </p>
     * 
     * @return An optional customer-provided description of the component.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional customer-provided description of the component.
     * </p>
     * 
     * @param description
     *        An optional customer-provided description of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the component to update.
     * </p>
     * 
     * @param name
     *        The name of the component to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the component to update.
     * </p>
     * 
     * @return The name of the component to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the component to update.
     * </p>
     * 
     * @param name
     *        The name of the component to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the service instance that you want to attach this component to. Don't specify to keep the component's
     * current service instance attachment. Specify an empty string to detach the component from the service instance
     * it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and <code>serviceName</code>
     * or for neither of them.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that you want to attach this component to. Don't specify to keep the
     *        component's current service instance attachment. Specify an empty string to detach the component from the
     *        service instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and
     *        <code>serviceName</code> or for neither of them.
     */

    public void setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that you want to attach this component to. Don't specify to keep the component's
     * current service instance attachment. Specify an empty string to detach the component from the service instance
     * it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and <code>serviceName</code>
     * or for neither of them.
     * </p>
     * 
     * @return The name of the service instance that you want to attach this component to. Don't specify to keep the
     *         component's current service instance attachment. Specify an empty string to detach the component from the
     *         service instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and
     *         <code>serviceName</code> or for neither of them.
     */

    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that you want to attach this component to. Don't specify to keep the component's
     * current service instance attachment. Specify an empty string to detach the component from the service instance
     * it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and <code>serviceName</code>
     * or for neither of them.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that you want to attach this component to. Don't specify to keep the
     *        component's current service instance attachment. Specify an empty string to detach the component from the
     *        service instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and
     *        <code>serviceName</code> or for neither of them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withServiceInstanceName(String serviceInstanceName) {
        setServiceInstanceName(serviceInstanceName);
        return this;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Don't specify to keep the
     * component's current service instance attachment. Specify an empty string to detach the component from the service
     * instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or for neither of them.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that <code>serviceInstanceName</code> is associated with. Don't specify to keep
     *        the component's current service instance attachment. Specify an empty string to detach the component from
     *        the service instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code>
     *        and <code>serviceName</code> or for neither of them.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Don't specify to keep the
     * component's current service instance attachment. Specify an empty string to detach the component from the service
     * instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or for neither of them.
     * </p>
     * 
     * @return The name of the service that <code>serviceInstanceName</code> is associated with. Don't specify to keep
     *         the component's current service instance attachment. Specify an empty string to detach the component from
     *         the service instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code>
     *         and <code>serviceName</code> or for neither of them.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Don't specify to keep the
     * component's current service instance attachment. Specify an empty string to detach the component from the service
     * instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or for neither of them.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that <code>serviceInstanceName</code> is associated with. Don't specify to keep
     *        the component's current service instance attachment. Specify an empty string to detach the component from
     *        the service instance it's attached to. Specify non-empty values for both <code>serviceInstanceName</code>
     *        and <code>serviceName</code> or for neither of them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The service spec that you want the component to use to access service inputs. Set this only when the component is
     * attached to a service instance.
     * </p>
     * 
     * @param serviceSpec
     *        The service spec that you want the component to use to access service inputs. Set this only when the
     *        component is attached to a service instance.
     */

    public void setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
    }

    /**
     * <p>
     * The service spec that you want the component to use to access service inputs. Set this only when the component is
     * attached to a service instance.
     * </p>
     * 
     * @return The service spec that you want the component to use to access service inputs. Set this only when the
     *         component is attached to a service instance.
     */

    public String getServiceSpec() {
        return this.serviceSpec;
    }

    /**
     * <p>
     * The service spec that you want the component to use to access service inputs. Set this only when the component is
     * attached to a service instance.
     * </p>
     * 
     * @param serviceSpec
     *        The service spec that you want the component to use to access service inputs. Set this only when the
     *        component is attached to a service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withServiceSpec(String serviceSpec) {
        setServiceSpec(serviceSpec);
        return this;
    }

    /**
     * <p>
     * A path to the Infrastructure as Code (IaC) file describing infrastructure that a custom component provisions.
     * </p>
     * <note>
     * <p>
     * Components support a single IaC file, even if you use Terraform as your template language.
     * </p>
     * </note>
     * 
     * @param templateFile
     *        A path to the Infrastructure as Code (IaC) file describing infrastructure that a custom component
     *        provisions.</p> <note>
     *        <p>
     *        Components support a single IaC file, even if you use Terraform as your template language.
     *        </p>
     */

    public void setTemplateFile(String templateFile) {
        this.templateFile = templateFile;
    }

    /**
     * <p>
     * A path to the Infrastructure as Code (IaC) file describing infrastructure that a custom component provisions.
     * </p>
     * <note>
     * <p>
     * Components support a single IaC file, even if you use Terraform as your template language.
     * </p>
     * </note>
     * 
     * @return A path to the Infrastructure as Code (IaC) file describing infrastructure that a custom component
     *         provisions.</p> <note>
     *         <p>
     *         Components support a single IaC file, even if you use Terraform as your template language.
     *         </p>
     */

    public String getTemplateFile() {
        return this.templateFile;
    }

    /**
     * <p>
     * A path to the Infrastructure as Code (IaC) file describing infrastructure that a custom component provisions.
     * </p>
     * <note>
     * <p>
     * Components support a single IaC file, even if you use Terraform as your template language.
     * </p>
     * </note>
     * 
     * @param templateFile
     *        A path to the Infrastructure as Code (IaC) file describing infrastructure that a custom component
     *        provisions.</p> <note>
     *        <p>
     *        Components support a single IaC file, even if you use Terraform as your template language.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withTemplateFile(String templateFile) {
        setTemplateFile(templateFile);
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServiceInstanceName() != null)
            sb.append("ServiceInstanceName: ").append(getServiceInstanceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceSpec() != null)
            sb.append("ServiceSpec: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateFile() != null)
            sb.append("TemplateFile: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateComponentRequest == false)
            return false;
        UpdateComponentRequest other = (UpdateComponentRequest) obj;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServiceInstanceName() == null ^ this.getServiceInstanceName() == null)
            return false;
        if (other.getServiceInstanceName() != null && other.getServiceInstanceName().equals(this.getServiceInstanceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceSpec() == null ^ this.getServiceSpec() == null)
            return false;
        if (other.getServiceSpec() != null && other.getServiceSpec().equals(this.getServiceSpec()) == false)
            return false;
        if (other.getTemplateFile() == null ^ this.getTemplateFile() == null)
            return false;
        if (other.getTemplateFile() != null && other.getTemplateFile().equals(this.getTemplateFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServiceInstanceName() == null) ? 0 : getServiceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceSpec() == null) ? 0 : getServiceSpec().hashCode());
        hashCode = prime * hashCode + ((getTemplateFile() == null) ? 0 : getTemplateFile().hashCode());
        return hashCode;
    }

    @Override
    public UpdateComponentRequest clone() {
        return (UpdateComponentRequest) super.clone();
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional customer-provided description of the component.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the Proton environment that you want to associate this component with. You must specify this when you
     * don't specify <code>serviceInstanceName</code> and <code>serviceName</code>.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * A path to a manifest file that lists the Infrastructure as Code (IaC) file, template language, and rendering
     * engine for infrastructure that a custom component provisions.
     * </p>
     */
    private String manifest;
    /**
     * <p>
     * The customer-provided name of the component.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the service instance that you want to attach this component to. If you don't specify this, the
     * component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or neither of them.
     * </p>
     */
    private String serviceInstanceName;
    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. If you don't specify this, the
     * component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or neither of them.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The service spec that you want the component to use to access service inputs. Set this only when you attach the
     * component to a service instance.
     * </p>
     */
    private String serviceSpec;
    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton component. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
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

    public CreateComponentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the Proton environment that you want to associate this component with. You must specify this when you
     * don't specify <code>serviceInstanceName</code> and <code>serviceName</code>.
     * </p>
     * 
     * @param environmentName
     *        The name of the Proton environment that you want to associate this component with. You must specify this
     *        when you don't specify <code>serviceInstanceName</code> and <code>serviceName</code>.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the Proton environment that you want to associate this component with. You must specify this when you
     * don't specify <code>serviceInstanceName</code> and <code>serviceName</code>.
     * </p>
     * 
     * @return The name of the Proton environment that you want to associate this component with. You must specify this
     *         when you don't specify <code>serviceInstanceName</code> and <code>serviceName</code>.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the Proton environment that you want to associate this component with. You must specify this when you
     * don't specify <code>serviceInstanceName</code> and <code>serviceName</code>.
     * </p>
     * 
     * @param environmentName
     *        The name of the Proton environment that you want to associate this component with. You must specify this
     *        when you don't specify <code>serviceInstanceName</code> and <code>serviceName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * A path to a manifest file that lists the Infrastructure as Code (IaC) file, template language, and rendering
     * engine for infrastructure that a custom component provisions.
     * </p>
     * 
     * @param manifest
     *        A path to a manifest file that lists the Infrastructure as Code (IaC) file, template language, and
     *        rendering engine for infrastructure that a custom component provisions.
     */

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    /**
     * <p>
     * A path to a manifest file that lists the Infrastructure as Code (IaC) file, template language, and rendering
     * engine for infrastructure that a custom component provisions.
     * </p>
     * 
     * @return A path to a manifest file that lists the Infrastructure as Code (IaC) file, template language, and
     *         rendering engine for infrastructure that a custom component provisions.
     */

    public String getManifest() {
        return this.manifest;
    }

    /**
     * <p>
     * A path to a manifest file that lists the Infrastructure as Code (IaC) file, template language, and rendering
     * engine for infrastructure that a custom component provisions.
     * </p>
     * 
     * @param manifest
     *        A path to a manifest file that lists the Infrastructure as Code (IaC) file, template language, and
     *        rendering engine for infrastructure that a custom component provisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withManifest(String manifest) {
        setManifest(manifest);
        return this;
    }

    /**
     * <p>
     * The customer-provided name of the component.
     * </p>
     * 
     * @param name
     *        The customer-provided name of the component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The customer-provided name of the component.
     * </p>
     * 
     * @return The customer-provided name of the component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The customer-provided name of the component.
     * </p>
     * 
     * @param name
     *        The customer-provided name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the service instance that you want to attach this component to. If you don't specify this, the
     * component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or neither of them.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that you want to attach this component to. If you don't specify this, the
     *        component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     *        <code>serviceName</code> or neither of them.
     */

    public void setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that you want to attach this component to. If you don't specify this, the
     * component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or neither of them.
     * </p>
     * 
     * @return The name of the service instance that you want to attach this component to. If you don't specify this,
     *         the component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     *         <code>serviceName</code> or neither of them.
     */

    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that you want to attach this component to. If you don't specify this, the
     * component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or neither of them.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that you want to attach this component to. If you don't specify this, the
     *        component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     *        <code>serviceName</code> or neither of them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withServiceInstanceName(String serviceInstanceName) {
        setServiceInstanceName(serviceInstanceName);
        return this;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. If you don't specify this, the
     * component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or neither of them.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that <code>serviceInstanceName</code> is associated with. If you don't specify
     *        this, the component isn't attached to any service instance. Specify both <code>serviceInstanceName</code>
     *        and <code>serviceName</code> or neither of them.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. If you don't specify this, the
     * component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or neither of them.
     * </p>
     * 
     * @return The name of the service that <code>serviceInstanceName</code> is associated with. If you don't specify
     *         this, the component isn't attached to any service instance. Specify both <code>serviceInstanceName</code>
     *         and <code>serviceName</code> or neither of them.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. If you don't specify this, the
     * component isn't attached to any service instance. Specify both <code>serviceInstanceName</code> and
     * <code>serviceName</code> or neither of them.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that <code>serviceInstanceName</code> is associated with. If you don't specify
     *        this, the component isn't attached to any service instance. Specify both <code>serviceInstanceName</code>
     *        and <code>serviceName</code> or neither of them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The service spec that you want the component to use to access service inputs. Set this only when you attach the
     * component to a service instance.
     * </p>
     * 
     * @param serviceSpec
     *        The service spec that you want the component to use to access service inputs. Set this only when you
     *        attach the component to a service instance.
     */

    public void setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
    }

    /**
     * <p>
     * The service spec that you want the component to use to access service inputs. Set this only when you attach the
     * component to a service instance.
     * </p>
     * 
     * @return The service spec that you want the component to use to access service inputs. Set this only when you
     *         attach the component to a service instance.
     */

    public String getServiceSpec() {
        return this.serviceSpec;
    }

    /**
     * <p>
     * The service spec that you want the component to use to access service inputs. Set this only when you attach the
     * component to a service instance.
     * </p>
     * 
     * @param serviceSpec
     *        The service spec that you want the component to use to access service inputs. Set this only when you
     *        attach the component to a service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withServiceSpec(String serviceSpec) {
        setServiceSpec(serviceSpec);
        return this;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton component. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @return An optional list of metadata items that you can associate with the Proton component. A tag is a key-value
     *         pair.</p>
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
     * An optional list of metadata items that you can associate with the Proton component. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton component. A tag is a key-value
     *        pair.</p>
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
     * An optional list of metadata items that you can associate with the Proton component. A tag is a key-value pair.
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
     *        An optional list of metadata items that you can associate with the Proton component. A tag is a key-value
     *        pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withTags(Tag... tags) {
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
     * An optional list of metadata items that you can associate with the Proton component. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton component. A tag is a key-value
     *        pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public CreateComponentRequest withTemplateFile(String templateFile) {
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getManifest() != null)
            sb.append("Manifest: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServiceInstanceName() != null)
            sb.append("ServiceInstanceName: ").append(getServiceInstanceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceSpec() != null)
            sb.append("ServiceSpec: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateComponentRequest == false)
            return false;
        CreateComponentRequest other = (CreateComponentRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getManifest() == null ^ this.getManifest() == null)
            return false;
        if (other.getManifest() != null && other.getManifest().equals(this.getManifest()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getManifest() == null) ? 0 : getManifest().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServiceInstanceName() == null) ? 0 : getServiceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceSpec() == null) ? 0 : getServiceSpec().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateFile() == null) ? 0 : getTemplateFile().hashCode());
        return hashCode;
    }

    @Override
    public CreateComponentRequest clone() {
        return (CreateComponentRequest) super.clone();
    }

}

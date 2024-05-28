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
 * Summary counts of each Proton resource type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CountsSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CountsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of components in the Amazon Web Services account.
     * </p>
     * <p>
     * The semantics of the <code>components</code> field are different from the semantics of results for other
     * infrastructure-provisioning resources. That's because at this time components don't have associated templates,
     * therefore they don't have the concept of staleness. The <code>components</code> object will only contain
     * <code>total</code> and <code>failed</code> members.
     * </p>
     */
    private ResourceCountsSummary components;
    /**
     * <p>
     * The total number of environment templates in the Amazon Web Services account. The
     * <code>environmentTemplates</code> object will only contain <code>total</code> members.
     * </p>
     */
    private ResourceCountsSummary environmentTemplates;
    /**
     * <p>
     * The staleness counts for Proton environments in the Amazon Web Services account. The <code>environments</code>
     * object will only contain <code>total</code> members.
     * </p>
     */
    private ResourceCountsSummary environments;
    /**
     * <p>
     * The staleness counts for Proton pipelines in the Amazon Web Services account.
     * </p>
     */
    private ResourceCountsSummary pipelines;
    /**
     * <p>
     * The staleness counts for Proton service instances in the Amazon Web Services account.
     * </p>
     */
    private ResourceCountsSummary serviceInstances;
    /**
     * <p>
     * The total number of service templates in the Amazon Web Services account. The <code>serviceTemplates</code>
     * object will only contain <code>total</code> members.
     * </p>
     */
    private ResourceCountsSummary serviceTemplates;
    /**
     * <p>
     * The staleness counts for Proton services in the Amazon Web Services account.
     * </p>
     */
    private ResourceCountsSummary services;

    /**
     * <p>
     * The total number of components in the Amazon Web Services account.
     * </p>
     * <p>
     * The semantics of the <code>components</code> field are different from the semantics of results for other
     * infrastructure-provisioning resources. That's because at this time components don't have associated templates,
     * therefore they don't have the concept of staleness. The <code>components</code> object will only contain
     * <code>total</code> and <code>failed</code> members.
     * </p>
     * 
     * @param components
     *        The total number of components in the Amazon Web Services account.</p>
     *        <p>
     *        The semantics of the <code>components</code> field are different from the semantics of results for other
     *        infrastructure-provisioning resources. That's because at this time components don't have associated
     *        templates, therefore they don't have the concept of staleness. The <code>components</code> object will
     *        only contain <code>total</code> and <code>failed</code> members.
     */

    public void setComponents(ResourceCountsSummary components) {
        this.components = components;
    }

    /**
     * <p>
     * The total number of components in the Amazon Web Services account.
     * </p>
     * <p>
     * The semantics of the <code>components</code> field are different from the semantics of results for other
     * infrastructure-provisioning resources. That's because at this time components don't have associated templates,
     * therefore they don't have the concept of staleness. The <code>components</code> object will only contain
     * <code>total</code> and <code>failed</code> members.
     * </p>
     * 
     * @return The total number of components in the Amazon Web Services account.</p>
     *         <p>
     *         The semantics of the <code>components</code> field are different from the semantics of results for other
     *         infrastructure-provisioning resources. That's because at this time components don't have associated
     *         templates, therefore they don't have the concept of staleness. The <code>components</code> object will
     *         only contain <code>total</code> and <code>failed</code> members.
     */

    public ResourceCountsSummary getComponents() {
        return this.components;
    }

    /**
     * <p>
     * The total number of components in the Amazon Web Services account.
     * </p>
     * <p>
     * The semantics of the <code>components</code> field are different from the semantics of results for other
     * infrastructure-provisioning resources. That's because at this time components don't have associated templates,
     * therefore they don't have the concept of staleness. The <code>components</code> object will only contain
     * <code>total</code> and <code>failed</code> members.
     * </p>
     * 
     * @param components
     *        The total number of components in the Amazon Web Services account.</p>
     *        <p>
     *        The semantics of the <code>components</code> field are different from the semantics of results for other
     *        infrastructure-provisioning resources. That's because at this time components don't have associated
     *        templates, therefore they don't have the concept of staleness. The <code>components</code> object will
     *        only contain <code>total</code> and <code>failed</code> members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountsSummary withComponents(ResourceCountsSummary components) {
        setComponents(components);
        return this;
    }

    /**
     * <p>
     * The total number of environment templates in the Amazon Web Services account. The
     * <code>environmentTemplates</code> object will only contain <code>total</code> members.
     * </p>
     * 
     * @param environmentTemplates
     *        The total number of environment templates in the Amazon Web Services account. The
     *        <code>environmentTemplates</code> object will only contain <code>total</code> members.
     */

    public void setEnvironmentTemplates(ResourceCountsSummary environmentTemplates) {
        this.environmentTemplates = environmentTemplates;
    }

    /**
     * <p>
     * The total number of environment templates in the Amazon Web Services account. The
     * <code>environmentTemplates</code> object will only contain <code>total</code> members.
     * </p>
     * 
     * @return The total number of environment templates in the Amazon Web Services account. The
     *         <code>environmentTemplates</code> object will only contain <code>total</code> members.
     */

    public ResourceCountsSummary getEnvironmentTemplates() {
        return this.environmentTemplates;
    }

    /**
     * <p>
     * The total number of environment templates in the Amazon Web Services account. The
     * <code>environmentTemplates</code> object will only contain <code>total</code> members.
     * </p>
     * 
     * @param environmentTemplates
     *        The total number of environment templates in the Amazon Web Services account. The
     *        <code>environmentTemplates</code> object will only contain <code>total</code> members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountsSummary withEnvironmentTemplates(ResourceCountsSummary environmentTemplates) {
        setEnvironmentTemplates(environmentTemplates);
        return this;
    }

    /**
     * <p>
     * The staleness counts for Proton environments in the Amazon Web Services account. The <code>environments</code>
     * object will only contain <code>total</code> members.
     * </p>
     * 
     * @param environments
     *        The staleness counts for Proton environments in the Amazon Web Services account. The
     *        <code>environments</code> object will only contain <code>total</code> members.
     */

    public void setEnvironments(ResourceCountsSummary environments) {
        this.environments = environments;
    }

    /**
     * <p>
     * The staleness counts for Proton environments in the Amazon Web Services account. The <code>environments</code>
     * object will only contain <code>total</code> members.
     * </p>
     * 
     * @return The staleness counts for Proton environments in the Amazon Web Services account. The
     *         <code>environments</code> object will only contain <code>total</code> members.
     */

    public ResourceCountsSummary getEnvironments() {
        return this.environments;
    }

    /**
     * <p>
     * The staleness counts for Proton environments in the Amazon Web Services account. The <code>environments</code>
     * object will only contain <code>total</code> members.
     * </p>
     * 
     * @param environments
     *        The staleness counts for Proton environments in the Amazon Web Services account. The
     *        <code>environments</code> object will only contain <code>total</code> members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountsSummary withEnvironments(ResourceCountsSummary environments) {
        setEnvironments(environments);
        return this;
    }

    /**
     * <p>
     * The staleness counts for Proton pipelines in the Amazon Web Services account.
     * </p>
     * 
     * @param pipelines
     *        The staleness counts for Proton pipelines in the Amazon Web Services account.
     */

    public void setPipelines(ResourceCountsSummary pipelines) {
        this.pipelines = pipelines;
    }

    /**
     * <p>
     * The staleness counts for Proton pipelines in the Amazon Web Services account.
     * </p>
     * 
     * @return The staleness counts for Proton pipelines in the Amazon Web Services account.
     */

    public ResourceCountsSummary getPipelines() {
        return this.pipelines;
    }

    /**
     * <p>
     * The staleness counts for Proton pipelines in the Amazon Web Services account.
     * </p>
     * 
     * @param pipelines
     *        The staleness counts for Proton pipelines in the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountsSummary withPipelines(ResourceCountsSummary pipelines) {
        setPipelines(pipelines);
        return this;
    }

    /**
     * <p>
     * The staleness counts for Proton service instances in the Amazon Web Services account.
     * </p>
     * 
     * @param serviceInstances
     *        The staleness counts for Proton service instances in the Amazon Web Services account.
     */

    public void setServiceInstances(ResourceCountsSummary serviceInstances) {
        this.serviceInstances = serviceInstances;
    }

    /**
     * <p>
     * The staleness counts for Proton service instances in the Amazon Web Services account.
     * </p>
     * 
     * @return The staleness counts for Proton service instances in the Amazon Web Services account.
     */

    public ResourceCountsSummary getServiceInstances() {
        return this.serviceInstances;
    }

    /**
     * <p>
     * The staleness counts for Proton service instances in the Amazon Web Services account.
     * </p>
     * 
     * @param serviceInstances
     *        The staleness counts for Proton service instances in the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountsSummary withServiceInstances(ResourceCountsSummary serviceInstances) {
        setServiceInstances(serviceInstances);
        return this;
    }

    /**
     * <p>
     * The total number of service templates in the Amazon Web Services account. The <code>serviceTemplates</code>
     * object will only contain <code>total</code> members.
     * </p>
     * 
     * @param serviceTemplates
     *        The total number of service templates in the Amazon Web Services account. The
     *        <code>serviceTemplates</code> object will only contain <code>total</code> members.
     */

    public void setServiceTemplates(ResourceCountsSummary serviceTemplates) {
        this.serviceTemplates = serviceTemplates;
    }

    /**
     * <p>
     * The total number of service templates in the Amazon Web Services account. The <code>serviceTemplates</code>
     * object will only contain <code>total</code> members.
     * </p>
     * 
     * @return The total number of service templates in the Amazon Web Services account. The
     *         <code>serviceTemplates</code> object will only contain <code>total</code> members.
     */

    public ResourceCountsSummary getServiceTemplates() {
        return this.serviceTemplates;
    }

    /**
     * <p>
     * The total number of service templates in the Amazon Web Services account. The <code>serviceTemplates</code>
     * object will only contain <code>total</code> members.
     * </p>
     * 
     * @param serviceTemplates
     *        The total number of service templates in the Amazon Web Services account. The
     *        <code>serviceTemplates</code> object will only contain <code>total</code> members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountsSummary withServiceTemplates(ResourceCountsSummary serviceTemplates) {
        setServiceTemplates(serviceTemplates);
        return this;
    }

    /**
     * <p>
     * The staleness counts for Proton services in the Amazon Web Services account.
     * </p>
     * 
     * @param services
     *        The staleness counts for Proton services in the Amazon Web Services account.
     */

    public void setServices(ResourceCountsSummary services) {
        this.services = services;
    }

    /**
     * <p>
     * The staleness counts for Proton services in the Amazon Web Services account.
     * </p>
     * 
     * @return The staleness counts for Proton services in the Amazon Web Services account.
     */

    public ResourceCountsSummary getServices() {
        return this.services;
    }

    /**
     * <p>
     * The staleness counts for Proton services in the Amazon Web Services account.
     * </p>
     * 
     * @param services
     *        The staleness counts for Proton services in the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CountsSummary withServices(ResourceCountsSummary services) {
        setServices(services);
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
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getEnvironmentTemplates() != null)
            sb.append("EnvironmentTemplates: ").append(getEnvironmentTemplates()).append(",");
        if (getEnvironments() != null)
            sb.append("Environments: ").append(getEnvironments()).append(",");
        if (getPipelines() != null)
            sb.append("Pipelines: ").append(getPipelines()).append(",");
        if (getServiceInstances() != null)
            sb.append("ServiceInstances: ").append(getServiceInstances()).append(",");
        if (getServiceTemplates() != null)
            sb.append("ServiceTemplates: ").append(getServiceTemplates()).append(",");
        if (getServices() != null)
            sb.append("Services: ").append(getServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CountsSummary == false)
            return false;
        CountsSummary other = (CountsSummary) obj;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getEnvironmentTemplates() == null ^ this.getEnvironmentTemplates() == null)
            return false;
        if (other.getEnvironmentTemplates() != null && other.getEnvironmentTemplates().equals(this.getEnvironmentTemplates()) == false)
            return false;
        if (other.getEnvironments() == null ^ this.getEnvironments() == null)
            return false;
        if (other.getEnvironments() != null && other.getEnvironments().equals(this.getEnvironments()) == false)
            return false;
        if (other.getPipelines() == null ^ this.getPipelines() == null)
            return false;
        if (other.getPipelines() != null && other.getPipelines().equals(this.getPipelines()) == false)
            return false;
        if (other.getServiceInstances() == null ^ this.getServiceInstances() == null)
            return false;
        if (other.getServiceInstances() != null && other.getServiceInstances().equals(this.getServiceInstances()) == false)
            return false;
        if (other.getServiceTemplates() == null ^ this.getServiceTemplates() == null)
            return false;
        if (other.getServiceTemplates() != null && other.getServiceTemplates().equals(this.getServiceTemplates()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentTemplates() == null) ? 0 : getEnvironmentTemplates().hashCode());
        hashCode = prime * hashCode + ((getEnvironments() == null) ? 0 : getEnvironments().hashCode());
        hashCode = prime * hashCode + ((getPipelines() == null) ? 0 : getPipelines().hashCode());
        hashCode = prime * hashCode + ((getServiceInstances() == null) ? 0 : getServiceInstances().hashCode());
        hashCode = prime * hashCode + ((getServiceTemplates() == null) ? 0 : getServiceTemplates().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        return hashCode;
    }

    @Override
    public CountsSummary clone() {
        try {
            return (CountsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.CountsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

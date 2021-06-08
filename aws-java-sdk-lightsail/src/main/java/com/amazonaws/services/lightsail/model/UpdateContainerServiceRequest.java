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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateContainerService" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContainerServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container service to update.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The power for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to view the specifications of each power option.
     * </p>
     */
    private String power;
    /**
     * <p>
     * The scale for the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     * <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price of
     * your container service, multiply the base price of the <code>power</code> with the <code>scale</code> (the number
     * of nodes) of the service.
     * </p>
     */
    private Integer scale;
    /**
     * <p>
     * A Boolean value to indicate whether the container service is disabled.
     * </p>
     */
    private Boolean isDisabled;
    /**
     * <p>
     * The public domain names to use with the container service, such as <code>example.com</code> and
     * <code>www.example.com</code>.
     * </p>
     * <p>
     * You can specify up to four public domain names for a container service. The domain names that you specify are
     * used when you create a deployment with a container configured as the public endpoint of your container service.
     * </p>
     * <p>
     * If you don't specify public domain names, then you can use the default domain of the container service.
     * </p>
     * <important>
     * <p>
     * You must create and validate an SSL/TLS certificate before you can use public domain names with your container
     * service. Use the <code>CreateCertificate</code> action to create a certificate for the public domain names you
     * want to use with your container service.
     * </p>
     * </important>
     * <p>
     * You can specify public domain names using a string to array map as shown in the example later on this page.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> publicDomainNames;

    /**
     * <p>
     * The name of the container service to update.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service to update.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the container service to update.
     * </p>
     * 
     * @return The name of the container service to update.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the container service to update.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerServiceRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The power for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to view the specifications of each power option.
     * </p>
     * 
     * @param power
     *        The power for the container service.</p>
     *        <p>
     *        The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container
     *        service. The <code>power</code> and <code>scale</code> of a container service makes up its configured
     *        capacity. To determine the monthly price of your container service, multiply the base price of the
     *        <code>power</code> with the <code>scale</code> (the number of nodes) of the service.
     *        </p>
     *        <p>
     *        Use the <code>GetContainerServicePowers</code> action to view the specifications of each power option.
     * @see ContainerServicePowerName
     */

    public void setPower(String power) {
        this.power = power;
    }

    /**
     * <p>
     * The power for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to view the specifications of each power option.
     * </p>
     * 
     * @return The power for the container service.</p>
     *         <p>
     *         The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container
     *         service. The <code>power</code> and <code>scale</code> of a container service makes up its configured
     *         capacity. To determine the monthly price of your container service, multiply the base price of the
     *         <code>power</code> with the <code>scale</code> (the number of nodes) of the service.
     *         </p>
     *         <p>
     *         Use the <code>GetContainerServicePowers</code> action to view the specifications of each power option.
     * @see ContainerServicePowerName
     */

    public String getPower() {
        return this.power;
    }

    /**
     * <p>
     * The power for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to view the specifications of each power option.
     * </p>
     * 
     * @param power
     *        The power for the container service.</p>
     *        <p>
     *        The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container
     *        service. The <code>power</code> and <code>scale</code> of a container service makes up its configured
     *        capacity. To determine the monthly price of your container service, multiply the base price of the
     *        <code>power</code> with the <code>scale</code> (the number of nodes) of the service.
     *        </p>
     *        <p>
     *        Use the <code>GetContainerServicePowers</code> action to view the specifications of each power option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServicePowerName
     */

    public UpdateContainerServiceRequest withPower(String power) {
        setPower(power);
        return this;
    }

    /**
     * <p>
     * The power for the container service.
     * </p>
     * <p>
     * The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The
     * <code>power</code> and <code>scale</code> of a container service makes up its configured capacity. To determine
     * the monthly price of your container service, multiply the base price of the <code>power</code> with the
     * <code>scale</code> (the number of nodes) of the service.
     * </p>
     * <p>
     * Use the <code>GetContainerServicePowers</code> action to view the specifications of each power option.
     * </p>
     * 
     * @param power
     *        The power for the container service.</p>
     *        <p>
     *        The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container
     *        service. The <code>power</code> and <code>scale</code> of a container service makes up its configured
     *        capacity. To determine the monthly price of your container service, multiply the base price of the
     *        <code>power</code> with the <code>scale</code> (the number of nodes) of the service.
     *        </p>
     *        <p>
     *        Use the <code>GetContainerServicePowers</code> action to view the specifications of each power option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServicePowerName
     */

    public UpdateContainerServiceRequest withPower(ContainerServicePowerName power) {
        this.power = power.toString();
        return this;
    }

    /**
     * <p>
     * The scale for the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     * <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price of
     * your container service, multiply the base price of the <code>power</code> with the <code>scale</code> (the number
     * of nodes) of the service.
     * </p>
     * 
     * @param scale
     *        The scale for the container service.</p>
     *        <p>
     *        The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     *        <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price
     *        of your container service, multiply the base price of the <code>power</code> with the <code>scale</code>
     *        (the number of nodes) of the service.
     */

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * The scale for the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     * <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price of
     * your container service, multiply the base price of the <code>power</code> with the <code>scale</code> (the number
     * of nodes) of the service.
     * </p>
     * 
     * @return The scale for the container service.</p>
     *         <p>
     *         The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     *         <code>scale</code> of a container service makes up its configured capacity. To determine the monthly
     *         price of your container service, multiply the base price of the <code>power</code> with the
     *         <code>scale</code> (the number of nodes) of the service.
     */

    public Integer getScale() {
        return this.scale;
    }

    /**
     * <p>
     * The scale for the container service.
     * </p>
     * <p>
     * The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     * <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price of
     * your container service, multiply the base price of the <code>power</code> with the <code>scale</code> (the number
     * of nodes) of the service.
     * </p>
     * 
     * @param scale
     *        The scale for the container service.</p>
     *        <p>
     *        The scale specifies the allocated compute nodes of the container service. The <code>power</code> and
     *        <code>scale</code> of a container service makes up its configured capacity. To determine the monthly price
     *        of your container service, multiply the base price of the <code>power</code> with the <code>scale</code>
     *        (the number of nodes) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerServiceRequest withScale(Integer scale) {
        setScale(scale);
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether the container service is disabled.
     * </p>
     * 
     * @param isDisabled
     *        A Boolean value to indicate whether the container service is disabled.
     */

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * <p>
     * A Boolean value to indicate whether the container service is disabled.
     * </p>
     * 
     * @return A Boolean value to indicate whether the container service is disabled.
     */

    public Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /**
     * <p>
     * A Boolean value to indicate whether the container service is disabled.
     * </p>
     * 
     * @param isDisabled
     *        A Boolean value to indicate whether the container service is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerServiceRequest withIsDisabled(Boolean isDisabled) {
        setIsDisabled(isDisabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether the container service is disabled.
     * </p>
     * 
     * @return A Boolean value to indicate whether the container service is disabled.
     */

    public Boolean isDisabled() {
        return this.isDisabled;
    }

    /**
     * <p>
     * The public domain names to use with the container service, such as <code>example.com</code> and
     * <code>www.example.com</code>.
     * </p>
     * <p>
     * You can specify up to four public domain names for a container service. The domain names that you specify are
     * used when you create a deployment with a container configured as the public endpoint of your container service.
     * </p>
     * <p>
     * If you don't specify public domain names, then you can use the default domain of the container service.
     * </p>
     * <important>
     * <p>
     * You must create and validate an SSL/TLS certificate before you can use public domain names with your container
     * service. Use the <code>CreateCertificate</code> action to create a certificate for the public domain names you
     * want to use with your container service.
     * </p>
     * </important>
     * <p>
     * You can specify public domain names using a string to array map as shown in the example later on this page.
     * </p>
     * 
     * @return The public domain names to use with the container service, such as <code>example.com</code> and
     *         <code>www.example.com</code>.</p>
     *         <p>
     *         You can specify up to four public domain names for a container service. The domain names that you specify
     *         are used when you create a deployment with a container configured as the public endpoint of your
     *         container service.
     *         </p>
     *         <p>
     *         If you don't specify public domain names, then you can use the default domain of the container service.
     *         </p>
     *         <important>
     *         <p>
     *         You must create and validate an SSL/TLS certificate before you can use public domain names with your
     *         container service. Use the <code>CreateCertificate</code> action to create a certificate for the public
     *         domain names you want to use with your container service.
     *         </p>
     *         </important>
     *         <p>
     *         You can specify public domain names using a string to array map as shown in the example later on this
     *         page.
     */

    public java.util.Map<String, java.util.List<String>> getPublicDomainNames() {
        return publicDomainNames;
    }

    /**
     * <p>
     * The public domain names to use with the container service, such as <code>example.com</code> and
     * <code>www.example.com</code>.
     * </p>
     * <p>
     * You can specify up to four public domain names for a container service. The domain names that you specify are
     * used when you create a deployment with a container configured as the public endpoint of your container service.
     * </p>
     * <p>
     * If you don't specify public domain names, then you can use the default domain of the container service.
     * </p>
     * <important>
     * <p>
     * You must create and validate an SSL/TLS certificate before you can use public domain names with your container
     * service. Use the <code>CreateCertificate</code> action to create a certificate for the public domain names you
     * want to use with your container service.
     * </p>
     * </important>
     * <p>
     * You can specify public domain names using a string to array map as shown in the example later on this page.
     * </p>
     * 
     * @param publicDomainNames
     *        The public domain names to use with the container service, such as <code>example.com</code> and
     *        <code>www.example.com</code>.</p>
     *        <p>
     *        You can specify up to four public domain names for a container service. The domain names that you specify
     *        are used when you create a deployment with a container configured as the public endpoint of your container
     *        service.
     *        </p>
     *        <p>
     *        If you don't specify public domain names, then you can use the default domain of the container service.
     *        </p>
     *        <important>
     *        <p>
     *        You must create and validate an SSL/TLS certificate before you can use public domain names with your
     *        container service. Use the <code>CreateCertificate</code> action to create a certificate for the public
     *        domain names you want to use with your container service.
     *        </p>
     *        </important>
     *        <p>
     *        You can specify public domain names using a string to array map as shown in the example later on this
     *        page.
     */

    public void setPublicDomainNames(java.util.Map<String, java.util.List<String>> publicDomainNames) {
        this.publicDomainNames = publicDomainNames;
    }

    /**
     * <p>
     * The public domain names to use with the container service, such as <code>example.com</code> and
     * <code>www.example.com</code>.
     * </p>
     * <p>
     * You can specify up to four public domain names for a container service. The domain names that you specify are
     * used when you create a deployment with a container configured as the public endpoint of your container service.
     * </p>
     * <p>
     * If you don't specify public domain names, then you can use the default domain of the container service.
     * </p>
     * <important>
     * <p>
     * You must create and validate an SSL/TLS certificate before you can use public domain names with your container
     * service. Use the <code>CreateCertificate</code> action to create a certificate for the public domain names you
     * want to use with your container service.
     * </p>
     * </important>
     * <p>
     * You can specify public domain names using a string to array map as shown in the example later on this page.
     * </p>
     * 
     * @param publicDomainNames
     *        The public domain names to use with the container service, such as <code>example.com</code> and
     *        <code>www.example.com</code>.</p>
     *        <p>
     *        You can specify up to four public domain names for a container service. The domain names that you specify
     *        are used when you create a deployment with a container configured as the public endpoint of your container
     *        service.
     *        </p>
     *        <p>
     *        If you don't specify public domain names, then you can use the default domain of the container service.
     *        </p>
     *        <important>
     *        <p>
     *        You must create and validate an SSL/TLS certificate before you can use public domain names with your
     *        container service. Use the <code>CreateCertificate</code> action to create a certificate for the public
     *        domain names you want to use with your container service.
     *        </p>
     *        </important>
     *        <p>
     *        You can specify public domain names using a string to array map as shown in the example later on this
     *        page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerServiceRequest withPublicDomainNames(java.util.Map<String, java.util.List<String>> publicDomainNames) {
        setPublicDomainNames(publicDomainNames);
        return this;
    }

    /**
     * Add a single PublicDomainNames entry
     *
     * @see UpdateContainerServiceRequest#withPublicDomainNames
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerServiceRequest addPublicDomainNamesEntry(String key, java.util.List<String> value) {
        if (null == this.publicDomainNames) {
            this.publicDomainNames = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.publicDomainNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.publicDomainNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PublicDomainNames.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerServiceRequest clearPublicDomainNamesEntries() {
        this.publicDomainNames = null;
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getPower() != null)
            sb.append("Power: ").append(getPower()).append(",");
        if (getScale() != null)
            sb.append("Scale: ").append(getScale()).append(",");
        if (getIsDisabled() != null)
            sb.append("IsDisabled: ").append(getIsDisabled()).append(",");
        if (getPublicDomainNames() != null)
            sb.append("PublicDomainNames: ").append(getPublicDomainNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContainerServiceRequest == false)
            return false;
        UpdateContainerServiceRequest other = (UpdateContainerServiceRequest) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getPower() == null ^ this.getPower() == null)
            return false;
        if (other.getPower() != null && other.getPower().equals(this.getPower()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getIsDisabled() == null ^ this.getIsDisabled() == null)
            return false;
        if (other.getIsDisabled() != null && other.getIsDisabled().equals(this.getIsDisabled()) == false)
            return false;
        if (other.getPublicDomainNames() == null ^ this.getPublicDomainNames() == null)
            return false;
        if (other.getPublicDomainNames() != null && other.getPublicDomainNames().equals(this.getPublicDomainNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getPower() == null) ? 0 : getPower().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getIsDisabled() == null) ? 0 : getIsDisabled().hashCode());
        hashCode = prime * hashCode + ((getPublicDomainNames() == null) ? 0 : getPublicDomainNames().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContainerServiceRequest clone() {
        return (UpdateContainerServiceRequest) super.clone();
    }

}

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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DisassociateCustomDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateCustomDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The App Runner subdomain of the App Runner service. The disassociated custom domain name was mapped to this
     * target name.
     * </p>
     */
    private String dNSTarget;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that a custom domain name is disassociated from.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * A description of the domain name that's being disassociated.
     * </p>
     */
    private CustomDomain customDomain;

    /**
     * <p>
     * The App Runner subdomain of the App Runner service. The disassociated custom domain name was mapped to this
     * target name.
     * </p>
     * 
     * @param dNSTarget
     *        The App Runner subdomain of the App Runner service. The disassociated custom domain name was mapped to
     *        this target name.
     */

    public void setDNSTarget(String dNSTarget) {
        this.dNSTarget = dNSTarget;
    }

    /**
     * <p>
     * The App Runner subdomain of the App Runner service. The disassociated custom domain name was mapped to this
     * target name.
     * </p>
     * 
     * @return The App Runner subdomain of the App Runner service. The disassociated custom domain name was mapped to
     *         this target name.
     */

    public String getDNSTarget() {
        return this.dNSTarget;
    }

    /**
     * <p>
     * The App Runner subdomain of the App Runner service. The disassociated custom domain name was mapped to this
     * target name.
     * </p>
     * 
     * @param dNSTarget
     *        The App Runner subdomain of the App Runner service. The disassociated custom domain name was mapped to
     *        this target name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateCustomDomainResult withDNSTarget(String dNSTarget) {
        setDNSTarget(dNSTarget);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that a custom domain name is disassociated from.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that a custom domain name is disassociated from.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that a custom domain name is disassociated from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner service that a custom domain name is disassociated from.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that a custom domain name is disassociated from.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that a custom domain name is disassociated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateCustomDomainResult withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * A description of the domain name that's being disassociated.
     * </p>
     * 
     * @param customDomain
     *        A description of the domain name that's being disassociated.
     */

    public void setCustomDomain(CustomDomain customDomain) {
        this.customDomain = customDomain;
    }

    /**
     * <p>
     * A description of the domain name that's being disassociated.
     * </p>
     * 
     * @return A description of the domain name that's being disassociated.
     */

    public CustomDomain getCustomDomain() {
        return this.customDomain;
    }

    /**
     * <p>
     * A description of the domain name that's being disassociated.
     * </p>
     * 
     * @param customDomain
     *        A description of the domain name that's being disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateCustomDomainResult withCustomDomain(CustomDomain customDomain) {
        setCustomDomain(customDomain);
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
        if (getDNSTarget() != null)
            sb.append("DNSTarget: ").append(getDNSTarget()).append(",");
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getCustomDomain() != null)
            sb.append("CustomDomain: ").append(getCustomDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateCustomDomainResult == false)
            return false;
        DisassociateCustomDomainResult other = (DisassociateCustomDomainResult) obj;
        if (other.getDNSTarget() == null ^ this.getDNSTarget() == null)
            return false;
        if (other.getDNSTarget() != null && other.getDNSTarget().equals(this.getDNSTarget()) == false)
            return false;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getCustomDomain() == null ^ this.getCustomDomain() == null)
            return false;
        if (other.getCustomDomain() != null && other.getCustomDomain().equals(this.getCustomDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDNSTarget() == null) ? 0 : getDNSTarget().hashCode());
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getCustomDomain() == null) ? 0 : getCustomDomain().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateCustomDomainResult clone() {
        try {
            return (DisassociateCustomDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

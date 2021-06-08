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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/AssociateCustomDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateCustomDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to associate a custom domain name with.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * A custom domain endpoint to associate. Specify a root domain (for example, <code>example.com</code>), a subdomain
     * (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a wildcard (for
     * example, <code>*.example.com</code>).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Set to <code>true</code> to associate the subdomain <code>www.<i>DomainName</i> </code> with the App Runner
     * service in addition to the base domain.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean enableWWWSubdomain;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to associate a custom domain name with.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that you want to associate a custom domain name
     *        with.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to associate a custom domain name with.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner service that you want to associate a custom domain name
     *         with.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to associate a custom domain name with.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that you want to associate a custom domain name
     *        with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateCustomDomainRequest withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * A custom domain endpoint to associate. Specify a root domain (for example, <code>example.com</code>), a subdomain
     * (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a wildcard (for
     * example, <code>*.example.com</code>).
     * </p>
     * 
     * @param domainName
     *        A custom domain endpoint to associate. Specify a root domain (for example, <code>example.com</code>), a
     *        subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a
     *        wildcard (for example, <code>*.example.com</code>).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A custom domain endpoint to associate. Specify a root domain (for example, <code>example.com</code>), a subdomain
     * (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a wildcard (for
     * example, <code>*.example.com</code>).
     * </p>
     * 
     * @return A custom domain endpoint to associate. Specify a root domain (for example, <code>example.com</code>), a
     *         subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a
     *         wildcard (for example, <code>*.example.com</code>).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * A custom domain endpoint to associate. Specify a root domain (for example, <code>example.com</code>), a subdomain
     * (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a wildcard (for
     * example, <code>*.example.com</code>).
     * </p>
     * 
     * @param domainName
     *        A custom domain endpoint to associate. Specify a root domain (for example, <code>example.com</code>), a
     *        subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a
     *        wildcard (for example, <code>*.example.com</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateCustomDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to associate the subdomain <code>www.<i>DomainName</i> </code> with the App Runner
     * service in addition to the base domain.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param enableWWWSubdomain
     *        Set to <code>true</code> to associate the subdomain <code>www.<i>DomainName</i> </code> with the App
     *        Runner service in addition to the base domain.</p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setEnableWWWSubdomain(Boolean enableWWWSubdomain) {
        this.enableWWWSubdomain = enableWWWSubdomain;
    }

    /**
     * <p>
     * Set to <code>true</code> to associate the subdomain <code>www.<i>DomainName</i> </code> with the App Runner
     * service in addition to the base domain.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Set to <code>true</code> to associate the subdomain <code>www.<i>DomainName</i> </code> with the App
     *         Runner service in addition to the base domain.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getEnableWWWSubdomain() {
        return this.enableWWWSubdomain;
    }

    /**
     * <p>
     * Set to <code>true</code> to associate the subdomain <code>www.<i>DomainName</i> </code> with the App Runner
     * service in addition to the base domain.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param enableWWWSubdomain
     *        Set to <code>true</code> to associate the subdomain <code>www.<i>DomainName</i> </code> with the App
     *        Runner service in addition to the base domain.</p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateCustomDomainRequest withEnableWWWSubdomain(Boolean enableWWWSubdomain) {
        setEnableWWWSubdomain(enableWWWSubdomain);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to associate the subdomain <code>www.<i>DomainName</i> </code> with the App Runner
     * service in addition to the base domain.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Set to <code>true</code> to associate the subdomain <code>www.<i>DomainName</i> </code> with the App
     *         Runner service in addition to the base domain.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isEnableWWWSubdomain() {
        return this.enableWWWSubdomain;
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
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getEnableWWWSubdomain() != null)
            sb.append("EnableWWWSubdomain: ").append(getEnableWWWSubdomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateCustomDomainRequest == false)
            return false;
        AssociateCustomDomainRequest other = (AssociateCustomDomainRequest) obj;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEnableWWWSubdomain() == null ^ this.getEnableWWWSubdomain() == null)
            return false;
        if (other.getEnableWWWSubdomain() != null && other.getEnableWWWSubdomain().equals(this.getEnableWWWSubdomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEnableWWWSubdomain() == null) ? 0 : getEnableWWWSubdomain().hashCode());
        return hashCode;
    }

    @Override
    public AssociateCustomDomainRequest clone() {
        return (AssociateCustomDomainRequest) super.clone();
    }

}

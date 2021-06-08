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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DisassociateCustomDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateCustomDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to disassociate a custom domain name from.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * The domain name that you want to disassociate from the App Runner service.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to disassociate a custom domain name from.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that you want to disassociate a custom domain
     *        name from.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to disassociate a custom domain name from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner service that you want to disassociate a custom domain
     *         name from.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to disassociate a custom domain name from.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that you want to disassociate a custom domain
     *        name from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateCustomDomainRequest withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * The domain name that you want to disassociate from the App Runner service.
     * </p>
     * 
     * @param domainName
     *        The domain name that you want to disassociate from the App Runner service.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name that you want to disassociate from the App Runner service.
     * </p>
     * 
     * @return The domain name that you want to disassociate from the App Runner service.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name that you want to disassociate from the App Runner service.
     * </p>
     * 
     * @param domainName
     *        The domain name that you want to disassociate from the App Runner service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateCustomDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
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
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateCustomDomainRequest == false)
            return false;
        DisassociateCustomDomainRequest other = (DisassociateCustomDomainRequest) obj;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateCustomDomainRequest clone() {
        return (DisassociateCustomDomainRequest) super.clone();
    }

}

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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterMailDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterMailDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Idempotency token used when retrying requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The WorkMail organization under which you're creating the domain.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The name of the mail domain to create in WorkMail and SES.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * Idempotency token used when retrying requests.
     * </p>
     * 
     * @param clientToken
     *        Idempotency token used when retrying requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Idempotency token used when retrying requests.
     * </p>
     * 
     * @return Idempotency token used when retrying requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Idempotency token used when retrying requests.
     * </p>
     * 
     * @param clientToken
     *        Idempotency token used when retrying requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterMailDomainRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The WorkMail organization under which you're creating the domain.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization under which you're creating the domain.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization under which you're creating the domain.
     * </p>
     * 
     * @return The WorkMail organization under which you're creating the domain.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization under which you're creating the domain.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization under which you're creating the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterMailDomainRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The name of the mail domain to create in WorkMail and SES.
     * </p>
     * 
     * @param domainName
     *        The name of the mail domain to create in WorkMail and SES.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the mail domain to create in WorkMail and SES.
     * </p>
     * 
     * @return The name of the mail domain to create in WorkMail and SES.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the mail domain to create in WorkMail and SES.
     * </p>
     * 
     * @param domainName
     *        The name of the mail domain to create in WorkMail and SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterMailDomainRequest withDomainName(String domainName) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
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

        if (obj instanceof RegisterMailDomainRequest == false)
            return false;
        RegisterMailDomainRequest other = (RegisterMailDomainRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public RegisterMailDomainRequest clone() {
        return (RegisterMailDomainRequest) super.clone();
    }

}

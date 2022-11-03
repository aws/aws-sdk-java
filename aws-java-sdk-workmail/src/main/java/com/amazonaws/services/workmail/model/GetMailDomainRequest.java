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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMailDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkMail organization for which the domain is retrieved.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The domain from which you want to retrieve details.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The WorkMail organization for which the domain is retrieved.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization for which the domain is retrieved.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization for which the domain is retrieved.
     * </p>
     * 
     * @return The WorkMail organization for which the domain is retrieved.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization for which the domain is retrieved.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization for which the domain is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMailDomainRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The domain from which you want to retrieve details.
     * </p>
     * 
     * @param domainName
     *        The domain from which you want to retrieve details.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain from which you want to retrieve details.
     * </p>
     * 
     * @return The domain from which you want to retrieve details.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain from which you want to retrieve details.
     * </p>
     * 
     * @param domainName
     *        The domain from which you want to retrieve details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMailDomainRequest withDomainName(String domainName) {
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

        if (obj instanceof GetMailDomainRequest == false)
            return false;
        GetMailDomainRequest other = (GetMailDomainRequest) obj;
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

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public GetMailDomainRequest clone() {
        return (GetMailDomainRequest) super.clone();
    }

}

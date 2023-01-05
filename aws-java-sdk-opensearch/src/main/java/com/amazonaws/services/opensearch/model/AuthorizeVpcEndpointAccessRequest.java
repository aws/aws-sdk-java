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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeVpcEndpointAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the OpenSearch Service domain to provide access to.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The Amazon Web Services account ID to grant access to.
     * </p>
     */
    private String account;

    /**
     * <p>
     * The name of the OpenSearch Service domain to provide access to.
     * </p>
     * 
     * @param domainName
     *        The name of the OpenSearch Service domain to provide access to.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the OpenSearch Service domain to provide access to.
     * </p>
     * 
     * @return The name of the OpenSearch Service domain to provide access to.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the OpenSearch Service domain to provide access to.
     * </p>
     * 
     * @param domainName
     *        The name of the OpenSearch Service domain to provide access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeVpcEndpointAccessRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID to grant access to.
     * </p>
     * 
     * @param account
     *        The Amazon Web Services account ID to grant access to.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The Amazon Web Services account ID to grant access to.
     * </p>
     * 
     * @return The Amazon Web Services account ID to grant access to.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The Amazon Web Services account ID to grant access to.
     * </p>
     * 
     * @param account
     *        The Amazon Web Services account ID to grant access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeVpcEndpointAccessRequest withAccount(String account) {
        setAccount(account);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeVpcEndpointAccessRequest == false)
            return false;
        AuthorizeVpcEndpointAccessRequest other = (AuthorizeVpcEndpointAccessRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeVpcEndpointAccessRequest clone() {
        return (AuthorizeVpcEndpointAccessRequest) super.clone();
    }

}

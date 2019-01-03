/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains input to the ResolveCustomer operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/ResolveCustomer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolveCustomerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When a buyer visits your website during the registration process, the buyer submits a registration token through
     * the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
     * </p>
     */
    private String registrationToken;

    /**
     * <p>
     * When a buyer visits your website during the registration process, the buyer submits a registration token through
     * the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
     * </p>
     * 
     * @param registrationToken
     *        When a buyer visits your website during the registration process, the buyer submits a registration token
     *        through the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
     */

    public void setRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
    }

    /**
     * <p>
     * When a buyer visits your website during the registration process, the buyer submits a registration token through
     * the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
     * </p>
     * 
     * @return When a buyer visits your website during the registration process, the buyer submits a registration token
     *         through the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
     */

    public String getRegistrationToken() {
        return this.registrationToken;
    }

    /**
     * <p>
     * When a buyer visits your website during the registration process, the buyer submits a registration token through
     * the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
     * </p>
     * 
     * @param registrationToken
     *        When a buyer visits your website during the registration process, the buyer submits a registration token
     *        through the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveCustomerRequest withRegistrationToken(String registrationToken) {
        setRegistrationToken(registrationToken);
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
        if (getRegistrationToken() != null)
            sb.append("RegistrationToken: ").append(getRegistrationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveCustomerRequest == false)
            return false;
        ResolveCustomerRequest other = (ResolveCustomerRequest) obj;
        if (other.getRegistrationToken() == null ^ this.getRegistrationToken() == null)
            return false;
        if (other.getRegistrationToken() != null && other.getRegistrationToken().equals(this.getRegistrationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationToken() == null) ? 0 : getRegistrationToken().hashCode());
        return hashCode;
    }

    @Override
    public ResolveCustomerRequest clone() {
        return (ResolveCustomerRequest) super.clone();
    }

}

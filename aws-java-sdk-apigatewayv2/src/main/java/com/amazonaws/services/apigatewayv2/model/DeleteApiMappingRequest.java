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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApiMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     */
    private String apiMappingId;
    /**
     * <p>
     * The domain name.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     * 
     * @param apiMappingId
     *        The API mapping identifier.
     */

    public void setApiMappingId(String apiMappingId) {
        this.apiMappingId = apiMappingId;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     * 
     * @return The API mapping identifier.
     */

    public String getApiMappingId() {
        return this.apiMappingId;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     * 
     * @param apiMappingId
     *        The API mapping identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApiMappingRequest withApiMappingId(String apiMappingId) {
        setApiMappingId(apiMappingId);
        return this;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @return The domain name.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApiMappingRequest withDomainName(String domainName) {
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
        if (getApiMappingId() != null)
            sb.append("ApiMappingId: ").append(getApiMappingId()).append(",");
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

        if (obj instanceof DeleteApiMappingRequest == false)
            return false;
        DeleteApiMappingRequest other = (DeleteApiMappingRequest) obj;
        if (other.getApiMappingId() == null ^ this.getApiMappingId() == null)
            return false;
        if (other.getApiMappingId() != null && other.getApiMappingId().equals(this.getApiMappingId()) == false)
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

        hashCode = prime * hashCode + ((getApiMappingId() == null) ? 0 : getApiMappingId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApiMappingRequest clone() {
        return (DeleteApiMappingRequest) super.clone();
    }

}

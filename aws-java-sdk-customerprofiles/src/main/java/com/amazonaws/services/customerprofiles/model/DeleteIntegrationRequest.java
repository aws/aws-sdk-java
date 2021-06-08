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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteIntegration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     */
    private String uri;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIntegrationRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @return The URI of the S3 bucket or any other type of data source.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIntegrationRequest withUri(String uri) {
        setUri(uri);
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIntegrationRequest == false)
            return false;
        DeleteIntegrationRequest other = (DeleteIntegrationRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIntegrationRequest clone() {
        return (DeleteIntegrationRequest) super.clone();
    }

}

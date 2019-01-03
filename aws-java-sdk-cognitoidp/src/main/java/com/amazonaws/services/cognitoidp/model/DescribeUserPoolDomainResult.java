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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPoolDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserPoolDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A domain description object containing information about the domain.
     * </p>
     */
    private DomainDescriptionType domainDescription;

    /**
     * <p>
     * A domain description object containing information about the domain.
     * </p>
     * 
     * @param domainDescription
     *        A domain description object containing information about the domain.
     */

    public void setDomainDescription(DomainDescriptionType domainDescription) {
        this.domainDescription = domainDescription;
    }

    /**
     * <p>
     * A domain description object containing information about the domain.
     * </p>
     * 
     * @return A domain description object containing information about the domain.
     */

    public DomainDescriptionType getDomainDescription() {
        return this.domainDescription;
    }

    /**
     * <p>
     * A domain description object containing information about the domain.
     * </p>
     * 
     * @param domainDescription
     *        A domain description object containing information about the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserPoolDomainResult withDomainDescription(DomainDescriptionType domainDescription) {
        setDomainDescription(domainDescription);
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
        if (getDomainDescription() != null)
            sb.append("DomainDescription: ").append(getDomainDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserPoolDomainResult == false)
            return false;
        DescribeUserPoolDomainResult other = (DescribeUserPoolDomainResult) obj;
        if (other.getDomainDescription() == null ^ this.getDomainDescription() == null)
            return false;
        if (other.getDomainDescription() != null && other.getDomainDescription().equals(this.getDomainDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainDescription() == null) ? 0 : getDomainDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserPoolDomainResult clone() {
        try {
            return (DescribeUserPoolDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

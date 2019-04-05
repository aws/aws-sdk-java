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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>CreateDomain</a></code> operation. Specifies a name for the new search
 * domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the domain you are creating. Allowed characters are a-z (lower-case letters), 0-9, and hyphen (-).
     * Domain names must start with a letter or number and be at least 3 and no more than 28 characters long.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * A name for the domain you are creating. Allowed characters are a-z (lower-case letters), 0-9, and hyphen (-).
     * Domain names must start with a letter or number and be at least 3 and no more than 28 characters long.
     * </p>
     * 
     * @param domainName
     *        A name for the domain you are creating. Allowed characters are a-z (lower-case letters), 0-9, and hyphen
     *        (-). Domain names must start with a letter or number and be at least 3 and no more than 28 characters
     *        long.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A name for the domain you are creating. Allowed characters are a-z (lower-case letters), 0-9, and hyphen (-).
     * Domain names must start with a letter or number and be at least 3 and no more than 28 characters long.
     * </p>
     * 
     * @return A name for the domain you are creating. Allowed characters are a-z (lower-case letters), 0-9, and hyphen
     *         (-). Domain names must start with a letter or number and be at least 3 and no more than 28 characters
     *         long.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * A name for the domain you are creating. Allowed characters are a-z (lower-case letters), 0-9, and hyphen (-).
     * Domain names must start with a letter or number and be at least 3 and no more than 28 characters long.
     * </p>
     * 
     * @param domainName
     *        A name for the domain you are creating. Allowed characters are a-z (lower-case letters), 0-9, and hyphen
     *        (-). Domain names must start with a letter or number and be at least 3 and no more than 28 characters
     *        long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDomainName(String domainName) {
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

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainRequest clone() {
        return (CreateDomainRequest) super.clone();
    }

}

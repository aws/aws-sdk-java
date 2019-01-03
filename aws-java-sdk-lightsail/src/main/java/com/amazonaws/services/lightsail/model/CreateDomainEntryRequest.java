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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomainEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainEntryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for which you want to create the domain entry.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry request.
     * </p>
     */
    private DomainEntry domainEntry;

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for which you want to create the domain entry.
     * </p>
     * 
     * @param domainName
     *        The domain name (e.g., <code>example.com</code>) for which you want to create the domain entry.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for which you want to create the domain entry.
     * </p>
     * 
     * @return The domain name (e.g., <code>example.com</code>) for which you want to create the domain entry.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for which you want to create the domain entry.
     * </p>
     * 
     * @param domainName
     *        The domain name (e.g., <code>example.com</code>) for which you want to create the domain entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainEntryRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry request.
     * </p>
     * 
     * @param domainEntry
     *        An array of key-value pairs containing information about the domain entry request.
     */

    public void setDomainEntry(DomainEntry domainEntry) {
        this.domainEntry = domainEntry;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry request.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the domain entry request.
     */

    public DomainEntry getDomainEntry() {
        return this.domainEntry;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry request.
     * </p>
     * 
     * @param domainEntry
     *        An array of key-value pairs containing information about the domain entry request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainEntryRequest withDomainEntry(DomainEntry domainEntry) {
        setDomainEntry(domainEntry);
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
        if (getDomainEntry() != null)
            sb.append("DomainEntry: ").append(getDomainEntry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainEntryRequest == false)
            return false;
        CreateDomainEntryRequest other = (CreateDomainEntryRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainEntry() == null ^ this.getDomainEntry() == null)
            return false;
        if (other.getDomainEntry() != null && other.getDomainEntry().equals(this.getDomainEntry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDomainEntry() == null) ? 0 : getDomainEntry().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainEntryRequest clone() {
        return (CreateDomainEntryRequest) super.clone();
    }

}

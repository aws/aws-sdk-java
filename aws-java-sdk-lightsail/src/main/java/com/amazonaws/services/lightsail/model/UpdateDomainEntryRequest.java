/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateDomainEntryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain recordset to update.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry.
     * </p>
     */
    private DomainEntry domainEntry;

    /**
     * <p>
     * The name of the domain recordset to update.
     * </p>
     * 
     * @param domainName
     *        The name of the domain recordset to update.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain recordset to update.
     * </p>
     * 
     * @return The name of the domain recordset to update.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain recordset to update.
     * </p>
     * 
     * @param domainName
     *        The name of the domain recordset to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainEntryRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry.
     * </p>
     * 
     * @param domainEntry
     *        An array of key-value pairs containing information about the domain entry.
     */

    public void setDomainEntry(DomainEntry domainEntry) {
        this.domainEntry = domainEntry;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the domain entry.
     */

    public DomainEntry getDomainEntry() {
        return this.domainEntry;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry.
     * </p>
     * 
     * @param domainEntry
     *        An array of key-value pairs containing information about the domain entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainEntryRequest withDomainEntry(DomainEntry domainEntry) {
        setDomainEntry(domainEntry);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getDomainEntry() != null)
            sb.append("DomainEntry: " + getDomainEntry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainEntryRequest == false)
            return false;
        UpdateDomainEntryRequest other = (UpdateDomainEntryRequest) obj;
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
    public UpdateDomainEntryRequest clone() {
        return (UpdateDomainEntryRequest) super.clone();
    }
}

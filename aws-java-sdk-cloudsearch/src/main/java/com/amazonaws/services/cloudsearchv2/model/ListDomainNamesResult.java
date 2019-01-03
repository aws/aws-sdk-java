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

/**
 * <p>
 * The result of a <code>ListDomainNames</code> request. Contains a list of the domains owned by an account.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainNamesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the search domains owned by an account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> domainNames;

    /**
     * <p>
     * The names of the search domains owned by an account.
     * </p>
     * 
     * @return The names of the search domains owned by an account.
     */

    public java.util.Map<String, String> getDomainNames() {
        if (domainNames == null) {
            domainNames = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return domainNames;
    }

    /**
     * <p>
     * The names of the search domains owned by an account.
     * </p>
     * 
     * @param domainNames
     *        The names of the search domains owned by an account.
     */

    public void setDomainNames(java.util.Map<String, String> domainNames) {
        this.domainNames = domainNames == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(domainNames);
    }

    /**
     * <p>
     * The names of the search domains owned by an account.
     * </p>
     * 
     * @param domainNames
     *        The names of the search domains owned by an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainNamesResult withDomainNames(java.util.Map<String, String> domainNames) {
        setDomainNames(domainNames);
        return this;
    }

    public ListDomainNamesResult addDomainNamesEntry(String key, String value) {
        if (null == this.domainNames) {
            this.domainNames = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.domainNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.domainNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DomainNames.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainNamesResult clearDomainNamesEntries() {
        this.domainNames = null;
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
        if (getDomainNames() != null)
            sb.append("DomainNames: ").append(getDomainNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainNamesResult == false)
            return false;
        ListDomainNamesResult other = (ListDomainNamesResult) obj;
        if (other.getDomainNames() == null ^ this.getDomainNames() == null)
            return false;
        if (other.getDomainNames() != null && other.getDomainNames().equals(this.getDomainNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainNames() == null) ? 0 : getDomainNames().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainNamesResult clone() {
        try {
            return (ListDomainNamesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

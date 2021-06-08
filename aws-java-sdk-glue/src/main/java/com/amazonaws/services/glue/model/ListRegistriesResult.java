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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListRegistries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRegistriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>RegistryDetailedListItem</code> objects containing minimal details of each registry.
     * </p>
     */
    private java.util.List<RegistryListItem> registries;
    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>RegistryDetailedListItem</code> objects containing minimal details of each registry.
     * </p>
     * 
     * @return An array of <code>RegistryDetailedListItem</code> objects containing minimal details of each registry.
     */

    public java.util.List<RegistryListItem> getRegistries() {
        return registries;
    }

    /**
     * <p>
     * An array of <code>RegistryDetailedListItem</code> objects containing minimal details of each registry.
     * </p>
     * 
     * @param registries
     *        An array of <code>RegistryDetailedListItem</code> objects containing minimal details of each registry.
     */

    public void setRegistries(java.util.Collection<RegistryListItem> registries) {
        if (registries == null) {
            this.registries = null;
            return;
        }

        this.registries = new java.util.ArrayList<RegistryListItem>(registries);
    }

    /**
     * <p>
     * An array of <code>RegistryDetailedListItem</code> objects containing minimal details of each registry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegistries(java.util.Collection)} or {@link #withRegistries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param registries
     *        An array of <code>RegistryDetailedListItem</code> objects containing minimal details of each registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegistriesResult withRegistries(RegistryListItem... registries) {
        if (this.registries == null) {
            setRegistries(new java.util.ArrayList<RegistryListItem>(registries.length));
        }
        for (RegistryListItem ele : registries) {
            this.registries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RegistryDetailedListItem</code> objects containing minimal details of each registry.
     * </p>
     * 
     * @param registries
     *        An array of <code>RegistryDetailedListItem</code> objects containing minimal details of each registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegistriesResult withRegistries(java.util.Collection<RegistryListItem> registries) {
        setRegistries(registries);
        return this;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @return A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *         list is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegistriesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRegistries() != null)
            sb.append("Registries: ").append(getRegistries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRegistriesResult == false)
            return false;
        ListRegistriesResult other = (ListRegistriesResult) obj;
        if (other.getRegistries() == null ^ this.getRegistries() == null)
            return false;
        if (other.getRegistries() != null && other.getRegistries().equals(this.getRegistries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistries() == null) ? 0 : getRegistries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRegistriesResult clone() {
        try {
            return (ListRegistriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

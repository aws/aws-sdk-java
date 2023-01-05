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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListDomainNames" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainNamesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists configurations for multiple domain names.
     * </p>
     */
    private java.util.List<DomainNameConfig> domainNameConfigs;
    /**
     * <p>
     * The API token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists configurations for multiple domain names.
     * </p>
     * 
     * @return Lists configurations for multiple domain names.
     */

    public java.util.List<DomainNameConfig> getDomainNameConfigs() {
        return domainNameConfigs;
    }

    /**
     * <p>
     * Lists configurations for multiple domain names.
     * </p>
     * 
     * @param domainNameConfigs
     *        Lists configurations for multiple domain names.
     */

    public void setDomainNameConfigs(java.util.Collection<DomainNameConfig> domainNameConfigs) {
        if (domainNameConfigs == null) {
            this.domainNameConfigs = null;
            return;
        }

        this.domainNameConfigs = new java.util.ArrayList<DomainNameConfig>(domainNameConfigs);
    }

    /**
     * <p>
     * Lists configurations for multiple domain names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainNameConfigs(java.util.Collection)} or {@link #withDomainNameConfigs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param domainNameConfigs
     *        Lists configurations for multiple domain names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainNamesResult withDomainNameConfigs(DomainNameConfig... domainNameConfigs) {
        if (this.domainNameConfigs == null) {
            setDomainNameConfigs(new java.util.ArrayList<DomainNameConfig>(domainNameConfigs.length));
        }
        for (DomainNameConfig ele : domainNameConfigs) {
            this.domainNameConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists configurations for multiple domain names.
     * </p>
     * 
     * @param domainNameConfigs
     *        Lists configurations for multiple domain names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainNamesResult withDomainNameConfigs(java.util.Collection<DomainNameConfig> domainNameConfigs) {
        setDomainNameConfigs(domainNameConfigs);
        return this;
    }

    /**
     * <p>
     * The API token.
     * </p>
     * 
     * @param nextToken
     *        The API token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The API token.
     * </p>
     * 
     * @return The API token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The API token.
     * </p>
     * 
     * @param nextToken
     *        The API token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainNamesResult withNextToken(String nextToken) {
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
        if (getDomainNameConfigs() != null)
            sb.append("DomainNameConfigs: ").append(getDomainNameConfigs()).append(",");
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

        if (obj instanceof ListDomainNamesResult == false)
            return false;
        ListDomainNamesResult other = (ListDomainNamesResult) obj;
        if (other.getDomainNameConfigs() == null ^ this.getDomainNameConfigs() == null)
            return false;
        if (other.getDomainNameConfigs() != null && other.getDomainNameConfigs().equals(this.getDomainNameConfigs()) == false)
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

        hashCode = prime * hashCode + ((getDomainNameConfigs() == null) ? 0 : getDomainNameConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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

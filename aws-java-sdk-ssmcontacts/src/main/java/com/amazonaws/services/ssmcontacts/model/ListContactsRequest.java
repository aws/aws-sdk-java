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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of contacts and escalation plans per page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Used to list only contacts who's aliases start with the specified prefix.
     * </p>
     */
    private String aliasPrefix;
    /**
     * <p>
     * The type of contact. A contact is type <code>PERSONAL</code> and an escalation plan is type
     * <code>ESCALATION</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of contacts and escalation plans per page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of contacts and escalation plans per page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of contacts and escalation plans per page of results.
     * </p>
     * 
     * @return The maximum number of contacts and escalation plans per page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of contacts and escalation plans per page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of contacts and escalation plans per page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Used to list only contacts who's aliases start with the specified prefix.
     * </p>
     * 
     * @param aliasPrefix
     *        Used to list only contacts who's aliases start with the specified prefix.
     */

    public void setAliasPrefix(String aliasPrefix) {
        this.aliasPrefix = aliasPrefix;
    }

    /**
     * <p>
     * Used to list only contacts who's aliases start with the specified prefix.
     * </p>
     * 
     * @return Used to list only contacts who's aliases start with the specified prefix.
     */

    public String getAliasPrefix() {
        return this.aliasPrefix;
    }

    /**
     * <p>
     * Used to list only contacts who's aliases start with the specified prefix.
     * </p>
     * 
     * @param aliasPrefix
     *        Used to list only contacts who's aliases start with the specified prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsRequest withAliasPrefix(String aliasPrefix) {
        setAliasPrefix(aliasPrefix);
        return this;
    }

    /**
     * <p>
     * The type of contact. A contact is type <code>PERSONAL</code> and an escalation plan is type
     * <code>ESCALATION</code>.
     * </p>
     * 
     * @param type
     *        The type of contact. A contact is type <code>PERSONAL</code> and an escalation plan is type
     *        <code>ESCALATION</code>.
     * @see ContactType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of contact. A contact is type <code>PERSONAL</code> and an escalation plan is type
     * <code>ESCALATION</code>.
     * </p>
     * 
     * @return The type of contact. A contact is type <code>PERSONAL</code> and an escalation plan is type
     *         <code>ESCALATION</code>.
     * @see ContactType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of contact. A contact is type <code>PERSONAL</code> and an escalation plan is type
     * <code>ESCALATION</code>.
     * </p>
     * 
     * @param type
     *        The type of contact. A contact is type <code>PERSONAL</code> and an escalation plan is type
     *        <code>ESCALATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public ListContactsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of contact. A contact is type <code>PERSONAL</code> and an escalation plan is type
     * <code>ESCALATION</code>.
     * </p>
     * 
     * @param type
     *        The type of contact. A contact is type <code>PERSONAL</code> and an escalation plan is type
     *        <code>ESCALATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public ListContactsRequest withType(ContactType type) {
        this.type = type.toString();
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getAliasPrefix() != null)
            sb.append("AliasPrefix: ").append(getAliasPrefix()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContactsRequest == false)
            return false;
        ListContactsRequest other = (ListContactsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAliasPrefix() == null ^ this.getAliasPrefix() == null)
            return false;
        if (other.getAliasPrefix() != null && other.getAliasPrefix().equals(this.getAliasPrefix()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getAliasPrefix() == null) ? 0 : getAliasPrefix().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListContactsRequest clone() {
        return (ListContactsRequest) super.clone();
    }

}

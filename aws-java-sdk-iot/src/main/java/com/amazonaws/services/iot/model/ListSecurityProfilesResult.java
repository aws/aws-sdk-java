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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of security profile identifiers (names and ARNs).
     * </p>
     */
    private java.util.List<SecurityProfileIdentifier> securityProfileIdentifiers;
    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of security profile identifiers (names and ARNs).
     * </p>
     * 
     * @return A list of security profile identifiers (names and ARNs).
     */

    public java.util.List<SecurityProfileIdentifier> getSecurityProfileIdentifiers() {
        return securityProfileIdentifiers;
    }

    /**
     * <p>
     * A list of security profile identifiers (names and ARNs).
     * </p>
     * 
     * @param securityProfileIdentifiers
     *        A list of security profile identifiers (names and ARNs).
     */

    public void setSecurityProfileIdentifiers(java.util.Collection<SecurityProfileIdentifier> securityProfileIdentifiers) {
        if (securityProfileIdentifiers == null) {
            this.securityProfileIdentifiers = null;
            return;
        }

        this.securityProfileIdentifiers = new java.util.ArrayList<SecurityProfileIdentifier>(securityProfileIdentifiers);
    }

    /**
     * <p>
     * A list of security profile identifiers (names and ARNs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityProfileIdentifiers(java.util.Collection)} or
     * {@link #withSecurityProfileIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityProfileIdentifiers
     *        A list of security profile identifiers (names and ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesResult withSecurityProfileIdentifiers(SecurityProfileIdentifier... securityProfileIdentifiers) {
        if (this.securityProfileIdentifiers == null) {
            setSecurityProfileIdentifiers(new java.util.ArrayList<SecurityProfileIdentifier>(securityProfileIdentifiers.length));
        }
        for (SecurityProfileIdentifier ele : securityProfileIdentifiers) {
            this.securityProfileIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security profile identifiers (names and ARNs).
     * </p>
     * 
     * @param securityProfileIdentifiers
     *        A list of security profile identifiers (names and ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesResult withSecurityProfileIdentifiers(java.util.Collection<SecurityProfileIdentifier> securityProfileIdentifiers) {
        setSecurityProfileIdentifiers(securityProfileIdentifiers);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @return A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *         additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesResult withNextToken(String nextToken) {
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
        if (getSecurityProfileIdentifiers() != null)
            sb.append("SecurityProfileIdentifiers: ").append(getSecurityProfileIdentifiers()).append(",");
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

        if (obj instanceof ListSecurityProfilesResult == false)
            return false;
        ListSecurityProfilesResult other = (ListSecurityProfilesResult) obj;
        if (other.getSecurityProfileIdentifiers() == null ^ this.getSecurityProfileIdentifiers() == null)
            return false;
        if (other.getSecurityProfileIdentifiers() != null && other.getSecurityProfileIdentifiers().equals(this.getSecurityProfileIdentifiers()) == false)
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

        hashCode = prime * hashCode + ((getSecurityProfileIdentifiers() == null) ? 0 : getSecurityProfileIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityProfilesResult clone() {
        try {
            return (ListSecurityProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

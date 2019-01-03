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
public class ListTargetsForSecurityProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     */
    private java.util.List<SecurityProfileTarget> securityProfileTargets;
    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     * 
     * @return The thing groups to which the security profile is attached.
     */

    public java.util.List<SecurityProfileTarget> getSecurityProfileTargets() {
        return securityProfileTargets;
    }

    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     * 
     * @param securityProfileTargets
     *        The thing groups to which the security profile is attached.
     */

    public void setSecurityProfileTargets(java.util.Collection<SecurityProfileTarget> securityProfileTargets) {
        if (securityProfileTargets == null) {
            this.securityProfileTargets = null;
            return;
        }

        this.securityProfileTargets = new java.util.ArrayList<SecurityProfileTarget>(securityProfileTargets);
    }

    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityProfileTargets(java.util.Collection)} or
     * {@link #withSecurityProfileTargets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityProfileTargets
     *        The thing groups to which the security profile is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetsForSecurityProfileResult withSecurityProfileTargets(SecurityProfileTarget... securityProfileTargets) {
        if (this.securityProfileTargets == null) {
            setSecurityProfileTargets(new java.util.ArrayList<SecurityProfileTarget>(securityProfileTargets.length));
        }
        for (SecurityProfileTarget ele : securityProfileTargets) {
            this.securityProfileTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     * 
     * @param securityProfileTargets
     *        The thing groups to which the security profile is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetsForSecurityProfileResult withSecurityProfileTargets(java.util.Collection<SecurityProfileTarget> securityProfileTargets) {
        setSecurityProfileTargets(securityProfileTargets);
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

    public ListTargetsForSecurityProfileResult withNextToken(String nextToken) {
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
        if (getSecurityProfileTargets() != null)
            sb.append("SecurityProfileTargets: ").append(getSecurityProfileTargets()).append(",");
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

        if (obj instanceof ListTargetsForSecurityProfileResult == false)
            return false;
        ListTargetsForSecurityProfileResult other = (ListTargetsForSecurityProfileResult) obj;
        if (other.getSecurityProfileTargets() == null ^ this.getSecurityProfileTargets() == null)
            return false;
        if (other.getSecurityProfileTargets() != null && other.getSecurityProfileTargets().equals(this.getSecurityProfileTargets()) == false)
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

        hashCode = prime * hashCode + ((getSecurityProfileTargets() == null) ? 0 : getSecurityProfileTargets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTargetsForSecurityProfileResult clone() {
        try {
            return (ListTargetsForSecurityProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

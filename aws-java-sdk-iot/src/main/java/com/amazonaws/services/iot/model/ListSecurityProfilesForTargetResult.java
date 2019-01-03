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
public class ListSecurityProfilesForTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of security profiles and their associated targets.
     * </p>
     */
    private java.util.List<SecurityProfileTargetMapping> securityProfileTargetMappings;
    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of security profiles and their associated targets.
     * </p>
     * 
     * @return A list of security profiles and their associated targets.
     */

    public java.util.List<SecurityProfileTargetMapping> getSecurityProfileTargetMappings() {
        return securityProfileTargetMappings;
    }

    /**
     * <p>
     * A list of security profiles and their associated targets.
     * </p>
     * 
     * @param securityProfileTargetMappings
     *        A list of security profiles and their associated targets.
     */

    public void setSecurityProfileTargetMappings(java.util.Collection<SecurityProfileTargetMapping> securityProfileTargetMappings) {
        if (securityProfileTargetMappings == null) {
            this.securityProfileTargetMappings = null;
            return;
        }

        this.securityProfileTargetMappings = new java.util.ArrayList<SecurityProfileTargetMapping>(securityProfileTargetMappings);
    }

    /**
     * <p>
     * A list of security profiles and their associated targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityProfileTargetMappings(java.util.Collection)} or
     * {@link #withSecurityProfileTargetMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityProfileTargetMappings
     *        A list of security profiles and their associated targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesForTargetResult withSecurityProfileTargetMappings(SecurityProfileTargetMapping... securityProfileTargetMappings) {
        if (this.securityProfileTargetMappings == null) {
            setSecurityProfileTargetMappings(new java.util.ArrayList<SecurityProfileTargetMapping>(securityProfileTargetMappings.length));
        }
        for (SecurityProfileTargetMapping ele : securityProfileTargetMappings) {
            this.securityProfileTargetMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security profiles and their associated targets.
     * </p>
     * 
     * @param securityProfileTargetMappings
     *        A list of security profiles and their associated targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilesForTargetResult withSecurityProfileTargetMappings(
            java.util.Collection<SecurityProfileTargetMapping> securityProfileTargetMappings) {
        setSecurityProfileTargetMappings(securityProfileTargetMappings);
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

    public ListSecurityProfilesForTargetResult withNextToken(String nextToken) {
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
        if (getSecurityProfileTargetMappings() != null)
            sb.append("SecurityProfileTargetMappings: ").append(getSecurityProfileTargetMappings()).append(",");
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

        if (obj instanceof ListSecurityProfilesForTargetResult == false)
            return false;
        ListSecurityProfilesForTargetResult other = (ListSecurityProfilesForTargetResult) obj;
        if (other.getSecurityProfileTargetMappings() == null ^ this.getSecurityProfileTargetMappings() == null)
            return false;
        if (other.getSecurityProfileTargetMappings() != null
                && other.getSecurityProfileTargetMappings().equals(this.getSecurityProfileTargetMappings()) == false)
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

        hashCode = prime * hashCode + ((getSecurityProfileTargetMappings() == null) ? 0 : getSecurityProfileTargetMappings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityProfilesForTargetResult clone() {
        try {
            return (ListSecurityProfilesForTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

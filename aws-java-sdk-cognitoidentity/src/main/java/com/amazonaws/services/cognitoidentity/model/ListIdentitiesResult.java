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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response to a ListIdentities request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/ListIdentities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     */
    private java.util.List<IdentityDescription> identities;
    /**
     * <p>
     * A pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @return An identity pool ID in the format REGION:GUID.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesResult withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     * 
     * @return An object containing a set of identities and associated mappings.
     */

    public java.util.List<IdentityDescription> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     * 
     * @param identities
     *        An object containing a set of identities and associated mappings.
     */

    public void setIdentities(java.util.Collection<IdentityDescription> identities) {
        if (identities == null) {
            this.identities = null;
            return;
        }

        this.identities = new java.util.ArrayList<IdentityDescription>(identities);
    }

    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentities(java.util.Collection)} or {@link #withIdentities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param identities
     *        An object containing a set of identities and associated mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesResult withIdentities(IdentityDescription... identities) {
        if (this.identities == null) {
            setIdentities(new java.util.ArrayList<IdentityDescription>(identities.length));
        }
        for (IdentityDescription ele : identities) {
            this.identities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     * 
     * @param identities
     *        An object containing a set of identities and associated mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesResult withIdentities(java.util.Collection<IdentityDescription> identities) {
        setIdentities(identities);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesResult withNextToken(String nextToken) {
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getIdentities() != null)
            sb.append("Identities: ").append(getIdentities()).append(",");
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

        if (obj instanceof ListIdentitiesResult == false)
            return false;
        ListIdentitiesResult other = (ListIdentitiesResult) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentities() == null ^ this.getIdentities() == null)
            return false;
        if (other.getIdentities() != null && other.getIdentities().equals(this.getIdentities()) == false)
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

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIdentitiesResult clone() {
        try {
            return (ListIdentitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

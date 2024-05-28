/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetDecryptedAPIKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDecryptedAPIKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     */
    private java.util.List<String> tokenDomains;
    /**
     * <p>
     * The date and time that the key was created.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     * 
     * @return The token domains that are defined in this API key.
     */

    public java.util.List<String> getTokenDomains() {
        return tokenDomains;
    }

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     * 
     * @param tokenDomains
     *        The token domains that are defined in this API key.
     */

    public void setTokenDomains(java.util.Collection<String> tokenDomains) {
        if (tokenDomains == null) {
            this.tokenDomains = null;
            return;
        }

        this.tokenDomains = new java.util.ArrayList<String>(tokenDomains);
    }

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenDomains(java.util.Collection)} or {@link #withTokenDomains(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tokenDomains
     *        The token domains that are defined in this API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDecryptedAPIKeyResult withTokenDomains(String... tokenDomains) {
        if (this.tokenDomains == null) {
            setTokenDomains(new java.util.ArrayList<String>(tokenDomains.length));
        }
        for (String ele : tokenDomains) {
            this.tokenDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     * 
     * @param tokenDomains
     *        The token domains that are defined in this API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDecryptedAPIKeyResult withTokenDomains(java.util.Collection<String> tokenDomains) {
        setTokenDomains(tokenDomains);
        return this;
    }

    /**
     * <p>
     * The date and time that the key was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time that the key was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The date and time that the key was created.
     * </p>
     * 
     * @return The date and time that the key was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The date and time that the key was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time that the key was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDecryptedAPIKeyResult withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
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
        if (getTokenDomains() != null)
            sb.append("TokenDomains: ").append(getTokenDomains()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDecryptedAPIKeyResult == false)
            return false;
        GetDecryptedAPIKeyResult other = (GetDecryptedAPIKeyResult) obj;
        if (other.getTokenDomains() == null ^ this.getTokenDomains() == null)
            return false;
        if (other.getTokenDomains() != null && other.getTokenDomains().equals(this.getTokenDomains()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenDomains() == null) ? 0 : getTokenDomains().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetDecryptedAPIKeyResult clone() {
        try {
            return (GetDecryptedAPIKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

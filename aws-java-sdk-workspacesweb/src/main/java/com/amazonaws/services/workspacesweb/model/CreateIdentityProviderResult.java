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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateIdentityProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIdentityProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the identity provider.
     * </p>
     */
    private String identityProviderArn;

    /**
     * <p>
     * The ARN of the identity provider.
     * </p>
     * 
     * @param identityProviderArn
     *        The ARN of the identity provider.
     */

    public void setIdentityProviderArn(String identityProviderArn) {
        this.identityProviderArn = identityProviderArn;
    }

    /**
     * <p>
     * The ARN of the identity provider.
     * </p>
     * 
     * @return The ARN of the identity provider.
     */

    public String getIdentityProviderArn() {
        return this.identityProviderArn;
    }

    /**
     * <p>
     * The ARN of the identity provider.
     * </p>
     * 
     * @param identityProviderArn
     *        The ARN of the identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderResult withIdentityProviderArn(String identityProviderArn) {
        setIdentityProviderArn(identityProviderArn);
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
        if (getIdentityProviderArn() != null)
            sb.append("IdentityProviderArn: ").append(getIdentityProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIdentityProviderResult == false)
            return false;
        CreateIdentityProviderResult other = (CreateIdentityProviderResult) obj;
        if (other.getIdentityProviderArn() == null ^ this.getIdentityProviderArn() == null)
            return false;
        if (other.getIdentityProviderArn() != null && other.getIdentityProviderArn().equals(this.getIdentityProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityProviderArn() == null) ? 0 : getIdentityProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateIdentityProviderResult clone() {
        try {
            return (CreateIdentityProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetPrincipalTagAttributeMap"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPrincipalTagAttributeMapRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * You can use this operation to get the provider name.
     * </p>
     */
    private String identityProviderName;

    /**
     * <p>
     * You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.
     * </p>
     * 
     * @param identityPoolId
     *        You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.
     * </p>
     * 
     * @return You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.
     * </p>
     * 
     * @param identityPoolId
     *        You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrincipalTagAttributeMapRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * You can use this operation to get the provider name.
     * </p>
     * 
     * @param identityProviderName
     *        You can use this operation to get the provider name.
     */

    public void setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
    }

    /**
     * <p>
     * You can use this operation to get the provider name.
     * </p>
     * 
     * @return You can use this operation to get the provider name.
     */

    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    /**
     * <p>
     * You can use this operation to get the provider name.
     * </p>
     * 
     * @param identityProviderName
     *        You can use this operation to get the provider name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrincipalTagAttributeMapRequest withIdentityProviderName(String identityProviderName) {
        setIdentityProviderName(identityProviderName);
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
        if (getIdentityProviderName() != null)
            sb.append("IdentityProviderName: ").append(getIdentityProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPrincipalTagAttributeMapRequest == false)
            return false;
        GetPrincipalTagAttributeMapRequest other = (GetPrincipalTagAttributeMapRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityProviderName() == null ^ this.getIdentityProviderName() == null)
            return false;
        if (other.getIdentityProviderName() != null && other.getIdentityProviderName().equals(this.getIdentityProviderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderName() == null) ? 0 : getIdentityProviderName().hashCode());
        return hashCode;
    }

    @Override
    public GetPrincipalTagAttributeMapRequest clone() {
        return (GetPrincipalTagAttributeMapRequest) super.clone();
    }

}

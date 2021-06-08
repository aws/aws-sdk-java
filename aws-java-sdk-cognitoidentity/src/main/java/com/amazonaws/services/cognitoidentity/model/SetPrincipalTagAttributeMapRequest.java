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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/SetPrincipalTagAttributeMap"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetPrincipalTagAttributeMapRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Identity Pool you want to set attribute mappings for.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * The provider name you want to use for attribute mappings.
     * </p>
     */
    private String identityProviderName;
    /**
     * <p>
     * You can use this operation to use default (username and clientID) attribute mappings.
     * </p>
     */
    private Boolean useDefaults;
    /**
     * <p>
     * You can use this operation to add principal tags.
     * </p>
     */
    private java.util.Map<String, String> principalTags;

    /**
     * <p>
     * The ID of the Identity Pool you want to set attribute mappings for.
     * </p>
     * 
     * @param identityPoolId
     *        The ID of the Identity Pool you want to set attribute mappings for.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * The ID of the Identity Pool you want to set attribute mappings for.
     * </p>
     * 
     * @return The ID of the Identity Pool you want to set attribute mappings for.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * The ID of the Identity Pool you want to set attribute mappings for.
     * </p>
     * 
     * @param identityPoolId
     *        The ID of the Identity Pool you want to set attribute mappings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetPrincipalTagAttributeMapRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * The provider name you want to use for attribute mappings.
     * </p>
     * 
     * @param identityProviderName
     *        The provider name you want to use for attribute mappings.
     */

    public void setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
    }

    /**
     * <p>
     * The provider name you want to use for attribute mappings.
     * </p>
     * 
     * @return The provider name you want to use for attribute mappings.
     */

    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    /**
     * <p>
     * The provider name you want to use for attribute mappings.
     * </p>
     * 
     * @param identityProviderName
     *        The provider name you want to use for attribute mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetPrincipalTagAttributeMapRequest withIdentityProviderName(String identityProviderName) {
        setIdentityProviderName(identityProviderName);
        return this;
    }

    /**
     * <p>
     * You can use this operation to use default (username and clientID) attribute mappings.
     * </p>
     * 
     * @param useDefaults
     *        You can use this operation to use default (username and clientID) attribute mappings.
     */

    public void setUseDefaults(Boolean useDefaults) {
        this.useDefaults = useDefaults;
    }

    /**
     * <p>
     * You can use this operation to use default (username and clientID) attribute mappings.
     * </p>
     * 
     * @return You can use this operation to use default (username and clientID) attribute mappings.
     */

    public Boolean getUseDefaults() {
        return this.useDefaults;
    }

    /**
     * <p>
     * You can use this operation to use default (username and clientID) attribute mappings.
     * </p>
     * 
     * @param useDefaults
     *        You can use this operation to use default (username and clientID) attribute mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetPrincipalTagAttributeMapRequest withUseDefaults(Boolean useDefaults) {
        setUseDefaults(useDefaults);
        return this;
    }

    /**
     * <p>
     * You can use this operation to use default (username and clientID) attribute mappings.
     * </p>
     * 
     * @return You can use this operation to use default (username and clientID) attribute mappings.
     */

    public Boolean isUseDefaults() {
        return this.useDefaults;
    }

    /**
     * <p>
     * You can use this operation to add principal tags.
     * </p>
     * 
     * @return You can use this operation to add principal tags.
     */

    public java.util.Map<String, String> getPrincipalTags() {
        return principalTags;
    }

    /**
     * <p>
     * You can use this operation to add principal tags.
     * </p>
     * 
     * @param principalTags
     *        You can use this operation to add principal tags.
     */

    public void setPrincipalTags(java.util.Map<String, String> principalTags) {
        this.principalTags = principalTags;
    }

    /**
     * <p>
     * You can use this operation to add principal tags.
     * </p>
     * 
     * @param principalTags
     *        You can use this operation to add principal tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetPrincipalTagAttributeMapRequest withPrincipalTags(java.util.Map<String, String> principalTags) {
        setPrincipalTags(principalTags);
        return this;
    }

    /**
     * Add a single PrincipalTags entry
     *
     * @see SetPrincipalTagAttributeMapRequest#withPrincipalTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SetPrincipalTagAttributeMapRequest addPrincipalTagsEntry(String key, String value) {
        if (null == this.principalTags) {
            this.principalTags = new java.util.HashMap<String, String>();
        }
        if (this.principalTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.principalTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PrincipalTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetPrincipalTagAttributeMapRequest clearPrincipalTagsEntries() {
        this.principalTags = null;
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
            sb.append("IdentityProviderName: ").append(getIdentityProviderName()).append(",");
        if (getUseDefaults() != null)
            sb.append("UseDefaults: ").append(getUseDefaults()).append(",");
        if (getPrincipalTags() != null)
            sb.append("PrincipalTags: ").append(getPrincipalTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetPrincipalTagAttributeMapRequest == false)
            return false;
        SetPrincipalTagAttributeMapRequest other = (SetPrincipalTagAttributeMapRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityProviderName() == null ^ this.getIdentityProviderName() == null)
            return false;
        if (other.getIdentityProviderName() != null && other.getIdentityProviderName().equals(this.getIdentityProviderName()) == false)
            return false;
        if (other.getUseDefaults() == null ^ this.getUseDefaults() == null)
            return false;
        if (other.getUseDefaults() != null && other.getUseDefaults().equals(this.getUseDefaults()) == false)
            return false;
        if (other.getPrincipalTags() == null ^ this.getPrincipalTags() == null)
            return false;
        if (other.getPrincipalTags() != null && other.getPrincipalTags().equals(this.getPrincipalTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderName() == null) ? 0 : getIdentityProviderName().hashCode());
        hashCode = prime * hashCode + ((getUseDefaults() == null) ? 0 : getUseDefaults().hashCode());
        hashCode = prime * hashCode + ((getPrincipalTags() == null) ? 0 : getPrincipalTags().hashCode());
        return hashCode;
    }

    @Override
    public SetPrincipalTagAttributeMapRequest clone() {
        return (SetPrincipalTagAttributeMapRequest) super.clone();
    }

}

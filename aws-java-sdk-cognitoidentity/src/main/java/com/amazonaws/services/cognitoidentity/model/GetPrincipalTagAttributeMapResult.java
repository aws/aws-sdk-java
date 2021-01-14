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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetPrincipalTagAttributeMap"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPrincipalTagAttributeMapResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * You can use this operation to list
     * </p>
     */
    private Boolean useDefaults;
    /**
     * <p>
     * You can use this operation to add principal tags. The <code>PrincipalTags</code>operation enables you to
     * reference user attributes in your IAM permissions policy.
     * </p>
     */
    private java.util.Map<String, String> principalTags;

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

    public GetPrincipalTagAttributeMapResult withIdentityPoolId(String identityPoolId) {
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

    public GetPrincipalTagAttributeMapResult withIdentityProviderName(String identityProviderName) {
        setIdentityProviderName(identityProviderName);
        return this;
    }

    /**
     * <p>
     * You can use this operation to list
     * </p>
     * 
     * @param useDefaults
     *        You can use this operation to list
     */

    public void setUseDefaults(Boolean useDefaults) {
        this.useDefaults = useDefaults;
    }

    /**
     * <p>
     * You can use this operation to list
     * </p>
     * 
     * @return You can use this operation to list
     */

    public Boolean getUseDefaults() {
        return this.useDefaults;
    }

    /**
     * <p>
     * You can use this operation to list
     * </p>
     * 
     * @param useDefaults
     *        You can use this operation to list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrincipalTagAttributeMapResult withUseDefaults(Boolean useDefaults) {
        setUseDefaults(useDefaults);
        return this;
    }

    /**
     * <p>
     * You can use this operation to list
     * </p>
     * 
     * @return You can use this operation to list
     */

    public Boolean isUseDefaults() {
        return this.useDefaults;
    }

    /**
     * <p>
     * You can use this operation to add principal tags. The <code>PrincipalTags</code>operation enables you to
     * reference user attributes in your IAM permissions policy.
     * </p>
     * 
     * @return You can use this operation to add principal tags. The <code>PrincipalTags</code>operation enables you to
     *         reference user attributes in your IAM permissions policy.
     */

    public java.util.Map<String, String> getPrincipalTags() {
        return principalTags;
    }

    /**
     * <p>
     * You can use this operation to add principal tags. The <code>PrincipalTags</code>operation enables you to
     * reference user attributes in your IAM permissions policy.
     * </p>
     * 
     * @param principalTags
     *        You can use this operation to add principal tags. The <code>PrincipalTags</code>operation enables you to
     *        reference user attributes in your IAM permissions policy.
     */

    public void setPrincipalTags(java.util.Map<String, String> principalTags) {
        this.principalTags = principalTags;
    }

    /**
     * <p>
     * You can use this operation to add principal tags. The <code>PrincipalTags</code>operation enables you to
     * reference user attributes in your IAM permissions policy.
     * </p>
     * 
     * @param principalTags
     *        You can use this operation to add principal tags. The <code>PrincipalTags</code>operation enables you to
     *        reference user attributes in your IAM permissions policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrincipalTagAttributeMapResult withPrincipalTags(java.util.Map<String, String> principalTags) {
        setPrincipalTags(principalTags);
        return this;
    }

    /**
     * Add a single PrincipalTags entry
     *
     * @see GetPrincipalTagAttributeMapResult#withPrincipalTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetPrincipalTagAttributeMapResult addPrincipalTagsEntry(String key, String value) {
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

    public GetPrincipalTagAttributeMapResult clearPrincipalTagsEntries() {
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

        if (obj instanceof GetPrincipalTagAttributeMapResult == false)
            return false;
        GetPrincipalTagAttributeMapResult other = (GetPrincipalTagAttributeMapResult) obj;
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
    public GetPrincipalTagAttributeMapResult clone() {
        try {
            return (GetPrincipalTagAttributeMapResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the GetOpenIdToken action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdToken" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOpenIdTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. When using graph.facebook.com and
     * www.amazon.com, supply the access_token returned from the provider's authflow. For accounts.google.com, an Amazon
     * Cognito user pool provider, or any other OpenId Connect provider, always include the <code>id_token</code>.
     * </p>
     */
    private java.util.Map<String, String> logins;

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @return A unique identifier in the format REGION:GUID.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. When using graph.facebook.com and
     * www.amazon.com, supply the access_token returned from the provider's authflow. For accounts.google.com, an Amazon
     * Cognito user pool provider, or any other OpenId Connect provider, always include the <code>id_token</code>.
     * </p>
     * 
     * @return A set of optional name-value pairs that map provider names to provider tokens. When using
     *         graph.facebook.com and www.amazon.com, supply the access_token returned from the provider's authflow. For
     *         accounts.google.com, an Amazon Cognito user pool provider, or any other OpenId Connect provider, always
     *         include the <code>id_token</code>.
     */

    public java.util.Map<String, String> getLogins() {
        return logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. When using graph.facebook.com and
     * www.amazon.com, supply the access_token returned from the provider's authflow. For accounts.google.com, an Amazon
     * Cognito user pool provider, or any other OpenId Connect provider, always include the <code>id_token</code>.
     * </p>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens. When using
     *        graph.facebook.com and www.amazon.com, supply the access_token returned from the provider's authflow. For
     *        accounts.google.com, an Amazon Cognito user pool provider, or any other OpenId Connect provider, always
     *        include the <code>id_token</code>.
     */

    public void setLogins(java.util.Map<String, String> logins) {
        this.logins = logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. When using graph.facebook.com and
     * www.amazon.com, supply the access_token returned from the provider's authflow. For accounts.google.com, an Amazon
     * Cognito user pool provider, or any other OpenId Connect provider, always include the <code>id_token</code>.
     * </p>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens. When using
     *        graph.facebook.com and www.amazon.com, supply the access_token returned from the provider's authflow. For
     *        accounts.google.com, an Amazon Cognito user pool provider, or any other OpenId Connect provider, always
     *        include the <code>id_token</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenRequest withLogins(java.util.Map<String, String> logins) {
        setLogins(logins);
        return this;
    }

    public GetOpenIdTokenRequest addLoginsEntry(String key, String value) {
        if (null == this.logins) {
            this.logins = new java.util.HashMap<String, String>();
        }
        if (this.logins.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logins.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Logins.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenRequest clearLoginsEntries() {
        this.logins = null;
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
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getLogins() != null)
            sb.append("Logins: ").append(getLogins());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpenIdTokenRequest == false)
            return false;
        GetOpenIdTokenRequest other = (GetOpenIdTokenRequest) obj;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getLogins() == null ^ this.getLogins() == null)
            return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode());
        return hashCode;
    }

    @Override
    public GetOpenIdTokenRequest clone() {
        return (GetOpenIdTokenRequest) super.clone();
    }

}

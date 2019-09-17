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
 * Input to the GetId action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A standard AWS account ID (9+ digits).
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. The available provider names for
     * <code>Logins</code> are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Facebook: <code>graph.facebook.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito user pool: <code>cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;</code>, for
     * example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Google: <code>accounts.google.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon: <code>www.amazon.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Twitter: <code>api.twitter.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Digits: <code>www.digits.com</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> logins;

    /**
     * <p>
     * A standard AWS account ID (9+ digits).
     * </p>
     * 
     * @param accountId
     *        A standard AWS account ID (9+ digits).
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * A standard AWS account ID (9+ digits).
     * </p>
     * 
     * @return A standard AWS account ID (9+ digits).
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * A standard AWS account ID (9+ digits).
     * </p>
     * 
     * @param accountId
     *        A standard AWS account ID (9+ digits).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

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

    public GetIdRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. The available provider names for
     * <code>Logins</code> are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Facebook: <code>graph.facebook.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito user pool: <code>cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;</code>, for
     * example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Google: <code>accounts.google.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon: <code>www.amazon.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Twitter: <code>api.twitter.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Digits: <code>www.digits.com</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A set of optional name-value pairs that map provider names to provider tokens. The available provider
     *         names for <code>Logins</code> are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Facebook: <code>graph.facebook.com</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito user pool: <code>cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;</code>
     *         , for example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Google: <code>accounts.google.com</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon: <code>www.amazon.com</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Twitter: <code>api.twitter.com</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Digits: <code>www.digits.com</code>
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getLogins() {
        return logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. The available provider names for
     * <code>Logins</code> are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Facebook: <code>graph.facebook.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito user pool: <code>cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;</code>, for
     * example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Google: <code>accounts.google.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon: <code>www.amazon.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Twitter: <code>api.twitter.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Digits: <code>www.digits.com</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens. The available provider
     *        names for <code>Logins</code> are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Facebook: <code>graph.facebook.com</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito user pool: <code>cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;</code>,
     *        for example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Google: <code>accounts.google.com</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon: <code>www.amazon.com</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Twitter: <code>api.twitter.com</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Digits: <code>www.digits.com</code>
     *        </p>
     *        </li>
     */

    public void setLogins(java.util.Map<String, String> logins) {
        this.logins = logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. The available provider names for
     * <code>Logins</code> are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Facebook: <code>graph.facebook.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito user pool: <code>cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;</code>, for
     * example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Google: <code>accounts.google.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon: <code>www.amazon.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Twitter: <code>api.twitter.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Digits: <code>www.digits.com</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens. The available provider
     *        names for <code>Logins</code> are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Facebook: <code>graph.facebook.com</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito user pool: <code>cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;</code>,
     *        for example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Google: <code>accounts.google.com</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon: <code>www.amazon.com</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Twitter: <code>api.twitter.com</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Digits: <code>www.digits.com</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdRequest withLogins(java.util.Map<String, String> logins) {
        setLogins(logins);
        return this;
    }

    public GetIdRequest addLoginsEntry(String key, String value) {
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

    public GetIdRequest clearLoginsEntries() {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
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

        if (obj instanceof GetIdRequest == false)
            return false;
        GetIdRequest other = (GetIdRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode());
        return hashCode;
    }

    @Override
    public GetIdRequest clone() {
        return (GetIdRequest) super.clone();
    }

}

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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The principal.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     */
    private String cognitoIdentityPoolId;
    /**
     * <p>
     * A list of authorization info objects. Simulating authorization will create a response for each
     * <code>authInfo</code> object in the list.
     * </p>
     */
    private java.util.List<AuthInfo> authInfos;
    /**
     * <p>
     * The MQTT client ID.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are attached to the
     * principal being authorized.
     * </p>
     */
    private java.util.List<String> policyNamesToAdd;
    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are not attached to the
     * principal being authorized.
     * </p>
     */
    private java.util.List<String> policyNamesToSkip;

    /**
     * <p>
     * The principal.
     * </p>
     * 
     * @param principal
     *        The principal.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * 
     * @return The principal.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * 
     * @param principal
     *        The principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     * 
     * @param cognitoIdentityPoolId
     *        The Cognito identity pool ID.
     */

    public void setCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     * 
     * @return The Cognito identity pool ID.
     */

    public String getCognitoIdentityPoolId() {
        return this.cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     * 
     * @param cognitoIdentityPoolId
     *        The Cognito identity pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationRequest withCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        setCognitoIdentityPoolId(cognitoIdentityPoolId);
        return this;
    }

    /**
     * <p>
     * A list of authorization info objects. Simulating authorization will create a response for each
     * <code>authInfo</code> object in the list.
     * </p>
     * 
     * @return A list of authorization info objects. Simulating authorization will create a response for each
     *         <code>authInfo</code> object in the list.
     */

    public java.util.List<AuthInfo> getAuthInfos() {
        return authInfos;
    }

    /**
     * <p>
     * A list of authorization info objects. Simulating authorization will create a response for each
     * <code>authInfo</code> object in the list.
     * </p>
     * 
     * @param authInfos
     *        A list of authorization info objects. Simulating authorization will create a response for each
     *        <code>authInfo</code> object in the list.
     */

    public void setAuthInfos(java.util.Collection<AuthInfo> authInfos) {
        if (authInfos == null) {
            this.authInfos = null;
            return;
        }

        this.authInfos = new java.util.ArrayList<AuthInfo>(authInfos);
    }

    /**
     * <p>
     * A list of authorization info objects. Simulating authorization will create a response for each
     * <code>authInfo</code> object in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthInfos(java.util.Collection)} or {@link #withAuthInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param authInfos
     *        A list of authorization info objects. Simulating authorization will create a response for each
     *        <code>authInfo</code> object in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationRequest withAuthInfos(AuthInfo... authInfos) {
        if (this.authInfos == null) {
            setAuthInfos(new java.util.ArrayList<AuthInfo>(authInfos.length));
        }
        for (AuthInfo ele : authInfos) {
            this.authInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of authorization info objects. Simulating authorization will create a response for each
     * <code>authInfo</code> object in the list.
     * </p>
     * 
     * @param authInfos
     *        A list of authorization info objects. Simulating authorization will create a response for each
     *        <code>authInfo</code> object in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationRequest withAuthInfos(java.util.Collection<AuthInfo> authInfos) {
        setAuthInfos(authInfos);
        return this;
    }

    /**
     * <p>
     * The MQTT client ID.
     * </p>
     * 
     * @param clientId
     *        The MQTT client ID.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The MQTT client ID.
     * </p>
     * 
     * @return The MQTT client ID.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The MQTT client ID.
     * </p>
     * 
     * @param clientId
     *        The MQTT client ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are attached to the
     * principal being authorized.
     * </p>
     * 
     * @return When testing custom authorization, the policies specified here are treated as if they are attached to the
     *         principal being authorized.
     */

    public java.util.List<String> getPolicyNamesToAdd() {
        return policyNamesToAdd;
    }

    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are attached to the
     * principal being authorized.
     * </p>
     * 
     * @param policyNamesToAdd
     *        When testing custom authorization, the policies specified here are treated as if they are attached to the
     *        principal being authorized.
     */

    public void setPolicyNamesToAdd(java.util.Collection<String> policyNamesToAdd) {
        if (policyNamesToAdd == null) {
            this.policyNamesToAdd = null;
            return;
        }

        this.policyNamesToAdd = new java.util.ArrayList<String>(policyNamesToAdd);
    }

    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are attached to the
     * principal being authorized.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyNamesToAdd(java.util.Collection)} or {@link #withPolicyNamesToAdd(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyNamesToAdd
     *        When testing custom authorization, the policies specified here are treated as if they are attached to the
     *        principal being authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationRequest withPolicyNamesToAdd(String... policyNamesToAdd) {
        if (this.policyNamesToAdd == null) {
            setPolicyNamesToAdd(new java.util.ArrayList<String>(policyNamesToAdd.length));
        }
        for (String ele : policyNamesToAdd) {
            this.policyNamesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are attached to the
     * principal being authorized.
     * </p>
     * 
     * @param policyNamesToAdd
     *        When testing custom authorization, the policies specified here are treated as if they are attached to the
     *        principal being authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationRequest withPolicyNamesToAdd(java.util.Collection<String> policyNamesToAdd) {
        setPolicyNamesToAdd(policyNamesToAdd);
        return this;
    }

    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are not attached to the
     * principal being authorized.
     * </p>
     * 
     * @return When testing custom authorization, the policies specified here are treated as if they are not attached to
     *         the principal being authorized.
     */

    public java.util.List<String> getPolicyNamesToSkip() {
        return policyNamesToSkip;
    }

    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are not attached to the
     * principal being authorized.
     * </p>
     * 
     * @param policyNamesToSkip
     *        When testing custom authorization, the policies specified here are treated as if they are not attached to
     *        the principal being authorized.
     */

    public void setPolicyNamesToSkip(java.util.Collection<String> policyNamesToSkip) {
        if (policyNamesToSkip == null) {
            this.policyNamesToSkip = null;
            return;
        }

        this.policyNamesToSkip = new java.util.ArrayList<String>(policyNamesToSkip);
    }

    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are not attached to the
     * principal being authorized.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyNamesToSkip(java.util.Collection)} or {@link #withPolicyNamesToSkip(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param policyNamesToSkip
     *        When testing custom authorization, the policies specified here are treated as if they are not attached to
     *        the principal being authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationRequest withPolicyNamesToSkip(String... policyNamesToSkip) {
        if (this.policyNamesToSkip == null) {
            setPolicyNamesToSkip(new java.util.ArrayList<String>(policyNamesToSkip.length));
        }
        for (String ele : policyNamesToSkip) {
            this.policyNamesToSkip.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When testing custom authorization, the policies specified here are treated as if they are not attached to the
     * principal being authorized.
     * </p>
     * 
     * @param policyNamesToSkip
     *        When testing custom authorization, the policies specified here are treated as if they are not attached to
     *        the principal being authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationRequest withPolicyNamesToSkip(java.util.Collection<String> policyNamesToSkip) {
        setPolicyNamesToSkip(policyNamesToSkip);
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getCognitoIdentityPoolId() != null)
            sb.append("CognitoIdentityPoolId: ").append(getCognitoIdentityPoolId()).append(",");
        if (getAuthInfos() != null)
            sb.append("AuthInfos: ").append(getAuthInfos()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getPolicyNamesToAdd() != null)
            sb.append("PolicyNamesToAdd: ").append(getPolicyNamesToAdd()).append(",");
        if (getPolicyNamesToSkip() != null)
            sb.append("PolicyNamesToSkip: ").append(getPolicyNamesToSkip());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestAuthorizationRequest == false)
            return false;
        TestAuthorizationRequest other = (TestAuthorizationRequest) obj;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getCognitoIdentityPoolId() == null ^ this.getCognitoIdentityPoolId() == null)
            return false;
        if (other.getCognitoIdentityPoolId() != null && other.getCognitoIdentityPoolId().equals(this.getCognitoIdentityPoolId()) == false)
            return false;
        if (other.getAuthInfos() == null ^ this.getAuthInfos() == null)
            return false;
        if (other.getAuthInfos() != null && other.getAuthInfos().equals(this.getAuthInfos()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getPolicyNamesToAdd() == null ^ this.getPolicyNamesToAdd() == null)
            return false;
        if (other.getPolicyNamesToAdd() != null && other.getPolicyNamesToAdd().equals(this.getPolicyNamesToAdd()) == false)
            return false;
        if (other.getPolicyNamesToSkip() == null ^ this.getPolicyNamesToSkip() == null)
            return false;
        if (other.getPolicyNamesToSkip() != null && other.getPolicyNamesToSkip().equals(this.getPolicyNamesToSkip()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getCognitoIdentityPoolId() == null) ? 0 : getCognitoIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getAuthInfos() == null) ? 0 : getAuthInfos().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getPolicyNamesToAdd() == null) ? 0 : getPolicyNamesToAdd().hashCode());
        hashCode = prime * hashCode + ((getPolicyNamesToSkip() == null) ? 0 : getPolicyNamesToSkip().hashCode());
        return hashCode;
    }

    @Override
    public TestAuthorizationRequest clone() {
        return (TestAuthorizationRequest) super.clone();
    }

}

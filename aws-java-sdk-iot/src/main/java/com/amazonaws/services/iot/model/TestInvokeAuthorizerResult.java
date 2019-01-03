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
public class TestInvokeAuthorizerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     */
    private Boolean isAuthenticated;
    /**
     * <p>
     * The principal ID.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * IAM policy documents.
     * </p>
     */
    private java.util.List<String> policyDocuments;
    /**
     * <p>
     * The number of seconds after which the temporary credentials are refreshed.
     * </p>
     */
    private Integer refreshAfterInSeconds;
    /**
     * <p>
     * The number of seconds after which the connection is terminated.
     * </p>
     */
    private Integer disconnectAfterInSeconds;

    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     * 
     * @param isAuthenticated
     *        True if the token is authenticated, otherwise false.
     */

    public void setIsAuthenticated(Boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     * 
     * @return True if the token is authenticated, otherwise false.
     */

    public Boolean getIsAuthenticated() {
        return this.isAuthenticated;
    }

    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     * 
     * @param isAuthenticated
     *        True if the token is authenticated, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withIsAuthenticated(Boolean isAuthenticated) {
        setIsAuthenticated(isAuthenticated);
        return this;
    }

    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     * 
     * @return True if the token is authenticated, otherwise false.
     */

    public Boolean isAuthenticated() {
        return this.isAuthenticated;
    }

    /**
     * <p>
     * The principal ID.
     * </p>
     * 
     * @param principalId
     *        The principal ID.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal ID.
     * </p>
     * 
     * @return The principal ID.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The principal ID.
     * </p>
     * 
     * @param principalId
     *        The principal ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * IAM policy documents.
     * </p>
     * 
     * @return IAM policy documents.
     */

    public java.util.List<String> getPolicyDocuments() {
        return policyDocuments;
    }

    /**
     * <p>
     * IAM policy documents.
     * </p>
     * 
     * @param policyDocuments
     *        IAM policy documents.
     */

    public void setPolicyDocuments(java.util.Collection<String> policyDocuments) {
        if (policyDocuments == null) {
            this.policyDocuments = null;
            return;
        }

        this.policyDocuments = new java.util.ArrayList<String>(policyDocuments);
    }

    /**
     * <p>
     * IAM policy documents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyDocuments(java.util.Collection)} or {@link #withPolicyDocuments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyDocuments
     *        IAM policy documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withPolicyDocuments(String... policyDocuments) {
        if (this.policyDocuments == null) {
            setPolicyDocuments(new java.util.ArrayList<String>(policyDocuments.length));
        }
        for (String ele : policyDocuments) {
            this.policyDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IAM policy documents.
     * </p>
     * 
     * @param policyDocuments
     *        IAM policy documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withPolicyDocuments(java.util.Collection<String> policyDocuments) {
        setPolicyDocuments(policyDocuments);
        return this;
    }

    /**
     * <p>
     * The number of seconds after which the temporary credentials are refreshed.
     * </p>
     * 
     * @param refreshAfterInSeconds
     *        The number of seconds after which the temporary credentials are refreshed.
     */

    public void setRefreshAfterInSeconds(Integer refreshAfterInSeconds) {
        this.refreshAfterInSeconds = refreshAfterInSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the temporary credentials are refreshed.
     * </p>
     * 
     * @return The number of seconds after which the temporary credentials are refreshed.
     */

    public Integer getRefreshAfterInSeconds() {
        return this.refreshAfterInSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the temporary credentials are refreshed.
     * </p>
     * 
     * @param refreshAfterInSeconds
     *        The number of seconds after which the temporary credentials are refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withRefreshAfterInSeconds(Integer refreshAfterInSeconds) {
        setRefreshAfterInSeconds(refreshAfterInSeconds);
        return this;
    }

    /**
     * <p>
     * The number of seconds after which the connection is terminated.
     * </p>
     * 
     * @param disconnectAfterInSeconds
     *        The number of seconds after which the connection is terminated.
     */

    public void setDisconnectAfterInSeconds(Integer disconnectAfterInSeconds) {
        this.disconnectAfterInSeconds = disconnectAfterInSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the connection is terminated.
     * </p>
     * 
     * @return The number of seconds after which the connection is terminated.
     */

    public Integer getDisconnectAfterInSeconds() {
        return this.disconnectAfterInSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the connection is terminated.
     * </p>
     * 
     * @param disconnectAfterInSeconds
     *        The number of seconds after which the connection is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withDisconnectAfterInSeconds(Integer disconnectAfterInSeconds) {
        setDisconnectAfterInSeconds(disconnectAfterInSeconds);
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
        if (getIsAuthenticated() != null)
            sb.append("IsAuthenticated: ").append(getIsAuthenticated()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getPolicyDocuments() != null)
            sb.append("PolicyDocuments: ").append(getPolicyDocuments()).append(",");
        if (getRefreshAfterInSeconds() != null)
            sb.append("RefreshAfterInSeconds: ").append(getRefreshAfterInSeconds()).append(",");
        if (getDisconnectAfterInSeconds() != null)
            sb.append("DisconnectAfterInSeconds: ").append(getDisconnectAfterInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeAuthorizerResult == false)
            return false;
        TestInvokeAuthorizerResult other = (TestInvokeAuthorizerResult) obj;
        if (other.getIsAuthenticated() == null ^ this.getIsAuthenticated() == null)
            return false;
        if (other.getIsAuthenticated() != null && other.getIsAuthenticated().equals(this.getIsAuthenticated()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPolicyDocuments() == null ^ this.getPolicyDocuments() == null)
            return false;
        if (other.getPolicyDocuments() != null && other.getPolicyDocuments().equals(this.getPolicyDocuments()) == false)
            return false;
        if (other.getRefreshAfterInSeconds() == null ^ this.getRefreshAfterInSeconds() == null)
            return false;
        if (other.getRefreshAfterInSeconds() != null && other.getRefreshAfterInSeconds().equals(this.getRefreshAfterInSeconds()) == false)
            return false;
        if (other.getDisconnectAfterInSeconds() == null ^ this.getDisconnectAfterInSeconds() == null)
            return false;
        if (other.getDisconnectAfterInSeconds() != null && other.getDisconnectAfterInSeconds().equals(this.getDisconnectAfterInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsAuthenticated() == null) ? 0 : getIsAuthenticated().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocuments() == null) ? 0 : getPolicyDocuments().hashCode());
        hashCode = prime * hashCode + ((getRefreshAfterInSeconds() == null) ? 0 : getRefreshAfterInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDisconnectAfterInSeconds() == null) ? 0 : getDisconnectAfterInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public TestInvokeAuthorizerResult clone() {
        try {
            return (TestInvokeAuthorizerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

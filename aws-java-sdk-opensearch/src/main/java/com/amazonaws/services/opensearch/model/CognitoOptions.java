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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for the parameters required to enable Cognito authentication for an OpenSearch Service domain. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html">Configuring Amazon
 * Cognito authentication for OpenSearch Dashboards</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CognitoOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch Dashboards authentication.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     * authentication.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * The <code>AmazonOpenSearchServiceCognitoAccess</code> role that allows OpenSearch Service to configure your user
     * pool and identity pool.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     * 
     * @param enabled
     *        Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     * 
     * @return Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     * 
     * @param enabled
     *        Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     * 
     * @return Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @param userPoolId
     *        The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     *        authentication.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @return The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     *         authentication.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @param userPoolId
     *        The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     *        authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     * authentication.
     * </p>
     * 
     * @param identityPoolId
     *        The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     *        authentication.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     * authentication.
     * </p>
     * 
     * @return The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     *         authentication.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     * authentication.
     * </p>
     * 
     * @param identityPoolId
     *        The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch Dashboards
     *        authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * The <code>AmazonOpenSearchServiceCognitoAccess</code> role that allows OpenSearch Service to configure your user
     * pool and identity pool.
     * </p>
     * 
     * @param roleArn
     *        The <code>AmazonOpenSearchServiceCognitoAccess</code> role that allows OpenSearch Service to configure
     *        your user pool and identity pool.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The <code>AmazonOpenSearchServiceCognitoAccess</code> role that allows OpenSearch Service to configure your user
     * pool and identity pool.
     * </p>
     * 
     * @return The <code>AmazonOpenSearchServiceCognitoAccess</code> role that allows OpenSearch Service to configure
     *         your user pool and identity pool.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The <code>AmazonOpenSearchServiceCognitoAccess</code> role that allows OpenSearch Service to configure your user
     * pool and identity pool.
     * </p>
     * 
     * @param roleArn
     *        The <code>AmazonOpenSearchServiceCognitoAccess</code> role that allows OpenSearch Service to configure
     *        your user pool and identity pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoOptions == false)
            return false;
        CognitoOptions other = (CognitoOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CognitoOptions clone() {
        try {
            return (CognitoOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.CognitoOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see <a
 * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
 * target="_blank">Amazon Cognito Authentication for Kibana</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CognitoOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies the Cognito user pool ID for Kibana authentication.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * Specifies the Cognito identity pool ID for Kibana authentication.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     * 
     * @param enabled
     *        Specifies the option to enable Cognito for Kibana authentication.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     * 
     * @return Specifies the option to enable Cognito for Kibana authentication.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     * 
     * @param enabled
     *        Specifies the option to enable Cognito for Kibana authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies the option to enable Cognito for Kibana authentication.
     * </p>
     * 
     * @return Specifies the option to enable Cognito for Kibana authentication.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies the Cognito user pool ID for Kibana authentication.
     * </p>
     * 
     * @param userPoolId
     *        Specifies the Cognito user pool ID for Kibana authentication.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * Specifies the Cognito user pool ID for Kibana authentication.
     * </p>
     * 
     * @return Specifies the Cognito user pool ID for Kibana authentication.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * Specifies the Cognito user pool ID for Kibana authentication.
     * </p>
     * 
     * @param userPoolId
     *        Specifies the Cognito user pool ID for Kibana authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * Specifies the Cognito identity pool ID for Kibana authentication.
     * </p>
     * 
     * @param identityPoolId
     *        Specifies the Cognito identity pool ID for Kibana authentication.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * Specifies the Cognito identity pool ID for Kibana authentication.
     * </p>
     * 
     * @return Specifies the Cognito identity pool ID for Kibana authentication.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * Specifies the Cognito identity pool ID for Kibana authentication.
     * </p>
     * 
     * @param identityPoolId
     *        Specifies the Cognito identity pool ID for Kibana authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
     * </p>
     * 
     * @param roleArn
     *        Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
     * </p>
     * 
     * @return Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
     * </p>
     * 
     * @param roleArn
     *        Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
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
        com.amazonaws.services.elasticsearch.model.transform.CognitoOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

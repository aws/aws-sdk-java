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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies a Amazon Cognito user group. A user group can be used in on or more work teams.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CognitoMemberDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CognitoMemberDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
     * </p>
     */
    private String userPool;
    /**
     * <p>
     * An identifier for a user group.
     * </p>
     */
    private String userGroup;
    /**
     * <p>
     * An identifier for an application client. You must create the app client ID using Amazon Cognito.
     * </p>
     */
    private String clientId;

    /**
     * <p>
     * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
     * </p>
     * 
     * @param userPool
     *        An identifier for a user pool. The user pool must be in the same region as the service that you are
     *        calling.
     */

    public void setUserPool(String userPool) {
        this.userPool = userPool;
    }

    /**
     * <p>
     * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
     * </p>
     * 
     * @return An identifier for a user pool. The user pool must be in the same region as the service that you are
     *         calling.
     */

    public String getUserPool() {
        return this.userPool;
    }

    /**
     * <p>
     * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
     * </p>
     * 
     * @param userPool
     *        An identifier for a user pool. The user pool must be in the same region as the service that you are
     *        calling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoMemberDefinition withUserPool(String userPool) {
        setUserPool(userPool);
        return this;
    }

    /**
     * <p>
     * An identifier for a user group.
     * </p>
     * 
     * @param userGroup
     *        An identifier for a user group.
     */

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    /**
     * <p>
     * An identifier for a user group.
     * </p>
     * 
     * @return An identifier for a user group.
     */

    public String getUserGroup() {
        return this.userGroup;
    }

    /**
     * <p>
     * An identifier for a user group.
     * </p>
     * 
     * @param userGroup
     *        An identifier for a user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoMemberDefinition withUserGroup(String userGroup) {
        setUserGroup(userGroup);
        return this;
    }

    /**
     * <p>
     * An identifier for an application client. You must create the app client ID using Amazon Cognito.
     * </p>
     * 
     * @param clientId
     *        An identifier for an application client. You must create the app client ID using Amazon Cognito.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * An identifier for an application client. You must create the app client ID using Amazon Cognito.
     * </p>
     * 
     * @return An identifier for an application client. You must create the app client ID using Amazon Cognito.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * An identifier for an application client. You must create the app client ID using Amazon Cognito.
     * </p>
     * 
     * @param clientId
     *        An identifier for an application client. You must create the app client ID using Amazon Cognito.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoMemberDefinition withClientId(String clientId) {
        setClientId(clientId);
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
        if (getUserPool() != null)
            sb.append("UserPool: ").append(getUserPool()).append(",");
        if (getUserGroup() != null)
            sb.append("UserGroup: ").append(getUserGroup()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoMemberDefinition == false)
            return false;
        CognitoMemberDefinition other = (CognitoMemberDefinition) obj;
        if (other.getUserPool() == null ^ this.getUserPool() == null)
            return false;
        if (other.getUserPool() != null && other.getUserPool().equals(this.getUserPool()) == false)
            return false;
        if (other.getUserGroup() == null ^ this.getUserGroup() == null)
            return false;
        if (other.getUserGroup() != null && other.getUserGroup().equals(this.getUserGroup()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPool() == null) ? 0 : getUserPool().hashCode());
        hashCode = prime * hashCode + ((getUserGroup() == null) ? 0 : getUserGroup().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        return hashCode;
    }

    @Override
    public CognitoMemberDefinition clone() {
        try {
            return (CognitoMemberDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CognitoMemberDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

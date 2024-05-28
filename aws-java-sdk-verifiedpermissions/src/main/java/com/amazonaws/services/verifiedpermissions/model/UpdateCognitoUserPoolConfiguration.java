/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration details of a Amazon Cognito user pool for use with an identity source.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdateCognitoUserPoolConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCognitoUserPoolConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the Amazon Cognito user pool associated with this identity source.
     * </p>
     */
    private String userPoolArn;
    /**
     * <p>
     * The client ID of an app client that is configured for the specified Amazon Cognito user pool.
     * </p>
     */
    private java.util.List<String> clientIds;
    /**
     * <p>
     * The configuration of the user groups from an Amazon Cognito user pool identity source.
     * </p>
     */
    private UpdateCognitoGroupConfiguration groupConfiguration;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the Amazon Cognito user pool associated with this identity source.
     * </p>
     * 
     * @param userPoolArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the Amazon Cognito user pool associated with this identity source.
     */

    public void setUserPoolArn(String userPoolArn) {
        this.userPoolArn = userPoolArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the Amazon Cognito user pool associated with this identity source.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *         Name (ARN)</a> of the Amazon Cognito user pool associated with this identity source.
     */

    public String getUserPoolArn() {
        return this.userPoolArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the Amazon Cognito user pool associated with this identity source.
     * </p>
     * 
     * @param userPoolArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the Amazon Cognito user pool associated with this identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCognitoUserPoolConfiguration withUserPoolArn(String userPoolArn) {
        setUserPoolArn(userPoolArn);
        return this;
    }

    /**
     * <p>
     * The client ID of an app client that is configured for the specified Amazon Cognito user pool.
     * </p>
     * 
     * @return The client ID of an app client that is configured for the specified Amazon Cognito user pool.
     */

    public java.util.List<String> getClientIds() {
        return clientIds;
    }

    /**
     * <p>
     * The client ID of an app client that is configured for the specified Amazon Cognito user pool.
     * </p>
     * 
     * @param clientIds
     *        The client ID of an app client that is configured for the specified Amazon Cognito user pool.
     */

    public void setClientIds(java.util.Collection<String> clientIds) {
        if (clientIds == null) {
            this.clientIds = null;
            return;
        }

        this.clientIds = new java.util.ArrayList<String>(clientIds);
    }

    /**
     * <p>
     * The client ID of an app client that is configured for the specified Amazon Cognito user pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientIds(java.util.Collection)} or {@link #withClientIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clientIds
     *        The client ID of an app client that is configured for the specified Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCognitoUserPoolConfiguration withClientIds(String... clientIds) {
        if (this.clientIds == null) {
            setClientIds(new java.util.ArrayList<String>(clientIds.length));
        }
        for (String ele : clientIds) {
            this.clientIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The client ID of an app client that is configured for the specified Amazon Cognito user pool.
     * </p>
     * 
     * @param clientIds
     *        The client ID of an app client that is configured for the specified Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCognitoUserPoolConfiguration withClientIds(java.util.Collection<String> clientIds) {
        setClientIds(clientIds);
        return this;
    }

    /**
     * <p>
     * The configuration of the user groups from an Amazon Cognito user pool identity source.
     * </p>
     * 
     * @param groupConfiguration
     *        The configuration of the user groups from an Amazon Cognito user pool identity source.
     */

    public void setGroupConfiguration(UpdateCognitoGroupConfiguration groupConfiguration) {
        this.groupConfiguration = groupConfiguration;
    }

    /**
     * <p>
     * The configuration of the user groups from an Amazon Cognito user pool identity source.
     * </p>
     * 
     * @return The configuration of the user groups from an Amazon Cognito user pool identity source.
     */

    public UpdateCognitoGroupConfiguration getGroupConfiguration() {
        return this.groupConfiguration;
    }

    /**
     * <p>
     * The configuration of the user groups from an Amazon Cognito user pool identity source.
     * </p>
     * 
     * @param groupConfiguration
     *        The configuration of the user groups from an Amazon Cognito user pool identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCognitoUserPoolConfiguration withGroupConfiguration(UpdateCognitoGroupConfiguration groupConfiguration) {
        setGroupConfiguration(groupConfiguration);
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
        if (getUserPoolArn() != null)
            sb.append("UserPoolArn: ").append(getUserPoolArn()).append(",");
        if (getClientIds() != null)
            sb.append("ClientIds: ").append("***Sensitive Data Redacted***").append(",");
        if (getGroupConfiguration() != null)
            sb.append("GroupConfiguration: ").append(getGroupConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCognitoUserPoolConfiguration == false)
            return false;
        UpdateCognitoUserPoolConfiguration other = (UpdateCognitoUserPoolConfiguration) obj;
        if (other.getUserPoolArn() == null ^ this.getUserPoolArn() == null)
            return false;
        if (other.getUserPoolArn() != null && other.getUserPoolArn().equals(this.getUserPoolArn()) == false)
            return false;
        if (other.getClientIds() == null ^ this.getClientIds() == null)
            return false;
        if (other.getClientIds() != null && other.getClientIds().equals(this.getClientIds()) == false)
            return false;
        if (other.getGroupConfiguration() == null ^ this.getGroupConfiguration() == null)
            return false;
        if (other.getGroupConfiguration() != null && other.getGroupConfiguration().equals(this.getGroupConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolArn() == null) ? 0 : getUserPoolArn().hashCode());
        hashCode = prime * hashCode + ((getClientIds() == null) ? 0 : getClientIds().hashCode());
        hashCode = prime * hashCode + ((getGroupConfiguration() == null) ? 0 : getGroupConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCognitoUserPoolConfiguration clone() {
        try {
            return (UpdateCognitoUserPoolConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.UpdateCognitoUserPoolConfigurationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}

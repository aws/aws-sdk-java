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
 * The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source.
 * </p>
 * <p>
 * This data type is part of a <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CognitoUserPoolConfiguration.html"
 * >CognitoUserPoolConfiguration</a> structure and is a request parameter in <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html"
 * >CreateIdentitySource</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CognitoGroupConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CognitoGroupConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the schema entity type that's mapped to the user pool group. Defaults to
     * <code>AWS::CognitoGroup</code>.
     * </p>
     */
    private String groupEntityType;

    /**
     * <p>
     * The name of the schema entity type that's mapped to the user pool group. Defaults to
     * <code>AWS::CognitoGroup</code>.
     * </p>
     * 
     * @param groupEntityType
     *        The name of the schema entity type that's mapped to the user pool group. Defaults to
     *        <code>AWS::CognitoGroup</code>.
     */

    public void setGroupEntityType(String groupEntityType) {
        this.groupEntityType = groupEntityType;
    }

    /**
     * <p>
     * The name of the schema entity type that's mapped to the user pool group. Defaults to
     * <code>AWS::CognitoGroup</code>.
     * </p>
     * 
     * @return The name of the schema entity type that's mapped to the user pool group. Defaults to
     *         <code>AWS::CognitoGroup</code>.
     */

    public String getGroupEntityType() {
        return this.groupEntityType;
    }

    /**
     * <p>
     * The name of the schema entity type that's mapped to the user pool group. Defaults to
     * <code>AWS::CognitoGroup</code>.
     * </p>
     * 
     * @param groupEntityType
     *        The name of the schema entity type that's mapped to the user pool group. Defaults to
     *        <code>AWS::CognitoGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoGroupConfiguration withGroupEntityType(String groupEntityType) {
        setGroupEntityType(groupEntityType);
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
        if (getGroupEntityType() != null)
            sb.append("GroupEntityType: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoGroupConfiguration == false)
            return false;
        CognitoGroupConfiguration other = (CognitoGroupConfiguration) obj;
        if (other.getGroupEntityType() == null ^ this.getGroupEntityType() == null)
            return false;
        if (other.getGroupEntityType() != null && other.getGroupEntityType().equals(this.getGroupEntityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupEntityType() == null) ? 0 : getGroupEntityType().hashCode());
        return hashCode;
    }

    @Override
    public CognitoGroupConfiguration clone() {
        try {
            return (CognitoGroupConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.CognitoGroupConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * Contains an updated configuration to replace the configuration in an existing identity source.
 * </p>
 * <note>
 * <p>
 * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
 * </p>
 * <p>
 * You must specify a <code>userPoolArn</code>, and optionally, a <code>ClientId</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains configuration details of a Amazon Cognito user pool.
     * </p>
     */
    private UpdateCognitoUserPoolConfiguration cognitoUserPoolConfiguration;

    /**
     * <p>
     * Contains configuration details of a Amazon Cognito user pool.
     * </p>
     * 
     * @param cognitoUserPoolConfiguration
     *        Contains configuration details of a Amazon Cognito user pool.
     */

    public void setCognitoUserPoolConfiguration(UpdateCognitoUserPoolConfiguration cognitoUserPoolConfiguration) {
        this.cognitoUserPoolConfiguration = cognitoUserPoolConfiguration;
    }

    /**
     * <p>
     * Contains configuration details of a Amazon Cognito user pool.
     * </p>
     * 
     * @return Contains configuration details of a Amazon Cognito user pool.
     */

    public UpdateCognitoUserPoolConfiguration getCognitoUserPoolConfiguration() {
        return this.cognitoUserPoolConfiguration;
    }

    /**
     * <p>
     * Contains configuration details of a Amazon Cognito user pool.
     * </p>
     * 
     * @param cognitoUserPoolConfiguration
     *        Contains configuration details of a Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguration withCognitoUserPoolConfiguration(UpdateCognitoUserPoolConfiguration cognitoUserPoolConfiguration) {
        setCognitoUserPoolConfiguration(cognitoUserPoolConfiguration);
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
        if (getCognitoUserPoolConfiguration() != null)
            sb.append("CognitoUserPoolConfiguration: ").append(getCognitoUserPoolConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfiguration == false)
            return false;
        UpdateConfiguration other = (UpdateConfiguration) obj;
        if (other.getCognitoUserPoolConfiguration() == null ^ this.getCognitoUserPoolConfiguration() == null)
            return false;
        if (other.getCognitoUserPoolConfiguration() != null && other.getCognitoUserPoolConfiguration().equals(this.getCognitoUserPoolConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCognitoUserPoolConfiguration() == null) ? 0 : getCognitoUserPoolConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfiguration clone() {
        try {
            return (UpdateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.UpdateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

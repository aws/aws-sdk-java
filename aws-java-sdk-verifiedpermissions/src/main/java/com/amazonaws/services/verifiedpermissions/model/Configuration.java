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
 * Contains configuration information used when creating a new identity source.
 * </p>
 * <note>
 * <p>
 * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
 * </p>
 * <p>
 * Specifies a <code>userPoolArn</code>, a <code>groupConfiguration</code>, and a <code>ClientId</code>.
 * </p>
 * </note>
 * <p>
 * This data type is used as a request parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreateIdentitySource.html"
 * >CreateIdentitySource</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/Configuration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains configuration details of a Amazon Cognito user pool that Verified Permissions can use as a source of
     * authenticated identities as entities. It specifies the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of a Amazon Cognito user pool and one or more application client IDs.
     * </p>
     * <p>
     * Example:
     * <code>"configuration":{"cognitoUserPoolConfiguration":{"userPoolArn":"arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5","clientIds": ["a1b2c3d4e5f6g7h8i9j0kalbmc"],"groupConfiguration": {"groupEntityType": "MyCorp::Group"}}}</code>
     * </p>
     */
    private CognitoUserPoolConfiguration cognitoUserPoolConfiguration;

    /**
     * <p>
     * Contains configuration details of a Amazon Cognito user pool that Verified Permissions can use as a source of
     * authenticated identities as entities. It specifies the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of a Amazon Cognito user pool and one or more application client IDs.
     * </p>
     * <p>
     * Example:
     * <code>"configuration":{"cognitoUserPoolConfiguration":{"userPoolArn":"arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5","clientIds": ["a1b2c3d4e5f6g7h8i9j0kalbmc"],"groupConfiguration": {"groupEntityType": "MyCorp::Group"}}}</code>
     * </p>
     * 
     * @param cognitoUserPoolConfiguration
     *        Contains configuration details of a Amazon Cognito user pool that Verified Permissions can use as a source
     *        of authenticated identities as entities. It specifies the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *        (ARN)</a> of a Amazon Cognito user pool and one or more application client IDs.</p>
     *        <p>
     *        Example:
     *        <code>"configuration":{"cognitoUserPoolConfiguration":{"userPoolArn":"arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5","clientIds": ["a1b2c3d4e5f6g7h8i9j0kalbmc"],"groupConfiguration": {"groupEntityType": "MyCorp::Group"}}}</code>
     */

    public void setCognitoUserPoolConfiguration(CognitoUserPoolConfiguration cognitoUserPoolConfiguration) {
        this.cognitoUserPoolConfiguration = cognitoUserPoolConfiguration;
    }

    /**
     * <p>
     * Contains configuration details of a Amazon Cognito user pool that Verified Permissions can use as a source of
     * authenticated identities as entities. It specifies the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of a Amazon Cognito user pool and one or more application client IDs.
     * </p>
     * <p>
     * Example:
     * <code>"configuration":{"cognitoUserPoolConfiguration":{"userPoolArn":"arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5","clientIds": ["a1b2c3d4e5f6g7h8i9j0kalbmc"],"groupConfiguration": {"groupEntityType": "MyCorp::Group"}}}</code>
     * </p>
     * 
     * @return Contains configuration details of a Amazon Cognito user pool that Verified Permissions can use as a
     *         source of authenticated identities as entities. It specifies the <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> of a Amazon Cognito user pool and one or more application client IDs.</p>
     *         <p>
     *         Example:
     *         <code>"configuration":{"cognitoUserPoolConfiguration":{"userPoolArn":"arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5","clientIds": ["a1b2c3d4e5f6g7h8i9j0kalbmc"],"groupConfiguration": {"groupEntityType": "MyCorp::Group"}}}</code>
     */

    public CognitoUserPoolConfiguration getCognitoUserPoolConfiguration() {
        return this.cognitoUserPoolConfiguration;
    }

    /**
     * <p>
     * Contains configuration details of a Amazon Cognito user pool that Verified Permissions can use as a source of
     * authenticated identities as entities. It specifies the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of a Amazon Cognito user pool and one or more application client IDs.
     * </p>
     * <p>
     * Example:
     * <code>"configuration":{"cognitoUserPoolConfiguration":{"userPoolArn":"arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5","clientIds": ["a1b2c3d4e5f6g7h8i9j0kalbmc"],"groupConfiguration": {"groupEntityType": "MyCorp::Group"}}}</code>
     * </p>
     * 
     * @param cognitoUserPoolConfiguration
     *        Contains configuration details of a Amazon Cognito user pool that Verified Permissions can use as a source
     *        of authenticated identities as entities. It specifies the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *        (ARN)</a> of a Amazon Cognito user pool and one or more application client IDs.</p>
     *        <p>
     *        Example:
     *        <code>"configuration":{"cognitoUserPoolConfiguration":{"userPoolArn":"arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5","clientIds": ["a1b2c3d4e5f6g7h8i9j0kalbmc"],"groupConfiguration": {"groupEntityType": "MyCorp::Group"}}}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withCognitoUserPoolConfiguration(CognitoUserPoolConfiguration cognitoUserPoolConfiguration) {
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

        if (obj instanceof Configuration == false)
            return false;
        Configuration other = (Configuration) obj;
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
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

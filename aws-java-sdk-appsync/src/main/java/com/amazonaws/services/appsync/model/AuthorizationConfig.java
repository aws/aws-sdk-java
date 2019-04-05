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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authorization config in case the HTTP endpoint requires authorization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AuthorizationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authorization type required by the HTTP endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AWS_IAM</b>: The authorization type is Sigv4.
     * </p>
     * </li>
     * </ul>
     */
    private String authorizationType;
    /**
     * <p>
     * The AWS IAM settings.
     * </p>
     */
    private AwsIamConfig awsIamConfig;

    /**
     * <p>
     * The authorization type required by the HTTP endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AWS_IAM</b>: The authorization type is Sigv4.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authorizationType
     *        The authorization type required by the HTTP endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AWS_IAM</b>: The authorization type is Sigv4.
     *        </p>
     *        </li>
     * @see AuthorizationType
     */

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * <p>
     * The authorization type required by the HTTP endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AWS_IAM</b>: The authorization type is Sigv4.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The authorization type required by the HTTP endpoint.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>AWS_IAM</b>: The authorization type is Sigv4.
     *         </p>
     *         </li>
     * @see AuthorizationType
     */

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * <p>
     * The authorization type required by the HTTP endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AWS_IAM</b>: The authorization type is Sigv4.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authorizationType
     *        The authorization type required by the HTTP endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AWS_IAM</b>: The authorization type is Sigv4.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationType
     */

    public AuthorizationConfig withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * <p>
     * The authorization type required by the HTTP endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AWS_IAM</b>: The authorization type is Sigv4.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authorizationType
     *        The authorization type required by the HTTP endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AWS_IAM</b>: The authorization type is Sigv4.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationType
     */

    public AuthorizationConfig withAuthorizationType(AuthorizationType authorizationType) {
        this.authorizationType = authorizationType.toString();
        return this;
    }

    /**
     * <p>
     * The AWS IAM settings.
     * </p>
     * 
     * @param awsIamConfig
     *        The AWS IAM settings.
     */

    public void setAwsIamConfig(AwsIamConfig awsIamConfig) {
        this.awsIamConfig = awsIamConfig;
    }

    /**
     * <p>
     * The AWS IAM settings.
     * </p>
     * 
     * @return The AWS IAM settings.
     */

    public AwsIamConfig getAwsIamConfig() {
        return this.awsIamConfig;
    }

    /**
     * <p>
     * The AWS IAM settings.
     * </p>
     * 
     * @param awsIamConfig
     *        The AWS IAM settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationConfig withAwsIamConfig(AwsIamConfig awsIamConfig) {
        setAwsIamConfig(awsIamConfig);
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
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: ").append(getAuthorizationType()).append(",");
        if (getAwsIamConfig() != null)
            sb.append("AwsIamConfig: ").append(getAwsIamConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizationConfig == false)
            return false;
        AuthorizationConfig other = (AuthorizationConfig) obj;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getAwsIamConfig() == null ^ this.getAwsIamConfig() == null)
            return false;
        if (other.getAwsIamConfig() != null && other.getAwsIamConfig().equals(this.getAwsIamConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getAwsIamConfig() == null) ? 0 : getAwsIamConfig().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizationConfig clone() {
        try {
            return (AuthorizationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.AuthorizationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

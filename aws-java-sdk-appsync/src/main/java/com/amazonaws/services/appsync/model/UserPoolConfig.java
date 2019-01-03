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
 * Describes an Amazon Cognito user pool configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UserPoolConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPoolConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The AWS Region in which the user pool was created.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool
     * authentication doesn't match the Amazon Cognito user pool configuration.
     * </p>
     */
    private String defaultAction;
    /**
     * <p>
     * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
     * </p>
     */
    private String appIdClientRegex;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolConfig withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The AWS Region in which the user pool was created.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region in which the user pool was created.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The AWS Region in which the user pool was created.
     * </p>
     * 
     * @return The AWS Region in which the user pool was created.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The AWS Region in which the user pool was created.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region in which the user pool was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolConfig withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool
     * authentication doesn't match the Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param defaultAction
     *        The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool
     *        authentication doesn't match the Amazon Cognito user pool configuration.
     * @see DefaultAction
     */

    public void setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool
     * authentication doesn't match the Amazon Cognito user pool configuration.
     * </p>
     * 
     * @return The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool
     *         authentication doesn't match the Amazon Cognito user pool configuration.
     * @see DefaultAction
     */

    public String getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool
     * authentication doesn't match the Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param defaultAction
     *        The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool
     *        authentication doesn't match the Amazon Cognito user pool configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultAction
     */

    public UserPoolConfig withDefaultAction(String defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool
     * authentication doesn't match the Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param defaultAction
     *        The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool
     *        authentication doesn't match the Amazon Cognito user pool configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultAction
     */

    public UserPoolConfig withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction.toString();
        return this;
    }

    /**
     * <p>
     * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
     * </p>
     * 
     * @param appIdClientRegex
     *        A regular expression for validating the incoming Amazon Cognito user pool app client ID.
     */

    public void setAppIdClientRegex(String appIdClientRegex) {
        this.appIdClientRegex = appIdClientRegex;
    }

    /**
     * <p>
     * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
     * </p>
     * 
     * @return A regular expression for validating the incoming Amazon Cognito user pool app client ID.
     */

    public String getAppIdClientRegex() {
        return this.appIdClientRegex;
    }

    /**
     * <p>
     * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
     * </p>
     * 
     * @param appIdClientRegex
     *        A regular expression for validating the incoming Amazon Cognito user pool app client ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolConfig withAppIdClientRegex(String appIdClientRegex) {
        setAppIdClientRegex(appIdClientRegex);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getAppIdClientRegex() != null)
            sb.append("AppIdClientRegex: ").append(getAppIdClientRegex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolConfig == false)
            return false;
        UserPoolConfig other = (UserPoolConfig) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getAppIdClientRegex() == null ^ this.getAppIdClientRegex() == null)
            return false;
        if (other.getAppIdClientRegex() != null && other.getAppIdClientRegex().equals(this.getAppIdClientRegex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getAppIdClientRegex() == null) ? 0 : getAppIdClientRegex().hashCode());
        return hashCode;
    }

    @Override
    public UserPoolConfig clone() {
        try {
            return (UserPoolConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.UserPoolConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the authorization configuration for using Amazon Cognito user pools with your AppSync GraphQL API endpoint.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAppSyncGraphQlApiUserPoolConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAppSyncGraphQlApiUserPoolConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A regular expression for validating the incoming Amazon Cognito user pools app client ID. If this value isn't
     * set, no filtering is applied.
     * </p>
     */
    private String appIdClientRegex;
    /**
     * <p>
     * The Amazon Web Services Region in which the user pool was created.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pools
     * authentication doesn't match the Amazon Cognito user pools configuration.
     * </p>
     */
    private String defaultAction;
    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;

    /**
     * <p>
     * A regular expression for validating the incoming Amazon Cognito user pools app client ID. If this value isn't
     * set, no filtering is applied.
     * </p>
     * 
     * @param appIdClientRegex
     *        A regular expression for validating the incoming Amazon Cognito user pools app client ID. If this value
     *        isn't set, no filtering is applied.
     */

    public void setAppIdClientRegex(String appIdClientRegex) {
        this.appIdClientRegex = appIdClientRegex;
    }

    /**
     * <p>
     * A regular expression for validating the incoming Amazon Cognito user pools app client ID. If this value isn't
     * set, no filtering is applied.
     * </p>
     * 
     * @return A regular expression for validating the incoming Amazon Cognito user pools app client ID. If this value
     *         isn't set, no filtering is applied.
     */

    public String getAppIdClientRegex() {
        return this.appIdClientRegex;
    }

    /**
     * <p>
     * A regular expression for validating the incoming Amazon Cognito user pools app client ID. If this value isn't
     * set, no filtering is applied.
     * </p>
     * 
     * @param appIdClientRegex
     *        A regular expression for validating the incoming Amazon Cognito user pools app client ID. If this value
     *        isn't set, no filtering is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiUserPoolConfigDetails withAppIdClientRegex(String appIdClientRegex) {
        setAppIdClientRegex(appIdClientRegex);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the user pool was created.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services Region in which the user pool was created.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the user pool was created.
     * </p>
     * 
     * @return The Amazon Web Services Region in which the user pool was created.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the user pool was created.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services Region in which the user pool was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiUserPoolConfigDetails withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pools
     * authentication doesn't match the Amazon Cognito user pools configuration.
     * </p>
     * 
     * @param defaultAction
     *        The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pools
     *        authentication doesn't match the Amazon Cognito user pools configuration.
     */

    public void setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pools
     * authentication doesn't match the Amazon Cognito user pools configuration.
     * </p>
     * 
     * @return The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pools
     *         authentication doesn't match the Amazon Cognito user pools configuration.
     */

    public String getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pools
     * authentication doesn't match the Amazon Cognito user pools configuration.
     * </p>
     * 
     * @param defaultAction
     *        The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pools
     *        authentication doesn't match the Amazon Cognito user pools configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiUserPoolConfigDetails withDefaultAction(String defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

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

    public AwsAppSyncGraphQlApiUserPoolConfigDetails withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
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
        if (getAppIdClientRegex() != null)
            sb.append("AppIdClientRegex: ").append(getAppIdClientRegex()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAppSyncGraphQlApiUserPoolConfigDetails == false)
            return false;
        AwsAppSyncGraphQlApiUserPoolConfigDetails other = (AwsAppSyncGraphQlApiUserPoolConfigDetails) obj;
        if (other.getAppIdClientRegex() == null ^ this.getAppIdClientRegex() == null)
            return false;
        if (other.getAppIdClientRegex() != null && other.getAppIdClientRegex().equals(this.getAppIdClientRegex()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppIdClientRegex() == null) ? 0 : getAppIdClientRegex().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        return hashCode;
    }

    @Override
    public AwsAppSyncGraphQlApiUserPoolConfigDetails clone() {
        try {
            return (AwsAppSyncGraphQlApiUserPoolConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAppSyncGraphQlApiUserPoolConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

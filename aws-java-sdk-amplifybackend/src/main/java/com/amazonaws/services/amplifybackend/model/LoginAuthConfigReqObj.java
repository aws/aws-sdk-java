/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The request object for this operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/LoginAuthConfigReqObj"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoginAuthConfigReqObj implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Cognito identity pool ID used for the Amplify Admin UI login authorization.
     * </p>
     */
    private String awsCognitoIdentityPoolId;
    /**
     * <p>
     * The AWS Region for the Amplify Admin UI login.
     * </p>
     */
    private String awsCognitoRegion;
    /**
     * <p>
     * The Amazon Cognito user pool ID used for Amplify Admin UI login authentication.
     * </p>
     */
    private String awsUserPoolsId;
    /**
     * <p>
     * The web client ID for the Amazon Cognito user pools.
     * </p>
     */
    private String awsUserPoolsWebClientId;

    /**
     * <p>
     * The Amazon Cognito identity pool ID used for the Amplify Admin UI login authorization.
     * </p>
     * 
     * @param awsCognitoIdentityPoolId
     *        The Amazon Cognito identity pool ID used for the Amplify Admin UI login authorization.
     */

    public void setAwsCognitoIdentityPoolId(String awsCognitoIdentityPoolId) {
        this.awsCognitoIdentityPoolId = awsCognitoIdentityPoolId;
    }

    /**
     * <p>
     * The Amazon Cognito identity pool ID used for the Amplify Admin UI login authorization.
     * </p>
     * 
     * @return The Amazon Cognito identity pool ID used for the Amplify Admin UI login authorization.
     */

    public String getAwsCognitoIdentityPoolId() {
        return this.awsCognitoIdentityPoolId;
    }

    /**
     * <p>
     * The Amazon Cognito identity pool ID used for the Amplify Admin UI login authorization.
     * </p>
     * 
     * @param awsCognitoIdentityPoolId
     *        The Amazon Cognito identity pool ID used for the Amplify Admin UI login authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginAuthConfigReqObj withAwsCognitoIdentityPoolId(String awsCognitoIdentityPoolId) {
        setAwsCognitoIdentityPoolId(awsCognitoIdentityPoolId);
        return this;
    }

    /**
     * <p>
     * The AWS Region for the Amplify Admin UI login.
     * </p>
     * 
     * @param awsCognitoRegion
     *        The AWS Region for the Amplify Admin UI login.
     */

    public void setAwsCognitoRegion(String awsCognitoRegion) {
        this.awsCognitoRegion = awsCognitoRegion;
    }

    /**
     * <p>
     * The AWS Region for the Amplify Admin UI login.
     * </p>
     * 
     * @return The AWS Region for the Amplify Admin UI login.
     */

    public String getAwsCognitoRegion() {
        return this.awsCognitoRegion;
    }

    /**
     * <p>
     * The AWS Region for the Amplify Admin UI login.
     * </p>
     * 
     * @param awsCognitoRegion
     *        The AWS Region for the Amplify Admin UI login.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginAuthConfigReqObj withAwsCognitoRegion(String awsCognitoRegion) {
        setAwsCognitoRegion(awsCognitoRegion);
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user pool ID used for Amplify Admin UI login authentication.
     * </p>
     * 
     * @param awsUserPoolsId
     *        The Amazon Cognito user pool ID used for Amplify Admin UI login authentication.
     */

    public void setAwsUserPoolsId(String awsUserPoolsId) {
        this.awsUserPoolsId = awsUserPoolsId;
    }

    /**
     * <p>
     * The Amazon Cognito user pool ID used for Amplify Admin UI login authentication.
     * </p>
     * 
     * @return The Amazon Cognito user pool ID used for Amplify Admin UI login authentication.
     */

    public String getAwsUserPoolsId() {
        return this.awsUserPoolsId;
    }

    /**
     * <p>
     * The Amazon Cognito user pool ID used for Amplify Admin UI login authentication.
     * </p>
     * 
     * @param awsUserPoolsId
     *        The Amazon Cognito user pool ID used for Amplify Admin UI login authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginAuthConfigReqObj withAwsUserPoolsId(String awsUserPoolsId) {
        setAwsUserPoolsId(awsUserPoolsId);
        return this;
    }

    /**
     * <p>
     * The web client ID for the Amazon Cognito user pools.
     * </p>
     * 
     * @param awsUserPoolsWebClientId
     *        The web client ID for the Amazon Cognito user pools.
     */

    public void setAwsUserPoolsWebClientId(String awsUserPoolsWebClientId) {
        this.awsUserPoolsWebClientId = awsUserPoolsWebClientId;
    }

    /**
     * <p>
     * The web client ID for the Amazon Cognito user pools.
     * </p>
     * 
     * @return The web client ID for the Amazon Cognito user pools.
     */

    public String getAwsUserPoolsWebClientId() {
        return this.awsUserPoolsWebClientId;
    }

    /**
     * <p>
     * The web client ID for the Amazon Cognito user pools.
     * </p>
     * 
     * @param awsUserPoolsWebClientId
     *        The web client ID for the Amazon Cognito user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginAuthConfigReqObj withAwsUserPoolsWebClientId(String awsUserPoolsWebClientId) {
        setAwsUserPoolsWebClientId(awsUserPoolsWebClientId);
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
        if (getAwsCognitoIdentityPoolId() != null)
            sb.append("AwsCognitoIdentityPoolId: ").append(getAwsCognitoIdentityPoolId()).append(",");
        if (getAwsCognitoRegion() != null)
            sb.append("AwsCognitoRegion: ").append(getAwsCognitoRegion()).append(",");
        if (getAwsUserPoolsId() != null)
            sb.append("AwsUserPoolsId: ").append(getAwsUserPoolsId()).append(",");
        if (getAwsUserPoolsWebClientId() != null)
            sb.append("AwsUserPoolsWebClientId: ").append(getAwsUserPoolsWebClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoginAuthConfigReqObj == false)
            return false;
        LoginAuthConfigReqObj other = (LoginAuthConfigReqObj) obj;
        if (other.getAwsCognitoIdentityPoolId() == null ^ this.getAwsCognitoIdentityPoolId() == null)
            return false;
        if (other.getAwsCognitoIdentityPoolId() != null && other.getAwsCognitoIdentityPoolId().equals(this.getAwsCognitoIdentityPoolId()) == false)
            return false;
        if (other.getAwsCognitoRegion() == null ^ this.getAwsCognitoRegion() == null)
            return false;
        if (other.getAwsCognitoRegion() != null && other.getAwsCognitoRegion().equals(this.getAwsCognitoRegion()) == false)
            return false;
        if (other.getAwsUserPoolsId() == null ^ this.getAwsUserPoolsId() == null)
            return false;
        if (other.getAwsUserPoolsId() != null && other.getAwsUserPoolsId().equals(this.getAwsUserPoolsId()) == false)
            return false;
        if (other.getAwsUserPoolsWebClientId() == null ^ this.getAwsUserPoolsWebClientId() == null)
            return false;
        if (other.getAwsUserPoolsWebClientId() != null && other.getAwsUserPoolsWebClientId().equals(this.getAwsUserPoolsWebClientId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsCognitoIdentityPoolId() == null) ? 0 : getAwsCognitoIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getAwsCognitoRegion() == null) ? 0 : getAwsCognitoRegion().hashCode());
        hashCode = prime * hashCode + ((getAwsUserPoolsId() == null) ? 0 : getAwsUserPoolsId().hashCode());
        hashCode = prime * hashCode + ((getAwsUserPoolsWebClientId() == null) ? 0 : getAwsUserPoolsWebClientId().hashCode());
        return hashCode;
    }

    @Override
    public LoginAuthConfigReqObj clone() {
        try {
            return (LoginAuthConfigReqObj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.LoginAuthConfigReqObjMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

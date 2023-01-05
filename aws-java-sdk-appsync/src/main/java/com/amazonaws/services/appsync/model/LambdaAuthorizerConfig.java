/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A <code>LambdaAuthorizerConfig</code> specifies how to authorize AppSync API access when using the
 * <code>AWS_LAMBDA</code> authorizer mode. Be aware that an AppSync API can have only one Lambda authorizer configured
 * at a time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/LambdaAuthorizerConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaAuthorizerConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda
     * function can override this by returning a <code>ttlOverride</code> key in its response. A value of 0 disables
     * caching of responses.
     * </p>
     */
    private Integer authorizerResultTtlInSeconds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function to be called for authorization. This can be a standard
     * Lambda ARN, a version ARN (<code>.../v3</code>), or an alias ARN.
     * </p>
     * <p>
     * <b>Note</b>: This Lambda function must have the following resource-based policy assigned to it. When configuring
     * Lambda authorizers in the console, this is done for you. To use the Command Line Interface (CLI), run the
     * following:
     * </p>
     * <p>
     * <code>aws lambda add-permission --function-name "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction</code>
     * </p>
     */
    private String authorizerUri;
    /**
     * <p>
     * A regular expression for validation of tokens before the Lambda function is called.
     * </p>
     */
    private String identityValidationExpression;

    /**
     * <p>
     * The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda
     * function can override this by returning a <code>ttlOverride</code> key in its response. A value of 0 disables
     * caching of responses.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda
     *        function can override this by returning a <code>ttlOverride</code> key in its response. A value of 0
     *        disables caching of responses.
     */

    public void setAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda
     * function can override this by returning a <code>ttlOverride</code> key in its response. A value of 0 disables
     * caching of responses.
     * </p>
     * 
     * @return The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda
     *         function can override this by returning a <code>ttlOverride</code> key in its response. A value of 0
     *         disables caching of responses.
     */

    public Integer getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda
     * function can override this by returning a <code>ttlOverride</code> key in its response. A value of 0 disables
     * caching of responses.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda
     *        function can override this by returning a <code>ttlOverride</code> key in its response. A value of 0
     *        disables caching of responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaAuthorizerConfig withAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        setAuthorizerResultTtlInSeconds(authorizerResultTtlInSeconds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function to be called for authorization. This can be a standard
     * Lambda ARN, a version ARN (<code>.../v3</code>), or an alias ARN.
     * </p>
     * <p>
     * <b>Note</b>: This Lambda function must have the following resource-based policy assigned to it. When configuring
     * Lambda authorizers in the console, this is done for you. To use the Command Line Interface (CLI), run the
     * following:
     * </p>
     * <p>
     * <code>aws lambda add-permission --function-name "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction</code>
     * </p>
     * 
     * @param authorizerUri
     *        The Amazon Resource Name (ARN) of the Lambda function to be called for authorization. This can be a
     *        standard Lambda ARN, a version ARN (<code>.../v3</code>), or an alias ARN. </p>
     *        <p>
     *        <b>Note</b>: This Lambda function must have the following resource-based policy assigned to it. When
     *        configuring Lambda authorizers in the console, this is done for you. To use the Command Line Interface
     *        (CLI), run the following:
     *        </p>
     *        <p>
     *        <code>aws lambda add-permission --function-name "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction</code>
     */

    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function to be called for authorization. This can be a standard
     * Lambda ARN, a version ARN (<code>.../v3</code>), or an alias ARN.
     * </p>
     * <p>
     * <b>Note</b>: This Lambda function must have the following resource-based policy assigned to it. When configuring
     * Lambda authorizers in the console, this is done for you. To use the Command Line Interface (CLI), run the
     * following:
     * </p>
     * <p>
     * <code>aws lambda add-permission --function-name "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function to be called for authorization. This can be a
     *         standard Lambda ARN, a version ARN (<code>.../v3</code>), or an alias ARN. </p>
     *         <p>
     *         <b>Note</b>: This Lambda function must have the following resource-based policy assigned to it. When
     *         configuring Lambda authorizers in the console, this is done for you. To use the Command Line Interface
     *         (CLI), run the following:
     *         </p>
     *         <p>
     *         <code>aws lambda add-permission --function-name "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction</code>
     */

    public String getAuthorizerUri() {
        return this.authorizerUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function to be called for authorization. This can be a standard
     * Lambda ARN, a version ARN (<code>.../v3</code>), or an alias ARN.
     * </p>
     * <p>
     * <b>Note</b>: This Lambda function must have the following resource-based policy assigned to it. When configuring
     * Lambda authorizers in the console, this is done for you. To use the Command Line Interface (CLI), run the
     * following:
     * </p>
     * <p>
     * <code>aws lambda add-permission --function-name "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction</code>
     * </p>
     * 
     * @param authorizerUri
     *        The Amazon Resource Name (ARN) of the Lambda function to be called for authorization. This can be a
     *        standard Lambda ARN, a version ARN (<code>.../v3</code>), or an alias ARN. </p>
     *        <p>
     *        <b>Note</b>: This Lambda function must have the following resource-based policy assigned to it. When
     *        configuring Lambda authorizers in the console, this is done for you. To use the Command Line Interface
     *        (CLI), run the following:
     *        </p>
     *        <p>
     *        <code>aws lambda add-permission --function-name "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaAuthorizerConfig withAuthorizerUri(String authorizerUri) {
        setAuthorizerUri(authorizerUri);
        return this;
    }

    /**
     * <p>
     * A regular expression for validation of tokens before the Lambda function is called.
     * </p>
     * 
     * @param identityValidationExpression
     *        A regular expression for validation of tokens before the Lambda function is called.
     */

    public void setIdentityValidationExpression(String identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
    }

    /**
     * <p>
     * A regular expression for validation of tokens before the Lambda function is called.
     * </p>
     * 
     * @return A regular expression for validation of tokens before the Lambda function is called.
     */

    public String getIdentityValidationExpression() {
        return this.identityValidationExpression;
    }

    /**
     * <p>
     * A regular expression for validation of tokens before the Lambda function is called.
     * </p>
     * 
     * @param identityValidationExpression
     *        A regular expression for validation of tokens before the Lambda function is called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaAuthorizerConfig withIdentityValidationExpression(String identityValidationExpression) {
        setIdentityValidationExpression(identityValidationExpression);
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
        if (getAuthorizerResultTtlInSeconds() != null)
            sb.append("AuthorizerResultTtlInSeconds: ").append(getAuthorizerResultTtlInSeconds()).append(",");
        if (getAuthorizerUri() != null)
            sb.append("AuthorizerUri: ").append(getAuthorizerUri()).append(",");
        if (getIdentityValidationExpression() != null)
            sb.append("IdentityValidationExpression: ").append(getIdentityValidationExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaAuthorizerConfig == false)
            return false;
        LambdaAuthorizerConfig other = (LambdaAuthorizerConfig) obj;
        if (other.getAuthorizerResultTtlInSeconds() == null ^ this.getAuthorizerResultTtlInSeconds() == null)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() != null && other.getAuthorizerResultTtlInSeconds().equals(this.getAuthorizerResultTtlInSeconds()) == false)
            return false;
        if (other.getAuthorizerUri() == null ^ this.getAuthorizerUri() == null)
            return false;
        if (other.getAuthorizerUri() != null && other.getAuthorizerUri().equals(this.getAuthorizerUri()) == false)
            return false;
        if (other.getIdentityValidationExpression() == null ^ this.getIdentityValidationExpression() == null)
            return false;
        if (other.getIdentityValidationExpression() != null && other.getIdentityValidationExpression().equals(this.getIdentityValidationExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizerResultTtlInSeconds() == null) ? 0 : getAuthorizerResultTtlInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerUri() == null) ? 0 : getAuthorizerUri().hashCode());
        hashCode = prime * hashCode + ((getIdentityValidationExpression() == null) ? 0 : getIdentityValidationExpression().hashCode());
        return hashCode;
    }

    @Override
    public LambdaAuthorizerConfig clone() {
        try {
            return (LambdaAuthorizerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.LambdaAuthorizerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

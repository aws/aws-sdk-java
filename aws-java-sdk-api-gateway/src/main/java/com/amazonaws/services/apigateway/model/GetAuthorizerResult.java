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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents an authorization layer for methods. If enabled on a method, API Gateway will activate the authorizer when
 * a client calls the method.
 * </p>
 * <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/use-custom-authorizer.html">Enable custom
 * authorization</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAuthorizerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token
     * submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and
     * <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each element is
     * of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>. For a
     * <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
     * </p>
     */
    private java.util.List<String> providerARNs;
    /**
     * <p>
     * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * Specifies the authorizer's Uniform Resource Identifier (URI). For <code>TOKEN</code> or <code>REQUEST</code>
     * authorizers, this must be a well-formed Lambda function URI, for example,
     * <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     * . In general, the URI has this form <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>, where
     * <code>{region}</code> is the same as the region hosting the Lambda function, <code>path</code> indicates that the
     * remaining substring in the URI should be treated as the path to the resource, including the initial
     * <code>/</code>. For Lambda functions, this is usually of the form
     * <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     * </p>
     */
    private String authorizerUri;
    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null.
     * </p>
     */
    private String authorizerCredentials;
    /**
     * <p>
     * The identity source for which authorization is requested.
     * <ul>
     * <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code> authorizer, this is required and specifies the
     * request header mapping expression for the custom header holding the authorization token submitted by the client.
     * For example, if the token header name is <code>Auth</code>, the header mapping expression is
     * <code>method.request.header.Auth</code>.</li>
     * <li>For the <code>REQUEST</code> authorizer, this is required when authorization caching is enabled. The value is
     * a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if
     * an <code>Auth</code> header, a <code>Name</code> query string parameter are defined as identity sources, this
     * value is <code>method.request.header.Auth, method.request.querystring.Name</code>. These parameters will be used
     * to derive the authorization caching key and to perform runtime validation of the <code>REQUEST</code> authorizer
     * by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this
     * is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     * response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions
     * of the specified request parameters. When the authorization caching is not enabled, this property is optional.</li>
     * </ul>
     * </p>
     */
    private String identitySource;
    /**
     * <p>
     * A validation expression for the incoming identity token. For <code>TOKEN</code> authorizers, this value is a
     * regular expression. API Gateway will match the <code>aud</code> field of the incoming token from the client
     * against the specified regular expression. It will invoke the authorizer's Lambda function when there is a match.
     * Otherwise, it will return a 401 Unauthorized response without calling the Lambda function. The validation
     * expression does not apply to the <code>REQUEST</code> authorizer.
     * </p>
     */
    private String identityValidationExpression;
    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it is
     * greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300.
     * The maximum value is 3600, or 1 hour.
     * </p>
     */
    private Integer authorizerResultTtlInSeconds;

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     * 
     * @param id
     *        The identifier for the authorizer resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     * 
     * @return The identifier for the authorizer resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     * 
     * @param id
     *        The identifier for the authorizer resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * 
     * @param name
     *        [Required] The name of the authorizer.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * 
     * @return [Required] The name of the authorizer.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * 
     * @param name
     *        [Required] The name of the authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token
     * submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and
     * <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * </p>
     * 
     * @param type
     *        The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single
     *        authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using
     *        incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * @see AuthorizerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token
     * submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and
     * <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * </p>
     * 
     * @return The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single
     *         authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using
     *         incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * @see AuthorizerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token
     * submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and
     * <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * </p>
     * 
     * @param type
     *        The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single
     *        authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using
     *        incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerType
     */

    public GetAuthorizerResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token
     * submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and
     * <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * </p>
     * 
     * @param type
     *        The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single
     *        authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using
     *        incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * @see AuthorizerType
     */

    public void setType(AuthorizerType type) {
        withType(type);
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token
     * submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and
     * <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * </p>
     * 
     * @param type
     *        The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single
     *        authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using
     *        incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerType
     */

    public GetAuthorizerResult withType(AuthorizerType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each element is
     * of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>. For a
     * <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
     * </p>
     * 
     * @return A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each
     *         element is of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     *         . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
     */

    public java.util.List<String> getProviderARNs() {
        return providerARNs;
    }

    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each element is
     * of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>. For a
     * <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
     * </p>
     * 
     * @param providerARNs
     *        A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each
     *        element is of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>.
     *        For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
     */

    public void setProviderARNs(java.util.Collection<String> providerARNs) {
        if (providerARNs == null) {
            this.providerARNs = null;
            return;
        }

        this.providerARNs = new java.util.ArrayList<String>(providerARNs);
    }

    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each element is
     * of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>. For a
     * <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProviderARNs(java.util.Collection)} or {@link #withProviderARNs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param providerARNs
     *        A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each
     *        element is of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>.
     *        For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withProviderARNs(String... providerARNs) {
        if (this.providerARNs == null) {
            setProviderARNs(new java.util.ArrayList<String>(providerARNs.length));
        }
        for (String ele : providerARNs) {
            this.providerARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each element is
     * of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>. For a
     * <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
     * </p>
     * 
     * @param providerARNs
     *        A list of the Amazon Cognito user pool ARNs for the <code>COGNITO_USER_POOLS</code> authorizer. Each
     *        element is of this format: <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>.
     *        For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is not defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withProviderARNs(java.util.Collection<String> providerARNs) {
        setProviderARNs(providerARNs);
        return this;
    }

    /**
     * <p>
     * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
     * </p>
     * 
     * @param authType
     *        Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
     * </p>
     * 
     * @return Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
     * </p>
     * 
     * @param authType
     *        Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * Specifies the authorizer's Uniform Resource Identifier (URI). For <code>TOKEN</code> or <code>REQUEST</code>
     * authorizers, this must be a well-formed Lambda function URI, for example,
     * <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     * . In general, the URI has this form <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>, where
     * <code>{region}</code> is the same as the region hosting the Lambda function, <code>path</code> indicates that the
     * remaining substring in the URI should be treated as the path to the resource, including the initial
     * <code>/</code>. For Lambda functions, this is usually of the form
     * <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     * </p>
     * 
     * @param authorizerUri
     *        Specifies the authorizer's Uniform Resource Identifier (URI). For <code>TOKEN</code> or
     *        <code>REQUEST</code> authorizers, this must be a well-formed Lambda function URI, for example,
     *        <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     *        . In general, the URI has this form <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>,
     *        where <code>{region}</code> is the same as the region hosting the Lambda function, <code>path</code>
     *        indicates that the remaining substring in the URI should be treated as the path to the resource, including
     *        the initial <code>/</code>. For Lambda functions, this is usually of the form
     *        <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     */

    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    /**
     * <p>
     * Specifies the authorizer's Uniform Resource Identifier (URI). For <code>TOKEN</code> or <code>REQUEST</code>
     * authorizers, this must be a well-formed Lambda function URI, for example,
     * <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     * . In general, the URI has this form <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>, where
     * <code>{region}</code> is the same as the region hosting the Lambda function, <code>path</code> indicates that the
     * remaining substring in the URI should be treated as the path to the resource, including the initial
     * <code>/</code>. For Lambda functions, this is usually of the form
     * <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     * </p>
     * 
     * @return Specifies the authorizer's Uniform Resource Identifier (URI). For <code>TOKEN</code> or
     *         <code>REQUEST</code> authorizers, this must be a well-formed Lambda function URI, for example,
     *         <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     *         . In general, the URI has this form <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>,
     *         where <code>{region}</code> is the same as the region hosting the Lambda function, <code>path</code>
     *         indicates that the remaining substring in the URI should be treated as the path to the resource,
     *         including the initial <code>/</code>. For Lambda functions, this is usually of the form
     *         <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     */

    public String getAuthorizerUri() {
        return this.authorizerUri;
    }

    /**
     * <p>
     * Specifies the authorizer's Uniform Resource Identifier (URI). For <code>TOKEN</code> or <code>REQUEST</code>
     * authorizers, this must be a well-formed Lambda function URI, for example,
     * <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     * . In general, the URI has this form <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>, where
     * <code>{region}</code> is the same as the region hosting the Lambda function, <code>path</code> indicates that the
     * remaining substring in the URI should be treated as the path to the resource, including the initial
     * <code>/</code>. For Lambda functions, this is usually of the form
     * <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     * </p>
     * 
     * @param authorizerUri
     *        Specifies the authorizer's Uniform Resource Identifier (URI). For <code>TOKEN</code> or
     *        <code>REQUEST</code> authorizers, this must be a well-formed Lambda function URI, for example,
     *        <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     *        . In general, the URI has this form <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>,
     *        where <code>{region}</code> is the same as the region hosting the Lambda function, <code>path</code>
     *        indicates that the remaining substring in the URI should be treated as the path to the resource, including
     *        the initial <code>/</code>. For Lambda functions, this is usually of the form
     *        <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withAuthorizerUri(String authorizerUri) {
        setAuthorizerUri(authorizerUri);
        return this;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null.
     * </p>
     * 
     * @param authorizerCredentials
     *        Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an
     *        IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based
     *        permissions on the Lambda function, specify null.
     */

    public void setAuthorizerCredentials(String authorizerCredentials) {
        this.authorizerCredentials = authorizerCredentials;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null.
     * </p>
     * 
     * @return Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an
     *         IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based
     *         permissions on the Lambda function, specify null.
     */

    public String getAuthorizerCredentials() {
        return this.authorizerCredentials;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null.
     * </p>
     * 
     * @param authorizerCredentials
     *        Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an
     *        IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based
     *        permissions on the Lambda function, specify null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withAuthorizerCredentials(String authorizerCredentials) {
        setAuthorizerCredentials(authorizerCredentials);
        return this;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * <ul>
     * <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code> authorizer, this is required and specifies the
     * request header mapping expression for the custom header holding the authorization token submitted by the client.
     * For example, if the token header name is <code>Auth</code>, the header mapping expression is
     * <code>method.request.header.Auth</code>.</li>
     * <li>For the <code>REQUEST</code> authorizer, this is required when authorization caching is enabled. The value is
     * a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if
     * an <code>Auth</code> header, a <code>Name</code> query string parameter are defined as identity sources, this
     * value is <code>method.request.header.Auth, method.request.querystring.Name</code>. These parameters will be used
     * to derive the authorization caching key and to perform runtime validation of the <code>REQUEST</code> authorizer
     * by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this
     * is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     * response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions
     * of the specified request parameters. When the authorization caching is not enabled, this property is optional.</li>
     * </ul>
     * </p>
     * 
     * @param identitySource
     *        The identity source for which authorization is requested.
     *        <ul>
     *        <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code> authorizer, this is required and specifies
     *        the request header mapping expression for the custom header holding the authorization token submitted by
     *        the client. For example, if the token header name is <code>Auth</code>, the header mapping expression is
     *        <code>method.request.header.Auth</code>.</li>
     *        <li>For the <code>REQUEST</code> authorizer, this is required when authorization caching is enabled. The
     *        value is a comma-separated string of one or more mapping expressions of the specified request parameters.
     *        For example, if an <code>Auth</code> header, a <code>Name</code> query string parameter are defined as
     *        identity sources, this value is <code>method.request.header.Auth, method.request.querystring.Name</code>.
     *        These parameters will be used to derive the authorization caching key and to perform runtime validation of
     *        the <code>REQUEST</code> authorizer by verifying all of the identity-related request parameters are
     *        present, not null and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda
     *        function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid
     *        value is a string of comma-separated mapping expressions of the specified request parameters. When the
     *        authorization caching is not enabled, this property is optional.</li>
     *        </ul>
     */

    public void setIdentitySource(String identitySource) {
        this.identitySource = identitySource;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * <ul>
     * <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code> authorizer, this is required and specifies the
     * request header mapping expression for the custom header holding the authorization token submitted by the client.
     * For example, if the token header name is <code>Auth</code>, the header mapping expression is
     * <code>method.request.header.Auth</code>.</li>
     * <li>For the <code>REQUEST</code> authorizer, this is required when authorization caching is enabled. The value is
     * a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if
     * an <code>Auth</code> header, a <code>Name</code> query string parameter are defined as identity sources, this
     * value is <code>method.request.header.Auth, method.request.querystring.Name</code>. These parameters will be used
     * to derive the authorization caching key and to perform runtime validation of the <code>REQUEST</code> authorizer
     * by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this
     * is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     * response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions
     * of the specified request parameters. When the authorization caching is not enabled, this property is optional.</li>
     * </ul>
     * </p>
     * 
     * @return The identity source for which authorization is requested.
     *         <ul>
     *         <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code> authorizer, this is required and
     *         specifies the request header mapping expression for the custom header holding the authorization token
     *         submitted by the client. For example, if the token header name is <code>Auth</code>, the header mapping
     *         expression is <code>method.request.header.Auth</code>.</li>
     *         <li>For the <code>REQUEST</code> authorizer, this is required when authorization caching is enabled. The
     *         value is a comma-separated string of one or more mapping expressions of the specified request parameters.
     *         For example, if an <code>Auth</code> header, a <code>Name</code> query string parameter are defined as
     *         identity sources, this value is <code>method.request.header.Auth, method.request.querystring.Name</code>.
     *         These parameters will be used to derive the authorization caching key and to perform runtime validation
     *         of the <code>REQUEST</code> authorizer by verifying all of the identity-related request parameters are
     *         present, not null and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda
     *         function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The
     *         valid value is a string of comma-separated mapping expressions of the specified request parameters. When
     *         the authorization caching is not enabled, this property is optional.</li>
     *         </ul>
     */

    public String getIdentitySource() {
        return this.identitySource;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * <ul>
     * <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code> authorizer, this is required and specifies the
     * request header mapping expression for the custom header holding the authorization token submitted by the client.
     * For example, if the token header name is <code>Auth</code>, the header mapping expression is
     * <code>method.request.header.Auth</code>.</li>
     * <li>For the <code>REQUEST</code> authorizer, this is required when authorization caching is enabled. The value is
     * a comma-separated string of one or more mapping expressions of the specified request parameters. For example, if
     * an <code>Auth</code> header, a <code>Name</code> query string parameter are defined as identity sources, this
     * value is <code>method.request.header.Auth, method.request.querystring.Name</code>. These parameters will be used
     * to derive the authorization caching key and to perform runtime validation of the <code>REQUEST</code> authorizer
     * by verifying all of the identity-related request parameters are present, not null and non-empty. Only when this
     * is true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     * response without calling the Lambda function. The valid value is a string of comma-separated mapping expressions
     * of the specified request parameters. When the authorization caching is not enabled, this property is optional.</li>
     * </ul>
     * </p>
     * 
     * @param identitySource
     *        The identity source for which authorization is requested.
     *        <ul>
     *        <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code> authorizer, this is required and specifies
     *        the request header mapping expression for the custom header holding the authorization token submitted by
     *        the client. For example, if the token header name is <code>Auth</code>, the header mapping expression is
     *        <code>method.request.header.Auth</code>.</li>
     *        <li>For the <code>REQUEST</code> authorizer, this is required when authorization caching is enabled. The
     *        value is a comma-separated string of one or more mapping expressions of the specified request parameters.
     *        For example, if an <code>Auth</code> header, a <code>Name</code> query string parameter are defined as
     *        identity sources, this value is <code>method.request.header.Auth, method.request.querystring.Name</code>.
     *        These parameters will be used to derive the authorization caching key and to perform runtime validation of
     *        the <code>REQUEST</code> authorizer by verifying all of the identity-related request parameters are
     *        present, not null and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda
     *        function, otherwise, it returns a 401 Unauthorized response without calling the Lambda function. The valid
     *        value is a string of comma-separated mapping expressions of the specified request parameters. When the
     *        authorization caching is not enabled, this property is optional.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withIdentitySource(String identitySource) {
        setIdentitySource(identitySource);
        return this;
    }

    /**
     * <p>
     * A validation expression for the incoming identity token. For <code>TOKEN</code> authorizers, this value is a
     * regular expression. API Gateway will match the <code>aud</code> field of the incoming token from the client
     * against the specified regular expression. It will invoke the authorizer's Lambda function when there is a match.
     * Otherwise, it will return a 401 Unauthorized response without calling the Lambda function. The validation
     * expression does not apply to the <code>REQUEST</code> authorizer.
     * </p>
     * 
     * @param identityValidationExpression
     *        A validation expression for the incoming identity token. For <code>TOKEN</code> authorizers, this value is
     *        a regular expression. API Gateway will match the <code>aud</code> field of the incoming token from the
     *        client against the specified regular expression. It will invoke the authorizer's Lambda function when
     *        there is a match. Otherwise, it will return a 401 Unauthorized response without calling the Lambda
     *        function. The validation expression does not apply to the <code>REQUEST</code> authorizer.
     */

    public void setIdentityValidationExpression(String identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
    }

    /**
     * <p>
     * A validation expression for the incoming identity token. For <code>TOKEN</code> authorizers, this value is a
     * regular expression. API Gateway will match the <code>aud</code> field of the incoming token from the client
     * against the specified regular expression. It will invoke the authorizer's Lambda function when there is a match.
     * Otherwise, it will return a 401 Unauthorized response without calling the Lambda function. The validation
     * expression does not apply to the <code>REQUEST</code> authorizer.
     * </p>
     * 
     * @return A validation expression for the incoming identity token. For <code>TOKEN</code> authorizers, this value
     *         is a regular expression. API Gateway will match the <code>aud</code> field of the incoming token from the
     *         client against the specified regular expression. It will invoke the authorizer's Lambda function when
     *         there is a match. Otherwise, it will return a 401 Unauthorized response without calling the Lambda
     *         function. The validation expression does not apply to the <code>REQUEST</code> authorizer.
     */

    public String getIdentityValidationExpression() {
        return this.identityValidationExpression;
    }

    /**
     * <p>
     * A validation expression for the incoming identity token. For <code>TOKEN</code> authorizers, this value is a
     * regular expression. API Gateway will match the <code>aud</code> field of the incoming token from the client
     * against the specified regular expression. It will invoke the authorizer's Lambda function when there is a match.
     * Otherwise, it will return a 401 Unauthorized response without calling the Lambda function. The validation
     * expression does not apply to the <code>REQUEST</code> authorizer.
     * </p>
     * 
     * @param identityValidationExpression
     *        A validation expression for the incoming identity token. For <code>TOKEN</code> authorizers, this value is
     *        a regular expression. API Gateway will match the <code>aud</code> field of the incoming token from the
     *        client against the specified regular expression. It will invoke the authorizer's Lambda function when
     *        there is a match. Otherwise, it will return a 401 Unauthorized response without calling the Lambda
     *        function. The validation expression does not apply to the <code>REQUEST</code> authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withIdentityValidationExpression(String identityValidationExpression) {
        setIdentityValidationExpression(identityValidationExpression);
        return this;
    }

    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it is
     * greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300.
     * The maximum value is 3600, or 1 hour.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it
     *        is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default
     *        value is 300. The maximum value is 3600, or 1 hour.
     */

    public void setAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it is
     * greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300.
     * The maximum value is 3600, or 1 hour.
     * </p>
     * 
     * @return The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it
     *         is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default
     *         value is 300. The maximum value is 3600, or 1 hour.
     */

    public Integer getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it is
     * greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default value is 300.
     * The maximum value is 3600, or 1 hour.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The TTL in seconds of cached authorizer results. If it equals 0, authorization caching is disabled. If it
     *        is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the default
     *        value is 300. The maximum value is 3600, or 1 hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        setAuthorizerResultTtlInSeconds(authorizerResultTtlInSeconds);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getProviderARNs() != null)
            sb.append("ProviderARNs: ").append(getProviderARNs()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getAuthorizerUri() != null)
            sb.append("AuthorizerUri: ").append(getAuthorizerUri()).append(",");
        if (getAuthorizerCredentials() != null)
            sb.append("AuthorizerCredentials: ").append(getAuthorizerCredentials()).append(",");
        if (getIdentitySource() != null)
            sb.append("IdentitySource: ").append(getIdentitySource()).append(",");
        if (getIdentityValidationExpression() != null)
            sb.append("IdentityValidationExpression: ").append(getIdentityValidationExpression()).append(",");
        if (getAuthorizerResultTtlInSeconds() != null)
            sb.append("AuthorizerResultTtlInSeconds: ").append(getAuthorizerResultTtlInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizerResult == false)
            return false;
        GetAuthorizerResult other = (GetAuthorizerResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProviderARNs() == null ^ this.getProviderARNs() == null)
            return false;
        if (other.getProviderARNs() != null && other.getProviderARNs().equals(this.getProviderARNs()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getAuthorizerUri() == null ^ this.getAuthorizerUri() == null)
            return false;
        if (other.getAuthorizerUri() != null && other.getAuthorizerUri().equals(this.getAuthorizerUri()) == false)
            return false;
        if (other.getAuthorizerCredentials() == null ^ this.getAuthorizerCredentials() == null)
            return false;
        if (other.getAuthorizerCredentials() != null && other.getAuthorizerCredentials().equals(this.getAuthorizerCredentials()) == false)
            return false;
        if (other.getIdentitySource() == null ^ this.getIdentitySource() == null)
            return false;
        if (other.getIdentitySource() != null && other.getIdentitySource().equals(this.getIdentitySource()) == false)
            return false;
        if (other.getIdentityValidationExpression() == null ^ this.getIdentityValidationExpression() == null)
            return false;
        if (other.getIdentityValidationExpression() != null && other.getIdentityValidationExpression().equals(this.getIdentityValidationExpression()) == false)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() == null ^ this.getAuthorizerResultTtlInSeconds() == null)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() != null && other.getAuthorizerResultTtlInSeconds().equals(this.getAuthorizerResultTtlInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getProviderARNs() == null) ? 0 : getProviderARNs().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerUri() == null) ? 0 : getAuthorizerUri().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerCredentials() == null) ? 0 : getAuthorizerCredentials().hashCode());
        hashCode = prime * hashCode + ((getIdentitySource() == null) ? 0 : getIdentitySource().hashCode());
        hashCode = prime * hashCode + ((getIdentityValidationExpression() == null) ? 0 : getIdentityValidationExpression().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerResultTtlInSeconds() == null) ? 0 : getAuthorizerResultTtlInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public GetAuthorizerResult clone() {
        try {
            return (GetAuthorizerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

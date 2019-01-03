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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAuthorizerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null.
     * </p>
     */
    private String authorizerCredentialsArn;
    /**
     * <p>
     * The authorizer identifier.
     * </p>
     */
    private String authorizerId;
    /**
     * <p>
     * The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is
     * disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the
     * default value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     */
    private Integer authorizerResultTtlInSeconds;
    /**
     * <p>
     * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request
     * parameters.
     * </p>
     */
    private String authorizerType;
    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda
     * function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * {account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form:
     * arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the
     * Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the
     * resource, including the initial /. For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations.
     * </p>
     */
    private String authorizerUri;
    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a
     * comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an
     * Auth header and a Name query string parameters are defined as identity sources, this value is
     * method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the
     * authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the
     * identity-related request parameters are present, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified
     * request parameters. When the authorization caching is not enabled, this property is optional.
     * </p>
     */
    private java.util.List<String> identitySource;
    /**
     * <p>
     * The validation expression does not apply to the REQUEST authorizer.
     * </p>
     */
    private String identityValidationExpression;
    /**
     * <p>
     * The name of the authorizer.
     * </p>
     */
    private String name;
    /**
     * <p>
     * For REQUEST authorizer, this is not defined.
     * </p>
     */
    private java.util.List<String> providerArns;

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null.
     * </p>
     * 
     * @param authorizerCredentialsArn
     *        Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an
     *        IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based
     *        permissions on the Lambda function, specify null.
     */

    public void setAuthorizerCredentialsArn(String authorizerCredentialsArn) {
        this.authorizerCredentialsArn = authorizerCredentialsArn;
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

    public String getAuthorizerCredentialsArn() {
        return this.authorizerCredentialsArn;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null.
     * </p>
     * 
     * @param authorizerCredentialsArn
     *        Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an
     *        IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based
     *        permissions on the Lambda function, specify null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withAuthorizerCredentialsArn(String authorizerCredentialsArn) {
        setAuthorizerCredentialsArn(authorizerCredentialsArn);
        return this;
    }

    /**
     * <p>
     * The authorizer identifier.
     * </p>
     * 
     * @param authorizerId
     *        The authorizer identifier.
     */

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * The authorizer identifier.
     * </p>
     * 
     * @return The authorizer identifier.
     */

    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * <p>
     * The authorizer identifier.
     * </p>
     * 
     * @param authorizerId
     *        The authorizer identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
        return this;
    }

    /**
     * <p>
     * The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is
     * disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the
     * default value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is
     *        disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set,
     *        the default value is 300. The maximum value is 3600, or 1 hour.
     */

    public void setAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is
     * disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the
     * default value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     * 
     * @return The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching
     *         is disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not
     *         set, the default value is 300. The maximum value is 3600, or 1 hour.
     */

    public Integer getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is
     * disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set, the
     * default value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The time to live (TTL), in seconds, of cached authorizer results. If it equals 0, authorization caching is
     *        disabled. If it is greater than 0, API Gateway will cache authorizer responses. If this field is not set,
     *        the default value is 300. The maximum value is 3600, or 1 hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        setAuthorizerResultTtlInSeconds(authorizerResultTtlInSeconds);
        return this;
    }

    /**
     * <p>
     * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request
     * parameters.
     * </p>
     * 
     * @param authorizerType
     *        The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming
     *        request parameters.
     * @see AuthorizerType
     */

    public void setAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
    }

    /**
     * <p>
     * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request
     * parameters.
     * </p>
     * 
     * @return The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming
     *         request parameters.
     * @see AuthorizerType
     */

    public String getAuthorizerType() {
        return this.authorizerType;
    }

    /**
     * <p>
     * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request
     * parameters.
     * </p>
     * 
     * @param authorizerType
     *        The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming
     *        request parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerType
     */

    public GetAuthorizerResult withAuthorizerType(String authorizerType) {
        setAuthorizerType(authorizerType);
        return this;
    }

    /**
     * <p>
     * The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming request
     * parameters.
     * </p>
     * 
     * @param authorizerType
     *        The authorizer type. Currently the only valid value is REQUEST, for a Lambda function using incoming
     *        request parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerType
     */

    public GetAuthorizerResult withAuthorizerType(AuthorizerType authorizerType) {
        this.authorizerType = authorizerType.toString();
        return this;
    }

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda
     * function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * {account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form:
     * arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the
     * Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the
     * resource, including the initial /. For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations.
     * </p>
     * 
     * @param authorizerUri
     *        The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed
     *        Lambda function URI, for example,
     *        arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda
     *        :us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form:
     *        arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting
     *        the Lambda function, path indicates that the remaining substring in the URI should be treated as the path
     *        to the resource, including the initial /. For Lambda functions, this is usually of the form
     *        /2015-03-31/functions/[FunctionARN]/invocations.
     */

    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda
     * function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * {account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form:
     * arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the
     * Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the
     * resource, including the initial /. For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations.
     * </p>
     * 
     * @return The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed
     *         Lambda function URI, for example,
     *         arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda
     *         :us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form:
     *         arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting
     *         the Lambda function, path indicates that the remaining substring in the URI should be treated as the path
     *         to the resource, including the initial /. For Lambda functions, this is usually of the form
     *         /2015-03-31/functions/[FunctionARN]/invocations.
     */

    public String getAuthorizerUri() {
        return this.authorizerUri;
    }

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda
     * function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * {account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form:
     * arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting the
     * Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the
     * resource, including the initial /. For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations.
     * </p>
     * 
     * @param authorizerUri
     *        The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed
     *        Lambda function URI, for example,
     *        arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda
     *        :us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form:
     *        arn:aws:apigateway:{region}:lambda:path/{service_api} , where {region} is the same as the region hosting
     *        the Lambda function, path indicates that the remaining substring in the URI should be treated as the path
     *        to the resource, including the initial /. For Lambda functions, this is usually of the form
     *        /2015-03-31/functions/[FunctionARN]/invocations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withAuthorizerUri(String authorizerUri) {
        setAuthorizerUri(authorizerUri);
        return this;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a
     * comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an
     * Auth header and a Name query string parameters are defined as identity sources, this value is
     * method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the
     * authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the
     * identity-related request parameters are present, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified
     * request parameters. When the authorization caching is not enabled, this property is optional.
     * </p>
     * 
     * @return The identity source for which authorization is requested.</p>
     *         <p>
     *         For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a
     *         comma-separated string of one or more mapping expressions of the specified request parameters. For
     *         example, if an Auth header and a Name query string parameters are defined as identity sources, this value
     *         is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive
     *         the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying
     *         all of the identity-related request parameters are present, not null, and non-empty. Only when this is
     *         true does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     *         response without calling the Lambda function. The valid value is a string of comma-separated mapping
     *         expressions of the specified request parameters. When the authorization caching is not enabled, this
     *         property is optional.
     */

    public java.util.List<String> getIdentitySource() {
        return identitySource;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a
     * comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an
     * Auth header and a Name query string parameters are defined as identity sources, this value is
     * method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the
     * authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the
     * identity-related request parameters are present, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified
     * request parameters. When the authorization caching is not enabled, this property is optional.
     * </p>
     * 
     * @param identitySource
     *        The identity source for which authorization is requested.</p>
     *        <p>
     *        For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a
     *        comma-separated string of one or more mapping expressions of the specified request parameters. For
     *        example, if an Auth header and a Name query string parameters are defined as identity sources, this value
     *        is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive
     *        the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all
     *        of the identity-related request parameters are present, not null, and non-empty. Only when this is true
     *        does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     *        response without calling the Lambda function. The valid value is a string of comma-separated mapping
     *        expressions of the specified request parameters. When the authorization caching is not enabled, this
     *        property is optional.
     */

    public void setIdentitySource(java.util.Collection<String> identitySource) {
        if (identitySource == null) {
            this.identitySource = null;
            return;
        }

        this.identitySource = new java.util.ArrayList<String>(identitySource);
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a
     * comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an
     * Auth header and a Name query string parameters are defined as identity sources, this value is
     * method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the
     * authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the
     * identity-related request parameters are present, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified
     * request parameters. When the authorization caching is not enabled, this property is optional.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentitySource(java.util.Collection)} or {@link #withIdentitySource(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param identitySource
     *        The identity source for which authorization is requested.</p>
     *        <p>
     *        For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a
     *        comma-separated string of one or more mapping expressions of the specified request parameters. For
     *        example, if an Auth header and a Name query string parameters are defined as identity sources, this value
     *        is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive
     *        the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all
     *        of the identity-related request parameters are present, not null, and non-empty. Only when this is true
     *        does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     *        response without calling the Lambda function. The valid value is a string of comma-separated mapping
     *        expressions of the specified request parameters. When the authorization caching is not enabled, this
     *        property is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withIdentitySource(String... identitySource) {
        if (this.identitySource == null) {
            setIdentitySource(new java.util.ArrayList<String>(identitySource.length));
        }
        for (String ele : identitySource) {
            this.identitySource.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a
     * comma-separated string of one or more mapping expressions of the specified request parameters. For example, if an
     * Auth header and a Name query string parameters are defined as identity sources, this value is
     * method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive the
     * authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all of the
     * identity-related request parameters are present, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function. The valid value is a string of comma-separated mapping expressions of the specified
     * request parameters. When the authorization caching is not enabled, this property is optional.
     * </p>
     * 
     * @param identitySource
     *        The identity source for which authorization is requested.</p>
     *        <p>
     *        For the REQUEST authorizer, this is required when authorization caching is enabled. The value is a
     *        comma-separated string of one or more mapping expressions of the specified request parameters. For
     *        example, if an Auth header and a Name query string parameters are defined as identity sources, this value
     *        is method.request.header.Auth, method.request.querystring.Name. These parameters will be used to derive
     *        the authorization caching key and to perform runtime validation of the REQUEST authorizer by verifying all
     *        of the identity-related request parameters are present, not null, and non-empty. Only when this is true
     *        does the authorizer invoke the authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     *        response without calling the Lambda function. The valid value is a string of comma-separated mapping
     *        expressions of the specified request parameters. When the authorization caching is not enabled, this
     *        property is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withIdentitySource(java.util.Collection<String> identitySource) {
        setIdentitySource(identitySource);
        return this;
    }

    /**
     * <p>
     * The validation expression does not apply to the REQUEST authorizer.
     * </p>
     * 
     * @param identityValidationExpression
     *        The validation expression does not apply to the REQUEST authorizer.
     */

    public void setIdentityValidationExpression(String identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
    }

    /**
     * <p>
     * The validation expression does not apply to the REQUEST authorizer.
     * </p>
     * 
     * @return The validation expression does not apply to the REQUEST authorizer.
     */

    public String getIdentityValidationExpression() {
        return this.identityValidationExpression;
    }

    /**
     * <p>
     * The validation expression does not apply to the REQUEST authorizer.
     * </p>
     * 
     * @param identityValidationExpression
     *        The validation expression does not apply to the REQUEST authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withIdentityValidationExpression(String identityValidationExpression) {
        setIdentityValidationExpression(identityValidationExpression);
        return this;
    }

    /**
     * <p>
     * The name of the authorizer.
     * </p>
     * 
     * @param name
     *        The name of the authorizer.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the authorizer.
     * </p>
     * 
     * @return The name of the authorizer.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the authorizer.
     * </p>
     * 
     * @param name
     *        The name of the authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * For REQUEST authorizer, this is not defined.
     * </p>
     * 
     * @return For REQUEST authorizer, this is not defined.
     */

    public java.util.List<String> getProviderArns() {
        return providerArns;
    }

    /**
     * <p>
     * For REQUEST authorizer, this is not defined.
     * </p>
     * 
     * @param providerArns
     *        For REQUEST authorizer, this is not defined.
     */

    public void setProviderArns(java.util.Collection<String> providerArns) {
        if (providerArns == null) {
            this.providerArns = null;
            return;
        }

        this.providerArns = new java.util.ArrayList<String>(providerArns);
    }

    /**
     * <p>
     * For REQUEST authorizer, this is not defined.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProviderArns(java.util.Collection)} or {@link #withProviderArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param providerArns
     *        For REQUEST authorizer, this is not defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withProviderArns(String... providerArns) {
        if (this.providerArns == null) {
            setProviderArns(new java.util.ArrayList<String>(providerArns.length));
        }
        for (String ele : providerArns) {
            this.providerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For REQUEST authorizer, this is not defined.
     * </p>
     * 
     * @param providerArns
     *        For REQUEST authorizer, this is not defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizerResult withProviderArns(java.util.Collection<String> providerArns) {
        setProviderArns(providerArns);
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
        if (getAuthorizerCredentialsArn() != null)
            sb.append("AuthorizerCredentialsArn: ").append(getAuthorizerCredentialsArn()).append(",");
        if (getAuthorizerId() != null)
            sb.append("AuthorizerId: ").append(getAuthorizerId()).append(",");
        if (getAuthorizerResultTtlInSeconds() != null)
            sb.append("AuthorizerResultTtlInSeconds: ").append(getAuthorizerResultTtlInSeconds()).append(",");
        if (getAuthorizerType() != null)
            sb.append("AuthorizerType: ").append(getAuthorizerType()).append(",");
        if (getAuthorizerUri() != null)
            sb.append("AuthorizerUri: ").append(getAuthorizerUri()).append(",");
        if (getIdentitySource() != null)
            sb.append("IdentitySource: ").append(getIdentitySource()).append(",");
        if (getIdentityValidationExpression() != null)
            sb.append("IdentityValidationExpression: ").append(getIdentityValidationExpression()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProviderArns() != null)
            sb.append("ProviderArns: ").append(getProviderArns());
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
        if (other.getAuthorizerCredentialsArn() == null ^ this.getAuthorizerCredentialsArn() == null)
            return false;
        if (other.getAuthorizerCredentialsArn() != null && other.getAuthorizerCredentialsArn().equals(this.getAuthorizerCredentialsArn()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() == null ^ this.getAuthorizerResultTtlInSeconds() == null)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() != null && other.getAuthorizerResultTtlInSeconds().equals(this.getAuthorizerResultTtlInSeconds()) == false)
            return false;
        if (other.getAuthorizerType() == null ^ this.getAuthorizerType() == null)
            return false;
        if (other.getAuthorizerType() != null && other.getAuthorizerType().equals(this.getAuthorizerType()) == false)
            return false;
        if (other.getAuthorizerUri() == null ^ this.getAuthorizerUri() == null)
            return false;
        if (other.getAuthorizerUri() != null && other.getAuthorizerUri().equals(this.getAuthorizerUri()) == false)
            return false;
        if (other.getIdentitySource() == null ^ this.getIdentitySource() == null)
            return false;
        if (other.getIdentitySource() != null && other.getIdentitySource().equals(this.getIdentitySource()) == false)
            return false;
        if (other.getIdentityValidationExpression() == null ^ this.getIdentityValidationExpression() == null)
            return false;
        if (other.getIdentityValidationExpression() != null && other.getIdentityValidationExpression().equals(this.getIdentityValidationExpression()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProviderArns() == null ^ this.getProviderArns() == null)
            return false;
        if (other.getProviderArns() != null && other.getProviderArns().equals(this.getProviderArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizerCredentialsArn() == null) ? 0 : getAuthorizerCredentialsArn().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerId() == null) ? 0 : getAuthorizerId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerResultTtlInSeconds() == null) ? 0 : getAuthorizerResultTtlInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerType() == null) ? 0 : getAuthorizerType().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerUri() == null) ? 0 : getAuthorizerUri().hashCode());
        hashCode = prime * hashCode + ((getIdentitySource() == null) ? 0 : getIdentitySource().hashCode());
        hashCode = prime * hashCode + ((getIdentityValidationExpression() == null) ? 0 : getIdentityValidationExpression().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProviderArns() == null) ? 0 : getProviderArns().hashCode());
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

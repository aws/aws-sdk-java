/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an authorizer.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Authorizer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null. Supported only for REQUEST authorizers.
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
     * Authorizer caching is not currently supported. Don't specify this value for authorizers.
     * </p>
     */
    private Integer authorizerResultTtlInSeconds;
    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify JWT to use JSON Web Tokens.
     * </p>
     */
    private String authorizerType;
    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda
     * function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * <replaceable>{account_id}</replaceable>:function:<replaceable>{lambda_function_name}</replaceable>/invocations.
     * In general, the URI has this form:
     * arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda:path/<replaceable>{service_api}</replaceable> ,
     * where <replaceable></replaceable>{region} is the same as the region hosting the Lambda function, path indicates
     * that the remaining substring in the URI should be treated as the path to the resource, including the initial /.
     * For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations. Supported only
     * for REQUEST authorizers.
     * </p>
     */
    private String authorizerUri;
    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the
     * specified request parameters. Currently, the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined
     * as identity sources, this value is route.request.header.Auth, route.request.querystring.Name. These parameters
     * will be used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related
     * request parameters are present in the request, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests. Currently
     * only header-based and query parameter-based selections are supported, for example
     * "$request.header.Authorization".
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
     * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP
     * APIs.
     * </p>
     */
    private JWTConfiguration jwtConfiguration;
    /**
     * <p>
     * The name of the authorizer.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null. Supported only for REQUEST authorizers.
     * </p>
     * 
     * @param authorizerCredentialsArn
     *        Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an
     *        IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based
     *        permissions on the Lambda function, specify null. Supported only for REQUEST authorizers.
     */

    public void setAuthorizerCredentialsArn(String authorizerCredentialsArn) {
        this.authorizerCredentialsArn = authorizerCredentialsArn;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null. Supported only for REQUEST authorizers.
     * </p>
     * 
     * @return Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an
     *         IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based
     *         permissions on the Lambda function, specify null. Supported only for REQUEST authorizers.
     */

    public String getAuthorizerCredentialsArn() {
        return this.authorizerCredentialsArn;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM
     * role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on
     * the Lambda function, specify null. Supported only for REQUEST authorizers.
     * </p>
     * 
     * @param authorizerCredentialsArn
     *        Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an
     *        IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based
     *        permissions on the Lambda function, specify null. Supported only for REQUEST authorizers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Authorizer withAuthorizerCredentialsArn(String authorizerCredentialsArn) {
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

    public Authorizer withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
        return this;
    }

    /**
     * <p>
     * Authorizer caching is not currently supported. Don't specify this value for authorizers.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        Authorizer caching is not currently supported. Don't specify this value for authorizers.
     */

    public void setAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * Authorizer caching is not currently supported. Don't specify this value for authorizers.
     * </p>
     * 
     * @return Authorizer caching is not currently supported. Don't specify this value for authorizers.
     */

    public Integer getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * Authorizer caching is not currently supported. Don't specify this value for authorizers.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        Authorizer caching is not currently supported. Don't specify this value for authorizers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Authorizer withAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        setAuthorizerResultTtlInSeconds(authorizerResultTtlInSeconds);
        return this;
    }

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify JWT to use JSON Web Tokens.
     * </p>
     * 
     * @param authorizerType
     *        The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request
     *        parameters. For HTTP APIs, specify JWT to use JSON Web Tokens.
     * @see AuthorizerType
     */

    public void setAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
    }

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify JWT to use JSON Web Tokens.
     * </p>
     * 
     * @return The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request
     *         parameters. For HTTP APIs, specify JWT to use JSON Web Tokens.
     * @see AuthorizerType
     */

    public String getAuthorizerType() {
        return this.authorizerType;
    }

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify JWT to use JSON Web Tokens.
     * </p>
     * 
     * @param authorizerType
     *        The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request
     *        parameters. For HTTP APIs, specify JWT to use JSON Web Tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerType
     */

    public Authorizer withAuthorizerType(String authorizerType) {
        setAuthorizerType(authorizerType);
        return this;
    }

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify JWT to use JSON Web Tokens.
     * </p>
     * 
     * @param authorizerType
     *        The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request
     *        parameters. For HTTP APIs, specify JWT to use JSON Web Tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerType
     */

    public Authorizer withAuthorizerType(AuthorizerType authorizerType) {
        this.authorizerType = authorizerType.toString();
        return this;
    }

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda
     * function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * <replaceable>{account_id}</replaceable>:function:<replaceable>{lambda_function_name}</replaceable>/invocations.
     * In general, the URI has this form:
     * arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda:path/<replaceable>{service_api}</replaceable> ,
     * where <replaceable></replaceable>{region} is the same as the region hosting the Lambda function, path indicates
     * that the remaining substring in the URI should be treated as the path to the resource, including the initial /.
     * For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations. Supported only
     * for REQUEST authorizers.
     * </p>
     * 
     * @param authorizerUri
     *        The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed
     *        Lambda function URI, for example,
     *        arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda
     *        :us-west-2:<replaceable>{account_id
     *        }</replaceable>:function:<replaceable>{lambda_function_name}</replaceable>/invocations. In general, the
     *        URI has this form:
     *        arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda:path/<replaceable>{service_api
     *        }</replaceable> , where <replaceable></replaceable>{region} is the same as the region hosting the Lambda
     *        function, path indicates that the remaining substring in the URI should be treated as the path to the
     *        resource, including the initial /. For Lambda functions, this is usually of the form
     *        /2015-03-31/functions/[FunctionARN]/invocations. Supported only for REQUEST authorizers.
     */

    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda
     * function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * <replaceable>{account_id}</replaceable>:function:<replaceable>{lambda_function_name}</replaceable>/invocations.
     * In general, the URI has this form:
     * arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda:path/<replaceable>{service_api}</replaceable> ,
     * where <replaceable></replaceable>{region} is the same as the region hosting the Lambda function, path indicates
     * that the remaining substring in the URI should be treated as the path to the resource, including the initial /.
     * For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations. Supported only
     * for REQUEST authorizers.
     * </p>
     * 
     * @return The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed
     *         Lambda function URI, for example,
     *         arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda
     *         :us-west-2:<replaceable>{account_id
     *         }</replaceable>:function:<replaceable>{lambda_function_name}</replaceable>/invocations. In general, the
     *         URI has this form:
     *         arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda:path/<replaceable>{service_api
     *         }</replaceable> , where <replaceable></replaceable>{region} is the same as the region hosting the Lambda
     *         function, path indicates that the remaining substring in the URI should be treated as the path to the
     *         resource, including the initial /. For Lambda functions, this is usually of the form
     *         /2015-03-31/functions/[FunctionARN]/invocations. Supported only for REQUEST authorizers.
     */

    public String getAuthorizerUri() {
        return this.authorizerUri;
    }

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda
     * function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:
     * <replaceable>{account_id}</replaceable>:function:<replaceable>{lambda_function_name}</replaceable>/invocations.
     * In general, the URI has this form:
     * arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda:path/<replaceable>{service_api}</replaceable> ,
     * where <replaceable></replaceable>{region} is the same as the region hosting the Lambda function, path indicates
     * that the remaining substring in the URI should be treated as the path to the resource, including the initial /.
     * For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations. Supported only
     * for REQUEST authorizers.
     * </p>
     * 
     * @param authorizerUri
     *        The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed
     *        Lambda function URI, for example,
     *        arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda
     *        :us-west-2:<replaceable>{account_id
     *        }</replaceable>:function:<replaceable>{lambda_function_name}</replaceable>/invocations. In general, the
     *        URI has this form:
     *        arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda:path/<replaceable>{service_api
     *        }</replaceable> , where <replaceable></replaceable>{region} is the same as the region hosting the Lambda
     *        function, path indicates that the remaining substring in the URI should be treated as the path to the
     *        resource, including the initial /. For Lambda functions, this is usually of the form
     *        /2015-03-31/functions/[FunctionARN]/invocations. Supported only for REQUEST authorizers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Authorizer withAuthorizerUri(String authorizerUri) {
        setAuthorizerUri(authorizerUri);
        return this;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the
     * specified request parameters. Currently, the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined
     * as identity sources, this value is route.request.header.Auth, route.request.querystring.Name. These parameters
     * will be used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related
     * request parameters are present in the request, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests. Currently
     * only header-based and query parameter-based selections are supported, for example
     * "$request.header.Authorization".
     * </p>
     * 
     * @return The identity source for which authorization is requested.</p>
     *         <p>
     *         For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the
     *         specified request parameters. Currently, the identity source can be headers, query string parameters,
     *         stage variables, and context parameters. For example, if an Auth header and a Name query string parameter
     *         are defined as identity sources, this value is route.request.header.Auth, route.request.querystring.Name.
     *         These parameters will be used to perform runtime validation for Lambda-based authorizers by verifying all
     *         of the identity-related request parameters are present in the request, not null, and non-empty. Only when
     *         this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401
     *         Unauthorized response without calling the Lambda function.
     *         </p>
     *         <p>
     *         For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests.
     *         Currently only header-based and query parameter-based selections are supported, for example
     *         "$request.header.Authorization".
     */

    public java.util.List<String> getIdentitySource() {
        return identitySource;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the
     * specified request parameters. Currently, the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined
     * as identity sources, this value is route.request.header.Auth, route.request.querystring.Name. These parameters
     * will be used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related
     * request parameters are present in the request, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests. Currently
     * only header-based and query parameter-based selections are supported, for example
     * "$request.header.Authorization".
     * </p>
     * 
     * @param identitySource
     *        The identity source for which authorization is requested.</p>
     *        <p>
     *        For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the
     *        specified request parameters. Currently, the identity source can be headers, query string parameters,
     *        stage variables, and context parameters. For example, if an Auth header and a Name query string parameter
     *        are defined as identity sources, this value is route.request.header.Auth, route.request.querystring.Name.
     *        These parameters will be used to perform runtime validation for Lambda-based authorizers by verifying all
     *        of the identity-related request parameters are present in the request, not null, and non-empty. Only when
     *        this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401
     *        Unauthorized response without calling the Lambda function.
     *        </p>
     *        <p>
     *        For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests.
     *        Currently only header-based and query parameter-based selections are supported, for example
     *        "$request.header.Authorization".
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
     * For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the
     * specified request parameters. Currently, the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined
     * as identity sources, this value is route.request.header.Auth, route.request.querystring.Name. These parameters
     * will be used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related
     * request parameters are present in the request, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests. Currently
     * only header-based and query parameter-based selections are supported, for example
     * "$request.header.Authorization".
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
     *        For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the
     *        specified request parameters. Currently, the identity source can be headers, query string parameters,
     *        stage variables, and context parameters. For example, if an Auth header and a Name query string parameter
     *        are defined as identity sources, this value is route.request.header.Auth, route.request.querystring.Name.
     *        These parameters will be used to perform runtime validation for Lambda-based authorizers by verifying all
     *        of the identity-related request parameters are present in the request, not null, and non-empty. Only when
     *        this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401
     *        Unauthorized response without calling the Lambda function.
     *        </p>
     *        <p>
     *        For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests.
     *        Currently only header-based and query parameter-based selections are supported, for example
     *        "$request.header.Authorization".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Authorizer withIdentitySource(String... identitySource) {
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
     * For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the
     * specified request parameters. Currently, the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined
     * as identity sources, this value is route.request.header.Auth, route.request.querystring.Name. These parameters
     * will be used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related
     * request parameters are present in the request, not null, and non-empty. Only when this is true does the
     * authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without
     * calling the Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests. Currently
     * only header-based and query parameter-based selections are supported, for example
     * "$request.header.Authorization".
     * </p>
     * 
     * @param identitySource
     *        The identity source for which authorization is requested.</p>
     *        <p>
     *        For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the
     *        specified request parameters. Currently, the identity source can be headers, query string parameters,
     *        stage variables, and context parameters. For example, if an Auth header and a Name query string parameter
     *        are defined as identity sources, this value is route.request.header.Auth, route.request.querystring.Name.
     *        These parameters will be used to perform runtime validation for Lambda-based authorizers by verifying all
     *        of the identity-related request parameters are present in the request, not null, and non-empty. Only when
     *        this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401
     *        Unauthorized response without calling the Lambda function.
     *        </p>
     *        <p>
     *        For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests.
     *        Currently only header-based and query parameter-based selections are supported, for example
     *        "$request.header.Authorization".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Authorizer withIdentitySource(java.util.Collection<String> identitySource) {
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

    public Authorizer withIdentityValidationExpression(String identityValidationExpression) {
        setIdentityValidationExpression(identityValidationExpression);
        return this;
    }

    /**
     * <p>
     * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP
     * APIs.
     * </p>
     * 
     * @param jwtConfiguration
     *        Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for
     *        HTTP APIs.
     */

    public void setJwtConfiguration(JWTConfiguration jwtConfiguration) {
        this.jwtConfiguration = jwtConfiguration;
    }

    /**
     * <p>
     * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP
     * APIs.
     * </p>
     * 
     * @return Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only
     *         for HTTP APIs.
     */

    public JWTConfiguration getJwtConfiguration() {
        return this.jwtConfiguration;
    }

    /**
     * <p>
     * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP
     * APIs.
     * </p>
     * 
     * @param jwtConfiguration
     *        Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for
     *        HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Authorizer withJwtConfiguration(JWTConfiguration jwtConfiguration) {
        setJwtConfiguration(jwtConfiguration);
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

    public Authorizer withName(String name) {
        setName(name);
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
        if (getJwtConfiguration() != null)
            sb.append("JwtConfiguration: ").append(getJwtConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Authorizer == false)
            return false;
        Authorizer other = (Authorizer) obj;
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
        if (other.getJwtConfiguration() == null ^ this.getJwtConfiguration() == null)
            return false;
        if (other.getJwtConfiguration() != null && other.getJwtConfiguration().equals(this.getJwtConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getJwtConfiguration() == null) ? 0 : getJwtConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Authorizer clone() {
        try {
            return (Authorizer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.AuthorizerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

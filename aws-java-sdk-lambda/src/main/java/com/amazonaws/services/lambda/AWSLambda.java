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
package com.amazonaws.services.lambda;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lambda.model.*;

/**
 * Interface for accessing AWS Lambda.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lambda.AbstractAWSLambda} instead.
 * </p>
 * <p>
 * <fullname>AWS Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i>. The AWS Lambda Developer Guide provides additional information. For the
 * service overview, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS Lambda</a>, and
 * for information about how the service works, see <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a> in the
 * <b>AWS Lambda Developer Guide</b>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLambda {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lambda";

    /**
     * Overrides the default endpoint for this client ("lambda.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "lambda.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "lambda.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "lambda.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "lambda.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSLambda#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Adds permissions to the resource-based policy of a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. Use this
     * action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS
     * accounts, or all accounts in an organization.
     * </p>
     * <p>
     * To revoke permission, call <a>RemoveLayerVersionPermission</a> with the statement ID that you specified when you
     * added it.
     * </p>
     * 
     * @param addLayerVersionPermissionRequest
     * @return Result of the AddLayerVersionPermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws PolicyLengthExceededException
     *         The permissions policy for the resource is too large. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.AddLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    AddLayerVersionPermissionResult addLayerVersionPermission(AddLayerVersionPermissionRequest addLayerVersionPermissionRequest);

    /**
     * <p>
     * Grants an AWS service or another account permission to use a function. You can apply the policy at the function
     * level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the
     * invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function.
     * </p>
     * <p>
     * To grant permission to another account, specify the account ID as the <code>Principal</code>. For AWS services,
     * the principal is a domain-style identifier defined by the service, like <code>s3.amazonaws.com</code> or
     * <code>sns.amazonaws.com</code>. For AWS services, you can also specify the ARN or owning account of the
     * associated resource as the <code>SourceArn</code> or <code>SourceAccount</code>. If you grant permission to a
     * service principal without specifying the source, other accounts could potentially configure resources in their
     * account to invoke your Lambda function.
     * </p>
     * <p>
     * This action adds a statement to a resource-based permission policy for the function. For more information about
     * function policies, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html">Lambda Function
     * Policies</a>.
     * </p>
     * 
     * @param addPermissionRequest
     * @return Result of the AddPermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws PolicyLengthExceededException
     *         The permissions policy for the resource is too large. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    AddPermissionResult addPermission(AddPermissionRequest addPermissionRequest);

    /**
     * <p>
     * Creates an <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a> for a Lambda
     * function version. Use aliases to provide clients with a function identifier that you can update to invoke a
     * different version.
     * </p>
     * <p>
     * You can also map an alias to split invocation requests between two versions. Use the <code>RoutingConfig</code>
     * parameter to specify a second version and the percentage of invocation requests that it receives.
     * </p>
     * 
     * @param createAliasRequest
     * @return Result of the CreateAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAliasResult createAlias(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source
     * and triggers the function.
     * </p>
     * <p>
     * For details about each event source type, see the following topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html">Using AWS Lambda with Amazon Kinesis</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html">Using AWS Lambda with Amazon SQS</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html">Using AWS Lambda with Amazon DynamoDB</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventSourceMappingRequest
     * @return Result of the CreateEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @sample AWSLambda.CreateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEventSourceMappingResult createEventSourceMapping(CreateEventSourceMappingRequest createEventSourceMappingRequest);

    /**
     * <p>
     * Creates a Lambda function. To create a function, you need a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/deployment-package-v2.html">deployment package</a> and an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role">
     * execution role</a>. The deployment package contains your function code. The execution role grants the function
     * permission to use AWS services, such as Amazon CloudWatch Logs for log streaming and AWS X-Ray for request
     * tracing.
     * </p>
     * <p>
     * A function has an unpublished version, and can have published versions and aliases. The unpublished version
     * changes when you update your function's code and configuration. A published version is a snapshot of your
     * function code and configuration that can't be changed. An alias is a named resource that maps to a version, and
     * can be changed to map to a different version. Use the <code>Publish</code> parameter to create version
     * <code>1</code> of your function from its initial configuration.
     * </p>
     * <p>
     * The other parameters let you configure version-specific and function-level settings. You can modify
     * version-specific settings later with <a>UpdateFunctionConfiguration</a>. Function-level settings apply to both
     * the unpublished and published versions of the function, and include tags (<a>TagResource</a>) and per-function
     * concurrency limits (<a>PutFunctionConcurrency</a>).
     * </p>
     * <p>
     * If another account or an AWS service invokes your function, use <a>AddPermission</a> to grant permission by
     * creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an
     * alias.
     * </p>
     * <p>
     * To invoke your function directly, use <a>Invoke</a>. To invoke your function in response to events in other AWS
     * services, create an event source mapping (<a>CreateEventSourceMapping</a>), or configure a function trigger in
     * the other service. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/invoking-lambda-functions.html">Invoking Functions</a>.
     * </p>
     * 
     * @param createFunctionRequest
     * @return Result of the CreateFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @sample AWSLambda.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFunctionResult createFunction(CreateFunctionRequest createFunctionRequest);

    /**
     * <p>
     * Deletes a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAliasResult deleteAlias(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes an <a href="https://docs.aws.amazon.com/lambda/latest/dg/intro-invocation-modes.html">event source
     * mapping</a>. You can get the identifier of a mapping from the output of <a>ListEventSourceMappings</a>.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @return Result of the DeleteEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to update an
     *         EventSource Mapping in CREATING, or tried to delete a EventSource mapping currently in the UPDATING
     *         state.
     * @sample AWSLambda.DeleteEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEventSourceMappingResult deleteEventSourceMapping(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest);

    /**
     * <p>
     * Deletes a Lambda function. To delete a specific function version, use the <code>Qualifier</code> parameter.
     * Otherwise, all versions and aliases are deleted.
     * </p>
     * <p>
     * To delete Lambda event source mappings that invoke a function, use <a>DeleteEventSourceMapping</a>. For AWS
     * services and resources that invoke your function directly, delete the trigger in the service where you originally
     * configured it.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return Result of the DeleteFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @sample AWSLambda.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFunctionResult deleteFunction(DeleteFunctionRequest deleteFunctionRequest);

    /**
     * <p>
     * Removes a concurrent execution limit from a function.
     * </p>
     * 
     * @param deleteFunctionConcurrencyRequest
     * @return Result of the DeleteFunctionConcurrency operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.DeleteFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFunctionConcurrencyResult deleteFunctionConcurrency(DeleteFunctionConcurrencyRequest deleteFunctionConcurrencyRequest);

    /**
     * <p>
     * Deletes a version of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS
     * Lambda layer</a>. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a
     * copy of the version remains in Lambda until no functions refer to it.
     * </p>
     * 
     * @param deleteLayerVersionRequest
     * @return Result of the DeleteLayerVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.DeleteLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLayerVersionResult deleteLayerVersion(DeleteLayerVersionRequest deleteLayerVersionRequest);

    /**
     * <p>
     * Retrieves details about your account's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limits</a> and usage in an AWS Region.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @sample AWSLambda.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Returns details about a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param getAliasRequest
     * @return Result of the GetAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.GetAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAlias" target="_top">AWS API
     *      Documentation</a>
     */
    GetAliasResult getAlias(GetAliasRequest getAliasRequest);

    /**
     * <p>
     * Returns details about an event source mapping. You can get the identifier of a mapping from the output of
     * <a>ListEventSourceMappings</a>.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @return Result of the GetEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.GetEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetEventSourceMapping" target="_top">AWS
     *      API Documentation</a>
     */
    GetEventSourceMappingResult getEventSourceMapping(GetEventSourceMappingRequest getEventSourceMappingRequest);

    /**
     * <p>
     * Returns information about the function or function version, with a link to download the deployment package that's
     * valid for 10 minutes. If you specify a function version, only details that are specific to that version are
     * returned.
     * </p>
     * 
     * @param getFunctionRequest
     * @return Result of the GetFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    GetFunctionResult getFunction(GetFunctionRequest getFunctionRequest);

    /**
     * <p>
     * Returns the version-specific settings of a Lambda function or version. The output includes only options that can
     * vary between versions of a function. To modify these settings, use <a>UpdateFunctionConfiguration</a>.
     * </p>
     * <p>
     * To get all of a function's details, including function-level settings, use <a>GetFunction</a>.
     * </p>
     * 
     * @param getFunctionConfigurationRequest
     * @return Result of the GetFunctionConfiguration operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetFunctionConfigurationResult getFunctionConfiguration(GetFunctionConfigurationRequest getFunctionConfigurationRequest);

    /**
     * <p>
     * Returns information about a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>, with a link
     * to download the layer archive that's valid for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionRequest
     * @return Result of the GetLayerVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @sample AWSLambda.GetLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    GetLayerVersionResult getLayerVersion(GetLayerVersionRequest getLayerVersionRequest);

    /**
     * <p>
     * Returns information about a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>, with a link
     * to download the layer archive that's valid for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionByArnRequest
     * @return Result of the GetLayerVersionByArn operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @sample AWSLambda.GetLayerVersionByArn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionByArn" target="_top">AWS
     *      API Documentation</a>
     */
    GetLayerVersionByArnResult getLayerVersionByArn(GetLayerVersionByArnRequest getLayerVersionByArnRequest);

    /**
     * <p>
     * Returns the permission policy for a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. For more
     * information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param getLayerVersionPolicyRequest
     * @return Result of the GetLayerVersionPolicy operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetLayerVersionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetLayerVersionPolicyResult getLayerVersionPolicy(GetLayerVersionPolicyRequest getLayerVersionPolicyRequest);

    /**
     * <p>
     * Returns the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html">resource-based IAM
     * policy</a> for a function, version, or alias.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or
     * asynchronously. To invoke a function asynchronously, set <code>InvocationType</code> to <code>Event</code>.
     * </p>
     * <p>
     * For synchronous invocation, details about the function response, including errors, are included in the response
     * body and headers. For either invocation type, you can find more information in the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/monitoring-functions.html">execution log</a> and <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">trace</a>. To record function errors for
     * asynchronous invocations, configure your function with a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">dead letter queue</a>.
     * </p>
     * <p>
     * When an error occurs, your function may be invoked multiple times. Retry behavior varies by error type, client,
     * event source, and invocation type. For example, if you invoke a function asynchronously and it returns an error,
     * Lambda executes the function up to two more times. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/retries-on-errors.html">Retry Behavior</a>.
     * </p>
     * <p>
     * The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that
     * prevent your function from executing, such as permissions errors, <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limit errors</a>, or issues with your function's
     * code and configuration. For example, Lambda returns <code>TooManyRequestsException</code> if executing the
     * function would cause you to exceed a concurrency limit at either the account level (
     * <code>ConcurrentInvocationLimitExceeded</code>) or function level (
     * <code>ReservedFunctionConcurrentInvocationLimitExceeded</code>).
     * </p>
     * <p>
     * For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits
     * for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long
     * connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * 
     * @param invokeRequest
     * @return Result of the Invoke operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidRequestContentException
     *         The request body could not be parsed as JSON.
     * @throws RequestTooLargeException
     *         The request payload exceeded the <code>Invoke</code> request body JSON input limit. For more information,
     *         see <a href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>.
     * @throws UnsupportedMediaTypeException
     *         The content type of the <code>Invoke</code> request body is not JSON.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws EC2UnexpectedException
     *         AWS Lambda received an unexpected EC2 client exception while setting up for the Lambda function.
     * @throws SubnetIPAddressLimitReachedException
     *         AWS Lambda was not able to set up VPC access for the Lambda function because one or more configured
     *         subnets has no available IP addresses.
     * @throws ENILimitReachedException
     *         AWS Lambda was not able to create an Elastic Network Interface (ENI) in the VPC, specified as part of
     *         Lambda function configuration, because the limit for network interfaces has been reached.
     * @throws EC2ThrottledException
     *         AWS Lambda was throttled by Amazon EC2 during Lambda function initialization using the execution role
     *         provided for the Lambda function.
     * @throws EC2AccessDeniedException
     *         Need additional permissions to configure VPC settings.
     * @throws InvalidSubnetIDException
     *         The Subnet ID provided in the Lambda function VPC configuration is invalid.
     * @throws InvalidSecurityGroupIDException
     *         The Security Group ID provided in the Lambda function VPC configuration is invalid.
     * @throws InvalidZipFileException
     *         AWS Lambda could not unzip the deployment package.
     * @throws KMSDisabledException
     *         Lambda was unable to decrypt the environment variables because the KMS key used is disabled. Check the
     *         Lambda function's KMS key settings.
     * @throws KMSInvalidStateException
     *         Lambda was unable to decrypt the environment variables because the KMS key used is in an invalid state
     *         for Decrypt. Check the function's KMS key settings.
     * @throws KMSAccessDeniedException
     *         Lambda was unable to decrypt the environment variables because KMS access was denied. Check the Lambda
     *         function's KMS permissions.
     * @throws KMSNotFoundException
     *         Lambda was unable to decrypt the environment variables because the KMS key was not found. Check the
     *         function's KMS key settings.
     * @throws InvalidRuntimeException
     *         The runtime or runtime version specified is not supported.
     * @sample AWSLambda.Invoke
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
     *      Documentation</a>
     */
    InvokeResult invoke(InvokeRequest invokeRequest);

    /**
     * <important>
     * <p>
     * For asynchronous function invocation, use <a>Invoke</a>.
     * </p>
     * </important>
     * <p>
     * Invokes a function asynchronously.
     * </p>
     * 
     * @param invokeAsyncRequest
     * @return Result of the InvokeAsync operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidRequestContentException
     *         The request body could not be parsed as JSON.
     * @throws InvalidRuntimeException
     *         The runtime or runtime version specified is not supported.
     * @sample AWSLambda.InvokeAsync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/InvokeAsync" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    InvokeAsyncResult invokeAsync(InvokeAsyncRequest invokeAsyncRequest);

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">aliases</a> for
     * a Lambda function.
     * </p>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Lists event source mappings. Specify an <code>EventSourceArn</code> to only show event source mappings for a
     * single event source.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @return Result of the ListEventSourceMappings operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.ListEventSourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS
     *      API Documentation</a>
     */
    ListEventSourceMappingsResult listEventSourceMappings(ListEventSourceMappingsRequest listEventSourceMappingsRequest);

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation.
     *
     * @see #listEventSourceMappings(ListEventSourceMappingsRequest)
     */
    ListEventSourceMappingsResult listEventSourceMappings();

    /**
     * <p>
     * Returns a list of Lambda functions, with the version-specific configuration of each.
     * </p>
     * <p>
     * Set <code>FunctionVersion</code> to <code>ALL</code> to include all published versions of each function in
     * addition to the unpublished version. To get more information about a function or version, use <a>GetFunction</a>.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return Result of the ListFunctions operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    ListFunctionsResult listFunctions(ListFunctionsRequest listFunctionsRequest);

    /**
     * Simplified method form for invoking the ListFunctions operation.
     *
     * @see #listFunctions(ListFunctionsRequest)
     */
    ListFunctionsResult listFunctions();

    /**
     * <p>
     * Lists the versions of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS
     * Lambda layer</a>. Versions that have been deleted aren't listed. Specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * versions that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayerVersionsRequest
     * @return Result of the ListLayerVersions operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.ListLayerVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayerVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListLayerVersionsResult listLayerVersions(ListLayerVersionsRequest listLayerVersionsRequest);

    /**
     * <p>
     * Lists <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layers</a> and
     * shows information about the latest version of each. Specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * layers that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayersRequest
     * @return Result of the ListLayers operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.ListLayers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayers" target="_top">AWS API
     *      Documentation</a>
     */
    ListLayersResult listLayers(ListLayersRequest listLayersRequest);

    /**
     * <p>
     * Returns a function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>. You can also
     * view tags with <a>GetFunction</a>.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">versions</a>,
     * with the version-specific configuration of each.
     * </p>
     * 
     * @param listVersionsByFunctionRequest
     * @return Result of the ListVersionsByFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.ListVersionsByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListVersionsByFunction" target="_top">AWS
     *      API Documentation</a>
     */
    ListVersionsByFunctionResult listVersionsByFunction(ListVersionsByFunctionRequest listVersionsByFunctionRequest);

    /**
     * <p>
     * Creates an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>
     * from a ZIP archive. Each time you call <code>PublishLayerVersion</code> with the same version name, a new version
     * is created.
     * </p>
     * <p>
     * Add layers to your function with <a>CreateFunction</a> or <a>UpdateFunctionConfiguration</a>.
     * </p>
     * 
     * @param publishLayerVersionRequest
     * @return Result of the PublishLayerVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @sample AWSLambda.PublishLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    PublishLayerVersionResult publishLayerVersion(PublishLayerVersionRequest publishLayerVersionRequest);

    /**
     * <p>
     * Creates a <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">version</a> from the
     * current code and configuration of a function. Use versions to create a snapshot of your function code and
     * configuration that doesn't change.
     * </p>
     * <p>
     * AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last
     * version. Use <a>UpdateFunctionCode</a> or <a>UpdateFunctionConfiguration</a> to update the function before
     * publishing a version.
     * </p>
     * <p>
     * Clients can invoke versions directly or with an alias. To create an alias, use <a>CreateAlias</a>.
     * </p>
     * 
     * @param publishVersionRequest
     * @return Result of the PublishVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.PublishVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishVersion" target="_top">AWS API
     *      Documentation</a>
     */
    PublishVersionResult publishVersion(PublishVersionRequest publishVersionRequest);

    /**
     * <p>
     * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency
     * level.
     * </p>
     * <p>
     * Concurrency settings apply to the function as a whole, including all published versions and the unpublished
     * version. Reserving concurrency both ensures that your function has capacity to process the specified number of
     * events simultaneously, and prevents it from scaling beyond that level. Use <a>GetFunction</a> to see the current
     * setting for a function.
     * </p>
     * <p>
     * Use <a>GetAccountSettings</a> to see your regional concurrency limit. You can reserve concurrency for as many
     * functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that
     * aren't configured with a per-function limit. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param putFunctionConcurrencyRequest
     * @return Result of the PutFunctionConcurrency operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.PutFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    PutFunctionConcurrencyResult putFunctionConcurrency(PutFunctionConcurrencyRequest putFunctionConcurrencyRequest);

    /**
     * <p>
     * Removes a statement from the permissions policy for a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. For more
     * information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param removeLayerVersionPermissionRequest
     * @return Result of the RemoveLayerVersionPermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.RemoveLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemoveLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveLayerVersionPermissionResult removeLayerVersionPermission(RemoveLayerVersionPermissionRequest removeLayerVersionPermissionRequest);

    /**
     * <p>
     * Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from
     * the output of <a>GetPolicy</a>.
     * </p>
     * 
     * @param removePermissionRequest
     * @return Result of the RemovePermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    RemovePermissionResult removePermission(RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * Adds <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to a function.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> from a function.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @sample AWSLambda.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the configuration of a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param updateAliasRequest
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAliasResult updateAlias(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and
     * resume later from the same location.
     * </p>
     * 
     * @param updateEventSourceMappingRequest
     * @return Result of the UpdateEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to update an
     *         EventSource Mapping in CREATING, or tried to delete a EventSource mapping currently in the UPDATING
     *         state.
     * @sample AWSLambda.UpdateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEventSourceMappingResult updateEventSourceMapping(UpdateEventSourceMappingRequest updateEventSourceMappingRequest);

    /**
     * <p>
     * Updates a Lambda function's code.
     * </p>
     * <p>
     * The function's code is locked when you publish a version. You can't modify the code of a published version, only
     * the unpublished version.
     * </p>
     * 
     * @param updateFunctionCodeRequest
     * @return Result of the UpdateFunctionCode operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">Learn more</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.UpdateFunctionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFunctionCodeResult updateFunctionCode(UpdateFunctionCodeRequest updateFunctionCodeRequest);

    /**
     * <p>
     * Modify the version-specific settings of a Lambda function.
     * </p>
     * <p>
     * These settings can vary between versions of a function and are locked when you publish a version. You can't
     * modify the configuration of a published version, only the unpublished version.
     * </p>
     * <p>
     * To configure function concurrency, use <a>PutFunctionConcurrency</a>. To grant invoke permissions to an account
     * or AWS service, use <a>AddPermission</a>.
     * </p>
     * 
     * @param updateFunctionConfigurationRequest
     * @return Result of the UpdateFunctionConfiguration operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.UpdateFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFunctionConfigurationResult updateFunctionConfiguration(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}

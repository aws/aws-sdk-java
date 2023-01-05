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
package com.amazonaws.services.amplifyuibuilder;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.amplifyuibuilder.model.*;

/**
 * Interface for accessing AWS Amplify UI Builder.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.amplifyuibuilder.AbstractAWSAmplifyUIBuilder} instead.
 * </p>
 * <p>
 * <p>
 * The Amplify UI Builder API provides a programmatic interface for creating and configuring user interface (UI)
 * component libraries and themes for use in your Amplify applications. You can then connect these UI components to an
 * application's backend Amazon Web Services resources.
 * </p>
 * <p>
 * You can also use the Amplify Studio visual designer to create UI components and model data for an app. For more
 * information, see <a href="https://docs.amplify.aws/console/adminui/intro">Introduction</a> in the <i>Amplify
 * Docs</i>.
 * </p>
 * <p>
 * The Amplify Framework is a comprehensive set of SDKs, libraries, tools, and documentation for client app development.
 * For more information, see the <a href="https://docs.amplify.aws/">Amplify Framework</a>. For more information about
 * deploying an Amplify application to Amazon Web Services, see the <a
 * href="https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html">Amplify User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAmplifyUIBuilder {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "amplifyuibuilder";

    /**
     * <p>
     * Creates a new component for an Amplify app.
     * </p>
     * 
     * @param createComponentRequest
     * @return Result of the CreateComponent operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    CreateComponentResult createComponent(CreateComponentRequest createComponentRequest);

    /**
     * <p>
     * Creates a new form for an Amplify app.
     * </p>
     * 
     * @param createFormRequest
     * @return Result of the CreateForm operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.CreateForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateForm" target="_top">AWS
     *      API Documentation</a>
     */
    CreateFormResult createForm(CreateFormRequest createFormRequest);

    /**
     * <p>
     * Creates a theme to apply to the components in an Amplify app.
     * </p>
     * 
     * @param createThemeRequest
     * @return Result of the CreateTheme operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.CreateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateTheme" target="_top">AWS
     *      API Documentation</a>
     */
    CreateThemeResult createTheme(CreateThemeRequest createThemeRequest);

    /**
     * <p>
     * Deletes a component from an Amplify app.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return Result of the DeleteComponent operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteComponent"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteComponentResult deleteComponent(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Deletes a form from an Amplify app.
     * </p>
     * 
     * @param deleteFormRequest
     * @return Result of the DeleteForm operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.DeleteForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteForm" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteFormResult deleteForm(DeleteFormRequest deleteFormRequest);

    /**
     * <p>
     * Deletes a theme from an Amplify app.
     * </p>
     * 
     * @param deleteThemeRequest
     * @return Result of the DeleteTheme operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.DeleteTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteTheme" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteThemeResult deleteTheme(DeleteThemeRequest deleteThemeRequest);

    /**
     * <p>
     * Exchanges an access code for a token.
     * </p>
     * 
     * @param exchangeCodeForTokenRequest
     * @return Result of the ExchangeCodeForToken operation returned by the service.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ExchangeCodeForToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExchangeCodeForToken"
     *      target="_top">AWS API Documentation</a>
     */
    ExchangeCodeForTokenResult exchangeCodeForToken(ExchangeCodeForTokenRequest exchangeCodeForTokenRequest);

    /**
     * <p>
     * Exports component configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportComponentsRequest
     * @return Result of the ExportComponents operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ExportComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportComponents"
     *      target="_top">AWS API Documentation</a>
     */
    ExportComponentsResult exportComponents(ExportComponentsRequest exportComponentsRequest);

    /**
     * <p>
     * Exports form configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportFormsRequest
     * @return Result of the ExportForms operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ExportForms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportForms" target="_top">AWS
     *      API Documentation</a>
     */
    ExportFormsResult exportForms(ExportFormsRequest exportFormsRequest);

    /**
     * <p>
     * Exports theme configurations to code that is ready to integrate into an Amplify app.
     * </p>
     * 
     * @param exportThemesRequest
     * @return Result of the ExportThemes operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ExportThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExportThemes" target="_top">AWS
     *      API Documentation</a>
     */
    ExportThemesResult exportThemes(ExportThemesRequest exportThemesRequest);

    /**
     * <p>
     * Returns an existing component for an Amplify app.
     * </p>
     * 
     * @param getComponentRequest
     * @return Result of the GetComponent operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetComponent" target="_top">AWS
     *      API Documentation</a>
     */
    GetComponentResult getComponent(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Returns an existing form for an Amplify app.
     * </p>
     * 
     * @param getFormRequest
     * @return Result of the GetForm operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.GetForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetForm" target="_top">AWS API
     *      Documentation</a>
     */
    GetFormResult getForm(GetFormRequest getFormRequest);

    /**
     * <p>
     * Returns existing metadata for an Amplify app.
     * </p>
     * 
     * @param getMetadataRequest
     * @return Result of the GetMetadata operation returned by the service.
     * @throws UnauthorizedException
     *         You don't have permission to perform this operation.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.GetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    GetMetadataResult getMetadata(GetMetadataRequest getMetadataRequest);

    /**
     * <p>
     * Returns an existing theme for an Amplify app.
     * </p>
     * 
     * @param getThemeRequest
     * @return Result of the GetTheme operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSAmplifyUIBuilder.GetTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetTheme" target="_top">AWS API
     *      Documentation</a>
     */
    GetThemeResult getTheme(GetThemeRequest getThemeRequest);

    /**
     * <p>
     * Retrieves a list of components for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListComponents"
     *      target="_top">AWS API Documentation</a>
     */
    ListComponentsResult listComponents(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Retrieves a list of forms for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listFormsRequest
     * @return Result of the ListForms operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ListForms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListForms" target="_top">AWS API
     *      Documentation</a>
     */
    ListFormsResult listForms(ListFormsRequest listFormsRequest);

    /**
     * <p>
     * Retrieves a list of themes for a specified Amplify app and backend environment.
     * </p>
     * 
     * @param listThemesRequest
     * @return Result of the ListThemes operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.ListThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ListThemes" target="_top">AWS
     *      API Documentation</a>
     */
    ListThemesResult listThemes(ListThemesRequest listThemesRequest);

    /**
     * <p>
     * Stores the metadata information about a feature on a form or view.
     * </p>
     * 
     * @param putMetadataFlagRequest
     * @return Result of the PutMetadataFlag operation returned by the service.
     * @throws UnauthorizedException
     *         You don't have permission to perform this operation.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.PutMetadataFlag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/PutMetadataFlag"
     *      target="_top">AWS API Documentation</a>
     */
    PutMetadataFlagResult putMetadataFlag(PutMetadataFlagRequest putMetadataFlagRequest);

    /**
     * <p>
     * Refreshes a previously issued access token that might have expired.
     * </p>
     * 
     * @param refreshTokenRequest
     * @return Result of the RefreshToken operation returned by the service.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.RefreshToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/RefreshToken" target="_top">AWS
     *      API Documentation</a>
     */
    RefreshTokenResult refreshToken(RefreshTokenRequest refreshTokenRequest);

    /**
     * <p>
     * Updates an existing component.
     * </p>
     * 
     * @param updateComponentRequest
     * @return Result of the UpdateComponent operation returned by the service.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateComponentResult updateComponent(UpdateComponentRequest updateComponentRequest);

    /**
     * <p>
     * Updates an existing form.
     * </p>
     * 
     * @param updateFormRequest
     * @return Result of the UpdateForm operation returned by the service.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.UpdateForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateForm" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFormResult updateForm(UpdateFormRequest updateFormRequest);

    /**
     * <p>
     * Updates an existing theme.
     * </p>
     * 
     * @param updateThemeRequest
     * @return Result of the UpdateTheme operation returned by the service.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws InternalServerException
     *         An internal error has occurred. Please retry your request.
     * @throws InvalidParameterException
     *         An invalid or out-of-range value was supplied for the input parameter.
     * @sample AWSAmplifyUIBuilder.UpdateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateTheme" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateThemeResult updateTheme(UpdateThemeRequest updateThemeRequest);

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

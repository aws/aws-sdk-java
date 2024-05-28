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
package com.amazonaws.services.b2bi;

import javax.annotation.Generated;

import com.amazonaws.services.b2bi.model.*;

/**
 * Interface for accessing AWS B2BI asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.b2bi.AbstractAWSB2BiAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Amazon Web Services B2B Data Interchange API Reference</i>. It provides descriptions, API request
 * parameters, and the XML response for each of the B2BI API actions.
 * </p>
 * <p>
 * B2BI enables automated exchange of EDI (electronic data interchange) based business-critical transactions at cloud
 * scale, with elasticity and pay-as-you-go pricing. Businesses use EDI documents to exchange transactional data with
 * trading partners, such as suppliers and end customers, using standardized formats such as X12.
 * </p>
 * <note>
 * <p>
 * Rather than actually running a command, you can use the <code>--generate-cli-skeleton</code> parameter with any API
 * call to generate and display a parameter template. You can then use the generated template to customize and use as
 * input on a later command. For details, see <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-skeleton.html#cli-usage-skeleton-generate">Generate
 * and use a parameter skeleton file</a>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSB2BiAsync extends AWSB2Bi {

    /**
     * <p>
     * Instantiates a capability based on the specified parameters. A trading capability contains the information
     * required to transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param createCapabilityRequest
     * @return A Java Future containing the result of the CreateCapability operation returned by the service.
     * @sample AWSB2BiAsync.CreateCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateCapability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCapabilityResult> createCapabilityAsync(CreateCapabilityRequest createCapabilityRequest);

    /**
     * <p>
     * Instantiates a capability based on the specified parameters. A trading capability contains the information
     * required to transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param createCapabilityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCapability operation returned by the service.
     * @sample AWSB2BiAsyncHandler.CreateCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateCapability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCapabilityResult> createCapabilityAsync(CreateCapabilityRequest createCapabilityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCapabilityRequest, CreateCapabilityResult> asyncHandler);

    /**
     * <p>
     * Creates a partnership between a customer and a trading partner, based on the supplied parameters. A partnership
     * represents the connection between you and your trading partner. It ties together a profile and one or more
     * trading capabilities.
     * </p>
     * 
     * @param createPartnershipRequest
     * @return A Java Future containing the result of the CreatePartnership operation returned by the service.
     * @sample AWSB2BiAsync.CreatePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreatePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePartnershipResult> createPartnershipAsync(CreatePartnershipRequest createPartnershipRequest);

    /**
     * <p>
     * Creates a partnership between a customer and a trading partner, based on the supplied parameters. A partnership
     * represents the connection between you and your trading partner. It ties together a profile and one or more
     * trading capabilities.
     * </p>
     * 
     * @param createPartnershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePartnership operation returned by the service.
     * @sample AWSB2BiAsyncHandler.CreatePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreatePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePartnershipResult> createPartnershipAsync(CreatePartnershipRequest createPartnershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePartnershipRequest, CreatePartnershipResult> asyncHandler);

    /**
     * <p>
     * Creates a customer profile. You can have up to five customer profiles, each representing a distinct private
     * network. A profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param createProfileRequest
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSB2BiAsync.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Creates a customer profile. You can have up to five customer profiles, each representing a distinct private
     * network. A profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param createProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSB2BiAsyncHandler.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a transformer. A transformer describes how to process the incoming EDI documents and extract the
     * necessary information to the output file.
     * </p>
     * 
     * @param createTransformerRequest
     * @return A Java Future containing the result of the CreateTransformer operation returned by the service.
     * @sample AWSB2BiAsync.CreateTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTransformerResult> createTransformerAsync(CreateTransformerRequest createTransformerRequest);

    /**
     * <p>
     * Creates a transformer. A transformer describes how to process the incoming EDI documents and extract the
     * necessary information to the output file.
     * </p>
     * 
     * @param createTransformerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTransformer operation returned by the service.
     * @sample AWSB2BiAsyncHandler.CreateTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTransformerResult> createTransformerAsync(CreateTransformerRequest createTransformerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTransformerRequest, CreateTransformerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified capability. A trading capability contains the information required to transform incoming
     * EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param deleteCapabilityRequest
     * @return A Java Future containing the result of the DeleteCapability operation returned by the service.
     * @sample AWSB2BiAsync.DeleteCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteCapability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCapabilityResult> deleteCapabilityAsync(DeleteCapabilityRequest deleteCapabilityRequest);

    /**
     * <p>
     * Deletes the specified capability. A trading capability contains the information required to transform incoming
     * EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param deleteCapabilityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCapability operation returned by the service.
     * @sample AWSB2BiAsyncHandler.DeleteCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteCapability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCapabilityResult> deleteCapabilityAsync(DeleteCapabilityRequest deleteCapabilityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCapabilityRequest, DeleteCapabilityResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified partnership. A partnership represents the connection between you and your trading partner.
     * It ties together a profile and one or more trading capabilities.
     * </p>
     * 
     * @param deletePartnershipRequest
     * @return A Java Future containing the result of the DeletePartnership operation returned by the service.
     * @sample AWSB2BiAsync.DeletePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeletePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePartnershipResult> deletePartnershipAsync(DeletePartnershipRequest deletePartnershipRequest);

    /**
     * <p>
     * Deletes the specified partnership. A partnership represents the connection between you and your trading partner.
     * It ties together a profile and one or more trading capabilities.
     * </p>
     * 
     * @param deletePartnershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePartnership operation returned by the service.
     * @sample AWSB2BiAsyncHandler.DeletePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeletePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePartnershipResult> deletePartnershipAsync(DeletePartnershipRequest deletePartnershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePartnershipRequest, DeletePartnershipResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified profile. A profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSB2BiAsync.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes the specified profile. A profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param deleteProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSB2BiAsyncHandler.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified transformer. A transformer describes how to process the incoming EDI documents and extract
     * the necessary information to the output file.
     * </p>
     * 
     * @param deleteTransformerRequest
     * @return A Java Future containing the result of the DeleteTransformer operation returned by the service.
     * @sample AWSB2BiAsync.DeleteTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTransformerResult> deleteTransformerAsync(DeleteTransformerRequest deleteTransformerRequest);

    /**
     * <p>
     * Deletes the specified transformer. A transformer describes how to process the incoming EDI documents and extract
     * the necessary information to the output file.
     * </p>
     * 
     * @param deleteTransformerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTransformer operation returned by the service.
     * @sample AWSB2BiAsyncHandler.DeleteTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTransformerResult> deleteTransformerAsync(DeleteTransformerRequest deleteTransformerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTransformerRequest, DeleteTransformerResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details for the specified capability. A trading capability contains the information required to
     * transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param getCapabilityRequest
     * @return A Java Future containing the result of the GetCapability operation returned by the service.
     * @sample AWSB2BiAsync.GetCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetCapability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCapabilityResult> getCapabilityAsync(GetCapabilityRequest getCapabilityRequest);

    /**
     * <p>
     * Retrieves the details for the specified capability. A trading capability contains the information required to
     * transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param getCapabilityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCapability operation returned by the service.
     * @sample AWSB2BiAsyncHandler.GetCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetCapability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCapabilityResult> getCapabilityAsync(GetCapabilityRequest getCapabilityRequest,
            com.amazonaws.handlers.AsyncHandler<GetCapabilityRequest, GetCapabilityResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details for a partnership, based on the partner and profile IDs specified. A partnership represents
     * the connection between you and your trading partner. It ties together a profile and one or more trading
     * capabilities.
     * </p>
     * 
     * @param getPartnershipRequest
     * @return A Java Future containing the result of the GetPartnership operation returned by the service.
     * @sample AWSB2BiAsync.GetPartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetPartnership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPartnershipResult> getPartnershipAsync(GetPartnershipRequest getPartnershipRequest);

    /**
     * <p>
     * Retrieves the details for a partnership, based on the partner and profile IDs specified. A partnership represents
     * the connection between you and your trading partner. It ties together a profile and one or more trading
     * capabilities.
     * </p>
     * 
     * @param getPartnershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPartnership operation returned by the service.
     * @sample AWSB2BiAsyncHandler.GetPartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetPartnership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPartnershipResult> getPartnershipAsync(GetPartnershipRequest getPartnershipRequest,
            com.amazonaws.handlers.AsyncHandler<GetPartnershipRequest, GetPartnershipResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details for the profile specified by the profile ID. A profile is the mechanism used to create the
     * concept of a private network.
     * </p>
     * 
     * @param getProfileRequest
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AWSB2BiAsync.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Retrieves the details for the profile specified by the profile ID. A profile is the mechanism used to create the
     * concept of a private network.
     * </p>
     * 
     * @param getProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AWSB2BiAsyncHandler.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details for the transformer specified by the transformer ID. A transformer describes how to process
     * the incoming EDI documents and extract the necessary information to the output file.
     * </p>
     * 
     * @param getTransformerRequest
     * @return A Java Future containing the result of the GetTransformer operation returned by the service.
     * @sample AWSB2BiAsync.GetTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTransformerResult> getTransformerAsync(GetTransformerRequest getTransformerRequest);

    /**
     * <p>
     * Retrieves the details for the transformer specified by the transformer ID. A transformer describes how to process
     * the incoming EDI documents and extract the necessary information to the output file.
     * </p>
     * 
     * @param getTransformerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTransformer operation returned by the service.
     * @sample AWSB2BiAsyncHandler.GetTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTransformerResult> getTransformerAsync(GetTransformerRequest getTransformerRequest,
            com.amazonaws.handlers.AsyncHandler<GetTransformerRequest, GetTransformerResult> asyncHandler);

    /**
     * <p>
     * Returns the details of the transformer run, based on the Transformer job ID.
     * </p>
     * 
     * @param getTransformerJobRequest
     * @return A Java Future containing the result of the GetTransformerJob operation returned by the service.
     * @sample AWSB2BiAsync.GetTransformerJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetTransformerJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTransformerJobResult> getTransformerJobAsync(GetTransformerJobRequest getTransformerJobRequest);

    /**
     * <p>
     * Returns the details of the transformer run, based on the Transformer job ID.
     * </p>
     * 
     * @param getTransformerJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTransformerJob operation returned by the service.
     * @sample AWSB2BiAsyncHandler.GetTransformerJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetTransformerJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTransformerJobResult> getTransformerJobAsync(GetTransformerJobRequest getTransformerJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetTransformerJobRequest, GetTransformerJobResult> asyncHandler);

    /**
     * <p>
     * Lists the capabilities associated with your Amazon Web Services account for your current or specified region. A
     * trading capability contains the information required to transform incoming EDI documents into JSON or XML
     * outputs.
     * </p>
     * 
     * @param listCapabilitiesRequest
     * @return A Java Future containing the result of the ListCapabilities operation returned by the service.
     * @sample AWSB2BiAsync.ListCapabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListCapabilities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCapabilitiesResult> listCapabilitiesAsync(ListCapabilitiesRequest listCapabilitiesRequest);

    /**
     * <p>
     * Lists the capabilities associated with your Amazon Web Services account for your current or specified region. A
     * trading capability contains the information required to transform incoming EDI documents into JSON or XML
     * outputs.
     * </p>
     * 
     * @param listCapabilitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCapabilities operation returned by the service.
     * @sample AWSB2BiAsyncHandler.ListCapabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListCapabilities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCapabilitiesResult> listCapabilitiesAsync(ListCapabilitiesRequest listCapabilitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCapabilitiesRequest, ListCapabilitiesResult> asyncHandler);

    /**
     * <p>
     * Lists the partnerships associated with your Amazon Web Services account for your current or specified region. A
     * partnership represents the connection between you and your trading partner. It ties together a profile and one or
     * more trading capabilities.
     * </p>
     * 
     * @param listPartnershipsRequest
     * @return A Java Future containing the result of the ListPartnerships operation returned by the service.
     * @sample AWSB2BiAsync.ListPartnerships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListPartnerships" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPartnershipsResult> listPartnershipsAsync(ListPartnershipsRequest listPartnershipsRequest);

    /**
     * <p>
     * Lists the partnerships associated with your Amazon Web Services account for your current or specified region. A
     * partnership represents the connection between you and your trading partner. It ties together a profile and one or
     * more trading capabilities.
     * </p>
     * 
     * @param listPartnershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPartnerships operation returned by the service.
     * @sample AWSB2BiAsyncHandler.ListPartnerships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListPartnerships" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPartnershipsResult> listPartnershipsAsync(ListPartnershipsRequest listPartnershipsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPartnershipsRequest, ListPartnershipsResult> asyncHandler);

    /**
     * <p>
     * Lists the profiles associated with your Amazon Web Services account for your current or specified region. A
     * profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param listProfilesRequest
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSB2BiAsync.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest);

    /**
     * <p>
     * Lists the profiles associated with your Amazon Web Services account for your current or specified region. A
     * profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param listProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSB2BiAsyncHandler.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a
     * capability, partnership, profile, or transformer.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSB2BiAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a
     * capability, partnership, profile, or transformer.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSB2BiAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the available transformers. A transformer describes how to process the incoming EDI documents and extract
     * the necessary information to the output file.
     * </p>
     * 
     * @param listTransformersRequest
     * @return A Java Future containing the result of the ListTransformers operation returned by the service.
     * @sample AWSB2BiAsync.ListTransformers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListTransformers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTransformersResult> listTransformersAsync(ListTransformersRequest listTransformersRequest);

    /**
     * <p>
     * Lists the available transformers. A transformer describes how to process the incoming EDI documents and extract
     * the necessary information to the output file.
     * </p>
     * 
     * @param listTransformersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTransformers operation returned by the service.
     * @sample AWSB2BiAsyncHandler.ListTransformers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListTransformers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTransformersResult> listTransformersAsync(ListTransformersRequest listTransformersRequest,
            com.amazonaws.handlers.AsyncHandler<ListTransformersRequest, ListTransformersResult> asyncHandler);

    /**
     * <p>
     * Runs a job, using a transformer, to parse input EDI (electronic data interchange) file into the output structures
     * used by Amazon Web Services B2BI Data Interchange.
     * </p>
     * <p>
     * If you only want to transform EDI (electronic data interchange) documents, you don't need to create profiles,
     * partnerships or capabilities. Just create and configure a transformer, and then run the
     * <code>StartTransformerJob</code> API to process your files.
     * </p>
     * 
     * @param startTransformerJobRequest
     * @return A Java Future containing the result of the StartTransformerJob operation returned by the service.
     * @sample AWSB2BiAsync.StartTransformerJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/StartTransformerJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTransformerJobResult> startTransformerJobAsync(StartTransformerJobRequest startTransformerJobRequest);

    /**
     * <p>
     * Runs a job, using a transformer, to parse input EDI (electronic data interchange) file into the output structures
     * used by Amazon Web Services B2BI Data Interchange.
     * </p>
     * <p>
     * If you only want to transform EDI (electronic data interchange) documents, you don't need to create profiles,
     * partnerships or capabilities. Just create and configure a transformer, and then run the
     * <code>StartTransformerJob</code> API to process your files.
     * </p>
     * 
     * @param startTransformerJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTransformerJob operation returned by the service.
     * @sample AWSB2BiAsyncHandler.StartTransformerJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/StartTransformerJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTransformerJobResult> startTransformerJobAsync(StartTransformerJobRequest startTransformerJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartTransformerJobRequest, StartTransformerJobResult> asyncHandler);

    /**
     * <p>
     * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are
     * capability, partnership, profile, transformers and other entities.
     * </p>
     * <p>
     * There is no response returned from this call.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSB2BiAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are
     * capability, partnership, profile, transformers and other entities.
     * </p>
     * <p>
     * There is no response returned from this call.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSB2BiAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Maps the input file according to the provided template file. The API call downloads the file contents from the
     * Amazon S3 location, and passes the contents in as a string, to the <code>inputFileContent</code> parameter.
     * </p>
     * 
     * @param testMappingRequest
     * @return A Java Future containing the result of the TestMapping operation returned by the service.
     * @sample AWSB2BiAsync.TestMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestMapping" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestMappingResult> testMappingAsync(TestMappingRequest testMappingRequest);

    /**
     * <p>
     * Maps the input file according to the provided template file. The API call downloads the file contents from the
     * Amazon S3 location, and passes the contents in as a string, to the <code>inputFileContent</code> parameter.
     * </p>
     * 
     * @param testMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestMapping operation returned by the service.
     * @sample AWSB2BiAsyncHandler.TestMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestMapping" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestMappingResult> testMappingAsync(TestMappingRequest testMappingRequest,
            com.amazonaws.handlers.AsyncHandler<TestMappingRequest, TestMappingResult> asyncHandler);

    /**
     * <p>
     * Parses the input EDI (electronic data interchange) file. The input file has a file size limit of 250 KB.
     * </p>
     * 
     * @param testParsingRequest
     * @return A Java Future containing the result of the TestParsing operation returned by the service.
     * @sample AWSB2BiAsync.TestParsing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestParsing" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestParsingResult> testParsingAsync(TestParsingRequest testParsingRequest);

    /**
     * <p>
     * Parses the input EDI (electronic data interchange) file. The input file has a file size limit of 250 KB.
     * </p>
     * 
     * @param testParsingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestParsing operation returned by the service.
     * @sample AWSB2BiAsyncHandler.TestParsing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestParsing" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestParsingResult> testParsingAsync(TestParsingRequest testParsingRequest,
            com.amazonaws.handlers.AsyncHandler<TestParsingRequest, TestParsingResult> asyncHandler);

    /**
     * <p>
     * Detaches a key-value pair from the specified resource, as identified by its Amazon Resource Name (ARN). Resources
     * are capability, partnership, profile, transformers and other entities.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSB2BiAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Detaches a key-value pair from the specified resource, as identified by its Amazon Resource Name (ARN). Resources
     * are capability, partnership, profile, transformers and other entities.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSB2BiAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates some of the parameters for a capability, based on the specified parameters. A trading capability contains
     * the information required to transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param updateCapabilityRequest
     * @return A Java Future containing the result of the UpdateCapability operation returned by the service.
     * @sample AWSB2BiAsync.UpdateCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateCapability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCapabilityResult> updateCapabilityAsync(UpdateCapabilityRequest updateCapabilityRequest);

    /**
     * <p>
     * Updates some of the parameters for a capability, based on the specified parameters. A trading capability contains
     * the information required to transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param updateCapabilityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCapability operation returned by the service.
     * @sample AWSB2BiAsyncHandler.UpdateCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateCapability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCapabilityResult> updateCapabilityAsync(UpdateCapabilityRequest updateCapabilityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCapabilityRequest, UpdateCapabilityResult> asyncHandler);

    /**
     * <p>
     * Updates some of the parameters for a partnership between a customer and trading partner. A partnership represents
     * the connection between you and your trading partner. It ties together a profile and one or more trading
     * capabilities.
     * </p>
     * 
     * @param updatePartnershipRequest
     * @return A Java Future containing the result of the UpdatePartnership operation returned by the service.
     * @sample AWSB2BiAsync.UpdatePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdatePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePartnershipResult> updatePartnershipAsync(UpdatePartnershipRequest updatePartnershipRequest);

    /**
     * <p>
     * Updates some of the parameters for a partnership between a customer and trading partner. A partnership represents
     * the connection between you and your trading partner. It ties together a profile and one or more trading
     * capabilities.
     * </p>
     * 
     * @param updatePartnershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePartnership operation returned by the service.
     * @sample AWSB2BiAsyncHandler.UpdatePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdatePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePartnershipResult> updatePartnershipAsync(UpdatePartnershipRequest updatePartnershipRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePartnershipRequest, UpdatePartnershipResult> asyncHandler);

    /**
     * <p>
     * Updates the specified parameters for a profile. A profile is the mechanism used to create the concept of a
     * private network.
     * </p>
     * 
     * @param updateProfileRequest
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AWSB2BiAsync.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Updates the specified parameters for a profile. A profile is the mechanism used to create the concept of a
     * private network.
     * </p>
     * 
     * @param updateProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AWSB2BiAsyncHandler.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler);

    /**
     * <p>
     * Updates the specified parameters for a transformer. A transformer describes how to process the incoming EDI
     * documents and extract the necessary information to the output file.
     * </p>
     * 
     * @param updateTransformerRequest
     * @return A Java Future containing the result of the UpdateTransformer operation returned by the service.
     * @sample AWSB2BiAsync.UpdateTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTransformerResult> updateTransformerAsync(UpdateTransformerRequest updateTransformerRequest);

    /**
     * <p>
     * Updates the specified parameters for a transformer. A transformer describes how to process the incoming EDI
     * documents and extract the necessary information to the output file.
     * </p>
     * 
     * @param updateTransformerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTransformer operation returned by the service.
     * @sample AWSB2BiAsyncHandler.UpdateTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTransformerResult> updateTransformerAsync(UpdateTransformerRequest updateTransformerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTransformerRequest, UpdateTransformerResult> asyncHandler);

}

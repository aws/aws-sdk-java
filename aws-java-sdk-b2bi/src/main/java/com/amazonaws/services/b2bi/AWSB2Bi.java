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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.b2bi.model.*;

/**
 * Interface for accessing AWS B2BI.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.b2bi.AbstractAWSB2Bi} instead.
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
public interface AWSB2Bi {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "b2bi";

    /**
     * <p>
     * Instantiates a capability based on the specified parameters. A trading capability contains the information
     * required to transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param createCapabilityRequest
     * @return Result of the CreateCapability operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.CreateCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateCapability" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCapabilityResult createCapability(CreateCapabilityRequest createCapabilityRequest);

    /**
     * <p>
     * Creates a partnership between a customer and a trading partner, based on the supplied parameters. A partnership
     * represents the connection between you and your trading partner. It ties together a profile and one or more
     * trading capabilities.
     * </p>
     * 
     * @param createPartnershipRequest
     * @return Result of the CreatePartnership operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.CreatePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreatePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePartnershipResult createPartnership(CreatePartnershipRequest createPartnershipRequest);

    /**
     * <p>
     * Creates a customer profile. You can have up to five customer profiles, each representing a distinct private
     * network. A profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProfileResult createProfile(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Creates a transformer. A transformer describes how to process the incoming EDI documents and extract the
     * necessary information to the output file.
     * </p>
     * 
     * @param createTransformerRequest
     * @return Result of the CreateTransformer operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.CreateTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTransformerResult createTransformer(CreateTransformerRequest createTransformerRequest);

    /**
     * <p>
     * Deletes the specified capability. A trading capability contains the information required to transform incoming
     * EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param deleteCapabilityRequest
     * @return Result of the DeleteCapability operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.DeleteCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteCapability" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCapabilityResult deleteCapability(DeleteCapabilityRequest deleteCapabilityRequest);

    /**
     * <p>
     * Deletes the specified partnership. A partnership represents the connection between you and your trading partner.
     * It ties together a profile and one or more trading capabilities.
     * </p>
     * 
     * @param deletePartnershipRequest
     * @return Result of the DeletePartnership operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.DeletePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeletePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePartnershipResult deletePartnership(DeletePartnershipRequest deletePartnershipRequest);

    /**
     * <p>
     * Deletes the specified profile. A profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteProfile" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProfileResult deleteProfile(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes the specified transformer. A transformer describes how to process the incoming EDI documents and extract
     * the necessary information to the output file.
     * </p>
     * 
     * @param deleteTransformerRequest
     * @return Result of the DeleteTransformer operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.DeleteTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTransformerResult deleteTransformer(DeleteTransformerRequest deleteTransformerRequest);

    /**
     * <p>
     * Retrieves the details for the specified capability. A trading capability contains the information required to
     * transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param getCapabilityRequest
     * @return Result of the GetCapability operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetCapability" target="_top">AWS API
     *      Documentation</a>
     */
    GetCapabilityResult getCapability(GetCapabilityRequest getCapabilityRequest);

    /**
     * <p>
     * Retrieves the details for a partnership, based on the partner and profile IDs specified. A partnership represents
     * the connection between you and your trading partner. It ties together a profile and one or more trading
     * capabilities.
     * </p>
     * 
     * @param getPartnershipRequest
     * @return Result of the GetPartnership operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetPartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetPartnership" target="_top">AWS API
     *      Documentation</a>
     */
    GetPartnershipResult getPartnership(GetPartnershipRequest getPartnershipRequest);

    /**
     * <p>
     * Retrieves the details for the profile specified by the profile ID. A profile is the mechanism used to create the
     * concept of a private network.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetProfileResult getProfile(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Retrieves the details for the transformer specified by the transformer ID. A transformer describes how to process
     * the incoming EDI documents and extract the necessary information to the output file.
     * </p>
     * 
     * @param getTransformerRequest
     * @return Result of the GetTransformer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    GetTransformerResult getTransformer(GetTransformerRequest getTransformerRequest);

    /**
     * <p>
     * Returns the details of the transformer run, based on the Transformer job ID.
     * </p>
     * 
     * @param getTransformerJobRequest
     * @return Result of the GetTransformerJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetTransformerJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetTransformerJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetTransformerJobResult getTransformerJob(GetTransformerJobRequest getTransformerJobRequest);

    /**
     * <p>
     * Lists the capabilities associated with your Amazon Web Services account for your current or specified region. A
     * trading capability contains the information required to transform incoming EDI documents into JSON or XML
     * outputs.
     * </p>
     * 
     * @param listCapabilitiesRequest
     * @return Result of the ListCapabilities operation returned by the service.
     * @sample AWSB2Bi.ListCapabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListCapabilities" target="_top">AWS API
     *      Documentation</a>
     */
    ListCapabilitiesResult listCapabilities(ListCapabilitiesRequest listCapabilitiesRequest);

    /**
     * <p>
     * Lists the partnerships associated with your Amazon Web Services account for your current or specified region. A
     * partnership represents the connection between you and your trading partner. It ties together a profile and one or
     * more trading capabilities.
     * </p>
     * 
     * @param listPartnershipsRequest
     * @return Result of the ListPartnerships operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.ListPartnerships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListPartnerships" target="_top">AWS API
     *      Documentation</a>
     */
    ListPartnershipsResult listPartnerships(ListPartnershipsRequest listPartnershipsRequest);

    /**
     * <p>
     * Lists the profiles associated with your Amazon Web Services account for your current or specified region. A
     * profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param listProfilesRequest
     * @return Result of the ListProfiles operation returned by the service.
     * @sample AWSB2Bi.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    ListProfilesResult listProfiles(ListProfilesRequest listProfilesRequest);

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a
     * capability, partnership, profile, or transformer.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the available transformers. A transformer describes how to process the incoming EDI documents and extract
     * the necessary information to the output file.
     * </p>
     * 
     * @param listTransformersRequest
     * @return Result of the ListTransformers operation returned by the service.
     * @sample AWSB2Bi.ListTransformers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListTransformers" target="_top">AWS API
     *      Documentation</a>
     */
    ListTransformersResult listTransformers(ListTransformersRequest listTransformersRequest);

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
     * @return Result of the StartTransformerJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.StartTransformerJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/StartTransformerJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartTransformerJobResult startTransformerJob(StartTransformerJobRequest startTransformerJobRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Maps the input file according to the provided template file. The API call downloads the file contents from the
     * Amazon S3 location, and passes the contents in as a string, to the <code>inputFileContent</code> parameter.
     * </p>
     * 
     * @param testMappingRequest
     * @return Result of the TestMapping operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.TestMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestMapping" target="_top">AWS API
     *      Documentation</a>
     */
    TestMappingResult testMapping(TestMappingRequest testMappingRequest);

    /**
     * <p>
     * Parses the input EDI (electronic data interchange) file. The input file has a file size limit of 250 KB.
     * </p>
     * 
     * @param testParsingRequest
     * @return Result of the TestParsing operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.TestParsing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestParsing" target="_top">AWS API
     *      Documentation</a>
     */
    TestParsingResult testParsing(TestParsingRequest testParsingRequest);

    /**
     * <p>
     * Detaches a key-value pair from the specified resource, as identified by its Amazon Resource Name (ARN). Resources
     * are capability, partnership, profile, transformers and other entities.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates some of the parameters for a capability, based on the specified parameters. A trading capability contains
     * the information required to transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param updateCapabilityRequest
     * @return Result of the UpdateCapability operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UpdateCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateCapability" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCapabilityResult updateCapability(UpdateCapabilityRequest updateCapabilityRequest);

    /**
     * <p>
     * Updates some of the parameters for a partnership between a customer and trading partner. A partnership represents
     * the connection between you and your trading partner. It ties together a profile and one or more trading
     * capabilities.
     * </p>
     * 
     * @param updatePartnershipRequest
     * @return Result of the UpdatePartnership operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UpdatePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdatePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePartnershipResult updatePartnership(UpdatePartnershipRequest updatePartnershipRequest);

    /**
     * <p>
     * Updates the specified parameters for a profile. A profile is the mechanism used to create the concept of a
     * private network.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProfileResult updateProfile(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Updates the specified parameters for a transformer. A transformer describes how to process the incoming EDI
     * documents and extract the necessary information to the output file.
     * </p>
     * 
     * @param updateTransformerRequest
     * @return Result of the UpdateTransformer operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UpdateTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTransformerResult updateTransformer(UpdateTransformerRequest updateTransformerRequest);

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

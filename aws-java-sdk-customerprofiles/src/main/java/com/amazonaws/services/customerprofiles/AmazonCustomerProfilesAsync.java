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
package com.amazonaws.services.customerprofiles;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;

/**
 * Interface for accessing Customer Profiles asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.customerprofiles.AbstractAmazonCustomerProfilesAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Connect Customer Profiles</fullname>
 * <p>
 * Welcome to the Amazon Connect Customer Profiles API Reference. This guide provides information about the Amazon
 * Connect Customer Profiles API, including supported operations, data types, parameters, and schemas.
 * </p>
 * <p>
 * Amazon Connect Customer Profiles is a unified customer profile for your contact center that has pre-built connectors
 * powered by AppFlow that make it easy to combine customer information from third party applications, such as
 * Salesforce (CRM), ServiceNow (ITSM), and your enterprise resource planning (ERP), with contact history from your
 * Amazon Connect contact center.
 * </p>
 * <p>
 * If you're new to Amazon Connect , you might find it helpful to also review the <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/what-is-amazon-connect.html">Amazon Connect Administrator
 * Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCustomerProfilesAsync extends AmazonCustomerProfiles {

    /**
     * <p>
     * Associates a new key value with a specific profile, such as a Contact Trace Record (CTR) ContactId.
     * </p>
     * <p>
     * A profile object can have a single unique key and any number of additional keys that can be used to identify the
     * profile that it belongs to.
     * </p>
     * 
     * @param addProfileKeyRequest
     * @return A Java Future containing the result of the AddProfileKey operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.AddProfileKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AddProfileKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddProfileKeyResult> addProfileKeyAsync(AddProfileKeyRequest addProfileKeyRequest);

    /**
     * <p>
     * Associates a new key value with a specific profile, such as a Contact Trace Record (CTR) ContactId.
     * </p>
     * <p>
     * A profile object can have a single unique key and any number of additional keys that can be used to identify the
     * profile that it belongs to.
     * </p>
     * 
     * @param addProfileKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddProfileKey operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.AddProfileKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AddProfileKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddProfileKeyResult> addProfileKeyAsync(AddProfileKeyRequest addProfileKeyRequest,
            com.amazonaws.handlers.AsyncHandler<AddProfileKeyRequest, AddProfileKeyResult> asyncHandler);

    /**
     * <p>
     * Creates a domain, which is a container for all customer data, such as customer profile attributes, object types,
     * profile keys, and encryption keys. You can create multiple domains, and each domain can have multiple third-party
     * integrations.
     * </p>
     * <p>
     * Each Amazon Connect instance can be associated with only one domain. Multiple Amazon Connect instances can be
     * associated with one domain.
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a domain, which is a container for all customer data, such as customer profile attributes, object types,
     * profile keys, and encryption keys. You can create multiple domains, and each domain can have multiple third-party
     * integrations.
     * </p>
     * <p>
     * Each Amazon Connect instance can be associated with only one domain. Multiple Amazon Connect instances can be
     * associated with one domain.
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Creates a standard profile.
     * </p>
     * <p>
     * A standard profile represents the following attributes for a customer profile in a domain.
     * </p>
     * 
     * @param createProfileRequest
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Creates a standard profile.
     * </p>
     * <p>
     * A standard profile represents the following attributes for a customer profile in a domain.
     * </p>
     * 
     * @param createProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific domain and all of its customer data, such as customer profile attributes and their related
     * objects.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes a specific domain and all of its customer data, such as customer profile attributes and their related
     * objects.
     * </p>
     * 
     * @param deleteDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

    /**
     * <p>
     * Removes an integration from a specific domain.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @return A Java Future containing the result of the DeleteIntegration operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.DeleteIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest deleteIntegrationRequest);

    /**
     * <p>
     * Removes an integration from a specific domain.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntegration operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.DeleteIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest deleteIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, DeleteIntegrationResult> asyncHandler);

    /**
     * <p>
     * Deletes the standard customer profile and all data pertaining to the profile.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes the standard customer profile and all data pertaining to the profile.
     * </p>
     * 
     * @param deleteProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler);

    /**
     * <p>
     * Removes a searchable key from a customer profile.
     * </p>
     * 
     * @param deleteProfileKeyRequest
     * @return A Java Future containing the result of the DeleteProfileKey operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.DeleteProfileKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileKeyResult> deleteProfileKeyAsync(DeleteProfileKeyRequest deleteProfileKeyRequest);

    /**
     * <p>
     * Removes a searchable key from a customer profile.
     * </p>
     * 
     * @param deleteProfileKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfileKey operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.DeleteProfileKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileKeyResult> deleteProfileKeyAsync(DeleteProfileKeyRequest deleteProfileKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileKeyRequest, DeleteProfileKeyResult> asyncHandler);

    /**
     * <p>
     * Removes an object associated with a profile of a given ProfileObjectType.
     * </p>
     * 
     * @param deleteProfileObjectRequest
     * @return A Java Future containing the result of the DeleteProfileObject operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.DeleteProfileObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileObject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileObjectResult> deleteProfileObjectAsync(DeleteProfileObjectRequest deleteProfileObjectRequest);

    /**
     * <p>
     * Removes an object associated with a profile of a given ProfileObjectType.
     * </p>
     * 
     * @param deleteProfileObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfileObject operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.DeleteProfileObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileObject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileObjectResult> deleteProfileObjectAsync(DeleteProfileObjectRequest deleteProfileObjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileObjectRequest, DeleteProfileObjectResult> asyncHandler);

    /**
     * <p>
     * Removes a ProfileObjectType from a specific domain as well as removes all the ProfileObjects of that type. It
     * also disables integrations from this specific ProfileObjectType. In addition, it scrubs all of the fields of the
     * standard profile that were populated from this ProfileObjectType.
     * </p>
     * 
     * @param deleteProfileObjectTypeRequest
     * @return A Java Future containing the result of the DeleteProfileObjectType operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.DeleteProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileObjectTypeResult> deleteProfileObjectTypeAsync(DeleteProfileObjectTypeRequest deleteProfileObjectTypeRequest);

    /**
     * <p>
     * Removes a ProfileObjectType from a specific domain as well as removes all the ProfileObjects of that type. It
     * also disables integrations from this specific ProfileObjectType. In addition, it scrubs all of the fields of the
     * standard profile that were populated from this ProfileObjectType.
     * </p>
     * 
     * @param deleteProfileObjectTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfileObjectType operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.DeleteProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileObjectTypeResult> deleteProfileObjectTypeAsync(DeleteProfileObjectTypeRequest deleteProfileObjectTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileObjectTypeRequest, DeleteProfileObjectTypeResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific domain.
     * </p>
     * 
     * @param getDomainRequest
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Returns information about a specific domain.
     * </p>
     * 
     * @param getDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler);

    /**
     * <p>
     * Returns an integration for a domain.
     * </p>
     * 
     * @param getIntegrationRequest
     * @return A Java Future containing the result of the GetIntegration operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.GetIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest getIntegrationRequest);

    /**
     * <p>
     * Returns an integration for a domain.
     * </p>
     * 
     * @param getIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntegration operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.GetIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest getIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and subject to change.
     * </p>
     * <p>
     * Before calling this API, use <a
     * href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_CreateDomain.html">CreateDomain</a> or
     * <a href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_UpdateDomain.html">UpdateDomain</a>
     * to enable identity resolution: set <code>Matching</code> to true.
     * </p>
     * <p>
     * GetMatches returns potentially matching profiles, based on the results of the latest run of a machine learning
     * process.
     * </p>
     * <important>
     * <p>
     * Amazon Connect runs a batch process every Saturday at 12AM UTC to identify matching profiles. The results are
     * returned up to seven days after the Saturday run.
     * </p>
     * </important>
     * <p>
     * Amazon Connect uses the following profile attributes to identify matches:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PhoneNumber
     * </p>
     * </li>
     * <li>
     * <p>
     * HomePhoneNumber
     * </p>
     * </li>
     * <li>
     * <p>
     * BusinessPhoneNumber
     * </p>
     * </li>
     * <li>
     * <p>
     * MobilePhoneNumber
     * </p>
     * </li>
     * <li>
     * <p>
     * EmailAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * PersonalEmailAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * BusinessEmailAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * FullName
     * </p>
     * </li>
     * <li>
     * <p>
     * BusinessName
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMatchesRequest
     * @return A Java Future containing the result of the GetMatches operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.GetMatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetMatches" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMatchesResult> getMatchesAsync(GetMatchesRequest getMatchesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and subject to change.
     * </p>
     * <p>
     * Before calling this API, use <a
     * href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_CreateDomain.html">CreateDomain</a> or
     * <a href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_UpdateDomain.html">UpdateDomain</a>
     * to enable identity resolution: set <code>Matching</code> to true.
     * </p>
     * <p>
     * GetMatches returns potentially matching profiles, based on the results of the latest run of a machine learning
     * process.
     * </p>
     * <important>
     * <p>
     * Amazon Connect runs a batch process every Saturday at 12AM UTC to identify matching profiles. The results are
     * returned up to seven days after the Saturday run.
     * </p>
     * </important>
     * <p>
     * Amazon Connect uses the following profile attributes to identify matches:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PhoneNumber
     * </p>
     * </li>
     * <li>
     * <p>
     * HomePhoneNumber
     * </p>
     * </li>
     * <li>
     * <p>
     * BusinessPhoneNumber
     * </p>
     * </li>
     * <li>
     * <p>
     * MobilePhoneNumber
     * </p>
     * </li>
     * <li>
     * <p>
     * EmailAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * PersonalEmailAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * BusinessEmailAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * FullName
     * </p>
     * </li>
     * <li>
     * <p>
     * BusinessName
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMatchesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMatches operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.GetMatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetMatches" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMatchesResult> getMatchesAsync(GetMatchesRequest getMatchesRequest,
            com.amazonaws.handlers.AsyncHandler<GetMatchesRequest, GetMatchesResult> asyncHandler);

    /**
     * <p>
     * Returns the object types for a specific domain.
     * </p>
     * 
     * @param getProfileObjectTypeRequest
     * @return A Java Future containing the result of the GetProfileObjectType operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.GetProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileObjectTypeResult> getProfileObjectTypeAsync(GetProfileObjectTypeRequest getProfileObjectTypeRequest);

    /**
     * <p>
     * Returns the object types for a specific domain.
     * </p>
     * 
     * @param getProfileObjectTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfileObjectType operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.GetProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileObjectTypeResult> getProfileObjectTypeAsync(GetProfileObjectTypeRequest getProfileObjectTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileObjectTypeRequest, GetProfileObjectTypeResult> asyncHandler);

    /**
     * <p>
     * Returns the template information for a specific object type.
     * </p>
     * <p>
     * A template is a predefined ProfileObjectType, such as “Salesforce-Account” or “Salesforce-Contact.” When a user
     * sends a ProfileObject, using the PutProfileObject API, with an ObjectTypeName that matches one of the
     * TemplateIds, it uses the mappings from the template.
     * </p>
     * 
     * @param getProfileObjectTypeTemplateRequest
     * @return A Java Future containing the result of the GetProfileObjectTypeTemplate operation returned by the
     *         service.
     * @sample AmazonCustomerProfilesAsync.GetProfileObjectTypeTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetProfileObjectTypeTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileObjectTypeTemplateResult> getProfileObjectTypeTemplateAsync(
            GetProfileObjectTypeTemplateRequest getProfileObjectTypeTemplateRequest);

    /**
     * <p>
     * Returns the template information for a specific object type.
     * </p>
     * <p>
     * A template is a predefined ProfileObjectType, such as “Salesforce-Account” or “Salesforce-Contact.” When a user
     * sends a ProfileObject, using the PutProfileObject API, with an ObjectTypeName that matches one of the
     * TemplateIds, it uses the mappings from the template.
     * </p>
     * 
     * @param getProfileObjectTypeTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfileObjectTypeTemplate operation returned by the
     *         service.
     * @sample AmazonCustomerProfilesAsyncHandler.GetProfileObjectTypeTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetProfileObjectTypeTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileObjectTypeTemplateResult> getProfileObjectTypeTemplateAsync(
            GetProfileObjectTypeTemplateRequest getProfileObjectTypeTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileObjectTypeTemplateRequest, GetProfileObjectTypeTemplateResult> asyncHandler);

    /**
     * <p>
     * Lists all of the integrations associated to a specific URI in the AWS account.
     * </p>
     * 
     * @param listAccountIntegrationsRequest
     * @return A Java Future containing the result of the ListAccountIntegrations operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.ListAccountIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListAccountIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountIntegrationsResult> listAccountIntegrationsAsync(ListAccountIntegrationsRequest listAccountIntegrationsRequest);

    /**
     * <p>
     * Lists all of the integrations associated to a specific URI in the AWS account.
     * </p>
     * 
     * @param listAccountIntegrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountIntegrations operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.ListAccountIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListAccountIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountIntegrationsResult> listAccountIntegrationsAsync(ListAccountIntegrationsRequest listAccountIntegrationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountIntegrationsRequest, ListAccountIntegrationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the domains for an AWS account that have been created.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListDomains" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Returns a list of all the domains for an AWS account that have been created.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListDomains" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the integrations in your domain.
     * </p>
     * 
     * @param listIntegrationsRequest
     * @return A Java Future containing the result of the ListIntegrations operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.ListIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIntegrationsResult> listIntegrationsAsync(ListIntegrationsRequest listIntegrationsRequest);

    /**
     * <p>
     * Lists all of the integrations in your domain.
     * </p>
     * 
     * @param listIntegrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIntegrations operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.ListIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIntegrationsResult> listIntegrationsAsync(ListIntegrationsRequest listIntegrationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIntegrationsRequest, ListIntegrationsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the template information for object types.
     * </p>
     * 
     * @param listProfileObjectTypeTemplatesRequest
     * @return A Java Future containing the result of the ListProfileObjectTypeTemplates operation returned by the
     *         service.
     * @sample AmazonCustomerProfilesAsync.ListProfileObjectTypeTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjectTypeTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileObjectTypeTemplatesResult> listProfileObjectTypeTemplatesAsync(
            ListProfileObjectTypeTemplatesRequest listProfileObjectTypeTemplatesRequest);

    /**
     * <p>
     * Lists all of the template information for object types.
     * </p>
     * 
     * @param listProfileObjectTypeTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfileObjectTypeTemplates operation returned by the
     *         service.
     * @sample AmazonCustomerProfilesAsyncHandler.ListProfileObjectTypeTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjectTypeTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileObjectTypeTemplatesResult> listProfileObjectTypeTemplatesAsync(
            ListProfileObjectTypeTemplatesRequest listProfileObjectTypeTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfileObjectTypeTemplatesRequest, ListProfileObjectTypeTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists all of the templates available within the service.
     * </p>
     * 
     * @param listProfileObjectTypesRequest
     * @return A Java Future containing the result of the ListProfileObjectTypes operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.ListProfileObjectTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjectTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileObjectTypesResult> listProfileObjectTypesAsync(ListProfileObjectTypesRequest listProfileObjectTypesRequest);

    /**
     * <p>
     * Lists all of the templates available within the service.
     * </p>
     * 
     * @param listProfileObjectTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfileObjectTypes operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.ListProfileObjectTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjectTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileObjectTypesResult> listProfileObjectTypesAsync(ListProfileObjectTypesRequest listProfileObjectTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfileObjectTypesRequest, ListProfileObjectTypesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of objects associated with a profile of a given ProfileObjectType.
     * </p>
     * 
     * @param listProfileObjectsRequest
     * @return A Java Future containing the result of the ListProfileObjects operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.ListProfileObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileObjectsResult> listProfileObjectsAsync(ListProfileObjectsRequest listProfileObjectsRequest);

    /**
     * <p>
     * Returns a list of objects associated with a profile of a given ProfileObjectType.
     * </p>
     * 
     * @param listProfileObjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfileObjects operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.ListProfileObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileObjectsResult> listProfileObjectsAsync(ListProfileObjectsRequest listProfileObjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfileObjectsRequest, ListProfileObjectsResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with an Amazon Connect Customer Profiles resource. In Connect Customer Profiles,
     * domains, profile object types, and integrations can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with an Amazon Connect Customer Profiles resource. In Connect Customer Profiles,
     * domains, profile object types, and integrations can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and subject to change.
     * </p>
     * <p>
     * Runs an AWS Lambda job that does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * All the profileKeys in the <code>ProfileToBeMerged</code> will be moved to the main profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * All the objects in the <code>ProfileToBeMerged</code> will be moved to the main profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * All the <code>ProfileToBeMerged</code> will be deleted at the end.
     * </p>
     * </li>
     * <li>
     * <p>
     * All the profileKeys in the <code>ProfileIdsToBeMerged</code> will be moved to the main profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * Standard fields are merged as follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Fields are always "union"-ed if there are no conflicts in standard fields or attributeKeys.
     * </p>
     * </li>
     * <li>
     * <p>
     * When there are conflicting fields:
     * </p>
     * <ol>
     * <li>
     * <p>
     * If no <code>SourceProfileIds</code> entry is specified, the main Profile value is always taken.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a <code>SourceProfileIds</code> entry is specified, the specified profileId is always taken, even if it is a
     * NULL value.
     * </p>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * <p>
     * You can use MergeProfiles together with <a
     * href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_GetMatches.html">GetMatches</a>, which
     * returns potentially matching profiles, or use it with the results of another matching system. After profiles have
     * been merged, they cannot be separated (unmerged).
     * </p>
     * 
     * @param mergeProfilesRequest
     * @return A Java Future containing the result of the MergeProfiles operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.MergeProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/MergeProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeProfilesResult> mergeProfilesAsync(MergeProfilesRequest mergeProfilesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and subject to change.
     * </p>
     * <p>
     * Runs an AWS Lambda job that does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * All the profileKeys in the <code>ProfileToBeMerged</code> will be moved to the main profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * All the objects in the <code>ProfileToBeMerged</code> will be moved to the main profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * All the <code>ProfileToBeMerged</code> will be deleted at the end.
     * </p>
     * </li>
     * <li>
     * <p>
     * All the profileKeys in the <code>ProfileIdsToBeMerged</code> will be moved to the main profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * Standard fields are merged as follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Fields are always "union"-ed if there are no conflicts in standard fields or attributeKeys.
     * </p>
     * </li>
     * <li>
     * <p>
     * When there are conflicting fields:
     * </p>
     * <ol>
     * <li>
     * <p>
     * If no <code>SourceProfileIds</code> entry is specified, the main Profile value is always taken.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a <code>SourceProfileIds</code> entry is specified, the specified profileId is always taken, even if it is a
     * NULL value.
     * </p>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * <p>
     * You can use MergeProfiles together with <a
     * href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_GetMatches.html">GetMatches</a>, which
     * returns potentially matching profiles, or use it with the results of another matching system. After profiles have
     * been merged, they cannot be separated (unmerged).
     * </p>
     * 
     * @param mergeProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MergeProfiles operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.MergeProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/MergeProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<MergeProfilesResult> mergeProfilesAsync(MergeProfilesRequest mergeProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<MergeProfilesRequest, MergeProfilesResult> asyncHandler);

    /**
     * <p>
     * Adds an integration between the service and a third-party service, which includes Amazon AppFlow and Amazon
     * Connect.
     * </p>
     * <p>
     * An integration can belong to only one domain.
     * </p>
     * 
     * @param putIntegrationRequest
     * @return A Java Future containing the result of the PutIntegration operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.PutIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(PutIntegrationRequest putIntegrationRequest);

    /**
     * <p>
     * Adds an integration between the service and a third-party service, which includes Amazon AppFlow and Amazon
     * Connect.
     * </p>
     * <p>
     * An integration can belong to only one domain.
     * </p>
     * 
     * @param putIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutIntegration operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.PutIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(PutIntegrationRequest putIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<PutIntegrationRequest, PutIntegrationResult> asyncHandler);

    /**
     * <p>
     * Adds additional objects to customer profiles of a given ObjectType.
     * </p>
     * <p>
     * When adding a specific profile object, like a Contact Trace Record (CTR), an inferred profile can get created if
     * it is not mapped to an existing profile. The resulting profile will only have a phone number populated in the
     * standard ProfileObject. Any additional CTRs with the same phone number will be mapped to the same inferred
     * profile.
     * </p>
     * <p>
     * When a ProfileObject is created and if a ProfileObjectType already exists for the ProfileObject, it will provide
     * data to a standard profile depending on the ProfileObjectType definition.
     * </p>
     * <p>
     * PutProfileObject needs an ObjectType, which can be created using PutProfileObjectType.
     * </p>
     * 
     * @param putProfileObjectRequest
     * @return A Java Future containing the result of the PutProfileObject operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.PutProfileObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutProfileObject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutProfileObjectResult> putProfileObjectAsync(PutProfileObjectRequest putProfileObjectRequest);

    /**
     * <p>
     * Adds additional objects to customer profiles of a given ObjectType.
     * </p>
     * <p>
     * When adding a specific profile object, like a Contact Trace Record (CTR), an inferred profile can get created if
     * it is not mapped to an existing profile. The resulting profile will only have a phone number populated in the
     * standard ProfileObject. Any additional CTRs with the same phone number will be mapped to the same inferred
     * profile.
     * </p>
     * <p>
     * When a ProfileObject is created and if a ProfileObjectType already exists for the ProfileObject, it will provide
     * data to a standard profile depending on the ProfileObjectType definition.
     * </p>
     * <p>
     * PutProfileObject needs an ObjectType, which can be created using PutProfileObjectType.
     * </p>
     * 
     * @param putProfileObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutProfileObject operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.PutProfileObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutProfileObject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutProfileObjectResult> putProfileObjectAsync(PutProfileObjectRequest putProfileObjectRequest,
            com.amazonaws.handlers.AsyncHandler<PutProfileObjectRequest, PutProfileObjectResult> asyncHandler);

    /**
     * <p>
     * Defines a ProfileObjectType.
     * </p>
     * 
     * @param putProfileObjectTypeRequest
     * @return A Java Future containing the result of the PutProfileObjectType operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.PutProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutProfileObjectTypeResult> putProfileObjectTypeAsync(PutProfileObjectTypeRequest putProfileObjectTypeRequest);

    /**
     * <p>
     * Defines a ProfileObjectType.
     * </p>
     * 
     * @param putProfileObjectTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutProfileObjectType operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.PutProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutProfileObjectTypeResult> putProfileObjectTypeAsync(PutProfileObjectTypeRequest putProfileObjectTypeRequest,
            com.amazonaws.handlers.AsyncHandler<PutProfileObjectTypeRequest, PutProfileObjectTypeResult> asyncHandler);

    /**
     * <p>
     * Searches for profiles within a specific domain name using name, phone number, email address, account number, or a
     * custom defined index.
     * </p>
     * 
     * @param searchProfilesRequest
     * @return A Java Future containing the result of the SearchProfiles operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.SearchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/SearchProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(SearchProfilesRequest searchProfilesRequest);

    /**
     * <p>
     * Searches for profiles within a specific domain name using name, phone number, email address, account number, or a
     * custom defined index.
     * </p>
     * 
     * @param searchProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchProfiles operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.SearchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/SearchProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(SearchProfilesRequest searchProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchProfilesRequest, SearchProfilesResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon Connect Customer Profiles resource. Tags can
     * help you organize and categorize your resources. You can also use them to scope user permissions by granting a
     * user permission to access or change only resources with certain tag values. In Connect Customer Profiles,
     * domains, profile object types, and integrations can be tagged.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the TagResource action with a resource that already has tags. If you specify a new tag key, this tag
     * is appended to the list of tags associated with the resource. If you specify a tag key that is already associated
     * with the resource, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon Connect Customer Profiles resource. Tags can
     * help you organize and categorize your resources. You can also use them to scope user permissions by granting a
     * user permission to access or change only resources with certain tag values. In Connect Customer Profiles,
     * domains, profile object types, and integrations can be tagged.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the TagResource action with a resource that already has tags. If you specify a new tag key, this tag
     * is appended to the list of tags associated with the resource. If you specify a tag key that is already associated
     * with the resource, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified Amazon Connect Customer Profiles resource. In Connect Customer
     * Profiles, domains, profile object types, and integrations can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified Amazon Connect Customer Profiles resource. In Connect Customer
     * Profiles, domains, profile object types, and integrations can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the properties of a domain, including creating or selecting a dead letter queue or an encryption key.
     * </p>
     * <p>
     * After a domain is created, the name can’t be changed.
     * </p>
     * 
     * @param updateDomainRequest
     * @return A Java Future containing the result of the UpdateDomain operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UpdateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest updateDomainRequest);

    /**
     * <p>
     * Updates the properties of a domain, including creating or selecting a dead letter queue or an encryption key.
     * </p>
     * <p>
     * After a domain is created, the name can’t be changed.
     * </p>
     * 
     * @param updateDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomain operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UpdateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest updateDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler);

    /**
     * <p>
     * Updates the properties of a profile. The ProfileId is required for updating a customer profile.
     * </p>
     * <p>
     * When calling the UpdateProfile API, specifying an empty string value means that any existing value will be
     * removed. Not specifying a string value means that any value already there will be kept.
     * </p>
     * 
     * @param updateProfileRequest
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AmazonCustomerProfilesAsync.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UpdateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Updates the properties of a profile. The ProfileId is required for updating a customer profile.
     * </p>
     * <p>
     * When calling the UpdateProfile API, specifying an empty string value means that any existing value will be
     * removed. Not specifying a string value means that any value already there will be kept.
     * </p>
     * 
     * @param updateProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AmazonCustomerProfilesAsyncHandler.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UpdateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler);

}

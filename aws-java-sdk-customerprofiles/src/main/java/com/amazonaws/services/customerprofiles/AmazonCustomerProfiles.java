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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.customerprofiles.model.*;

/**
 * Interface for accessing Customer Profiles.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.customerprofiles.AbstractAmazonCustomerProfiles} instead.
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
public interface AmazonCustomerProfiles {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "profile";

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
     * @return Result of the AddProfileKey operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.AddProfileKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AddProfileKey"
     *      target="_top">AWS API Documentation</a>
     */
    AddProfileKeyResult addProfileKey(AddProfileKeyRequest addProfileKeyRequest);

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
     * @return Result of the CreateDomain operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a standard profile.
     * </p>
     * <p>
     * A standard profile represents the following attributes for a customer profile in a domain.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProfileResult createProfile(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Deletes a specific domain and all of its customer data, such as customer profile attributes and their related
     * objects.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteDomain" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Removes an integration from a specific domain.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @return Result of the DeleteIntegration operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.DeleteIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIntegrationResult deleteIntegration(DeleteIntegrationRequest deleteIntegrationRequest);

    /**
     * <p>
     * Deletes the standard customer profile and all data pertaining to the profile.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProfileResult deleteProfile(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Removes a searchable key from a customer profile.
     * </p>
     * 
     * @param deleteProfileKeyRequest
     * @return Result of the DeleteProfileKey operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.DeleteProfileKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileKey"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProfileKeyResult deleteProfileKey(DeleteProfileKeyRequest deleteProfileKeyRequest);

    /**
     * <p>
     * Removes an object associated with a profile of a given ProfileObjectType.
     * </p>
     * 
     * @param deleteProfileObjectRequest
     * @return Result of the DeleteProfileObject operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.DeleteProfileObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileObject"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProfileObjectResult deleteProfileObject(DeleteProfileObjectRequest deleteProfileObjectRequest);

    /**
     * <p>
     * Removes a ProfileObjectType from a specific domain as well as removes all the ProfileObjects of that type. It
     * also disables integrations from this specific ProfileObjectType. In addition, it scrubs all of the fields of the
     * standard profile that were populated from this ProfileObjectType.
     * </p>
     * 
     * @param deleteProfileObjectTypeRequest
     * @return Result of the DeleteProfileObjectType operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.DeleteProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProfileObjectTypeResult deleteProfileObjectType(DeleteProfileObjectTypeRequest deleteProfileObjectTypeRequest);

    /**
     * <p>
     * Returns information about a specific domain.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetDomain" target="_top">AWS
     *      API Documentation</a>
     */
    GetDomainResult getDomain(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Returns an integration for a domain.
     * </p>
     * 
     * @param getIntegrationRequest
     * @return Result of the GetIntegration operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.GetIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    GetIntegrationResult getIntegration(GetIntegrationRequest getIntegrationRequest);

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
     * @return Result of the GetMatches operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.GetMatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetMatches" target="_top">AWS
     *      API Documentation</a>
     */
    GetMatchesResult getMatches(GetMatchesRequest getMatchesRequest);

    /**
     * <p>
     * Returns the object types for a specific domain.
     * </p>
     * 
     * @param getProfileObjectTypeRequest
     * @return Result of the GetProfileObjectType operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.GetProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    GetProfileObjectTypeResult getProfileObjectType(GetProfileObjectTypeRequest getProfileObjectTypeRequest);

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
     * @return Result of the GetProfileObjectTypeTemplate operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.GetProfileObjectTypeTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetProfileObjectTypeTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetProfileObjectTypeTemplateResult getProfileObjectTypeTemplate(GetProfileObjectTypeTemplateRequest getProfileObjectTypeTemplateRequest);

    /**
     * <p>
     * Lists all of the integrations associated to a specific URI in the AWS account.
     * </p>
     * 
     * @param listAccountIntegrationsRequest
     * @return Result of the ListAccountIntegrations operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.ListAccountIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListAccountIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountIntegrationsResult listAccountIntegrations(ListAccountIntegrationsRequest listAccountIntegrationsRequest);

    /**
     * <p>
     * Returns a list of all the domains for an AWS account that have been created.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListDomains" target="_top">AWS
     *      API Documentation</a>
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Lists all of the integrations in your domain.
     * </p>
     * 
     * @param listIntegrationsRequest
     * @return Result of the ListIntegrations operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.ListIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    ListIntegrationsResult listIntegrations(ListIntegrationsRequest listIntegrationsRequest);

    /**
     * <p>
     * Lists all of the template information for object types.
     * </p>
     * 
     * @param listProfileObjectTypeTemplatesRequest
     * @return Result of the ListProfileObjectTypeTemplates operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.ListProfileObjectTypeTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjectTypeTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListProfileObjectTypeTemplatesResult listProfileObjectTypeTemplates(ListProfileObjectTypeTemplatesRequest listProfileObjectTypeTemplatesRequest);

    /**
     * <p>
     * Lists all of the templates available within the service.
     * </p>
     * 
     * @param listProfileObjectTypesRequest
     * @return Result of the ListProfileObjectTypes operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.ListProfileObjectTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjectTypes"
     *      target="_top">AWS API Documentation</a>
     */
    ListProfileObjectTypesResult listProfileObjectTypes(ListProfileObjectTypesRequest listProfileObjectTypesRequest);

    /**
     * <p>
     * Returns a list of objects associated with a profile of a given ProfileObjectType.
     * </p>
     * 
     * @param listProfileObjectsRequest
     * @return Result of the ListProfileObjects operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.ListProfileObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjects"
     *      target="_top">AWS API Documentation</a>
     */
    ListProfileObjectsResult listProfileObjects(ListProfileObjectsRequest listProfileObjectsRequest);

    /**
     * <p>
     * Displays the tags associated with an Amazon Connect Customer Profiles resource. In Connect Customer Profiles,
     * domains, profile object types, and integrations can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AmazonCustomerProfiles.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the MergeProfiles operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.MergeProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/MergeProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    MergeProfilesResult mergeProfiles(MergeProfilesRequest mergeProfilesRequest);

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
     * @return Result of the PutIntegration operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.PutIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    PutIntegrationResult putIntegration(PutIntegrationRequest putIntegrationRequest);

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
     * @return Result of the PutProfileObject operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.PutProfileObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutProfileObject"
     *      target="_top">AWS API Documentation</a>
     */
    PutProfileObjectResult putProfileObject(PutProfileObjectRequest putProfileObjectRequest);

    /**
     * <p>
     * Defines a ProfileObjectType.
     * </p>
     * 
     * @param putProfileObjectTypeRequest
     * @return Result of the PutProfileObjectType operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.PutProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    PutProfileObjectTypeResult putProfileObjectType(PutProfileObjectTypeRequest putProfileObjectTypeRequest);

    /**
     * <p>
     * Searches for profiles within a specific domain name using name, phone number, email address, account number, or a
     * custom defined index.
     * </p>
     * 
     * @param searchProfilesRequest
     * @return Result of the SearchProfiles operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.SearchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/SearchProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    SearchProfilesResult searchProfiles(SearchProfilesRequest searchProfilesRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AmazonCustomerProfiles.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified Amazon Connect Customer Profiles resource. In Connect Customer
     * Profiles, domains, profile object types, and integrations can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AmazonCustomerProfiles.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the properties of a domain, including creating or selecting a dead letter queue or an encryption key.
     * </p>
     * <p>
     * After a domain is created, the name can’t be changed.
     * </p>
     * 
     * @param updateDomainRequest
     * @return Result of the UpdateDomain operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UpdateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDomainResult updateDomain(UpdateDomainRequest updateDomainRequest);

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
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonCustomerProfiles.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UpdateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProfileResult updateProfile(UpdateProfileRequest updateProfileRequest);

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

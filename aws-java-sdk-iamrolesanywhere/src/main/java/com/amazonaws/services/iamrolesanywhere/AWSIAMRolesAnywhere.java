/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iamrolesanywhere.model.*;

/**
 * Interface for accessing IAM Roles Anywhere.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iamrolesanywhere.AbstractAWSIAMRolesAnywhere} instead.
 * </p>
 * <p>
 * <p>
 * AWS Identity and Access Management Roles Anywhere provides a secure way for your workloads such as servers,
 * containers, and applications running outside of AWS to obtain Temporary AWS credentials. Your workloads can use the
 * same IAM policies and roles that you have configured with native AWS applications to access AWS resources. Using IAM
 * Roles Anywhere will eliminate the need to manage long term credentials for workloads running outside of AWS.
 * </p>
 * <p>
 * To use IAM Roles Anywhere customer workloads will need to use X.509 certificates issued by their Certificate
 * Authority (CA) . The Certificate Authority (CA) needs to be registered with IAM Roles Anywhere as a trust anchor to
 * establish trust between customer PKI and IAM Roles Anywhere. Customers who do not manage their own PKI system can use
 * AWS Certificate Manager Private Certificate Authority (ACM PCA) to create a Certificate Authority and use that to
 * establish trust with IAM Roles Anywhere
 * </p>
 * <p>
 * This guide describes the IAM rolesanywhere operations that you can call programmatically. For general information
 * about IAM Roles Anywhere see <a href="https://docs.aws.amazon.com/">https://docs.aws.amazon.com/</a>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIAMRolesAnywhere {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "rolesanywhere";

    /**
     * <p>
     * Creates a profile. A profile is configuration resource to list the roles that RolesAnywhere service is trusted to
     * assume. In addition, by applying a profile you can intersect permissions with IAM managed policies.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:CreateProfile</code>.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateProfileResult createProfile(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Creates a trust anchor. You establish trust between IAM Roles Anywhere and your certificate authority (CA) by
     * configuring a trust anchor. A Trust Anchor is defined either as a reference to a AWS Certificate Manager Private
     * Certificate Authority (ACM PCA), or by uploading a Certificate Authority (CA) certificate. Your AWS workloads can
     * authenticate with the trust anchor using certificates issued by the trusted Certificate Authority (CA) in
     * exchange for temporary AWS credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:CreateTrustAnchor</code>.
     * </p>
     * 
     * @param createTrustAnchorRequest
     * @return Result of the CreateTrustAnchor operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.CreateTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTrustAnchorResult createTrustAnchor(CreateTrustAnchorRequest createTrustAnchorRequest);

    /**
     * <p>
     * Deletes a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteCrl</code>.
     * </p>
     * 
     * @param deleteCrlRequest
     * @return Result of the DeleteCrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DeleteCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteCrl" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCrlResult deleteCrl(DeleteCrlRequest deleteCrlRequest);

    /**
     * <p>
     * Deletes a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteProfile</code>.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteProfileResult deleteProfile(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes a trust anchor.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteTrustAnchor</code>.
     * </p>
     * 
     * @param deleteTrustAnchorRequest
     * @return Result of the DeleteTrustAnchor operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DeleteTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTrustAnchorResult deleteTrustAnchor(DeleteTrustAnchorRequest deleteTrustAnchorRequest);

    /**
     * <p>
     * Disables a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableCrl</code>.
     * </p>
     * 
     * @param disableCrlRequest
     * @return Result of the DisableCrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DisableCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableCrl" target="_top">AWS API
     *      Documentation</a>
     */
    DisableCrlResult disableCrl(DisableCrlRequest disableCrlRequest);

    /**
     * <p>
     * Disables a profile. When disabled, <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * requests with this profile fail.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableProfile</code>.
     * </p>
     * 
     * @param disableProfileRequest
     * @return Result of the DisableProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DisableProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DisableProfileResult disableProfile(DisableProfileRequest disableProfileRequest);

    /**
     * <p>
     * Disables a trust anchor. When disabled, <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * requests specifying this trust anchor are unauthorized.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableTrustAnchor</code>.
     * </p>
     * 
     * @param disableTrustAnchorRequest
     * @return Result of the DisableTrustAnchor operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DisableTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    DisableTrustAnchorResult disableTrustAnchor(DisableTrustAnchorRequest disableTrustAnchorRequest);

    /**
     * <p>
     * Enables a certificate revocation list (CRL). When enabled, certificates stored in the CRL are unauthorized to
     * receive session credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableCrl</code>.
     * </p>
     * 
     * @param enableCrlRequest
     * @return Result of the EnableCrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.EnableCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableCrl" target="_top">AWS API
     *      Documentation</a>
     */
    EnableCrlResult enableCrl(EnableCrlRequest enableCrlRequest);

    /**
     * <p>
     * Enables the roles in a profile to receive session credentials in <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableProfile</code>.
     * </p>
     * 
     * @param enableProfileRequest
     * @return Result of the EnableProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.EnableProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableProfile" target="_top">AWS
     *      API Documentation</a>
     */
    EnableProfileResult enableProfile(EnableProfileRequest enableProfileRequest);

    /**
     * <p>
     * Enables a trust anchor. When enabled, certificates in the trust anchor chain are authorized for trust validation.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableTrustAnchor</code>.
     * </p>
     * 
     * @param enableTrustAnchorRequest
     * @return Result of the EnableTrustAnchor operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.EnableTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    EnableTrustAnchorResult enableTrustAnchor(EnableTrustAnchorRequest enableTrustAnchorRequest);

    /**
     * <p>
     * Gets a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetCrl</code>.
     * </p>
     * 
     * @param getCrlRequest
     * @return Result of the GetCrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSIAMRolesAnywhere.GetCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetCrl" target="_top">AWS API
     *      Documentation</a>
     */
    GetCrlResult getCrl(GetCrlRequest getCrlRequest);

    /**
     * <p>
     * Gets a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetProfile</code>.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetProfileResult getProfile(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Gets a Subject. A Subject associates a certificate identity with authentication attempts by CreateSession. The
     * Subject resources stores audit information such as status of the last authentication attempt, the certificate
     * data used in the attempt, and the last time the associated identity attempted authentication.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetSubject</code>.
     * </p>
     * 
     * @param getSubjectRequest
     * @return Result of the GetSubject operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.GetSubject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetSubject" target="_top">AWS API
     *      Documentation</a>
     */
    GetSubjectResult getSubject(GetSubjectRequest getSubjectRequest);

    /**
     * <p>
     * Gets a trust anchor.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetTrustAnchor</code>.
     * </p>
     * 
     * @param getTrustAnchorRequest
     * @return Result of the GetTrustAnchor operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.GetTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetTrustAnchor" target="_top">AWS
     *      API Documentation</a>
     */
    GetTrustAnchorResult getTrustAnchor(GetTrustAnchorRequest getTrustAnchorRequest);

    /**
     * <p>
     * Imports the certificate revocation list (CRL). CRl is a list of certificates that have been revoked by the
     * issuing certificate Authority (CA). IAM Roles Anywhere validates against the crl list before issuing credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ImportCrl</code>.
     * </p>
     * 
     * @param importCrlRequest
     * @return Result of the ImportCrl operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ImportCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ImportCrl" target="_top">AWS API
     *      Documentation</a>
     */
    ImportCrlResult importCrl(ImportCrlRequest importCrlRequest);

    /**
     * <p>
     * Lists all Crls in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListCrls</code>.
     * </p>
     * 
     * @param listCrlsRequest
     * @return Result of the ListCrls operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListCrls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListCrls" target="_top">AWS API
     *      Documentation</a>
     */
    ListCrlsResult listCrls(ListCrlsRequest listCrlsRequest);

    /**
     * <p>
     * Lists all profiles in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListProfiles</code>.
     * </p>
     * 
     * @param listProfilesRequest
     * @return Result of the ListProfiles operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    ListProfilesResult listProfiles(ListProfilesRequest listProfilesRequest);

    /**
     * <p>
     * Lists the subjects in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListSubjects</code>.
     * </p>
     * 
     * @param listSubjectsRequest
     * @return Result of the ListSubjects operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListSubjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListSubjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListSubjectsResult listSubjects(ListSubjectsRequest listSubjectsRequest);

    /**
     * <p>
     * Lists the tags attached to the resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListTagsForResource</code>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the trust anchors in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListTrustAnchors</code>.
     * </p>
     * 
     * @param listTrustAnchorsRequest
     * @return Result of the ListTrustAnchors operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListTrustAnchors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListTrustAnchors" target="_top">AWS
     *      API Documentation</a>
     */
    ListTrustAnchorsResult listTrustAnchors(ListTrustAnchorsRequest listTrustAnchorsRequest);

    /**
     * <p>
     * Attaches tags to a resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:TagResource</code>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyTagsException
     *         Too many tags.
     * @sample AWSIAMRolesAnywhere.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UntagResource</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the certificate revocation list (CRL). CRl is a list of certificates that have been revoked by the
     * issuing certificate Authority (CA). IAM Roles Anywhere validates against the crl list before issuing credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateCrl</code>.
     * </p>
     * 
     * @param updateCrlRequest
     * @return Result of the UpdateCrl operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.UpdateCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateCrl" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCrlResult updateCrl(UpdateCrlRequest updateCrlRequest);

    /**
     * <p>
     * Updates the profile. A profile is configuration resource to list the roles that RolesAnywhere service is trusted
     * to assume. In addition, by applying a profile you can scope-down permissions with IAM managed policies.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateProfile</code>.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateProfileResult updateProfile(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Updates the trust anchor.You establish trust between IAM Roles Anywhere and your certificate authority (CA) by
     * configuring a trust anchor. A Trust Anchor is defined either as a reference to a AWS Certificate Manager Private
     * Certificate Authority (ACM PCA), or by uploading a Certificate Authority (CA) certificate. Your AWS workloads can
     * authenticate with the trust anchor using certificates issued by the trusted Certificate Authority (CA) in
     * exchange for temporary AWS credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateTrustAnchor</code>.
     * </p>
     * 
     * @param updateTrustAnchorRequest
     * @return Result of the UpdateTrustAnchor operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.UpdateTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTrustAnchorResult updateTrustAnchor(UpdateTrustAnchorRequest updateTrustAnchorRequest);

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

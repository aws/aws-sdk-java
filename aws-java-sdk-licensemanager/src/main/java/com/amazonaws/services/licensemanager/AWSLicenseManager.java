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
package com.amazonaws.services.licensemanager;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.licensemanager.model.*;

/**
 * Interface for accessing AWS License Manager.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.licensemanager.AbstractAWSLicenseManager} instead.
 * </p>
 * <p>
 * <fullname> AWS License Manager </fullname>
 * <p>
 * AWS License Manager makes it easier to manage licenses from software vendors across multiple AWS accounts and
 * on-premises servers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLicenseManager {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "license-manager";

    /**
     * <p>
     * Accepts the specified grant.
     * </p>
     * 
     * @param acceptGrantRequest
     * @return Result of the AcceptGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.AcceptGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/AcceptGrant" target="_top">AWS
     *      API Documentation</a>
     */
    AcceptGrantResult acceptGrant(AcceptGrantRequest acceptGrantRequest);

    /**
     * <p>
     * Checks in the specified license. Check in a license when it is no longer in use.
     * </p>
     * 
     * @param checkInLicenseRequest
     * @return Result of the CheckInLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.CheckInLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckInLicense" target="_top">AWS
     *      API Documentation</a>
     */
    CheckInLicenseResult checkInLicense(CheckInLicenseRequest checkInLicenseRequest);

    /**
     * <p>
     * Checks out the specified license for offline use.
     * </p>
     * 
     * @param checkoutBorrowLicenseRequest
     * @return Result of the CheckoutBorrowLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws NoEntitlementsAllowedException
     *         There are no entitlements found for this license, or the entitlement maximum count is reached.
     * @throws EntitlementNotAllowedException
     *         The entitlement is not allowed.
     * @throws UnsupportedDigitalSignatureMethodException
     *         The digital signature method is unsupported. Try your request again.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.CheckoutBorrowLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutBorrowLicense"
     *      target="_top">AWS API Documentation</a>
     */
    CheckoutBorrowLicenseResult checkoutBorrowLicense(CheckoutBorrowLicenseRequest checkoutBorrowLicenseRequest);

    /**
     * <p>
     * Checks out the specified license.
     * </p>
     * 
     * @param checkoutLicenseRequest
     * @return Result of the CheckoutLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws NoEntitlementsAllowedException
     *         There are no entitlements found for this license, or the entitlement maximum count is reached.
     * @throws UnsupportedDigitalSignatureMethodException
     *         The digital signature method is unsupported. Try your request again.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.CheckoutLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutLicense"
     *      target="_top">AWS API Documentation</a>
     */
    CheckoutLicenseResult checkoutLicense(CheckoutLicenseRequest checkoutLicenseRequest);

    /**
     * <p>
     * Creates a grant for the specified license. A grant shares the use of license entitlements with specific AWS
     * accounts.
     * </p>
     * 
     * @param createGrantRequest
     * @return Result of the CreateGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @sample AWSLicenseManager.CreateGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrant" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGrantResult createGrant(CreateGrantRequest createGrantRequest);

    /**
     * <p>
     * Creates a new version of the specified grant.
     * </p>
     * 
     * @param createGrantVersionRequest
     * @return Result of the CreateGrantVersion operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.CreateGrantVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrantVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGrantVersionResult createGrantVersion(CreateGrantVersionRequest createGrantVersionRequest);

    /**
     * <p>
     * Creates a license.
     * </p>
     * 
     * @param createLicenseRequest
     * @return Result of the CreateLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.CreateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLicenseResult createLicense(CreateLicenseRequest createLicenseRequest);

    /**
     * <p>
     * Creates a license configuration.
     * </p>
     * <p>
     * A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by
     * License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or
     * vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), license affinity to
     * host (how long a license must be associated with a host), and the number of licenses purchased and used.
     * </p>
     * 
     * @param createLicenseConfigurationRequest
     * @return Result of the CreateLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.CreateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLicenseConfigurationResult createLicenseConfiguration(CreateLicenseConfigurationRequest createLicenseConfigurationRequest);

    /**
     * <p>
     * Creates a new report generator.
     * </p>
     * 
     * @param createLicenseManagerReportGeneratorRequest
     * @return Result of the CreateLicenseManagerReportGenerator operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.CreateLicenseManagerReportGenerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseManagerReportGenerator"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLicenseManagerReportGeneratorResult createLicenseManagerReportGenerator(
            CreateLicenseManagerReportGeneratorRequest createLicenseManagerReportGeneratorRequest);

    /**
     * <p>
     * Creates a new version of the specified license.
     * </p>
     * 
     * @param createLicenseVersionRequest
     * @return Result of the CreateLicenseVersion operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.CreateLicenseVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLicenseVersionResult createLicenseVersion(CreateLicenseVersionRequest createLicenseVersionRequest);

    /**
     * <p>
     * Creates a long-lived token.
     * </p>
     * <p>
     * A refresh token is a JWT token used to get an access token. With an access token, you can call
     * AssumeRoleWithWebIdentity to get role credentials that you can use to call License Manager to manage the
     * specified license.
     * </p>
     * 
     * @param createTokenRequest
     * @return Result of the CreateToken operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @sample AWSLicenseManager.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateToken" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTokenResult createToken(CreateTokenRequest createTokenRequest);

    /**
     * <p>
     * Deletes the specified grant.
     * </p>
     * 
     * @param deleteGrantRequest
     * @return Result of the DeleteGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.DeleteGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteGrant" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteGrantResult deleteGrant(DeleteGrantRequest deleteGrantRequest);

    /**
     * <p>
     * Deletes the specified license.
     * </p>
     * 
     * @param deleteLicenseRequest
     * @return Result of the DeleteLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.DeleteLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicense" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLicenseResult deleteLicense(DeleteLicenseRequest deleteLicenseRequest);

    /**
     * <p>
     * Deletes the specified license configuration.
     * </p>
     * <p>
     * You cannot delete a license configuration that is in use.
     * </p>
     * 
     * @param deleteLicenseConfigurationRequest
     * @return Result of the DeleteLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.DeleteLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLicenseConfigurationResult deleteLicenseConfiguration(DeleteLicenseConfigurationRequest deleteLicenseConfigurationRequest);

    /**
     * <p>
     * Delete an existing report generator.
     * </p>
     * <p>
     * This action deletes the report generator, which stops it from generating future reports and cannot be reversed.
     * However, the previous reports from this generator will remain in your S3 bucket.
     * </p>
     * 
     * @param deleteLicenseManagerReportGeneratorRequest
     * @return Result of the DeleteLicenseManagerReportGenerator operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.DeleteLicenseManagerReportGenerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseManagerReportGenerator"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLicenseManagerReportGeneratorResult deleteLicenseManagerReportGenerator(
            DeleteLicenseManagerReportGeneratorRequest deleteLicenseManagerReportGeneratorRequest);

    /**
     * <p>
     * Deletes the specified token. Must be called in the license home Region.
     * </p>
     * 
     * @param deleteTokenRequest
     * @return Result of the DeleteToken operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @sample AWSLicenseManager.DeleteToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteToken" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTokenResult deleteToken(DeleteTokenRequest deleteTokenRequest);

    /**
     * <p>
     * Extends the expiration date for license consumption.
     * </p>
     * 
     * @param extendLicenseConsumptionRequest
     * @return Result of the ExtendLicenseConsumption operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.ExtendLicenseConsumption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ExtendLicenseConsumption"
     *      target="_top">AWS API Documentation</a>
     */
    ExtendLicenseConsumptionResult extendLicenseConsumption(ExtendLicenseConsumptionRequest extendLicenseConsumptionRequest);

    /**
     * <p>
     * Gets a temporary access token to use with AssumeRoleWithWebIdentity. Access tokens are valid for one hour.
     * </p>
     * 
     * @param getAccessTokenRequest
     * @return Result of the GetAccessToken operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.GetAccessToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetAccessToken" target="_top">AWS
     *      API Documentation</a>
     */
    GetAccessTokenResult getAccessToken(GetAccessTokenRequest getAccessTokenRequest);

    /**
     * <p>
     * Gets detailed information about the specified grant.
     * </p>
     * 
     * @param getGrantRequest
     * @return Result of the GetGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetGrant" target="_top">AWS API
     *      Documentation</a>
     */
    GetGrantResult getGrant(GetGrantRequest getGrantRequest);

    /**
     * <p>
     * Gets detailed information about the specified license.
     * </p>
     * 
     * @param getLicenseRequest
     * @return Result of the GetLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.GetLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicense" target="_top">AWS API
     *      Documentation</a>
     */
    GetLicenseResult getLicense(GetLicenseRequest getLicenseRequest);

    /**
     * <p>
     * Gets detailed information about the specified license configuration.
     * </p>
     * 
     * @param getLicenseConfigurationRequest
     * @return Result of the GetLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetLicenseConfigurationResult getLicenseConfiguration(GetLicenseConfigurationRequest getLicenseConfigurationRequest);

    /**
     * <p>
     * Gets information on the specified report generator.
     * </p>
     * 
     * @param getLicenseManagerReportGeneratorRequest
     * @return Result of the GetLicenseManagerReportGenerator operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.GetLicenseManagerReportGenerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseManagerReportGenerator"
     *      target="_top">AWS API Documentation</a>
     */
    GetLicenseManagerReportGeneratorResult getLicenseManagerReportGenerator(GetLicenseManagerReportGeneratorRequest getLicenseManagerReportGeneratorRequest);

    /**
     * <p>
     * Gets detailed information about the usage of the specified license.
     * </p>
     * 
     * @param getLicenseUsageRequest
     * @return Result of the GetLicenseUsage operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.GetLicenseUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseUsage"
     *      target="_top">AWS API Documentation</a>
     */
    GetLicenseUsageResult getLicenseUsage(GetLicenseUsageRequest getLicenseUsageRequest);

    /**
     * <p>
     * Gets the License Manager settings for the current Region.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @return Result of the GetServiceSettings operation returned by the service.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetServiceSettingsResult getServiceSettings(GetServiceSettingsRequest getServiceSettingsRequest);

    /**
     * <p>
     * Lists the resource associations for the specified license configuration.
     * </p>
     * <p>
     * Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped
     * instance might not consume a license (depending on the license rules).
     * </p>
     * 
     * @param listAssociationsForLicenseConfigurationRequest
     * @return Result of the ListAssociationsForLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListAssociationsForLicenseConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListAssociationsForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociationsForLicenseConfigurationResult listAssociationsForLicenseConfiguration(
            ListAssociationsForLicenseConfigurationRequest listAssociationsForLicenseConfigurationRequest);

    /**
     * <p>
     * Lists the grants distributed for the specified license.
     * </p>
     * 
     * @param listDistributedGrantsRequest
     * @return Result of the ListDistributedGrants operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListDistributedGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListDistributedGrants"
     *      target="_top">AWS API Documentation</a>
     */
    ListDistributedGrantsResult listDistributedGrants(ListDistributedGrantsRequest listDistributedGrantsRequest);

    /**
     * <p>
     * Lists the license configuration operations that failed.
     * </p>
     * 
     * @param listFailuresForLicenseConfigurationOperationsRequest
     * @return Result of the ListFailuresForLicenseConfigurationOperations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListFailuresForLicenseConfigurationOperations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListFailuresForLicenseConfigurationOperations"
     *      target="_top">AWS API Documentation</a>
     */
    ListFailuresForLicenseConfigurationOperationsResult listFailuresForLicenseConfigurationOperations(
            ListFailuresForLicenseConfigurationOperationsRequest listFailuresForLicenseConfigurationOperationsRequest);

    /**
     * <p>
     * Lists the license configurations for your account.
     * </p>
     * 
     * @param listLicenseConfigurationsRequest
     * @return Result of the ListLicenseConfigurations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListLicenseConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListLicenseConfigurationsResult listLicenseConfigurations(ListLicenseConfigurationsRequest listLicenseConfigurationsRequest);

    /**
     * <p>
     * Lists the report generators for your account.
     * </p>
     * 
     * @param listLicenseManagerReportGeneratorsRequest
     * @return Result of the ListLicenseManagerReportGenerators operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.ListLicenseManagerReportGenerators
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseManagerReportGenerators"
     *      target="_top">AWS API Documentation</a>
     */
    ListLicenseManagerReportGeneratorsResult listLicenseManagerReportGenerators(
            ListLicenseManagerReportGeneratorsRequest listLicenseManagerReportGeneratorsRequest);

    /**
     * <p>
     * Describes the license configurations for the specified resource.
     * </p>
     * 
     * @param listLicenseSpecificationsForResourceRequest
     * @return Result of the ListLicenseSpecificationsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListLicenseSpecificationsForResourceResult listLicenseSpecificationsForResource(
            ListLicenseSpecificationsForResourceRequest listLicenseSpecificationsForResourceRequest);

    /**
     * <p>
     * Lists all versions of the specified license.
     * </p>
     * 
     * @param listLicenseVersionsRequest
     * @return Result of the ListLicenseVersions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.ListLicenseVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListLicenseVersionsResult listLicenseVersions(ListLicenseVersionsRequest listLicenseVersionsRequest);

    /**
     * <p>
     * Lists the licenses for your account.
     * </p>
     * 
     * @param listLicensesRequest
     * @return Result of the ListLicenses operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.ListLicenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenses" target="_top">AWS
     *      API Documentation</a>
     */
    ListLicensesResult listLicenses(ListLicensesRequest listLicensesRequest);

    /**
     * <p>
     * Lists grants that are received but not accepted.
     * </p>
     * 
     * @param listReceivedGrantsRequest
     * @return Result of the ListReceivedGrants operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListReceivedGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListReceivedGrants"
     *      target="_top">AWS API Documentation</a>
     */
    ListReceivedGrantsResult listReceivedGrants(ListReceivedGrantsRequest listReceivedGrantsRequest);

    /**
     * <p>
     * Lists received licenses.
     * </p>
     * 
     * @param listReceivedLicensesRequest
     * @return Result of the ListReceivedLicenses operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListReceivedLicenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListReceivedLicenses"
     *      target="_top">AWS API Documentation</a>
     */
    ListReceivedLicensesResult listReceivedLicenses(ListReceivedLicensesRequest listReceivedLicensesRequest);

    /**
     * <p>
     * Lists resources managed using Systems Manager inventory.
     * </p>
     * 
     * @param listResourceInventoryRequest
     * @return Result of the ListResourceInventory operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws FailedDependencyException
     *         A dependency required to run the API is missing.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListResourceInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceInventoryResult listResourceInventory(ListResourceInventoryRequest listResourceInventoryRequest);

    /**
     * <p>
     * Lists the tags for the specified license configuration.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists your tokens.
     * </p>
     * 
     * @param listTokensRequest
     * @return Result of the ListTokens operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.ListTokens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTokens" target="_top">AWS API
     *      Documentation</a>
     */
    ListTokensResult listTokens(ListTokensRequest listTokensRequest);

    /**
     * <p>
     * Lists all license usage records for a license configuration, displaying license consumption details by resource
     * at a selected point in time. Use this action to audit the current license consumption for any license inventory
     * and configuration.
     * </p>
     * 
     * @param listUsageForLicenseConfigurationRequest
     * @return Result of the ListUsageForLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListUsageForLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ListUsageForLicenseConfigurationResult listUsageForLicenseConfiguration(ListUsageForLicenseConfigurationRequest listUsageForLicenseConfigurationRequest);

    /**
     * <p>
     * Rejects the specified grant.
     * </p>
     * 
     * @param rejectGrantRequest
     * @return Result of the RejectGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.RejectGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/RejectGrant" target="_top">AWS
     *      API Documentation</a>
     */
    RejectGrantResult rejectGrant(RejectGrantRequest rejectGrantRequest);

    /**
     * <p>
     * Adds the specified tags to the specified license configuration.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified license configuration.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies the attributes of an existing license configuration.
     * </p>
     * 
     * @param updateLicenseConfigurationRequest
     * @return Result of the UpdateLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AWSLicenseManager.UpdateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLicenseConfigurationResult updateLicenseConfiguration(UpdateLicenseConfigurationRequest updateLicenseConfigurationRequest);

    /**
     * <p>
     * Updates a report generator.
     * </p>
     * <p>
     * After you make changes to a report generator, it will start generating new reports within 60 minutes of being
     * updated.
     * </p>
     * 
     * @param updateLicenseManagerReportGeneratorRequest
     * @return Result of the UpdateLicenseManagerReportGenerator operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AWSLicenseManager.UpdateLicenseManagerReportGenerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseManagerReportGenerator"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLicenseManagerReportGeneratorResult updateLicenseManagerReportGenerator(
            UpdateLicenseManagerReportGeneratorRequest updateLicenseManagerReportGeneratorRequest);

    /**
     * <p>
     * Adds or removes the specified license configurations for the specified AWS resource.
     * </p>
     * <p>
     * You can update the license specifications of AMIs, instances, and hosts. You cannot update the license
     * specifications for launch templates and AWS CloudFormation templates, as they send license configurations to the
     * operation that creates the resource.
     * </p>
     * 
     * @param updateLicenseSpecificationsForResourceRequest
     * @return Result of the UpdateLicenseSpecificationsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         License Manager cannot allocate a license to a resource because of its state. </p>
     *         <p>
     *         For example, you cannot allocate a license to an instance in the process of shutting down.
     * @throws LicenseUsageException
     *         You do not have enough licenses available to support a new resource launch.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLicenseSpecificationsForResourceResult updateLicenseSpecificationsForResource(
            UpdateLicenseSpecificationsForResourceRequest updateLicenseSpecificationsForResourceRequest);

    /**
     * <p>
     * Updates License Manager settings for the current Region.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @return Result of the UpdateServiceSettings operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateServiceSettingsResult updateServiceSettings(UpdateServiceSettingsRequest updateServiceSettingsRequest);

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

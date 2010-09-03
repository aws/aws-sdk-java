/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement;

import com.amazonaws.*;
import com.amazonaws.services.identitymanagement.model.*;


/**
 * Interface for accessing AmazonIdentityManagement.
 * AWS Identity and Access Management <p>
 * AWS Identity and Access Management (IAM) is a web service that enables
 * Amazon Web Services (AWS) customers to manage users and user
 * permissions under their AWS account.
 * </p>
 * <p>
 * This is the AWS Identity and Access Management API Reference. This
 * guide describes who should read this guide and other resources related
 * to IAM.
 * </p>
 * <p>
 * Use of this guide assumes you are familiar with the following:
 * </p>
 * 
 * <ul>
 * <li>Basic understanding of web services (for information, go to W3
 * Schools Web Services Tutorial at <a
 * href="http://www.w3schools.com/webservices/default.asp">
 * http://www.w3schools.com/webservices/default.asp </a> ).</li>
 * <li>XML (for information, go to W3 Schools XML Tutorial at <a
 * href="http://www.w3schools.com/xml/default.asp">
 * http://www.w3schools.com/xml/default.asp </a> ).</li>
 * <li>JSON (for information, go to <a href="http://json.org">
 * http://json.org </a> )</li>
 * <li>The specific AWS products you are using or plan to use (e.g.,
 * Amazon Elastic Compute Cloud (Amazon EC2), Amazon Simple Storage
 * Service (Amazon S3), etc.)</li>
 * 
 * </ul>
 * <p>
 * If you're new to AWS and need additional technical information about a
 * specific AWS product, you can find the product's technical
 * documentation at <a href="http://aws.amazon.com/documentation/">
 * http://aws.amazon.com/documentation/ </a> .
 * </p>
 * <p>
 * We will refer to Amazon AWS Identity and Access Management using the
 * the abbreviated form IAM; all copyrights and legal protections still
 * apply.
 * </p>
 */
public interface AmazonIdentityManagement {

    /**
     * Overrides the default endpoint for this client ("https://iam.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Lists the groups that have the specified path prefix.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listGroupsRequest Container for the necessary parameters to
     *           execute the ListGroups service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListGroups service method, as returned
     *         by AmazonIdentityManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the access key associated with the specified user.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     *
     * @param deleteAccessKeyRequest Container for the necessary parameters
     *           to execute the DeleteAccessKey service method on
     *           AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAccessKey(DeleteAccessKeyRequest deleteAccessKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the signing certificates associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing
     * certificates, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     *
     * @param listSigningCertificatesRequest Container for the necessary
     *           parameters to execute the ListSigningCertificates service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListSigningCertificates service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSigningCertificatesResult listSigningCertificates(ListSigningCertificatesRequest listSigningCertificatesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Uploads an X.509 signing certificate and associates it with the
     * specified user. Some AWS services use X.509 signing certificates to
     * validate requests that are signed with a corresponding private key.
     * When you upload the certificate, its default status is Active.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     * <p>
     * <b>NOTE:</b>Because the body of a X.509 certificate can be large, you
     * should use POST rather than GET when calling UploadSigningCertificate.
     * For more information, see Using the Query API in the AWS Identity and
     * Access Management User Guide.
     * </p>
     *
     * @param uploadSigningCertificateRequest Container for the necessary
     *           parameters to execute the UploadSigningCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the UploadSigningCertificate service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws MalformedCertificateException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UploadSigningCertificateResult uploadSigningCertificate(UploadSigningCertificateRequest uploadSigningCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified policy associated with the specified user.
     * </p>
     *
     * @param deleteUserPolicyRequest Container for the necessary parameters
     *           to execute the DeleteUserPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUserPolicy(DeleteUserPolicyRequest deleteUserPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds (or updates) a policy document associated with the specified
     * user. For information about how to write a policy, refer to the <a
     * href="http://aws.amazon.com/documentation/"> AWS Identity and Access
     * Management User Guide </a> .
     * </p>
     * <p>
     * For information about limits on the number of policies you can
     * associate with a user, see Limitations on AWS IAM Entities in the <a
     * href="http://aws.amazon.com/documentation/"> AWS Identity and Access
     * Management User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>Because policy documents can be large, you should use POST
     * rather than GET when calling PutUserPolicy. For more information, see
     * Using the Query API in the AWS Identity and Access Management User
     * Guide.
     * </p>
     *
     * @param putUserPolicyRequest Container for the necessary parameters to
     *           execute the PutUserPolicy service method on AmazonIdentityManagement.
     * 
     * @throws MalformedPolicyDocumentException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putUserPolicy(PutUserPolicyRequest putUserPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the specified policy document for the specified user. The
     * returned policy is URL-encoded according to RFC 3986. For more
     * information about RFC 3986, go to
     * http://www.faqs.org/rfcs/rfc3986.html.
     * </p>
     *
     * @param getUserPolicyRequest Container for the necessary parameters to
     *           execute the GetUserPolicy service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetUserPolicy service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserPolicyResult getUserPolicy(GetUserPolicyRequest getUserPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the login profile for the specified user. Use this API to
     * change the user's password.
     * </p>
     *
     * @param updateLoginProfileRequest Container for the necessary
     *           parameters to execute the UpdateLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @throws EntityTemporarilyUnmodifiableException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateLoginProfile(UpdateLoginProfileRequest updateLoginProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name and/or the path of the specified user.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You should understand the implications of changing a
     * user's path or name. For more information, see Renaming Users and
     * Groups in the AWS Identity and Access Management User Guide.
     * </p>
     *
     * @param updateUserRequest Container for the necessary parameters to
     *           execute the UpdateUser service method on AmazonIdentityManagement.
     * 
     * @throws EntityTemporarilyUnmodifiableException
     * @throws NoSuchEntityException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateUser(UpdateUserRequest updateUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the login profile for the specified user, which terminates the
     * user's ability to access AWS services through the IAM login page.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Deleting a user's login profile does not prevent a
     * user from accessing IAM through the command line interface or the API.
     * To prevent a user from accessing IAM through the command line
     * interface or the API you must either make the access key inactive or
     * delete it. For more information about making keys inactive or
     * deleting them, see UpdateAccessKey and DeleteAccessKey.
     * </p>
     *
     * @param deleteLoginProfileRequest Container for the necessary
     *           parameters to execute the DeleteLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @throws EntityTemporarilyUnmodifiableException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLoginProfile(DeleteLoginProfileRequest deleteLoginProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the status of the specified signing certificate from active to
     * disabled, or vice versa. This action can be used to disable a user's
     * signing certificate as part of a certificate rotation workflow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     * <p>
     * For information about rotating certificates, see Managing Keys and
     * Certificates in the <a href="http://aws.amazon.com/documentation/">
     * AWS Identity and Access Management User Guide </a> .
     * </p>
     *
     * @param updateSigningCertificateRequest Container for the necessary
     *           parameters to execute the UpdateSigningCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateSigningCertificate(UpdateSigningCertificateRequest updateSigningCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the users that have the specified path prefix. If there are
     * none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listUsersRequest Container for the necessary parameters to
     *           execute the ListUsers service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListUsers service method, as returned by
     *         AmazonIdentityManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified policy that is associated with the specified
     * group.
     * </p>
     *
     * @param deleteGroupPolicyRequest Container for the necessary parameters
     *           to execute the DeleteGroupPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteGroupPolicy(DeleteGroupPolicyRequest deleteGroupPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name and/or the path of the specified group.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You should understand the implications of changing a
     * group's path or name. For more information, see Renaming Users and
     * Groups in the AWS Identity and Access Management User Guide.
     * </p>
     *
     * @param updateGroupRequest Container for the necessary parameters to
     *           execute the UpdateGroup service method on AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateGroup(UpdateGroupRequest updateGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds (or updates) a policy document associated with the specified
     * group. For information about how to write a policy, refer to the <a
     * href="http://aws.amazon.com/documentation/"> AWS Identity and Access
     * Management User Guide </a> .
     * </p>
     * <p>
     * For information about limits on the number of policies you can
     * associate with a group, see Limitations on AWS IAM Entities in the <a
     * href="http://aws.amazon.com/documentation/"> AWS Identity and Access
     * Management User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>Because policy documents can be large, you should use POST
     * rather than GET when calling PutGroupPolicy. For more information, see
     * Using the Query API in the AWS Identity and Access Management User
     * Guide.
     * </p>
     *
     * @param putGroupPolicyRequest Container for the necessary parameters to
     *           execute the PutGroupPolicy service method on AmazonIdentityManagement.
     * 
     * @throws MalformedPolicyDocumentException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putGroupPolicy(PutGroupPolicyRequest putGroupPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new user for your account.
     * </p>
     * <p>
     * For information about limitations on the number of users you can
     * create, see Limitations on AWS IAM Entities in the <a
     * href="http://aws.amazon.com/documentation/"> AWS Identity and Access
     * Management User Guide </a> .
     * </p>
     *
     * @param createUserRequest Container for the necessary parameters to
     *           execute the CreateUser service method on AmazonIdentityManagement.
     * 
     * @return The response from the CreateUser service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateUserResult createUser(CreateUserRequest createUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified signing certificate associated with the
     * specified user.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     *
     * @param deleteSigningCertificateRequest Container for the necessary
     *           parameters to execute the DeleteSigningCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSigningCertificate(DeleteSigningCertificateRequest deleteSigningCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables the specified MFA device and associates it with the specified
     * user. Once enabled, the MFA device is required for every subsequent
     * login by the user associated with the device.
     * </p>
     *
     * @param enableMFADeviceRequest Container for the necessary parameters
     *           to execute the EnableMFADevice service method on
     *           AmazonIdentityManagement.
     * 
     * @throws EntityTemporarilyUnmodifiableException
     * @throws NoSuchEntityException
     * @throws InvalidAuthenticationCodeException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableMFADevice(EnableMFADeviceRequest enableMFADeviceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the names of the policies associated with the specified user. If
     * there are none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listUserPoliciesRequest Container for the necessary parameters
     *           to execute the ListUserPolicies service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListUserPolicies service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUserPoliciesResult listUserPolicies(ListUserPoliciesRequest listUserPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the Access Key IDs associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     * <p>
     * <b>NOTE:</b>To ensure the security of your account, the secret access
     * key is accesible only during key and user creation.
     * </p>
     *
     * @param listAccessKeysRequest Container for the necessary parameters to
     *           execute the ListAccessKeys service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListAccessKeys service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAccessKeysResult listAccessKeys(ListAccessKeysRequest listAccessKeysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the login profile for the specified user.
     * </p>
     *
     * @param getLoginProfileRequest Container for the necessary parameters
     *           to execute the GetLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetLoginProfile service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetLoginProfileResult getLoginProfile(GetLoginProfileRequest getLoginProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the groups the specified user belongs to.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listGroupsForUserRequest Container for the necessary parameters
     *           to execute the ListGroupsForUser service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListGroupsForUser service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGroupsForUserResult listGroupsForUser(ListGroupsForUserRequest listGroupsForUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new group.
     * </p>
     * <p>
     * For information about the number of groups you can create, see
     * Limitations on AWS IAM Entities in the <a
     * href="http://aws.amazon.com/documentation/"> AWS Identity and Access
     * Management User Guide </a> .
     * </p>
     *
     * @param createGroupRequest Container for the necessary parameters to
     *           execute the CreateGroup service method on AmazonIdentityManagement.
     * 
     * @return The response from the CreateGroup service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified user. The user must not belong to any groups,
     * have any keys or signing certificates, or have any attached policies.
     * </p>
     *
     * @param deleteUserRequest Container for the necessary parameters to
     *           execute the DeleteUser service method on AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUser(DeleteUserRequest deleteUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the specified policy document for the specified group. The
     * returned policy is URL-encoded according to RFC 3986. For more
     * information about RFC 3986, go to
     * http://www.faqs.org/rfcs/rfc3986.html.
     * </p>
     *
     * @param getGroupPolicyRequest Container for the necessary parameters to
     *           execute the GetGroupPolicy service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetGroupPolicy service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetGroupPolicyResult getGroupPolicy(GetGroupPolicyRequest getGroupPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deactivates the specified MFA device and removes it from association
     * with the user for which it was originally enabled.
     * </p>
     *
     * @param deactivateMFADeviceRequest Container for the necessary
     *           parameters to execute the DeactivateMFADevice service method on
     *           AmazonIdentityManagement.
     * 
     * @throws EntityTemporarilyUnmodifiableException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deactivateMFADevice(DeactivateMFADeviceRequest deactivateMFADeviceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     *
     * @param removeUserFromGroupRequest Container for the necessary
     *           parameters to execute the RemoveUserFromGroup service method on
     *           AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the names of the policies associated with the specified group.
     * If there are none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listGroupPoliciesRequest Container for the necessary parameters
     *           to execute the ListGroupPolicies service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListGroupPolicies service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGroupPoliciesResult listGroupPolicies(ListGroupPoliciesRequest listGroupPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a login profile for the specified user, giving the user the
     * ability to access AWS services such as the AWS Management Console.
     * For more information about login profiles, see Managing Login Profiles
     * and MFA Devices in the <a href="http://aws.amazon.com/documentation/">
     * AWS Identity and Access Management User Guide </a> .
     * </p>
     *
     * @param createLoginProfileRequest Container for the necessary
     *           parameters to execute the CreateLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreateLoginProfile service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLoginProfileResult createLoginProfile(CreateLoginProfileRequest createLoginProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new AWS Secret Access Key and corresponding AWS Access Key
     * ID for the specified user. The default status for new keys is Active.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see
     * Limitations on AWS IAM Entities in the <a
     * href="http://aws.amazon.com/documentation/"> AWS Identity and Access
     * Management User Guide </a> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>To ensure the security of your account, the secret
     * access key is accesible only during key and user creation. You must
     * save the key (for example, in a text file) if you want to be able to
     * access it again. If a secret key is lost, you can delete the access
     * keys for the associated user and then create new keys.
     * </p>
     *
     * @param createAccessKeyRequest Container for the necessary parameters
     *           to execute the CreateAccessKey service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreateAccessKey service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAccessKeyResult createAccessKey(CreateAccessKeyRequest createAccessKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the specified user, including the user's
     * path, GUID, and ARN.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request.
     * </p>
     *
     * @param getUserRequest Container for the necessary parameters to
     *           execute the GetUser service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetUser service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserResult getUser(GetUserRequest getUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Synchronizes the specified MFA device with AWS servers.
     * </p>
     *
     * @param resyncMFADeviceRequest Container for the necessary parameters
     *           to execute the ResyncMFADevice service method on
     *           AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     * @throws InvalidAuthenticationCodeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resyncMFADevice(ResyncMFADeviceRequest resyncMFADeviceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the MFA devices associated with the specified user.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listMFADevicesRequest Container for the necessary parameters to
     *           execute the ListMFADevices service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListMFADevices service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListMFADevicesResult listMFADevices(ListMFADevicesRequest listMFADevicesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the status of the specified access key from Active to
     * Inactive, or vice versa. This action can be used to disable a user's
     * key as part of a key rotation workflow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     * <p>
     * For information about rotating keys, see Managing Keys and
     * Certificates in the <a href="http://aws.amazon.com/documentation/">
     * AWS Identity and Access Management User Guide </a> .
     * </p>
     *
     * @param updateAccessKeyRequest Container for the necessary parameters
     *           to execute the UpdateAccessKey service method on
     *           AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateAccessKey(UpdateAccessKeyRequest updateAccessKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     *
     * @param addUserToGroupRequest Container for the necessary parameters to
     *           execute the AddUserToGroup service method on AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of users that are in the specified group. You can
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param getGroupRequest Container for the necessary parameters to
     *           execute the GetGroup service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetGroup service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetGroupResult getGroup(GetGroupRequest getGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified group. The group must not contain any users or
     * have any attached policies.
     * </p>
     *
     * @param deleteGroupRequest Container for the necessary parameters to
     *           execute the DeleteGroup service method on AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteGroup(DeleteGroupRequest deleteGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the groups that have the specified path prefix.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListGroups service method, as returned
     *         by AmazonIdentityManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGroupsResult listGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about the signing certificates associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing
     * certificates, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     * 
     * @return The response from the ListSigningCertificates service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSigningCertificatesResult listSigningCertificates() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the users that have the specified path prefix. If there are
     * none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListUsers service method, as returned by
     *         AmazonIdentityManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUsersResult listUsers() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about the Access Key IDs associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     * <p>
     * <b>NOTE:</b>To ensure the security of your account, the secret access
     * key is accesible only during key and user creation.
     * </p>
     * 
     * @return The response from the ListAccessKeys service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAccessKeysResult listAccessKeys() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Creates a new AWS Secret Access Key and corresponding AWS Access Key
     * ID for the specified user. The default status for new keys is Active.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the account,
     * this API can be used to manage root credentials even if the account
     * has no associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see
     * Limitations on AWS IAM Entities in the <a
     * href="http://aws.amazon.com/documentation/"> AWS Identity and Access
     * Management User Guide </a> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>To ensure the security of your account, the secret
     * access key is accesible only during key and user creation. You must
     * save the key (for example, in a text file) if you want to be able to
     * access it again. If a secret key is lost, you can delete the access
     * keys for the associated user and then create new keys.
     * </p>
     * 
     * @return The response from the CreateAccessKey service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAccessKeyResult createAccessKey() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Retrieves information about the specified user, including the user's
     * path, GUID, and ARN.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request.
     * </p>
     * 
     * @return The response from the GetUser service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserResult getUser() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        
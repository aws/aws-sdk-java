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
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.identitymanagement.model.*;

/**
 * Interface for accessing AmazonIdentityManagement asynchronously,
 * using Java Futures.
 * AWS Identity and Access Management <p>
 * AWS Identity and Access Management (IAM) is a web service that enables
 * Amazon Web Services (AWS) customers to manage Users and User
 * permissions under their AWS Account.
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
 * Service (Amazon S3), and so on.)</li>
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
 * abbreviated form IAM. All copyrights and legal protections still
 * apply.
 * </p> 
 */       
public interface AmazonIdentityManagementAsync extends AmazonIdentityManagement {
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
     *           execute the ListGroups operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListGroups service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the access key associated with the specified User.
     * </p>
     * <p>
     * If you do not specify a User name, IAM determines the User name
     * implicitly based on the AWS Access Key ID signing the request. Because
     * this action works for access keys under the AWS Account, you can use
     * this API to manage root credentials even if the AWS Account has no
     * associated Users.
     * </p>
     *
     * @param deleteAccessKeyRequest Container for the necessary parameters
     *           to execute the DeleteAccessKey operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAccessKey service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAccessKeyAsync(DeleteAccessKeyRequest deleteAccessKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the signing certificates associated with the
     * specified User. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each User is limited to a small number of signing
     * certificates, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * Account, this API can be used to manage root credentials even if the
     * AWS Account has no associated Users.
     * </p>
     *
     * @param listSigningCertificatesRequest Container for the necessary
     *           parameters to execute the ListSigningCertificates operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListSigningCertificates service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListSigningCertificatesResult> listSigningCertificatesAsync(ListSigningCertificatesRequest listSigningCertificatesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Uploads an X.509 signing certificate and associates it with the
     * specified User. Some AWS services use X.509 signing certificates to
     * validate requests that are signed with a corresponding private key.
     * When you upload the certificate, its default status is
     * <code>Active</code> .
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the User name is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * Account, this API can be used to manage root credentials even if the
     * AWS Account has no associated Users.
     * </p>
     * <p>
     * <b>NOTE:</b>Because the body of a X.509 certificate can be large, you
     * should use POST rather than GET when calling UploadSigningCertificate.
     * For more information, see Making Query Requests in Using AWS Identity
     * and Access Management.
     * </p>
     *
     * @param uploadSigningCertificateRequest Container for the necessary
     *           parameters to execute the UploadSigningCertificate operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         UploadSigningCertificate service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UploadSigningCertificateResult> uploadSigningCertificateAsync(UploadSigningCertificateRequest uploadSigningCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified policy associated with the specified User.
     * </p>
     *
     * @param deleteUserPolicyRequest Container for the necessary parameters
     *           to execute the DeleteUserPolicy operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteUserPolicy service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteUserPolicyAsync(DeleteUserPolicyRequest deleteUserPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds (or updates) a policy document associated with the specified
     * User. For information about policies, refer to <a
     * ebservices.com/IAM/latest/UserGuide/index.html?PoliciesOverview.html">
     * Overview of Policies </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * For information about limits on the number of policies you can
     * associate with a User, see <a
     * s.com/IAM/2010-05-08/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * <b>NOTE:</b>Because policy documents can be large, you should use POST
     * rather than GET when calling PutUserPolicy. For more information, see
     * Making Query Requests in Using AWS Identity and Access Management.
     * </p>
     *
     * @param putUserPolicyRequest Container for the necessary parameters to
     *           execute the PutUserPolicy operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         PutUserPolicy service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putUserPolicyAsync(PutUserPolicyRequest putUserPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the server certificates that have the specified path prefix. If
     * none exist, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listServerCertificatesRequest Container for the necessary
     *           parameters to execute the ListServerCertificates operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListServerCertificates service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListServerCertificatesResult> listServerCertificatesAsync(ListServerCertificatesRequest listServerCertificatesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the specified policy document for the specified User. The
     * returned policy is URL-encoded according to RFC 3986. For more
     * information about RFC 3986, go to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">
     * http://www.faqs.org/rfcs/rfc3986.html </a> .
     * </p>
     *
     * @param getUserPolicyRequest Container for the necessary parameters to
     *           execute the GetUserPolicy operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         GetUserPolicy service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetUserPolicyResult> getUserPolicyAsync(GetUserPolicyRequest getUserPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the login profile for the specified User. Use this API to
     * change the User's password.
     * </p>
     * <p>
     * <b>NOTE:</b>In the full release you will be able to use IAM to access
     * your services through the AWS Management Console. Although this
     * feature is not currently available, you can create login profiles for
     * your Users now. Then, when this feature is implemented, your Users can
     * use IAM to access your services through the AWS Management Console.
     * </p>
     *
     * @param updateLoginProfileRequest Container for the necessary
     *           parameters to execute the UpdateLoginProfile operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateLoginProfile service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateLoginProfileAsync(UpdateLoginProfileRequest updateLoginProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name and/or the path of the specified server certificate.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You should understand the implications of changing a
     * server certificate's path or name. For more information, see Managing
     * Server Certificates in Using AWS Identity and Access Management.
     * </p>
     * <p>
     * <b>NOTE:</b>To change a server certificate name the requester must
     * have appropriate permissions on both the source object and the target
     * object. For example, to change the name from ProductionCert to
     * ProdCert, the entity making the request must have permission on
     * ProductionCert and ProdCert, or must have permission on all (*). For
     * more information about permissions, see Permissions and Policies.
     * </p>
     *
     * @param updateServerCertificateRequest Container for the necessary
     *           parameters to execute the UpdateServerCertificate operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateServerCertificate service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateServerCertificateAsync(UpdateServerCertificateRequest updateServerCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name and/or the path of the specified User.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You should understand the implications of changing a
     * User's path or name. For more information, see Renaming Users and
     * Groups in Using AWS Identity and Access Management.
     * </p>
     * <p>
     * <b>NOTE:</b>To change a User name the requester must have appropriate
     * permissions on both the source object and the target object. For
     * example, to change Bob to Robert, the entity making the request must
     * have permission on Bob and Robert, or must have permission on all (*).
     * For more information about permissions, see Permissions and Policies.
     * </p>
     *
     * @param updateUserRequest Container for the necessary parameters to
     *           execute the UpdateUser operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateUser service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateUserAsync(UpdateUserRequest updateUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the login profile for the specified User, which terminates the
     * User's ability to access AWS services through the IAM login page.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Deleting a User's login profile does not prevent a
     * User from accessing IAM through the command line interface or the API.
     * To prevent all User access you must also either make the access key
     * inactive or delete it. For more information about making keys
     * inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.
     * </p>
     * <p>
     * <b>NOTE:</b>In the full release you will be able to use IAM to access
     * your services through the AWS Management Console. Although this
     * feature is not currently available, you can create login profiles for
     * your Users now. Then, when this feature is implemented, your Users can
     * use IAM to access your services through the AWS Management Console.
     * </p>
     *
     * @param deleteLoginProfileRequest Container for the necessary
     *           parameters to execute the DeleteLoginProfile operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoginProfile service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoginProfileAsync(DeleteLoginProfileRequest deleteLoginProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the status of the specified signing certificate from active to
     * disabled, or vice versa. This action can be used to disable a User's
     * signing certificate as part of a certificate rotation workflow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * Account, this API can be used to manage root credentials even if the
     * AWS Account has no associated Users.
     * </p>
     * <p>
     * For information about rotating certificates, see <a
     * ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     * Managing Keys and Certificates </a> in <i>Using AWS Identity and
     * Access Management</i> .
     * </p>
     *
     * @param updateSigningCertificateRequest Container for the necessary
     *           parameters to execute the UpdateSigningCertificate operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateSigningCertificate service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateSigningCertificateAsync(UpdateSigningCertificateRequest updateSigningCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified policy that is associated with the specified
     * group.
     * </p>
     *
     * @param deleteGroupPolicyRequest Container for the necessary parameters
     *           to execute the DeleteGroupPolicy operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteGroupPolicy service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteGroupPolicyAsync(DeleteGroupPolicyRequest deleteGroupPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the Users that have the specified path prefix. If there are
     * none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listUsersRequest Container for the necessary parameters to
     *           execute the ListUsers operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListUsers service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the name and/or the path of the specified group.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You should understand the implications of changing a
     * group's path or name. For more information, see Renaming Users and
     * Groups in Using AWS Identity and Access Management.
     * </p>
     * <p>
     * <b>NOTE:</b>To change a group name the requester must have appropriate
     * permissions on both the source object and the target object. For
     * example, to change Managers to MGRs, the entity making the request
     * must have permission on Managers and MGRs, or must have permission on
     * all (*). For more information about permissions, see Permissions and
     * Policies.
     * </p>
     *
     * @param updateGroupRequest Container for the necessary parameters to
     *           execute the UpdateGroup operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateGroup service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateGroupAsync(UpdateGroupRequest updateGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the specified server certificate.
     * </p>
     *
     * @param getServerCertificateRequest Container for the necessary
     *           parameters to execute the GetServerCertificate operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         GetServerCertificate service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetServerCertificateResult> getServerCertificateAsync(GetServerCertificateRequest getServerCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds (or updates) a policy document associated with the specified
     * group. For information about policies, refer to <a
     * ebservices.com/IAM/latest/UserGuide/index.html?PoliciesOverview.html">
     * Overview of Policies </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * For information about limits on the number of policies you can
     * associate with a group, see <a
     * s.com/IAM/2010-05-08/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * <b>NOTE:</b>Because policy documents can be large, you should use POST
     * rather than GET when calling PutGroupPolicy. For more information, see
     * Making Query Requests in Using AWS Identity and Access Management.
     * </p>
     *
     * @param putGroupPolicyRequest Container for the necessary parameters to
     *           execute the PutGroupPolicy operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         PutGroupPolicy service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putGroupPolicyAsync(PutGroupPolicyRequest putGroupPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new User for your AWS Account.
     * </p>
     * <p>
     * For information about limitations on the number of Users you can
     * create, see <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     *
     * @param createUserRequest Container for the necessary parameters to
     *           execute the CreateUser operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         CreateUser service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified signing certificate associated with the
     * specified User.
     * </p>
     * <p>
     * If you do not specify a User name, IAM determines the User name
     * implicitly based on the AWS Access Key ID signing the request. Because
     * this action works for access keys under the AWS Account, you can use
     * this API to manage root credentials even if the AWS Account has no
     * associated Users.
     * </p>
     *
     * @param deleteSigningCertificateRequest Container for the necessary
     *           parameters to execute the DeleteSigningCertificate operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSigningCertificate service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSigningCertificateAsync(DeleteSigningCertificateRequest deleteSigningCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables the specified MFA device and associates it with the specified
     * User name. Once enabled, the MFA device is required for every
     * subsequent login by the User name associated with the device.
     * </p>
     *
     * @param enableMFADeviceRequest Container for the necessary parameters
     *           to execute the EnableMFADevice operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         EnableMFADevice service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableMFADeviceAsync(EnableMFADeviceRequest enableMFADeviceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the names of the policies associated with the specified User. If
     * there are none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listUserPoliciesRequest Container for the necessary parameters
     *           to execute the ListUserPolicies operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListUserPolicies service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListUserPoliciesResult> listUserPoliciesAsync(ListUserPoliciesRequest listUserPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the Access Key IDs associated with the
     * specified User. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each User is limited to a small number of keys, you can still
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * Account, this API can be used to manage root credentials even if the
     * AWS Account has no associated Users.
     * </p>
     * <p>
     * <b>NOTE:</b>To ensure the security of your AWS Account, the secret
     * access key is accessible only during key and User creation.
     * </p>
     *
     * @param listAccessKeysRequest Container for the necessary parameters to
     *           execute the ListAccessKeys operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListAccessKeys service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAccessKeysResult> listAccessKeysAsync(ListAccessKeysRequest listAccessKeysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the login profile for the specified User.
     * </p>
     * <p>
     * <b>NOTE:</b>In the full release you will be able to use IAM to access
     * your services through the AWS Management Console. Although this
     * feature is not currently available, you can create login profiles for
     * your Users now. Then, when this feature is implemented, your Users can
     * use IAM to access your services through the AWS Management Console.
     * </p>
     *
     * @param getLoginProfileRequest Container for the necessary parameters
     *           to execute the GetLoginProfile operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         GetLoginProfile service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetLoginProfileResult> getLoginProfileAsync(GetLoginProfileRequest getLoginProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the groups the specified User belongs to.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listGroupsForUserRequest Container for the necessary parameters
     *           to execute the ListGroupsForUser operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListGroupsForUser service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGroupsForUserResult> listGroupsForUserAsync(ListGroupsForUserRequest listGroupsForUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new group.
     * </p>
     * <p>
     * For information about the number of groups you can create, see <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     *
     * @param createGroupRequest Container for the necessary parameters to
     *           execute the CreateGroup operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         CreateGroup service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Uploads a server certificate entity for the AWS Account. The server
     * certificate entity includes a public key certificate, a private key,
     * and an optional certificate chain, which should all be PEM-encoded.
     * </p>
     * <p>
     * For information about the number of server certificates you can
     * upload, see <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * <b>NOTE:</b>Because the body of the public key certificate, private
     * key, and the certificate chain can be large, you should use POST
     * rather than GET when calling UploadServerCertificate. For more
     * information, see Making Query Requests in Using AWS Identity and
     * Access Management.
     * </p>
     *
     * @param uploadServerCertificateRequest Container for the necessary
     *           parameters to execute the UploadServerCertificate operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         UploadServerCertificate service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UploadServerCertificateResult> uploadServerCertificateAsync(UploadServerCertificateRequest uploadServerCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the specified policy document for the specified group. The
     * returned policy is URL-encoded according to RFC 3986. For more
     * information about RFC 3986, go to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">
     * http://www.faqs.org/rfcs/rfc3986.html </a> .
     * </p>
     *
     * @param getGroupPolicyRequest Container for the necessary parameters to
     *           execute the GetGroupPolicy operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         GetGroupPolicy service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetGroupPolicyResult> getGroupPolicyAsync(GetGroupPolicyRequest getGroupPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified User. The User must not belong to any groups,
     * have any keys or signing certificates, or have any attached policies.
     * </p>
     *
     * @param deleteUserRequest Container for the necessary parameters to
     *           execute the DeleteUser operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteUser service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteUserAsync(DeleteUserRequest deleteUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deactivates the specified MFA device and removes it from association
     * with the User name for which it was originally enabled.
     * </p>
     *
     * @param deactivateMFADeviceRequest Container for the necessary
     *           parameters to execute the DeactivateMFADevice operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeactivateMFADevice service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deactivateMFADeviceAsync(DeactivateMFADeviceRequest deactivateMFADeviceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified User from the specified group.
     * </p>
     *
     * @param removeUserFromGroupRequest Container for the necessary
     *           parameters to execute the RemoveUserFromGroup operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveUserFromGroup service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removeUserFromGroupAsync(RemoveUserFromGroupRequest removeUserFromGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified server certificate.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If your Elastic Load Balancing instances are using a
     * server certificate, deleting the certificate could have implications
     * for your application. If your Elastic Load Balancing instances do not
     * detect the deletion of bound certificates, they may continue to use
     * the certificates. This could cause them to stop accepting traffic.
     * We recommend that you remove the reference to the certificate from
     * your Elastic Load Balancing instances before using this command to
     * delete the certificate.
     * </p>
     *
     * @param deleteServerCertificateRequest Container for the necessary
     *           parameters to execute the DeleteServerCertificate operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteServerCertificate service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteServerCertificateAsync(DeleteServerCertificateRequest deleteServerCertificateRequest) 
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
     *           to execute the ListGroupPolicies operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListGroupPolicies service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGroupPoliciesResult> listGroupPoliciesAsync(ListGroupPoliciesRequest listGroupPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a login profile for the specified User, giving the User the
     * ability to access AWS services such as the AWS Management Console.
     * For more information about login profiles, see <a
     * .com/IAM/latest/UserGuide/index.html?Using_ManagingLoginsAndMFA.html">
     * Managing Login Profiles and MFA Devices </a> in <i>Using AWS Identity
     * and Access Management</i> .
     * </p>
     * <p>
     * <b>NOTE:</b>In the full release you will be able to use IAM to access
     * your services through the AWS Management Console. Although this
     * feature is not currently available, you can create login profiles for
     * your Users now. Then, when this feature is implemented, your Users can
     * use IAM to access your services through the AWS Management Console.
     * </p>
     *
     * @param createLoginProfileRequest Container for the necessary
     *           parameters to execute the CreateLoginProfile operation on
     *           AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoginProfile service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoginProfileResult> createLoginProfileAsync(CreateLoginProfileRequest createLoginProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new AWS Secret Access Key and corresponding AWS Access Key
     * ID for the specified User. The default status for new keys is
     * <code>Active</code> .
     * </p>
     * <p>
     * If you do not specify a User name, IAM determines the User name
     * implicitly based on the AWS Access Key ID signing the request. Because
     * this action works for access keys under the AWS Account, you can use
     * this API to manage root credentials even if the AWS Account has no
     * associated Users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see
     * <a
     * s.com/IAM/2010-05-08/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>To ensure the security of your AWS Account, the
     * Secret Access Key is accessible only during key and User creation.
     * You must save the key (for example, in a text file) if you want to be
     * able to access it again. If a secret key is lost, you can delete the
     * access keys for the associated User and then create new keys.
     * </p>
     *
     * @param createAccessKeyRequest Container for the necessary parameters
     *           to execute the CreateAccessKey operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAccessKey service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAccessKeyResult> createAccessKeyAsync(CreateAccessKeyRequest createAccessKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the specified User, including the User's
     * path, GUID, and ARN.
     * </p>
     * <p>
     * If you do not specify a User name, IAM determines the User name
     * implicitly based on the AWS Access Key ID signing the request.
     * </p>
     *
     * @param getUserRequest Container for the necessary parameters to
     *           execute the GetUser operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the GetUser
     *         service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetUserResult> getUserAsync(GetUserRequest getUserRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Synchronizes the specified MFA device with AWS servers.
     * </p>
     *
     * @param resyncMFADeviceRequest Container for the necessary parameters
     *           to execute the ResyncMFADevice operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ResyncMFADevice service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resyncMFADeviceAsync(ResyncMFADeviceRequest resyncMFADeviceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the MFA devices associated with the specified User name.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listMFADevicesRequest Container for the necessary parameters to
     *           execute the ListMFADevices operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListMFADevices service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListMFADevicesResult> listMFADevicesAsync(ListMFADevicesRequest listMFADevicesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the status of the specified access key from Active to
     * Inactive, or vice versa. This action can be used to disable a User's
     * key as part of a key rotation workflow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * Account, this API can be used to manage root credentials even if the
     * AWS Account has no associated Users.
     * </p>
     * <p>
     * For information about rotating keys, see <a
     * ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     * Managing Keys and Certificates </a> in <i>Using AWS Identity and
     * Access Management</i> .
     * </p>
     *
     * @param updateAccessKeyRequest Container for the necessary parameters
     *           to execute the UpdateAccessKey operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAccessKey service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAccessKeyAsync(UpdateAccessKeyRequest updateAccessKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified User to the specified group.
     * </p>
     *
     * @param addUserToGroupRequest Container for the necessary parameters to
     *           execute the AddUserToGroup operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         AddUserToGroup service method, as returned by
     *         AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> addUserToGroupAsync(AddUserToGroupRequest addUserToGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of Users that are in the specified group. You can
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param getGroupRequest Container for the necessary parameters to
     *           execute the GetGroup operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the GetGroup
     *         service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified group. The group must not contain any Users or
     * have any attached policies.
     * </p>
     *
     * @param deleteGroupRequest Container for the necessary parameters to
     *           execute the DeleteGroup operation on AmazonIdentityManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteGroup service method, as returned by AmazonIdentityManagement.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        
/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.services.identitymanagement.model.transform.*;


/**
 * Client for accessing AmazonIdentityManagement.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Identity and Access Management <p>
 * This guide provides descriptions of the Identity and Access Management
 * (IAM) API as well as links to related content in the guide, <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/"> Using
 * IAM </a> .
 * </p>
 * <p>
 * IAM is a web service that enables AWS customers to manage users and
 * user permissions under their AWS account. For more information about
 * this product go to <a href="http://aws.amazon.com/iam/"> AWS Identity
 * and Access Management (IAM) </a> . For specific information about
 * setting up signatures and authorization through the API, go to <a
 * cs.amazonwebservices.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">
 * Making Query Requests </a> in <i>Using AWS Identity and Access
 * Management</i> .
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a
 * specific AWS product, you can find the product's technical
 * documentation at <a href="http://aws.amazon.com/documentation/">
 * http://aws.amazon.com/documentation/ </a> .
 * </p>
 */
public class AmazonIdentityManagementClient extends AmazonWebServiceClient implements AmazonIdentityManagement {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonIdentityManagement exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
    
    
    /** AWS signer for authenticating requests. */
    private QueryStringSigner signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonIdentityManagementClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonIdentityManagement
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonIdentityManagementClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }
    
    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider 
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonIdentityManagementClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider 
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonIdentityManagement
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonIdentityManagementClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() { 
        exceptionUnmarshallers.add(new DuplicateCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EntityAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KeyPairMismatchExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DeleteConflictExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAuthenticationCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EntityTemporarilyUnmodifiableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PasswordPolicyViolationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchEntityExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("iam.amazonaws.com");

        signer = new QueryStringSigner();

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/identitymanagement/request.handlers"));
    }
    
    
    /**
     * <p>
     * Deletes the specified AWS account alias. For information about using
     * an AWS account alias, see <a
     * ://docs.amazonwebservices.com/IAM/latest/UserGuide/AccountAlias.html">
     * Using an Alias for Your AWS Account ID </a> in <i>Using AWS Identity
     * and Access Management</i> .
     * </p>
     *
     * @param deleteAccountAliasRequest Container for the necessary
     *           parameters to execute the DeleteAccountAlias service method on
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
    public void deleteAccountAlias(DeleteAccountAliasRequest deleteAccountAliasRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteAccountAliasRequest> request = new DeleteAccountAliasRequestMarshaller().marshall(deleteAccountAliasRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListGroupsRequest> request = new ListGroupsRequestMarshaller().marshall(listGroupsRequest);
        return invoke(request, new ListGroupsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes the access key associated with the specified user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS Access Key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use
     * this API to manage root credentials even if the AWS account has no
     * associated users.
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteAccessKeyRequest> request = new DeleteAccessKeyRequestMarshaller().marshall(deleteAccessKeyRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes a virtual MFA device.
     * </p>
     * <p>
     * <b>NOTE:</b>You must deactivate a user's virtual MFA device before you
     * can delete it. For information about deactivating MFA devices, see
     * DeactivateMFADevice.
     * </p>
     *
     * @param deleteVirtualMFADeviceRequest Container for the necessary
     *           parameters to execute the DeleteVirtualMFADevice service method on
     *           AmazonIdentityManagement.
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
    public void deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest deleteVirtualMFADeviceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteVirtualMFADeviceRequest> request = new DeleteVirtualMFADeviceRequestMarshaller().marshall(deleteVirtualMFADeviceRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteUserPolicyRequest> request = new DeleteUserPolicyRequestMarshaller().marshall(deleteUserPolicyRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Adds (or updates) a policy document associated with the specified
     * user. For information about policies, refer to <a
     * ebservices.com/IAM/latest/UserGuide/index.html?PoliciesOverview.html">
     * Overview of Policies </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * For information about limits on the number of policies you can
     * associate with a user, see <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
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
            throws AmazonServiceException, AmazonClientException {
        Request<PutUserPolicyRequest> request = new PutUserPolicyRequestMarshaller().marshall(putUserPolicyRequest);
        invoke(request, null);
    }
    
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
     *           parameters to execute the ListServerCertificates service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListServerCertificates service method,
     *         as returned by AmazonIdentityManagement.
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
    public ListServerCertificatesResult listServerCertificates(ListServerCertificatesRequest listServerCertificatesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListServerCertificatesRequest> request = new ListServerCertificatesRequestMarshaller().marshall(listServerCertificatesRequest);
        return invoke(request, new ListServerCertificatesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Retrieves the specified policy document for the specified user. The
     * returned policy is URL-encoded according to RFC 3986. For more
     * information about RFC 3986, go to <a
     * href="http://www.faqs.org/rfcs/rfc3986.html">
     * http://www.faqs.org/rfcs/rfc3986.html </a> .
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
            throws AmazonServiceException, AmazonClientException {
        Request<GetUserPolicyRequest> request = new GetUserPolicyRequestMarshaller().marshall(getUserPolicyRequest);
        return invoke(request, new GetUserPolicyResultStaxUnmarshaller());
    }
    
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
     *           parameters to execute the UpdateServerCertificate service method on
     *           AmazonIdentityManagement.
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
    public void updateServerCertificate(UpdateServerCertificateRequest updateServerCertificateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateServerCertificateRequest> request = new UpdateServerCertificateRequestMarshaller().marshall(updateServerCertificateRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Updates the name and/or the path of the specified user.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You should understand the implications of changing a
     * user's path or name. For more information, see Renaming Users and
     * Groups in Using AWS Identity and Access Management.
     * </p>
     * <p>
     * <b>NOTE:</b>To change a user name the requester must have appropriate
     * permissions on both the source object and the target object. For
     * example, to change Bob to Robert, the entity making the request must
     * have permission on Bob and Robert, or must have permission on all (*).
     * For more information about permissions, see Permissions and Policies.
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
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateUserRequest> request = new UpdateUserRequestMarshaller().marshall(updateUserRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Changes the status of the specified signing certificate from active to
     * disabled, or vice versa. This action can be used to disable a user's
     * signing certificate as part of a certificate rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, this API can be used to manage root credentials even if the
     * AWS account has no associated users.
     * </p>
     * <p>
     * For information about rotating certificates, see <a
     * ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     * Managing Keys and Certificates </a> in <i>Using AWS Identity and
     * Access Management</i> .
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
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateSigningCertificateRequest> request = new UpdateSigningCertificateRequestMarshaller().marshall(updateSigningCertificateRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteGroupPolicyRequest> request = new DeleteGroupPolicyRequestMarshaller().marshall(deleteGroupPolicyRequest);
        invoke(request, null);
    }
    
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
     *           execute the UpdateGroup service method on AmazonIdentityManagement.
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
    public void updateGroup(UpdateGroupRequest updateGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateGroupRequest> request = new UpdateGroupRequestMarshaller().marshall(updateGroupRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListUsersRequest> request = new ListUsersRequestMarshaller().marshall(listUsersRequest);
        return invoke(request, new ListUsersResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a new user for your AWS account.
     * </p>
     * <p>
     * For information about limitations on the number of users you can
     * create, see <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateUserRequest> request = new CreateUserRequestMarshaller().marshall(createUserRequest);
        return invoke(request, new CreateUserResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Enables the specified MFA device and associates it with the specified
     * user name. When enabled, the MFA device is required for every
     * subsequent login by the user name associated with the device.
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
            throws AmazonServiceException, AmazonClientException {
        Request<EnableMFADeviceRequest> request = new EnableMFADeviceRequestMarshaller().marshall(enableMFADeviceRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes the password policy for the AWS account.
     * </p>
     *
     * @param deleteAccountPasswordPolicyRequest Container for the necessary
     *           parameters to execute the DeleteAccountPasswordPolicy service method
     *           on AmazonIdentityManagement.
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
    public void deleteAccountPasswordPolicy(DeleteAccountPasswordPolicyRequest deleteAccountPasswordPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteAccountPasswordPolicyRequest> request = new DeleteAccountPasswordPolicyRequestMarshaller().marshall(deleteAccountPasswordPolicyRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Retrieves the password for the specified user.
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
            throws AmazonServiceException, AmazonClientException {
        Request<GetLoginProfileRequest> request = new GetLoginProfileRequestMarshaller().marshall(getLoginProfileRequest);
        return invoke(request, new GetLoginProfileResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Uploads a server certificate entity for the AWS account. The server
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
     *           parameters to execute the UploadServerCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the UploadServerCertificate service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws KeyPairMismatchException
     * @throws MalformedCertificateException
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
    public UploadServerCertificateResult uploadServerCertificate(UploadServerCertificateRequest uploadServerCertificateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UploadServerCertificateRequest> request = new UploadServerCertificateRequestMarshaller().marshall(uploadServerCertificateRequest);
        return invoke(request, new UploadServerCertificateResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateGroupRequest> request = new CreateGroupRequestMarshaller().marshall(createGroupRequest);
        return invoke(request, new CreateGroupResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * This action creates an alias for your AWS account. For information
     * about using an AWS account alias, see <a
     * ://docs.amazonwebservices.com/IAM/latest/UserGuide/AccountAlias.html">
     * Using an Alias for Your AWS Account ID </a> in <i>Using AWS Identity
     * and Access Management</i> .
     * </p>
     *
     * @param createAccountAliasRequest Container for the necessary
     *           parameters to execute the CreateAccountAlias service method on
     *           AmazonIdentityManagement.
     * 
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
    public void createAccountAlias(CreateAccountAliasRequest createAccountAliasRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateAccountAliasRequest> request = new CreateAccountAliasRequestMarshaller().marshall(createAccountAliasRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteUserRequest> request = new DeleteUserRequestMarshaller().marshall(deleteUserRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deactivates the specified MFA device and removes it from association
     * with the user name for which it was originally enabled.
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeactivateMFADeviceRequest> request = new DeactivateMFADeviceRequestMarshaller().marshall(deactivateMFADeviceRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<RemoveUserFromGroupRequest> request = new RemoveUserFromGroupRequestMarshaller().marshall(removeUserFromGroupRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes the specified server certificate.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you are using a server certificate with Elastic
     * Load Balancing, deleting the certificate could have implications for
     * your application. If Elastic Load Balancing doesn't detect the
     * deletion of bound certificates, it may continue to use the
     * certificates. This could cause Elastic Load Balancing to stop
     * accepting traffic. We recommend that you remove the reference to the
     * certificate from Elastic Load Balancing before using this command to
     * delete the certificate. For more information, go to
     * DeleteLoadBalancerListeners in the Elastic Load Balancing API
     * Reference.
     * </p>
     *
     * @param deleteServerCertificateRequest Container for the necessary
     *           parameters to execute the DeleteServerCertificate service method on
     *           AmazonIdentityManagement.
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
    public void deleteServerCertificate(DeleteServerCertificateRequest deleteServerCertificateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteServerCertificateRequest> request = new DeleteServerCertificateRequestMarshaller().marshall(deleteServerCertificateRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Creates a new AWS Secret Access Key and corresponding AWS Access Key
     * ID for the specified user. The default status for new keys is
     * <code>Active</code> .
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS Access Key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use
     * this API to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see
     * <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>To ensure the security of your AWS account, the
     * Secret Access Key is accessible only during key and user creation.
     * You must save the key (for example, in a text file) if you want to be
     * able to access it again. If a secret key is lost, you can delete the
     * access keys for the associated user and then create new keys.
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateAccessKeyRequest> request = new CreateAccessKeyRequestMarshaller().marshall(createAccessKeyRequest);
        return invoke(request, new CreateAccessKeyResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Retrieves information about the specified user, including the user's
     * path, GUID, and ARN.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS Access Key ID signing the request.
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
            throws AmazonServiceException, AmazonClientException {
        Request<GetUserRequest> request = new GetUserRequestMarshaller().marshall(getUserRequest);
        return invoke(request, new GetUserResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ResyncMFADeviceRequest> request = new ResyncMFADeviceRequestMarshaller().marshall(resyncMFADeviceRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Lists the MFA devices. If the request includes the user name, then
     * this action lists all the MFA devices associated with the specified
     * user name. If you do not specify a user name, IAM determines the user
     * name implicitly based on the AWS Access Key ID signing the request.
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListMFADevicesRequest> request = new ListMFADevicesRequestMarshaller().marshall(listMFADevicesRequest);
        return invoke(request, new ListMFADevicesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a new virtual MFA device for the AWS account. After creating
     * the virtual MFA, use <a
     * azonwebservices.com/IAM/latest/APIReference/API_EnableMFADevice.html">
     * EnableMFADevice </a> to attach the MFA device to an IAM user. For more
     * information about creating and working with virtual MFA devices, go to
     * <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_VirtualMFA.html">
     * Using a Virtual MFA Device </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * For information about limits on the number of MFA devices you can
     * create, see <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The seed information contained in the QR code and the
     * Base32 string should be treated like any other secret access
     * information, such as your AWS access keys or your passwords. After you
     * provision your virtual device, you should ensure that the information
     * is destroyed following secure procedures.
     * </p>
     *
     * @param createVirtualMFADeviceRequest Container for the necessary
     *           parameters to execute the CreateVirtualMFADevice service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreateVirtualMFADevice service method,
     *         as returned by AmazonIdentityManagement.
     * 
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
    public CreateVirtualMFADeviceResult createVirtualMFADevice(CreateVirtualMFADeviceRequest createVirtualMFADeviceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateVirtualMFADeviceRequest> request = new CreateVirtualMFADeviceRequestMarshaller().marshall(createVirtualMFADeviceRequest);
        return invoke(request, new CreateVirtualMFADeviceResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Changes the status of the specified access key from Active to
     * Inactive, or vice versa. This action can be used to disable a user's
     * key as part of a key rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, this API can be used to manage root credentials even if the
     * AWS account has no associated users.
     * </p>
     * <p>
     * For information about rotating keys, see <a
     * ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     * Managing Keys and Certificates </a> in <i>Using AWS Identity and
     * Access Management</i> .
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
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateAccessKeyRequest> request = new UpdateAccessKeyRequestMarshaller().marshall(updateAccessKeyRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<AddUserToGroupRequest> request = new AddUserToGroupRequestMarshaller().marshall(addUserToGroupRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<GetGroupRequest> request = new GetGroupRequestMarshaller().marshall(getGroupRequest);
        return invoke(request, new GetGroupResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Lists the account aliases associated with the account. For information
     * about using an AWS account alias, see <a
     * ://docs.amazonwebservices.com/IAM/latest/UserGuide/AccountAlias.html">
     * Using an Alias for Your AWS Account ID </a> in <i>Using AWS Identity
     * and Access Management</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listAccountAliasesRequest Container for the necessary
     *           parameters to execute the ListAccountAliases service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListAccountAliases service method, as
     *         returned by AmazonIdentityManagement.
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
    public ListAccountAliasesResult listAccountAliases(ListAccountAliasesRequest listAccountAliasesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListAccountAliasesRequest> request = new ListAccountAliasesRequestMarshaller().marshall(listAccountAliasesRequest);
        return invoke(request, new ListAccountAliasesResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteGroupRequest> request = new DeleteGroupRequestMarshaller().marshall(deleteGroupRequest);
        invoke(request, null);
    }
    
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
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, this API can be used to manage root credentials even if the
     * AWS account has no associated users.
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListSigningCertificatesRequest> request = new ListSigningCertificatesRequestMarshaller().marshall(listSigningCertificatesRequest);
        return invoke(request, new ListSigningCertificatesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Uploads an X.509 signing certificate and associates it with the
     * specified user. Some AWS services use X.509 signing certificates to
     * validate requests that are signed with a corresponding private key.
     * When you upload the certificate, its default status is
     * <code>Active</code> .
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, this API can be used to manage root credentials even if the
     * AWS account has no associated users.
     * </p>
     * <p>
     * <b>NOTE:</b>Because the body of a X.509 certificate can be large, you
     * should use POST rather than GET when calling UploadSigningCertificate.
     * For more information, see Making Query Requests in Using AWS Identity
     * and Access Management.
     * </p>
     *
     * @param uploadSigningCertificateRequest Container for the necessary
     *           parameters to execute the UploadSigningCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the UploadSigningCertificate service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws DuplicateCertificateException
     * @throws InvalidCertificateException
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
            throws AmazonServiceException, AmazonClientException {
        Request<UploadSigningCertificateRequest> request = new UploadSigningCertificateRequestMarshaller().marshall(uploadSigningCertificateRequest);
        return invoke(request, new UploadSigningCertificateResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Changes the password for the specified user.
     * </p>
     *
     * @param updateLoginProfileRequest Container for the necessary
     *           parameters to execute the UpdateLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @throws PasswordPolicyViolationException
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
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateLoginProfileRequest> request = new UpdateLoginProfileRequestMarshaller().marshall(updateLoginProfileRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes the password for the specified user, which terminates the
     * user's ability to access AWS services through the AWS Management
     * Console.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Deleting a user's password does not prevent a user
     * from accessing IAM through the command line interface or the API. To
     * prevent all user access you must also either make the access key
     * inactive or delete it. For more information about making keys
     * inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteLoginProfileRequest> request = new DeleteLoginProfileRequestMarshaller().marshall(deleteLoginProfileRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Changes the password of the IAM user who is currently signed in. The
     * root account password is not affected by this action. For information
     * about modifying passwords, see <a
     * amazonwebservices.com/IAM/latest/UserGuide/Using_ManagingLogins.html">
     * Managing Passwords </a> .
     * </p>
     *
     * @param changePasswordRequest Container for the necessary parameters to
     *           execute the ChangePassword service method on AmazonIdentityManagement.
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
    public void changePassword(ChangePasswordRequest changePasswordRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ChangePasswordRequest> request = new ChangePasswordRequestMarshaller().marshall(changePasswordRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Retrieves information about the specified server certificate.
     * </p>
     *
     * @param getServerCertificateRequest Container for the necessary
     *           parameters to execute the GetServerCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetServerCertificate service method, as
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
    public GetServerCertificateResult getServerCertificate(GetServerCertificateRequest getServerCertificateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetServerCertificateRequest> request = new GetServerCertificateRequestMarshaller().marshall(getServerCertificateRequest);
        return invoke(request, new GetServerCertificateResultStaxUnmarshaller());
    }
    
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
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
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
     *           execute the PutGroupPolicy service method on AmazonIdentityManagement.
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
    public void putGroupPolicy(PutGroupPolicyRequest putGroupPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<PutGroupPolicyRequest> request = new PutGroupPolicyRequestMarshaller().marshall(putGroupPolicyRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes the specified signing certificate associated with the
     * specified user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS Access Key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use
     * this API to manage root credentials even if the AWS account has no
     * associated users.
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteSigningCertificateRequest> request = new DeleteSigningCertificateRequestMarshaller().marshall(deleteSigningCertificateRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListUserPoliciesRequest> request = new ListUserPoliciesRequestMarshaller().marshall(listUserPoliciesRequest);
        return invoke(request, new ListUserPoliciesResultStaxUnmarshaller());
    }
    
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
     * request. Because this action works for access keys under the AWS
     * account, this API can be used to manage root credentials even if the
     * AWS account has no associated users.
     * </p>
     * <p>
     * <b>NOTE:</b>To ensure the security of your AWS account, the secret
     * access key is accessible only during key and user creation.
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListAccessKeysRequest> request = new ListAccessKeysRequestMarshaller().marshall(listAccessKeysRequest);
        return invoke(request, new ListAccessKeysResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListGroupsForUserRequest> request = new ListGroupsForUserRequestMarshaller().marshall(listGroupsForUserRequest);
        return invoke(request, new ListGroupsForUserResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<GetGroupPolicyRequest> request = new GetGroupPolicyRequestMarshaller().marshall(getGroupPolicyRequest);
        return invoke(request, new GetGroupPolicyResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Lists the virtual MFA devices under the AWS account by assignment
     * status. If you do not specify an assignment status, the action returns
     * a list of all virtual MFA devices. Assignment status can be
     * <code>Assigned</code> ,
     * 
     * <code>Unassigned</code> , or <code>Any</code> .
     * 
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listVirtualMFADevicesRequest Container for the necessary
     *           parameters to execute the ListVirtualMFADevices service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListVirtualMFADevices service method, as
     *         returned by AmazonIdentityManagement.
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
    public ListVirtualMFADevicesResult listVirtualMFADevices(ListVirtualMFADevicesRequest listVirtualMFADevicesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListVirtualMFADevicesRequest> request = new ListVirtualMFADevicesRequestMarshaller().marshall(listVirtualMFADevicesRequest);
        return invoke(request, new ListVirtualMFADevicesResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListGroupPoliciesRequest> request = new ListGroupPoliciesRequestMarshaller().marshall(listGroupPoliciesRequest);
        return invoke(request, new ListGroupPoliciesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a password for the specified user, giving the user the ability
     * to access AWS services through the AWS Management Console. For more
     * information about managing passwords, see <a
     * rvices.com/IAM/latest/UserGuide/index.html?Using_ManagingLogins.html">
     * Managing Passwords </a> in <i>Using IAM</i> .
     * </p>
     *
     * @param createLoginProfileRequest Container for the necessary
     *           parameters to execute the CreateLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreateLoginProfile service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws PasswordPolicyViolationException
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateLoginProfileRequest> request = new CreateLoginProfileRequestMarshaller().marshall(createLoginProfileRequest);
        return invoke(request, new CreateLoginProfileResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Updates the password policy settings for the account.
     * </p>
     *
     * @param updateAccountPasswordPolicyRequest Container for the necessary
     *           parameters to execute the UpdateAccountPasswordPolicy service method
     *           on AmazonIdentityManagement.
     * 
     * @throws MalformedPolicyDocumentException
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
    public void updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateAccountPasswordPolicyRequest> request = new UpdateAccountPasswordPolicyRequestMarshaller().marshall(updateAccountPasswordPolicyRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Retrieves account level information about account entity usage and IAM
     * quotas.
     * </p>
     * <p>
     * For information about limitations on IAM entities, see <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     *
     * @param getAccountSummaryRequest Container for the necessary parameters
     *           to execute the GetAccountSummary service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetAccountSummary service method, as
     *         returned by AmazonIdentityManagement.
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
    public GetAccountSummaryResult getAccountSummary(GetAccountSummaryRequest getAccountSummaryRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetAccountSummaryRequest> request = new GetAccountSummaryRequestMarshaller().marshall(getAccountSummaryRequest);
        return invoke(request, new GetAccountSummaryResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Retrieves the password policy for the AWS account.
     * </p>
     *
     * @param getAccountPasswordPolicyRequest Container for the necessary
     *           parameters to execute the GetAccountPasswordPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetAccountPasswordPolicy service method,
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
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy(GetAccountPasswordPolicyRequest getAccountPasswordPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetAccountPasswordPolicyRequest> request = new GetAccountPasswordPolicyRequestMarshaller().marshall(getAccountPasswordPolicyRequest);
        return invoke(request, new GetAccountPasswordPolicyResultStaxUnmarshaller());
    }
    
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
    public ListGroupsResult listGroups() throws AmazonServiceException, AmazonClientException {
        return listGroups(new ListGroupsRequest());
    }
    
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
     * @return The response from the ListServerCertificates service method,
     *         as returned by AmazonIdentityManagement.
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
    public ListServerCertificatesResult listServerCertificates() throws AmazonServiceException, AmazonClientException {
        return listServerCertificates(new ListServerCertificatesRequest());
    }
    
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
    public ListUsersResult listUsers() throws AmazonServiceException, AmazonClientException {
        return listUsers(new ListUsersRequest());
    }
    
    /**
     * <p>
     * Deletes the password policy for the AWS account.
     * </p>
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
    public void deleteAccountPasswordPolicy() throws AmazonServiceException, AmazonClientException {
        deleteAccountPasswordPolicy(new DeleteAccountPasswordPolicyRequest());
    }
    
    /**
     * <p>
     * Creates a new AWS Secret Access Key and corresponding AWS Access Key
     * ID for the specified user. The default status for new keys is
     * <code>Active</code> .
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS Access Key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use
     * this API to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see
     * <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>To ensure the security of your AWS account, the
     * Secret Access Key is accessible only during key and user creation.
     * You must save the key (for example, in a text file) if you want to be
     * able to access it again. If a secret key is lost, you can delete the
     * access keys for the associated user and then create new keys.
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
    public CreateAccessKeyResult createAccessKey() throws AmazonServiceException, AmazonClientException {
        return createAccessKey(new CreateAccessKeyRequest());
    }
    
    /**
     * <p>
     * Retrieves information about the specified user, including the user's
     * path, GUID, and ARN.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS Access Key ID signing the request.
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
    public GetUserResult getUser() throws AmazonServiceException, AmazonClientException {
        return getUser(new GetUserRequest());
    }
    
    /**
     * <p>
     * Lists the MFA devices. If the request includes the user name, then
     * this action lists all the MFA devices associated with the specified
     * user name. If you do not specify a user name, IAM determines the user
     * name implicitly based on the AWS Access Key ID signing the request.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
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
    public ListMFADevicesResult listMFADevices() throws AmazonServiceException, AmazonClientException {
        return listMFADevices(new ListMFADevicesRequest());
    }
    
    /**
     * <p>
     * Lists the account aliases associated with the account. For information
     * about using an AWS account alias, see <a
     * ://docs.amazonwebservices.com/IAM/latest/UserGuide/AccountAlias.html">
     * Using an Alias for Your AWS Account ID </a> in <i>Using AWS Identity
     * and Access Management</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListAccountAliases service method, as
     *         returned by AmazonIdentityManagement.
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
    public ListAccountAliasesResult listAccountAliases() throws AmazonServiceException, AmazonClientException {
        return listAccountAliases(new ListAccountAliasesRequest());
    }
    
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
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS Access Key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, this API can be used to manage root credentials even if the
     * AWS account has no associated users.
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
    public ListSigningCertificatesResult listSigningCertificates() throws AmazonServiceException, AmazonClientException {
        return listSigningCertificates(new ListSigningCertificatesRequest());
    }
    
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
     * request. Because this action works for access keys under the AWS
     * account, this API can be used to manage root credentials even if the
     * AWS account has no associated users.
     * </p>
     * <p>
     * <b>NOTE:</b>To ensure the security of your AWS account, the secret
     * access key is accessible only during key and user creation.
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
    public ListAccessKeysResult listAccessKeys() throws AmazonServiceException, AmazonClientException {
        return listAccessKeys(new ListAccessKeysRequest());
    }
    
    /**
     * <p>
     * Lists the virtual MFA devices under the AWS account by assignment
     * status. If you do not specify an assignment status, the action returns
     * a list of all virtual MFA devices. Assignment status can be
     * <code>Assigned</code> ,
     * 
     * <code>Unassigned</code> , or <code>Any</code> .
     * 
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListVirtualMFADevices service method, as
     *         returned by AmazonIdentityManagement.
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
    public ListVirtualMFADevicesResult listVirtualMFADevices() throws AmazonServiceException, AmazonClientException {
        return listVirtualMFADevices(new ListVirtualMFADevicesRequest());
    }
    
    /**
     * <p>
     * Retrieves account level information about account entity usage and IAM
     * quotas.
     * </p>
     * <p>
     * For information about limitations on IAM entities, see <a
     * vices.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html">
     * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
     * Management</i> .
     * </p>
     * 
     * @return The response from the GetAccountSummary service method, as
     *         returned by AmazonIdentityManagement.
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
    public GetAccountSummaryResult getAccountSummary() throws AmazonServiceException, AmazonClientException {
        return getAccountSummary(new GetAccountSummaryRequest());
    }
    
    /**
     * <p>
     * Retrieves the password policy for the AWS account.
     * </p>
     * 
     * @return The response from the GetAccountPasswordPolicy service method,
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
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy() throws AmazonServiceException, AmazonClientException {
        return getAccountPasswordPolicy(new GetAccountPasswordPolicyRequest());
    }
    


    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials(); 
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext();
        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        
        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        
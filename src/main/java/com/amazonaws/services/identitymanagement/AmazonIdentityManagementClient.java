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

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.security.SignatureException;

import com.amazonaws.*;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWS3Signer;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.HttpRequest;
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
public class AmazonIdentityManagementClient extends AmazonWebServiceClient implements AmazonIdentityManagement {

    /**
     * The AWS credentials (access key ID and secret key) to use when
     * authenticating with AWS services.
     */
    private AWSCredentials awsCredentials;

    /**
     * List of exception unmarshallers for all AmazonIdentityManagement exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers;

    /** Low level client for sending requests to AWS services. */
    protected final HttpClient client;

    /** Optional request handlers for additional request processing. */
    private List<RequestHandler> requestHandlers = new ArrayList<RequestHandler>();
    
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
        this.awsCredentials = awsCredentials;

        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
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
        exceptionUnmarshallers.add(new NoSuchEntityExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("iam.amazonaws.com");

        signer = new QueryStringSigner(awsCredentials);

        requestHandlers = new HandlerChainFactory().newRequestHandlerChain(
                "/com/amazonaws/services/identitymanagement/request.handlers");
        client = new HttpClient(clientConfiguration);
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
     * Deletes the specified policy associated with the specified User.
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
     * Retrieves the specified policy document for the specified User. The
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
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateLoginProfileRequest> request = new UpdateLoginProfileRequestMarshaller().marshall(updateLoginProfileRequest);
        invoke(request, null);
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
     * Lists the Users that have the specified path prefix. If there are
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
     * Enables the specified MFA device and associates it with the specified
     * User name. Once enabled, the MFA device is required for every
     * subsequent login by the User name associated with the device.
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
     * Lists the names of the policies associated with the specified User. If
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
     * Lists the groups the specified User belongs to.
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
     * Deletes the specified User. The User must not belong to any groups,
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
     * with the User name for which it was originally enabled.
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
     * Removes the specified User from the specified group.
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateLoginProfileRequest> request = new CreateLoginProfileRequestMarshaller().marshall(createLoginProfileRequest);
        return invoke(request, new CreateLoginProfileResultStaxUnmarshaller());
    }
    
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
     * Retrieves information about the specified User, including the User's
     * path, GUID, and ARN.
     * </p>
     * <p>
     * If you do not specify a User name, IAM determines the User name
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
     * Lists the MFA devices associated with the specified User name.
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
     * Adds the specified User to the specified group.
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
     * Returns a list of Users that are in the specified group. You can
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
     * Deletes the specified group. The group must not contain any Users or
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
     * Lists the Users that have the specified path prefix. If there are
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
     * Retrieves information about the specified User, including the User's
     * path, GUID, and ARN.
     * </p>
     * <p>
     * If you do not specify a User name, IAM determines the User name
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

        // Apply any additional service specific request handlers that need to be run
        if (requestHandlers != null) {
            for (RequestHandler requestHandler : requestHandlers) {
                request = requestHandler.handleRequest(request);
            }
        }

        try {
            signer.sign(request);
        } catch (SignatureException e) {
            throw new AmazonServiceException("Unable to sign request", e);
        }

        HttpRequest httpRequest = convertToHttpRequest(request, HttpMethodName.POST);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return (X)client.execute(httpRequest, responseHandler, errorResponseHandler);
    }
}
        
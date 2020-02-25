/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.organizations.AWSOrganizationsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.services.organizations.model.transform.*;

/**
 * Client for accessing Organizations. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>AWS Organizations</fullname>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOrganizationsClient extends AmazonWebServiceClient implements AWSOrganizations {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSOrganizations.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "organizations";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyTypeNotAvailableForOrganizationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.PolicyTypeNotAvailableForOrganizationExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("HandshakeNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.HandshakeNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateAccountException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.DuplicateAccountExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedPolicyDocumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.MalformedPolicyDocumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateHandshakeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.DuplicateHandshakeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicatePolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.DuplicatePolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("HandshakeAlreadyInStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.HandshakeAlreadyInStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ChildNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.ChildNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountOwnerNotVerifiedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.AccountOwnerNotVerifiedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.ServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RootNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.RootNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationNotEmptyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.OrganizationNotEmptyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationalUnitNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.OrganizationalUnitNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.PolicyNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyTypeAlreadyEnabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.PolicyTypeAlreadyEnabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedForDependencyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.AccessDeniedForDependencyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicatePolicyAttachmentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.DuplicatePolicyAttachmentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MasterCannotLeaveOrganizationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.MasterCannotLeaveOrganizationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyChangesInProgressException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.PolicyChangesInProgressExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DestinationParentNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.DestinationParentNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyTypeNotEnabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.PolicyTypeNotEnabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConstraintViolationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.ConstraintViolationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TargetNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.TargetNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CreateAccountStatusNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.CreateAccountStatusNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EffectivePolicyNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.EffectivePolicyNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyNotAttachedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.PolicyNotAttachedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyInOrganizationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.AlreadyInOrganizationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.AccountNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SourceParentNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.SourceParentNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AWSOrganizationsNotInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.AWSOrganizationsNotInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedAPIEndpointException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.UnsupportedAPIEndpointExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParentNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.ParentNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateOrganizationalUnitException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.DuplicateOrganizationalUnitExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidHandshakeTransitionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.InvalidHandshakeTransitionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("HandshakeConstraintViolationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.HandshakeConstraintViolationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.PolicyInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FinalizingOrganizationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.FinalizingOrganizationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationalUnitNotEmptyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.organizations.model.transform.OrganizationalUnitNotEmptyExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.organizations.model.AWSOrganizationsException.class));

    /**
     * Constructs a new client to invoke service methods on Organizations. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSOrganizationsClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSOrganizationsClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Organizations. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Organizations (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSOrganizationsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOrganizationsClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Organizations using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSOrganizationsClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSOrganizationsClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSOrganizationsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Organizations using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Organizations (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSOrganizationsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOrganizationsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOrganizationsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Organizations using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSOrganizationsClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSOrganizationsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Organizations using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Organizations (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSOrganizationsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOrganizationsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOrganizationsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Organizations using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Organizations (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSOrganizationsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOrganizationsClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSOrganizationsClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSOrganizationsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSOrganizationsClientBuilder builder() {
        return AWSOrganizationsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Organizations using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOrganizationsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Organizations using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOrganizationsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("organizations.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/organizations/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/organizations/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.
     * </p>
     * <p>
     * This operation can be called only by the following principals when they also have the relevant IAM permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Invitation to join</b> or <b>Approve all features request</b> handshakes: only a principal from the member
     * account.
     * </p>
     * <p>
     * The user who calls the API for an invitation to join must have the <code>organizations:AcceptHandshake</code>
     * permission. If you enabled all features in the organization, the user must also have the
     * <code>iam:CreateServiceLinkedRole</code> permission so that AWS Organizations can create the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integration_services.html#orgs_integration_service-linked-roles"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Enable all features final confirmation</b> handshake: only a principal from the master account.
     * </p>
     * <p>
     * For more information about invitations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_invites.html">Inviting an
     * AWS Account to Join Your Organization</a> in the <i>AWS Organizations User Guide.</i> For more information about
     * requests to enable all features in the organization, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
     * </p>
     * 
     * @param acceptHandshakeRequest
     * @return Result of the AcceptHandshake operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws HandshakeConstraintViolationException
     *         The requested operation would violate the constraint identified in the reason code.</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. Note that deleted and closed accounts still count toward your limit.
     *         </p>
     *         <important>
     *         <p>
     *         If you get this exception immediately after creating the organization, wait one hour and try again. If
     *         after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         ALREADY_IN_AN_ORGANIZATION: The handshake request is invalid because the invited account is already a
     *         member of an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES: You can't issue new invitations to join an organization while
     *         it's in the process of enabling all features. You can resume inviting accounts after you finalize the
     *         process when all accounts have agreed to the change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_ALREADY_HAS_ALL_FEATURES: The handshake request is invalid because the organization has
     *         already enabled all features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD: The request failed because the account is from a different
     *         marketplace than the accounts in the organization. For example, accounts with India addresses must be
     *         associated with the AISPL marketplace. All accounts in an organization must be from the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED: You attempted to change the membership of an account
     *         too quickly after its previous change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAYMENT_INSTRUMENT_REQUIRED: You can't complete the operation with an account that doesn't have a payment
     *         instrument, such as a credit card, associated with it.
     *         </p>
     *         </li>
     * @throws HandshakeNotFoundException
     *         We can't find a handshake with the <code>HandshakeId</code> that you specified.
     * @throws InvalidHandshakeTransitionException
     *         You can't perform the operation on the handshake in its current state. For example, you can't cancel a
     *         handshake that was already accepted or accept a handshake that was already declined.
     * @throws HandshakeAlreadyInStateException
     *         The specified handshake is already in the requested state. For example, you can't accept a handshake that
     *         was already accepted.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws AccessDeniedForDependencyException
     *         The operation that you attempted requires you to have the <code>iam:CreateServiceLinkedRole</code> for
     *         <code>organizations.amazonaws.com</code> permission so that AWS Organizations can create the required
     *         service-linked role. You don't have that permission.
     * @sample AWSOrganizations.AcceptHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/AcceptHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AcceptHandshakeResult acceptHandshake(AcceptHandshakeRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptHandshake(request);
    }

    @SdkInternalApi
    final AcceptHandshakeResult executeAcceptHandshake(AcceptHandshakeRequest acceptHandshakeRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptHandshakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptHandshakeRequest> request = null;
        Response<AcceptHandshakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptHandshakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptHandshakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptHandshake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptHandshakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptHandshakeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a policy to a root, an organizational unit (OU), or an individual account.
     * </p>
     * <p>
     * How the policy affects accounts depends on the type of policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about attaching SCPs, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_about-scps.html">How SCPs
     * Work</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about attaching tag policies, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies-inheritance.html">How
     * Policy Inheritance Works</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param attachPolicyRequest
     * @return Result of the AttachPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws DuplicatePolicyAttachmentException
     *         The selected policy is already attached to the specified target.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws PolicyTypeNotEnabledException
     *         The specified policy type isn't currently enabled in this root. You can't attach policies of the
     *         specified type to entities in a root until you enable that type in the root. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *         >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, or account with the <code>TargetId</code> that you specified.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.AttachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/AttachPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AttachPolicyResult attachPolicy(AttachPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeAttachPolicy(request);
    }

    @SdkInternalApi
    final AttachPolicyResult executeAttachPolicy(AttachPolicyRequest attachPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(attachPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachPolicyRequest> request = null;
        Response<AttachPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a handshake. Canceling a handshake sets the handshake state to <code>CANCELED</code>.
     * </p>
     * <p>
     * This operation can be called only from the account that originated the handshake. The recipient of the handshake
     * can't cancel it, but can use <a>DeclineHandshake</a> instead. After a handshake is canceled, the recipient can no
     * longer respond to that handshake.
     * </p>
     * <p>
     * After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
     * </p>
     * 
     * @param cancelHandshakeRequest
     * @return Result of the CancelHandshake operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeNotFoundException
     *         We can't find a handshake with the <code>HandshakeId</code> that you specified.
     * @throws InvalidHandshakeTransitionException
     *         You can't perform the operation on the handshake in its current state. For example, you can't cancel a
     *         handshake that was already accepted or accept a handshake that was already declined.
     * @throws HandshakeAlreadyInStateException
     *         The specified handshake is already in the requested state. For example, you can't accept a handshake that
     *         was already accepted.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.CancelHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CancelHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelHandshakeResult cancelHandshake(CancelHandshakeRequest request) {
        request = beforeClientExecution(request);
        return executeCancelHandshake(request);
    }

    @SdkInternalApi
    final CancelHandshakeResult executeCancelHandshake(CancelHandshakeRequest cancelHandshakeRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelHandshakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelHandshakeRequest> request = null;
        Response<CancelHandshakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelHandshakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelHandshakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelHandshake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelHandshakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelHandshakeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS account that is automatically a member of the organization whose credentials made the request.
     * This is an asynchronous request that AWS performs in the background. Because <code>CreateAccount</code> operates
     * asynchronously, it can return a successful completion message even though account initialization might still be
     * in progress. You might need to wait a few minutes before you can successfully access the account. To check the
     * status of the request, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>OperationId</code> response element from this operation to provide as a parameter to the
     * <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code> event. For information on using AWS
     * CloudTrail with AWS Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html">Monitoring the Activity in
     * Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * The user who calls the API to create an account must have the <code>organizations:CreateAccount</code>
     * permission. If you enabled all features in the organization, AWS Organizations creates the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * AWS Organizations preconfigures the new member account with a role (named
     * <code>OrganizationAccountAccessRole</code> by default) that grants users in the master account administrator
     * permissions in the new member account. Principals in the master account can assume the role. AWS Organizations
     * clones the company name and address information for the new account from the organization's master account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html">Creating an
     * AWS Account in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * When you create an account in an organization, the information required for the account to operate as a
     * standalone account is <i>not</i> automatically collected. For example, information about the payment method and
     * signing the end user license agreement (EULA) is not collected. If you must remove an account from your
     * organization later, you can do so only after you provide the missing information. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because your organization is still initializing,
     * wait one hour and then try again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateAccount</code> to create multiple temporary accounts isn't recommended. You can only close an
     * account from the Billing and Cost Management Console, and you must be signed in as the root user. For information
     * on the requirements and process for closing an account, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html">Closing an AWS
     * Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose whether to create the account with the
     * <b>IAM User and Role Access to Billing Information</b> switch enabled. If you enable it, IAM users and roles that
     * have appropriate permissions can view billing information for the account. If you disable it, only the account
     * root user can access billing information. For information about how to disable this switch for an account, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
     * 
     * @param createAccountRequest
     * @return Result of the CreateAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws FinalizingOrganizationException
     *         AWS Organizations couldn't perform the operation because your organization hasn't finished initializing.
     *         This can take up to an hour. Try again later. If after one hour you continue to receive this error,
     *         contact <a href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.CreateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAccountResult createAccount(CreateAccountRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccount(request);
    }

    @SdkInternalApi
    final CreateAccountResult executeCreateAccount(CreateAccountRequest createAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccountRequest> request = null;
        Response<CreateAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action is available if all of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're authorized to create accounts in the AWS GovCloud (US) Region. For more information on the AWS GovCloud
     * (US) Region, see the <a href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/welcome.html"> <i>AWS
     * GovCloud User Guide</i>.</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * You already have an account in the AWS GovCloud (US) Region that is associated with your master account in the
     * commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call this action from the master account of your organization in the commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You have the <code>organizations:CreateGovCloudAccount</code> permission. AWS Organizations creates the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS automatically enables AWS CloudTrail for AWS GovCloud (US) accounts, but you should also do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Verify that AWS CloudTrail is enabled to store logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create an S3 bucket for AWS CloudTrail log storage.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/verifying-cloudtrail.html">Verifying AWS CloudTrail
     * Is Enabled</a> in the <i>AWS GovCloud User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You call this action from the master account of your organization in the commercial Region to create a standalone
     * AWS account in the AWS GovCloud (US) Region. After the account is created, the master account of an organization
     * in the AWS GovCloud (US) Region can invite it to that organization. For more information on inviting standalone
     * accounts in the AWS GovCloud (US) to join an organization, see <a
     * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS Organizations</a>
     * in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * Calling <code>CreateGovCloudAccount</code> is an asynchronous request that AWS performs in the background.
     * Because <code>CreateGovCloudAccount</code> operates asynchronously, it can return a successful completion message
     * even though account initialization might still be in progress. You might need to wait a few minutes before you
     * can successfully access the account. To check the status of the request, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>OperationId</code> response element from this operation to provide as a parameter to the
     * <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code> event. For information on using AWS
     * CloudTrail with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html">Monitoring the Activity in
     * Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * When you call the <code>CreateGovCloudAccount</code> action, you create two accounts: a standalone account in the
     * AWS GovCloud (US) Region and an associated account in the commercial Region for billing and support purposes. The
     * account in the commercial Region is automatically a member of the organization whose credentials made the
     * request. Both accounts are associated with the same email address.
     * </p>
     * <p>
     * A role is created in the new account in the commercial Region that allows the master account in the organization
     * in the commercial Region to assume it. An AWS GovCloud (US) account is then created and associated with the
     * commercial account that you just created. A role is created in the new AWS GovCloud (US) account. This role can
     * be assumed by the AWS GovCloud (US) account that is associated with the master account of the commercial
     * organization. For more information and to view a diagram that explains how account access works, see <a
     * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS Organizations</a>
     * in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html">Creating an
     * AWS Account in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You can create an account in an organization using the AWS Organizations console, API, or CLI commands. When you
     * do, the information required for the account to operate as a standalone account, such as a payment method, is
     * <i>not</i> automatically collected. If you must remove an account from your organization later, you can do so
     * only after you provide the missing information. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because your organization is still initializing,
     * wait one hour and then try again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateGovCloudAccount</code> to create multiple temporary accounts isn't recommended. You can only
     * close an account from the AWS Billing and Cost Management console, and you must be signed in as the root user.
     * For information on the requirements and process for closing an account, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html">Closing an AWS
     * Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose whether to create the account with the
     * <b>IAM User and Role Access to Billing Information</b> switch enabled. If you enable it, IAM users and roles that
     * have appropriate permissions can view billing information for the account. If you disable it, only the account
     * root user can access billing information. For information about how to disable this switch for an account, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
     * 
     * @param createGovCloudAccountRequest
     * @return Result of the CreateGovCloudAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws FinalizingOrganizationException
     *         AWS Organizations couldn't perform the operation because your organization hasn't finished initializing.
     *         This can take up to an hour. Try again later. If after one hour you continue to receive this error,
     *         contact <a href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.CreateGovCloudAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateGovCloudAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateGovCloudAccountResult createGovCloudAccount(CreateGovCloudAccountRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGovCloudAccount(request);
    }

    @SdkInternalApi
    final CreateGovCloudAccountResult executeCreateGovCloudAccount(CreateGovCloudAccountRequest createGovCloudAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(createGovCloudAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGovCloudAccountRequest> request = null;
        Response<CreateGovCloudAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGovCloudAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGovCloudAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGovCloudAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGovCloudAccountResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateGovCloudAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS organization. The account whose user is calling the <code>CreateOrganization</code> operation
     * automatically becomes the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/orgs_getting-started_concepts.html#account">master
     * account</a> of the new organization.
     * </p>
     * <p>
     * This operation must be called using credentials from the account that is to become the new organization's master
     * account. The principal must also have the relevant IAM permissions.
     * </p>
     * <p>
     * By default (or if you set the <code>FeatureSet</code> parameter to <code>ALL</code>), the new organization is
     * created with all features enabled. In addition, service control policies are automatically enabled in the root.
     * If you instead create the organization supporting only the consolidated billing features, no policy types are
     * enabled by default, and you can't use organization policies.
     * </p>
     * 
     * @param createOrganizationRequest
     * @return Result of the CreateOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AlreadyInOrganizationException
     *         This account is already a member of an organization. An account can belong to only one organization at a
     *         time.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws AccessDeniedForDependencyException
     *         The operation that you attempted requires you to have the <code>iam:CreateServiceLinkedRole</code> for
     *         <code>organizations.amazonaws.com</code> permission so that AWS Organizations can create the required
     *         service-linked role. You don't have that permission.
     * @sample AWSOrganizations.CreateOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateOrganizationResult createOrganization(CreateOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOrganization(request);
    }

    @SdkInternalApi
    final CreateOrganizationResult executeCreateOrganization(CreateOrganizationRequest createOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(createOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOrganizationRequest> request = null;
        Response<CreateOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an organizational unit (OU) within a root or parent OU. An OU is a container for accounts that enables
     * you to organize your accounts to apply policies according to your business requirements. The number of levels
     * deep that you can nest OUs is dependent upon the policy types enabled for that root. For service control
     * policies, the limit is five.
     * </p>
     * <p>
     * For more information about OUs, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing Organizational
     * Units</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createOrganizationalUnitRequest
     * @return Result of the CreateOrganizationalUnit operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws DuplicateOrganizationalUnitException
     *         An OU with the same name already exists.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ParentNotFoundException
     *         We can't find a root or OU with the <code>ParentId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.CreateOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateOrganizationalUnitResult createOrganizationalUnit(CreateOrganizationalUnitRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOrganizationalUnit(request);
    }

    @SdkInternalApi
    final CreateOrganizationalUnitResult executeCreateOrganizationalUnit(CreateOrganizationalUnitRequest createOrganizationalUnitRequest) {

        ExecutionContext executionContext = createExecutionContext(createOrganizationalUnitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOrganizationalUnitRequest> request = null;
        Response<CreateOrganizationalUnitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOrganizationalUnitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createOrganizationalUnitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOrganizationalUnit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOrganizationalUnitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateOrganizationalUnitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual
     * AWS account.
     * </p>
     * <p>
     * For more information about policies and their use, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html">Managing Organization
     * Policies</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createPolicyRequest
     * @return Result of the CreatePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws DuplicatePolicyException
     *         A policy with the same name already exists.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws MalformedPolicyDocumentException
     *         The provided policy document doesn't meet the requirements of the specified policy type. For example, the
     *         syntax might be incorrect. For details about service control policy syntax, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *         Control Policy Syntax</a> in the <i>AWS Organizations User Guide.</i>
     * @throws PolicyTypeNotAvailableForOrganizationException
     *         You can't use the specified policy type with the feature set currently enabled for this organization. For
     *         example, you can enable SCPs only after you enable all features in the organization. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html#enable_policies_on_root"
     *         >Enabling and Disabling a Policy Type on a Root</a> in the <i>AWS Organizations User Guide.</i>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.CreatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreatePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePolicyResult createPolicy(CreatePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePolicy(request);
    }

    @SdkInternalApi
    final CreatePolicyResult executeCreatePolicy(CreatePolicyRequest createPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyRequest> request = null;
        Response<CreatePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Declines a handshake request. This sets the handshake state to <code>DECLINED</code> and effectively deactivates
     * the request.
     * </p>
     * <p>
     * This operation can be called only from the account that received the handshake. The originator of the handshake
     * can use <a>CancelHandshake</a> instead. The originator can't reactivate a declined request, but can reinitiate
     * the process with a new handshake request.
     * </p>
     * <p>
     * After you decline a handshake, it continues to appear in the results of relevant API operations for only 30 days.
     * After that, it's deleted.
     * </p>
     * 
     * @param declineHandshakeRequest
     * @return Result of the DeclineHandshake operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeNotFoundException
     *         We can't find a handshake with the <code>HandshakeId</code> that you specified.
     * @throws InvalidHandshakeTransitionException
     *         You can't perform the operation on the handshake in its current state. For example, you can't cancel a
     *         handshake that was already accepted or accept a handshake that was already declined.
     * @throws HandshakeAlreadyInStateException
     *         The specified handshake is already in the requested state. For example, you can't accept a handshake that
     *         was already accepted.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DeclineHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeclineHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeclineHandshakeResult declineHandshake(DeclineHandshakeRequest request) {
        request = beforeClientExecution(request);
        return executeDeclineHandshake(request);
    }

    @SdkInternalApi
    final DeclineHandshakeResult executeDeclineHandshake(DeclineHandshakeRequest declineHandshakeRequest) {

        ExecutionContext executionContext = createExecutionContext(declineHandshakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeclineHandshakeRequest> request = null;
        Response<DeclineHandshakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeclineHandshakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(declineHandshakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeclineHandshake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeclineHandshakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeclineHandshakeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the organization. You can delete an organization only by using credentials from the master account. The
     * organization must be empty of member accounts.
     * </p>
     * 
     * @param deleteOrganizationRequest
     * @return Result of the DeleteOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws OrganizationNotEmptyException
     *         The organization isn't empty. To delete an organization, you must first remove all accounts except the
     *         master account, delete all OUs, and delete all policies.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DeleteOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeleteOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOrganizationResult deleteOrganization(DeleteOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOrganization(request);
    }

    @SdkInternalApi
    final DeleteOrganizationResult executeDeleteOrganization(DeleteOrganizationRequest deleteOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOrganizationRequest> request = null;
        Response<DeleteOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs
     * from the OU that you want to delete.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param deleteOrganizationalUnitRequest
     * @return Result of the DeleteOrganizationalUnit operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws OrganizationalUnitNotEmptyException
     *         The specified OU is not empty. Move all accounts to another root or to other OUs, remove all child OUs,
     *         and try the operation again.
     * @throws OrganizationalUnitNotFoundException
     *         We can't find an OU with the <code>OrganizationalUnitId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DeleteOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeleteOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOrganizationalUnitResult deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOrganizationalUnit(request);
    }

    @SdkInternalApi
    final DeleteOrganizationalUnitResult executeDeleteOrganizationalUnit(DeleteOrganizationalUnitRequest deleteOrganizationalUnitRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOrganizationalUnitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOrganizationalUnitRequest> request = null;
        Response<DeleteOrganizationalUnitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOrganizationalUnitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteOrganizationalUnitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOrganizationalUnit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOrganizationalUnitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteOrganizationalUnitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the
     * policy from all organizational units (OUs), roots, and accounts.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws PolicyInUseException
     *         The policy is attached to one or more entities. You must detach it from all roots, OUs, and accounts
     *         before performing this operation.
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicy(request);
    }

    @SdkInternalApi
    final DeletePolicyResult executeDeletePolicy(DeletePolicyRequest deletePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyRequest> request = null;
        Response<DeletePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves AWS Organizations related information about the specified account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describeAccountRequest
     * @return Result of the DescribeAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified. Or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DescribeAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAccountResult describeAccount(DescribeAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccount(request);
    }

    @SdkInternalApi
    final DescribeAccountResult executeDescribeAccount(DescribeAccountRequest describeAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountRequest> request = null;
        Response<DescribeAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current status of an asynchronous request to create an account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describeCreateAccountStatusRequest
     * @return Result of the DescribeCreateAccountStatus operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws CreateAccountStatusNotFoundException
     *         We can't find a create account request with the <code>CreateAccountRequestId</code> that you specified.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.DescribeCreateAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeCreateAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCreateAccountStatusResult describeCreateAccountStatus(DescribeCreateAccountStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCreateAccountStatus(request);
    }

    @SdkInternalApi
    final DescribeCreateAccountStatusResult executeDescribeCreateAccountStatus(DescribeCreateAccountStatusRequest describeCreateAccountStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCreateAccountStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCreateAccountStatusRequest> request = null;
        Response<DescribeCreateAccountStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCreateAccountStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCreateAccountStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCreateAccountStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCreateAccountStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCreateAccountStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the contents of the effective tag policy for the account. The effective tag policy is the aggregation of
     * any tag policies the account inherits, plus any policy directly that is attached to the account.
     * </p>
     * <p>
     * This action returns information on tag policies only.
     * </p>
     * <p>
     * For more information on policy inheritance, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies-inheritance.html">How Policy
     * Inheritance Works</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param describeEffectivePolicyRequest
     * @return Result of the DescribeEffectivePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws TargetNotFoundException
     *         We can't find a root, OU, or account with the <code>TargetId</code> that you specified.
     * @throws EffectivePolicyNotFoundException
     *         If you ran this action on the master account, this policy type is not enabled. If you ran the action on a
     *         member account, the account doesn't have an effective policy of this type. Contact the administrator of
     *         your organization about attaching a policy of this type to the account.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:
     *         </p>
     *         <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.DescribeEffectivePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeEffectivePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEffectivePolicyResult describeEffectivePolicy(DescribeEffectivePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEffectivePolicy(request);
    }

    @SdkInternalApi
    final DescribeEffectivePolicyResult executeDescribeEffectivePolicy(DescribeEffectivePolicyRequest describeEffectivePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEffectivePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEffectivePolicyRequest> request = null;
        Response<DescribeEffectivePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEffectivePolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEffectivePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEffectivePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEffectivePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEffectivePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a previously requested handshake. The handshake ID comes from the response to the
     * original <a>InviteAccountToOrganization</a> operation that generated the handshake.
     * </p>
     * <p>
     * You can access handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> for
     * only 30 days after they change to that state. They're then deleted and no longer accessible.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param describeHandshakeRequest
     * @return Result of the DescribeHandshake operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeNotFoundException
     *         We can't find a handshake with the <code>HandshakeId</code> that you specified.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DescribeHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeHandshake"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeHandshakeResult describeHandshake(DescribeHandshakeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHandshake(request);
    }

    @SdkInternalApi
    final DescribeHandshakeResult executeDescribeHandshake(DescribeHandshakeRequest describeHandshakeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHandshakeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHandshakeRequest> request = null;
        Response<DescribeHandshakeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHandshakeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeHandshakeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHandshake");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHandshakeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeHandshakeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the organization that the user's account belongs to.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can disable it separately at the root level
     * with <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the status of policy types for a specified root.
     * </p>
     * </note>
     * 
     * @param describeOrganizationRequest
     * @return Result of the DescribeOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrganizationResult describeOrganization(DescribeOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganization(request);
    }

    @SdkInternalApi
    final DescribeOrganizationResult executeDescribeOrganization(DescribeOrganizationRequest describeOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationRequest> request = null;
        Response<DescribeOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an organizational unit (OU).
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describeOrganizationalUnitRequest
     * @return Result of the DescribeOrganizationalUnit operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws OrganizationalUnitNotFoundException
     *         We can't find an OU with the <code>OrganizationalUnitId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DescribeOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrganizationalUnitResult describeOrganizationalUnit(DescribeOrganizationalUnitRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganizationalUnit(request);
    }

    @SdkInternalApi
    final DescribeOrganizationalUnitResult executeDescribeOrganizationalUnit(DescribeOrganizationalUnitRequest describeOrganizationalUnitRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationalUnitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationalUnitRequest> request = null;
        Response<DescribeOrganizationalUnitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationalUnitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOrganizationalUnitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganizationalUnit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationalUnitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOrganizationalUnitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a policy.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describePolicyRequest
     * @return Result of the DescribePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.DescribePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribePolicyResult describePolicy(DescribePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePolicy(request);
    }

    @SdkInternalApi
    final DescribePolicyResult executeDescribePolicy(DescribePolicyRequest describePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(describePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePolicyRequest> request = null;
        Response<DescribePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a policy from a target root, organizational unit (OU), or account. If the policy being detached is a
     * service control policy (SCP), the changes to permissions for IAM users and roles in affected accounts are
     * immediate.
     * </p>
     * <p>
     * <b>Note:</b> Every root, OU, and account must have at least one SCP attached. You can replace the default
     * <code>FullAWSAccess</code> policy with one that limits the permissions that can be delegated. To do that, you
     * must attach the replacement policy before you can remove the default one. This is the authorization strategy of
     * using an <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_about-scps.html#orgs_policies_whitelist"
     * >allow list</a>. You could instead attach a second SCP and leave the <code>FullAWSAccess</code> SCP still
     * attached. You could then specify <code>"Effect": "Deny"</code> in the second SCP to override the
     * <code>"Effect": "Allow"</code> in the <code>FullAWSAccess</code> policy (or any other attached SCP). If you take
     * these steps, you're using the authorization strategy of a <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_about-scps.html#orgs_policies_blacklist"
     * >deny list</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param detachPolicyRequest
     * @return Result of the DetachPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws PolicyNotAttachedException
     *         The policy isn't attached to the specified target in the specified root.
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, or account with the <code>TargetId</code> that you specified.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.DetachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DetachPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DetachPolicyResult detachPolicy(DetachPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDetachPolicy(request);
    }

    @SdkInternalApi
    final DetachPolicyResult executeDetachPolicy(DetachPolicyRequest detachPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(detachPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachPolicyRequest> request = null;
        Response<DetachPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the integration of an AWS service (the service that is specified by <code>ServicePrincipal</code>) with
     * AWS Organizations. When you disable integration, the specified service no longer can create a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a> in
     * <i>new</i> accounts in your organization. This means the service can't perform operations on your behalf on any
     * new accounts in your organization. The service can still perform operations in older accounts until the service
     * completes its clean-up from AWS Organizations.
     * </p>
     * <p/>
     * <important>
     * <p>
     * We recommend that you disable integration between AWS Organizations and the specified AWS service by using the
     * console or commands that are provided by the specified service. Doing so ensures that the other service is aware
     * that it can clean up any resources that are required only for the integration. How the service cleans up its
     * resources in the organization's accounts depends on that service. For more information, see the documentation for
     * the other AWS service.
     * </p>
     * </important>
     * <p>
     * After you perform the <code>DisableAWSServiceAccess</code> operation, the specified service can no longer perform
     * operations in your organization's accounts. The only exception is when the operations are explicitly permitted by
     * IAM policies that are attached to your roles.
     * </p>
     * <p>
     * For more information about integrating other services with AWS Organizations, including the list of services that
     * work with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param disableAWSServiceAccessRequest
     * @return Result of the DisableAWSServiceAccess operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.DisableAWSServiceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DisableAWSServiceAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableAWSServiceAccessResult disableAWSServiceAccess(DisableAWSServiceAccessRequest request) {
        request = beforeClientExecution(request);
        return executeDisableAWSServiceAccess(request);
    }

    @SdkInternalApi
    final DisableAWSServiceAccessResult executeDisableAWSServiceAccess(DisableAWSServiceAccessRequest disableAWSServiceAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(disableAWSServiceAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAWSServiceAccessRequest> request = null;
        Response<DisableAWSServiceAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableAWSServiceAccessRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableAWSServiceAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableAWSServiceAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableAWSServiceAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableAWSServiceAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables an organizational control policy type in a root and detaches all policies of that type from the
     * organization root, OUs, and accounts. A policy of a certain type can be attached to entities in a root only if
     * that type is enabled in the root. After you perform this operation, you no longer can attach policies of the
     * specified type to that root or to any organizational unit (OU) or account in that root. You can undo this by
     * using the <a>EnablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. If you disable a policy for a root, it still
     * appears enabled for the organization if <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features</a> are enabled for the organization. AWS recommends that you first use <a>ListRoots</a> to see the
     * status of policy types for a specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * <p>
     * To view the status of available policy types in the organization, use <a>DescribeOrganization</a>.
     * </p>
     * 
     * @param disablePolicyTypeRequest
     * @return Result of the DisablePolicyType operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws PolicyTypeNotEnabledException
     *         The specified policy type isn't currently enabled in this root. You can't attach policies of the
     *         specified type to entities in a root until you enable that type in the root. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *         >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * @throws RootNotFoundException
     *         We can't find a root with the <code>RootId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.DisablePolicyType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DisablePolicyType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisablePolicyTypeResult disablePolicyType(DisablePolicyTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDisablePolicyType(request);
    }

    @SdkInternalApi
    final DisablePolicyTypeResult executeDisablePolicyType(DisablePolicyTypeRequest disablePolicyTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(disablePolicyTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisablePolicyTypeRequest> request = null;
        Response<DisablePolicyTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisablePolicyTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disablePolicyTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisablePolicyType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisablePolicyTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisablePolicyTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the integration of an AWS service (the service that is specified by <code>ServicePrincipal</code>) with
     * AWS Organizations. When you enable integration, you allow the specified service to create a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a> in
     * all the accounts in your organization. This allows the service to perform operations on your behalf in your
     * organization and its accounts.
     * </p>
     * <important>
     * <p>
     * We recommend that you enable integration between AWS Organizations and the specified AWS service by using the
     * console or commands that are provided by the specified service. Doing so ensures that the service is aware that
     * it can create the resources that are required for the integration. How the service creates those resources in the
     * organization's accounts depends on that service. For more information, see the documentation for the other AWS
     * service.
     * </p>
     * </important>
     * <p>
     * For more information about enabling services to integrate with AWS Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account and only if the organization has <a
     * href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">enabled all
     * features</a>.
     * </p>
     * 
     * @param enableAWSServiceAccessRequest
     * @return Result of the EnableAWSServiceAccess operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.EnableAWSServiceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableAWSServiceAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableAWSServiceAccessResult enableAWSServiceAccess(EnableAWSServiceAccessRequest request) {
        request = beforeClientExecution(request);
        return executeEnableAWSServiceAccess(request);
    }

    @SdkInternalApi
    final EnableAWSServiceAccessResult executeEnableAWSServiceAccess(EnableAWSServiceAccessRequest enableAWSServiceAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(enableAWSServiceAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAWSServiceAccessRequest> request = null;
        Response<EnableAWSServiceAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAWSServiceAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableAWSServiceAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableAWSServiceAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableAWSServiceAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableAWSServiceAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables all features in an organization. This enables the use of organization policies that can restrict the
     * services and actions that can be called in each account. Until you enable all features, you have access only to
     * consolidated billing. You can't use any of the advanced account administration features that AWS Organizations
     * supports. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <p>
     * This operation is required only for organizations that were created explicitly with only the consolidated billing
     * features enabled. Calling this operation sends a handshake to every invited account in the organization. The
     * feature set change can be finalized and the additional features enabled only after all administrators in the
     * invited accounts approve the change. Accepting the handshake approves the change.
     * </p>
     * </important>
     * <p>
     * After you enable all features, you can separately enable or disable individual policy types in a root using
     * <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. To see the status of policy types in a root, use
     * <a>ListRoots</a>.
     * </p>
     * <p>
     * After all invited member accounts accept the handshake, you finalize the feature set change by accepting the
     * handshake that contains <code>"Action": "ENABLE_ALL_FEATURES"</code>. This completes the change.
     * </p>
     * <p>
     * After you enable all features in your organization, the master account in the organization can apply policies on
     * all member accounts. These policies can restrict what users and even administrators in those accounts can do. The
     * master account can apply policies that prevent accounts from leaving the organization. Ensure that your account
     * administrators are aware of this.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param enableAllFeaturesRequest
     * @return Result of the EnableAllFeatures operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeConstraintViolationException
     *         The requested operation would violate the constraint identified in the reason code.</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. Note that deleted and closed accounts still count toward your limit.
     *         </p>
     *         <important>
     *         <p>
     *         If you get this exception immediately after creating the organization, wait one hour and try again. If
     *         after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         ALREADY_IN_AN_ORGANIZATION: The handshake request is invalid because the invited account is already a
     *         member of an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES: You can't issue new invitations to join an organization while
     *         it's in the process of enabling all features. You can resume inviting accounts after you finalize the
     *         process when all accounts have agreed to the change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_ALREADY_HAS_ALL_FEATURES: The handshake request is invalid because the organization has
     *         already enabled all features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD: The request failed because the account is from a different
     *         marketplace than the accounts in the organization. For example, accounts with India addresses must be
     *         associated with the AISPL marketplace. All accounts in an organization must be from the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED: You attempted to change the membership of an account
     *         too quickly after its previous change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAYMENT_INSTRUMENT_REQUIRED: You can't complete the operation with an account that doesn't have a payment
     *         instrument, such as a credit card, associated with it.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.EnableAllFeatures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableAllFeatures"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableAllFeaturesResult enableAllFeatures(EnableAllFeaturesRequest request) {
        request = beforeClientExecution(request);
        return executeEnableAllFeatures(request);
    }

    @SdkInternalApi
    final EnableAllFeaturesResult executeEnableAllFeatures(EnableAllFeaturesRequest enableAllFeaturesRequest) {

        ExecutionContext executionContext = createExecutionContext(enableAllFeaturesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAllFeaturesRequest> request = null;
        Response<EnableAllFeaturesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAllFeaturesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableAllFeaturesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableAllFeatures");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableAllFeaturesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableAllFeaturesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type
     * to the root, any organizational unit (OU), or account in that root. You can undo this by using the
     * <a>DisablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. AWS recommends that you first use
     * <a>ListRoots</a> to see the status of policy types for a specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * <p>
     * You can enable a policy type in a root only if that policy type is available in the organization. To view the
     * status of available policy types in the organization, use <a>DescribeOrganization</a>.
     * </p>
     * 
     * @param enablePolicyTypeRequest
     * @return Result of the EnablePolicyType operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws PolicyTypeAlreadyEnabledException
     *         The specified policy type is already enabled in the specified root.
     * @throws RootNotFoundException
     *         We can't find a root with the <code>RootId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws PolicyTypeNotAvailableForOrganizationException
     *         You can't use the specified policy type with the feature set currently enabled for this organization. For
     *         example, you can enable SCPs only after you enable all features in the organization. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html#enable_policies_on_root"
     *         >Enabling and Disabling a Policy Type on a Root</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.EnablePolicyType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnablePolicyType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public EnablePolicyTypeResult enablePolicyType(EnablePolicyTypeRequest request) {
        request = beforeClientExecution(request);
        return executeEnablePolicyType(request);
    }

    @SdkInternalApi
    final EnablePolicyTypeResult executeEnablePolicyType(EnablePolicyTypeRequest enablePolicyTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(enablePolicyTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnablePolicyTypeRequest> request = null;
        Response<EnablePolicyTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnablePolicyTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enablePolicyTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnablePolicyType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnablePolicyTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnablePolicyTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends an invitation to another account to join your organization as a member account. AWS Organizations sends
     * email on your behalf to the email address that is associated with the other account's owner. The invitation is
     * implemented as a <a>Handshake</a> whose details are in the response.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You can invite AWS accounts only from the same seller as the master account. For example, assume that your
     * organization's master account was created by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in India.
     * You can invite only other AISPL accounts to your organization. You can't combine accounts from AISPL and AWS or
     * from any other AWS seller. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/useconsolidatedbilliing-India.html"
     * >Consolidated Billing in India</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might receive an exception that indicates that you exceeded your account limits for the organization or that
     * the operation failed because your organization is still initializing. If so, wait one hour and then try again. If
     * the error persists after an hour, contact <a href="https://console.aws.amazon.com/support/home#/">AWS
     * Support</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param inviteAccountToOrganizationRequest
     * @return Result of the InviteAccountToOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws AccountOwnerNotVerifiedException
     *         You can't invite an existing account to your organization until you verify that you own the email address
     *         associated with the master account. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_create.html#about-email-verification"
     *         >Email Address Verification</a> in the <i>AWS Organizations User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws HandshakeConstraintViolationException
     *         The requested operation would violate the constraint identified in the reason code.</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. Note that deleted and closed accounts still count toward your limit.
     *         </p>
     *         <important>
     *         <p>
     *         If you get this exception immediately after creating the organization, wait one hour and try again. If
     *         after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         ALREADY_IN_AN_ORGANIZATION: The handshake request is invalid because the invited account is already a
     *         member of an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES: You can't issue new invitations to join an organization while
     *         it's in the process of enabling all features. You can resume inviting accounts after you finalize the
     *         process when all accounts have agreed to the change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_ALREADY_HAS_ALL_FEATURES: The handshake request is invalid because the organization has
     *         already enabled all features.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD: The request failed because the account is from a different
     *         marketplace than the accounts in the organization. For example, accounts with India addresses must be
     *         associated with the AISPL marketplace. All accounts in an organization must be from the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED: You attempted to change the membership of an account
     *         too quickly after its previous change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAYMENT_INSTRUMENT_REQUIRED: You can't complete the operation with an account that doesn't have a payment
     *         instrument, such as a credit card, associated with it.
     *         </p>
     *         </li>
     * @throws DuplicateHandshakeException
     *         A handshake with the same action and target already exists. For example, if you invited an account to
     *         join your organization, the invited account might already have a pending invitation from this
     *         organization. If you intend to resend an invitation to an account, ensure that existing handshakes that
     *         might be considered duplicates are canceled or declined.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws FinalizingOrganizationException
     *         AWS Organizations couldn't perform the operation because your organization hasn't finished initializing.
     *         This can take up to an hour. Try again later. If after one hour you continue to receive this error,
     *         contact <a href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.InviteAccountToOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/InviteAccountToOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public InviteAccountToOrganizationResult inviteAccountToOrganization(InviteAccountToOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeInviteAccountToOrganization(request);
    }

    @SdkInternalApi
    final InviteAccountToOrganizationResult executeInviteAccountToOrganization(InviteAccountToOrganizationRequest inviteAccountToOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(inviteAccountToOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InviteAccountToOrganizationRequest> request = null;
        Response<InviteAccountToOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InviteAccountToOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(inviteAccountToOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InviteAccountToOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InviteAccountToOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new InviteAccountToOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a member account from its parent organization. This version of the operation is performed by the account
     * that wants to leave. To remove a member account as a user in the master account, use
     * <a>RemoveAccountFromOrganization</a> instead.
     * </p>
     * <p>
     * This operation can be called only from a member account in the organization.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * The master account in an organization with all features enabled can set service control policies (SCPs) that can
     * restrict what administrators of member accounts can do. These restrictions can include preventing member accounts
     * from successfully calling <code>LeaveOrganization</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization as a member account only if the account is configured with the information required
     * to operate as a standalone account. When you create an account in an organization using the AWS Organizations
     * console, API, or CLI, the information required of standalone accounts is <i>not</i> automatically collected. For
     * each account that you want to make standalone, you must accept the end user license agreement (EULA). You must
     * also choose a support plan, provide and verify the required contact information, and provide a current payment
     * method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the
     * account isn't attached to an organization. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization only after you enable IAM user access to billing in your account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost Management User
     * Guide.</i>
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param leaveOrganizationRequest
     * @return Result of the LeaveOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified. Or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws MasterCannotLeaveOrganizationException
     *         You can't remove a master account from an organization. If you want the master account to become a member
     *         account in another organization, you must first delete the current organization of the master account.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.LeaveOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/LeaveOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public LeaveOrganizationResult leaveOrganization(LeaveOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeLeaveOrganization(request);
    }

    @SdkInternalApi
    final LeaveOrganizationResult executeLeaveOrganization(LeaveOrganizationRequest leaveOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(leaveOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LeaveOrganizationRequest> request = null;
        Response<LeaveOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LeaveOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(leaveOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "LeaveOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LeaveOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new LeaveOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this
     * list creates the resources that it requires for the integration, it can perform operations on your organization
     * and its accounts.
     * </p>
     * <p>
     * For more information about integrating other services with AWS Organizations, including the list of services that
     * currently work with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listAWSServiceAccessForOrganizationRequest
     * @return Result of the ListAWSServiceAccessForOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListAWSServiceAccessForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAWSServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAWSServiceAccessForOrganizationResult listAWSServiceAccessForOrganization(ListAWSServiceAccessForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeListAWSServiceAccessForOrganization(request);
    }

    @SdkInternalApi
    final ListAWSServiceAccessForOrganizationResult executeListAWSServiceAccessForOrganization(
            ListAWSServiceAccessForOrganizationRequest listAWSServiceAccessForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(listAWSServiceAccessForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAWSServiceAccessForOrganizationRequest> request = null;
        Response<ListAWSServiceAccessForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAWSServiceAccessForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAWSServiceAccessForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAWSServiceAccessForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAWSServiceAccessForOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAWSServiceAccessForOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the accounts in the organization. To request only the accounts in a specified root or organizational
     * unit (OU), use the <a>ListAccountsForParent</a> operation instead.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listAccountsRequest
     * @return Result of the ListAccounts operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAccountsResult listAccounts(ListAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccounts(request);
    }

    @SdkInternalApi
    final ListAccountsResult executeListAccounts(ListAccountsRequest listAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountsRequest> request = null;
        Response<ListAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the accounts in an organization that are contained by the specified target root or organizational unit
     * (OU). If you specify the root, you get a list of all the accounts that aren't in any OU. If you specify an OU,
     * you get a list of all the accounts in only that OU and not in any child OUs. To get a list of all accounts in the
     * organization, use the <a>ListAccounts</a> operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listAccountsForParentRequest
     * @return Result of the ListAccountsForParent operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ParentNotFoundException
     *         We can't find a root or OU with the <code>ParentId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListAccountsForParent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAccountsForParent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccountsForParentResult listAccountsForParent(ListAccountsForParentRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountsForParent(request);
    }

    @SdkInternalApi
    final ListAccountsForParentResult executeListAccountsForParent(ListAccountsForParentRequest listAccountsForParentRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountsForParentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountsForParentRequest> request = null;
        Response<ListAccountsForParentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountsForParentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccountsForParentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountsForParent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountsForParentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAccountsForParentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the organizational units (OUs) or accounts that are contained in the specified parent OU or root.
     * This operation, along with <a>ListParents</a> enables you to traverse the tree structure that makes up this root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listChildrenRequest
     * @return Result of the ListChildren operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ParentNotFoundException
     *         We can't find a root or OU with the <code>ParentId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListChildren
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListChildren" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListChildrenResult listChildren(ListChildrenRequest request) {
        request = beforeClientExecution(request);
        return executeListChildren(request);
    }

    @SdkInternalApi
    final ListChildrenResult executeListChildren(ListChildrenRequest listChildrenRequest) {

        ExecutionContext executionContext = createExecutionContext(listChildrenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChildrenRequest> request = null;
        Response<ListChildrenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChildrenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChildrenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChildren");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChildrenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChildrenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the account creation requests that match the specified status that is currently being tracked for the
     * organization.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listCreateAccountStatusRequest
     * @return Result of the ListCreateAccountStatus operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.ListCreateAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListCreateAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCreateAccountStatusResult listCreateAccountStatus(ListCreateAccountStatusRequest request) {
        request = beforeClientExecution(request);
        return executeListCreateAccountStatus(request);
    }

    @SdkInternalApi
    final ListCreateAccountStatusResult executeListCreateAccountStatus(ListCreateAccountStatusRequest listCreateAccountStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(listCreateAccountStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCreateAccountStatusRequest> request = null;
        Response<ListCreateAccountStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCreateAccountStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCreateAccountStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCreateAccountStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCreateAccountStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCreateAccountStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the current handshakes that are associated with the account of the requesting user.
     * </p>
     * <p>
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> appear in the results
     * of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param listHandshakesForAccountRequest
     * @return Result of the ListHandshakesForAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListHandshakesForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListHandshakesForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListHandshakesForAccountResult listHandshakesForAccount(ListHandshakesForAccountRequest request) {
        request = beforeClientExecution(request);
        return executeListHandshakesForAccount(request);
    }

    @SdkInternalApi
    final ListHandshakesForAccountResult executeListHandshakesForAccount(ListHandshakesForAccountRequest listHandshakesForAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(listHandshakesForAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHandshakesForAccountRequest> request = null;
        Response<ListHandshakesForAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHandshakesForAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listHandshakesForAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHandshakesForAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHandshakesForAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListHandshakesForAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the handshakes that are associated with the organization that the requesting user is part of. The
     * <code>ListHandshakesForOrganization</code> operation returns a list of handshake structures. Each structure
     * contains details and status about a handshake.
     * </p>
     * <p>
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> appear in the results
     * of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listHandshakesForOrganizationRequest
     * @return Result of the ListHandshakesForOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListHandshakesForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListHandshakesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListHandshakesForOrganizationResult listHandshakesForOrganization(ListHandshakesForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeListHandshakesForOrganization(request);
    }

    @SdkInternalApi
    final ListHandshakesForOrganizationResult executeListHandshakesForOrganization(ListHandshakesForOrganizationRequest listHandshakesForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(listHandshakesForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHandshakesForOrganizationRequest> request = null;
        Response<ListHandshakesForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHandshakesForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listHandshakesForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHandshakesForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHandshakesForOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListHandshakesForOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the organizational units (OUs) in a parent organizational unit or root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listOrganizationalUnitsForParentRequest
     * @return Result of the ListOrganizationalUnitsForParent operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ParentNotFoundException
     *         We can't find a root or OU with the <code>ParentId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListOrganizationalUnitsForParent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListOrganizationalUnitsForParent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOrganizationalUnitsForParentResult listOrganizationalUnitsForParent(ListOrganizationalUnitsForParentRequest request) {
        request = beforeClientExecution(request);
        return executeListOrganizationalUnitsForParent(request);
    }

    @SdkInternalApi
    final ListOrganizationalUnitsForParentResult executeListOrganizationalUnitsForParent(
            ListOrganizationalUnitsForParentRequest listOrganizationalUnitsForParentRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrganizationalUnitsForParentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationalUnitsForParentRequest> request = null;
        Response<ListOrganizationalUnitsForParentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationalUnitsForParentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOrganizationalUnitsForParentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrganizationalUnitsForParent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrganizationalUnitsForParentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOrganizationalUnitsForParentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or
     * account. This operation, along with <a>ListChildren</a> enables you to traverse the tree structure that makes up
     * this root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * <note>
     * <p>
     * In the current release, a child can have only a single parent.
     * </p>
     * </note>
     * 
     * @param listParentsRequest
     * @return Result of the ListParents operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ChildNotFoundException
     *         We can't find an organizational unit (OU) or AWS account with the <code>ChildId</code> that you
     *         specified.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListParents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListParents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListParentsResult listParents(ListParentsRequest request) {
        request = beforeClientExecution(request);
        return executeListParents(request);
    }

    @SdkInternalApi
    final ListParentsResult executeListParents(ListParentsRequest listParentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listParentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListParentsRequest> request = null;
        Response<ListParentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListParentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listParentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListParents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListParentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListParentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the list of all policies in an organization of a specified type.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return Result of the ListPolicies operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicies(request);
    }

    @SdkInternalApi
    final ListPoliciesResult executeListPolicies(ListPoliciesRequest listPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesRequest> request = null;
        Response<ListPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account.
     * You must specify the policy type that you want included in the returned list.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listPoliciesForTargetRequest
     * @return Result of the ListPoliciesForTarget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, or account with the <code>TargetId</code> that you specified.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.ListPoliciesForTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPoliciesForTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPoliciesForTargetResult listPoliciesForTarget(ListPoliciesForTargetRequest request) {
        request = beforeClientExecution(request);
        return executeListPoliciesForTarget(request);
    }

    @SdkInternalApi
    final ListPoliciesForTargetResult executeListPoliciesForTarget(ListPoliciesForTargetRequest listPoliciesForTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(listPoliciesForTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesForTargetRequest> request = null;
        Response<ListPoliciesForTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesForTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPoliciesForTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPoliciesForTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPoliciesForTargetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPoliciesForTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the roots that are defined in the current organization.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * <note>
     * <p>
     * Policy types can be enabled and disabled in roots. This is distinct from whether they're available in the
     * organization. When you enable all features, you make policy types available for use in that organization.
     * Individual policy types can then be enabled and disabled in a root. To see the availability of a policy type in
     * an organization, use <a>DescribeOrganization</a>.
     * </p>
     * </note>
     * 
     * @param listRootsRequest
     * @return Result of the ListRoots operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListRoots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListRoots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRootsResult listRoots(ListRootsRequest request) {
        request = beforeClientExecution(request);
        return executeListRoots(request);
    }

    @SdkInternalApi
    final ListRootsResult executeListRoots(ListRootsRequest listRootsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRootsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRootsRequest> request = null;
        Response<ListRootsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRootsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRootsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRoots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRootsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRootsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tags for the specified resource.
     * </p>
     * <p>
     * Currently, you can list tags on an account in AWS Organizations.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, or account with the <code>TargetId</code> that you specified.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the roots, organizational units (OUs), and accounts that the specified policy is attached to.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @return Result of the ListTargetsForPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @sample AWSOrganizations.ListTargetsForPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTargetsForPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTargetsForPolicyResult listTargetsForPolicy(ListTargetsForPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeListTargetsForPolicy(request);
    }

    @SdkInternalApi
    final ListTargetsForPolicyResult executeListTargetsForPolicy(ListTargetsForPolicyRequest listTargetsForPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(listTargetsForPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTargetsForPolicyRequest> request = null;
        Response<ListTargetsForPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTargetsForPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTargetsForPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTargetsForPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTargetsForPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTargetsForPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves an account from its current source parent root or organizational unit (OU) to the specified destination
     * parent root or OU.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param moveAccountRequest
     * @return Result of the MoveAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws SourceParentNotFoundException
     *         We can't find a source root or OU with the <code>ParentId</code> that you specified.
     * @throws DestinationParentNotFoundException
     *         We can't find the destination container (a root or OU) with the <code>ParentId</code> that you specified.
     * @throws DuplicateAccountException
     *         That account is already present in the specified destination.
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified. Or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @sample AWSOrganizations.MoveAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/MoveAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public MoveAccountResult moveAccount(MoveAccountRequest request) {
        request = beforeClientExecution(request);
        return executeMoveAccount(request);
    }

    @SdkInternalApi
    final MoveAccountResult executeMoveAccount(MoveAccountRequest moveAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(moveAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MoveAccountRequest> request = null;
        Response<MoveAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MoveAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(moveAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MoveAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MoveAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new MoveAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified account from the organization.
     * </p>
     * <p>
     * The removed account becomes a standalone account that isn't a member of any organization. It's no longer subject
     * to any policies and is responsible for its own bill payments. The organization's master account is no longer
     * charged for any expenses accrued by the member account after it's removed from the organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account. Member accounts can remove themselves
     * with <a>LeaveOrganization</a> instead.
     * </p>
     * <important>
     * <p>
     * You can remove an account from your organization only if the account is configured with the information required
     * to operate as a standalone account. When you create an account in an organization using the AWS Organizations
     * console, API, or CLI, the information required of standalone accounts is <i>not</i> automatically collected. For
     * an account that you want to make standalone, you must accept the end user license agreement (EULA). You must also
     * choose a support plan, provide and verify the required contact information, and provide a current payment method.
     * AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account
     * isn't attached to an organization. To remove an account that doesn't yet have this information, you must sign in
     * as the member account. Then follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </important>
     * 
     * @param removeAccountFromOrganizationRequest
     * @return Result of the RemoveAccountFromOrganization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AccountNotFoundException
     *         We can't find an AWS account with the <code>AccountId</code> that you specified. Or the account whose
     *         credentials you used to make this request isn't a member of an organization.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws MasterCannotLeaveOrganizationException
     *         You can't remove a master account from an organization. If you want the master account to become a member
     *         account in another organization, you must first delete the current organization of the master account.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.RemoveAccountFromOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/RemoveAccountFromOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveAccountFromOrganizationResult removeAccountFromOrganization(RemoveAccountFromOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveAccountFromOrganization(request);
    }

    @SdkInternalApi
    final RemoveAccountFromOrganizationResult executeRemoveAccountFromOrganization(RemoveAccountFromOrganizationRequest removeAccountFromOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(removeAccountFromOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAccountFromOrganizationRequest> request = null;
        Response<RemoveAccountFromOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAccountFromOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeAccountFromOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveAccountFromOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveAccountFromOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveAccountFromOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * <p>
     * Currently, you can tag and untag accounts in AWS Organizations.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, or account with the <code>TargetId</code> that you specified.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a tag from the specified resource.
     * </p>
     * <p>
     * Currently, you can tag and untag accounts in AWS Organizations.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws TargetNotFoundException
     *         We can't find a root, OU, or account with the <code>TargetId</code> that you specified.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Renames the specified organizational unit (OU). The ID and ARN don't change. The child OUs and accounts remain in
     * place, and any attached policies of the OU remain attached.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param updateOrganizationalUnitRequest
     * @return Result of the UpdateOrganizationalUnit operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws DuplicateOrganizationalUnitException
     *         An OU with the same name already exists.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws OrganizationalUnitNotFoundException
     *         We can't find an OU with the <code>OrganizationalUnitId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @sample AWSOrganizations.UpdateOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdateOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOrganizationalUnitResult updateOrganizationalUnit(UpdateOrganizationalUnitRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOrganizationalUnit(request);
    }

    @SdkInternalApi
    final UpdateOrganizationalUnitResult executeUpdateOrganizationalUnit(UpdateOrganizationalUnitRequest updateOrganizationalUnitRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOrganizationalUnitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOrganizationalUnitRequest> request = null;
        Response<UpdateOrganizationalUnitResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOrganizationalUnitRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateOrganizationalUnitRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOrganizationalUnit");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateOrganizationalUnitResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateOrganizationalUnitResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing policy with a new name, description, or content. If you don't supply any parameter, that
     * value remains unchanged. You can't change a policy's type.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param updatePolicyRequest
     * @return Result of the UpdatePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide.</i>
     * @throws AWSOrganizationsNotInUseException
     *         Your account isn't a member of an organization. To make this request, you must use the credentials of an
     *         account that belongs to an organization.
     * @throws ConcurrentModificationException
     *         The target of the operation is currently being modified by a different request. Try again later.
     * @throws ConstraintViolationException
     *         Performing this operation violates a minimum or maximum value limit. Examples include attempting to
     *         remove the last service control policy (SCP) from an OU or root, or attaching too many policies to an
     *         account, OU, or root. This exception includes a reason that contains additional information about the
     *         violated limit.</p>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that doesn't
     *         yet have enough information to exist as a standalone account. This account requires you to first agree to
     *         the AWS Customer Agreement. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization
     *         that doesn't yet have enough information to exist as a standalone account. This account requires you to
     *         first complete phone verification. Follow the steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create
     *         in one day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an
     *         organization. If you need more accounts, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a> to request an increase in your
     *         limit.
     *         </p>
     *         <p>
     *         Or the number of invitations that you tried to send would cause you to exceed the limit of accounts in
     *         your organization. Send fewer invitations or contact AWS Support to request an increase in the number of
     *         accounts.
     *         </p>
     *         <note>
     *         <p>
     *         Deleted and closed accounts still count toward your limit.
     *         </p>
     *         </note> <important>
     *         <p>
     *         If you get receive this exception when running a command immediately after creating the organization,
     *         wait one hour and try again. If after an hour it continues to fail with this error, contact <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes that you can send in one
     *         day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first
     *         must migrate the organization's master account to the marketplace that corresponds to the master
     *         account's address. For example, accounts with India addresses must be associated with the AISPL
     *         marketplace. All accounts in an organization must be associated with the same marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid
     *         address and phone number for the master account. Then try the operation again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_NOT_GOVCLOUD_ENABLED: To complete this operation, the master account must have an
     *         associated account in the AWS GovCloud (US-West) Region. For more information, see <a
     *         href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     *         Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this master account, you first
     *         must associate a valid payment instrument, such as a credit card, with the account. Follow the steps at
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain
     *         type that can be attached to an entity at one time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_TAG_LIMIT_EXCEEDED: You have exceeded the number of tags allowed on this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you
     *         first must associate a valid payment instrument, such as a credit card, with the account. Follow the
     *         steps at <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     *         >To leave an organization when all required account information has not yet been provided</a> in the
     *         <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity, which would
     *         cause the entity to have fewer than the minimum number of policies of the required type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an OU tree that is too many levels deep.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ORGANIZATION_NOT_IN_ALL_FEATURES_MODE: You attempted to perform an operation that requires the
     *         organization to be configured to support all features. An organization that supports only consolidated
     *         billing features can't perform this operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of OUs that you can have in an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         POLICY_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of policies that you can have in an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG_POLICY_VIOLATION: Tags associated with the resource must be compliant with the tag policy that’s in
     *         effect for the account. For more information, see <a
     *         href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     *         </p>
     *         </li>
     * @throws DuplicatePolicyException
     *         A policy with the same name already exists.
     * @throws InvalidInputException
     *         The requested operation failed because you provided invalid values for one or more of the request
     *         parameters. This exception includes a reason that contains additional information about the violated
     *         limit:</p> <note>
     *         <p>
     *         Some of the reasons in the following list might not be applicable to this specific API or operation:
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INPUT_REQUIRED: You must include a value for all required parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM: You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENUM_POLICY_TYPE: You specified an invalid policy type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a
     *         previous call of the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a
     *         party.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN: You provided a value that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved
     *         prefix <code>AWSServiceRoleFor</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_SYSTEM_TAGS_PARAMETER: You specified a tag key that is a system tag. You can’t add, edit, or
     *         delete system tag keys because they're reserved for AWS use. System tags don’t count against your tags
     *         per resource limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
     *         </p>
     *         </li>
     * @throws MalformedPolicyDocumentException
     *         The provided policy document doesn't meet the requirements of the specified policy type. For example, the
     *         syntax might be incorrect. For details about service control policy syntax, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *         Control Policy Syntax</a> in the <i>AWS Organizations User Guide.</i>
     * @throws PolicyNotFoundException
     *         We can't find a policy with the <code>PolicyId</code> that you specified.
     * @throws ServiceException
     *         AWS Organizations can't complete your request because of an internal service error. Try again later.
     * @throws TooManyRequestsException
     *         You have sent too many requests in too short a period of time. The limit helps protect against
     *         denial-of-service attacks. Try again later.</p>
     *         <p>
     *         For information on limits that affect AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html">Limits of
     *         AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * @throws UnsupportedAPIEndpointException
     *         This action isn't available in the current Region.
     * @throws PolicyChangesInProgressException
     *         Changes to the effective policy are in progress, and its contents can't be returned. Try the operation
     *         again later.
     * @sample AWSOrganizations.UpdatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdatePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePolicyResult updatePolicy(UpdatePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePolicy(request);
    }

    @SdkInternalApi
    final UpdatePolicyResult executeUpdatePolicy(UpdatePolicyRequest updatePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePolicyRequest> request = null;
        Response<UpdatePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Organizations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}

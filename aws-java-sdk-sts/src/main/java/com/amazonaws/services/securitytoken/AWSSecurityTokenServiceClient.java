/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitytoken;

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

import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.services.securitytoken.model.transform.*;

/**
 * Client for accessing AWS STS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Security Token Service</fullname>
 * <p>
 * The AWS Security Token Service (STS) is a web service that enables you to request temporary, limited-privilege
 * credentials for AWS Identity and Access Management (IAM) users or for users that you authenticate (federated users).
 * This guide provides descriptions of the STS API. For more detailed information about using this service, go to <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html">Temporary Security Credentials</a>.
 * </p>
 * <note>
 * <p>
 * As an alternative to using the API, you can use one of the AWS SDKs, which consist of libraries and sample code for
 * various programming languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way
 * to create programmatic access to STS. For example, the SDKs take care of cryptographically signing requests, managing
 * errors, and retrying requests automatically. For information about the AWS SDKs, including how to download and
 * install them, see the <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services page</a>.
 * </p>
 * </note>
 * <p>
 * For information about setting up signatures and authorization through the API, go to <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a> in the
 * <i>AWS General Reference</i>. For general information about the Query API, go to <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in <i>Using
 * IAM</i>. For information about using security tokens with other AWS products, go to <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS Services
 * That Work with IAM</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a specific AWS product, you can find the
 * product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/">http://aws.amazon.com/documentation/</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * The AWS Security Token Service (STS) has a default endpoint of https://sts.amazonaws.com that maps to the US East (N.
 * Virginia) region. Additional regions are available and are activated by default. For more information, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
 * Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * For information about STS endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region">Regions and Endpoints</a> in the <i>AWS
 * General Reference</i>.
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * STS supports AWS CloudTrail, which is a service that records AWS calls for your AWS account and delivers log files to
 * an Amazon S3 bucket. By using information collected by CloudTrail, you can determine what requests were successfully
 * made to STS, who made the request, when it was made, and so on. To learn more about CloudTrail, including how to turn
 * it on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSecurityTokenServiceClient extends AmazonWebServiceClient implements AWSSecurityTokenService {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSecurityTokenService.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sts";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AWS STS. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AWSSecurityTokenServiceClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSSecurityTokenServiceClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS STS. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS STS (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSSecurityTokenServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSecurityTokenServiceClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS STS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSSecurityTokenServiceClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSSecurityTokenServiceClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSSecurityTokenServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS STS using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS STS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSSecurityTokenServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSecurityTokenServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSecurityTokenServiceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS STS using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSSecurityTokenServiceClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSSecurityTokenServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS STS using the specified AWS account credentials provider
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS STS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSSecurityTokenServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSecurityTokenServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSecurityTokenServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS STS using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS STS (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSSecurityTokenServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSecurityTokenServiceClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSSecurityTokenServiceClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSSecurityTokenServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSSecurityTokenServiceClientBuilder builder() {
        return AWSSecurityTokenServiceClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS STS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSecurityTokenServiceClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS STS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSecurityTokenServiceClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidAuthorizationMessageExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ExpiredTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PackedPolicyTooLargeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RegionDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IDPCommunicationErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidIdentityTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IDPRejectedClaimExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.securitytoken.model.AWSSecurityTokenServiceException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("sts.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/securitytoken/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/securitytoken/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a
     * security token) that you can use to access AWS resources that you might not normally have access to. Typically,
     * you use <code>AssumeRole</code> for cross-account access or federation. For a comparison of
     * <code>AssumeRole</code> with the other APIs that produce temporary credentials, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Important:</b> You cannot call <code>AssumeRole</code> by using AWS root account credentials; access is
     * denied. You must use credentials for an IAM user or an IAM role to call <code>AssumeRole</code>.
     * </p>
     * <p>
     * For cross-account access, imagine that you own multiple accounts and need to access resources in each account.
     * You could create long-term credentials in each account to access those resources. However, managing all those
     * credentials and remembering which one can access which account can be time consuming. Instead, you can create one
     * set of long-term credentials in one account and then use temporary security credentials to access all the other
     * accounts by assuming roles in those accounts. For more information about roles, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">IAM Roles (Delegation and
     * Federation)</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For federation, you can, for example, grant single sign-on access to the AWS Management Console. If you already
     * have an identity and authentication system in your corporate network, you don't have to recreate user identities
     * in AWS in order to grant those user identities access to AWS. Instead, after a user has been authenticated, you
     * call <code>AssumeRole</code> (and specify the role with the appropriate permissions) to get temporary security
     * credentials for that user. With those temporary security credentials, you construct a sign-in URL that users can
     * use to access the console. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html#sts-introduction">Common Scenarios
     * for Temporary Credentials</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the temporary security credentials created by <code>AssumeRole</code> last for one hour. However, you
     * can use the optional <code>DurationSeconds</code> parameter to specify the duration of your session. You can
     * provide a value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This
     * setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>. The maximum session duration
     * limit applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     * operations but does not apply when you use those operations to create a console URL. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRole</code> can be used to make API calls to any AWS
     * service with the following exception: you cannot call the STS service's <code>GetFederationToken</code> or
     * <code>GetSessionToken</code> APIs.
     * </p>
     * <p>
     * Optionally, you can pass an IAM access policy to this operation. If you choose not to pass a policy, the
     * temporary security credentials that are returned by the operation have the permissions that are defined in the
     * access policy of the role that is being assumed. If you pass a policy to this operation, the temporary security
     * credentials that are returned by the operation have the permissions that are allowed by both the access policy of
     * the role that is being assumed, <i> <b>and</b> </i> the policy that you pass. This gives you a way to further
     * restrict the permissions for the resulting temporary security credentials. You cannot use the passed policy to
     * grant permissions that are in excess of those allowed by the access policy of the role that is being assumed. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * To assume a role, your AWS account must be trusted by the role. The trust relationship is defined in the role's
     * trust policy when the role is created. That trust policy states which accounts are allowed to delegate access to
     * this account's role.
     * </p>
     * <p>
     * The user who wants to access the role must also have permissions delegated from the role's administrator. If the
     * user is in a different account than the role, then the user's administrator must attach a policy that allows the
     * user to call AssumeRole on the ARN of the role in the other account. If the user is in the same account as the
     * role, then you can either attach a policy to the user (identical to the previous different account user), or you
     * can add the user as a principal directly in the role's trust policy. In this case, the trust policy acts as the
     * only resource-based policy in IAM, and users in the same account as the role do not need explicit permission to
     * assume the role. For more information about trust policies and resource-based policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM Policies</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Using MFA with AssumeRole</b>
     * </p>
     * <p>
     * You can optionally include multi-factor authentication (MFA) information when you call <code>AssumeRole</code>.
     * This is useful for cross-account scenarios in which you want to make sure that the user who is assuming the role
     * has been authenticated using an AWS MFA device. In that scenario, the trust policy of the role being assumed
     * includes a condition that tests for MFA authentication; if the caller does not include valid MFA information, the
     * request to assume the role is denied. The condition in a trust policy that tests for MFA authentication might
     * look like the following example.
     * </p>
     * <p>
     * <code>"Condition": {"Bool": {"aws:MultiFactorAuthPresent": true}}</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html">Configuring MFA-Protected API
     * Access</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * <p>
     * To use MFA with <code>AssumeRole</code>, you pass values for the <code>SerialNumber</code> and
     * <code>TokenCode</code> parameters. The <code>SerialNumber</code> value identifies the user's hardware or virtual
     * MFA device. The <code>TokenCode</code> is the time-based one-time password (TOTP) that the MFA devices produces.
     * </p>
     * 
     * @param assumeRoleRequest
     * @return Result of the AssumeRole operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the policy document was too large. The error message describes how big
     *         the policy document is, in packed form, as a percentage of what the API allows.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.AssumeRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRole" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssumeRoleResult assumeRole(AssumeRoleRequest request) {
        request = beforeClientExecution(request);
        return executeAssumeRole(request);
    }

    @SdkInternalApi
    final AssumeRoleResult executeAssumeRole(AssumeRoleRequest assumeRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(assumeRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeRoleRequest> request = null;
        Response<AssumeRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeRoleRequestMarshaller().marshall(super.beforeMarshalling(assumeRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "STS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssumeRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AssumeRoleResult> responseHandler = new StaxResponseHandler<AssumeRoleResult>(new AssumeRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a set of temporary security credentials for users who have been authenticated via a SAML authentication
     * response. This operation provides a mechanism for tying an enterprise identity store or directory to role-based
     * AWS access without user-specific credentials or configuration. For a comparison of
     * <code>AssumeRoleWithSAML</code> with the other APIs that produce temporary credentials, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials returned by this operation consist of an access key ID, a secret access key,
     * and a security token. Applications can use these temporary security credentials to sign calls to AWS services.
     * </p>
     * <p>
     * By default, the temporary security credentials created by <code>AssumeRoleWithSAML</code> last for one hour.
     * However, you can use the optional <code>DurationSeconds</code> parameter to specify the duration of your session.
     * Your role session lasts for the duration that you specify, or until the time specified in the SAML authentication
     * response's <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a
     * <code>DurationSeconds</code> value from 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your
     * role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>. The maximum session duration
     * limit applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     * operations but does not apply when you use those operations to create a console URL. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRoleWithSAML</code> can be used to make API calls to
     * any AWS service with the following exception: you cannot call the STS service's <code>GetFederationToken</code>
     * or <code>GetSessionToken</code> APIs.
     * </p>
     * <p>
     * Optionally, you can pass an IAM access policy to this operation. If you choose not to pass a policy, the
     * temporary security credentials that are returned by the operation have the permissions that are defined in the
     * access policy of the role that is being assumed. If you pass a policy to this operation, the temporary security
     * credentials that are returned by the operation have the permissions that are allowed by the intersection of both
     * the access policy of the role that is being assumed, <i> <b>and</b> </i> the policy that you pass. This means
     * that both policies must grant the permission for the action to be allowed. This gives you a way to further
     * restrict the permissions for the resulting temporary security credentials. You cannot use the passed policy to
     * grant permissions that are in excess of those allowed by the access policy of the role that is being assumed. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Before your application can call <code>AssumeRoleWithSAML</code>, you must configure your SAML identity provider
     * (IdP) to issue the claims required by AWS. Additionally, you must use AWS Identity and Access Management (IAM) to
     * create a SAML provider entity in your AWS account that represents your identity provider, and create an IAM role
     * that specifies this SAML provider in its trust policy.
     * </p>
     * <p>
     * Calling <code>AssumeRoleWithSAML</code> does not require the use of AWS security credentials. The identity of the
     * caller is validated by using keys in the metadata document that is uploaded for the SAML provider entity for your
     * identity provider.
     * </p>
     * <important>
     * <p>
     * Calling <code>AssumeRoleWithSAML</code> can result in an entry in your AWS CloudTrail logs. The entry includes
     * the value in the <code>NameID</code> element of the SAML assertion. We recommend that you use a NameIDType that
     * is not associated with any personally identifiable information (PII). For example, you could instead use the
     * Persistent Identifier (<code>urn:oasis:names:tc:SAML:2.0:nameid-format:persistent</code>).
     * </p>
     * </important>
     * <p>
     * For more information, see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     * Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml.html">Creating SAML
     * Identity Providers</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml_relying-party.html">
     * Configuring a Relying Party and Claims</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_saml.html">Creating a Role for
     * SAML 2.0 Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assumeRoleWithSAMLRequest
     * @return Result of the AssumeRoleWithSAML operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the policy document was too large. The error message describes how big
     *         the policy document is, in packed form, as a percentage of what the API allows.
     * @throws IDPRejectedClaimException
     *         The identity provider (IdP) reported that authentication failed. This might be because the claim is
     *         invalid.</p>
     *         <p>
     *         If this error is returned for the <code>AssumeRoleWithWebIdentity</code> operation, it can also mean that
     *         the claim has expired or has been explicitly revoked.
     * @throws InvalidIdentityTokenException
     *         The web identity token that was passed could not be validated by AWS. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws ExpiredTokenException
     *         The web identity token that was passed is expired or is not valid. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.AssumeRoleWithSAML
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRoleWithSAML" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssumeRoleWithSAMLResult assumeRoleWithSAML(AssumeRoleWithSAMLRequest request) {
        request = beforeClientExecution(request);
        return executeAssumeRoleWithSAML(request);
    }

    @SdkInternalApi
    final AssumeRoleWithSAMLResult executeAssumeRoleWithSAML(AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) {

        ExecutionContext executionContext = createExecutionContext(assumeRoleWithSAMLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeRoleWithSAMLRequest> request = null;
        Response<AssumeRoleWithSAMLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeRoleWithSAMLRequestMarshaller().marshall(super.beforeMarshalling(assumeRoleWithSAMLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "STS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssumeRoleWithSAML");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AssumeRoleWithSAMLResult> responseHandler = new StaxResponseHandler<AssumeRoleWithSAMLResult>(
                    new AssumeRoleWithSAMLResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a set of temporary security credentials for users who have been authenticated in a mobile or web
     * application with a web identity provider, such as Amazon Cognito, Login with Amazon, Facebook, Google, or any
     * OpenID Connect-compatible identity provider.
     * </p>
     * <note>
     * <p>
     * For mobile applications, we recommend that you use Amazon Cognito. You can use Amazon Cognito with the <a
     * href="http://aws.amazon.com/sdkforios/">AWS SDK for iOS</a> and the <a
     * href="http://aws.amazon.com/sdkforandroid/">AWS SDK for Android</a> to uniquely identify a user and supply the
     * user with a consistent identity throughout the lifetime of an application.
     * </p>
     * <p>
     * To learn more about Amazon Cognito, see <a
     * href="http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-auth.html#d0e840">Amazon Cognito
     * Overview</a> in the <i>AWS SDK for Android Developer Guide</i> guide and <a
     * href="http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-auth.html#d0e664">Amazon Cognito
     * Overview</a> in the <i>AWS SDK for iOS Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> does not require the use of AWS security credentials. Therefore,
     * you can distribute an application (for example, on mobile devices) that requests temporary security credentials
     * without including long-term AWS credentials in the application, and without deploying server-based proxy services
     * that use long-term AWS credentials. Instead, the identity of the caller is validated by using a token from the
     * web identity provider. For a comparison of <code>AssumeRoleWithWebIdentity</code> with the other APIs that
     * produce temporary credentials, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials returned by this API consist of an access key ID, a secret access key, and a
     * security token. Applications can use these temporary security credentials to sign calls to AWS service APIs.
     * </p>
     * <p>
     * By default, the temporary security credentials created by <code>AssumeRoleWithWebIdentity</code> last for one
     * hour. However, you can use the optional <code>DurationSeconds</code> parameter to specify the duration of your
     * session. You can provide a value from 900 seconds (15 minutes) up to the maximum session duration setting for the
     * role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your
     * role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>. The maximum session duration
     * limit applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     * operations but does not apply when you use those operations to create a console URL. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRoleWithWebIdentity</code> can be used to make API
     * calls to any AWS service with the following exception: you cannot call the STS service's
     * <code>GetFederationToken</code> or <code>GetSessionToken</code> APIs.
     * </p>
     * <p>
     * Optionally, you can pass an IAM access policy to this operation. If you choose not to pass a policy, the
     * temporary security credentials that are returned by the operation have the permissions that are defined in the
     * access policy of the role that is being assumed. If you pass a policy to this operation, the temporary security
     * credentials that are returned by the operation have the permissions that are allowed by both the access policy of
     * the role that is being assumed, <i> <b>and</b> </i> the policy that you pass. This gives you a way to further
     * restrict the permissions for the resulting temporary security credentials. You cannot use the passed policy to
     * grant permissions that are in excess of those allowed by the access policy of the role that is being assumed. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Before your application can call <code>AssumeRoleWithWebIdentity</code>, you must have an identity token from a
     * supported identity provider and create a role that the application can assume. The role that your application
     * assumes must trust the identity provider that is associated with the identity token. In other words, the identity
     * provider must be specified in the role's trust policy.
     * </p>
     * <important>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> can result in an entry in your AWS CloudTrail logs. The entry
     * includes the <a href="http://openid.net/specs/openid-connect-core-1_0.html#Claims">Subject</a> of the provided
     * Web Identity Token. We recommend that you avoid using any personally identifiable information (PII) in this
     * field. For example, you could instead use a GUID or a pairwise identifier, as <a
     * href="http://openid.net/specs/openid-connect-core-1_0.html#SubjectIDTypes">suggested in the OIDC
     * specification</a>.
     * </p>
     * </important>
     * <p>
     * For more information about how to use web identity federation and the <code>AssumeRoleWithWebIdentity</code> API,
     * see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual.html">Using Web Identity
     * Federation APIs for Mobile Apps</a> and <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
     * >Federation Through a Web-based Identity Provider</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://web-identity-federation-playground.s3.amazonaws.com/index.html"> Web Identity Federation
     * Playground</a>. This interactive website lets you walk through the process of authenticating via Login with
     * Amazon, Facebook, or Google, getting temporary security credentials, and then using those credentials to make a
     * request to AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/sdkforios/">AWS SDK for iOS</a> and <a
     * href="http://aws.amazon.com/sdkforandroid/">AWS SDK for Android</a>. These toolkits contain sample apps that show
     * how to invoke the identity providers, and then how to use the information from these providers to get and use
     * temporary security credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/articles/web-identity-federation-with-mobile-applications">Web Identity Federation
     * with Mobile Applications</a>. This article discusses web identity federation and shows an example of how to use
     * web identity federation to get access to content in Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assumeRoleWithWebIdentityRequest
     * @return Result of the AssumeRoleWithWebIdentity operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the policy document was too large. The error message describes how big
     *         the policy document is, in packed form, as a percentage of what the API allows.
     * @throws IDPRejectedClaimException
     *         The identity provider (IdP) reported that authentication failed. This might be because the claim is
     *         invalid.</p>
     *         <p>
     *         If this error is returned for the <code>AssumeRoleWithWebIdentity</code> operation, it can also mean that
     *         the claim has expired or has been explicitly revoked.
     * @throws IDPCommunicationErrorException
     *         The request could not be fulfilled because the non-AWS identity provider (IDP) that was asked to verify
     *         the incoming identity token could not be reached. This is often a transient error caused by network
     *         conditions. Retry the request a limited number of times so that you don't exceed the request rate. If the
     *         error persists, the non-AWS identity provider might be down or not responding.
     * @throws InvalidIdentityTokenException
     *         The web identity token that was passed could not be validated by AWS. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws ExpiredTokenException
     *         The web identity token that was passed is expired or is not valid. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.AssumeRoleWithWebIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRoleWithWebIdentity" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeAssumeRoleWithWebIdentity(request);
    }

    @SdkInternalApi
    final AssumeRoleWithWebIdentityResult executeAssumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(assumeRoleWithWebIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeRoleWithWebIdentityRequest> request = null;
        Response<AssumeRoleWithWebIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeRoleWithWebIdentityRequestMarshaller().marshall(super.beforeMarshalling(assumeRoleWithWebIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "STS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssumeRoleWithWebIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AssumeRoleWithWebIdentityResult> responseHandler = new StaxResponseHandler<AssumeRoleWithWebIdentityResult>(
                    new AssumeRoleWithWebIdentityResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Decodes additional information about the authorization status of a request from an encoded message returned in
     * response to an AWS request.
     * </p>
     * <p>
     * For example, if a user is not authorized to perform an action that he or she has requested, the request returns a
     * <code>Client.UnauthorizedOperation</code> response (an HTTP 403 response). Some AWS actions additionally return
     * an encoded message that can provide details about this authorization failure.
     * </p>
     * <note>
     * <p>
     * Only certain AWS actions return an encoded authorization message. The documentation for an individual action
     * indicates whether that action returns an encoded message in addition to returning an HTTP code.
     * </p>
     * </note>
     * <p>
     * The message is encoded because the details of the authorization status can constitute privileged information that
     * the user who requested the action should not see. To decode an authorization status message, a user must be
     * granted permissions via an IAM policy to request the <code>DecodeAuthorizationMessage</code> (
     * <code>sts:DecodeAuthorizationMessage</code>) action.
     * </p>
     * <p>
     * The decoded message includes the following type of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether the request was denied due to an explicit deny or due to the absence of an explicit allow. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-denyallow"
     * >Determining Whether a Request is Allowed or Denied</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The principal who made the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The requested action.
     * </p>
     * </li>
     * <li>
     * <p>
     * The requested resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values of condition keys in the context of the user's request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param decodeAuthorizationMessageRequest
     * @return Result of the DecodeAuthorizationMessage operation returned by the service.
     * @throws InvalidAuthorizationMessageException
     *         The error returned if the message passed to <code>DecodeAuthorizationMessage</code> was invalid. This can
     *         happen if the token contains invalid characters, such as linebreaks.
     * @sample AWSSecurityTokenService.DecodeAuthorizationMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/DecodeAuthorizationMessage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DecodeAuthorizationMessageResult decodeAuthorizationMessage(DecodeAuthorizationMessageRequest request) {
        request = beforeClientExecution(request);
        return executeDecodeAuthorizationMessage(request);
    }

    @SdkInternalApi
    final DecodeAuthorizationMessageResult executeDecodeAuthorizationMessage(DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(decodeAuthorizationMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecodeAuthorizationMessageRequest> request = null;
        Response<DecodeAuthorizationMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecodeAuthorizationMessageRequestMarshaller().marshall(super.beforeMarshalling(decodeAuthorizationMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "STS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DecodeAuthorizationMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DecodeAuthorizationMessageResult> responseHandler = new StaxResponseHandler<DecodeAuthorizationMessageResult>(
                    new DecodeAuthorizationMessageResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about the IAM identity whose credentials are used to call the API.
     * </p>
     * 
     * @param getCallerIdentityRequest
     * @return Result of the GetCallerIdentity operation returned by the service.
     * @sample AWSSecurityTokenService.GetCallerIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetCallerIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCallerIdentityResult getCallerIdentity(GetCallerIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeGetCallerIdentity(request);
    }

    @SdkInternalApi
    final GetCallerIdentityResult executeGetCallerIdentity(GetCallerIdentityRequest getCallerIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(getCallerIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCallerIdentityRequest> request = null;
        Response<GetCallerIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCallerIdentityRequestMarshaller().marshall(super.beforeMarshalling(getCallerIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "STS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCallerIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetCallerIdentityResult> responseHandler = new StaxResponseHandler<GetCallerIdentityResult>(
                    new GetCallerIdentityResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a
     * security token) for a federated user. A typical use is in a proxy application that gets temporary security
     * credentials on behalf of distributed applications inside a corporate network. Because you must call the
     * <code>GetFederationToken</code> action using the long-term security credentials of an IAM user, this call is
     * appropriate in contexts where those credentials can be safely stored, usually in a server-based application. For
     * a comparison of <code>GetFederationToken</code> with the other APIs that produce temporary credentials, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you are creating a mobile-based or browser-based app that can authenticate users using a web identity provider
     * like Login with Amazon, Facebook, Google, or an OpenID Connect-compatible identity provider, we recommend that
     * you use <a href="http://aws.amazon.com/cognito/">Amazon Cognito</a> or <code>AssumeRoleWithWebIdentity</code>.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
     * >Federation Through a Web-based Identity Provider</a>.
     * </p>
     * </note>
     * <p>
     * The <code>GetFederationToken</code> action must be called by using the long-term AWS security credentials of an
     * IAM user. You can also call <code>GetFederationToken</code> using the security credentials of an AWS root
     * account, but we do not recommended it. Instead, we recommend that you create an IAM user for the purpose of the
     * proxy application and then attach a policy to the IAM user that limits federated users to only the actions and
     * resources that they need access to. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html">IAM Best Practices</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials that are obtained by using the long-term credentials of an IAM user are valid
     * for the specified duration, from 900 seconds (15 minutes) up to a maximium of 129600 seconds (36 hours). The
     * default is 43200 seconds (12 hours). Temporary credentials that are obtained by using AWS root account
     * credentials have a maximum duration of 3600 seconds (1 hour).
     * </p>
     * <p>
     * The temporary security credentials created by <code>GetFederationToken</code> can be used to make API calls to
     * any AWS service with the following exceptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot use these credentials to call any IAM APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot call any STS APIs except <code>GetCallerIdentity</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The permissions for the temporary security credentials returned by <code>GetFederationToken</code> are determined
     * by a combination of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy or policies that are attached to the IAM user whose credentials are used to call
     * <code>GetFederationToken</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy that is passed as a parameter in the call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The passed policy is attached to the temporary security credentials that result from the
     * <code>GetFederationToken</code> API call--that is, to the <i>federated user</i>. When the federated user makes an
     * AWS request, AWS evaluates the policy attached to the federated user in combination with the policy or policies
     * attached to the IAM user whose credentials were used to call <code>GetFederationToken</code>. AWS allows the
     * federated user's request only when both the federated user <i> <b>and</b> </i> the IAM user are explicitly
     * allowed to perform the requested action. The passed policy cannot grant more permissions than those that are
     * defined in the IAM user policy.
     * </p>
     * <p>
     * A typical use case is that the permissions of the IAM user whose credentials are used to call
     * <code>GetFederationToken</code> are designed to allow access to all the actions and resources that any federated
     * user will need. Then, for individual users, you pass a policy to the operation that scopes down the permissions
     * to a level that's appropriate to that individual user, using a policy that allows only a subset of permissions
     * that are granted to the IAM user.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials have no effective permissions. The only
     * exception is when the temporary security credentials are used to access a resource that has a resource-based
     * policy that specifically allows the federated user to access the resource.
     * </p>
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>. For information about using <code>GetFederationToken</code> to create
     * temporary security credentials, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken"
     * >GetFederationToken—Federation Through a Custom Identity Broker</a>.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return Result of the GetFederationToken operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the policy document was too large. The error message describes how big
     *         the policy document is, in packed form, as a percentage of what the API allows.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.GetFederationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetFederationToken" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFederationTokenResult getFederationToken(GetFederationTokenRequest request) {
        request = beforeClientExecution(request);
        return executeGetFederationToken(request);
    }

    @SdkInternalApi
    final GetFederationTokenResult executeGetFederationToken(GetFederationTokenRequest getFederationTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(getFederationTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFederationTokenRequest> request = null;
        Response<GetFederationTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFederationTokenRequestMarshaller().marshall(super.beforeMarshalling(getFederationTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "STS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFederationToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetFederationTokenResult> responseHandler = new StaxResponseHandler<GetFederationTokenResult>(
                    new GetFederationTokenResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM user. The credentials consist of an access key
     * ID, a secret access key, and a security token. Typically, you use <code>GetSessionToken</code> if you want to use
     * MFA to protect programmatic calls to specific AWS APIs like Amazon EC2 <code>StopInstances</code>. MFA-enabled
     * IAM users would need to call <code>GetSessionToken</code> and submit an MFA code that is associated with their
     * MFA device. Using the temporary security credentials that are returned from the call, IAM users can then make
     * programmatic calls to APIs that require MFA authentication. If you do not supply a correct MFA code, then the API
     * returns an access denied error. For a comparison of <code>GetSessionToken</code> with the other APIs that produce
     * temporary credentials, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The <code>GetSessionToken</code> action must be called by using the long-term AWS security credentials of the AWS
     * account or an IAM user. Credentials that are created by IAM users are valid for the duration that you specify,
     * from 900 seconds (15 minutes) up to a maximum of 129600 seconds (36 hours), with a default of 43200 seconds (12
     * hours); credentials that are created by using account credentials can range from 900 seconds (15 minutes) up to a
     * maximum of 3600 seconds (1 hour), with a default of 1 hour.
     * </p>
     * <p>
     * The temporary security credentials created by <code>GetSessionToken</code> can be used to make API calls to any
     * AWS service with the following exceptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot call any IAM APIs unless MFA authentication information is included in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot call any STS API <i>except</i> <code>AssumeRole</code> or <code>GetCallerIdentity</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * We recommend that you do not call <code>GetSessionToken</code> with root account credentials. Instead, follow our
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users">best practices</a>
     * by creating one or more IAM users, giving them the necessary permissions, and using IAM users for everyday
     * interaction with AWS.
     * </p>
     * </note>
     * <p>
     * The permissions associated with the temporary security credentials returned by <code>GetSessionToken</code> are
     * based on the permissions associated with account or IAM user whose credentials are used to call the action. If
     * <code>GetSessionToken</code> is called using root account credentials, the temporary credentials have root
     * account permissions. Similarly, if <code>GetSessionToken</code> is called using the credentials of an IAM user,
     * the temporary credentials have the same permissions as the IAM user.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to create temporary credentials, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken"
     * >Temporary Credentials for Users in Untrusted Environments</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getSessionTokenRequest
     * @return Result of the GetSessionToken operation returned by the service.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.GetSessionToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetSessionToken" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSessionTokenResult getSessionToken(GetSessionTokenRequest request) {
        request = beforeClientExecution(request);
        return executeGetSessionToken(request);
    }

    @SdkInternalApi
    final GetSessionTokenResult executeGetSessionToken(GetSessionTokenRequest getSessionTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(getSessionTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSessionTokenRequest> request = null;
        Response<GetSessionTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSessionTokenRequestMarshaller().marshall(super.beforeMarshalling(getSessionTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "STS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSessionToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetSessionTokenResult> responseHandler = new StaxResponseHandler<GetSessionTokenResult>(
                    new GetSessionTokenResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetSessionTokenResult getSessionToken() {
        return getSessionToken(new GetSessionTokenRequest());
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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}

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
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html">Temporary Security Credentials</a>.
 * </p>
 * <p>
 * For information about setting up signatures and authorization through the API, go to <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a> in
 * the <i>AWS General Reference</i>. For general information about the Query API, go to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in <i>Using
 * IAM</i>. For information about using security tokens with other AWS products, go to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS Services
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
 * By default, AWS Security Token Service (STS) is available as a global service, and all AWS STS requests go to a
 * single endpoint at <code>https://sts.amazonaws.com</code>. Global requests map to the US East (N. Virginia) region.
 * AWS recommends using Regional AWS STS endpoints instead of the global endpoint to reduce latency, build in
 * redundancy, and increase session token validity. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Managing AWS STS in
 * an AWS Region</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * Most AWS Regions are enabled for operations in all AWS services by default. Those Regions are automatically activated
 * for use with AWS STS. Some Regions, such as Asia Pacific (Hong Kong), must be manually enabled. To learn more about
 * enabling and disabling AWS Regions, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing AWS Regions</a> in the <i>AWS General
 * Reference</i>. When you enable these AWS Regions, they are automatically activated for use with AWS STS. You cannot
 * activate the STS endpoint for a Region that is disabled. Tokens that are valid in all AWS Regions are longer than
 * tokens that are valid in Regions that are enabled by default. Changing this setting might affect existing systems
 * where you temporarily store tokens. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html#sts-regions-manage-tokens"
 * >Managing Global Endpoint Session Tokens</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * After you activate a Region for use with AWS STS, you can direct AWS STS API calls to that Region. AWS STS recommends
 * that you provide both the Region and endpoint when you make calls to a Regional endpoint. You can provide the Region
 * alone for manually enabled Regions, such as Asia Pacific (Hong Kong). In this case, the calls are directed to the STS
 * Regional endpoint. However, if you provide the Region alone for Regions enabled by default, the calls are directed to
 * the global endpoint of <code>https://sts.amazonaws.com</code>.
 * </p>
 * <p>
 * To view the list of AWS STS endpoints and whether they are active by default, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html#id_credentials_temp_enable-regions_writing_code"
 * >Writing Code to Use AWS STS Regions</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * STS supports AWS CloudTrail, which is a service that records AWS calls for your AWS account and delivers log files to
 * an Amazon S3 bucket. By using information collected by CloudTrail, you can determine what requests were successfully
 * made to STS, who made the request, when it was made, and so on.
 * </p>
 * <p>
 * If you activate AWS STS endpoints in Regions other than the default global endpoint, then you must also turn on
 * CloudTrail logging in those Regions. This is necessary to record any AWS STS API calls that are made in those
 * Regions. For more information, see <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/aggregating_logs_regions_turn_on_ct.html">Turning On
 * CloudTrail in Additional Regions</a> in the <i>AWS CloudTrail User Guide</i>.
 * </p>
 * <p>
 * AWS Security Token Service (STS) is a global service with a single endpoint at <code>https://sts.amazonaws.com</code>
 * . Calls to this endpoint are logged as calls to a global service. However, because this endpoint is physically
 * located in the US East (N. Virginia) Region, your logs list <code>us-east-1</code> as the event Region. CloudTrail
 * does not write these logs to the US East (Ohio) Region unless you choose to include global service logs in that
 * Region. CloudTrail writes calls to all Regional endpoints to their respective Regions. For example, calls to
 * sts.us-east-2.amazonaws.com are published to the US East (Ohio) Region and calls to sts.eu-central-1.amazonaws.com
 * are published to the EU (Frankfurt) Region.
 * </p>
 * <p>
 * To learn more about CloudTrail, including how to turn it on and find your log files, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
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

    // STS regions that originally mapped to the global endpoint but now have region-specific endpoints
    private static final Set<String> LEGACY_ENABLED_REGIONS;
    static {
        Set<String> legacyEnabledRegions = new HashSet<String>();
        legacyEnabledRegions.add("ap-northeast-1");
        legacyEnabledRegions.add("ap-south-1");
        legacyEnabledRegions.add("ap-southeast-1");
        legacyEnabledRegions.add("ap-southeast-2");
        legacyEnabledRegions.add("aws-global");
        legacyEnabledRegions.add("ca-central-1");
        legacyEnabledRegions.add("eu-central-1");
        legacyEnabledRegions.add("eu-north-1");
        legacyEnabledRegions.add("eu-west-1");
        legacyEnabledRegions.add("eu-west-2");
        legacyEnabledRegions.add("eu-west-3");
        legacyEnabledRegions.add("sa-east-1");
        legacyEnabledRegions.add("us-east-1");
        legacyEnabledRegions.add("us-east-2");
        legacyEnabledRegions.add("us-west-1");
        legacyEnabledRegions.add("us-west-2");
        LEGACY_ENABLED_REGIONS = Collections.unmodifiableSet(legacyEnabledRegions);
    }

    private static RegionalEndpointsOptionResolver REGIONAL_ENDPOINTS_OPTION_RESOLVER = new RegionalEndpointsOptionResolver();

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
     * Returns a set of temporary security credentials that you can use to access AWS resources that you might not
     * normally have access to. These temporary credentials consist of an access key ID, a secret access key, and a
     * security token. Typically, you use <code>AssumeRole</code> within your account or for cross-account access. For a
     * comparison of <code>AssumeRole</code> with other API operations that produce temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * You cannot use AWS account root user credentials to call <code>AssumeRole</code>. You must use credentials for an
     * IAM user or an IAM role to call <code>AssumeRole</code>.
     * </p>
     * </important>
     * <p>
     * For cross-account access, imagine that you own multiple accounts and need to access resources in each account.
     * You could create long-term credentials in each account to access those resources. However, managing all those
     * credentials and remembering which one can access which account can be time consuming. Instead, you can create one
     * set of long-term credentials in one account. Then use temporary security credentials to access all the other
     * accounts by assuming roles in those accounts. For more information about roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Session Duration</b>
     * </p>
     * <p>
     * By default, the temporary security credentials created by <code>AssumeRole</code> last for one hour. However, you
     * can use the optional <code>DurationSeconds</code> parameter to specify the duration of your session. You can
     * provide a value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This
     * setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>. The maximum session duration
     * limit applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     * commands. However the limit does not apply when you use those operations to create a console URL. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRole</code> can be used to make API calls to any AWS
     * service with the following exception: You cannot call the AWS STS <code>GetFederationToken</code> or
     * <code>GetSessionToken</code> API operations.
     * </p>
     * <p>
     * (Optional) You can pass inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     * policies</a> to this operation. You can pass a single JSON policy document to use as an inline session policy.
     * You can also specify up to 10 managed policies to use as managed session policies. The plain text that you use
     * for both inline and managed session policies can't exceed 2,048 characters. Passing policies to this operation
     * returns new temporary credentials. The resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You cannot use session policies to grant more
     * permissions than those allowed by the identity-based policy of the role that is being assumed. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * To assume a role from a different account, your AWS account must be trusted by the role. The trust relationship
     * is defined in the role's trust policy when the role is created. That trust policy states which accounts are
     * allowed to delegate that access to users in the account.
     * </p>
     * <p>
     * A user who wants to access a role in a different account must also have permissions that are delegated from the
     * user account administrator. The administrator must attach a policy that allows the user to call
     * <code>AssumeRole</code> for the ARN of the role in the other account. If the user is in the same account as the
     * role, then you can do either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attach a policy to the user (identical to the previous user in a different account).
     * </p>
     * </li>
     * <li>
     * <p>
     * Add the user as a principal directly in the role's trust policy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In this case, the trust policy acts as an IAM resource-based policy. Users in the same account as the role do not
     * need explicit permission to assume the role. For more information about trust policies and resource-based
     * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM Policies</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Tags</b>
     * </p>
     * <p>
     * (Optional) You can pass tag key-value pairs to your session. These tags are called session tags. For more
     * information about session tags, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in STS</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * An administrator must grant you the permissions necessary to pass session tags. The administrator can also create
     * granular permissions to allow you to pass only specific session tags. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html">Tutorial:
     * Using Tags for Attribute-Based Access Control</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can set the session tags as transitive. Transitive tags persist during role chaining. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining">
     * Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Using MFA with AssumeRole</b>
     * </p>
     * <p>
     * (Optional) You can include multi-factor authentication (MFA) information when you call <code>AssumeRole</code>.
     * This is useful for cross-account scenarios to ensure that the user that assumes the role has been authenticated
     * with an AWS MFA device. In that scenario, the trust policy of the role being assumed includes a condition that
     * tests for MFA authentication. If the caller does not include valid MFA information, the request to assume the
     * role is denied. The condition in a trust policy that tests for MFA authentication might look like the following
     * example.
     * </p>
     * <p>
     * <code>"Condition": {"Bool": {"aws:MultiFactorAuthPresent": true}}</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html">Configuring MFA-Protected API
     * Access</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * <p>
     * To use MFA with <code>AssumeRole</code>, you pass values for the <code>SerialNumber</code> and
     * <code>TokenCode</code> parameters. The <code>SerialNumber</code> value identifies the user's hardware or virtual
     * MFA device. The <code>TokenCode</code> is the time-based one-time password (TOTP) that the MFA device produces.
     * </p>
     * 
     * @param assumeRoleRequest
     * @return Result of the AssumeRole operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the total packed size of the session policies and session tags combined
     *         was too large. An AWS conversion compresses the session policy document, session policy ARNs, and session
     *         tags into a packed binary format that has a separate limit. The error message indicates by percentage how
     *         close the policies and tags are to the upper size limit. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in
     *         STS</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         You could receive this error even though you meet other defined session policy and session tag limits.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">IAM and
     *         STS Entity Character Limits</a> in the <i>IAM User Guide</i>.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
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
     * <code>AssumeRoleWithSAML</code> with the other API operations that produce temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials returned by this operation consist of an access key ID, a secret access key,
     * and a security token. Applications can use these temporary security credentials to sign calls to AWS services.
     * </p>
     * <p>
     * <b>Session Duration</b>
     * </p>
     * <p>
     * By default, the temporary security credentials created by <code>AssumeRoleWithSAML</code> last for one hour.
     * However, you can use the optional <code>DurationSeconds</code> parameter to specify the duration of your session.
     * Your role session lasts for the duration that you specify, or until the time specified in the SAML authentication
     * response's <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a
     * <code>DurationSeconds</code> value from 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your
     * role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>. The maximum session duration
     * limit applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     * commands. However the limit does not apply when you use those operations to create a console URL. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRoleWithSAML</code> can be used to make API calls to
     * any AWS service with the following exception: you cannot call the STS <code>GetFederationToken</code> or
     * <code>GetSessionToken</code> API operations.
     * </p>
     * <p>
     * (Optional) You can pass inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     * policies</a> to this operation. You can pass a single JSON policy document to use as an inline session policy.
     * You can also specify up to 10 managed policies to use as managed session policies. The plain text that you use
     * for both inline and managed session policies can't exceed 2,048 characters. Passing policies to this operation
     * returns new temporary credentials. The resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You cannot use session policies to grant more
     * permissions than those allowed by the identity-based policy of the role that is being assumed. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Calling <code>AssumeRoleWithSAML</code> does not require the use of AWS security credentials. The identity of the
     * caller is validated by using keys in the metadata document that is uploaded for the SAML provider entity for your
     * identity provider.
     * </p>
     * <important>
     * <p>
     * Calling <code>AssumeRoleWithSAML</code> can result in an entry in your AWS CloudTrail logs. The entry includes
     * the value in the <code>NameID</code> element of the SAML assertion. We recommend that you use a
     * <code>NameIDType</code> that is not associated with any personally identifiable information (PII). For example,
     * you could instead use the persistent identifier (
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:persistent</code>).
     * </p>
     * </important>
     * <p>
     * <b>Tags</b>
     * </p>
     * <p>
     * (Optional) You can configure your IdP to pass attributes into your SAML assertion as session tags. Each session
     * tag consists of a key name and an associated value. For more information about session tags, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in STS</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128 characters and the values
     * can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is attached to the role. When you do, session tags
     * override the role's tags with the same key.
     * </p>
     * <p>
     * An administrator must grant you the permissions necessary to pass session tags. The administrator can also create
     * granular permissions to allow you to pass only specific session tags. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html">Tutorial:
     * Using Tags for Attribute-Based Access Control</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can set the session tags as transitive. Transitive tags persist during role chaining. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining">
     * Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>SAML Configuration</b>
     * </p>
     * <p>
     * Before your application can call <code>AssumeRoleWithSAML</code>, you must configure your SAML identity provider
     * (IdP) to issue the claims required by AWS. Additionally, you must use AWS Identity and Access Management (IAM) to
     * create a SAML provider entity in your AWS account that represents your identity provider. You must also create an
     * IAM role that specifies this SAML provider in its trust policy.
     * </p>
     * <p>
     * For more information, see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     * Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml.html">Creating SAML
     * Identity Providers</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml_relying-party.html">
     * Configuring a Relying Party and Claims</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_saml.html">Creating a Role for
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
     *         The request was rejected because the total packed size of the session policies and session tags combined
     *         was too large. An AWS conversion compresses the session policy document, session policy ARNs, and session
     *         tags into a packed binary format that has a separate limit. The error message indicates by percentage how
     *         close the policies and tags are to the upper size limit. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in
     *         STS</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         You could receive this error even though you meet other defined session policy and session tag limits.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">IAM and
     *         STS Entity Character Limits</a> in the <i>IAM User Guide</i>.
     * @throws IDPRejectedClaimException
     *         The identity provider (IdP) reported that authentication failed. This might be because the claim is
     *         invalid.
     *         </p>
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
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
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
     * application with a web identity provider. Example providers include Amazon Cognito, Login with Amazon, Facebook,
     * Google, or any OpenID Connect-compatible identity provider.
     * </p>
     * <note>
     * <p>
     * For mobile applications, we recommend that you use Amazon Cognito. You can use Amazon Cognito with the <a
     * href="http://aws.amazon.com/sdkforios/">AWS SDK for iOS Developer Guide</a> and the <a
     * href="http://aws.amazon.com/sdkforandroid/">AWS SDK for Android Developer Guide</a> to uniquely identify a user.
     * You can also supply the user with a consistent identity throughout the lifetime of an application.
     * </p>
     * <p>
     * To learn more about Amazon Cognito, see <a
     * href="https://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-auth.html#d0e840">Amazon Cognito
     * Overview</a> in <i>AWS SDK for Android Developer Guide</i> and <a
     * href="https://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-auth.html#d0e664">Amazon Cognito
     * Overview</a> in the <i>AWS SDK for iOS Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> does not require the use of AWS security credentials. Therefore,
     * you can distribute an application (for example, on mobile devices) that requests temporary security credentials
     * without including long-term AWS credentials in the application. You also don't need to deploy server-based proxy
     * services that use long-term AWS credentials. Instead, the identity of the caller is validated by using a token
     * from the web identity provider. For a comparison of <code>AssumeRoleWithWebIdentity</code> with the other API
     * operations that produce temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials returned by this API consist of an access key ID, a secret access key, and a
     * security token. Applications can use these temporary security credentials to sign calls to AWS service API
     * operations.
     * </p>
     * <p>
     * <b>Session Duration</b>
     * </p>
     * <p>
     * By default, the temporary security credentials created by <code>AssumeRoleWithWebIdentity</code> last for one
     * hour. However, you can use the optional <code>DurationSeconds</code> parameter to specify the duration of your
     * session. You can provide a value from 900 seconds (15 minutes) up to the maximum session duration setting for the
     * role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your
     * role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>. The maximum session duration
     * limit applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     * commands. However the limit does not apply when you use those operations to create a console URL. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRoleWithWebIdentity</code> can be used to make API
     * calls to any AWS service with the following exception: you cannot call the STS <code>GetFederationToken</code> or
     * <code>GetSessionToken</code> API operations.
     * </p>
     * <p>
     * (Optional) You can pass inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     * policies</a> to this operation. You can pass a single JSON policy document to use as an inline session policy.
     * You can also specify up to 10 managed policies to use as managed session policies. The plain text that you use
     * for both inline and managed session policies can't exceed 2,048 characters. Passing policies to this operation
     * returns new temporary credentials. The resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You cannot use session policies to grant more
     * permissions than those allowed by the identity-based policy of the role that is being assumed. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Tags</b>
     * </p>
     * <p>
     * (Optional) You can configure your IdP to pass attributes into your web identity token as session tags. Each
     * session tag consists of a key name and an associated value. For more information about session tags, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in STS</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128 characters and the values
     * can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is attached to the role. When you do, the session tag
     * overrides the role tag with the same key.
     * </p>
     * <p>
     * An administrator must grant you the permissions necessary to pass session tags. The administrator can also create
     * granular permissions to allow you to pass only specific session tags. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html">Tutorial:
     * Using Tags for Attribute-Based Access Control</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can set the session tags as transitive. Transitive tags persist during role chaining. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining">
     * Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Identities</b>
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
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual.html">Using Web Identity
     * Federation API Operations for Mobile Apps</a> and <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
     * >Federation Through a Web-based Identity Provider</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://web-identity-federation-playground.s3.amazonaws.com/index.html"> Web Identity Federation
     * Playground</a>. Walk through the process of authenticating through Login with Amazon, Facebook, or Google,
     * getting temporary security credentials, and then using those credentials to make a request to AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/sdkforios/">AWS SDK for iOS Developer Guide</a> and <a
     * href="http://aws.amazon.com/sdkforandroid/">AWS SDK for Android Developer Guide</a>. These toolkits contain
     * sample apps that show how to invoke the identity providers. The toolkits then show how to use the information
     * from these providers to get and use temporary security credentials.
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
     *         The request was rejected because the total packed size of the session policies and session tags combined
     *         was too large. An AWS conversion compresses the session policy document, session policy ARNs, and session
     *         tags into a packed binary format that has a separate limit. The error message indicates by percentage how
     *         close the policies and tags are to the upper size limit. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in
     *         STS</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         You could receive this error even though you meet other defined session policy and session tag limits.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">IAM and
     *         STS Entity Character Limits</a> in the <i>IAM User Guide</i>.
     * @throws IDPRejectedClaimException
     *         The identity provider (IdP) reported that authentication failed. This might be because the claim is
     *         invalid.
     *         </p>
     *         <p>
     *         If this error is returned for the <code>AssumeRoleWithWebIdentity</code> operation, it can also mean that
     *         the claim has expired or has been explicitly revoked.
     * @throws IDPCommunicationErrorException
     *         The request could not be fulfilled because the identity provider (IDP) that was asked to verify the
     *         incoming identity token could not be reached. This is often a transient error caused by network
     *         conditions. Retry the request a limited number of times so that you don't exceed the request rate. If the
     *         error persists, the identity provider might be down or not responding.
     * @throws InvalidIdentityTokenException
     *         The web identity token that was passed could not be validated by AWS. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws ExpiredTokenException
     *         The web identity token that was passed is expired or is not valid. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
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
     * For example, if a user is not authorized to perform an operation that he or she has requested, the request
     * returns a <code>Client.UnauthorizedOperation</code> response (an HTTP 403 response). Some AWS operations
     * additionally return an encoded message that can provide details about this authorization failure.
     * </p>
     * <note>
     * <p>
     * Only certain AWS operations return an encoded authorization message. The documentation for an individual
     * operation indicates whether that operation returns an encoded message in addition to returning an HTTP code.
     * </p>
     * </note>
     * <p>
     * The message is encoded because the details of the authorization status can constitute privileged information that
     * the user who requested the operation should not see. To decode an authorization status message, a user must be
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
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-denyallow"
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
     * Returns the account identifier for the specified access key ID.
     * </p>
     * <p>
     * Access keys consist of two parts: an access key ID (for example, <code>AKIAIOSFODNN7EXAMPLE</code>) and a secret
     * access key (for example, <code>wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY</code>). For more information about
     * access keys, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html">Managing Access Keys for
     * IAM Users</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * When you pass an access key ID to this operation, it returns the ID of the AWS account to which the keys belong.
     * Access key IDs beginning with <code>AKIA</code> are long-term credentials for an IAM user or the AWS account root
     * user. Access key IDs beginning with <code>ASIA</code> are temporary credentials that are created using STS
     * operations. If the account in the response belongs to you, you can sign in as the root user and review your root
     * user access keys. Then, you can pull a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html">credentials report</a>
     * to learn which IAM user owns the keys. To learn who requested the temporary credentials for an <code>ASIA</code>
     * access key, view the STS events in your <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html">CloudTrail logs</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This operation does not indicate the state of the access key. The key might be active, inactive, or deleted.
     * Active keys might not have permissions to perform an operation. Providing a deleted access key might return an
     * error that the key doesn't exist.
     * </p>
     * 
     * @param getAccessKeyInfoRequest
     * @return Result of the GetAccessKeyInfo operation returned by the service.
     * @sample AWSSecurityTokenService.GetAccessKeyInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetAccessKeyInfo" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccessKeyInfoResult getAccessKeyInfo(GetAccessKeyInfoRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessKeyInfo(request);
    }

    @SdkInternalApi
    final GetAccessKeyInfoResult executeGetAccessKeyInfo(GetAccessKeyInfoRequest getAccessKeyInfoRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessKeyInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessKeyInfoRequest> request = null;
        Response<GetAccessKeyInfoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessKeyInfoRequestMarshaller().marshall(super.beforeMarshalling(getAccessKeyInfoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "STS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessKeyInfo");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetAccessKeyInfoResult> responseHandler = new StaxResponseHandler<GetAccessKeyInfoResult>(
                    new GetAccessKeyInfoResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about the IAM user or role whose credentials are used to call the operation.
     * </p>
     * <note>
     * <p>
     * No permissions are required to perform this operation. If an administrator adds a policy to your IAM user or role
     * that explicitly denies access to the <code>sts:GetCallerIdentity</code> action, you can still perform this
     * operation. Permissions are not required because the same information is returned when an IAM user or role is
     * denied access. To view an example response, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_access-denied-delete-mfa"
     * >I Am Not Authorized to Perform: iam:DeleteVirtualMFADevice</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
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
     * credentials on behalf of distributed applications inside a corporate network. You must call the
     * <code>GetFederationToken</code> operation using the long-term security credentials of an IAM user. As a result,
     * this call is appropriate in contexts where those credentials can be safely stored, usually in a server-based
     * application. For a comparison of <code>GetFederationToken</code> with the other API operations that produce
     * temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can create a mobile-based or browser-based app that can authenticate users using a web identity provider like
     * Login with Amazon, Facebook, Google, or an OpenID Connect-compatible identity provider. In this case, we
     * recommend that you use <a href="http://aws.amazon.com/cognito/">Amazon Cognito</a> or
     * <code>AssumeRoleWithWebIdentity</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
     * >Federation Through a Web-based Identity Provider</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * You can also call <code>GetFederationToken</code> using the security credentials of an AWS account root user, but
     * we do not recommend it. Instead, we recommend that you create an IAM user for the purpose of the proxy
     * application. Then attach a policy to the IAM user that limits federated users to only the actions and resources
     * that they need to access. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html">IAM Best Practices</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Session duration</b>
     * </p>
     * <p>
     * The temporary credentials are valid for the specified duration, from 900 seconds (15 minutes) up to a maximum of
     * 129,600 seconds (36 hours). The default session duration is 43,200 seconds (12 hours). Temporary credentials that
     * are obtained by using AWS account root user credentials have a maximum duration of 3,600 seconds (1 hour).
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You can use the temporary credentials created by <code>GetFederationToken</code> in any AWS service except the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot call any IAM operations using the AWS CLI or the AWS API.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot call any STS operations except <code>GetCallerIdentity</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies. The plain text that you use for both inline
     * and managed session policies can't exceed 2,048 characters.
     * </p>
     * <p>
     * Though the session policy parameters are optional, if you do not pass a policy, then the resulting federated user
     * session has no permissions. When you pass session policies, the session permissions are the intersection of the
     * IAM user policies and the session policies that you pass. This gives you a way to further restrict the
     * permissions for a federated user. You cannot use session policies to grant more permissions than those that are
     * defined in the permissions policy of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>. For information about using <code>GetFederationToken</code> to create
     * temporary security credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken"
     * >GetFederationToken—Federation Through a Custom Identity Broker</a>.
     * </p>
     * <p>
     * You can use the credentials to access a resource that has a resource-based policy. If that policy specifically
     * references the federated user session in the <code>Principal</code> element of the policy, the session has the
     * permissions allowed by the policy. These permissions are granted in addition to the permissions granted by the
     * session policies.
     * </p>
     * <p>
     * <b>Tags</b>
     * </p>
     * <p>
     * (Optional) You can pass tag key-value pairs to your session. These are called session tags. For more information
     * about session tags, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing
     * Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * An administrator must grant you the permissions necessary to pass session tags. The administrator can also create
     * granular permissions to allow you to pass only specific session tags. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html">Tutorial:
     * Using Tags for Attribute-Based Access Control</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the user that you are federating has
     * the <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the user tag.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return Result of the GetFederationToken operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the total packed size of the session policies and session tags combined
     *         was too large. An AWS conversion compresses the session policy document, session policy ARNs, and session
     *         tags into a packed binary format that has a separate limit. The error message indicates by percentage how
     *         close the policies and tags are to the upper size limit. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in
     *         STS</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         You could receive this error even though you meet other defined session policy and session tag limits.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">IAM and
     *         STS Entity Character Limits</a> in the <i>IAM User Guide</i>.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
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
     * MFA to protect programmatic calls to specific AWS API operations like Amazon EC2 <code>StopInstances</code>.
     * MFA-enabled IAM users would need to call <code>GetSessionToken</code> and submit an MFA code that is associated
     * with their MFA device. Using the temporary security credentials that are returned from the call, IAM users can
     * then make programmatic calls to API operations that require MFA authentication. If you do not supply a correct
     * MFA code, then the API returns an access denied error. For a comparison of <code>GetSessionToken</code> with the
     * other API operations that produce temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Session Duration</b>
     * </p>
     * <p>
     * The <code>GetSessionToken</code> operation must be called by using the long-term AWS security credentials of the
     * AWS account root user or an IAM user. Credentials that are created by IAM users are valid for the duration that
     * you specify. This duration can range from 900 seconds (15 minutes) up to a maximum of 129,600 seconds (36 hours),
     * with a default of 43,200 seconds (12 hours). Credentials based on account credentials can range from 900 seconds
     * (15 minutes) up to 3,600 seconds (1 hour), with a default of 1 hour.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The temporary security credentials created by <code>GetSessionToken</code> can be used to make API calls to any
     * AWS service with the following exceptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot call any IAM API operations unless MFA authentication information is included in the request.
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
     * We recommend that you do not call <code>GetSessionToken</code> with AWS account root user credentials. Instead,
     * follow our <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users">best
     * practices</a> by creating one or more IAM users, giving them the necessary permissions, and using IAM users for
     * everyday interaction with AWS.
     * </p>
     * </note>
     * <p>
     * The credentials that are returned by <code>GetSessionToken</code> are based on permissions associated with the
     * user whose credentials were used to call the operation. If <code>GetSessionToken</code> is called using AWS
     * account root user credentials, the temporary credentials have root user permissions. Similarly, if
     * <code>GetSessionToken</code> is called using the credentials of an IAM user, the temporary credentials have the
     * same permissions as the IAM user.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to create temporary credentials, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken"
     * >Temporary Credentials for Users in Untrusted Environments</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getSessionTokenRequest
     * @return Result of the GetSessionToken operation returned by the service.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
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

    @Override
    @Deprecated
    public void setRegion(Region region) {
        Region mappedRegion = mapToLegacyRegionIfNecessary(region);
        super.setRegion(mappedRegion);
    }

    private Region mapToLegacyRegionIfNecessary(Region region) {
        if (legacyRegionModeEnabled() && LEGACY_ENABLED_REGIONS.contains(region.getName())) {
            return RegionUtils.getRegion("aws-global");
        }
        return region;
    }

    private boolean legacyRegionModeEnabled() {
        return REGIONAL_ENDPOINTS_OPTION_RESOLVER.useLegacyMode();
    }

    @com.amazonaws.annotation.SdkTestInternalApi
    static void setRegionalEndpointsOptionResolver(RegionalEndpointsOptionResolver resolver) {
        REGIONAL_ENDPOINTS_OPTION_RESOLVER = resolver;
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

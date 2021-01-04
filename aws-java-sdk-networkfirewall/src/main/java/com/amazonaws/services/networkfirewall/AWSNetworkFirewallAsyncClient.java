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
package com.amazonaws.services.networkfirewall;

import javax.annotation.Generated;

import com.amazonaws.services.networkfirewall.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Network Firewall asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This is the API Reference for AWS Network Firewall. This guide is for developers who need detailed information about
 * the Network Firewall API actions, data types, and errors.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The REST API requires you to handle connection details, such as calculating signatures, handling request retries, and
 * error handling. For general information about using the AWS REST APIs, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws-apis.html">AWS APIs</a>.
 * </p>
 * <p>
 * To access Network Firewall using the REST API endpoint:
 * <code>https://network-firewall.&lt;region&gt;.amazonaws.com </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of Network Firewall features, including and step-by-step instructions on how to use them through the
 * Network Firewall console, see the <a
 * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/">Network Firewall Developer Guide</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Network Firewall is a stateful, managed, network firewall and intrusion detection and prevention service for Amazon
 * Virtual Private Cloud (Amazon VPC). With Network Firewall, you can filter traffic at the perimeter of your VPC. This
 * includes filtering traffic going to and coming from an internet gateway, NAT gateway, or over VPN or AWS Direct
 * Connect. Network Firewall uses rules that are compatible with Suricata, a free, open source intrusion detection
 * system (IDS) engine. For information about Suricata, see the <a href="https://suricata-ids.org/">Suricata
 * website</a>.
 * </p>
 * <p>
 * You can use Network Firewall to monitor and protect your VPC traffic in a number of ways. The following are just a
 * few examples:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Allow domains or IP addresses for known AWS service endpoints, such as Amazon S3, and block all other forms of
 * traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use custom lists of known bad domains to limit the types of domain names that your applications can access.
 * </p>
 * </li>
 * <li>
 * <p>
 * Perform deep packet inspection on traffic entering or leaving your VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * Rate limit traffic going from AWS to on-premises IP destinations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use stateful protocol detection to filter protocols like HTTPS, regardless of the port used.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To enable Network Firewall for your VPCs, you perform steps in both Amazon VPC and in Network Firewall. For
 * information about using Amazon VPC, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/">Amazon VPC User
 * Guide</a>.
 * </p>
 * <p>
 * To start using Network Firewall, do the following:
 * </p>
 * <ol>
 * <li>
 * <p>
 * (Optional) If you don't already have a VPC that you want to protect, create it in Amazon VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Amazon VPC, in each Availability Zone where you want to have a firewall endpoint, create a subnet for the sole use
 * of Network Firewall.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create stateless and stateful rule groups, to define the components of the network traffic
 * filtering behavior that you want your firewall to have.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create a firewall policy that uses your rule groups and specifies additional default traffic
 * filtering behavior.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create a firewall and specify your new firewall policy and VPC subnets. Network Firewall creates
 * a firewall endpoint in each subnet that you specify, with the behavior that's defined in the firewall policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Amazon VPC, use ingress routing enhancements to route traffic through the new firewall endpoints.
 * </p>
 * </li>
 * </ol>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSNetworkFirewallAsyncClient extends AWSNetworkFirewallClient implements AWSNetworkFirewallAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSNetworkFirewallAsyncClientBuilder asyncBuilder() {
        return AWSNetworkFirewallAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Network Firewall using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSNetworkFirewallAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Network Firewall using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSNetworkFirewallAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AssociateFirewallPolicyResult> associateFirewallPolicyAsync(AssociateFirewallPolicyRequest request) {

        return associateFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateFirewallPolicyResult> associateFirewallPolicyAsync(final AssociateFirewallPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateFirewallPolicyRequest, AssociateFirewallPolicyResult> asyncHandler) {
        final AssociateFirewallPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateFirewallPolicyResult>() {
            @Override
            public AssociateFirewallPolicyResult call() throws Exception {
                AssociateFirewallPolicyResult result = null;

                try {
                    result = executeAssociateFirewallPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateSubnetsResult> associateSubnetsAsync(AssociateSubnetsRequest request) {

        return associateSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSubnetsResult> associateSubnetsAsync(final AssociateSubnetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSubnetsRequest, AssociateSubnetsResult> asyncHandler) {
        final AssociateSubnetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSubnetsResult>() {
            @Override
            public AssociateSubnetsResult call() throws Exception {
                AssociateSubnetsResult result = null;

                try {
                    result = executeAssociateSubnets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallResult> createFirewallAsync(CreateFirewallRequest request) {

        return createFirewallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallResult> createFirewallAsync(final CreateFirewallRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFirewallRequest, CreateFirewallResult> asyncHandler) {
        final CreateFirewallRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFirewallResult>() {
            @Override
            public CreateFirewallResult call() throws Exception {
                CreateFirewallResult result = null;

                try {
                    result = executeCreateFirewall(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallPolicyResult> createFirewallPolicyAsync(CreateFirewallPolicyRequest request) {

        return createFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFirewallPolicyResult> createFirewallPolicyAsync(final CreateFirewallPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFirewallPolicyRequest, CreateFirewallPolicyResult> asyncHandler) {
        final CreateFirewallPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFirewallPolicyResult>() {
            @Override
            public CreateFirewallPolicyResult call() throws Exception {
                CreateFirewallPolicyResult result = null;

                try {
                    result = executeCreateFirewallPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest request) {

        return createRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(final CreateRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleGroupRequest, CreateRuleGroupResult> asyncHandler) {
        final CreateRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleGroupResult>() {
            @Override
            public CreateRuleGroupResult call() throws Exception {
                CreateRuleGroupResult result = null;

                try {
                    result = executeCreateRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallResult> deleteFirewallAsync(DeleteFirewallRequest request) {

        return deleteFirewallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallResult> deleteFirewallAsync(final DeleteFirewallRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFirewallRequest, DeleteFirewallResult> asyncHandler) {
        final DeleteFirewallRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFirewallResult>() {
            @Override
            public DeleteFirewallResult call() throws Exception {
                DeleteFirewallResult result = null;

                try {
                    result = executeDeleteFirewall(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallPolicyResult> deleteFirewallPolicyAsync(DeleteFirewallPolicyRequest request) {

        return deleteFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFirewallPolicyResult> deleteFirewallPolicyAsync(final DeleteFirewallPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFirewallPolicyRequest, DeleteFirewallPolicyResult> asyncHandler) {
        final DeleteFirewallPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFirewallPolicyResult>() {
            @Override
            public DeleteFirewallPolicyResult call() throws Exception {
                DeleteFirewallPolicyResult result = null;

                try {
                    result = executeDeleteFirewallPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(final DeleteResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {
        final DeleteResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyResult>() {
            @Override
            public DeleteResourcePolicyResult call() throws Exception {
                DeleteResourcePolicyResult result = null;

                try {
                    result = executeDeleteResourcePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest request) {

        return deleteRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(final DeleteRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupRequest, DeleteRuleGroupResult> asyncHandler) {
        final DeleteRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleGroupResult>() {
            @Override
            public DeleteRuleGroupResult call() throws Exception {
                DeleteRuleGroupResult result = null;

                try {
                    result = executeDeleteRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFirewallResult> describeFirewallAsync(DescribeFirewallRequest request) {

        return describeFirewallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFirewallResult> describeFirewallAsync(final DescribeFirewallRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFirewallRequest, DescribeFirewallResult> asyncHandler) {
        final DescribeFirewallRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFirewallResult>() {
            @Override
            public DescribeFirewallResult call() throws Exception {
                DescribeFirewallResult result = null;

                try {
                    result = executeDescribeFirewall(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFirewallPolicyResult> describeFirewallPolicyAsync(DescribeFirewallPolicyRequest request) {

        return describeFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFirewallPolicyResult> describeFirewallPolicyAsync(final DescribeFirewallPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFirewallPolicyRequest, DescribeFirewallPolicyResult> asyncHandler) {
        final DescribeFirewallPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFirewallPolicyResult>() {
            @Override
            public DescribeFirewallPolicyResult call() throws Exception {
                DescribeFirewallPolicyResult result = null;

                try {
                    result = executeDescribeFirewallPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(DescribeLoggingConfigurationRequest request) {

        return describeLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(final DescribeLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoggingConfigurationRequest, DescribeLoggingConfigurationResult> asyncHandler) {
        final DescribeLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoggingConfigurationResult>() {
            @Override
            public DescribeLoggingConfigurationResult call() throws Exception {
                DescribeLoggingConfigurationResult result = null;

                try {
                    result = executeDescribeLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(DescribeResourcePolicyRequest request) {

        return describeResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(final DescribeResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourcePolicyRequest, DescribeResourcePolicyResult> asyncHandler) {
        final DescribeResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourcePolicyResult>() {
            @Override
            public DescribeResourcePolicyResult call() throws Exception {
                DescribeResourcePolicyResult result = null;

                try {
                    result = executeDescribeResourcePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleGroupResult> describeRuleGroupAsync(DescribeRuleGroupRequest request) {

        return describeRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleGroupResult> describeRuleGroupAsync(final DescribeRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRuleGroupRequest, DescribeRuleGroupResult> asyncHandler) {
        final DescribeRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRuleGroupResult>() {
            @Override
            public DescribeRuleGroupResult call() throws Exception {
                DescribeRuleGroupResult result = null;

                try {
                    result = executeDescribeRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateSubnetsResult> disassociateSubnetsAsync(DisassociateSubnetsRequest request) {

        return disassociateSubnetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSubnetsResult> disassociateSubnetsAsync(final DisassociateSubnetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateSubnetsRequest, DisassociateSubnetsResult> asyncHandler) {
        final DisassociateSubnetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateSubnetsResult>() {
            @Override
            public DisassociateSubnetsResult call() throws Exception {
                DisassociateSubnetsResult result = null;

                try {
                    result = executeDisassociateSubnets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFirewallPoliciesResult> listFirewallPoliciesAsync(ListFirewallPoliciesRequest request) {

        return listFirewallPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallPoliciesResult> listFirewallPoliciesAsync(final ListFirewallPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFirewallPoliciesRequest, ListFirewallPoliciesResult> asyncHandler) {
        final ListFirewallPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFirewallPoliciesResult>() {
            @Override
            public ListFirewallPoliciesResult call() throws Exception {
                ListFirewallPoliciesResult result = null;

                try {
                    result = executeListFirewallPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFirewallsResult> listFirewallsAsync(ListFirewallsRequest request) {

        return listFirewallsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFirewallsResult> listFirewallsAsync(final ListFirewallsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFirewallsRequest, ListFirewallsResult> asyncHandler) {
        final ListFirewallsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFirewallsResult>() {
            @Override
            public ListFirewallsResult call() throws Exception {
                ListFirewallsResult result = null;

                try {
                    result = executeListFirewalls(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest request) {

        return listRuleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(final ListRuleGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRuleGroupsRequest, ListRuleGroupsResult> asyncHandler) {
        final ListRuleGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRuleGroupsResult>() {
            @Override
            public ListRuleGroupsResult call() throws Exception {
                ListRuleGroupsResult result = null;

                try {
                    result = executeListRuleGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(final PutResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {
        final PutResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourcePolicyResult>() {
            @Override
            public PutResourcePolicyResult call() throws Exception {
                PutResourcePolicyResult result = null;

                try {
                    result = executePutResourcePolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallDeleteProtectionResult> updateFirewallDeleteProtectionAsync(UpdateFirewallDeleteProtectionRequest request) {

        return updateFirewallDeleteProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallDeleteProtectionResult> updateFirewallDeleteProtectionAsync(
            final UpdateFirewallDeleteProtectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFirewallDeleteProtectionRequest, UpdateFirewallDeleteProtectionResult> asyncHandler) {
        final UpdateFirewallDeleteProtectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFirewallDeleteProtectionResult>() {
            @Override
            public UpdateFirewallDeleteProtectionResult call() throws Exception {
                UpdateFirewallDeleteProtectionResult result = null;

                try {
                    result = executeUpdateFirewallDeleteProtection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallDescriptionResult> updateFirewallDescriptionAsync(UpdateFirewallDescriptionRequest request) {

        return updateFirewallDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallDescriptionResult> updateFirewallDescriptionAsync(final UpdateFirewallDescriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFirewallDescriptionRequest, UpdateFirewallDescriptionResult> asyncHandler) {
        final UpdateFirewallDescriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFirewallDescriptionResult>() {
            @Override
            public UpdateFirewallDescriptionResult call() throws Exception {
                UpdateFirewallDescriptionResult result = null;

                try {
                    result = executeUpdateFirewallDescription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallPolicyResult> updateFirewallPolicyAsync(UpdateFirewallPolicyRequest request) {

        return updateFirewallPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallPolicyResult> updateFirewallPolicyAsync(final UpdateFirewallPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFirewallPolicyRequest, UpdateFirewallPolicyResult> asyncHandler) {
        final UpdateFirewallPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFirewallPolicyResult>() {
            @Override
            public UpdateFirewallPolicyResult call() throws Exception {
                UpdateFirewallPolicyResult result = null;

                try {
                    result = executeUpdateFirewallPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallPolicyChangeProtectionResult> updateFirewallPolicyChangeProtectionAsync(
            UpdateFirewallPolicyChangeProtectionRequest request) {

        return updateFirewallPolicyChangeProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFirewallPolicyChangeProtectionResult> updateFirewallPolicyChangeProtectionAsync(
            final UpdateFirewallPolicyChangeProtectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFirewallPolicyChangeProtectionRequest, UpdateFirewallPolicyChangeProtectionResult> asyncHandler) {
        final UpdateFirewallPolicyChangeProtectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFirewallPolicyChangeProtectionResult>() {
            @Override
            public UpdateFirewallPolicyChangeProtectionResult call() throws Exception {
                UpdateFirewallPolicyChangeProtectionResult result = null;

                try {
                    result = executeUpdateFirewallPolicyChangeProtection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(UpdateLoggingConfigurationRequest request) {

        return updateLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(final UpdateLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLoggingConfigurationRequest, UpdateLoggingConfigurationResult> asyncHandler) {
        final UpdateLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLoggingConfigurationResult>() {
            @Override
            public UpdateLoggingConfigurationResult call() throws Exception {
                UpdateLoggingConfigurationResult result = null;

                try {
                    result = executeUpdateLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest request) {

        return updateRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(final UpdateRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuleGroupRequest, UpdateRuleGroupResult> asyncHandler) {
        final UpdateRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleGroupResult>() {
            @Override
            public UpdateRuleGroupResult call() throws Exception {
                UpdateRuleGroupResult result = null;

                try {
                    result = executeUpdateRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSubnetChangeProtectionResult> updateSubnetChangeProtectionAsync(UpdateSubnetChangeProtectionRequest request) {

        return updateSubnetChangeProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubnetChangeProtectionResult> updateSubnetChangeProtectionAsync(final UpdateSubnetChangeProtectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubnetChangeProtectionRequest, UpdateSubnetChangeProtectionResult> asyncHandler) {
        final UpdateSubnetChangeProtectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubnetChangeProtectionResult>() {
            @Override
            public UpdateSubnetChangeProtectionResult call() throws Exception {
                UpdateSubnetChangeProtectionResult result = null;

                try {
                    result = executeUpdateSubnetChangeProtection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}

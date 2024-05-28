/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice;

import javax.annotation.Generated;

import com.amazonaws.services.vpclattice.model.*;

/**
 * Interface for accessing Amazon VPC Lattice asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.vpclattice.AbstractAmazonVPCLatticeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon VPC Lattice is a fully managed application networking service that you use to connect, secure, and monitor all
 * of your services across multiple accounts and virtual private clouds (VPCs). Amazon VPC Lattice interconnects your
 * microservices and legacy services within a logical boundary, so that you can discover and manage them more
 * efficiently. For more information, see the <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/">Amazon VPC
 * Lattice User Guide</a>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonVPCLatticeAsync extends AmazonVPCLattice {

    /**
     * <p>
     * Updates the listener rules in a batch. You can use this operation to change the priority of listener rules. This
     * can be useful when bulk updating or swapping rule priority.
     * </p>
     * <p>
     * <b>Required permissions:</b> <code>vpc-lattice:UpdateRule</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/security_iam_service-with-iam.html">How Amazon VPC
     * Lattice works with IAM</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param batchUpdateRuleRequest
     * @return A Java Future containing the result of the BatchUpdateRule operation returned by the service.
     * @sample AmazonVPCLatticeAsync.BatchUpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/BatchUpdateRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateRuleResult> batchUpdateRuleAsync(BatchUpdateRuleRequest batchUpdateRuleRequest);

    /**
     * <p>
     * Updates the listener rules in a batch. You can use this operation to change the priority of listener rules. This
     * can be useful when bulk updating or swapping rule priority.
     * </p>
     * <p>
     * <b>Required permissions:</b> <code>vpc-lattice:UpdateRule</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/security_iam_service-with-iam.html">How Amazon VPC
     * Lattice works with IAM</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param batchUpdateRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateRule operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.BatchUpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/BatchUpdateRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateRuleResult> batchUpdateRuleAsync(BatchUpdateRuleRequest batchUpdateRuleRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateRuleRequest, BatchUpdateRuleResult> asyncHandler);

    /**
     * <p>
     * Enables access logs to be sent to Amazon CloudWatch, Amazon S3, and Amazon Kinesis Data Firehose. The service
     * network owner can use the access logs to audit the services in the network. The service network owner can only
     * see access logs from clients and services that are associated with their service network. Access log entries
     * represent traffic originated from VPCs associated with that network. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/monitoring-access-logs.html">Access logs</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createAccessLogSubscriptionRequest
     * @return A Java Future containing the result of the CreateAccessLogSubscription operation returned by the service.
     * @sample AmazonVPCLatticeAsync.CreateAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessLogSubscriptionResult> createAccessLogSubscriptionAsync(
            CreateAccessLogSubscriptionRequest createAccessLogSubscriptionRequest);

    /**
     * <p>
     * Enables access logs to be sent to Amazon CloudWatch, Amazon S3, and Amazon Kinesis Data Firehose. The service
     * network owner can use the access logs to audit the services in the network. The service network owner can only
     * see access logs from clients and services that are associated with their service network. Access log entries
     * represent traffic originated from VPCs associated with that network. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/monitoring-access-logs.html">Access logs</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createAccessLogSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessLogSubscription operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.CreateAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessLogSubscriptionResult> createAccessLogSubscriptionAsync(
            CreateAccessLogSubscriptionRequest createAccessLogSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessLogSubscriptionRequest, CreateAccessLogSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates a listener for a service. Before you start using your Amazon VPC Lattice service, you must add one or
     * more listeners. A listener is a process that checks for connection requests to your services. For more
     * information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html">Listeners</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createListenerRequest
     * @return A Java Future containing the result of the CreateListener operation returned by the service.
     * @sample AmazonVPCLatticeAsync.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateListener" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest createListenerRequest);

    /**
     * <p>
     * Creates a listener for a service. Before you start using your Amazon VPC Lattice service, you must add one or
     * more listeners. A listener is a process that checks for connection requests to your services. For more
     * information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html">Listeners</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateListener operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateListener" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest createListenerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateListenerRequest, CreateListenerResult> asyncHandler);

    /**
     * <p>
     * Creates a listener rule. Each listener has a default rule for checking connection requests, but you can define
     * additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createRuleRequest
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonVPCLatticeAsync.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Creates a listener rule. Each listener has a default rule for checking connection requests, but you can define
     * additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a service. A service is any software application that can run on instances containers, or serverless
     * functions within an account or virtual private cloud (VPC).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/services.html">Services</a>
     * in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AmazonVPCLatticeAsync.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Creates a service. A service is any software application that can run on instances containers, or serverless
     * functions within an account or virtual private cloud (VPC).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/services.html">Services</a>
     * in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler);

    /**
     * <p>
     * Creates a service network. A service network is a logical boundary for a collection of services. You can
     * associate services and VPCs with a service network.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html">Service networks</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createServiceNetworkRequest
     * @return A Java Future containing the result of the CreateServiceNetwork operation returned by the service.
     * @sample AmazonVPCLatticeAsync.CreateServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceNetworkResult> createServiceNetworkAsync(CreateServiceNetworkRequest createServiceNetworkRequest);

    /**
     * <p>
     * Creates a service network. A service network is a logical boundary for a collection of services. You can
     * associate services and VPCs with a service network.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html">Service networks</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createServiceNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServiceNetwork operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.CreateServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceNetworkResult> createServiceNetworkAsync(CreateServiceNetworkRequest createServiceNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceNetworkRequest, CreateServiceNetworkResult> asyncHandler);

    /**
     * <p>
     * Associates a service with a service network. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-network-associations.html#service-network-service-associations"
     * >Manage service associations</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * <p>
     * You can't use this operation if the service and service network are already associated or if there is a
     * disassociation or deletion in progress. If the association fails, you can retry the operation by deleting the
     * association and recreating it.
     * </p>
     * <p>
     * You cannot associate a service and service network that are shared with a caller. The caller must own either the
     * service or the service network.
     * </p>
     * <p>
     * As a result of this operation, the association is created in the service network account and the association
     * owner account.
     * </p>
     * 
     * @param createServiceNetworkServiceAssociationRequest
     * @return A Java Future containing the result of the CreateServiceNetworkServiceAssociation operation returned by
     *         the service.
     * @sample AmazonVPCLatticeAsync.CreateServiceNetworkServiceAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceNetworkServiceAssociationResult> createServiceNetworkServiceAssociationAsync(
            CreateServiceNetworkServiceAssociationRequest createServiceNetworkServiceAssociationRequest);

    /**
     * <p>
     * Associates a service with a service network. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-network-associations.html#service-network-service-associations"
     * >Manage service associations</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * <p>
     * You can't use this operation if the service and service network are already associated or if there is a
     * disassociation or deletion in progress. If the association fails, you can retry the operation by deleting the
     * association and recreating it.
     * </p>
     * <p>
     * You cannot associate a service and service network that are shared with a caller. The caller must own either the
     * service or the service network.
     * </p>
     * <p>
     * As a result of this operation, the association is created in the service network account and the association
     * owner account.
     * </p>
     * 
     * @param createServiceNetworkServiceAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServiceNetworkServiceAssociation operation returned by
     *         the service.
     * @sample AmazonVPCLatticeAsyncHandler.CreateServiceNetworkServiceAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceNetworkServiceAssociationResult> createServiceNetworkServiceAssociationAsync(
            CreateServiceNetworkServiceAssociationRequest createServiceNetworkServiceAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceNetworkServiceAssociationRequest, CreateServiceNetworkServiceAssociationResult> asyncHandler);

    /**
     * <p>
     * Associates a VPC with a service network. When you associate a VPC with the service network, it enables all the
     * resources within that VPC to be clients and communicate with other services in the service network. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-network-associations.html#service-network-vpc-associations"
     * >Manage VPC associations</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * <p>
     * You can't use this operation if there is a disassociation in progress. If the association fails, retry by
     * deleting the association and recreating it.
     * </p>
     * <p>
     * As a result of this operation, the association gets created in the service network account and the VPC owner
     * account.
     * </p>
     * <p>
     * If you add a security group to the service network and VPC association, the association must continue to always
     * have at least one security group. You can add or edit security groups at any time. However, to remove all
     * security groups, you must first delete the association and recreate it without security groups.
     * </p>
     * 
     * @param createServiceNetworkVpcAssociationRequest
     * @return A Java Future containing the result of the CreateServiceNetworkVpcAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsync.CreateServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceNetworkVpcAssociationResult> createServiceNetworkVpcAssociationAsync(
            CreateServiceNetworkVpcAssociationRequest createServiceNetworkVpcAssociationRequest);

    /**
     * <p>
     * Associates a VPC with a service network. When you associate a VPC with the service network, it enables all the
     * resources within that VPC to be clients and communicate with other services in the service network. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-network-associations.html#service-network-vpc-associations"
     * >Manage VPC associations</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * <p>
     * You can't use this operation if there is a disassociation in progress. If the association fails, retry by
     * deleting the association and recreating it.
     * </p>
     * <p>
     * As a result of this operation, the association gets created in the service network account and the VPC owner
     * account.
     * </p>
     * <p>
     * If you add a security group to the service network and VPC association, the association must continue to always
     * have at least one security group. You can add or edit security groups at any time. However, to remove all
     * security groups, you must first delete the association and recreate it without security groups.
     * </p>
     * 
     * @param createServiceNetworkVpcAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServiceNetworkVpcAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsyncHandler.CreateServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceNetworkVpcAssociationResult> createServiceNetworkVpcAssociationAsync(
            CreateServiceNetworkVpcAssociationRequest createServiceNetworkVpcAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceNetworkVpcAssociationRequest, CreateServiceNetworkVpcAssociationResult> asyncHandler);

    /**
     * <p>
     * Creates a target group. A target group is a collection of targets, or compute resources, that run your
     * application or service. A target group can only be used by a single service.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html">Target
     * groups</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createTargetGroupRequest
     * @return A Java Future containing the result of the CreateTargetGroup operation returned by the service.
     * @sample AmazonVPCLatticeAsync.CreateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(CreateTargetGroupRequest createTargetGroupRequest);

    /**
     * <p>
     * Creates a target group. A target group is a collection of targets, or compute resources, that run your
     * application or service. A target group can only be used by a single service.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html">Target
     * groups</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createTargetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTargetGroup operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.CreateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(CreateTargetGroupRequest createTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTargetGroupRequest, CreateTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified access log subscription.
     * </p>
     * 
     * @param deleteAccessLogSubscriptionRequest
     * @return A Java Future containing the result of the DeleteAccessLogSubscription operation returned by the service.
     * @sample AmazonVPCLatticeAsync.DeleteAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessLogSubscriptionResult> deleteAccessLogSubscriptionAsync(
            DeleteAccessLogSubscriptionRequest deleteAccessLogSubscriptionRequest);

    /**
     * <p>
     * Deletes the specified access log subscription.
     * </p>
     * 
     * @param deleteAccessLogSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessLogSubscription operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessLogSubscriptionResult> deleteAccessLogSubscriptionAsync(
            DeleteAccessLogSubscriptionRequest deleteAccessLogSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessLogSubscriptionRequest, DeleteAccessLogSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified auth policy. If an auth is set to <code>AWS_IAM</code> and the auth policy is deleted, all
     * requests are denied. If you are trying to remove the auth policy completely, you must set the auth type to
     * <code>NONE</code>. If auth is enabled on the resource, but no auth policy is set, all requests are denied.
     * </p>
     * 
     * @param deleteAuthPolicyRequest
     * @return A Java Future containing the result of the DeleteAuthPolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsync.DeleteAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteAuthPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAuthPolicyResult> deleteAuthPolicyAsync(DeleteAuthPolicyRequest deleteAuthPolicyRequest);

    /**
     * <p>
     * Deletes the specified auth policy. If an auth is set to <code>AWS_IAM</code> and the auth policy is deleted, all
     * requests are denied. If you are trying to remove the auth policy completely, you must set the auth type to
     * <code>NONE</code>. If auth is enabled on the resource, but no auth policy is set, all requests are denied.
     * </p>
     * 
     * @param deleteAuthPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAuthPolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteAuthPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAuthPolicyResult> deleteAuthPolicyAsync(DeleteAuthPolicyRequest deleteAuthPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAuthPolicyRequest, DeleteAuthPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified listener.
     * </p>
     * 
     * @param deleteListenerRequest
     * @return A Java Future containing the result of the DeleteListener operation returned by the service.
     * @sample AmazonVPCLatticeAsync.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteListener" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest deleteListenerRequest);

    /**
     * <p>
     * Deletes the specified listener.
     * </p>
     * 
     * @param deleteListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteListener operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteListener" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest deleteListenerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteListenerRequest, DeleteListenerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes the specified resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a listener rule. Each listener has a default rule for checking connection requests, but you can define
     * additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. You can
     * delete additional listener rules, but you cannot delete the default rule.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonVPCLatticeAsync.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes a listener rule. Each listener has a default rule for checking connection requests, but you can define
     * additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. You can
     * delete additional listener rules, but you cannot delete the default rule.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param deleteRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a service. A service can't be deleted if it's associated with a service network. If you delete a service,
     * all resources related to the service, such as the resource policy, auth policy, listeners, listener rules, and
     * access log subscriptions, are also deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/services.html#delete-service">Delete a service</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AmazonVPCLatticeAsync.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest);

    /**
     * <p>
     * Deletes a service. A service can't be deleted if it's associated with a service network. If you delete a service,
     * all resources related to the service, such as the resource policy, auth policy, listeners, listener rules, and
     * access log subscriptions, are also deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/services.html#delete-service">Delete a service</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param deleteServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler);

    /**
     * <p>
     * Deletes a service network. You can only delete the service network if there is no service or VPC associated with
     * it. If you delete a service network, all resources related to the service network, such as the resource policy,
     * auth policy, and access log subscriptions, are also deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#delete-service-network">Delete a
     * service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param deleteServiceNetworkRequest
     * @return A Java Future containing the result of the DeleteServiceNetwork operation returned by the service.
     * @sample AmazonVPCLatticeAsync.DeleteServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceNetworkResult> deleteServiceNetworkAsync(DeleteServiceNetworkRequest deleteServiceNetworkRequest);

    /**
     * <p>
     * Deletes a service network. You can only delete the service network if there is no service or VPC associated with
     * it. If you delete a service network, all resources related to the service network, such as the resource policy,
     * auth policy, and access log subscriptions, are also deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#delete-service-network">Delete a
     * service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param deleteServiceNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServiceNetwork operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceNetworkResult> deleteServiceNetworkAsync(DeleteServiceNetworkRequest deleteServiceNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceNetworkRequest, DeleteServiceNetworkResult> asyncHandler);

    /**
     * <p>
     * Deletes the association between a specified service and the specific service network. This operation fails if an
     * association is still in progress.
     * </p>
     * 
     * @param deleteServiceNetworkServiceAssociationRequest
     * @return A Java Future containing the result of the DeleteServiceNetworkServiceAssociation operation returned by
     *         the service.
     * @sample AmazonVPCLatticeAsync.DeleteServiceNetworkServiceAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceNetworkServiceAssociationResult> deleteServiceNetworkServiceAssociationAsync(
            DeleteServiceNetworkServiceAssociationRequest deleteServiceNetworkServiceAssociationRequest);

    /**
     * <p>
     * Deletes the association between a specified service and the specific service network. This operation fails if an
     * association is still in progress.
     * </p>
     * 
     * @param deleteServiceNetworkServiceAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServiceNetworkServiceAssociation operation returned by
     *         the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteServiceNetworkServiceAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceNetworkServiceAssociationResult> deleteServiceNetworkServiceAssociationAsync(
            DeleteServiceNetworkServiceAssociationRequest deleteServiceNetworkServiceAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceNetworkServiceAssociationRequest, DeleteServiceNetworkServiceAssociationResult> asyncHandler);

    /**
     * <p>
     * Disassociates the VPC from the service network. You can't disassociate the VPC if there is a create or update
     * association in progress.
     * </p>
     * 
     * @param deleteServiceNetworkVpcAssociationRequest
     * @return A Java Future containing the result of the DeleteServiceNetworkVpcAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsync.DeleteServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceNetworkVpcAssociationResult> deleteServiceNetworkVpcAssociationAsync(
            DeleteServiceNetworkVpcAssociationRequest deleteServiceNetworkVpcAssociationRequest);

    /**
     * <p>
     * Disassociates the VPC from the service network. You can't disassociate the VPC if there is a create or update
     * association in progress.
     * </p>
     * 
     * @param deleteServiceNetworkVpcAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServiceNetworkVpcAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceNetworkVpcAssociationResult> deleteServiceNetworkVpcAssociationAsync(
            DeleteServiceNetworkVpcAssociationRequest deleteServiceNetworkVpcAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceNetworkVpcAssociationRequest, DeleteServiceNetworkVpcAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes a target group. You can't delete a target group if it is used in a listener rule or if the target group
     * creation is in progress.
     * </p>
     * 
     * @param deleteTargetGroupRequest
     * @return A Java Future containing the result of the DeleteTargetGroup operation returned by the service.
     * @sample AmazonVPCLatticeAsync.DeleteTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(DeleteTargetGroupRequest deleteTargetGroupRequest);

    /**
     * <p>
     * Deletes a target group. You can't delete a target group if it is used in a listener rule or if the target group
     * creation is in progress.
     * </p>
     * 
     * @param deleteTargetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTargetGroup operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeleteTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(DeleteTargetGroupRequest deleteTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTargetGroupRequest, DeleteTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Deregisters the specified targets from the specified target group.
     * </p>
     * 
     * @param deregisterTargetsRequest
     * @return A Java Future containing the result of the DeregisterTargets operation returned by the service.
     * @sample AmazonVPCLatticeAsync.DeregisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeregisterTargets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(DeregisterTargetsRequest deregisterTargetsRequest);

    /**
     * <p>
     * Deregisters the specified targets from the specified target group.
     * </p>
     * 
     * @param deregisterTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterTargets operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.DeregisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeregisterTargets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(DeregisterTargetsRequest deregisterTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTargetsRequest, DeregisterTargetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified access log subscription.
     * </p>
     * 
     * @param getAccessLogSubscriptionRequest
     * @return A Java Future containing the result of the GetAccessLogSubscription operation returned by the service.
     * @sample AmazonVPCLatticeAsync.GetAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessLogSubscriptionResult> getAccessLogSubscriptionAsync(GetAccessLogSubscriptionRequest getAccessLogSubscriptionRequest);

    /**
     * <p>
     * Retrieves information about the specified access log subscription.
     * </p>
     * 
     * @param getAccessLogSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessLogSubscription operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.GetAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessLogSubscriptionResult> getAccessLogSubscriptionAsync(GetAccessLogSubscriptionRequest getAccessLogSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessLogSubscriptionRequest, GetAccessLogSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the auth policy for the specified service or service network.
     * </p>
     * 
     * @param getAuthPolicyRequest
     * @return A Java Future containing the result of the GetAuthPolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsync.GetAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAuthPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAuthPolicyResult> getAuthPolicyAsync(GetAuthPolicyRequest getAuthPolicyRequest);

    /**
     * <p>
     * Retrieves information about the auth policy for the specified service or service network.
     * </p>
     * 
     * @param getAuthPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAuthPolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.GetAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAuthPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAuthPolicyResult> getAuthPolicyAsync(GetAuthPolicyRequest getAuthPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetAuthPolicyRequest, GetAuthPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified listener for the specified service.
     * </p>
     * 
     * @param getListenerRequest
     * @return A Java Future containing the result of the GetListener operation returned by the service.
     * @sample AmazonVPCLatticeAsync.GetListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetListener" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetListenerResult> getListenerAsync(GetListenerRequest getListenerRequest);

    /**
     * <p>
     * Retrieves information about the specified listener for the specified service.
     * </p>
     * 
     * @param getListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetListener operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.GetListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetListener" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetListenerResult> getListenerAsync(GetListenerRequest getListenerRequest,
            com.amazonaws.handlers.AsyncHandler<GetListenerRequest, GetListenerResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the resource policy. The resource policy is an IAM policy created on behalf of the
     * resource owner when they share a resource.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsync.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Retrieves information about the resource policy. The resource policy is an IAM policy created on behalf of the
     * resource owner when they share a resource.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about listener rules. You can also retrieve information about the default listener rule.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param getRuleRequest
     * @return A Java Future containing the result of the GetRule operation returned by the service.
     * @sample AmazonVPCLatticeAsync.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest getRuleRequest);

    /**
     * <p>
     * Retrieves information about listener rules. You can also retrieve information about the default listener rule.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param getRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRule operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest getRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetRuleRequest, GetRuleResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified service.
     * </p>
     * 
     * @param getServiceRequest
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AmazonVPCLatticeAsync.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Retrieves information about the specified service.
     * </p>
     * 
     * @param getServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified service network.
     * </p>
     * 
     * @param getServiceNetworkRequest
     * @return A Java Future containing the result of the GetServiceNetwork operation returned by the service.
     * @sample AmazonVPCLatticeAsync.GetServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceNetworkResult> getServiceNetworkAsync(GetServiceNetworkRequest getServiceNetworkRequest);

    /**
     * <p>
     * Retrieves information about the specified service network.
     * </p>
     * 
     * @param getServiceNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceNetwork operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.GetServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceNetworkResult> getServiceNetworkAsync(GetServiceNetworkRequest getServiceNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceNetworkRequest, GetServiceNetworkResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified association between a service network and a service.
     * </p>
     * 
     * @param getServiceNetworkServiceAssociationRequest
     * @return A Java Future containing the result of the GetServiceNetworkServiceAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsync.GetServiceNetworkServiceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceNetworkServiceAssociationResult> getServiceNetworkServiceAssociationAsync(
            GetServiceNetworkServiceAssociationRequest getServiceNetworkServiceAssociationRequest);

    /**
     * <p>
     * Retrieves information about the specified association between a service network and a service.
     * </p>
     * 
     * @param getServiceNetworkServiceAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceNetworkServiceAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsyncHandler.GetServiceNetworkServiceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceNetworkServiceAssociationResult> getServiceNetworkServiceAssociationAsync(
            GetServiceNetworkServiceAssociationRequest getServiceNetworkServiceAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceNetworkServiceAssociationRequest, GetServiceNetworkServiceAssociationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the association between a service network and a VPC.
     * </p>
     * 
     * @param getServiceNetworkVpcAssociationRequest
     * @return A Java Future containing the result of the GetServiceNetworkVpcAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsync.GetServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceNetworkVpcAssociationResult> getServiceNetworkVpcAssociationAsync(
            GetServiceNetworkVpcAssociationRequest getServiceNetworkVpcAssociationRequest);

    /**
     * <p>
     * Retrieves information about the association between a service network and a VPC.
     * </p>
     * 
     * @param getServiceNetworkVpcAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceNetworkVpcAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsyncHandler.GetServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceNetworkVpcAssociationResult> getServiceNetworkVpcAssociationAsync(
            GetServiceNetworkVpcAssociationRequest getServiceNetworkVpcAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceNetworkVpcAssociationRequest, GetServiceNetworkVpcAssociationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified target group.
     * </p>
     * 
     * @param getTargetGroupRequest
     * @return A Java Future containing the result of the GetTargetGroup operation returned by the service.
     * @sample AmazonVPCLatticeAsync.GetTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetTargetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTargetGroupResult> getTargetGroupAsync(GetTargetGroupRequest getTargetGroupRequest);

    /**
     * <p>
     * Retrieves information about the specified target group.
     * </p>
     * 
     * @param getTargetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTargetGroup operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.GetTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetTargetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTargetGroupResult> getTargetGroupAsync(GetTargetGroupRequest getTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetTargetGroupRequest, GetTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Lists all access log subscriptions for the specified service network or service.
     * </p>
     * 
     * @param listAccessLogSubscriptionsRequest
     * @return A Java Future containing the result of the ListAccessLogSubscriptions operation returned by the service.
     * @sample AmazonVPCLatticeAsync.ListAccessLogSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListAccessLogSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessLogSubscriptionsResult> listAccessLogSubscriptionsAsync(
            ListAccessLogSubscriptionsRequest listAccessLogSubscriptionsRequest);

    /**
     * <p>
     * Lists all access log subscriptions for the specified service network or service.
     * </p>
     * 
     * @param listAccessLogSubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessLogSubscriptions operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.ListAccessLogSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListAccessLogSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessLogSubscriptionsResult> listAccessLogSubscriptionsAsync(
            ListAccessLogSubscriptionsRequest listAccessLogSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessLogSubscriptionsRequest, ListAccessLogSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Lists the listeners for the specified service.
     * </p>
     * 
     * @param listListenersRequest
     * @return A Java Future containing the result of the ListListeners operation returned by the service.
     * @sample AmazonVPCLatticeAsync.ListListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListListeners" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListListenersResult> listListenersAsync(ListListenersRequest listListenersRequest);

    /**
     * <p>
     * Lists the listeners for the specified service.
     * </p>
     * 
     * @param listListenersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListListeners operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.ListListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListListeners" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListListenersResult> listListenersAsync(ListListenersRequest listListenersRequest,
            com.amazonaws.handlers.AsyncHandler<ListListenersRequest, ListListenersResult> asyncHandler);

    /**
     * <p>
     * Lists the rules for the listener.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonVPCLatticeAsync.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Lists the rules for the listener.
     * </p>
     * 
     * @param listRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the associations between the service network and the service. You can filter the list either by service or
     * service network. You must provide either the service network identifier or the service identifier.
     * </p>
     * <p>
     * Every association in Amazon VPC Lattice is given a unique Amazon Resource Name (ARN), such as when a service
     * network is associated with a VPC or when a service is associated with a service network. If the association is
     * for a resource that is shared with another account, the association includes the local account ID as the prefix
     * in the ARN for each account the resource is shared with.
     * </p>
     * 
     * @param listServiceNetworkServiceAssociationsRequest
     * @return A Java Future containing the result of the ListServiceNetworkServiceAssociations operation returned by
     *         the service.
     * @sample AmazonVPCLatticeAsync.ListServiceNetworkServiceAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworkServiceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceNetworkServiceAssociationsResult> listServiceNetworkServiceAssociationsAsync(
            ListServiceNetworkServiceAssociationsRequest listServiceNetworkServiceAssociationsRequest);

    /**
     * <p>
     * Lists the associations between the service network and the service. You can filter the list either by service or
     * service network. You must provide either the service network identifier or the service identifier.
     * </p>
     * <p>
     * Every association in Amazon VPC Lattice is given a unique Amazon Resource Name (ARN), such as when a service
     * network is associated with a VPC or when a service is associated with a service network. If the association is
     * for a resource that is shared with another account, the association includes the local account ID as the prefix
     * in the ARN for each account the resource is shared with.
     * </p>
     * 
     * @param listServiceNetworkServiceAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceNetworkServiceAssociations operation returned by
     *         the service.
     * @sample AmazonVPCLatticeAsyncHandler.ListServiceNetworkServiceAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworkServiceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceNetworkServiceAssociationsResult> listServiceNetworkServiceAssociationsAsync(
            ListServiceNetworkServiceAssociationsRequest listServiceNetworkServiceAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceNetworkServiceAssociationsRequest, ListServiceNetworkServiceAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists the service network and VPC associations. You can filter the list either by VPC or service network. You
     * must provide either the service network identifier or the VPC identifier.
     * </p>
     * 
     * @param listServiceNetworkVpcAssociationsRequest
     * @return A Java Future containing the result of the ListServiceNetworkVpcAssociations operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsync.ListServiceNetworkVpcAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworkVpcAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceNetworkVpcAssociationsResult> listServiceNetworkVpcAssociationsAsync(
            ListServiceNetworkVpcAssociationsRequest listServiceNetworkVpcAssociationsRequest);

    /**
     * <p>
     * Lists the service network and VPC associations. You can filter the list either by VPC or service network. You
     * must provide either the service network identifier or the VPC identifier.
     * </p>
     * 
     * @param listServiceNetworkVpcAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceNetworkVpcAssociations operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsyncHandler.ListServiceNetworkVpcAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworkVpcAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceNetworkVpcAssociationsResult> listServiceNetworkVpcAssociationsAsync(
            ListServiceNetworkVpcAssociationsRequest listServiceNetworkVpcAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceNetworkVpcAssociationsRequest, ListServiceNetworkVpcAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists the service networks owned by the caller account or shared with the caller account. Also includes the
     * account ID in the ARN to show which account owns the service network.
     * </p>
     * 
     * @param listServiceNetworksRequest
     * @return A Java Future containing the result of the ListServiceNetworks operation returned by the service.
     * @sample AmazonVPCLatticeAsync.ListServiceNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceNetworksResult> listServiceNetworksAsync(ListServiceNetworksRequest listServiceNetworksRequest);

    /**
     * <p>
     * Lists the service networks owned by the caller account or shared with the caller account. Also includes the
     * account ID in the ARN to show which account owns the service network.
     * </p>
     * 
     * @param listServiceNetworksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceNetworks operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.ListServiceNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceNetworksResult> listServiceNetworksAsync(ListServiceNetworksRequest listServiceNetworksRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceNetworksRequest, ListServiceNetworksResult> asyncHandler);

    /**
     * <p>
     * Lists the services owned by the caller account or shared with the caller account.
     * </p>
     * 
     * @param listServicesRequest
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AmazonVPCLatticeAsync.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Lists the services owned by the caller account or shared with the caller account.
     * </p>
     * 
     * @param listServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonVPCLatticeAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists your target groups. You can narrow your search by using the filters below in your request.
     * </p>
     * 
     * @param listTargetGroupsRequest
     * @return A Java Future containing the result of the ListTargetGroups operation returned by the service.
     * @sample AmazonVPCLatticeAsync.ListTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTargetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetGroupsResult> listTargetGroupsAsync(ListTargetGroupsRequest listTargetGroupsRequest);

    /**
     * <p>
     * Lists your target groups. You can narrow your search by using the filters below in your request.
     * </p>
     * 
     * @param listTargetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargetGroups operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.ListTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTargetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetGroupsResult> listTargetGroupsAsync(ListTargetGroupsRequest listTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetGroupsRequest, ListTargetGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the targets for the target group. By default, all targets are included. You can use this API to check the
     * health status of targets. You can also ﬁlter the results by target.
     * </p>
     * 
     * @param listTargetsRequest
     * @return A Java Future containing the result of the ListTargets operation returned by the service.
     * @sample AmazonVPCLatticeAsync.ListTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(ListTargetsRequest listTargetsRequest);

    /**
     * <p>
     * Lists the targets for the target group. By default, all targets are included. You can use this API to check the
     * health status of targets. You can also ﬁlter the results by target.
     * </p>
     * 
     * @param listTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargets operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.ListTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(ListTargetsRequest listTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetsRequest, ListTargetsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the auth policy. The policy string in JSON must not contain newlines or blank lines.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/auth-policies.html">Auth
     * policies</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param putAuthPolicyRequest
     * @return A Java Future containing the result of the PutAuthPolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsync.PutAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PutAuthPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutAuthPolicyResult> putAuthPolicyAsync(PutAuthPolicyRequest putAuthPolicyRequest);

    /**
     * <p>
     * Creates or updates the auth policy. The policy string in JSON must not contain newlines or blank lines.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/auth-policies.html">Auth
     * policies</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param putAuthPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAuthPolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.PutAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PutAuthPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutAuthPolicyResult> putAuthPolicyAsync(PutAuthPolicyRequest putAuthPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutAuthPolicyRequest, PutAuthPolicyResult> asyncHandler);

    /**
     * <p>
     * Attaches a resource-based permission policy to a service or service network. The policy must contain the same
     * actions and condition statements as the Amazon Web Services Resource Access Manager permission for sharing
     * services and service networks.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Attaches a resource-based permission policy to a service or service network. The policy must contain the same
     * actions and condition statements as the Amazon Web Services Resource Access Manager permission for sharing
     * services and service networks.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Registers the targets with the target group. If it's a Lambda target, you can only have one target in a target
     * group.
     * </p>
     * 
     * @param registerTargetsRequest
     * @return A Java Future containing the result of the RegisterTargets operation returned by the service.
     * @sample AmazonVPCLatticeAsync.RegisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/RegisterTargets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(RegisterTargetsRequest registerTargetsRequest);

    /**
     * <p>
     * Registers the targets with the target group. If it's a Lambda target, you can only have one target in a target
     * group.
     * </p>
     * 
     * @param registerTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterTargets operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.RegisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/RegisterTargets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(RegisterTargetsRequest registerTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTargetsRequest, RegisterTargetsResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonVPCLatticeAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonVPCLatticeAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified access log subscription.
     * </p>
     * 
     * @param updateAccessLogSubscriptionRequest
     * @return A Java Future containing the result of the UpdateAccessLogSubscription operation returned by the service.
     * @sample AmazonVPCLatticeAsync.UpdateAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessLogSubscriptionResult> updateAccessLogSubscriptionAsync(
            UpdateAccessLogSubscriptionRequest updateAccessLogSubscriptionRequest);

    /**
     * <p>
     * Updates the specified access log subscription.
     * </p>
     * 
     * @param updateAccessLogSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccessLogSubscription operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.UpdateAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessLogSubscriptionResult> updateAccessLogSubscriptionAsync(
            UpdateAccessLogSubscriptionRequest updateAccessLogSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccessLogSubscriptionRequest, UpdateAccessLogSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Updates the specified listener for the specified service.
     * </p>
     * 
     * @param updateListenerRequest
     * @return A Java Future containing the result of the UpdateListener operation returned by the service.
     * @sample AmazonVPCLatticeAsync.UpdateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateListener" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateListenerResult> updateListenerAsync(UpdateListenerRequest updateListenerRequest);

    /**
     * <p>
     * Updates the specified listener for the specified service.
     * </p>
     * 
     * @param updateListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateListener operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.UpdateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateListener" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateListenerResult> updateListenerAsync(UpdateListenerRequest updateListenerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateListenerRequest, UpdateListenerResult> asyncHandler);

    /**
     * <p>
     * Updates a rule for the listener. You can't modify a default listener rule. To modify a default listener rule, use
     * <code>UpdateListener</code>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AmazonVPCLatticeAsync.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest);

    /**
     * <p>
     * Updates a rule for the listener. You can't modify a default listener rule. To modify a default listener rule, use
     * <code>UpdateListener</code>.
     * </p>
     * 
     * @param updateRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleRequest, UpdateRuleResult> asyncHandler);

    /**
     * <p>
     * Updates the specified service.
     * </p>
     * 
     * @param updateServiceRequest
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AmazonVPCLatticeAsync.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest);

    /**
     * <p>
     * Updates the specified service.
     * </p>
     * 
     * @param updateServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified service network.
     * </p>
     * 
     * @param updateServiceNetworkRequest
     * @return A Java Future containing the result of the UpdateServiceNetwork operation returned by the service.
     * @sample AmazonVPCLatticeAsync.UpdateServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceNetworkResult> updateServiceNetworkAsync(UpdateServiceNetworkRequest updateServiceNetworkRequest);

    /**
     * <p>
     * Updates the specified service network.
     * </p>
     * 
     * @param updateServiceNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceNetwork operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.UpdateServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceNetworkResult> updateServiceNetworkAsync(UpdateServiceNetworkRequest updateServiceNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceNetworkRequest, UpdateServiceNetworkResult> asyncHandler);

    /**
     * <p>
     * Updates the service network and VPC association. If you add a security group to the service network and VPC
     * association, the association must continue to always have at least one security group. You can add or edit
     * security groups at any time. However, to remove all security groups, you must first delete the association and
     * recreate it without security groups.
     * </p>
     * 
     * @param updateServiceNetworkVpcAssociationRequest
     * @return A Java Future containing the result of the UpdateServiceNetworkVpcAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsync.UpdateServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceNetworkVpcAssociationResult> updateServiceNetworkVpcAssociationAsync(
            UpdateServiceNetworkVpcAssociationRequest updateServiceNetworkVpcAssociationRequest);

    /**
     * <p>
     * Updates the service network and VPC association. If you add a security group to the service network and VPC
     * association, the association must continue to always have at least one security group. You can add or edit
     * security groups at any time. However, to remove all security groups, you must first delete the association and
     * recreate it without security groups.
     * </p>
     * 
     * @param updateServiceNetworkVpcAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceNetworkVpcAssociation operation returned by the
     *         service.
     * @sample AmazonVPCLatticeAsyncHandler.UpdateServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceNetworkVpcAssociationResult> updateServiceNetworkVpcAssociationAsync(
            UpdateServiceNetworkVpcAssociationRequest updateServiceNetworkVpcAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceNetworkVpcAssociationRequest, UpdateServiceNetworkVpcAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates the specified target group.
     * </p>
     * 
     * @param updateTargetGroupRequest
     * @return A Java Future containing the result of the UpdateTargetGroup operation returned by the service.
     * @sample AmazonVPCLatticeAsync.UpdateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTargetGroupResult> updateTargetGroupAsync(UpdateTargetGroupRequest updateTargetGroupRequest);

    /**
     * <p>
     * Updates the specified target group.
     * </p>
     * 
     * @param updateTargetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTargetGroup operation returned by the service.
     * @sample AmazonVPCLatticeAsyncHandler.UpdateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTargetGroupResult> updateTargetGroupAsync(UpdateTargetGroupRequest updateTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTargetGroupRequest, UpdateTargetGroupResult> asyncHandler);

}

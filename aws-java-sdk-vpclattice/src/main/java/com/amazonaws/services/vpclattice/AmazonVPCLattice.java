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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.vpclattice.model.*;

/**
 * Interface for accessing Amazon VPC Lattice.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.vpclattice.AbstractAmazonVPCLattice} instead.
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
public interface AmazonVPCLattice {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "vpc-lattice";

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
     * @return Result of the BatchUpdateRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.BatchUpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/BatchUpdateRule" target="_top">AWS
     *      API Documentation</a>
     */
    BatchUpdateRuleResult batchUpdateRule(BatchUpdateRuleRequest batchUpdateRuleRequest);

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
     * @return Result of the CreateAccessLogSubscription operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAccessLogSubscriptionResult createAccessLogSubscription(CreateAccessLogSubscriptionRequest createAccessLogSubscriptionRequest);

    /**
     * <p>
     * Creates a listener for a service. Before you start using your Amazon VPC Lattice service, you must add one or
     * more listeners. A listener is a process that checks for connection requests to your services. For more
     * information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html">Listeners</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createListenerRequest
     * @return Result of the CreateListener operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateListener" target="_top">AWS API
     *      Documentation</a>
     */
    CreateListenerResult createListener(CreateListenerRequest createListenerRequest);

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
     * @return Result of the CreateRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRuleResult createRule(CreateRuleRequest createRuleRequest);

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
     * @return Result of the CreateService operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    CreateServiceResult createService(CreateServiceRequest createServiceRequest);

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
     * @return Result of the CreateServiceNetwork operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    CreateServiceNetworkResult createServiceNetwork(CreateServiceNetworkRequest createServiceNetworkRequest);

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
     * @return Result of the CreateServiceNetworkServiceAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateServiceNetworkServiceAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateServiceNetworkServiceAssociationResult createServiceNetworkServiceAssociation(
            CreateServiceNetworkServiceAssociationRequest createServiceNetworkServiceAssociationRequest);

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
     * @return Result of the CreateServiceNetworkVpcAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateServiceNetworkVpcAssociationResult createServiceNetworkVpcAssociation(
            CreateServiceNetworkVpcAssociationRequest createServiceNetworkVpcAssociationRequest);

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
     * @return Result of the CreateTargetGroup operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTargetGroupResult createTargetGroup(CreateTargetGroupRequest createTargetGroupRequest);

    /**
     * <p>
     * Deletes the specified access log subscription.
     * </p>
     * 
     * @param deleteAccessLogSubscriptionRequest
     * @return Result of the DeleteAccessLogSubscription operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAccessLogSubscriptionResult deleteAccessLogSubscription(DeleteAccessLogSubscriptionRequest deleteAccessLogSubscriptionRequest);

    /**
     * <p>
     * Deletes the specified auth policy. If an auth is set to <code>AWS_IAM</code> and the auth policy is deleted, all
     * requests are denied. If you are trying to remove the auth policy completely, you must set the auth type to
     * <code>NONE</code>. If auth is enabled on the resource, but no auth policy is set, all requests are denied.
     * </p>
     * 
     * @param deleteAuthPolicyRequest
     * @return Result of the DeleteAuthPolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteAuthPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAuthPolicyResult deleteAuthPolicy(DeleteAuthPolicyRequest deleteAuthPolicyRequest);

    /**
     * <p>
     * Deletes the specified listener.
     * </p>
     * 
     * @param deleteListenerRequest
     * @return Result of the DeleteListener operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteListener" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteListenerResult deleteListener(DeleteListenerRequest deleteListenerRequest);

    /**
     * <p>
     * Deletes the specified resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

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
     * @return Result of the DeleteRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest);

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
     * @return Result of the DeleteService operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest);

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
     * @return Result of the DeleteServiceNetwork operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteServiceNetworkResult deleteServiceNetwork(DeleteServiceNetworkRequest deleteServiceNetworkRequest);

    /**
     * <p>
     * Deletes the association between a specified service and the specific service network. This operation fails if an
     * association is still in progress.
     * </p>
     * 
     * @param deleteServiceNetworkServiceAssociationRequest
     * @return Result of the DeleteServiceNetworkServiceAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteServiceNetworkServiceAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteServiceNetworkServiceAssociationResult deleteServiceNetworkServiceAssociation(
            DeleteServiceNetworkServiceAssociationRequest deleteServiceNetworkServiceAssociationRequest);

    /**
     * <p>
     * Disassociates the VPC from the service network. You can't disassociate the VPC if there is a create or update
     * association in progress.
     * </p>
     * 
     * @param deleteServiceNetworkVpcAssociationRequest
     * @return Result of the DeleteServiceNetworkVpcAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteServiceNetworkVpcAssociationResult deleteServiceNetworkVpcAssociation(
            DeleteServiceNetworkVpcAssociationRequest deleteServiceNetworkVpcAssociationRequest);

    /**
     * <p>
     * Deletes a target group. You can't delete a target group if it is used in a listener rule or if the target group
     * creation is in progress.
     * </p>
     * 
     * @param deleteTargetGroupRequest
     * @return Result of the DeleteTargetGroup operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTargetGroupResult deleteTargetGroup(DeleteTargetGroupRequest deleteTargetGroupRequest);

    /**
     * <p>
     * Deregisters the specified targets from the specified target group.
     * </p>
     * 
     * @param deregisterTargetsRequest
     * @return Result of the DeregisterTargets operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeregisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeregisterTargets" target="_top">AWS
     *      API Documentation</a>
     */
    DeregisterTargetsResult deregisterTargets(DeregisterTargetsRequest deregisterTargetsRequest);

    /**
     * <p>
     * Retrieves information about the specified access log subscription.
     * </p>
     * 
     * @param getAccessLogSubscriptionRequest
     * @return Result of the GetAccessLogSubscription operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    GetAccessLogSubscriptionResult getAccessLogSubscription(GetAccessLogSubscriptionRequest getAccessLogSubscriptionRequest);

    /**
     * <p>
     * Retrieves information about the auth policy for the specified service or service network.
     * </p>
     * 
     * @param getAuthPolicyRequest
     * @return Result of the GetAuthPolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAuthPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetAuthPolicyResult getAuthPolicy(GetAuthPolicyRequest getAuthPolicyRequest);

    /**
     * <p>
     * Retrieves information about the specified listener for the specified service.
     * </p>
     * 
     * @param getListenerRequest
     * @return Result of the GetListener operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetListener" target="_top">AWS API
     *      Documentation</a>
     */
    GetListenerResult getListener(GetListenerRequest getListenerRequest);

    /**
     * <p>
     * Retrieves information about the resource policy. The resource policy is an IAM policy created on behalf of the
     * resource owner when they share a resource.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Retrieves information about listener rules. You can also retrieve information about the default listener rule.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param getRuleRequest
     * @return Result of the GetRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    GetRuleResult getRule(GetRuleRequest getRuleRequest);

    /**
     * <p>
     * Retrieves information about the specified service.
     * </p>
     * 
     * @param getServiceRequest
     * @return Result of the GetService operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetService" target="_top">AWS API
     *      Documentation</a>
     */
    GetServiceResult getService(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Retrieves information about the specified service network.
     * </p>
     * 
     * @param getServiceNetworkRequest
     * @return Result of the GetServiceNetwork operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    GetServiceNetworkResult getServiceNetwork(GetServiceNetworkRequest getServiceNetworkRequest);

    /**
     * <p>
     * Retrieves information about the specified association between a service network and a service.
     * </p>
     * 
     * @param getServiceNetworkServiceAssociationRequest
     * @return Result of the GetServiceNetworkServiceAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetServiceNetworkServiceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetServiceNetworkServiceAssociationResult getServiceNetworkServiceAssociation(
            GetServiceNetworkServiceAssociationRequest getServiceNetworkServiceAssociationRequest);

    /**
     * <p>
     * Retrieves information about the association between a service network and a VPC.
     * </p>
     * 
     * @param getServiceNetworkVpcAssociationRequest
     * @return Result of the GetServiceNetworkVpcAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetServiceNetworkVpcAssociationResult getServiceNetworkVpcAssociation(GetServiceNetworkVpcAssociationRequest getServiceNetworkVpcAssociationRequest);

    /**
     * <p>
     * Retrieves information about the specified target group.
     * </p>
     * 
     * @param getTargetGroupRequest
     * @return Result of the GetTargetGroup operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetTargetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetTargetGroupResult getTargetGroup(GetTargetGroupRequest getTargetGroupRequest);

    /**
     * <p>
     * Lists all access log subscriptions for the specified service network or service.
     * </p>
     * 
     * @param listAccessLogSubscriptionsRequest
     * @return Result of the ListAccessLogSubscriptions operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListAccessLogSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListAccessLogSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccessLogSubscriptionsResult listAccessLogSubscriptions(ListAccessLogSubscriptionsRequest listAccessLogSubscriptionsRequest);

    /**
     * <p>
     * Lists the listeners for the specified service.
     * </p>
     * 
     * @param listListenersRequest
     * @return Result of the ListListeners operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListListeners" target="_top">AWS API
     *      Documentation</a>
     */
    ListListenersResult listListeners(ListListenersRequest listListenersRequest);

    /**
     * <p>
     * Lists the rules for the listener.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    ListRulesResult listRules(ListRulesRequest listRulesRequest);

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
     * @return Result of the ListServiceNetworkServiceAssociations operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListServiceNetworkServiceAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworkServiceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListServiceNetworkServiceAssociationsResult listServiceNetworkServiceAssociations(
            ListServiceNetworkServiceAssociationsRequest listServiceNetworkServiceAssociationsRequest);

    /**
     * <p>
     * Lists the service network and VPC associations. You can filter the list either by VPC or service network. You
     * must provide either the service network identifier or the VPC identifier.
     * </p>
     * 
     * @param listServiceNetworkVpcAssociationsRequest
     * @return Result of the ListServiceNetworkVpcAssociations operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListServiceNetworkVpcAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworkVpcAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListServiceNetworkVpcAssociationsResult listServiceNetworkVpcAssociations(ListServiceNetworkVpcAssociationsRequest listServiceNetworkVpcAssociationsRequest);

    /**
     * <p>
     * Lists the service networks owned by the caller account or shared with the caller account. Also includes the
     * account ID in the ARN to show which account owns the service network.
     * </p>
     * 
     * @param listServiceNetworksRequest
     * @return Result of the ListServiceNetworks operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListServiceNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    ListServiceNetworksResult listServiceNetworks(ListServiceNetworksRequest listServiceNetworksRequest);

    /**
     * <p>
     * Lists the services owned by the caller account or shared with the caller account.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    ListServicesResult listServices(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists your target groups. You can narrow your search by using the filters below in your request.
     * </p>
     * 
     * @param listTargetGroupsRequest
     * @return Result of the ListTargetGroups operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTargetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListTargetGroupsResult listTargetGroups(ListTargetGroupsRequest listTargetGroupsRequest);

    /**
     * <p>
     * Lists the targets for the target group. By default, all targets are included. You can use this API to check the
     * health status of targets. You can also ﬁlter the results by target.
     * </p>
     * 
     * @param listTargetsRequest
     * @return Result of the ListTargets operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTargets" target="_top">AWS API
     *      Documentation</a>
     */
    ListTargetsResult listTargets(ListTargetsRequest listTargetsRequest);

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
     * @return Result of the PutAuthPolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.PutAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PutAuthPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutAuthPolicyResult putAuthPolicy(PutAuthPolicyRequest putAuthPolicyRequest);

    /**
     * <p>
     * Attaches a resource-based permission policy to a service or service network. The policy must contain the same
     * actions and condition statements as the Amazon Web Services Resource Access Manager permission for sharing
     * services and service networks.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Registers the targets with the target group. If it's a Lambda target, you can only have one target in a target
     * group.
     * </p>
     * 
     * @param registerTargetsRequest
     * @return Result of the RegisterTargets operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.RegisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/RegisterTargets" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterTargetsResult registerTargets(RegisterTargetsRequest registerTargetsRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified access log subscription.
     * </p>
     * 
     * @param updateAccessLogSubscriptionRequest
     * @return Result of the UpdateAccessLogSubscription operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccessLogSubscriptionResult updateAccessLogSubscription(UpdateAccessLogSubscriptionRequest updateAccessLogSubscriptionRequest);

    /**
     * <p>
     * Updates the specified listener for the specified service.
     * </p>
     * 
     * @param updateListenerRequest
     * @return Result of the UpdateListener operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateListener" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateListenerResult updateListener(UpdateListenerRequest updateListenerRequest);

    /**
     * <p>
     * Updates a rule for the listener. You can't modify a default listener rule. To modify a default listener rule, use
     * <code>UpdateListener</code>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return Result of the UpdateRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRuleResult updateRule(UpdateRuleRequest updateRuleRequest);

    /**
     * <p>
     * Updates the specified service.
     * </p>
     * 
     * @param updateServiceRequest
     * @return Result of the UpdateService operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest);

    /**
     * <p>
     * Updates the specified service network.
     * </p>
     * 
     * @param updateServiceNetworkRequest
     * @return Result of the UpdateServiceNetwork operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateServiceNetworkResult updateServiceNetwork(UpdateServiceNetworkRequest updateServiceNetworkRequest);

    /**
     * <p>
     * Updates the service network and VPC association. If you add a security group to the service network and VPC
     * association, the association must continue to always have at least one security group. You can add or edit
     * security groups at any time. However, to remove all security groups, you must first delete the association and
     * recreate it without security groups.
     * </p>
     * 
     * @param updateServiceNetworkVpcAssociationRequest
     * @return Result of the UpdateServiceNetworkVpcAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateServiceNetworkVpcAssociationResult updateServiceNetworkVpcAssociation(
            UpdateServiceNetworkVpcAssociationRequest updateServiceNetworkVpcAssociationRequest);

    /**
     * <p>
     * Updates the specified target group.
     * </p>
     * 
     * @param updateTargetGroupRequest
     * @return Result of the UpdateTargetGroup operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateTargetGroupResult updateTargetGroup(UpdateTargetGroupRequest updateTargetGroupRequest);

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

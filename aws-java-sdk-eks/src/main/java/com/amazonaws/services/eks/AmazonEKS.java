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
package com.amazonaws.services.eks;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.services.eks.waiters.AmazonEKSWaiters;

/**
 * Interface for accessing Amazon EKS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.eks.AbstractAmazonEKS} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Elastic Container Service for Kubernetes (Amazon EKS) is a managed service that makes it easy for you to run
 * Kubernetes on AWS without needing to stand up or maintain your own Kubernetes control plane. Kubernetes is an
 * open-source system for automating the deployment, scaling, and management of containerized applications.
 * </p>
 * <p>
 * Amazon EKS runs up-to-date versions of the open-source Kubernetes software, so you can use all the existing plugins
 * and tooling from the Kubernetes community. Applications running on Amazon EKS are fully compatible with applications
 * running on any standard Kubernetes environment, whether running in on-premises data centers or public clouds. This
 * means that you can easily migrate any standard Kubernetes application to Amazon EKS without any code modification
 * required.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonEKS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "eks";

    /**
     * <p>
     * Creates an Amazon EKS control plane.
     * </p>
     * <p>
     * The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like
     * <code>etcd</code> and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API
     * is exposed via the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is single-tenant and
     * unique, and runs on its own set of Amazon EC2 instances.
     * </p>
     * <p>
     * The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load
     * Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to
     * provide connectivity from the control plane instances to the worker nodes (for example, to support
     * <code>kubectl exec</code>, <code>logs</code>, and <code>proxy</code> data flows).
     * </p>
     * <p>
     * Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes
     * API server endpoint and a certificate file that is created for your cluster.
     * </p>
     * <p>
     * You can use the <code>endpointPublicAccess</code> and <code>endpointPrivateAccess</code> parameters to enable or
     * disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is
     * enabled and private access is disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * You can use the <code>logging</code> parameter to enable or disable exporting the Kubernetes control plane logs
     * for your cluster to CloudWatch Logs. By default, cluster control plane logs are not exported to CloudWatch Logs.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS Cluster Control Plane
     * Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * </note>
     * <p>
     * Cluster creation typically takes between 10 and 15 minutes. After you create an Amazon EKS cluster, you must
     * configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster.
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/managing-auth.html">Managing
     * Cluster Authentication</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html">Launching Amazon EKS Worker Nodes</a>
     * in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @throws UnsupportedAvailabilityZoneException
     *         At least one of your specified cluster subnets is in an Availability Zone that does not support Amazon
     *         EKS. The exception output specifies the supported Availability Zones for your account, from which you can
     *         choose subnets for your cluster.
     * @sample AmazonEKS.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Deletes the Amazon EKS cluster control plane.
     * </p>
     * <note>
     * <p>
     * If you have active services in your cluster that are associated with a load balancer, you must delete those
     * services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have
     * orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/delete-cluster.html">Deleting a Cluster</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Returns descriptive information about an Amazon EKS cluster.
     * </p>
     * <p>
     * The API server endpoint and certificate authority data returned by this operation are required for
     * <code>kubelet</code> and <code>kubectl</code> to communicate with your Kubernetes API server. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/create-kubeconfig.html">Create a
     * kubeconfig for Amazon EKS</a>.
     * </p>
     * <note>
     * <p>
     * The API server endpoint and certificate authority data are not available until the cluster reaches the
     * <code>ACTIVE</code> state.
     * </p>
     * </note>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * Returns descriptive information about an update against your Amazon EKS cluster.
     * </p>
     * <p>
     * When the status of the update is <code>Succeeded</code>, the update is complete. If an update fails, the status
     * is <code>Failed</code>, and an error detail explains the reason for the failure.
     * </p>
     * 
     * @param describeUpdateRequest
     * @return Result of the DescribeUpdate operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @sample AmazonEKS.DescribeUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeUpdate" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUpdateResult describeUpdate(DescribeUpdateRequest describeUpdateRequest);

    /**
     * <p>
     * Lists the Amazon EKS clusters in your AWS account in the specified Region.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.
     * </p>
     * 
     * @param listUpdatesRequest
     * @return Result of the ListUpdates operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @sample AmazonEKS.ListUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListUpdates" target="_top">AWS API
     *      Documentation</a>
     */
    ListUpdatesResult listUpdates(ListUpdatesRequest listUpdatesRequest);

    /**
     * <p>
     * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response
     * output includes an update ID that you can use to track the status of your cluster update with the
     * <a>DescribeUpdate</a> API operation.
     * </p>
     * <p>
     * You can use this API operation to enable or disable public and private access to your cluster's Kubernetes API
     * server endpoint. By default, public access is enabled and private access is disabled. For more information, see
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     * Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * You can also use this API operation to enable or disable exporting the Kubernetes control plane logs for your
     * cluster to CloudWatch Logs. By default, cluster control plane logs are not exported to CloudWatch Logs. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS
     * Cluster Control Plane Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * </note>
     * <p>
     * Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster
     * status moves to <code>UPDATING</code> (this status transition is eventually consistent). When the update is
     * complete (either <code>Failed</code> or <code>Successful</code>), the cluster status moves to <code>Active</code>
     * .
     * </p>
     * 
     * @param updateClusterConfigRequest
     * @return Result of the UpdateClusterConfig operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateClusterConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterConfig" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateClusterConfigResult updateClusterConfig(UpdateClusterConfigRequest updateClusterConfigRequest);

    /**
     * <p>
     * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the
     * update. The response output includes an update ID that you can use to track the status of your cluster update
     * with the <a>DescribeUpdate</a> API operation.
     * </p>
     * <p>
     * Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster
     * status moves to <code>UPDATING</code> (this status transition is eventually consistent). When the update is
     * complete (either <code>Failed</code> or <code>Successful</code>), the cluster status moves to <code>Active</code>
     * .
     * </p>
     * 
     * @param updateClusterVersionRequest
     * @return Result of the UpdateClusterVersion operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateClusterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterVersion" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateClusterVersionResult updateClusterVersion(UpdateClusterVersionRequest updateClusterVersionRequest);

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

    AmazonEKSWaiters waiters();

}

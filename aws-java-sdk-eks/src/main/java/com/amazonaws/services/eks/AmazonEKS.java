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
 * Amazon Elastic Kubernetes Service (Amazon EKS) is a managed service that makes it easy for you to run Kubernetes on
 * AWS without needing to stand up or maintain your own Kubernetes control plane. Kubernetes is an open-source system
 * for automating the deployment, scaling, and management of containerized applications.
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
     * The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, such as
     * <code>etcd</code> and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API
     * is exposed via the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is single-tenant and
     * unique and runs on its own set of Amazon EC2 instances.
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
     * enabled, and private access is disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * You can use the <code>logging</code> parameter to enable or disable exporting the Kubernetes control plane logs
     * for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs.
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
     * Creates an AWS Fargate profile for your Amazon EKS cluster. You must have at least one Fargate profile in a
     * cluster to be able to run pods on Fargate.
     * </p>
     * <p>
     * The Fargate profile allows an administrator to declare which pods run on Fargate and specify which pods run on
     * which Fargate profile. This declaration is done through the profile’s selectors. Each profile can have up to five
     * selectors that contain a namespace and labels. A namespace is required for every selector. The label field
     * consists of multiple optional key-value pairs. Pods that match the selectors are scheduled on Fargate. If a
     * to-be-scheduled pod matches any of the selectors in the Fargate profile, then that pod is run on Fargate.
     * </p>
     * <p>
     * When you create a Fargate profile, you must specify a pod execution role to use with the pods that are scheduled
     * with the profile. This role is added to the cluster's Kubernetes <a
     * href="https://kubernetes.io/docs/admin/authorization/rbac/">Role Based Access Control</a> (RBAC) for
     * authorization so that the <code>kubelet</code> that is running on the Fargate infrastructure can register with
     * your Amazon EKS cluster so that it can appear in your cluster as a node. The pod execution role also provides IAM
     * permissions to the Fargate infrastructure to allow read access to Amazon ECR image repositories. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution
     * Role</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * Fargate profiles are immutable. However, you can create a new updated profile to replace an existing profile and
     * then delete the original after the updated profile has finished creating.
     * </p>
     * <p>
     * If any Fargate profiles in a cluster are in the <code>DELETING</code> status, you must wait for that Fargate
     * profile to finish deleting before you can create any other profiles in that cluster.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/fargate-profile.html">AWS
     * Fargate Profile</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param createFargateProfileRequest
     * @return Result of the CreateFargateProfile operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws UnsupportedAvailabilityZoneException
     *         At least one of your specified cluster subnets is in an Availability Zone that does not support Amazon
     *         EKS. The exception output specifies the supported Availability Zones for your account, from which you can
     *         choose subnets for your cluster.
     * @sample AmazonEKS.CreateFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFargateProfileResult createFargateProfile(CreateFargateProfileRequest createFargateProfileRequest);

    /**
     * <p>
     * Creates a managed worker node group for an Amazon EKS cluster. You can only create a node group for your cluster
     * that is equal to the current Kubernetes version for the cluster. All node groups are created with the latest AMI
     * release version for the respective minor Kubernetes version of the cluster.
     * </p>
     * <p>
     * An Amazon EKS managed node group is an Amazon EC2 Auto Scaling group and associated Amazon EC2 instances that are
     * managed by AWS for an Amazon EKS cluster. Each node group uses a version of the Amazon EKS-optimized Amazon Linux
     * 2 AMI. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html">Managed Node Groups</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param createNodegroupRequest
     * @return Result of the CreateNodegroup operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
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
     * @sample AmazonEKS.CreateNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNodegroupResult createNodegroup(CreateNodegroupRequest createNodegroupRequest);

    /**
     * <p>
     * Deletes the Amazon EKS cluster control plane.
     * </p>
     * <p>
     * If you have active services in your cluster that are associated with a load balancer, you must delete those
     * services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have
     * orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/delete-cluster.html">Deleting a Cluster</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * If you have managed node groups or Fargate profiles attached to the cluster, you must delete them first. For more
     * information, see <a>DeleteNodegroup</a> and<a>DeleteFargateProfile</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * Deletes an AWS Fargate profile.
     * </p>
     * <p>
     * When you delete a Fargate profile, any pods running on Fargate that were created with the profile are deleted. If
     * those pods match another Fargate profile, then they are scheduled on Fargate with that profile. If they no longer
     * match any Fargate profiles, then they are not scheduled on Fargate and they may remain in a pending state.
     * </p>
     * <p>
     * Only one Fargate profile in a cluster can be in the <code>DELETING</code> status at a time. You must wait for a
     * Fargate profile to finish deleting before you can delete any other profiles in that cluster.
     * </p>
     * 
     * @param deleteFargateProfileRequest
     * @return Result of the DeleteFargateProfile operation returned by the service.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @sample AmazonEKS.DeleteFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFargateProfileResult deleteFargateProfile(DeleteFargateProfileRequest deleteFargateProfileRequest);

    /**
     * <p>
     * Deletes an Amazon EKS node group for a cluster.
     * </p>
     * 
     * @param deleteNodegroupRequest
     * @return Result of the DeleteNodegroup operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * @sample AmazonEKS.DeleteNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNodegroupResult deleteNodegroup(DeleteNodegroupRequest deleteNodegroupRequest);

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
     * The API server endpoint and certificate authority data aren't available until the cluster reaches the
     * <code>ACTIVE</code> state.
     * </p>
     * </note>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * Returns descriptive information about an AWS Fargate profile.
     * </p>
     * 
     * @param describeFargateProfileRequest
     * @return Result of the DescribeFargateProfile operation returned by the service.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @sample AmazonEKS.DescribeFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFargateProfileResult describeFargateProfile(DescribeFargateProfileRequest describeFargateProfileRequest);

    /**
     * <p>
     * Returns descriptive information about an Amazon EKS node group.
     * </p>
     * 
     * @param describeNodegroupRequest
     * @return Result of the DescribeNodegroup operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.DescribeNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeNodegroupResult describeNodegroup(DescribeNodegroupRequest describeNodegroupRequest);

    /**
     * <p>
     * Returns descriptive information about an update against your Amazon EKS cluster or associated managed node group.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * Lists the AWS Fargate profiles associated with the specified cluster in your AWS account in the specified Region.
     * </p>
     * 
     * @param listFargateProfilesRequest
     * @return Result of the ListFargateProfiles operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonEKS.ListFargateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListFargateProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    ListFargateProfilesResult listFargateProfiles(ListFargateProfilesRequest listFargateProfilesRequest);

    /**
     * <p>
     * Lists the Amazon EKS node groups associated with the specified cluster in your AWS account in the specified
     * Region.
     * </p>
     * 
     * @param listNodegroupsRequest
     * @return Result of the ListNodegroups operation returned by the service.
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
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @sample AmazonEKS.ListNodegroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListNodegroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListNodegroupsResult listNodegroups(ListNodegroupsRequest listNodegroupsRequest);

    /**
     * <p>
     * List the tags for an Amazon EKS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         This exception is thrown if the request contains a semantic error. The precise meaning will depend on the
     *         API, and will be documented in the error message.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonEKS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the updates associated with an Amazon EKS cluster or managed node group in your AWS account, in the
     * specified Region.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @sample AmazonEKS.ListUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListUpdates" target="_top">AWS API
     *      Documentation</a>
     */
    ListUpdatesResult listUpdates(ListUpdatesRequest listUpdatesRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
     * associated with that resource are deleted as well. Tags that you create for Amazon EKS resources do not propagate
     * to any other resources associated with the cluster. For example, if you tag a cluster with this operation, that
     * tag does not automatically propagate to the subnets and worker nodes associated with the cluster.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         This exception is thrown if the request contains a semantic error. The precise meaning will depend on the
     *         API, and will be documented in the error message.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonEKS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         This exception is thrown if the request contains a semantic error. The precise meaning will depend on the
     *         API, and will be documented in the error message.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonEKS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response
     * output includes an update ID that you can use to track the status of your cluster update with the
     * <a>DescribeUpdate</a> API operation.
     * </p>
     * <p>
     * You can use this API operation to enable or disable exporting the Kubernetes control plane logs for your cluster
     * to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more
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
     * You can also use this API operation to enable or disable public and private access to your cluster's Kubernetes
     * API server endpoint. By default, public access is enabled, and private access is disabled. For more information,
     * see <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     * Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * At this time, you can not update the subnets or security group IDs for an existing cluster.
     * </p>
     * </important>
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * <p>
     * If your cluster has managed node groups attached to it, all of your node groups’ Kubernetes versions must match
     * the cluster’s Kubernetes version in order to update the cluster to a new Kubernetes version.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateClusterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterVersion" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateClusterVersionResult updateClusterVersion(UpdateClusterVersionRequest updateClusterVersionRequest);

    /**
     * <p>
     * Updates an Amazon EKS managed node group configuration. Your node group continues to function during the update.
     * The response output includes an update ID that you can use to track the status of your node group update with the
     * <a>DescribeUpdate</a> API operation. Currently you can update the Kubernetes labels for a node group or the
     * scaling configuration.
     * </p>
     * 
     * @param updateNodegroupConfigRequest
     * @return Result of the UpdateNodegroupConfig operation returned by the service.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateNodegroupConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupConfig" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateNodegroupConfigResult updateNodegroupConfig(UpdateNodegroupConfigRequest updateNodegroupConfigRequest);

    /**
     * <p>
     * Updates the Kubernetes version or AMI version of an Amazon EKS managed node group.
     * </p>
     * <p>
     * You can update to the latest available AMI version of a node group's current Kubernetes version by not specifying
     * a Kubernetes version in the request. You can update to the latest AMI version of your cluster's current
     * Kubernetes version by specifying your cluster's Kubernetes version in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * You cannot roll back a node group to an earlier Kubernetes version or AMI version.
     * </p>
     * <p>
     * When a node in a managed node group is terminated due to a scaling action or update, the pods in that node are
     * drained first. Amazon EKS attempts to drain the nodes gracefully and will fail if it is unable to do so. You can
     * <code>force</code> the update if Amazon EKS is unable to drain the nodes as a result of a pod disruption budget
     * issue.
     * </p>
     * 
     * @param updateNodegroupVersionRequest
     * @return Result of the UpdateNodegroupVersion operation returned by the service.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateNodegroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupVersion" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateNodegroupVersionResult updateNodegroupVersion(UpdateNodegroupVersionRequest updateNodegroupVersionRequest);

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

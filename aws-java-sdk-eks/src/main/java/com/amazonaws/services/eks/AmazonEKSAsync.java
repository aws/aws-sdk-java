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

import com.amazonaws.services.eks.model.*;

/**
 * Interface for accessing Amazon EKS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.eks.AbstractAmazonEKSAsync} instead.
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
public interface AmazonEKSAsync extends AmazonEKS {

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
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonEKSAsync.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonEKSAsyncHandler.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateFargateProfile operation returned by the service.
     * @sample AmazonEKSAsync.CreateFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFargateProfileResult> createFargateProfileAsync(CreateFargateProfileRequest createFargateProfileRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFargateProfile operation returned by the service.
     * @sample AmazonEKSAsyncHandler.CreateFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFargateProfileResult> createFargateProfileAsync(CreateFargateProfileRequest createFargateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFargateProfileRequest, CreateFargateProfileResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateNodegroup operation returned by the service.
     * @sample AmazonEKSAsync.CreateNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNodegroupResult> createNodegroupAsync(CreateNodegroupRequest createNodegroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNodegroup operation returned by the service.
     * @sample AmazonEKSAsyncHandler.CreateNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNodegroupResult> createNodegroupAsync(CreateNodegroupRequest createNodegroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNodegroupRequest, CreateNodegroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonEKSAsync.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteFargateProfile operation returned by the service.
     * @sample AmazonEKSAsync.DeleteFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFargateProfileResult> deleteFargateProfileAsync(DeleteFargateProfileRequest deleteFargateProfileRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFargateProfile operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DeleteFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFargateProfileResult> deleteFargateProfileAsync(DeleteFargateProfileRequest deleteFargateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFargateProfileRequest, DeleteFargateProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon EKS node group for a cluster.
     * </p>
     * 
     * @param deleteNodegroupRequest
     * @return A Java Future containing the result of the DeleteNodegroup operation returned by the service.
     * @sample AmazonEKSAsync.DeleteNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNodegroupResult> deleteNodegroupAsync(DeleteNodegroupRequest deleteNodegroupRequest);

    /**
     * <p>
     * Deletes an Amazon EKS node group for a cluster.
     * </p>
     * 
     * @param deleteNodegroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNodegroup operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DeleteNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNodegroupResult> deleteNodegroupAsync(DeleteNodegroupRequest deleteNodegroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNodegroupRequest, DeleteNodegroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AmazonEKSAsync.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler);

    /**
     * <p>
     * Returns descriptive information about an AWS Fargate profile.
     * </p>
     * 
     * @param describeFargateProfileRequest
     * @return A Java Future containing the result of the DescribeFargateProfile operation returned by the service.
     * @sample AmazonEKSAsync.DescribeFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFargateProfileResult> describeFargateProfileAsync(DescribeFargateProfileRequest describeFargateProfileRequest);

    /**
     * <p>
     * Returns descriptive information about an AWS Fargate profile.
     * </p>
     * 
     * @param describeFargateProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFargateProfile operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DescribeFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFargateProfileResult> describeFargateProfileAsync(DescribeFargateProfileRequest describeFargateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFargateProfileRequest, DescribeFargateProfileResult> asyncHandler);

    /**
     * <p>
     * Returns descriptive information about an Amazon EKS node group.
     * </p>
     * 
     * @param describeNodegroupRequest
     * @return A Java Future containing the result of the DescribeNodegroup operation returned by the service.
     * @sample AmazonEKSAsync.DescribeNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeNodegroupResult> describeNodegroupAsync(DescribeNodegroupRequest describeNodegroupRequest);

    /**
     * <p>
     * Returns descriptive information about an Amazon EKS node group.
     * </p>
     * 
     * @param describeNodegroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNodegroup operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DescribeNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeNodegroupResult> describeNodegroupAsync(DescribeNodegroupRequest describeNodegroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNodegroupRequest, DescribeNodegroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeUpdate operation returned by the service.
     * @sample AmazonEKSAsync.DescribeUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeUpdate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUpdateResult> describeUpdateAsync(DescribeUpdateRequest describeUpdateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUpdate operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DescribeUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeUpdate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUpdateResult> describeUpdateAsync(DescribeUpdateRequest describeUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUpdateRequest, DescribeUpdateResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon EKS clusters in your AWS account in the specified Region.
     * </p>
     * 
     * @param listClustersRequest
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonEKSAsync.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Lists the Amazon EKS clusters in your AWS account in the specified Region.
     * </p>
     * 
     * @param listClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler);

    /**
     * <p>
     * Lists the AWS Fargate profiles associated with the specified cluster in your AWS account in the specified Region.
     * </p>
     * 
     * @param listFargateProfilesRequest
     * @return A Java Future containing the result of the ListFargateProfiles operation returned by the service.
     * @sample AmazonEKSAsync.ListFargateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListFargateProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFargateProfilesResult> listFargateProfilesAsync(ListFargateProfilesRequest listFargateProfilesRequest);

    /**
     * <p>
     * Lists the AWS Fargate profiles associated with the specified cluster in your AWS account in the specified Region.
     * </p>
     * 
     * @param listFargateProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFargateProfiles operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListFargateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListFargateProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFargateProfilesResult> listFargateProfilesAsync(ListFargateProfilesRequest listFargateProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFargateProfilesRequest, ListFargateProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon EKS node groups associated with the specified cluster in your AWS account in the specified
     * Region.
     * </p>
     * 
     * @param listNodegroupsRequest
     * @return A Java Future containing the result of the ListNodegroups operation returned by the service.
     * @sample AmazonEKSAsync.ListNodegroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListNodegroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNodegroupsResult> listNodegroupsAsync(ListNodegroupsRequest listNodegroupsRequest);

    /**
     * <p>
     * Lists the Amazon EKS node groups associated with the specified cluster in your AWS account in the specified
     * Region.
     * </p>
     * 
     * @param listNodegroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNodegroups operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListNodegroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListNodegroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNodegroupsResult> listNodegroupsAsync(ListNodegroupsRequest listNodegroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNodegroupsRequest, ListNodegroupsResult> asyncHandler);

    /**
     * <p>
     * List the tags for an Amazon EKS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonEKSAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List the tags for an Amazon EKS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the updates associated with an Amazon EKS cluster or managed node group in your AWS account, in the
     * specified Region.
     * </p>
     * 
     * @param listUpdatesRequest
     * @return A Java Future containing the result of the ListUpdates operation returned by the service.
     * @sample AmazonEKSAsync.ListUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListUpdates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUpdatesResult> listUpdatesAsync(ListUpdatesRequest listUpdatesRequest);

    /**
     * <p>
     * Lists the updates associated with an Amazon EKS cluster or managed node group in your AWS account, in the
     * specified Region.
     * </p>
     * 
     * @param listUpdatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUpdates operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListUpdates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUpdatesResult> listUpdatesAsync(ListUpdatesRequest listUpdatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListUpdatesRequest, ListUpdatesResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonEKSAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonEKSAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonEKSAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonEKSAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateClusterConfig operation returned by the service.
     * @sample AmazonEKSAsync.UpdateClusterConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterConfigResult> updateClusterConfigAsync(UpdateClusterConfigRequest updateClusterConfigRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateClusterConfig operation returned by the service.
     * @sample AmazonEKSAsyncHandler.UpdateClusterConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterConfigResult> updateClusterConfigAsync(UpdateClusterConfigRequest updateClusterConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterConfigRequest, UpdateClusterConfigResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateClusterVersion operation returned by the service.
     * @sample AmazonEKSAsync.UpdateClusterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterVersionResult> updateClusterVersionAsync(UpdateClusterVersionRequest updateClusterVersionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateClusterVersion operation returned by the service.
     * @sample AmazonEKSAsyncHandler.UpdateClusterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterVersionResult> updateClusterVersionAsync(UpdateClusterVersionRequest updateClusterVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterVersionRequest, UpdateClusterVersionResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon EKS managed node group configuration. Your node group continues to function during the update.
     * The response output includes an update ID that you can use to track the status of your node group update with the
     * <a>DescribeUpdate</a> API operation. Currently you can update the Kubernetes labels for a node group or the
     * scaling configuration.
     * </p>
     * 
     * @param updateNodegroupConfigRequest
     * @return A Java Future containing the result of the UpdateNodegroupConfig operation returned by the service.
     * @sample AmazonEKSAsync.UpdateNodegroupConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateNodegroupConfigResult> updateNodegroupConfigAsync(UpdateNodegroupConfigRequest updateNodegroupConfigRequest);

    /**
     * <p>
     * Updates an Amazon EKS managed node group configuration. Your node group continues to function during the update.
     * The response output includes an update ID that you can use to track the status of your node group update with the
     * <a>DescribeUpdate</a> API operation. Currently you can update the Kubernetes labels for a node group or the
     * scaling configuration.
     * </p>
     * 
     * @param updateNodegroupConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNodegroupConfig operation returned by the service.
     * @sample AmazonEKSAsyncHandler.UpdateNodegroupConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateNodegroupConfigResult> updateNodegroupConfigAsync(UpdateNodegroupConfigRequest updateNodegroupConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNodegroupConfigRequest, UpdateNodegroupConfigResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateNodegroupVersion operation returned by the service.
     * @sample AmazonEKSAsync.UpdateNodegroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateNodegroupVersionResult> updateNodegroupVersionAsync(UpdateNodegroupVersionRequest updateNodegroupVersionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNodegroupVersion operation returned by the service.
     * @sample AmazonEKSAsyncHandler.UpdateNodegroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateNodegroupVersionResult> updateNodegroupVersionAsync(UpdateNodegroupVersionRequest updateNodegroupVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNodegroupVersionRequest, UpdateNodegroupVersionResult> asyncHandler);

}

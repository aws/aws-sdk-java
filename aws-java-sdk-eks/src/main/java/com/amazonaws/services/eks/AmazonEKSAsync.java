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
 * Amazon Web Services without needing to setup or maintain your own Kubernetes control plane. Kubernetes is an
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
public interface AmazonEKSAsync extends AmazonEKS {

    /**
     * <p>
     * Associates an access policy and its scope to an access entry. For more information about associating access
     * policies, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/access-policies.html">Associating and
     * disassociating access policies to and from access entries</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param associateAccessPolicyRequest
     * @return A Java Future containing the result of the AssociateAccessPolicy operation returned by the service.
     * @sample AmazonEKSAsync.AssociateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateAccessPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateAccessPolicyResult> associateAccessPolicyAsync(AssociateAccessPolicyRequest associateAccessPolicyRequest);

    /**
     * <p>
     * Associates an access policy and its scope to an access entry. For more information about associating access
     * policies, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/access-policies.html">Associating and
     * disassociating access policies to and from access entries</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param associateAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAccessPolicy operation returned by the service.
     * @sample AmazonEKSAsyncHandler.AssociateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateAccessPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateAccessPolicyResult> associateAccessPolicyAsync(AssociateAccessPolicyRequest associateAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAccessPolicyRequest, AssociateAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Associates an encryption configuration to an existing cluster.
     * </p>
     * <p>
     * Use this API to enable encryption on existing clusters that don't already have encryption enabled. This allows
     * you to implement a defense-in-depth security strategy without migrating applications to new Amazon EKS clusters.
     * </p>
     * 
     * @param associateEncryptionConfigRequest
     * @return A Java Future containing the result of the AssociateEncryptionConfig operation returned by the service.
     * @sample AmazonEKSAsync.AssociateEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateEncryptionConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateEncryptionConfigResult> associateEncryptionConfigAsync(
            AssociateEncryptionConfigRequest associateEncryptionConfigRequest);

    /**
     * <p>
     * Associates an encryption configuration to an existing cluster.
     * </p>
     * <p>
     * Use this API to enable encryption on existing clusters that don't already have encryption enabled. This allows
     * you to implement a defense-in-depth security strategy without migrating applications to new Amazon EKS clusters.
     * </p>
     * 
     * @param associateEncryptionConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateEncryptionConfig operation returned by the service.
     * @sample AmazonEKSAsyncHandler.AssociateEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateEncryptionConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateEncryptionConfigResult> associateEncryptionConfigAsync(
            AssociateEncryptionConfigRequest associateEncryptionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateEncryptionConfigRequest, AssociateEncryptionConfigResult> asyncHandler);

    /**
     * <p>
     * Associates an identity provider configuration to a cluster.
     * </p>
     * <p>
     * If you want to authenticate identities using an identity provider, you can create an identity provider
     * configuration and associate it to your cluster. After configuring authentication to your cluster you can create
     * Kubernetes <code>Role</code> and <code>ClusterRole</code> objects, assign permissions to them, and then bind them
     * to the identities using Kubernetes <code>RoleBinding</code> and <code>ClusterRoleBinding</code> objects. For more
     * information see <a href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC
     * Authorization</a> in the Kubernetes documentation.
     * </p>
     * 
     * @param associateIdentityProviderConfigRequest
     * @return A Java Future containing the result of the AssociateIdentityProviderConfig operation returned by the
     *         service.
     * @sample AmazonEKSAsync.AssociateIdentityProviderConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateIdentityProviderConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateIdentityProviderConfigResult> associateIdentityProviderConfigAsync(
            AssociateIdentityProviderConfigRequest associateIdentityProviderConfigRequest);

    /**
     * <p>
     * Associates an identity provider configuration to a cluster.
     * </p>
     * <p>
     * If you want to authenticate identities using an identity provider, you can create an identity provider
     * configuration and associate it to your cluster. After configuring authentication to your cluster you can create
     * Kubernetes <code>Role</code> and <code>ClusterRole</code> objects, assign permissions to them, and then bind them
     * to the identities using Kubernetes <code>RoleBinding</code> and <code>ClusterRoleBinding</code> objects. For more
     * information see <a href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC
     * Authorization</a> in the Kubernetes documentation.
     * </p>
     * 
     * @param associateIdentityProviderConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateIdentityProviderConfig operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.AssociateIdentityProviderConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateIdentityProviderConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateIdentityProviderConfigResult> associateIdentityProviderConfigAsync(
            AssociateIdentityProviderConfigRequest associateIdentityProviderConfigRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateIdentityProviderConfigRequest, AssociateIdentityProviderConfigResult> asyncHandler);

    /**
     * <p>
     * Creates an access entry.
     * </p>
     * <p>
     * An access entry allows an IAM principal to access your cluster. Access entries can replace the need to maintain
     * entries in the <code>aws-auth</code> <code>ConfigMap</code> for authentication. You have the following options
     * for authorizing an IAM principal to access Kubernetes objects on your cluster: Kubernetes role-based access
     * control (RBAC), Amazon EKS, or both. Kubernetes RBAC authorization requires you to create and manage Kubernetes
     * <code>Role</code>, <code>ClusterRole</code>, <code>RoleBinding</code>, and <code>ClusterRoleBinding</code>
     * objects, in addition to managing access entries. If you use Amazon EKS authorization exclusively, you don't need
     * to create and manage Kubernetes <code>Role</code>, <code>ClusterRole</code>, <code>RoleBinding</code>, and
     * <code>ClusterRoleBinding</code> objects.
     * </p>
     * <p>
     * For more information about access entries, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html">Access entries</a> in the <i>Amazon
     * EKS User Guide</i>.
     * </p>
     * 
     * @param createAccessEntryRequest
     * @return A Java Future containing the result of the CreateAccessEntry operation returned by the service.
     * @sample AmazonEKSAsync.CreateAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessEntryResult> createAccessEntryAsync(CreateAccessEntryRequest createAccessEntryRequest);

    /**
     * <p>
     * Creates an access entry.
     * </p>
     * <p>
     * An access entry allows an IAM principal to access your cluster. Access entries can replace the need to maintain
     * entries in the <code>aws-auth</code> <code>ConfigMap</code> for authentication. You have the following options
     * for authorizing an IAM principal to access Kubernetes objects on your cluster: Kubernetes role-based access
     * control (RBAC), Amazon EKS, or both. Kubernetes RBAC authorization requires you to create and manage Kubernetes
     * <code>Role</code>, <code>ClusterRole</code>, <code>RoleBinding</code>, and <code>ClusterRoleBinding</code>
     * objects, in addition to managing access entries. If you use Amazon EKS authorization exclusively, you don't need
     * to create and manage Kubernetes <code>Role</code>, <code>ClusterRole</code>, <code>RoleBinding</code>, and
     * <code>ClusterRoleBinding</code> objects.
     * </p>
     * <p>
     * For more information about access entries, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html">Access entries</a> in the <i>Amazon
     * EKS User Guide</i>.
     * </p>
     * 
     * @param createAccessEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessEntry operation returned by the service.
     * @sample AmazonEKSAsyncHandler.CreateAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessEntryResult> createAccessEntryAsync(CreateAccessEntryRequest createAccessEntryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessEntryRequest, CreateAccessEntryResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon EKS add-on.
     * </p>
     * <p>
     * Amazon EKS add-ons help to automate the provisioning and lifecycle management of common operational software for
     * Amazon EKS clusters. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-add-ons.html">Amazon EKS add-ons</a> in the <i>Amazon
     * EKS User Guide</i>.
     * </p>
     * 
     * @param createAddonRequest
     * @return A Java Future containing the result of the CreateAddon operation returned by the service.
     * @sample AmazonEKSAsync.CreateAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateAddon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAddonResult> createAddonAsync(CreateAddonRequest createAddonRequest);

    /**
     * <p>
     * Creates an Amazon EKS add-on.
     * </p>
     * <p>
     * Amazon EKS add-ons help to automate the provisioning and lifecycle management of common operational software for
     * Amazon EKS clusters. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-add-ons.html">Amazon EKS add-ons</a> in the <i>Amazon
     * EKS User Guide</i>.
     * </p>
     * 
     * @param createAddonRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAddon operation returned by the service.
     * @sample AmazonEKSAsyncHandler.CreateAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateAddon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAddonResult> createAddonAsync(CreateAddonRequest createAddonRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAddonRequest, CreateAddonResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon EKS control plane.
     * </p>
     * <p>
     * The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, such as
     * <code>etcd</code> and the API server. The control plane runs in an account managed by Amazon Web Services, and
     * the Kubernetes API is exposed by the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is
     * single tenant and unique. It runs on its own set of Amazon EC2 instances.
     * </p>
     * <p>
     * The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load
     * Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to
     * provide connectivity from the control plane instances to the nodes (for example, to support
     * <code>kubectl exec</code>, <code>logs</code>, and <code>proxy</code> data flows).
     * </p>
     * <p>
     * Amazon EKS nodes run in your Amazon Web Services account and connect to your cluster's control plane over the
     * Kubernetes API server endpoint and a certificate file that is created for your cluster.
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
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">CloudWatch Pricing</a>.
     * </p>
     * </note>
     * <p>
     * In most cases, it takes several minutes to create a cluster. After you create an Amazon EKS cluster, you must
     * configure your Kubernetes tooling to communicate with the API server and launch nodes into your cluster. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/managing-auth.html">Managing Cluster
     * Authentication</a> and <a href="https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html">Launching
     * Amazon EKS nodes</a> in the <i>Amazon EKS User Guide</i>.
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
     * <code>etcd</code> and the API server. The control plane runs in an account managed by Amazon Web Services, and
     * the Kubernetes API is exposed by the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is
     * single tenant and unique. It runs on its own set of Amazon EC2 instances.
     * </p>
     * <p>
     * The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load
     * Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to
     * provide connectivity from the control plane instances to the nodes (for example, to support
     * <code>kubectl exec</code>, <code>logs</code>, and <code>proxy</code> data flows).
     * </p>
     * <p>
     * Amazon EKS nodes run in your Amazon Web Services account and connect to your cluster's control plane over the
     * Kubernetes API server endpoint and a certificate file that is created for your cluster.
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
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">CloudWatch Pricing</a>.
     * </p>
     * </note>
     * <p>
     * In most cases, it takes several minutes to create a cluster. After you create an Amazon EKS cluster, you must
     * configure your Kubernetes tooling to communicate with the API server and launch nodes into your cluster. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/managing-auth.html">Managing Cluster
     * Authentication</a> and <a href="https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html">Launching
     * Amazon EKS nodes</a> in the <i>Amazon EKS User Guide</i>.
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
     * Creates an EKS Anywhere subscription. When a subscription is created, it is a contract agreement for the length
     * of the term specified in the request. Licenses that are used to validate support are provisioned in Amazon Web
     * Services License Manager and the caller account is granted access to EKS Anywhere Curated Packages.
     * </p>
     * 
     * @param createEksAnywhereSubscriptionRequest
     * @return A Java Future containing the result of the CreateEksAnywhereSubscription operation returned by the
     *         service.
     * @sample AmazonEKSAsync.CreateEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEksAnywhereSubscriptionResult> createEksAnywhereSubscriptionAsync(
            CreateEksAnywhereSubscriptionRequest createEksAnywhereSubscriptionRequest);

    /**
     * <p>
     * Creates an EKS Anywhere subscription. When a subscription is created, it is a contract agreement for the length
     * of the term specified in the request. Licenses that are used to validate support are provisioned in Amazon Web
     * Services License Manager and the caller account is granted access to EKS Anywhere Curated Packages.
     * </p>
     * 
     * @param createEksAnywhereSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEksAnywhereSubscription operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.CreateEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEksAnywhereSubscriptionResult> createEksAnywhereSubscriptionAsync(
            CreateEksAnywhereSubscriptionRequest createEksAnywhereSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEksAnywhereSubscriptionRequest, CreateEksAnywhereSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates an Fargate profile for your Amazon EKS cluster. You must have at least one Fargate profile in a cluster
     * to be able to run pods on Fargate.
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
     * href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Role Based Access Control</a> (RBAC) for
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
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/fargate-profile.html">Fargate
     * profile</a> in the <i>Amazon EKS User Guide</i>.
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
     * Creates an Fargate profile for your Amazon EKS cluster. You must have at least one Fargate profile in a cluster
     * to be able to run pods on Fargate.
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
     * href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Role Based Access Control</a> (RBAC) for
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
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/fargate-profile.html">Fargate
     * profile</a> in the <i>Amazon EKS User Guide</i>.
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
     * Creates a managed node group for an Amazon EKS cluster.
     * </p>
     * <p>
     * You can only create a node group for your cluster that is equal to the current Kubernetes version for the
     * cluster. All node groups are created with the latest AMI release version for the respective minor Kubernetes
     * version of the cluster, unless you deploy a custom AMI using a launch template. For more information about using
     * launch templates, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch
     * template support</a>.
     * </p>
     * <p>
     * An Amazon EKS managed node group is an Amazon EC2 Auto Scaling group and associated Amazon EC2 instances that are
     * managed by Amazon Web Services for an Amazon EKS cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html">Managed node groups</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Windows AMI types are only supported for commercial Amazon Web Services Regions that support Windows on Amazon
     * EKS.
     * </p>
     * </note>
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
     * Creates a managed node group for an Amazon EKS cluster.
     * </p>
     * <p>
     * You can only create a node group for your cluster that is equal to the current Kubernetes version for the
     * cluster. All node groups are created with the latest AMI release version for the respective minor Kubernetes
     * version of the cluster, unless you deploy a custom AMI using a launch template. For more information about using
     * launch templates, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch
     * template support</a>.
     * </p>
     * <p>
     * An Amazon EKS managed node group is an Amazon EC2 Auto Scaling group and associated Amazon EC2 instances that are
     * managed by Amazon Web Services for an Amazon EKS cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html">Managed node groups</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Windows AMI types are only supported for commercial Amazon Web Services Regions that support Windows on Amazon
     * EKS.
     * </p>
     * </note>
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
     * Creates an EKS Pod Identity association between a service account in an Amazon EKS cluster and an IAM role with
     * <i>EKS Pod Identity</i>. Use EKS Pod Identity to give temporary IAM credentials to pods and the credentials are
     * rotated automatically.
     * </p>
     * <p>
     * Amazon EKS Pod Identity associations provide the ability to manage credentials for your applications, similar to
     * the way that Amazon EC2 instance profiles provide credentials to Amazon EC2 instances.
     * </p>
     * <p>
     * If a pod uses a service account that has an association, Amazon EKS sets environment variables in the containers
     * of the pod. The environment variables configure the Amazon Web Services SDKs, including the Command Line
     * Interface, to use the EKS Pod Identity credentials.
     * </p>
     * <p>
     * Pod Identity is a simpler method than <i>IAM roles for service accounts</i>, as this method doesn't use OIDC
     * identity providers. Additionally, you can configure a role for Pod Identity once, and reuse it across clusters.
     * </p>
     * 
     * @param createPodIdentityAssociationRequest
     * @return A Java Future containing the result of the CreatePodIdentityAssociation operation returned by the
     *         service.
     * @sample AmazonEKSAsync.CreatePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreatePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePodIdentityAssociationResult> createPodIdentityAssociationAsync(
            CreatePodIdentityAssociationRequest createPodIdentityAssociationRequest);

    /**
     * <p>
     * Creates an EKS Pod Identity association between a service account in an Amazon EKS cluster and an IAM role with
     * <i>EKS Pod Identity</i>. Use EKS Pod Identity to give temporary IAM credentials to pods and the credentials are
     * rotated automatically.
     * </p>
     * <p>
     * Amazon EKS Pod Identity associations provide the ability to manage credentials for your applications, similar to
     * the way that Amazon EC2 instance profiles provide credentials to Amazon EC2 instances.
     * </p>
     * <p>
     * If a pod uses a service account that has an association, Amazon EKS sets environment variables in the containers
     * of the pod. The environment variables configure the Amazon Web Services SDKs, including the Command Line
     * Interface, to use the EKS Pod Identity credentials.
     * </p>
     * <p>
     * Pod Identity is a simpler method than <i>IAM roles for service accounts</i>, as this method doesn't use OIDC
     * identity providers. Additionally, you can configure a role for Pod Identity once, and reuse it across clusters.
     * </p>
     * 
     * @param createPodIdentityAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePodIdentityAssociation operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.CreatePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreatePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePodIdentityAssociationResult> createPodIdentityAssociationAsync(
            CreatePodIdentityAssociationRequest createPodIdentityAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePodIdentityAssociationRequest, CreatePodIdentityAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes an access entry.
     * </p>
     * <p>
     * Deleting an access entry of a type other than <code>Standard</code> can cause your cluster to function
     * improperly. If you delete an access entry in error, you can recreate it.
     * </p>
     * 
     * @param deleteAccessEntryRequest
     * @return A Java Future containing the result of the DeleteAccessEntry operation returned by the service.
     * @sample AmazonEKSAsync.DeleteAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessEntryResult> deleteAccessEntryAsync(DeleteAccessEntryRequest deleteAccessEntryRequest);

    /**
     * <p>
     * Deletes an access entry.
     * </p>
     * <p>
     * Deleting an access entry of a type other than <code>Standard</code> can cause your cluster to function
     * improperly. If you delete an access entry in error, you can recreate it.
     * </p>
     * 
     * @param deleteAccessEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessEntry operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DeleteAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessEntryResult> deleteAccessEntryAsync(DeleteAccessEntryRequest deleteAccessEntryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessEntryRequest, DeleteAccessEntryResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon EKS add-on.
     * </p>
     * <p>
     * When you remove an add-on, it's deleted from the cluster. You can always manually start an add-on on the cluster
     * using the Kubernetes API.
     * </p>
     * 
     * @param deleteAddonRequest
     * @return A Java Future containing the result of the DeleteAddon operation returned by the service.
     * @sample AmazonEKSAsync.DeleteAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteAddon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAddonResult> deleteAddonAsync(DeleteAddonRequest deleteAddonRequest);

    /**
     * <p>
     * Deletes an Amazon EKS add-on.
     * </p>
     * <p>
     * When you remove an add-on, it's deleted from the cluster. You can always manually start an add-on on the cluster
     * using the Kubernetes API.
     * </p>
     * 
     * @param deleteAddonRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAddon operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DeleteAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteAddon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAddonResult> deleteAddonAsync(DeleteAddonRequest deleteAddonRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAddonRequest, DeleteAddonResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon EKS cluster control plane.
     * </p>
     * <p>
     * If you have active services in your cluster that are associated with a load balancer, you must delete those
     * services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have
     * orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/delete-cluster.html">Deleting a cluster</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * If you have managed node groups or Fargate profiles attached to the cluster, you must delete them first. For more
     * information, see <code>DeleteNodgroup</code> and <code>DeleteFargateProfile</code>.
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
     * Deletes an Amazon EKS cluster control plane.
     * </p>
     * <p>
     * If you have active services in your cluster that are associated with a load balancer, you must delete those
     * services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have
     * orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/delete-cluster.html">Deleting a cluster</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * If you have managed node groups or Fargate profiles attached to the cluster, you must delete them first. For more
     * information, see <code>DeleteNodgroup</code> and <code>DeleteFargateProfile</code>.
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
     * Deletes an expired or inactive subscription. Deleting inactive subscriptions removes them from the Amazon Web
     * Services Management Console view and from list/describe API responses. Subscriptions can only be cancelled within
     * 7 days of creation and are cancelled by creating a ticket in the Amazon Web Services Support Center.
     * </p>
     * 
     * @param deleteEksAnywhereSubscriptionRequest
     * @return A Java Future containing the result of the DeleteEksAnywhereSubscription operation returned by the
     *         service.
     * @sample AmazonEKSAsync.DeleteEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEksAnywhereSubscriptionResult> deleteEksAnywhereSubscriptionAsync(
            DeleteEksAnywhereSubscriptionRequest deleteEksAnywhereSubscriptionRequest);

    /**
     * <p>
     * Deletes an expired or inactive subscription. Deleting inactive subscriptions removes them from the Amazon Web
     * Services Management Console view and from list/describe API responses. Subscriptions can only be cancelled within
     * 7 days of creation and are cancelled by creating a ticket in the Amazon Web Services Support Center.
     * </p>
     * 
     * @param deleteEksAnywhereSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEksAnywhereSubscription operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.DeleteEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEksAnywhereSubscriptionResult> deleteEksAnywhereSubscriptionAsync(
            DeleteEksAnywhereSubscriptionRequest deleteEksAnywhereSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEksAnywhereSubscriptionRequest, DeleteEksAnywhereSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes an Fargate profile.
     * </p>
     * <p>
     * When you delete a Fargate profile, any <code>Pod</code> running on Fargate that was created with the profile is
     * deleted. If the <code>Pod</code> matches another Fargate profile, then it is scheduled on Fargate with that
     * profile. If it no longer matches any Fargate profiles, then it's not scheduled on Fargate and may remain in a
     * pending state.
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
     * Deletes an Fargate profile.
     * </p>
     * <p>
     * When you delete a Fargate profile, any <code>Pod</code> running on Fargate that was created with the profile is
     * deleted. If the <code>Pod</code> matches another Fargate profile, then it is scheduled on Fargate with that
     * profile. If it no longer matches any Fargate profiles, then it's not scheduled on Fargate and may remain in a
     * pending state.
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
     * Deletes a managed node group.
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
     * Deletes a managed node group.
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
     * Deletes a EKS Pod Identity association.
     * </p>
     * <p>
     * The temporary Amazon Web Services credentials from the previous IAM role session might still be valid until the
     * session expiry. If you need to immediately revoke the temporary session credentials, then go to the role in the
     * IAM console.
     * </p>
     * 
     * @param deletePodIdentityAssociationRequest
     * @return A Java Future containing the result of the DeletePodIdentityAssociation operation returned by the
     *         service.
     * @sample AmazonEKSAsync.DeletePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeletePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePodIdentityAssociationResult> deletePodIdentityAssociationAsync(
            DeletePodIdentityAssociationRequest deletePodIdentityAssociationRequest);

    /**
     * <p>
     * Deletes a EKS Pod Identity association.
     * </p>
     * <p>
     * The temporary Amazon Web Services credentials from the previous IAM role session might still be valid until the
     * session expiry. If you need to immediately revoke the temporary session credentials, then go to the role in the
     * IAM console.
     * </p>
     * 
     * @param deletePodIdentityAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePodIdentityAssociation operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.DeletePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeletePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePodIdentityAssociationResult> deletePodIdentityAssociationAsync(
            DeletePodIdentityAssociationRequest deletePodIdentityAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePodIdentityAssociationRequest, DeletePodIdentityAssociationResult> asyncHandler);

    /**
     * <p>
     * Deregisters a connected cluster to remove it from the Amazon EKS control plane.
     * </p>
     * <p>
     * A connected cluster is a Kubernetes cluster that you've connected to your control plane using the <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-connector.html">Amazon EKS Connector</a>.
     * </p>
     * 
     * @param deregisterClusterRequest
     * @return A Java Future containing the result of the DeregisterCluster operation returned by the service.
     * @sample AmazonEKSAsync.DeregisterCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeregisterCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterClusterResult> deregisterClusterAsync(DeregisterClusterRequest deregisterClusterRequest);

    /**
     * <p>
     * Deregisters a connected cluster to remove it from the Amazon EKS control plane.
     * </p>
     * <p>
     * A connected cluster is a Kubernetes cluster that you've connected to your control plane using the <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-connector.html">Amazon EKS Connector</a>.
     * </p>
     * 
     * @param deregisterClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterCluster operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DeregisterCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeregisterCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterClusterResult> deregisterClusterAsync(DeregisterClusterRequest deregisterClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterClusterRequest, DeregisterClusterResult> asyncHandler);

    /**
     * <p>
     * Describes an access entry.
     * </p>
     * 
     * @param describeAccessEntryRequest
     * @return A Java Future containing the result of the DescribeAccessEntry operation returned by the service.
     * @sample AmazonEKSAsync.DescribeAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessEntryResult> describeAccessEntryAsync(DescribeAccessEntryRequest describeAccessEntryRequest);

    /**
     * <p>
     * Describes an access entry.
     * </p>
     * 
     * @param describeAccessEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccessEntry operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DescribeAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessEntryResult> describeAccessEntryAsync(DescribeAccessEntryRequest describeAccessEntryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccessEntryRequest, DescribeAccessEntryResult> asyncHandler);

    /**
     * <p>
     * Describes an Amazon EKS add-on.
     * </p>
     * 
     * @param describeAddonRequest
     * @return A Java Future containing the result of the DescribeAddon operation returned by the service.
     * @sample AmazonEKSAsync.DescribeAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAddonResult> describeAddonAsync(DescribeAddonRequest describeAddonRequest);

    /**
     * <p>
     * Describes an Amazon EKS add-on.
     * </p>
     * 
     * @param describeAddonRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAddon operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DescribeAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAddonResult> describeAddonAsync(DescribeAddonRequest describeAddonRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAddonRequest, DescribeAddonResult> asyncHandler);

    /**
     * <p>
     * Returns configuration options.
     * </p>
     * 
     * @param describeAddonConfigurationRequest
     * @return A Java Future containing the result of the DescribeAddonConfiguration operation returned by the service.
     * @sample AmazonEKSAsync.DescribeAddonConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddonConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAddonConfigurationResult> describeAddonConfigurationAsync(
            DescribeAddonConfigurationRequest describeAddonConfigurationRequest);

    /**
     * <p>
     * Returns configuration options.
     * </p>
     * 
     * @param describeAddonConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAddonConfiguration operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DescribeAddonConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddonConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAddonConfigurationResult> describeAddonConfigurationAsync(
            DescribeAddonConfigurationRequest describeAddonConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAddonConfigurationRequest, DescribeAddonConfigurationResult> asyncHandler);

    /**
     * <p>
     * Describes the versions for an add-on.
     * </p>
     * <p>
     * Information such as the Kubernetes versions that you can use the add-on with, the <code>owner</code>,
     * <code>publisher</code>, and the <code>type</code> of the add-on are returned.
     * </p>
     * 
     * @param describeAddonVersionsRequest
     * @return A Java Future containing the result of the DescribeAddonVersions operation returned by the service.
     * @sample AmazonEKSAsync.DescribeAddonVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddonVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAddonVersionsResult> describeAddonVersionsAsync(DescribeAddonVersionsRequest describeAddonVersionsRequest);

    /**
     * <p>
     * Describes the versions for an add-on.
     * </p>
     * <p>
     * Information such as the Kubernetes versions that you can use the add-on with, the <code>owner</code>,
     * <code>publisher</code>, and the <code>type</code> of the add-on are returned.
     * </p>
     * 
     * @param describeAddonVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAddonVersions operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DescribeAddonVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddonVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAddonVersionsResult> describeAddonVersionsAsync(DescribeAddonVersionsRequest describeAddonVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAddonVersionsRequest, DescribeAddonVersionsResult> asyncHandler);

    /**
     * <p>
     * Describes an Amazon EKS cluster.
     * </p>
     * <p>
     * The API server endpoint and certificate authority data returned by this operation are required for
     * <code>kubelet</code> and <code>kubectl</code> to communicate with your Kubernetes API server. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/create-kubeconfig.html">Creating or
     * updating a <code>kubeconfig</code> file for an Amazon EKS cluster</a>.
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
     * Describes an Amazon EKS cluster.
     * </p>
     * <p>
     * The API server endpoint and certificate authority data returned by this operation are required for
     * <code>kubelet</code> and <code>kubectl</code> to communicate with your Kubernetes API server. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/create-kubeconfig.html">Creating or
     * updating a <code>kubeconfig</code> file for an Amazon EKS cluster</a>.
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
     * Returns descriptive information about a subscription.
     * </p>
     * 
     * @param describeEksAnywhereSubscriptionRequest
     * @return A Java Future containing the result of the DescribeEksAnywhereSubscription operation returned by the
     *         service.
     * @sample AmazonEKSAsync.DescribeEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEksAnywhereSubscriptionResult> describeEksAnywhereSubscriptionAsync(
            DescribeEksAnywhereSubscriptionRequest describeEksAnywhereSubscriptionRequest);

    /**
     * <p>
     * Returns descriptive information about a subscription.
     * </p>
     * 
     * @param describeEksAnywhereSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEksAnywhereSubscription operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.DescribeEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEksAnywhereSubscriptionResult> describeEksAnywhereSubscriptionAsync(
            DescribeEksAnywhereSubscriptionRequest describeEksAnywhereSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEksAnywhereSubscriptionRequest, DescribeEksAnywhereSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Describes an Fargate profile.
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
     * Describes an Fargate profile.
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
     * Describes an identity provider configuration.
     * </p>
     * 
     * @param describeIdentityProviderConfigRequest
     * @return A Java Future containing the result of the DescribeIdentityProviderConfig operation returned by the
     *         service.
     * @sample AmazonEKSAsync.DescribeIdentityProviderConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeIdentityProviderConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityProviderConfigResult> describeIdentityProviderConfigAsync(
            DescribeIdentityProviderConfigRequest describeIdentityProviderConfigRequest);

    /**
     * <p>
     * Describes an identity provider configuration.
     * </p>
     * 
     * @param describeIdentityProviderConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIdentityProviderConfig operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.DescribeIdentityProviderConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeIdentityProviderConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityProviderConfigResult> describeIdentityProviderConfigAsync(
            DescribeIdentityProviderConfigRequest describeIdentityProviderConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityProviderConfigRequest, DescribeIdentityProviderConfigResult> asyncHandler);

    /**
     * <p>
     * Returns details about an insight that you specify using its ID.
     * </p>
     * 
     * @param describeInsightRequest
     * @return A Java Future containing the result of the DescribeInsight operation returned by the service.
     * @sample AmazonEKSAsync.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(DescribeInsightRequest describeInsightRequest);

    /**
     * <p>
     * Returns details about an insight that you specify using its ID.
     * </p>
     * 
     * @param describeInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInsight operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInsightResult> describeInsightAsync(DescribeInsightRequest describeInsightRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInsightRequest, DescribeInsightResult> asyncHandler);

    /**
     * <p>
     * Describes a managed node group.
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
     * Describes a managed node group.
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
     * Returns descriptive information about an EKS Pod Identity association.
     * </p>
     * <p>
     * This action requires the ID of the association. You can get the ID from the response to the
     * <code>CreatePodIdentityAssocation</code> for newly created associations. Or, you can list the IDs for
     * associations with <code>ListPodIdentityAssociations</code> and filter the list by namespace or service account.
     * </p>
     * 
     * @param describePodIdentityAssociationRequest
     * @return A Java Future containing the result of the DescribePodIdentityAssociation operation returned by the
     *         service.
     * @sample AmazonEKSAsync.DescribePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePodIdentityAssociationResult> describePodIdentityAssociationAsync(
            DescribePodIdentityAssociationRequest describePodIdentityAssociationRequest);

    /**
     * <p>
     * Returns descriptive information about an EKS Pod Identity association.
     * </p>
     * <p>
     * This action requires the ID of the association. You can get the ID from the response to the
     * <code>CreatePodIdentityAssocation</code> for newly created associations. Or, you can list the IDs for
     * associations with <code>ListPodIdentityAssociations</code> and filter the list by namespace or service account.
     * </p>
     * 
     * @param describePodIdentityAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePodIdentityAssociation operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.DescribePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePodIdentityAssociationResult> describePodIdentityAssociationAsync(
            DescribePodIdentityAssociationRequest describePodIdentityAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePodIdentityAssociationRequest, DescribePodIdentityAssociationResult> asyncHandler);

    /**
     * <p>
     * Describes an update to an Amazon EKS resource.
     * </p>
     * <p>
     * When the status of the update is <code>Succeeded</code>, the update is complete. If an update fails, the status
     * is <code>Failed</code>, and an error detail explains the reason for the failure.
     * </p>
     * 
     * @param describeUpdateRequest
     *        Describes an update request.
     * @return A Java Future containing the result of the DescribeUpdate operation returned by the service.
     * @sample AmazonEKSAsync.DescribeUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeUpdate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUpdateResult> describeUpdateAsync(DescribeUpdateRequest describeUpdateRequest);

    /**
     * <p>
     * Describes an update to an Amazon EKS resource.
     * </p>
     * <p>
     * When the status of the update is <code>Succeeded</code>, the update is complete. If an update fails, the status
     * is <code>Failed</code>, and an error detail explains the reason for the failure.
     * </p>
     * 
     * @param describeUpdateRequest
     *        Describes an update request.
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
     * Disassociates an access policy from an access entry.
     * </p>
     * 
     * @param disassociateAccessPolicyRequest
     * @return A Java Future containing the result of the DisassociateAccessPolicy operation returned by the service.
     * @sample AmazonEKSAsync.DisassociateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DisassociateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAccessPolicyResult> disassociateAccessPolicyAsync(DisassociateAccessPolicyRequest disassociateAccessPolicyRequest);

    /**
     * <p>
     * Disassociates an access policy from an access entry.
     * </p>
     * 
     * @param disassociateAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAccessPolicy operation returned by the service.
     * @sample AmazonEKSAsyncHandler.DisassociateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DisassociateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAccessPolicyResult> disassociateAccessPolicyAsync(DisassociateAccessPolicyRequest disassociateAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAccessPolicyRequest, DisassociateAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Disassociates an identity provider configuration from a cluster.
     * </p>
     * <p>
     * If you disassociate an identity provider from your cluster, users included in the provider can no longer access
     * the cluster. However, you can still access the cluster with IAM principals.
     * </p>
     * 
     * @param disassociateIdentityProviderConfigRequest
     * @return A Java Future containing the result of the DisassociateIdentityProviderConfig operation returned by the
     *         service.
     * @sample AmazonEKSAsync.DisassociateIdentityProviderConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DisassociateIdentityProviderConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateIdentityProviderConfigResult> disassociateIdentityProviderConfigAsync(
            DisassociateIdentityProviderConfigRequest disassociateIdentityProviderConfigRequest);

    /**
     * <p>
     * Disassociates an identity provider configuration from a cluster.
     * </p>
     * <p>
     * If you disassociate an identity provider from your cluster, users included in the provider can no longer access
     * the cluster. However, you can still access the cluster with IAM principals.
     * </p>
     * 
     * @param disassociateIdentityProviderConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateIdentityProviderConfig operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.DisassociateIdentityProviderConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DisassociateIdentityProviderConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateIdentityProviderConfigResult> disassociateIdentityProviderConfigAsync(
            DisassociateIdentityProviderConfigRequest disassociateIdentityProviderConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateIdentityProviderConfigRequest, DisassociateIdentityProviderConfigResult> asyncHandler);

    /**
     * <p>
     * Lists the access entries for your cluster.
     * </p>
     * 
     * @param listAccessEntriesRequest
     * @return A Java Future containing the result of the ListAccessEntries operation returned by the service.
     * @sample AmazonEKSAsync.ListAccessEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAccessEntries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessEntriesResult> listAccessEntriesAsync(ListAccessEntriesRequest listAccessEntriesRequest);

    /**
     * <p>
     * Lists the access entries for your cluster.
     * </p>
     * 
     * @param listAccessEntriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessEntries operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListAccessEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAccessEntries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessEntriesResult> listAccessEntriesAsync(ListAccessEntriesRequest listAccessEntriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessEntriesRequest, ListAccessEntriesResult> asyncHandler);

    /**
     * <p>
     * Lists the available access policies.
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return A Java Future containing the result of the ListAccessPolicies operation returned by the service.
     * @sample AmazonEKSAsync.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAccessPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(ListAccessPoliciesRequest listAccessPoliciesRequest);

    /**
     * <p>
     * Lists the available access policies.
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessPolicies operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAccessPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(ListAccessPoliciesRequest listAccessPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessPoliciesRequest, ListAccessPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the installed add-ons.
     * </p>
     * 
     * @param listAddonsRequest
     * @return A Java Future containing the result of the ListAddons operation returned by the service.
     * @sample AmazonEKSAsync.ListAddons
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAddons" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAddonsResult> listAddonsAsync(ListAddonsRequest listAddonsRequest);

    /**
     * <p>
     * Lists the installed add-ons.
     * </p>
     * 
     * @param listAddonsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAddons operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListAddons
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAddons" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAddonsResult> listAddonsAsync(ListAddonsRequest listAddonsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAddonsRequest, ListAddonsResult> asyncHandler);

    /**
     * <p>
     * Lists the access policies associated with an access entry.
     * </p>
     * 
     * @param listAssociatedAccessPoliciesRequest
     * @return A Java Future containing the result of the ListAssociatedAccessPolicies operation returned by the
     *         service.
     * @sample AmazonEKSAsync.ListAssociatedAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAssociatedAccessPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedAccessPoliciesResult> listAssociatedAccessPoliciesAsync(
            ListAssociatedAccessPoliciesRequest listAssociatedAccessPoliciesRequest);

    /**
     * <p>
     * Lists the access policies associated with an access entry.
     * </p>
     * 
     * @param listAssociatedAccessPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedAccessPolicies operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.ListAssociatedAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAssociatedAccessPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedAccessPoliciesResult> listAssociatedAccessPoliciesAsync(
            ListAssociatedAccessPoliciesRequest listAssociatedAccessPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedAccessPoliciesRequest, ListAssociatedAccessPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon EKS clusters in your Amazon Web Services account in the specified Amazon Web Services Region.
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
     * Lists the Amazon EKS clusters in your Amazon Web Services account in the specified Amazon Web Services Region.
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
     * Displays the full description of the subscription.
     * </p>
     * 
     * @param listEksAnywhereSubscriptionsRequest
     * @return A Java Future containing the result of the ListEksAnywhereSubscriptions operation returned by the
     *         service.
     * @sample AmazonEKSAsync.ListEksAnywhereSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListEksAnywhereSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEksAnywhereSubscriptionsResult> listEksAnywhereSubscriptionsAsync(
            ListEksAnywhereSubscriptionsRequest listEksAnywhereSubscriptionsRequest);

    /**
     * <p>
     * Displays the full description of the subscription.
     * </p>
     * 
     * @param listEksAnywhereSubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEksAnywhereSubscriptions operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.ListEksAnywhereSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListEksAnywhereSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEksAnywhereSubscriptionsResult> listEksAnywhereSubscriptionsAsync(
            ListEksAnywhereSubscriptionsRequest listEksAnywhereSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEksAnywhereSubscriptionsRequest, ListEksAnywhereSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Lists the Fargate profiles associated with the specified cluster in your Amazon Web Services account in the
     * specified Amazon Web Services Region.
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
     * Lists the Fargate profiles associated with the specified cluster in your Amazon Web Services account in the
     * specified Amazon Web Services Region.
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
     * Lists the identity provider configurations for your cluster.
     * </p>
     * 
     * @param listIdentityProviderConfigsRequest
     * @return A Java Future containing the result of the ListIdentityProviderConfigs operation returned by the service.
     * @sample AmazonEKSAsync.ListIdentityProviderConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListIdentityProviderConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityProviderConfigsResult> listIdentityProviderConfigsAsync(
            ListIdentityProviderConfigsRequest listIdentityProviderConfigsRequest);

    /**
     * <p>
     * Lists the identity provider configurations for your cluster.
     * </p>
     * 
     * @param listIdentityProviderConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentityProviderConfigs operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListIdentityProviderConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListIdentityProviderConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityProviderConfigsResult> listIdentityProviderConfigsAsync(
            ListIdentityProviderConfigsRequest listIdentityProviderConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityProviderConfigsRequest, ListIdentityProviderConfigsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all insights checked for against the specified cluster. You can filter which insights are
     * returned by category, associated Kubernetes version, and status.
     * </p>
     * 
     * @param listInsightsRequest
     * @return A Java Future containing the result of the ListInsights operation returned by the service.
     * @sample AmazonEKSAsync.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(ListInsightsRequest listInsightsRequest);

    /**
     * <p>
     * Returns a list of all insights checked for against the specified cluster. You can filter which insights are
     * returned by category, associated Kubernetes version, and status.
     * </p>
     * 
     * @param listInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInsights operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInsightsResult> listInsightsAsync(ListInsightsRequest listInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInsightsRequest, ListInsightsResult> asyncHandler);

    /**
     * <p>
     * Lists the managed node groups associated with the specified cluster in your Amazon Web Services account in the
     * specified Amazon Web Services Region. Self-managed node groups aren't listed.
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
     * Lists the managed node groups associated with the specified cluster in your Amazon Web Services account in the
     * specified Amazon Web Services Region. Self-managed node groups aren't listed.
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
     * List the EKS Pod Identity associations in a cluster. You can filter the list by the namespace that the
     * association is in or the service account that the association uses.
     * </p>
     * 
     * @param listPodIdentityAssociationsRequest
     * @return A Java Future containing the result of the ListPodIdentityAssociations operation returned by the service.
     * @sample AmazonEKSAsync.ListPodIdentityAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListPodIdentityAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPodIdentityAssociationsResult> listPodIdentityAssociationsAsync(
            ListPodIdentityAssociationsRequest listPodIdentityAssociationsRequest);

    /**
     * <p>
     * List the EKS Pod Identity associations in a cluster. You can filter the list by the namespace that the
     * association is in or the service account that the association uses.
     * </p>
     * 
     * @param listPodIdentityAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPodIdentityAssociations operation returned by the service.
     * @sample AmazonEKSAsyncHandler.ListPodIdentityAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListPodIdentityAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPodIdentityAssociationsResult> listPodIdentityAssociationsAsync(
            ListPodIdentityAssociationsRequest listPodIdentityAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPodIdentityAssociationsRequest, ListPodIdentityAssociationsResult> asyncHandler);

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
     * Lists the updates associated with an Amazon EKS resource in your Amazon Web Services account, in the specified
     * Amazon Web Services Region.
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
     * Lists the updates associated with an Amazon EKS resource in your Amazon Web Services account, in the specified
     * Amazon Web Services Region.
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
     * Connects a Kubernetes cluster to the Amazon EKS control plane.
     * </p>
     * <p>
     * Any Kubernetes cluster can be connected to the Amazon EKS control plane to view current information about the
     * cluster and its nodes.
     * </p>
     * <p>
     * Cluster connection requires two steps. First, send a <code> <a>RegisterClusterRequest</a> </code> to add it to
     * the Amazon EKS control plane.
     * </p>
     * <p>
     * Second, a <a href=
     * "https://amazon-eks.s3.us-west-2.amazonaws.com/eks-connector/manifests/eks-connector/latest/eks-connector.yaml"
     * >Manifest</a> containing the <code>activationID</code> and <code>activationCode</code> must be applied to the
     * Kubernetes cluster through it's native provider to provide visibility.
     * </p>
     * <p>
     * After the manifest is updated and applied, the connected cluster is visible to the Amazon EKS control plane. If
     * the manifest isn't applied within three days, the connected cluster will no longer be visible and must be
     * deregistered using <code>DeregisterCluster</code>.
     * </p>
     * 
     * @param registerClusterRequest
     * @return A Java Future containing the result of the RegisterCluster operation returned by the service.
     * @sample AmazonEKSAsync.RegisterCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/RegisterCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterClusterResult> registerClusterAsync(RegisterClusterRequest registerClusterRequest);

    /**
     * <p>
     * Connects a Kubernetes cluster to the Amazon EKS control plane.
     * </p>
     * <p>
     * Any Kubernetes cluster can be connected to the Amazon EKS control plane to view current information about the
     * cluster and its nodes.
     * </p>
     * <p>
     * Cluster connection requires two steps. First, send a <code> <a>RegisterClusterRequest</a> </code> to add it to
     * the Amazon EKS control plane.
     * </p>
     * <p>
     * Second, a <a href=
     * "https://amazon-eks.s3.us-west-2.amazonaws.com/eks-connector/manifests/eks-connector/latest/eks-connector.yaml"
     * >Manifest</a> containing the <code>activationID</code> and <code>activationCode</code> must be applied to the
     * Kubernetes cluster through it's native provider to provide visibility.
     * </p>
     * <p>
     * After the manifest is updated and applied, the connected cluster is visible to the Amazon EKS control plane. If
     * the manifest isn't applied within three days, the connected cluster will no longer be visible and must be
     * deregistered using <code>DeregisterCluster</code>.
     * </p>
     * 
     * @param registerClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterCluster operation returned by the service.
     * @sample AmazonEKSAsyncHandler.RegisterCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/RegisterCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterClusterResult> registerClusterAsync(RegisterClusterRequest registerClusterRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterClusterRequest, RegisterClusterResult> asyncHandler);

    /**
     * <p>
     * Associates the specified tags to an Amazon EKS resource with the specified <code>resourceArn</code>. If existing
     * tags on a resource are not specified in the request parameters, they aren't changed. When a resource is deleted,
     * the tags associated with that resource are also deleted. Tags that you create for Amazon EKS resources don't
     * propagate to any other resources associated with the cluster. For example, if you tag a cluster with this
     * operation, that tag doesn't automatically propagate to the subnets and nodes associated with the cluster.
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
     * Associates the specified tags to an Amazon EKS resource with the specified <code>resourceArn</code>. If existing
     * tags on a resource are not specified in the request parameters, they aren't changed. When a resource is deleted,
     * the tags associated with that resource are also deleted. Tags that you create for Amazon EKS resources don't
     * propagate to any other resources associated with the cluster. For example, if you tag a cluster with this
     * operation, that tag doesn't automatically propagate to the subnets and nodes associated with the cluster.
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
     * Deletes specified tags from an Amazon EKS resource.
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
     * Deletes specified tags from an Amazon EKS resource.
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
     * Updates an access entry.
     * </p>
     * 
     * @param updateAccessEntryRequest
     * @return A Java Future containing the result of the UpdateAccessEntry operation returned by the service.
     * @sample AmazonEKSAsync.UpdateAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessEntryResult> updateAccessEntryAsync(UpdateAccessEntryRequest updateAccessEntryRequest);

    /**
     * <p>
     * Updates an access entry.
     * </p>
     * 
     * @param updateAccessEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccessEntry operation returned by the service.
     * @sample AmazonEKSAsyncHandler.UpdateAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessEntryResult> updateAccessEntryAsync(UpdateAccessEntryRequest updateAccessEntryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccessEntryRequest, UpdateAccessEntryResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon EKS add-on.
     * </p>
     * 
     * @param updateAddonRequest
     * @return A Java Future containing the result of the UpdateAddon operation returned by the service.
     * @sample AmazonEKSAsync.UpdateAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateAddon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAddonResult> updateAddonAsync(UpdateAddonRequest updateAddonRequest);

    /**
     * <p>
     * Updates an Amazon EKS add-on.
     * </p>
     * 
     * @param updateAddonRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAddon operation returned by the service.
     * @sample AmazonEKSAsyncHandler.UpdateAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateAddon" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAddonResult> updateAddonAsync(UpdateAddonRequest updateAddonRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAddonRequest, UpdateAddonResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response
     * output includes an update ID that you can use to track the status of your cluster update with
     * <code>DescribeUpdate</code>"/&gt;.
     * </p>
     * <p>
     * You can use this API operation to enable or disable exporting the Kubernetes control plane logs for your cluster
     * to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS
     * Cluster control plane logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">CloudWatch Pricing</a>.
     * </p>
     * </note>
     * <p>
     * You can also use this API operation to enable or disable public and private access to your cluster's Kubernetes
     * API server endpoint. By default, public access is enabled, and private access is disabled. For more information,
     * see <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS cluster endpoint
     * access control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * You can also use this API operation to choose different subnets and security groups for the cluster. You must
     * specify at least two subnets that are in different Availability Zones. You can't change which VPC the subnets are
     * from, the subnets must be in the same VPC as the subnets that the cluster was created with. For more information
     * about the VPC requirements, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">https
     * ://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
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
     * output includes an update ID that you can use to track the status of your cluster update with
     * <code>DescribeUpdate</code>"/&gt;.
     * </p>
     * <p>
     * You can use this API operation to enable or disable exporting the Kubernetes control plane logs for your cluster
     * to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS
     * Cluster control plane logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">CloudWatch Pricing</a>.
     * </p>
     * </note>
     * <p>
     * You can also use this API operation to enable or disable public and private access to your cluster's Kubernetes
     * API server endpoint. By default, public access is enabled, and private access is disabled. For more information,
     * see <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS cluster endpoint
     * access control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * You can also use this API operation to choose different subnets and security groups for the cluster. You must
     * specify at least two subnets that are in different Availability Zones. You can't change which VPC the subnets are
     * from, the subnets must be in the same VPC as the subnets that the cluster was created with. For more information
     * about the VPC requirements, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">https
     * ://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
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
     * Update an EKS Anywhere Subscription. Only auto renewal and tags can be updated after subscription creation.
     * </p>
     * 
     * @param updateEksAnywhereSubscriptionRequest
     * @return A Java Future containing the result of the UpdateEksAnywhereSubscription operation returned by the
     *         service.
     * @sample AmazonEKSAsync.UpdateEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEksAnywhereSubscriptionResult> updateEksAnywhereSubscriptionAsync(
            UpdateEksAnywhereSubscriptionRequest updateEksAnywhereSubscriptionRequest);

    /**
     * <p>
     * Update an EKS Anywhere Subscription. Only auto renewal and tags can be updated after subscription creation.
     * </p>
     * 
     * @param updateEksAnywhereSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEksAnywhereSubscription operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.UpdateEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEksAnywhereSubscriptionResult> updateEksAnywhereSubscriptionAsync(
            UpdateEksAnywhereSubscriptionRequest updateEksAnywhereSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEksAnywhereSubscriptionRequest, UpdateEksAnywhereSubscriptionResult> asyncHandler);

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
     * You can update a node group using a launch template only if the node group was originally deployed with a launch
     * template. If you need to update a custom AMI in a node group that was deployed with a launch template, then
     * update your custom AMI, specify the new ID in a new version of the launch template, and then update the node
     * group to the new version of the launch template.
     * </p>
     * <p>
     * If you update without a launch template, then you can update to the latest available AMI version of a node
     * group's current Kubernetes version by not specifying a Kubernetes version in the request. You can update to the
     * latest AMI version of your cluster's current Kubernetes version by specifying your cluster's Kubernetes version
     * in the request. For information about Linux versions, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS optimized Amazon
     * Linux AMI versions</a> in the <i>Amazon EKS User Guide</i>. For information about Windows versions, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-ami-versions-windows.html">Amazon EKS optimized
     * Windows AMI versions</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * You cannot roll back a node group to an earlier Kubernetes version or AMI version.
     * </p>
     * <p>
     * When a node in a managed node group is terminated due to a scaling action or update, every <code>Pod</code> on
     * that node is drained first. Amazon EKS attempts to drain the nodes gracefully and will fail if it is unable to do
     * so. You can <code>force</code> the update if Amazon EKS is unable to drain the nodes as a result of a
     * <code>Pod</code> disruption budget issue.
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
     * You can update a node group using a launch template only if the node group was originally deployed with a launch
     * template. If you need to update a custom AMI in a node group that was deployed with a launch template, then
     * update your custom AMI, specify the new ID in a new version of the launch template, and then update the node
     * group to the new version of the launch template.
     * </p>
     * <p>
     * If you update without a launch template, then you can update to the latest available AMI version of a node
     * group's current Kubernetes version by not specifying a Kubernetes version in the request. You can update to the
     * latest AMI version of your cluster's current Kubernetes version by specifying your cluster's Kubernetes version
     * in the request. For information about Linux versions, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS optimized Amazon
     * Linux AMI versions</a> in the <i>Amazon EKS User Guide</i>. For information about Windows versions, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-ami-versions-windows.html">Amazon EKS optimized
     * Windows AMI versions</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * You cannot roll back a node group to an earlier Kubernetes version or AMI version.
     * </p>
     * <p>
     * When a node in a managed node group is terminated due to a scaling action or update, every <code>Pod</code> on
     * that node is drained first. Amazon EKS attempts to drain the nodes gracefully and will fail if it is unable to do
     * so. You can <code>force</code> the update if Amazon EKS is unable to drain the nodes as a result of a
     * <code>Pod</code> disruption budget issue.
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

    /**
     * <p>
     * Updates a EKS Pod Identity association. Only the IAM role can be changed; an association can't be moved between
     * clusters, namespaces, or service accounts. If you need to edit the namespace or service account, you need to
     * delete the association and then create a new association with your desired settings.
     * </p>
     * 
     * @param updatePodIdentityAssociationRequest
     * @return A Java Future containing the result of the UpdatePodIdentityAssociation operation returned by the
     *         service.
     * @sample AmazonEKSAsync.UpdatePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdatePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePodIdentityAssociationResult> updatePodIdentityAssociationAsync(
            UpdatePodIdentityAssociationRequest updatePodIdentityAssociationRequest);

    /**
     * <p>
     * Updates a EKS Pod Identity association. Only the IAM role can be changed; an association can't be moved between
     * clusters, namespaces, or service accounts. If you need to edit the namespace or service account, you need to
     * delete the association and then create a new association with your desired settings.
     * </p>
     * 
     * @param updatePodIdentityAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePodIdentityAssociation operation returned by the
     *         service.
     * @sample AmazonEKSAsyncHandler.UpdatePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdatePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePodIdentityAssociationResult> updatePodIdentityAssociationAsync(
            UpdatePodIdentityAssociationRequest updatePodIdentityAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePodIdentityAssociationRequest, UpdatePodIdentityAssociationResult> asyncHandler);

}

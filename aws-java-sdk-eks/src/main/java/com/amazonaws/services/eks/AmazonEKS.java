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
     * Associates an access policy and its scope to an access entry. For more information about associating access
     * policies, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/access-policies.html">Associating and
     * disassociating access policies to and from access entries</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param associateAccessPolicyRequest
     * @return Result of the AssociateAccessPolicy operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.AssociateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateAccessPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateAccessPolicyResult associateAccessPolicy(AssociateAccessPolicyRequest associateAccessPolicyRequest);

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
     * @return Result of the AssociateEncryptionConfig operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.AssociateEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateEncryptionConfig" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateEncryptionConfigResult associateEncryptionConfig(AssociateEncryptionConfigRequest associateEncryptionConfigRequest);

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
     * @return Result of the AssociateIdentityProviderConfig operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.AssociateIdentityProviderConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateIdentityProviderConfig"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateIdentityProviderConfigResult associateIdentityProviderConfig(AssociateIdentityProviderConfigRequest associateIdentityProviderConfigRequest);

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
     * @return Result of the CreateAccessEntry operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonEKS.CreateAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAccessEntryResult createAccessEntry(CreateAccessEntryRequest createAccessEntryRequest);

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
     * @return Result of the CreateAddon operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonEKS.CreateAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateAddon" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAddonResult createAddon(CreateAddonRequest createAddonRequest);

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
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
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
     * Creates an EKS Anywhere subscription. When a subscription is created, it is a contract agreement for the length
     * of the term specified in the request. Licenses that are used to validate support are provisioned in Amazon Web
     * Services License Manager and the caller account is granted access to EKS Anywhere Curated Packages.
     * </p>
     * 
     * @param createEksAnywhereSubscriptionRequest
     * @return Result of the CreateEksAnywhereSubscription operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.CreateEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEksAnywhereSubscriptionResult createEksAnywhereSubscription(CreateEksAnywhereSubscriptionRequest createEksAnywhereSubscriptionRequest);

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
     * @return Result of the CreateFargateProfile operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
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
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
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
     * @return Result of the CreatePodIdentityAssociation operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonEKS.CreatePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreatePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePodIdentityAssociationResult createPodIdentityAssociation(CreatePodIdentityAssociationRequest createPodIdentityAssociationRequest);

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
     * @return Result of the DeleteAccessEntry operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.DeleteAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAccessEntryResult deleteAccessEntry(DeleteAccessEntryRequest deleteAccessEntryRequest);

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
     * @return Result of the DeleteAddon operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonEKS.DeleteAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteAddon" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAddonResult deleteAddon(DeleteAddonRequest deleteAddonRequest);

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
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
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
     * Deletes an expired or inactive subscription. Deleting inactive subscriptions removes them from the Amazon Web
     * Services Management Console view and from list/describe API responses. Subscriptions can only be cancelled within
     * 7 days of creation and are cancelled by creating a ticket in the Amazon Web Services Support Center.
     * </p>
     * 
     * @param deleteEksAnywhereSubscriptionRequest
     * @return Result of the DeleteEksAnywhereSubscription operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonEKS.DeleteEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEksAnywhereSubscriptionResult deleteEksAnywhereSubscription(DeleteEksAnywhereSubscriptionRequest deleteEksAnywhereSubscriptionRequest);

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
     * @return Result of the DeleteFargateProfile operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @sample AmazonEKS.DeleteFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFargateProfileResult deleteFargateProfile(DeleteFargateProfileRequest deleteFargateProfileRequest);

    /**
     * <p>
     * Deletes a managed node group.
     * </p>
     * 
     * @param deleteNodegroupRequest
     * @return Result of the DeleteNodegroup operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
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
     * Deletes a EKS Pod Identity association.
     * </p>
     * <p>
     * The temporary Amazon Web Services credentials from the previous IAM role session might still be valid until the
     * session expiry. If you need to immediately revoke the temporary session credentials, then go to the role in the
     * IAM console.
     * </p>
     * 
     * @param deletePodIdentityAssociationRequest
     * @return Result of the DeletePodIdentityAssociation operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.DeletePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeletePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePodIdentityAssociationResult deletePodIdentityAssociation(DeletePodIdentityAssociationRequest deletePodIdentityAssociationRequest);

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
     * @return Result of the DeregisterCluster operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> making the request must have at least one IAM permissions policy attached that grants the
     *         required permissions. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access management</a> in the <i>IAM
     *         User Guide</i>.
     * @sample AmazonEKS.DeregisterCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeregisterCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DeregisterClusterResult deregisterCluster(DeregisterClusterRequest deregisterClusterRequest);

    /**
     * <p>
     * Describes an access entry.
     * </p>
     * 
     * @param describeAccessEntryRequest
     * @return Result of the DescribeAccessEntry operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.DescribeAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAccessEntryResult describeAccessEntry(DescribeAccessEntryRequest describeAccessEntryRequest);

    /**
     * <p>
     * Describes an Amazon EKS add-on.
     * </p>
     * 
     * @param describeAddonRequest
     * @return Result of the DescribeAddon operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonEKS.DescribeAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddon" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAddonResult describeAddon(DescribeAddonRequest describeAddonRequest);

    /**
     * <p>
     * Returns configuration options.
     * </p>
     * 
     * @param describeAddonConfigurationRequest
     * @return Result of the DescribeAddonConfiguration operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.DescribeAddonConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddonConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAddonConfigurationResult describeAddonConfiguration(DescribeAddonConfigurationRequest describeAddonConfigurationRequest);

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
     * @return Result of the DescribeAddonVersions operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.DescribeAddonVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddonVersions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAddonVersionsResult describeAddonVersions(DescribeAddonVersionsRequest describeAddonVersionsRequest);

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
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
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
     * Returns descriptive information about a subscription.
     * </p>
     * 
     * @param describeEksAnywhereSubscriptionRequest
     * @return Result of the DescribeEksAnywhereSubscription operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.DescribeEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEksAnywhereSubscriptionResult describeEksAnywhereSubscription(DescribeEksAnywhereSubscriptionRequest describeEksAnywhereSubscriptionRequest);

    /**
     * <p>
     * Describes an Fargate profile.
     * </p>
     * 
     * @param describeFargateProfileRequest
     * @return Result of the DescribeFargateProfile operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @sample AmazonEKS.DescribeFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFargateProfileResult describeFargateProfile(DescribeFargateProfileRequest describeFargateProfileRequest);

    /**
     * <p>
     * Describes an identity provider configuration.
     * </p>
     * 
     * @param describeIdentityProviderConfigRequest
     * @return Result of the DescribeIdentityProviderConfig operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.DescribeIdentityProviderConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeIdentityProviderConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIdentityProviderConfigResult describeIdentityProviderConfig(DescribeIdentityProviderConfigRequest describeIdentityProviderConfigRequest);

    /**
     * <p>
     * Returns details about an insight that you specify using its ID.
     * </p>
     * 
     * @param describeInsightRequest
     * @return Result of the DescribeInsight operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeInsight" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInsightResult describeInsight(DescribeInsightRequest describeInsightRequest);

    /**
     * <p>
     * Describes a managed node group.
     * </p>
     * 
     * @param describeNodegroupRequest
     * @return Result of the DescribeNodegroup operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
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
     * Returns descriptive information about an EKS Pod Identity association.
     * </p>
     * <p>
     * This action requires the ID of the association. You can get the ID from the response to the
     * <code>CreatePodIdentityAssocation</code> for newly created associations. Or, you can list the IDs for
     * associations with <code>ListPodIdentityAssociations</code> and filter the list by namespace or service account.
     * </p>
     * 
     * @param describePodIdentityAssociationRequest
     * @return Result of the DescribePodIdentityAssociation operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.DescribePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePodIdentityAssociationResult describePodIdentityAssociation(DescribePodIdentityAssociationRequest describePodIdentityAssociationRequest);

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
     * @return Result of the DescribeUpdate operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @sample AmazonEKS.DescribeUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeUpdate" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUpdateResult describeUpdate(DescribeUpdateRequest describeUpdateRequest);

    /**
     * <p>
     * Disassociates an access policy from an access entry.
     * </p>
     * 
     * @param disassociateAccessPolicyRequest
     * @return Result of the DisassociateAccessPolicy operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.DisassociateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DisassociateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateAccessPolicyResult disassociateAccessPolicy(DisassociateAccessPolicyRequest disassociateAccessPolicyRequest);

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
     * @return Result of the DisassociateIdentityProviderConfig operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.DisassociateIdentityProviderConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DisassociateIdentityProviderConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateIdentityProviderConfigResult disassociateIdentityProviderConfig(
            DisassociateIdentityProviderConfigRequest disassociateIdentityProviderConfigRequest);

    /**
     * <p>
     * Lists the access entries for your cluster.
     * </p>
     * 
     * @param listAccessEntriesRequest
     * @return Result of the ListAccessEntries operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.ListAccessEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAccessEntries" target="_top">AWS API
     *      Documentation</a>
     */
    ListAccessEntriesResult listAccessEntries(ListAccessEntriesRequest listAccessEntriesRequest);

    /**
     * <p>
     * Lists the available access policies.
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return Result of the ListAccessPolicies operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonEKS.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAccessPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    ListAccessPoliciesResult listAccessPolicies(ListAccessPoliciesRequest listAccessPoliciesRequest);

    /**
     * <p>
     * Lists the installed add-ons.
     * </p>
     * 
     * @param listAddonsRequest
     * @return Result of the ListAddons operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonEKS.ListAddons
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAddons" target="_top">AWS API
     *      Documentation</a>
     */
    ListAddonsResult listAddons(ListAddonsRequest listAddonsRequest);

    /**
     * <p>
     * Lists the access policies associated with an access entry.
     * </p>
     * 
     * @param listAssociatedAccessPoliciesRequest
     * @return Result of the ListAssociatedAccessPolicies operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.ListAssociatedAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAssociatedAccessPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociatedAccessPoliciesResult listAssociatedAccessPolicies(ListAssociatedAccessPoliciesRequest listAssociatedAccessPoliciesRequest);

    /**
     * <p>
     * Lists the Amazon EKS clusters in your Amazon Web Services account in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
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
     * Displays the full description of the subscription.
     * </p>
     * 
     * @param listEksAnywhereSubscriptionsRequest
     * @return Result of the ListEksAnywhereSubscriptions operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.ListEksAnywhereSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListEksAnywhereSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    ListEksAnywhereSubscriptionsResult listEksAnywhereSubscriptions(ListEksAnywhereSubscriptionsRequest listEksAnywhereSubscriptionsRequest);

    /**
     * <p>
     * Lists the Fargate profiles associated with the specified cluster in your Amazon Web Services account in the
     * specified Amazon Web Services Region.
     * </p>
     * 
     * @param listFargateProfilesRequest
     * @return Result of the ListFargateProfiles operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
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
     * Lists the identity provider configurations for your cluster.
     * </p>
     * 
     * @param listIdentityProviderConfigsRequest
     * @return Result of the ListIdentityProviderConfigs operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @sample AmazonEKS.ListIdentityProviderConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListIdentityProviderConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdentityProviderConfigsResult listIdentityProviderConfigs(ListIdentityProviderConfigsRequest listIdentityProviderConfigsRequest);

    /**
     * <p>
     * Returns a list of all insights checked for against the specified cluster. You can filter which insights are
     * returned by category, associated Kubernetes version, and status.
     * </p>
     * 
     * @param listInsightsRequest
     * @return Result of the ListInsights operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    ListInsightsResult listInsights(ListInsightsRequest listInsightsRequest);

    /**
     * <p>
     * Lists the managed node groups associated with the specified cluster in your Amazon Web Services account in the
     * specified Amazon Web Services Region. Self-managed node groups aren't listed.
     * </p>
     * 
     * @param listNodegroupsRequest
     * @return Result of the ListNodegroups operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @sample AmazonEKS.ListNodegroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListNodegroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListNodegroupsResult listNodegroups(ListNodegroupsRequest listNodegroupsRequest);

    /**
     * <p>
     * List the EKS Pod Identity associations in a cluster. You can filter the list by the namespace that the
     * association is in or the service account that the association uses.
     * </p>
     * 
     * @param listPodIdentityAssociationsRequest
     * @return Result of the ListPodIdentityAssociations operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.ListPodIdentityAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListPodIdentityAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListPodIdentityAssociationsResult listPodIdentityAssociations(ListPodIdentityAssociationsRequest listPodIdentityAssociationsRequest);

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
     * Lists the updates associated with an Amazon EKS resource in your Amazon Web Services account, in the specified
     * Amazon Web Services Region.
     * </p>
     * 
     * @param listUpdatesRequest
     * @return Result of the ListUpdates operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @sample AmazonEKS.ListUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListUpdates" target="_top">AWS API
     *      Documentation</a>
     */
    ListUpdatesResult listUpdates(ListUpdatesRequest listUpdatesRequest);

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
     * @return Result of the RegisterCluster operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> making the request must have at least one IAM permissions policy attached that grants the
     *         required permissions. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access management</a> in the <i>IAM
     *         User Guide</i>.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourcePropagationDelayException
     *         Required resources (such as service-linked roles) were created and are still propagating. Retry later.
     * @sample AmazonEKS.RegisterCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/RegisterCluster" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterClusterResult registerCluster(RegisterClusterRequest registerClusterRequest);

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
     * Deletes specified tags from an Amazon EKS resource.
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
     * Updates an access entry.
     * </p>
     * 
     * @param updateAccessEntryRequest
     * @return Result of the UpdateAccessEntry operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.UpdateAccessEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateAccessEntry" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAccessEntryResult updateAccessEntry(UpdateAccessEntryRequest updateAccessEntryRequest);

    /**
     * <p>
     * Updates an Amazon EKS add-on.
     * </p>
     * 
     * @param updateAddonRequest
     * @return Result of the UpdateAddon operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonEKS.UpdateAddon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateAddon" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAddonResult updateAddon(UpdateAddonRequest updateAddonRequest);

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
     * @return Result of the UpdateClusterConfig operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
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
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
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
     * Update an EKS Anywhere Subscription. Only auto renewal and tags can be updated after subscription creation.
     * </p>
     * 
     * @param updateEksAnywhereSubscriptionRequest
     * @return Result of the UpdateEksAnywhereSubscription operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateEksAnywhereSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateEksAnywhereSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEksAnywhereSubscriptionResult updateEksAnywhereSubscription(UpdateEksAnywhereSubscriptionRequest updateEksAnywhereSubscriptionRequest);

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
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
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
     * @return Result of the UpdateNodegroupVersion operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of an <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html">IAM
     *         principal</a> that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateNodegroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupVersion" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateNodegroupVersionResult updateNodegroupVersion(UpdateNodegroupVersionRequest updateNodegroupVersionRequest);

    /**
     * <p>
     * Updates a EKS Pod Identity association. Only the IAM role can be changed; an association can't be moved between
     * clusters, namespaces, or service accounts. If you need to edit the namespace or service account, you need to
     * delete the association and then create a new association with your desired settings.
     * </p>
     * 
     * @param updatePodIdentityAssociationRequest
     * @return Result of the UpdatePodIdentityAssociation operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with
     *         <code>ListClusters</code>. You can view your available managed node groups with
     *         <code>ListNodegroups</code>. Amazon EKS clusters and node groups are Amazon Web Services Region specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonEKS.UpdatePodIdentityAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdatePodIdentityAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePodIdentityAssociationResult updatePodIdentityAssociation(UpdatePodIdentityAssociationRequest updatePodIdentityAssociationRequest);

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

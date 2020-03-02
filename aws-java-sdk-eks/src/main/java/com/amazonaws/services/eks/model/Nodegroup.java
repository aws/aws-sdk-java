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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an Amazon EKS managed node group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Nodegroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Nodegroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name associated with an Amazon EKS managed node group.
     * </p>
     */
    private String nodegroupName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the managed node group.
     * </p>
     */
    private String nodegroupArn;
    /**
     * <p>
     * The name of the cluster that the managed node group resides in.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The Kubernetes version of the managed node group.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The AMI version of the managed node group. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     */
    private String releaseVersion;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the managed node group was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the managed node group was last modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The current status of the managed node group.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group that is associated with your node group.
     * </p>
     */
    private NodegroupScalingConfig scalingConfig;
    /**
     * <p>
     * The instance types associated with your node group.
     * </p>
     */
    private java.util.List<String> instanceTypes;
    /**
     * <p>
     * The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must have
     * the following tag: <code>kubernetes.io/cluster/CLUSTER_NAME</code>, where <code>CLUSTER_NAME</code> is replaced
     * with the name of your cluster.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * The remote access (SSH) configuration that is associated with the node group.
     * </p>
     */
    private RemoteAccessConfig remoteAccess;
    /**
     * <p>
     * The AMI type associated with your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI
     * type, which uses the Amazon EKS-optimized Linux AMI with GPU support. Non-GPU instances should use the
     * <code>AL2_x86_64</code> AMI type, which uses the Amazon EKS-optimized Linux AMI.
     * </p>
     */
    private String amiType;
    /**
     * <p>
     * The IAM role associated with your node group. The Amazon EKS worker node <code>kubelet</code> daemon makes calls
     * to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile
     * and associated policies. Before you can launch worker nodes and register them into a cluster, you must create an
     * IAM role for those worker nodes to use when they are launched. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS Worker Node IAM
     * Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     */
    private String nodeRole;
    /**
     * <p>
     * The Kubernetes labels applied to the nodes in the node group.
     * </p>
     * <note>
     * <p>
     * Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels applied
     * to the nodes in this group.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> labels;
    /**
     * <p>
     * The resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
     * </p>
     */
    private NodegroupResources resources;
    /**
     * <p>
     * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
     * </p>
     */
    private Integer diskSize;
    /**
     * <p>
     * The health status of the node group. If there are issues with your node group's health, they are listed here.
     * </p>
     */
    private NodegroupHealth health;
    /**
     * <p>
     * The metadata applied to the node group to assist with categorization and organization. Each tag consists of a key
     * and an optional value, both of which you define. Node group tags do not propagate to any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name associated with an Amazon EKS managed node group.
     * </p>
     * 
     * @param nodegroupName
     *        The name associated with an Amazon EKS managed node group.
     */

    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    /**
     * <p>
     * The name associated with an Amazon EKS managed node group.
     * </p>
     * 
     * @return The name associated with an Amazon EKS managed node group.
     */

    public String getNodegroupName() {
        return this.nodegroupName;
    }

    /**
     * <p>
     * The name associated with an Amazon EKS managed node group.
     * </p>
     * 
     * @param nodegroupName
     *        The name associated with an Amazon EKS managed node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withNodegroupName(String nodegroupName) {
        setNodegroupName(nodegroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the managed node group.
     * </p>
     * 
     * @param nodegroupArn
     *        The Amazon Resource Name (ARN) associated with the managed node group.
     */

    public void setNodegroupArn(String nodegroupArn) {
        this.nodegroupArn = nodegroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the managed node group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the managed node group.
     */

    public String getNodegroupArn() {
        return this.nodegroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the managed node group.
     * </p>
     * 
     * @param nodegroupArn
     *        The Amazon Resource Name (ARN) associated with the managed node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withNodegroupArn(String nodegroupArn) {
        setNodegroupArn(nodegroupArn);
        return this;
    }

    /**
     * <p>
     * The name of the cluster that the managed node group resides in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the managed node group resides in.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the managed node group resides in.
     * </p>
     * 
     * @return The name of the cluster that the managed node group resides in.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the managed node group resides in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the managed node group resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The Kubernetes version of the managed node group.
     * </p>
     * 
     * @param version
     *        The Kubernetes version of the managed node group.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The Kubernetes version of the managed node group.
     * </p>
     * 
     * @return The Kubernetes version of the managed node group.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The Kubernetes version of the managed node group.
     * </p>
     * 
     * @param version
     *        The Kubernetes version of the managed node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The AMI version of the managed node group. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param releaseVersion
     *        The AMI version of the managed node group. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized
     *        Linux AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     */

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    /**
     * <p>
     * The AMI version of the managed node group. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @return The AMI version of the managed node group. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized
     *         Linux AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     */

    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * <p>
     * The AMI version of the managed node group. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param releaseVersion
     *        The AMI version of the managed node group. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized
     *        Linux AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withReleaseVersion(String releaseVersion) {
        setReleaseVersion(releaseVersion);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the managed node group was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the managed node group was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the managed node group was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the managed node group was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the managed node group was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the managed node group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the managed node group was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        The Unix epoch timestamp in seconds for when the managed node group was last modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the managed node group was last modified.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the managed node group was last modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the managed node group was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        The Unix epoch timestamp in seconds for when the managed node group was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The current status of the managed node group.
     * </p>
     * 
     * @param status
     *        The current status of the managed node group.
     * @see NodegroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the managed node group.
     * </p>
     * 
     * @return The current status of the managed node group.
     * @see NodegroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the managed node group.
     * </p>
     * 
     * @param status
     *        The current status of the managed node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodegroupStatus
     */

    public Nodegroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the managed node group.
     * </p>
     * 
     * @param status
     *        The current status of the managed node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodegroupStatus
     */

    public Nodegroup withStatus(NodegroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group that is associated with your node group.
     * </p>
     * 
     * @param scalingConfig
     *        The scaling configuration details for the Auto Scaling group that is associated with your node group.
     */

    public void setScalingConfig(NodegroupScalingConfig scalingConfig) {
        this.scalingConfig = scalingConfig;
    }

    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group that is associated with your node group.
     * </p>
     * 
     * @return The scaling configuration details for the Auto Scaling group that is associated with your node group.
     */

    public NodegroupScalingConfig getScalingConfig() {
        return this.scalingConfig;
    }

    /**
     * <p>
     * The scaling configuration details for the Auto Scaling group that is associated with your node group.
     * </p>
     * 
     * @param scalingConfig
     *        The scaling configuration details for the Auto Scaling group that is associated with your node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withScalingConfig(NodegroupScalingConfig scalingConfig) {
        setScalingConfig(scalingConfig);
        return this;
    }

    /**
     * <p>
     * The instance types associated with your node group.
     * </p>
     * 
     * @return The instance types associated with your node group.
     */

    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * The instance types associated with your node group.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types associated with your node group.
     */

    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new java.util.ArrayList<String>(instanceTypes);
    }

    /**
     * <p>
     * The instance types associated with your node group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types associated with your node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withInstanceTypes(String... instanceTypes) {
        if (this.instanceTypes == null) {
            setInstanceTypes(new java.util.ArrayList<String>(instanceTypes.length));
        }
        for (String ele : instanceTypes) {
            this.instanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types associated with your node group.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types associated with your node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must have
     * the following tag: <code>kubernetes.io/cluster/CLUSTER_NAME</code>, where <code>CLUSTER_NAME</code> is replaced
     * with the name of your cluster.
     * </p>
     * 
     * @return The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets
     *         must have the following tag: <code>kubernetes.io/cluster/CLUSTER_NAME</code>, where
     *         <code>CLUSTER_NAME</code> is replaced with the name of your cluster.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must have
     * the following tag: <code>kubernetes.io/cluster/CLUSTER_NAME</code>, where <code>CLUSTER_NAME</code> is replaced
     * with the name of your cluster.
     * </p>
     * 
     * @param subnets
     *        The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must
     *        have the following tag: <code>kubernetes.io/cluster/CLUSTER_NAME</code>, where <code>CLUSTER_NAME</code>
     *        is replaced with the name of your cluster.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must have
     * the following tag: <code>kubernetes.io/cluster/CLUSTER_NAME</code>, where <code>CLUSTER_NAME</code> is replaced
     * with the name of your cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must
     *        have the following tag: <code>kubernetes.io/cluster/CLUSTER_NAME</code>, where <code>CLUSTER_NAME</code>
     *        is replaced with the name of your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must have
     * the following tag: <code>kubernetes.io/cluster/CLUSTER_NAME</code>, where <code>CLUSTER_NAME</code> is replaced
     * with the name of your cluster.
     * </p>
     * 
     * @param subnets
     *        The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must
     *        have the following tag: <code>kubernetes.io/cluster/CLUSTER_NAME</code>, where <code>CLUSTER_NAME</code>
     *        is replaced with the name of your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The remote access (SSH) configuration that is associated with the node group.
     * </p>
     * 
     * @param remoteAccess
     *        The remote access (SSH) configuration that is associated with the node group.
     */

    public void setRemoteAccess(RemoteAccessConfig remoteAccess) {
        this.remoteAccess = remoteAccess;
    }

    /**
     * <p>
     * The remote access (SSH) configuration that is associated with the node group.
     * </p>
     * 
     * @return The remote access (SSH) configuration that is associated with the node group.
     */

    public RemoteAccessConfig getRemoteAccess() {
        return this.remoteAccess;
    }

    /**
     * <p>
     * The remote access (SSH) configuration that is associated with the node group.
     * </p>
     * 
     * @param remoteAccess
     *        The remote access (SSH) configuration that is associated with the node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withRemoteAccess(RemoteAccessConfig remoteAccess) {
        setRemoteAccess(remoteAccess);
        return this;
    }

    /**
     * <p>
     * The AMI type associated with your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI
     * type, which uses the Amazon EKS-optimized Linux AMI with GPU support. Non-GPU instances should use the
     * <code>AL2_x86_64</code> AMI type, which uses the Amazon EKS-optimized Linux AMI.
     * </p>
     * 
     * @param amiType
     *        The AMI type associated with your node group. GPU instance types should use the
     *        <code>AL2_x86_64_GPU</code> AMI type, which uses the Amazon EKS-optimized Linux AMI with GPU support.
     *        Non-GPU instances should use the <code>AL2_x86_64</code> AMI type, which uses the Amazon EKS-optimized
     *        Linux AMI.
     * @see AMITypes
     */

    public void setAmiType(String amiType) {
        this.amiType = amiType;
    }

    /**
     * <p>
     * The AMI type associated with your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI
     * type, which uses the Amazon EKS-optimized Linux AMI with GPU support. Non-GPU instances should use the
     * <code>AL2_x86_64</code> AMI type, which uses the Amazon EKS-optimized Linux AMI.
     * </p>
     * 
     * @return The AMI type associated with your node group. GPU instance types should use the
     *         <code>AL2_x86_64_GPU</code> AMI type, which uses the Amazon EKS-optimized Linux AMI with GPU support.
     *         Non-GPU instances should use the <code>AL2_x86_64</code> AMI type, which uses the Amazon EKS-optimized
     *         Linux AMI.
     * @see AMITypes
     */

    public String getAmiType() {
        return this.amiType;
    }

    /**
     * <p>
     * The AMI type associated with your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI
     * type, which uses the Amazon EKS-optimized Linux AMI with GPU support. Non-GPU instances should use the
     * <code>AL2_x86_64</code> AMI type, which uses the Amazon EKS-optimized Linux AMI.
     * </p>
     * 
     * @param amiType
     *        The AMI type associated with your node group. GPU instance types should use the
     *        <code>AL2_x86_64_GPU</code> AMI type, which uses the Amazon EKS-optimized Linux AMI with GPU support.
     *        Non-GPU instances should use the <code>AL2_x86_64</code> AMI type, which uses the Amazon EKS-optimized
     *        Linux AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AMITypes
     */

    public Nodegroup withAmiType(String amiType) {
        setAmiType(amiType);
        return this;
    }

    /**
     * <p>
     * The AMI type associated with your node group. GPU instance types should use the <code>AL2_x86_64_GPU</code> AMI
     * type, which uses the Amazon EKS-optimized Linux AMI with GPU support. Non-GPU instances should use the
     * <code>AL2_x86_64</code> AMI type, which uses the Amazon EKS-optimized Linux AMI.
     * </p>
     * 
     * @param amiType
     *        The AMI type associated with your node group. GPU instance types should use the
     *        <code>AL2_x86_64_GPU</code> AMI type, which uses the Amazon EKS-optimized Linux AMI with GPU support.
     *        Non-GPU instances should use the <code>AL2_x86_64</code> AMI type, which uses the Amazon EKS-optimized
     *        Linux AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AMITypes
     */

    public Nodegroup withAmiType(AMITypes amiType) {
        this.amiType = amiType.toString();
        return this;
    }

    /**
     * <p>
     * The IAM role associated with your node group. The Amazon EKS worker node <code>kubelet</code> daemon makes calls
     * to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile
     * and associated policies. Before you can launch worker nodes and register them into a cluster, you must create an
     * IAM role for those worker nodes to use when they are launched. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS Worker Node IAM
     * Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param nodeRole
     *        The IAM role associated with your node group. The Amazon EKS worker node <code>kubelet</code> daemon makes
     *        calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM
     *        instance profile and associated policies. Before you can launch worker nodes and register them into a
     *        cluster, you must create an IAM role for those worker nodes to use when they are launched. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS Worker Node
     *        IAM Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    /**
     * <p>
     * The IAM role associated with your node group. The Amazon EKS worker node <code>kubelet</code> daemon makes calls
     * to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile
     * and associated policies. Before you can launch worker nodes and register them into a cluster, you must create an
     * IAM role for those worker nodes to use when they are launched. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS Worker Node IAM
     * Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @return The IAM role associated with your node group. The Amazon EKS worker node <code>kubelet</code> daemon
     *         makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an
     *         IAM instance profile and associated policies. Before you can launch worker nodes and register them into a
     *         cluster, you must create an IAM role for those worker nodes to use when they are launched. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS Worker Node
     *         IAM Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public String getNodeRole() {
        return this.nodeRole;
    }

    /**
     * <p>
     * The IAM role associated with your node group. The Amazon EKS worker node <code>kubelet</code> daemon makes calls
     * to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile
     * and associated policies. Before you can launch worker nodes and register them into a cluster, you must create an
     * IAM role for those worker nodes to use when they are launched. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS Worker Node IAM
     * Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param nodeRole
     *        The IAM role associated with your node group. The Amazon EKS worker node <code>kubelet</code> daemon makes
     *        calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM
     *        instance profile and associated policies. Before you can launch worker nodes and register them into a
     *        cluster, you must create an IAM role for those worker nodes to use when they are launched. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">Amazon EKS Worker Node
     *        IAM Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withNodeRole(String nodeRole) {
        setNodeRole(nodeRole);
        return this;
    }

    /**
     * <p>
     * The Kubernetes labels applied to the nodes in the node group.
     * </p>
     * <note>
     * <p>
     * Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels applied
     * to the nodes in this group.
     * </p>
     * </note>
     * 
     * @return The Kubernetes labels applied to the nodes in the node group.</p> <note>
     *         <p>
     *         Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels
     *         applied to the nodes in this group.
     *         </p>
     */

    public java.util.Map<String, String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * The Kubernetes labels applied to the nodes in the node group.
     * </p>
     * <note>
     * <p>
     * Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels applied
     * to the nodes in this group.
     * </p>
     * </note>
     * 
     * @param labels
     *        The Kubernetes labels applied to the nodes in the node group.</p> <note>
     *        <p>
     *        Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels
     *        applied to the nodes in this group.
     *        </p>
     */

    public void setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * <p>
     * The Kubernetes labels applied to the nodes in the node group.
     * </p>
     * <note>
     * <p>
     * Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels applied
     * to the nodes in this group.
     * </p>
     * </note>
     * 
     * @param labels
     *        The Kubernetes labels applied to the nodes in the node group.</p> <note>
     *        <p>
     *        Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels
     *        applied to the nodes in this group.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withLabels(java.util.Map<String, String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * Add a single Labels entry
     *
     * @see Nodegroup#withLabels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup addLabelsEntry(String key, String value) {
        if (null == this.labels) {
            this.labels = new java.util.HashMap<String, String>();
        }
        if (this.labels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.labels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Labels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup clearLabelsEntries() {
        this.labels = null;
        return this;
    }

    /**
     * <p>
     * The resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
     * </p>
     * 
     * @param resources
     *        The resources associated with the node group, such as Auto Scaling groups and security groups for remote
     *        access.
     */

    public void setResources(NodegroupResources resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
     * </p>
     * 
     * @return The resources associated with the node group, such as Auto Scaling groups and security groups for remote
     *         access.
     */

    public NodegroupResources getResources() {
        return this.resources;
    }

    /**
     * <p>
     * The resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
     * </p>
     * 
     * @param resources
     *        The resources associated with the node group, such as Auto Scaling groups and security groups for remote
     *        access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withResources(NodegroupResources resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
     * </p>
     * 
     * @param diskSize
     *        The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
     */

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    /**
     * <p>
     * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
     * </p>
     * 
     * @return The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
     */

    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * <p>
     * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
     * </p>
     * 
     * @param diskSize
     *        The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withDiskSize(Integer diskSize) {
        setDiskSize(diskSize);
        return this;
    }

    /**
     * <p>
     * The health status of the node group. If there are issues with your node group's health, they are listed here.
     * </p>
     * 
     * @param health
     *        The health status of the node group. If there are issues with your node group's health, they are listed
     *        here.
     */

    public void setHealth(NodegroupHealth health) {
        this.health = health;
    }

    /**
     * <p>
     * The health status of the node group. If there are issues with your node group's health, they are listed here.
     * </p>
     * 
     * @return The health status of the node group. If there are issues with your node group's health, they are listed
     *         here.
     */

    public NodegroupHealth getHealth() {
        return this.health;
    }

    /**
     * <p>
     * The health status of the node group. If there are issues with your node group's health, they are listed here.
     * </p>
     * 
     * @param health
     *        The health status of the node group. If there are issues with your node group's health, they are listed
     *        here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withHealth(NodegroupHealth health) {
        setHealth(health);
        return this;
    }

    /**
     * <p>
     * The metadata applied to the node group to assist with categorization and organization. Each tag consists of a key
     * and an optional value, both of which you define. Node group tags do not propagate to any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     * </p>
     * 
     * @return The metadata applied to the node group to assist with categorization and organization. Each tag consists
     *         of a key and an optional value, both of which you define. Node group tags do not propagate to any other
     *         resources associated with the node group, such as the Amazon EC2 instances or subnets.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata applied to the node group to assist with categorization and organization. Each tag consists of a key
     * and an optional value, both of which you define. Node group tags do not propagate to any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     * </p>
     * 
     * @param tags
     *        The metadata applied to the node group to assist with categorization and organization. Each tag consists
     *        of a key and an optional value, both of which you define. Node group tags do not propagate to any other
     *        resources associated with the node group, such as the Amazon EC2 instances or subnets.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata applied to the node group to assist with categorization and organization. Each tag consists of a key
     * and an optional value, both of which you define. Node group tags do not propagate to any other resources
     * associated with the node group, such as the Amazon EC2 instances or subnets.
     * </p>
     * 
     * @param tags
     *        The metadata applied to the node group to assist with categorization and organization. Each tag consists
     *        of a key and an optional value, both of which you define. Node group tags do not propagate to any other
     *        resources associated with the node group, such as the Amazon EC2 instances or subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Nodegroup#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Nodegroup clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNodegroupName() != null)
            sb.append("NodegroupName: ").append(getNodegroupName()).append(",");
        if (getNodegroupArn() != null)
            sb.append("NodegroupArn: ").append(getNodegroupArn()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getReleaseVersion() != null)
            sb.append("ReleaseVersion: ").append(getReleaseVersion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getScalingConfig() != null)
            sb.append("ScalingConfig: ").append(getScalingConfig()).append(",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getRemoteAccess() != null)
            sb.append("RemoteAccess: ").append(getRemoteAccess()).append(",");
        if (getAmiType() != null)
            sb.append("AmiType: ").append(getAmiType()).append(",");
        if (getNodeRole() != null)
            sb.append("NodeRole: ").append(getNodeRole()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getDiskSize() != null)
            sb.append("DiskSize: ").append(getDiskSize()).append(",");
        if (getHealth() != null)
            sb.append("Health: ").append(getHealth()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Nodegroup == false)
            return false;
        Nodegroup other = (Nodegroup) obj;
        if (other.getNodegroupName() == null ^ this.getNodegroupName() == null)
            return false;
        if (other.getNodegroupName() != null && other.getNodegroupName().equals(this.getNodegroupName()) == false)
            return false;
        if (other.getNodegroupArn() == null ^ this.getNodegroupArn() == null)
            return false;
        if (other.getNodegroupArn() != null && other.getNodegroupArn().equals(this.getNodegroupArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getReleaseVersion() == null ^ this.getReleaseVersion() == null)
            return false;
        if (other.getReleaseVersion() != null && other.getReleaseVersion().equals(this.getReleaseVersion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getScalingConfig() == null ^ this.getScalingConfig() == null)
            return false;
        if (other.getScalingConfig() != null && other.getScalingConfig().equals(this.getScalingConfig()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getRemoteAccess() == null ^ this.getRemoteAccess() == null)
            return false;
        if (other.getRemoteAccess() != null && other.getRemoteAccess().equals(this.getRemoteAccess()) == false)
            return false;
        if (other.getAmiType() == null ^ this.getAmiType() == null)
            return false;
        if (other.getAmiType() != null && other.getAmiType().equals(this.getAmiType()) == false)
            return false;
        if (other.getNodeRole() == null ^ this.getNodeRole() == null)
            return false;
        if (other.getNodeRole() != null && other.getNodeRole().equals(this.getNodeRole()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getDiskSize() == null ^ this.getDiskSize() == null)
            return false;
        if (other.getDiskSize() != null && other.getDiskSize().equals(this.getDiskSize()) == false)
            return false;
        if (other.getHealth() == null ^ this.getHealth() == null)
            return false;
        if (other.getHealth() != null && other.getHealth().equals(this.getHealth()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodegroupName() == null) ? 0 : getNodegroupName().hashCode());
        hashCode = prime * hashCode + ((getNodegroupArn() == null) ? 0 : getNodegroupArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getReleaseVersion() == null) ? 0 : getReleaseVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getScalingConfig() == null) ? 0 : getScalingConfig().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getRemoteAccess() == null) ? 0 : getRemoteAccess().hashCode());
        hashCode = prime * hashCode + ((getAmiType() == null) ? 0 : getAmiType().hashCode());
        hashCode = prime * hashCode + ((getNodeRole() == null) ? 0 : getNodeRole().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getDiskSize() == null) ? 0 : getDiskSize().hashCode());
        hashCode = prime * hashCode + ((getHealth() == null) ? 0 : getHealth().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Nodegroup clone() {
        try {
            return (Nodegroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.NodegroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

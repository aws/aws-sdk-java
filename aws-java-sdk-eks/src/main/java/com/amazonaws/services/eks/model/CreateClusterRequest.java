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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name to give to your cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version available
     * in Amazon EKS is used.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to other
     * AWS API operations on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html">Amazon EKS Service IAM Role</a> in
     * the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to
     * work properly with Kubernetes. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     * Considerations</a> in the <i>Amazon EKS User Guide</i>. You must specify at least two subnets. You may specify up
     * to five security groups, but we recommend that you use a dedicated security group for your cluster control plane.
     * </p>
     */
    private VpcConfigRequest resourcesVpcConfig;
    /**
     * <p>
     * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default,
     * cluster control plane logs are not exported to CloudWatch Logs. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS Cluster Control Plane
     * Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * </note>
     */
    private Logging logging;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The unique name to give to your cluster.
     * </p>
     * 
     * @param name
     *        The unique name to give to your cluster.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name to give to your cluster.
     * </p>
     * 
     * @return The unique name to give to your cluster.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name to give to your cluster.
     * </p>
     * 
     * @param name
     *        The unique name to give to your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version available
     * in Amazon EKS is used.
     * </p>
     * 
     * @param version
     *        The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version
     *        available in Amazon EKS is used.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version available
     * in Amazon EKS is used.
     * </p>
     * 
     * @return The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version
     *         available in Amazon EKS is used.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version available
     * in Amazon EKS is used.
     * </p>
     * 
     * @param version
     *        The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version
     *        available in Amazon EKS is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to other
     * AWS API operations on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html">Amazon EKS Service IAM Role</a> in
     * the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to
     *        other AWS API operations on your behalf. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html">Amazon EKS Service IAM
     *        Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to other
     * AWS API operations on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html">Amazon EKS Service IAM Role</a> in
     * the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to
     *         other AWS API operations on your behalf. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html">Amazon EKS Service IAM
     *         Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to other
     * AWS API operations on your behalf. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html">Amazon EKS Service IAM Role</a> in
     * the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to
     *        other AWS API operations on your behalf. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html">Amazon EKS Service IAM
     *        Role</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to
     * work properly with Kubernetes. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     * Considerations</a> in the <i>Amazon EKS User Guide</i>. You must specify at least two subnets. You may specify up
     * to five security groups, but we recommend that you use a dedicated security group for your cluster control plane.
     * </p>
     * 
     * @param resourcesVpcConfig
     *        The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific
     *        requirements to work properly with Kubernetes. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a>
     *        and <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     *        Considerations</a> in the <i>Amazon EKS User Guide</i>. You must specify at least two subnets. You may
     *        specify up to five security groups, but we recommend that you use a dedicated security group for your
     *        cluster control plane.
     */

    public void setResourcesVpcConfig(VpcConfigRequest resourcesVpcConfig) {
        this.resourcesVpcConfig = resourcesVpcConfig;
    }

    /**
     * <p>
     * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to
     * work properly with Kubernetes. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     * Considerations</a> in the <i>Amazon EKS User Guide</i>. You must specify at least two subnets. You may specify up
     * to five security groups, but we recommend that you use a dedicated security group for your cluster control plane.
     * </p>
     * 
     * @return The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific
     *         requirements to work properly with Kubernetes. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a>
     *         and <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     *         Considerations</a> in the <i>Amazon EKS User Guide</i>. You must specify at least two subnets. You may
     *         specify up to five security groups, but we recommend that you use a dedicated security group for your
     *         cluster control plane.
     */

    public VpcConfigRequest getResourcesVpcConfig() {
        return this.resourcesVpcConfig;
    }

    /**
     * <p>
     * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to
     * work properly with Kubernetes. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     * Considerations</a> in the <i>Amazon EKS User Guide</i>. You must specify at least two subnets. You may specify up
     * to five security groups, but we recommend that you use a dedicated security group for your cluster control plane.
     * </p>
     * 
     * @param resourcesVpcConfig
     *        The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific
     *        requirements to work properly with Kubernetes. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a>
     *        and <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     *        Considerations</a> in the <i>Amazon EKS User Guide</i>. You must specify at least two subnets. You may
     *        specify up to five security groups, but we recommend that you use a dedicated security group for your
     *        cluster control plane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withResourcesVpcConfig(VpcConfigRequest resourcesVpcConfig) {
        setResourcesVpcConfig(resourcesVpcConfig);
        return this;
    }

    /**
     * <p>
     * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default,
     * cluster control plane logs are not exported to CloudWatch Logs. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS Cluster Control Plane
     * Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * </note>
     * 
     * @param logging
     *        Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By
     *        default, cluster control plane logs are not exported to CloudWatch Logs. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS Cluster Control
     *        Plane Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.</p> <note>
     *        <p>
     *        CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs.
     *        For more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch
     *        Pricing</a>.
     *        </p>
     */

    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default,
     * cluster control plane logs are not exported to CloudWatch Logs. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS Cluster Control Plane
     * Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * </note>
     * 
     * @return Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By
     *         default, cluster control plane logs are not exported to CloudWatch Logs. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS Cluster
     *         Control Plane Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.</p> <note>
     *         <p>
     *         CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs.
     *         For more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch
     *         Pricing</a>.
     *         </p>
     */

    public Logging getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default,
     * cluster control plane logs are not exported to CloudWatch Logs. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS Cluster Control Plane
     * Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * </note>
     * 
     * @param logging
     *        Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By
     *        default, cluster control plane logs are not exported to CloudWatch Logs. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS Cluster Control
     *        Plane Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.</p> <note>
     *        <p>
     *        CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs.
     *        For more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch
     *        Pricing</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withLogging(Logging logging) {
        setLogging(logging);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getResourcesVpcConfig() != null)
            sb.append("ResourcesVpcConfig: ").append(getResourcesVpcConfig()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getResourcesVpcConfig() == null ^ this.getResourcesVpcConfig() == null)
            return false;
        if (other.getResourcesVpcConfig() != null && other.getResourcesVpcConfig().equals(this.getResourcesVpcConfig()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getResourcesVpcConfig() == null) ? 0 : getResourcesVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}

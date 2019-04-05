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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClusterConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EKS cluster to update.
     * </p>
     */
    private String name;

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
     * The name of the Amazon EKS cluster to update.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EKS cluster to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster to update.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster to update.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EKS cluster to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterConfigRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param resourcesVpcConfig
     */

    public void setResourcesVpcConfig(VpcConfigRequest resourcesVpcConfig) {
        this.resourcesVpcConfig = resourcesVpcConfig;
    }

    /**
     * @return
     */

    public VpcConfigRequest getResourcesVpcConfig() {
        return this.resourcesVpcConfig;
    }

    /**
     * @param resourcesVpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterConfigRequest withResourcesVpcConfig(VpcConfigRequest resourcesVpcConfig) {
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

    public UpdateClusterConfigRequest withLogging(Logging logging) {
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

    public UpdateClusterConfigRequest withClientRequestToken(String clientRequestToken) {
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

        if (obj instanceof UpdateClusterConfigRequest == false)
            return false;
        UpdateClusterConfigRequest other = (UpdateClusterConfigRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getResourcesVpcConfig() == null) ? 0 : getResourcesVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClusterConfigRequest clone() {
        return (UpdateClusterConfigRequest) super.clone();
    }

}

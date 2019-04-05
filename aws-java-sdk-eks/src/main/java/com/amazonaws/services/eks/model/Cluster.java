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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an Amazon EKS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Cluster" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the cluster was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Kubernetes server version for the cluster.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The endpoint for your Kubernetes API server.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make
     * calls to AWS API operations on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to
     * work properly with Kubernetes. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     * Considerations</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     */
    private VpcConfigResponse resourcesVpcConfig;
    /**
     * <p>
     * The logging configuration for your cluster.
     * </p>
     */
    private Logging logging;
    /**
     * <p>
     * The current status of the cluster.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <code>certificate-authority-data</code> for your cluster.
     * </p>
     */
    private Certificate certificateAuthority;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The platform version of your Amazon EKS cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/platform-versions.html">Platform Versions</a> in the <i>
     * <i>Amazon EKS User Guide</i> </i>.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param name
     *        The name of the cluster.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return The name of the cluster.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param name
     *        The name of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the cluster.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the cluster was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the cluster was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the cluster was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the cluster was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the cluster was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the cluster was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Kubernetes server version for the cluster.
     * </p>
     * 
     * @param version
     *        The Kubernetes server version for the cluster.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The Kubernetes server version for the cluster.
     * </p>
     * 
     * @return The Kubernetes server version for the cluster.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The Kubernetes server version for the cluster.
     * </p>
     * 
     * @param version
     *        The Kubernetes server version for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The endpoint for your Kubernetes API server.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for your Kubernetes API server.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint for your Kubernetes API server.
     * </p>
     * 
     * @return The endpoint for your Kubernetes API server.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint for your Kubernetes API server.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for your Kubernetes API server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make
     * calls to AWS API operations on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane
     *        to make calls to AWS API operations on your behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make
     * calls to AWS API operations on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane
     *         to make calls to AWS API operations on your behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make
     * calls to AWS API operations on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane
     *        to make calls to AWS API operations on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to
     * work properly with Kubernetes. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     * Considerations</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param resourcesVpcConfig
     *        The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific
     *        requirements to work properly with Kubernetes. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a>
     *        and <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     *        Considerations</a> in the <i>Amazon EKS User Guide</i>.
     */

    public void setResourcesVpcConfig(VpcConfigResponse resourcesVpcConfig) {
        this.resourcesVpcConfig = resourcesVpcConfig;
    }

    /**
     * <p>
     * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to
     * work properly with Kubernetes. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     * Considerations</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @return The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific
     *         requirements to work properly with Kubernetes. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a>
     *         and <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     *         Considerations</a> in the <i>Amazon EKS User Guide</i>.
     */

    public VpcConfigResponse getResourcesVpcConfig() {
        return this.resourcesVpcConfig;
    }

    /**
     * <p>
     * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to
     * work properly with Kubernetes. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     * Considerations</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param resourcesVpcConfig
     *        The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific
     *        requirements to work properly with Kubernetes. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html">Cluster VPC Considerations</a>
     *        and <a href="https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html">Cluster Security Group
     *        Considerations</a> in the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withResourcesVpcConfig(VpcConfigResponse resourcesVpcConfig) {
        setResourcesVpcConfig(resourcesVpcConfig);
        return this;
    }

    /**
     * <p>
     * The logging configuration for your cluster.
     * </p>
     * 
     * @param logging
     *        The logging configuration for your cluster.
     */

    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * The logging configuration for your cluster.
     * </p>
     * 
     * @return The logging configuration for your cluster.
     */

    public Logging getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * The logging configuration for your cluster.
     * </p>
     * 
     * @param logging
     *        The logging configuration for your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withLogging(Logging logging) {
        setLogging(logging);
        return this;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @param status
     *        The current status of the cluster.
     * @see ClusterStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @return The current status of the cluster.
     * @see ClusterStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @param status
     *        The current status of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterStatus
     */

    public Cluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @param status
     *        The current status of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterStatus
     */

    public Cluster withStatus(ClusterStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>certificate-authority-data</code> for your cluster.
     * </p>
     * 
     * @param certificateAuthority
     *        The <code>certificate-authority-data</code> for your cluster.
     */

    public void setCertificateAuthority(Certificate certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
    }

    /**
     * <p>
     * The <code>certificate-authority-data</code> for your cluster.
     * </p>
     * 
     * @return The <code>certificate-authority-data</code> for your cluster.
     */

    public Certificate getCertificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * <p>
     * The <code>certificate-authority-data</code> for your cluster.
     * </p>
     * 
     * @param certificateAuthority
     *        The <code>certificate-authority-data</code> for your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withCertificateAuthority(Certificate certificateAuthority) {
        setCertificateAuthority(certificateAuthority);
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

    public Cluster withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The platform version of your Amazon EKS cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/platform-versions.html">Platform Versions</a> in the <i>
     * <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version of your Amazon EKS cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/platform-versions.html">Platform Versions</a> in
     *        the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version of your Amazon EKS cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/platform-versions.html">Platform Versions</a> in the <i>
     * <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @return The platform version of your Amazon EKS cluster. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/platform-versions.html">Platform Versions</a> in
     *         the <i> <i>Amazon EKS User Guide</i> </i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version of your Amazon EKS cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/platform-versions.html">Platform Versions</a> in the <i>
     * <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version of your Amazon EKS cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/platform-versions.html">Platform Versions</a> in
     *        the <i> <i>Amazon EKS User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getResourcesVpcConfig() != null)
            sb.append("ResourcesVpcConfig: ").append(getResourcesVpcConfig()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCertificateAuthority() != null)
            sb.append("CertificateAuthority: ").append(getCertificateAuthority()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCertificateAuthority() == null ^ this.getCertificateAuthority() == null)
            return false;
        if (other.getCertificateAuthority() != null && other.getCertificateAuthority().equals(this.getCertificateAuthority()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getResourcesVpcConfig() == null) ? 0 : getResourcesVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthority() == null) ? 0 : getCertificateAuthority().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        return hashCode;
    }

    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.ClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

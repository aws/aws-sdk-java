/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Amazon EKS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEksClusterDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEksClusterDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the cluster.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The certificate authority data for the cluster.
     * </p>
     */
    private String certificateAuthorityData;
    /**
     * <p>
     * The status of the cluster. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>
     * </p>
     * </li>
     * </ul>
     */
    private String clusterStatus;
    /**
     * <p>
     * The endpoint for the Amazon EKS API server.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The VPC configuration used by the cluster control plane.
     * </p>
     */
    private AwsEksClusterResourcesVpcConfigDetails resourcesVpcConfig;
    /**
     * <p>
     * The ARN of the IAM role that provides permissions for the Amazon EKS control plane to make calls to Amazon Web
     * Services API operations on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon EKS server version for the cluster.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The logging configuration for the cluster.
     * </p>
     */
    private AwsEksClusterLoggingDetails logging;

    /**
     * <p>
     * The ARN of the cluster.
     * </p>
     * 
     * @param arn
     *        The ARN of the cluster.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the cluster.
     * </p>
     * 
     * @return The ARN of the cluster.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the cluster.
     * </p>
     * 
     * @param arn
     *        The ARN of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The certificate authority data for the cluster.
     * </p>
     * 
     * @param certificateAuthorityData
     *        The certificate authority data for the cluster.
     */

    public void setCertificateAuthorityData(String certificateAuthorityData) {
        this.certificateAuthorityData = certificateAuthorityData;
    }

    /**
     * <p>
     * The certificate authority data for the cluster.
     * </p>
     * 
     * @return The certificate authority data for the cluster.
     */

    public String getCertificateAuthorityData() {
        return this.certificateAuthorityData;
    }

    /**
     * <p>
     * The certificate authority data for the cluster.
     * </p>
     * 
     * @param certificateAuthorityData
     *        The certificate authority data for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterDetails withCertificateAuthorityData(String certificateAuthorityData) {
        setCertificateAuthorityData(certificateAuthorityData);
        return this;
    }

    /**
     * <p>
     * The status of the cluster. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterStatus
     *        The status of the cluster. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code>
     *        </p>
     *        </li>
     */

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    /**
     * <p>
     * The status of the cluster. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the cluster. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code>
     *         </p>
     *         </li>
     */

    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * <p>
     * The status of the cluster. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterStatus
     *        The status of the cluster. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterDetails withClusterStatus(String clusterStatus) {
        setClusterStatus(clusterStatus);
        return this;
    }

    /**
     * <p>
     * The endpoint for the Amazon EKS API server.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the Amazon EKS API server.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint for the Amazon EKS API server.
     * </p>
     * 
     * @return The endpoint for the Amazon EKS API server.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint for the Amazon EKS API server.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the Amazon EKS API server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterDetails withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

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

    public AwsEksClusterDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The VPC configuration used by the cluster control plane.
     * </p>
     * 
     * @param resourcesVpcConfig
     *        The VPC configuration used by the cluster control plane.
     */

    public void setResourcesVpcConfig(AwsEksClusterResourcesVpcConfigDetails resourcesVpcConfig) {
        this.resourcesVpcConfig = resourcesVpcConfig;
    }

    /**
     * <p>
     * The VPC configuration used by the cluster control plane.
     * </p>
     * 
     * @return The VPC configuration used by the cluster control plane.
     */

    public AwsEksClusterResourcesVpcConfigDetails getResourcesVpcConfig() {
        return this.resourcesVpcConfig;
    }

    /**
     * <p>
     * The VPC configuration used by the cluster control plane.
     * </p>
     * 
     * @param resourcesVpcConfig
     *        The VPC configuration used by the cluster control plane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterDetails withResourcesVpcConfig(AwsEksClusterResourcesVpcConfigDetails resourcesVpcConfig) {
        setResourcesVpcConfig(resourcesVpcConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that provides permissions for the Amazon EKS control plane to make calls to Amazon Web
     * Services API operations on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that provides permissions for the Amazon EKS control plane to make calls to Amazon
     *        Web Services API operations on your behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that provides permissions for the Amazon EKS control plane to make calls to Amazon Web
     * Services API operations on your behalf.
     * </p>
     * 
     * @return The ARN of the IAM role that provides permissions for the Amazon EKS control plane to make calls to
     *         Amazon Web Services API operations on your behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that provides permissions for the Amazon EKS control plane to make calls to Amazon Web
     * Services API operations on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that provides permissions for the Amazon EKS control plane to make calls to Amazon
     *        Web Services API operations on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterDetails withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon EKS server version for the cluster.
     * </p>
     * 
     * @param version
     *        The Amazon EKS server version for the cluster.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The Amazon EKS server version for the cluster.
     * </p>
     * 
     * @return The Amazon EKS server version for the cluster.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The Amazon EKS server version for the cluster.
     * </p>
     * 
     * @param version
     *        The Amazon EKS server version for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterDetails withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The logging configuration for the cluster.
     * </p>
     * 
     * @param logging
     *        The logging configuration for the cluster.
     */

    public void setLogging(AwsEksClusterLoggingDetails logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * The logging configuration for the cluster.
     * </p>
     * 
     * @return The logging configuration for the cluster.
     */

    public AwsEksClusterLoggingDetails getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * The logging configuration for the cluster.
     * </p>
     * 
     * @param logging
     *        The logging configuration for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterDetails withLogging(AwsEksClusterLoggingDetails logging) {
        setLogging(logging);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCertificateAuthorityData() != null)
            sb.append("CertificateAuthorityData: ").append(getCertificateAuthorityData()).append(",");
        if (getClusterStatus() != null)
            sb.append("ClusterStatus: ").append(getClusterStatus()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourcesVpcConfig() != null)
            sb.append("ResourcesVpcConfig: ").append(getResourcesVpcConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEksClusterDetails == false)
            return false;
        AwsEksClusterDetails other = (AwsEksClusterDetails) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCertificateAuthorityData() == null ^ this.getCertificateAuthorityData() == null)
            return false;
        if (other.getCertificateAuthorityData() != null && other.getCertificateAuthorityData().equals(this.getCertificateAuthorityData()) == false)
            return false;
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null)
            return false;
        if (other.getClusterStatus() != null && other.getClusterStatus().equals(this.getClusterStatus()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourcesVpcConfig() == null ^ this.getResourcesVpcConfig() == null)
            return false;
        if (other.getResourcesVpcConfig() != null && other.getResourcesVpcConfig().equals(this.getResourcesVpcConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityData() == null) ? 0 : getCertificateAuthorityData().hashCode());
        hashCode = prime * hashCode + ((getClusterStatus() == null) ? 0 : getClusterStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourcesVpcConfig() == null) ? 0 : getResourcesVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        return hashCode;
    }

    @Override
    public AwsEksClusterDetails clone() {
        try {
            return (AwsEksClusterDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEksClusterDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

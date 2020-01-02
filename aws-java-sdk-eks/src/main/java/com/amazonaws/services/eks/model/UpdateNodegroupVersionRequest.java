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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNodegroupVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EKS cluster that is associated with the managed node group to update.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the managed node group to update.
     * </p>
     */
    private String nodegroupName;
    /**
     * <p>
     * The Kubernetes version to update to. If no version is specified, then the Kubernetes version of the node group
     * does not change. You can specify the Kubernetes version of the cluster to update the node group to the latest AMI
     * version of the cluster's Kubernetes version.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The AMI version of the Amazon EKS-optimized AMI to use for the update. By default, the latest available AMI
     * version for the node group's Kubernetes version is used. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     */
    private String releaseVersion;
    /**
     * <p>
     * Force the update if the existing node group's pods are unable to be drained due to a pod disruption budget issue.
     * If an update fails because pods could not be drained, you can force the update after it fails to terminate the
     * old node whether or not any pods are running on the node.
     * </p>
     */
    private Boolean force;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the Amazon EKS cluster that is associated with the managed node group to update.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that is associated with the managed node group to update.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that is associated with the managed node group to update.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster that is associated with the managed node group to update.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that is associated with the managed node group to update.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that is associated with the managed node group to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupVersionRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the managed node group to update.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the managed node group to update.
     */

    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    /**
     * <p>
     * The name of the managed node group to update.
     * </p>
     * 
     * @return The name of the managed node group to update.
     */

    public String getNodegroupName() {
        return this.nodegroupName;
    }

    /**
     * <p>
     * The name of the managed node group to update.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the managed node group to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupVersionRequest withNodegroupName(String nodegroupName) {
        setNodegroupName(nodegroupName);
        return this;
    }

    /**
     * <p>
     * The Kubernetes version to update to. If no version is specified, then the Kubernetes version of the node group
     * does not change. You can specify the Kubernetes version of the cluster to update the node group to the latest AMI
     * version of the cluster's Kubernetes version.
     * </p>
     * 
     * @param version
     *        The Kubernetes version to update to. If no version is specified, then the Kubernetes version of the node
     *        group does not change. You can specify the Kubernetes version of the cluster to update the node group to
     *        the latest AMI version of the cluster's Kubernetes version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The Kubernetes version to update to. If no version is specified, then the Kubernetes version of the node group
     * does not change. You can specify the Kubernetes version of the cluster to update the node group to the latest AMI
     * version of the cluster's Kubernetes version.
     * </p>
     * 
     * @return The Kubernetes version to update to. If no version is specified, then the Kubernetes version of the node
     *         group does not change. You can specify the Kubernetes version of the cluster to update the node group to
     *         the latest AMI version of the cluster's Kubernetes version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The Kubernetes version to update to. If no version is specified, then the Kubernetes version of the node group
     * does not change. You can specify the Kubernetes version of the cluster to update the node group to the latest AMI
     * version of the cluster's Kubernetes version.
     * </p>
     * 
     * @param version
     *        The Kubernetes version to update to. If no version is specified, then the Kubernetes version of the node
     *        group does not change. You can specify the Kubernetes version of the cluster to update the node group to
     *        the latest AMI version of the cluster's Kubernetes version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupVersionRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The AMI version of the Amazon EKS-optimized AMI to use for the update. By default, the latest available AMI
     * version for the node group's Kubernetes version is used. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param releaseVersion
     *        The AMI version of the Amazon EKS-optimized AMI to use for the update. By default, the latest available
     *        AMI version for the node group's Kubernetes version is used. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized
     *        Linux AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     */

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    /**
     * <p>
     * The AMI version of the Amazon EKS-optimized AMI to use for the update. By default, the latest available AMI
     * version for the node group's Kubernetes version is used. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @return The AMI version of the Amazon EKS-optimized AMI to use for the update. By default, the latest available
     *         AMI version for the node group's Kubernetes version is used. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized
     *         Linux AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     */

    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * <p>
     * The AMI version of the Amazon EKS-optimized AMI to use for the update. By default, the latest available AMI
     * version for the node group's Kubernetes version is used. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param releaseVersion
     *        The AMI version of the Amazon EKS-optimized AMI to use for the update. By default, the latest available
     *        AMI version for the node group's Kubernetes version is used. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized
     *        Linux AMI Versions </a> in the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupVersionRequest withReleaseVersion(String releaseVersion) {
        setReleaseVersion(releaseVersion);
        return this;
    }

    /**
     * <p>
     * Force the update if the existing node group's pods are unable to be drained due to a pod disruption budget issue.
     * If an update fails because pods could not be drained, you can force the update after it fails to terminate the
     * old node whether or not any pods are running on the node.
     * </p>
     * 
     * @param force
     *        Force the update if the existing node group's pods are unable to be drained due to a pod disruption budget
     *        issue. If an update fails because pods could not be drained, you can force the update after it fails to
     *        terminate the old node whether or not any pods are running on the node.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Force the update if the existing node group's pods are unable to be drained due to a pod disruption budget issue.
     * If an update fails because pods could not be drained, you can force the update after it fails to terminate the
     * old node whether or not any pods are running on the node.
     * </p>
     * 
     * @return Force the update if the existing node group's pods are unable to be drained due to a pod disruption
     *         budget issue. If an update fails because pods could not be drained, you can force the update after it
     *         fails to terminate the old node whether or not any pods are running on the node.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Force the update if the existing node group's pods are unable to be drained due to a pod disruption budget issue.
     * If an update fails because pods could not be drained, you can force the update after it fails to terminate the
     * old node whether or not any pods are running on the node.
     * </p>
     * 
     * @param force
     *        Force the update if the existing node group's pods are unable to be drained due to a pod disruption budget
     *        issue. If an update fails because pods could not be drained, you can force the update after it fails to
     *        terminate the old node whether or not any pods are running on the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNodegroupVersionRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Force the update if the existing node group's pods are unable to be drained due to a pod disruption budget issue.
     * If an update fails because pods could not be drained, you can force the update after it fails to terminate the
     * old node whether or not any pods are running on the node.
     * </p>
     * 
     * @return Force the update if the existing node group's pods are unable to be drained due to a pod disruption
     *         budget issue. If an update fails because pods could not be drained, you can force the update after it
     *         fails to terminate the old node whether or not any pods are running on the node.
     */

    public Boolean isForce() {
        return this.force;
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

    public UpdateNodegroupVersionRequest withClientRequestToken(String clientRequestToken) {
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getNodegroupName() != null)
            sb.append("NodegroupName: ").append(getNodegroupName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getReleaseVersion() != null)
            sb.append("ReleaseVersion: ").append(getReleaseVersion()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce()).append(",");
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

        if (obj instanceof UpdateNodegroupVersionRequest == false)
            return false;
        UpdateNodegroupVersionRequest other = (UpdateNodegroupVersionRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNodegroupName() == null ^ this.getNodegroupName() == null)
            return false;
        if (other.getNodegroupName() != null && other.getNodegroupName().equals(this.getNodegroupName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getReleaseVersion() == null ^ this.getReleaseVersion() == null)
            return false;
        if (other.getReleaseVersion() != null && other.getReleaseVersion().equals(this.getReleaseVersion()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
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

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNodegroupName() == null) ? 0 : getNodegroupName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getReleaseVersion() == null) ? 0 : getReleaseVersion().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNodegroupVersionRequest clone() {
        return (UpdateNodegroupVersionRequest) super.clone();
    }

}

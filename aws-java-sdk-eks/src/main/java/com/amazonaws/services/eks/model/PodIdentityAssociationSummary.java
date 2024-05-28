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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summarized description of the association.
 * </p>
 * <p>
 * Each summary is simplified by removing these fields compared to the full <code> <a>PodIdentityAssociation</a> </code>
 * :
 * </p>
 * <ul>
 * <li>
 * <p>
 * The IAM role: <code>roleArn</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * The timestamp that the association was created at: <code>createdAt</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * The tags on the association: <code>tags</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/PodIdentityAssociationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PodIdentityAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the cluster that the association is in.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster to create the association in. The service account and the
     * pods that use the service account must be in this namespace.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * </p>
     */
    private String serviceAccount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     */
    private String associationArn;
    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The name of the cluster that the association is in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the association is in.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the association is in.
     * </p>
     * 
     * @return The name of the cluster that the association is in.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the association is in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the association is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociationSummary withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster to create the association in. The service account and the
     * pods that use the service account must be in this namespace.
     * </p>
     * 
     * @param namespace
     *        The name of the Kubernetes namespace inside the cluster to create the association in. The service account
     *        and the pods that use the service account must be in this namespace.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster to create the association in. The service account and the
     * pods that use the service account must be in this namespace.
     * </p>
     * 
     * @return The name of the Kubernetes namespace inside the cluster to create the association in. The service account
     *         and the pods that use the service account must be in this namespace.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster to create the association in. The service account and the
     * pods that use the service account must be in this namespace.
     * </p>
     * 
     * @param namespace
     *        The name of the Kubernetes namespace inside the cluster to create the association in. The service account
     *        and the pods that use the service account must be in this namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociationSummary withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * </p>
     * 
     * @param serviceAccount
     *        The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     */

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * <p>
     * The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * </p>
     * 
     * @return The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     */

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * <p>
     * The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * </p>
     * 
     * @param serviceAccount
     *        The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociationSummary withServiceAccount(String serviceAccount) {
        setServiceAccount(serviceAccount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the association.
     */

    public void setAssociationArn(String associationArn) {
        this.associationArn = associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the association.
     */

    public String getAssociationArn() {
        return this.associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociationSummary withAssociationArn(String associationArn) {
        setAssociationArn(associationArn);
        return this;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociationSummary withAssociationId(String associationId) {
        setAssociationId(associationId);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getServiceAccount() != null)
            sb.append("ServiceAccount: ").append(getServiceAccount()).append(",");
        if (getAssociationArn() != null)
            sb.append("AssociationArn: ").append(getAssociationArn()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PodIdentityAssociationSummary == false)
            return false;
        PodIdentityAssociationSummary other = (PodIdentityAssociationSummary) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getServiceAccount() == null ^ this.getServiceAccount() == null)
            return false;
        if (other.getServiceAccount() != null && other.getServiceAccount().equals(this.getServiceAccount()) == false)
            return false;
        if (other.getAssociationArn() == null ^ this.getAssociationArn() == null)
            return false;
        if (other.getAssociationArn() != null && other.getAssociationArn().equals(this.getAssociationArn()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getServiceAccount() == null) ? 0 : getServiceAccount().hashCode());
        hashCode = prime * hashCode + ((getAssociationArn() == null) ? 0 : getAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public PodIdentityAssociationSummary clone() {
        try {
            return (PodIdentityAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.PodIdentityAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

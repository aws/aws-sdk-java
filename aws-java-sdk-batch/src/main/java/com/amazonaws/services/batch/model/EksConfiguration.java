/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for the Amazon EKS cluster that supports the Batch compute environment. The cluster must exist before
 * the compute environment can be created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EKS cluster. An example is
     * <code>arn:<i>aws</i>:eks:<i>us-east-1</i>:<i>123456789012</i>:cluster/<i>ClusterForBatch</i> </code>.
     * </p>
     */
    private String eksClusterArn;
    /**
     * <p>
     * The namespace of the Amazon EKS cluster. Batch manages pods in this namespace. The value can't left empty or
     * null. It must be fewer than 64 characters long, can't be set to <code>default</code>, can't start with "
     * <code>kube-</code>," and must match this regular expression: <code>^[a-z0-9]([-a-z0-9]*[a-z0-9])?$</code>. For
     * more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/">Namespaces</a> in the
     * Kubernetes documentation.
     * </p>
     */
    private String kubernetesNamespace;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EKS cluster. An example is
     * <code>arn:<i>aws</i>:eks:<i>us-east-1</i>:<i>123456789012</i>:cluster/<i>ClusterForBatch</i> </code>.
     * </p>
     * 
     * @param eksClusterArn
     *        The Amazon Resource Name (ARN) of the Amazon EKS cluster. An example is
     *        <code>arn:<i>aws</i>:eks:<i>us-east-1</i>:<i>123456789012</i>:cluster/<i>ClusterForBatch</i> </code>.
     */

    public void setEksClusterArn(String eksClusterArn) {
        this.eksClusterArn = eksClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EKS cluster. An example is
     * <code>arn:<i>aws</i>:eks:<i>us-east-1</i>:<i>123456789012</i>:cluster/<i>ClusterForBatch</i> </code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon EKS cluster. An example is
     *         <code>arn:<i>aws</i>:eks:<i>us-east-1</i>:<i>123456789012</i>:cluster/<i>ClusterForBatch</i> </code>.
     */

    public String getEksClusterArn() {
        return this.eksClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EKS cluster. An example is
     * <code>arn:<i>aws</i>:eks:<i>us-east-1</i>:<i>123456789012</i>:cluster/<i>ClusterForBatch</i> </code>.
     * </p>
     * 
     * @param eksClusterArn
     *        The Amazon Resource Name (ARN) of the Amazon EKS cluster. An example is
     *        <code>arn:<i>aws</i>:eks:<i>us-east-1</i>:<i>123456789012</i>:cluster/<i>ClusterForBatch</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksConfiguration withEksClusterArn(String eksClusterArn) {
        setEksClusterArn(eksClusterArn);
        return this;
    }

    /**
     * <p>
     * The namespace of the Amazon EKS cluster. Batch manages pods in this namespace. The value can't left empty or
     * null. It must be fewer than 64 characters long, can't be set to <code>default</code>, can't start with "
     * <code>kube-</code>," and must match this regular expression: <code>^[a-z0-9]([-a-z0-9]*[a-z0-9])?$</code>. For
     * more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/">Namespaces</a> in the
     * Kubernetes documentation.
     * </p>
     * 
     * @param kubernetesNamespace
     *        The namespace of the Amazon EKS cluster. Batch manages pods in this namespace. The value can't left empty
     *        or null. It must be fewer than 64 characters long, can't be set to <code>default</code>, can't start with
     *        "<code>kube-</code>," and must match this regular expression: <code>^[a-z0-9]([-a-z0-9]*[a-z0-9])?$</code>
     *        . For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/">Namespaces</a> in the
     *        Kubernetes documentation.
     */

    public void setKubernetesNamespace(String kubernetesNamespace) {
        this.kubernetesNamespace = kubernetesNamespace;
    }

    /**
     * <p>
     * The namespace of the Amazon EKS cluster. Batch manages pods in this namespace. The value can't left empty or
     * null. It must be fewer than 64 characters long, can't be set to <code>default</code>, can't start with "
     * <code>kube-</code>," and must match this regular expression: <code>^[a-z0-9]([-a-z0-9]*[a-z0-9])?$</code>. For
     * more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/">Namespaces</a> in the
     * Kubernetes documentation.
     * </p>
     * 
     * @return The namespace of the Amazon EKS cluster. Batch manages pods in this namespace. The value can't left empty
     *         or null. It must be fewer than 64 characters long, can't be set to <code>default</code>, can't start with
     *         "<code>kube-</code>," and must match this regular expression:
     *         <code>^[a-z0-9]([-a-z0-9]*[a-z0-9])?$</code>. For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/">Namespaces</a> in
     *         the Kubernetes documentation.
     */

    public String getKubernetesNamespace() {
        return this.kubernetesNamespace;
    }

    /**
     * <p>
     * The namespace of the Amazon EKS cluster. Batch manages pods in this namespace. The value can't left empty or
     * null. It must be fewer than 64 characters long, can't be set to <code>default</code>, can't start with "
     * <code>kube-</code>," and must match this regular expression: <code>^[a-z0-9]([-a-z0-9]*[a-z0-9])?$</code>. For
     * more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/">Namespaces</a> in the
     * Kubernetes documentation.
     * </p>
     * 
     * @param kubernetesNamespace
     *        The namespace of the Amazon EKS cluster. Batch manages pods in this namespace. The value can't left empty
     *        or null. It must be fewer than 64 characters long, can't be set to <code>default</code>, can't start with
     *        "<code>kube-</code>," and must match this regular expression: <code>^[a-z0-9]([-a-z0-9]*[a-z0-9])?$</code>
     *        . For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/">Namespaces</a> in the
     *        Kubernetes documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksConfiguration withKubernetesNamespace(String kubernetesNamespace) {
        setKubernetesNamespace(kubernetesNamespace);
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
        if (getEksClusterArn() != null)
            sb.append("EksClusterArn: ").append(getEksClusterArn()).append(",");
        if (getKubernetesNamespace() != null)
            sb.append("KubernetesNamespace: ").append(getKubernetesNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksConfiguration == false)
            return false;
        EksConfiguration other = (EksConfiguration) obj;
        if (other.getEksClusterArn() == null ^ this.getEksClusterArn() == null)
            return false;
        if (other.getEksClusterArn() != null && other.getEksClusterArn().equals(this.getEksClusterArn()) == false)
            return false;
        if (other.getKubernetesNamespace() == null ^ this.getKubernetesNamespace() == null)
            return false;
        if (other.getKubernetesNamespace() != null && other.getKubernetesNamespace().equals(this.getKubernetesNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEksClusterArn() == null) ? 0 : getEksClusterArn().hashCode());
        hashCode = prime * hashCode + ((getKubernetesNamespace() == null) ? 0 : getKubernetesNamespace().hashCode());
        return hashCode;
    }

    @Override
    public EksConfiguration clone() {
        try {
            return (EksConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

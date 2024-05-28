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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Namespace inputs for the system job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/SecureNamespaceInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecureNamespaceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon EKS cluster where Amazon EMR on EKS jobs run.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The namespace of the Amazon EKS cluster where the system jobs run.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The ID of the Amazon EKS cluster where Amazon EMR on EKS jobs run.
     * </p>
     * 
     * @param clusterId
     *        The ID of the Amazon EKS cluster where Amazon EMR on EKS jobs run.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The ID of the Amazon EKS cluster where Amazon EMR on EKS jobs run.
     * </p>
     * 
     * @return The ID of the Amazon EKS cluster where Amazon EMR on EKS jobs run.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The ID of the Amazon EKS cluster where Amazon EMR on EKS jobs run.
     * </p>
     * 
     * @param clusterId
     *        The ID of the Amazon EKS cluster where Amazon EMR on EKS jobs run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecureNamespaceInfo withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The namespace of the Amazon EKS cluster where the system jobs run.
     * </p>
     * 
     * @param namespace
     *        The namespace of the Amazon EKS cluster where the system jobs run.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the Amazon EKS cluster where the system jobs run.
     * </p>
     * 
     * @return The namespace of the Amazon EKS cluster where the system jobs run.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the Amazon EKS cluster where the system jobs run.
     * </p>
     * 
     * @param namespace
     *        The namespace of the Amazon EKS cluster where the system jobs run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecureNamespaceInfo withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecureNamespaceInfo == false)
            return false;
        SecureNamespaceInfo other = (SecureNamespaceInfo) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public SecureNamespaceInfo clone() {
        try {
            return (SecureNamespaceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.SecureNamespaceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

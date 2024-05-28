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
package com.amazonaws.services.eksauth.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing the name of the Kubernetes service account inside the cluster to associate the IAM credentials
 * with.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-auth-2023-11-26/Subject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subject implements Serializable, Cloneable, StructuredPojo {

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

    public Subject withNamespace(String namespace) {
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

    public Subject withServiceAccount(String serviceAccount) {
        setServiceAccount(serviceAccount);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getServiceAccount() != null)
            sb.append("ServiceAccount: ").append(getServiceAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subject == false)
            return false;
        Subject other = (Subject) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getServiceAccount() == null ^ this.getServiceAccount() == null)
            return false;
        if (other.getServiceAccount() != null && other.getServiceAccount().equals(this.getServiceAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getServiceAccount() == null) ? 0 : getServiceAccount().hashCode());
        return hashCode;
    }

    @Override
    public Subject clone() {
        try {
            return (Subject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eksauth.model.transform.SubjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

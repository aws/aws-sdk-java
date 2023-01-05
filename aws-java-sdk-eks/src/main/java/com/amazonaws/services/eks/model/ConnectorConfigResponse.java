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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The full description of your connected cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ConnectorConfigResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorConfigResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique ID associated with the cluster for registration purposes.
     * </p>
     */
    private String activationId;
    /**
     * <p>
     * A unique code associated with the cluster for registration purposes.
     * </p>
     */
    private String activationCode;
    /**
     * <p>
     * The expiration time of the connected cluster. The cluster's YAML file must be applied through the native
     * provider.
     * </p>
     */
    private java.util.Date activationExpiry;
    /**
     * <p>
     * The cluster's cloud service provider.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to communicate with services from the connected Kubernetes cluster.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * A unique ID associated with the cluster for registration purposes.
     * </p>
     * 
     * @param activationId
     *        A unique ID associated with the cluster for registration purposes.
     */

    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    /**
     * <p>
     * A unique ID associated with the cluster for registration purposes.
     * </p>
     * 
     * @return A unique ID associated with the cluster for registration purposes.
     */

    public String getActivationId() {
        return this.activationId;
    }

    /**
     * <p>
     * A unique ID associated with the cluster for registration purposes.
     * </p>
     * 
     * @param activationId
     *        A unique ID associated with the cluster for registration purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfigResponse withActivationId(String activationId) {
        setActivationId(activationId);
        return this;
    }

    /**
     * <p>
     * A unique code associated with the cluster for registration purposes.
     * </p>
     * 
     * @param activationCode
     *        A unique code associated with the cluster for registration purposes.
     */

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    /**
     * <p>
     * A unique code associated with the cluster for registration purposes.
     * </p>
     * 
     * @return A unique code associated with the cluster for registration purposes.
     */

    public String getActivationCode() {
        return this.activationCode;
    }

    /**
     * <p>
     * A unique code associated with the cluster for registration purposes.
     * </p>
     * 
     * @param activationCode
     *        A unique code associated with the cluster for registration purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfigResponse withActivationCode(String activationCode) {
        setActivationCode(activationCode);
        return this;
    }

    /**
     * <p>
     * The expiration time of the connected cluster. The cluster's YAML file must be applied through the native
     * provider.
     * </p>
     * 
     * @param activationExpiry
     *        The expiration time of the connected cluster. The cluster's YAML file must be applied through the native
     *        provider.
     */

    public void setActivationExpiry(java.util.Date activationExpiry) {
        this.activationExpiry = activationExpiry;
    }

    /**
     * <p>
     * The expiration time of the connected cluster. The cluster's YAML file must be applied through the native
     * provider.
     * </p>
     * 
     * @return The expiration time of the connected cluster. The cluster's YAML file must be applied through the native
     *         provider.
     */

    public java.util.Date getActivationExpiry() {
        return this.activationExpiry;
    }

    /**
     * <p>
     * The expiration time of the connected cluster. The cluster's YAML file must be applied through the native
     * provider.
     * </p>
     * 
     * @param activationExpiry
     *        The expiration time of the connected cluster. The cluster's YAML file must be applied through the native
     *        provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfigResponse withActivationExpiry(java.util.Date activationExpiry) {
        setActivationExpiry(activationExpiry);
        return this;
    }

    /**
     * <p>
     * The cluster's cloud service provider.
     * </p>
     * 
     * @param provider
     *        The cluster's cloud service provider.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The cluster's cloud service provider.
     * </p>
     * 
     * @return The cluster's cloud service provider.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The cluster's cloud service provider.
     * </p>
     * 
     * @param provider
     *        The cluster's cloud service provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfigResponse withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to communicate with services from the connected Kubernetes cluster.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to communicate with services from the connected Kubernetes
     *        cluster.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to communicate with services from the connected Kubernetes cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role to communicate with services from the connected Kubernetes
     *         cluster.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to communicate with services from the connected Kubernetes cluster.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to communicate with services from the connected Kubernetes
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfigResponse withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getActivationId() != null)
            sb.append("ActivationId: ").append(getActivationId()).append(",");
        if (getActivationCode() != null)
            sb.append("ActivationCode: ").append(getActivationCode()).append(",");
        if (getActivationExpiry() != null)
            sb.append("ActivationExpiry: ").append(getActivationExpiry()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorConfigResponse == false)
            return false;
        ConnectorConfigResponse other = (ConnectorConfigResponse) obj;
        if (other.getActivationId() == null ^ this.getActivationId() == null)
            return false;
        if (other.getActivationId() != null && other.getActivationId().equals(this.getActivationId()) == false)
            return false;
        if (other.getActivationCode() == null ^ this.getActivationCode() == null)
            return false;
        if (other.getActivationCode() != null && other.getActivationCode().equals(this.getActivationCode()) == false)
            return false;
        if (other.getActivationExpiry() == null ^ this.getActivationExpiry() == null)
            return false;
        if (other.getActivationExpiry() != null && other.getActivationExpiry().equals(this.getActivationExpiry()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationId() == null) ? 0 : getActivationId().hashCode());
        hashCode = prime * hashCode + ((getActivationCode() == null) ? 0 : getActivationCode().hashCode());
        hashCode = prime * hashCode + ((getActivationExpiry() == null) ? 0 : getActivationExpiry().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorConfigResponse clone() {
        try {
            return (ConnectorConfigResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.ConnectorConfigResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

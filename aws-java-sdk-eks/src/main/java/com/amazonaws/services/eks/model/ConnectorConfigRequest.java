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
 * The configuration sent to a cluster for configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ConnectorConfigRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorConfigRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that is authorized to request the connector configuration.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The cloud provider for the target cluster to connect.
     * </p>
     */
    private String provider;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that is authorized to request the connector configuration.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that is authorized to request the connector configuration.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that is authorized to request the connector configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that is authorized to request the connector configuration.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that is authorized to request the connector configuration.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that is authorized to request the connector configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorConfigRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The cloud provider for the target cluster to connect.
     * </p>
     * 
     * @param provider
     *        The cloud provider for the target cluster to connect.
     * @see ConnectorConfigProvider
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The cloud provider for the target cluster to connect.
     * </p>
     * 
     * @return The cloud provider for the target cluster to connect.
     * @see ConnectorConfigProvider
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The cloud provider for the target cluster to connect.
     * </p>
     * 
     * @param provider
     *        The cloud provider for the target cluster to connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorConfigProvider
     */

    public ConnectorConfigRequest withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The cloud provider for the target cluster to connect.
     * </p>
     * 
     * @param provider
     *        The cloud provider for the target cluster to connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorConfigProvider
     */

    public ConnectorConfigRequest withProvider(ConnectorConfigProvider provider) {
        this.provider = provider.toString();
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorConfigRequest == false)
            return false;
        ConnectorConfigRequest other = (ConnectorConfigRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorConfigRequest clone() {
        try {
            return (ConnectorConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.ConnectorConfigRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the network resources in the order.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/OrderedResourceDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderedResourceDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The duration and renewal status of the commitment period for each radio unit in the order. Does not show details
     * if the resource type is DEVICE_IDENTIFIER.
     * </p>
     */
    private CommitmentConfiguration commitmentConfiguration;
    /**
     * <p>
     * The number of network resources in the order.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The type of network resource in the order.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The duration and renewal status of the commitment period for each radio unit in the order. Does not show details
     * if the resource type is DEVICE_IDENTIFIER.
     * </p>
     * 
     * @param commitmentConfiguration
     *        The duration and renewal status of the commitment period for each radio unit in the order. Does not show
     *        details if the resource type is DEVICE_IDENTIFIER.
     */

    public void setCommitmentConfiguration(CommitmentConfiguration commitmentConfiguration) {
        this.commitmentConfiguration = commitmentConfiguration;
    }

    /**
     * <p>
     * The duration and renewal status of the commitment period for each radio unit in the order. Does not show details
     * if the resource type is DEVICE_IDENTIFIER.
     * </p>
     * 
     * @return The duration and renewal status of the commitment period for each radio unit in the order. Does not show
     *         details if the resource type is DEVICE_IDENTIFIER.
     */

    public CommitmentConfiguration getCommitmentConfiguration() {
        return this.commitmentConfiguration;
    }

    /**
     * <p>
     * The duration and renewal status of the commitment period for each radio unit in the order. Does not show details
     * if the resource type is DEVICE_IDENTIFIER.
     * </p>
     * 
     * @param commitmentConfiguration
     *        The duration and renewal status of the commitment period for each radio unit in the order. Does not show
     *        details if the resource type is DEVICE_IDENTIFIER.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderedResourceDefinition withCommitmentConfiguration(CommitmentConfiguration commitmentConfiguration) {
        setCommitmentConfiguration(commitmentConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of network resources in the order.
     * </p>
     * 
     * @param count
     *        The number of network resources in the order.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of network resources in the order.
     * </p>
     * 
     * @return The number of network resources in the order.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of network resources in the order.
     * </p>
     * 
     * @param count
     *        The number of network resources in the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderedResourceDefinition withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The type of network resource in the order.
     * </p>
     * 
     * @param type
     *        The type of network resource in the order.
     * @see NetworkResourceDefinitionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of network resource in the order.
     * </p>
     * 
     * @return The type of network resource in the order.
     * @see NetworkResourceDefinitionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of network resource in the order.
     * </p>
     * 
     * @param type
     *        The type of network resource in the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkResourceDefinitionType
     */

    public OrderedResourceDefinition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of network resource in the order.
     * </p>
     * 
     * @param type
     *        The type of network resource in the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkResourceDefinitionType
     */

    public OrderedResourceDefinition withType(NetworkResourceDefinitionType type) {
        this.type = type.toString();
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
        if (getCommitmentConfiguration() != null)
            sb.append("CommitmentConfiguration: ").append(getCommitmentConfiguration()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderedResourceDefinition == false)
            return false;
        OrderedResourceDefinition other = (OrderedResourceDefinition) obj;
        if (other.getCommitmentConfiguration() == null ^ this.getCommitmentConfiguration() == null)
            return false;
        if (other.getCommitmentConfiguration() != null && other.getCommitmentConfiguration().equals(this.getCommitmentConfiguration()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitmentConfiguration() == null) ? 0 : getCommitmentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public OrderedResourceDefinition clone() {
        try {
            return (OrderedResourceDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.OrderedResourceDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

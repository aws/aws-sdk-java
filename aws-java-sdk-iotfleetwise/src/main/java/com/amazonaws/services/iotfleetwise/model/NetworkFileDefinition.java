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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifications for defining a vehicle network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/NetworkFileDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFileDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information, including CAN DBC files, about the configurations used to create a decoder manifest.
     * </p>
     */
    private CanDbcDefinition canDbc;

    /**
     * <p>
     * Information, including CAN DBC files, about the configurations used to create a decoder manifest.
     * </p>
     * 
     * @param canDbc
     *        Information, including CAN DBC files, about the configurations used to create a decoder manifest.
     */

    public void setCanDbc(CanDbcDefinition canDbc) {
        this.canDbc = canDbc;
    }

    /**
     * <p>
     * Information, including CAN DBC files, about the configurations used to create a decoder manifest.
     * </p>
     * 
     * @return Information, including CAN DBC files, about the configurations used to create a decoder manifest.
     */

    public CanDbcDefinition getCanDbc() {
        return this.canDbc;
    }

    /**
     * <p>
     * Information, including CAN DBC files, about the configurations used to create a decoder manifest.
     * </p>
     * 
     * @param canDbc
     *        Information, including CAN DBC files, about the configurations used to create a decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFileDefinition withCanDbc(CanDbcDefinition canDbc) {
        setCanDbc(canDbc);
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
        if (getCanDbc() != null)
            sb.append("CanDbc: ").append(getCanDbc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkFileDefinition == false)
            return false;
        NetworkFileDefinition other = (NetworkFileDefinition) obj;
        if (other.getCanDbc() == null ^ this.getCanDbc() == null)
            return false;
        if (other.getCanDbc() != null && other.getCanDbc().equals(this.getCanDbc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanDbc() == null) ? 0 : getCanDbc().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFileDefinition clone() {
        try {
            return (NetworkFileDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.NetworkFileDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

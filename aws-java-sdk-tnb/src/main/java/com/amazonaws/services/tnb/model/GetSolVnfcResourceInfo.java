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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of resource associated with a network function.
 * </p>
 * <p>
 * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
 * life-cycle operations (like terminate, update, and delete) can be performed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolVnfcResourceInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolVnfcResourceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metadata of the network function compute.
     * </p>
     */
    private GetSolVnfcResourceInfoMetadata metadata;

    /**
     * <p>
     * The metadata of the network function compute.
     * </p>
     * 
     * @param metadata
     *        The metadata of the network function compute.
     */

    public void setMetadata(GetSolVnfcResourceInfoMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the network function compute.
     * </p>
     * 
     * @return The metadata of the network function compute.
     */

    public GetSolVnfcResourceInfoMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of the network function compute.
     * </p>
     * 
     * @param metadata
     *        The metadata of the network function compute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolVnfcResourceInfo withMetadata(GetSolVnfcResourceInfoMetadata metadata) {
        setMetadata(metadata);
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
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolVnfcResourceInfo == false)
            return false;
        GetSolVnfcResourceInfo other = (GetSolVnfcResourceInfo) obj;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetSolVnfcResourceInfo clone() {
        try {
            return (GetSolVnfcResourceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.GetSolVnfcResourceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

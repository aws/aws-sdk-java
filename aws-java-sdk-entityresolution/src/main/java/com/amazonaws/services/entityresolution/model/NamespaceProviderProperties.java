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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing <code>ProviderConfiguration</code> and <code>ProviderServiceArn</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/NamespaceProviderProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamespaceProviderProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the provider service.
     * </p>
     */
    private String providerServiceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the provider service.
     * </p>
     * 
     * @param providerServiceArn
     *        The Amazon Resource Name (ARN) of the provider service.
     */

    public void setProviderServiceArn(String providerServiceArn) {
        this.providerServiceArn = providerServiceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the provider service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the provider service.
     */

    public String getProviderServiceArn() {
        return this.providerServiceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the provider service.
     * </p>
     * 
     * @param providerServiceArn
     *        The Amazon Resource Name (ARN) of the provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceProviderProperties withProviderServiceArn(String providerServiceArn) {
        setProviderServiceArn(providerServiceArn);
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
        if (getProviderServiceArn() != null)
            sb.append("ProviderServiceArn: ").append(getProviderServiceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NamespaceProviderProperties == false)
            return false;
        NamespaceProviderProperties other = (NamespaceProviderProperties) obj;
        if (other.getProviderServiceArn() == null ^ this.getProviderServiceArn() == null)
            return false;
        if (other.getProviderServiceArn() != null && other.getProviderServiceArn().equals(this.getProviderServiceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderServiceArn() == null) ? 0 : getProviderServiceArn().hashCode());
        return hashCode;
    }

    @Override
    public NamespaceProviderProperties clone() {
        try {
            return (NamespaceProviderProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.NamespaceProviderPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

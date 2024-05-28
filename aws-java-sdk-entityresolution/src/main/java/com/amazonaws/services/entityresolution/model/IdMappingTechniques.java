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
 * An object which defines the ID mapping techniques and provider configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/IdMappingTechniques"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdMappingTechniques implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     */
    private String idMappingType;
    /**
     * <p>
     * An object which defines any additional configurations required by the provider service.
     * </p>
     */
    private ProviderProperties providerProperties;

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     * 
     * @param idMappingType
     *        The type of ID mapping.
     * @see IdMappingType
     */

    public void setIdMappingType(String idMappingType) {
        this.idMappingType = idMappingType;
    }

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     * 
     * @return The type of ID mapping.
     * @see IdMappingType
     */

    public String getIdMappingType() {
        return this.idMappingType;
    }

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     * 
     * @param idMappingType
     *        The type of ID mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdMappingType
     */

    public IdMappingTechniques withIdMappingType(String idMappingType) {
        setIdMappingType(idMappingType);
        return this;
    }

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     * 
     * @param idMappingType
     *        The type of ID mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdMappingType
     */

    public IdMappingTechniques withIdMappingType(IdMappingType idMappingType) {
        this.idMappingType = idMappingType.toString();
        return this;
    }

    /**
     * <p>
     * An object which defines any additional configurations required by the provider service.
     * </p>
     * 
     * @param providerProperties
     *        An object which defines any additional configurations required by the provider service.
     */

    public void setProviderProperties(ProviderProperties providerProperties) {
        this.providerProperties = providerProperties;
    }

    /**
     * <p>
     * An object which defines any additional configurations required by the provider service.
     * </p>
     * 
     * @return An object which defines any additional configurations required by the provider service.
     */

    public ProviderProperties getProviderProperties() {
        return this.providerProperties;
    }

    /**
     * <p>
     * An object which defines any additional configurations required by the provider service.
     * </p>
     * 
     * @param providerProperties
     *        An object which defines any additional configurations required by the provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingTechniques withProviderProperties(ProviderProperties providerProperties) {
        setProviderProperties(providerProperties);
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
        if (getIdMappingType() != null)
            sb.append("IdMappingType: ").append(getIdMappingType()).append(",");
        if (getProviderProperties() != null)
            sb.append("ProviderProperties: ").append(getProviderProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdMappingTechniques == false)
            return false;
        IdMappingTechniques other = (IdMappingTechniques) obj;
        if (other.getIdMappingType() == null ^ this.getIdMappingType() == null)
            return false;
        if (other.getIdMappingType() != null && other.getIdMappingType().equals(this.getIdMappingType()) == false)
            return false;
        if (other.getProviderProperties() == null ^ this.getProviderProperties() == null)
            return false;
        if (other.getProviderProperties() != null && other.getProviderProperties().equals(this.getProviderProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdMappingType() == null) ? 0 : getIdMappingType().hashCode());
        hashCode = prime * hashCode + ((getProviderProperties() == null) ? 0 : getProviderProperties().hashCode());
        return hashCode;
    }

    @Override
    public IdMappingTechniques clone() {
        try {
            return (IdMappingTechniques) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.IdMappingTechniquesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updated properties for the private DNS namespace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/PrivateDnsNamespaceChange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateDnsNamespaceChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An updated description for the private DNS namespace.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Properties to be updated in the private DNS namespace.
     * </p>
     */
    private PrivateDnsNamespacePropertiesChange properties;

    /**
     * <p>
     * An updated description for the private DNS namespace.
     * </p>
     * 
     * @param description
     *        An updated description for the private DNS namespace.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An updated description for the private DNS namespace.
     * </p>
     * 
     * @return An updated description for the private DNS namespace.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An updated description for the private DNS namespace.
     * </p>
     * 
     * @param description
     *        An updated description for the private DNS namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateDnsNamespaceChange withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Properties to be updated in the private DNS namespace.
     * </p>
     * 
     * @param properties
     *        Properties to be updated in the private DNS namespace.
     */

    public void setProperties(PrivateDnsNamespacePropertiesChange properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * Properties to be updated in the private DNS namespace.
     * </p>
     * 
     * @return Properties to be updated in the private DNS namespace.
     */

    public PrivateDnsNamespacePropertiesChange getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * Properties to be updated in the private DNS namespace.
     * </p>
     * 
     * @param properties
     *        Properties to be updated in the private DNS namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateDnsNamespaceChange withProperties(PrivateDnsNamespacePropertiesChange properties) {
        setProperties(properties);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateDnsNamespaceChange == false)
            return false;
        PrivateDnsNamespaceChange other = (PrivateDnsNamespaceChange) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public PrivateDnsNamespaceChange clone() {
        try {
            return (PrivateDnsNamespaceChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.PrivateDnsNamespaceChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

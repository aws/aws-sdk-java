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
package com.amazonaws.services.cloudcontrolapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about a provisioned resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ResourceDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The primary identifier for the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * A list of the resource properties and their current values.
     * </p>
     */
    private String properties;

    /**
     * <p>
     * The primary identifier for the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @param identifier
     *        The primary identifier for the resource.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     *        resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The primary identifier for the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @return The primary identifier for the resource.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     *         resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The primary identifier for the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @param identifier
     *        The primary identifier for the resource.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     *        resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDescription withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * A list of the resource properties and their current values.
     * </p>
     * 
     * @param properties
     *        A list of the resource properties and their current values.
     */

    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A list of the resource properties and their current values.
     * </p>
     * 
     * @return A list of the resource properties and their current values.
     */

    public String getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * A list of the resource properties and their current values.
     * </p>
     * 
     * @param properties
     *        A list of the resource properties and their current values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDescription withProperties(String properties) {
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDescription == false)
            return false;
        ResourceDescription other = (ResourceDescription) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDescription clone() {
        try {
            return (ResourceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudcontrolapi.model.transform.ResourceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

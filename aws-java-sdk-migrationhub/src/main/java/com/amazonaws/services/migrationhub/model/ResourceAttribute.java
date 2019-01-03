/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attribute associated with a resource.
 * </p>
 * <p>
 * Note the corresponding format required per type listed below:
 * </p>
 * <dl>
 * <dt>IPV4</dt>
 * <dd>
 * <p>
 * <code>x.x.x.x</code>
 * </p>
 * <p>
 * <i>where x is an integer in the range [0,255]</i>
 * </p>
 * </dd>
 * <dt>IPV6</dt>
 * <dd>
 * <p>
 * <code>y : y : y : y : y : y : y : y</code>
 * </p>
 * <p>
 * <i>where y is a hexadecimal between 0 and FFFF. [0, FFFF]</i>
 * </p>
 * </dd>
 * <dt>MAC_ADDRESS</dt>
 * <dd>
 * <p>
 * <code>^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$</code>
 * </p>
 * </dd>
 * <dt>FQDN</dt>
 * <dd>
 * <p>
 * <code>^[^&lt;&gt;{}\\\\/?,=\\p{Cntrl}]{1,256}$</code>
 * </p>
 * </dd>
 * </dl>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ResourceAttribute" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of resource.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Value of the resource type.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @param type
     *        Type of resource.
     * @see ResourceAttributeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @return Type of resource.
     * @see ResourceAttributeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @param type
     *        Type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttributeType
     */

    public ResourceAttribute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @param type
     *        Type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttributeType
     */

    public ResourceAttribute withType(ResourceAttributeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Value of the resource type.
     * </p>
     * 
     * @param value
     *        Value of the resource type.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Value of the resource type.
     * </p>
     * 
     * @return Value of the resource type.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Value of the resource type.
     * </p>
     * 
     * @param value
     *        Value of the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceAttribute withValue(String value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceAttribute == false)
            return false;
        ResourceAttribute other = (ResourceAttribute) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ResourceAttribute clone() {
        try {
            return (ResourceAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhub.model.transform.ResourceAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

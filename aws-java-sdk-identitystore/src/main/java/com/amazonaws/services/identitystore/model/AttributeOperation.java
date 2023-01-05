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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An operation that applies to the requested group. This operation might add, replace, or remove an attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/AttributeOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string representation of the path to a given attribute or sub-attribute. Supports JMESPath.
     * </p>
     */
    private String attributePath;

    /**
     * <p>
     * A string representation of the path to a given attribute or sub-attribute. Supports JMESPath.
     * </p>
     * 
     * @param attributePath
     *        A string representation of the path to a given attribute or sub-attribute. Supports JMESPath.
     */

    public void setAttributePath(String attributePath) {
        this.attributePath = attributePath;
    }

    /**
     * <p>
     * A string representation of the path to a given attribute or sub-attribute. Supports JMESPath.
     * </p>
     * 
     * @return A string representation of the path to a given attribute or sub-attribute. Supports JMESPath.
     */

    public String getAttributePath() {
        return this.attributePath;
    }

    /**
     * <p>
     * A string representation of the path to a given attribute or sub-attribute. Supports JMESPath.
     * </p>
     * 
     * @param attributePath
     *        A string representation of the path to a given attribute or sub-attribute. Supports JMESPath.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeOperation withAttributePath(String attributePath) {
        setAttributePath(attributePath);
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
        if (getAttributePath() != null)
            sb.append("AttributePath: ").append(getAttributePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeOperation == false)
            return false;
        AttributeOperation other = (AttributeOperation) obj;
        if (other.getAttributePath() == null ^ this.getAttributePath() == null)
            return false;
        if (other.getAttributePath() != null && other.getAttributePath().equals(this.getAttributePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributePath() == null) ? 0 : getAttributePath().hashCode());
        return hashCode;
    }

    @Override
    public AttributeOperation clone() {
        try {
            return (AttributeOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.identitystore.model.transform.AttributeOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

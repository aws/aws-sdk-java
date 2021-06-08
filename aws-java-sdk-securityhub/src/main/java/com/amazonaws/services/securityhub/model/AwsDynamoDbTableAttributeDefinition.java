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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a definition of an attribute for the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableAttributeDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableAttributeDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The type of the attribute.
     * </p>
     */
    private String attributeType;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @return The name of the attribute.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableAttributeDefinition withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The type of the attribute.
     * </p>
     * 
     * @param attributeType
     *        The type of the attribute.
     */

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The type of the attribute.
     * </p>
     * 
     * @return The type of the attribute.
     */

    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * <p>
     * The type of the attribute.
     * </p>
     * 
     * @param attributeType
     *        The type of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableAttributeDefinition withAttributeType(String attributeType) {
        setAttributeType(attributeType);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeType() != null)
            sb.append("AttributeType: ").append(getAttributeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableAttributeDefinition == false)
            return false;
        AwsDynamoDbTableAttributeDefinition other = (AwsDynamoDbTableAttributeDefinition) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableAttributeDefinition clone() {
        try {
            return (AwsDynamoDbTableAttributeDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableAttributeDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

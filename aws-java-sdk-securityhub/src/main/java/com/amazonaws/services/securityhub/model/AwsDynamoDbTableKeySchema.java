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
 * A component of the key schema for the DynamoDB table, a global secondary index, or a local secondary index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableKeySchema"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableKeySchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the key schema attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The type of key used for the key schema attribute.
     * </p>
     */
    private String keyType;

    /**
     * <p>
     * The name of the key schema attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the key schema attribute.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the key schema attribute.
     * </p>
     * 
     * @return The name of the key schema attribute.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the key schema attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the key schema attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableKeySchema withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The type of key used for the key schema attribute.
     * </p>
     * 
     * @param keyType
     *        The type of key used for the key schema attribute.
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * The type of key used for the key schema attribute.
     * </p>
     * 
     * @return The type of key used for the key schema attribute.
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * The type of key used for the key schema attribute.
     * </p>
     * 
     * @param keyType
     *        The type of key used for the key schema attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableKeySchema withKeyType(String keyType) {
        setKeyType(keyType);
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
        if (getKeyType() != null)
            sb.append("KeyType: ").append(getKeyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableKeySchema == false)
            return false;
        AwsDynamoDbTableKeySchema other = (AwsDynamoDbTableKeySchema) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableKeySchema clone() {
        try {
            return (AwsDynamoDbTableKeySchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableKeySchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

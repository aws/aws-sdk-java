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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the data schema used with the given dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DatasetSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * </p>
     */
    private String inlineDataSchema;

    /**
     * <p>
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param inlineDataSchema
     */

    public void setInlineDataSchema(String inlineDataSchema) {
        this.inlineDataSchema = inlineDataSchema;
    }

    /**
     * <p>
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return
     */

    public String getInlineDataSchema() {
        return this.inlineDataSchema;
    }

    /**
     * <p>
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param inlineDataSchema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSchema withInlineDataSchema(String inlineDataSchema) {
        setInlineDataSchema(inlineDataSchema);
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
        if (getInlineDataSchema() != null)
            sb.append("InlineDataSchema: ").append(getInlineDataSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetSchema == false)
            return false;
        DatasetSchema other = (DatasetSchema) obj;
        if (other.getInlineDataSchema() == null ^ this.getInlineDataSchema() == null)
            return false;
        if (other.getInlineDataSchema() != null && other.getInlineDataSchema().equals(this.getInlineDataSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInlineDataSchema() == null) ? 0 : getInlineDataSchema().hashCode());
        return hashCode;
    }

    @Override
    public DatasetSchema clone() {
        try {
            return (DatasetSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.DatasetSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

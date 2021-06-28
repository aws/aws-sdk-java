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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CheckSchemaVersionValidity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckSchemaVersionValidityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     */
    private String dataFormat;
    /**
     * <p>
     * The definition of the schema that has to be validated.
     * </p>
     */
    private String schemaDefinition;

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * @see DataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @return The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are
     *         supported.
     * @see DataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public CheckSchemaVersionValidityRequest withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public CheckSchemaVersionValidityRequest withDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The definition of the schema that has to be validated.
     * </p>
     * 
     * @param schemaDefinition
     *        The definition of the schema that has to be validated.
     */

    public void setSchemaDefinition(String schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    /**
     * <p>
     * The definition of the schema that has to be validated.
     * </p>
     * 
     * @return The definition of the schema that has to be validated.
     */

    public String getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * <p>
     * The definition of the schema that has to be validated.
     * </p>
     * 
     * @param schemaDefinition
     *        The definition of the schema that has to be validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSchemaVersionValidityRequest withSchemaDefinition(String schemaDefinition) {
        setSchemaDefinition(schemaDefinition);
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
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getSchemaDefinition() != null)
            sb.append("SchemaDefinition: ").append(getSchemaDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckSchemaVersionValidityRequest == false)
            return false;
        CheckSchemaVersionValidityRequest other = (CheckSchemaVersionValidityRequest) obj;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getSchemaDefinition() == null ^ this.getSchemaDefinition() == null)
            return false;
        if (other.getSchemaDefinition() != null && other.getSchemaDefinition().equals(this.getSchemaDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getSchemaDefinition() == null) ? 0 : getSchemaDefinition().hashCode());
        return hashCode;
    }

    @Override
    public CheckSchemaVersionValidityRequest clone() {
        return (CheckSchemaVersionValidityRequest) super.clone();
    }

}

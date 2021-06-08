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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration information of the Parquet format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ParquetConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParquetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information needed to define a schema.
     * </p>
     */
    private SchemaDefinition schemaDefinition;

    /**
     * <p>
     * Information needed to define a schema.
     * </p>
     * 
     * @param schemaDefinition
     *        Information needed to define a schema.
     */

    public void setSchemaDefinition(SchemaDefinition schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    /**
     * <p>
     * Information needed to define a schema.
     * </p>
     * 
     * @return Information needed to define a schema.
     */

    public SchemaDefinition getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * <p>
     * Information needed to define a schema.
     * </p>
     * 
     * @param schemaDefinition
     *        Information needed to define a schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParquetConfiguration withSchemaDefinition(SchemaDefinition schemaDefinition) {
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

        if (obj instanceof ParquetConfiguration == false)
            return false;
        ParquetConfiguration other = (ParquetConfiguration) obj;
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

        hashCode = prime * hashCode + ((getSchemaDefinition() == null) ? 0 : getSchemaDefinition().hashCode());
        return hashCode;
    }

    @Override
    public ParquetConfiguration clone() {
        try {
            return (ParquetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.ParquetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

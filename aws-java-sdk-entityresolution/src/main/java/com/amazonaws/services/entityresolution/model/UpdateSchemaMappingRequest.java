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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateSchemaMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSchemaMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the schema.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information that Entity Resolution uses for matching.
     * </p>
     */
    private java.util.List<SchemaInputAttribute> mappedInputFields;
    /**
     * <p>
     * The name of the schema. There can't be multiple <code>SchemaMappings</code> with the same name.
     * </p>
     */
    private String schemaName;

    /**
     * <p>
     * A description of the schema.
     * </p>
     * 
     * @param description
     *        A description of the schema.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the schema.
     * </p>
     * 
     * @return A description of the schema.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the schema.
     * </p>
     * 
     * @param description
     *        A description of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaMappingRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information that Entity Resolution uses for matching.
     * </p>
     * 
     * @return A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the
     *         source data table, and contains column name plus additional information that Entity Resolution uses for
     *         matching.
     */

    public java.util.List<SchemaInputAttribute> getMappedInputFields() {
        return mappedInputFields;
    }

    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information that Entity Resolution uses for matching.
     * </p>
     * 
     * @param mappedInputFields
     *        A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the
     *        source data table, and contains column name plus additional information that Entity Resolution uses for
     *        matching.
     */

    public void setMappedInputFields(java.util.Collection<SchemaInputAttribute> mappedInputFields) {
        if (mappedInputFields == null) {
            this.mappedInputFields = null;
            return;
        }

        this.mappedInputFields = new java.util.ArrayList<SchemaInputAttribute>(mappedInputFields);
    }

    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information that Entity Resolution uses for matching.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMappedInputFields(java.util.Collection)} or {@link #withMappedInputFields(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param mappedInputFields
     *        A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the
     *        source data table, and contains column name plus additional information that Entity Resolution uses for
     *        matching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaMappingRequest withMappedInputFields(SchemaInputAttribute... mappedInputFields) {
        if (this.mappedInputFields == null) {
            setMappedInputFields(new java.util.ArrayList<SchemaInputAttribute>(mappedInputFields.length));
        }
        for (SchemaInputAttribute ele : mappedInputFields) {
            this.mappedInputFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the source
     * data table, and contains column name plus additional information that Entity Resolution uses for matching.
     * </p>
     * 
     * @param mappedInputFields
     *        A list of <code>MappedInputFields</code>. Each <code>MappedInputField</code> corresponds to a column the
     *        source data table, and contains column name plus additional information that Entity Resolution uses for
     *        matching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaMappingRequest withMappedInputFields(java.util.Collection<SchemaInputAttribute> mappedInputFields) {
        setMappedInputFields(mappedInputFields);
        return this;
    }

    /**
     * <p>
     * The name of the schema. There can't be multiple <code>SchemaMappings</code> with the same name.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema. There can't be multiple <code>SchemaMappings</code> with the same name.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema. There can't be multiple <code>SchemaMappings</code> with the same name.
     * </p>
     * 
     * @return The name of the schema. There can't be multiple <code>SchemaMappings</code> with the same name.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema. There can't be multiple <code>SchemaMappings</code> with the same name.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema. There can't be multiple <code>SchemaMappings</code> with the same name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaMappingRequest withSchemaName(String schemaName) {
        setSchemaName(schemaName);
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
        if (getMappedInputFields() != null)
            sb.append("MappedInputFields: ").append(getMappedInputFields()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSchemaMappingRequest == false)
            return false;
        UpdateSchemaMappingRequest other = (UpdateSchemaMappingRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMappedInputFields() == null ^ this.getMappedInputFields() == null)
            return false;
        if (other.getMappedInputFields() != null && other.getMappedInputFields().equals(this.getMappedInputFields()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMappedInputFields() == null) ? 0 : getMappedInputFields().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSchemaMappingRequest clone() {
        return (UpdateSchemaMappingRequest) super.clone();
    }

}

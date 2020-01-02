/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/SearchSchemaSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchSchemaSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the registry.
     * </p>
     */
    private String registryName;
    /**
     * <p>
     * The ARN of the schema.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name of the schema.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     */
    private java.util.List<SearchSchemaVersionSummary> schemaVersions;

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @param registryName
     *        The name of the registry.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @return The name of the registry.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @param registryName
     *        The name of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSchemaSummary withRegistryName(String registryName) {
        setRegistryName(registryName);
        return this;
    }

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     * 
     * @return The ARN of the schema.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSchemaSummary withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @return The name of the schema.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSchemaSummary withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * 
     * @return An array of schema version summaries.
     */

    public java.util.List<SearchSchemaVersionSummary> getSchemaVersions() {
        return schemaVersions;
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * 
     * @param schemaVersions
     *        An array of schema version summaries.
     */

    public void setSchemaVersions(java.util.Collection<SearchSchemaVersionSummary> schemaVersions) {
        if (schemaVersions == null) {
            this.schemaVersions = null;
            return;
        }

        this.schemaVersions = new java.util.ArrayList<SearchSchemaVersionSummary>(schemaVersions);
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaVersions(java.util.Collection)} or {@link #withSchemaVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param schemaVersions
     *        An array of schema version summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSchemaSummary withSchemaVersions(SearchSchemaVersionSummary... schemaVersions) {
        if (this.schemaVersions == null) {
            setSchemaVersions(new java.util.ArrayList<SearchSchemaVersionSummary>(schemaVersions.length));
        }
        for (SearchSchemaVersionSummary ele : schemaVersions) {
            this.schemaVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * 
     * @param schemaVersions
     *        An array of schema version summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSchemaSummary withSchemaVersions(java.util.Collection<SearchSchemaVersionSummary> schemaVersions) {
        setSchemaVersions(schemaVersions);
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
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getSchemaVersions() != null)
            sb.append("SchemaVersions: ").append(getSchemaVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSchemaSummary == false)
            return false;
        SearchSchemaSummary other = (SearchSchemaSummary) obj;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getSchemaVersions() == null ^ this.getSchemaVersions() == null)
            return false;
        if (other.getSchemaVersions() != null && other.getSchemaVersions().equals(this.getSchemaVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersions() == null) ? 0 : getSchemaVersions().hashCode());
        return hashCode;
    }

    @Override
    public SearchSchemaSummary clone() {
        try {
            return (SearchSchemaSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.schemas.model.transform.SearchSchemaSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

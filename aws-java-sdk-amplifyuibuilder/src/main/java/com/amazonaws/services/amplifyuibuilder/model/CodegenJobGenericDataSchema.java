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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the data schema for a code generation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CodegenJobGenericDataSchema"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenJobGenericDataSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the data source for the schema. Currently, the only valid value is an Amplify <code>DataStore</code>.
     * </p>
     */
    private String dataSourceType;
    /**
     * <p>
     * The name of a <code>CodegenGenericDataModel</code>.
     * </p>
     */
    private java.util.Map<String, CodegenGenericDataModel> models;
    /**
     * <p>
     * The name of a <code>CodegenGenericDataEnum</code>.
     * </p>
     */
    private java.util.Map<String, CodegenGenericDataEnum> enums;
    /**
     * <p>
     * The name of a <code>CodegenGenericDataNonModel</code>.
     * </p>
     */
    private java.util.Map<String, CodegenGenericDataNonModel> nonModels;

    /**
     * <p>
     * The type of the data source for the schema. Currently, the only valid value is an Amplify <code>DataStore</code>.
     * </p>
     * 
     * @param dataSourceType
     *        The type of the data source for the schema. Currently, the only valid value is an Amplify
     *        <code>DataStore</code>.
     * @see CodegenJobGenericDataSourceType
     */

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    /**
     * <p>
     * The type of the data source for the schema. Currently, the only valid value is an Amplify <code>DataStore</code>.
     * </p>
     * 
     * @return The type of the data source for the schema. Currently, the only valid value is an Amplify
     *         <code>DataStore</code>.
     * @see CodegenJobGenericDataSourceType
     */

    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * <p>
     * The type of the data source for the schema. Currently, the only valid value is an Amplify <code>DataStore</code>.
     * </p>
     * 
     * @param dataSourceType
     *        The type of the data source for the schema. Currently, the only valid value is an Amplify
     *        <code>DataStore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodegenJobGenericDataSourceType
     */

    public CodegenJobGenericDataSchema withDataSourceType(String dataSourceType) {
        setDataSourceType(dataSourceType);
        return this;
    }

    /**
     * <p>
     * The type of the data source for the schema. Currently, the only valid value is an Amplify <code>DataStore</code>.
     * </p>
     * 
     * @param dataSourceType
     *        The type of the data source for the schema. Currently, the only valid value is an Amplify
     *        <code>DataStore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodegenJobGenericDataSourceType
     */

    public CodegenJobGenericDataSchema withDataSourceType(CodegenJobGenericDataSourceType dataSourceType) {
        this.dataSourceType = dataSourceType.toString();
        return this;
    }

    /**
     * <p>
     * The name of a <code>CodegenGenericDataModel</code>.
     * </p>
     * 
     * @return The name of a <code>CodegenGenericDataModel</code>.
     */

    public java.util.Map<String, CodegenGenericDataModel> getModels() {
        return models;
    }

    /**
     * <p>
     * The name of a <code>CodegenGenericDataModel</code>.
     * </p>
     * 
     * @param models
     *        The name of a <code>CodegenGenericDataModel</code>.
     */

    public void setModels(java.util.Map<String, CodegenGenericDataModel> models) {
        this.models = models;
    }

    /**
     * <p>
     * The name of a <code>CodegenGenericDataModel</code>.
     * </p>
     * 
     * @param models
     *        The name of a <code>CodegenGenericDataModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobGenericDataSchema withModels(java.util.Map<String, CodegenGenericDataModel> models) {
        setModels(models);
        return this;
    }

    /**
     * Add a single Models entry
     *
     * @see CodegenJobGenericDataSchema#withModels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobGenericDataSchema addModelsEntry(String key, CodegenGenericDataModel value) {
        if (null == this.models) {
            this.models = new java.util.HashMap<String, CodegenGenericDataModel>();
        }
        if (this.models.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.models.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Models.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobGenericDataSchema clearModelsEntries() {
        this.models = null;
        return this;
    }

    /**
     * <p>
     * The name of a <code>CodegenGenericDataEnum</code>.
     * </p>
     * 
     * @return The name of a <code>CodegenGenericDataEnum</code>.
     */

    public java.util.Map<String, CodegenGenericDataEnum> getEnums() {
        return enums;
    }

    /**
     * <p>
     * The name of a <code>CodegenGenericDataEnum</code>.
     * </p>
     * 
     * @param enums
     *        The name of a <code>CodegenGenericDataEnum</code>.
     */

    public void setEnums(java.util.Map<String, CodegenGenericDataEnum> enums) {
        this.enums = enums;
    }

    /**
     * <p>
     * The name of a <code>CodegenGenericDataEnum</code>.
     * </p>
     * 
     * @param enums
     *        The name of a <code>CodegenGenericDataEnum</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobGenericDataSchema withEnums(java.util.Map<String, CodegenGenericDataEnum> enums) {
        setEnums(enums);
        return this;
    }

    /**
     * Add a single Enums entry
     *
     * @see CodegenJobGenericDataSchema#withEnums
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobGenericDataSchema addEnumsEntry(String key, CodegenGenericDataEnum value) {
        if (null == this.enums) {
            this.enums = new java.util.HashMap<String, CodegenGenericDataEnum>();
        }
        if (this.enums.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.enums.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Enums.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobGenericDataSchema clearEnumsEntries() {
        this.enums = null;
        return this;
    }

    /**
     * <p>
     * The name of a <code>CodegenGenericDataNonModel</code>.
     * </p>
     * 
     * @return The name of a <code>CodegenGenericDataNonModel</code>.
     */

    public java.util.Map<String, CodegenGenericDataNonModel> getNonModels() {
        return nonModels;
    }

    /**
     * <p>
     * The name of a <code>CodegenGenericDataNonModel</code>.
     * </p>
     * 
     * @param nonModels
     *        The name of a <code>CodegenGenericDataNonModel</code>.
     */

    public void setNonModels(java.util.Map<String, CodegenGenericDataNonModel> nonModels) {
        this.nonModels = nonModels;
    }

    /**
     * <p>
     * The name of a <code>CodegenGenericDataNonModel</code>.
     * </p>
     * 
     * @param nonModels
     *        The name of a <code>CodegenGenericDataNonModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobGenericDataSchema withNonModels(java.util.Map<String, CodegenGenericDataNonModel> nonModels) {
        setNonModels(nonModels);
        return this;
    }

    /**
     * Add a single NonModels entry
     *
     * @see CodegenJobGenericDataSchema#withNonModels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobGenericDataSchema addNonModelsEntry(String key, CodegenGenericDataNonModel value) {
        if (null == this.nonModels) {
            this.nonModels = new java.util.HashMap<String, CodegenGenericDataNonModel>();
        }
        if (this.nonModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.nonModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into NonModels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobGenericDataSchema clearNonModelsEntries() {
        this.nonModels = null;
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
        if (getDataSourceType() != null)
            sb.append("DataSourceType: ").append(getDataSourceType()).append(",");
        if (getModels() != null)
            sb.append("Models: ").append(getModels()).append(",");
        if (getEnums() != null)
            sb.append("Enums: ").append(getEnums()).append(",");
        if (getNonModels() != null)
            sb.append("NonModels: ").append(getNonModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodegenJobGenericDataSchema == false)
            return false;
        CodegenJobGenericDataSchema other = (CodegenJobGenericDataSchema) obj;
        if (other.getDataSourceType() == null ^ this.getDataSourceType() == null)
            return false;
        if (other.getDataSourceType() != null && other.getDataSourceType().equals(this.getDataSourceType()) == false)
            return false;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        if (other.getEnums() == null ^ this.getEnums() == null)
            return false;
        if (other.getEnums() != null && other.getEnums().equals(this.getEnums()) == false)
            return false;
        if (other.getNonModels() == null ^ this.getNonModels() == null)
            return false;
        if (other.getNonModels() != null && other.getNonModels().equals(this.getNonModels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceType() == null) ? 0 : getDataSourceType().hashCode());
        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        hashCode = prime * hashCode + ((getEnums() == null) ? 0 : getEnums().hashCode());
        hashCode = prime * hashCode + ((getNonModels() == null) ? 0 : getNonModels().hashCode());
        return hashCode;
    }

    @Override
    public CodegenJobGenericDataSchema clone() {
        try {
            return (CodegenJobGenericDataSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.CodegenJobGenericDataSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

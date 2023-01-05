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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updates and saves all of the information about a form, based on form ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateFormData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFormData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>FormCTA</code> object that stores the call to action configuration for the form.
     * </p>
     */
    private FormCTA cta;
    /**
     * <p>
     * The type of data source to use to create the form.
     * </p>
     */
    private FormDataTypeConfig dataType;
    /**
     * <p>
     * The configuration information for the form's fields.
     * </p>
     */
    private java.util.Map<String, FieldConfig> fields;
    /**
     * <p>
     * Specifies whether to perform a create or update action on the form.
     * </p>
     */
    private String formActionType;
    /**
     * <p>
     * The name of the form.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The schema version of the form.
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * The configuration information for the visual helper elements for the form. These elements are not associated with
     * any data.
     * </p>
     */
    private java.util.Map<String, SectionalElement> sectionalElements;
    /**
     * <p>
     * The configuration for the form's style.
     * </p>
     */
    private FormStyle style;

    /**
     * <p>
     * The <code>FormCTA</code> object that stores the call to action configuration for the form.
     * </p>
     * 
     * @param cta
     *        The <code>FormCTA</code> object that stores the call to action configuration for the form.
     */

    public void setCta(FormCTA cta) {
        this.cta = cta;
    }

    /**
     * <p>
     * The <code>FormCTA</code> object that stores the call to action configuration for the form.
     * </p>
     * 
     * @return The <code>FormCTA</code> object that stores the call to action configuration for the form.
     */

    public FormCTA getCta() {
        return this.cta;
    }

    /**
     * <p>
     * The <code>FormCTA</code> object that stores the call to action configuration for the form.
     * </p>
     * 
     * @param cta
     *        The <code>FormCTA</code> object that stores the call to action configuration for the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData withCta(FormCTA cta) {
        setCta(cta);
        return this;
    }

    /**
     * <p>
     * The type of data source to use to create the form.
     * </p>
     * 
     * @param dataType
     *        The type of data source to use to create the form.
     */

    public void setDataType(FormDataTypeConfig dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The type of data source to use to create the form.
     * </p>
     * 
     * @return The type of data source to use to create the form.
     */

    public FormDataTypeConfig getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The type of data source to use to create the form.
     * </p>
     * 
     * @param dataType
     *        The type of data source to use to create the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData withDataType(FormDataTypeConfig dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The configuration information for the form's fields.
     * </p>
     * 
     * @return The configuration information for the form's fields.
     */

    public java.util.Map<String, FieldConfig> getFields() {
        return fields;
    }

    /**
     * <p>
     * The configuration information for the form's fields.
     * </p>
     * 
     * @param fields
     *        The configuration information for the form's fields.
     */

    public void setFields(java.util.Map<String, FieldConfig> fields) {
        this.fields = fields;
    }

    /**
     * <p>
     * The configuration information for the form's fields.
     * </p>
     * 
     * @param fields
     *        The configuration information for the form's fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData withFields(java.util.Map<String, FieldConfig> fields) {
        setFields(fields);
        return this;
    }

    /**
     * Add a single Fields entry
     *
     * @see UpdateFormData#withFields
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData addFieldsEntry(String key, FieldConfig value) {
        if (null == this.fields) {
            this.fields = new java.util.HashMap<String, FieldConfig>();
        }
        if (this.fields.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.fields.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Fields.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData clearFieldsEntries() {
        this.fields = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether to perform a create or update action on the form.
     * </p>
     * 
     * @param formActionType
     *        Specifies whether to perform a create or update action on the form.
     * @see FormActionType
     */

    public void setFormActionType(String formActionType) {
        this.formActionType = formActionType;
    }

    /**
     * <p>
     * Specifies whether to perform a create or update action on the form.
     * </p>
     * 
     * @return Specifies whether to perform a create or update action on the form.
     * @see FormActionType
     */

    public String getFormActionType() {
        return this.formActionType;
    }

    /**
     * <p>
     * Specifies whether to perform a create or update action on the form.
     * </p>
     * 
     * @param formActionType
     *        Specifies whether to perform a create or update action on the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormActionType
     */

    public UpdateFormData withFormActionType(String formActionType) {
        setFormActionType(formActionType);
        return this;
    }

    /**
     * <p>
     * Specifies whether to perform a create or update action on the form.
     * </p>
     * 
     * @param formActionType
     *        Specifies whether to perform a create or update action on the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormActionType
     */

    public UpdateFormData withFormActionType(FormActionType formActionType) {
        this.formActionType = formActionType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the form.
     * </p>
     * 
     * @param name
     *        The name of the form.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the form.
     * </p>
     * 
     * @return The name of the form.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the form.
     * </p>
     * 
     * @param name
     *        The name of the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The schema version of the form.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of the form.
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version of the form.
     * </p>
     * 
     * @return The schema version of the form.
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version of the form.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The configuration information for the visual helper elements for the form. These elements are not associated with
     * any data.
     * </p>
     * 
     * @return The configuration information for the visual helper elements for the form. These elements are not
     *         associated with any data.
     */

    public java.util.Map<String, SectionalElement> getSectionalElements() {
        return sectionalElements;
    }

    /**
     * <p>
     * The configuration information for the visual helper elements for the form. These elements are not associated with
     * any data.
     * </p>
     * 
     * @param sectionalElements
     *        The configuration information for the visual helper elements for the form. These elements are not
     *        associated with any data.
     */

    public void setSectionalElements(java.util.Map<String, SectionalElement> sectionalElements) {
        this.sectionalElements = sectionalElements;
    }

    /**
     * <p>
     * The configuration information for the visual helper elements for the form. These elements are not associated with
     * any data.
     * </p>
     * 
     * @param sectionalElements
     *        The configuration information for the visual helper elements for the form. These elements are not
     *        associated with any data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData withSectionalElements(java.util.Map<String, SectionalElement> sectionalElements) {
        setSectionalElements(sectionalElements);
        return this;
    }

    /**
     * Add a single SectionalElements entry
     *
     * @see UpdateFormData#withSectionalElements
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData addSectionalElementsEntry(String key, SectionalElement value) {
        if (null == this.sectionalElements) {
            this.sectionalElements = new java.util.HashMap<String, SectionalElement>();
        }
        if (this.sectionalElements.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sectionalElements.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SectionalElements.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData clearSectionalElementsEntries() {
        this.sectionalElements = null;
        return this;
    }

    /**
     * <p>
     * The configuration for the form's style.
     * </p>
     * 
     * @param style
     *        The configuration for the form's style.
     */

    public void setStyle(FormStyle style) {
        this.style = style;
    }

    /**
     * <p>
     * The configuration for the form's style.
     * </p>
     * 
     * @return The configuration for the form's style.
     */

    public FormStyle getStyle() {
        return this.style;
    }

    /**
     * <p>
     * The configuration for the form's style.
     * </p>
     * 
     * @param style
     *        The configuration for the form's style.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormData withStyle(FormStyle style) {
        setStyle(style);
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
        if (getCta() != null)
            sb.append("Cta: ").append(getCta()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getFormActionType() != null)
            sb.append("FormActionType: ").append(getFormActionType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getSectionalElements() != null)
            sb.append("SectionalElements: ").append(getSectionalElements()).append(",");
        if (getStyle() != null)
            sb.append("Style: ").append(getStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFormData == false)
            return false;
        UpdateFormData other = (UpdateFormData) obj;
        if (other.getCta() == null ^ this.getCta() == null)
            return false;
        if (other.getCta() != null && other.getCta().equals(this.getCta()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getFormActionType() == null ^ this.getFormActionType() == null)
            return false;
        if (other.getFormActionType() != null && other.getFormActionType().equals(this.getFormActionType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getSectionalElements() == null ^ this.getSectionalElements() == null)
            return false;
        if (other.getSectionalElements() != null && other.getSectionalElements().equals(this.getSectionalElements()) == false)
            return false;
        if (other.getStyle() == null ^ this.getStyle() == null)
            return false;
        if (other.getStyle() != null && other.getStyle().equals(this.getStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCta() == null) ? 0 : getCta().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getFormActionType() == null) ? 0 : getFormActionType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getSectionalElements() == null) ? 0 : getSectionalElements().hashCode());
        hashCode = prime * hashCode + ((getStyle() == null) ? 0 : getStyle().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFormData clone() {
        try {
            return (UpdateFormData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.UpdateFormDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

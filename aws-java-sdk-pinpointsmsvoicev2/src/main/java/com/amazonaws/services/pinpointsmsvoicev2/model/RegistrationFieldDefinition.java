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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a description of the specified field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RegistrationFieldDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationFieldDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The section path of the field.
     * </p>
     */
    private String sectionPath;
    /**
     * <p>
     * The path to the registration form field. You can use <a>DescribeRegistrationFieldDefinitions</a> for a list of
     * <b>FieldPaths</b>.
     * </p>
     */
    private String fieldPath;
    /**
     * <p>
     * The type of field.
     * </p>
     */
    private String fieldType;
    /**
     * <p>
     * Specifies if the field for the registration form is required, conditional or optional.
     * </p>
     */
    private String fieldRequirement;
    /**
     * <p>
     * The validation rules for a select field.
     * </p>
     */
    private SelectValidation selectValidation;
    /**
     * <p>
     * The validation rules for a text field.
     * </p>
     */
    private TextValidation textValidation;
    /**
     * <p>
     * An array of RegistrationFieldDisplayHints objects for the field.
     * </p>
     */
    private RegistrationFieldDisplayHints displayHints;

    /**
     * <p>
     * The section path of the field.
     * </p>
     * 
     * @param sectionPath
     *        The section path of the field.
     */

    public void setSectionPath(String sectionPath) {
        this.sectionPath = sectionPath;
    }

    /**
     * <p>
     * The section path of the field.
     * </p>
     * 
     * @return The section path of the field.
     */

    public String getSectionPath() {
        return this.sectionPath;
    }

    /**
     * <p>
     * The section path of the field.
     * </p>
     * 
     * @param sectionPath
     *        The section path of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationFieldDefinition withSectionPath(String sectionPath) {
        setSectionPath(sectionPath);
        return this;
    }

    /**
     * <p>
     * The path to the registration form field. You can use <a>DescribeRegistrationFieldDefinitions</a> for a list of
     * <b>FieldPaths</b>.
     * </p>
     * 
     * @param fieldPath
     *        The path to the registration form field. You can use <a>DescribeRegistrationFieldDefinitions</a> for a
     *        list of <b>FieldPaths</b>.
     */

    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * <p>
     * The path to the registration form field. You can use <a>DescribeRegistrationFieldDefinitions</a> for a list of
     * <b>FieldPaths</b>.
     * </p>
     * 
     * @return The path to the registration form field. You can use <a>DescribeRegistrationFieldDefinitions</a> for a
     *         list of <b>FieldPaths</b>.
     */

    public String getFieldPath() {
        return this.fieldPath;
    }

    /**
     * <p>
     * The path to the registration form field. You can use <a>DescribeRegistrationFieldDefinitions</a> for a list of
     * <b>FieldPaths</b>.
     * </p>
     * 
     * @param fieldPath
     *        The path to the registration form field. You can use <a>DescribeRegistrationFieldDefinitions</a> for a
     *        list of <b>FieldPaths</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationFieldDefinition withFieldPath(String fieldPath) {
        setFieldPath(fieldPath);
        return this;
    }

    /**
     * <p>
     * The type of field.
     * </p>
     * 
     * @param fieldType
     *        The type of field.
     * @see FieldType
     */

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    /**
     * <p>
     * The type of field.
     * </p>
     * 
     * @return The type of field.
     * @see FieldType
     */

    public String getFieldType() {
        return this.fieldType;
    }

    /**
     * <p>
     * The type of field.
     * </p>
     * 
     * @param fieldType
     *        The type of field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public RegistrationFieldDefinition withFieldType(String fieldType) {
        setFieldType(fieldType);
        return this;
    }

    /**
     * <p>
     * The type of field.
     * </p>
     * 
     * @param fieldType
     *        The type of field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public RegistrationFieldDefinition withFieldType(FieldType fieldType) {
        this.fieldType = fieldType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies if the field for the registration form is required, conditional or optional.
     * </p>
     * 
     * @param fieldRequirement
     *        Specifies if the field for the registration form is required, conditional or optional.
     * @see FieldRequirement
     */

    public void setFieldRequirement(String fieldRequirement) {
        this.fieldRequirement = fieldRequirement;
    }

    /**
     * <p>
     * Specifies if the field for the registration form is required, conditional or optional.
     * </p>
     * 
     * @return Specifies if the field for the registration form is required, conditional or optional.
     * @see FieldRequirement
     */

    public String getFieldRequirement() {
        return this.fieldRequirement;
    }

    /**
     * <p>
     * Specifies if the field for the registration form is required, conditional or optional.
     * </p>
     * 
     * @param fieldRequirement
     *        Specifies if the field for the registration form is required, conditional or optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldRequirement
     */

    public RegistrationFieldDefinition withFieldRequirement(String fieldRequirement) {
        setFieldRequirement(fieldRequirement);
        return this;
    }

    /**
     * <p>
     * Specifies if the field for the registration form is required, conditional or optional.
     * </p>
     * 
     * @param fieldRequirement
     *        Specifies if the field for the registration form is required, conditional or optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldRequirement
     */

    public RegistrationFieldDefinition withFieldRequirement(FieldRequirement fieldRequirement) {
        this.fieldRequirement = fieldRequirement.toString();
        return this;
    }

    /**
     * <p>
     * The validation rules for a select field.
     * </p>
     * 
     * @param selectValidation
     *        The validation rules for a select field.
     */

    public void setSelectValidation(SelectValidation selectValidation) {
        this.selectValidation = selectValidation;
    }

    /**
     * <p>
     * The validation rules for a select field.
     * </p>
     * 
     * @return The validation rules for a select field.
     */

    public SelectValidation getSelectValidation() {
        return this.selectValidation;
    }

    /**
     * <p>
     * The validation rules for a select field.
     * </p>
     * 
     * @param selectValidation
     *        The validation rules for a select field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationFieldDefinition withSelectValidation(SelectValidation selectValidation) {
        setSelectValidation(selectValidation);
        return this;
    }

    /**
     * <p>
     * The validation rules for a text field.
     * </p>
     * 
     * @param textValidation
     *        The validation rules for a text field.
     */

    public void setTextValidation(TextValidation textValidation) {
        this.textValidation = textValidation;
    }

    /**
     * <p>
     * The validation rules for a text field.
     * </p>
     * 
     * @return The validation rules for a text field.
     */

    public TextValidation getTextValidation() {
        return this.textValidation;
    }

    /**
     * <p>
     * The validation rules for a text field.
     * </p>
     * 
     * @param textValidation
     *        The validation rules for a text field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationFieldDefinition withTextValidation(TextValidation textValidation) {
        setTextValidation(textValidation);
        return this;
    }

    /**
     * <p>
     * An array of RegistrationFieldDisplayHints objects for the field.
     * </p>
     * 
     * @param displayHints
     *        An array of RegistrationFieldDisplayHints objects for the field.
     */

    public void setDisplayHints(RegistrationFieldDisplayHints displayHints) {
        this.displayHints = displayHints;
    }

    /**
     * <p>
     * An array of RegistrationFieldDisplayHints objects for the field.
     * </p>
     * 
     * @return An array of RegistrationFieldDisplayHints objects for the field.
     */

    public RegistrationFieldDisplayHints getDisplayHints() {
        return this.displayHints;
    }

    /**
     * <p>
     * An array of RegistrationFieldDisplayHints objects for the field.
     * </p>
     * 
     * @param displayHints
     *        An array of RegistrationFieldDisplayHints objects for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationFieldDefinition withDisplayHints(RegistrationFieldDisplayHints displayHints) {
        setDisplayHints(displayHints);
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
        if (getSectionPath() != null)
            sb.append("SectionPath: ").append(getSectionPath()).append(",");
        if (getFieldPath() != null)
            sb.append("FieldPath: ").append(getFieldPath()).append(",");
        if (getFieldType() != null)
            sb.append("FieldType: ").append(getFieldType()).append(",");
        if (getFieldRequirement() != null)
            sb.append("FieldRequirement: ").append(getFieldRequirement()).append(",");
        if (getSelectValidation() != null)
            sb.append("SelectValidation: ").append(getSelectValidation()).append(",");
        if (getTextValidation() != null)
            sb.append("TextValidation: ").append(getTextValidation()).append(",");
        if (getDisplayHints() != null)
            sb.append("DisplayHints: ").append(getDisplayHints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistrationFieldDefinition == false)
            return false;
        RegistrationFieldDefinition other = (RegistrationFieldDefinition) obj;
        if (other.getSectionPath() == null ^ this.getSectionPath() == null)
            return false;
        if (other.getSectionPath() != null && other.getSectionPath().equals(this.getSectionPath()) == false)
            return false;
        if (other.getFieldPath() == null ^ this.getFieldPath() == null)
            return false;
        if (other.getFieldPath() != null && other.getFieldPath().equals(this.getFieldPath()) == false)
            return false;
        if (other.getFieldType() == null ^ this.getFieldType() == null)
            return false;
        if (other.getFieldType() != null && other.getFieldType().equals(this.getFieldType()) == false)
            return false;
        if (other.getFieldRequirement() == null ^ this.getFieldRequirement() == null)
            return false;
        if (other.getFieldRequirement() != null && other.getFieldRequirement().equals(this.getFieldRequirement()) == false)
            return false;
        if (other.getSelectValidation() == null ^ this.getSelectValidation() == null)
            return false;
        if (other.getSelectValidation() != null && other.getSelectValidation().equals(this.getSelectValidation()) == false)
            return false;
        if (other.getTextValidation() == null ^ this.getTextValidation() == null)
            return false;
        if (other.getTextValidation() != null && other.getTextValidation().equals(this.getTextValidation()) == false)
            return false;
        if (other.getDisplayHints() == null ^ this.getDisplayHints() == null)
            return false;
        if (other.getDisplayHints() != null && other.getDisplayHints().equals(this.getDisplayHints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSectionPath() == null) ? 0 : getSectionPath().hashCode());
        hashCode = prime * hashCode + ((getFieldPath() == null) ? 0 : getFieldPath().hashCode());
        hashCode = prime * hashCode + ((getFieldType() == null) ? 0 : getFieldType().hashCode());
        hashCode = prime * hashCode + ((getFieldRequirement() == null) ? 0 : getFieldRequirement().hashCode());
        hashCode = prime * hashCode + ((getSelectValidation() == null) ? 0 : getSelectValidation().hashCode());
        hashCode = prime * hashCode + ((getTextValidation() == null) ? 0 : getTextValidation().hashCode());
        hashCode = prime * hashCode + ((getDisplayHints() == null) ? 0 : getDisplayHints().hashCode());
        return hashCode;
    }

    @Override
    public RegistrationFieldDefinition clone() {
        try {
            return (RegistrationFieldDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.RegistrationFieldDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

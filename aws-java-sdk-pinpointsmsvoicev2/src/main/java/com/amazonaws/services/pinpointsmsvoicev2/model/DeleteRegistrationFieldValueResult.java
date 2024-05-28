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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationFieldValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRegistrationFieldValueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     */
    private String registrationArn;
    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     */
    private String registrationId;
    /**
     * <p>
     * The version number of the registration.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The path to the registration form field.
     * </p>
     */
    private String fieldPath;
    /**
     * <p>
     * An array of values for the form field.
     * </p>
     */
    private java.util.List<String> selectChoices;
    /**
     * <p>
     * The text data for a free form field.
     * </p>
     */
    private String textValue;
    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     */
    private String registrationAttachmentId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     */

    public void setRegistrationArn(String registrationArn) {
        this.registrationArn = registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the registration.
     */

    public String getRegistrationArn() {
        return this.registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationFieldValueResult withRegistrationArn(String registrationArn) {
        setRegistrationArn(registrationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     */

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @return The unique identifier for the registration.
     */

    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationFieldValueResult withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
        return this;
    }

    /**
     * <p>
     * The version number of the registration.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the registration.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the registration.
     * </p>
     * 
     * @return The version number of the registration.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the registration.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationFieldValueResult withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The path to the registration form field.
     * </p>
     * 
     * @param fieldPath
     *        The path to the registration form field.
     */

    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * <p>
     * The path to the registration form field.
     * </p>
     * 
     * @return The path to the registration form field.
     */

    public String getFieldPath() {
        return this.fieldPath;
    }

    /**
     * <p>
     * The path to the registration form field.
     * </p>
     * 
     * @param fieldPath
     *        The path to the registration form field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationFieldValueResult withFieldPath(String fieldPath) {
        setFieldPath(fieldPath);
        return this;
    }

    /**
     * <p>
     * An array of values for the form field.
     * </p>
     * 
     * @return An array of values for the form field.
     */

    public java.util.List<String> getSelectChoices() {
        return selectChoices;
    }

    /**
     * <p>
     * An array of values for the form field.
     * </p>
     * 
     * @param selectChoices
     *        An array of values for the form field.
     */

    public void setSelectChoices(java.util.Collection<String> selectChoices) {
        if (selectChoices == null) {
            this.selectChoices = null;
            return;
        }

        this.selectChoices = new java.util.ArrayList<String>(selectChoices);
    }

    /**
     * <p>
     * An array of values for the form field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectChoices(java.util.Collection)} or {@link #withSelectChoices(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param selectChoices
     *        An array of values for the form field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationFieldValueResult withSelectChoices(String... selectChoices) {
        if (this.selectChoices == null) {
            setSelectChoices(new java.util.ArrayList<String>(selectChoices.length));
        }
        for (String ele : selectChoices) {
            this.selectChoices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of values for the form field.
     * </p>
     * 
     * @param selectChoices
     *        An array of values for the form field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationFieldValueResult withSelectChoices(java.util.Collection<String> selectChoices) {
        setSelectChoices(selectChoices);
        return this;
    }

    /**
     * <p>
     * The text data for a free form field.
     * </p>
     * 
     * @param textValue
     *        The text data for a free form field.
     */

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    /**
     * <p>
     * The text data for a free form field.
     * </p>
     * 
     * @return The text data for a free form field.
     */

    public String getTextValue() {
        return this.textValue;
    }

    /**
     * <p>
     * The text data for a free form field.
     * </p>
     * 
     * @param textValue
     *        The text data for a free form field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationFieldValueResult withTextValue(String textValue) {
        setTextValue(textValue);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     * 
     * @param registrationAttachmentId
     *        The unique identifier for the registration attachment.
     */

    public void setRegistrationAttachmentId(String registrationAttachmentId) {
        this.registrationAttachmentId = registrationAttachmentId;
    }

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     * 
     * @return The unique identifier for the registration attachment.
     */

    public String getRegistrationAttachmentId() {
        return this.registrationAttachmentId;
    }

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     * 
     * @param registrationAttachmentId
     *        The unique identifier for the registration attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationFieldValueResult withRegistrationAttachmentId(String registrationAttachmentId) {
        setRegistrationAttachmentId(registrationAttachmentId);
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
        if (getRegistrationArn() != null)
            sb.append("RegistrationArn: ").append(getRegistrationArn()).append(",");
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getFieldPath() != null)
            sb.append("FieldPath: ").append(getFieldPath()).append(",");
        if (getSelectChoices() != null)
            sb.append("SelectChoices: ").append(getSelectChoices()).append(",");
        if (getTextValue() != null)
            sb.append("TextValue: ").append(getTextValue()).append(",");
        if (getRegistrationAttachmentId() != null)
            sb.append("RegistrationAttachmentId: ").append(getRegistrationAttachmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRegistrationFieldValueResult == false)
            return false;
        DeleteRegistrationFieldValueResult other = (DeleteRegistrationFieldValueResult) obj;
        if (other.getRegistrationArn() == null ^ this.getRegistrationArn() == null)
            return false;
        if (other.getRegistrationArn() != null && other.getRegistrationArn().equals(this.getRegistrationArn()) == false)
            return false;
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getFieldPath() == null ^ this.getFieldPath() == null)
            return false;
        if (other.getFieldPath() != null && other.getFieldPath().equals(this.getFieldPath()) == false)
            return false;
        if (other.getSelectChoices() == null ^ this.getSelectChoices() == null)
            return false;
        if (other.getSelectChoices() != null && other.getSelectChoices().equals(this.getSelectChoices()) == false)
            return false;
        if (other.getTextValue() == null ^ this.getTextValue() == null)
            return false;
        if (other.getTextValue() != null && other.getTextValue().equals(this.getTextValue()) == false)
            return false;
        if (other.getRegistrationAttachmentId() == null ^ this.getRegistrationAttachmentId() == null)
            return false;
        if (other.getRegistrationAttachmentId() != null && other.getRegistrationAttachmentId().equals(this.getRegistrationAttachmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationArn() == null) ? 0 : getRegistrationArn().hashCode());
        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getFieldPath() == null) ? 0 : getFieldPath().hashCode());
        hashCode = prime * hashCode + ((getSelectChoices() == null) ? 0 : getSelectChoices().hashCode());
        hashCode = prime * hashCode + ((getTextValue() == null) ? 0 : getTextValue().hashCode());
        hashCode = prime * hashCode + ((getRegistrationAttachmentId() == null) ? 0 : getRegistrationAttachmentId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRegistrationFieldValueResult clone() {
        try {
            return (DeleteRegistrationFieldValueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

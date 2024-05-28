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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationFieldValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRegistrationFieldValueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     */
    private String registrationId;
    /**
     * <p>
     * The path to the registration form field. You can use <a>DescribeRegistrationFieldDefinitions</a> for a list of
     * <b>FieldPaths</b>.
     * </p>
     */
    private String fieldPath;

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

    public DeleteRegistrationFieldValueRequest withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
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

    public DeleteRegistrationFieldValueRequest withFieldPath(String fieldPath) {
        setFieldPath(fieldPath);
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
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId()).append(",");
        if (getFieldPath() != null)
            sb.append("FieldPath: ").append(getFieldPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRegistrationFieldValueRequest == false)
            return false;
        DeleteRegistrationFieldValueRequest other = (DeleteRegistrationFieldValueRequest) obj;
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
            return false;
        if (other.getFieldPath() == null ^ this.getFieldPath() == null)
            return false;
        if (other.getFieldPath() != null && other.getFieldPath().equals(this.getFieldPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        hashCode = prime * hashCode + ((getFieldPath() == null) ? 0 : getFieldPath().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRegistrationFieldValueRequest clone() {
        return (DeleteRegistrationFieldValueRequest) super.clone();
    }

}

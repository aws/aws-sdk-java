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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Displays errors that occurred during validation of the resource policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ValidationErrorsEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationErrorsEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Checks the name of the policy.
     * </p>
     */
    private String checkName;
    /**
     * <p>
     * Displays error messages if validation encounters problems during validation of the resource policy.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Checks the name of the policy.
     * </p>
     * 
     * @param checkName
     *        Checks the name of the policy.
     */

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * <p>
     * Checks the name of the policy.
     * </p>
     * 
     * @return Checks the name of the policy.
     */

    public String getCheckName() {
        return this.checkName;
    }

    /**
     * <p>
     * Checks the name of the policy.
     * </p>
     * 
     * @param checkName
     *        Checks the name of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationErrorsEntry withCheckName(String checkName) {
        setCheckName(checkName);
        return this;
    }

    /**
     * <p>
     * Displays error messages if validation encounters problems during validation of the resource policy.
     * </p>
     * 
     * @param errorMessage
     *        Displays error messages if validation encounters problems during validation of the resource policy.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Displays error messages if validation encounters problems during validation of the resource policy.
     * </p>
     * 
     * @return Displays error messages if validation encounters problems during validation of the resource policy.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Displays error messages if validation encounters problems during validation of the resource policy.
     * </p>
     * 
     * @param errorMessage
     *        Displays error messages if validation encounters problems during validation of the resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationErrorsEntry withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getCheckName() != null)
            sb.append("CheckName: ").append(getCheckName()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationErrorsEntry == false)
            return false;
        ValidationErrorsEntry other = (ValidationErrorsEntry) obj;
        if (other.getCheckName() == null ^ this.getCheckName() == null)
            return false;
        if (other.getCheckName() != null && other.getCheckName().equals(this.getCheckName()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public ValidationErrorsEntry clone() {
        try {
            return (ValidationErrorsEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.secretsmanager.model.transform.ValidationErrorsEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Detailed information concerning an error generated during the setting of configuration data for a CloudFormation
 * extension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/BatchDescribeTypeConfigurationsError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeTypeConfigurationsError implements Serializable, Cloneable {

    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message.
     * </p>
     */
    private String errorMessage;

    private TypeConfigurationIdentifier typeConfigurationIdentifier;

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * 
     * @param errorMessage
     *        The error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * 
     * @return The error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * 
     * @param errorMessage
     *        The error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * @param typeConfigurationIdentifier
     */

    public void setTypeConfigurationIdentifier(TypeConfigurationIdentifier typeConfigurationIdentifier) {
        this.typeConfigurationIdentifier = typeConfigurationIdentifier;
    }

    /**
     * @return
     */

    public TypeConfigurationIdentifier getTypeConfigurationIdentifier() {
        return this.typeConfigurationIdentifier;
    }

    /**
     * @param typeConfigurationIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeTypeConfigurationsError withTypeConfigurationIdentifier(TypeConfigurationIdentifier typeConfigurationIdentifier) {
        setTypeConfigurationIdentifier(typeConfigurationIdentifier);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getTypeConfigurationIdentifier() != null)
            sb.append("TypeConfigurationIdentifier: ").append(getTypeConfigurationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeTypeConfigurationsError == false)
            return false;
        BatchDescribeTypeConfigurationsError other = (BatchDescribeTypeConfigurationsError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getTypeConfigurationIdentifier() == null ^ this.getTypeConfigurationIdentifier() == null)
            return false;
        if (other.getTypeConfigurationIdentifier() != null && other.getTypeConfigurationIdentifier().equals(this.getTypeConfigurationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getTypeConfigurationIdentifier() == null) ? 0 : getTypeConfigurationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeTypeConfigurationsError clone() {
        try {
            return (BatchDescribeTypeConfigurationsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

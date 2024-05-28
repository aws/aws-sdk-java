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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The option to relax the validation that is required to create and update analyses, dashboards, and templates with
 * definition objects. When you set this value to <code>LENIENT</code>, validation is skipped for specific errors.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ValidationStrategy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationStrategy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The mode of validation for the asset to be created or updated. When you set this value to <code>STRICT</code>,
     * strict validation for every error is enforced. When you set this value to <code>LENIENT</code>, validation is
     * skipped for specific UI errors.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * The mode of validation for the asset to be created or updated. When you set this value to <code>STRICT</code>,
     * strict validation for every error is enforced. When you set this value to <code>LENIENT</code>, validation is
     * skipped for specific UI errors.
     * </p>
     * 
     * @param mode
     *        The mode of validation for the asset to be created or updated. When you set this value to
     *        <code>STRICT</code>, strict validation for every error is enforced. When you set this value to
     *        <code>LENIENT</code>, validation is skipped for specific UI errors.
     * @see ValidationStrategyMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The mode of validation for the asset to be created or updated. When you set this value to <code>STRICT</code>,
     * strict validation for every error is enforced. When you set this value to <code>LENIENT</code>, validation is
     * skipped for specific UI errors.
     * </p>
     * 
     * @return The mode of validation for the asset to be created or updated. When you set this value to
     *         <code>STRICT</code>, strict validation for every error is enforced. When you set this value to
     *         <code>LENIENT</code>, validation is skipped for specific UI errors.
     * @see ValidationStrategyMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The mode of validation for the asset to be created or updated. When you set this value to <code>STRICT</code>,
     * strict validation for every error is enforced. When you set this value to <code>LENIENT</code>, validation is
     * skipped for specific UI errors.
     * </p>
     * 
     * @param mode
     *        The mode of validation for the asset to be created or updated. When you set this value to
     *        <code>STRICT</code>, strict validation for every error is enforced. When you set this value to
     *        <code>LENIENT</code>, validation is skipped for specific UI errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationStrategyMode
     */

    public ValidationStrategy withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The mode of validation for the asset to be created or updated. When you set this value to <code>STRICT</code>,
     * strict validation for every error is enforced. When you set this value to <code>LENIENT</code>, validation is
     * skipped for specific UI errors.
     * </p>
     * 
     * @param mode
     *        The mode of validation for the asset to be created or updated. When you set this value to
     *        <code>STRICT</code>, strict validation for every error is enforced. When you set this value to
     *        <code>LENIENT</code>, validation is skipped for specific UI errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationStrategyMode
     */

    public ValidationStrategy withMode(ValidationStrategyMode mode) {
        this.mode = mode.toString();
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationStrategy == false)
            return false;
        ValidationStrategy other = (ValidationStrategy) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public ValidationStrategy clone() {
        try {
            return (ValidationStrategy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ValidationStrategyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

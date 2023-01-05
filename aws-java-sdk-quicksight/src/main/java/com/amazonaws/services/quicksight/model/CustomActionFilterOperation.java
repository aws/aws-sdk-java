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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filter operation that filters data included in a visual or in an entire sheet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CustomActionFilterOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomActionFilterOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration that chooses the fields to be filtered.
     * </p>
     */
    private FilterOperationSelectedFieldsConfiguration selectedFieldsConfiguration;
    /**
     * <p>
     * The configuration that chooses the target visuals to be filtered.
     * </p>
     */
    private FilterOperationTargetVisualsConfiguration targetVisualsConfiguration;

    /**
     * <p>
     * The configuration that chooses the fields to be filtered.
     * </p>
     * 
     * @param selectedFieldsConfiguration
     *        The configuration that chooses the fields to be filtered.
     */

    public void setSelectedFieldsConfiguration(FilterOperationSelectedFieldsConfiguration selectedFieldsConfiguration) {
        this.selectedFieldsConfiguration = selectedFieldsConfiguration;
    }

    /**
     * <p>
     * The configuration that chooses the fields to be filtered.
     * </p>
     * 
     * @return The configuration that chooses the fields to be filtered.
     */

    public FilterOperationSelectedFieldsConfiguration getSelectedFieldsConfiguration() {
        return this.selectedFieldsConfiguration;
    }

    /**
     * <p>
     * The configuration that chooses the fields to be filtered.
     * </p>
     * 
     * @param selectedFieldsConfiguration
     *        The configuration that chooses the fields to be filtered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomActionFilterOperation withSelectedFieldsConfiguration(FilterOperationSelectedFieldsConfiguration selectedFieldsConfiguration) {
        setSelectedFieldsConfiguration(selectedFieldsConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration that chooses the target visuals to be filtered.
     * </p>
     * 
     * @param targetVisualsConfiguration
     *        The configuration that chooses the target visuals to be filtered.
     */

    public void setTargetVisualsConfiguration(FilterOperationTargetVisualsConfiguration targetVisualsConfiguration) {
        this.targetVisualsConfiguration = targetVisualsConfiguration;
    }

    /**
     * <p>
     * The configuration that chooses the target visuals to be filtered.
     * </p>
     * 
     * @return The configuration that chooses the target visuals to be filtered.
     */

    public FilterOperationTargetVisualsConfiguration getTargetVisualsConfiguration() {
        return this.targetVisualsConfiguration;
    }

    /**
     * <p>
     * The configuration that chooses the target visuals to be filtered.
     * </p>
     * 
     * @param targetVisualsConfiguration
     *        The configuration that chooses the target visuals to be filtered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomActionFilterOperation withTargetVisualsConfiguration(FilterOperationTargetVisualsConfiguration targetVisualsConfiguration) {
        setTargetVisualsConfiguration(targetVisualsConfiguration);
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
        if (getSelectedFieldsConfiguration() != null)
            sb.append("SelectedFieldsConfiguration: ").append(getSelectedFieldsConfiguration()).append(",");
        if (getTargetVisualsConfiguration() != null)
            sb.append("TargetVisualsConfiguration: ").append(getTargetVisualsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomActionFilterOperation == false)
            return false;
        CustomActionFilterOperation other = (CustomActionFilterOperation) obj;
        if (other.getSelectedFieldsConfiguration() == null ^ this.getSelectedFieldsConfiguration() == null)
            return false;
        if (other.getSelectedFieldsConfiguration() != null && other.getSelectedFieldsConfiguration().equals(this.getSelectedFieldsConfiguration()) == false)
            return false;
        if (other.getTargetVisualsConfiguration() == null ^ this.getTargetVisualsConfiguration() == null)
            return false;
        if (other.getTargetVisualsConfiguration() != null && other.getTargetVisualsConfiguration().equals(this.getTargetVisualsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectedFieldsConfiguration() == null) ? 0 : getSelectedFieldsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTargetVisualsConfiguration() == null) ? 0 : getTargetVisualsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CustomActionFilterOperation clone() {
        try {
            return (CustomActionFilterOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CustomActionFilterOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

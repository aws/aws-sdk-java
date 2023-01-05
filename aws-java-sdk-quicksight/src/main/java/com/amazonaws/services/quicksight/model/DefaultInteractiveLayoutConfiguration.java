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
 * The options that determine the default settings for interactive layout configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DefaultInteractiveLayoutConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultInteractiveLayoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options that determine the default settings for a grid layout configuration.
     * </p>
     */
    private DefaultGridLayoutConfiguration grid;
    /**
     * <p>
     * The options that determine the default settings of a free-form layout configuration.
     * </p>
     */
    private DefaultFreeFormLayoutConfiguration freeForm;

    /**
     * <p>
     * The options that determine the default settings for a grid layout configuration.
     * </p>
     * 
     * @param grid
     *        The options that determine the default settings for a grid layout configuration.
     */

    public void setGrid(DefaultGridLayoutConfiguration grid) {
        this.grid = grid;
    }

    /**
     * <p>
     * The options that determine the default settings for a grid layout configuration.
     * </p>
     * 
     * @return The options that determine the default settings for a grid layout configuration.
     */

    public DefaultGridLayoutConfiguration getGrid() {
        return this.grid;
    }

    /**
     * <p>
     * The options that determine the default settings for a grid layout configuration.
     * </p>
     * 
     * @param grid
     *        The options that determine the default settings for a grid layout configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultInteractiveLayoutConfiguration withGrid(DefaultGridLayoutConfiguration grid) {
        setGrid(grid);
        return this;
    }

    /**
     * <p>
     * The options that determine the default settings of a free-form layout configuration.
     * </p>
     * 
     * @param freeForm
     *        The options that determine the default settings of a free-form layout configuration.
     */

    public void setFreeForm(DefaultFreeFormLayoutConfiguration freeForm) {
        this.freeForm = freeForm;
    }

    /**
     * <p>
     * The options that determine the default settings of a free-form layout configuration.
     * </p>
     * 
     * @return The options that determine the default settings of a free-form layout configuration.
     */

    public DefaultFreeFormLayoutConfiguration getFreeForm() {
        return this.freeForm;
    }

    /**
     * <p>
     * The options that determine the default settings of a free-form layout configuration.
     * </p>
     * 
     * @param freeForm
     *        The options that determine the default settings of a free-form layout configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultInteractiveLayoutConfiguration withFreeForm(DefaultFreeFormLayoutConfiguration freeForm) {
        setFreeForm(freeForm);
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
        if (getGrid() != null)
            sb.append("Grid: ").append(getGrid()).append(",");
        if (getFreeForm() != null)
            sb.append("FreeForm: ").append(getFreeForm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultInteractiveLayoutConfiguration == false)
            return false;
        DefaultInteractiveLayoutConfiguration other = (DefaultInteractiveLayoutConfiguration) obj;
        if (other.getGrid() == null ^ this.getGrid() == null)
            return false;
        if (other.getGrid() != null && other.getGrid().equals(this.getGrid()) == false)
            return false;
        if (other.getFreeForm() == null ^ this.getFreeForm() == null)
            return false;
        if (other.getFreeForm() != null && other.getFreeForm().equals(this.getFreeForm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrid() == null) ? 0 : getGrid().hashCode());
        hashCode = prime * hashCode + ((getFreeForm() == null) ? 0 : getFreeForm().hashCode());
        return hashCode;
    }

    @Override
    public DefaultInteractiveLayoutConfiguration clone() {
        try {
            return (DefaultInteractiveLayoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DefaultInteractiveLayoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The options that determine the default settings of a free-form layout configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DefaultFreeFormLayoutConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultFreeFormLayoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the screen canvas size options for a free-form layout.
     * </p>
     */
    private FreeFormLayoutCanvasSizeOptions canvasSizeOptions;

    /**
     * <p>
     * Determines the screen canvas size options for a free-form layout.
     * </p>
     * 
     * @param canvasSizeOptions
     *        Determines the screen canvas size options for a free-form layout.
     */

    public void setCanvasSizeOptions(FreeFormLayoutCanvasSizeOptions canvasSizeOptions) {
        this.canvasSizeOptions = canvasSizeOptions;
    }

    /**
     * <p>
     * Determines the screen canvas size options for a free-form layout.
     * </p>
     * 
     * @return Determines the screen canvas size options for a free-form layout.
     */

    public FreeFormLayoutCanvasSizeOptions getCanvasSizeOptions() {
        return this.canvasSizeOptions;
    }

    /**
     * <p>
     * Determines the screen canvas size options for a free-form layout.
     * </p>
     * 
     * @param canvasSizeOptions
     *        Determines the screen canvas size options for a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFreeFormLayoutConfiguration withCanvasSizeOptions(FreeFormLayoutCanvasSizeOptions canvasSizeOptions) {
        setCanvasSizeOptions(canvasSizeOptions);
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
        if (getCanvasSizeOptions() != null)
            sb.append("CanvasSizeOptions: ").append(getCanvasSizeOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultFreeFormLayoutConfiguration == false)
            return false;
        DefaultFreeFormLayoutConfiguration other = (DefaultFreeFormLayoutConfiguration) obj;
        if (other.getCanvasSizeOptions() == null ^ this.getCanvasSizeOptions() == null)
            return false;
        if (other.getCanvasSizeOptions() != null && other.getCanvasSizeOptions().equals(this.getCanvasSizeOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanvasSizeOptions() == null) ? 0 : getCanvasSizeOptions().hashCode());
        return hashCode;
    }

    @Override
    public DefaultFreeFormLayoutConfiguration clone() {
        try {
            return (DefaultFreeFormLayoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DefaultFreeFormLayoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

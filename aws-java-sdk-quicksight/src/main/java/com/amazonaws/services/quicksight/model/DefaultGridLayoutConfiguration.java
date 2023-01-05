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
 * The options that determine the default settings for a grid layout configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DefaultGridLayoutConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultGridLayoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the screen canvas size options for a grid layout.
     * </p>
     */
    private GridLayoutCanvasSizeOptions canvasSizeOptions;

    /**
     * <p>
     * Determines the screen canvas size options for a grid layout.
     * </p>
     * 
     * @param canvasSizeOptions
     *        Determines the screen canvas size options for a grid layout.
     */

    public void setCanvasSizeOptions(GridLayoutCanvasSizeOptions canvasSizeOptions) {
        this.canvasSizeOptions = canvasSizeOptions;
    }

    /**
     * <p>
     * Determines the screen canvas size options for a grid layout.
     * </p>
     * 
     * @return Determines the screen canvas size options for a grid layout.
     */

    public GridLayoutCanvasSizeOptions getCanvasSizeOptions() {
        return this.canvasSizeOptions;
    }

    /**
     * <p>
     * Determines the screen canvas size options for a grid layout.
     * </p>
     * 
     * @param canvasSizeOptions
     *        Determines the screen canvas size options for a grid layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultGridLayoutConfiguration withCanvasSizeOptions(GridLayoutCanvasSizeOptions canvasSizeOptions) {
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

        if (obj instanceof DefaultGridLayoutConfiguration == false)
            return false;
        DefaultGridLayoutConfiguration other = (DefaultGridLayoutConfiguration) obj;
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
    public DefaultGridLayoutConfiguration clone() {
        try {
            return (DefaultGridLayoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DefaultGridLayoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

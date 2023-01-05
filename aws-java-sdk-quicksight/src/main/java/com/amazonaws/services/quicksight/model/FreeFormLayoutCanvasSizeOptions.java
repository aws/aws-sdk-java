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
 * Configuration options for the canvas of a free-form layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FreeFormLayoutCanvasSizeOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeFormLayoutCanvasSizeOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options that determine the sizing of the canvas used in a free-form layout.
     * </p>
     */
    private FreeFormLayoutScreenCanvasSizeOptions screenCanvasSizeOptions;

    /**
     * <p>
     * The options that determine the sizing of the canvas used in a free-form layout.
     * </p>
     * 
     * @param screenCanvasSizeOptions
     *        The options that determine the sizing of the canvas used in a free-form layout.
     */

    public void setScreenCanvasSizeOptions(FreeFormLayoutScreenCanvasSizeOptions screenCanvasSizeOptions) {
        this.screenCanvasSizeOptions = screenCanvasSizeOptions;
    }

    /**
     * <p>
     * The options that determine the sizing of the canvas used in a free-form layout.
     * </p>
     * 
     * @return The options that determine the sizing of the canvas used in a free-form layout.
     */

    public FreeFormLayoutScreenCanvasSizeOptions getScreenCanvasSizeOptions() {
        return this.screenCanvasSizeOptions;
    }

    /**
     * <p>
     * The options that determine the sizing of the canvas used in a free-form layout.
     * </p>
     * 
     * @param screenCanvasSizeOptions
     *        The options that determine the sizing of the canvas used in a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutCanvasSizeOptions withScreenCanvasSizeOptions(FreeFormLayoutScreenCanvasSizeOptions screenCanvasSizeOptions) {
        setScreenCanvasSizeOptions(screenCanvasSizeOptions);
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
        if (getScreenCanvasSizeOptions() != null)
            sb.append("ScreenCanvasSizeOptions: ").append(getScreenCanvasSizeOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FreeFormLayoutCanvasSizeOptions == false)
            return false;
        FreeFormLayoutCanvasSizeOptions other = (FreeFormLayoutCanvasSizeOptions) obj;
        if (other.getScreenCanvasSizeOptions() == null ^ this.getScreenCanvasSizeOptions() == null)
            return false;
        if (other.getScreenCanvasSizeOptions() != null && other.getScreenCanvasSizeOptions().equals(this.getScreenCanvasSizeOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScreenCanvasSizeOptions() == null) ? 0 : getScreenCanvasSizeOptions().hashCode());
        return hashCode;
    }

    @Override
    public FreeFormLayoutCanvasSizeOptions clone() {
        try {
            return (FreeFormLayoutCanvasSizeOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FreeFormLayoutCanvasSizeOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

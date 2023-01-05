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
 * A <code>Layout</code> defines the placement of elements within a sheet.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types of
 * layout</a> in the <i>Amazon QuickSight User Guide</i>.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Layout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Layout implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration that determines what the type of layout for a sheet.
     * </p>
     */
    private LayoutConfiguration configuration;

    /**
     * <p>
     * The configuration that determines what the type of layout for a sheet.
     * </p>
     * 
     * @param configuration
     *        The configuration that determines what the type of layout for a sheet.
     */

    public void setConfiguration(LayoutConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration that determines what the type of layout for a sheet.
     * </p>
     * 
     * @return The configuration that determines what the type of layout for a sheet.
     */

    public LayoutConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration that determines what the type of layout for a sheet.
     * </p>
     * 
     * @param configuration
     *        The configuration that determines what the type of layout for a sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Layout withConfiguration(LayoutConfiguration configuration) {
        setConfiguration(configuration);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Layout == false)
            return false;
        Layout other = (Layout) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Layout clone() {
        try {
            return (Layout) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LayoutMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

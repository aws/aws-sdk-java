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
 * A structure that represents a default formatting definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DefaultFormatting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultFormatting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display format. Valid values for this structure are <code>AUTO</code>, <code>PERCENT</code>,
     * <code>CURRENCY</code>, <code>NUMBER</code>, <code>DATE</code>, and <code>STRING</code>.
     * </p>
     */
    private String displayFormat;
    /**
     * <p>
     * The additional options for display formatting.
     * </p>
     */
    private DisplayFormatOptions displayFormatOptions;

    /**
     * <p>
     * The display format. Valid values for this structure are <code>AUTO</code>, <code>PERCENT</code>,
     * <code>CURRENCY</code>, <code>NUMBER</code>, <code>DATE</code>, and <code>STRING</code>.
     * </p>
     * 
     * @param displayFormat
     *        The display format. Valid values for this structure are <code>AUTO</code>, <code>PERCENT</code>,
     *        <code>CURRENCY</code>, <code>NUMBER</code>, <code>DATE</code>, and <code>STRING</code>.
     * @see DisplayFormat
     */

    public void setDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
    }

    /**
     * <p>
     * The display format. Valid values for this structure are <code>AUTO</code>, <code>PERCENT</code>,
     * <code>CURRENCY</code>, <code>NUMBER</code>, <code>DATE</code>, and <code>STRING</code>.
     * </p>
     * 
     * @return The display format. Valid values for this structure are <code>AUTO</code>, <code>PERCENT</code>,
     *         <code>CURRENCY</code>, <code>NUMBER</code>, <code>DATE</code>, and <code>STRING</code>.
     * @see DisplayFormat
     */

    public String getDisplayFormat() {
        return this.displayFormat;
    }

    /**
     * <p>
     * The display format. Valid values for this structure are <code>AUTO</code>, <code>PERCENT</code>,
     * <code>CURRENCY</code>, <code>NUMBER</code>, <code>DATE</code>, and <code>STRING</code>.
     * </p>
     * 
     * @param displayFormat
     *        The display format. Valid values for this structure are <code>AUTO</code>, <code>PERCENT</code>,
     *        <code>CURRENCY</code>, <code>NUMBER</code>, <code>DATE</code>, and <code>STRING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisplayFormat
     */

    public DefaultFormatting withDisplayFormat(String displayFormat) {
        setDisplayFormat(displayFormat);
        return this;
    }

    /**
     * <p>
     * The display format. Valid values for this structure are <code>AUTO</code>, <code>PERCENT</code>,
     * <code>CURRENCY</code>, <code>NUMBER</code>, <code>DATE</code>, and <code>STRING</code>.
     * </p>
     * 
     * @param displayFormat
     *        The display format. Valid values for this structure are <code>AUTO</code>, <code>PERCENT</code>,
     *        <code>CURRENCY</code>, <code>NUMBER</code>, <code>DATE</code>, and <code>STRING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisplayFormat
     */

    public DefaultFormatting withDisplayFormat(DisplayFormat displayFormat) {
        this.displayFormat = displayFormat.toString();
        return this;
    }

    /**
     * <p>
     * The additional options for display formatting.
     * </p>
     * 
     * @param displayFormatOptions
     *        The additional options for display formatting.
     */

    public void setDisplayFormatOptions(DisplayFormatOptions displayFormatOptions) {
        this.displayFormatOptions = displayFormatOptions;
    }

    /**
     * <p>
     * The additional options for display formatting.
     * </p>
     * 
     * @return The additional options for display formatting.
     */

    public DisplayFormatOptions getDisplayFormatOptions() {
        return this.displayFormatOptions;
    }

    /**
     * <p>
     * The additional options for display formatting.
     * </p>
     * 
     * @param displayFormatOptions
     *        The additional options for display formatting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFormatting withDisplayFormatOptions(DisplayFormatOptions displayFormatOptions) {
        setDisplayFormatOptions(displayFormatOptions);
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
        if (getDisplayFormat() != null)
            sb.append("DisplayFormat: ").append(getDisplayFormat()).append(",");
        if (getDisplayFormatOptions() != null)
            sb.append("DisplayFormatOptions: ").append(getDisplayFormatOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultFormatting == false)
            return false;
        DefaultFormatting other = (DefaultFormatting) obj;
        if (other.getDisplayFormat() == null ^ this.getDisplayFormat() == null)
            return false;
        if (other.getDisplayFormat() != null && other.getDisplayFormat().equals(this.getDisplayFormat()) == false)
            return false;
        if (other.getDisplayFormatOptions() == null ^ this.getDisplayFormatOptions() == null)
            return false;
        if (other.getDisplayFormatOptions() != null && other.getDisplayFormatOptions().equals(this.getDisplayFormatOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayFormat() == null) ? 0 : getDisplayFormat().hashCode());
        hashCode = prime * hashCode + ((getDisplayFormatOptions() == null) ? 0 : getDisplayFormatOptions().hashCode());
        return hashCode;
    }

    @Override
    public DefaultFormatting clone() {
        try {
            return (DefaultFormatting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DefaultFormattingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The settings of a chart's single axis configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SingleAxisOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SingleAxisOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Y axis options of a single axis configuration.
     * </p>
     */
    private YAxisOptions yAxisOptions;

    /**
     * <p>
     * The Y axis options of a single axis configuration.
     * </p>
     * 
     * @param yAxisOptions
     *        The Y axis options of a single axis configuration.
     */

    public void setYAxisOptions(YAxisOptions yAxisOptions) {
        this.yAxisOptions = yAxisOptions;
    }

    /**
     * <p>
     * The Y axis options of a single axis configuration.
     * </p>
     * 
     * @return The Y axis options of a single axis configuration.
     */

    public YAxisOptions getYAxisOptions() {
        return this.yAxisOptions;
    }

    /**
     * <p>
     * The Y axis options of a single axis configuration.
     * </p>
     * 
     * @param yAxisOptions
     *        The Y axis options of a single axis configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SingleAxisOptions withYAxisOptions(YAxisOptions yAxisOptions) {
        setYAxisOptions(yAxisOptions);
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
        if (getYAxisOptions() != null)
            sb.append("YAxisOptions: ").append(getYAxisOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SingleAxisOptions == false)
            return false;
        SingleAxisOptions other = (SingleAxisOptions) obj;
        if (other.getYAxisOptions() == null ^ this.getYAxisOptions() == null)
            return false;
        if (other.getYAxisOptions() != null && other.getYAxisOptions().equals(this.getYAxisOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getYAxisOptions() == null) ? 0 : getYAxisOptions().hashCode());
        return hashCode;
    }

    @Override
    public SingleAxisOptions clone() {
        try {
            return (SingleAxisOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SingleAxisOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * The display options of a control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SliderControlDisplayOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SliderControlDisplayOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options to configure the title visibility, name, and font size.
     * </p>
     */
    private LabelOptions titleOptions;

    /**
     * <p>
     * The options to configure the title visibility, name, and font size.
     * </p>
     * 
     * @param titleOptions
     *        The options to configure the title visibility, name, and font size.
     */

    public void setTitleOptions(LabelOptions titleOptions) {
        this.titleOptions = titleOptions;
    }

    /**
     * <p>
     * The options to configure the title visibility, name, and font size.
     * </p>
     * 
     * @return The options to configure the title visibility, name, and font size.
     */

    public LabelOptions getTitleOptions() {
        return this.titleOptions;
    }

    /**
     * <p>
     * The options to configure the title visibility, name, and font size.
     * </p>
     * 
     * @param titleOptions
     *        The options to configure the title visibility, name, and font size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SliderControlDisplayOptions withTitleOptions(LabelOptions titleOptions) {
        setTitleOptions(titleOptions);
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
        if (getTitleOptions() != null)
            sb.append("TitleOptions: ").append(getTitleOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SliderControlDisplayOptions == false)
            return false;
        SliderControlDisplayOptions other = (SliderControlDisplayOptions) obj;
        if (other.getTitleOptions() == null ^ this.getTitleOptions() == null)
            return false;
        if (other.getTitleOptions() != null && other.getTitleOptions().equals(this.getTitleOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitleOptions() == null) ? 0 : getTitleOptions().hashCode());
        return hashCode;
    }

    @Override
    public SliderControlDisplayOptions clone() {
        try {
            return (SliderControlDisplayOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SliderControlDisplayOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DropDownControlDisplayOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DropDownControlDisplayOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of the <code>Select all</code> options in a dropdown control.
     * </p>
     */
    private ListControlSelectAllOptions selectAllOptions;
    /**
     * <p>
     * The options to configure the title visibility, name, and font size.
     * </p>
     */
    private LabelOptions titleOptions;

    /**
     * <p>
     * The configuration of the <code>Select all</code> options in a dropdown control.
     * </p>
     * 
     * @param selectAllOptions
     *        The configuration of the <code>Select all</code> options in a dropdown control.
     */

    public void setSelectAllOptions(ListControlSelectAllOptions selectAllOptions) {
        this.selectAllOptions = selectAllOptions;
    }

    /**
     * <p>
     * The configuration of the <code>Select all</code> options in a dropdown control.
     * </p>
     * 
     * @return The configuration of the <code>Select all</code> options in a dropdown control.
     */

    public ListControlSelectAllOptions getSelectAllOptions() {
        return this.selectAllOptions;
    }

    /**
     * <p>
     * The configuration of the <code>Select all</code> options in a dropdown control.
     * </p>
     * 
     * @param selectAllOptions
     *        The configuration of the <code>Select all</code> options in a dropdown control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DropDownControlDisplayOptions withSelectAllOptions(ListControlSelectAllOptions selectAllOptions) {
        setSelectAllOptions(selectAllOptions);
        return this;
    }

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

    public DropDownControlDisplayOptions withTitleOptions(LabelOptions titleOptions) {
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
        if (getSelectAllOptions() != null)
            sb.append("SelectAllOptions: ").append(getSelectAllOptions()).append(",");
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

        if (obj instanceof DropDownControlDisplayOptions == false)
            return false;
        DropDownControlDisplayOptions other = (DropDownControlDisplayOptions) obj;
        if (other.getSelectAllOptions() == null ^ this.getSelectAllOptions() == null)
            return false;
        if (other.getSelectAllOptions() != null && other.getSelectAllOptions().equals(this.getSelectAllOptions()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getSelectAllOptions() == null) ? 0 : getSelectAllOptions().hashCode());
        hashCode = prime * hashCode + ((getTitleOptions() == null) ? 0 : getTitleOptions().hashCode());
        return hashCode;
    }

    @Override
    public DropDownControlDisplayOptions clone() {
        try {
            return (DropDownControlDisplayOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DropDownControlDisplayOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

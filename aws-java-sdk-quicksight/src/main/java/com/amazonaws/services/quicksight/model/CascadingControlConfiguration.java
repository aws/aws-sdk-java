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
 * The values that are displayed in a control can be configured to only show values that are valid based on what's
 * selected in other controls.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CascadingControlConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CascadingControlConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of source controls that determine the values that are used in the current control.
     * </p>
     */
    private java.util.List<CascadingControlSource> sourceControls;

    /**
     * <p>
     * A list of source controls that determine the values that are used in the current control.
     * </p>
     * 
     * @return A list of source controls that determine the values that are used in the current control.
     */

    public java.util.List<CascadingControlSource> getSourceControls() {
        return sourceControls;
    }

    /**
     * <p>
     * A list of source controls that determine the values that are used in the current control.
     * </p>
     * 
     * @param sourceControls
     *        A list of source controls that determine the values that are used in the current control.
     */

    public void setSourceControls(java.util.Collection<CascadingControlSource> sourceControls) {
        if (sourceControls == null) {
            this.sourceControls = null;
            return;
        }

        this.sourceControls = new java.util.ArrayList<CascadingControlSource>(sourceControls);
    }

    /**
     * <p>
     * A list of source controls that determine the values that are used in the current control.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceControls(java.util.Collection)} or {@link #withSourceControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceControls
     *        A list of source controls that determine the values that are used in the current control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CascadingControlConfiguration withSourceControls(CascadingControlSource... sourceControls) {
        if (this.sourceControls == null) {
            setSourceControls(new java.util.ArrayList<CascadingControlSource>(sourceControls.length));
        }
        for (CascadingControlSource ele : sourceControls) {
            this.sourceControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of source controls that determine the values that are used in the current control.
     * </p>
     * 
     * @param sourceControls
     *        A list of source controls that determine the values that are used in the current control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CascadingControlConfiguration withSourceControls(java.util.Collection<CascadingControlSource> sourceControls) {
        setSourceControls(sourceControls);
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
        if (getSourceControls() != null)
            sb.append("SourceControls: ").append(getSourceControls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CascadingControlConfiguration == false)
            return false;
        CascadingControlConfiguration other = (CascadingControlConfiguration) obj;
        if (other.getSourceControls() == null ^ this.getSourceControls() == null)
            return false;
        if (other.getSourceControls() != null && other.getSourceControls().equals(this.getSourceControls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceControls() == null) ? 0 : getSourceControls().hashCode());
        return hashCode;
    }

    @Override
    public CascadingControlConfiguration clone() {
        try {
            return (CascadingControlConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CascadingControlConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

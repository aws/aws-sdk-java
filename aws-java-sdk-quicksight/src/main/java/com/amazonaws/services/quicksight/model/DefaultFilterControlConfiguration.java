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
 * The default configuration for all dependent controls of the filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DefaultFilterControlConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultFilterControlConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of the <code>DefaultFilterControlConfiguration</code>. This title is shared by all controls that are
     * tied to this filter.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The control option for the <code>DefaultFilterControlConfiguration</code>.
     * </p>
     */
    private DefaultFilterControlOptions controlOptions;

    /**
     * <p>
     * The title of the <code>DefaultFilterControlConfiguration</code>. This title is shared by all controls that are
     * tied to this filter.
     * </p>
     * 
     * @param title
     *        The title of the <code>DefaultFilterControlConfiguration</code>. This title is shared by all controls that
     *        are tied to this filter.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the <code>DefaultFilterControlConfiguration</code>. This title is shared by all controls that are
     * tied to this filter.
     * </p>
     * 
     * @return The title of the <code>DefaultFilterControlConfiguration</code>. This title is shared by all controls
     *         that are tied to this filter.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the <code>DefaultFilterControlConfiguration</code>. This title is shared by all controls that are
     * tied to this filter.
     * </p>
     * 
     * @param title
     *        The title of the <code>DefaultFilterControlConfiguration</code>. This title is shared by all controls that
     *        are tied to this filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterControlConfiguration withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The control option for the <code>DefaultFilterControlConfiguration</code>.
     * </p>
     * 
     * @param controlOptions
     *        The control option for the <code>DefaultFilterControlConfiguration</code>.
     */

    public void setControlOptions(DefaultFilterControlOptions controlOptions) {
        this.controlOptions = controlOptions;
    }

    /**
     * <p>
     * The control option for the <code>DefaultFilterControlConfiguration</code>.
     * </p>
     * 
     * @return The control option for the <code>DefaultFilterControlConfiguration</code>.
     */

    public DefaultFilterControlOptions getControlOptions() {
        return this.controlOptions;
    }

    /**
     * <p>
     * The control option for the <code>DefaultFilterControlConfiguration</code>.
     * </p>
     * 
     * @param controlOptions
     *        The control option for the <code>DefaultFilterControlConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterControlConfiguration withControlOptions(DefaultFilterControlOptions controlOptions) {
        setControlOptions(controlOptions);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getControlOptions() != null)
            sb.append("ControlOptions: ").append(getControlOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultFilterControlConfiguration == false)
            return false;
        DefaultFilterControlConfiguration other = (DefaultFilterControlConfiguration) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getControlOptions() == null ^ this.getControlOptions() == null)
            return false;
        if (other.getControlOptions() != null && other.getControlOptions().equals(this.getControlOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getControlOptions() == null) ? 0 : getControlOptions().hashCode());
        return hashCode;
    }

    @Override
    public DefaultFilterControlConfiguration clone() {
        try {
            return (DefaultFilterControlConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DefaultFilterControlConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

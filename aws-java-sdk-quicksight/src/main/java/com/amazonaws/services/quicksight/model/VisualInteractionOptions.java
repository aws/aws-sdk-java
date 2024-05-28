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
 * The general visual interactions setup for visual publish options
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/VisualInteractionOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisualInteractionOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The on-visual menu options for a visual.
     * </p>
     */
    private VisualMenuOption visualMenuOption;
    /**
     * <p>
     * The context menu options for a visual.
     * </p>
     */
    private ContextMenuOption contextMenuOption;

    /**
     * <p>
     * The on-visual menu options for a visual.
     * </p>
     * 
     * @param visualMenuOption
     *        The on-visual menu options for a visual.
     */

    public void setVisualMenuOption(VisualMenuOption visualMenuOption) {
        this.visualMenuOption = visualMenuOption;
    }

    /**
     * <p>
     * The on-visual menu options for a visual.
     * </p>
     * 
     * @return The on-visual menu options for a visual.
     */

    public VisualMenuOption getVisualMenuOption() {
        return this.visualMenuOption;
    }

    /**
     * <p>
     * The on-visual menu options for a visual.
     * </p>
     * 
     * @param visualMenuOption
     *        The on-visual menu options for a visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualInteractionOptions withVisualMenuOption(VisualMenuOption visualMenuOption) {
        setVisualMenuOption(visualMenuOption);
        return this;
    }

    /**
     * <p>
     * The context menu options for a visual.
     * </p>
     * 
     * @param contextMenuOption
     *        The context menu options for a visual.
     */

    public void setContextMenuOption(ContextMenuOption contextMenuOption) {
        this.contextMenuOption = contextMenuOption;
    }

    /**
     * <p>
     * The context menu options for a visual.
     * </p>
     * 
     * @return The context menu options for a visual.
     */

    public ContextMenuOption getContextMenuOption() {
        return this.contextMenuOption;
    }

    /**
     * <p>
     * The context menu options for a visual.
     * </p>
     * 
     * @param contextMenuOption
     *        The context menu options for a visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualInteractionOptions withContextMenuOption(ContextMenuOption contextMenuOption) {
        setContextMenuOption(contextMenuOption);
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
        if (getVisualMenuOption() != null)
            sb.append("VisualMenuOption: ").append(getVisualMenuOption()).append(",");
        if (getContextMenuOption() != null)
            sb.append("ContextMenuOption: ").append(getContextMenuOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VisualInteractionOptions == false)
            return false;
        VisualInteractionOptions other = (VisualInteractionOptions) obj;
        if (other.getVisualMenuOption() == null ^ this.getVisualMenuOption() == null)
            return false;
        if (other.getVisualMenuOption() != null && other.getVisualMenuOption().equals(this.getVisualMenuOption()) == false)
            return false;
        if (other.getContextMenuOption() == null ^ this.getContextMenuOption() == null)
            return false;
        if (other.getContextMenuOption() != null && other.getContextMenuOption().equals(this.getContextMenuOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisualMenuOption() == null) ? 0 : getVisualMenuOption().hashCode());
        hashCode = prime * hashCode + ((getContextMenuOption() == null) ? 0 : getContextMenuOption().hashCode());
        return hashCode;
    }

    @Override
    public VisualInteractionOptions clone() {
        try {
            return (VisualInteractionOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.VisualInteractionOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

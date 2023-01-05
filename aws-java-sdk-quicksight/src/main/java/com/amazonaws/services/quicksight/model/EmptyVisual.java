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
 * An empty visual.
 * </p>
 * <p>
 * Empty visuals are used in layouts but have not been configured to show any data. A new visual created in the Amazon
 * QuickSight console is considered an <code>EmptyVisual</code> until a visual type is selected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/EmptyVisual" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmptyVisual implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a visual. This identifier must be unique within the context of a dashboard, template, or
     * analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
     * </p>
     */
    private String visualId;
    /**
     * <p>
     * The data set that is used in the empty visual. Every visual requires a dataset to render.
     * </p>
     */
    private String dataSetIdentifier;
    /**
     * <p>
     * The list of custom actions that are configured for a visual.
     * </p>
     */
    private java.util.List<VisualCustomAction> actions;

    /**
     * <p>
     * The unique identifier of a visual. This identifier must be unique within the context of a dashboard, template, or
     * analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
     * </p>
     * 
     * @param visualId
     *        The unique identifier of a visual. This identifier must be unique within the context of a dashboard,
     *        template, or analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
     */

    public void setVisualId(String visualId) {
        this.visualId = visualId;
    }

    /**
     * <p>
     * The unique identifier of a visual. This identifier must be unique within the context of a dashboard, template, or
     * analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
     * </p>
     * 
     * @return The unique identifier of a visual. This identifier must be unique within the context of a dashboard,
     *         template, or analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
     */

    public String getVisualId() {
        return this.visualId;
    }

    /**
     * <p>
     * The unique identifier of a visual. This identifier must be unique within the context of a dashboard, template, or
     * analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
     * </p>
     * 
     * @param visualId
     *        The unique identifier of a visual. This identifier must be unique within the context of a dashboard,
     *        template, or analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmptyVisual withVisualId(String visualId) {
        setVisualId(visualId);
        return this;
    }

    /**
     * <p>
     * The data set that is used in the empty visual. Every visual requires a dataset to render.
     * </p>
     * 
     * @param dataSetIdentifier
     *        The data set that is used in the empty visual. Every visual requires a dataset to render.
     */

    public void setDataSetIdentifier(String dataSetIdentifier) {
        this.dataSetIdentifier = dataSetIdentifier;
    }

    /**
     * <p>
     * The data set that is used in the empty visual. Every visual requires a dataset to render.
     * </p>
     * 
     * @return The data set that is used in the empty visual. Every visual requires a dataset to render.
     */

    public String getDataSetIdentifier() {
        return this.dataSetIdentifier;
    }

    /**
     * <p>
     * The data set that is used in the empty visual. Every visual requires a dataset to render.
     * </p>
     * 
     * @param dataSetIdentifier
     *        The data set that is used in the empty visual. Every visual requires a dataset to render.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmptyVisual withDataSetIdentifier(String dataSetIdentifier) {
        setDataSetIdentifier(dataSetIdentifier);
        return this;
    }

    /**
     * <p>
     * The list of custom actions that are configured for a visual.
     * </p>
     * 
     * @return The list of custom actions that are configured for a visual.
     */

    public java.util.List<VisualCustomAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * The list of custom actions that are configured for a visual.
     * </p>
     * 
     * @param actions
     *        The list of custom actions that are configured for a visual.
     */

    public void setActions(java.util.Collection<VisualCustomAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<VisualCustomAction>(actions);
    }

    /**
     * <p>
     * The list of custom actions that are configured for a visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The list of custom actions that are configured for a visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmptyVisual withActions(VisualCustomAction... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<VisualCustomAction>(actions.length));
        }
        for (VisualCustomAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of custom actions that are configured for a visual.
     * </p>
     * 
     * @param actions
     *        The list of custom actions that are configured for a visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmptyVisual withActions(java.util.Collection<VisualCustomAction> actions) {
        setActions(actions);
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
        if (getVisualId() != null)
            sb.append("VisualId: ").append(getVisualId()).append(",");
        if (getDataSetIdentifier() != null)
            sb.append("DataSetIdentifier: ").append(getDataSetIdentifier()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmptyVisual == false)
            return false;
        EmptyVisual other = (EmptyVisual) obj;
        if (other.getVisualId() == null ^ this.getVisualId() == null)
            return false;
        if (other.getVisualId() != null && other.getVisualId().equals(this.getVisualId()) == false)
            return false;
        if (other.getDataSetIdentifier() == null ^ this.getDataSetIdentifier() == null)
            return false;
        if (other.getDataSetIdentifier() != null && other.getDataSetIdentifier().equals(this.getDataSetIdentifier()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisualId() == null) ? 0 : getVisualId().hashCode());
        hashCode = prime * hashCode + ((getDataSetIdentifier() == null) ? 0 : getDataSetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public EmptyVisual clone() {
        try {
            return (EmptyVisual) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.EmptyVisualMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

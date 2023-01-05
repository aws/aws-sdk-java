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
 * An insight visual.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html">Working with insights</a> in
 * the <i>Amazon QuickSight User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/InsightVisual" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightVisual implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a visual. This identifier must be unique within the context of a dashboard, template, or
     * analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
     * </p>
     */
    private String visualId;
    /**
     * <p>
     * The title that is displayed on the visual.
     * </p>
     */
    private VisualTitleLabelOptions title;
    /**
     * <p>
     * The subtitle that is displayed on the visual.
     * </p>
     */
    private VisualSubtitleLabelOptions subtitle;
    /**
     * <p>
     * The configuration of an insight visual.
     * </p>
     */
    private InsightConfiguration insightConfiguration;
    /**
     * <p>
     * The list of custom actions that are configured for a visual.
     * </p>
     */
    private java.util.List<VisualCustomAction> actions;
    /**
     * <p>
     * The dataset that is used in the insight visual.
     * </p>
     */
    private String dataSetIdentifier;

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

    public InsightVisual withVisualId(String visualId) {
        setVisualId(visualId);
        return this;
    }

    /**
     * <p>
     * The title that is displayed on the visual.
     * </p>
     * 
     * @param title
     *        The title that is displayed on the visual.
     */

    public void setTitle(VisualTitleLabelOptions title) {
        this.title = title;
    }

    /**
     * <p>
     * The title that is displayed on the visual.
     * </p>
     * 
     * @return The title that is displayed on the visual.
     */

    public VisualTitleLabelOptions getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title that is displayed on the visual.
     * </p>
     * 
     * @param title
     *        The title that is displayed on the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightVisual withTitle(VisualTitleLabelOptions title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The subtitle that is displayed on the visual.
     * </p>
     * 
     * @param subtitle
     *        The subtitle that is displayed on the visual.
     */

    public void setSubtitle(VisualSubtitleLabelOptions subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * <p>
     * The subtitle that is displayed on the visual.
     * </p>
     * 
     * @return The subtitle that is displayed on the visual.
     */

    public VisualSubtitleLabelOptions getSubtitle() {
        return this.subtitle;
    }

    /**
     * <p>
     * The subtitle that is displayed on the visual.
     * </p>
     * 
     * @param subtitle
     *        The subtitle that is displayed on the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightVisual withSubtitle(VisualSubtitleLabelOptions subtitle) {
        setSubtitle(subtitle);
        return this;
    }

    /**
     * <p>
     * The configuration of an insight visual.
     * </p>
     * 
     * @param insightConfiguration
     *        The configuration of an insight visual.
     */

    public void setInsightConfiguration(InsightConfiguration insightConfiguration) {
        this.insightConfiguration = insightConfiguration;
    }

    /**
     * <p>
     * The configuration of an insight visual.
     * </p>
     * 
     * @return The configuration of an insight visual.
     */

    public InsightConfiguration getInsightConfiguration() {
        return this.insightConfiguration;
    }

    /**
     * <p>
     * The configuration of an insight visual.
     * </p>
     * 
     * @param insightConfiguration
     *        The configuration of an insight visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightVisual withInsightConfiguration(InsightConfiguration insightConfiguration) {
        setInsightConfiguration(insightConfiguration);
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

    public InsightVisual withActions(VisualCustomAction... actions) {
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

    public InsightVisual withActions(java.util.Collection<VisualCustomAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The dataset that is used in the insight visual.
     * </p>
     * 
     * @param dataSetIdentifier
     *        The dataset that is used in the insight visual.
     */

    public void setDataSetIdentifier(String dataSetIdentifier) {
        this.dataSetIdentifier = dataSetIdentifier;
    }

    /**
     * <p>
     * The dataset that is used in the insight visual.
     * </p>
     * 
     * @return The dataset that is used in the insight visual.
     */

    public String getDataSetIdentifier() {
        return this.dataSetIdentifier;
    }

    /**
     * <p>
     * The dataset that is used in the insight visual.
     * </p>
     * 
     * @param dataSetIdentifier
     *        The dataset that is used in the insight visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightVisual withDataSetIdentifier(String dataSetIdentifier) {
        setDataSetIdentifier(dataSetIdentifier);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSubtitle() != null)
            sb.append("Subtitle: ").append(getSubtitle()).append(",");
        if (getInsightConfiguration() != null)
            sb.append("InsightConfiguration: ").append(getInsightConfiguration()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getDataSetIdentifier() != null)
            sb.append("DataSetIdentifier: ").append(getDataSetIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightVisual == false)
            return false;
        InsightVisual other = (InsightVisual) obj;
        if (other.getVisualId() == null ^ this.getVisualId() == null)
            return false;
        if (other.getVisualId() != null && other.getVisualId().equals(this.getVisualId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSubtitle() == null ^ this.getSubtitle() == null)
            return false;
        if (other.getSubtitle() != null && other.getSubtitle().equals(this.getSubtitle()) == false)
            return false;
        if (other.getInsightConfiguration() == null ^ this.getInsightConfiguration() == null)
            return false;
        if (other.getInsightConfiguration() != null && other.getInsightConfiguration().equals(this.getInsightConfiguration()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getDataSetIdentifier() == null ^ this.getDataSetIdentifier() == null)
            return false;
        if (other.getDataSetIdentifier() != null && other.getDataSetIdentifier().equals(this.getDataSetIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisualId() == null) ? 0 : getVisualId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        hashCode = prime * hashCode + ((getInsightConfiguration() == null) ? 0 : getInsightConfiguration().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getDataSetIdentifier() == null) ? 0 : getDataSetIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public InsightVisual clone() {
        try {
            return (InsightVisual) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.InsightVisualMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

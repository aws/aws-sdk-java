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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the type of grid layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GridViewConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GridViewConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the layout of the video tiles when content sharing is enabled.
     * </p>
     */
    private String contentShareLayout;
    /**
     * <p>
     * Defines the configuration options for a presenter only video tile.
     * </p>
     */
    private PresenterOnlyConfiguration presenterOnlyConfiguration;
    /**
     * <p>
     * The configuration settings for an <code>ActiveSpeakerOnly</code> video tile.
     * </p>
     */
    private ActiveSpeakerOnlyConfiguration activeSpeakerOnlyConfiguration;
    /**
     * <p>
     * The configuration settings for a horizontal layout.
     * </p>
     */
    private HorizontalLayoutConfiguration horizontalLayoutConfiguration;
    /**
     * <p>
     * The configuration settings for a vertical layout.
     * </p>
     */
    private VerticalLayoutConfiguration verticalLayoutConfiguration;
    /**
     * <p>
     * The attribute settings for the video tiles.
     * </p>
     */
    private VideoAttribute videoAttribute;
    /**
     * <p>
     * The orientation setting, horizontal or vertical.
     * </p>
     */
    private String canvasOrientation;

    /**
     * <p>
     * Defines the layout of the video tiles when content sharing is enabled.
     * </p>
     * 
     * @param contentShareLayout
     *        Defines the layout of the video tiles when content sharing is enabled.
     * @see ContentShareLayoutOption
     */

    public void setContentShareLayout(String contentShareLayout) {
        this.contentShareLayout = contentShareLayout;
    }

    /**
     * <p>
     * Defines the layout of the video tiles when content sharing is enabled.
     * </p>
     * 
     * @return Defines the layout of the video tiles when content sharing is enabled.
     * @see ContentShareLayoutOption
     */

    public String getContentShareLayout() {
        return this.contentShareLayout;
    }

    /**
     * <p>
     * Defines the layout of the video tiles when content sharing is enabled.
     * </p>
     * 
     * @param contentShareLayout
     *        Defines the layout of the video tiles when content sharing is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentShareLayoutOption
     */

    public GridViewConfiguration withContentShareLayout(String contentShareLayout) {
        setContentShareLayout(contentShareLayout);
        return this;
    }

    /**
     * <p>
     * Defines the layout of the video tiles when content sharing is enabled.
     * </p>
     * 
     * @param contentShareLayout
     *        Defines the layout of the video tiles when content sharing is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentShareLayoutOption
     */

    public GridViewConfiguration withContentShareLayout(ContentShareLayoutOption contentShareLayout) {
        this.contentShareLayout = contentShareLayout.toString();
        return this;
    }

    /**
     * <p>
     * Defines the configuration options for a presenter only video tile.
     * </p>
     * 
     * @param presenterOnlyConfiguration
     *        Defines the configuration options for a presenter only video tile.
     */

    public void setPresenterOnlyConfiguration(PresenterOnlyConfiguration presenterOnlyConfiguration) {
        this.presenterOnlyConfiguration = presenterOnlyConfiguration;
    }

    /**
     * <p>
     * Defines the configuration options for a presenter only video tile.
     * </p>
     * 
     * @return Defines the configuration options for a presenter only video tile.
     */

    public PresenterOnlyConfiguration getPresenterOnlyConfiguration() {
        return this.presenterOnlyConfiguration;
    }

    /**
     * <p>
     * Defines the configuration options for a presenter only video tile.
     * </p>
     * 
     * @param presenterOnlyConfiguration
     *        Defines the configuration options for a presenter only video tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridViewConfiguration withPresenterOnlyConfiguration(PresenterOnlyConfiguration presenterOnlyConfiguration) {
        setPresenterOnlyConfiguration(presenterOnlyConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration settings for an <code>ActiveSpeakerOnly</code> video tile.
     * </p>
     * 
     * @param activeSpeakerOnlyConfiguration
     *        The configuration settings for an <code>ActiveSpeakerOnly</code> video tile.
     */

    public void setActiveSpeakerOnlyConfiguration(ActiveSpeakerOnlyConfiguration activeSpeakerOnlyConfiguration) {
        this.activeSpeakerOnlyConfiguration = activeSpeakerOnlyConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an <code>ActiveSpeakerOnly</code> video tile.
     * </p>
     * 
     * @return The configuration settings for an <code>ActiveSpeakerOnly</code> video tile.
     */

    public ActiveSpeakerOnlyConfiguration getActiveSpeakerOnlyConfiguration() {
        return this.activeSpeakerOnlyConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an <code>ActiveSpeakerOnly</code> video tile.
     * </p>
     * 
     * @param activeSpeakerOnlyConfiguration
     *        The configuration settings for an <code>ActiveSpeakerOnly</code> video tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridViewConfiguration withActiveSpeakerOnlyConfiguration(ActiveSpeakerOnlyConfiguration activeSpeakerOnlyConfiguration) {
        setActiveSpeakerOnlyConfiguration(activeSpeakerOnlyConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration settings for a horizontal layout.
     * </p>
     * 
     * @param horizontalLayoutConfiguration
     *        The configuration settings for a horizontal layout.
     */

    public void setHorizontalLayoutConfiguration(HorizontalLayoutConfiguration horizontalLayoutConfiguration) {
        this.horizontalLayoutConfiguration = horizontalLayoutConfiguration;
    }

    /**
     * <p>
     * The configuration settings for a horizontal layout.
     * </p>
     * 
     * @return The configuration settings for a horizontal layout.
     */

    public HorizontalLayoutConfiguration getHorizontalLayoutConfiguration() {
        return this.horizontalLayoutConfiguration;
    }

    /**
     * <p>
     * The configuration settings for a horizontal layout.
     * </p>
     * 
     * @param horizontalLayoutConfiguration
     *        The configuration settings for a horizontal layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridViewConfiguration withHorizontalLayoutConfiguration(HorizontalLayoutConfiguration horizontalLayoutConfiguration) {
        setHorizontalLayoutConfiguration(horizontalLayoutConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration settings for a vertical layout.
     * </p>
     * 
     * @param verticalLayoutConfiguration
     *        The configuration settings for a vertical layout.
     */

    public void setVerticalLayoutConfiguration(VerticalLayoutConfiguration verticalLayoutConfiguration) {
        this.verticalLayoutConfiguration = verticalLayoutConfiguration;
    }

    /**
     * <p>
     * The configuration settings for a vertical layout.
     * </p>
     * 
     * @return The configuration settings for a vertical layout.
     */

    public VerticalLayoutConfiguration getVerticalLayoutConfiguration() {
        return this.verticalLayoutConfiguration;
    }

    /**
     * <p>
     * The configuration settings for a vertical layout.
     * </p>
     * 
     * @param verticalLayoutConfiguration
     *        The configuration settings for a vertical layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridViewConfiguration withVerticalLayoutConfiguration(VerticalLayoutConfiguration verticalLayoutConfiguration) {
        setVerticalLayoutConfiguration(verticalLayoutConfiguration);
        return this;
    }

    /**
     * <p>
     * The attribute settings for the video tiles.
     * </p>
     * 
     * @param videoAttribute
     *        The attribute settings for the video tiles.
     */

    public void setVideoAttribute(VideoAttribute videoAttribute) {
        this.videoAttribute = videoAttribute;
    }

    /**
     * <p>
     * The attribute settings for the video tiles.
     * </p>
     * 
     * @return The attribute settings for the video tiles.
     */

    public VideoAttribute getVideoAttribute() {
        return this.videoAttribute;
    }

    /**
     * <p>
     * The attribute settings for the video tiles.
     * </p>
     * 
     * @param videoAttribute
     *        The attribute settings for the video tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridViewConfiguration withVideoAttribute(VideoAttribute videoAttribute) {
        setVideoAttribute(videoAttribute);
        return this;
    }

    /**
     * <p>
     * The orientation setting, horizontal or vertical.
     * </p>
     * 
     * @param canvasOrientation
     *        The orientation setting, horizontal or vertical.
     * @see CanvasOrientation
     */

    public void setCanvasOrientation(String canvasOrientation) {
        this.canvasOrientation = canvasOrientation;
    }

    /**
     * <p>
     * The orientation setting, horizontal or vertical.
     * </p>
     * 
     * @return The orientation setting, horizontal or vertical.
     * @see CanvasOrientation
     */

    public String getCanvasOrientation() {
        return this.canvasOrientation;
    }

    /**
     * <p>
     * The orientation setting, horizontal or vertical.
     * </p>
     * 
     * @param canvasOrientation
     *        The orientation setting, horizontal or vertical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CanvasOrientation
     */

    public GridViewConfiguration withCanvasOrientation(String canvasOrientation) {
        setCanvasOrientation(canvasOrientation);
        return this;
    }

    /**
     * <p>
     * The orientation setting, horizontal or vertical.
     * </p>
     * 
     * @param canvasOrientation
     *        The orientation setting, horizontal or vertical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CanvasOrientation
     */

    public GridViewConfiguration withCanvasOrientation(CanvasOrientation canvasOrientation) {
        this.canvasOrientation = canvasOrientation.toString();
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
        if (getContentShareLayout() != null)
            sb.append("ContentShareLayout: ").append(getContentShareLayout()).append(",");
        if (getPresenterOnlyConfiguration() != null)
            sb.append("PresenterOnlyConfiguration: ").append(getPresenterOnlyConfiguration()).append(",");
        if (getActiveSpeakerOnlyConfiguration() != null)
            sb.append("ActiveSpeakerOnlyConfiguration: ").append(getActiveSpeakerOnlyConfiguration()).append(",");
        if (getHorizontalLayoutConfiguration() != null)
            sb.append("HorizontalLayoutConfiguration: ").append(getHorizontalLayoutConfiguration()).append(",");
        if (getVerticalLayoutConfiguration() != null)
            sb.append("VerticalLayoutConfiguration: ").append(getVerticalLayoutConfiguration()).append(",");
        if (getVideoAttribute() != null)
            sb.append("VideoAttribute: ").append(getVideoAttribute()).append(",");
        if (getCanvasOrientation() != null)
            sb.append("CanvasOrientation: ").append(getCanvasOrientation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GridViewConfiguration == false)
            return false;
        GridViewConfiguration other = (GridViewConfiguration) obj;
        if (other.getContentShareLayout() == null ^ this.getContentShareLayout() == null)
            return false;
        if (other.getContentShareLayout() != null && other.getContentShareLayout().equals(this.getContentShareLayout()) == false)
            return false;
        if (other.getPresenterOnlyConfiguration() == null ^ this.getPresenterOnlyConfiguration() == null)
            return false;
        if (other.getPresenterOnlyConfiguration() != null && other.getPresenterOnlyConfiguration().equals(this.getPresenterOnlyConfiguration()) == false)
            return false;
        if (other.getActiveSpeakerOnlyConfiguration() == null ^ this.getActiveSpeakerOnlyConfiguration() == null)
            return false;
        if (other.getActiveSpeakerOnlyConfiguration() != null
                && other.getActiveSpeakerOnlyConfiguration().equals(this.getActiveSpeakerOnlyConfiguration()) == false)
            return false;
        if (other.getHorizontalLayoutConfiguration() == null ^ this.getHorizontalLayoutConfiguration() == null)
            return false;
        if (other.getHorizontalLayoutConfiguration() != null
                && other.getHorizontalLayoutConfiguration().equals(this.getHorizontalLayoutConfiguration()) == false)
            return false;
        if (other.getVerticalLayoutConfiguration() == null ^ this.getVerticalLayoutConfiguration() == null)
            return false;
        if (other.getVerticalLayoutConfiguration() != null && other.getVerticalLayoutConfiguration().equals(this.getVerticalLayoutConfiguration()) == false)
            return false;
        if (other.getVideoAttribute() == null ^ this.getVideoAttribute() == null)
            return false;
        if (other.getVideoAttribute() != null && other.getVideoAttribute().equals(this.getVideoAttribute()) == false)
            return false;
        if (other.getCanvasOrientation() == null ^ this.getCanvasOrientation() == null)
            return false;
        if (other.getCanvasOrientation() != null && other.getCanvasOrientation().equals(this.getCanvasOrientation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentShareLayout() == null) ? 0 : getContentShareLayout().hashCode());
        hashCode = prime * hashCode + ((getPresenterOnlyConfiguration() == null) ? 0 : getPresenterOnlyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getActiveSpeakerOnlyConfiguration() == null) ? 0 : getActiveSpeakerOnlyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHorizontalLayoutConfiguration() == null) ? 0 : getHorizontalLayoutConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVerticalLayoutConfiguration() == null) ? 0 : getVerticalLayoutConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVideoAttribute() == null) ? 0 : getVideoAttribute().hashCode());
        hashCode = prime * hashCode + ((getCanvasOrientation() == null) ? 0 : getCanvasOrientation().hashCode());
        return hashCode;
    }

    @Override
    public GridViewConfiguration clone() {
        try {
            return (GridViewConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.GridViewConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

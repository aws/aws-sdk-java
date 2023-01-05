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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration for the composited video artifacts.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CompositedVideoArtifactsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompositedVideoArtifactsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The layout setting, such as <code>GridView</code> in the configuration object.
     * </p>
     */
    private String layout;
    /**
     * <p>
     * The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920 x 1080.
     * </p>
     */
    private String resolution;
    /**
     * <p>
     * The <code>GridView</code> configuration setting.
     * </p>
     */
    private GridViewConfiguration gridViewConfiguration;

    /**
     * <p>
     * The layout setting, such as <code>GridView</code> in the configuration object.
     * </p>
     * 
     * @param layout
     *        The layout setting, such as <code>GridView</code> in the configuration object.
     * @see LayoutOption
     */

    public void setLayout(String layout) {
        this.layout = layout;
    }

    /**
     * <p>
     * The layout setting, such as <code>GridView</code> in the configuration object.
     * </p>
     * 
     * @return The layout setting, such as <code>GridView</code> in the configuration object.
     * @see LayoutOption
     */

    public String getLayout() {
        return this.layout;
    }

    /**
     * <p>
     * The layout setting, such as <code>GridView</code> in the configuration object.
     * </p>
     * 
     * @param layout
     *        The layout setting, such as <code>GridView</code> in the configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayoutOption
     */

    public CompositedVideoArtifactsConfiguration withLayout(String layout) {
        setLayout(layout);
        return this;
    }

    /**
     * <p>
     * The layout setting, such as <code>GridView</code> in the configuration object.
     * </p>
     * 
     * @param layout
     *        The layout setting, such as <code>GridView</code> in the configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayoutOption
     */

    public CompositedVideoArtifactsConfiguration withLayout(LayoutOption layout) {
        this.layout = layout.toString();
        return this;
    }

    /**
     * <p>
     * The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920 x 1080.
     * </p>
     * 
     * @param resolution
     *        The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920
     *        x 1080.
     * @see ResolutionOption
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * <p>
     * The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920 x 1080.
     * </p>
     * 
     * @return The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920
     *         x 1080.
     * @see ResolutionOption
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * <p>
     * The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920 x 1080.
     * </p>
     * 
     * @param resolution
     *        The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920
     *        x 1080.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolutionOption
     */

    public CompositedVideoArtifactsConfiguration withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * <p>
     * The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920 x 1080.
     * </p>
     * 
     * @param resolution
     *        The video resolution setting in the configuration object. Default: HD at 1280 x 720. FHD resolution: 1920
     *        x 1080.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolutionOption
     */

    public CompositedVideoArtifactsConfiguration withResolution(ResolutionOption resolution) {
        this.resolution = resolution.toString();
        return this;
    }

    /**
     * <p>
     * The <code>GridView</code> configuration setting.
     * </p>
     * 
     * @param gridViewConfiguration
     *        The <code>GridView</code> configuration setting.
     */

    public void setGridViewConfiguration(GridViewConfiguration gridViewConfiguration) {
        this.gridViewConfiguration = gridViewConfiguration;
    }

    /**
     * <p>
     * The <code>GridView</code> configuration setting.
     * </p>
     * 
     * @return The <code>GridView</code> configuration setting.
     */

    public GridViewConfiguration getGridViewConfiguration() {
        return this.gridViewConfiguration;
    }

    /**
     * <p>
     * The <code>GridView</code> configuration setting.
     * </p>
     * 
     * @param gridViewConfiguration
     *        The <code>GridView</code> configuration setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompositedVideoArtifactsConfiguration withGridViewConfiguration(GridViewConfiguration gridViewConfiguration) {
        setGridViewConfiguration(gridViewConfiguration);
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
        if (getLayout() != null)
            sb.append("Layout: ").append(getLayout()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getGridViewConfiguration() != null)
            sb.append("GridViewConfiguration: ").append(getGridViewConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompositedVideoArtifactsConfiguration == false)
            return false;
        CompositedVideoArtifactsConfiguration other = (CompositedVideoArtifactsConfiguration) obj;
        if (other.getLayout() == null ^ this.getLayout() == null)
            return false;
        if (other.getLayout() != null && other.getLayout().equals(this.getLayout()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getGridViewConfiguration() == null ^ this.getGridViewConfiguration() == null)
            return false;
        if (other.getGridViewConfiguration() != null && other.getGridViewConfiguration().equals(this.getGridViewConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayout() == null) ? 0 : getLayout().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getGridViewConfiguration() == null) ? 0 : getGridViewConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CompositedVideoArtifactsConfiguration clone() {
        try {
            return (CompositedVideoArtifactsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.CompositedVideoArtifactsConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

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
            sb.append("PresenterOnlyConfiguration: ").append(getPresenterOnlyConfiguration());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentShareLayout() == null) ? 0 : getContentShareLayout().hashCode());
        hashCode = prime * hashCode + ((getPresenterOnlyConfiguration() == null) ? 0 : getPresenterOnlyConfiguration().hashCode());
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

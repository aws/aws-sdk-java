/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or
 * disable this feature for each output individually. This setting is disabled by default. When you enable Noise reducer
 * (NoiseReducer), you must also select a value for Noise reducer filter (NoiseReducerFilter).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/NoiseReducer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NoiseReducer implements Serializable, Cloneable, StructuredPojo {

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions.
     * To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge preserving noise
     * reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are convolution filters. * Conserve
     * is a min/max noise reduction filter. * Spatial is a frequency-domain filter based on JND principles.
     */
    private String filter;
    /** Settings for a noise reducer filter */
    private NoiseReducerFilterSettings filterSettings;
    /** Noise reducer filter settings for spatial filter. */
    private NoiseReducerSpatialFilterSettings spatialFilterSettings;

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions.
     * To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge preserving noise
     * reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are convolution filters. * Conserve
     * is a min/max noise reduction filter. * Spatial is a frequency-domain filter based on JND principles.
     * 
     * @param filter
     *        Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering
     *        functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge
     *        preserving noise reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are
     *        convolution filters. * Conserve is a min/max noise reduction filter. * Spatial is a frequency-domain
     *        filter based on JND principles.
     * @see NoiseReducerFilter
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions.
     * To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge preserving noise
     * reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are convolution filters. * Conserve
     * is a min/max noise reduction filter. * Spatial is a frequency-domain filter based on JND principles.
     * 
     * @return Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering
     *         functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge
     *         preserving noise reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are
     *         convolution filters. * Conserve is a min/max noise reduction filter. * Spatial is a frequency-domain
     *         filter based on JND principles.
     * @see NoiseReducerFilter
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions.
     * To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge preserving noise
     * reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are convolution filters. * Conserve
     * is a min/max noise reduction filter. * Spatial is a frequency-domain filter based on JND principles.
     * 
     * @param filter
     *        Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering
     *        functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge
     *        preserving noise reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are
     *        convolution filters. * Conserve is a min/max noise reduction filter. * Spatial is a frequency-domain
     *        filter based on JND principles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NoiseReducerFilter
     */

    public NoiseReducer withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions.
     * To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge preserving noise
     * reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are convolution filters. * Conserve
     * is a min/max noise reduction filter. * Spatial is a frequency-domain filter based on JND principles.
     * 
     * @param filter
     *        Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering
     *        functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge
     *        preserving noise reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are
     *        convolution filters. * Conserve is a min/max noise reduction filter. * Spatial is a frequency-domain
     *        filter based on JND principles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NoiseReducerFilter
     */

    public NoiseReducer withFilter(NoiseReducerFilter filter) {
        this.filter = filter.toString();
        return this;
    }

    /**
     * Settings for a noise reducer filter
     * 
     * @param filterSettings
     *        Settings for a noise reducer filter
     */

    public void setFilterSettings(NoiseReducerFilterSettings filterSettings) {
        this.filterSettings = filterSettings;
    }

    /**
     * Settings for a noise reducer filter
     * 
     * @return Settings for a noise reducer filter
     */

    public NoiseReducerFilterSettings getFilterSettings() {
        return this.filterSettings;
    }

    /**
     * Settings for a noise reducer filter
     * 
     * @param filterSettings
     *        Settings for a noise reducer filter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NoiseReducer withFilterSettings(NoiseReducerFilterSettings filterSettings) {
        setFilterSettings(filterSettings);
        return this;
    }

    /**
     * Noise reducer filter settings for spatial filter.
     * 
     * @param spatialFilterSettings
     *        Noise reducer filter settings for spatial filter.
     */

    public void setSpatialFilterSettings(NoiseReducerSpatialFilterSettings spatialFilterSettings) {
        this.spatialFilterSettings = spatialFilterSettings;
    }

    /**
     * Noise reducer filter settings for spatial filter.
     * 
     * @return Noise reducer filter settings for spatial filter.
     */

    public NoiseReducerSpatialFilterSettings getSpatialFilterSettings() {
        return this.spatialFilterSettings;
    }

    /**
     * Noise reducer filter settings for spatial filter.
     * 
     * @param spatialFilterSettings
     *        Noise reducer filter settings for spatial filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NoiseReducer withSpatialFilterSettings(NoiseReducerSpatialFilterSettings spatialFilterSettings) {
        setSpatialFilterSettings(spatialFilterSettings);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getFilterSettings() != null)
            sb.append("FilterSettings: ").append(getFilterSettings()).append(",");
        if (getSpatialFilterSettings() != null)
            sb.append("SpatialFilterSettings: ").append(getSpatialFilterSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NoiseReducer == false)
            return false;
        NoiseReducer other = (NoiseReducer) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getFilterSettings() == null ^ this.getFilterSettings() == null)
            return false;
        if (other.getFilterSettings() != null && other.getFilterSettings().equals(this.getFilterSettings()) == false)
            return false;
        if (other.getSpatialFilterSettings() == null ^ this.getSpatialFilterSettings() == null)
            return false;
        if (other.getSpatialFilterSettings() != null && other.getSpatialFilterSettings().equals(this.getSpatialFilterSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getFilterSettings() == null) ? 0 : getFilterSettings().hashCode());
        hashCode = prime * hashCode + ((getSpatialFilterSettings() == null) ? 0 : getSpatialFilterSettings().hashCode());
        return hashCode;
    }

    @Override
    public NoiseReducer clone() {
        try {
            return (NoiseReducer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.NoiseReducerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

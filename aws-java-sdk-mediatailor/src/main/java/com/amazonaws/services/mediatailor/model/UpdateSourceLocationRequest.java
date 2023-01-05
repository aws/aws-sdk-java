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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateSourceLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSourceLocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Access configuration parameters. Configures the type of authentication used to access content from your source
     * location.
     * </p>
     */
    private AccessConfiguration accessConfiguration;
    /**
     * <p>
     * The optional configuration for the host server that serves segments.
     * </p>
     */
    private DefaultSegmentDeliveryConfiguration defaultSegmentDeliveryConfiguration;
    /**
     * <p>
     * The HTTP configuration for the source location.
     * </p>
     */
    private HttpConfiguration httpConfiguration;
    /**
     * <p>
     * A list of the segment delivery configurations associated with this resource.
     * </p>
     */
    private java.util.List<SegmentDeliveryConfiguration> segmentDeliveryConfigurations;
    /**
     * <p>
     * The name of the source location.
     * </p>
     */
    private String sourceLocationName;

    /**
     * <p>
     * Access configuration parameters. Configures the type of authentication used to access content from your source
     * location.
     * </p>
     * 
     * @param accessConfiguration
     *        Access configuration parameters. Configures the type of authentication used to access content from your
     *        source location.
     */

    public void setAccessConfiguration(AccessConfiguration accessConfiguration) {
        this.accessConfiguration = accessConfiguration;
    }

    /**
     * <p>
     * Access configuration parameters. Configures the type of authentication used to access content from your source
     * location.
     * </p>
     * 
     * @return Access configuration parameters. Configures the type of authentication used to access content from your
     *         source location.
     */

    public AccessConfiguration getAccessConfiguration() {
        return this.accessConfiguration;
    }

    /**
     * <p>
     * Access configuration parameters. Configures the type of authentication used to access content from your source
     * location.
     * </p>
     * 
     * @param accessConfiguration
     *        Access configuration parameters. Configures the type of authentication used to access content from your
     *        source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationRequest withAccessConfiguration(AccessConfiguration accessConfiguration) {
        setAccessConfiguration(accessConfiguration);
        return this;
    }

    /**
     * <p>
     * The optional configuration for the host server that serves segments.
     * </p>
     * 
     * @param defaultSegmentDeliveryConfiguration
     *        The optional configuration for the host server that serves segments.
     */

    public void setDefaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfiguration defaultSegmentDeliveryConfiguration) {
        this.defaultSegmentDeliveryConfiguration = defaultSegmentDeliveryConfiguration;
    }

    /**
     * <p>
     * The optional configuration for the host server that serves segments.
     * </p>
     * 
     * @return The optional configuration for the host server that serves segments.
     */

    public DefaultSegmentDeliveryConfiguration getDefaultSegmentDeliveryConfiguration() {
        return this.defaultSegmentDeliveryConfiguration;
    }

    /**
     * <p>
     * The optional configuration for the host server that serves segments.
     * </p>
     * 
     * @param defaultSegmentDeliveryConfiguration
     *        The optional configuration for the host server that serves segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationRequest withDefaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfiguration defaultSegmentDeliveryConfiguration) {
        setDefaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration);
        return this;
    }

    /**
     * <p>
     * The HTTP configuration for the source location.
     * </p>
     * 
     * @param httpConfiguration
     *        The HTTP configuration for the source location.
     */

    public void setHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    /**
     * <p>
     * The HTTP configuration for the source location.
     * </p>
     * 
     * @return The HTTP configuration for the source location.
     */

    public HttpConfiguration getHttpConfiguration() {
        return this.httpConfiguration;
    }

    /**
     * <p>
     * The HTTP configuration for the source location.
     * </p>
     * 
     * @param httpConfiguration
     *        The HTTP configuration for the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationRequest withHttpConfiguration(HttpConfiguration httpConfiguration) {
        setHttpConfiguration(httpConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of the segment delivery configurations associated with this resource.
     * </p>
     * 
     * @return A list of the segment delivery configurations associated with this resource.
     */

    public java.util.List<SegmentDeliveryConfiguration> getSegmentDeliveryConfigurations() {
        return segmentDeliveryConfigurations;
    }

    /**
     * <p>
     * A list of the segment delivery configurations associated with this resource.
     * </p>
     * 
     * @param segmentDeliveryConfigurations
     *        A list of the segment delivery configurations associated with this resource.
     */

    public void setSegmentDeliveryConfigurations(java.util.Collection<SegmentDeliveryConfiguration> segmentDeliveryConfigurations) {
        if (segmentDeliveryConfigurations == null) {
            this.segmentDeliveryConfigurations = null;
            return;
        }

        this.segmentDeliveryConfigurations = new java.util.ArrayList<SegmentDeliveryConfiguration>(segmentDeliveryConfigurations);
    }

    /**
     * <p>
     * A list of the segment delivery configurations associated with this resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegmentDeliveryConfigurations(java.util.Collection)} or
     * {@link #withSegmentDeliveryConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param segmentDeliveryConfigurations
     *        A list of the segment delivery configurations associated with this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationRequest withSegmentDeliveryConfigurations(SegmentDeliveryConfiguration... segmentDeliveryConfigurations) {
        if (this.segmentDeliveryConfigurations == null) {
            setSegmentDeliveryConfigurations(new java.util.ArrayList<SegmentDeliveryConfiguration>(segmentDeliveryConfigurations.length));
        }
        for (SegmentDeliveryConfiguration ele : segmentDeliveryConfigurations) {
            this.segmentDeliveryConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the segment delivery configurations associated with this resource.
     * </p>
     * 
     * @param segmentDeliveryConfigurations
     *        A list of the segment delivery configurations associated with this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationRequest withSegmentDeliveryConfigurations(java.util.Collection<SegmentDeliveryConfiguration> segmentDeliveryConfigurations) {
        setSegmentDeliveryConfigurations(segmentDeliveryConfigurations);
        return this;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @return The name of the source location.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationRequest withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
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
        if (getAccessConfiguration() != null)
            sb.append("AccessConfiguration: ").append(getAccessConfiguration()).append(",");
        if (getDefaultSegmentDeliveryConfiguration() != null)
            sb.append("DefaultSegmentDeliveryConfiguration: ").append(getDefaultSegmentDeliveryConfiguration()).append(",");
        if (getHttpConfiguration() != null)
            sb.append("HttpConfiguration: ").append(getHttpConfiguration()).append(",");
        if (getSegmentDeliveryConfigurations() != null)
            sb.append("SegmentDeliveryConfigurations: ").append(getSegmentDeliveryConfigurations()).append(",");
        if (getSourceLocationName() != null)
            sb.append("SourceLocationName: ").append(getSourceLocationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSourceLocationRequest == false)
            return false;
        UpdateSourceLocationRequest other = (UpdateSourceLocationRequest) obj;
        if (other.getAccessConfiguration() == null ^ this.getAccessConfiguration() == null)
            return false;
        if (other.getAccessConfiguration() != null && other.getAccessConfiguration().equals(this.getAccessConfiguration()) == false)
            return false;
        if (other.getDefaultSegmentDeliveryConfiguration() == null ^ this.getDefaultSegmentDeliveryConfiguration() == null)
            return false;
        if (other.getDefaultSegmentDeliveryConfiguration() != null
                && other.getDefaultSegmentDeliveryConfiguration().equals(this.getDefaultSegmentDeliveryConfiguration()) == false)
            return false;
        if (other.getHttpConfiguration() == null ^ this.getHttpConfiguration() == null)
            return false;
        if (other.getHttpConfiguration() != null && other.getHttpConfiguration().equals(this.getHttpConfiguration()) == false)
            return false;
        if (other.getSegmentDeliveryConfigurations() == null ^ this.getSegmentDeliveryConfigurations() == null)
            return false;
        if (other.getSegmentDeliveryConfigurations() != null
                && other.getSegmentDeliveryConfigurations().equals(this.getSegmentDeliveryConfigurations()) == false)
            return false;
        if (other.getSourceLocationName() == null ^ this.getSourceLocationName() == null)
            return false;
        if (other.getSourceLocationName() != null && other.getSourceLocationName().equals(this.getSourceLocationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessConfiguration() == null) ? 0 : getAccessConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDefaultSegmentDeliveryConfiguration() == null) ? 0 : getDefaultSegmentDeliveryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHttpConfiguration() == null) ? 0 : getHttpConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSegmentDeliveryConfigurations() == null) ? 0 : getSegmentDeliveryConfigurations().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSourceLocationRequest clone() {
        return (UpdateSourceLocationRequest) super.clone();
    }

}

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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to update the tracking options for a configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetTrackingOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationSetTrackingOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set for which you want to update the custom tracking domain.
     * </p>
     */
    private String configurationSetName;

    private TrackingOptions trackingOptions;

    /**
     * <p>
     * The name of the configuration set for which you want to update the custom tracking domain.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set for which you want to update the custom tracking domain.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set for which you want to update the custom tracking domain.
     * </p>
     * 
     * @return The name of the configuration set for which you want to update the custom tracking domain.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set for which you want to update the custom tracking domain.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set for which you want to update the custom tracking domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationSetTrackingOptionsRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * @param trackingOptions
     */

    public void setTrackingOptions(TrackingOptions trackingOptions) {
        this.trackingOptions = trackingOptions;
    }

    /**
     * @return
     */

    public TrackingOptions getTrackingOptions() {
        return this.trackingOptions;
    }

    /**
     * @param trackingOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationSetTrackingOptionsRequest withTrackingOptions(TrackingOptions trackingOptions) {
        setTrackingOptions(trackingOptions);
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getTrackingOptions() != null)
            sb.append("TrackingOptions: ").append(getTrackingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationSetTrackingOptionsRequest == false)
            return false;
        UpdateConfigurationSetTrackingOptionsRequest other = (UpdateConfigurationSetTrackingOptionsRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getTrackingOptions() == null ^ this.getTrackingOptions() == null)
            return false;
        if (other.getTrackingOptions() != null && other.getTrackingOptions().equals(this.getTrackingOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getTrackingOptions() == null) ? 0 : getTrackingOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfigurationSetTrackingOptionsRequest clone() {
        return (UpdateConfigurationSetTrackingOptionsRequest) super.clone();
    }

}

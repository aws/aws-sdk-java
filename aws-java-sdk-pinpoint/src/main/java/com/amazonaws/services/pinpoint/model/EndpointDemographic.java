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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Demographic information about the endpoint.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointDemographic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointDemographic implements Serializable, Cloneable, StructuredPojo {

    /** The version of the application associated with the endpoint. */
    private String appVersion;
    /**
     * The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore, followed by
     * an ISO 3166-1 alpha-2 value.
     */
    private String locale;
    /** The manufacturer of the endpoint device, such as Apple or Samsung. */
    private String make;
    /** The model name or number of the endpoint device, such as iPhone. */
    private String model;
    /** The model version of the endpoint device. */
    private String modelVersion;
    /** The platform of the endpoint device, such as iOS or Android. */
    private String platform;
    /** The platform version of the endpoint device. */
    private String platformVersion;
    /** The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles. */
    private String timezone;

    /**
     * The version of the application associated with the endpoint.
     * 
     * @param appVersion
     *        The version of the application associated with the endpoint.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * The version of the application associated with the endpoint.
     * 
     * @return The version of the application associated with the endpoint.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * The version of the application associated with the endpoint.
     * 
     * @param appVersion
     *        The version of the application associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore, followed by
     * an ISO 3166-1 alpha-2 value.
     * 
     * @param locale
     *        The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore,
     *        followed by an ISO 3166-1 alpha-2 value.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore, followed by
     * an ISO 3166-1 alpha-2 value.
     * 
     * @return The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore,
     *         followed by an ISO 3166-1 alpha-2 value.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore, followed by
     * an ISO 3166-1 alpha-2 value.
     * 
     * @param locale
     *        The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore,
     *        followed by an ISO 3166-1 alpha-2 value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * The manufacturer of the endpoint device, such as Apple or Samsung.
     * 
     * @param make
     *        The manufacturer of the endpoint device, such as Apple or Samsung.
     */

    public void setMake(String make) {
        this.make = make;
    }

    /**
     * The manufacturer of the endpoint device, such as Apple or Samsung.
     * 
     * @return The manufacturer of the endpoint device, such as Apple or Samsung.
     */

    public String getMake() {
        return this.make;
    }

    /**
     * The manufacturer of the endpoint device, such as Apple or Samsung.
     * 
     * @param make
     *        The manufacturer of the endpoint device, such as Apple or Samsung.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withMake(String make) {
        setMake(make);
        return this;
    }

    /**
     * The model name or number of the endpoint device, such as iPhone.
     * 
     * @param model
     *        The model name or number of the endpoint device, such as iPhone.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The model name or number of the endpoint device, such as iPhone.
     * 
     * @return The model name or number of the endpoint device, such as iPhone.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * The model name or number of the endpoint device, such as iPhone.
     * 
     * @param model
     *        The model name or number of the endpoint device, such as iPhone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * The model version of the endpoint device.
     * 
     * @param modelVersion
     *        The model version of the endpoint device.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * The model version of the endpoint device.
     * 
     * @return The model version of the endpoint device.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * The model version of the endpoint device.
     * 
     * @param modelVersion
     *        The model version of the endpoint device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * The platform of the endpoint device, such as iOS or Android.
     * 
     * @param platform
     *        The platform of the endpoint device, such as iOS or Android.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * The platform of the endpoint device, such as iOS or Android.
     * 
     * @return The platform of the endpoint device, such as iOS or Android.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * The platform of the endpoint device, such as iOS or Android.
     * 
     * @param platform
     *        The platform of the endpoint device, such as iOS or Android.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * The platform version of the endpoint device.
     * 
     * @param platformVersion
     *        The platform version of the endpoint device.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * The platform version of the endpoint device.
     * 
     * @return The platform version of the endpoint device.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * The platform version of the endpoint device.
     * 
     * @param platformVersion
     *        The platform version of the endpoint device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
     * 
     * @param timezone
     *        The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
     * 
     * @return The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
     * 
     * @param timezone
     *        The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withTimezone(String timezone) {
        setTimezone(timezone);
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
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getMake() != null)
            sb.append("Make: ").append(getMake()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointDemographic == false)
            return false;
        EndpointDemographic other = (EndpointDemographic) obj;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getMake() == null ^ this.getMake() == null)
            return false;
        if (other.getMake() != null && other.getMake().equals(this.getMake()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getMake() == null) ? 0 : getMake().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public EndpointDemographic clone() {
        try {
            return (EndpointDemographic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EndpointDemographicMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

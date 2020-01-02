/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Specifies demographic information about an endpoint, such as the applicable time zone and platform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointDemographic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointDemographic implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the app that's associated with the endpoint.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore (_),
     * followed by an ISO 3166-1 alpha-2 value.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * The manufacturer of the endpoint device, such as apple or samsung.
     * </p>
     */
    private String make;
    /**
     * <p>
     * The model name or number of the endpoint device, such as iPhone or SM-G900F.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The model version of the endpoint device.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The platform of the endpoint device, such as ios.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The platform version of the endpoint device.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The version of the app that's associated with the endpoint.
     * </p>
     * 
     * @param appVersion
     *        The version of the app that's associated with the endpoint.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * The version of the app that's associated with the endpoint.
     * </p>
     * 
     * @return The version of the app that's associated with the endpoint.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * The version of the app that's associated with the endpoint.
     * </p>
     * 
     * @param appVersion
     *        The version of the app that's associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore (_),
     * followed by an ISO 3166-1 alpha-2 value.
     * </p>
     * 
     * @param locale
     *        The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore
     *        (_), followed by an ISO 3166-1 alpha-2 value.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore (_),
     * followed by an ISO 3166-1 alpha-2 value.
     * </p>
     * 
     * @return The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an
     *         underscore (_), followed by an ISO 3166-1 alpha-2 value.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore (_),
     * followed by an ISO 3166-1 alpha-2 value.
     * </p>
     * 
     * @param locale
     *        The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore
     *        (_), followed by an ISO 3166-1 alpha-2 value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The manufacturer of the endpoint device, such as apple or samsung.
     * </p>
     * 
     * @param make
     *        The manufacturer of the endpoint device, such as apple or samsung.
     */

    public void setMake(String make) {
        this.make = make;
    }

    /**
     * <p>
     * The manufacturer of the endpoint device, such as apple or samsung.
     * </p>
     * 
     * @return The manufacturer of the endpoint device, such as apple or samsung.
     */

    public String getMake() {
        return this.make;
    }

    /**
     * <p>
     * The manufacturer of the endpoint device, such as apple or samsung.
     * </p>
     * 
     * @param make
     *        The manufacturer of the endpoint device, such as apple or samsung.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withMake(String make) {
        setMake(make);
        return this;
    }

    /**
     * <p>
     * The model name or number of the endpoint device, such as iPhone or SM-G900F.
     * </p>
     * 
     * @param model
     *        The model name or number of the endpoint device, such as iPhone or SM-G900F.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The model name or number of the endpoint device, such as iPhone or SM-G900F.
     * </p>
     * 
     * @return The model name or number of the endpoint device, such as iPhone or SM-G900F.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The model name or number of the endpoint device, such as iPhone or SM-G900F.
     * </p>
     * 
     * @param model
     *        The model name or number of the endpoint device, such as iPhone or SM-G900F.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The model version of the endpoint device.
     * </p>
     * 
     * @param modelVersion
     *        The model version of the endpoint device.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The model version of the endpoint device.
     * </p>
     * 
     * @return The model version of the endpoint device.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The model version of the endpoint device.
     * </p>
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
     * <p>
     * The platform of the endpoint device, such as ios.
     * </p>
     * 
     * @param platform
     *        The platform of the endpoint device, such as ios.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the endpoint device, such as ios.
     * </p>
     * 
     * @return The platform of the endpoint device, such as ios.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the endpoint device, such as ios.
     * </p>
     * 
     * @param platform
     *        The platform of the endpoint device, such as ios.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDemographic withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform version of the endpoint device.
     * </p>
     * 
     * @param platformVersion
     *        The platform version of the endpoint device.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version of the endpoint device.
     * </p>
     * 
     * @return The platform version of the endpoint device.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version of the endpoint device.
     * </p>
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
     * <p>
     * The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
     * </p>
     * 
     * @param timezone
     *        The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
     * </p>
     * 
     * @return The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
     * </p>
     * 
     * @param timezone
     *        The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
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

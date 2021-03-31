/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessEffect"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMobileDeviceAccessEffectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon WorkMail organization to simulate the access effect for.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * Device type the simulated user will report.
     * </p>
     */
    private String deviceType;
    /**
     * <p>
     * Device model the simulated user will report.
     * </p>
     */
    private String deviceModel;
    /**
     * <p>
     * Device operating system the simulated user will report.
     * </p>
     */
    private String deviceOperatingSystem;
    /**
     * <p>
     * Device user agent the simulated user will report.
     * </p>
     */
    private String deviceUserAgent;

    /**
     * <p>
     * The Amazon WorkMail organization to simulate the access effect for.
     * </p>
     * 
     * @param organizationId
     *        The Amazon WorkMail organization to simulate the access effect for.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The Amazon WorkMail organization to simulate the access effect for.
     * </p>
     * 
     * @return The Amazon WorkMail organization to simulate the access effect for.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The Amazon WorkMail organization to simulate the access effect for.
     * </p>
     * 
     * @param organizationId
     *        The Amazon WorkMail organization to simulate the access effect for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessEffectRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * Device type the simulated user will report.
     * </p>
     * 
     * @param deviceType
     *        Device type the simulated user will report.
     */

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * Device type the simulated user will report.
     * </p>
     * 
     * @return Device type the simulated user will report.
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * <p>
     * Device type the simulated user will report.
     * </p>
     * 
     * @param deviceType
     *        Device type the simulated user will report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessEffectRequest withDeviceType(String deviceType) {
        setDeviceType(deviceType);
        return this;
    }

    /**
     * <p>
     * Device model the simulated user will report.
     * </p>
     * 
     * @param deviceModel
     *        Device model the simulated user will report.
     */

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    /**
     * <p>
     * Device model the simulated user will report.
     * </p>
     * 
     * @return Device model the simulated user will report.
     */

    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * <p>
     * Device model the simulated user will report.
     * </p>
     * 
     * @param deviceModel
     *        Device model the simulated user will report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessEffectRequest withDeviceModel(String deviceModel) {
        setDeviceModel(deviceModel);
        return this;
    }

    /**
     * <p>
     * Device operating system the simulated user will report.
     * </p>
     * 
     * @param deviceOperatingSystem
     *        Device operating system the simulated user will report.
     */

    public void setDeviceOperatingSystem(String deviceOperatingSystem) {
        this.deviceOperatingSystem = deviceOperatingSystem;
    }

    /**
     * <p>
     * Device operating system the simulated user will report.
     * </p>
     * 
     * @return Device operating system the simulated user will report.
     */

    public String getDeviceOperatingSystem() {
        return this.deviceOperatingSystem;
    }

    /**
     * <p>
     * Device operating system the simulated user will report.
     * </p>
     * 
     * @param deviceOperatingSystem
     *        Device operating system the simulated user will report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessEffectRequest withDeviceOperatingSystem(String deviceOperatingSystem) {
        setDeviceOperatingSystem(deviceOperatingSystem);
        return this;
    }

    /**
     * <p>
     * Device user agent the simulated user will report.
     * </p>
     * 
     * @param deviceUserAgent
     *        Device user agent the simulated user will report.
     */

    public void setDeviceUserAgent(String deviceUserAgent) {
        this.deviceUserAgent = deviceUserAgent;
    }

    /**
     * <p>
     * Device user agent the simulated user will report.
     * </p>
     * 
     * @return Device user agent the simulated user will report.
     */

    public String getDeviceUserAgent() {
        return this.deviceUserAgent;
    }

    /**
     * <p>
     * Device user agent the simulated user will report.
     * </p>
     * 
     * @param deviceUserAgent
     *        Device user agent the simulated user will report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileDeviceAccessEffectRequest withDeviceUserAgent(String deviceUserAgent) {
        setDeviceUserAgent(deviceUserAgent);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getDeviceType() != null)
            sb.append("DeviceType: ").append(getDeviceType()).append(",");
        if (getDeviceModel() != null)
            sb.append("DeviceModel: ").append(getDeviceModel()).append(",");
        if (getDeviceOperatingSystem() != null)
            sb.append("DeviceOperatingSystem: ").append(getDeviceOperatingSystem()).append(",");
        if (getDeviceUserAgent() != null)
            sb.append("DeviceUserAgent: ").append(getDeviceUserAgent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMobileDeviceAccessEffectRequest == false)
            return false;
        GetMobileDeviceAccessEffectRequest other = (GetMobileDeviceAccessEffectRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getDeviceModel() == null ^ this.getDeviceModel() == null)
            return false;
        if (other.getDeviceModel() != null && other.getDeviceModel().equals(this.getDeviceModel()) == false)
            return false;
        if (other.getDeviceOperatingSystem() == null ^ this.getDeviceOperatingSystem() == null)
            return false;
        if (other.getDeviceOperatingSystem() != null && other.getDeviceOperatingSystem().equals(this.getDeviceOperatingSystem()) == false)
            return false;
        if (other.getDeviceUserAgent() == null ^ this.getDeviceUserAgent() == null)
            return false;
        if (other.getDeviceUserAgent() != null && other.getDeviceUserAgent().equals(this.getDeviceUserAgent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getDeviceModel() == null) ? 0 : getDeviceModel().hashCode());
        hashCode = prime * hashCode + ((getDeviceOperatingSystem() == null) ? 0 : getDeviceOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getDeviceUserAgent() == null) ? 0 : getDeviceUserAgent().hashCode());
        return hashCode;
    }

    @Override
    public GetMobileDeviceAccessEffectRequest clone() {
        return (GetMobileDeviceAccessEffectRequest) super.clone();
    }

}

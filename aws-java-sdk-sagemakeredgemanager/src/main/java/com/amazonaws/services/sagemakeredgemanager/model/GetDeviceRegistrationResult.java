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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/GetDeviceRegistration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeviceRegistrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes if the device is currently registered with SageMaker Edge Manager.
     * </p>
     */
    private String deviceRegistration;
    /**
     * <p>
     * The amount of time, in seconds, that the registration status is stored on the device’s cache before it is
     * refreshed.
     * </p>
     */
    private String cacheTTL;

    /**
     * <p>
     * Describes if the device is currently registered with SageMaker Edge Manager.
     * </p>
     * 
     * @param deviceRegistration
     *        Describes if the device is currently registered with SageMaker Edge Manager.
     */

    public void setDeviceRegistration(String deviceRegistration) {
        this.deviceRegistration = deviceRegistration;
    }

    /**
     * <p>
     * Describes if the device is currently registered with SageMaker Edge Manager.
     * </p>
     * 
     * @return Describes if the device is currently registered with SageMaker Edge Manager.
     */

    public String getDeviceRegistration() {
        return this.deviceRegistration;
    }

    /**
     * <p>
     * Describes if the device is currently registered with SageMaker Edge Manager.
     * </p>
     * 
     * @param deviceRegistration
     *        Describes if the device is currently registered with SageMaker Edge Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceRegistrationResult withDeviceRegistration(String deviceRegistration) {
        setDeviceRegistration(deviceRegistration);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that the registration status is stored on the device’s cache before it is
     * refreshed.
     * </p>
     * 
     * @param cacheTTL
     *        The amount of time, in seconds, that the registration status is stored on the device’s cache before it is
     *        refreshed.
     */

    public void setCacheTTL(String cacheTTL) {
        this.cacheTTL = cacheTTL;
    }

    /**
     * <p>
     * The amount of time, in seconds, that the registration status is stored on the device’s cache before it is
     * refreshed.
     * </p>
     * 
     * @return The amount of time, in seconds, that the registration status is stored on the device’s cache before it is
     *         refreshed.
     */

    public String getCacheTTL() {
        return this.cacheTTL;
    }

    /**
     * <p>
     * The amount of time, in seconds, that the registration status is stored on the device’s cache before it is
     * refreshed.
     * </p>
     * 
     * @param cacheTTL
     *        The amount of time, in seconds, that the registration status is stored on the device’s cache before it is
     *        refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceRegistrationResult withCacheTTL(String cacheTTL) {
        setCacheTTL(cacheTTL);
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
        if (getDeviceRegistration() != null)
            sb.append("DeviceRegistration: ").append(getDeviceRegistration()).append(",");
        if (getCacheTTL() != null)
            sb.append("CacheTTL: ").append(getCacheTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeviceRegistrationResult == false)
            return false;
        GetDeviceRegistrationResult other = (GetDeviceRegistrationResult) obj;
        if (other.getDeviceRegistration() == null ^ this.getDeviceRegistration() == null)
            return false;
        if (other.getDeviceRegistration() != null && other.getDeviceRegistration().equals(this.getDeviceRegistration()) == false)
            return false;
        if (other.getCacheTTL() == null ^ this.getCacheTTL() == null)
            return false;
        if (other.getCacheTTL() != null && other.getCacheTTL().equals(this.getCacheTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceRegistration() == null) ? 0 : getDeviceRegistration().hashCode());
        hashCode = prime * hashCode + ((getCacheTTL() == null) ? 0 : getCacheTTL().hashCode());
        return hashCode;
    }

    @Override
    public GetDeviceRegistrationResult clone() {
        try {
            return (GetDeviceRegistrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

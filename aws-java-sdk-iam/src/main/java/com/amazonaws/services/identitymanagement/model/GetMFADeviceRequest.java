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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetMFADevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMFADeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * </p>
     * 
     * @param serialNumber
     *        Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * </p>
     * 
     * @return Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * </p>
     * 
     * @param serialNumber
     *        Serial number that uniquely identifies the MFA device. For this API, we only accept FIDO security key <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html">ARNs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMFADeviceRequest withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @param userName
     *        The friendly name identifying the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @return The friendly name identifying the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @param userName
     *        The friendly name identifying the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMFADeviceRequest withUserName(String userName) {
        setUserName(userName);
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
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMFADeviceRequest == false)
            return false;
        GetMFADeviceRequest other = (GetMFADeviceRequest) obj;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public GetMFADeviceRequest clone() {
        return (GetMFADeviceRequest) super.clone();
    }

}

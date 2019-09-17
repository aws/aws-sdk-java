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
package com.amazonaws.services.iot1clickdevices.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ClaimDevicesByClaimCode" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClaimDevicesByClaimCodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The claim code, starting with "C-", as provided by the device manufacturer.
     * </p>
     */
    private String claimCode;

    /**
     * <p>
     * The claim code, starting with "C-", as provided by the device manufacturer.
     * </p>
     * 
     * @param claimCode
     *        The claim code, starting with "C-", as provided by the device manufacturer.
     */

    public void setClaimCode(String claimCode) {
        this.claimCode = claimCode;
    }

    /**
     * <p>
     * The claim code, starting with "C-", as provided by the device manufacturer.
     * </p>
     * 
     * @return The claim code, starting with "C-", as provided by the device manufacturer.
     */

    public String getClaimCode() {
        return this.claimCode;
    }

    /**
     * <p>
     * The claim code, starting with "C-", as provided by the device manufacturer.
     * </p>
     * 
     * @param claimCode
     *        The claim code, starting with "C-", as provided by the device manufacturer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimDevicesByClaimCodeRequest withClaimCode(String claimCode) {
        setClaimCode(claimCode);
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
        if (getClaimCode() != null)
            sb.append("ClaimCode: ").append(getClaimCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClaimDevicesByClaimCodeRequest == false)
            return false;
        ClaimDevicesByClaimCodeRequest other = (ClaimDevicesByClaimCodeRequest) obj;
        if (other.getClaimCode() == null ^ this.getClaimCode() == null)
            return false;
        if (other.getClaimCode() != null && other.getClaimCode().equals(this.getClaimCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClaimCode() == null) ? 0 : getClaimCode().hashCode());
        return hashCode;
    }

    @Override
    public ClaimDevicesByClaimCodeRequest clone() {
        return (ClaimDevicesByClaimCodeRequest) super.clone();
    }

}

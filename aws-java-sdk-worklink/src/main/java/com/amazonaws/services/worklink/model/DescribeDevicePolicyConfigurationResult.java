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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevicePolicyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDevicePolicyConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to
     * issue device certificates.
     * </p>
     */
    private String deviceCaCertificate;

    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to
     * issue device certificates.
     * </p>
     * 
     * @param deviceCaCertificate
     *        The certificate chain, including intermediate certificates and the root certificate authority certificate
     *        used to issue device certificates.
     */

    public void setDeviceCaCertificate(String deviceCaCertificate) {
        this.deviceCaCertificate = deviceCaCertificate;
    }

    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to
     * issue device certificates.
     * </p>
     * 
     * @return The certificate chain, including intermediate certificates and the root certificate authority certificate
     *         used to issue device certificates.
     */

    public String getDeviceCaCertificate() {
        return this.deviceCaCertificate;
    }

    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to
     * issue device certificates.
     * </p>
     * 
     * @param deviceCaCertificate
     *        The certificate chain, including intermediate certificates and the root certificate authority certificate
     *        used to issue device certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDevicePolicyConfigurationResult withDeviceCaCertificate(String deviceCaCertificate) {
        setDeviceCaCertificate(deviceCaCertificate);
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
        if (getDeviceCaCertificate() != null)
            sb.append("DeviceCaCertificate: ").append(getDeviceCaCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDevicePolicyConfigurationResult == false)
            return false;
        DescribeDevicePolicyConfigurationResult other = (DescribeDevicePolicyConfigurationResult) obj;
        if (other.getDeviceCaCertificate() == null ^ this.getDeviceCaCertificate() == null)
            return false;
        if (other.getDeviceCaCertificate() != null && other.getDeviceCaCertificate().equals(this.getDeviceCaCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceCaCertificate() == null) ? 0 : getDeviceCaCertificate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDevicePolicyConfigurationResult clone() {
        try {
            return (DescribeDevicePolicyConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

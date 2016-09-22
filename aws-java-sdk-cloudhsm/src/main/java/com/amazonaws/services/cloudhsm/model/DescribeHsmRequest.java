/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>DescribeHsm</a> operation.
 * </p>
 */
public class DescribeHsmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the HSM. Either the <i>HsmArn</i> or the <i>SerialNumber</i> parameter must be specified.
     * </p>
     */
    private String hsmArn;
    /**
     * <p>
     * The serial number of the HSM. Either the <i>HsmArn</i> or the <i>HsmSerialNumber</i> parameter must be specified.
     * </p>
     */
    private String hsmSerialNumber;

    /**
     * <p>
     * The ARN of the HSM. Either the <i>HsmArn</i> or the <i>SerialNumber</i> parameter must be specified.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM. Either the <i>HsmArn</i> or the <i>SerialNumber</i> parameter must be specified.
     */

    public void setHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM. Either the <i>HsmArn</i> or the <i>SerialNumber</i> parameter must be specified.
     * </p>
     * 
     * @return The ARN of the HSM. Either the <i>HsmArn</i> or the <i>SerialNumber</i> parameter must be specified.
     */

    public String getHsmArn() {
        return this.hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM. Either the <i>HsmArn</i> or the <i>SerialNumber</i> parameter must be specified.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM. Either the <i>HsmArn</i> or the <i>SerialNumber</i> parameter must be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmRequest withHsmArn(String hsmArn) {
        setHsmArn(hsmArn);
        return this;
    }

    /**
     * <p>
     * The serial number of the HSM. Either the <i>HsmArn</i> or the <i>HsmSerialNumber</i> parameter must be specified.
     * </p>
     * 
     * @param hsmSerialNumber
     *        The serial number of the HSM. Either the <i>HsmArn</i> or the <i>HsmSerialNumber</i> parameter must be
     *        specified.
     */

    public void setHsmSerialNumber(String hsmSerialNumber) {
        this.hsmSerialNumber = hsmSerialNumber;
    }

    /**
     * <p>
     * The serial number of the HSM. Either the <i>HsmArn</i> or the <i>HsmSerialNumber</i> parameter must be specified.
     * </p>
     * 
     * @return The serial number of the HSM. Either the <i>HsmArn</i> or the <i>HsmSerialNumber</i> parameter must be
     *         specified.
     */

    public String getHsmSerialNumber() {
        return this.hsmSerialNumber;
    }

    /**
     * <p>
     * The serial number of the HSM. Either the <i>HsmArn</i> or the <i>HsmSerialNumber</i> parameter must be specified.
     * </p>
     * 
     * @param hsmSerialNumber
     *        The serial number of the HSM. Either the <i>HsmArn</i> or the <i>HsmSerialNumber</i> parameter must be
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmRequest withHsmSerialNumber(String hsmSerialNumber) {
        setHsmSerialNumber(hsmSerialNumber);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHsmArn() != null)
            sb.append("HsmArn: " + getHsmArn() + ",");
        if (getHsmSerialNumber() != null)
            sb.append("HsmSerialNumber: " + getHsmSerialNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHsmRequest == false)
            return false;
        DescribeHsmRequest other = (DescribeHsmRequest) obj;
        if (other.getHsmArn() == null ^ this.getHsmArn() == null)
            return false;
        if (other.getHsmArn() != null && other.getHsmArn().equals(this.getHsmArn()) == false)
            return false;
        if (other.getHsmSerialNumber() == null ^ this.getHsmSerialNumber() == null)
            return false;
        if (other.getHsmSerialNumber() != null && other.getHsmSerialNumber().equals(this.getHsmSerialNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHsmArn() == null) ? 0 : getHsmArn().hashCode());
        hashCode = prime * hashCode + ((getHsmSerialNumber() == null) ? 0 : getHsmSerialNumber().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHsmRequest clone() {
        return (DescribeHsmRequest) super.clone();
    }
}

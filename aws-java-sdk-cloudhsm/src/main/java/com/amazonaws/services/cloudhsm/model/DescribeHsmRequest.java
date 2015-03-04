/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudhsm.AWSCloudHSM#describeHsm(DescribeHsmRequest) DescribeHsm operation}.
 * <p>
 * Retrieves information about an HSM. You can identify the HSM by its
 * ARN or its serial number.
 * </p>
 *
 * @see com.amazonaws.services.cloudhsm.AWSCloudHSM#describeHsm(DescribeHsmRequest)
 */
public class DescribeHsmRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ARN of the HSM. Either the <i>HsmArn</i> or the
     * <i>SerialNumber</i> parameter must be specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     */
    private String hsmArn;

    /**
     * The serial number of the HSM. Either the <i>HsmArn</i> or the
     * <i>HsmSerialNumber</i> parameter must be specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,16}<br/>
     */
    private String hsmSerialNumber;

    /**
     * The ARN of the HSM. Either the <i>HsmArn</i> or the
     * <i>SerialNumber</i> parameter must be specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the HSM. Either the <i>HsmArn</i> or the
     *         <i>SerialNumber</i> parameter must be specified.
     */
    public String getHsmArn() {
        return hsmArn;
    }
    
    /**
     * The ARN of the HSM. Either the <i>HsmArn</i> or the
     * <i>SerialNumber</i> parameter must be specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @param hsmArn The ARN of the HSM. Either the <i>HsmArn</i> or the
     *         <i>SerialNumber</i> parameter must be specified.
     */
    public void setHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
    }
    
    /**
     * The ARN of the HSM. Either the <i>HsmArn</i> or the
     * <i>SerialNumber</i> parameter must be specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @param hsmArn The ARN of the HSM. Either the <i>HsmArn</i> or the
     *         <i>SerialNumber</i> parameter must be specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmRequest withHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
        return this;
    }

    /**
     * The serial number of the HSM. Either the <i>HsmArn</i> or the
     * <i>HsmSerialNumber</i> parameter must be specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,16}<br/>
     *
     * @return The serial number of the HSM. Either the <i>HsmArn</i> or the
     *         <i>HsmSerialNumber</i> parameter must be specified.
     */
    public String getHsmSerialNumber() {
        return hsmSerialNumber;
    }
    
    /**
     * The serial number of the HSM. Either the <i>HsmArn</i> or the
     * <i>HsmSerialNumber</i> parameter must be specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,16}<br/>
     *
     * @param hsmSerialNumber The serial number of the HSM. Either the <i>HsmArn</i> or the
     *         <i>HsmSerialNumber</i> parameter must be specified.
     */
    public void setHsmSerialNumber(String hsmSerialNumber) {
        this.hsmSerialNumber = hsmSerialNumber;
    }
    
    /**
     * The serial number of the HSM. Either the <i>HsmArn</i> or the
     * <i>HsmSerialNumber</i> parameter must be specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,16}<br/>
     *
     * @param hsmSerialNumber The serial number of the HSM. Either the <i>HsmArn</i> or the
     *         <i>HsmSerialNumber</i> parameter must be specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmRequest withHsmSerialNumber(String hsmSerialNumber) {
        this.hsmSerialNumber = hsmSerialNumber;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHsmArn() != null) sb.append("HsmArn: " + getHsmArn() + ",");
        if (getHsmSerialNumber() != null) sb.append("HsmSerialNumber: " + getHsmSerialNumber() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeHsmRequest == false) return false;
        DescribeHsmRequest other = (DescribeHsmRequest)obj;
        
        if (other.getHsmArn() == null ^ this.getHsmArn() == null) return false;
        if (other.getHsmArn() != null && other.getHsmArn().equals(this.getHsmArn()) == false) return false; 
        if (other.getHsmSerialNumber() == null ^ this.getHsmSerialNumber() == null) return false;
        if (other.getHsmSerialNumber() != null && other.getHsmSerialNumber().equals(this.getHsmSerialNumber()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeHsmRequest clone() {
        
            return (DescribeHsmRequest) super.clone();
    }

}
    
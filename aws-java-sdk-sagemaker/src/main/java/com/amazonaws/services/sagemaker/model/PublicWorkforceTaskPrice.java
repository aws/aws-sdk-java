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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the amount of money paid to an Amazon Mechanical Turk worker for each task performed.
 * </p>
 * <p>
 * Use one of the following prices for bounding box tasks. Prices are in US dollars.
 * </p>
 * <ul>
 * <li>
 * <p>
 * 0.036
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.048
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.060
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.072
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.120
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.240
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.360
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.480
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.600
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.720
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.840
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.960
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.080
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.200
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use one of the following prices for image classification, text classification, and custom tasks. Prices are in US
 * dollars.
 * </p>
 * <ul>
 * <li>
 * <p>
 * 0.012
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.024
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.036
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.048
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.060
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.072
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.120
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.240
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.360
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.480
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.600
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.720
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.840
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.960
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.080
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.200
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use one of the following prices for semantic segmentation tasks. Prices are in US dollars.
 * </p>
 * <ul>
 * <li>
 * <p>
 * 0.840
 * </p>
 * </li>
 * <li>
 * <p>
 * 0.960
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.080
 * </p>
 * </li>
 * <li>
 * <p>
 * 1.200
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PublicWorkforceTaskPrice" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicWorkforceTaskPrice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the amount of money paid to a worker in United States dollars.
     * </p>
     */
    private USD amountInUsd;

    /**
     * <p>
     * Defines the amount of money paid to a worker in United States dollars.
     * </p>
     * 
     * @param amountInUsd
     *        Defines the amount of money paid to a worker in United States dollars.
     */

    public void setAmountInUsd(USD amountInUsd) {
        this.amountInUsd = amountInUsd;
    }

    /**
     * <p>
     * Defines the amount of money paid to a worker in United States dollars.
     * </p>
     * 
     * @return Defines the amount of money paid to a worker in United States dollars.
     */

    public USD getAmountInUsd() {
        return this.amountInUsd;
    }

    /**
     * <p>
     * Defines the amount of money paid to a worker in United States dollars.
     * </p>
     * 
     * @param amountInUsd
     *        Defines the amount of money paid to a worker in United States dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicWorkforceTaskPrice withAmountInUsd(USD amountInUsd) {
        setAmountInUsd(amountInUsd);
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
        if (getAmountInUsd() != null)
            sb.append("AmountInUsd: ").append(getAmountInUsd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicWorkforceTaskPrice == false)
            return false;
        PublicWorkforceTaskPrice other = (PublicWorkforceTaskPrice) obj;
        if (other.getAmountInUsd() == null ^ this.getAmountInUsd() == null)
            return false;
        if (other.getAmountInUsd() != null && other.getAmountInUsd().equals(this.getAmountInUsd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmountInUsd() == null) ? 0 : getAmountInUsd().hashCode());
        return hashCode;
    }

    @Override
    public PublicWorkforceTaskPrice clone() {
        try {
            return (PublicWorkforceTaskPrice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PublicWorkforceTaskPriceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

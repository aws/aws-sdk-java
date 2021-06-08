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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOfferingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) of the offering. */
    private String offeringArn;

    /**
     * The Amazon Resource Name (ARN) of the offering.
     * 
     * @param offeringArn
     *        The Amazon Resource Name (ARN) of the offering.
     */

    public void setOfferingArn(String offeringArn) {
        this.offeringArn = offeringArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the offering.
     * 
     * @return The Amazon Resource Name (ARN) of the offering.
     */

    public String getOfferingArn() {
        return this.offeringArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the offering.
     * 
     * @param offeringArn
     *        The Amazon Resource Name (ARN) of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOfferingRequest withOfferingArn(String offeringArn) {
        setOfferingArn(offeringArn);
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
        if (getOfferingArn() != null)
            sb.append("OfferingArn: ").append(getOfferingArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOfferingRequest == false)
            return false;
        DescribeOfferingRequest other = (DescribeOfferingRequest) obj;
        if (other.getOfferingArn() == null ^ this.getOfferingArn() == null)
            return false;
        if (other.getOfferingArn() != null && other.getOfferingArn().equals(this.getOfferingArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingArn() == null) ? 0 : getOfferingArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOfferingRequest clone() {
        return (DescribeOfferingRequest) super.clone();
    }

}

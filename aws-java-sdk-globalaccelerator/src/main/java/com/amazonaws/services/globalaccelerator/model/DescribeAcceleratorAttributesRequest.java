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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAcceleratorAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAcceleratorAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe. Value is
     * required.
     * </p>
     */
    private String acceleratorArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe. Value is
     * required.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe. Value is
     *        required.
     */

    public void setAcceleratorArn(String acceleratorArn) {
        this.acceleratorArn = acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe. Value is
     * required.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe. Value is
     *         required.
     */

    public String getAcceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe. Value is
     * required.
     * </p>
     * 
     * @param acceleratorArn
     *        The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe. Value is
     *        required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorAttributesRequest withAcceleratorArn(String acceleratorArn) {
        setAcceleratorArn(acceleratorArn);
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
        if (getAcceleratorArn() != null)
            sb.append("AcceleratorArn: ").append(getAcceleratorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAcceleratorAttributesRequest == false)
            return false;
        DescribeAcceleratorAttributesRequest other = (DescribeAcceleratorAttributesRequest) obj;
        if (other.getAcceleratorArn() == null ^ this.getAcceleratorArn() == null)
            return false;
        if (other.getAcceleratorArn() != null && other.getAcceleratorArn().equals(this.getAcceleratorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorArn() == null) ? 0 : getAcceleratorArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAcceleratorAttributesRequest clone() {
        return (DescribeAcceleratorAttributesRequest) super.clone();
    }

}

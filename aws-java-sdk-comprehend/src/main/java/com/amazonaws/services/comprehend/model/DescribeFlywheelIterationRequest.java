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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeFlywheelIteration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlywheelIterationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String flywheelArn;
    /** <p/> */
    private String flywheelIterationId;

    /**
     * <p/>
     * 
     * @param flywheelArn
     */

    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getFlywheelArn() {
        return this.flywheelArn;
    }

    /**
     * <p/>
     * 
     * @param flywheelArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlywheelIterationRequest withFlywheelArn(String flywheelArn) {
        setFlywheelArn(flywheelArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param flywheelIterationId
     */

    public void setFlywheelIterationId(String flywheelIterationId) {
        this.flywheelIterationId = flywheelIterationId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getFlywheelIterationId() {
        return this.flywheelIterationId;
    }

    /**
     * <p/>
     * 
     * @param flywheelIterationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlywheelIterationRequest withFlywheelIterationId(String flywheelIterationId) {
        setFlywheelIterationId(flywheelIterationId);
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
        if (getFlywheelArn() != null)
            sb.append("FlywheelArn: ").append(getFlywheelArn()).append(",");
        if (getFlywheelIterationId() != null)
            sb.append("FlywheelIterationId: ").append(getFlywheelIterationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlywheelIterationRequest == false)
            return false;
        DescribeFlywheelIterationRequest other = (DescribeFlywheelIterationRequest) obj;
        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getFlywheelIterationId() == null ^ this.getFlywheelIterationId() == null)
            return false;
        if (other.getFlywheelIterationId() != null && other.getFlywheelIterationId().equals(this.getFlywheelIterationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode + ((getFlywheelIterationId() == null) ? 0 : getFlywheelIterationId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlywheelIterationRequest clone() {
        return (DescribeFlywheelIterationRequest) super.clone();
    }

}

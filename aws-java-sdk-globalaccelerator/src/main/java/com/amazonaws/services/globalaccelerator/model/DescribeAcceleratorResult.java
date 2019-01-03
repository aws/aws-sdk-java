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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAccelerator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAcceleratorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the accelerator.
     * </p>
     */
    private Accelerator accelerator;

    /**
     * <p>
     * The description of the accelerator.
     * </p>
     * 
     * @param accelerator
     *        The description of the accelerator.
     */

    public void setAccelerator(Accelerator accelerator) {
        this.accelerator = accelerator;
    }

    /**
     * <p>
     * The description of the accelerator.
     * </p>
     * 
     * @return The description of the accelerator.
     */

    public Accelerator getAccelerator() {
        return this.accelerator;
    }

    /**
     * <p>
     * The description of the accelerator.
     * </p>
     * 
     * @param accelerator
     *        The description of the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorResult withAccelerator(Accelerator accelerator) {
        setAccelerator(accelerator);
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
        if (getAccelerator() != null)
            sb.append("Accelerator: ").append(getAccelerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAcceleratorResult == false)
            return false;
        DescribeAcceleratorResult other = (DescribeAcceleratorResult) obj;
        if (other.getAccelerator() == null ^ this.getAccelerator() == null)
            return false;
        if (other.getAccelerator() != null && other.getAccelerator().equals(this.getAccelerator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccelerator() == null) ? 0 : getAccelerator().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAcceleratorResult clone() {
        try {
            return (DescribeAcceleratorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

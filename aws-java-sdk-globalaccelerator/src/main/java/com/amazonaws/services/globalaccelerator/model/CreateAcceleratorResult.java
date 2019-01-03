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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateAccelerator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAcceleratorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The accelerator that is created by specifying a listener and the supported IP address types.
     * </p>
     */
    private Accelerator accelerator;

    /**
     * <p>
     * The accelerator that is created by specifying a listener and the supported IP address types.
     * </p>
     * 
     * @param accelerator
     *        The accelerator that is created by specifying a listener and the supported IP address types.
     */

    public void setAccelerator(Accelerator accelerator) {
        this.accelerator = accelerator;
    }

    /**
     * <p>
     * The accelerator that is created by specifying a listener and the supported IP address types.
     * </p>
     * 
     * @return The accelerator that is created by specifying a listener and the supported IP address types.
     */

    public Accelerator getAccelerator() {
        return this.accelerator;
    }

    /**
     * <p>
     * The accelerator that is created by specifying a listener and the supported IP address types.
     * </p>
     * 
     * @param accelerator
     *        The accelerator that is created by specifying a listener and the supported IP address types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAcceleratorResult withAccelerator(Accelerator accelerator) {
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

        if (obj instanceof CreateAcceleratorResult == false)
            return false;
        CreateAcceleratorResult other = (CreateAcceleratorResult) obj;
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
    public CreateAcceleratorResult clone() {
        try {
            return (CreateAcceleratorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DeleteFlywheel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFlywheelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to delete.
     * </p>
     */
    private String flywheelArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to delete.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel to delete.
     */

    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to delete.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the flywheel to delete.
     */

    public String getFlywheelArn() {
        return this.flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to delete.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlywheelRequest withFlywheelArn(String flywheelArn) {
        setFlywheelArn(flywheelArn);
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
            sb.append("FlywheelArn: ").append(getFlywheelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFlywheelRequest == false)
            return false;
        DeleteFlywheelRequest other = (DeleteFlywheelRequest) obj;
        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFlywheelRequest clone() {
        return (DeleteFlywheelRequest) super.clone();
    }

}

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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateFlywheel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlywheelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel.
     * </p>
     */
    private String flywheelArn;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     */
    private String activeModelArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel.
     */

    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the flywheel.
     */

    public String getFlywheelArn() {
        return this.flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelResult withFlywheelArn(String flywheelArn) {
        setFlywheelArn(flywheelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     * 
     * @param activeModelArn
     *        The Amazon Resource Number (ARN) of the active model version.
     */

    public void setActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the active model version.
     */

    public String getActiveModelArn() {
        return this.activeModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     * 
     * @param activeModelArn
     *        The Amazon Resource Number (ARN) of the active model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelResult withActiveModelArn(String activeModelArn) {
        setActiveModelArn(activeModelArn);
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
        if (getActiveModelArn() != null)
            sb.append("ActiveModelArn: ").append(getActiveModelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlywheelResult == false)
            return false;
        CreateFlywheelResult other = (CreateFlywheelResult) obj;
        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getActiveModelArn() == null ^ this.getActiveModelArn() == null)
            return false;
        if (other.getActiveModelArn() != null && other.getActiveModelArn().equals(this.getActiveModelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode + ((getActiveModelArn() == null) ? 0 : getActiveModelArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlywheelResult clone() {
        try {
            return (CreateFlywheelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

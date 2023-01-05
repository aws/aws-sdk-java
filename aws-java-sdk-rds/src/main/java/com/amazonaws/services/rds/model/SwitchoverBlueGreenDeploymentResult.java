/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SwitchoverBlueGreenDeployment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SwitchoverBlueGreenDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private BlueGreenDeployment blueGreenDeployment;

    /**
     * @param blueGreenDeployment
     */

    public void setBlueGreenDeployment(BlueGreenDeployment blueGreenDeployment) {
        this.blueGreenDeployment = blueGreenDeployment;
    }

    /**
     * @return
     */

    public BlueGreenDeployment getBlueGreenDeployment() {
        return this.blueGreenDeployment;
    }

    /**
     * @param blueGreenDeployment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SwitchoverBlueGreenDeploymentResult withBlueGreenDeployment(BlueGreenDeployment blueGreenDeployment) {
        setBlueGreenDeployment(blueGreenDeployment);
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
        if (getBlueGreenDeployment() != null)
            sb.append("BlueGreenDeployment: ").append(getBlueGreenDeployment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SwitchoverBlueGreenDeploymentResult == false)
            return false;
        SwitchoverBlueGreenDeploymentResult other = (SwitchoverBlueGreenDeploymentResult) obj;
        if (other.getBlueGreenDeployment() == null ^ this.getBlueGreenDeployment() == null)
            return false;
        if (other.getBlueGreenDeployment() != null && other.getBlueGreenDeployment().equals(this.getBlueGreenDeployment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueGreenDeployment() == null) ? 0 : getBlueGreenDeployment().hashCode());
        return hashCode;
    }

    @Override
    public SwitchoverBlueGreenDeploymentResult clone() {
        try {
            return (SwitchoverBlueGreenDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

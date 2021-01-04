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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCanaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A strucure that contains the full information about the canary.
     * </p>
     */
    private Canary canary;

    /**
     * <p>
     * A strucure that contains the full information about the canary.
     * </p>
     * 
     * @param canary
     *        A strucure that contains the full information about the canary.
     */

    public void setCanary(Canary canary) {
        this.canary = canary;
    }

    /**
     * <p>
     * A strucure that contains the full information about the canary.
     * </p>
     * 
     * @return A strucure that contains the full information about the canary.
     */

    public Canary getCanary() {
        return this.canary;
    }

    /**
     * <p>
     * A strucure that contains the full information about the canary.
     * </p>
     * 
     * @param canary
     *        A strucure that contains the full information about the canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCanaryResult withCanary(Canary canary) {
        setCanary(canary);
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
        if (getCanary() != null)
            sb.append("Canary: ").append(getCanary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCanaryResult == false)
            return false;
        GetCanaryResult other = (GetCanaryResult) obj;
        if (other.getCanary() == null ^ this.getCanary() == null)
            return false;
        if (other.getCanary() != null && other.getCanary().equals(this.getCanary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanary() == null) ? 0 : getCanary().hashCode());
        return hashCode;
    }

    @Override
    public GetCanaryResult clone() {
        try {
            return (GetCanaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

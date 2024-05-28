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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>Fleet</code> object.
     * </p>
     */
    private Fleet fleet;

    /**
     * <p>
     * A <code>Fleet</code> object.
     * </p>
     * 
     * @param fleet
     *        A <code>Fleet</code> object.
     */

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    /**
     * <p>
     * A <code>Fleet</code> object.
     * </p>
     * 
     * @return A <code>Fleet</code> object.
     */

    public Fleet getFleet() {
        return this.fleet;
    }

    /**
     * <p>
     * A <code>Fleet</code> object.
     * </p>
     * 
     * @param fleet
     *        A <code>Fleet</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetResult withFleet(Fleet fleet) {
        setFleet(fleet);
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
        if (getFleet() != null)
            sb.append("Fleet: ").append(getFleet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetResult == false)
            return false;
        UpdateFleetResult other = (UpdateFleetResult) obj;
        if (other.getFleet() == null ^ this.getFleet() == null)
            return false;
        if (other.getFleet() != null && other.getFleet().equals(this.getFleet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleet() == null) ? 0 : getFleet().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetResult clone() {
        try {
            return (UpdateFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

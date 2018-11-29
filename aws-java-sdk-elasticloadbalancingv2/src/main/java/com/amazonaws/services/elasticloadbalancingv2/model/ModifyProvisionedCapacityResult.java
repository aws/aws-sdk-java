/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyProvisionedCapacity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyProvisionedCapacityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ProvisionedCapacity provisionedCapacity;

    /**
     * @param provisionedCapacity
     */

    public void setProvisionedCapacity(ProvisionedCapacity provisionedCapacity) {
        this.provisionedCapacity = provisionedCapacity;
    }

    /**
     * @return
     */

    public ProvisionedCapacity getProvisionedCapacity() {
        return this.provisionedCapacity;
    }

    /**
     * @param provisionedCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyProvisionedCapacityResult withProvisionedCapacity(ProvisionedCapacity provisionedCapacity) {
        setProvisionedCapacity(provisionedCapacity);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProvisionedCapacity() != null)
            sb.append("ProvisionedCapacity: ").append(getProvisionedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyProvisionedCapacityResult == false)
            return false;
        ModifyProvisionedCapacityResult other = (ModifyProvisionedCapacityResult) obj;
        if (other.getProvisionedCapacity() == null ^ this.getProvisionedCapacity() == null)
            return false;
        if (other.getProvisionedCapacity() != null && other.getProvisionedCapacity().equals(this.getProvisionedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedCapacity() == null) ? 0 : getProvisionedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public ModifyProvisionedCapacityResult clone() {
        try {
            return (ModifyProvisionedCapacityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

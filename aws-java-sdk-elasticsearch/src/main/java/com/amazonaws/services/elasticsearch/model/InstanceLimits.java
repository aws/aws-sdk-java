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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * InstanceLimits represents the list of instance related attributes that are available for given InstanceType.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceLimits implements Serializable, Cloneable, StructuredPojo {

    private InstanceCountLimits instanceCountLimits;

    /**
     * @param instanceCountLimits
     */

    public void setInstanceCountLimits(InstanceCountLimits instanceCountLimits) {
        this.instanceCountLimits = instanceCountLimits;
    }

    /**
     * @return
     */

    public InstanceCountLimits getInstanceCountLimits() {
        return this.instanceCountLimits;
    }

    /**
     * @param instanceCountLimits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceLimits withInstanceCountLimits(InstanceCountLimits instanceCountLimits) {
        setInstanceCountLimits(instanceCountLimits);
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
        if (getInstanceCountLimits() != null)
            sb.append("InstanceCountLimits: ").append(getInstanceCountLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceLimits == false)
            return false;
        InstanceLimits other = (InstanceLimits) obj;
        if (other.getInstanceCountLimits() == null ^ this.getInstanceCountLimits() == null)
            return false;
        if (other.getInstanceCountLimits() != null && other.getInstanceCountLimits().equals(this.getInstanceCountLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCountLimits() == null) ? 0 : getInstanceCountLimits().hashCode());
        return hashCode;
    }

    @Override
    public InstanceLimits clone() {
        try {
            return (InstanceLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.InstanceLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

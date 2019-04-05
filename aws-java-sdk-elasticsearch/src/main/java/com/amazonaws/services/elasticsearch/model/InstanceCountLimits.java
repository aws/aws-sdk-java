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
 * InstanceCountLimits represents the limits on number of instances that be created in Amazon Elasticsearch for given
 * InstanceType.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceCountLimits implements Serializable, Cloneable, StructuredPojo {

    private Integer minimumInstanceCount;

    private Integer maximumInstanceCount;

    /**
     * @param minimumInstanceCount
     */

    public void setMinimumInstanceCount(Integer minimumInstanceCount) {
        this.minimumInstanceCount = minimumInstanceCount;
    }

    /**
     * @return
     */

    public Integer getMinimumInstanceCount() {
        return this.minimumInstanceCount;
    }

    /**
     * @param minimumInstanceCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceCountLimits withMinimumInstanceCount(Integer minimumInstanceCount) {
        setMinimumInstanceCount(minimumInstanceCount);
        return this;
    }

    /**
     * @param maximumInstanceCount
     */

    public void setMaximumInstanceCount(Integer maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
    }

    /**
     * @return
     */

    public Integer getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    /**
     * @param maximumInstanceCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceCountLimits withMaximumInstanceCount(Integer maximumInstanceCount) {
        setMaximumInstanceCount(maximumInstanceCount);
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
        if (getMinimumInstanceCount() != null)
            sb.append("MinimumInstanceCount: ").append(getMinimumInstanceCount()).append(",");
        if (getMaximumInstanceCount() != null)
            sb.append("MaximumInstanceCount: ").append(getMaximumInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceCountLimits == false)
            return false;
        InstanceCountLimits other = (InstanceCountLimits) obj;
        if (other.getMinimumInstanceCount() == null ^ this.getMinimumInstanceCount() == null)
            return false;
        if (other.getMinimumInstanceCount() != null && other.getMinimumInstanceCount().equals(this.getMinimumInstanceCount()) == false)
            return false;
        if (other.getMaximumInstanceCount() == null ^ this.getMaximumInstanceCount() == null)
            return false;
        if (other.getMaximumInstanceCount() != null && other.getMaximumInstanceCount().equals(this.getMaximumInstanceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinimumInstanceCount() == null) ? 0 : getMinimumInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getMaximumInstanceCount() == null) ? 0 : getMaximumInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public InstanceCountLimits clone() {
        try {
            return (InstanceCountLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.InstanceCountLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Limits implements Serializable, Cloneable {

    private Integer maximumReplicationCount;

    private Integer maximumPartitionCount;

    /**
     * @param maximumReplicationCount
     */

    public void setMaximumReplicationCount(Integer maximumReplicationCount) {
        this.maximumReplicationCount = maximumReplicationCount;
    }

    /**
     * @return
     */

    public Integer getMaximumReplicationCount() {
        return this.maximumReplicationCount;
    }

    /**
     * @param maximumReplicationCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limits withMaximumReplicationCount(Integer maximumReplicationCount) {
        setMaximumReplicationCount(maximumReplicationCount);
        return this;
    }

    /**
     * @param maximumPartitionCount
     */

    public void setMaximumPartitionCount(Integer maximumPartitionCount) {
        this.maximumPartitionCount = maximumPartitionCount;
    }

    /**
     * @return
     */

    public Integer getMaximumPartitionCount() {
        return this.maximumPartitionCount;
    }

    /**
     * @param maximumPartitionCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limits withMaximumPartitionCount(Integer maximumPartitionCount) {
        setMaximumPartitionCount(maximumPartitionCount);
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
        if (getMaximumReplicationCount() != null)
            sb.append("MaximumReplicationCount: ").append(getMaximumReplicationCount()).append(",");
        if (getMaximumPartitionCount() != null)
            sb.append("MaximumPartitionCount: ").append(getMaximumPartitionCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Limits == false)
            return false;
        Limits other = (Limits) obj;
        if (other.getMaximumReplicationCount() == null ^ this.getMaximumReplicationCount() == null)
            return false;
        if (other.getMaximumReplicationCount() != null && other.getMaximumReplicationCount().equals(this.getMaximumReplicationCount()) == false)
            return false;
        if (other.getMaximumPartitionCount() == null ^ this.getMaximumPartitionCount() == null)
            return false;
        if (other.getMaximumPartitionCount() != null && other.getMaximumPartitionCount().equals(this.getMaximumPartitionCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumReplicationCount() == null) ? 0 : getMaximumReplicationCount().hashCode());
        hashCode = prime * hashCode + ((getMaximumPartitionCount() == null) ? 0 : getMaximumPartitionCount().hashCode());
        return hashCode;
    }

    @Override
    public Limits clone() {
        try {
            return (Limits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

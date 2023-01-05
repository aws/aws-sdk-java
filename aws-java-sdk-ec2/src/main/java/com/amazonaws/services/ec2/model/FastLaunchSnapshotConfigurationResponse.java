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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Configuration settings for creating and managing pre-provisioned snapshots for a fast-launch enabled Windows AMI.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FastLaunchSnapshotConfigurationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FastLaunchSnapshotConfigurationResponse implements Serializable, Cloneable {

    /**
     * <p>
     * The number of pre-provisioned snapshots requested to keep on hand for a fast-launch enabled Windows AMI.
     * </p>
     */
    private Integer targetResourceCount;

    /**
     * <p>
     * The number of pre-provisioned snapshots requested to keep on hand for a fast-launch enabled Windows AMI.
     * </p>
     * 
     * @param targetResourceCount
     *        The number of pre-provisioned snapshots requested to keep on hand for a fast-launch enabled Windows AMI.
     */

    public void setTargetResourceCount(Integer targetResourceCount) {
        this.targetResourceCount = targetResourceCount;
    }

    /**
     * <p>
     * The number of pre-provisioned snapshots requested to keep on hand for a fast-launch enabled Windows AMI.
     * </p>
     * 
     * @return The number of pre-provisioned snapshots requested to keep on hand for a fast-launch enabled Windows AMI.
     */

    public Integer getTargetResourceCount() {
        return this.targetResourceCount;
    }

    /**
     * <p>
     * The number of pre-provisioned snapshots requested to keep on hand for a fast-launch enabled Windows AMI.
     * </p>
     * 
     * @param targetResourceCount
     *        The number of pre-provisioned snapshots requested to keep on hand for a fast-launch enabled Windows AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchSnapshotConfigurationResponse withTargetResourceCount(Integer targetResourceCount) {
        setTargetResourceCount(targetResourceCount);
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
        if (getTargetResourceCount() != null)
            sb.append("TargetResourceCount: ").append(getTargetResourceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FastLaunchSnapshotConfigurationResponse == false)
            return false;
        FastLaunchSnapshotConfigurationResponse other = (FastLaunchSnapshotConfigurationResponse) obj;
        if (other.getTargetResourceCount() == null ^ this.getTargetResourceCount() == null)
            return false;
        if (other.getTargetResourceCount() != null && other.getTargetResourceCount().equals(this.getTargetResourceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetResourceCount() == null) ? 0 : getTargetResourceCount().hashCode());
        return hashCode;
    }

    @Override
    public FastLaunchSnapshotConfigurationResponse clone() {
        try {
            return (FastLaunchSnapshotConfigurationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSnapshotScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the snapshot schedule to delete.
     * </p>
     */
    private String scheduleIdentifier;

    /**
     * <p>
     * A unique identifier of the snapshot schedule to delete.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique identifier of the snapshot schedule to delete.
     */

    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the snapshot schedule to delete.
     * </p>
     * 
     * @return A unique identifier of the snapshot schedule to delete.
     */

    public String getScheduleIdentifier() {
        return this.scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the snapshot schedule to delete.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique identifier of the snapshot schedule to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSnapshotScheduleRequest withScheduleIdentifier(String scheduleIdentifier) {
        setScheduleIdentifier(scheduleIdentifier);
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
        if (getScheduleIdentifier() != null)
            sb.append("ScheduleIdentifier: ").append(getScheduleIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSnapshotScheduleRequest == false)
            return false;
        DeleteSnapshotScheduleRequest other = (DeleteSnapshotScheduleRequest) obj;
        if (other.getScheduleIdentifier() == null ^ this.getScheduleIdentifier() == null)
            return false;
        if (other.getScheduleIdentifier() != null && other.getScheduleIdentifier().equals(this.getScheduleIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleIdentifier() == null) ? 0 : getScheduleIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSnapshotScheduleRequest clone() {
        return (DeleteSnapshotScheduleRequest) super.clone();
    }

}

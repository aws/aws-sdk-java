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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySnapshotScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique alphanumeric identifier of the schedule to modify.
     * </p>
     */
    private String scheduleIdentifier;
    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example,
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> scheduleDefinitions;

    /**
     * <p>
     * A unique alphanumeric identifier of the schedule to modify.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique alphanumeric identifier of the schedule to modify.
     */

    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique alphanumeric identifier of the schedule to modify.
     * </p>
     * 
     * @return A unique alphanumeric identifier of the schedule to modify.
     */

    public String getScheduleIdentifier() {
        return this.scheduleIdentifier;
    }

    /**
     * <p>
     * A unique alphanumeric identifier of the schedule to modify.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique alphanumeric identifier of the schedule to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleRequest withScheduleIdentifier(String scheduleIdentifier) {
        setScheduleIdentifier(scheduleIdentifier);
        return this;
    }

    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example,
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * 
     * @return An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for
     *         example, "cron(30 12 *)" or "rate(12 hours)".
     */

    public java.util.List<String> getScheduleDefinitions() {
        if (scheduleDefinitions == null) {
            scheduleDefinitions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scheduleDefinitions;
    }

    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example,
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * 
     * @param scheduleDefinitions
     *        An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for
     *        example, "cron(30 12 *)" or "rate(12 hours)".
     */

    public void setScheduleDefinitions(java.util.Collection<String> scheduleDefinitions) {
        if (scheduleDefinitions == null) {
            this.scheduleDefinitions = null;
            return;
        }

        this.scheduleDefinitions = new com.amazonaws.internal.SdkInternalList<String>(scheduleDefinitions);
    }

    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example,
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduleDefinitions(java.util.Collection)} or {@link #withScheduleDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scheduleDefinitions
     *        An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for
     *        example, "cron(30 12 *)" or "rate(12 hours)".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleRequest withScheduleDefinitions(String... scheduleDefinitions) {
        if (this.scheduleDefinitions == null) {
            setScheduleDefinitions(new com.amazonaws.internal.SdkInternalList<String>(scheduleDefinitions.length));
        }
        for (String ele : scheduleDefinitions) {
            this.scheduleDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example,
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * 
     * @param scheduleDefinitions
     *        An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for
     *        example, "cron(30 12 *)" or "rate(12 hours)".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleRequest withScheduleDefinitions(java.util.Collection<String> scheduleDefinitions) {
        setScheduleDefinitions(scheduleDefinitions);
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
            sb.append("ScheduleIdentifier: ").append(getScheduleIdentifier()).append(",");
        if (getScheduleDefinitions() != null)
            sb.append("ScheduleDefinitions: ").append(getScheduleDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySnapshotScheduleRequest == false)
            return false;
        ModifySnapshotScheduleRequest other = (ModifySnapshotScheduleRequest) obj;
        if (other.getScheduleIdentifier() == null ^ this.getScheduleIdentifier() == null)
            return false;
        if (other.getScheduleIdentifier() != null && other.getScheduleIdentifier().equals(this.getScheduleIdentifier()) == false)
            return false;
        if (other.getScheduleDefinitions() == null ^ this.getScheduleDefinitions() == null)
            return false;
        if (other.getScheduleDefinitions() != null && other.getScheduleDefinitions().equals(this.getScheduleDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleIdentifier() == null) ? 0 : getScheduleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getScheduleDefinitions() == null) ? 0 : getScheduleDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public ModifySnapshotScheduleRequest clone() {
        return (ModifySnapshotScheduleRequest) super.clone();
    }

}

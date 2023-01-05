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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateScheduleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScheduleGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule group.
     * </p>
     */
    private String scheduleGroupArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule group.
     * </p>
     * 
     * @param scheduleGroupArn
     *        The Amazon Resource Name (ARN) of the schedule group.
     */

    public void setScheduleGroupArn(String scheduleGroupArn) {
        this.scheduleGroupArn = scheduleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schedule group.
     */

    public String getScheduleGroupArn() {
        return this.scheduleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule group.
     * </p>
     * 
     * @param scheduleGroupArn
     *        The Amazon Resource Name (ARN) of the schedule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleGroupResult withScheduleGroupArn(String scheduleGroupArn) {
        setScheduleGroupArn(scheduleGroupArn);
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
        if (getScheduleGroupArn() != null)
            sb.append("ScheduleGroupArn: ").append(getScheduleGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScheduleGroupResult == false)
            return false;
        CreateScheduleGroupResult other = (CreateScheduleGroupResult) obj;
        if (other.getScheduleGroupArn() == null ^ this.getScheduleGroupArn() == null)
            return false;
        if (other.getScheduleGroupArn() != null && other.getScheduleGroupArn().equals(this.getScheduleGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleGroupArn() == null) ? 0 : getScheduleGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateScheduleGroupResult clone() {
        try {
            return (CreateScheduleGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

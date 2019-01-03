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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateBusinessReportSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBusinessReportScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     */
    private String scheduleArn;

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * 
     * @param scheduleArn
     *        The ARN of the business report schedule.
     */

    public void setScheduleArn(String scheduleArn) {
        this.scheduleArn = scheduleArn;
    }

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * 
     * @return The ARN of the business report schedule.
     */

    public String getScheduleArn() {
        return this.scheduleArn;
    }

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * 
     * @param scheduleArn
     *        The ARN of the business report schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBusinessReportScheduleResult withScheduleArn(String scheduleArn) {
        setScheduleArn(scheduleArn);
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
        if (getScheduleArn() != null)
            sb.append("ScheduleArn: ").append(getScheduleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBusinessReportScheduleResult == false)
            return false;
        CreateBusinessReportScheduleResult other = (CreateBusinessReportScheduleResult) obj;
        if (other.getScheduleArn() == null ^ this.getScheduleArn() == null)
            return false;
        if (other.getScheduleArn() != null && other.getScheduleArn().equals(this.getScheduleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleArn() == null) ? 0 : getScheduleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateBusinessReportScheduleResult clone() {
        try {
            return (CreateBusinessReportScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

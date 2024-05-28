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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container that specifies the time value for S3 Replication Time Control (S3 RTC). This value is also used for the
 * replication metrics <code>EventThreshold</code> element.
 * </p>
 * <note>
 * <p>
 * This is not supported by Amazon S3 on Outposts buckets.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ReplicationTimeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTimeValue implements Serializable, Cloneable {

    /**
     * <p>
     * Contains an integer that specifies the time period in minutes.
     * </p>
     * <p>
     * Valid value: 15
     * </p>
     */
    private Integer minutes;

    /**
     * <p>
     * Contains an integer that specifies the time period in minutes.
     * </p>
     * <p>
     * Valid value: 15
     * </p>
     * 
     * @param minutes
     *        Contains an integer that specifies the time period in minutes. </p>
     *        <p>
     *        Valid value: 15
     */

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * <p>
     * Contains an integer that specifies the time period in minutes.
     * </p>
     * <p>
     * Valid value: 15
     * </p>
     * 
     * @return Contains an integer that specifies the time period in minutes. </p>
     *         <p>
     *         Valid value: 15
     */

    public Integer getMinutes() {
        return this.minutes;
    }

    /**
     * <p>
     * Contains an integer that specifies the time period in minutes.
     * </p>
     * <p>
     * Valid value: 15
     * </p>
     * 
     * @param minutes
     *        Contains an integer that specifies the time period in minutes. </p>
     *        <p>
     *        Valid value: 15
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTimeValue withMinutes(Integer minutes) {
        setMinutes(minutes);
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
        if (getMinutes() != null)
            sb.append("Minutes: ").append(getMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTimeValue == false)
            return false;
        ReplicationTimeValue other = (ReplicationTimeValue) obj;
        if (other.getMinutes() == null ^ this.getMinutes() == null)
            return false;
        if (other.getMinutes() != null && other.getMinutes().equals(this.getMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinutes() == null) ? 0 : getMinutes().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationTimeValue clone() {
        try {
            return (ReplicationTimeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

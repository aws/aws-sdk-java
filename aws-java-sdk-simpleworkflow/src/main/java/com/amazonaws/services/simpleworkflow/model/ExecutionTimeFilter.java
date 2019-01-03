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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to filter the workflow executions in visibility APIs by various time-based rules. Each parameter, if specified,
 * defines a rule that must be satisfied by each returned query result. The parameter values are in the <a
 * href="https://en.wikipedia.org/wiki/Unix_time">Unix Time format</a>. For example:
 * <code>"oldestDate": 1325376070.</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ExecutionTimeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionTimeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the oldest start or close date and time to return.
     * </p>
     */
    private java.util.Date oldestDate;
    /**
     * <p>
     * Specifies the latest start or close date and time to return.
     * </p>
     */
    private java.util.Date latestDate;

    /**
     * <p>
     * Specifies the oldest start or close date and time to return.
     * </p>
     * 
     * @param oldestDate
     *        Specifies the oldest start or close date and time to return.
     */

    public void setOldestDate(java.util.Date oldestDate) {
        this.oldestDate = oldestDate;
    }

    /**
     * <p>
     * Specifies the oldest start or close date and time to return.
     * </p>
     * 
     * @return Specifies the oldest start or close date and time to return.
     */

    public java.util.Date getOldestDate() {
        return this.oldestDate;
    }

    /**
     * <p>
     * Specifies the oldest start or close date and time to return.
     * </p>
     * 
     * @param oldestDate
     *        Specifies the oldest start or close date and time to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionTimeFilter withOldestDate(java.util.Date oldestDate) {
        setOldestDate(oldestDate);
        return this;
    }

    /**
     * <p>
     * Specifies the latest start or close date and time to return.
     * </p>
     * 
     * @param latestDate
     *        Specifies the latest start or close date and time to return.
     */

    public void setLatestDate(java.util.Date latestDate) {
        this.latestDate = latestDate;
    }

    /**
     * <p>
     * Specifies the latest start or close date and time to return.
     * </p>
     * 
     * @return Specifies the latest start or close date and time to return.
     */

    public java.util.Date getLatestDate() {
        return this.latestDate;
    }

    /**
     * <p>
     * Specifies the latest start or close date and time to return.
     * </p>
     * 
     * @param latestDate
     *        Specifies the latest start or close date and time to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionTimeFilter withLatestDate(java.util.Date latestDate) {
        setLatestDate(latestDate);
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
        if (getOldestDate() != null)
            sb.append("OldestDate: ").append(getOldestDate()).append(",");
        if (getLatestDate() != null)
            sb.append("LatestDate: ").append(getLatestDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionTimeFilter == false)
            return false;
        ExecutionTimeFilter other = (ExecutionTimeFilter) obj;
        if (other.getOldestDate() == null ^ this.getOldestDate() == null)
            return false;
        if (other.getOldestDate() != null && other.getOldestDate().equals(this.getOldestDate()) == false)
            return false;
        if (other.getLatestDate() == null ^ this.getLatestDate() == null)
            return false;
        if (other.getLatestDate() != null && other.getLatestDate().equals(this.getLatestDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOldestDate() == null) ? 0 : getOldestDate().hashCode());
        hashCode = prime * hashCode + ((getLatestDate() == null) ? 0 : getLatestDate().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionTimeFilter clone() {
        try {
            return (ExecutionTimeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.ExecutionTimeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to limit data to that which has arrived since the last execution of the action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeltaTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeltaTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of seconds of estimated "in flight" lag time of message data. When you create data set contents using
     * message data from a specified time frame, some message data may still be "in flight" when processing begins, and
     * so will not arrive in time to be processed. Use this field to make allowances for the "in flight" time of your
     * message data, so that data not processed from a previous time frame will be included with the next time frame.
     * Without this, missed message data would be excluded from processing during the next time frame as well, because
     * its timestamp places it within the previous time frame.
     * </p>
     */
    private Integer offsetSeconds;
    /**
     * <p>
     * An expression by which the time of the message data may be determined. This may be the name of a timestamp field,
     * or a SQL expression which is used to derive the time the message data was generated.
     * </p>
     */
    private String timeExpression;

    /**
     * <p>
     * The number of seconds of estimated "in flight" lag time of message data. When you create data set contents using
     * message data from a specified time frame, some message data may still be "in flight" when processing begins, and
     * so will not arrive in time to be processed. Use this field to make allowances for the "in flight" time of your
     * message data, so that data not processed from a previous time frame will be included with the next time frame.
     * Without this, missed message data would be excluded from processing during the next time frame as well, because
     * its timestamp places it within the previous time frame.
     * </p>
     * 
     * @param offsetSeconds
     *        The number of seconds of estimated "in flight" lag time of message data. When you create data set contents
     *        using message data from a specified time frame, some message data may still be "in flight" when processing
     *        begins, and so will not arrive in time to be processed. Use this field to make allowances for the
     *        "in flight" time of your message data, so that data not processed from a previous time frame will be
     *        included with the next time frame. Without this, missed message data would be excluded from processing
     *        during the next time frame as well, because its timestamp places it within the previous time frame.
     */

    public void setOffsetSeconds(Integer offsetSeconds) {
        this.offsetSeconds = offsetSeconds;
    }

    /**
     * <p>
     * The number of seconds of estimated "in flight" lag time of message data. When you create data set contents using
     * message data from a specified time frame, some message data may still be "in flight" when processing begins, and
     * so will not arrive in time to be processed. Use this field to make allowances for the "in flight" time of your
     * message data, so that data not processed from a previous time frame will be included with the next time frame.
     * Without this, missed message data would be excluded from processing during the next time frame as well, because
     * its timestamp places it within the previous time frame.
     * </p>
     * 
     * @return The number of seconds of estimated "in flight" lag time of message data. When you create data set
     *         contents using message data from a specified time frame, some message data may still be "in flight" when
     *         processing begins, and so will not arrive in time to be processed. Use this field to make allowances for
     *         the "in flight" time of your message data, so that data not processed from a previous time frame will be
     *         included with the next time frame. Without this, missed message data would be excluded from processing
     *         during the next time frame as well, because its timestamp places it within the previous time frame.
     */

    public Integer getOffsetSeconds() {
        return this.offsetSeconds;
    }

    /**
     * <p>
     * The number of seconds of estimated "in flight" lag time of message data. When you create data set contents using
     * message data from a specified time frame, some message data may still be "in flight" when processing begins, and
     * so will not arrive in time to be processed. Use this field to make allowances for the "in flight" time of your
     * message data, so that data not processed from a previous time frame will be included with the next time frame.
     * Without this, missed message data would be excluded from processing during the next time frame as well, because
     * its timestamp places it within the previous time frame.
     * </p>
     * 
     * @param offsetSeconds
     *        The number of seconds of estimated "in flight" lag time of message data. When you create data set contents
     *        using message data from a specified time frame, some message data may still be "in flight" when processing
     *        begins, and so will not arrive in time to be processed. Use this field to make allowances for the
     *        "in flight" time of your message data, so that data not processed from a previous time frame will be
     *        included with the next time frame. Without this, missed message data would be excluded from processing
     *        during the next time frame as well, because its timestamp places it within the previous time frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaTime withOffsetSeconds(Integer offsetSeconds) {
        setOffsetSeconds(offsetSeconds);
        return this;
    }

    /**
     * <p>
     * An expression by which the time of the message data may be determined. This may be the name of a timestamp field,
     * or a SQL expression which is used to derive the time the message data was generated.
     * </p>
     * 
     * @param timeExpression
     *        An expression by which the time of the message data may be determined. This may be the name of a timestamp
     *        field, or a SQL expression which is used to derive the time the message data was generated.
     */

    public void setTimeExpression(String timeExpression) {
        this.timeExpression = timeExpression;
    }

    /**
     * <p>
     * An expression by which the time of the message data may be determined. This may be the name of a timestamp field,
     * or a SQL expression which is used to derive the time the message data was generated.
     * </p>
     * 
     * @return An expression by which the time of the message data may be determined. This may be the name of a
     *         timestamp field, or a SQL expression which is used to derive the time the message data was generated.
     */

    public String getTimeExpression() {
        return this.timeExpression;
    }

    /**
     * <p>
     * An expression by which the time of the message data may be determined. This may be the name of a timestamp field,
     * or a SQL expression which is used to derive the time the message data was generated.
     * </p>
     * 
     * @param timeExpression
     *        An expression by which the time of the message data may be determined. This may be the name of a timestamp
     *        field, or a SQL expression which is used to derive the time the message data was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaTime withTimeExpression(String timeExpression) {
        setTimeExpression(timeExpression);
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
        if (getOffsetSeconds() != null)
            sb.append("OffsetSeconds: ").append(getOffsetSeconds()).append(",");
        if (getTimeExpression() != null)
            sb.append("TimeExpression: ").append(getTimeExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeltaTime == false)
            return false;
        DeltaTime other = (DeltaTime) obj;
        if (other.getOffsetSeconds() == null ^ this.getOffsetSeconds() == null)
            return false;
        if (other.getOffsetSeconds() != null && other.getOffsetSeconds().equals(this.getOffsetSeconds()) == false)
            return false;
        if (other.getTimeExpression() == null ^ this.getTimeExpression() == null)
            return false;
        if (other.getTimeExpression() != null && other.getTimeExpression().equals(this.getTimeExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOffsetSeconds() == null) ? 0 : getOffsetSeconds().hashCode());
        hashCode = prime * hashCode + ((getTimeExpression() == null) ? 0 : getTimeExpression().hashCode());
        return hashCode;
    }

    @Override
    public DeltaTime clone() {
        try {
            return (DeltaTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DeltaTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

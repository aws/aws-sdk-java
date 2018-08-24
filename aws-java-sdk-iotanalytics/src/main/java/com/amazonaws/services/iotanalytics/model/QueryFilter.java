/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information which is used to filter message data, to segregate it according to the time frame in which it arrives.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/QueryFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to limit data to that which has arrived since the last execution of the action. When you create data set
     * contents using message data from a specified time frame, some message data may still be "in flight" when
     * processing begins, and so will not arrive in time to be processed. Use this field to make allowances for the
     * "in flight" time of you message data, so that data not processed from a previous time frame will be included with
     * the next time frame. Without this, missed message data would be excluded from processing during the next time
     * frame as well, because its timestamp places it within the previous time frame.
     * </p>
     */
    private DeltaTime deltaTime;

    /**
     * <p>
     * Used to limit data to that which has arrived since the last execution of the action. When you create data set
     * contents using message data from a specified time frame, some message data may still be "in flight" when
     * processing begins, and so will not arrive in time to be processed. Use this field to make allowances for the
     * "in flight" time of you message data, so that data not processed from a previous time frame will be included with
     * the next time frame. Without this, missed message data would be excluded from processing during the next time
     * frame as well, because its timestamp places it within the previous time frame.
     * </p>
     * 
     * @param deltaTime
     *        Used to limit data to that which has arrived since the last execution of the action. When you create data
     *        set contents using message data from a specified time frame, some message data may still be "in flight"
     *        when processing begins, and so will not arrive in time to be processed. Use this field to make allowances
     *        for the "in flight" time of you message data, so that data not processed from a previous time frame will
     *        be included with the next time frame. Without this, missed message data would be excluded from processing
     *        during the next time frame as well, because its timestamp places it within the previous time frame.
     */

    public void setDeltaTime(DeltaTime deltaTime) {
        this.deltaTime = deltaTime;
    }

    /**
     * <p>
     * Used to limit data to that which has arrived since the last execution of the action. When you create data set
     * contents using message data from a specified time frame, some message data may still be "in flight" when
     * processing begins, and so will not arrive in time to be processed. Use this field to make allowances for the
     * "in flight" time of you message data, so that data not processed from a previous time frame will be included with
     * the next time frame. Without this, missed message data would be excluded from processing during the next time
     * frame as well, because its timestamp places it within the previous time frame.
     * </p>
     * 
     * @return Used to limit data to that which has arrived since the last execution of the action. When you create data
     *         set contents using message data from a specified time frame, some message data may still be "in flight"
     *         when processing begins, and so will not arrive in time to be processed. Use this field to make allowances
     *         for the "in flight" time of you message data, so that data not processed from a previous time frame will
     *         be included with the next time frame. Without this, missed message data would be excluded from processing
     *         during the next time frame as well, because its timestamp places it within the previous time frame.
     */

    public DeltaTime getDeltaTime() {
        return this.deltaTime;
    }

    /**
     * <p>
     * Used to limit data to that which has arrived since the last execution of the action. When you create data set
     * contents using message data from a specified time frame, some message data may still be "in flight" when
     * processing begins, and so will not arrive in time to be processed. Use this field to make allowances for the
     * "in flight" time of you message data, so that data not processed from a previous time frame will be included with
     * the next time frame. Without this, missed message data would be excluded from processing during the next time
     * frame as well, because its timestamp places it within the previous time frame.
     * </p>
     * 
     * @param deltaTime
     *        Used to limit data to that which has arrived since the last execution of the action. When you create data
     *        set contents using message data from a specified time frame, some message data may still be "in flight"
     *        when processing begins, and so will not arrive in time to be processed. Use this field to make allowances
     *        for the "in flight" time of you message data, so that data not processed from a previous time frame will
     *        be included with the next time frame. Without this, missed message data would be excluded from processing
     *        during the next time frame as well, because its timestamp places it within the previous time frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryFilter withDeltaTime(DeltaTime deltaTime) {
        setDeltaTime(deltaTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeltaTime() != null)
            sb.append("DeltaTime: ").append(getDeltaTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryFilter == false)
            return false;
        QueryFilter other = (QueryFilter) obj;
        if (other.getDeltaTime() == null ^ this.getDeltaTime() == null)
            return false;
        if (other.getDeltaTime() != null && other.getDeltaTime().equals(this.getDeltaTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeltaTime() == null) ? 0 : getDeltaTime().hashCode());
        return hashCode;
    }

    @Override
    public QueryFilter clone() {
        try {
            return (QueryFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.QueryFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

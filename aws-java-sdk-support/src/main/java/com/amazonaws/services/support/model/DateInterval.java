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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Date and time (UTC) format in RFC 3339 : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DateInterval" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateInterval implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A JSON object containing start and date time (UTC). Date and time format is RFC 3339 :
     * 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * </p>
     */
    private String startDateTime;
    /**
     * <p>
     * End Date Time (UTC). RFC 3339 format : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * </p>
     */
    private String endDateTime;

    /**
     * <p>
     * A JSON object containing start and date time (UTC). Date and time format is RFC 3339 :
     * 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * </p>
     * 
     * @param startDateTime
     *        A JSON object containing start and date time (UTC). Date and time format is RFC 3339 :
     *        'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     */

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * A JSON object containing start and date time (UTC). Date and time format is RFC 3339 :
     * 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * </p>
     * 
     * @return A JSON object containing start and date time (UTC). Date and time format is RFC 3339 :
     *         'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     */

    public String getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * A JSON object containing start and date time (UTC). Date and time format is RFC 3339 :
     * 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * </p>
     * 
     * @param startDateTime
     *        A JSON object containing start and date time (UTC). Date and time format is RFC 3339 :
     *        'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateInterval withStartDateTime(String startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * End Date Time (UTC). RFC 3339 format : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * </p>
     * 
     * @param endDateTime
     *        End Date Time (UTC). RFC 3339 format : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     */

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * End Date Time (UTC). RFC 3339 format : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * </p>
     * 
     * @return End Date Time (UTC). RFC 3339 format : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     */

    public String getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * End Date Time (UTC). RFC 3339 format : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * </p>
     * 
     * @param endDateTime
     *        End Date Time (UTC). RFC 3339 format : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateInterval withEndDateTime(String endDateTime) {
        setEndDateTime(endDateTime);
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
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateInterval == false)
            return false;
        DateInterval other = (DateInterval) obj;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DateInterval clone() {
        try {
            return (DateInterval) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.DateIntervalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

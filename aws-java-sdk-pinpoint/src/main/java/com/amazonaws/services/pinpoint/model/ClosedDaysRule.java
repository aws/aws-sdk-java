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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Closed Days Rule. Part of Journey sending schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ClosedDaysRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClosedDaysRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Start Datetime in ISO 8601 format.
     * </p>
     */
    private String startDateTime;
    /**
     * <p>
     * End Datetime in ISO 8601 format.
     * </p>
     */
    private String endDateTime;

    /**
     * <p>
     * Name of the rule.
     * </p>
     * 
     * @param name
     *        Name of the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the rule.
     * </p>
     * 
     * @return Name of the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the rule.
     * </p>
     * 
     * @param name
     *        Name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDaysRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Start Datetime in ISO 8601 format.
     * </p>
     * 
     * @param startDateTime
     *        Start Datetime in ISO 8601 format.
     */

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * Start Datetime in ISO 8601 format.
     * </p>
     * 
     * @return Start Datetime in ISO 8601 format.
     */

    public String getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * Start Datetime in ISO 8601 format.
     * </p>
     * 
     * @param startDateTime
     *        Start Datetime in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDaysRule withStartDateTime(String startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * End Datetime in ISO 8601 format.
     * </p>
     * 
     * @param endDateTime
     *        End Datetime in ISO 8601 format.
     */

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * End Datetime in ISO 8601 format.
     * </p>
     * 
     * @return End Datetime in ISO 8601 format.
     */

    public String getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * End Datetime in ISO 8601 format.
     * </p>
     * 
     * @param endDateTime
     *        End Datetime in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDaysRule withEndDateTime(String endDateTime) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof ClosedDaysRule == false)
            return false;
        ClosedDaysRule other = (ClosedDaysRule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return hashCode;
    }

    @Override
    public ClosedDaysRule clone() {
        try {
            return (ClosedDaysRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ClosedDaysRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

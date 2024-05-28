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
 * A JSON-formatted object that contains the CommunicationTypeOptions for creating a case for a certain communication
 * channel. It is contained in the response from a <a>DescribeCreateCaseOptions</a> request.
 * <b>CommunicationTypeOptions</b> contains the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>datesWithoutSupport</b> - A JSON-formatted list containing date and time ranges for periods without support in UTC
 * time. Date and time format is RFC 3339 : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>supportedHours</b> - A JSON-formatted list containing time ranges when support are available. Time format is RFC
 * 3339 : 'HH:mm:ss.SSS'.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>type</b> - A string value indicating the communication type that the aforementioned rules apply to. At the moment
 * the type value can assume one of 3 values at the moment <code>chat</code>, <code>web</code> and <code>call</code>.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/CommunicationTypeOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommunicationTypeOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string value indicating the communication type. At the moment the type value can assume one of 3 values at the
     * moment chat, web and call.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A JSON-formatted list containing time ranges when support is available.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SupportedHour> supportedHours;
    /**
     * <p>
     * A JSON-formatted list containing date and time ranges for periods without support
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DateInterval> datesWithoutSupport;

    /**
     * <p>
     * A string value indicating the communication type. At the moment the type value can assume one of 3 values at the
     * moment chat, web and call.
     * </p>
     * 
     * @param type
     *        A string value indicating the communication type. At the moment the type value can assume one of 3 values
     *        at the moment chat, web and call.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A string value indicating the communication type. At the moment the type value can assume one of 3 values at the
     * moment chat, web and call.
     * </p>
     * 
     * @return A string value indicating the communication type. At the moment the type value can assume one of 3 values
     *         at the moment chat, web and call.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A string value indicating the communication type. At the moment the type value can assume one of 3 values at the
     * moment chat, web and call.
     * </p>
     * 
     * @param type
     *        A string value indicating the communication type. At the moment the type value can assume one of 3 values
     *        at the moment chat, web and call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommunicationTypeOptions withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A JSON-formatted list containing time ranges when support is available.
     * </p>
     * 
     * @return A JSON-formatted list containing time ranges when support is available.
     */

    public java.util.List<SupportedHour> getSupportedHours() {
        if (supportedHours == null) {
            supportedHours = new com.amazonaws.internal.SdkInternalList<SupportedHour>();
        }
        return supportedHours;
    }

    /**
     * <p>
     * A JSON-formatted list containing time ranges when support is available.
     * </p>
     * 
     * @param supportedHours
     *        A JSON-formatted list containing time ranges when support is available.
     */

    public void setSupportedHours(java.util.Collection<SupportedHour> supportedHours) {
        if (supportedHours == null) {
            this.supportedHours = null;
            return;
        }

        this.supportedHours = new com.amazonaws.internal.SdkInternalList<SupportedHour>(supportedHours);
    }

    /**
     * <p>
     * A JSON-formatted list containing time ranges when support is available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedHours(java.util.Collection)} or {@link #withSupportedHours(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param supportedHours
     *        A JSON-formatted list containing time ranges when support is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommunicationTypeOptions withSupportedHours(SupportedHour... supportedHours) {
        if (this.supportedHours == null) {
            setSupportedHours(new com.amazonaws.internal.SdkInternalList<SupportedHour>(supportedHours.length));
        }
        for (SupportedHour ele : supportedHours) {
            this.supportedHours.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON-formatted list containing time ranges when support is available.
     * </p>
     * 
     * @param supportedHours
     *        A JSON-formatted list containing time ranges when support is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommunicationTypeOptions withSupportedHours(java.util.Collection<SupportedHour> supportedHours) {
        setSupportedHours(supportedHours);
        return this;
    }

    /**
     * <p>
     * A JSON-formatted list containing date and time ranges for periods without support
     * </p>
     * 
     * @return A JSON-formatted list containing date and time ranges for periods without support
     */

    public java.util.List<DateInterval> getDatesWithoutSupport() {
        if (datesWithoutSupport == null) {
            datesWithoutSupport = new com.amazonaws.internal.SdkInternalList<DateInterval>();
        }
        return datesWithoutSupport;
    }

    /**
     * <p>
     * A JSON-formatted list containing date and time ranges for periods without support
     * </p>
     * 
     * @param datesWithoutSupport
     *        A JSON-formatted list containing date and time ranges for periods without support
     */

    public void setDatesWithoutSupport(java.util.Collection<DateInterval> datesWithoutSupport) {
        if (datesWithoutSupport == null) {
            this.datesWithoutSupport = null;
            return;
        }

        this.datesWithoutSupport = new com.amazonaws.internal.SdkInternalList<DateInterval>(datesWithoutSupport);
    }

    /**
     * <p>
     * A JSON-formatted list containing date and time ranges for periods without support
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatesWithoutSupport(java.util.Collection)} or {@link #withDatesWithoutSupport(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param datesWithoutSupport
     *        A JSON-formatted list containing date and time ranges for periods without support
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommunicationTypeOptions withDatesWithoutSupport(DateInterval... datesWithoutSupport) {
        if (this.datesWithoutSupport == null) {
            setDatesWithoutSupport(new com.amazonaws.internal.SdkInternalList<DateInterval>(datesWithoutSupport.length));
        }
        for (DateInterval ele : datesWithoutSupport) {
            this.datesWithoutSupport.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON-formatted list containing date and time ranges for periods without support
     * </p>
     * 
     * @param datesWithoutSupport
     *        A JSON-formatted list containing date and time ranges for periods without support
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommunicationTypeOptions withDatesWithoutSupport(java.util.Collection<DateInterval> datesWithoutSupport) {
        setDatesWithoutSupport(datesWithoutSupport);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSupportedHours() != null)
            sb.append("SupportedHours: ").append(getSupportedHours()).append(",");
        if (getDatesWithoutSupport() != null)
            sb.append("DatesWithoutSupport: ").append(getDatesWithoutSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommunicationTypeOptions == false)
            return false;
        CommunicationTypeOptions other = (CommunicationTypeOptions) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSupportedHours() == null ^ this.getSupportedHours() == null)
            return false;
        if (other.getSupportedHours() != null && other.getSupportedHours().equals(this.getSupportedHours()) == false)
            return false;
        if (other.getDatesWithoutSupport() == null ^ this.getDatesWithoutSupport() == null)
            return false;
        if (other.getDatesWithoutSupport() != null && other.getDatesWithoutSupport().equals(this.getDatesWithoutSupport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSupportedHours() == null) ? 0 : getSupportedHours().hashCode());
        hashCode = prime * hashCode + ((getDatesWithoutSupport() == null) ? 0 : getDatesWithoutSupport().hashCode());
        return hashCode;
    }

    @Override
    public CommunicationTypeOptions clone() {
        try {
            return (CommunicationTypeOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.CommunicationTypeOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

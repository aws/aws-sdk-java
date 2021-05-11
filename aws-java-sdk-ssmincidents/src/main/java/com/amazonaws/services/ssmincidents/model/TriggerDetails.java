/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about what caused the incident to be created in Incident Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/TriggerDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TriggerDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Raw data passed from either EventBridge, CloudWatch, or Incident Manager when an incident is created.
     * </p>
     */
    private String rawData;
    /**
     * <p>
     * Identifies the service that sourced the event. All events sourced from within AWS begin with "aws."
     * Customer-generated events can have any value here, as long as it doesn't begin with "aws." We recommend the use
     * of Java package-name style reverse domain-name strings.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The time that the incident was detected.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The ARN of the source that detected the incident.
     * </p>
     */
    private String triggerArn;

    /**
     * <p>
     * Raw data passed from either EventBridge, CloudWatch, or Incident Manager when an incident is created.
     * </p>
     * 
     * @param rawData
     *        Raw data passed from either EventBridge, CloudWatch, or Incident Manager when an incident is created.
     */

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    /**
     * <p>
     * Raw data passed from either EventBridge, CloudWatch, or Incident Manager when an incident is created.
     * </p>
     * 
     * @return Raw data passed from either EventBridge, CloudWatch, or Incident Manager when an incident is created.
     */

    public String getRawData() {
        return this.rawData;
    }

    /**
     * <p>
     * Raw data passed from either EventBridge, CloudWatch, or Incident Manager when an incident is created.
     * </p>
     * 
     * @param rawData
     *        Raw data passed from either EventBridge, CloudWatch, or Incident Manager when an incident is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TriggerDetails withRawData(String rawData) {
        setRawData(rawData);
        return this;
    }

    /**
     * <p>
     * Identifies the service that sourced the event. All events sourced from within AWS begin with "aws."
     * Customer-generated events can have any value here, as long as it doesn't begin with "aws." We recommend the use
     * of Java package-name style reverse domain-name strings.
     * </p>
     * 
     * @param source
     *        Identifies the service that sourced the event. All events sourced from within AWS begin with "aws."
     *        Customer-generated events can have any value here, as long as it doesn't begin with "aws." We recommend
     *        the use of Java package-name style reverse domain-name strings.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * Identifies the service that sourced the event. All events sourced from within AWS begin with "aws."
     * Customer-generated events can have any value here, as long as it doesn't begin with "aws." We recommend the use
     * of Java package-name style reverse domain-name strings.
     * </p>
     * 
     * @return Identifies the service that sourced the event. All events sourced from within AWS begin with "aws."
     *         Customer-generated events can have any value here, as long as it doesn't begin with "aws." We recommend
     *         the use of Java package-name style reverse domain-name strings.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * Identifies the service that sourced the event. All events sourced from within AWS begin with "aws."
     * Customer-generated events can have any value here, as long as it doesn't begin with "aws." We recommend the use
     * of Java package-name style reverse domain-name strings.
     * </p>
     * 
     * @param source
     *        Identifies the service that sourced the event. All events sourced from within AWS begin with "aws."
     *        Customer-generated events can have any value here, as long as it doesn't begin with "aws." We recommend
     *        the use of Java package-name style reverse domain-name strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TriggerDetails withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The time that the incident was detected.
     * </p>
     * 
     * @param timestamp
     *        The time that the incident was detected.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time that the incident was detected.
     * </p>
     * 
     * @return The time that the incident was detected.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time that the incident was detected.
     * </p>
     * 
     * @param timestamp
     *        The time that the incident was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TriggerDetails withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The ARN of the source that detected the incident.
     * </p>
     * 
     * @param triggerArn
     *        The ARN of the source that detected the incident.
     */

    public void setTriggerArn(String triggerArn) {
        this.triggerArn = triggerArn;
    }

    /**
     * <p>
     * The ARN of the source that detected the incident.
     * </p>
     * 
     * @return The ARN of the source that detected the incident.
     */

    public String getTriggerArn() {
        return this.triggerArn;
    }

    /**
     * <p>
     * The ARN of the source that detected the incident.
     * </p>
     * 
     * @param triggerArn
     *        The ARN of the source that detected the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TriggerDetails withTriggerArn(String triggerArn) {
        setTriggerArn(triggerArn);
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
        if (getRawData() != null)
            sb.append("RawData: ").append(getRawData()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getTriggerArn() != null)
            sb.append("TriggerArn: ").append(getTriggerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TriggerDetails == false)
            return false;
        TriggerDetails other = (TriggerDetails) obj;
        if (other.getRawData() == null ^ this.getRawData() == null)
            return false;
        if (other.getRawData() != null && other.getRawData().equals(this.getRawData()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getTriggerArn() == null ^ this.getTriggerArn() == null)
            return false;
        if (other.getTriggerArn() != null && other.getTriggerArn().equals(this.getTriggerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRawData() == null) ? 0 : getRawData().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTriggerArn() == null) ? 0 : getTriggerArn().hashCode());
        return hashCode;
    }

    @Override
    public TriggerDetails clone() {
        try {
            return (TriggerDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.TriggerDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

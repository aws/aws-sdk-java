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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the filter used when retrieving metrics. <code>MetricFiltersV2</code> can be used on the
 * following metrics: <code>AVG_AGENT_CONNECTING_TIME</code>, <code>CONTACTS_CREATED</code>,
 * <code>CONTACTS_HANDLED</code>, <code>SUM_CONTACTS_DISCONNECTED</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MetricFilterV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricFilterV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter keys: <code>INITIATION_METHOD</code>, <code>DISCONNECT_REASON</code>. These are the same
     * values as the <code>InitiationMethod</code> and <code>DisconnectReason</code> in the contact record. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     * >ContactTraceRecord</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private String metricFilterKey;
    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>: <code>INBOUND</code> | <code>OUTBOUND</code> |
     * <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>: <code>CUSTOMER_DISCONNECT</code> |
     * <code>AGENT_DISCONNECT</code> | <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> | <code>EXPIRED</code> |
     * <code>API</code>
     * </p>
     */
    private java.util.List<String> metricFilterValues;
    /**
     * <p>
     * The flag to use to filter on requested metric filter values or to not filter on requested metric filter values.
     * By default the negate is <code>false</code>, which indicates to filter on the requested metric filter.
     * </p>
     */
    private Boolean negate;

    /**
     * <p>
     * The key to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter keys: <code>INITIATION_METHOD</code>, <code>DISCONNECT_REASON</code>. These are the same
     * values as the <code>InitiationMethod</code> and <code>DisconnectReason</code> in the contact record. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     * >ContactTraceRecord</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param metricFilterKey
     *        The key to use for filtering data. </p>
     *        <p>
     *        Valid metric filter keys: <code>INITIATION_METHOD</code>, <code>DISCONNECT_REASON</code>. These are the
     *        same values as the <code>InitiationMethod</code> and <code>DisconnectReason</code> in the contact record.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     *        >ContactTraceRecord</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setMetricFilterKey(String metricFilterKey) {
        this.metricFilterKey = metricFilterKey;
    }

    /**
     * <p>
     * The key to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter keys: <code>INITIATION_METHOD</code>, <code>DISCONNECT_REASON</code>. These are the same
     * values as the <code>InitiationMethod</code> and <code>DisconnectReason</code> in the contact record. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     * >ContactTraceRecord</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return The key to use for filtering data. </p>
     *         <p>
     *         Valid metric filter keys: <code>INITIATION_METHOD</code>, <code>DISCONNECT_REASON</code>. These are the
     *         same values as the <code>InitiationMethod</code> and <code>DisconnectReason</code> in the contact record.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     *         >ContactTraceRecord</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public String getMetricFilterKey() {
        return this.metricFilterKey;
    }

    /**
     * <p>
     * The key to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter keys: <code>INITIATION_METHOD</code>, <code>DISCONNECT_REASON</code>. These are the same
     * values as the <code>InitiationMethod</code> and <code>DisconnectReason</code> in the contact record. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     * >ContactTraceRecord</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param metricFilterKey
     *        The key to use for filtering data. </p>
     *        <p>
     *        Valid metric filter keys: <code>INITIATION_METHOD</code>, <code>DISCONNECT_REASON</code>. These are the
     *        same values as the <code>InitiationMethod</code> and <code>DisconnectReason</code> in the contact record.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/ctr-data-model.html#ctr-ContactTraceRecord"
     *        >ContactTraceRecord</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilterV2 withMetricFilterKey(String metricFilterKey) {
        setMetricFilterKey(metricFilterKey);
        return this;
    }

    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>: <code>INBOUND</code> | <code>OUTBOUND</code> |
     * <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>: <code>CUSTOMER_DISCONNECT</code> |
     * <code>AGENT_DISCONNECT</code> | <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> | <code>EXPIRED</code> |
     * <code>API</code>
     * </p>
     * 
     * @return The values to use for filtering data. </p>
     *         <p>
     *         Valid metric filter values for <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *         <code>OUTBOUND</code> | <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> |
     *         <code>API</code>
     *         </p>
     *         <p>
     *         Valid metric filter values for <code>DISCONNECT_REASON</code>: <code>CUSTOMER_DISCONNECT</code> |
     *         <code>AGENT_DISCONNECT</code> | <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     *         <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> | <code>EXPIRED</code> |
     *         <code>API</code>
     */

    public java.util.List<String> getMetricFilterValues() {
        return metricFilterValues;
    }

    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>: <code>INBOUND</code> | <code>OUTBOUND</code> |
     * <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>: <code>CUSTOMER_DISCONNECT</code> |
     * <code>AGENT_DISCONNECT</code> | <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> | <code>EXPIRED</code> |
     * <code>API</code>
     * </p>
     * 
     * @param metricFilterValues
     *        The values to use for filtering data. </p>
     *        <p>
     *        Valid metric filter values for <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *        <code>OUTBOUND</code> | <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> |
     *        <code>API</code>
     *        </p>
     *        <p>
     *        Valid metric filter values for <code>DISCONNECT_REASON</code>: <code>CUSTOMER_DISCONNECT</code> |
     *        <code>AGENT_DISCONNECT</code> | <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     *        <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> | <code>EXPIRED</code> |
     *        <code>API</code>
     */

    public void setMetricFilterValues(java.util.Collection<String> metricFilterValues) {
        if (metricFilterValues == null) {
            this.metricFilterValues = null;
            return;
        }

        this.metricFilterValues = new java.util.ArrayList<String>(metricFilterValues);
    }

    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>: <code>INBOUND</code> | <code>OUTBOUND</code> |
     * <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>: <code>CUSTOMER_DISCONNECT</code> |
     * <code>AGENT_DISCONNECT</code> | <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> | <code>EXPIRED</code> |
     * <code>API</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricFilterValues(java.util.Collection)} or {@link #withMetricFilterValues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricFilterValues
     *        The values to use for filtering data. </p>
     *        <p>
     *        Valid metric filter values for <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *        <code>OUTBOUND</code> | <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> |
     *        <code>API</code>
     *        </p>
     *        <p>
     *        Valid metric filter values for <code>DISCONNECT_REASON</code>: <code>CUSTOMER_DISCONNECT</code> |
     *        <code>AGENT_DISCONNECT</code> | <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     *        <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> | <code>EXPIRED</code> |
     *        <code>API</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilterV2 withMetricFilterValues(String... metricFilterValues) {
        if (this.metricFilterValues == null) {
            setMetricFilterValues(new java.util.ArrayList<String>(metricFilterValues.length));
        }
        for (String ele : metricFilterValues) {
            this.metricFilterValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values to use for filtering data.
     * </p>
     * <p>
     * Valid metric filter values for <code>INITIATION_METHOD</code>: <code>INBOUND</code> | <code>OUTBOUND</code> |
     * <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> | <code>API</code>
     * </p>
     * <p>
     * Valid metric filter values for <code>DISCONNECT_REASON</code>: <code>CUSTOMER_DISCONNECT</code> |
     * <code>AGENT_DISCONNECT</code> | <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     * <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> | <code>EXPIRED</code> |
     * <code>API</code>
     * </p>
     * 
     * @param metricFilterValues
     *        The values to use for filtering data. </p>
     *        <p>
     *        Valid metric filter values for <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *        <code>OUTBOUND</code> | <code>TRANSFER</code> | <code>QUEUE_TRANSFER</code> | <code>CALLBACK</code> |
     *        <code>API</code>
     *        </p>
     *        <p>
     *        Valid metric filter values for <code>DISCONNECT_REASON</code>: <code>CUSTOMER_DISCONNECT</code> |
     *        <code>AGENT_DISCONNECT</code> | <code>THIRD_PARTY_DISCONNECT</code> | <code>TELECOM_PROBLEM</code> |
     *        <code>BARGED</code> | <code>CONTACT_FLOW_DISCONNECT</code> | <code>OTHER</code> | <code>EXPIRED</code> |
     *        <code>API</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilterV2 withMetricFilterValues(java.util.Collection<String> metricFilterValues) {
        setMetricFilterValues(metricFilterValues);
        return this;
    }

    /**
     * <p>
     * The flag to use to filter on requested metric filter values or to not filter on requested metric filter values.
     * By default the negate is <code>false</code>, which indicates to filter on the requested metric filter.
     * </p>
     * 
     * @param negate
     *        The flag to use to filter on requested metric filter values or to not filter on requested metric filter
     *        values. By default the negate is <code>false</code>, which indicates to filter on the requested metric
     *        filter.
     */

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * The flag to use to filter on requested metric filter values or to not filter on requested metric filter values.
     * By default the negate is <code>false</code>, which indicates to filter on the requested metric filter.
     * </p>
     * 
     * @return The flag to use to filter on requested metric filter values or to not filter on requested metric filter
     *         values. By default the negate is <code>false</code>, which indicates to filter on the requested metric
     *         filter.
     */

    public Boolean getNegate() {
        return this.negate;
    }

    /**
     * <p>
     * The flag to use to filter on requested metric filter values or to not filter on requested metric filter values.
     * By default the negate is <code>false</code>, which indicates to filter on the requested metric filter.
     * </p>
     * 
     * @param negate
     *        The flag to use to filter on requested metric filter values or to not filter on requested metric filter
     *        values. By default the negate is <code>false</code>, which indicates to filter on the requested metric
     *        filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricFilterV2 withNegate(Boolean negate) {
        setNegate(negate);
        return this;
    }

    /**
     * <p>
     * The flag to use to filter on requested metric filter values or to not filter on requested metric filter values.
     * By default the negate is <code>false</code>, which indicates to filter on the requested metric filter.
     * </p>
     * 
     * @return The flag to use to filter on requested metric filter values or to not filter on requested metric filter
     *         values. By default the negate is <code>false</code>, which indicates to filter on the requested metric
     *         filter.
     */

    public Boolean isNegate() {
        return this.negate;
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
        if (getMetricFilterKey() != null)
            sb.append("MetricFilterKey: ").append(getMetricFilterKey()).append(",");
        if (getMetricFilterValues() != null)
            sb.append("MetricFilterValues: ").append(getMetricFilterValues()).append(",");
        if (getNegate() != null)
            sb.append("Negate: ").append(getNegate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricFilterV2 == false)
            return false;
        MetricFilterV2 other = (MetricFilterV2) obj;
        if (other.getMetricFilterKey() == null ^ this.getMetricFilterKey() == null)
            return false;
        if (other.getMetricFilterKey() != null && other.getMetricFilterKey().equals(this.getMetricFilterKey()) == false)
            return false;
        if (other.getMetricFilterValues() == null ^ this.getMetricFilterValues() == null)
            return false;
        if (other.getMetricFilterValues() != null && other.getMetricFilterValues().equals(this.getMetricFilterValues()) == false)
            return false;
        if (other.getNegate() == null ^ this.getNegate() == null)
            return false;
        if (other.getNegate() != null && other.getNegate().equals(this.getNegate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricFilterKey() == null) ? 0 : getMetricFilterKey().hashCode());
        hashCode = prime * hashCode + ((getMetricFilterValues() == null) ? 0 : getMetricFilterValues().hashCode());
        hashCode = prime * hashCode + ((getNegate() == null) ? 0 : getNegate().hashCode());
        return hashCode;
    }

    @Override
    public MetricFilterV2 clone() {
        try {
            return (MetricFilterV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.MetricFilterV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the alarms.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmNames;
    /**
     * <p>
     * The alarm name prefix. If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * </p>
     */
    private String alarmNamePrefix;
    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     */
    private String stateValue;
    /**
     * <p>
     * The action name prefix.
     * </p>
     */
    private String actionPrefix;
    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the alarms.
     * </p>
     * 
     * @return The names of the alarms.
     */

    public java.util.List<String> getAlarmNames() {
        if (alarmNames == null) {
            alarmNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmNames;
    }

    /**
     * <p>
     * The names of the alarms.
     * </p>
     * 
     * @param alarmNames
     *        The names of the alarms.
     */

    public void setAlarmNames(java.util.Collection<String> alarmNames) {
        if (alarmNames == null) {
            this.alarmNames = null;
            return;
        }

        this.alarmNames = new com.amazonaws.internal.SdkInternalList<String>(alarmNames);
    }

    /**
     * <p>
     * The names of the alarms.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmNames(java.util.Collection)} or {@link #withAlarmNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmNames
     *        The names of the alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withAlarmNames(String... alarmNames) {
        if (this.alarmNames == null) {
            setAlarmNames(new com.amazonaws.internal.SdkInternalList<String>(alarmNames.length));
        }
        for (String ele : alarmNames) {
            this.alarmNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the alarms.
     * </p>
     * 
     * @param alarmNames
     *        The names of the alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withAlarmNames(java.util.Collection<String> alarmNames) {
        setAlarmNames(alarmNames);
        return this;
    }

    /**
     * <p>
     * The alarm name prefix. If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * </p>
     * 
     * @param alarmNamePrefix
     *        The alarm name prefix. If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     */

    public void setAlarmNamePrefix(String alarmNamePrefix) {
        this.alarmNamePrefix = alarmNamePrefix;
    }

    /**
     * <p>
     * The alarm name prefix. If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * </p>
     * 
     * @return The alarm name prefix. If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     */

    public String getAlarmNamePrefix() {
        return this.alarmNamePrefix;
    }

    /**
     * <p>
     * The alarm name prefix. If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * </p>
     * 
     * @param alarmNamePrefix
     *        The alarm name prefix. If this parameter is specified, you cannot specify <code>AlarmNames</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withAlarmNamePrefix(String alarmNamePrefix) {
        setAlarmNamePrefix(alarmNamePrefix);
        return this;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @param stateValue
     *        The state value to be used in matching alarms.
     * @see StateValue
     */

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @return The state value to be used in matching alarms.
     * @see StateValue
     */

    public String getStateValue() {
        return this.stateValue;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @param stateValue
     *        The state value to be used in matching alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateValue
     */

    public DescribeAlarmsRequest withStateValue(String stateValue) {
        setStateValue(stateValue);
        return this;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @param stateValue
     *        The state value to be used in matching alarms.
     * @see StateValue
     */

    public void setStateValue(StateValue stateValue) {
        withStateValue(stateValue);
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @param stateValue
     *        The state value to be used in matching alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateValue
     */

    public DescribeAlarmsRequest withStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
        return this;
    }

    /**
     * <p>
     * The action name prefix.
     * </p>
     * 
     * @param actionPrefix
     *        The action name prefix.
     */

    public void setActionPrefix(String actionPrefix) {
        this.actionPrefix = actionPrefix;
    }

    /**
     * <p>
     * The action name prefix.
     * </p>
     * 
     * @return The action name prefix.
     */

    public String getActionPrefix() {
        return this.actionPrefix;
    }

    /**
     * <p>
     * The action name prefix.
     * </p>
     * 
     * @param actionPrefix
     *        The action name prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withActionPrefix(String actionPrefix) {
        setActionPrefix(actionPrefix);
        return this;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of alarm descriptions to retrieve.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * 
     * @return The maximum number of alarm descriptions to retrieve.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of alarm descriptions to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @return The token returned by a previous call to indicate that there is more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAlarmNames() != null)
            sb.append("AlarmNames: ").append(getAlarmNames()).append(",");
        if (getAlarmNamePrefix() != null)
            sb.append("AlarmNamePrefix: ").append(getAlarmNamePrefix()).append(",");
        if (getStateValue() != null)
            sb.append("StateValue: ").append(getStateValue()).append(",");
        if (getActionPrefix() != null)
            sb.append("ActionPrefix: ").append(getActionPrefix()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmsRequest == false)
            return false;
        DescribeAlarmsRequest other = (DescribeAlarmsRequest) obj;
        if (other.getAlarmNames() == null ^ this.getAlarmNames() == null)
            return false;
        if (other.getAlarmNames() != null && other.getAlarmNames().equals(this.getAlarmNames()) == false)
            return false;
        if (other.getAlarmNamePrefix() == null ^ this.getAlarmNamePrefix() == null)
            return false;
        if (other.getAlarmNamePrefix() != null && other.getAlarmNamePrefix().equals(this.getAlarmNamePrefix()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null && other.getStateValue().equals(this.getStateValue()) == false)
            return false;
        if (other.getActionPrefix() == null ^ this.getActionPrefix() == null)
            return false;
        if (other.getActionPrefix() != null && other.getActionPrefix().equals(this.getActionPrefix()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmNames() == null) ? 0 : getAlarmNames().hashCode());
        hashCode = prime * hashCode + ((getAlarmNamePrefix() == null) ? 0 : getAlarmNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        hashCode = prime * hashCode + ((getActionPrefix() == null) ? 0 : getActionPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmsRequest clone() {
        return (DescribeAlarmsRequest) super.clone();
    }

}

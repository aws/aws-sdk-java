/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#putMetricAlarm(PutMetricAlarmRequest) PutMetricAlarm operation}.
 * <p>
 * Creates or updates an alarm and associates it with the specified Amazon CloudWatch metric. Optionally, this operation can associate one or more
 * Amazon Simple Notification Service resources with the alarm.
 * </p>
 * <p>
 * When this operation creates an alarm, the alarm state is immediately set to <code>INSUFFICIENT_DATA</code> . The alarm is evaluated and its
 * <code>StateValue</code> is set appropriately. Any actions associated with the <code>StateValue</code> is then executed.
 * </p>
 * <p>
 * <b>NOTE:</b> When updating an existing alarm, its StateValue is left unchanged.
 * </p>
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#putMetricAlarm(PutMetricAlarmRequest)
 */
public class PutMetricAlarmRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The descriptive name for the alarm. This name must be unique within
     * the user's AWS account
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String alarmName;

    /**
     * The description for the alarm.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String alarmDescription;

    /**
     * Indicates whether or not actions should be executed during any changes
     * to the alarm's state.
     */
    private Boolean actionsEnabled;

    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified
     * as an Amazon Resource Number (ARN). Currently the only action
     * supported is publishing to an Amazon SNS topic or an Amazon Auto
     * Scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> oKActions;

    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is
     * specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> alarmActions;

    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action
     * is specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> insufficientDataActions;

    /**
     * The name for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * The namespace for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * The statistic to apply to the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     */
    private String statistic;

    /**
     * The dimensions for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensions;

    /**
     * The period in seconds over which the specified statistic is applied.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     */
    private Integer period;

    /**
     * The unit for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     */
    private String unit;

    /**
     * The number of periods over which data is compared to the specified
     * threshold.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer evaluationPeriods;

    /**
     * The value against which the specified statistic is compared.
     */
    private Double threshold;

    /**
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     */
    private String comparisonOperator;

    /**
     * The descriptive name for the alarm. This name must be unique within
     * the user's AWS account
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The descriptive name for the alarm. This name must be unique within
     *         the user's AWS account
     */
    public String getAlarmName() {
        return alarmName;
    }
    
    /**
     * The descriptive name for the alarm. This name must be unique within
     * the user's AWS account
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName The descriptive name for the alarm. This name must be unique within
     *         the user's AWS account
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }
    
    /**
     * The descriptive name for the alarm. This name must be unique within
     * the user's AWS account
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName The descriptive name for the alarm. This name must be unique within
     *         the user's AWS account
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * The description for the alarm.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The description for the alarm.
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }
    
    /**
     * The description for the alarm.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param alarmDescription The description for the alarm.
     */
    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }
    
    /**
     * The description for the alarm.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param alarmDescription The description for the alarm.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * Indicates whether or not actions should be executed during any changes
     * to the alarm's state.
     *
     * @return Indicates whether or not actions should be executed during any changes
     *         to the alarm's state.
     */
    public Boolean isActionsEnabled() {
        return actionsEnabled;
    }
    
    /**
     * Indicates whether or not actions should be executed during any changes
     * to the alarm's state.
     *
     * @param actionsEnabled Indicates whether or not actions should be executed during any changes
     *         to the alarm's state.
     */
    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }
    
    /**
     * Indicates whether or not actions should be executed during any changes
     * to the alarm's state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actionsEnabled Indicates whether or not actions should be executed during any changes
     *         to the alarm's state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
        return this;
    }

    /**
     * Indicates whether or not actions should be executed during any changes
     * to the alarm's state.
     *
     * @return Indicates whether or not actions should be executed during any changes
     *         to the alarm's state.
     */
    public Boolean getActionsEnabled() {
        return actionsEnabled;
    }

    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified
     * as an Amazon Resource Number (ARN). Currently the only action
     * supported is publishing to an Amazon SNS topic or an Amazon Auto
     * Scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The list of actions to execute when this alarm transitions into an
     *         <code>OK</code> state from any other state. Each action is specified
     *         as an Amazon Resource Number (ARN). Currently the only action
     *         supported is publishing to an Amazon SNS topic or an Amazon Auto
     *         Scaling policy.
     */
    public java.util.List<String> getOKActions() {
        if (oKActions == null) {
              oKActions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              oKActions.setAutoConstruct(true);
        }
        return oKActions;
    }
    
    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified
     * as an Amazon Resource Number (ARN). Currently the only action
     * supported is publishing to an Amazon SNS topic or an Amazon Auto
     * Scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param oKActions The list of actions to execute when this alarm transitions into an
     *         <code>OK</code> state from any other state. Each action is specified
     *         as an Amazon Resource Number (ARN). Currently the only action
     *         supported is publishing to an Amazon SNS topic or an Amazon Auto
     *         Scaling policy.
     */
    public void setOKActions(java.util.Collection<String> oKActions) {
        if (oKActions == null) {
            this.oKActions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> oKActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(oKActions.size());
        oKActionsCopy.addAll(oKActions);
        this.oKActions = oKActionsCopy;
    }
    
    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified
     * as an Amazon Resource Number (ARN). Currently the only action
     * supported is publishing to an Amazon SNS topic or an Amazon Auto
     * Scaling policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param oKActions The list of actions to execute when this alarm transitions into an
     *         <code>OK</code> state from any other state. Each action is specified
     *         as an Amazon Resource Number (ARN). Currently the only action
     *         supported is publishing to an Amazon SNS topic or an Amazon Auto
     *         Scaling policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withOKActions(String... oKActions) {
        if (getOKActions() == null) setOKActions(new java.util.ArrayList<String>(oKActions.length));
        for (String value : oKActions) {
            getOKActions().add(value);
        }
        return this;
    }
    
    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified
     * as an Amazon Resource Number (ARN). Currently the only action
     * supported is publishing to an Amazon SNS topic or an Amazon Auto
     * Scaling policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param oKActions The list of actions to execute when this alarm transitions into an
     *         <code>OK</code> state from any other state. Each action is specified
     *         as an Amazon Resource Number (ARN). Currently the only action
     *         supported is publishing to an Amazon SNS topic or an Amazon Auto
     *         Scaling policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withOKActions(java.util.Collection<String> oKActions) {
        if (oKActions == null) {
            this.oKActions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> oKActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(oKActions.size());
            oKActionsCopy.addAll(oKActions);
            this.oKActions = oKActionsCopy;
        }

        return this;
    }

    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is
     * specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The list of actions to execute when this alarm transitions into an
     *         <code>ALARM</code> state from any other state. Each action is
     *         specified as an Amazon Resource Number (ARN). Currently the only
     *         action supported is publishing to an Amazon SNS topic or an Amazon
     *         Auto Scaling policy.
     */
    public java.util.List<String> getAlarmActions() {
        if (alarmActions == null) {
              alarmActions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              alarmActions.setAutoConstruct(true);
        }
        return alarmActions;
    }
    
    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is
     * specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param alarmActions The list of actions to execute when this alarm transitions into an
     *         <code>ALARM</code> state from any other state. Each action is
     *         specified as an Amazon Resource Number (ARN). Currently the only
     *         action supported is publishing to an Amazon SNS topic or an Amazon
     *         Auto Scaling policy.
     */
    public void setAlarmActions(java.util.Collection<String> alarmActions) {
        if (alarmActions == null) {
            this.alarmActions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> alarmActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(alarmActions.size());
        alarmActionsCopy.addAll(alarmActions);
        this.alarmActions = alarmActionsCopy;
    }
    
    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is
     * specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param alarmActions The list of actions to execute when this alarm transitions into an
     *         <code>ALARM</code> state from any other state. Each action is
     *         specified as an Amazon Resource Number (ARN). Currently the only
     *         action supported is publishing to an Amazon SNS topic or an Amazon
     *         Auto Scaling policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withAlarmActions(String... alarmActions) {
        if (getAlarmActions() == null) setAlarmActions(new java.util.ArrayList<String>(alarmActions.length));
        for (String value : alarmActions) {
            getAlarmActions().add(value);
        }
        return this;
    }
    
    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is
     * specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param alarmActions The list of actions to execute when this alarm transitions into an
     *         <code>ALARM</code> state from any other state. Each action is
     *         specified as an Amazon Resource Number (ARN). Currently the only
     *         action supported is publishing to an Amazon SNS topic or an Amazon
     *         Auto Scaling policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withAlarmActions(java.util.Collection<String> alarmActions) {
        if (alarmActions == null) {
            this.alarmActions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> alarmActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(alarmActions.size());
            alarmActionsCopy.addAll(alarmActions);
            this.alarmActions = alarmActionsCopy;
        }

        return this;
    }

    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action
     * is specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The list of actions to execute when this alarm transitions into an
     *         <code>INSUFFICIENT_DATA</code> state from any other state. Each action
     *         is specified as an Amazon Resource Number (ARN). Currently the only
     *         action supported is publishing to an Amazon SNS topic or an Amazon
     *         Auto Scaling policy.
     */
    public java.util.List<String> getInsufficientDataActions() {
        if (insufficientDataActions == null) {
              insufficientDataActions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              insufficientDataActions.setAutoConstruct(true);
        }
        return insufficientDataActions;
    }
    
    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action
     * is specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param insufficientDataActions The list of actions to execute when this alarm transitions into an
     *         <code>INSUFFICIENT_DATA</code> state from any other state. Each action
     *         is specified as an Amazon Resource Number (ARN). Currently the only
     *         action supported is publishing to an Amazon SNS topic or an Amazon
     *         Auto Scaling policy.
     */
    public void setInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        if (insufficientDataActions == null) {
            this.insufficientDataActions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> insufficientDataActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(insufficientDataActions.size());
        insufficientDataActionsCopy.addAll(insufficientDataActions);
        this.insufficientDataActions = insufficientDataActionsCopy;
    }
    
    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action
     * is specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param insufficientDataActions The list of actions to execute when this alarm transitions into an
     *         <code>INSUFFICIENT_DATA</code> state from any other state. Each action
     *         is specified as an Amazon Resource Number (ARN). Currently the only
     *         action supported is publishing to an Amazon SNS topic or an Amazon
     *         Auto Scaling policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withInsufficientDataActions(String... insufficientDataActions) {
        if (getInsufficientDataActions() == null) setInsufficientDataActions(new java.util.ArrayList<String>(insufficientDataActions.length));
        for (String value : insufficientDataActions) {
            getInsufficientDataActions().add(value);
        }
        return this;
    }
    
    /**
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action
     * is specified as an Amazon Resource Number (ARN). Currently the only
     * action supported is publishing to an Amazon SNS topic or an Amazon
     * Auto Scaling policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param insufficientDataActions The list of actions to execute when this alarm transitions into an
     *         <code>INSUFFICIENT_DATA</code> state from any other state. Each action
     *         is specified as an Amazon Resource Number (ARN). Currently the only
     *         action supported is publishing to an Amazon SNS topic or an Amazon
     *         Auto Scaling policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        if (insufficientDataActions == null) {
            this.insufficientDataActions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> insufficientDataActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(insufficientDataActions.size());
            insufficientDataActionsCopy.addAll(insufficientDataActions);
            this.insufficientDataActions = insufficientDataActionsCopy;
        }

        return this;
    }

    /**
     * The name for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name for the alarm's associated metric.
     */
    public String getMetricName() {
        return metricName;
    }
    
    /**
     * The name for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name for the alarm's associated metric.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    /**
     * The name for the alarm's associated metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name for the alarm's associated metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * The namespace for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return The namespace for the alarm's associated metric.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * The namespace for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace for the alarm's associated metric.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * The namespace for the alarm's associated metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The namespace for the alarm's associated metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * The statistic to apply to the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @return The statistic to apply to the alarm's associated metric.
     *
     * @see Statistic
     */
    public String getStatistic() {
        return statistic;
    }
    
    /**
     * The statistic to apply to the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic The statistic to apply to the alarm's associated metric.
     *
     * @see Statistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }
    
    /**
     * The statistic to apply to the alarm's associated metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic The statistic to apply to the alarm's associated metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Statistic
     */
    public PutMetricAlarmRequest withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * The statistic to apply to the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic The statistic to apply to the alarm's associated metric.
     *
     * @see Statistic
     */
    public void setStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
    }
    
    /**
     * The statistic to apply to the alarm's associated metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic The statistic to apply to the alarm's associated metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Statistic
     */
    public PutMetricAlarmRequest withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * The dimensions for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return The dimensions for the alarm's associated metric.
     */
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
              dimensions = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>();
              dimensions.setAutoConstruct(true);
        }
        return dimensions;
    }
    
    /**
     * The dimensions for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions The dimensions for the alarm's associated metric.
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>(dimensions.size());
        dimensionsCopy.addAll(dimensions);
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * The dimensions for the alarm's associated metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions The dimensions for the alarm's associated metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withDimensions(Dimension... dimensions) {
        if (getDimensions() == null) setDimensions(new java.util.ArrayList<Dimension>(dimensions.length));
        for (Dimension value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * The dimensions for the alarm's associated metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions The dimensions for the alarm's associated metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>(dimensions.size());
            dimensionsCopy.addAll(dimensions);
            this.dimensions = dimensionsCopy;
        }

        return this;
    }

    /**
     * The period in seconds over which the specified statistic is applied.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @return The period in seconds over which the specified statistic is applied.
     */
    public Integer getPeriod() {
        return period;
    }
    
    /**
     * The period in seconds over which the specified statistic is applied.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period The period in seconds over which the specified statistic is applied.
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }
    
    /**
     * The period in seconds over which the specified statistic is applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period The period in seconds over which the specified statistic is applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * The unit for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @return The unit for the alarm's associated metric.
     *
     * @see StandardUnit
     */
    public String getUnit() {
        return unit;
    }
    
    /**
     * The unit for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit for the alarm's associated metric.
     *
     * @see StandardUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * The unit for the alarm's associated metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit for the alarm's associated metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StandardUnit
     */
    public PutMetricAlarmRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * The unit for the alarm's associated metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit for the alarm's associated metric.
     *
     * @see StandardUnit
     */
    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }
    
    /**
     * The unit for the alarm's associated metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit for the alarm's associated metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StandardUnit
     */
    public PutMetricAlarmRequest withUnit(StandardUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * The number of periods over which data is compared to the specified
     * threshold.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The number of periods over which data is compared to the specified
     *         threshold.
     */
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }
    
    /**
     * The number of periods over which data is compared to the specified
     * threshold.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     *         threshold.
     */
    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }
    
    /**
     * The number of periods over which data is compared to the specified
     * threshold.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param evaluationPeriods The number of periods over which data is compared to the specified
     *         threshold.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }

    /**
     * The value against which the specified statistic is compared.
     *
     * @return The value against which the specified statistic is compared.
     */
    public Double getThreshold() {
        return threshold;
    }
    
    /**
     * The value against which the specified statistic is compared.
     *
     * @param threshold The value against which the specified statistic is compared.
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }
    
    /**
     * The value against which the specified statistic is compared.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param threshold The value against which the specified statistic is compared.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutMetricAlarmRequest withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @return The arithmetic operation to use when comparing the specified
     *         <code>Statistic</code> and <code>Threshold</code>. The specified
     *         <code>Statistic</code> value is used as the first operand.
     *
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }
    
    /**
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     *         <code>Statistic</code> and <code>Threshold</code>. The specified
     *         <code>Statistic</code> value is used as the first operand.
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }
    
    /**
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     *         <code>Statistic</code> and <code>Threshold</code>. The specified
     *         <code>Statistic</code> value is used as the first operand.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ComparisonOperator
     */
    public PutMetricAlarmRequest withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     *         <code>Statistic</code> and <code>Threshold</code>. The specified
     *         <code>Statistic</code> value is used as the first operand.
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }
    
    /**
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator The arithmetic operation to use when comparing the specified
     *         <code>Statistic</code> and <code>Threshold</code>. The specified
     *         <code>Statistic</code> value is used as the first operand.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ComparisonOperator
     */
    public PutMetricAlarmRequest withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAlarmName() != null) sb.append("AlarmName: " + getAlarmName() + ",");
        if (getAlarmDescription() != null) sb.append("AlarmDescription: " + getAlarmDescription() + ",");
        if (isActionsEnabled() != null) sb.append("ActionsEnabled: " + isActionsEnabled() + ",");
        if (getOKActions() != null) sb.append("OKActions: " + getOKActions() + ",");
        if (getAlarmActions() != null) sb.append("AlarmActions: " + getAlarmActions() + ",");
        if (getInsufficientDataActions() != null) sb.append("InsufficientDataActions: " + getInsufficientDataActions() + ",");
        if (getMetricName() != null) sb.append("MetricName: " + getMetricName() + ",");
        if (getNamespace() != null) sb.append("Namespace: " + getNamespace() + ",");
        if (getStatistic() != null) sb.append("Statistic: " + getStatistic() + ",");
        if (getDimensions() != null) sb.append("Dimensions: " + getDimensions() + ",");
        if (getPeriod() != null) sb.append("Period: " + getPeriod() + ",");
        if (getUnit() != null) sb.append("Unit: " + getUnit() + ",");
        if (getEvaluationPeriods() != null) sb.append("EvaluationPeriods: " + getEvaluationPeriods() + ",");
        if (getThreshold() != null) sb.append("Threshold: " + getThreshold() + ",");
        if (getComparisonOperator() != null) sb.append("ComparisonOperator: " + getComparisonOperator() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode()); 
        hashCode = prime * hashCode + ((getAlarmDescription() == null) ? 0 : getAlarmDescription().hashCode()); 
        hashCode = prime * hashCode + ((isActionsEnabled() == null) ? 0 : isActionsEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getOKActions() == null) ? 0 : getOKActions().hashCode()); 
        hashCode = prime * hashCode + ((getAlarmActions() == null) ? 0 : getAlarmActions().hashCode()); 
        hashCode = prime * hashCode + ((getInsufficientDataActions() == null) ? 0 : getInsufficientDataActions().hashCode()); 
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode()); 
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode()); 
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode()); 
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode()); 
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode()); 
        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode()); 
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode()); 
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutMetricAlarmRequest == false) return false;
        PutMetricAlarmRequest other = (PutMetricAlarmRequest)obj;
        
        if (other.getAlarmName() == null ^ this.getAlarmName() == null) return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false) return false; 
        if (other.getAlarmDescription() == null ^ this.getAlarmDescription() == null) return false;
        if (other.getAlarmDescription() != null && other.getAlarmDescription().equals(this.getAlarmDescription()) == false) return false; 
        if (other.isActionsEnabled() == null ^ this.isActionsEnabled() == null) return false;
        if (other.isActionsEnabled() != null && other.isActionsEnabled().equals(this.isActionsEnabled()) == false) return false; 
        if (other.getOKActions() == null ^ this.getOKActions() == null) return false;
        if (other.getOKActions() != null && other.getOKActions().equals(this.getOKActions()) == false) return false; 
        if (other.getAlarmActions() == null ^ this.getAlarmActions() == null) return false;
        if (other.getAlarmActions() != null && other.getAlarmActions().equals(this.getAlarmActions()) == false) return false; 
        if (other.getInsufficientDataActions() == null ^ this.getInsufficientDataActions() == null) return false;
        if (other.getInsufficientDataActions() != null && other.getInsufficientDataActions().equals(this.getInsufficientDataActions()) == false) return false; 
        if (other.getMetricName() == null ^ this.getMetricName() == null) return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false) return false; 
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false; 
        if (other.getStatistic() == null ^ this.getStatistic() == null) return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false) return false; 
        if (other.getDimensions() == null ^ this.getDimensions() == null) return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false) return false; 
        if (other.getPeriod() == null ^ this.getPeriod() == null) return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false) return false; 
        if (other.getUnit() == null ^ this.getUnit() == null) return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false) return false; 
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null) return false;
        if (other.getEvaluationPeriods() != null && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false) return false; 
        if (other.getThreshold() == null ^ this.getThreshold() == null) return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false) return false; 
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null) return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false) return false; 
        return true;
    }
    
}
    
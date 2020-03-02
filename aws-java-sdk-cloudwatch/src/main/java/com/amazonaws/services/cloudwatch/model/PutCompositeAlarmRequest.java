/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutCompositeAlarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutCompositeAlarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. The
     * default is <code>TRUE</code>.
     * </p>
     */
    private Boolean actionsEnabled;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmActions;
    /**
     * <p>
     * The description for the composite alarm.
     * </p>
     */
    private String alarmDescription;
    /**
     * <p>
     * The name for the composite alarm. This name must be unique within your AWS account.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state.
     * For each alarm that you reference, you designate a function that specifies whether that alarm needs to be in
     * ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT) to combine multiple
     * functions in a single expression. You can use parenthesis to logically group the functions in your expression.
     * </p>
     * <p>
     * You can use either alarm names or ARNs to reference the other alarms that are to be evaluated.
     * </p>
     * <p>
     * Functions can include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in ALARM state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in OK state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in
     * INSUFFICIENT_DATA state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE</code> always evaluates to TRUE.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE</code> always evaluates to FALSE.
     * </p>
     * </li>
     * </ul>
     * <p>
     * TRUE and FALSE are useful for testing a complex <code>AlarmRule</code> structure, and for testing your alarm
     * actions.
     * </p>
     * <p>
     * Alarm names specified in <code>AlarmRule</code> can be surrounded with double-quotes ("), but do not have to be.
     * </p>
     * <p>
     * The following are some examples of <code>AlarmRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh)</code> specifies that the composite alarm goes
     * into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress)</code> specifies that the alarm goes to
     * ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM state. This
     * example reduces alarm noise during a known deployment window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh)</code> goes into
     * ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if NetworkOutTooHigh is in OK
     * state. This provides another example of using a composite alarm to prevent noise. This rule ensures that you are
     * not notified with an alarm action on high CPU or disk usage if a known network problem is also occurring.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>AlarmRule</code> can specify as many as 100 "children" alarms. The <code>AlarmRule</code> expression
     * can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and parentheses.
     * </p>
     */
    private String alarmRule;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> insufficientDataActions;
    /**
     * <p>
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> oKActions;
    /**
     * <p>
     * A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with an
     * alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. The
     * default is <code>TRUE</code>.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether actions should be executed during any changes to the alarm state of the composite alarm.
     *        The default is <code>TRUE</code>.
     */

    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. The
     * default is <code>TRUE</code>.
     * </p>
     * 
     * @return Indicates whether actions should be executed during any changes to the alarm state of the composite
     *         alarm. The default is <code>TRUE</code>.
     */

    public Boolean getActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. The
     * default is <code>TRUE</code>.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether actions should be executed during any changes to the alarm state of the composite alarm.
     *        The default is <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withActionsEnabled(Boolean actionsEnabled) {
        setActionsEnabled(actionsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. The
     * default is <code>TRUE</code>.
     * </p>
     * 
     * @return Indicates whether actions should be executed during any changes to the alarm state of the composite
     *         alarm. The default is <code>TRUE</code>.
     */

    public Boolean isActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *         Each action is specified as an Amazon Resource Name (ARN).</p>
     *         <p>
     *         Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     */

    public java.util.List<String> getAlarmActions() {
        if (alarmActions == null) {
            alarmActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     */

    public void setAlarmActions(java.util.Collection<String> alarmActions) {
        if (alarmActions == null) {
            this.alarmActions = null;
            return;
        }

        this.alarmActions = new com.amazonaws.internal.SdkInternalList<String>(alarmActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmActions(java.util.Collection)} or {@link #withAlarmActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withAlarmActions(String... alarmActions) {
        if (this.alarmActions == null) {
            setAlarmActions(new com.amazonaws.internal.SdkInternalList<String>(alarmActions.length));
        }
        for (String ele : alarmActions) {
            this.alarmActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withAlarmActions(java.util.Collection<String> alarmActions) {
        setAlarmActions(alarmActions);
        return this;
    }

    /**
     * <p>
     * The description for the composite alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description for the composite alarm.
     */

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    /**
     * <p>
     * The description for the composite alarm.
     * </p>
     * 
     * @return The description for the composite alarm.
     */

    public String getAlarmDescription() {
        return this.alarmDescription;
    }

    /**
     * <p>
     * The description for the composite alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description for the composite alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withAlarmDescription(String alarmDescription) {
        setAlarmDescription(alarmDescription);
        return this;
    }

    /**
     * <p>
     * The name for the composite alarm. This name must be unique within your AWS account.
     * </p>
     * 
     * @param alarmName
     *        The name for the composite alarm. This name must be unique within your AWS account.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name for the composite alarm. This name must be unique within your AWS account.
     * </p>
     * 
     * @return The name for the composite alarm. This name must be unique within your AWS account.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The name for the composite alarm. This name must be unique within your AWS account.
     * </p>
     * 
     * @param alarmName
     *        The name for the composite alarm. This name must be unique within your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state.
     * For each alarm that you reference, you designate a function that specifies whether that alarm needs to be in
     * ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT) to combine multiple
     * functions in a single expression. You can use parenthesis to logically group the functions in your expression.
     * </p>
     * <p>
     * You can use either alarm names or ARNs to reference the other alarms that are to be evaluated.
     * </p>
     * <p>
     * Functions can include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in ALARM state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in OK state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in
     * INSUFFICIENT_DATA state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE</code> always evaluates to TRUE.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE</code> always evaluates to FALSE.
     * </p>
     * </li>
     * </ul>
     * <p>
     * TRUE and FALSE are useful for testing a complex <code>AlarmRule</code> structure, and for testing your alarm
     * actions.
     * </p>
     * <p>
     * Alarm names specified in <code>AlarmRule</code> can be surrounded with double-quotes ("), but do not have to be.
     * </p>
     * <p>
     * The following are some examples of <code>AlarmRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh)</code> specifies that the composite alarm goes
     * into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress)</code> specifies that the alarm goes to
     * ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM state. This
     * example reduces alarm noise during a known deployment window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh)</code> goes into
     * ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if NetworkOutTooHigh is in OK
     * state. This provides another example of using a composite alarm to prevent noise. This rule ensures that you are
     * not notified with an alarm action on high CPU or disk usage if a known network problem is also occurring.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>AlarmRule</code> can specify as many as 100 "children" alarms. The <code>AlarmRule</code> expression
     * can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and parentheses.
     * </p>
     * 
     * @param alarmRule
     *        An expression that specifies which other alarms are to be evaluated to determine this composite alarm's
     *        state. For each alarm that you reference, you designate a function that specifies whether that alarm needs
     *        to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT) to
     *        combine multiple functions in a single expression. You can use parenthesis to logically group the
     *        functions in your expression.</p>
     *        <p>
     *        You can use either alarm names or ARNs to reference the other alarms that are to be evaluated.
     *        </p>
     *        <p>
     *        Functions can include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in ALARM state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OK("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in OK state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in
     *        INSUFFICIENT_DATA state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRUE</code> always evaluates to TRUE.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FALSE</code> always evaluates to FALSE.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        TRUE and FALSE are useful for testing a complex <code>AlarmRule</code> structure, and for testing your
     *        alarm actions.
     *        </p>
     *        <p>
     *        Alarm names specified in <code>AlarmRule</code> can be surrounded with double-quotes ("), but do not have
     *        to be.
     *        </p>
     *        <p>
     *        The following are some examples of <code>AlarmRule</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh)</code> specifies that the composite alarm
     *        goes into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress)</code> specifies that the alarm
     *        goes to ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM
     *        state. This example reduces alarm noise during a known deployment window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>(ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh)</code> goes
     *        into ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if
     *        NetworkOutTooHigh is in OK state. This provides another example of using a composite alarm to prevent
     *        noise. This rule ensures that you are not notified with an alarm action on high CPU or disk usage if a
     *        known network problem is also occurring.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>AlarmRule</code> can specify as many as 100 "children" alarms. The <code>AlarmRule</code>
     *        expression can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and
     *        parentheses.
     */

    public void setAlarmRule(String alarmRule) {
        this.alarmRule = alarmRule;
    }

    /**
     * <p>
     * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state.
     * For each alarm that you reference, you designate a function that specifies whether that alarm needs to be in
     * ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT) to combine multiple
     * functions in a single expression. You can use parenthesis to logically group the functions in your expression.
     * </p>
     * <p>
     * You can use either alarm names or ARNs to reference the other alarms that are to be evaluated.
     * </p>
     * <p>
     * Functions can include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in ALARM state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in OK state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in
     * INSUFFICIENT_DATA state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE</code> always evaluates to TRUE.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE</code> always evaluates to FALSE.
     * </p>
     * </li>
     * </ul>
     * <p>
     * TRUE and FALSE are useful for testing a complex <code>AlarmRule</code> structure, and for testing your alarm
     * actions.
     * </p>
     * <p>
     * Alarm names specified in <code>AlarmRule</code> can be surrounded with double-quotes ("), but do not have to be.
     * </p>
     * <p>
     * The following are some examples of <code>AlarmRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh)</code> specifies that the composite alarm goes
     * into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress)</code> specifies that the alarm goes to
     * ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM state. This
     * example reduces alarm noise during a known deployment window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh)</code> goes into
     * ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if NetworkOutTooHigh is in OK
     * state. This provides another example of using a composite alarm to prevent noise. This rule ensures that you are
     * not notified with an alarm action on high CPU or disk usage if a known network problem is also occurring.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>AlarmRule</code> can specify as many as 100 "children" alarms. The <code>AlarmRule</code> expression
     * can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and parentheses.
     * </p>
     * 
     * @return An expression that specifies which other alarms are to be evaluated to determine this composite alarm's
     *         state. For each alarm that you reference, you designate a function that specifies whether that alarm
     *         needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT)
     *         to combine multiple functions in a single expression. You can use parenthesis to logically group the
     *         functions in your expression.</p>
     *         <p>
     *         You can use either alarm names or ARNs to reference the other alarms that are to be evaluated.
     *         </p>
     *         <p>
     *         Functions can include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALARM("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in ALARM state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OK("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in OK state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_DATA("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in
     *         INSUFFICIENT_DATA state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRUE</code> always evaluates to TRUE.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FALSE</code> always evaluates to FALSE.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         TRUE and FALSE are useful for testing a complex <code>AlarmRule</code> structure, and for testing your
     *         alarm actions.
     *         </p>
     *         <p>
     *         Alarm names specified in <code>AlarmRule</code> can be surrounded with double-quotes ("), but do not have
     *         to be.
     *         </p>
     *         <p>
     *         The following are some examples of <code>AlarmRule</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh)</code> specifies that the composite
     *         alarm goes into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM
     *         state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress)</code> specifies that the alarm
     *         goes to ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM
     *         state. This example reduces alarm noise during a known deployment window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>(ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh)</code> goes
     *         into ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if
     *         NetworkOutTooHigh is in OK state. This provides another example of using a composite alarm to prevent
     *         noise. This rule ensures that you are not notified with an alarm action on high CPU or disk usage if a
     *         known network problem is also occurring.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The <code>AlarmRule</code> can specify as many as 100 "children" alarms. The <code>AlarmRule</code>
     *         expression can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and
     *         parentheses.
     */

    public String getAlarmRule() {
        return this.alarmRule;
    }

    /**
     * <p>
     * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state.
     * For each alarm that you reference, you designate a function that specifies whether that alarm needs to be in
     * ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT) to combine multiple
     * functions in a single expression. You can use parenthesis to logically group the functions in your expression.
     * </p>
     * <p>
     * You can use either alarm names or ARNs to reference the other alarms that are to be evaluated.
     * </p>
     * <p>
     * Functions can include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in ALARM state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in OK state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in
     * INSUFFICIENT_DATA state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE</code> always evaluates to TRUE.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE</code> always evaluates to FALSE.
     * </p>
     * </li>
     * </ul>
     * <p>
     * TRUE and FALSE are useful for testing a complex <code>AlarmRule</code> structure, and for testing your alarm
     * actions.
     * </p>
     * <p>
     * Alarm names specified in <code>AlarmRule</code> can be surrounded with double-quotes ("), but do not have to be.
     * </p>
     * <p>
     * The following are some examples of <code>AlarmRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh)</code> specifies that the composite alarm goes
     * into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress)</code> specifies that the alarm goes to
     * ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM state. This
     * example reduces alarm noise during a known deployment window.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh)</code> goes into
     * ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if NetworkOutTooHigh is in OK
     * state. This provides another example of using a composite alarm to prevent noise. This rule ensures that you are
     * not notified with an alarm action on high CPU or disk usage if a known network problem is also occurring.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>AlarmRule</code> can specify as many as 100 "children" alarms. The <code>AlarmRule</code> expression
     * can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and parentheses.
     * </p>
     * 
     * @param alarmRule
     *        An expression that specifies which other alarms are to be evaluated to determine this composite alarm's
     *        state. For each alarm that you reference, you designate a function that specifies whether that alarm needs
     *        to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT) to
     *        combine multiple functions in a single expression. You can use parenthesis to logically group the
     *        functions in your expression.</p>
     *        <p>
     *        You can use either alarm names or ARNs to reference the other alarms that are to be evaluated.
     *        </p>
     *        <p>
     *        Functions can include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in ALARM state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OK("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in OK state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA("<i>alarm-name</i> or <i>alarm-ARN</i>")</code> is TRUE if the named alarm is in
     *        INSUFFICIENT_DATA state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRUE</code> always evaluates to TRUE.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FALSE</code> always evaluates to FALSE.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        TRUE and FALSE are useful for testing a complex <code>AlarmRule</code> structure, and for testing your
     *        alarm actions.
     *        </p>
     *        <p>
     *        Alarm names specified in <code>AlarmRule</code> can be surrounded with double-quotes ("), but do not have
     *        to be.
     *        </p>
     *        <p>
     *        The following are some examples of <code>AlarmRule</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh)</code> specifies that the composite alarm
     *        goes into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress)</code> specifies that the alarm
     *        goes to ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM
     *        state. This example reduces alarm noise during a known deployment window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>(ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh)</code> goes
     *        into ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if
     *        NetworkOutTooHigh is in OK state. This provides another example of using a composite alarm to prevent
     *        noise. This rule ensures that you are not notified with an alarm action on high CPU or disk usage if a
     *        known network problem is also occurring.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>AlarmRule</code> can specify as many as 100 "children" alarms. The <code>AlarmRule</code>
     *        expression can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and
     *        parentheses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withAlarmRule(String alarmRule) {
        setAlarmRule(alarmRule);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *         other state. Each action is specified as an Amazon Resource Name (ARN).</p>
     *         <p>
     *         Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     */

    public java.util.List<String> getInsufficientDataActions() {
        if (insufficientDataActions == null) {
            insufficientDataActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return insufficientDataActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     */

    public void setInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        if (insufficientDataActions == null) {
            this.insufficientDataActions = null;
            return;
        }

        this.insufficientDataActions = new com.amazonaws.internal.SdkInternalList<String>(insufficientDataActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsufficientDataActions(java.util.Collection)} or
     * {@link #withInsufficientDataActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withInsufficientDataActions(String... insufficientDataActions) {
        if (this.insufficientDataActions == null) {
            setInsufficientDataActions(new com.amazonaws.internal.SdkInternalList<String>(insufficientDataActions.length));
        }
        for (String ele : insufficientDataActions) {
            this.insufficientDataActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        setInsufficientDataActions(insufficientDataActions);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each
     *         action is specified as an Amazon Resource Name (ARN).</p>
     *         <p>
     *         Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     */

    public java.util.List<String> getOKActions() {
        if (oKActions == null) {
            oKActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return oKActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     */

    public void setOKActions(java.util.Collection<String> oKActions) {
        if (oKActions == null) {
            this.oKActions = null;
            return;
        }

        this.oKActions = new com.amazonaws.internal.SdkInternalList<String>(oKActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOKActions(java.util.Collection)} or {@link #withOKActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withOKActions(String... oKActions) {
        if (this.oKActions == null) {
            setOKActions(new com.amazonaws.internal.SdkInternalList<String>(oKActions.length));
        }
        for (String ele : oKActions) {
            this.oKActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withOKActions(java.util.Collection<String> oKActions) {
        setOKActions(oKActions);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with an
     * alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @return A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags
     *         with an alarm.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user
     *         permissions, by granting a user permission to access or change only resources with certain tag values.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with an
     * alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with
     *        an alarm.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only resources with certain tag values.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with an
     * alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with
     *        an alarm.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only resources with certain tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with an
     * alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with
     *        an alarm.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only resources with certain tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCompositeAlarmRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getActionsEnabled() != null)
            sb.append("ActionsEnabled: ").append(getActionsEnabled()).append(",");
        if (getAlarmActions() != null)
            sb.append("AlarmActions: ").append(getAlarmActions()).append(",");
        if (getAlarmDescription() != null)
            sb.append("AlarmDescription: ").append(getAlarmDescription()).append(",");
        if (getAlarmName() != null)
            sb.append("AlarmName: ").append(getAlarmName()).append(",");
        if (getAlarmRule() != null)
            sb.append("AlarmRule: ").append(getAlarmRule()).append(",");
        if (getInsufficientDataActions() != null)
            sb.append("InsufficientDataActions: ").append(getInsufficientDataActions()).append(",");
        if (getOKActions() != null)
            sb.append("OKActions: ").append(getOKActions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutCompositeAlarmRequest == false)
            return false;
        PutCompositeAlarmRequest other = (PutCompositeAlarmRequest) obj;
        if (other.getActionsEnabled() == null ^ this.getActionsEnabled() == null)
            return false;
        if (other.getActionsEnabled() != null && other.getActionsEnabled().equals(this.getActionsEnabled()) == false)
            return false;
        if (other.getAlarmActions() == null ^ this.getAlarmActions() == null)
            return false;
        if (other.getAlarmActions() != null && other.getAlarmActions().equals(this.getAlarmActions()) == false)
            return false;
        if (other.getAlarmDescription() == null ^ this.getAlarmDescription() == null)
            return false;
        if (other.getAlarmDescription() != null && other.getAlarmDescription().equals(this.getAlarmDescription()) == false)
            return false;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getAlarmRule() == null ^ this.getAlarmRule() == null)
            return false;
        if (other.getAlarmRule() != null && other.getAlarmRule().equals(this.getAlarmRule()) == false)
            return false;
        if (other.getInsufficientDataActions() == null ^ this.getInsufficientDataActions() == null)
            return false;
        if (other.getInsufficientDataActions() != null && other.getInsufficientDataActions().equals(this.getInsufficientDataActions()) == false)
            return false;
        if (other.getOKActions() == null ^ this.getOKActions() == null)
            return false;
        if (other.getOKActions() != null && other.getOKActions().equals(this.getOKActions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionsEnabled() == null) ? 0 : getActionsEnabled().hashCode());
        hashCode = prime * hashCode + ((getAlarmActions() == null) ? 0 : getAlarmActions().hashCode());
        hashCode = prime * hashCode + ((getAlarmDescription() == null) ? 0 : getAlarmDescription().hashCode());
        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getAlarmRule() == null) ? 0 : getAlarmRule().hashCode());
        hashCode = prime * hashCode + ((getInsufficientDataActions() == null) ? 0 : getInsufficientDataActions().hashCode());
        hashCode = prime * hashCode + ((getOKActions() == null) ? 0 : getOKActions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutCompositeAlarmRequest clone() {
        return (PutCompositeAlarmRequest) super.clone();
    }

}

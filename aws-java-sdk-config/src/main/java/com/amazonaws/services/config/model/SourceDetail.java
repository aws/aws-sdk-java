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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the source and the message types that trigger AWS Config to evaluate your AWS resources against a rule. It
 * also provides the frequency with which you want AWS Config to run evaluations for the rule if the trigger type is
 * periodic. You can specify the parameter values for <code>SourceDetail</code> only for custom rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SourceDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * </p>
     */
    private String eventSource;
    /**
     * <p>
     * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following
     * notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     * configuration item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers an
     * oversized configuration item. AWS Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     * <code>MaximumExecutionFrequency</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config delivers a
     * configuration snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for
     * <code>ConfigurationItemChangeNotification</code> and one for
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you
     * specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use the
     * <code>ScheduledNotification</code> value.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * <p>
     * Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you
     * choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     * <code>Three_Hours</code> is the frequency of this rule.
     * </p>
     * </note>
     */
    private String maximumExecutionFrequency;

    /**
     * <p>
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * </p>
     * 
     * @param eventSource
     *        The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * @see EventSource
     */

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * <p>
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * </p>
     * 
     * @return The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * @see EventSource
     */

    public String getEventSource() {
        return this.eventSource;
    }

    /**
     * <p>
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * </p>
     * 
     * @param eventSource
     *        The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSource
     */

    public SourceDetail withEventSource(String eventSource) {
        setEventSource(eventSource);
        return this;
    }

    /**
     * <p>
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * </p>
     * 
     * @param eventSource
     *        The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * @see EventSource
     */

    public void setEventSource(EventSource eventSource) {
        withEventSource(eventSource);
    }

    /**
     * <p>
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * </p>
     * 
     * @param eventSource
     *        The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSource
     */

    public SourceDetail withEventSource(EventSource eventSource) {
        this.eventSource = eventSource.toString();
        return this;
    }

    /**
     * <p>
     * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following
     * notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     * configuration item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers an
     * oversized configuration item. AWS Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     * <code>MaximumExecutionFrequency</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config delivers a
     * configuration snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for
     * <code>ConfigurationItemChangeNotification</code> and one for
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     * 
     * @param messageType
     *        The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the
     *        following notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     *        configuration item as a result of a resource change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config
     *        delivers an oversized configuration item. AWS Config may generate this notification type when a resource
     *        changes and the notification exceeds the maximum size allowed by Amazon SNS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     *        <code>MaximumExecutionFrequency</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config
     *        delivers a configuration snapshot.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects,
     *        one for <code>ConfigurationItemChangeNotification</code> and one for
     *        <code>OversizedConfigurationItemChangeNotification</code>.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following
     * notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     * configuration item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers an
     * oversized configuration item. AWS Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     * <code>MaximumExecutionFrequency</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config delivers a
     * configuration snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for
     * <code>ConfigurationItemChangeNotification</code> and one for
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     * 
     * @return The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the
     *         following notification types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     *         configuration item as a result of a resource change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config
     *         delivers an oversized configuration item. AWS Config may generate this notification type when a resource
     *         changes and the notification exceeds the maximum size allowed by Amazon SNS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     *         <code>MaximumExecutionFrequency</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config
     *         delivers a configuration snapshot.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects,
     *         one for <code>ConfigurationItemChangeNotification</code> and one for
     *         <code>OversizedConfigurationItemChangeNotification</code>.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following
     * notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     * configuration item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers an
     * oversized configuration item. AWS Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     * <code>MaximumExecutionFrequency</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config delivers a
     * configuration snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for
     * <code>ConfigurationItemChangeNotification</code> and one for
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     * 
     * @param messageType
     *        The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the
     *        following notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     *        configuration item as a result of a resource change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config
     *        delivers an oversized configuration item. AWS Config may generate this notification type when a resource
     *        changes and the notification exceeds the maximum size allowed by Amazon SNS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     *        <code>MaximumExecutionFrequency</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config
     *        delivers a configuration snapshot.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects,
     *        one for <code>ConfigurationItemChangeNotification</code> and one for
     *        <code>OversizedConfigurationItemChangeNotification</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SourceDetail withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following
     * notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     * configuration item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers an
     * oversized configuration item. AWS Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     * <code>MaximumExecutionFrequency</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config delivers a
     * configuration snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for
     * <code>ConfigurationItemChangeNotification</code> and one for
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     * 
     * @param messageType
     *        The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the
     *        following notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     *        configuration item as a result of a resource change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config
     *        delivers an oversized configuration item. AWS Config may generate this notification type when a resource
     *        changes and the notification exceeds the maximum size allowed by Amazon SNS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     *        <code>MaximumExecutionFrequency</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config
     *        delivers a configuration snapshot.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects,
     *        one for <code>ConfigurationItemChangeNotification</code> and one for
     *        <code>OversizedConfigurationItemChangeNotification</code>.
     * @see MessageType
     */

    public void setMessageType(MessageType messageType) {
        withMessageType(messageType);
    }

    /**
     * <p>
     * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following
     * notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     * configuration item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers an
     * oversized configuration item. AWS Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     * <code>MaximumExecutionFrequency</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config delivers a
     * configuration snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for
     * <code>ConfigurationItemChangeNotification</code> and one for
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     * 
     * @param messageType
     *        The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the
     *        following notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config delivers a
     *        configuration item as a result of a resource change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OversizedConfigurationItemChangeNotification</code> - Triggers an evaluation when AWS Config
     *        delivers an oversized configuration item. AWS Config may generate this notification type when a resource
     *        changes and the notification exceeds the maximum size allowed by Amazon SNS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledNotification</code> - Triggers a periodic evaluation at the frequency specified for
     *        <code>MaximumExecutionFrequency</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSnapshotDeliveryCompleted</code> - Triggers a periodic evaluation when AWS Config
     *        delivers a configuration snapshot.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects,
     *        one for <code>ConfigurationItemChangeNotification</code> and one for
     *        <code>OversizedConfigurationItemChangeNotification</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SourceDetail withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you
     * specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use the
     * <code>ScheduledNotification</code> value.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * <p>
     * Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you
     * choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     * <code>Three_Hours</code> is the frequency of this rule.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger.
     *        If you specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use
     *        the <code>ScheduledNotification</code> value.</p> <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     *        <p>
     *        Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example,
     *        if you choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     *        <code>Three_Hours</code> is the frequency of this rule.
     *        </p>
     * @see MaximumExecutionFrequency
     */

    public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    /**
     * <p>
     * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you
     * specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use the
     * <code>ScheduledNotification</code> value.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * <p>
     * Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you
     * choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     * <code>Three_Hours</code> is the frequency of this rule.
     * </p>
     * </note>
     * 
     * @return The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger.
     *         If you specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use
     *         the <code>ScheduledNotification</code> value.</p> <note>
     *         <p>
     *         By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify
     *         a valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *         </p>
     *         <p>
     *         Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example,
     *         if you choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     *         <code>Three_Hours</code> is the frequency of this rule.
     *         </p>
     * @see MaximumExecutionFrequency
     */

    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    /**
     * <p>
     * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you
     * specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use the
     * <code>ScheduledNotification</code> value.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * <p>
     * Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you
     * choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     * <code>Three_Hours</code> is the frequency of this rule.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger.
     *        If you specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use
     *        the <code>ScheduledNotification</code> value.</p> <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     *        <p>
     *        Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example,
     *        if you choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     *        <code>Three_Hours</code> is the frequency of this rule.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public SourceDetail withMaximumExecutionFrequency(String maximumExecutionFrequency) {
        setMaximumExecutionFrequency(maximumExecutionFrequency);
        return this;
    }

    /**
     * <p>
     * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you
     * specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use the
     * <code>ScheduledNotification</code> value.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * <p>
     * Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you
     * choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     * <code>Three_Hours</code> is the frequency of this rule.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger.
     *        If you specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use
     *        the <code>ScheduledNotification</code> value.</p> <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     *        <p>
     *        Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example,
     *        if you choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     *        <code>Three_Hours</code> is the frequency of this rule.
     *        </p>
     * @see MaximumExecutionFrequency
     */

    public void setMaximumExecutionFrequency(MaximumExecutionFrequency maximumExecutionFrequency) {
        withMaximumExecutionFrequency(maximumExecutionFrequency);
    }

    /**
     * <p>
     * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you
     * specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use the
     * <code>ScheduledNotification</code> value.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * <p>
     * Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you
     * choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     * <code>Three_Hours</code> is the frequency of this rule.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger.
     *        If you specify a value for <code>MaximumExecutionFrequency</code>, then <code>MessageType</code> must use
     *        the <code>ScheduledNotification</code> value.</p> <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     *        <p>
     *        Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example,
     *        if you choose <code>Three_Hours</code>, AWS Config runs evaluations once every three hours. In this case,
     *        <code>Three_Hours</code> is the frequency of this rule.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public SourceDetail withMaximumExecutionFrequency(MaximumExecutionFrequency maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency.toString();
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
        if (getEventSource() != null)
            sb.append("EventSource: ").append(getEventSource()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getMaximumExecutionFrequency() != null)
            sb.append("MaximumExecutionFrequency: ").append(getMaximumExecutionFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceDetail == false)
            return false;
        SourceDetail other = (SourceDetail) obj;
        if (other.getEventSource() == null ^ this.getEventSource() == null)
            return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getMaximumExecutionFrequency() == null ^ this.getMaximumExecutionFrequency() == null)
            return false;
        if (other.getMaximumExecutionFrequency() != null && other.getMaximumExecutionFrequency().equals(this.getMaximumExecutionFrequency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getMaximumExecutionFrequency() == null) ? 0 : getMaximumExecutionFrequency().hashCode());
        return hashCode;
    }

    @Override
    public SourceDetail clone() {
        try {
            return (SourceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.SourceDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

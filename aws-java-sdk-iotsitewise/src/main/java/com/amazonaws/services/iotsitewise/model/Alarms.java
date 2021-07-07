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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal. You can use the alarm
 * to monitor an asset property and get notified when the asset property value is outside a specified range. For more
 * information, see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html">Monitoring
 * with alarms</a> in the <i>IoT SiteWise Application Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Alarms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Alarms implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the IAM role
     * that allows the alarm to perform actions and access Amazon Web Services resources and services, such as IoT
     * Events.
     * </p>
     */
    private String alarmRoleArn;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the Lambda
     * function that manages alarm notifications. For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">Managing alarm
     * notifications</a> in the <i>IoT Events Developer Guide</i>.
     * </p>
     */
    private String notificationLambdaArn;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the IAM role
     * that allows the alarm to perform actions and access Amazon Web Services resources and services, such as IoT
     * Events.
     * </p>
     * 
     * @param alarmRoleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        IAM role that allows the alarm to perform actions and access Amazon Web Services resources and services,
     *        such as IoT Events.
     */

    public void setAlarmRoleArn(String alarmRoleArn) {
        this.alarmRoleArn = alarmRoleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the IAM role
     * that allows the alarm to perform actions and access Amazon Web Services resources and services, such as IoT
     * Events.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         IAM role that allows the alarm to perform actions and access Amazon Web Services resources and services,
     *         such as IoT Events.
     */

    public String getAlarmRoleArn() {
        return this.alarmRoleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the IAM role
     * that allows the alarm to perform actions and access Amazon Web Services resources and services, such as IoT
     * Events.
     * </p>
     * 
     * @param alarmRoleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        IAM role that allows the alarm to perform actions and access Amazon Web Services resources and services,
     *        such as IoT Events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarms withAlarmRoleArn(String alarmRoleArn) {
        setAlarmRoleArn(alarmRoleArn);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the Lambda
     * function that manages alarm notifications. For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">Managing alarm
     * notifications</a> in the <i>IoT Events Developer Guide</i>.
     * </p>
     * 
     * @param notificationLambdaArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        Lambda function that manages alarm notifications. For more information, see <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">Managing alarm
     *        notifications</a> in the <i>IoT Events Developer Guide</i>.
     */

    public void setNotificationLambdaArn(String notificationLambdaArn) {
        this.notificationLambdaArn = notificationLambdaArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the Lambda
     * function that manages alarm notifications. For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">Managing alarm
     * notifications</a> in the <i>IoT Events Developer Guide</i>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         Lambda function that manages alarm notifications. For more information, see <a
     *         href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">Managing alarm
     *         notifications</a> in the <i>IoT Events Developer Guide</i>.
     */

    public String getNotificationLambdaArn() {
        return this.notificationLambdaArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the Lambda
     * function that manages alarm notifications. For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">Managing alarm
     * notifications</a> in the <i>IoT Events Developer Guide</i>.
     * </p>
     * 
     * @param notificationLambdaArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        Lambda function that manages alarm notifications. For more information, see <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">Managing alarm
     *        notifications</a> in the <i>IoT Events Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarms withNotificationLambdaArn(String notificationLambdaArn) {
        setNotificationLambdaArn(notificationLambdaArn);
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
        if (getAlarmRoleArn() != null)
            sb.append("AlarmRoleArn: ").append(getAlarmRoleArn()).append(",");
        if (getNotificationLambdaArn() != null)
            sb.append("NotificationLambdaArn: ").append(getNotificationLambdaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alarms == false)
            return false;
        Alarms other = (Alarms) obj;
        if (other.getAlarmRoleArn() == null ^ this.getAlarmRoleArn() == null)
            return false;
        if (other.getAlarmRoleArn() != null && other.getAlarmRoleArn().equals(this.getAlarmRoleArn()) == false)
            return false;
        if (other.getNotificationLambdaArn() == null ^ this.getNotificationLambdaArn() == null)
            return false;
        if (other.getNotificationLambdaArn() != null && other.getNotificationLambdaArn().equals(this.getNotificationLambdaArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmRoleArn() == null) ? 0 : getAlarmRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNotificationLambdaArn() == null) ? 0 : getNotificationLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public Alarms clone() {
        try {
            return (Alarms) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AlarmsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

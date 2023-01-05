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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * One of the methods which provide a way for you to quickly identify when a deployment has failed, and then to
 * optionally roll back the failure to the last working deployment.
 * </p>
 * <p>
 * When the alarms are generated, Amazon ECS sets the service deployment to failed. Set the rollback parameter to have
 * Amazon ECS to roll back your service to the last completed deployment after a failure.
 * </p>
 * <p>
 * You can only use the <code>DeploymentAlarms</code> method to detect failures when the
 * <code>DeploymentController</code> is set to <code>ECS</code> (rolling update).
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html">Rolling update</a> in the
 * <i> <i>Amazon Elastic Container Service Developer Guide</i> </i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeploymentAlarms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentAlarms implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more CloudWatch alarm names. Use a "," to separate the alarms.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmNames;
    /**
     * <p>
     * Determines whether to use the CloudWatch alarm option in the service deployment process.
     * </p>
     */
    private Boolean enable;
    /**
     * <p>
     * Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If rollback is
     * used, when a service deployment fails, the service is rolled back to the last deployment that completed
     * successfully.
     * </p>
     */
    private Boolean rollback;

    /**
     * <p>
     * One or more CloudWatch alarm names. Use a "," to separate the alarms.
     * </p>
     * 
     * @return One or more CloudWatch alarm names. Use a "," to separate the alarms.
     */

    public java.util.List<String> getAlarmNames() {
        if (alarmNames == null) {
            alarmNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmNames;
    }

    /**
     * <p>
     * One or more CloudWatch alarm names. Use a "," to separate the alarms.
     * </p>
     * 
     * @param alarmNames
     *        One or more CloudWatch alarm names. Use a "," to separate the alarms.
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
     * One or more CloudWatch alarm names. Use a "," to separate the alarms.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmNames(java.util.Collection)} or {@link #withAlarmNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmNames
     *        One or more CloudWatch alarm names. Use a "," to separate the alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentAlarms withAlarmNames(String... alarmNames) {
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
     * One or more CloudWatch alarm names. Use a "," to separate the alarms.
     * </p>
     * 
     * @param alarmNames
     *        One or more CloudWatch alarm names. Use a "," to separate the alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentAlarms withAlarmNames(java.util.Collection<String> alarmNames) {
        setAlarmNames(alarmNames);
        return this;
    }

    /**
     * <p>
     * Determines whether to use the CloudWatch alarm option in the service deployment process.
     * </p>
     * 
     * @param enable
     *        Determines whether to use the CloudWatch alarm option in the service deployment process.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * Determines whether to use the CloudWatch alarm option in the service deployment process.
     * </p>
     * 
     * @return Determines whether to use the CloudWatch alarm option in the service deployment process.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * <p>
     * Determines whether to use the CloudWatch alarm option in the service deployment process.
     * </p>
     * 
     * @param enable
     *        Determines whether to use the CloudWatch alarm option in the service deployment process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentAlarms withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * <p>
     * Determines whether to use the CloudWatch alarm option in the service deployment process.
     * </p>
     * 
     * @return Determines whether to use the CloudWatch alarm option in the service deployment process.
     */

    public Boolean isEnable() {
        return this.enable;
    }

    /**
     * <p>
     * Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If rollback is
     * used, when a service deployment fails, the service is rolled back to the last deployment that completed
     * successfully.
     * </p>
     * 
     * @param rollback
     *        Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If
     *        rollback is used, when a service deployment fails, the service is rolled back to the last deployment that
     *        completed successfully.
     */

    public void setRollback(Boolean rollback) {
        this.rollback = rollback;
    }

    /**
     * <p>
     * Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If rollback is
     * used, when a service deployment fails, the service is rolled back to the last deployment that completed
     * successfully.
     * </p>
     * 
     * @return Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If
     *         rollback is used, when a service deployment fails, the service is rolled back to the last deployment that
     *         completed successfully.
     */

    public Boolean getRollback() {
        return this.rollback;
    }

    /**
     * <p>
     * Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If rollback is
     * used, when a service deployment fails, the service is rolled back to the last deployment that completed
     * successfully.
     * </p>
     * 
     * @param rollback
     *        Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If
     *        rollback is used, when a service deployment fails, the service is rolled back to the last deployment that
     *        completed successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentAlarms withRollback(Boolean rollback) {
        setRollback(rollback);
        return this;
    }

    /**
     * <p>
     * Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If rollback is
     * used, when a service deployment fails, the service is rolled back to the last deployment that completed
     * successfully.
     * </p>
     * 
     * @return Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If
     *         rollback is used, when a service deployment fails, the service is rolled back to the last deployment that
     *         completed successfully.
     */

    public Boolean isRollback() {
        return this.rollback;
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
        if (getEnable() != null)
            sb.append("Enable: ").append(getEnable()).append(",");
        if (getRollback() != null)
            sb.append("Rollback: ").append(getRollback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentAlarms == false)
            return false;
        DeploymentAlarms other = (DeploymentAlarms) obj;
        if (other.getAlarmNames() == null ^ this.getAlarmNames() == null)
            return false;
        if (other.getAlarmNames() != null && other.getAlarmNames().equals(this.getAlarmNames()) == false)
            return false;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        if (other.getRollback() == null ^ this.getRollback() == null)
            return false;
        if (other.getRollback() != null && other.getRollback().equals(this.getRollback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmNames() == null) ? 0 : getAlarmNames().hashCode());
        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        hashCode = prime * hashCode + ((getRollback() == null) ? 0 : getRollback().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentAlarms clone() {
        try {
            return (DeploymentAlarms) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.DeploymentAlarmsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a set of Amazon ECS tasks in an AWS CodeDeploy deployment. An Amazon ECS task set includes details
 * such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic.
 * An AWS CodeDeploy application that uses the Amazon ECS compute platform deploys a containerized application in an
 * Amazon ECS service as a task set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ECSTaskSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSTaskSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique ID of an <code>ECSTaskSet</code>.
     * </p>
     */
    private String identifer;
    /**
     * <p>
     * The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy
     * instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create. After
     * the updated task set is created, CodeDeploy shifts traffic to the new task set.
     * </p>
     */
    private Long desiredCount;
    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code> status during an Amazon ECS deployment.
     * A task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set enters
     * the <code>PENDING</code> status when it launches for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     */
    private Long pendingCount;
    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code> status during an Amazon ECS deployment.
     * A task in the <code>RUNNING</code> state is running and ready for use.
     * </p>
     */
    private Long runningCount;
    /**
     * <p>
     * The status of the task set. There are three valid task set statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIMARY</code>: Indicates the task set is serving production traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: Indicates the task set is not serving production traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAINING</code>: Indicates the tasks in the task set are being stopped and their corresponding targets are
     * being deregistered from their target group.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The percentage of traffic served by this task set.
     * </p>
     */
    private Double trafficWeight;
    /**
     * <p>
     * The target group associated with the task set. The target group is used by AWS CodeDeploy to manage traffic to a
     * task set.
     * </p>
     */
    private TargetGroupInfo targetGroup;
    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (<code>BLUE</code>) or a replacement
     * target (<code>GREEN</code>).
     * </p>
     */
    private String taskSetLabel;

    /**
     * <p>
     * A unique ID of an <code>ECSTaskSet</code>.
     * </p>
     * 
     * @param identifer
     *        A unique ID of an <code>ECSTaskSet</code>.
     */

    public void setIdentifer(String identifer) {
        this.identifer = identifer;
    }

    /**
     * <p>
     * A unique ID of an <code>ECSTaskSet</code>.
     * </p>
     * 
     * @return A unique ID of an <code>ECSTaskSet</code>.
     */

    public String getIdentifer() {
        return this.identifer;
    }

    /**
     * <p>
     * A unique ID of an <code>ECSTaskSet</code>.
     * </p>
     * 
     * @param identifer
     *        A unique ID of an <code>ECSTaskSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTaskSet withIdentifer(String identifer) {
        setIdentifer(identifer);
        return this;
    }

    /**
     * <p>
     * The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy
     * instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create. After
     * the updated task set is created, CodeDeploy shifts traffic to the new task set.
     * </p>
     * 
     * @param desiredCount
     *        The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy
     *        instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create.
     *        After the updated task set is created, CodeDeploy shifts traffic to the new task set.
     */

    public void setDesiredCount(Long desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy
     * instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create. After
     * the updated task set is created, CodeDeploy shifts traffic to the new task set.
     * </p>
     * 
     * @return The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy
     *         instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create.
     *         After the updated task set is created, CodeDeploy shifts traffic to the new task set.
     */

    public Long getDesiredCount() {
        return this.desiredCount;
    }

    /**
     * <p>
     * The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy
     * instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create. After
     * the updated task set is created, CodeDeploy shifts traffic to the new task set.
     * </p>
     * 
     * @param desiredCount
     *        The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy
     *        instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create.
     *        After the updated task set is created, CodeDeploy shifts traffic to the new task set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTaskSet withDesiredCount(Long desiredCount) {
        setDesiredCount(desiredCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code> status during an Amazon ECS deployment.
     * A task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set enters
     * the <code>PENDING</code> status when it launches for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the task set that are in the <code>PENDING</code> status during an Amazon ECS
     *        deployment. A task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state.
     *        A task set enters the <code>PENDING</code> status when it launches for the first time, or when it is
     *        restarted after being in the <code>STOPPED</code> state.
     */

    public void setPendingCount(Long pendingCount) {
        this.pendingCount = pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code> status during an Amazon ECS deployment.
     * A task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set enters
     * the <code>PENDING</code> status when it launches for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     * 
     * @return The number of tasks in the task set that are in the <code>PENDING</code> status during an Amazon ECS
     *         deployment. A task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code>
     *         state. A task set enters the <code>PENDING</code> status when it launches for the first time, or when it
     *         is restarted after being in the <code>STOPPED</code> state.
     */

    public Long getPendingCount() {
        return this.pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code> status during an Amazon ECS deployment.
     * A task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set enters
     * the <code>PENDING</code> status when it launches for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the task set that are in the <code>PENDING</code> status during an Amazon ECS
     *        deployment. A task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state.
     *        A task set enters the <code>PENDING</code> status when it launches for the first time, or when it is
     *        restarted after being in the <code>STOPPED</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTaskSet withPendingCount(Long pendingCount) {
        setPendingCount(pendingCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code> status during an Amazon ECS deployment.
     * A task in the <code>RUNNING</code> state is running and ready for use.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the task set that are in the <code>RUNNING</code> status during an Amazon ECS
     *        deployment. A task in the <code>RUNNING</code> state is running and ready for use.
     */

    public void setRunningCount(Long runningCount) {
        this.runningCount = runningCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code> status during an Amazon ECS deployment.
     * A task in the <code>RUNNING</code> state is running and ready for use.
     * </p>
     * 
     * @return The number of tasks in the task set that are in the <code>RUNNING</code> status during an Amazon ECS
     *         deployment. A task in the <code>RUNNING</code> state is running and ready for use.
     */

    public Long getRunningCount() {
        return this.runningCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code> status during an Amazon ECS deployment.
     * A task in the <code>RUNNING</code> state is running and ready for use.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the task set that are in the <code>RUNNING</code> status during an Amazon ECS
     *        deployment. A task in the <code>RUNNING</code> state is running and ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTaskSet withRunningCount(Long runningCount) {
        setRunningCount(runningCount);
        return this;
    }

    /**
     * <p>
     * The status of the task set. There are three valid task set statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIMARY</code>: Indicates the task set is serving production traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: Indicates the task set is not serving production traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAINING</code>: Indicates the tasks in the task set are being stopped and their corresponding targets are
     * being deregistered from their target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the task set. There are three valid task set statuses: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIMARY</code>: Indicates the task set is serving production traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>: Indicates the task set is not serving production traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DRAINING</code>: Indicates the tasks in the task set are being stopped and their corresponding
     *        targets are being deregistered from their target group.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task set. There are three valid task set statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIMARY</code>: Indicates the task set is serving production traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: Indicates the task set is not serving production traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAINING</code>: Indicates the tasks in the task set are being stopped and their corresponding targets are
     * being deregistered from their target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the task set. There are three valid task set statuses: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRIMARY</code>: Indicates the task set is serving production traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>: Indicates the task set is not serving production traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DRAINING</code>: Indicates the tasks in the task set are being stopped and their corresponding
     *         targets are being deregistered from their target group.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task set. There are three valid task set statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIMARY</code>: Indicates the task set is serving production traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: Indicates the task set is not serving production traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAINING</code>: Indicates the tasks in the task set are being stopped and their corresponding targets are
     * being deregistered from their target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the task set. There are three valid task set statuses: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIMARY</code>: Indicates the task set is serving production traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>: Indicates the task set is not serving production traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DRAINING</code>: Indicates the tasks in the task set are being stopped and their corresponding
     *        targets are being deregistered from their target group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTaskSet withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The percentage of traffic served by this task set.
     * </p>
     * 
     * @param trafficWeight
     *        The percentage of traffic served by this task set.
     */

    public void setTrafficWeight(Double trafficWeight) {
        this.trafficWeight = trafficWeight;
    }

    /**
     * <p>
     * The percentage of traffic served by this task set.
     * </p>
     * 
     * @return The percentage of traffic served by this task set.
     */

    public Double getTrafficWeight() {
        return this.trafficWeight;
    }

    /**
     * <p>
     * The percentage of traffic served by this task set.
     * </p>
     * 
     * @param trafficWeight
     *        The percentage of traffic served by this task set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTaskSet withTrafficWeight(Double trafficWeight) {
        setTrafficWeight(trafficWeight);
        return this;
    }

    /**
     * <p>
     * The target group associated with the task set. The target group is used by AWS CodeDeploy to manage traffic to a
     * task set.
     * </p>
     * 
     * @param targetGroup
     *        The target group associated with the task set. The target group is used by AWS CodeDeploy to manage
     *        traffic to a task set.
     */

    public void setTargetGroup(TargetGroupInfo targetGroup) {
        this.targetGroup = targetGroup;
    }

    /**
     * <p>
     * The target group associated with the task set. The target group is used by AWS CodeDeploy to manage traffic to a
     * task set.
     * </p>
     * 
     * @return The target group associated with the task set. The target group is used by AWS CodeDeploy to manage
     *         traffic to a task set.
     */

    public TargetGroupInfo getTargetGroup() {
        return this.targetGroup;
    }

    /**
     * <p>
     * The target group associated with the task set. The target group is used by AWS CodeDeploy to manage traffic to a
     * task set.
     * </p>
     * 
     * @param targetGroup
     *        The target group associated with the task set. The target group is used by AWS CodeDeploy to manage
     *        traffic to a task set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTaskSet withTargetGroup(TargetGroupInfo targetGroup) {
        setTargetGroup(targetGroup);
        return this;
    }

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (<code>BLUE</code>) or a replacement
     * target (<code>GREEN</code>).
     * </p>
     * 
     * @param taskSetLabel
     *        A label that identifies whether the ECS task set is an original target (<code>BLUE</code>) or a
     *        replacement target (<code>GREEN</code>).
     * @see TargetLabel
     */

    public void setTaskSetLabel(String taskSetLabel) {
        this.taskSetLabel = taskSetLabel;
    }

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (<code>BLUE</code>) or a replacement
     * target (<code>GREEN</code>).
     * </p>
     * 
     * @return A label that identifies whether the ECS task set is an original target (<code>BLUE</code>) or a
     *         replacement target (<code>GREEN</code>).
     * @see TargetLabel
     */

    public String getTaskSetLabel() {
        return this.taskSetLabel;
    }

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (<code>BLUE</code>) or a replacement
     * target (<code>GREEN</code>).
     * </p>
     * 
     * @param taskSetLabel
     *        A label that identifies whether the ECS task set is an original target (<code>BLUE</code>) or a
     *        replacement target (<code>GREEN</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetLabel
     */

    public ECSTaskSet withTaskSetLabel(String taskSetLabel) {
        setTaskSetLabel(taskSetLabel);
        return this;
    }

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (<code>BLUE</code>) or a replacement
     * target (<code>GREEN</code>).
     * </p>
     * 
     * @param taskSetLabel
     *        A label that identifies whether the ECS task set is an original target (<code>BLUE</code>) or a
     *        replacement target (<code>GREEN</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetLabel
     */

    public ECSTaskSet withTaskSetLabel(TargetLabel taskSetLabel) {
        this.taskSetLabel = taskSetLabel.toString();
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
        if (getIdentifer() != null)
            sb.append("Identifer: ").append(getIdentifer()).append(",");
        if (getDesiredCount() != null)
            sb.append("DesiredCount: ").append(getDesiredCount()).append(",");
        if (getPendingCount() != null)
            sb.append("PendingCount: ").append(getPendingCount()).append(",");
        if (getRunningCount() != null)
            sb.append("RunningCount: ").append(getRunningCount()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTrafficWeight() != null)
            sb.append("TrafficWeight: ").append(getTrafficWeight()).append(",");
        if (getTargetGroup() != null)
            sb.append("TargetGroup: ").append(getTargetGroup()).append(",");
        if (getTaskSetLabel() != null)
            sb.append("TaskSetLabel: ").append(getTaskSetLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSTaskSet == false)
            return false;
        ECSTaskSet other = (ECSTaskSet) obj;
        if (other.getIdentifer() == null ^ this.getIdentifer() == null)
            return false;
        if (other.getIdentifer() != null && other.getIdentifer().equals(this.getIdentifer()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getPendingCount() == null ^ this.getPendingCount() == null)
            return false;
        if (other.getPendingCount() != null && other.getPendingCount().equals(this.getPendingCount()) == false)
            return false;
        if (other.getRunningCount() == null ^ this.getRunningCount() == null)
            return false;
        if (other.getRunningCount() != null && other.getRunningCount().equals(this.getRunningCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTrafficWeight() == null ^ this.getTrafficWeight() == null)
            return false;
        if (other.getTrafficWeight() != null && other.getTrafficWeight().equals(this.getTrafficWeight()) == false)
            return false;
        if (other.getTargetGroup() == null ^ this.getTargetGroup() == null)
            return false;
        if (other.getTargetGroup() != null && other.getTargetGroup().equals(this.getTargetGroup()) == false)
            return false;
        if (other.getTaskSetLabel() == null ^ this.getTaskSetLabel() == null)
            return false;
        if (other.getTaskSetLabel() != null && other.getTaskSetLabel().equals(this.getTaskSetLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifer() == null) ? 0 : getIdentifer().hashCode());
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode());
        hashCode = prime * hashCode + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTrafficWeight() == null) ? 0 : getTrafficWeight().hashCode());
        hashCode = prime * hashCode + ((getTargetGroup() == null) ? 0 : getTargetGroup().hashCode());
        hashCode = prime * hashCode + ((getTaskSetLabel() == null) ? 0 : getTaskSetLabel().hashCode());
        return hashCode;
    }

    @Override
    public ECSTaskSet clone() {
        try {
            return (ECSTaskSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.ECSTaskSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

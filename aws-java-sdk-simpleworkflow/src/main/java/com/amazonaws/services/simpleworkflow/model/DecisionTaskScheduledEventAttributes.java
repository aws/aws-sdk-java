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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the <code>DecisionTaskScheduled</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DecisionTaskScheduledEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecisionTaskScheduledEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the task list in which the decision task was scheduled.
     * </p>
     */
    private TaskList taskList;
    /**
     * <p>
     * A task priority that, if set, specifies the priority for this decision task. Valid values are integers that range
     * from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher
     * numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     */
    private String taskPriority;
    /**
     * <p>
     * The maximum duration for this decision task. The task is considered timed out if it doesn't completed within this
     * duration.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String startToCloseTimeout;

    /**
     * <p>
     * The name of the task list in which the decision task was scheduled.
     * </p>
     * 
     * @param taskList
     *        The name of the task list in which the decision task was scheduled.
     */

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * <p>
     * The name of the task list in which the decision task was scheduled.
     * </p>
     * 
     * @return The name of the task list in which the decision task was scheduled.
     */

    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * <p>
     * The name of the task list in which the decision task was scheduled.
     * </p>
     * 
     * @param taskList
     *        The name of the task list in which the decision task was scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTaskScheduledEventAttributes withTaskList(TaskList taskList) {
        setTaskList(taskList);
        return this;
    }

    /**
     * <p>
     * A task priority that, if set, specifies the priority for this decision task. Valid values are integers that range
     * from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher
     * numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        A task priority that, if set, specifies the priority for this decision task. Valid values are integers
     *        that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code>
     *        (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     */

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    /**
     * <p>
     * A task priority that, if set, specifies the priority for this decision task. Valid values are integers that range
     * from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher
     * numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @return A task priority that, if set, specifies the priority for this decision task. Valid values are integers
     *         that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code>
     *         (2147483647). Higher numbers indicate higher priority.</p>
     *         <p>
     *         For more information about setting task priority, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *         Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     */

    public String getTaskPriority() {
        return this.taskPriority;
    }

    /**
     * <p>
     * A task priority that, if set, specifies the priority for this decision task. Valid values are integers that range
     * from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher
     * numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        A task priority that, if set, specifies the priority for this decision task. Valid values are integers
     *        that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code>
     *        (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTaskScheduledEventAttributes withTaskPriority(String taskPriority) {
        setTaskPriority(taskPriority);
        return this;
    }

    /**
     * <p>
     * The maximum duration for this decision task. The task is considered timed out if it doesn't completed within this
     * duration.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The maximum duration for this decision task. The task is considered timed out if it doesn't completed
     *        within this duration.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration for this decision task. The task is considered timed out if it doesn't completed within this
     * duration.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return The maximum duration for this decision task. The task is considered timed out if it doesn't completed
     *         within this duration.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getStartToCloseTimeout() {
        return this.startToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration for this decision task. The task is considered timed out if it doesn't completed within this
     * duration.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The maximum duration for this decision task. The task is considered timed out if it doesn't completed
     *        within this duration.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTaskScheduledEventAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        setStartToCloseTimeout(startToCloseTimeout);
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
        if (getTaskList() != null)
            sb.append("TaskList: ").append(getTaskList()).append(",");
        if (getTaskPriority() != null)
            sb.append("TaskPriority: ").append(getTaskPriority()).append(",");
        if (getStartToCloseTimeout() != null)
            sb.append("StartToCloseTimeout: ").append(getStartToCloseTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecisionTaskScheduledEventAttributes == false)
            return false;
        DecisionTaskScheduledEventAttributes other = (DecisionTaskScheduledEventAttributes) obj;
        if (other.getTaskList() == null ^ this.getTaskList() == null)
            return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false)
            return false;
        if (other.getTaskPriority() == null ^ this.getTaskPriority() == null)
            return false;
        if (other.getTaskPriority() != null && other.getTaskPriority().equals(this.getTaskPriority()) == false)
            return false;
        if (other.getStartToCloseTimeout() == null ^ this.getStartToCloseTimeout() == null)
            return false;
        if (other.getStartToCloseTimeout() != null && other.getStartToCloseTimeout().equals(this.getStartToCloseTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getStartToCloseTimeout() == null) ? 0 : getStartToCloseTimeout().hashCode());
        return hashCode;
    }

    @Override
    public DecisionTaskScheduledEventAttributes clone() {
        try {
            return (DecisionTaskScheduledEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.DecisionTaskScheduledEventAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the work to be performed by human workers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HumanLoopConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of a team of workers.
     * </p>
     */
    private String workteamArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     */
    private String humanTaskUiArn;
    /**
     * <p>
     * A title for the human worker task.
     * </p>
     */
    private String taskTitle;
    /**
     * <p>
     * A description for the human worker task.
     * </p>
     */
    private String taskDescription;
    /**
     * <p>
     * The number of distinct workers who will perform the same task on each object. For example, if
     * <code>TaskCount</code> is set to <code>3</code> for an image classification labeling job, three workers will
     * classify each input image. Increasing <code>TaskCount</code> can improve label accuracy.
     * </p>
     */
    private Integer taskCount;
    /**
     * <p>
     * The length of time that a task remains available for labeling by human workers.
     * </p>
     */
    private Integer taskAvailabilityLifetimeInSeconds;
    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     */
    private Integer taskTimeLimitInSeconds;
    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     */
    private java.util.List<String> taskKeywords;

    private PublicWorkforceTaskPrice publicWorkforceTaskPrice;

    /**
     * <p>
     * Amazon Resource Name (ARN) of a team of workers.
     * </p>
     * 
     * @param workteamArn
     *        Amazon Resource Name (ARN) of a team of workers.
     */

    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of a team of workers.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of a team of workers.
     */

    public String getWorkteamArn() {
        return this.workteamArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of a team of workers.
     * </p>
     * 
     * @param workteamArn
     *        Amazon Resource Name (ARN) of a team of workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withWorkteamArn(String workteamArn) {
        setWorkteamArn(workteamArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * 
     * @param humanTaskUiArn
     *        The Amazon Resource Name (ARN) of the human task user interface.
     */

    public void setHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the human task user interface.
     */

    public String getHumanTaskUiArn() {
        return this.humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * 
     * @param humanTaskUiArn
     *        The Amazon Resource Name (ARN) of the human task user interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withHumanTaskUiArn(String humanTaskUiArn) {
        setHumanTaskUiArn(humanTaskUiArn);
        return this;
    }

    /**
     * <p>
     * A title for the human worker task.
     * </p>
     * 
     * @param taskTitle
     *        A title for the human worker task.
     */

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    /**
     * <p>
     * A title for the human worker task.
     * </p>
     * 
     * @return A title for the human worker task.
     */

    public String getTaskTitle() {
        return this.taskTitle;
    }

    /**
     * <p>
     * A title for the human worker task.
     * </p>
     * 
     * @param taskTitle
     *        A title for the human worker task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withTaskTitle(String taskTitle) {
        setTaskTitle(taskTitle);
        return this;
    }

    /**
     * <p>
     * A description for the human worker task.
     * </p>
     * 
     * @param taskDescription
     *        A description for the human worker task.
     */

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * <p>
     * A description for the human worker task.
     * </p>
     * 
     * @return A description for the human worker task.
     */

    public String getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * <p>
     * A description for the human worker task.
     * </p>
     * 
     * @param taskDescription
     *        A description for the human worker task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withTaskDescription(String taskDescription) {
        setTaskDescription(taskDescription);
        return this;
    }

    /**
     * <p>
     * The number of distinct workers who will perform the same task on each object. For example, if
     * <code>TaskCount</code> is set to <code>3</code> for an image classification labeling job, three workers will
     * classify each input image. Increasing <code>TaskCount</code> can improve label accuracy.
     * </p>
     * 
     * @param taskCount
     *        The number of distinct workers who will perform the same task on each object. For example, if
     *        <code>TaskCount</code> is set to <code>3</code> for an image classification labeling job, three workers
     *        will classify each input image. Increasing <code>TaskCount</code> can improve label accuracy.
     */

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    /**
     * <p>
     * The number of distinct workers who will perform the same task on each object. For example, if
     * <code>TaskCount</code> is set to <code>3</code> for an image classification labeling job, three workers will
     * classify each input image. Increasing <code>TaskCount</code> can improve label accuracy.
     * </p>
     * 
     * @return The number of distinct workers who will perform the same task on each object. For example, if
     *         <code>TaskCount</code> is set to <code>3</code> for an image classification labeling job, three workers
     *         will classify each input image. Increasing <code>TaskCount</code> can improve label accuracy.
     */

    public Integer getTaskCount() {
        return this.taskCount;
    }

    /**
     * <p>
     * The number of distinct workers who will perform the same task on each object. For example, if
     * <code>TaskCount</code> is set to <code>3</code> for an image classification labeling job, three workers will
     * classify each input image. Increasing <code>TaskCount</code> can improve label accuracy.
     * </p>
     * 
     * @param taskCount
     *        The number of distinct workers who will perform the same task on each object. For example, if
     *        <code>TaskCount</code> is set to <code>3</code> for an image classification labeling job, three workers
     *        will classify each input image. Increasing <code>TaskCount</code> can improve label accuracy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withTaskCount(Integer taskCount) {
        setTaskCount(taskCount);
        return this;
    }

    /**
     * <p>
     * The length of time that a task remains available for labeling by human workers.
     * </p>
     * 
     * @param taskAvailabilityLifetimeInSeconds
     *        The length of time that a task remains available for labeling by human workers.
     */

    public void setTaskAvailabilityLifetimeInSeconds(Integer taskAvailabilityLifetimeInSeconds) {
        this.taskAvailabilityLifetimeInSeconds = taskAvailabilityLifetimeInSeconds;
    }

    /**
     * <p>
     * The length of time that a task remains available for labeling by human workers.
     * </p>
     * 
     * @return The length of time that a task remains available for labeling by human workers.
     */

    public Integer getTaskAvailabilityLifetimeInSeconds() {
        return this.taskAvailabilityLifetimeInSeconds;
    }

    /**
     * <p>
     * The length of time that a task remains available for labeling by human workers.
     * </p>
     * 
     * @param taskAvailabilityLifetimeInSeconds
     *        The length of time that a task remains available for labeling by human workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withTaskAvailabilityLifetimeInSeconds(Integer taskAvailabilityLifetimeInSeconds) {
        setTaskAvailabilityLifetimeInSeconds(taskAvailabilityLifetimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * 
     * @param taskTimeLimitInSeconds
     *        The amount of time that a worker has to complete a task.
     */

    public void setTaskTimeLimitInSeconds(Integer taskTimeLimitInSeconds) {
        this.taskTimeLimitInSeconds = taskTimeLimitInSeconds;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * 
     * @return The amount of time that a worker has to complete a task.
     */

    public Integer getTaskTimeLimitInSeconds() {
        return this.taskTimeLimitInSeconds;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * 
     * @param taskTimeLimitInSeconds
     *        The amount of time that a worker has to complete a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withTaskTimeLimitInSeconds(Integer taskTimeLimitInSeconds) {
        setTaskTimeLimitInSeconds(taskTimeLimitInSeconds);
        return this;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     * 
     * @return Keywords used to describe the task so that workers can discover the task.
     */

    public java.util.List<String> getTaskKeywords() {
        return taskKeywords;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     * 
     * @param taskKeywords
     *        Keywords used to describe the task so that workers can discover the task.
     */

    public void setTaskKeywords(java.util.Collection<String> taskKeywords) {
        if (taskKeywords == null) {
            this.taskKeywords = null;
            return;
        }

        this.taskKeywords = new java.util.ArrayList<String>(taskKeywords);
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskKeywords(java.util.Collection)} or {@link #withTaskKeywords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param taskKeywords
     *        Keywords used to describe the task so that workers can discover the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withTaskKeywords(String... taskKeywords) {
        if (this.taskKeywords == null) {
            setTaskKeywords(new java.util.ArrayList<String>(taskKeywords.length));
        }
        for (String ele : taskKeywords) {
            this.taskKeywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     * 
     * @param taskKeywords
     *        Keywords used to describe the task so that workers can discover the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withTaskKeywords(java.util.Collection<String> taskKeywords) {
        setTaskKeywords(taskKeywords);
        return this;
    }

    /**
     * @param publicWorkforceTaskPrice
     */

    public void setPublicWorkforceTaskPrice(PublicWorkforceTaskPrice publicWorkforceTaskPrice) {
        this.publicWorkforceTaskPrice = publicWorkforceTaskPrice;
    }

    /**
     * @return
     */

    public PublicWorkforceTaskPrice getPublicWorkforceTaskPrice() {
        return this.publicWorkforceTaskPrice;
    }

    /**
     * @param publicWorkforceTaskPrice
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withPublicWorkforceTaskPrice(PublicWorkforceTaskPrice publicWorkforceTaskPrice) {
        setPublicWorkforceTaskPrice(publicWorkforceTaskPrice);
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
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: ").append(getWorkteamArn()).append(",");
        if (getHumanTaskUiArn() != null)
            sb.append("HumanTaskUiArn: ").append(getHumanTaskUiArn()).append(",");
        if (getTaskTitle() != null)
            sb.append("TaskTitle: ").append(getTaskTitle()).append(",");
        if (getTaskDescription() != null)
            sb.append("TaskDescription: ").append(getTaskDescription()).append(",");
        if (getTaskCount() != null)
            sb.append("TaskCount: ").append(getTaskCount()).append(",");
        if (getTaskAvailabilityLifetimeInSeconds() != null)
            sb.append("TaskAvailabilityLifetimeInSeconds: ").append(getTaskAvailabilityLifetimeInSeconds()).append(",");
        if (getTaskTimeLimitInSeconds() != null)
            sb.append("TaskTimeLimitInSeconds: ").append(getTaskTimeLimitInSeconds()).append(",");
        if (getTaskKeywords() != null)
            sb.append("TaskKeywords: ").append(getTaskKeywords()).append(",");
        if (getPublicWorkforceTaskPrice() != null)
            sb.append("PublicWorkforceTaskPrice: ").append(getPublicWorkforceTaskPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopConfig == false)
            return false;
        HumanLoopConfig other = (HumanLoopConfig) obj;
        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getHumanTaskUiArn() == null ^ this.getHumanTaskUiArn() == null)
            return false;
        if (other.getHumanTaskUiArn() != null && other.getHumanTaskUiArn().equals(this.getHumanTaskUiArn()) == false)
            return false;
        if (other.getTaskTitle() == null ^ this.getTaskTitle() == null)
            return false;
        if (other.getTaskTitle() != null && other.getTaskTitle().equals(this.getTaskTitle()) == false)
            return false;
        if (other.getTaskDescription() == null ^ this.getTaskDescription() == null)
            return false;
        if (other.getTaskDescription() != null && other.getTaskDescription().equals(this.getTaskDescription()) == false)
            return false;
        if (other.getTaskCount() == null ^ this.getTaskCount() == null)
            return false;
        if (other.getTaskCount() != null && other.getTaskCount().equals(this.getTaskCount()) == false)
            return false;
        if (other.getTaskAvailabilityLifetimeInSeconds() == null ^ this.getTaskAvailabilityLifetimeInSeconds() == null)
            return false;
        if (other.getTaskAvailabilityLifetimeInSeconds() != null
                && other.getTaskAvailabilityLifetimeInSeconds().equals(this.getTaskAvailabilityLifetimeInSeconds()) == false)
            return false;
        if (other.getTaskTimeLimitInSeconds() == null ^ this.getTaskTimeLimitInSeconds() == null)
            return false;
        if (other.getTaskTimeLimitInSeconds() != null && other.getTaskTimeLimitInSeconds().equals(this.getTaskTimeLimitInSeconds()) == false)
            return false;
        if (other.getTaskKeywords() == null ^ this.getTaskKeywords() == null)
            return false;
        if (other.getTaskKeywords() != null && other.getTaskKeywords().equals(this.getTaskKeywords()) == false)
            return false;
        if (other.getPublicWorkforceTaskPrice() == null ^ this.getPublicWorkforceTaskPrice() == null)
            return false;
        if (other.getPublicWorkforceTaskPrice() != null && other.getPublicWorkforceTaskPrice().equals(this.getPublicWorkforceTaskPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode + ((getHumanTaskUiArn() == null) ? 0 : getHumanTaskUiArn().hashCode());
        hashCode = prime * hashCode + ((getTaskTitle() == null) ? 0 : getTaskTitle().hashCode());
        hashCode = prime * hashCode + ((getTaskDescription() == null) ? 0 : getTaskDescription().hashCode());
        hashCode = prime * hashCode + ((getTaskCount() == null) ? 0 : getTaskCount().hashCode());
        hashCode = prime * hashCode + ((getTaskAvailabilityLifetimeInSeconds() == null) ? 0 : getTaskAvailabilityLifetimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTaskTimeLimitInSeconds() == null) ? 0 : getTaskTimeLimitInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTaskKeywords() == null) ? 0 : getTaskKeywords().hashCode());
        hashCode = prime * hashCode + ((getPublicWorkforceTaskPrice() == null) ? 0 : getPublicWorkforceTaskPrice().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopConfig clone() {
        try {
            return (HumanLoopConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HumanLoopConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

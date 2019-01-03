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
 * Information about the target of an Amazon ECS deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ECSTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The unique ID of a deployment target that has a type of <code>ecsTarget</code>.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The ARN of the target.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The date and time when the target Amazon ECS application was updated by a deployment.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The lifecycle events of the deployment to this target Amazon ECS application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LifecycleEvent> lifecycleEvents;
    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ECSTaskSet> taskSetsInfo;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @return The unique ID of a deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTarget withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of <code>ecsTarget</code>.
     * </p>
     * 
     * @param targetId
     *        The unique ID of a deployment target that has a type of <code>ecsTarget</code>.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of <code>ecsTarget</code>.
     * </p>
     * 
     * @return The unique ID of a deployment target that has a type of <code>ecsTarget</code>.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of <code>ecsTarget</code>.
     * </p>
     * 
     * @param targetId
     *        The unique ID of a deployment target that has a type of <code>ecsTarget</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTarget withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The ARN of the target.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the target.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the target.
     * </p>
     * 
     * @return The ARN of the target.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of the target.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTarget withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The date and time when the target Amazon ECS application was updated by a deployment.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the target Amazon ECS application was updated by a deployment.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target Amazon ECS application was updated by a deployment.
     * </p>
     * 
     * @return The date and time when the target Amazon ECS application was updated by a deployment.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target Amazon ECS application was updated by a deployment.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the target Amazon ECS application was updated by a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTarget withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Amazon ECS application.
     * </p>
     * 
     * @return The lifecycle events of the deployment to this target Amazon ECS application.
     */

    public java.util.List<LifecycleEvent> getLifecycleEvents() {
        if (lifecycleEvents == null) {
            lifecycleEvents = new com.amazonaws.internal.SdkInternalList<LifecycleEvent>();
        }
        return lifecycleEvents;
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Amazon ECS application.
     * </p>
     * 
     * @param lifecycleEvents
     *        The lifecycle events of the deployment to this target Amazon ECS application.
     */

    public void setLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        if (lifecycleEvents == null) {
            this.lifecycleEvents = null;
            return;
        }

        this.lifecycleEvents = new com.amazonaws.internal.SdkInternalList<LifecycleEvent>(lifecycleEvents);
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Amazon ECS application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleEvents(java.util.Collection)} or {@link #withLifecycleEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lifecycleEvents
     *        The lifecycle events of the deployment to this target Amazon ECS application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTarget withLifecycleEvents(LifecycleEvent... lifecycleEvents) {
        if (this.lifecycleEvents == null) {
            setLifecycleEvents(new com.amazonaws.internal.SdkInternalList<LifecycleEvent>(lifecycleEvents.length));
        }
        for (LifecycleEvent ele : lifecycleEvents) {
            this.lifecycleEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Amazon ECS application.
     * </p>
     * 
     * @param lifecycleEvents
     *        The lifecycle events of the deployment to this target Amazon ECS application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTarget withLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        setLifecycleEvents(lifecycleEvents);
        return this;
    }

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
     * </p>
     * 
     * @param status
     *        The status an Amazon ECS deployment's target ECS application.
     * @see TargetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
     * </p>
     * 
     * @return The status an Amazon ECS deployment's target ECS application.
     * @see TargetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
     * </p>
     * 
     * @param status
     *        The status an Amazon ECS deployment's target ECS application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStatus
     */

    public ECSTarget withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
     * </p>
     * 
     * @param status
     *        The status an Amazon ECS deployment's target ECS application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStatus
     */

    public ECSTarget withStatus(TargetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     * 
     * @return The <code>ECSTaskSet</code> objects associated with the ECS target.
     */

    public java.util.List<ECSTaskSet> getTaskSetsInfo() {
        if (taskSetsInfo == null) {
            taskSetsInfo = new com.amazonaws.internal.SdkInternalList<ECSTaskSet>();
        }
        return taskSetsInfo;
    }

    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     * 
     * @param taskSetsInfo
     *        The <code>ECSTaskSet</code> objects associated with the ECS target.
     */

    public void setTaskSetsInfo(java.util.Collection<ECSTaskSet> taskSetsInfo) {
        if (taskSetsInfo == null) {
            this.taskSetsInfo = null;
            return;
        }

        this.taskSetsInfo = new com.amazonaws.internal.SdkInternalList<ECSTaskSet>(taskSetsInfo);
    }

    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskSetsInfo(java.util.Collection)} or {@link #withTaskSetsInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param taskSetsInfo
     *        The <code>ECSTaskSet</code> objects associated with the ECS target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTarget withTaskSetsInfo(ECSTaskSet... taskSetsInfo) {
        if (this.taskSetsInfo == null) {
            setTaskSetsInfo(new com.amazonaws.internal.SdkInternalList<ECSTaskSet>(taskSetsInfo.length));
        }
        for (ECSTaskSet ele : taskSetsInfo) {
            this.taskSetsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     * 
     * @param taskSetsInfo
     *        The <code>ECSTaskSet</code> objects associated with the ECS target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSTarget withTaskSetsInfo(java.util.Collection<ECSTaskSet> taskSetsInfo) {
        setTaskSetsInfo(taskSetsInfo);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getLifecycleEvents() != null)
            sb.append("LifecycleEvents: ").append(getLifecycleEvents()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTaskSetsInfo() != null)
            sb.append("TaskSetsInfo: ").append(getTaskSetsInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSTarget == false)
            return false;
        ECSTarget other = (ECSTarget) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getLifecycleEvents() == null ^ this.getLifecycleEvents() == null)
            return false;
        if (other.getLifecycleEvents() != null && other.getLifecycleEvents().equals(this.getLifecycleEvents()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTaskSetsInfo() == null ^ this.getTaskSetsInfo() == null)
            return false;
        if (other.getTaskSetsInfo() != null && other.getTaskSetsInfo().equals(this.getTaskSetsInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLifecycleEvents() == null) ? 0 : getLifecycleEvents().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskSetsInfo() == null) ? 0 : getTaskSetsInfo().hashCode());
        return hashCode;
    }

    @Override
    public ECSTarget clone() {
        try {
            return (ECSTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.ECSTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

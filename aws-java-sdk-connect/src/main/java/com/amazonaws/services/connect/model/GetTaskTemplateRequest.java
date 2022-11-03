/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTaskTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTaskTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     */
    private String taskTemplateId;
    /**
     * <p>
     * The system generated version of a task template that is associated with a task, when the task is created.
     * </p>
     */
    private String snapshotVersion;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTaskTemplateRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     * 
     * @param taskTemplateId
     *        A unique identifier for the task template.
     */

    public void setTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     * 
     * @return A unique identifier for the task template.
     */

    public String getTaskTemplateId() {
        return this.taskTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     * 
     * @param taskTemplateId
     *        A unique identifier for the task template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTaskTemplateRequest withTaskTemplateId(String taskTemplateId) {
        setTaskTemplateId(taskTemplateId);
        return this;
    }

    /**
     * <p>
     * The system generated version of a task template that is associated with a task, when the task is created.
     * </p>
     * 
     * @param snapshotVersion
     *        The system generated version of a task template that is associated with a task, when the task is created.
     */

    public void setSnapshotVersion(String snapshotVersion) {
        this.snapshotVersion = snapshotVersion;
    }

    /**
     * <p>
     * The system generated version of a task template that is associated with a task, when the task is created.
     * </p>
     * 
     * @return The system generated version of a task template that is associated with a task, when the task is created.
     */

    public String getSnapshotVersion() {
        return this.snapshotVersion;
    }

    /**
     * <p>
     * The system generated version of a task template that is associated with a task, when the task is created.
     * </p>
     * 
     * @param snapshotVersion
     *        The system generated version of a task template that is associated with a task, when the task is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTaskTemplateRequest withSnapshotVersion(String snapshotVersion) {
        setSnapshotVersion(snapshotVersion);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTaskTemplateId() != null)
            sb.append("TaskTemplateId: ").append(getTaskTemplateId()).append(",");
        if (getSnapshotVersion() != null)
            sb.append("SnapshotVersion: ").append(getSnapshotVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTaskTemplateRequest == false)
            return false;
        GetTaskTemplateRequest other = (GetTaskTemplateRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTaskTemplateId() == null ^ this.getTaskTemplateId() == null)
            return false;
        if (other.getTaskTemplateId() != null && other.getTaskTemplateId().equals(this.getTaskTemplateId()) == false)
            return false;
        if (other.getSnapshotVersion() == null ^ this.getSnapshotVersion() == null)
            return false;
        if (other.getSnapshotVersion() != null && other.getSnapshotVersion().equals(this.getSnapshotVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTaskTemplateId() == null) ? 0 : getTaskTemplateId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotVersion() == null) ? 0 : getSnapshotVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetTaskTemplateRequest clone() {
        return (GetTaskTemplateRequest) super.clone();
    }

}

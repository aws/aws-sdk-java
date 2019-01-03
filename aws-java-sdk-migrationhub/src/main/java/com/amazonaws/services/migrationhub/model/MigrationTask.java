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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a migration task in a migration tool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/MigrationTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrationTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A name that identifies the vendor of the migration tool being used.
     * </p>
     */
    private String progressUpdateStream;
    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     */
    private String migrationTaskName;
    /**
     * <p>
     * Task object encapsulating task information.
     * </p>
     */
    private Task task;
    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     */
    private java.util.Date updateDateTime;
    /** <p/> */
    private java.util.List<ResourceAttribute> resourceAttributeList;

    /**
     * <p>
     * A name that identifies the vendor of the migration tool being used.
     * </p>
     * 
     * @param progressUpdateStream
     *        A name that identifies the vendor of the migration tool being used.
     */

    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * A name that identifies the vendor of the migration tool being used.
     * </p>
     * 
     * @return A name that identifies the vendor of the migration tool being used.
     */

    public String getProgressUpdateStream() {
        return this.progressUpdateStream;
    }

    /**
     * <p>
     * A name that identifies the vendor of the migration tool being used.
     * </p>
     * 
     * @param progressUpdateStream
     *        A name that identifies the vendor of the migration tool being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTask withProgressUpdateStream(String progressUpdateStream) {
        setProgressUpdateStream(progressUpdateStream);
        return this;
    }

    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     * 
     * @param migrationTaskName
     *        Unique identifier that references the migration task.
     */

    public void setMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     * 
     * @return Unique identifier that references the migration task.
     */

    public String getMigrationTaskName() {
        return this.migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     * 
     * @param migrationTaskName
     *        Unique identifier that references the migration task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTask withMigrationTaskName(String migrationTaskName) {
        setMigrationTaskName(migrationTaskName);
        return this;
    }

    /**
     * <p>
     * Task object encapsulating task information.
     * </p>
     * 
     * @param task
     *        Task object encapsulating task information.
     */

    public void setTask(Task task) {
        this.task = task;
    }

    /**
     * <p>
     * Task object encapsulating task information.
     * </p>
     * 
     * @return Task object encapsulating task information.
     */

    public Task getTask() {
        return this.task;
    }

    /**
     * <p>
     * Task object encapsulating task information.
     * </p>
     * 
     * @param task
     *        Task object encapsulating task information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTask withTask(Task task) {
        setTask(task);
        return this;
    }

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     * 
     * @param updateDateTime
     *        The timestamp when the task was gathered.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     * 
     * @return The timestamp when the task was gathered.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     * 
     * @param updateDateTime
     *        The timestamp when the task was gathered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTask withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<ResourceAttribute> getResourceAttributeList() {
        return resourceAttributeList;
    }

    /**
     * <p/>
     * 
     * @param resourceAttributeList
     */

    public void setResourceAttributeList(java.util.Collection<ResourceAttribute> resourceAttributeList) {
        if (resourceAttributeList == null) {
            this.resourceAttributeList = null;
            return;
        }

        this.resourceAttributeList = new java.util.ArrayList<ResourceAttribute>(resourceAttributeList);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceAttributeList(java.util.Collection)} or
     * {@link #withResourceAttributeList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceAttributeList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTask withResourceAttributeList(ResourceAttribute... resourceAttributeList) {
        if (this.resourceAttributeList == null) {
            setResourceAttributeList(new java.util.ArrayList<ResourceAttribute>(resourceAttributeList.length));
        }
        for (ResourceAttribute ele : resourceAttributeList) {
            this.resourceAttributeList.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param resourceAttributeList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTask withResourceAttributeList(java.util.Collection<ResourceAttribute> resourceAttributeList) {
        setResourceAttributeList(resourceAttributeList);
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
        if (getProgressUpdateStream() != null)
            sb.append("ProgressUpdateStream: ").append(getProgressUpdateStream()).append(",");
        if (getMigrationTaskName() != null)
            sb.append("MigrationTaskName: ").append(getMigrationTaskName()).append(",");
        if (getTask() != null)
            sb.append("Task: ").append(getTask()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime()).append(",");
        if (getResourceAttributeList() != null)
            sb.append("ResourceAttributeList: ").append(getResourceAttributeList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MigrationTask == false)
            return false;
        MigrationTask other = (MigrationTask) obj;
        if (other.getProgressUpdateStream() == null ^ this.getProgressUpdateStream() == null)
            return false;
        if (other.getProgressUpdateStream() != null && other.getProgressUpdateStream().equals(this.getProgressUpdateStream()) == false)
            return false;
        if (other.getMigrationTaskName() == null ^ this.getMigrationTaskName() == null)
            return false;
        if (other.getMigrationTaskName() != null && other.getMigrationTaskName().equals(this.getMigrationTaskName()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        if (other.getResourceAttributeList() == null ^ this.getResourceAttributeList() == null)
            return false;
        if (other.getResourceAttributeList() != null && other.getResourceAttributeList().equals(this.getResourceAttributeList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressUpdateStream() == null) ? 0 : getProgressUpdateStream().hashCode());
        hashCode = prime * hashCode + ((getMigrationTaskName() == null) ? 0 : getMigrationTaskName().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getResourceAttributeList() == null) ? 0 : getResourceAttributeList().hashCode());
        return hashCode;
    }

    @Override
    public MigrationTask clone() {
        try {
            return (MigrationTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhub.model.transform.MigrationTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

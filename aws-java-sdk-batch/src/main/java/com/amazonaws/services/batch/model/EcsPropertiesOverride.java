/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains overrides for the Amazon ECS task definition of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EcsPropertiesOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsPropertiesOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The overrides for the Amazon ECS task definition of a job.
     * </p>
     * <note>
     * <p>
     * This object is currently limited to one element.
     * </p>
     * </note>
     */
    private java.util.List<TaskPropertiesOverride> taskProperties;

    /**
     * <p>
     * The overrides for the Amazon ECS task definition of a job.
     * </p>
     * <note>
     * <p>
     * This object is currently limited to one element.
     * </p>
     * </note>
     * 
     * @return The overrides for the Amazon ECS task definition of a job.</p> <note>
     *         <p>
     *         This object is currently limited to one element.
     *         </p>
     */

    public java.util.List<TaskPropertiesOverride> getTaskProperties() {
        return taskProperties;
    }

    /**
     * <p>
     * The overrides for the Amazon ECS task definition of a job.
     * </p>
     * <note>
     * <p>
     * This object is currently limited to one element.
     * </p>
     * </note>
     * 
     * @param taskProperties
     *        The overrides for the Amazon ECS task definition of a job.</p> <note>
     *        <p>
     *        This object is currently limited to one element.
     *        </p>
     */

    public void setTaskProperties(java.util.Collection<TaskPropertiesOverride> taskProperties) {
        if (taskProperties == null) {
            this.taskProperties = null;
            return;
        }

        this.taskProperties = new java.util.ArrayList<TaskPropertiesOverride>(taskProperties);
    }

    /**
     * <p>
     * The overrides for the Amazon ECS task definition of a job.
     * </p>
     * <note>
     * <p>
     * This object is currently limited to one element.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskProperties(java.util.Collection)} or {@link #withTaskProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param taskProperties
     *        The overrides for the Amazon ECS task definition of a job.</p> <note>
     *        <p>
     *        This object is currently limited to one element.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsPropertiesOverride withTaskProperties(TaskPropertiesOverride... taskProperties) {
        if (this.taskProperties == null) {
            setTaskProperties(new java.util.ArrayList<TaskPropertiesOverride>(taskProperties.length));
        }
        for (TaskPropertiesOverride ele : taskProperties) {
            this.taskProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The overrides for the Amazon ECS task definition of a job.
     * </p>
     * <note>
     * <p>
     * This object is currently limited to one element.
     * </p>
     * </note>
     * 
     * @param taskProperties
     *        The overrides for the Amazon ECS task definition of a job.</p> <note>
     *        <p>
     *        This object is currently limited to one element.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsPropertiesOverride withTaskProperties(java.util.Collection<TaskPropertiesOverride> taskProperties) {
        setTaskProperties(taskProperties);
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
        if (getTaskProperties() != null)
            sb.append("TaskProperties: ").append(getTaskProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsPropertiesOverride == false)
            return false;
        EcsPropertiesOverride other = (EcsPropertiesOverride) obj;
        if (other.getTaskProperties() == null ^ this.getTaskProperties() == null)
            return false;
        if (other.getTaskProperties() != null && other.getTaskProperties().equals(this.getTaskProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskProperties() == null) ? 0 : getTaskProperties().hashCode());
        return hashCode;
    }

    @Override
    public EcsPropertiesOverride clone() {
        try {
            return (EcsPropertiesOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EcsPropertiesOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

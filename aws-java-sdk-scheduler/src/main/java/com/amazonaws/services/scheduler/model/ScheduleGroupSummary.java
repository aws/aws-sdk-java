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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a schedule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ScheduleGroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time at which the schedule group was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The time at which the schedule group was last modified.
     * </p>
     */
    private java.util.Date lastModificationDate;
    /**
     * <p>
     * The name of the schedule group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the state of the schedule group.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the schedule group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schedule group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the schedule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleGroupSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time at which the schedule group was created.
     * </p>
     * 
     * @param creationDate
     *        The time at which the schedule group was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The time at which the schedule group was created.
     * </p>
     * 
     * @return The time at which the schedule group was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The time at which the schedule group was created.
     * </p>
     * 
     * @param creationDate
     *        The time at which the schedule group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleGroupSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The time at which the schedule group was last modified.
     * </p>
     * 
     * @param lastModificationDate
     *        The time at which the schedule group was last modified.
     */

    public void setLastModificationDate(java.util.Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    /**
     * <p>
     * The time at which the schedule group was last modified.
     * </p>
     * 
     * @return The time at which the schedule group was last modified.
     */

    public java.util.Date getLastModificationDate() {
        return this.lastModificationDate;
    }

    /**
     * <p>
     * The time at which the schedule group was last modified.
     * </p>
     * 
     * @param lastModificationDate
     *        The time at which the schedule group was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleGroupSummary withLastModificationDate(java.util.Date lastModificationDate) {
        setLastModificationDate(lastModificationDate);
        return this;
    }

    /**
     * <p>
     * The name of the schedule group.
     * </p>
     * 
     * @param name
     *        The name of the schedule group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schedule group.
     * </p>
     * 
     * @return The name of the schedule group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the schedule group.
     * </p>
     * 
     * @param name
     *        The name of the schedule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleGroupSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the state of the schedule group.
     * </p>
     * 
     * @param state
     *        Specifies the state of the schedule group.
     * @see ScheduleGroupState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Specifies the state of the schedule group.
     * </p>
     * 
     * @return Specifies the state of the schedule group.
     * @see ScheduleGroupState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Specifies the state of the schedule group.
     * </p>
     * 
     * @param state
     *        Specifies the state of the schedule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleGroupState
     */

    public ScheduleGroupSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Specifies the state of the schedule group.
     * </p>
     * 
     * @param state
     *        Specifies the state of the schedule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleGroupState
     */

    public ScheduleGroupSummary withState(ScheduleGroupState state) {
        this.state = state.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModificationDate() != null)
            sb.append("LastModificationDate: ").append(getLastModificationDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleGroupSummary == false)
            return false;
        ScheduleGroupSummary other = (ScheduleGroupSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModificationDate() == null ^ this.getLastModificationDate() == null)
            return false;
        if (other.getLastModificationDate() != null && other.getLastModificationDate().equals(this.getLastModificationDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModificationDate() == null) ? 0 : getLastModificationDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleGroupSummary clone() {
        try {
            return (ScheduleGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.scheduler.model.transform.ScheduleGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

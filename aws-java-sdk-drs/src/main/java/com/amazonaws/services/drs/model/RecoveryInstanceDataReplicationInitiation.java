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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data replication initiation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RecoveryInstanceDataReplicationInitiation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstanceDataReplicationInitiation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time of the current attempt to initiate data replication.
     * </p>
     */
    private String startDateTime;
    /**
     * <p>
     * The steps of the current attempt to initiate data replication.
     * </p>
     */
    private java.util.List<RecoveryInstanceDataReplicationInitiationStep> steps;

    /**
     * <p>
     * The date and time of the current attempt to initiate data replication.
     * </p>
     * 
     * @param startDateTime
     *        The date and time of the current attempt to initiate data replication.
     */

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date and time of the current attempt to initiate data replication.
     * </p>
     * 
     * @return The date and time of the current attempt to initiate data replication.
     */

    public String getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The date and time of the current attempt to initiate data replication.
     * </p>
     * 
     * @param startDateTime
     *        The date and time of the current attempt to initiate data replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceDataReplicationInitiation withStartDateTime(String startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The steps of the current attempt to initiate data replication.
     * </p>
     * 
     * @return The steps of the current attempt to initiate data replication.
     */

    public java.util.List<RecoveryInstanceDataReplicationInitiationStep> getSteps() {
        return steps;
    }

    /**
     * <p>
     * The steps of the current attempt to initiate data replication.
     * </p>
     * 
     * @param steps
     *        The steps of the current attempt to initiate data replication.
     */

    public void setSteps(java.util.Collection<RecoveryInstanceDataReplicationInitiationStep> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<RecoveryInstanceDataReplicationInitiationStep>(steps);
    }

    /**
     * <p>
     * The steps of the current attempt to initiate data replication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        The steps of the current attempt to initiate data replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceDataReplicationInitiation withSteps(RecoveryInstanceDataReplicationInitiationStep... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<RecoveryInstanceDataReplicationInitiationStep>(steps.length));
        }
        for (RecoveryInstanceDataReplicationInitiationStep ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The steps of the current attempt to initiate data replication.
     * </p>
     * 
     * @param steps
     *        The steps of the current attempt to initiate data replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceDataReplicationInitiation withSteps(java.util.Collection<RecoveryInstanceDataReplicationInitiationStep> steps) {
        setSteps(steps);
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
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryInstanceDataReplicationInitiation == false)
            return false;
        RecoveryInstanceDataReplicationInitiation other = (RecoveryInstanceDataReplicationInitiation) obj;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryInstanceDataReplicationInitiation clone() {
        try {
            return (RecoveryInstanceDataReplicationInitiation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.RecoveryInstanceDataReplicationInitiationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

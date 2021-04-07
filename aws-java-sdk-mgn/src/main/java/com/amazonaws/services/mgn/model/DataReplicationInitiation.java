/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data replication initiation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DataReplicationInitiation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataReplicationInitiation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Request to query next data initiation date and time.
     * </p>
     */
    private String nextAttemptDateTime;
    /**
     * <p>
     * Request to query data initiation start date and time.
     * </p>
     */
    private String startDateTime;
    /**
     * <p>
     * Request to query data initiation steps.
     * </p>
     */
    private java.util.List<DataReplicationInitiationStep> steps;

    /**
     * <p>
     * Request to query next data initiation date and time.
     * </p>
     * 
     * @param nextAttemptDateTime
     *        Request to query next data initiation date and time.
     */

    public void setNextAttemptDateTime(String nextAttemptDateTime) {
        this.nextAttemptDateTime = nextAttemptDateTime;
    }

    /**
     * <p>
     * Request to query next data initiation date and time.
     * </p>
     * 
     * @return Request to query next data initiation date and time.
     */

    public String getNextAttemptDateTime() {
        return this.nextAttemptDateTime;
    }

    /**
     * <p>
     * Request to query next data initiation date and time.
     * </p>
     * 
     * @param nextAttemptDateTime
     *        Request to query next data initiation date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInitiation withNextAttemptDateTime(String nextAttemptDateTime) {
        setNextAttemptDateTime(nextAttemptDateTime);
        return this;
    }

    /**
     * <p>
     * Request to query data initiation start date and time.
     * </p>
     * 
     * @param startDateTime
     *        Request to query data initiation start date and time.
     */

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * Request to query data initiation start date and time.
     * </p>
     * 
     * @return Request to query data initiation start date and time.
     */

    public String getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * Request to query data initiation start date and time.
     * </p>
     * 
     * @param startDateTime
     *        Request to query data initiation start date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInitiation withStartDateTime(String startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * Request to query data initiation steps.
     * </p>
     * 
     * @return Request to query data initiation steps.
     */

    public java.util.List<DataReplicationInitiationStep> getSteps() {
        return steps;
    }

    /**
     * <p>
     * Request to query data initiation steps.
     * </p>
     * 
     * @param steps
     *        Request to query data initiation steps.
     */

    public void setSteps(java.util.Collection<DataReplicationInitiationStep> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<DataReplicationInitiationStep>(steps);
    }

    /**
     * <p>
     * Request to query data initiation steps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        Request to query data initiation steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInitiation withSteps(DataReplicationInitiationStep... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<DataReplicationInitiationStep>(steps.length));
        }
        for (DataReplicationInitiationStep ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request to query data initiation steps.
     * </p>
     * 
     * @param steps
     *        Request to query data initiation steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInitiation withSteps(java.util.Collection<DataReplicationInitiationStep> steps) {
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
        if (getNextAttemptDateTime() != null)
            sb.append("NextAttemptDateTime: ").append(getNextAttemptDateTime()).append(",");
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

        if (obj instanceof DataReplicationInitiation == false)
            return false;
        DataReplicationInitiation other = (DataReplicationInitiation) obj;
        if (other.getNextAttemptDateTime() == null ^ this.getNextAttemptDateTime() == null)
            return false;
        if (other.getNextAttemptDateTime() != null && other.getNextAttemptDateTime().equals(this.getNextAttemptDateTime()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getNextAttemptDateTime() == null) ? 0 : getNextAttemptDateTime().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public DataReplicationInitiation clone() {
        try {
            return (DataReplicationInitiation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.DataReplicationInitiationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

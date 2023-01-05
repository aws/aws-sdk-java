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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a specific Map Run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/MapRunListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapRunListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>executionArn</code> of the execution from which the Map Run was started.
     * </p>
     */
    private String executionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Map Run.
     * </p>
     */
    private String mapRunArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed state machine.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * The date on which the Map Run started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The date on which the Map Run stopped.
     * </p>
     */
    private java.util.Date stopDate;

    /**
     * <p>
     * The <code>executionArn</code> of the execution from which the Map Run was started.
     * </p>
     * 
     * @param executionArn
     *        The <code>executionArn</code> of the execution from which the Map Run was started.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The <code>executionArn</code> of the execution from which the Map Run was started.
     * </p>
     * 
     * @return The <code>executionArn</code> of the execution from which the Map Run was started.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The <code>executionArn</code> of the execution from which the Map Run was started.
     * </p>
     * 
     * @param executionArn
     *        The <code>executionArn</code> of the execution from which the Map Run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunListItem withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Map Run.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) of the Map Run.
     */

    public void setMapRunArn(String mapRunArn) {
        this.mapRunArn = mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Map Run.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Map Run.
     */

    public String getMapRunArn() {
        return this.mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Map Run.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) of the Map Run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunListItem withMapRunArn(String mapRunArn) {
        setMapRunArn(mapRunArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the executed state machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the executed state machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the executed state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunListItem withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * The date on which the Map Run started.
     * </p>
     * 
     * @param startDate
     *        The date on which the Map Run started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date on which the Map Run started.
     * </p>
     * 
     * @return The date on which the Map Run started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date on which the Map Run started.
     * </p>
     * 
     * @param startDate
     *        The date on which the Map Run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunListItem withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The date on which the Map Run stopped.
     * </p>
     * 
     * @param stopDate
     *        The date on which the Map Run stopped.
     */

    public void setStopDate(java.util.Date stopDate) {
        this.stopDate = stopDate;
    }

    /**
     * <p>
     * The date on which the Map Run stopped.
     * </p>
     * 
     * @return The date on which the Map Run stopped.
     */

    public java.util.Date getStopDate() {
        return this.stopDate;
    }

    /**
     * <p>
     * The date on which the Map Run stopped.
     * </p>
     * 
     * @param stopDate
     *        The date on which the Map Run stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunListItem withStopDate(java.util.Date stopDate) {
        setStopDate(stopDate);
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
        if (getExecutionArn() != null)
            sb.append("ExecutionArn: ").append(getExecutionArn()).append(",");
        if (getMapRunArn() != null)
            sb.append("MapRunArn: ").append(getMapRunArn()).append(",");
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getStopDate() != null)
            sb.append("StopDate: ").append(getStopDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapRunListItem == false)
            return false;
        MapRunListItem other = (MapRunListItem) obj;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
        if (other.getMapRunArn() == null ^ this.getMapRunArn() == null)
            return false;
        if (other.getMapRunArn() != null && other.getMapRunArn().equals(this.getMapRunArn()) == false)
            return false;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getStopDate() == null ^ this.getStopDate() == null)
            return false;
        if (other.getStopDate() != null && other.getStopDate().equals(this.getStopDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getMapRunArn() == null) ? 0 : getMapRunArn().hashCode());
        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getStopDate() == null) ? 0 : getStopDate().hashCode());
        return hashCode;
    }

    @Override
    public MapRunListItem clone() {
        try {
            return (MapRunListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.MapRunListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

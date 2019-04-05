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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used as one of the elements of the <a>AssessmentRun</a> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AssessmentRunStateChange" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentRunStateChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The last time the assessment run state changed.
     * </p>
     */
    private java.util.Date stateChangedAt;
    /**
     * <p>
     * The assessment run state.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The last time the assessment run state changed.
     * </p>
     * 
     * @param stateChangedAt
     *        The last time the assessment run state changed.
     */

    public void setStateChangedAt(java.util.Date stateChangedAt) {
        this.stateChangedAt = stateChangedAt;
    }

    /**
     * <p>
     * The last time the assessment run state changed.
     * </p>
     * 
     * @return The last time the assessment run state changed.
     */

    public java.util.Date getStateChangedAt() {
        return this.stateChangedAt;
    }

    /**
     * <p>
     * The last time the assessment run state changed.
     * </p>
     * 
     * @param stateChangedAt
     *        The last time the assessment run state changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRunStateChange withStateChangedAt(java.util.Date stateChangedAt) {
        setStateChangedAt(stateChangedAt);
        return this;
    }

    /**
     * <p>
     * The assessment run state.
     * </p>
     * 
     * @param state
     *        The assessment run state.
     * @see AssessmentRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The assessment run state.
     * </p>
     * 
     * @return The assessment run state.
     * @see AssessmentRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The assessment run state.
     * </p>
     * 
     * @param state
     *        The assessment run state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentRunState
     */

    public AssessmentRunStateChange withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The assessment run state.
     * </p>
     * 
     * @param state
     *        The assessment run state.
     * @see AssessmentRunState
     */

    public void setState(AssessmentRunState state) {
        withState(state);
    }

    /**
     * <p>
     * The assessment run state.
     * </p>
     * 
     * @param state
     *        The assessment run state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentRunState
     */

    public AssessmentRunStateChange withState(AssessmentRunState state) {
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
        if (getStateChangedAt() != null)
            sb.append("StateChangedAt: ").append(getStateChangedAt()).append(",");
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

        if (obj instanceof AssessmentRunStateChange == false)
            return false;
        AssessmentRunStateChange other = (AssessmentRunStateChange) obj;
        if (other.getStateChangedAt() == null ^ this.getStateChangedAt() == null)
            return false;
        if (other.getStateChangedAt() != null && other.getStateChangedAt().equals(this.getStateChangedAt()) == false)
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

        hashCode = prime * hashCode + ((getStateChangedAt() == null) ? 0 : getStateChangedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentRunStateChange clone() {
        try {
            return (AssessmentRunStateChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AssessmentRunStateChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

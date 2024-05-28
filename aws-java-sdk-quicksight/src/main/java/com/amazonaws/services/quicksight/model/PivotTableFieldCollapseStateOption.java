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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collapse state options for the pivot table field options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableFieldCollapseStateOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableFieldCollapseStateOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A tagged-union object that sets the collapse state.
     * </p>
     */
    private PivotTableFieldCollapseStateTarget target;
    /**
     * <p>
     * The state of the field target of a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COLLAPSED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPANDED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String state;

    /**
     * <p>
     * A tagged-union object that sets the collapse state.
     * </p>
     * 
     * @param target
     *        A tagged-union object that sets the collapse state.
     */

    public void setTarget(PivotTableFieldCollapseStateTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * A tagged-union object that sets the collapse state.
     * </p>
     * 
     * @return A tagged-union object that sets the collapse state.
     */

    public PivotTableFieldCollapseStateTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * A tagged-union object that sets the collapse state.
     * </p>
     * 
     * @param target
     *        A tagged-union object that sets the collapse state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldCollapseStateOption withTarget(PivotTableFieldCollapseStateTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The state of the field target of a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COLLAPSED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPANDED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the field target of a pivot table. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COLLAPSED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPANDED</code>
     *        </p>
     *        </li>
     * @see PivotTableFieldCollapseState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the field target of a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COLLAPSED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPANDED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the field target of a pivot table. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COLLAPSED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXPANDED</code>
     *         </p>
     *         </li>
     * @see PivotTableFieldCollapseState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the field target of a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COLLAPSED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPANDED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the field target of a pivot table. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COLLAPSED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPANDED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PivotTableFieldCollapseState
     */

    public PivotTableFieldCollapseStateOption withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the field target of a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COLLAPSED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPANDED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the field target of a pivot table. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COLLAPSED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPANDED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PivotTableFieldCollapseState
     */

    public PivotTableFieldCollapseStateOption withState(PivotTableFieldCollapseState state) {
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
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

        if (obj instanceof PivotTableFieldCollapseStateOption == false)
            return false;
        PivotTableFieldCollapseStateOption other = (PivotTableFieldCollapseStateOption) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
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

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableFieldCollapseStateOption clone() {
        try {
            return (PivotTableFieldCollapseStateOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableFieldCollapseStateOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

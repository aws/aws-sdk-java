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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the success and failure rate of slot resolution in the results of a test execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotResolutionTestResultItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotResolutionTestResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the slot.
     * </p>
     */
    private String slotName;
    /**
     * <p>
     * A result for slot resolution in the results of a test execution.
     * </p>
     */
    private SlotResolutionTestResultItemCounts resultCounts;

    /**
     * <p>
     * The name of the slot.
     * </p>
     * 
     * @param slotName
     *        The name of the slot.
     */

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * <p>
     * The name of the slot.
     * </p>
     * 
     * @return The name of the slot.
     */

    public String getSlotName() {
        return this.slotName;
    }

    /**
     * <p>
     * The name of the slot.
     * </p>
     * 
     * @param slotName
     *        The name of the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotResolutionTestResultItem withSlotName(String slotName) {
        setSlotName(slotName);
        return this;
    }

    /**
     * <p>
     * A result for slot resolution in the results of a test execution.
     * </p>
     * 
     * @param resultCounts
     *        A result for slot resolution in the results of a test execution.
     */

    public void setResultCounts(SlotResolutionTestResultItemCounts resultCounts) {
        this.resultCounts = resultCounts;
    }

    /**
     * <p>
     * A result for slot resolution in the results of a test execution.
     * </p>
     * 
     * @return A result for slot resolution in the results of a test execution.
     */

    public SlotResolutionTestResultItemCounts getResultCounts() {
        return this.resultCounts;
    }

    /**
     * <p>
     * A result for slot resolution in the results of a test execution.
     * </p>
     * 
     * @param resultCounts
     *        A result for slot resolution in the results of a test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotResolutionTestResultItem withResultCounts(SlotResolutionTestResultItemCounts resultCounts) {
        setResultCounts(resultCounts);
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
        if (getSlotName() != null)
            sb.append("SlotName: ").append(getSlotName()).append(",");
        if (getResultCounts() != null)
            sb.append("ResultCounts: ").append(getResultCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotResolutionTestResultItem == false)
            return false;
        SlotResolutionTestResultItem other = (SlotResolutionTestResultItem) obj;
        if (other.getSlotName() == null ^ this.getSlotName() == null)
            return false;
        if (other.getSlotName() != null && other.getSlotName().equals(this.getSlotName()) == false)
            return false;
        if (other.getResultCounts() == null ^ this.getResultCounts() == null)
            return false;
        if (other.getResultCounts() != null && other.getResultCounts().equals(this.getResultCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotName() == null) ? 0 : getSlotName().hashCode());
        hashCode = prime * hashCode + ((getResultCounts() == null) ? 0 : getResultCounts().hashCode());
        return hashCode;
    }

    @Override
    public SlotResolutionTestResultItem clone() {
        try {
            return (SlotResolutionTestResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotResolutionTestResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
 * Lifecycle last Cutover .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/LifeCycleLastCutover" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifeCycleLastCutover implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lifecycle Cutover finalized date and time.
     * </p>
     */
    private LifeCycleLastCutoverFinalized finalized;
    /**
     * <p>
     * Lifecycle last Cutover initiated.
     * </p>
     */
    private LifeCycleLastCutoverInitiated initiated;
    /**
     * <p>
     * Lifecycle last Cutover reverted.
     * </p>
     */
    private LifeCycleLastCutoverReverted reverted;

    /**
     * <p>
     * Lifecycle Cutover finalized date and time.
     * </p>
     * 
     * @param finalized
     *        Lifecycle Cutover finalized date and time.
     */

    public void setFinalized(LifeCycleLastCutoverFinalized finalized) {
        this.finalized = finalized;
    }

    /**
     * <p>
     * Lifecycle Cutover finalized date and time.
     * </p>
     * 
     * @return Lifecycle Cutover finalized date and time.
     */

    public LifeCycleLastCutoverFinalized getFinalized() {
        return this.finalized;
    }

    /**
     * <p>
     * Lifecycle Cutover finalized date and time.
     * </p>
     * 
     * @param finalized
     *        Lifecycle Cutover finalized date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastCutover withFinalized(LifeCycleLastCutoverFinalized finalized) {
        setFinalized(finalized);
        return this;
    }

    /**
     * <p>
     * Lifecycle last Cutover initiated.
     * </p>
     * 
     * @param initiated
     *        Lifecycle last Cutover initiated.
     */

    public void setInitiated(LifeCycleLastCutoverInitiated initiated) {
        this.initiated = initiated;
    }

    /**
     * <p>
     * Lifecycle last Cutover initiated.
     * </p>
     * 
     * @return Lifecycle last Cutover initiated.
     */

    public LifeCycleLastCutoverInitiated getInitiated() {
        return this.initiated;
    }

    /**
     * <p>
     * Lifecycle last Cutover initiated.
     * </p>
     * 
     * @param initiated
     *        Lifecycle last Cutover initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastCutover withInitiated(LifeCycleLastCutoverInitiated initiated) {
        setInitiated(initiated);
        return this;
    }

    /**
     * <p>
     * Lifecycle last Cutover reverted.
     * </p>
     * 
     * @param reverted
     *        Lifecycle last Cutover reverted.
     */

    public void setReverted(LifeCycleLastCutoverReverted reverted) {
        this.reverted = reverted;
    }

    /**
     * <p>
     * Lifecycle last Cutover reverted.
     * </p>
     * 
     * @return Lifecycle last Cutover reverted.
     */

    public LifeCycleLastCutoverReverted getReverted() {
        return this.reverted;
    }

    /**
     * <p>
     * Lifecycle last Cutover reverted.
     * </p>
     * 
     * @param reverted
     *        Lifecycle last Cutover reverted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastCutover withReverted(LifeCycleLastCutoverReverted reverted) {
        setReverted(reverted);
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
        if (getFinalized() != null)
            sb.append("Finalized: ").append(getFinalized()).append(",");
        if (getInitiated() != null)
            sb.append("Initiated: ").append(getInitiated()).append(",");
        if (getReverted() != null)
            sb.append("Reverted: ").append(getReverted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifeCycleLastCutover == false)
            return false;
        LifeCycleLastCutover other = (LifeCycleLastCutover) obj;
        if (other.getFinalized() == null ^ this.getFinalized() == null)
            return false;
        if (other.getFinalized() != null && other.getFinalized().equals(this.getFinalized()) == false)
            return false;
        if (other.getInitiated() == null ^ this.getInitiated() == null)
            return false;
        if (other.getInitiated() != null && other.getInitiated().equals(this.getInitiated()) == false)
            return false;
        if (other.getReverted() == null ^ this.getReverted() == null)
            return false;
        if (other.getReverted() != null && other.getReverted().equals(this.getReverted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFinalized() == null) ? 0 : getFinalized().hashCode());
        hashCode = prime * hashCode + ((getInitiated() == null) ? 0 : getInitiated().hashCode());
        hashCode = prime * hashCode + ((getReverted() == null) ? 0 : getReverted().hashCode());
        return hashCode;
    }

    @Override
    public LifeCycleLastCutover clone() {
        try {
            return (LifeCycleLastCutover) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.LifeCycleLastCutoverMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

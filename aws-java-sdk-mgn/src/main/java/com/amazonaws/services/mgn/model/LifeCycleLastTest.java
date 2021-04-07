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
 * Lifecycle last Test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/LifeCycleLastTest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifeCycleLastTest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lifecycle last Test finlized.
     * </p>
     */
    private LifeCycleLastTestFinalized finalized;
    /**
     * <p>
     * Lifecycle last Test initiated.
     * </p>
     */
    private LifeCycleLastTestInitiated initiated;
    /**
     * <p>
     * Lifecycle last Test reverted.
     * </p>
     */
    private LifeCycleLastTestReverted reverted;

    /**
     * <p>
     * Lifecycle last Test finlized.
     * </p>
     * 
     * @param finalized
     *        Lifecycle last Test finlized.
     */

    public void setFinalized(LifeCycleLastTestFinalized finalized) {
        this.finalized = finalized;
    }

    /**
     * <p>
     * Lifecycle last Test finlized.
     * </p>
     * 
     * @return Lifecycle last Test finlized.
     */

    public LifeCycleLastTestFinalized getFinalized() {
        return this.finalized;
    }

    /**
     * <p>
     * Lifecycle last Test finlized.
     * </p>
     * 
     * @param finalized
     *        Lifecycle last Test finlized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastTest withFinalized(LifeCycleLastTestFinalized finalized) {
        setFinalized(finalized);
        return this;
    }

    /**
     * <p>
     * Lifecycle last Test initiated.
     * </p>
     * 
     * @param initiated
     *        Lifecycle last Test initiated.
     */

    public void setInitiated(LifeCycleLastTestInitiated initiated) {
        this.initiated = initiated;
    }

    /**
     * <p>
     * Lifecycle last Test initiated.
     * </p>
     * 
     * @return Lifecycle last Test initiated.
     */

    public LifeCycleLastTestInitiated getInitiated() {
        return this.initiated;
    }

    /**
     * <p>
     * Lifecycle last Test initiated.
     * </p>
     * 
     * @param initiated
     *        Lifecycle last Test initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastTest withInitiated(LifeCycleLastTestInitiated initiated) {
        setInitiated(initiated);
        return this;
    }

    /**
     * <p>
     * Lifecycle last Test reverted.
     * </p>
     * 
     * @param reverted
     *        Lifecycle last Test reverted.
     */

    public void setReverted(LifeCycleLastTestReverted reverted) {
        this.reverted = reverted;
    }

    /**
     * <p>
     * Lifecycle last Test reverted.
     * </p>
     * 
     * @return Lifecycle last Test reverted.
     */

    public LifeCycleLastTestReverted getReverted() {
        return this.reverted;
    }

    /**
     * <p>
     * Lifecycle last Test reverted.
     * </p>
     * 
     * @param reverted
     *        Lifecycle last Test reverted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastTest withReverted(LifeCycleLastTestReverted reverted) {
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

        if (obj instanceof LifeCycleLastTest == false)
            return false;
        LifeCycleLastTest other = (LifeCycleLastTest) obj;
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
    public LifeCycleLastTest clone() {
        try {
            return (LifeCycleLastTest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.LifeCycleLastTestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

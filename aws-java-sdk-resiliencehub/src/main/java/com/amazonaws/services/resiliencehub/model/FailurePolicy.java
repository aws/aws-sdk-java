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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a failure policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/FailurePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailurePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Recovery Point Objective (RPO), in seconds.
     * </p>
     */
    private Integer rpoInSecs;
    /**
     * <p>
     * The Recovery Time Objective (RTO), in seconds.
     * </p>
     */
    private Integer rtoInSecs;

    /**
     * <p>
     * The Recovery Point Objective (RPO), in seconds.
     * </p>
     * 
     * @param rpoInSecs
     *        The Recovery Point Objective (RPO), in seconds.
     */

    public void setRpoInSecs(Integer rpoInSecs) {
        this.rpoInSecs = rpoInSecs;
    }

    /**
     * <p>
     * The Recovery Point Objective (RPO), in seconds.
     * </p>
     * 
     * @return The Recovery Point Objective (RPO), in seconds.
     */

    public Integer getRpoInSecs() {
        return this.rpoInSecs;
    }

    /**
     * <p>
     * The Recovery Point Objective (RPO), in seconds.
     * </p>
     * 
     * @param rpoInSecs
     *        The Recovery Point Objective (RPO), in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailurePolicy withRpoInSecs(Integer rpoInSecs) {
        setRpoInSecs(rpoInSecs);
        return this;
    }

    /**
     * <p>
     * The Recovery Time Objective (RTO), in seconds.
     * </p>
     * 
     * @param rtoInSecs
     *        The Recovery Time Objective (RTO), in seconds.
     */

    public void setRtoInSecs(Integer rtoInSecs) {
        this.rtoInSecs = rtoInSecs;
    }

    /**
     * <p>
     * The Recovery Time Objective (RTO), in seconds.
     * </p>
     * 
     * @return The Recovery Time Objective (RTO), in seconds.
     */

    public Integer getRtoInSecs() {
        return this.rtoInSecs;
    }

    /**
     * <p>
     * The Recovery Time Objective (RTO), in seconds.
     * </p>
     * 
     * @param rtoInSecs
     *        The Recovery Time Objective (RTO), in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailurePolicy withRtoInSecs(Integer rtoInSecs) {
        setRtoInSecs(rtoInSecs);
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
        if (getRpoInSecs() != null)
            sb.append("RpoInSecs: ").append(getRpoInSecs()).append(",");
        if (getRtoInSecs() != null)
            sb.append("RtoInSecs: ").append(getRtoInSecs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailurePolicy == false)
            return false;
        FailurePolicy other = (FailurePolicy) obj;
        if (other.getRpoInSecs() == null ^ this.getRpoInSecs() == null)
            return false;
        if (other.getRpoInSecs() != null && other.getRpoInSecs().equals(this.getRpoInSecs()) == false)
            return false;
        if (other.getRtoInSecs() == null ^ this.getRtoInSecs() == null)
            return false;
        if (other.getRtoInSecs() != null && other.getRtoInSecs().equals(this.getRtoInSecs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRpoInSecs() == null) ? 0 : getRpoInSecs().hashCode());
        hashCode = prime * hashCode + ((getRtoInSecs() == null) ? 0 : getRtoInSecs().hashCode());
        return hashCode;
    }

    @Override
    public FailurePolicy clone() {
        try {
            return (FailurePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.FailurePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

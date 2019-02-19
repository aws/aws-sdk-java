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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a policy used by EFS lifecycle management to transition files to the Infrequent Access (IA) storage class.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/LifecyclePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that indicates how long it takes to transition files to the IA storage class. Currently, the only valid
     * value is <code>AFTER_30_DAYS</code>.
     * </p>
     * <p>
     * <code>AFTER_30_DAYS</code> indicates files that have not been read from or written to for 30 days are
     * transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing the
     * contents of a directory don't count as a file access event.
     * </p>
     */
    private String transitionToIA;

    /**
     * <p>
     * A value that indicates how long it takes to transition files to the IA storage class. Currently, the only valid
     * value is <code>AFTER_30_DAYS</code>.
     * </p>
     * <p>
     * <code>AFTER_30_DAYS</code> indicates files that have not been read from or written to for 30 days are
     * transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing the
     * contents of a directory don't count as a file access event.
     * </p>
     * 
     * @param transitionToIA
     *        A value that indicates how long it takes to transition files to the IA storage class. Currently, the only
     *        valid value is <code>AFTER_30_DAYS</code>.</p>
     *        <p>
     *        <code>AFTER_30_DAYS</code> indicates files that have not been read from or written to for 30 days are
     *        transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing
     *        the contents of a directory don't count as a file access event.
     * @see TransitionToIARules
     */

    public void setTransitionToIA(String transitionToIA) {
        this.transitionToIA = transitionToIA;
    }

    /**
     * <p>
     * A value that indicates how long it takes to transition files to the IA storage class. Currently, the only valid
     * value is <code>AFTER_30_DAYS</code>.
     * </p>
     * <p>
     * <code>AFTER_30_DAYS</code> indicates files that have not been read from or written to for 30 days are
     * transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing the
     * contents of a directory don't count as a file access event.
     * </p>
     * 
     * @return A value that indicates how long it takes to transition files to the IA storage class. Currently, the only
     *         valid value is <code>AFTER_30_DAYS</code>.</p>
     *         <p>
     *         <code>AFTER_30_DAYS</code> indicates files that have not been read from or written to for 30 days are
     *         transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing
     *         the contents of a directory don't count as a file access event.
     * @see TransitionToIARules
     */

    public String getTransitionToIA() {
        return this.transitionToIA;
    }

    /**
     * <p>
     * A value that indicates how long it takes to transition files to the IA storage class. Currently, the only valid
     * value is <code>AFTER_30_DAYS</code>.
     * </p>
     * <p>
     * <code>AFTER_30_DAYS</code> indicates files that have not been read from or written to for 30 days are
     * transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing the
     * contents of a directory don't count as a file access event.
     * </p>
     * 
     * @param transitionToIA
     *        A value that indicates how long it takes to transition files to the IA storage class. Currently, the only
     *        valid value is <code>AFTER_30_DAYS</code>.</p>
     *        <p>
     *        <code>AFTER_30_DAYS</code> indicates files that have not been read from or written to for 30 days are
     *        transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing
     *        the contents of a directory don't count as a file access event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionToIARules
     */

    public LifecyclePolicy withTransitionToIA(String transitionToIA) {
        setTransitionToIA(transitionToIA);
        return this;
    }

    /**
     * <p>
     * A value that indicates how long it takes to transition files to the IA storage class. Currently, the only valid
     * value is <code>AFTER_30_DAYS</code>.
     * </p>
     * <p>
     * <code>AFTER_30_DAYS</code> indicates files that have not been read from or written to for 30 days are
     * transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing the
     * contents of a directory don't count as a file access event.
     * </p>
     * 
     * @param transitionToIA
     *        A value that indicates how long it takes to transition files to the IA storage class. Currently, the only
     *        valid value is <code>AFTER_30_DAYS</code>.</p>
     *        <p>
     *        <code>AFTER_30_DAYS</code> indicates files that have not been read from or written to for 30 days are
     *        transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing
     *        the contents of a directory don't count as a file access event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionToIARules
     */

    public LifecyclePolicy withTransitionToIA(TransitionToIARules transitionToIA) {
        this.transitionToIA = transitionToIA.toString();
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
        if (getTransitionToIA() != null)
            sb.append("TransitionToIA: ").append(getTransitionToIA());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicy == false)
            return false;
        LifecyclePolicy other = (LifecyclePolicy) obj;
        if (other.getTransitionToIA() == null ^ this.getTransitionToIA() == null)
            return false;
        if (other.getTransitionToIA() != null && other.getTransitionToIA().equals(this.getTransitionToIA()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitionToIA() == null) ? 0 : getTransitionToIA().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicy clone() {
        try {
            return (LifecyclePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.LifecyclePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/SubmitTaskStateChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubmitTaskStateChangeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Acknowledgement of the state change.
     * </p>
     */
    private String acknowledgment;

    /**
     * <p>
     * Acknowledgement of the state change.
     * </p>
     * 
     * @param acknowledgment
     *        Acknowledgement of the state change.
     */

    public void setAcknowledgment(String acknowledgment) {
        this.acknowledgment = acknowledgment;
    }

    /**
     * <p>
     * Acknowledgement of the state change.
     * </p>
     * 
     * @return Acknowledgement of the state change.
     */

    public String getAcknowledgment() {
        return this.acknowledgment;
    }

    /**
     * <p>
     * Acknowledgement of the state change.
     * </p>
     * 
     * @param acknowledgment
     *        Acknowledgement of the state change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitTaskStateChangeResult withAcknowledgment(String acknowledgment) {
        setAcknowledgment(acknowledgment);
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
        if (getAcknowledgment() != null)
            sb.append("Acknowledgment: ").append(getAcknowledgment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitTaskStateChangeResult == false)
            return false;
        SubmitTaskStateChangeResult other = (SubmitTaskStateChangeResult) obj;
        if (other.getAcknowledgment() == null ^ this.getAcknowledgment() == null)
            return false;
        if (other.getAcknowledgment() != null && other.getAcknowledgment().equals(this.getAcknowledgment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcknowledgment() == null) ? 0 : getAcknowledgment().hashCode());
        return hashCode;
    }

    @Override
    public SubmitTaskStateChangeResult clone() {
        try {
            return (SubmitTaskStateChangeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

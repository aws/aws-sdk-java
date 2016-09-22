/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The details of the status change reason for the instance.
 * </p>
 */
public class InstanceStateChangeReason implements Serializable, Cloneable {

    /**
     * <p>
     * The programmable code for the state change reason.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The status change reason description.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The programmable code for the state change reason.
     * </p>
     * 
     * @param code
     *        The programmable code for the state change reason.
     * @see InstanceStateChangeReasonCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The programmable code for the state change reason.
     * </p>
     * 
     * @return The programmable code for the state change reason.
     * @see InstanceStateChangeReasonCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The programmable code for the state change reason.
     * </p>
     * 
     * @param code
     *        The programmable code for the state change reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStateChangeReasonCode
     */

    public InstanceStateChangeReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The programmable code for the state change reason.
     * </p>
     * 
     * @param code
     *        The programmable code for the state change reason.
     * @see InstanceStateChangeReasonCode
     */

    public void setCode(InstanceStateChangeReasonCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The programmable code for the state change reason.
     * </p>
     * 
     * @param code
     *        The programmable code for the state change reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStateChangeReasonCode
     */

    public InstanceStateChangeReason withCode(InstanceStateChangeReasonCode code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The status change reason description.
     * </p>
     * 
     * @param message
     *        The status change reason description.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The status change reason description.
     * </p>
     * 
     * @return The status change reason description.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The status change reason description.
     * </p>
     * 
     * @param message
     *        The status change reason description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStateChangeReason withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStateChangeReason == false)
            return false;
        InstanceStateChangeReason other = (InstanceStateChangeReason) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public InstanceStateChangeReason clone() {
        try {
            return (InstanceStateChangeReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

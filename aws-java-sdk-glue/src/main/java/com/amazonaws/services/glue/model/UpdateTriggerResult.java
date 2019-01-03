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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTrigger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTriggerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resulting trigger definition.
     * </p>
     */
    private Trigger trigger;

    /**
     * <p>
     * The resulting trigger definition.
     * </p>
     * 
     * @param trigger
     *        The resulting trigger definition.
     */

    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    /**
     * <p>
     * The resulting trigger definition.
     * </p>
     * 
     * @return The resulting trigger definition.
     */

    public Trigger getTrigger() {
        return this.trigger;
    }

    /**
     * <p>
     * The resulting trigger definition.
     * </p>
     * 
     * @param trigger
     *        The resulting trigger definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTriggerResult withTrigger(Trigger trigger) {
        setTrigger(trigger);
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
        if (getTrigger() != null)
            sb.append("Trigger: ").append(getTrigger());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTriggerResult == false)
            return false;
        UpdateTriggerResult other = (UpdateTriggerResult) obj;
        if (other.getTrigger() == null ^ this.getTrigger() == null)
            return false;
        if (other.getTrigger() != null && other.getTrigger().equals(this.getTrigger()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrigger() == null) ? 0 : getTrigger().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTriggerResult clone() {
        try {
            return (UpdateTriggerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

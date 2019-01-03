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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A trigger failed to run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/RepositoryTriggerExecutionFailure"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryTriggerExecutionFailure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the trigger that did not run.
     * </p>
     */
    private String trigger;
    /**
     * <p>
     * Additional message information about the trigger that did not run.
     * </p>
     */
    private String failureMessage;

    /**
     * <p>
     * The name of the trigger that did not run.
     * </p>
     * 
     * @param trigger
     *        The name of the trigger that did not run.
     */

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    /**
     * <p>
     * The name of the trigger that did not run.
     * </p>
     * 
     * @return The name of the trigger that did not run.
     */

    public String getTrigger() {
        return this.trigger;
    }

    /**
     * <p>
     * The name of the trigger that did not run.
     * </p>
     * 
     * @param trigger
     *        The name of the trigger that did not run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryTriggerExecutionFailure withTrigger(String trigger) {
        setTrigger(trigger);
        return this;
    }

    /**
     * <p>
     * Additional message information about the trigger that did not run.
     * </p>
     * 
     * @param failureMessage
     *        Additional message information about the trigger that did not run.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * Additional message information about the trigger that did not run.
     * </p>
     * 
     * @return Additional message information about the trigger that did not run.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * Additional message information about the trigger that did not run.
     * </p>
     * 
     * @param failureMessage
     *        Additional message information about the trigger that did not run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryTriggerExecutionFailure withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
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
            sb.append("Trigger: ").append(getTrigger()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryTriggerExecutionFailure == false)
            return false;
        RepositoryTriggerExecutionFailure other = (RepositoryTriggerExecutionFailure) obj;
        if (other.getTrigger() == null ^ this.getTrigger() == null)
            return false;
        if (other.getTrigger() != null && other.getTrigger().equals(this.getTrigger()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrigger() == null) ? 0 : getTrigger().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryTriggerExecutionFailure clone() {
        try {
            return (RepositoryTriggerExecutionFailure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.RepositoryTriggerExecutionFailureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

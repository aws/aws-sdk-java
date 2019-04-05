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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Status information about an activity task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ActivityTaskStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityTaskStatus extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Set to <code>true</code> if cancellation of the task is requested.
     * </p>
     */
    private Boolean cancelRequested;

    /**
     * <p>
     * Set to <code>true</code> if cancellation of the task is requested.
     * </p>
     * 
     * @param cancelRequested
     *        Set to <code>true</code> if cancellation of the task is requested.
     */

    public void setCancelRequested(Boolean cancelRequested) {
        this.cancelRequested = cancelRequested;
    }

    /**
     * <p>
     * Set to <code>true</code> if cancellation of the task is requested.
     * </p>
     * 
     * @return Set to <code>true</code> if cancellation of the task is requested.
     */

    public Boolean getCancelRequested() {
        return this.cancelRequested;
    }

    /**
     * <p>
     * Set to <code>true</code> if cancellation of the task is requested.
     * </p>
     * 
     * @param cancelRequested
     *        Set to <code>true</code> if cancellation of the task is requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskStatus withCancelRequested(Boolean cancelRequested) {
        setCancelRequested(cancelRequested);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> if cancellation of the task is requested.
     * </p>
     * 
     * @return Set to <code>true</code> if cancellation of the task is requested.
     */

    public Boolean isCancelRequested() {
        return this.cancelRequested;
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
        if (getCancelRequested() != null)
            sb.append("CancelRequested: ").append(getCancelRequested());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityTaskStatus == false)
            return false;
        ActivityTaskStatus other = (ActivityTaskStatus) obj;
        if (other.getCancelRequested() == null ^ this.getCancelRequested() == null)
            return false;
        if (other.getCancelRequested() != null && other.getCancelRequested().equals(this.getCancelRequested()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCancelRequested() == null) ? 0 : getCancelRequested().hashCode());
        return hashCode;
    }

    @Override
    public ActivityTaskStatus clone() {
        try {
            return (ActivityTaskStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/TerminateRecoveryInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateRecoveryInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the Recovery Instances that should be terminated.
     * </p>
     */
    private java.util.List<String> recoveryInstanceIDs;

    /**
     * <p>
     * The IDs of the Recovery Instances that should be terminated.
     * </p>
     * 
     * @return The IDs of the Recovery Instances that should be terminated.
     */

    public java.util.List<String> getRecoveryInstanceIDs() {
        return recoveryInstanceIDs;
    }

    /**
     * <p>
     * The IDs of the Recovery Instances that should be terminated.
     * </p>
     * 
     * @param recoveryInstanceIDs
     *        The IDs of the Recovery Instances that should be terminated.
     */

    public void setRecoveryInstanceIDs(java.util.Collection<String> recoveryInstanceIDs) {
        if (recoveryInstanceIDs == null) {
            this.recoveryInstanceIDs = null;
            return;
        }

        this.recoveryInstanceIDs = new java.util.ArrayList<String>(recoveryInstanceIDs);
    }

    /**
     * <p>
     * The IDs of the Recovery Instances that should be terminated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecoveryInstanceIDs(java.util.Collection)} or {@link #withRecoveryInstanceIDs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param recoveryInstanceIDs
     *        The IDs of the Recovery Instances that should be terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateRecoveryInstancesRequest withRecoveryInstanceIDs(String... recoveryInstanceIDs) {
        if (this.recoveryInstanceIDs == null) {
            setRecoveryInstanceIDs(new java.util.ArrayList<String>(recoveryInstanceIDs.length));
        }
        for (String ele : recoveryInstanceIDs) {
            this.recoveryInstanceIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Recovery Instances that should be terminated.
     * </p>
     * 
     * @param recoveryInstanceIDs
     *        The IDs of the Recovery Instances that should be terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateRecoveryInstancesRequest withRecoveryInstanceIDs(java.util.Collection<String> recoveryInstanceIDs) {
        setRecoveryInstanceIDs(recoveryInstanceIDs);
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
        if (getRecoveryInstanceIDs() != null)
            sb.append("RecoveryInstanceIDs: ").append(getRecoveryInstanceIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateRecoveryInstancesRequest == false)
            return false;
        TerminateRecoveryInstancesRequest other = (TerminateRecoveryInstancesRequest) obj;
        if (other.getRecoveryInstanceIDs() == null ^ this.getRecoveryInstanceIDs() == null)
            return false;
        if (other.getRecoveryInstanceIDs() != null && other.getRecoveryInstanceIDs().equals(this.getRecoveryInstanceIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryInstanceIDs() == null) ? 0 : getRecoveryInstanceIDs().hashCode());
        return hashCode;
    }

    @Override
    public TerminateRecoveryInstancesRequest clone() {
        return (TerminateRecoveryInstancesRequest) super.clone();
    }

}

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetFailbackReplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFailbackReplicationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Recovery Instance whose failback replication configuration should be returned.
     * </p>
     */
    private String recoveryInstanceID;

    /**
     * <p>
     * The ID of the Recovery Instance whose failback replication configuration should be returned.
     * </p>
     * 
     * @param recoveryInstanceID
     *        The ID of the Recovery Instance whose failback replication configuration should be returned.
     */

    public void setRecoveryInstanceID(String recoveryInstanceID) {
        this.recoveryInstanceID = recoveryInstanceID;
    }

    /**
     * <p>
     * The ID of the Recovery Instance whose failback replication configuration should be returned.
     * </p>
     * 
     * @return The ID of the Recovery Instance whose failback replication configuration should be returned.
     */

    public String getRecoveryInstanceID() {
        return this.recoveryInstanceID;
    }

    /**
     * <p>
     * The ID of the Recovery Instance whose failback replication configuration should be returned.
     * </p>
     * 
     * @param recoveryInstanceID
     *        The ID of the Recovery Instance whose failback replication configuration should be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFailbackReplicationConfigurationRequest withRecoveryInstanceID(String recoveryInstanceID) {
        setRecoveryInstanceID(recoveryInstanceID);
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
        if (getRecoveryInstanceID() != null)
            sb.append("RecoveryInstanceID: ").append(getRecoveryInstanceID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFailbackReplicationConfigurationRequest == false)
            return false;
        GetFailbackReplicationConfigurationRequest other = (GetFailbackReplicationConfigurationRequest) obj;
        if (other.getRecoveryInstanceID() == null ^ this.getRecoveryInstanceID() == null)
            return false;
        if (other.getRecoveryInstanceID() != null && other.getRecoveryInstanceID().equals(this.getRecoveryInstanceID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryInstanceID() == null) ? 0 : getRecoveryInstanceID().hashCode());
        return hashCode;
    }

    @Override
    public GetFailbackReplicationConfigurationRequest clone() {
        return (GetFailbackReplicationConfigurationRequest) super.clone();
    }

}

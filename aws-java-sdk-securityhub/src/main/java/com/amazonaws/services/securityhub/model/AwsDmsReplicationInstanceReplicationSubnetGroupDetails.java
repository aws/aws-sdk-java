/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the replication subnet group.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDmsReplicationInstanceReplicationSubnetGroupDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDmsReplicationInstanceReplicationSubnetGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the replication subnet group.
     * </p>
     */
    private String replicationSubnetGroupIdentifier;

    /**
     * <p>
     * The identifier of the replication subnet group.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        The identifier of the replication subnet group.
     */

    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The identifier of the replication subnet group.
     * </p>
     * 
     * @return The identifier of the replication subnet group.
     */

    public String getReplicationSubnetGroupIdentifier() {
        return this.replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The identifier of the replication subnet group.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        The identifier of the replication subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceReplicationSubnetGroupDetails withReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        setReplicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier);
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
        if (getReplicationSubnetGroupIdentifier() != null)
            sb.append("ReplicationSubnetGroupIdentifier: ").append(getReplicationSubnetGroupIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDmsReplicationInstanceReplicationSubnetGroupDetails == false)
            return false;
        AwsDmsReplicationInstanceReplicationSubnetGroupDetails other = (AwsDmsReplicationInstanceReplicationSubnetGroupDetails) obj;
        if (other.getReplicationSubnetGroupIdentifier() == null ^ this.getReplicationSubnetGroupIdentifier() == null)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() != null
                && other.getReplicationSubnetGroupIdentifier().equals(this.getReplicationSubnetGroupIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationSubnetGroupIdentifier() == null) ? 0 : getReplicationSubnetGroupIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public AwsDmsReplicationInstanceReplicationSubnetGroupDetails clone() {
        try {
            return (AwsDmsReplicationInstanceReplicationSubnetGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDmsReplicationInstanceReplicationSubnetGroupDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

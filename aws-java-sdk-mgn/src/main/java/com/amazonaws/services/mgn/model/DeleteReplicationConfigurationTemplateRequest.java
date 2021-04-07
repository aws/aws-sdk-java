/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteReplicationConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReplicationConfigurationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Request to delete Replication Configuration Template from service by Replication Configuration Template ID.
     * </p>
     */
    private String replicationConfigurationTemplateID;

    /**
     * <p>
     * Request to delete Replication Configuration Template from service by Replication Configuration Template ID.
     * </p>
     * 
     * @param replicationConfigurationTemplateID
     *        Request to delete Replication Configuration Template from service by Replication Configuration Template
     *        ID.
     */

    public void setReplicationConfigurationTemplateID(String replicationConfigurationTemplateID) {
        this.replicationConfigurationTemplateID = replicationConfigurationTemplateID;
    }

    /**
     * <p>
     * Request to delete Replication Configuration Template from service by Replication Configuration Template ID.
     * </p>
     * 
     * @return Request to delete Replication Configuration Template from service by Replication Configuration Template
     *         ID.
     */

    public String getReplicationConfigurationTemplateID() {
        return this.replicationConfigurationTemplateID;
    }

    /**
     * <p>
     * Request to delete Replication Configuration Template from service by Replication Configuration Template ID.
     * </p>
     * 
     * @param replicationConfigurationTemplateID
     *        Request to delete Replication Configuration Template from service by Replication Configuration Template
     *        ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationConfigurationTemplateRequest withReplicationConfigurationTemplateID(String replicationConfigurationTemplateID) {
        setReplicationConfigurationTemplateID(replicationConfigurationTemplateID);
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
        if (getReplicationConfigurationTemplateID() != null)
            sb.append("ReplicationConfigurationTemplateID: ").append(getReplicationConfigurationTemplateID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationConfigurationTemplateRequest == false)
            return false;
        DeleteReplicationConfigurationTemplateRequest other = (DeleteReplicationConfigurationTemplateRequest) obj;
        if (other.getReplicationConfigurationTemplateID() == null ^ this.getReplicationConfigurationTemplateID() == null)
            return false;
        if (other.getReplicationConfigurationTemplateID() != null
                && other.getReplicationConfigurationTemplateID().equals(this.getReplicationConfigurationTemplateID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationConfigurationTemplateID() == null) ? 0 : getReplicationConfigurationTemplateID().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReplicationConfigurationTemplateRequest clone() {
        return (DeleteReplicationConfigurationTemplateRequest) super.clone();
    }

}

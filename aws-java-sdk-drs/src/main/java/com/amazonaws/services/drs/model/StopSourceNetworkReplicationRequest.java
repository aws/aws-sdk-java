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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StopSourceNetworkReplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopSourceNetworkReplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the Source Network to stop replication.
     * </p>
     */
    private String sourceNetworkID;

    /**
     * <p>
     * ID of the Source Network to stop replication.
     * </p>
     * 
     * @param sourceNetworkID
     *        ID of the Source Network to stop replication.
     */

    public void setSourceNetworkID(String sourceNetworkID) {
        this.sourceNetworkID = sourceNetworkID;
    }

    /**
     * <p>
     * ID of the Source Network to stop replication.
     * </p>
     * 
     * @return ID of the Source Network to stop replication.
     */

    public String getSourceNetworkID() {
        return this.sourceNetworkID;
    }

    /**
     * <p>
     * ID of the Source Network to stop replication.
     * </p>
     * 
     * @param sourceNetworkID
     *        ID of the Source Network to stop replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopSourceNetworkReplicationRequest withSourceNetworkID(String sourceNetworkID) {
        setSourceNetworkID(sourceNetworkID);
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
        if (getSourceNetworkID() != null)
            sb.append("SourceNetworkID: ").append(getSourceNetworkID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopSourceNetworkReplicationRequest == false)
            return false;
        StopSourceNetworkReplicationRequest other = (StopSourceNetworkReplicationRequest) obj;
        if (other.getSourceNetworkID() == null ^ this.getSourceNetworkID() == null)
            return false;
        if (other.getSourceNetworkID() != null && other.getSourceNetworkID().equals(this.getSourceNetworkID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceNetworkID() == null) ? 0 : getSourceNetworkID().hashCode());
        return hashCode;
    }

    @Override
    public StopSourceNetworkReplicationRequest clone() {
        return (StopSourceNetworkReplicationRequest) super.clone();
    }

}

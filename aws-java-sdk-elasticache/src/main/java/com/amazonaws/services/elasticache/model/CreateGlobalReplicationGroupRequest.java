/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateGlobalReplicationGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGlobalReplicationGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The suffix for name of a Global Datastore. The suffix guarantees uniqueness of the Global Datastore name across
     * multiple regions.
     * </p>
     */
    private String globalReplicationGroupIdSuffix;
    /**
     * <p>
     * Provides details of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupDescription;
    /**
     * <p>
     * The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
     * </p>
     */
    private String primaryReplicationGroupId;

    /**
     * <p>
     * The suffix for name of a Global Datastore. The suffix guarantees uniqueness of the Global Datastore name across
     * multiple regions.
     * </p>
     * 
     * @param globalReplicationGroupIdSuffix
     *        The suffix for name of a Global Datastore. The suffix guarantees uniqueness of the Global Datastore name
     *        across multiple regions.
     */

    public void setGlobalReplicationGroupIdSuffix(String globalReplicationGroupIdSuffix) {
        this.globalReplicationGroupIdSuffix = globalReplicationGroupIdSuffix;
    }

    /**
     * <p>
     * The suffix for name of a Global Datastore. The suffix guarantees uniqueness of the Global Datastore name across
     * multiple regions.
     * </p>
     * 
     * @return The suffix for name of a Global Datastore. The suffix guarantees uniqueness of the Global Datastore name
     *         across multiple regions.
     */

    public String getGlobalReplicationGroupIdSuffix() {
        return this.globalReplicationGroupIdSuffix;
    }

    /**
     * <p>
     * The suffix for name of a Global Datastore. The suffix guarantees uniqueness of the Global Datastore name across
     * multiple regions.
     * </p>
     * 
     * @param globalReplicationGroupIdSuffix
     *        The suffix for name of a Global Datastore. The suffix guarantees uniqueness of the Global Datastore name
     *        across multiple regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalReplicationGroupRequest withGlobalReplicationGroupIdSuffix(String globalReplicationGroupIdSuffix) {
        setGlobalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix);
        return this;
    }

    /**
     * <p>
     * Provides details of the Global Datastore
     * </p>
     * 
     * @param globalReplicationGroupDescription
     *        Provides details of the Global Datastore
     */

    public void setGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
    }

    /**
     * <p>
     * Provides details of the Global Datastore
     * </p>
     * 
     * @return Provides details of the Global Datastore
     */

    public String getGlobalReplicationGroupDescription() {
        return this.globalReplicationGroupDescription;
    }

    /**
     * <p>
     * Provides details of the Global Datastore
     * </p>
     * 
     * @param globalReplicationGroupDescription
     *        Provides details of the Global Datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalReplicationGroupRequest withGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
        setGlobalReplicationGroupDescription(globalReplicationGroupDescription);
        return this;
    }

    /**
     * <p>
     * The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
     * </p>
     * 
     * @param primaryReplicationGroupId
     *        The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
     */

    public void setPrimaryReplicationGroupId(String primaryReplicationGroupId) {
        this.primaryReplicationGroupId = primaryReplicationGroupId;
    }

    /**
     * <p>
     * The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
     * </p>
     * 
     * @return The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
     */

    public String getPrimaryReplicationGroupId() {
        return this.primaryReplicationGroupId;
    }

    /**
     * <p>
     * The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
     * </p>
     * 
     * @param primaryReplicationGroupId
     *        The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalReplicationGroupRequest withPrimaryReplicationGroupId(String primaryReplicationGroupId) {
        setPrimaryReplicationGroupId(primaryReplicationGroupId);
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
        if (getGlobalReplicationGroupIdSuffix() != null)
            sb.append("GlobalReplicationGroupIdSuffix: ").append(getGlobalReplicationGroupIdSuffix()).append(",");
        if (getGlobalReplicationGroupDescription() != null)
            sb.append("GlobalReplicationGroupDescription: ").append(getGlobalReplicationGroupDescription()).append(",");
        if (getPrimaryReplicationGroupId() != null)
            sb.append("PrimaryReplicationGroupId: ").append(getPrimaryReplicationGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGlobalReplicationGroupRequest == false)
            return false;
        CreateGlobalReplicationGroupRequest other = (CreateGlobalReplicationGroupRequest) obj;
        if (other.getGlobalReplicationGroupIdSuffix() == null ^ this.getGlobalReplicationGroupIdSuffix() == null)
            return false;
        if (other.getGlobalReplicationGroupIdSuffix() != null
                && other.getGlobalReplicationGroupIdSuffix().equals(this.getGlobalReplicationGroupIdSuffix()) == false)
            return false;
        if (other.getGlobalReplicationGroupDescription() == null ^ this.getGlobalReplicationGroupDescription() == null)
            return false;
        if (other.getGlobalReplicationGroupDescription() != null
                && other.getGlobalReplicationGroupDescription().equals(this.getGlobalReplicationGroupDescription()) == false)
            return false;
        if (other.getPrimaryReplicationGroupId() == null ^ this.getPrimaryReplicationGroupId() == null)
            return false;
        if (other.getPrimaryReplicationGroupId() != null && other.getPrimaryReplicationGroupId().equals(this.getPrimaryReplicationGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalReplicationGroupIdSuffix() == null) ? 0 : getGlobalReplicationGroupIdSuffix().hashCode());
        hashCode = prime * hashCode + ((getGlobalReplicationGroupDescription() == null) ? 0 : getGlobalReplicationGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getPrimaryReplicationGroupId() == null) ? 0 : getPrimaryReplicationGroupId().hashCode());
        return hashCode;
    }

    @Override
    public CreateGlobalReplicationGroupRequest clone() {
        return (CreateGlobalReplicationGroupRequest) super.clone();
    }

}

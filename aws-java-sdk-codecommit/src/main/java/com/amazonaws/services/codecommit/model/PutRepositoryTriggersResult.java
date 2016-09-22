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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a put repository triggers operation.
 * </p>
 */
public class PutRepositoryTriggersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated unique ID for the create or update operation.
     * </p>
     */
    private String configurationId;

    /**
     * <p>
     * The system-generated unique ID for the create or update operation.
     * </p>
     * 
     * @param configurationId
     *        The system-generated unique ID for the create or update operation.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * The system-generated unique ID for the create or update operation.
     * </p>
     * 
     * @return The system-generated unique ID for the create or update operation.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * <p>
     * The system-generated unique ID for the create or update operation.
     * </p>
     * 
     * @param configurationId
     *        The system-generated unique ID for the create or update operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRepositoryTriggersResult withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
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
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: " + getConfigurationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRepositoryTriggersResult == false)
            return false;
        PutRepositoryTriggersResult other = (PutRepositoryTriggersResult) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        return hashCode;
    }

    @Override
    public PutRepositoryTriggersResult clone() {
        try {
            return (PutRepositoryTriggersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

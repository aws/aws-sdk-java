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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListConnectorEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConnectorEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response of <code>ListConnectorEntities</code> lists entities grouped by category. This map's key represents
     * the group name, and its value contains the list of entities belonging to that group.
     * </p>
     */
    private java.util.Map<String, java.util.List<ConnectorEntity>> connectorEntityMap;

    /**
     * <p>
     * The response of <code>ListConnectorEntities</code> lists entities grouped by category. This map's key represents
     * the group name, and its value contains the list of entities belonging to that group.
     * </p>
     * 
     * @return The response of <code>ListConnectorEntities</code> lists entities grouped by category. This map's key
     *         represents the group name, and its value contains the list of entities belonging to that group.
     */

    public java.util.Map<String, java.util.List<ConnectorEntity>> getConnectorEntityMap() {
        return connectorEntityMap;
    }

    /**
     * <p>
     * The response of <code>ListConnectorEntities</code> lists entities grouped by category. This map's key represents
     * the group name, and its value contains the list of entities belonging to that group.
     * </p>
     * 
     * @param connectorEntityMap
     *        The response of <code>ListConnectorEntities</code> lists entities grouped by category. This map's key
     *        represents the group name, and its value contains the list of entities belonging to that group.
     */

    public void setConnectorEntityMap(java.util.Map<String, java.util.List<ConnectorEntity>> connectorEntityMap) {
        this.connectorEntityMap = connectorEntityMap;
    }

    /**
     * <p>
     * The response of <code>ListConnectorEntities</code> lists entities grouped by category. This map's key represents
     * the group name, and its value contains the list of entities belonging to that group.
     * </p>
     * 
     * @param connectorEntityMap
     *        The response of <code>ListConnectorEntities</code> lists entities grouped by category. This map's key
     *        represents the group name, and its value contains the list of entities belonging to that group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorEntitiesResult withConnectorEntityMap(java.util.Map<String, java.util.List<ConnectorEntity>> connectorEntityMap) {
        setConnectorEntityMap(connectorEntityMap);
        return this;
    }

    /**
     * Add a single ConnectorEntityMap entry
     *
     * @see ListConnectorEntitiesResult#withConnectorEntityMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorEntitiesResult addConnectorEntityMapEntry(String key, java.util.List<ConnectorEntity> value) {
        if (null == this.connectorEntityMap) {
            this.connectorEntityMap = new java.util.HashMap<String, java.util.List<ConnectorEntity>>();
        }
        if (this.connectorEntityMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.connectorEntityMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ConnectorEntityMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorEntitiesResult clearConnectorEntityMapEntries() {
        this.connectorEntityMap = null;
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
        if (getConnectorEntityMap() != null)
            sb.append("ConnectorEntityMap: ").append(getConnectorEntityMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConnectorEntitiesResult == false)
            return false;
        ListConnectorEntitiesResult other = (ListConnectorEntitiesResult) obj;
        if (other.getConnectorEntityMap() == null ^ this.getConnectorEntityMap() == null)
            return false;
        if (other.getConnectorEntityMap() != null && other.getConnectorEntityMap().equals(this.getConnectorEntityMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorEntityMap() == null) ? 0 : getConnectorEntityMap().hashCode());
        return hashCode;
    }

    @Override
    public ListConnectorEntitiesResult clone() {
        try {
            return (ListConnectorEntitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

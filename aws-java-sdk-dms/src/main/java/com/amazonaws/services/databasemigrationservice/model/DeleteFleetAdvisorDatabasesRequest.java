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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteFleetAdvisorDatabases" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFleetAdvisorDatabasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the Fleet Advisor collector databases to delete.
     * </p>
     */
    private java.util.List<String> databaseIds;

    /**
     * <p>
     * The IDs of the Fleet Advisor collector databases to delete.
     * </p>
     * 
     * @return The IDs of the Fleet Advisor collector databases to delete.
     */

    public java.util.List<String> getDatabaseIds() {
        return databaseIds;
    }

    /**
     * <p>
     * The IDs of the Fleet Advisor collector databases to delete.
     * </p>
     * 
     * @param databaseIds
     *        The IDs of the Fleet Advisor collector databases to delete.
     */

    public void setDatabaseIds(java.util.Collection<String> databaseIds) {
        if (databaseIds == null) {
            this.databaseIds = null;
            return;
        }

        this.databaseIds = new java.util.ArrayList<String>(databaseIds);
    }

    /**
     * <p>
     * The IDs of the Fleet Advisor collector databases to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabaseIds(java.util.Collection)} or {@link #withDatabaseIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param databaseIds
     *        The IDs of the Fleet Advisor collector databases to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetAdvisorDatabasesRequest withDatabaseIds(String... databaseIds) {
        if (this.databaseIds == null) {
            setDatabaseIds(new java.util.ArrayList<String>(databaseIds.length));
        }
        for (String ele : databaseIds) {
            this.databaseIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Fleet Advisor collector databases to delete.
     * </p>
     * 
     * @param databaseIds
     *        The IDs of the Fleet Advisor collector databases to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetAdvisorDatabasesRequest withDatabaseIds(java.util.Collection<String> databaseIds) {
        setDatabaseIds(databaseIds);
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
        if (getDatabaseIds() != null)
            sb.append("DatabaseIds: ").append(getDatabaseIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetAdvisorDatabasesRequest == false)
            return false;
        DeleteFleetAdvisorDatabasesRequest other = (DeleteFleetAdvisorDatabasesRequest) obj;
        if (other.getDatabaseIds() == null ^ this.getDatabaseIds() == null)
            return false;
        if (other.getDatabaseIds() != null && other.getDatabaseIds().equals(this.getDatabaseIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseIds() == null) ? 0 : getDatabaseIds().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFleetAdvisorDatabasesRequest clone() {
        return (DeleteFleetAdvisorDatabasesRequest) super.clone();
    }

}

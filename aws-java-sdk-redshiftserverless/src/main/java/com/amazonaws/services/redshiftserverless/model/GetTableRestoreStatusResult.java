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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetTableRestoreStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableRestoreStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The returned <code>TableRestoreStatus</code> object that contains information about the status of your
     * <code>RestoreTableFromSnapshot</code> request.
     * </p>
     */
    private TableRestoreStatus tableRestoreStatus;

    /**
     * <p>
     * The returned <code>TableRestoreStatus</code> object that contains information about the status of your
     * <code>RestoreTableFromSnapshot</code> request.
     * </p>
     * 
     * @param tableRestoreStatus
     *        The returned <code>TableRestoreStatus</code> object that contains information about the status of your
     *        <code>RestoreTableFromSnapshot</code> request.
     */

    public void setTableRestoreStatus(TableRestoreStatus tableRestoreStatus) {
        this.tableRestoreStatus = tableRestoreStatus;
    }

    /**
     * <p>
     * The returned <code>TableRestoreStatus</code> object that contains information about the status of your
     * <code>RestoreTableFromSnapshot</code> request.
     * </p>
     * 
     * @return The returned <code>TableRestoreStatus</code> object that contains information about the status of your
     *         <code>RestoreTableFromSnapshot</code> request.
     */

    public TableRestoreStatus getTableRestoreStatus() {
        return this.tableRestoreStatus;
    }

    /**
     * <p>
     * The returned <code>TableRestoreStatus</code> object that contains information about the status of your
     * <code>RestoreTableFromSnapshot</code> request.
     * </p>
     * 
     * @param tableRestoreStatus
     *        The returned <code>TableRestoreStatus</code> object that contains information about the status of your
     *        <code>RestoreTableFromSnapshot</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableRestoreStatusResult withTableRestoreStatus(TableRestoreStatus tableRestoreStatus) {
        setTableRestoreStatus(tableRestoreStatus);
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
        if (getTableRestoreStatus() != null)
            sb.append("TableRestoreStatus: ").append(getTableRestoreStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableRestoreStatusResult == false)
            return false;
        GetTableRestoreStatusResult other = (GetTableRestoreStatusResult) obj;
        if (other.getTableRestoreStatus() == null ^ this.getTableRestoreStatus() == null)
            return false;
        if (other.getTableRestoreStatus() != null && other.getTableRestoreStatus().equals(this.getTableRestoreStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableRestoreStatus() == null) ? 0 : getTableRestoreStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetTableRestoreStatusResult clone() {
        try {
            return (GetTableRestoreStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

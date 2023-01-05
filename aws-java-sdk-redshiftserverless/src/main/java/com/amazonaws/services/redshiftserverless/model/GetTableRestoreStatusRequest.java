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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetTableRestoreStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableRestoreStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the <code>RestoreTableFromSnapshot</code> request to return status for.
     * </p>
     */
    private String tableRestoreRequestId;

    /**
     * <p>
     * The ID of the <code>RestoreTableFromSnapshot</code> request to return status for.
     * </p>
     * 
     * @param tableRestoreRequestId
     *        The ID of the <code>RestoreTableFromSnapshot</code> request to return status for.
     */

    public void setTableRestoreRequestId(String tableRestoreRequestId) {
        this.tableRestoreRequestId = tableRestoreRequestId;
    }

    /**
     * <p>
     * The ID of the <code>RestoreTableFromSnapshot</code> request to return status for.
     * </p>
     * 
     * @return The ID of the <code>RestoreTableFromSnapshot</code> request to return status for.
     */

    public String getTableRestoreRequestId() {
        return this.tableRestoreRequestId;
    }

    /**
     * <p>
     * The ID of the <code>RestoreTableFromSnapshot</code> request to return status for.
     * </p>
     * 
     * @param tableRestoreRequestId
     *        The ID of the <code>RestoreTableFromSnapshot</code> request to return status for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableRestoreStatusRequest withTableRestoreRequestId(String tableRestoreRequestId) {
        setTableRestoreRequestId(tableRestoreRequestId);
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
        if (getTableRestoreRequestId() != null)
            sb.append("TableRestoreRequestId: ").append(getTableRestoreRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableRestoreStatusRequest == false)
            return false;
        GetTableRestoreStatusRequest other = (GetTableRestoreStatusRequest) obj;
        if (other.getTableRestoreRequestId() == null ^ this.getTableRestoreRequestId() == null)
            return false;
        if (other.getTableRestoreRequestId() != null && other.getTableRestoreRequestId().equals(this.getTableRestoreRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableRestoreRequestId() == null) ? 0 : getTableRestoreRequestId().hashCode());
        return hashCode;
    }

    @Override
    public GetTableRestoreStatusRequest clone() {
        return (GetTableRestoreStatusRequest) super.clone();
    }

}

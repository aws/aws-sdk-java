/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an <code>UpdateTimeToLive</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTimeToLive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTimeToLiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the table to be configured.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Represents the settings used to enable or disable Time to Live for the specified table.
     * </p>
     */
    private TimeToLiveSpecification timeToLiveSpecification;

    /**
     * <p>
     * The name of the table to be configured.
     * </p>
     * 
     * @param tableName
     *        The name of the table to be configured.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table to be configured.
     * </p>
     * 
     * @return The name of the table to be configured.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table to be configured.
     * </p>
     * 
     * @param tableName
     *        The name of the table to be configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimeToLiveRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Represents the settings used to enable or disable Time to Live for the specified table.
     * </p>
     * 
     * @param timeToLiveSpecification
     *        Represents the settings used to enable or disable Time to Live for the specified table.
     */

    public void setTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable or disable Time to Live for the specified table.
     * </p>
     * 
     * @return Represents the settings used to enable or disable Time to Live for the specified table.
     */

    public TimeToLiveSpecification getTimeToLiveSpecification() {
        return this.timeToLiveSpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable or disable Time to Live for the specified table.
     * </p>
     * 
     * @param timeToLiveSpecification
     *        Represents the settings used to enable or disable Time to Live for the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimeToLiveRequest withTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        setTimeToLiveSpecification(timeToLiveSpecification);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTimeToLiveSpecification() != null)
            sb.append("TimeToLiveSpecification: ").append(getTimeToLiveSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTimeToLiveRequest == false)
            return false;
        UpdateTimeToLiveRequest other = (UpdateTimeToLiveRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTimeToLiveSpecification() == null ^ this.getTimeToLiveSpecification() == null)
            return false;
        if (other.getTimeToLiveSpecification() != null && other.getTimeToLiveSpecification().equals(this.getTimeToLiveSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTimeToLiveSpecification() == null) ? 0 : getTimeToLiveSpecification().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTimeToLiveRequest clone() {
        return (UpdateTimeToLiveRequest) super.clone();
    }

}

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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateContinuousBackups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContinuousBackupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Represents the settings used to enable point in time recovery.
     * </p>
     */
    private PointInTimeRecoverySpecification pointInTimeRecoverySpecification;

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContinuousBackupsRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Represents the settings used to enable point in time recovery.
     * </p>
     * 
     * @param pointInTimeRecoverySpecification
     *        Represents the settings used to enable point in time recovery.
     */

    public void setPointInTimeRecoverySpecification(PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable point in time recovery.
     * </p>
     * 
     * @return Represents the settings used to enable point in time recovery.
     */

    public PointInTimeRecoverySpecification getPointInTimeRecoverySpecification() {
        return this.pointInTimeRecoverySpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable point in time recovery.
     * </p>
     * 
     * @param pointInTimeRecoverySpecification
     *        Represents the settings used to enable point in time recovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContinuousBackupsRequest withPointInTimeRecoverySpecification(PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        setPointInTimeRecoverySpecification(pointInTimeRecoverySpecification);
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
        if (getPointInTimeRecoverySpecification() != null)
            sb.append("PointInTimeRecoverySpecification: ").append(getPointInTimeRecoverySpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContinuousBackupsRequest == false)
            return false;
        UpdateContinuousBackupsRequest other = (UpdateContinuousBackupsRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getPointInTimeRecoverySpecification() == null ^ this.getPointInTimeRecoverySpecification() == null)
            return false;
        if (other.getPointInTimeRecoverySpecification() != null
                && other.getPointInTimeRecoverySpecification().equals(this.getPointInTimeRecoverySpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getPointInTimeRecoverySpecification() == null) ? 0 : getPointInTimeRecoverySpecification().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContinuousBackupsRequest clone() {
        return (UpdateContinuousBackupsRequest) super.clone();
    }

}

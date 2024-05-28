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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the errors that occurred during the analysis of the source database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/BatchStartRecommendationsErrorEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStartRecommendationsErrorEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the source database.
     * </p>
     */
    private String databaseId;
    /**
     * <p>
     * The information about the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The code of an error that occurred during the analysis of the source database.
     * </p>
     */
    private String code;

    /**
     * <p>
     * The identifier of the source database.
     * </p>
     * 
     * @param databaseId
     *        The identifier of the source database.
     */

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * <p>
     * The identifier of the source database.
     * </p>
     * 
     * @return The identifier of the source database.
     */

    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * <p>
     * The identifier of the source database.
     * </p>
     * 
     * @param databaseId
     *        The identifier of the source database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartRecommendationsErrorEntry withDatabaseId(String databaseId) {
        setDatabaseId(databaseId);
        return this;
    }

    /**
     * <p>
     * The information about the error.
     * </p>
     * 
     * @param message
     *        The information about the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The information about the error.
     * </p>
     * 
     * @return The information about the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The information about the error.
     * </p>
     * 
     * @param message
     *        The information about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartRecommendationsErrorEntry withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The code of an error that occurred during the analysis of the source database.
     * </p>
     * 
     * @param code
     *        The code of an error that occurred during the analysis of the source database.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code of an error that occurred during the analysis of the source database.
     * </p>
     * 
     * @return The code of an error that occurred during the analysis of the source database.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code of an error that occurred during the analysis of the source database.
     * </p>
     * 
     * @param code
     *        The code of an error that occurred during the analysis of the source database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartRecommendationsErrorEntry withCode(String code) {
        setCode(code);
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
        if (getDatabaseId() != null)
            sb.append("DatabaseId: ").append(getDatabaseId()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStartRecommendationsErrorEntry == false)
            return false;
        BatchStartRecommendationsErrorEntry other = (BatchStartRecommendationsErrorEntry) obj;
        if (other.getDatabaseId() == null ^ this.getDatabaseId() == null)
            return false;
        if (other.getDatabaseId() != null && other.getDatabaseId().equals(this.getDatabaseId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseId() == null) ? 0 : getDatabaseId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public BatchStartRecommendationsErrorEntry clone() {
        try {
            return (BatchStartRecommendationsErrorEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.BatchStartRecommendationsErrorEntryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

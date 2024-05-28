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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an update to a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DatasetUpdateSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetUpdateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema that replaced the previous schema of the dataset.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The status of the dataset update.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If updating a dataset fails, provides the reason why.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset update.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The last update date and time (in Unix time) of the dataset.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema that replaced the previous schema of the dataset.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema that replaced the previous schema of the dataset.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema that replaced the previous schema of the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schema that replaced the previous schema of the dataset.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema that replaced the previous schema of the dataset.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema that replaced the previous schema of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetUpdateSummary withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The status of the dataset update.
     * </p>
     * 
     * @param status
     *        The status of the dataset update.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset update.
     * </p>
     * 
     * @return The status of the dataset update.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the dataset update.
     * </p>
     * 
     * @param status
     *        The status of the dataset update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetUpdateSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If updating a dataset fails, provides the reason why.
     * </p>
     * 
     * @param failureReason
     *        If updating a dataset fails, provides the reason why.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If updating a dataset fails, provides the reason why.
     * </p>
     * 
     * @return If updating a dataset fails, provides the reason why.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If updating a dataset fails, provides the reason why.
     * </p>
     * 
     * @param failureReason
     *        If updating a dataset fails, provides the reason why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetUpdateSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset update.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the dataset update.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset update.
     * </p>
     * 
     * @return The creation date and time (in Unix time) of the dataset update.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset update.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the dataset update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetUpdateSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The last update date and time (in Unix time) of the dataset.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last update date and time (in Unix time) of the dataset.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last update date and time (in Unix time) of the dataset.
     * </p>
     * 
     * @return The last update date and time (in Unix time) of the dataset.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last update date and time (in Unix time) of the dataset.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last update date and time (in Unix time) of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetUpdateSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetUpdateSummary == false)
            return false;
        DatasetUpdateSummary other = (DatasetUpdateSummary) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DatasetUpdateSummary clone() {
        try {
            return (DatasetUpdateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.DatasetUpdateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

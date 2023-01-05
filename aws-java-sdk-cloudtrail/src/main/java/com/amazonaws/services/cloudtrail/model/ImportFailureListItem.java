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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an import failure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ImportFailureListItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportFailureListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the failure in the S3 bucket.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The status of the import.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of import error.
     * </p>
     */
    private String errorType;
    /**
     * <p>
     * Provides the reason the import failed.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * When the import was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The location of the failure in the S3 bucket.
     * </p>
     * 
     * @param location
     *        The location of the failure in the S3 bucket.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the failure in the S3 bucket.
     * </p>
     * 
     * @return The location of the failure in the S3 bucket.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the failure in the S3 bucket.
     * </p>
     * 
     * @param location
     *        The location of the failure in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFailureListItem withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param status
     *        The status of the import.
     * @see ImportFailureStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @return The status of the import.
     * @see ImportFailureStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param status
     *        The status of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportFailureStatus
     */

    public ImportFailureListItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param status
     *        The status of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportFailureStatus
     */

    public ImportFailureListItem withStatus(ImportFailureStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of import error.
     * </p>
     * 
     * @param errorType
     *        The type of import error.
     */

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * <p>
     * The type of import error.
     * </p>
     * 
     * @return The type of import error.
     */

    public String getErrorType() {
        return this.errorType;
    }

    /**
     * <p>
     * The type of import error.
     * </p>
     * 
     * @param errorType
     *        The type of import error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFailureListItem withErrorType(String errorType) {
        setErrorType(errorType);
        return this;
    }

    /**
     * <p>
     * Provides the reason the import failed.
     * </p>
     * 
     * @param errorMessage
     *        Provides the reason the import failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Provides the reason the import failed.
     * </p>
     * 
     * @return Provides the reason the import failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Provides the reason the import failed.
     * </p>
     * 
     * @param errorMessage
     *        Provides the reason the import failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFailureListItem withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * When the import was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the import was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * When the import was last updated.
     * </p>
     * 
     * @return When the import was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * When the import was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the import was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFailureListItem withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorType() != null)
            sb.append("ErrorType: ").append(getErrorType()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportFailureListItem == false)
            return false;
        ImportFailureListItem other = (ImportFailureListItem) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorType() == null ^ this.getErrorType() == null)
            return false;
        if (other.getErrorType() != null && other.getErrorType().equals(this.getErrorType()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ImportFailureListItem clone() {
        try {
            return (ImportFailureListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.ImportFailureListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

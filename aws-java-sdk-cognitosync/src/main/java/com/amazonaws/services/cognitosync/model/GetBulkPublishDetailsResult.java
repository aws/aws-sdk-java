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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * The output for the GetBulkPublishDetails operation.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetBulkPublishDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBulkPublishDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     */
    private String identityPoolId;
    /** The date/time at which the last bulk publish was initiated. */
    private java.util.Date bulkPublishStartTime;
    /** If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed. */
    private java.util.Date bulkPublishCompleteTime;
    /**
     * Status of the last bulk publish operation, valid values are:
     * <p>
     * NOT_STARTED - No bulk publish has been requested for this identity pool
     * </p>
     * <p>
     * IN_PROGRESS - Data is being published to the configured stream
     * </p>
     * <p>
     * SUCCEEDED - All data for the identity pool has been published to the configured stream
     * </p>
     * <p>
     * FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     * </p>
     */
    private String bulkPublishStatus;
    /** If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to fail. */
    private String failureMessage;

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkPublishDetailsResult withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * The date/time at which the last bulk publish was initiated.
     * 
     * @param bulkPublishStartTime
     *        The date/time at which the last bulk publish was initiated.
     */

    public void setBulkPublishStartTime(java.util.Date bulkPublishStartTime) {
        this.bulkPublishStartTime = bulkPublishStartTime;
    }

    /**
     * The date/time at which the last bulk publish was initiated.
     * 
     * @return The date/time at which the last bulk publish was initiated.
     */

    public java.util.Date getBulkPublishStartTime() {
        return this.bulkPublishStartTime;
    }

    /**
     * The date/time at which the last bulk publish was initiated.
     * 
     * @param bulkPublishStartTime
     *        The date/time at which the last bulk publish was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkPublishDetailsResult withBulkPublishStartTime(java.util.Date bulkPublishStartTime) {
        setBulkPublishStartTime(bulkPublishStartTime);
        return this;
    }

    /**
     * If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
     * 
     * @param bulkPublishCompleteTime
     *        If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
     */

    public void setBulkPublishCompleteTime(java.util.Date bulkPublishCompleteTime) {
        this.bulkPublishCompleteTime = bulkPublishCompleteTime;
    }

    /**
     * If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
     * 
     * @return If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
     */

    public java.util.Date getBulkPublishCompleteTime() {
        return this.bulkPublishCompleteTime;
    }

    /**
     * If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
     * 
     * @param bulkPublishCompleteTime
     *        If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkPublishDetailsResult withBulkPublishCompleteTime(java.util.Date bulkPublishCompleteTime) {
        setBulkPublishCompleteTime(bulkPublishCompleteTime);
        return this;
    }

    /**
     * Status of the last bulk publish operation, valid values are:
     * <p>
     * NOT_STARTED - No bulk publish has been requested for this identity pool
     * </p>
     * <p>
     * IN_PROGRESS - Data is being published to the configured stream
     * </p>
     * <p>
     * SUCCEEDED - All data for the identity pool has been published to the configured stream
     * </p>
     * <p>
     * FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     * </p>
     * 
     * @param bulkPublishStatus
     *        Status of the last bulk publish operation, valid values are:
     *        <p>
     *        NOT_STARTED - No bulk publish has been requested for this identity pool
     *        </p>
     *        <p>
     *        IN_PROGRESS - Data is being published to the configured stream
     *        </p>
     *        <p>
     *        SUCCEEDED - All data for the identity pool has been published to the configured stream
     *        </p>
     *        <p>
     *        FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     *        </p>
     * @see BulkPublishStatus
     */

    public void setBulkPublishStatus(String bulkPublishStatus) {
        this.bulkPublishStatus = bulkPublishStatus;
    }

    /**
     * Status of the last bulk publish operation, valid values are:
     * <p>
     * NOT_STARTED - No bulk publish has been requested for this identity pool
     * </p>
     * <p>
     * IN_PROGRESS - Data is being published to the configured stream
     * </p>
     * <p>
     * SUCCEEDED - All data for the identity pool has been published to the configured stream
     * </p>
     * <p>
     * FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     * </p>
     * 
     * @return Status of the last bulk publish operation, valid values are:
     *         <p>
     *         NOT_STARTED - No bulk publish has been requested for this identity pool
     *         </p>
     *         <p>
     *         IN_PROGRESS - Data is being published to the configured stream
     *         </p>
     *         <p>
     *         SUCCEEDED - All data for the identity pool has been published to the configured stream
     *         </p>
     *         <p>
     *         FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     *         </p>
     * @see BulkPublishStatus
     */

    public String getBulkPublishStatus() {
        return this.bulkPublishStatus;
    }

    /**
     * Status of the last bulk publish operation, valid values are:
     * <p>
     * NOT_STARTED - No bulk publish has been requested for this identity pool
     * </p>
     * <p>
     * IN_PROGRESS - Data is being published to the configured stream
     * </p>
     * <p>
     * SUCCEEDED - All data for the identity pool has been published to the configured stream
     * </p>
     * <p>
     * FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     * </p>
     * 
     * @param bulkPublishStatus
     *        Status of the last bulk publish operation, valid values are:
     *        <p>
     *        NOT_STARTED - No bulk publish has been requested for this identity pool
     *        </p>
     *        <p>
     *        IN_PROGRESS - Data is being published to the configured stream
     *        </p>
     *        <p>
     *        SUCCEEDED - All data for the identity pool has been published to the configured stream
     *        </p>
     *        <p>
     *        FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BulkPublishStatus
     */

    public GetBulkPublishDetailsResult withBulkPublishStatus(String bulkPublishStatus) {
        setBulkPublishStatus(bulkPublishStatus);
        return this;
    }

    /**
     * Status of the last bulk publish operation, valid values are:
     * <p>
     * NOT_STARTED - No bulk publish has been requested for this identity pool
     * </p>
     * <p>
     * IN_PROGRESS - Data is being published to the configured stream
     * </p>
     * <p>
     * SUCCEEDED - All data for the identity pool has been published to the configured stream
     * </p>
     * <p>
     * FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     * </p>
     * 
     * @param bulkPublishStatus
     *        Status of the last bulk publish operation, valid values are:
     *        <p>
     *        NOT_STARTED - No bulk publish has been requested for this identity pool
     *        </p>
     *        <p>
     *        IN_PROGRESS - Data is being published to the configured stream
     *        </p>
     *        <p>
     *        SUCCEEDED - All data for the identity pool has been published to the configured stream
     *        </p>
     *        <p>
     *        FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     *        </p>
     * @see BulkPublishStatus
     */

    public void setBulkPublishStatus(BulkPublishStatus bulkPublishStatus) {
        withBulkPublishStatus(bulkPublishStatus);
    }

    /**
     * Status of the last bulk publish operation, valid values are:
     * <p>
     * NOT_STARTED - No bulk publish has been requested for this identity pool
     * </p>
     * <p>
     * IN_PROGRESS - Data is being published to the configured stream
     * </p>
     * <p>
     * SUCCEEDED - All data for the identity pool has been published to the configured stream
     * </p>
     * <p>
     * FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     * </p>
     * 
     * @param bulkPublishStatus
     *        Status of the last bulk publish operation, valid values are:
     *        <p>
     *        NOT_STARTED - No bulk publish has been requested for this identity pool
     *        </p>
     *        <p>
     *        IN_PROGRESS - Data is being published to the configured stream
     *        </p>
     *        <p>
     *        SUCCEEDED - All data for the identity pool has been published to the configured stream
     *        </p>
     *        <p>
     *        FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BulkPublishStatus
     */

    public GetBulkPublishDetailsResult withBulkPublishStatus(BulkPublishStatus bulkPublishStatus) {
        this.bulkPublishStatus = bulkPublishStatus.toString();
        return this;
    }

    /**
     * If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to fail.
     * 
     * @param failureMessage
     *        If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to
     *        fail.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to fail.
     * 
     * @return If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to
     *         fail.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to fail.
     * 
     * @param failureMessage
     *        If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to
     *        fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBulkPublishDetailsResult withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getBulkPublishStartTime() != null)
            sb.append("BulkPublishStartTime: ").append(getBulkPublishStartTime()).append(",");
        if (getBulkPublishCompleteTime() != null)
            sb.append("BulkPublishCompleteTime: ").append(getBulkPublishCompleteTime()).append(",");
        if (getBulkPublishStatus() != null)
            sb.append("BulkPublishStatus: ").append(getBulkPublishStatus()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBulkPublishDetailsResult == false)
            return false;
        GetBulkPublishDetailsResult other = (GetBulkPublishDetailsResult) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getBulkPublishStartTime() == null ^ this.getBulkPublishStartTime() == null)
            return false;
        if (other.getBulkPublishStartTime() != null && other.getBulkPublishStartTime().equals(this.getBulkPublishStartTime()) == false)
            return false;
        if (other.getBulkPublishCompleteTime() == null ^ this.getBulkPublishCompleteTime() == null)
            return false;
        if (other.getBulkPublishCompleteTime() != null && other.getBulkPublishCompleteTime().equals(this.getBulkPublishCompleteTime()) == false)
            return false;
        if (other.getBulkPublishStatus() == null ^ this.getBulkPublishStatus() == null)
            return false;
        if (other.getBulkPublishStatus() != null && other.getBulkPublishStatus().equals(this.getBulkPublishStatus()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getBulkPublishStartTime() == null) ? 0 : getBulkPublishStartTime().hashCode());
        hashCode = prime * hashCode + ((getBulkPublishCompleteTime() == null) ? 0 : getBulkPublishCompleteTime().hashCode());
        hashCode = prime * hashCode + ((getBulkPublishStatus() == null) ? 0 : getBulkPublishStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetBulkPublishDetailsResult clone() {
        try {
            return (GetBulkPublishDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

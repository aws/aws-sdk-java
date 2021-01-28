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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteOTAUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the OTA update to delete.
     * </p>
     */
    private String otaUpdateId;
    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored if the
     * stream specified in the OTAUpdate is supplied by the user.
     * </p>
     */
    private Boolean deleteStream;
    /**
     * <p>
     * When true, deletes the AWS job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise, if the
     * job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is false.
     * </p>
     */
    private Boolean forceDeleteAWSJob;

    /**
     * <p>
     * The ID of the OTA update to delete.
     * </p>
     * 
     * @param otaUpdateId
     *        The ID of the OTA update to delete.
     */

    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The ID of the OTA update to delete.
     * </p>
     * 
     * @return The ID of the OTA update to delete.
     */

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    /**
     * <p>
     * The ID of the OTA update to delete.
     * </p>
     * 
     * @param otaUpdateId
     *        The ID of the OTA update to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOTAUpdateRequest withOtaUpdateId(String otaUpdateId) {
        setOtaUpdateId(otaUpdateId);
        return this;
    }

    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored if the
     * stream specified in the OTAUpdate is supplied by the user.
     * </p>
     * 
     * @param deleteStream
     *        When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored
     *        if the stream specified in the OTAUpdate is supplied by the user.
     */

    public void setDeleteStream(Boolean deleteStream) {
        this.deleteStream = deleteStream;
    }

    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored if the
     * stream specified in the OTAUpdate is supplied by the user.
     * </p>
     * 
     * @return When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored
     *         if the stream specified in the OTAUpdate is supplied by the user.
     */

    public Boolean getDeleteStream() {
        return this.deleteStream;
    }

    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored if the
     * stream specified in the OTAUpdate is supplied by the user.
     * </p>
     * 
     * @param deleteStream
     *        When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored
     *        if the stream specified in the OTAUpdate is supplied by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOTAUpdateRequest withDeleteStream(Boolean deleteStream) {
        setDeleteStream(deleteStream);
        return this;
    }

    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored if the
     * stream specified in the OTAUpdate is supplied by the user.
     * </p>
     * 
     * @return When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored
     *         if the stream specified in the OTAUpdate is supplied by the user.
     */

    public Boolean isDeleteStream() {
        return this.deleteStream;
    }

    /**
     * <p>
     * When true, deletes the AWS job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise, if the
     * job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is false.
     * </p>
     * 
     * @param forceDeleteAWSJob
     *        When true, deletes the AWS job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise, if
     *        the job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is
     *        false.
     */

    public void setForceDeleteAWSJob(Boolean forceDeleteAWSJob) {
        this.forceDeleteAWSJob = forceDeleteAWSJob;
    }

    /**
     * <p>
     * When true, deletes the AWS job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise, if the
     * job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is false.
     * </p>
     * 
     * @return When true, deletes the AWS job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise,
     *         if the job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is
     *         false.
     */

    public Boolean getForceDeleteAWSJob() {
        return this.forceDeleteAWSJob;
    }

    /**
     * <p>
     * When true, deletes the AWS job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise, if the
     * job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is false.
     * </p>
     * 
     * @param forceDeleteAWSJob
     *        When true, deletes the AWS job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise, if
     *        the job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is
     *        false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOTAUpdateRequest withForceDeleteAWSJob(Boolean forceDeleteAWSJob) {
        setForceDeleteAWSJob(forceDeleteAWSJob);
        return this;
    }

    /**
     * <p>
     * When true, deletes the AWS job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise, if the
     * job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is false.
     * </p>
     * 
     * @return When true, deletes the AWS job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise,
     *         if the job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is
     *         false.
     */

    public Boolean isForceDeleteAWSJob() {
        return this.forceDeleteAWSJob;
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
        if (getOtaUpdateId() != null)
            sb.append("OtaUpdateId: ").append(getOtaUpdateId()).append(",");
        if (getDeleteStream() != null)
            sb.append("DeleteStream: ").append(getDeleteStream()).append(",");
        if (getForceDeleteAWSJob() != null)
            sb.append("ForceDeleteAWSJob: ").append(getForceDeleteAWSJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteOTAUpdateRequest == false)
            return false;
        DeleteOTAUpdateRequest other = (DeleteOTAUpdateRequest) obj;
        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getDeleteStream() == null ^ this.getDeleteStream() == null)
            return false;
        if (other.getDeleteStream() != null && other.getDeleteStream().equals(this.getDeleteStream()) == false)
            return false;
        if (other.getForceDeleteAWSJob() == null ^ this.getForceDeleteAWSJob() == null)
            return false;
        if (other.getForceDeleteAWSJob() != null && other.getForceDeleteAWSJob().equals(this.getForceDeleteAWSJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtaUpdateId() == null) ? 0 : getOtaUpdateId().hashCode());
        hashCode = prime * hashCode + ((getDeleteStream() == null) ? 0 : getDeleteStream().hashCode());
        hashCode = prime * hashCode + ((getForceDeleteAWSJob() == null) ? 0 : getForceDeleteAWSJob().hashCode());
        return hashCode;
    }

    @Override
    public DeleteOTAUpdateRequest clone() {
        return (DeleteOTAUpdateRequest) super.clone();
    }

}

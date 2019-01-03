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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOTAUpdateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The OTA update ID.
     * </p>
     */
    private String otaUpdateId;
    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     */
    private String awsIotJobId;
    /**
     * <p>
     * The OTA update ARN.
     * </p>
     */
    private String otaUpdateArn;
    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     */
    private String awsIotJobArn;
    /**
     * <p>
     * The OTA update status.
     * </p>
     */
    private String otaUpdateStatus;

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * 
     * @param otaUpdateId
     *        The OTA update ID.
     */

    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * 
     * @return The OTA update ID.
     */

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * 
     * @param otaUpdateId
     *        The OTA update ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateResult withOtaUpdateId(String otaUpdateId) {
        setOtaUpdateId(otaUpdateId);
        return this;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     * 
     * @param awsIotJobId
     *        The AWS IoT job ID associated with the OTA update.
     */

    public void setAwsIotJobId(String awsIotJobId) {
        this.awsIotJobId = awsIotJobId;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     * 
     * @return The AWS IoT job ID associated with the OTA update.
     */

    public String getAwsIotJobId() {
        return this.awsIotJobId;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     * 
     * @param awsIotJobId
     *        The AWS IoT job ID associated with the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateResult withAwsIotJobId(String awsIotJobId) {
        setAwsIotJobId(awsIotJobId);
        return this;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * 
     * @param otaUpdateArn
     *        The OTA update ARN.
     */

    public void setOtaUpdateArn(String otaUpdateArn) {
        this.otaUpdateArn = otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * 
     * @return The OTA update ARN.
     */

    public String getOtaUpdateArn() {
        return this.otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * 
     * @param otaUpdateArn
     *        The OTA update ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateResult withOtaUpdateArn(String otaUpdateArn) {
        setOtaUpdateArn(otaUpdateArn);
        return this;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     * 
     * @param awsIotJobArn
     *        The AWS IoT job ARN associated with the OTA update.
     */

    public void setAwsIotJobArn(String awsIotJobArn) {
        this.awsIotJobArn = awsIotJobArn;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     * 
     * @return The AWS IoT job ARN associated with the OTA update.
     */

    public String getAwsIotJobArn() {
        return this.awsIotJobArn;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     * 
     * @param awsIotJobArn
     *        The AWS IoT job ARN associated with the OTA update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOTAUpdateResult withAwsIotJobArn(String awsIotJobArn) {
        setAwsIotJobArn(awsIotJobArn);
        return this;
    }

    /**
     * <p>
     * The OTA update status.
     * </p>
     * 
     * @param otaUpdateStatus
     *        The OTA update status.
     * @see OTAUpdateStatus
     */

    public void setOtaUpdateStatus(String otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus;
    }

    /**
     * <p>
     * The OTA update status.
     * </p>
     * 
     * @return The OTA update status.
     * @see OTAUpdateStatus
     */

    public String getOtaUpdateStatus() {
        return this.otaUpdateStatus;
    }

    /**
     * <p>
     * The OTA update status.
     * </p>
     * 
     * @param otaUpdateStatus
     *        The OTA update status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OTAUpdateStatus
     */

    public CreateOTAUpdateResult withOtaUpdateStatus(String otaUpdateStatus) {
        setOtaUpdateStatus(otaUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The OTA update status.
     * </p>
     * 
     * @param otaUpdateStatus
     *        The OTA update status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OTAUpdateStatus
     */

    public CreateOTAUpdateResult withOtaUpdateStatus(OTAUpdateStatus otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus.toString();
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
        if (getOtaUpdateId() != null)
            sb.append("OtaUpdateId: ").append(getOtaUpdateId()).append(",");
        if (getAwsIotJobId() != null)
            sb.append("AwsIotJobId: ").append(getAwsIotJobId()).append(",");
        if (getOtaUpdateArn() != null)
            sb.append("OtaUpdateArn: ").append(getOtaUpdateArn()).append(",");
        if (getAwsIotJobArn() != null)
            sb.append("AwsIotJobArn: ").append(getAwsIotJobArn()).append(",");
        if (getOtaUpdateStatus() != null)
            sb.append("OtaUpdateStatus: ").append(getOtaUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOTAUpdateResult == false)
            return false;
        CreateOTAUpdateResult other = (CreateOTAUpdateResult) obj;
        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getAwsIotJobId() == null ^ this.getAwsIotJobId() == null)
            return false;
        if (other.getAwsIotJobId() != null && other.getAwsIotJobId().equals(this.getAwsIotJobId()) == false)
            return false;
        if (other.getOtaUpdateArn() == null ^ this.getOtaUpdateArn() == null)
            return false;
        if (other.getOtaUpdateArn() != null && other.getOtaUpdateArn().equals(this.getOtaUpdateArn()) == false)
            return false;
        if (other.getAwsIotJobArn() == null ^ this.getAwsIotJobArn() == null)
            return false;
        if (other.getAwsIotJobArn() != null && other.getAwsIotJobArn().equals(this.getAwsIotJobArn()) == false)
            return false;
        if (other.getOtaUpdateStatus() == null ^ this.getOtaUpdateStatus() == null)
            return false;
        if (other.getOtaUpdateStatus() != null && other.getOtaUpdateStatus().equals(this.getOtaUpdateStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtaUpdateId() == null) ? 0 : getOtaUpdateId().hashCode());
        hashCode = prime * hashCode + ((getAwsIotJobId() == null) ? 0 : getAwsIotJobId().hashCode());
        hashCode = prime * hashCode + ((getOtaUpdateArn() == null) ? 0 : getOtaUpdateArn().hashCode());
        hashCode = prime * hashCode + ((getAwsIotJobArn() == null) ? 0 : getAwsIotJobArn().hashCode());
        hashCode = prime * hashCode + ((getOtaUpdateStatus() == null) ? 0 : getOtaUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateOTAUpdateResult clone() {
        try {
            return (CreateOTAUpdateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

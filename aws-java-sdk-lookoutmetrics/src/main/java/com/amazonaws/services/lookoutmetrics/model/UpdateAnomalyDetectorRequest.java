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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateAnomalyDetector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnomalyDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the detector to update.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS KMS encryption key.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The updated detector description.
     * </p>
     */
    private String anomalyDetectorDescription;
    /**
     * <p>
     * Contains information about the configuration to which the detector will be updated.
     * </p>
     */
    private AnomalyDetectorConfig anomalyDetectorConfig;

    /**
     * <p>
     * The ARN of the detector to update.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector to update.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector to update.
     * </p>
     * 
     * @return The ARN of the detector to update.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector to update.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyDetectorRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS KMS encryption key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of an AWS KMS encryption key.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS KMS encryption key.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS KMS encryption key.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS KMS encryption key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of an AWS KMS encryption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyDetectorRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The updated detector description.
     * </p>
     * 
     * @param anomalyDetectorDescription
     *        The updated detector description.
     */

    public void setAnomalyDetectorDescription(String anomalyDetectorDescription) {
        this.anomalyDetectorDescription = anomalyDetectorDescription;
    }

    /**
     * <p>
     * The updated detector description.
     * </p>
     * 
     * @return The updated detector description.
     */

    public String getAnomalyDetectorDescription() {
        return this.anomalyDetectorDescription;
    }

    /**
     * <p>
     * The updated detector description.
     * </p>
     * 
     * @param anomalyDetectorDescription
     *        The updated detector description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyDetectorRequest withAnomalyDetectorDescription(String anomalyDetectorDescription) {
        setAnomalyDetectorDescription(anomalyDetectorDescription);
        return this;
    }

    /**
     * <p>
     * Contains information about the configuration to which the detector will be updated.
     * </p>
     * 
     * @param anomalyDetectorConfig
     *        Contains information about the configuration to which the detector will be updated.
     */

    public void setAnomalyDetectorConfig(AnomalyDetectorConfig anomalyDetectorConfig) {
        this.anomalyDetectorConfig = anomalyDetectorConfig;
    }

    /**
     * <p>
     * Contains information about the configuration to which the detector will be updated.
     * </p>
     * 
     * @return Contains information about the configuration to which the detector will be updated.
     */

    public AnomalyDetectorConfig getAnomalyDetectorConfig() {
        return this.anomalyDetectorConfig;
    }

    /**
     * <p>
     * Contains information about the configuration to which the detector will be updated.
     * </p>
     * 
     * @param anomalyDetectorConfig
     *        Contains information about the configuration to which the detector will be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyDetectorRequest withAnomalyDetectorConfig(AnomalyDetectorConfig anomalyDetectorConfig) {
        setAnomalyDetectorConfig(anomalyDetectorConfig);
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
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getAnomalyDetectorDescription() != null)
            sb.append("AnomalyDetectorDescription: ").append(getAnomalyDetectorDescription()).append(",");
        if (getAnomalyDetectorConfig() != null)
            sb.append("AnomalyDetectorConfig: ").append(getAnomalyDetectorConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAnomalyDetectorRequest == false)
            return false;
        UpdateAnomalyDetectorRequest other = (UpdateAnomalyDetectorRequest) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getAnomalyDetectorDescription() == null ^ this.getAnomalyDetectorDescription() == null)
            return false;
        if (other.getAnomalyDetectorDescription() != null && other.getAnomalyDetectorDescription().equals(this.getAnomalyDetectorDescription()) == false)
            return false;
        if (other.getAnomalyDetectorConfig() == null ^ this.getAnomalyDetectorConfig() == null)
            return false;
        if (other.getAnomalyDetectorConfig() != null && other.getAnomalyDetectorConfig().equals(this.getAnomalyDetectorConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorDescription() == null) ? 0 : getAnomalyDetectorDescription().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorConfig() == null) ? 0 : getAnomalyDetectorConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnomalyDetectorRequest clone() {
        return (UpdateAnomalyDetectorRequest) super.clone();
    }

}

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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * UpdateDetector request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID of the detector that you want to update. */
    private String detectorId;
    /** Updated boolean value for the detector that specifies whether the detector is enabled. */
    private Boolean enable;
    /** A enum value that specifies how frequently customer got Finding updates published. */
    private String findingPublishingFrequency;

    /**
     * The unique ID of the detector that you want to update.
     * 
     * @param detectorId
     *        The unique ID of the detector that you want to update.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The unique ID of the detector that you want to update.
     * 
     * @return The unique ID of the detector that you want to update.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The unique ID of the detector that you want to update.
     * 
     * @param detectorId
     *        The unique ID of the detector that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * Updated boolean value for the detector that specifies whether the detector is enabled.
     * 
     * @param enable
     *        Updated boolean value for the detector that specifies whether the detector is enabled.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * Updated boolean value for the detector that specifies whether the detector is enabled.
     * 
     * @return Updated boolean value for the detector that specifies whether the detector is enabled.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * Updated boolean value for the detector that specifies whether the detector is enabled.
     * 
     * @param enable
     *        Updated boolean value for the detector that specifies whether the detector is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * Updated boolean value for the detector that specifies whether the detector is enabled.
     * 
     * @return Updated boolean value for the detector that specifies whether the detector is enabled.
     */

    public Boolean isEnable() {
        return this.enable;
    }

    /**
     * A enum value that specifies how frequently customer got Finding updates published.
     * 
     * @param findingPublishingFrequency
     *        A enum value that specifies how frequently customer got Finding updates published.
     * @see FindingPublishingFrequency
     */

    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * A enum value that specifies how frequently customer got Finding updates published.
     * 
     * @return A enum value that specifies how frequently customer got Finding updates published.
     * @see FindingPublishingFrequency
     */

    public String getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }

    /**
     * A enum value that specifies how frequently customer got Finding updates published.
     * 
     * @param findingPublishingFrequency
     *        A enum value that specifies how frequently customer got Finding updates published.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public UpdateDetectorRequest withFindingPublishingFrequency(String findingPublishingFrequency) {
        setFindingPublishingFrequency(findingPublishingFrequency);
        return this;
    }

    /**
     * A enum value that specifies how frequently customer got Finding updates published.
     * 
     * @param findingPublishingFrequency
     *        A enum value that specifies how frequently customer got Finding updates published.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public UpdateDetectorRequest withFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getEnable() != null)
            sb.append("Enable: ").append(getEnable()).append(",");
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: ").append(getFindingPublishingFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDetectorRequest == false)
            return false;
        UpdateDetectorRequest other = (UpdateDetectorRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null && other.getFindingPublishingFrequency().equals(this.getFindingPublishingFrequency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        hashCode = prime * hashCode + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDetectorRequest clone() {
        return (UpdateDetectorRequest) super.clone();
    }

}

/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteThreatIntelSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteThreatIntelSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the detector the threatIntelSet is associated with.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The unique ID of the threatIntelSet you want to delete.
     * </p>
     */
    private String threatIntelSetId;

    /**
     * <p>
     * The unique ID of the detector the threatIntelSet is associated with.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector the threatIntelSet is associated with.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector the threatIntelSet is associated with.
     * </p>
     * 
     * @return The unique ID of the detector the threatIntelSet is associated with.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector the threatIntelSet is associated with.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector the threatIntelSet is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteThreatIntelSetRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The unique ID of the threatIntelSet you want to delete.
     * </p>
     * 
     * @param threatIntelSetId
     *        The unique ID of the threatIntelSet you want to delete.
     */

    public void setThreatIntelSetId(String threatIntelSetId) {
        this.threatIntelSetId = threatIntelSetId;
    }

    /**
     * <p>
     * The unique ID of the threatIntelSet you want to delete.
     * </p>
     * 
     * @return The unique ID of the threatIntelSet you want to delete.
     */

    public String getThreatIntelSetId() {
        return this.threatIntelSetId;
    }

    /**
     * <p>
     * The unique ID of the threatIntelSet you want to delete.
     * </p>
     * 
     * @param threatIntelSetId
     *        The unique ID of the threatIntelSet you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteThreatIntelSetRequest withThreatIntelSetId(String threatIntelSetId) {
        setThreatIntelSetId(threatIntelSetId);
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
        if (getThreatIntelSetId() != null)
            sb.append("ThreatIntelSetId: ").append(getThreatIntelSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteThreatIntelSetRequest == false)
            return false;
        DeleteThreatIntelSetRequest other = (DeleteThreatIntelSetRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getThreatIntelSetId() == null ^ this.getThreatIntelSetId() == null)
            return false;
        if (other.getThreatIntelSetId() != null && other.getThreatIntelSetId().equals(this.getThreatIntelSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getThreatIntelSetId() == null) ? 0 : getThreatIntelSetId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteThreatIntelSetRequest clone() {
        return (DeleteThreatIntelSetRequest) super.clone();
    }

}

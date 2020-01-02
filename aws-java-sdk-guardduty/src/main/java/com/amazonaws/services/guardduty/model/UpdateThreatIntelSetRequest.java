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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateThreatIntelSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThreatIntelSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The unique ID that specifies the ThreatIntelSet that you want to update.
     * </p>
     */
    private String threatIntelSetId;
    /**
     * <p>
     * The unique ID that specifies the ThreatIntelSet that you want to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated URI of the file that contains the ThreateIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * </p>
     */
    private String location;
    /**
     * <p>
     * The updated boolean value that specifies whether the ThreateIntelSet is active or not.
     * </p>
     */
    private Boolean activate;

    /**
     * <p>
     * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
     * </p>
     * 
     * @param detectorId
     *        The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
     * </p>
     * 
     * @return The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
     * </p>
     * 
     * @param detectorId
     *        The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThreatIntelSetRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The unique ID that specifies the ThreatIntelSet that you want to update.
     * </p>
     * 
     * @param threatIntelSetId
     *        The unique ID that specifies the ThreatIntelSet that you want to update.
     */

    public void setThreatIntelSetId(String threatIntelSetId) {
        this.threatIntelSetId = threatIntelSetId;
    }

    /**
     * <p>
     * The unique ID that specifies the ThreatIntelSet that you want to update.
     * </p>
     * 
     * @return The unique ID that specifies the ThreatIntelSet that you want to update.
     */

    public String getThreatIntelSetId() {
        return this.threatIntelSetId;
    }

    /**
     * <p>
     * The unique ID that specifies the ThreatIntelSet that you want to update.
     * </p>
     * 
     * @param threatIntelSetId
     *        The unique ID that specifies the ThreatIntelSet that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThreatIntelSetRequest withThreatIntelSetId(String threatIntelSetId) {
        setThreatIntelSetId(threatIntelSetId);
        return this;
    }

    /**
     * <p>
     * The unique ID that specifies the ThreatIntelSet that you want to update.
     * </p>
     * 
     * @param name
     *        The unique ID that specifies the ThreatIntelSet that you want to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique ID that specifies the ThreatIntelSet that you want to update.
     * </p>
     * 
     * @return The unique ID that specifies the ThreatIntelSet that you want to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique ID that specifies the ThreatIntelSet that you want to update.
     * </p>
     * 
     * @param name
     *        The unique ID that specifies the ThreatIntelSet that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThreatIntelSetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated URI of the file that contains the ThreateIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * </p>
     * 
     * @param location
     *        The updated URI of the file that contains the ThreateIntelSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The updated URI of the file that contains the ThreateIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * </p>
     * 
     * @return The updated URI of the file that contains the ThreateIntelSet. For example
     *         (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The updated URI of the file that contains the ThreateIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * </p>
     * 
     * @param location
     *        The updated URI of the file that contains the ThreateIntelSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThreatIntelSetRequest withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The updated boolean value that specifies whether the ThreateIntelSet is active or not.
     * </p>
     * 
     * @param activate
     *        The updated boolean value that specifies whether the ThreateIntelSet is active or not.
     */

    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    /**
     * <p>
     * The updated boolean value that specifies whether the ThreateIntelSet is active or not.
     * </p>
     * 
     * @return The updated boolean value that specifies whether the ThreateIntelSet is active or not.
     */

    public Boolean getActivate() {
        return this.activate;
    }

    /**
     * <p>
     * The updated boolean value that specifies whether the ThreateIntelSet is active or not.
     * </p>
     * 
     * @param activate
     *        The updated boolean value that specifies whether the ThreateIntelSet is active or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThreatIntelSetRequest withActivate(Boolean activate) {
        setActivate(activate);
        return this;
    }

    /**
     * <p>
     * The updated boolean value that specifies whether the ThreateIntelSet is active or not.
     * </p>
     * 
     * @return The updated boolean value that specifies whether the ThreateIntelSet is active or not.
     */

    public Boolean isActivate() {
        return this.activate;
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
            sb.append("ThreatIntelSetId: ").append(getThreatIntelSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getActivate() != null)
            sb.append("Activate: ").append(getActivate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThreatIntelSetRequest == false)
            return false;
        UpdateThreatIntelSetRequest other = (UpdateThreatIntelSetRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getThreatIntelSetId() == null ^ this.getThreatIntelSetId() == null)
            return false;
        if (other.getThreatIntelSetId() != null && other.getThreatIntelSetId().equals(this.getThreatIntelSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getActivate() == null ^ this.getActivate() == null)
            return false;
        if (other.getActivate() != null && other.getActivate().equals(this.getActivate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getThreatIntelSetId() == null) ? 0 : getThreatIntelSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getActivate() == null) ? 0 : getActivate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThreatIntelSetRequest clone() {
        return (UpdateThreatIntelSetRequest) super.clone();
    }

}

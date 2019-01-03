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
 * UpdateIPSet request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateIPSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIPSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The updated boolean value that specifies whether the IPSet is active or not. */
    private Boolean activate;
    /** The detectorID that specifies the GuardDuty service whose IPSet you want to update. */
    private String detectorId;
    /** The unique ID that specifies the IPSet that you want to update. */
    private String ipSetId;
    /**
     * The updated URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     */
    private String location;
    /** The unique ID that specifies the IPSet that you want to update. */
    private String name;

    /**
     * The updated boolean value that specifies whether the IPSet is active or not.
     * 
     * @param activate
     *        The updated boolean value that specifies whether the IPSet is active or not.
     */

    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    /**
     * The updated boolean value that specifies whether the IPSet is active or not.
     * 
     * @return The updated boolean value that specifies whether the IPSet is active or not.
     */

    public Boolean getActivate() {
        return this.activate;
    }

    /**
     * The updated boolean value that specifies whether the IPSet is active or not.
     * 
     * @param activate
     *        The updated boolean value that specifies whether the IPSet is active or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withActivate(Boolean activate) {
        setActivate(activate);
        return this;
    }

    /**
     * The updated boolean value that specifies whether the IPSet is active or not.
     * 
     * @return The updated boolean value that specifies whether the IPSet is active or not.
     */

    public Boolean isActivate() {
        return this.activate;
    }

    /**
     * The detectorID that specifies the GuardDuty service whose IPSet you want to update.
     * 
     * @param detectorId
     *        The detectorID that specifies the GuardDuty service whose IPSet you want to update.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The detectorID that specifies the GuardDuty service whose IPSet you want to update.
     * 
     * @return The detectorID that specifies the GuardDuty service whose IPSet you want to update.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The detectorID that specifies the GuardDuty service whose IPSet you want to update.
     * 
     * @param detectorId
     *        The detectorID that specifies the GuardDuty service whose IPSet you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * The unique ID that specifies the IPSet that you want to update.
     * 
     * @param ipSetId
     *        The unique ID that specifies the IPSet that you want to update.
     */

    public void setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
    }

    /**
     * The unique ID that specifies the IPSet that you want to update.
     * 
     * @return The unique ID that specifies the IPSet that you want to update.
     */

    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * The unique ID that specifies the IPSet that you want to update.
     * 
     * @param ipSetId
     *        The unique ID that specifies the IPSet that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withIpSetId(String ipSetId) {
        setIpSetId(ipSetId);
        return this;
    }

    /**
     * The updated URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * 
     * @param location
     *        The updated URI of the file that contains the IPSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * The updated URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * 
     * @return The updated URI of the file that contains the IPSet. For example
     *         (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * The updated URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * 
     * @param location
     *        The updated URI of the file that contains the IPSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * The unique ID that specifies the IPSet that you want to update.
     * 
     * @param name
     *        The unique ID that specifies the IPSet that you want to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The unique ID that specifies the IPSet that you want to update.
     * 
     * @return The unique ID that specifies the IPSet that you want to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The unique ID that specifies the IPSet that you want to update.
     * 
     * @param name
     *        The unique ID that specifies the IPSet that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIPSetRequest withName(String name) {
        setName(name);
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
        if (getActivate() != null)
            sb.append("Activate: ").append(getActivate()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getIpSetId() != null)
            sb.append("IpSetId: ").append(getIpSetId()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIPSetRequest == false)
            return false;
        UpdateIPSetRequest other = (UpdateIPSetRequest) obj;
        if (other.getActivate() == null ^ this.getActivate() == null)
            return false;
        if (other.getActivate() != null && other.getActivate().equals(this.getActivate()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getIpSetId() == null ^ this.getIpSetId() == null)
            return false;
        if (other.getIpSetId() != null && other.getIpSetId().equals(this.getIpSetId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivate() == null) ? 0 : getActivate().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getIpSetId() == null) ? 0 : getIpSetId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIPSetRequest clone() {
        return (UpdateIPSetRequest) super.clone();
    }

}

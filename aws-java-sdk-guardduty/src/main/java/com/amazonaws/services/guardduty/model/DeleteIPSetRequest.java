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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteIPSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIPSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The detectorID that specifies the GuardDuty service whose IPSet you want to delete. */
    private String detectorId;
    /** The unique ID that specifies the IPSet that you want to delete. */
    private String ipSetId;

    /**
     * The detectorID that specifies the GuardDuty service whose IPSet you want to delete.
     * 
     * @param detectorId
     *        The detectorID that specifies the GuardDuty service whose IPSet you want to delete.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The detectorID that specifies the GuardDuty service whose IPSet you want to delete.
     * 
     * @return The detectorID that specifies the GuardDuty service whose IPSet you want to delete.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The detectorID that specifies the GuardDuty service whose IPSet you want to delete.
     * 
     * @param detectorId
     *        The detectorID that specifies the GuardDuty service whose IPSet you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIPSetRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * The unique ID that specifies the IPSet that you want to delete.
     * 
     * @param ipSetId
     *        The unique ID that specifies the IPSet that you want to delete.
     */

    public void setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
    }

    /**
     * The unique ID that specifies the IPSet that you want to delete.
     * 
     * @return The unique ID that specifies the IPSet that you want to delete.
     */

    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * The unique ID that specifies the IPSet that you want to delete.
     * 
     * @param ipSetId
     *        The unique ID that specifies the IPSet that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIPSetRequest withIpSetId(String ipSetId) {
        setIpSetId(ipSetId);
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
        if (getIpSetId() != null)
            sb.append("IpSetId: ").append(getIpSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIPSetRequest == false)
            return false;
        DeleteIPSetRequest other = (DeleteIPSetRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getIpSetId() == null ^ this.getIpSetId() == null)
            return false;
        if (other.getIpSetId() != null && other.getIpSetId().equals(this.getIpSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getIpSetId() == null) ? 0 : getIpSetId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIPSetRequest clone() {
        return (DeleteIPSetRequest) super.clone();
    }

}

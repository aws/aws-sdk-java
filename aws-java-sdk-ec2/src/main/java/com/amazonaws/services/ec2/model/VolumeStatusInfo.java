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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the status of a volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VolumeStatusInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeStatusInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the volume status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeStatusDetails> details;
    /**
     * <p>
     * The status of the volume.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The details of the volume status.
     * </p>
     * 
     * @return The details of the volume status.
     */

    public java.util.List<VolumeStatusDetails> getDetails() {
        if (details == null) {
            details = new com.amazonaws.internal.SdkInternalList<VolumeStatusDetails>();
        }
        return details;
    }

    /**
     * <p>
     * The details of the volume status.
     * </p>
     * 
     * @param details
     *        The details of the volume status.
     */

    public void setDetails(java.util.Collection<VolumeStatusDetails> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new com.amazonaws.internal.SdkInternalList<VolumeStatusDetails>(details);
    }

    /**
     * <p>
     * The details of the volume status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetails(java.util.Collection)} or {@link #withDetails(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param details
     *        The details of the volume status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusInfo withDetails(VolumeStatusDetails... details) {
        if (this.details == null) {
            setDetails(new com.amazonaws.internal.SdkInternalList<VolumeStatusDetails>(details.length));
        }
        for (VolumeStatusDetails ele : details) {
            this.details.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the volume status.
     * </p>
     * 
     * @param details
     *        The details of the volume status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusInfo withDetails(java.util.Collection<VolumeStatusDetails> details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * 
     * @param status
     *        The status of the volume.
     * @see VolumeStatusInfoStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * 
     * @return The status of the volume.
     * @see VolumeStatusInfoStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * 
     * @param status
     *        The status of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeStatusInfoStatus
     */

    public VolumeStatusInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * 
     * @param status
     *        The status of the volume.
     * @see VolumeStatusInfoStatus
     */

    public void setStatus(VolumeStatusInfoStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * 
     * @param status
     *        The status of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeStatusInfoStatus
     */

    public VolumeStatusInfo withStatus(VolumeStatusInfoStatus status) {
        this.status = status.toString();
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatusInfo == false)
            return false;
        VolumeStatusInfo other = (VolumeStatusInfo) obj;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public VolumeStatusInfo clone() {
        try {
            return (VolumeStatusInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

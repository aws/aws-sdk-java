/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Represents the latest successful monitor deployment of a signal map.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/SuccessfulMonitorDeployment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuccessfulMonitorDeployment implements Serializable, Cloneable, StructuredPojo {

    /** URI associated with a signal map's monitor deployment. */
    private String detailsUri;

    private String status;

    /**
     * URI associated with a signal map's monitor deployment.
     * 
     * @param detailsUri
     *        URI associated with a signal map's monitor deployment.
     */

    public void setDetailsUri(String detailsUri) {
        this.detailsUri = detailsUri;
    }

    /**
     * URI associated with a signal map's monitor deployment.
     * 
     * @return URI associated with a signal map's monitor deployment.
     */

    public String getDetailsUri() {
        return this.detailsUri;
    }

    /**
     * URI associated with a signal map's monitor deployment.
     * 
     * @param detailsUri
     *        URI associated with a signal map's monitor deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuccessfulMonitorDeployment withDetailsUri(String detailsUri) {
        setDetailsUri(detailsUri);
        return this;
    }

    /**
     * @param status
     * @see SignalMapMonitorDeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see SignalMapMonitorDeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalMapMonitorDeploymentStatus
     */

    public SuccessfulMonitorDeployment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalMapMonitorDeploymentStatus
     */

    public SuccessfulMonitorDeployment withStatus(SignalMapMonitorDeploymentStatus status) {
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
        if (getDetailsUri() != null)
            sb.append("DetailsUri: ").append(getDetailsUri()).append(",");
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

        if (obj instanceof SuccessfulMonitorDeployment == false)
            return false;
        SuccessfulMonitorDeployment other = (SuccessfulMonitorDeployment) obj;
        if (other.getDetailsUri() == null ^ this.getDetailsUri() == null)
            return false;
        if (other.getDetailsUri() != null && other.getDetailsUri().equals(this.getDetailsUri()) == false)
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

        hashCode = prime * hashCode + ((getDetailsUri() == null) ? 0 : getDetailsUri().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SuccessfulMonitorDeployment clone() {
        try {
            return (SuccessfulMonitorDeployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.SuccessfulMonitorDeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about a server certificate.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerCertificateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     */
    private String serverCertificateArn;
    /**
     * <p>
     * The status of the server certificate.
     * </p>
     */
    private String serverCertificateStatus;
    /**
     * <p>
     * Details that explain the status of the server certificate.
     * </p>
     */
    private String serverCertificateStatusDetail;

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate.
     */

    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * 
     * @return The ARN of the server certificate.
     */

    public String getServerCertificateArn() {
        return this.serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateSummary withServerCertificateArn(String serverCertificateArn) {
        setServerCertificateArn(serverCertificateArn);
        return this;
    }

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * 
     * @param serverCertificateStatus
     *        The status of the server certificate.
     * @see ServerCertificateStatus
     */

    public void setServerCertificateStatus(String serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus;
    }

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * 
     * @return The status of the server certificate.
     * @see ServerCertificateStatus
     */

    public String getServerCertificateStatus() {
        return this.serverCertificateStatus;
    }

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * 
     * @param serverCertificateStatus
     *        The status of the server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerCertificateStatus
     */

    public ServerCertificateSummary withServerCertificateStatus(String serverCertificateStatus) {
        setServerCertificateStatus(serverCertificateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * 
     * @param serverCertificateStatus
     *        The status of the server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerCertificateStatus
     */

    public ServerCertificateSummary withServerCertificateStatus(ServerCertificateStatus serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details that explain the status of the server certificate.
     * </p>
     * 
     * @param serverCertificateStatusDetail
     *        Details that explain the status of the server certificate.
     */

    public void setServerCertificateStatusDetail(String serverCertificateStatusDetail) {
        this.serverCertificateStatusDetail = serverCertificateStatusDetail;
    }

    /**
     * <p>
     * Details that explain the status of the server certificate.
     * </p>
     * 
     * @return Details that explain the status of the server certificate.
     */

    public String getServerCertificateStatusDetail() {
        return this.serverCertificateStatusDetail;
    }

    /**
     * <p>
     * Details that explain the status of the server certificate.
     * </p>
     * 
     * @param serverCertificateStatusDetail
     *        Details that explain the status of the server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateSummary withServerCertificateStatusDetail(String serverCertificateStatusDetail) {
        setServerCertificateStatusDetail(serverCertificateStatusDetail);
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
        if (getServerCertificateArn() != null)
            sb.append("ServerCertificateArn: ").append(getServerCertificateArn()).append(",");
        if (getServerCertificateStatus() != null)
            sb.append("ServerCertificateStatus: ").append(getServerCertificateStatus()).append(",");
        if (getServerCertificateStatusDetail() != null)
            sb.append("ServerCertificateStatusDetail: ").append(getServerCertificateStatusDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificateSummary == false)
            return false;
        ServerCertificateSummary other = (ServerCertificateSummary) obj;
        if (other.getServerCertificateArn() == null ^ this.getServerCertificateArn() == null)
            return false;
        if (other.getServerCertificateArn() != null && other.getServerCertificateArn().equals(this.getServerCertificateArn()) == false)
            return false;
        if (other.getServerCertificateStatus() == null ^ this.getServerCertificateStatus() == null)
            return false;
        if (other.getServerCertificateStatus() != null && other.getServerCertificateStatus().equals(this.getServerCertificateStatus()) == false)
            return false;
        if (other.getServerCertificateStatusDetail() == null ^ this.getServerCertificateStatusDetail() == null)
            return false;
        if (other.getServerCertificateStatusDetail() != null
                && other.getServerCertificateStatusDetail().equals(this.getServerCertificateStatusDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateStatus() == null) ? 0 : getServerCertificateStatus().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateStatusDetail() == null) ? 0 : getServerCertificateStatusDetail().hashCode());
        return hashCode;
    }

    @Override
    public ServerCertificateSummary clone() {
        try {
            return (ServerCertificateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ServerCertificateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.iotsecuretunneling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the tunnel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/TunnelSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TunnelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique alpha-numeric identifier for the tunnel.
     * </p>
     */
    private String tunnelId;
    /**
     * <p>
     * The Amazon Resource Name of the tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     */
    private String tunnelArn;
    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description of the tunnel.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time the tunnel was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time the tunnel was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The unique alpha-numeric identifier for the tunnel.
     * </p>
     * 
     * @param tunnelId
     *        The unique alpha-numeric identifier for the tunnel.
     */

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    /**
     * <p>
     * The unique alpha-numeric identifier for the tunnel.
     * </p>
     * 
     * @return The unique alpha-numeric identifier for the tunnel.
     */

    public String getTunnelId() {
        return this.tunnelId;
    }

    /**
     * <p>
     * The unique alpha-numeric identifier for the tunnel.
     * </p>
     * 
     * @param tunnelId
     *        The unique alpha-numeric identifier for the tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelSummary withTunnelId(String tunnelId) {
        setTunnelId(tunnelId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     * 
     * @param tunnelArn
     *        The Amazon Resource Name of the tunnel. The tunnel ARN format is
     *        <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     */

    public void setTunnelArn(String tunnelArn) {
        this.tunnelArn = tunnelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     * 
     * @return The Amazon Resource Name of the tunnel. The tunnel ARN format is
     *         <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     */

    public String getTunnelArn() {
        return this.tunnelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     * 
     * @param tunnelArn
     *        The Amazon Resource Name of the tunnel. The tunnel ARN format is
     *        <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelSummary withTunnelArn(String tunnelArn) {
        setTunnelArn(tunnelArn);
        return this;
    }

    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     * 
     * @param status
     *        The status of a tunnel. Valid values are: Open and Closed.
     * @see TunnelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     * 
     * @return The status of a tunnel. Valid values are: Open and Closed.
     * @see TunnelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     * 
     * @param status
     *        The status of a tunnel. Valid values are: Open and Closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TunnelStatus
     */

    public TunnelSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     * 
     * @param status
     *        The status of a tunnel. Valid values are: Open and Closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TunnelStatus
     */

    public TunnelSummary withStatus(TunnelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the tunnel.
     * </p>
     * 
     * @param description
     *        A description of the tunnel.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the tunnel.
     * </p>
     * 
     * @return A description of the tunnel.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the tunnel.
     * </p>
     * 
     * @param description
     *        A description of the tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time the tunnel was created.
     * </p>
     * 
     * @param createdAt
     *        The time the tunnel was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time the tunnel was created.
     * </p>
     * 
     * @return The time the tunnel was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time the tunnel was created.
     * </p>
     * 
     * @param createdAt
     *        The time the tunnel was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time the tunnel was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time the tunnel was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time the tunnel was last updated.
     * </p>
     * 
     * @return The time the tunnel was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time the tunnel was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time the tunnel was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getTunnelId() != null)
            sb.append("TunnelId: ").append(getTunnelId()).append(",");
        if (getTunnelArn() != null)
            sb.append("TunnelArn: ").append(getTunnelArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TunnelSummary == false)
            return false;
        TunnelSummary other = (TunnelSummary) obj;
        if (other.getTunnelId() == null ^ this.getTunnelId() == null)
            return false;
        if (other.getTunnelId() != null && other.getTunnelId().equals(this.getTunnelId()) == false)
            return false;
        if (other.getTunnelArn() == null ^ this.getTunnelArn() == null)
            return false;
        if (other.getTunnelArn() != null && other.getTunnelArn().equals(this.getTunnelArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTunnelId() == null) ? 0 : getTunnelId().hashCode());
        hashCode = prime * hashCode + ((getTunnelArn() == null) ? 0 : getTunnelArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public TunnelSummary clone() {
        try {
            return (TunnelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsecuretunneling.model.transform.TunnelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

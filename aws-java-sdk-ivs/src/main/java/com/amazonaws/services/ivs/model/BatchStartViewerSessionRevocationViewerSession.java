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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A viewer session to revoke in the call to <a>BatchStartViewerSessionRevocation</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchStartViewerSessionRevocationViewerSession"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStartViewerSessionRevocationViewerSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the channel associated with the viewer session to revoke.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ID of the viewer associated with the viewer session to revoke. Do not use this field for personally
     * identifying, confidential, or sensitive information.
     * </p>
     */
    private String viewerId;
    /**
     * <p>
     * An optional filter on which versions of the viewer session to revoke. All versions less than or equal to the
     * specified version will be revoked. Default: 0.
     * </p>
     */
    private Integer viewerSessionVersionsLessThanOrEqualTo;

    /**
     * <p>
     * The ARN of the channel associated with the viewer session to revoke.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel associated with the viewer session to revoke.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel associated with the viewer session to revoke.
     * </p>
     * 
     * @return The ARN of the channel associated with the viewer session to revoke.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel associated with the viewer session to revoke.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel associated with the viewer session to revoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartViewerSessionRevocationViewerSession withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ID of the viewer associated with the viewer session to revoke. Do not use this field for personally
     * identifying, confidential, or sensitive information.
     * </p>
     * 
     * @param viewerId
     *        The ID of the viewer associated with the viewer session to revoke. Do not use this field for personally
     *        identifying, confidential, or sensitive information.
     */

    public void setViewerId(String viewerId) {
        this.viewerId = viewerId;
    }

    /**
     * <p>
     * The ID of the viewer associated with the viewer session to revoke. Do not use this field for personally
     * identifying, confidential, or sensitive information.
     * </p>
     * 
     * @return The ID of the viewer associated with the viewer session to revoke. Do not use this field for personally
     *         identifying, confidential, or sensitive information.
     */

    public String getViewerId() {
        return this.viewerId;
    }

    /**
     * <p>
     * The ID of the viewer associated with the viewer session to revoke. Do not use this field for personally
     * identifying, confidential, or sensitive information.
     * </p>
     * 
     * @param viewerId
     *        The ID of the viewer associated with the viewer session to revoke. Do not use this field for personally
     *        identifying, confidential, or sensitive information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartViewerSessionRevocationViewerSession withViewerId(String viewerId) {
        setViewerId(viewerId);
        return this;
    }

    /**
     * <p>
     * An optional filter on which versions of the viewer session to revoke. All versions less than or equal to the
     * specified version will be revoked. Default: 0.
     * </p>
     * 
     * @param viewerSessionVersionsLessThanOrEqualTo
     *        An optional filter on which versions of the viewer session to revoke. All versions less than or equal to
     *        the specified version will be revoked. Default: 0.
     */

    public void setViewerSessionVersionsLessThanOrEqualTo(Integer viewerSessionVersionsLessThanOrEqualTo) {
        this.viewerSessionVersionsLessThanOrEqualTo = viewerSessionVersionsLessThanOrEqualTo;
    }

    /**
     * <p>
     * An optional filter on which versions of the viewer session to revoke. All versions less than or equal to the
     * specified version will be revoked. Default: 0.
     * </p>
     * 
     * @return An optional filter on which versions of the viewer session to revoke. All versions less than or equal to
     *         the specified version will be revoked. Default: 0.
     */

    public Integer getViewerSessionVersionsLessThanOrEqualTo() {
        return this.viewerSessionVersionsLessThanOrEqualTo;
    }

    /**
     * <p>
     * An optional filter on which versions of the viewer session to revoke. All versions less than or equal to the
     * specified version will be revoked. Default: 0.
     * </p>
     * 
     * @param viewerSessionVersionsLessThanOrEqualTo
     *        An optional filter on which versions of the viewer session to revoke. All versions less than or equal to
     *        the specified version will be revoked. Default: 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartViewerSessionRevocationViewerSession withViewerSessionVersionsLessThanOrEqualTo(Integer viewerSessionVersionsLessThanOrEqualTo) {
        setViewerSessionVersionsLessThanOrEqualTo(viewerSessionVersionsLessThanOrEqualTo);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getViewerId() != null)
            sb.append("ViewerId: ").append(getViewerId()).append(",");
        if (getViewerSessionVersionsLessThanOrEqualTo() != null)
            sb.append("ViewerSessionVersionsLessThanOrEqualTo: ").append(getViewerSessionVersionsLessThanOrEqualTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStartViewerSessionRevocationViewerSession == false)
            return false;
        BatchStartViewerSessionRevocationViewerSession other = (BatchStartViewerSessionRevocationViewerSession) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getViewerId() == null ^ this.getViewerId() == null)
            return false;
        if (other.getViewerId() != null && other.getViewerId().equals(this.getViewerId()) == false)
            return false;
        if (other.getViewerSessionVersionsLessThanOrEqualTo() == null ^ this.getViewerSessionVersionsLessThanOrEqualTo() == null)
            return false;
        if (other.getViewerSessionVersionsLessThanOrEqualTo() != null
                && other.getViewerSessionVersionsLessThanOrEqualTo().equals(this.getViewerSessionVersionsLessThanOrEqualTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getViewerId() == null) ? 0 : getViewerId().hashCode());
        hashCode = prime * hashCode + ((getViewerSessionVersionsLessThanOrEqualTo() == null) ? 0 : getViewerSessionVersionsLessThanOrEqualTo().hashCode());
        return hashCode;
    }

    @Override
    public BatchStartViewerSessionRevocationViewerSession clone() {
        try {
            return (BatchStartViewerSessionRevocationViewerSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.BatchStartViewerSessionRevocationViewerSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

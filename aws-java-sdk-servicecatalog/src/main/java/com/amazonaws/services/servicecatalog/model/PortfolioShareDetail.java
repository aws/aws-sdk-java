/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the portfolio share.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/PortfolioShareDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortfolioShareDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the recipient entity that received the portfolio share. The recipient entities can be one of
     * the following:
     * </p>
     * <p>
     * 1. An external account.
     * </p>
     * <p>
     * 2. An organziation member account.
     * </p>
     * <p>
     * 3. An organzational unit (OU).
     * </p>
     * <p>
     * 4. The organization itself. (This shares with every account in the organization).
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The type of the portfolio share.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an
     * organization node, the share is automatically imported, and the field is always set to true.
     * </p>
     */
    private Boolean accepted;
    /**
     * <p>
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     * </p>
     */
    private Boolean shareTagOptions;

    /**
     * <p>
     * The identifier of the recipient entity that received the portfolio share. The recipient entities can be one of
     * the following:
     * </p>
     * <p>
     * 1. An external account.
     * </p>
     * <p>
     * 2. An organziation member account.
     * </p>
     * <p>
     * 3. An organzational unit (OU).
     * </p>
     * <p>
     * 4. The organization itself. (This shares with every account in the organization).
     * </p>
     * 
     * @param principalId
     *        The identifier of the recipient entity that received the portfolio share. The recipient entities can be
     *        one of the following: </p>
     *        <p>
     *        1. An external account.
     *        </p>
     *        <p>
     *        2. An organziation member account.
     *        </p>
     *        <p>
     *        3. An organzational unit (OU).
     *        </p>
     *        <p>
     *        4. The organization itself. (This shares with every account in the organization).
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The identifier of the recipient entity that received the portfolio share. The recipient entities can be one of
     * the following:
     * </p>
     * <p>
     * 1. An external account.
     * </p>
     * <p>
     * 2. An organziation member account.
     * </p>
     * <p>
     * 3. An organzational unit (OU).
     * </p>
     * <p>
     * 4. The organization itself. (This shares with every account in the organization).
     * </p>
     * 
     * @return The identifier of the recipient entity that received the portfolio share. The recipient entities can be
     *         one of the following: </p>
     *         <p>
     *         1. An external account.
     *         </p>
     *         <p>
     *         2. An organziation member account.
     *         </p>
     *         <p>
     *         3. An organzational unit (OU).
     *         </p>
     *         <p>
     *         4. The organization itself. (This shares with every account in the organization).
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The identifier of the recipient entity that received the portfolio share. The recipient entities can be one of
     * the following:
     * </p>
     * <p>
     * 1. An external account.
     * </p>
     * <p>
     * 2. An organziation member account.
     * </p>
     * <p>
     * 3. An organzational unit (OU).
     * </p>
     * <p>
     * 4. The organization itself. (This shares with every account in the organization).
     * </p>
     * 
     * @param principalId
     *        The identifier of the recipient entity that received the portfolio share. The recipient entities can be
     *        one of the following: </p>
     *        <p>
     *        1. An external account.
     *        </p>
     *        <p>
     *        2. An organziation member account.
     *        </p>
     *        <p>
     *        3. An organzational unit (OU).
     *        </p>
     *        <p>
     *        4. The organization itself. (This shares with every account in the organization).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortfolioShareDetail withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The type of the portfolio share.
     * </p>
     * 
     * @param type
     *        The type of the portfolio share.
     * @see DescribePortfolioShareType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the portfolio share.
     * </p>
     * 
     * @return The type of the portfolio share.
     * @see DescribePortfolioShareType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the portfolio share.
     * </p>
     * 
     * @param type
     *        The type of the portfolio share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribePortfolioShareType
     */

    public PortfolioShareDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the portfolio share.
     * </p>
     * 
     * @param type
     *        The type of the portfolio share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribePortfolioShareType
     */

    public PortfolioShareDetail withType(DescribePortfolioShareType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an
     * organization node, the share is automatically imported, and the field is always set to true.
     * </p>
     * 
     * @param accepted
     *        Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an
     *        organization node, the share is automatically imported, and the field is always set to true.
     */

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    /**
     * <p>
     * Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an
     * organization node, the share is automatically imported, and the field is always set to true.
     * </p>
     * 
     * @return Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an
     *         organization node, the share is automatically imported, and the field is always set to true.
     */

    public Boolean getAccepted() {
        return this.accepted;
    }

    /**
     * <p>
     * Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an
     * organization node, the share is automatically imported, and the field is always set to true.
     * </p>
     * 
     * @param accepted
     *        Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an
     *        organization node, the share is automatically imported, and the field is always set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortfolioShareDetail withAccepted(Boolean accepted) {
        setAccepted(accepted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an
     * organization node, the share is automatically imported, and the field is always set to true.
     * </p>
     * 
     * @return Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an
     *         organization node, the share is automatically imported, and the field is always set to true.
     */

    public Boolean isAccepted() {
        return this.accepted;
    }

    /**
     * <p>
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     * </p>
     * 
     * @param shareTagOptions
     *        Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     */

    public void setShareTagOptions(Boolean shareTagOptions) {
        this.shareTagOptions = shareTagOptions;
    }

    /**
     * <p>
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     * </p>
     * 
     * @return Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     */

    public Boolean getShareTagOptions() {
        return this.shareTagOptions;
    }

    /**
     * <p>
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     * </p>
     * 
     * @param shareTagOptions
     *        Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortfolioShareDetail withShareTagOptions(Boolean shareTagOptions) {
        setShareTagOptions(shareTagOptions);
        return this;
    }

    /**
     * <p>
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     * </p>
     * 
     * @return Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     */

    public Boolean isShareTagOptions() {
        return this.shareTagOptions;
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
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAccepted() != null)
            sb.append("Accepted: ").append(getAccepted()).append(",");
        if (getShareTagOptions() != null)
            sb.append("ShareTagOptions: ").append(getShareTagOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortfolioShareDetail == false)
            return false;
        PortfolioShareDetail other = (PortfolioShareDetail) obj;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAccepted() == null ^ this.getAccepted() == null)
            return false;
        if (other.getAccepted() != null && other.getAccepted().equals(this.getAccepted()) == false)
            return false;
        if (other.getShareTagOptions() == null ^ this.getShareTagOptions() == null)
            return false;
        if (other.getShareTagOptions() != null && other.getShareTagOptions().equals(this.getShareTagOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAccepted() == null) ? 0 : getAccepted().hashCode());
        hashCode = prime * hashCode + ((getShareTagOptions() == null) ? 0 : getShareTagOptions().hashCode());
        return hashCode;
    }

    @Override
    public PortfolioShareDetail clone() {
        try {
            return (PortfolioShareDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.PortfolioShareDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

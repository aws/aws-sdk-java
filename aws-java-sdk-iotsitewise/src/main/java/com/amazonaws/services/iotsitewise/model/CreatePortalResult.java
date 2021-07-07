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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePortal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePortalResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the created portal.
     * </p>
     */
    private String portalId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the portal,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     * </p>
     */
    private String portalArn;
    /**
     * <p>
     * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services
     * SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get
     * a URL that you can use to access the portal.
     * </p>
     */
    private String portalStartUrl;
    /**
     * <p>
     * The status of the portal, which contains a state (<code>CREATING</code> after successfully calling this
     * operation) and any error message.
     * </p>
     */
    private PortalStatus portalStatus;
    /**
     * <p>
     * The associated Amazon Web Services SSO application ID, if the portal uses Amazon Web Services SSO.
     * </p>
     */
    private String ssoApplicationId;

    /**
     * <p>
     * The ID of the created portal.
     * </p>
     * 
     * @param portalId
     *        The ID of the created portal.
     */

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    /**
     * <p>
     * The ID of the created portal.
     * </p>
     * 
     * @return The ID of the created portal.
     */

    public String getPortalId() {
        return this.portalId;
    }

    /**
     * <p>
     * The ID of the created portal.
     * </p>
     * 
     * @param portalId
     *        The ID of the created portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalResult withPortalId(String portalId) {
        setPortalId(portalId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the portal,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     * </p>
     * 
     * @param portalArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        portal, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     */

    public void setPortalArn(String portalArn) {
        this.portalArn = portalArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the portal,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         portal, which has the following format.</p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     */

    public String getPortalArn() {
        return this.portalArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the portal,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     * </p>
     * 
     * @param portalArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        portal, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalResult withPortalArn(String portalArn) {
        setPortalArn(portalArn);
        return this;
    }

    /**
     * <p>
     * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services
     * SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get
     * a URL that you can use to access the portal.
     * </p>
     * 
     * @param portalStartUrl
     *        The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web
     *        Services SSO for authentication. For portals that use IAM for authentication, you must use the IoT
     *        SiteWise console to get a URL that you can use to access the portal.
     */

    public void setPortalStartUrl(String portalStartUrl) {
        this.portalStartUrl = portalStartUrl;
    }

    /**
     * <p>
     * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services
     * SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get
     * a URL that you can use to access the portal.
     * </p>
     * 
     * @return The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web
     *         Services SSO for authentication. For portals that use IAM for authentication, you must use the IoT
     *         SiteWise console to get a URL that you can use to access the portal.
     */

    public String getPortalStartUrl() {
        return this.portalStartUrl;
    }

    /**
     * <p>
     * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services
     * SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get
     * a URL that you can use to access the portal.
     * </p>
     * 
     * @param portalStartUrl
     *        The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web
     *        Services SSO for authentication. For portals that use IAM for authentication, you must use the IoT
     *        SiteWise console to get a URL that you can use to access the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalResult withPortalStartUrl(String portalStartUrl) {
        setPortalStartUrl(portalStartUrl);
        return this;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>CREATING</code> after successfully calling this
     * operation) and any error message.
     * </p>
     * 
     * @param portalStatus
     *        The status of the portal, which contains a state (<code>CREATING</code> after successfully calling this
     *        operation) and any error message.
     */

    public void setPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>CREATING</code> after successfully calling this
     * operation) and any error message.
     * </p>
     * 
     * @return The status of the portal, which contains a state (<code>CREATING</code> after successfully calling this
     *         operation) and any error message.
     */

    public PortalStatus getPortalStatus() {
        return this.portalStatus;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>CREATING</code> after successfully calling this
     * operation) and any error message.
     * </p>
     * 
     * @param portalStatus
     *        The status of the portal, which contains a state (<code>CREATING</code> after successfully calling this
     *        operation) and any error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalResult withPortalStatus(PortalStatus portalStatus) {
        setPortalStatus(portalStatus);
        return this;
    }

    /**
     * <p>
     * The associated Amazon Web Services SSO application ID, if the portal uses Amazon Web Services SSO.
     * </p>
     * 
     * @param ssoApplicationId
     *        The associated Amazon Web Services SSO application ID, if the portal uses Amazon Web Services SSO.
     */

    public void setSsoApplicationId(String ssoApplicationId) {
        this.ssoApplicationId = ssoApplicationId;
    }

    /**
     * <p>
     * The associated Amazon Web Services SSO application ID, if the portal uses Amazon Web Services SSO.
     * </p>
     * 
     * @return The associated Amazon Web Services SSO application ID, if the portal uses Amazon Web Services SSO.
     */

    public String getSsoApplicationId() {
        return this.ssoApplicationId;
    }

    /**
     * <p>
     * The associated Amazon Web Services SSO application ID, if the portal uses Amazon Web Services SSO.
     * </p>
     * 
     * @param ssoApplicationId
     *        The associated Amazon Web Services SSO application ID, if the portal uses Amazon Web Services SSO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalResult withSsoApplicationId(String ssoApplicationId) {
        setSsoApplicationId(ssoApplicationId);
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
        if (getPortalId() != null)
            sb.append("PortalId: ").append(getPortalId()).append(",");
        if (getPortalArn() != null)
            sb.append("PortalArn: ").append(getPortalArn()).append(",");
        if (getPortalStartUrl() != null)
            sb.append("PortalStartUrl: ").append(getPortalStartUrl()).append(",");
        if (getPortalStatus() != null)
            sb.append("PortalStatus: ").append(getPortalStatus()).append(",");
        if (getSsoApplicationId() != null)
            sb.append("SsoApplicationId: ").append(getSsoApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePortalResult == false)
            return false;
        CreatePortalResult other = (CreatePortalResult) obj;
        if (other.getPortalId() == null ^ this.getPortalId() == null)
            return false;
        if (other.getPortalId() != null && other.getPortalId().equals(this.getPortalId()) == false)
            return false;
        if (other.getPortalArn() == null ^ this.getPortalArn() == null)
            return false;
        if (other.getPortalArn() != null && other.getPortalArn().equals(this.getPortalArn()) == false)
            return false;
        if (other.getPortalStartUrl() == null ^ this.getPortalStartUrl() == null)
            return false;
        if (other.getPortalStartUrl() != null && other.getPortalStartUrl().equals(this.getPortalStartUrl()) == false)
            return false;
        if (other.getPortalStatus() == null ^ this.getPortalStatus() == null)
            return false;
        if (other.getPortalStatus() != null && other.getPortalStatus().equals(this.getPortalStatus()) == false)
            return false;
        if (other.getSsoApplicationId() == null ^ this.getSsoApplicationId() == null)
            return false;
        if (other.getSsoApplicationId() != null && other.getSsoApplicationId().equals(this.getSsoApplicationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        hashCode = prime * hashCode + ((getPortalArn() == null) ? 0 : getPortalArn().hashCode());
        hashCode = prime * hashCode + ((getPortalStartUrl() == null) ? 0 : getPortalStartUrl().hashCode());
        hashCode = prime * hashCode + ((getPortalStatus() == null) ? 0 : getPortalStatus().hashCode());
        hashCode = prime * hashCode + ((getSsoApplicationId() == null) ? 0 : getSsoApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public CreatePortalResult clone() {
        try {
            return (CreatePortalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

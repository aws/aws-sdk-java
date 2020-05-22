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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribePortal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePortalResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the portal.
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
     * The name of the portal.
     * </p>
     */
    private String portalName;
    /**
     * <p>
     * The portal's description.
     * </p>
     */
    private String portalDescription;
    /**
     * <p>
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * </p>
     */
    private String portalClientId;
    /**
     * <p>
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     * </p>
     */
    private String portalStartUrl;
    /**
     * <p>
     * The AWS administrator's contact email address.
     * </p>
     */
    private String portalContactEmail;
    /**
     * <p>
     * The current status of the portal, which contains a state and any error message.
     * </p>
     */
    private PortalStatus portalStatus;
    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date portalCreationDate;
    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date portalLastUpdateDate;
    /**
     * <p>
     * The portal's logo image, which is available at a URL.
     * </p>
     */
    private ImageLocation portalLogoImageLocation;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service roles
     * for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The ID of the portal.
     * </p>
     * 
     * @param portalId
     *        The ID of the portal.
     */

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    /**
     * <p>
     * The ID of the portal.
     * </p>
     * 
     * @return The ID of the portal.
     */

    public String getPortalId() {
        return this.portalId;
    }

    /**
     * <p>
     * The ID of the portal.
     * </p>
     * 
     * @param portalId
     *        The ID of the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalId(String portalId) {
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

    public DescribePortalResult withPortalArn(String portalArn) {
        setPortalArn(portalArn);
        return this;
    }

    /**
     * <p>
     * The name of the portal.
     * </p>
     * 
     * @param portalName
     *        The name of the portal.
     */

    public void setPortalName(String portalName) {
        this.portalName = portalName;
    }

    /**
     * <p>
     * The name of the portal.
     * </p>
     * 
     * @return The name of the portal.
     */

    public String getPortalName() {
        return this.portalName;
    }

    /**
     * <p>
     * The name of the portal.
     * </p>
     * 
     * @param portalName
     *        The name of the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalName(String portalName) {
        setPortalName(portalName);
        return this;
    }

    /**
     * <p>
     * The portal's description.
     * </p>
     * 
     * @param portalDescription
     *        The portal's description.
     */

    public void setPortalDescription(String portalDescription) {
        this.portalDescription = portalDescription;
    }

    /**
     * <p>
     * The portal's description.
     * </p>
     * 
     * @return The portal's description.
     */

    public String getPortalDescription() {
        return this.portalDescription;
    }

    /**
     * <p>
     * The portal's description.
     * </p>
     * 
     * @param portalDescription
     *        The portal's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalDescription(String portalDescription) {
        setPortalDescription(portalDescription);
        return this;
    }

    /**
     * <p>
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * </p>
     * 
     * @param portalClientId
     *        The AWS SSO application generated client ID (used with AWS SSO APIs).
     */

    public void setPortalClientId(String portalClientId) {
        this.portalClientId = portalClientId;
    }

    /**
     * <p>
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * </p>
     * 
     * @return The AWS SSO application generated client ID (used with AWS SSO APIs).
     */

    public String getPortalClientId() {
        return this.portalClientId;
    }

    /**
     * <p>
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * </p>
     * 
     * @param portalClientId
     *        The AWS SSO application generated client ID (used with AWS SSO APIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalClientId(String portalClientId) {
        setPortalClientId(portalClientId);
        return this;
    }

    /**
     * <p>
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     * </p>
     * 
     * @param portalStartUrl
     *        The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     */

    public void setPortalStartUrl(String portalStartUrl) {
        this.portalStartUrl = portalStartUrl;
    }

    /**
     * <p>
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     * </p>
     * 
     * @return The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     */

    public String getPortalStartUrl() {
        return this.portalStartUrl;
    }

    /**
     * <p>
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     * </p>
     * 
     * @param portalStartUrl
     *        The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalStartUrl(String portalStartUrl) {
        setPortalStartUrl(portalStartUrl);
        return this;
    }

    /**
     * <p>
     * The AWS administrator's contact email address.
     * </p>
     * 
     * @param portalContactEmail
     *        The AWS administrator's contact email address.
     */

    public void setPortalContactEmail(String portalContactEmail) {
        this.portalContactEmail = portalContactEmail;
    }

    /**
     * <p>
     * The AWS administrator's contact email address.
     * </p>
     * 
     * @return The AWS administrator's contact email address.
     */

    public String getPortalContactEmail() {
        return this.portalContactEmail;
    }

    /**
     * <p>
     * The AWS administrator's contact email address.
     * </p>
     * 
     * @param portalContactEmail
     *        The AWS administrator's contact email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalContactEmail(String portalContactEmail) {
        setPortalContactEmail(portalContactEmail);
        return this;
    }

    /**
     * <p>
     * The current status of the portal, which contains a state and any error message.
     * </p>
     * 
     * @param portalStatus
     *        The current status of the portal, which contains a state and any error message.
     */

    public void setPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus;
    }

    /**
     * <p>
     * The current status of the portal, which contains a state and any error message.
     * </p>
     * 
     * @return The current status of the portal, which contains a state and any error message.
     */

    public PortalStatus getPortalStatus() {
        return this.portalStatus;
    }

    /**
     * <p>
     * The current status of the portal, which contains a state and any error message.
     * </p>
     * 
     * @param portalStatus
     *        The current status of the portal, which contains a state and any error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalStatus(PortalStatus portalStatus) {
        setPortalStatus(portalStatus);
        return this;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     * 
     * @param portalCreationDate
     *        The date the portal was created, in Unix epoch time.
     */

    public void setPortalCreationDate(java.util.Date portalCreationDate) {
        this.portalCreationDate = portalCreationDate;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the portal was created, in Unix epoch time.
     */

    public java.util.Date getPortalCreationDate() {
        return this.portalCreationDate;
    }

    /**
     * <p>
     * The date the portal was created, in Unix epoch time.
     * </p>
     * 
     * @param portalCreationDate
     *        The date the portal was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalCreationDate(java.util.Date portalCreationDate) {
        setPortalCreationDate(portalCreationDate);
        return this;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     * 
     * @param portalLastUpdateDate
     *        The date the portal was last updated, in Unix epoch time.
     */

    public void setPortalLastUpdateDate(java.util.Date portalLastUpdateDate) {
        this.portalLastUpdateDate = portalLastUpdateDate;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the portal was last updated, in Unix epoch time.
     */

    public java.util.Date getPortalLastUpdateDate() {
        return this.portalLastUpdateDate;
    }

    /**
     * <p>
     * The date the portal was last updated, in Unix epoch time.
     * </p>
     * 
     * @param portalLastUpdateDate
     *        The date the portal was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalLastUpdateDate(java.util.Date portalLastUpdateDate) {
        setPortalLastUpdateDate(portalLastUpdateDate);
        return this;
    }

    /**
     * <p>
     * The portal's logo image, which is available at a URL.
     * </p>
     * 
     * @param portalLogoImageLocation
     *        The portal's logo image, which is available at a URL.
     */

    public void setPortalLogoImageLocation(ImageLocation portalLogoImageLocation) {
        this.portalLogoImageLocation = portalLogoImageLocation;
    }

    /**
     * <p>
     * The portal's logo image, which is available at a URL.
     * </p>
     * 
     * @return The portal's logo image, which is available at a URL.
     */

    public ImageLocation getPortalLogoImageLocation() {
        return this.portalLogoImageLocation;
    }

    /**
     * <p>
     * The portal's logo image, which is available at a URL.
     * </p>
     * 
     * @param portalLogoImageLocation
     *        The portal's logo image, which is available at a URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalLogoImageLocation(ImageLocation portalLogoImageLocation) {
        setPortalLogoImageLocation(portalLogoImageLocation);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service roles
     * for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *        roles for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service roles
     * for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *         roles for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service roles
     * for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *        roles for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getPortalName() != null)
            sb.append("PortalName: ").append(getPortalName()).append(",");
        if (getPortalDescription() != null)
            sb.append("PortalDescription: ").append(getPortalDescription()).append(",");
        if (getPortalClientId() != null)
            sb.append("PortalClientId: ").append(getPortalClientId()).append(",");
        if (getPortalStartUrl() != null)
            sb.append("PortalStartUrl: ").append(getPortalStartUrl()).append(",");
        if (getPortalContactEmail() != null)
            sb.append("PortalContactEmail: ").append(getPortalContactEmail()).append(",");
        if (getPortalStatus() != null)
            sb.append("PortalStatus: ").append(getPortalStatus()).append(",");
        if (getPortalCreationDate() != null)
            sb.append("PortalCreationDate: ").append(getPortalCreationDate()).append(",");
        if (getPortalLastUpdateDate() != null)
            sb.append("PortalLastUpdateDate: ").append(getPortalLastUpdateDate()).append(",");
        if (getPortalLogoImageLocation() != null)
            sb.append("PortalLogoImageLocation: ").append(getPortalLogoImageLocation()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePortalResult == false)
            return false;
        DescribePortalResult other = (DescribePortalResult) obj;
        if (other.getPortalId() == null ^ this.getPortalId() == null)
            return false;
        if (other.getPortalId() != null && other.getPortalId().equals(this.getPortalId()) == false)
            return false;
        if (other.getPortalArn() == null ^ this.getPortalArn() == null)
            return false;
        if (other.getPortalArn() != null && other.getPortalArn().equals(this.getPortalArn()) == false)
            return false;
        if (other.getPortalName() == null ^ this.getPortalName() == null)
            return false;
        if (other.getPortalName() != null && other.getPortalName().equals(this.getPortalName()) == false)
            return false;
        if (other.getPortalDescription() == null ^ this.getPortalDescription() == null)
            return false;
        if (other.getPortalDescription() != null && other.getPortalDescription().equals(this.getPortalDescription()) == false)
            return false;
        if (other.getPortalClientId() == null ^ this.getPortalClientId() == null)
            return false;
        if (other.getPortalClientId() != null && other.getPortalClientId().equals(this.getPortalClientId()) == false)
            return false;
        if (other.getPortalStartUrl() == null ^ this.getPortalStartUrl() == null)
            return false;
        if (other.getPortalStartUrl() != null && other.getPortalStartUrl().equals(this.getPortalStartUrl()) == false)
            return false;
        if (other.getPortalContactEmail() == null ^ this.getPortalContactEmail() == null)
            return false;
        if (other.getPortalContactEmail() != null && other.getPortalContactEmail().equals(this.getPortalContactEmail()) == false)
            return false;
        if (other.getPortalStatus() == null ^ this.getPortalStatus() == null)
            return false;
        if (other.getPortalStatus() != null && other.getPortalStatus().equals(this.getPortalStatus()) == false)
            return false;
        if (other.getPortalCreationDate() == null ^ this.getPortalCreationDate() == null)
            return false;
        if (other.getPortalCreationDate() != null && other.getPortalCreationDate().equals(this.getPortalCreationDate()) == false)
            return false;
        if (other.getPortalLastUpdateDate() == null ^ this.getPortalLastUpdateDate() == null)
            return false;
        if (other.getPortalLastUpdateDate() != null && other.getPortalLastUpdateDate().equals(this.getPortalLastUpdateDate()) == false)
            return false;
        if (other.getPortalLogoImageLocation() == null ^ this.getPortalLogoImageLocation() == null)
            return false;
        if (other.getPortalLogoImageLocation() != null && other.getPortalLogoImageLocation().equals(this.getPortalLogoImageLocation()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        hashCode = prime * hashCode + ((getPortalArn() == null) ? 0 : getPortalArn().hashCode());
        hashCode = prime * hashCode + ((getPortalName() == null) ? 0 : getPortalName().hashCode());
        hashCode = prime * hashCode + ((getPortalDescription() == null) ? 0 : getPortalDescription().hashCode());
        hashCode = prime * hashCode + ((getPortalClientId() == null) ? 0 : getPortalClientId().hashCode());
        hashCode = prime * hashCode + ((getPortalStartUrl() == null) ? 0 : getPortalStartUrl().hashCode());
        hashCode = prime * hashCode + ((getPortalContactEmail() == null) ? 0 : getPortalContactEmail().hashCode());
        hashCode = prime * hashCode + ((getPortalStatus() == null) ? 0 : getPortalStatus().hashCode());
        hashCode = prime * hashCode + ((getPortalCreationDate() == null) ? 0 : getPortalCreationDate().hashCode());
        hashCode = prime * hashCode + ((getPortalLastUpdateDate() == null) ? 0 : getPortalLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getPortalLogoImageLocation() == null) ? 0 : getPortalLogoImageLocation().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribePortalResult clone() {
        try {
            return (DescribePortalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

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
     * The Amazon Web Services SSO application generated client ID (used with Amazon Web Services SSO APIs). IoT
     * SiteWise includes <code>portalClientId</code> for only portals that use Amazon Web Services SSO to authenticate
     * users.
     * </p>
     */
    private String portalClientId;
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
     * The Amazon Web Services administrator's contact email address.
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
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The service to use to authenticate users to the portal.
     * </p>
     */
    private String portalAuthMode;
    /**
     * <p>
     * The email address that sends alarm notifications.
     * </p>
     */
    private String notificationSenderEmail;
    /**
     * <p>
     * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal.
     * </p>
     */
    private Alarms alarms;

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
     * The Amazon Web Services SSO application generated client ID (used with Amazon Web Services SSO APIs). IoT
     * SiteWise includes <code>portalClientId</code> for only portals that use Amazon Web Services SSO to authenticate
     * users.
     * </p>
     * 
     * @param portalClientId
     *        The Amazon Web Services SSO application generated client ID (used with Amazon Web Services SSO APIs). IoT
     *        SiteWise includes <code>portalClientId</code> for only portals that use Amazon Web Services SSO to
     *        authenticate users.
     */

    public void setPortalClientId(String portalClientId) {
        this.portalClientId = portalClientId;
    }

    /**
     * <p>
     * The Amazon Web Services SSO application generated client ID (used with Amazon Web Services SSO APIs). IoT
     * SiteWise includes <code>portalClientId</code> for only portals that use Amazon Web Services SSO to authenticate
     * users.
     * </p>
     * 
     * @return The Amazon Web Services SSO application generated client ID (used with Amazon Web Services SSO APIs). IoT
     *         SiteWise includes <code>portalClientId</code> for only portals that use Amazon Web Services SSO to
     *         authenticate users.
     */

    public String getPortalClientId() {
        return this.portalClientId;
    }

    /**
     * <p>
     * The Amazon Web Services SSO application generated client ID (used with Amazon Web Services SSO APIs). IoT
     * SiteWise includes <code>portalClientId</code> for only portals that use Amazon Web Services SSO to authenticate
     * users.
     * </p>
     * 
     * @param portalClientId
     *        The Amazon Web Services SSO application generated client ID (used with Amazon Web Services SSO APIs). IoT
     *        SiteWise includes <code>portalClientId</code> for only portals that use Amazon Web Services SSO to
     *        authenticate users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withPortalClientId(String portalClientId) {
        setPortalClientId(portalClientId);
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

    public DescribePortalResult withPortalStartUrl(String portalStartUrl) {
        setPortalStartUrl(portalStartUrl);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services administrator's contact email address.
     * </p>
     * 
     * @param portalContactEmail
     *        The Amazon Web Services administrator's contact email address.
     */

    public void setPortalContactEmail(String portalContactEmail) {
        this.portalContactEmail = portalContactEmail;
    }

    /**
     * <p>
     * The Amazon Web Services administrator's contact email address.
     * </p>
     * 
     * @return The Amazon Web Services administrator's contact email address.
     */

    public String getPortalContactEmail() {
        return this.portalContactEmail;
    }

    /**
     * <p>
     * The Amazon Web Services administrator's contact email address.
     * </p>
     * 
     * @param portalContactEmail
     *        The Amazon Web Services administrator's contact email address.
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
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *        roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *         roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *        roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The service to use to authenticate users to the portal.
     * </p>
     * 
     * @param portalAuthMode
     *        The service to use to authenticate users to the portal.
     * @see AuthMode
     */

    public void setPortalAuthMode(String portalAuthMode) {
        this.portalAuthMode = portalAuthMode;
    }

    /**
     * <p>
     * The service to use to authenticate users to the portal.
     * </p>
     * 
     * @return The service to use to authenticate users to the portal.
     * @see AuthMode
     */

    public String getPortalAuthMode() {
        return this.portalAuthMode;
    }

    /**
     * <p>
     * The service to use to authenticate users to the portal.
     * </p>
     * 
     * @param portalAuthMode
     *        The service to use to authenticate users to the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public DescribePortalResult withPortalAuthMode(String portalAuthMode) {
        setPortalAuthMode(portalAuthMode);
        return this;
    }

    /**
     * <p>
     * The service to use to authenticate users to the portal.
     * </p>
     * 
     * @param portalAuthMode
     *        The service to use to authenticate users to the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public DescribePortalResult withPortalAuthMode(AuthMode portalAuthMode) {
        this.portalAuthMode = portalAuthMode.toString();
        return this;
    }

    /**
     * <p>
     * The email address that sends alarm notifications.
     * </p>
     * 
     * @param notificationSenderEmail
     *        The email address that sends alarm notifications.
     */

    public void setNotificationSenderEmail(String notificationSenderEmail) {
        this.notificationSenderEmail = notificationSenderEmail;
    }

    /**
     * <p>
     * The email address that sends alarm notifications.
     * </p>
     * 
     * @return The email address that sends alarm notifications.
     */

    public String getNotificationSenderEmail() {
        return this.notificationSenderEmail;
    }

    /**
     * <p>
     * The email address that sends alarm notifications.
     * </p>
     * 
     * @param notificationSenderEmail
     *        The email address that sends alarm notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withNotificationSenderEmail(String notificationSenderEmail) {
        setNotificationSenderEmail(notificationSenderEmail);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param alarms
     *        Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal.
     */

    public void setAlarms(Alarms alarms) {
        this.alarms = alarms;
    }

    /**
     * <p>
     * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal.
     * </p>
     * 
     * @return Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal.
     */

    public Alarms getAlarms() {
        return this.alarms;
    }

    /**
     * <p>
     * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param alarms
     *        Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortalResult withAlarms(Alarms alarms) {
        setAlarms(alarms);
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
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getPortalAuthMode() != null)
            sb.append("PortalAuthMode: ").append(getPortalAuthMode()).append(",");
        if (getNotificationSenderEmail() != null)
            sb.append("NotificationSenderEmail: ").append(getNotificationSenderEmail()).append(",");
        if (getAlarms() != null)
            sb.append("Alarms: ").append(getAlarms());
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
        if (other.getPortalAuthMode() == null ^ this.getPortalAuthMode() == null)
            return false;
        if (other.getPortalAuthMode() != null && other.getPortalAuthMode().equals(this.getPortalAuthMode()) == false)
            return false;
        if (other.getNotificationSenderEmail() == null ^ this.getNotificationSenderEmail() == null)
            return false;
        if (other.getNotificationSenderEmail() != null && other.getNotificationSenderEmail().equals(this.getNotificationSenderEmail()) == false)
            return false;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
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
        hashCode = prime * hashCode + ((getPortalAuthMode() == null) ? 0 : getPortalAuthMode().hashCode());
        hashCode = prime * hashCode + ((getNotificationSenderEmail() == null) ? 0 : getNotificationSenderEmail().hashCode());
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
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

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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdatePortal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePortalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the portal to update.
     * </p>
     */
    private String portalId;
    /**
     * <p>
     * A new friendly name for the portal.
     * </p>
     */
    private String portalName;
    /**
     * <p>
     * A new description for the portal.
     * </p>
     */
    private String portalDescription;
    /**
     * <p>
     * The Amazon Web Services administrator's contact email address.
     * </p>
     */
    private String portalContactEmail;

    private Image portalLogoImage;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The email address that sends alarm notifications.
     * </p>
     */
    private String notificationSenderEmail;
    /**
     * <p>
     * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal. You can use the
     * alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html">Monitoring with alarms</a> in
     * the <i>IoT SiteWise Application Guide</i>.
     * </p>
     */
    private Alarms alarms;

    /**
     * <p>
     * The ID of the portal to update.
     * </p>
     * 
     * @param portalId
     *        The ID of the portal to update.
     */

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    /**
     * <p>
     * The ID of the portal to update.
     * </p>
     * 
     * @return The ID of the portal to update.
     */

    public String getPortalId() {
        return this.portalId;
    }

    /**
     * <p>
     * The ID of the portal to update.
     * </p>
     * 
     * @param portalId
     *        The ID of the portal to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalRequest withPortalId(String portalId) {
        setPortalId(portalId);
        return this;
    }

    /**
     * <p>
     * A new friendly name for the portal.
     * </p>
     * 
     * @param portalName
     *        A new friendly name for the portal.
     */

    public void setPortalName(String portalName) {
        this.portalName = portalName;
    }

    /**
     * <p>
     * A new friendly name for the portal.
     * </p>
     * 
     * @return A new friendly name for the portal.
     */

    public String getPortalName() {
        return this.portalName;
    }

    /**
     * <p>
     * A new friendly name for the portal.
     * </p>
     * 
     * @param portalName
     *        A new friendly name for the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalRequest withPortalName(String portalName) {
        setPortalName(portalName);
        return this;
    }

    /**
     * <p>
     * A new description for the portal.
     * </p>
     * 
     * @param portalDescription
     *        A new description for the portal.
     */

    public void setPortalDescription(String portalDescription) {
        this.portalDescription = portalDescription;
    }

    /**
     * <p>
     * A new description for the portal.
     * </p>
     * 
     * @return A new description for the portal.
     */

    public String getPortalDescription() {
        return this.portalDescription;
    }

    /**
     * <p>
     * A new description for the portal.
     * </p>
     * 
     * @param portalDescription
     *        A new description for the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalRequest withPortalDescription(String portalDescription) {
        setPortalDescription(portalDescription);
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

    public UpdatePortalRequest withPortalContactEmail(String portalContactEmail) {
        setPortalContactEmail(portalContactEmail);
        return this;
    }

    /**
     * @param portalLogoImage
     */

    public void setPortalLogoImage(Image portalLogoImage) {
        this.portalLogoImage = portalLogoImage;
    }

    /**
     * @return
     */

    public Image getPortalLogoImage() {
        return this.portalLogoImage;
    }

    /**
     * @param portalLogoImage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalRequest withPortalLogoImage(Image portalLogoImage) {
        setPortalLogoImage(portalLogoImage);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a
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
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a
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
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a service
     * role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information,
     * see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     * roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a
     *        service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *        roles for IoT SiteWise Monitor</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public UpdatePortalRequest withNotificationSenderEmail(String notificationSenderEmail) {
        setNotificationSenderEmail(notificationSenderEmail);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal. You can use the
     * alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html">Monitoring with alarms</a> in
     * the <i>IoT SiteWise Application Guide</i>.
     * </p>
     * 
     * @param alarms
     *        Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal. You can use
     *        the alarm to monitor an asset property and get notified when the asset property value is outside a
     *        specified range. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html">Monitoring with
     *        alarms</a> in the <i>IoT SiteWise Application Guide</i>.
     */

    public void setAlarms(Alarms alarms) {
        this.alarms = alarms;
    }

    /**
     * <p>
     * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal. You can use the
     * alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html">Monitoring with alarms</a> in
     * the <i>IoT SiteWise Application Guide</i>.
     * </p>
     * 
     * @return Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal. You can use
     *         the alarm to monitor an asset property and get notified when the asset property value is outside a
     *         specified range. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html">Monitoring with
     *         alarms</a> in the <i>IoT SiteWise Application Guide</i>.
     */

    public Alarms getAlarms() {
        return this.alarms;
    }

    /**
     * <p>
     * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal. You can use the
     * alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html">Monitoring with alarms</a> in
     * the <i>IoT SiteWise Application Guide</i>.
     * </p>
     * 
     * @param alarms
     *        Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal. You can use
     *        the alarm to monitor an asset property and get notified when the asset property value is outside a
     *        specified range. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html">Monitoring with
     *        alarms</a> in the <i>IoT SiteWise Application Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalRequest withAlarms(Alarms alarms) {
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
        if (getPortalName() != null)
            sb.append("PortalName: ").append(getPortalName()).append(",");
        if (getPortalDescription() != null)
            sb.append("PortalDescription: ").append(getPortalDescription()).append(",");
        if (getPortalContactEmail() != null)
            sb.append("PortalContactEmail: ").append(getPortalContactEmail()).append(",");
        if (getPortalLogoImage() != null)
            sb.append("PortalLogoImage: ").append(getPortalLogoImage()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof UpdatePortalRequest == false)
            return false;
        UpdatePortalRequest other = (UpdatePortalRequest) obj;
        if (other.getPortalId() == null ^ this.getPortalId() == null)
            return false;
        if (other.getPortalId() != null && other.getPortalId().equals(this.getPortalId()) == false)
            return false;
        if (other.getPortalName() == null ^ this.getPortalName() == null)
            return false;
        if (other.getPortalName() != null && other.getPortalName().equals(this.getPortalName()) == false)
            return false;
        if (other.getPortalDescription() == null ^ this.getPortalDescription() == null)
            return false;
        if (other.getPortalDescription() != null && other.getPortalDescription().equals(this.getPortalDescription()) == false)
            return false;
        if (other.getPortalContactEmail() == null ^ this.getPortalContactEmail() == null)
            return false;
        if (other.getPortalContactEmail() != null && other.getPortalContactEmail().equals(this.getPortalContactEmail()) == false)
            return false;
        if (other.getPortalLogoImage() == null ^ this.getPortalLogoImage() == null)
            return false;
        if (other.getPortalLogoImage() != null && other.getPortalLogoImage().equals(this.getPortalLogoImage()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        hashCode = prime * hashCode + ((getPortalName() == null) ? 0 : getPortalName().hashCode());
        hashCode = prime * hashCode + ((getPortalDescription() == null) ? 0 : getPortalDescription().hashCode());
        hashCode = prime * hashCode + ((getPortalContactEmail() == null) ? 0 : getPortalContactEmail().hashCode());
        hashCode = prime * hashCode + ((getPortalLogoImage() == null) ? 0 : getPortalLogoImage().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNotificationSenderEmail() == null) ? 0 : getNotificationSenderEmail().hashCode());
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePortalRequest clone() {
        return (UpdatePortalRequest) super.clone();
    }

}

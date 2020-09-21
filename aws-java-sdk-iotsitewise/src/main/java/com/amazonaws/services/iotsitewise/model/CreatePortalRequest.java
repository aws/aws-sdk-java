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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePortal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePortalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A friendly name for the portal.
     * </p>
     */
    private String portalName;
    /**
     * <p>
     * A description for the portal.
     * </p>
     */
    private String portalDescription;
    /**
     * <p>
     * The AWS administrator's contact email address.
     * </p>
     */
    private String portalContactEmail;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a dark
     * background.
     * </p>
     */
    private ImageFile portalLogoImageFile;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service roles
     * for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the portal. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your AWS IoT SiteWise
     * resources</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The service to use to authenticate users to the portal. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSO</code> – The portal uses AWS Single Sign-On to authenticate users and manage user permissions. Before
     * you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">Enabling AWS
     * SSO</a> in the <i>AWS IoT SiteWise User Guide</i>. This option is only available in AWS Regions other than the
     * China Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAM</code> – The portal uses AWS Identity and Access Management (IAM) to authenticate users and manage user
     * permissions. IAM users must have the <code>iotsitewise:CreatePresignedPortalUrl</code> permission to sign in to
     * the portal. This option is only available in the China Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change this value after you create a portal.
     * </p>
     * <p>
     * Default: <code>SSO</code>
     * </p>
     */
    private String portalAuthMode;

    /**
     * <p>
     * A friendly name for the portal.
     * </p>
     * 
     * @param portalName
     *        A friendly name for the portal.
     */

    public void setPortalName(String portalName) {
        this.portalName = portalName;
    }

    /**
     * <p>
     * A friendly name for the portal.
     * </p>
     * 
     * @return A friendly name for the portal.
     */

    public String getPortalName() {
        return this.portalName;
    }

    /**
     * <p>
     * A friendly name for the portal.
     * </p>
     * 
     * @param portalName
     *        A friendly name for the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalRequest withPortalName(String portalName) {
        setPortalName(portalName);
        return this;
    }

    /**
     * <p>
     * A description for the portal.
     * </p>
     * 
     * @param portalDescription
     *        A description for the portal.
     */

    public void setPortalDescription(String portalDescription) {
        this.portalDescription = portalDescription;
    }

    /**
     * <p>
     * A description for the portal.
     * </p>
     * 
     * @return A description for the portal.
     */

    public String getPortalDescription() {
        return this.portalDescription;
    }

    /**
     * <p>
     * A description for the portal.
     * </p>
     * 
     * @param portalDescription
     *        A description for the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalRequest withPortalDescription(String portalDescription) {
        setPortalDescription(portalDescription);
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

    public CreatePortalRequest withPortalContactEmail(String portalContactEmail) {
        setPortalContactEmail(portalContactEmail);
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

    public CreatePortalRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a dark
     * background.
     * </p>
     * 
     * @param portalLogoImageFile
     *        A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a
     *        dark background.
     */

    public void setPortalLogoImageFile(ImageFile portalLogoImageFile) {
        this.portalLogoImageFile = portalLogoImageFile;
    }

    /**
     * <p>
     * A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a dark
     * background.
     * </p>
     * 
     * @return A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on
     *         a dark background.
     */

    public ImageFile getPortalLogoImageFile() {
        return this.portalLogoImageFile;
    }

    /**
     * <p>
     * A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a dark
     * background.
     * </p>
     * 
     * @param portalLogoImageFile
     *        A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a
     *        dark background.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalRequest withPortalLogoImageFile(ImageFile portalLogoImageFile) {
        setPortalLogoImageFile(portalLogoImageFile);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service roles
     * for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a
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
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service roles
     * for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a
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
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service roles
     * for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of a
     *        service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html">Using service
     *        roles for AWS IoT SiteWise Monitor</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the portal. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your AWS IoT SiteWise
     * resources</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the portal. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your AWS IoT
     *         SiteWise resources</a> in the <i>AWS IoT SiteWise User Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the portal. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your AWS IoT SiteWise
     * resources</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the portal. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your AWS IoT
     *        SiteWise resources</a> in the <i>AWS IoT SiteWise User Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the portal. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your AWS IoT SiteWise
     * resources</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the portal. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your AWS IoT
     *        SiteWise resources</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreatePortalRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortalRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The service to use to authenticate users to the portal. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSO</code> – The portal uses AWS Single Sign-On to authenticate users and manage user permissions. Before
     * you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">Enabling AWS
     * SSO</a> in the <i>AWS IoT SiteWise User Guide</i>. This option is only available in AWS Regions other than the
     * China Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAM</code> – The portal uses AWS Identity and Access Management (IAM) to authenticate users and manage user
     * permissions. IAM users must have the <code>iotsitewise:CreatePresignedPortalUrl</code> permission to sign in to
     * the portal. This option is only available in the China Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change this value after you create a portal.
     * </p>
     * <p>
     * Default: <code>SSO</code>
     * </p>
     * 
     * @param portalAuthMode
     *        The service to use to authenticate users to the portal. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SSO</code> – The portal uses AWS Single Sign-On to authenticate users and manage user permissions.
     *        Before you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">Enabling
     *        AWS SSO</a> in the <i>AWS IoT SiteWise User Guide</i>. This option is only available in AWS Regions other
     *        than the China Regions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IAM</code> – The portal uses AWS Identity and Access Management (IAM) to authenticate users and
     *        manage user permissions. IAM users must have the <code>iotsitewise:CreatePresignedPortalUrl</code>
     *        permission to sign in to the portal. This option is only available in the China Regions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can't change this value after you create a portal.
     *        </p>
     *        <p>
     *        Default: <code>SSO</code>
     * @see AuthMode
     */

    public void setPortalAuthMode(String portalAuthMode) {
        this.portalAuthMode = portalAuthMode;
    }

    /**
     * <p>
     * The service to use to authenticate users to the portal. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSO</code> – The portal uses AWS Single Sign-On to authenticate users and manage user permissions. Before
     * you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">Enabling AWS
     * SSO</a> in the <i>AWS IoT SiteWise User Guide</i>. This option is only available in AWS Regions other than the
     * China Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAM</code> – The portal uses AWS Identity and Access Management (IAM) to authenticate users and manage user
     * permissions. IAM users must have the <code>iotsitewise:CreatePresignedPortalUrl</code> permission to sign in to
     * the portal. This option is only available in the China Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change this value after you create a portal.
     * </p>
     * <p>
     * Default: <code>SSO</code>
     * </p>
     * 
     * @return The service to use to authenticate users to the portal. Choose from the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SSO</code> – The portal uses AWS Single Sign-On to authenticate users and manage user permissions.
     *         Before you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">
     *         Enabling AWS SSO</a> in the <i>AWS IoT SiteWise User Guide</i>. This option is only available in AWS
     *         Regions other than the China Regions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IAM</code> – The portal uses AWS Identity and Access Management (IAM) to authenticate users and
     *         manage user permissions. IAM users must have the <code>iotsitewise:CreatePresignedPortalUrl</code>
     *         permission to sign in to the portal. This option is only available in the China Regions.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can't change this value after you create a portal.
     *         </p>
     *         <p>
     *         Default: <code>SSO</code>
     * @see AuthMode
     */

    public String getPortalAuthMode() {
        return this.portalAuthMode;
    }

    /**
     * <p>
     * The service to use to authenticate users to the portal. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSO</code> – The portal uses AWS Single Sign-On to authenticate users and manage user permissions. Before
     * you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">Enabling AWS
     * SSO</a> in the <i>AWS IoT SiteWise User Guide</i>. This option is only available in AWS Regions other than the
     * China Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAM</code> – The portal uses AWS Identity and Access Management (IAM) to authenticate users and manage user
     * permissions. IAM users must have the <code>iotsitewise:CreatePresignedPortalUrl</code> permission to sign in to
     * the portal. This option is only available in the China Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change this value after you create a portal.
     * </p>
     * <p>
     * Default: <code>SSO</code>
     * </p>
     * 
     * @param portalAuthMode
     *        The service to use to authenticate users to the portal. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SSO</code> – The portal uses AWS Single Sign-On to authenticate users and manage user permissions.
     *        Before you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">Enabling
     *        AWS SSO</a> in the <i>AWS IoT SiteWise User Guide</i>. This option is only available in AWS Regions other
     *        than the China Regions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IAM</code> – The portal uses AWS Identity and Access Management (IAM) to authenticate users and
     *        manage user permissions. IAM users must have the <code>iotsitewise:CreatePresignedPortalUrl</code>
     *        permission to sign in to the portal. This option is only available in the China Regions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can't change this value after you create a portal.
     *        </p>
     *        <p>
     *        Default: <code>SSO</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public CreatePortalRequest withPortalAuthMode(String portalAuthMode) {
        setPortalAuthMode(portalAuthMode);
        return this;
    }

    /**
     * <p>
     * The service to use to authenticate users to the portal. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSO</code> – The portal uses AWS Single Sign-On to authenticate users and manage user permissions. Before
     * you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">Enabling AWS
     * SSO</a> in the <i>AWS IoT SiteWise User Guide</i>. This option is only available in AWS Regions other than the
     * China Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IAM</code> – The portal uses AWS Identity and Access Management (IAM) to authenticate users and manage user
     * permissions. IAM users must have the <code>iotsitewise:CreatePresignedPortalUrl</code> permission to sign in to
     * the portal. This option is only available in the China Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change this value after you create a portal.
     * </p>
     * <p>
     * Default: <code>SSO</code>
     * </p>
     * 
     * @param portalAuthMode
     *        The service to use to authenticate users to the portal. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SSO</code> – The portal uses AWS Single Sign-On to authenticate users and manage user permissions.
     *        Before you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">Enabling
     *        AWS SSO</a> in the <i>AWS IoT SiteWise User Guide</i>. This option is only available in AWS Regions other
     *        than the China Regions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IAM</code> – The portal uses AWS Identity and Access Management (IAM) to authenticate users and
     *        manage user permissions. IAM users must have the <code>iotsitewise:CreatePresignedPortalUrl</code>
     *        permission to sign in to the portal. This option is only available in the China Regions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can't change this value after you create a portal.
     *        </p>
     *        <p>
     *        Default: <code>SSO</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public CreatePortalRequest withPortalAuthMode(AuthMode portalAuthMode) {
        this.portalAuthMode = portalAuthMode.toString();
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
        if (getPortalName() != null)
            sb.append("PortalName: ").append(getPortalName()).append(",");
        if (getPortalDescription() != null)
            sb.append("PortalDescription: ").append(getPortalDescription()).append(",");
        if (getPortalContactEmail() != null)
            sb.append("PortalContactEmail: ").append(getPortalContactEmail()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getPortalLogoImageFile() != null)
            sb.append("PortalLogoImageFile: ").append(getPortalLogoImageFile()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPortalAuthMode() != null)
            sb.append("PortalAuthMode: ").append(getPortalAuthMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePortalRequest == false)
            return false;
        CreatePortalRequest other = (CreatePortalRequest) obj;
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPortalLogoImageFile() == null ^ this.getPortalLogoImageFile() == null)
            return false;
        if (other.getPortalLogoImageFile() != null && other.getPortalLogoImageFile().equals(this.getPortalLogoImageFile()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPortalAuthMode() == null ^ this.getPortalAuthMode() == null)
            return false;
        if (other.getPortalAuthMode() != null && other.getPortalAuthMode().equals(this.getPortalAuthMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalName() == null) ? 0 : getPortalName().hashCode());
        hashCode = prime * hashCode + ((getPortalDescription() == null) ? 0 : getPortalDescription().hashCode());
        hashCode = prime * hashCode + ((getPortalContactEmail() == null) ? 0 : getPortalContactEmail().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getPortalLogoImageFile() == null) ? 0 : getPortalLogoImageFile().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPortalAuthMode() == null) ? 0 : getPortalAuthMode().hashCode());
        return hashCode;
    }

    @Override
    public CreatePortalRequest clone() {
        return (CreatePortalRequest) super.clone();
    }

}

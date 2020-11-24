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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Parameter input for the <code>GetDashboardEmbedUrl</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetDashboardEmbedUrl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDashboardEmbedUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the AWS account that contains the dashboard that you're embedding.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     */
    private String identityType;
    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * </p>
     */
    private Long sessionLifetimeInMinutes;
    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     */
    private Boolean undoRedoDisabled;
    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
     * </p>
     */
    private Boolean resetDisabled;
    /**
     * <p>
     * Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet and the
     * parameter settings. These are control settings that the dashboard subscriber (QuickSight reader) chooses while
     * viewing the dashboard. If this is set to <code>TRUE</code>, the settings are the same when the the subscriber
     * reopens the same dashboard URL. The state is stored in QuickSight, not in a browser cookie. If this is set to
     * FALSE, the state of the user session is not persisted. The default is <code>FALSE</code>.
     * </p>
     */
    private Boolean statePersistenceEnabled;
    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity type. You
     * can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect,
     * or IAM federation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Omit this parameter for users in the third group – IAM users and IAM role-based sessions.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The QuickSight namespace that contains the dashboard IDs in this request. If you're not using a custom namespace,
     * set this to "<code>default</code>".
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * A list of one or more dashboard ids that you want to add to a session that includes anonymous authorizations.
     * <code>IdentityType</code> must be set to ANONYMOUS for this to work, because other other identity types
     * authenticate as QuickSight users. For example, if you set "
     * <code>--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS</code>", the session can
     * access all three dashboards.
     * </p>
     */
    private java.util.List<String> additionalDashboardIds;

    /**
     * <p>
     * The ID for the AWS account that contains the dashboard that you're embedding.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that contains the dashboard that you're embedding.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that contains the dashboard that you're embedding.
     * </p>
     * 
     * @return The ID for the AWS account that contains the dashboard that you're embedding.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that contains the dashboard that you're embedding.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that contains the dashboard that you're embedding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard, also added to the IAM policy.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     * 
     * @return The ID for the dashboard, also added to the IAM policy.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard, also added to the IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * 
     * @param identityType
     *        The authentication method that the user uses to sign in.
     * @see EmbeddingIdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * 
     * @return The authentication method that the user uses to sign in.
     * @see EmbeddingIdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * 
     * @param identityType
     *        The authentication method that the user uses to sign in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmbeddingIdentityType
     */

    public GetDashboardEmbedUrlRequest withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * The authentication method that the user uses to sign in.
     * </p>
     * 
     * @param identityType
     *        The authentication method that the user uses to sign in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmbeddingIdentityType
     */

    public GetDashboardEmbedUrlRequest withIdentityType(EmbeddingIdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     */

    public void setSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        this.sessionLifetimeInMinutes = sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * </p>
     * 
     * @return How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     */

    public Long getSessionLifetimeInMinutes() {
        return this.sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be 15-600 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        setSessionLifetimeInMinutes(sessionLifetimeInMinutes);
        return this;
    }

    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     * 
     * @param undoRedoDisabled
     *        Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo
     *        button.
     */

    public void setUndoRedoDisabled(Boolean undoRedoDisabled) {
        this.undoRedoDisabled = undoRedoDisabled;
    }

    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     * 
     * @return Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo
     *         button.
     */

    public Boolean getUndoRedoDisabled() {
        return this.undoRedoDisabled;
    }

    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     * 
     * @param undoRedoDisabled
     *        Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo
     *        button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withUndoRedoDisabled(Boolean undoRedoDisabled) {
        setUndoRedoDisabled(undoRedoDisabled);
        return this;
    }

    /**
     * <p>
     * Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo button.
     * </p>
     * 
     * @return Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo
     *         button.
     */

    public Boolean isUndoRedoDisabled() {
        return this.undoRedoDisabled;
    }

    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
     * </p>
     * 
     * @param resetDisabled
     *        Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
     */

    public void setResetDisabled(Boolean resetDisabled) {
        this.resetDisabled = resetDisabled;
    }

    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
     * </p>
     * 
     * @return Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
     */

    public Boolean getResetDisabled() {
        return this.resetDisabled;
    }

    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
     * </p>
     * 
     * @param resetDisabled
     *        Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withResetDisabled(Boolean resetDisabled) {
        setResetDisabled(resetDisabled);
        return this;
    }

    /**
     * <p>
     * Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
     * </p>
     * 
     * @return Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
     */

    public Boolean isResetDisabled() {
        return this.resetDisabled;
    }

    /**
     * <p>
     * Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet and the
     * parameter settings. These are control settings that the dashboard subscriber (QuickSight reader) chooses while
     * viewing the dashboard. If this is set to <code>TRUE</code>, the settings are the same when the the subscriber
     * reopens the same dashboard URL. The state is stored in QuickSight, not in a browser cookie. If this is set to
     * FALSE, the state of the user session is not persisted. The default is <code>FALSE</code>.
     * </p>
     * 
     * @param statePersistenceEnabled
     *        Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet
     *        and the parameter settings. These are control settings that the dashboard subscriber (QuickSight reader)
     *        chooses while viewing the dashboard. If this is set to <code>TRUE</code>, the settings are the same when
     *        the the subscriber reopens the same dashboard URL. The state is stored in QuickSight, not in a browser
     *        cookie. If this is set to FALSE, the state of the user session is not persisted. The default is
     *        <code>FALSE</code>.
     */

    public void setStatePersistenceEnabled(Boolean statePersistenceEnabled) {
        this.statePersistenceEnabled = statePersistenceEnabled;
    }

    /**
     * <p>
     * Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet and the
     * parameter settings. These are control settings that the dashboard subscriber (QuickSight reader) chooses while
     * viewing the dashboard. If this is set to <code>TRUE</code>, the settings are the same when the the subscriber
     * reopens the same dashboard URL. The state is stored in QuickSight, not in a browser cookie. If this is set to
     * FALSE, the state of the user session is not persisted. The default is <code>FALSE</code>.
     * </p>
     * 
     * @return Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet
     *         and the parameter settings. These are control settings that the dashboard subscriber (QuickSight reader)
     *         chooses while viewing the dashboard. If this is set to <code>TRUE</code>, the settings are the same when
     *         the the subscriber reopens the same dashboard URL. The state is stored in QuickSight, not in a browser
     *         cookie. If this is set to FALSE, the state of the user session is not persisted. The default is
     *         <code>FALSE</code>.
     */

    public Boolean getStatePersistenceEnabled() {
        return this.statePersistenceEnabled;
    }

    /**
     * <p>
     * Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet and the
     * parameter settings. These are control settings that the dashboard subscriber (QuickSight reader) chooses while
     * viewing the dashboard. If this is set to <code>TRUE</code>, the settings are the same when the the subscriber
     * reopens the same dashboard URL. The state is stored in QuickSight, not in a browser cookie. If this is set to
     * FALSE, the state of the user session is not persisted. The default is <code>FALSE</code>.
     * </p>
     * 
     * @param statePersistenceEnabled
     *        Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet
     *        and the parameter settings. These are control settings that the dashboard subscriber (QuickSight reader)
     *        chooses while viewing the dashboard. If this is set to <code>TRUE</code>, the settings are the same when
     *        the the subscriber reopens the same dashboard URL. The state is stored in QuickSight, not in a browser
     *        cookie. If this is set to FALSE, the state of the user session is not persisted. The default is
     *        <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withStatePersistenceEnabled(Boolean statePersistenceEnabled) {
        setStatePersistenceEnabled(statePersistenceEnabled);
        return this;
    }

    /**
     * <p>
     * Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet and the
     * parameter settings. These are control settings that the dashboard subscriber (QuickSight reader) chooses while
     * viewing the dashboard. If this is set to <code>TRUE</code>, the settings are the same when the the subscriber
     * reopens the same dashboard URL. The state is stored in QuickSight, not in a browser cookie. If this is set to
     * FALSE, the state of the user session is not persisted. The default is <code>FALSE</code>.
     * </p>
     * 
     * @return Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet
     *         and the parameter settings. These are control settings that the dashboard subscriber (QuickSight reader)
     *         chooses while viewing the dashboard. If this is set to <code>TRUE</code>, the settings are the same when
     *         the the subscriber reopens the same dashboard URL. The state is stored in QuickSight, not in a browser
     *         cookie. If this is set to FALSE, the state of the user session is not persisted. The default is
     *         <code>FALSE</code>.
     */

    public Boolean isStatePersistenceEnabled() {
        return this.statePersistenceEnabled;
    }

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity type. You
     * can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect,
     * or IAM federation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Omit this parameter for users in the third group – IAM users and IAM role-based sessions.
     * </p>
     * 
     * @param userArn
     *        The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity
     *        type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins)
     *        authenticated as one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Active Directory (AD) users or group members
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Invited nonfederated users
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID
     *        Connect, or IAM federation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Omit this parameter for users in the third group – IAM users and IAM role-based sessions.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity type. You
     * can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect,
     * or IAM federation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Omit this parameter for users in the third group – IAM users and IAM role-based sessions.
     * </p>
     * 
     * @return The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity
     *         type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins)
     *         authenticated as one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Active Directory (AD) users or group members
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Invited nonfederated users
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID
     *         Connect, or IAM federation.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Omit this parameter for users in the third group – IAM users and IAM role-based sessions.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity type. You
     * can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Active Directory (AD) users or group members
     * </p>
     * </li>
     * <li>
     * <p>
     * Invited nonfederated users
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect,
     * or IAM federation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Omit this parameter for users in the third group – IAM users and IAM role-based sessions.
     * </p>
     * 
     * @param userArn
     *        The Amazon QuickSight user's Amazon Resource Name (ARN), for use with <code>QUICKSIGHT</code> identity
     *        type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins)
     *        authenticated as one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Active Directory (AD) users or group members
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Invited nonfederated users
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID
     *        Connect, or IAM federation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Omit this parameter for users in the third group – IAM users and IAM role-based sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The QuickSight namespace that contains the dashboard IDs in this request. If you're not using a custom namespace,
     * set this to "<code>default</code>".
     * </p>
     * 
     * @param namespace
     *        The QuickSight namespace that contains the dashboard IDs in this request. If you're not using a custom
     *        namespace, set this to "<code>default</code>".
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The QuickSight namespace that contains the dashboard IDs in this request. If you're not using a custom namespace,
     * set this to "<code>default</code>".
     * </p>
     * 
     * @return The QuickSight namespace that contains the dashboard IDs in this request. If you're not using a custom
     *         namespace, set this to "<code>default</code>".
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The QuickSight namespace that contains the dashboard IDs in this request. If you're not using a custom namespace,
     * set this to "<code>default</code>".
     * </p>
     * 
     * @param namespace
     *        The QuickSight namespace that contains the dashboard IDs in this request. If you're not using a custom
     *        namespace, set this to "<code>default</code>".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * A list of one or more dashboard ids that you want to add to a session that includes anonymous authorizations.
     * <code>IdentityType</code> must be set to ANONYMOUS for this to work, because other other identity types
     * authenticate as QuickSight users. For example, if you set "
     * <code>--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS</code>", the session can
     * access all three dashboards.
     * </p>
     * 
     * @return A list of one or more dashboard ids that you want to add to a session that includes anonymous
     *         authorizations. <code>IdentityType</code> must be set to ANONYMOUS for this to work, because other other
     *         identity types authenticate as QuickSight users. For example, if you set "
     *         <code>--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS</code>", the
     *         session can access all three dashboards.
     */

    public java.util.List<String> getAdditionalDashboardIds() {
        return additionalDashboardIds;
    }

    /**
     * <p>
     * A list of one or more dashboard ids that you want to add to a session that includes anonymous authorizations.
     * <code>IdentityType</code> must be set to ANONYMOUS for this to work, because other other identity types
     * authenticate as QuickSight users. For example, if you set "
     * <code>--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS</code>", the session can
     * access all three dashboards.
     * </p>
     * 
     * @param additionalDashboardIds
     *        A list of one or more dashboard ids that you want to add to a session that includes anonymous
     *        authorizations. <code>IdentityType</code> must be set to ANONYMOUS for this to work, because other other
     *        identity types authenticate as QuickSight users. For example, if you set "
     *        <code>--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS</code>", the
     *        session can access all three dashboards.
     */

    public void setAdditionalDashboardIds(java.util.Collection<String> additionalDashboardIds) {
        if (additionalDashboardIds == null) {
            this.additionalDashboardIds = null;
            return;
        }

        this.additionalDashboardIds = new java.util.ArrayList<String>(additionalDashboardIds);
    }

    /**
     * <p>
     * A list of one or more dashboard ids that you want to add to a session that includes anonymous authorizations.
     * <code>IdentityType</code> must be set to ANONYMOUS for this to work, because other other identity types
     * authenticate as QuickSight users. For example, if you set "
     * <code>--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS</code>", the session can
     * access all three dashboards.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalDashboardIds(java.util.Collection)} or
     * {@link #withAdditionalDashboardIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalDashboardIds
     *        A list of one or more dashboard ids that you want to add to a session that includes anonymous
     *        authorizations. <code>IdentityType</code> must be set to ANONYMOUS for this to work, because other other
     *        identity types authenticate as QuickSight users. For example, if you set "
     *        <code>--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS</code>", the
     *        session can access all three dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withAdditionalDashboardIds(String... additionalDashboardIds) {
        if (this.additionalDashboardIds == null) {
            setAdditionalDashboardIds(new java.util.ArrayList<String>(additionalDashboardIds.length));
        }
        for (String ele : additionalDashboardIds) {
            this.additionalDashboardIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more dashboard ids that you want to add to a session that includes anonymous authorizations.
     * <code>IdentityType</code> must be set to ANONYMOUS for this to work, because other other identity types
     * authenticate as QuickSight users. For example, if you set "
     * <code>--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS</code>", the session can
     * access all three dashboards.
     * </p>
     * 
     * @param additionalDashboardIds
     *        A list of one or more dashboard ids that you want to add to a session that includes anonymous
     *        authorizations. <code>IdentityType</code> must be set to ANONYMOUS for this to work, because other other
     *        identity types authenticate as QuickSight users. For example, if you set "
     *        <code>--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS</code>", the
     *        session can access all three dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashboardEmbedUrlRequest withAdditionalDashboardIds(java.util.Collection<String> additionalDashboardIds) {
        setAdditionalDashboardIds(additionalDashboardIds);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getSessionLifetimeInMinutes() != null)
            sb.append("SessionLifetimeInMinutes: ").append(getSessionLifetimeInMinutes()).append(",");
        if (getUndoRedoDisabled() != null)
            sb.append("UndoRedoDisabled: ").append(getUndoRedoDisabled()).append(",");
        if (getResetDisabled() != null)
            sb.append("ResetDisabled: ").append(getResetDisabled()).append(",");
        if (getStatePersistenceEnabled() != null)
            sb.append("StatePersistenceEnabled: ").append(getStatePersistenceEnabled()).append(",");
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getAdditionalDashboardIds() != null)
            sb.append("AdditionalDashboardIds: ").append(getAdditionalDashboardIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDashboardEmbedUrlRequest == false)
            return false;
        GetDashboardEmbedUrlRequest other = (GetDashboardEmbedUrlRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getSessionLifetimeInMinutes() == null ^ this.getSessionLifetimeInMinutes() == null)
            return false;
        if (other.getSessionLifetimeInMinutes() != null && other.getSessionLifetimeInMinutes().equals(this.getSessionLifetimeInMinutes()) == false)
            return false;
        if (other.getUndoRedoDisabled() == null ^ this.getUndoRedoDisabled() == null)
            return false;
        if (other.getUndoRedoDisabled() != null && other.getUndoRedoDisabled().equals(this.getUndoRedoDisabled()) == false)
            return false;
        if (other.getResetDisabled() == null ^ this.getResetDisabled() == null)
            return false;
        if (other.getResetDisabled() != null && other.getResetDisabled().equals(this.getResetDisabled()) == false)
            return false;
        if (other.getStatePersistenceEnabled() == null ^ this.getStatePersistenceEnabled() == null)
            return false;
        if (other.getStatePersistenceEnabled() != null && other.getStatePersistenceEnabled().equals(this.getStatePersistenceEnabled()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getAdditionalDashboardIds() == null ^ this.getAdditionalDashboardIds() == null)
            return false;
        if (other.getAdditionalDashboardIds() != null && other.getAdditionalDashboardIds().equals(this.getAdditionalDashboardIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getSessionLifetimeInMinutes() == null) ? 0 : getSessionLifetimeInMinutes().hashCode());
        hashCode = prime * hashCode + ((getUndoRedoDisabled() == null) ? 0 : getUndoRedoDisabled().hashCode());
        hashCode = prime * hashCode + ((getResetDisabled() == null) ? 0 : getResetDisabled().hashCode());
        hashCode = prime * hashCode + ((getStatePersistenceEnabled() == null) ? 0 : getStatePersistenceEnabled().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getAdditionalDashboardIds() == null) ? 0 : getAdditionalDashboardIds().hashCode());
        return hashCode;
    }

    @Override
    public GetDashboardEmbedUrlRequest clone() {
        return (GetDashboardEmbedUrlRequest) super.clone();
    }

}

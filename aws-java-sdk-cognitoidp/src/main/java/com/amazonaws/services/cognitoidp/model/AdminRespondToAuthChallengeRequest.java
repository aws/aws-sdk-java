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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to respond to the authentication challenge, as an administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRespondToAuthChallenge"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminRespondToAuthChallengeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The app client ID.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     */
    private String challengeName;
    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     * is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as email
     * address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes the actual
     * username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an alias in your call
     * to <code>AdminInitiateAuth</code>.
     * </p>
     */
    private java.util.Map<String, String> challengeResponses;
    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     */
    private String session;
    /**
     * <p>
     * The analytics metadata for collecting Amazon Pinpoint metrics for <code>AdminRespondToAuthChallenge</code> calls.
     * </p>
     */
    private AnalyticsMetadataType analyticsMetadata;
    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     */
    private ContextDataType contextData;
    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     * triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post authentication</i>, <i>user migration</i>, <i>pre
     * token generation</i>, <i>define auth challenge</i>, <i>create auth challenge</i>, and <i>verify auth challenge
     * response</i>. When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code
     * in AWS Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific
     * needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the Amazon Cognito user pool.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * 
     * @return The ID of the Amazon Cognito user pool.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @param clientId
     *        The app client ID.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @return The app client ID.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The app client ID.
     * </p>
     * 
     * @param clientId
     *        The app client ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see .
     * @see ChallengeNameType
     */

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @return The challenge name. For more information, see .
     * @see ChallengeNameType
     */

    public String getChallengeName() {
        return this.challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public AdminRespondToAuthChallengeRequest withChallengeName(String challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see .
     * @see ChallengeNameType
     */

    public void setChallengeName(ChallengeNameType challengeName) {
        withChallengeName(challengeName);
    }

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public AdminRespondToAuthChallengeRequest withChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     * is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as email
     * address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes the actual
     * username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an alias in your call
     * to <code>AdminInitiateAuth</code>.
     * </p>
     * 
     * @return The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for
     *         example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     *         client is configured with client secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *         <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>, <code>USERNAME</code>,
     *         <code>SECRET_HASH</code> (if app client is configured with client secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code>
     *         (if app client is configured with client secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     *         <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such
     *         as email address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response
     *         includes the actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you
     *         specified an alias in your call to <code>AdminInitiateAuth</code>.
     */

    public java.util.Map<String, String> getChallengeResponses() {
        return challengeResponses;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     * is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as email
     * address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes the actual
     * username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an alias in your call
     * to <code>AdminInitiateAuth</code>.
     * </p>
     * 
     * @param challengeResponses
     *        The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for
     *        example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     *        client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>, <code>USERNAME</code>,
     *        <code>SECRET_HASH</code> (if app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     *        app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     *        <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as
     *        email address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes
     *        the actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an
     *        alias in your call to <code>AdminInitiateAuth</code>.
     */

    public void setChallengeResponses(java.util.Map<String, String> challengeResponses) {
        this.challengeResponses = challengeResponses;
    }

    /**
     * <p>
     * The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client
     * is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>, <code>PASSWORD_CLAIM_SECRET_BLOCK</code>,
     * <code>TIMESTAMP</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client
     * secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     * <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as email
     * address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes the actual
     * username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an alias in your call
     * to <code>AdminInitiateAuth</code>.
     * </p>
     * 
     * @param challengeResponses
     *        The challenge responses. These are inputs corresponding to the value of <code>ChallengeName</code>, for
     *        example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SMS_MFA</code>: <code>SMS_MFA_CODE</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     *        client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code>: <code>PASSWORD_CLAIM_SIGNATURE</code>,
     *        <code>PASSWORD_CLAIM_SECRET_BLOCK</code>, <code>TIMESTAMP</code>, <code>USERNAME</code>,
     *        <code>SECRET_HASH</code> (if app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     *        app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, any other required attributes,
     *        <code>USERNAME</code>, <code>SECRET_HASH</code> (if app client is configured with client secret).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as
     *        email address or phone number). To make this easier, the <code>AdminInitiateAuth</code> response includes
     *        the actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute, even if you specified an
     *        alias in your call to <code>AdminInitiateAuth</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withChallengeResponses(java.util.Map<String, String> challengeResponses) {
        setChallengeResponses(challengeResponses);
        return this;
    }

    /**
     * Add a single ChallengeResponses entry
     *
     * @see AdminRespondToAuthChallengeRequest#withChallengeResponses
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest addChallengeResponsesEntry(String key, String value) {
        if (null == this.challengeResponses) {
            this.challengeResponses = new java.util.HashMap<String, String>();
        }
        if (this.challengeResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.challengeResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChallengeResponses.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest clearChallengeResponsesEntries() {
        this.challengeResponses = null;
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If
     *        <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs
     *        to go through another challenge, they return a session with other challenge parameters. This session
     *        should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @return The session which should be passed both ways in challenge-response calls to the service. If
     *         <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller
     *         needs to go through another challenge, they return a session with other challenge parameters. This
     *         session should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs to go
     * through another challenge, they return a session with other challenge parameters. This session should be passed
     * as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If
     *        <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller needs
     *        to go through another challenge, they return a session with other challenge parameters. This session
     *        should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withSession(String session) {
        setSession(session);
        return this;
    }

    /**
     * <p>
     * The analytics metadata for collecting Amazon Pinpoint metrics for <code>AdminRespondToAuthChallenge</code> calls.
     * </p>
     * 
     * @param analyticsMetadata
     *        The analytics metadata for collecting Amazon Pinpoint metrics for <code>AdminRespondToAuthChallenge</code>
     *        calls.
     */

    public void setAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
    }

    /**
     * <p>
     * The analytics metadata for collecting Amazon Pinpoint metrics for <code>AdminRespondToAuthChallenge</code> calls.
     * </p>
     * 
     * @return The analytics metadata for collecting Amazon Pinpoint metrics for
     *         <code>AdminRespondToAuthChallenge</code> calls.
     */

    public AnalyticsMetadataType getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    /**
     * <p>
     * The analytics metadata for collecting Amazon Pinpoint metrics for <code>AdminRespondToAuthChallenge</code> calls.
     * </p>
     * 
     * @param analyticsMetadata
     *        The analytics metadata for collecting Amazon Pinpoint metrics for <code>AdminRespondToAuthChallenge</code>
     *        calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        setAnalyticsMetadata(analyticsMetadata);
        return this;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     * 
     * @param contextData
     *        Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the
     *        risk of an unexpected event by Amazon Cognito advanced security.
     */

    public void setContextData(ContextDataType contextData) {
        this.contextData = contextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     * 
     * @return Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the
     *         risk of an unexpected event by Amazon Cognito advanced security.
     */

    public ContextDataType getContextData() {
        return this.contextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     * 
     * @param contextData
     *        Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the
     *        risk of an unexpected event by Amazon Cognito advanced security.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withContextData(ContextDataType contextData) {
        setContextData(contextData);
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     * triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post authentication</i>, <i>user migration</i>, <i>pre
     * token generation</i>, <i>define auth challenge</i>, <i>create auth challenge</i>, and <i>verify auth challenge
     * response</i>. When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code
     * in AWS Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific
     * needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *         triggers. </p>
     *         <p>
     *         You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     *         AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the
     *         following triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post authentication</i>, <i>user
     *         migration</i>, <i>pre token generation</i>, <i>define auth challenge</i>, <i>create auth challenge</i>,
     *         and <i>verify auth challenge response</i>. When Amazon Cognito invokes any of these functions, it passes
     *         a JSON payload, which the function receives as input. This payload contains a <code>clientMetadata</code>
     *         attribute, which provides the data that you assigned to the ClientMetadata parameter in your
     *         AdminRespondToAuthChallenge request. In your function code in AWS Lambda, you can process the
     *         <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Take the following limitations into consideration when you use the ClientMetadata parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda
     *         triggers that are assigned to a user pool to support custom workflows. If your user pool configuration
     *         does not include triggers, the ClientMetadata parameter serves no purpose.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito does not validate the ClientMetadata value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive
     *         information.
     *         </p>
     *         </li>
     *         </ul>
     */

    public java.util.Map<String, String> getClientMetadata() {
        return clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     * triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post authentication</i>, <i>user migration</i>, <i>pre
     * token generation</i>, <i>define auth challenge</i>, <i>create auth challenge</i>, and <i>verify auth challenge
     * response</i>. When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code
     * in AWS Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific
     * needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        triggers. </p>
     *        <p>
     *        You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     *        AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the
     *        following triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post authentication</i>, <i>user
     *        migration</i>, <i>pre token generation</i>, <i>define auth challenge</i>, <i>create auth challenge</i>,
     *        and <i>verify auth challenge response</i>. When Amazon Cognito invokes any of these functions, it passes a
     *        JSON payload, which the function receives as input. This payload contains a <code>clientMetadata</code>
     *        attribute, which provides the data that you assigned to the ClientMetadata parameter in your
     *        AdminRespondToAuthChallenge request. In your function code in AWS Lambda, you can process the
     *        <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Take the following limitations into consideration when you use the ClientMetadata parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers
     *        that are assigned to a user pool to support custom workflows. If your user pool configuration does not
     *        include triggers, the ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive
     *        information.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     * AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following
     * triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post authentication</i>, <i>user migration</i>, <i>pre
     * token generation</i>, <i>define auth challenge</i>, <i>create auth challenge</i>, and <i>verify auth challenge
     * response</i>. When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code
     * in AWS Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific
     * needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Take the following limitations into consideration when you use the ClientMetadata parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that
     * are assigned to a user pool to support custom workflows. If your user pool configuration does not include
     * triggers, the ClientMetadata parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        triggers. </p>
     *        <p>
     *        You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the
     *        AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the
     *        following triggers: <i>pre sign-up</i>, <i>custom message</i>, <i>post authentication</i>, <i>user
     *        migration</i>, <i>pre token generation</i>, <i>define auth challenge</i>, <i>create auth challenge</i>,
     *        and <i>verify auth challenge response</i>. When Amazon Cognito invokes any of these functions, it passes a
     *        JSON payload, which the function receives as input. This payload contains a <code>clientMetadata</code>
     *        attribute, which provides the data that you assigned to the ClientMetadata parameter in your
     *        AdminRespondToAuthChallenge request. In your function code in AWS Lambda, you can process the
     *        <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        >Customizing User Pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Take the following limitations into consideration when you use the ClientMetadata parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers
     *        that are assigned to a user pool to support custom workflows. If your user pool configuration does not
     *        include triggers, the ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive
     *        information.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest withClientMetadata(java.util.Map<String, String> clientMetadata) {
        setClientMetadata(clientMetadata);
        return this;
    }

    /**
     * Add a single ClientMetadata entry
     *
     * @see AdminRespondToAuthChallengeRequest#withClientMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest addClientMetadataEntry(String key, String value) {
        if (null == this.clientMetadata) {
            this.clientMetadata = new java.util.HashMap<String, String>();
        }
        if (this.clientMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.clientMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminRespondToAuthChallengeRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append("***Sensitive Data Redacted***").append(",");
        if (getChallengeName() != null)
            sb.append("ChallengeName: ").append(getChallengeName()).append(",");
        if (getChallengeResponses() != null)
            sb.append("ChallengeResponses: ").append(getChallengeResponses()).append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession()).append(",");
        if (getAnalyticsMetadata() != null)
            sb.append("AnalyticsMetadata: ").append(getAnalyticsMetadata()).append(",");
        if (getContextData() != null)
            sb.append("ContextData: ").append(getContextData()).append(",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: ").append(getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminRespondToAuthChallengeRequest == false)
            return false;
        AdminRespondToAuthChallengeRequest other = (AdminRespondToAuthChallengeRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getChallengeResponses() == null ^ this.getChallengeResponses() == null)
            return false;
        if (other.getChallengeResponses() != null && other.getChallengeResponses().equals(this.getChallengeResponses()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getAnalyticsMetadata() == null ^ this.getAnalyticsMetadata() == null)
            return false;
        if (other.getAnalyticsMetadata() != null && other.getAnalyticsMetadata().equals(this.getAnalyticsMetadata()) == false)
            return false;
        if (other.getContextData() == null ^ this.getContextData() == null)
            return false;
        if (other.getContextData() != null && other.getContextData().equals(this.getContextData()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode + ((getChallengeResponses() == null) ? 0 : getChallengeResponses().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getAnalyticsMetadata() == null) ? 0 : getAnalyticsMetadata().hashCode());
        hashCode = prime * hashCode + ((getContextData() == null) ? 0 : getContextData().hashCode());
        hashCode = prime * hashCode + ((getClientMetadata() == null) ? 0 : getClientMetadata().hashCode());
        return hashCode;
    }

    @Override
    public AdminRespondToAuthChallengeRequest clone() {
        return (AdminRespondToAuthChallengeRequest) super.clone();
    }

}

/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
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
     * <note>
     * <p>
     * <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when signing in with a remembered device.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code>
     * (if app client is configured with client secret). To set any required attributes that Amazon Cognito returned as
     * <code>requiredAttributes</code> in the <code>AdminInitiateAuth</code> response, add a
     * <code>userAttributes.<i>attributename</i> </code> parameter. This parameter can also set values for writable
     * attributes that aren't required by your user pool.
     * </p>
     * <note>
     * <p>
     * In a <code>NEW_PASSWORD_REQUIRED</code> challenge response, you can't modify a required attribute that already
     * has a value. In <code>AdminRespondToAuthChallenge</code>, set a value for any keys that Amazon Cognito returned
     * in the <code>requiredAttributes</code> parameter, then use the <code>AdminUpdateUserAttributes</code> API
     * operation to modify the value of any additional attributes.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use the session value returned by
     * <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as an
     * email address or phone number). To make this simpler, the <code>AdminInitiateAuth</code> response includes the
     * actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens even if you specified
     * an alias in your call to <code>AdminInitiateAuth</code>.
     * </p>
     */
    private java.util.Map<String, String> challengeResponses;
    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls to the service. If an
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller must pass
     * another challenge, it returns a session with other challenge parameters. This session should be passed as it is
     * to the next <code>RespondToAuthChallenge</code> API call.
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
     * Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon Cognito
     * advanced security evaluates the risk of an authentication event based on the context that your app generates and
     * passes to Amazon Cognito when it makes API requests.
     * </p>
     */
    private ContextDataType contextData;
    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     * AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that you have assigned to the
     * following triggers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pre sign-up
     * </p>
     * </li>
     * <li>
     * <p>
     * custom message
     * </p>
     * </li>
     * <li>
     * <p>
     * post authentication
     * </p>
     * </li>
     * <li>
     * <p>
     * user migration
     * </p>
     * </li>
     * <li>
     * <p>
     * pre token generation
     * </p>
     * </li>
     * <li>
     * <p>
     * define auth challenge
     * </p>
     * </li>
     * <li>
     * <p>
     * create auth challenge
     * </p>
     * </li>
     * <li>
     * <p>
     * verify auth challenge response
     * </p>
     * </li>
     * </ul>
     * <p>
     * When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives as
     * input. This payload contains a <code>clientMetadata</code> attribute that provides the data that you assigned to
     * the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code in Lambda, you
     * can process the <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool
     * to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
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
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *        >AdminInitiateAuth</a>.
     * @see ChallengeNameType
     */

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * 
     * @return The challenge name. For more information, see <a
     *         href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *         >AdminInitiateAuth</a>.
     * @see ChallengeNameType
     */

    public String getChallengeName() {
        return this.challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *        >AdminInitiateAuth</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public AdminRespondToAuthChallengeRequest withChallengeName(String challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *        >AdminInitiateAuth</a>.
     * @see ChallengeNameType
     */

    public void setChallengeName(ChallengeNameType challengeName) {
        withChallengeName(challengeName);
    }

    /**
     * <p>
     * The challenge name. For more information, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     * >AdminInitiateAuth</a>.
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html"
     *        >AdminInitiateAuth</a>.
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
     * <note>
     * <p>
     * <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when signing in with a remembered device.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code>
     * (if app client is configured with client secret). To set any required attributes that Amazon Cognito returned as
     * <code>requiredAttributes</code> in the <code>AdminInitiateAuth</code> response, add a
     * <code>userAttributes.<i>attributename</i> </code> parameter. This parameter can also set values for writable
     * attributes that aren't required by your user pool.
     * </p>
     * <note>
     * <p>
     * In a <code>NEW_PASSWORD_REQUIRED</code> challenge response, you can't modify a required attribute that already
     * has a value. In <code>AdminRespondToAuthChallenge</code>, set a value for any keys that Amazon Cognito returned
     * in the <code>requiredAttributes</code> parameter, then use the <code>AdminUpdateUserAttributes</code> API
     * operation to modify the value of any additional attributes.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use the session value returned by
     * <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as an
     * email address or phone number). To make this simpler, the <code>AdminInitiateAuth</code> response includes the
     * actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens even if you specified
     * an alias in your call to <code>AdminInitiateAuth</code>.
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
     *         <note>
     *         <p>
     *         <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when signing in with a remembered device.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code>
     *         (if app client is configured with client secret).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, <code>USERNAME</code>,
     *         <code>SECRET_HASH</code> (if app client is configured with client secret). To set any required attributes
     *         that Amazon Cognito returned as <code>requiredAttributes</code> in the <code>AdminInitiateAuth</code>
     *         response, add a <code>userAttributes.<i>attributename</i> </code> parameter. This parameter can also set
     *         values for writable attributes that aren't required by your user pool.
     *         </p>
     *         <note>
     *         <p>
     *         In a <code>NEW_PASSWORD_REQUIRED</code> challenge response, you can't modify a required attribute that
     *         already has a value. In <code>AdminRespondToAuthChallenge</code>, set a value for any keys that Amazon
     *         Cognito returned in the <code>requiredAttributes</code> parameter, then use the
     *         <code>AdminUpdateUserAttributes</code> API operation to modify the value of any additional attributes.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use the session value returned by
     *         <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such
     *         as an email address or phone number). To make this simpler, the <code>AdminInitiateAuth</code> response
     *         includes the actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens
     *         even if you specified an alias in your call to <code>AdminInitiateAuth</code>.
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
     * <note>
     * <p>
     * <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when signing in with a remembered device.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code>
     * (if app client is configured with client secret). To set any required attributes that Amazon Cognito returned as
     * <code>requiredAttributes</code> in the <code>AdminInitiateAuth</code> response, add a
     * <code>userAttributes.<i>attributename</i> </code> parameter. This parameter can also set values for writable
     * attributes that aren't required by your user pool.
     * </p>
     * <note>
     * <p>
     * In a <code>NEW_PASSWORD_REQUIRED</code> challenge response, you can't modify a required attribute that already
     * has a value. In <code>AdminRespondToAuthChallenge</code>, set a value for any keys that Amazon Cognito returned
     * in the <code>requiredAttributes</code> parameter, then use the <code>AdminUpdateUserAttributes</code> API
     * operation to modify the value of any additional attributes.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use the session value returned by
     * <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as an
     * email address or phone number). To make this simpler, the <code>AdminInitiateAuth</code> response includes the
     * actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens even if you specified
     * an alias in your call to <code>AdminInitiateAuth</code>.
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
     *        <note>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when signing in with a remembered device.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     *        app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, <code>USERNAME</code>,
     *        <code>SECRET_HASH</code> (if app client is configured with client secret). To set any required attributes
     *        that Amazon Cognito returned as <code>requiredAttributes</code> in the <code>AdminInitiateAuth</code>
     *        response, add a <code>userAttributes.<i>attributename</i> </code> parameter. This parameter can also set
     *        values for writable attributes that aren't required by your user pool.
     *        </p>
     *        <note>
     *        <p>
     *        In a <code>NEW_PASSWORD_REQUIRED</code> challenge response, you can't modify a required attribute that
     *        already has a value. In <code>AdminRespondToAuthChallenge</code>, set a value for any keys that Amazon
     *        Cognito returned in the <code>requiredAttributes</code> parameter, then use the
     *        <code>AdminUpdateUserAttributes</code> API operation to modify the value of any additional attributes.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use the session value returned by
     *        <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as
     *        an email address or phone number). To make this simpler, the <code>AdminInitiateAuth</code> response
     *        includes the actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens
     *        even if you specified an alias in your call to <code>AdminInitiateAuth</code>.
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
     * <note>
     * <p>
     * <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when signing in with a remembered device.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if app
     * client is configured with client secret).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code>
     * (if app client is configured with client secret). To set any required attributes that Amazon Cognito returned as
     * <code>requiredAttributes</code> in the <code>AdminInitiateAuth</code> response, add a
     * <code>userAttributes.<i>attributename</i> </code> parameter. This parameter can also set values for writable
     * attributes that aren't required by your user pool.
     * </p>
     * <note>
     * <p>
     * In a <code>NEW_PASSWORD_REQUIRED</code> challenge response, you can't modify a required attribute that already
     * has a value. In <code>AdminRespondToAuthChallenge</code>, set a value for any keys that Amazon Cognito returned
     * in the <code>requiredAttributes</code> parameter, then use the <code>AdminUpdateUserAttributes</code> API
     * operation to modify the value of any additional attributes.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use the session value returned by
     * <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as an
     * email address or phone number). To make this simpler, the <code>AdminInitiateAuth</code> response includes the
     * actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens even if you specified
     * an alias in your call to <code>AdminInitiateAuth</code>.
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
     *        <note>
     *        <p>
     *        <code>PASSWORD_VERIFIER</code> requires <code>DEVICE_KEY</code> when signing in with a remembered device.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>ADMIN_NO_SRP_AUTH</code>: <code>PASSWORD</code>, <code>USERNAME</code>, <code>SECRET_HASH</code> (if
     *        app client is configured with client secret).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_PASSWORD_REQUIRED</code>: <code>NEW_PASSWORD</code>, <code>USERNAME</code>,
     *        <code>SECRET_HASH</code> (if app client is configured with client secret). To set any required attributes
     *        that Amazon Cognito returned as <code>requiredAttributes</code> in the <code>AdminInitiateAuth</code>
     *        response, add a <code>userAttributes.<i>attributename</i> </code> parameter. This parameter can also set
     *        values for writable attributes that aren't required by your user pool.
     *        </p>
     *        <note>
     *        <p>
     *        In a <code>NEW_PASSWORD_REQUIRED</code> challenge response, you can't modify a required attribute that
     *        already has a value. In <code>AdminRespondToAuthChallenge</code>, set a value for any keys that Amazon
     *        Cognito returned in the <code>requiredAttributes</code> parameter, then use the
     *        <code>AdminUpdateUserAttributes</code> API operation to modify the value of any additional attributes.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>MFA_SETUP</code> requires <code>USERNAME</code>, plus you must use the session value returned by
     *        <code>VerifySoftwareToken</code> in the <code>Session</code> parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The value of the <code>USERNAME</code> attribute must be the user's actual username, not an alias (such as
     *        an email address or phone number). To make this simpler, the <code>AdminInitiateAuth</code> response
     *        includes the actual username value in the <code>USERNAMEUSER_ID_FOR_SRP</code> attribute. This happens
     *        even if you specified an alias in your call to <code>AdminInitiateAuth</code>.
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
     * The session that should be passed both ways in challenge-response calls to the service. If an
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller must pass
     * another challenge, it returns a session with other challenge parameters. This session should be passed as it is
     * to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session that should be passed both ways in challenge-response calls to the service. If an
     *        <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller must
     *        pass another challenge, it returns a session with other challenge parameters. This session should be
     *        passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls to the service. If an
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller must pass
     * another challenge, it returns a session with other challenge parameters. This session should be passed as it is
     * to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @return The session that should be passed both ways in challenge-response calls to the service. If an
     *         <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller must
     *         pass another challenge, it returns a session with other challenge parameters. This session should be
     *         passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls to the service. If an
     * <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller must pass
     * another challenge, it returns a session with other challenge parameters. This session should be passed as it is
     * to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session that should be passed both ways in challenge-response calls to the service. If an
     *        <code>InitiateAuth</code> or <code>RespondToAuthChallenge</code> API call determines that the caller must
     *        pass another challenge, it returns a session with other challenge parameters. This session should be
     *        passed as it is to the next <code>RespondToAuthChallenge</code> API call.
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
     * Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon Cognito
     * advanced security evaluates the risk of an authentication event based on the context that your app generates and
     * passes to Amazon Cognito when it makes API requests.
     * </p>
     * 
     * @param contextData
     *        Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon
     *        Cognito advanced security evaluates the risk of an authentication event based on the context that your app
     *        generates and passes to Amazon Cognito when it makes API requests.
     */

    public void setContextData(ContextDataType contextData) {
        this.contextData = contextData;
    }

    /**
     * <p>
     * Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon Cognito
     * advanced security evaluates the risk of an authentication event based on the context that your app generates and
     * passes to Amazon Cognito when it makes API requests.
     * </p>
     * 
     * @return Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon
     *         Cognito advanced security evaluates the risk of an authentication event based on the context that your
     *         app generates and passes to Amazon Cognito when it makes API requests.
     */

    public ContextDataType getContextData() {
        return this.contextData;
    }

    /**
     * <p>
     * Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon Cognito
     * advanced security evaluates the risk of an authentication event based on the context that your app generates and
     * passes to Amazon Cognito when it makes API requests.
     * </p>
     * 
     * @param contextData
     *        Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon
     *        Cognito advanced security evaluates the risk of an authentication event based on the context that your app
     *        generates and passes to Amazon Cognito when it makes API requests.
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
     * You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     * AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that you have assigned to the
     * following triggers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pre sign-up
     * </p>
     * </li>
     * <li>
     * <p>
     * custom message
     * </p>
     * </li>
     * <li>
     * <p>
     * post authentication
     * </p>
     * </li>
     * <li>
     * <p>
     * user migration
     * </p>
     * </li>
     * <li>
     * <p>
     * pre token generation
     * </p>
     * </li>
     * <li>
     * <p>
     * define auth challenge
     * </p>
     * </li>
     * <li>
     * <p>
     * create auth challenge
     * </p>
     * </li>
     * <li>
     * <p>
     * verify auth challenge response
     * </p>
     * </li>
     * </ul>
     * <p>
     * When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives as
     * input. This payload contains a <code>clientMetadata</code> attribute that provides the data that you assigned to
     * the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code in Lambda, you
     * can process the <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool
     * to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *         triggers.</p>
     *         <p>
     *         You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     *         AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that you have assigned to
     *         the following triggers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         pre sign-up
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         custom message
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         post authentication
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         user migration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         pre token generation
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         define auth challenge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         create auth challenge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         verify auth challenge response
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives
     *         as input. This payload contains a <code>clientMetadata</code> attribute that provides the data that you
     *         assigned to the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function
     *         code in Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your
     *         specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a
     *         user pool to support custom workflows. If your user pool configuration doesn't include triggers, the
     *         ClientMetadata parameter serves no purpose.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Validate the ClientMetadata value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
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
     * You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     * AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that you have assigned to the
     * following triggers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pre sign-up
     * </p>
     * </li>
     * <li>
     * <p>
     * custom message
     * </p>
     * </li>
     * <li>
     * <p>
     * post authentication
     * </p>
     * </li>
     * <li>
     * <p>
     * user migration
     * </p>
     * </li>
     * <li>
     * <p>
     * pre token generation
     * </p>
     * </li>
     * <li>
     * <p>
     * define auth challenge
     * </p>
     * </li>
     * <li>
     * <p>
     * create auth challenge
     * </p>
     * </li>
     * <li>
     * <p>
     * verify auth challenge response
     * </p>
     * </li>
     * </ul>
     * <p>
     * When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives as
     * input. This payload contains a <code>clientMetadata</code> attribute that provides the data that you assigned to
     * the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code in Lambda, you
     * can process the <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool
     * to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        triggers.</p>
     *        <p>
     *        You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     *        AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that you have assigned to the
     *        following triggers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        pre sign-up
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        custom message
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        post authentication
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        user migration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pre token generation
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        define auth challenge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        create auth challenge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        verify auth challenge response
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives
     *        as input. This payload contains a <code>clientMetadata</code> attribute that provides the data that you
     *        assigned to the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function
     *        code in Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your
     *        specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user
     *        pool to support custom workflows. If your user pool configuration doesn't include triggers, the
     *        ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
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
     * You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     * AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that you have assigned to the
     * following triggers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pre sign-up
     * </p>
     * </li>
     * <li>
     * <p>
     * custom message
     * </p>
     * </li>
     * <li>
     * <p>
     * post authentication
     * </p>
     * </li>
     * <li>
     * <p>
     * user migration
     * </p>
     * </li>
     * <li>
     * <p>
     * pre token generation
     * </p>
     * </li>
     * <li>
     * <p>
     * define auth challenge
     * </p>
     * </li>
     * <li>
     * <p>
     * create auth challenge
     * </p>
     * </li>
     * <li>
     * <p>
     * verify auth challenge response
     * </p>
     * </li>
     * </ul>
     * <p>
     * When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives as
     * input. This payload contains a <code>clientMetadata</code> attribute that provides the data that you assigned to
     * the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code in Lambda, you
     * can process the <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool
     * to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        triggers.</p>
     *        <p>
     *        You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     *        AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that you have assigned to the
     *        following triggers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        pre sign-up
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        custom message
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        post authentication
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        user migration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pre token generation
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        define auth challenge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        create auth challenge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        verify auth challenge response
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives
     *        as input. This payload contains a <code>clientMetadata</code> attribute that provides the data that you
     *        assigned to the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function
     *        code in Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your
     *        specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user
     *        pool to support custom workflows. If your user pool configuration doesn't include triggers, the
     *        ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
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

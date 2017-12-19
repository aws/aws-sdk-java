/*
 *  Copyright 2013-2016 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.amazonaws.connectors.cognitoidp.util;

/**
 * All key-words for service calls.
 */
public class CognitoServiceConstants {
    /**
     * Indicates user auth through SRP.
     */
    public static final String AUTH_TYPE_INIT_USER_SRP = "USER_SRP_AUTH";
    /**
     * Indicates auth through token refresh.
     */
    public static final String AUTH_TYPE_REFRESH_TOKEN = "REFRESH_TOKEN_AUTH";
    /**
     * Indicates user auth through a custom process.
     */
    public static final String AUTH_TYPE_INIT_CUSTOM_AUTH = "CUSTOM_AUTH";
    /**
     * Indicates MFA SETUP challenge.
     */
    public static final String CHLG_TYPE_MFA_SETUP = "MFA_SETUP";
    /**
     * Indicates SELECT MFA TYPE challenge.
     */
    public static final String CHLG_TYPE_SELECT_MFA_TYPE = "SELECT_MFA_TYPE";
    /**
     * Indicates SMS MFA challenge.
     */
    public static final String CHLG_TYPE_SMS_MFA = "SMS_MFA";
    /**
     * Indicates SOFTWARE TOKEN MFA challenge.
     */
    public static final String CHLG_TYPE_SOFTWARE_TOKEN_MFA = "SOFTWARE_TOKEN_MFA";
    /**
     * Indicates challenge for user password.
     */
    public static final String CHLG_TYPE_USER_PASSWORD_VERIFIER = "PASSWORD_VERIFIER";
    /**
     * Indicates challenge for a custom auth process.
     */
    public static final String CHLG_TYPE_CUSTOM_CHALLENGE = "CUSTOM_CHALLENGE";
    /**
     * Indicates challenge for device authentication.
     */
    public static final String CHLG_TYPE_DEVICE_SRP_AUTH = "DEVICE_SRP_AUTH";
    /**
     * Indicates challenge for password for device authentication.
     */
    public static final String CHLG_TYPE_DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER";
    /**
     * Indicates a challenge to set a new password.
     */
    public static final String CHLG_TYPE_NEW_PASSWORD_REQUIRED = "NEW_PASSWORD_REQUIRED";
    /**
     * Indicates a refresh-token parameter. 
     */
    public static final String AUTH_PARAM_REFRESH_TOKEN = "REFRESH_TOKEN";
    /**
     * Indicates a device-key parameter.
     */
    public static final String AUTH_PARAM_DEVICE_KEY = "DEVICE_KEY";
    /**
     * Indicates secret hash parameter for SRP verification.
     */
    public static final String AUTH_PARAM_SECRET_HASH = "SECRET_HASH";
    /**
     * Indicates user-name parameter.
     */
    public static final String AUTH_PARAM_USERNAME = "USERNAME";
    /**
     * Indicates the SRP parameter type.
     */
    public static final String AUTH_PARAM_SRP_A = "SRP_A";
    /**
     * Indicates validation data parameter.
     */
    public static final String AUTH_PARAM_VALIDATION_DATA = "VALIDATION_DATA";
    /**
     * Indicates challenge type parameter.
     */
    public static final String AUTH_PARAM_CHALLENGE_NAME = "CHALLENGE_NAME";
    /**
     * Indicates user password parameter.
     */
    public static final String AUTH_PARAM_PASSWORD = "PASSWORD";
    /**
     * Indicates salt parameter for SRP authentication.
     */
    public static final String CHLG_PARAM_SALT = "SALT";
    /**
     * Indicates the SRP parameter type.
     */
    public static final String CHLG_PARAM_SRP_B = "SRP_B";
    /**
     * Indicates secret block parameter.
     */
    public static final String CHLG_PARAM_SECRET_BLOCK = "SECRET_BLOCK";
    /**
     * Indicates user-name parameter.
     */
    public static final String CHLG_PARAM_USERNAME = "USERNAME";
    /**
     * Indicates device-key parameter.
     */
    public static final String CHLG_PARAM_DEVICE_KEY = "DEVICE_KEY";
    /**
     * Indicates medium through which a code was sent.
     */
    public static final String CHLG_PARAM_CODE_DEL_MEDIUM = "CODE_DELIVERY_DELIVERY_MEDIUM";
    /**
     * Indicates parameter for code destination.
     */
    public static final String CHLG_PARAM_CODE_DEL_DESTINATION = "CODE_DELIVERY_DESTINATION";
    /**
     * Indicates parameter for MFA options available to authenticate.
     */
    public static final String CHLG_PARAM_MFAS_CAN_CHOOSE = "MFAS_CAN_CHOOSE";
    /**
     * Indicates parameter for MFA's to be setup to authenticate.
     */
    public static final String CHLG_PARAM_MFAS_CAN_SETUP = "MFAS_CAN_SETUP";
    /**
     * Indicates parameter for internal user-name.
     */
    public static final String CHLG_PARAM_USER_ID_FOR_SRP = "USER_ID_FOR_SRP";
    /**
     * Indicates user attributes parameter.
     */
    public static final String CHLG_PARAM_USER_ATTRIBUTE = "userAttributes";
    /**
     * Indicates user attributes parameter.
     */
    public static final String CHLG_PARAM_USER_ATTRIBUTE_PREFIX = "userAttributes.";
    /**
     * Indicates required attributes parameter.
     */
    public static final String CHLG_PARAM_REQUIRED_ATTRIBUTE = "requiredAttributes";
    /**
     * Indicates SMS MFA code response parameter.
     */
    public static final String CHLG_RESP_SMS_MFA_CODE = "SMS_MFA_CODE";
    /**
     * Indicates SOFTWARE TOKEN MFA code response parameter.
     */
    public static final String CHLG_RESP_SOFTWARE_TOKEN_MFA_CODE = "SOFTWARE_TOKEN_MFA_CODE";
    /**
     * Indicates time-stamp response parameter.
     */
    public static final String CHLG_RESP_TIMESTAMP = "TIMESTAMP";
    /**
     * Indicates a SRP response parameter. 
     */
    public static final String CHLG_RESP_PASSWORD_CLAIM_SECRET_BLOCK = "PASSWORD_CLAIM_SECRET_BLOCK";
    /**
     * Indicates a SRP response parameter.
     */
    public static final String CHLG_RESP_PASSWORD_CLAIM_SIGNATURE = "PASSWORD_CLAIM_SIGNATURE";
    /**
     * Indicates a SRP response parameter.
     */
    public static final String CHLG_RESP_SECRET_HASH = "SECRET_HASH";
    /**
     * Indicates user-name response parameter.
     */
    public static final String CHLG_RESP_USERNAME = "USERNAME";
    /**
     * Indicates a SRP response parameter.
     */
    public static final String CHLG_RESP_SRP_A = "SRP_A";
    /**
     * Indicates the user's response to a challenge/
     */
    public static final String CHLG_RESP_ANSWER = "ANSWER";
    /**
     * Indicates device-key response parameter.
     */
    public static final String CHLG_RESP_DEVICE_KEY = "DEVICE_KEY";
    /**
     * Indicates user password response parameter.
     */
    public static final String CHLG_RESP_PASSWORD = "PASSWORD";
    /**
     * Indicates new user password response parameter.
     */
    public static final String CHLG_RESP_NEW_PASSWORD = "NEW_PASSWORD";
    /**
     * Indicates the default value for device friendly name for TOTP MFA.
     */
    public static final String DEFAULT_TOTP_DEVICE_FRIENDLY_NAME = "Time-based One-time Password MFA";
}

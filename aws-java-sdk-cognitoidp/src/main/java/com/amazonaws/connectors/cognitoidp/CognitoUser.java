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

package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.AuthenticationDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChallengeContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ChooseMfaContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.ForgotPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.MultiFactorAuthenticationContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.NewPasswordContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.RegisterMfaContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.VerifyMfaContinuation;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoInternalErrorException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoNotAuthorizedException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.AuthenticationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.DevicesHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.ForgotPasswordHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GenericHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.GetDetailsHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.RegisterMfaHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.UpdateAttributesHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.VerificationHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoAccessToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoIdToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoRefreshToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoDeviceHelper;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoSecretHash;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.Hkdf;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.model.AnalyticsMetadataType;
import com.amazonaws.services.cognitoidentityprovider.model.AssociateSoftwareTokenRequest;
import com.amazonaws.services.cognitoidentityprovider.model.AssociateSoftwareTokenResult;
import com.amazonaws.services.cognitoidentityprovider.model.AttributeType;
import com.amazonaws.services.cognitoidentityprovider.model.AuthenticationResultType;
import com.amazonaws.services.cognitoidentityprovider.model.ChangePasswordRequest;
import com.amazonaws.services.cognitoidentityprovider.model.CodeDeliveryDetailsType;
import com.amazonaws.services.cognitoidentityprovider.model.ConfirmDeviceRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ConfirmDeviceResult;
import com.amazonaws.services.cognitoidentityprovider.model.ConfirmForgotPasswordRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ConfirmSignUpRequest;
import com.amazonaws.services.cognitoidentityprovider.model.DeleteUserAttributesRequest;
import com.amazonaws.services.cognitoidentityprovider.model.DeleteUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.DeviceSecretVerifierConfigType;
import com.amazonaws.services.cognitoidentityprovider.model.DeviceType;
import com.amazonaws.services.cognitoidentityprovider.model.ForgotPasswordRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ForgotPasswordResult;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserAttributeVerificationCodeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserAttributeVerificationCodeResult;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetUserResult;
import com.amazonaws.services.cognitoidentityprovider.model.GlobalSignOutRequest;
import com.amazonaws.services.cognitoidentityprovider.model.InitiateAuthRequest;
import com.amazonaws.services.cognitoidentityprovider.model.InitiateAuthResult;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidParameterException;
import com.amazonaws.services.cognitoidentityprovider.model.ListDevicesRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ListDevicesResult;
import com.amazonaws.services.cognitoidentityprovider.model.NewDeviceMetadataType;
import com.amazonaws.services.cognitoidentityprovider.model.NotAuthorizedException;
import com.amazonaws.services.cognitoidentityprovider.model.ResendConfirmationCodeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ResendConfirmationCodeResult;
import com.amazonaws.services.cognitoidentityprovider.model.ResourceNotFoundException;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.RespondToAuthChallengeResult;
import com.amazonaws.services.cognitoidentityprovider.model.SMSMfaSettingsType;
import com.amazonaws.services.cognitoidentityprovider.model.SetUserMFAPreferenceRequest;
import com.amazonaws.services.cognitoidentityprovider.model.SetUserMFAPreferenceResult;
import com.amazonaws.services.cognitoidentityprovider.model.SetUserSettingsRequest;
import com.amazonaws.services.cognitoidentityprovider.model.SetUserSettingsResult;
import com.amazonaws.services.cognitoidentityprovider.model.SoftwareTokenMfaSettingsType;
import com.amazonaws.services.cognitoidentityprovider.model.UpdateUserAttributesRequest;
import com.amazonaws.services.cognitoidentityprovider.model.UpdateUserAttributesResult;
import com.amazonaws.services.cognitoidentityprovider.model.UserContextDataType;
import com.amazonaws.services.cognitoidentityprovider.model.VerifySoftwareTokenRequest;
import com.amazonaws.services.cognitoidentityprovider.model.VerifySoftwareTokenResponseType;
import com.amazonaws.services.cognitoidentityprovider.model.VerifySoftwareTokenResult;
import com.amazonaws.services.cognitoidentityprovider.model.VerifyUserAttributeRequest;
import com.amazonaws.services.cognitoidentityprovider.model.VerifyUserAttributeResult;
import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Represents a single Cognito User.
 * <p>
 * This class encapsulates all operations possible on a user and all tokens
 * belonging to the user. The user tokens, as {@link CognitoUserSession}, are
 * stored in SharedPreferences. Only the tokens belonging to the last
 * successfully authenticated user are stored.
 * </p>
 */
public class CognitoUser {
    private static final Log LOGGER = LogFactory.getLog(CognitoUser.class);

    private static final int SRP_RADIX = 16;

    /**
     * Application context.
     */
    private final Context context;

    /**
     * CIP low-level client.
     */
    private final AmazonCognitoIdentityProvider cognitoIdentityProviderClient;

    /**
     * Client ID for Your Identity Pool.
     */
    private final String clientId;

    /**
     * Client secret generated for this {@code clientId}, this may be
     * {@code null} if a secret is not generated for the {@code clientId}.
     */
    private final String clientSecret;

    /**
     * userId for this user, this is mutable to allow the userId to be set
     * during authentication. This can be the username (users' unique sign-in
     * username) or an alias (if available, such as email or phone number).
     */
    private String userId;

    /**
     * Username used for authentication process. This will be set from the
     * results in the pre-auth API call.
     */
    private String usernameInternal;

    /**
     * Device-key of this device, if available.
     */
    private String deviceKey;

    /**
     * Reference to the {@link CognitoUserPool} to which this user belongs .
     */
    private final CognitoUserPool pool;

    /**
     * Secret-Hash for this user-pool, this is mutable because userId is
     * mutable.
     */
    private String secretHash;

    /**
     * The current session.
     */
    private CognitoUserSession cipSession;

    /**
     * Constructs a new Cognito User from a Cognito user identity pool
     * {@link CognitoUserPool} and userId.
     *
     * @param pool REQUIRED: Reference to {@link CognitoUserPool}, to which this
     *            user belongs.
     * @param userId REQUIRED: userId of this user.
     * @param clientId REQUIRED: Client-Id of the android app.
     * @param clientSecret REQUIRED: Client secret assigned for this Client-Id.
     * @param secretHash REQUIRED: Secret-Hash, calculated for this android app.
     * @param client REQUIRED: Low level android client.
     * @param context REQUIRED: Application context.
     */
    protected CognitoUser(CognitoUserPool pool, String userId,
            String clientId, String clientSecret, String secretHash,
            AmazonCognitoIdentityProvider client, Context context) {
        this.pool = pool;
        this.context = context;
        this.userId = userId;
        this.cognitoIdentityProviderClient = client;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.secretHash = secretHash;
        this.deviceKey = null;
        cipSession = null;
    }

    /**
     * Returns the userId of this user.
     *
     * @return userId.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Returns the pool Id of this user.
     *
     * @return pool Id.
     */
    public String getUserPoolId() {
        return pool.getUserPoolId();
    }

    /**
     * Method low-level client for Amazon Cognito Identity Provider.
     *
     * @return
     */
    protected AmazonCognitoIdentityProvider getCognitoIdentityProviderClient() {
        return cognitoIdentityProviderClient;
    }

    /**
     * Confirms user registration in background.
     * <p>
     * Confirming a user is required to complete the user's registration. Any
     * other operations on a user. are possible only after registration
     * confirmation.
     * </p>
     *
     * @param confirmationCode REQUIRED: Code sent to the phone-number or email
     *            used to register the user.
     * @param forcedAliasCreation REQUIRED: This flag indicates if the
     *            confirmation should go-through in case of parameter
     *            contentions.
     * @param callback REQUIRED: This is a reference to {@link GenericHandler}
     *            callback handler.
     */
    public void confirmSignUpInBackground(final String confirmationCode,
            final boolean forcedAliasCreation,
            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    confirmSignUpInternal(confirmationCode, forcedAliasCreation);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Confirms user registration in current thread.
     * <p>
     * Confirming a user is required to complete the user's registration. Any
     * other operations on a user are possible only after registration
     * confirmation. <b>Note:</b> This method will perform network operations.
     * Calling this method in applications' main thread will cause Android to
     * throw NetworkOnMainThreadException.
     * </p>
     *
     * @param confirmationCode REQUIRED: Code sent to the phone-number or email
     *            used to register the user
     * @param forcedAliasCreation REQUIRED: This flag indicates if the
     *            confirmation should go-through in case of parameter
     *            contentions.
     * @param callback REQUIRED: This is a reference to {@link GenericHandler}
     *            callback handler
     */
    public void confirmSignUp(String confirmationCode,
            boolean forcedAliasCreation,
            GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        try {
            confirmSignUpInternal(confirmationCode, forcedAliasCreation);
            callback.onSuccess();
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to Confirm Registration.
     *
     * @param confirmationCode REQUIRED: Code to confirm this user.
     * @param forcedAliasCreation REQUIRED: If set over-rides parameter
     *            contentions
     */
    private void confirmSignUpInternal(String confirmationCode, boolean forcedAliasCreation) {
        final ConfirmSignUpRequest confirmUserRegistrationRequest = new ConfirmSignUpRequest();
        confirmUserRegistrationRequest.setClientId(clientId);
        confirmUserRegistrationRequest.setSecretHash(secretHash);
        confirmUserRegistrationRequest.setUsername(userId);
        confirmUserRegistrationRequest.setConfirmationCode(confirmationCode);
        confirmUserRegistrationRequest.setForceAliasCreation(forcedAliasCreation);
        confirmUserRegistrationRequest.setUserContextData(getUserContextData());
        final String pinpointEndpointId = pool.getPinpointEndpointId();
        if (pinpointEndpointId != null) {
            final AnalyticsMetadataType amd = new AnalyticsMetadataType();
            amd.setAnalyticsEndpointId(pinpointEndpointId);
            confirmUserRegistrationRequest.setAnalyticsMetadata(amd);
        }
        cognitoIdentityProviderClient.confirmSignUp(confirmUserRegistrationRequest);
    }

    /**
     * Request to resend registration confirmation code for a user, in
     * background.
     *
     * @param callback REQUIRED: {@link VerificationHandler} callback handler.
     */
    public void resendConfirmationCodeInBackground(final VerificationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final ResendConfirmationCodeResult resendConfirmationCodeResult = resendConfirmationCodeInternal();
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(new CognitoUserCodeDeliveryDetails(
                                    resendConfirmationCodeResult.getCodeDeliveryDetails()));
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Request to resend registration confirmation code for a user, in current
     * thread.
     * <p>
     * <b>Note:</b> This method will perform network operations. Calling this
     * method in applications' main thread will cause Android to throw
     * NetworkOnMainThreadException.
     * </p>
     *
     * @param callback REQUIRED: {@link VerificationHandler} callback handler.
     */
    public void resendConfirmationCode(final VerificationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        try {
            final ResendConfirmationCodeResult resendConfirmationCodeResult = resendConfirmationCodeInternal();
            callback.onSuccess(new CognitoUserCodeDeliveryDetails(
                    resendConfirmationCodeResult.getCodeDeliveryDetails()));
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to request registration code resend.
     */
    private ResendConfirmationCodeResult resendConfirmationCodeInternal() {
        final ResendConfirmationCodeRequest resendConfirmationCodeRequest = new ResendConfirmationCodeRequest();
        resendConfirmationCodeRequest.setUsername(userId);
        resendConfirmationCodeRequest.setClientId(clientId);
        resendConfirmationCodeRequest.setSecretHash(secretHash);
        final String pinpointEndpointId = pool.getPinpointEndpointId();
        resendConfirmationCodeRequest.setUserContextData(getUserContextData());
        if (pinpointEndpointId != null) {
            AnalyticsMetadataType amd = new AnalyticsMetadataType();
            amd.setAnalyticsEndpointId(pinpointEndpointId);
            resendConfirmationCodeRequest.setAnalyticsMetadata(amd);
        }

        return cognitoIdentityProviderClient.resendConfirmationCode(resendConfirmationCodeRequest);
    }

    /**
     * Starts the process to set a new password for forgotten password case, in
     * background.
     * <p>
     * This will initiate the process to set a new password when the current
     * password is forgotten. The new password will be successfully set only
     * after the verification code, sent to the registered email or phone number
     * of the user, successfully verified by Cognito Identity Provider service.
     * This method will pass a continuation object to the callback. Use setters
     * in the Continuation object {@link ForgotPasswordContinuation} to set the
     * new password and verification code and call continue on the continuation
     * object, {@code CognitoIdentityProviderContinuation.continueTask()}.
     * </p>
     *
     * @param callback REQUIRED: {@link ForgotPasswordHandler} callback
     */
    public void forgotPasswordInBackground(final ForgotPasswordHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser cognitoUser = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final ForgotPasswordResult forgotPasswordResult = forgotPasswordInternal();
                    final ForgotPasswordContinuation continuation = new ForgotPasswordContinuation(
                            cognitoUser,
                            new CognitoUserCodeDeliveryDetails(
                                    forgotPasswordResult.getCodeDeliveryDetails()),
                            ForgotPasswordContinuation.RUN_IN_BACKGROUND, callback);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.getResetCode(continuation);
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Starts the process to set a new new password for forgotten password case,
     * in current thread.
     * <p>
     * This will initiate the process to set a new password when the current
     * password is forgotten. The new password will be successfully set only
     * after the verification code, sent to the registered email or phone number
     * of the user, successfully verified by Cognito Identity Provider service.
     * This method will pass a continuation object to the callback. Use setters
     * in the Continuation object {@link ForgotPasswordContinuation} to set the
     * new password and verification code and call continue on the continuation
     * object, {@code CognitoIdentityProviderContinuation.continueTask()}.
     * <b>Note:</b> This method will perform network operations. Calling this
     * method in applications' main thread will cause Android to throw
     * NetworkOnMainThreadException.
     * </p>
     *
     * @param callback REQUIRED: {@link ForgotPasswordHandler} callback
     */
    public void forgotPassword(ForgotPasswordHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser cognitoUser = this;

        try {
            final ForgotPasswordResult forgotPasswordResult = forgotPasswordInternal();
            final ForgotPasswordContinuation continuation = new ForgotPasswordContinuation(
                    cognitoUser,
                    new CognitoUserCodeDeliveryDetails(
                            forgotPasswordResult.getCodeDeliveryDetails()),
                    ForgotPasswordContinuation.RUN_IN_CURRENT, callback);
            callback.getResetCode(continuation);
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to start forgot password process.
     */
    private ForgotPasswordResult forgotPasswordInternal() {
        final ForgotPasswordRequest resetPasswordRequest = new ForgotPasswordRequest();
        resetPasswordRequest.setClientId(clientId);
        resetPasswordRequest.setSecretHash(secretHash);
        resetPasswordRequest.setUsername(userId);
        resetPasswordRequest.setUserContextData(getUserContextData());
        final String pinpointEndpointId = pool.getPinpointEndpointId();
        if (pinpointEndpointId != null) {
            AnalyticsMetadataType amd = new AnalyticsMetadataType();
            amd.setAnalyticsEndpointId(pinpointEndpointId);
            resetPasswordRequest.setAnalyticsMetadata(amd);
        }

        return cognitoIdentityProviderClient.forgotPassword(resetPasswordRequest);
    }

    /**
     * Set new password and send verification code to Cognito Identity Provider
     * service, in background.
     * <p>
     * This method will be called by {@link ForgotPasswordContinuation}
     * continuation object.
     * </p>
     *
     * @param verificationCode REQUIRED: Code sent from Cognito Identity
     *            Provider Service.
     * @param newPassword REQUIRED: New password. On successful verification of
     *            {@code verificationCode}, this will be the new password for
     *            this user.
     * @param callback REQUIRED: {@link ForgotPasswordHandler} callback.
     */
    public void confirmPasswordInBackground(final String verificationCode,
            final String newPassword,
            final ForgotPasswordHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    confirmPasswordInternal(verificationCode, newPassword);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Sends the new password and the verification code to Cognito Identity
     * Provider service, in background.
     * <p>
     * This method will be called by {@link ForgotPasswordContinuation}
     * continuation object. <b>Note:</b> This method will perform network
     * operations. Calling this method in applications' main thread will cause
     * Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param verificationCode REQUIRED: Code sent from Cognito Identity
     *            Provider Service.
     * @param newPassword REQUIRED: New password. On successful verification of
     *            {@code verificationCode}, this will be the new password for
     *            this user.
     * @param callback REQUIRED: {@link ForgotPasswordHandler} callback.
     */
    public void confirmPassword(final String verificationCode,
            final String newPassword,
            final ForgotPasswordHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        try {
            confirmPasswordInternal(verificationCode, newPassword);
            callback.onSuccess();
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to set a new password.
     *
     * @param verificationCode REQUIRED: Verification code sent to the user.
     * @param newPassword REQUIRED: New password for the user.
     */
    private void confirmPasswordInternal(String verificationCode, String newPassword) {
        final ConfirmForgotPasswordRequest confirmResetPasswordRequest = new ConfirmForgotPasswordRequest();
        confirmResetPasswordRequest.setUsername(userId);
        confirmResetPasswordRequest.setClientId(clientId);
        confirmResetPasswordRequest.setSecretHash(secretHash);
        confirmResetPasswordRequest.setConfirmationCode(verificationCode);
        confirmResetPasswordRequest.setPassword(newPassword);
        confirmResetPasswordRequest.setUserContextData(getUserContextData());
        final String pinpointEndpointId = pool.getPinpointEndpointId();
        if (pinpointEndpointId != null) {
            AnalyticsMetadataType amd = new AnalyticsMetadataType();
            amd.setAnalyticsEndpointId(pinpointEndpointId);
            confirmResetPasswordRequest.setAnalyticsMetadata(amd);
        }

        cognitoIdentityProviderClient.confirmForgotPassword(confirmResetPasswordRequest);
    }

    /**
     * Returns a valid tokens for a user through the callback method. Runs in
     * background.
     * {@link AuthenticationHandler#onSuccess(CognitoUserSession, CognitoDevice)}
     * .
     * <p>
     * Tokens are passed as instance of {@link CognitoUserSession}. Call this
     * method to get valid tokens for a user. This method returns any valid
     * cached tokens for the user. If no valid cached tokens are available this
     * method initiates the process to authenticate the user and get tokens from
     * Cognito Identity Provider service. Implement the interface
     * {@link AuthenticationHandler} and pass it as callback to this method.
     * This method uses the callback to interact with application at different
     * stages of the authentication process. Continuation objects are used when
     * the authentication process requires more data to continue. See
     * {@link com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.CognitoIdentityProviderContinuation}
     * for details on continuation objects.
     * </p>
     *
     * @param callback REQUIRED: {@link AuthenticationHandler} callback
     */
    public void getSessionInBackground(final AuthenticationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser cognitoUser = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    getCachedSession();
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(cipSession, null);
                        }
                    };
                } catch (final CognitoNotAuthorizedException e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            final AuthenticationContinuation authenticationContinuation = new AuthenticationContinuation(
                                    cognitoUser, context,
                                    AuthenticationContinuation.RUN_IN_BACKGROUND, callback);
                            callback.getAuthenticationDetails(authenticationContinuation,
                                    cognitoUser.getUserId());
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Returns a valid tokens for a user through the callback method. Runs in
     * background.
     * {@link AuthenticationHandler#onSuccess(CognitoUserSession, CognitoDevice)}
     * .
     * <p>
     * Tokens are passed as instance of {@link CognitoUserSession}. Call this
     * method to get valid tokens for a user. This method returns any valid
     * cached tokens for the user. If no valid cached tokens are available this
     * method initiates the process to authenticate the user and get tokens from
     * Cognito Identity Provider service. Implement the interface
     * {@link AuthenticationHandler} and pass it as callback to this method.
     * This method uses the callback to interact with application at different
     * stages of the authentication process. Continuation objects are used when
     * the authentication process requires more data to continue. See
     * {@link com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.CognitoIdentityProviderContinuation}
     * for details on continuation objects. <b>Note:</b> This method will
     * perform network operations. Calling this method in applications' main
     * thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param callback REQUIRED: {@link AuthenticationHandler} callback
     */
    public void getSession(final AuthenticationHandler callback) {
        if (callback == null) {
            throw new InvalidParameterException("callback is null");
        }

        try {
            getCachedSession();
            callback.onSuccess(cipSession, null);
        } catch (final InvalidParameterException e) {
            callback.onFailure(e);
        } catch (final CognitoNotAuthorizedException e) {
            final AuthenticationContinuation authenticationContinuation = new AuthenticationContinuation(
                    this, context, AuthenticationContinuation.RUN_IN_CURRENT, callback);
            callback.getAuthenticationDetails(authenticationContinuation, getUserId());
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Initiates user authentication through the generic auth flow (also called
     * as Enhanced or Custom authentication). This is the first step in user
     * authentication. The response to this step from the service will contain
     * information about the next step in the authentication process.
     *
     * @param authenticationDetails REQUIRED: Contains details about the user
     *            authentication.
     * @param runInBackground flag indicating if the operation has to run in
     *            background
     * @param callback REQUIRED: {@link AuthenticationHandler} callback.
     * @return {@link Runnable} for the next step in user authentication.
     */
    public Runnable initiateUserAuthentication(final AuthenticationDetails authenticationDetails,
            final AuthenticationHandler callback, final boolean runInBackground) {
        if (CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER
                .equals(authenticationDetails.getAuthenticationType())) {
            return startWithUserSrpAuth(authenticationDetails, callback, runInBackground);
        } else if (CognitoServiceConstants.CHLG_TYPE_CUSTOM_CHALLENGE
                .equals(authenticationDetails.getAuthenticationType())) {
            return startWithCustomAuth(authenticationDetails, callback, runInBackground);
        } else {
            return new Runnable() {
                @Override
                public void run() {
                    callback.onFailure(
                            new CognitoParameterInvalidException("Unsupported authentication type "
                                    + authenticationDetails.getAuthenticationType()));
                }
            };
        }
    }

    /**
     * Responds to an MFA challenge. This method creates a response to the
     * challenge and calls the internal method to respond to the authentication
     * challenge.
     *
     * @param mfaCode REQUIRED: The MFA code received by the user.
     * @param challenge REQUIRED: Current challenge
     *            {@link RespondToAuthChallengeResult}.
     * @param runInBackground flag indicating if the operation has to run in
     *            background.
     * @param callback REQUIRED: {@link AuthenticationHandler} callback.
     * @return {@link Runnable} for the next step in user authentication.
     */
    public Runnable respondToMfaChallenge(final String mfaCode,
            final RespondToAuthChallengeResult challenge, final AuthenticationHandler callback,
            final boolean runInBackground) {
        final RespondToAuthChallengeRequest challengeResponse = new RespondToAuthChallengeRequest();
        final Map<String, String> mfaParameters = new HashMap<String, String>();
        if (CognitoServiceConstants.CHLG_TYPE_SMS_MFA.equals(challenge.getChallengeName())) {
            mfaParameters.put(CognitoServiceConstants.CHLG_RESP_SMS_MFA_CODE, mfaCode);
        } else if (CognitoServiceConstants.CHLG_TYPE_SOFTWARE_TOKEN_MFA.equals(challenge.getChallengeName())) {
            mfaParameters.put(CognitoServiceConstants.CHLG_RESP_SOFTWARE_TOKEN_MFA_CODE, mfaCode);
        }
        mfaParameters.put(CognitoServiceConstants.CHLG_RESP_USERNAME, usernameInternal);
        mfaParameters.put(CognitoServiceConstants.CHLG_RESP_DEVICE_KEY, deviceKey);
        mfaParameters.put(CognitoServiceConstants.CHLG_RESP_SECRET_HASH, secretHash);
        challengeResponse.setClientId(clientId);
        challengeResponse.setSession(challenge.getSession());
        challengeResponse.setChallengeName(challenge.getChallengeName());
        challengeResponse.setChallengeResponses(mfaParameters);
        challengeResponse.setUserContextData(getUserContextData());
        return respondToChallenge(challengeResponse, callback, runInBackground);
    }

    /**
     * Call this method for valid, cached tokens for this user.
     *
     * @return Valid, cached tokens {@link CognitoUserSession}. {@code null}
     *         otherwise.
     */
    protected CognitoUserSession getCachedSession() {
        if (userId == null) {
            throw new CognitoNotAuthorizedException("User-ID is null");
        }

        if (cipSession != null) {
            if (cipSession.isValidForThreshold()) {
                return cipSession;
            }
        }

        final CognitoUserSession cachedTokens = readCachedTokens();

        if (cachedTokens.isValidForThreshold()) {
            cipSession = cachedTokens;
            return cipSession;
        }

        if (cachedTokens.getRefreshToken() != null) {
            try {
                cipSession = refreshSession(cachedTokens);
                cacheTokens(cipSession);
                return cipSession;
            } catch (final NotAuthorizedException nae) {
                clearCachedTokens();
                throw new CognitoNotAuthorizedException("User is not authenticated", nae);
            } catch (final Exception e) {
                throw new CognitoInternalErrorException("Failed to authenticate user", e);
            }
        }
        throw new CognitoNotAuthorizedException("User is not authenticated");
    }

    /**
     * Request to change password for this user, in background.
     * <p>
     * This operation requires a valid accessToken
     * {@link CognitoUserSession#accessToken}. Un-authenticated users will have
     * to be authenticated before calling this method.
     * </p>
     *
     * @param oldUserPassword REQUIRED: Current password of this user.
     * @param newUserPassword REQUIRED: New password for this user.
     * @param callback REQUIRED: {@link GenericHandler} callback handler.
     */
    public void changePasswordInBackground(final String oldUserPassword,
            final String newUserPassword,
            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession session = user.getCachedSession();
                    changePasswordInternal(oldUserPassword, newUserPassword, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Request to change password for this user, in current thread.
     * <p>
     * This operation requires a valid accessToken
     * {@link CognitoUserSession#accessToken}. Unauthenticated users will need
     * to be authenticated before calling this method. <b>Note:</b> This method
     * will perform network operations. Calling this method in applications'
     * main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param oldUserPassword REQUIRED: Current password of this user.
     * @param newUserPassword REQUIRED: New password for this user.
     * @param callback REQUIRED: {@link GenericHandler} callback handler.
     */
    public void changePassword(final String oldUserPassword,
            final String newUserPassword,
            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        try {
            changePasswordInternal(oldUserPassword, newUserPassword, getCachedSession());
            callback.onSuccess();
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to change a user password.
     *
     * @param oldUserPassword REQUIRED: old password.
     * @param newUserPassword REQUIRED: new password.
     * @param session REQUIRED: {@link CognitoUserSession}.
     */
    private void changePasswordInternal(String oldUserPassword, String newUserPassword,
            CognitoUserSession session) {
        if (session != null && session.isValid()) {
            final ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
            changePasswordRequest.setPreviousPassword(oldUserPassword);
            changePasswordRequest.setProposedPassword(newUserPassword);
            changePasswordRequest.setAccessToken(session.getAccessToken().getJWTToken());
            cognitoIdentityProviderClient.changePassword(changePasswordRequest);
        } else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Retrieves the current user attributes. Runs in background.
     * <p>
     * All attributes, which are set for this user, are fetched. This method
     * requires valid accessToken.
     * </p>
     *
     * @param callback REQUIRED: {@link GetDetailsHandler} callback
     */
    public void getDetailsInBackground(final GetDetailsHandler callback) {

        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession session = user.getCachedSession();
                    final CognitoUserDetails userDetails = getUserDetailsInternal(session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(userDetails);
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Retrieves the current user attributes. Runs on current thread.
     * <p>
     * All attributes, which are set for this user, are fetched. This method
     * requires valid accessToken. <b>Note:</b> This method will perform network
     * operations. Calling this method in applications' main thread will cause
     * Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param callback REQUIRED: {@link GetDetailsHandler} callback
     */
    public void getDetails(final GetDetailsHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            final CognitoUserDetails userDetails = getUserDetailsInternal(this.getCachedSession());
            callback.onSuccess(userDetails);
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to fetch user attributes.
     *
     * @param session REQUIRED: {@link CognitoUserSession}
     * @return User attributes
     */
    private CognitoUserDetails getUserDetailsInternal(CognitoUserSession session) {
        if (session != null && session.isValid()) {
            final GetUserRequest getUserRequest = new GetUserRequest();
            getUserRequest.setAccessToken(session.getAccessToken().getJWTToken());
            final GetUserResult userResult = cognitoIdentityProviderClient.getUser(getUserRequest);

            return new CognitoUserDetails(new CognitoUserAttributes(userResult.getUserAttributes()),
                    new CognitoUserSettings(userResult.getMFAOptions()));
        } else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Requests code to verify a user attribute, in background.
     * <p>
     * The user attributes that can be verified are those attributes that can be
     * used to communicate with the user, e.g. phone_number and email. The
     * verification code is sent to the medium that is represented by the
     * attribute. Attribute verification is required to enable the attribute to
     * be used an attribute as alias for the user. Aliases attributes can be
     * used in lieu of the userId to authenticate the user. If an attribute was
     * used in the confirm the user after sign-up, then that alias is already
     * verified and does not require re-verification.
     * </p>
     *
     * @param attributeName REQUIRED: Name of the attribute that requires
     *            verification.
     * @param callback REQUIRED: callback.
     */
    public void getAttributeVerificationCodeInBackground(final String attributeName,
            final VerificationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession session = user.getCachedSession();
                    final GetUserAttributeVerificationCodeResult getUserAttributeVerificationCodeResult = getAttributeVerificationCodeInternal(
                            attributeName, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(new CognitoUserCodeDeliveryDetails(
                                    getUserAttributeVerificationCodeResult
                                            .getCodeDeliveryDetails()));
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Requests code to verify a user attribute, in current thread.
     * <p>
     * The user attributes that can be verified are those attributes that can be
     * used to communicate with the user, e.g. phone_number and email. The
     * verification code is sent to the medium that is represented by the
     * attribute. Attribute verification is required to enable the attribute to
     * be used an attribute as alias for the user. Aliases attributes can be
     * used in lieu of the userId to authenticate the user. If an attribute was
     * used in the confirm the user after sign-up, then that alias is already
     * verified and does not require re-verification. <b>Note:</b> This method
     * will perform network operations. Calling this method in applications'
     * main thread will cause Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param attributeName REQUIRED: Name of the attribute that requires
     *            verification.
     * @param callback REQUIRED: callback.
     */
    public void getAttributeVerificationCode(String attributeName, VerificationHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            final GetUserAttributeVerificationCodeResult getUserAttributeVerificationCodeResult = getAttributeVerificationCodeInternal(
                    attributeName, this.getCachedSession());
            callback.onSuccess(new CognitoUserCodeDeliveryDetails(
                    getUserAttributeVerificationCodeResult.getCodeDeliveryDetails()));
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to request for attribute verification code.
     *
     * @param attributeName REQUIRED: Name of the attribute that requires
     *            verification.
     * @param session REQUIRED: A valid {@link CognitoUserSession}.
     */
    private GetUserAttributeVerificationCodeResult getAttributeVerificationCodeInternal(
            final String attributeName,
            final CognitoUserSession session) {
        if (session != null && session.isValid()) {
            final GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest = new GetUserAttributeVerificationCodeRequest();
            getUserAttributeVerificationCodeRequest
                    .setAccessToken(session.getAccessToken().getJWTToken());
            getUserAttributeVerificationCodeRequest.setAttributeName(attributeName);

            return cognitoIdentityProviderClient
                    .getUserAttributeVerificationCode(getUserAttributeVerificationCodeRequest);
        } else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Verify an attribute with the verification code, in background.
     * <p>
     * Call this method to verify an attribute with the "verification code". To
     * request for a "verification code" call the method
     * {@link CognitoUser#getAttributeVerificationCodeInBackground(String, VerificationHandler)}
     * .
     * </p>
     *
     * @param attributeName REQUIRED: The attribute that is being verified.
     * @param verificationCode REQUIRED: The code for verification.
     * @param callback REQUIRED: Callback
     */
    public void verifyAttributeInBackground(final String attributeName,
            final String verificationCode,
            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession session = user.getCachedSession();
                    verifyAttributeInternal(attributeName, verificationCode, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Verify an attribute with the verification code, in current thread.
     * <p>
     * Call this method to verify an attribute with the "verification code". To
     * request for a "verification code" call the method
     * {@link CognitoUser#getAttributeVerificationCodeInBackground(String, VerificationHandler)}
     * . <b>Note:</b> This method will perform network operations. Calling this
     * method in applications' main thread will cause Android to throw
     * NetworkOnMainThreadException.
     * </p>
     *
     * @param attributeName REQUIRED: The attribute that is being verified.
     * @param verificationCode REQUIRED: The code for verification.
     * @param callback REQUIRED: Callback
     */
    public void verifyAttribute(String attributeName,
            String verificationCode,
            GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            final VerifyUserAttributeResult verifyUserAttributeResult = verifyAttributeInternal(
                    attributeName, verificationCode, this.getCachedSession());
            callback.onSuccess();
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to verify an attribute.
     *
     * @param attributeName REQUIRED: The attribute that is being verified.
     * @param verificationCode REQUIRED: The code for verification.
     * @param session REQUIRED: A valid {@link CognitoUserSession}.
     * @return {@link VerifyUserAttributeResult}
     */
    private VerifyUserAttributeResult verifyAttributeInternal(String attributeName,
            String verificationCode,
            CognitoUserSession session) {
        if (session != null && session.isValid()) {
            final VerifyUserAttributeRequest verifyUserAttributeRequest = new VerifyUserAttributeRequest();
            verifyUserAttributeRequest.setAttributeName(attributeName);
            verifyUserAttributeRequest.setAccessToken(session.getAccessToken().getJWTToken());
            verifyUserAttributeRequest.setCode(verificationCode);

            return cognitoIdentityProviderClient.verifyUserAttribute(verifyUserAttributeRequest);
        } else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Registers an MFA based on Time-based One-time Password.
     * @param sessionToken Optional: If a session token has to be used to register the MFA.
     * @param callback Required: Callback handler {@link VerifyMfaContinuation}.
     */
    public void associateSoftwareTokenInBackground(final String sessionToken, final RegisterMfaHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                boolean useSessionToken;
                try {
                    final CognitoUserSession cognitoTokens = user.getCachedSession();
                    AssociateSoftwareTokenResult result;
                    if (!StringUtils.isBlank(sessionToken)) {
                        result = associateTotpMfaInternalWithSession(sessionToken);
                        useSessionToken = true;
                    } else {
                        result = associateTotpMfaInternalWithTokens(cognitoTokens);
                        useSessionToken = false;
                    }
                    final String nextSessionToken = result.getSession();
                    final Map<String, String> parameters = new HashMap<String, String>();
                    parameters.put("type", CognitoServiceConstants.CHLG_TYPE_SOFTWARE_TOKEN_MFA);
                    parameters.put("secretKey", result.getSecretCode());
                    if (useSessionToken) {
                        returnCallback = new Runnable() {
                            @Override
                            public void run() {
                                callback.onVerify(new VerifyMfaContinuation(context, clientId, user, callback, parameters, true, nextSessionToken, VerifyMfaContinuation.RUN_IN_BACKGROUND));
                            }
                        };
                    } else {
                        returnCallback = new Runnable() {
                            @Override
                            public void run() {
                                callback.onVerify(new VerifyMfaContinuation(context, clientId, user, callback, parameters, false, nextSessionToken, VerifyMfaContinuation.RUN_IN_BACKGROUND));
                            }
                        };
                    }
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Registers an MFA based on Time-based One-time Password, run on current thread.
     * @param sessionToken Optional: If a session token has to be used to register the MFA.
     * @param callback Required: Callback handler {@link VerifyMfaContinuation}.
     */
    public void associateSoftwareToken(final String sessionToken, final RegisterMfaHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;
        boolean useSessionToken;
        try {
            final CognitoUserSession cognitoTokens = user.getCachedSession();
            AssociateSoftwareTokenResult result;
            if (!StringUtils.isBlank(sessionToken)) {
                result = associateTotpMfaInternalWithSession(sessionToken);
                useSessionToken = true;
            } else {
                result = associateTotpMfaInternalWithTokens(cognitoTokens);
                useSessionToken = false;
            }
            final String nextSessionToken = result.getSession();
            final Map<String, String> parameters = new HashMap<String, String>();
            parameters.put("type", CognitoServiceConstants.CHLG_TYPE_SOFTWARE_TOKEN_MFA);
            parameters.put("secretKey", result.getSecretCode());
            callback.onVerify(new VerifyMfaContinuation(context, clientId, user, callback, parameters, useSessionToken, nextSessionToken, VerifyMfaContinuation.RUN_IN_CURRENT));
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to register a TOTP MFA with {@link CognitoUserSession}.
     * @param session Required: {@link CognitoUserSession}.
     * @return Response from the service.
     */
    private AssociateSoftwareTokenResult associateTotpMfaInternalWithTokens(
            final CognitoUserSession session) {
        if (session != null && session.isValid()) {
            final AssociateSoftwareTokenRequest request = new AssociateSoftwareTokenRequest();
            request.setAccessToken(session.getAccessToken().getJWTToken());
            return associateTotpMfaInternal(request);
        } else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Internal method to register a TOTP MFA with session token.
     * @param sessionToken Required: The session token.
     * @return Response from the service.
     */
    private AssociateSoftwareTokenResult associateTotpMfaInternalWithSession(
            final String sessionToken) {
        if (sessionToken != null) {
            final AssociateSoftwareTokenRequest request = new AssociateSoftwareTokenRequest();
            request.setSession(sessionToken);
            return associateTotpMfaInternal(request);
        } else {
            throw new CognitoNotAuthorizedException("session token is invalid");
        }
    }

    /**
     * Makes service call to register the MFA.
     * @param request Required: {@link AssociateSoftwareTokenRequest}.
     * @return Response from the service.
     */
    private AssociateSoftwareTokenResult associateTotpMfaInternal(AssociateSoftwareTokenRequest request) {
        return cognitoIdentityProviderClient.associateSoftwareToken(request);
    }

    /**
     * Verify the Time-based One-time Password based MFA tpo complete registration.
     * @param sessionToken Optional: If a session token has to be used to register the MFA.
     * @param totpCode Required: The TOTP code.
     * @param friendlyName Required: Friendly name to be associated with this MFA.
     * @param callback Required: Callback handler {@link VerifyMfaContinuation}.
     */
    public void verifySoftwareTokenInBackground(
            final String sessionToken, final String totpCode, final String friendlyName, final RegisterMfaHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession cognitoTokens = user.getCachedSession();
                    VerifySoftwareTokenResult result;
                    boolean useSessionToken;
                    if (!StringUtils.isBlank(sessionToken)) {
                        result = verifyTotpAssociationWithSession(sessionToken, totpCode, friendlyName);
                        useSessionToken = true;
                    } else {
                        result = verifyTotpAssociationWithTokens(cognitoTokens, totpCode, friendlyName);
                        useSessionToken = false;
                    }
                    final String newSessionToken = result.getSession();
                    if (VerifySoftwareTokenResponseType.ERROR.equals(result.getStatus())) {
                        throw new CognitoInternalErrorException("verification failed");
                    }
                    if (useSessionToken) {
                        returnCallback = new Runnable() {
                            @Override
                            public void run() {
                                callback.onSuccess(newSessionToken);
                            }
                        };
                    } else {
                        returnCallback = new Runnable() {
                            @Override
                            public void run() {
                                callback.onSuccess(null);
                            }
                        };
                    }
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Verify the Time-based One-time Password based MFA tpo complete registration, in current thread.
     * @param sessionToken Optional: If a session token has to be used to register the MFA.
     * @param totpCode Required: The TOTP code.
     * @param friendlyName Required: Friendly name to be associated with this MFA.
     * @param callback Required: Callback handler {@link VerifyMfaContinuation}.
     */
    public void verifySoftwareToken(
            final String sessionToken, final String totpCode, final String friendlyName, final RegisterMfaHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;
        boolean useSessionToken;
        try {
            final CognitoUserSession cognitoTokens = user.getCachedSession();
            VerifySoftwareTokenResult result;
            if (!StringUtils.isBlank(sessionToken)) {
                result = verifyTotpAssociationWithSession(sessionToken, totpCode, friendlyName);
                useSessionToken = true;
            } else {
                result = verifyTotpAssociationWithTokens(cognitoTokens, totpCode, friendlyName);
                useSessionToken = false;
            }
            final String newSessionToken = result.getSession();
            if (VerifySoftwareTokenResponseType.ERROR.equals(result.getStatus())) {
                throw new CognitoInternalErrorException("verification failed");
            }
            if (useSessionToken) {
                callback.onSuccess(newSessionToken);
            } else {
                callback.onSuccess(null);
            }
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to verify TOTP MFA with {@link CognitoUserSession}.
     * @param session Required: A valid {@link CognitoUserSession}.
     * @param totpCode Required: The TOTP code.
     * @param friendlyName Required: Friendly name to be associated with this MFA.
     * @return Response from the service.
     */
    private VerifySoftwareTokenResult verifyTotpAssociationWithTokens(
            final CognitoUserSession session, final String totpCode, final String friendlyName) {
        if (session != null && session.isValid()) {
            final VerifySoftwareTokenRequest request = new VerifySoftwareTokenRequest();
            request.setAccessToken(session.getAccessToken().getJWTToken());
            request.setUserCode(totpCode);
            request.setFriendlyDeviceName(friendlyName);
            return verifyTotpAssociationInternal(request);
        } else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Internal method to verify a TOTP MFA with session token.
     * @param session Required: The session token.
     * @param totpCode Required: The TOTP code.
     * @param friendlyName Required: Friendly name to be associated with this MFA.
     * @return Response from the service.
     */
    private VerifySoftwareTokenResult verifyTotpAssociationWithSession(
            final String session, final String totpCode, final String friendlyName) {
        if (session != null) {
            final VerifySoftwareTokenRequest request = new VerifySoftwareTokenRequest();
            request.setSession(session);
            request.setUserCode(totpCode);
            request.setFriendlyDeviceName(friendlyName);
            return verifyTotpAssociationInternal(request);
        } else {
            throw new CognitoNotAuthorizedException("session token is invalid");
        }
    }

    /**
     * Makes service call to verify the MFA.
     * @param request Required: {@link VerifySoftwareTokenRequest}.
     * @return Response from the service.
     */
    private VerifySoftwareTokenResult verifyTotpAssociationInternal(VerifySoftwareTokenRequest request) {
        return cognitoIdentityProviderClient.verifySoftwareToken(request);
    }

    /**
     * Updates attributes for a user. Runs in background.
     * <p>
     * Requires valid accessToken.
     * </p>
     *
     * @param attributes REQUIRED: All attributes and values that need to be
     *            updated for this user.
     * @param callback REQUIRED: {@link UpdateAttributesHandler} callback.
     */
    public void updateAttributesInBackground(final CognitoUserAttributes attributes,
            final UpdateAttributesHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession session = user.getCachedSession();
                    final UpdateUserAttributesResult updateUserAttributesResult = updateAttributesInternal(
                            attributes, session);

                    final List<CognitoUserCodeDeliveryDetails> attributesVerificationList = new ArrayList<CognitoUserCodeDeliveryDetails>();
                    if (updateUserAttributesResult.getCodeDeliveryDetailsList() != null) {
                        for (final CodeDeliveryDetailsType details : updateUserAttributesResult
                                .getCodeDeliveryDetailsList()) {
                            attributesVerificationList
                                    .add(new CognitoUserCodeDeliveryDetails(details));
                        }
                    }
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {

                            callback.onSuccess(attributesVerificationList);
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Updates attributes for a user. Runs in background.
     * <p>
     * Requires valid accessToken. <b>Note:</b> This method will perform network
     * operations. Calling this method in applications' main thread will cause
     * Android to throw NetworkOnMainThreadException.
     * </p>
     *
     * @param attributes REQUIRED: All attributes and values that need to be
     *            updated for this user.
     * @param callback REQUIRED: {@link UpdateAttributesHandler} callback.
     */
    public void updateAttributes(final CognitoUserAttributes attributes,
            final UpdateAttributesHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            final CognitoUserSession session = getCachedSession();
            final UpdateUserAttributesResult updateUserAttributesResult = updateAttributesInternal(
                    attributes, session);

            final List<CognitoUserCodeDeliveryDetails> attributesVerificationList = new ArrayList<CognitoUserCodeDeliveryDetails>();
            if (updateUserAttributesResult.getCodeDeliveryDetailsList() != null) {
                for (final CodeDeliveryDetailsType details : updateUserAttributesResult
                        .getCodeDeliveryDetailsList()) {
                    attributesVerificationList.add(new CognitoUserCodeDeliveryDetails(details));
                }
            }
            callback.onSuccess(attributesVerificationList);
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Helper method to update user attributes.
     *
     * @param attributes REQUIRED: Attributes.
     * @param session REQUIRED: A valid {@link CognitoUserSession}.
     */
    private UpdateUserAttributesResult updateAttributesInternal(
            final CognitoUserAttributes attributes,
            final CognitoUserSession session) {
        if (session != null && session.isValid()) {
            final UpdateUserAttributesRequest updateUserAttributesRequest = new UpdateUserAttributesRequest();
            updateUserAttributesRequest.setAccessToken(session.getAccessToken().getJWTToken());
            updateUserAttributesRequest.setUserAttributes(attributes.getAttributesList());

            return cognitoIdentityProviderClient.updateUserAttributes(updateUserAttributesRequest);
        } else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Deletes user attributes, in background.
     *
     * @param attributeNamesToDelete REQUIRED: List of user attributes that have
     *            to be deleted.
     * @param callback REQUIRED: {@link GenericHandler} callback
     */
    public void deleteAttributesInBackground(final List<String> attributeNamesToDelete,
            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession session = user.getCachedSession();
                    deleteAttributesInternal(attributeNamesToDelete, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Deletes user attributes, in current thread.
     * <p>
     * <b>Note:</b> This method will perform network operations. Calling this
     * method in applications' main thread will cause Android to throw
     * NetworkOnMainThreadException.
     * </p>
     *
     * @param attributeNamesToDelete REQUIRED: List of user attributes that have
     *            to be deleted.
     * @param callback REQUIRED: {@link GenericHandler} callback
     */
    public void deleteAttributes(final List<String> attributeNamesToDelete,
            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            deleteAttributesInternal(attributeNamesToDelete, this.getCachedSession());
            callback.onSuccess();
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to delete user attributes.
     *
     * @param attributeNamesToDelete REQUIRED: Attribute that is being deleted.
     * @param session REQUIRED: A valid {@link CognitoUserSession}.
     */
    private void deleteAttributesInternal(final List<String> attributeNamesToDelete,
            final CognitoUserSession session) {

        // Check if session is valid
        if (session == null) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        if (!session.isValid()) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        // Validate the attributes to delete list
        if (attributeNamesToDelete == null) {
            return;
        }

        if (attributeNamesToDelete.size() < 1) {
            return;
        }

        // Translating to AttributeNameType list
        final DeleteUserAttributesRequest deleteUserAttributesRequest = new DeleteUserAttributesRequest();
        deleteUserAttributesRequest.setAccessToken(session.getAccessToken().getJWTToken());
        deleteUserAttributesRequest.setUserAttributeNames(attributeNamesToDelete);

        cognitoIdentityProviderClient.deleteUserAttributes(deleteUserAttributesRequest);
    }

    /**
     * Sign-Out this user by removing all cached tokens.
     */
    public void signOut() {
        cipSession = null;
        clearCachedTokens();
    }

    /**
     * Sign-out from all devices associated with this user, in background.
     *
     * @param callback REQUIRED: {@link GenericHandler} callback.
     */
    public void globalSignOutInBackground(final GenericHandler callback) {

        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession session = user.getCachedSession();
                    globalSignOutInternal(session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            signOut();
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Sign-out from all devices associated with this user, in current thread.
     * <p>
     * <b>Note:</b> This method will perform network operations. Calling this
     * method in applications' main thread will cause Android to throw
     * NetworkOnMainThreadException.
     * </p>
     *
     * @param callback REQUIRED: {@link GenericHandler} callback.
     */
    public void globalSignOut(GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            globalSignOutInternal(this.getCachedSession());
            signOut();
            callback.onSuccess();
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to Sign-Out from all devices of this user.
     *
     * @param session REQUIRED: {@link GenericHandler} callback.
     */
    private void globalSignOutInternal(CognitoUserSession session) {
        // Check if session is valid
        if (session == null) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        if (!session.isValid()) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        final GlobalSignOutRequest globalSignOutRequest = new GlobalSignOutRequest();
        globalSignOutRequest.setAccessToken(getCachedSession().getAccessToken().getJWTToken());

        cognitoIdentityProviderClient.globalSignOut(globalSignOutRequest);
    }

    /**
     * Deletes this user, in background.
     *
     * @param callback REQUIRED: @link GenericHandler} callback.
     */
    public void deleteUserInBackground(final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final CognitoUserSession session = user.getCachedSession();
                    deleteUserInternal(session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Deletes this user, in current thread.
     * <p>
     * <b>Note:</b> This method will perform network operations. Calling this
     * method in applications' main thread will cause Android to throw
     * NetworkOnMainThreadException.
     * </p>
     *
     * @param callback REQUIRED: @link GenericHandler} callback.
     */
    public void deleteUser(GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            deleteUserInternal(this.getCachedSession());
            callback.onSuccess();
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to delete a user.
     *
     * @param session REQUIRED: A valid {@link CognitoUserSession}
     */
    private void deleteUserInternal(final CognitoUserSession session) {

        // Check if session is valid
        if (session == null) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        if (!session.isValid()) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }

        final DeleteUserRequest deleteUserRequest = new DeleteUserRequest();
        deleteUserRequest.setAccessToken(session.getAccessToken().getJWTToken());

        cognitoIdentityProviderClient.deleteUser(deleteUserRequest);
    }

    /**
     * Set's user settings, in background.
     *
     * @param cognitoUserSettings REQUIRED: User settings as
     *            {@link CognitoUserSettings}.
     * @param callback REQUIRED: {@link GenericHandler} callback.
     */
    public void setUserSettingsInBackground(final CognitoUserSettings cognitoUserSettings,
            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUserSession session = this.getCachedSession();

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    setUserSettingsInternal(cognitoUserSettings, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Set's user settings, in current thread.
     * <p>
     * <b>Note:</b> This method will perform network operations. Calling this
     * method in applications' main thread will cause Android to throw
     * NetworkOnMainThreadException.
     * </p>
     *
     * @param cognitoUserSettings REQUIRED: User settings as
     *            {@link CognitoUserSettings}.
     * @param callback REQUIRED: {@link GenericHandler} callback.
     */
    public void setUserSettings(CognitoUserSettings cognitoUserSettings,
            GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            setUserSettingsInternal(cognitoUserSettings, this.getCachedSession());
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Internal method to set MFA delivery options.
     *
     * @param cognitoUserSettings REQUIRED: {@link CognitoUserAttributes}, with
     *            MFA delivery options.
     * @param session REQUIRED: A valid {@link CognitoUserSession}.
     */
    private void setUserSettingsInternal(CognitoUserSettings cognitoUserSettings,
            CognitoUserSession session) {
        if (session != null && session.isValid()) {
            if (cognitoUserSettings == null) {
                throw new CognitoParameterInvalidException("user attributes is null");
            }
            final SetUserSettingsRequest setUserSettingsRequest = new SetUserSettingsRequest();
            setUserSettingsRequest.setAccessToken(session.getAccessToken().getJWTToken());
            setUserSettingsRequest.setMFAOptions(cognitoUserSettings.getSettingsList());

            final SetUserSettingsResult setUserSettingsResult = cognitoIdentityProviderClient
                    .setUserSettings(setUserSettingsRequest);
        } else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Sets preferences for the registered MFA's of a user.
     * @param mfaSettings Required: A list with all MFA settings.
     * @param callback Required: {@link GenericHandler} callback.
     */
    public void setUserMfaSettingsInBackground(final List<CognitoMfaSettings> mfaSettings,
                                            final GenericHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }
        final CognitoUserSession session = this.getCachedSession();

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    setUserMfaSettingsInternal(mfaSettings, session);
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess();
                        }
                    };
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Internal method to update MFA preferences.
     * @param mfaSettings Required: A list with all MFA settings.
     * @param session Required: A valid {@link CognitoUserSession}.
     */
    private void setUserMfaSettingsInternal(List<CognitoMfaSettings> mfaSettings, CognitoUserSession session) {
        if (session != null && session.isValid()) {
            if (mfaSettings == null || mfaSettings.size() < 1) {
                throw new CognitoParameterInvalidException("mfa settings are empty");
            }
            final SetUserMFAPreferenceRequest request = new SetUserMFAPreferenceRequest();
            request.setAccessToken(session.getAccessToken().getJWTToken());
            for (CognitoMfaSettings mfaSetting: mfaSettings) {
                if (CognitoMfaSettings.SMS_MFA.equals(mfaSetting.getMfaName())) {
                    final SMSMfaSettingsType smsMfaSetting = new SMSMfaSettingsType();
                    smsMfaSetting.setEnabled(mfaSetting.isEnabled());
                    smsMfaSetting.setPreferredMfa(mfaSetting.isPreferred());
                    request.setSMSMfaSettings(smsMfaSetting);
                }
                if (CognitoMfaSettings.TOTP_MFA.equals(mfaSetting.getMfaName())) {
                    final SoftwareTokenMfaSettingsType softwareTokenMfaSetting =
                            new SoftwareTokenMfaSettingsType();
                    softwareTokenMfaSetting.setEnabled(mfaSetting.isEnabled());
                    softwareTokenMfaSetting.setPreferredMfa(mfaSetting.isPreferred());
                    request.setSoftwareTokenMfaSettings(softwareTokenMfaSetting);
                }
            }
            final SetUserMFAPreferenceResult result = cognitoIdentityProviderClient.setUserMFAPreference(request);

        } else {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
    }

    /**
     * Removes all cached tokens.
     */
    private void clearCachedTokens() {
        try {
            // Clear all cached tokens.
            final SharedPreferences csiCachedTokens = context
                    .getSharedPreferences("CognitoIdentityProviderCache", 0);

            // Format "key" strings
            final String csiIdTokenKey = String.format("CognitoIdentityProvider.%s.%s.idToken",
                    clientId, userId);
            final String csiAccessTokenKey = String
                    .format("CognitoIdentityProvider.%s.%s.accessToken", clientId, userId);
            final String csiRefreshTokenKey = String
                    .format("CognitoIdentityProvider.%s.%s.refreshToken", clientId, userId);

            final SharedPreferences.Editor cacheEdit = csiCachedTokens.edit();
            cacheEdit.remove(csiIdTokenKey);
            cacheEdit.remove(csiAccessTokenKey);
            cacheEdit.remove(csiRefreshTokenKey).apply();
        } catch (final Exception e) {
            // Logging exception, this is not a fatal error
            LOGGER.error("Error while deleting from SharedPreferences", e);
        }
    }

    /**
     * Checks for any valid tokens.
     *
     * @return {@link CognitoUserSession} if cached tokens are available.
     */
    private CognitoUserSession readCachedTokens() {
        CognitoUserSession userSession = new CognitoUserSession(null, null, null);

        try {
            final SharedPreferences csiCachedTokens = context
                    .getSharedPreferences("CognitoIdentityProviderCache", 0);

            // Format "key" strings
            final String csiIdTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                    + ".idToken";
            final String csiAccessTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                    + ".accessToken";
            final String csiRefreshTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                    + ".refreshToken";

            if (csiCachedTokens.contains(csiIdTokenKey)) {
                final CognitoIdToken csiCachedIdToken = new CognitoIdToken(
                        csiCachedTokens.getString(csiIdTokenKey, null));
                final CognitoAccessToken csiCachedAccessToken = new CognitoAccessToken(
                        csiCachedTokens.getString(csiAccessTokenKey, null));
                final CognitoRefreshToken csiCachedRefreshToken = new CognitoRefreshToken(
                        csiCachedTokens.getString(csiRefreshTokenKey, null));
                userSession = new CognitoUserSession(csiCachedIdToken, csiCachedAccessToken,
                        csiCachedRefreshToken);
            }
        } catch (final Exception e) {
            // Logging exception, this is not a fatal error
            LOGGER.error("Error while reading SharedPreferences", e);
        }
        return userSession;
    }

    /**
     * Cache tokens locally.
     *
     * @param session REQUIRED: Tokens to be cached.
     */
    private void cacheTokens(CognitoUserSession session) {
        try {
            final SharedPreferences csiCachedTokens = context
                    .getSharedPreferences("CognitoIdentityProviderCache", 0);

            final String csiUserPoolId = pool.getUserPoolId();

            // Create keys to look for cached tokens
            final String csiIdTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                    + ".idToken";
            final String csiAccessTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                    + ".accessToken";
            final String csiRefreshTokenKey = "CognitoIdentityProvider." + clientId + "." + userId
                    + ".refreshToken";
            final String csiLastUserKey = "CognitoIdentityProvider." + clientId + ".LastAuthUser";

            // Store the data in Shared Preferences
            final SharedPreferences.Editor cacheEdit = csiCachedTokens.edit();
            cacheEdit.putString(csiIdTokenKey, session.getIdToken().getJWTToken());
            cacheEdit.putString(csiAccessTokenKey, session.getAccessToken().getJWTToken());
            cacheEdit.putString(csiRefreshTokenKey, session.getRefreshToken().getToken());
            cacheEdit.putString(csiLastUserKey, userId).apply();

        } catch (final Exception e) {
            // Logging exception, this is not a fatal error
            LOGGER.error("Error while writing to SharedPreferences.", e);
        }
    }

    /**
     * Creates a user session with the tokens from authentication.
     *
     * @param authResult REQUIRED: Authentication result which contains the
     *            tokens.
     * @return {@link CognitoUserSession} with the latest tokens.
     */
    private CognitoUserSession getCognitoUserSession(AuthenticationResultType authResult) {
        return getCognitoUserSession(authResult, null);
    }

    /**
     * Creates a user session with the tokens from authentication and overrider
     * the refresh token with the value passed.
     *
     * @param authResult REQUIRED: Authentication result which contains the
     *            tokens.
     * @param refreshTokenOverride REQUIRED: This will be used to create a new
     *            session object if it is not null.
     * @return {@link CognitoUserSession} with the latest tokens.
     */
    private CognitoUserSession getCognitoUserSession(AuthenticationResultType authResult,
            CognitoRefreshToken refreshTokenOverride) {
        final String idtoken = authResult.getIdToken();
        final CognitoIdToken idToken = new CognitoIdToken(idtoken);

        final String acctoken = authResult.getAccessToken();
        final CognitoAccessToken accessToken = new CognitoAccessToken(acctoken);

        CognitoRefreshToken refreshToken;

        if (refreshTokenOverride != null) {
            refreshToken = refreshTokenOverride;
        } else {
            final String reftoken = authResult.getRefreshToken();
            refreshToken = new CognitoRefreshToken(reftoken);
        }
        return new CognitoUserSession(idToken, accessToken, refreshToken);
    }

    /**
     * Internal method to refresh current {@link CognitoUserSession}, is a
     * refresh token is available.
     *
     * @param currSession REQUIRED: Current cached {@link CognitoUserSession}.
     * @return {@link CognitoUserSession} with new access and id tokens.
     */
    private CognitoUserSession refreshSession(CognitoUserSession currSession) {
        CognitoUserSession cognitoUserSession = null;
        final InitiateAuthRequest initiateAuthRequest = initiateRefreshTokenAuthRequest(
                currSession);
        final InitiateAuthResult refreshSessionResult = cognitoIdentityProviderClient
                .initiateAuth(initiateAuthRequest);
        if (refreshSessionResult.getAuthenticationResult() == null) {
            throw new CognitoNotAuthorizedException("user is not authenticated");
        }
        cognitoUserSession = getCognitoUserSession(refreshSessionResult.getAuthenticationResult(),
                currSession.getRefreshToken());
        return cognitoUserSession;
    }

    /**
     * This method sends the challenge response to the Cognito IDP service. The
     * call to the Cognito IDP service returns a new challenge and a different
     * method is called to process the challenge. Restarts authentication if the
     * service cannot find a device-key.
     *
     * @param challengeResponse REQUIRED: {@link RespondToAuthChallengeRequest}
     *            contains response for the current challenge.
     * @param callback REQUIRED: {@link AuthenticationHandler} callback.
     * @param runInBackground REQUIRED: Boolean to indicate the current
     *            threading.
     * @return {@link Runnable} for the next step in user authentication.
     */
    public Runnable respondToChallenge(final RespondToAuthChallengeRequest challengeResponse,
            final AuthenticationHandler callback, final boolean runInBackground) {
        try {
            if (challengeResponse != null && challengeResponse.getChallengeResponses() != null) {
                final Map<String, String> challengeResponses = challengeResponse
                        .getChallengeResponses();
                challengeResponses.put(CognitoServiceConstants.CHLG_RESP_DEVICE_KEY, deviceKey);
                challengeResponse.setChallengeResponses(challengeResponses);
            }
            final RespondToAuthChallengeResult challenge = cognitoIdentityProviderClient
                    .respondToAuthChallenge(challengeResponse);
            return handleChallenge(challenge, callback, runInBackground);
        } catch (final ResourceNotFoundException rna) {
            final CognitoUser cognitoUser = this;
            if (rna.getMessage().contains("Device")) {
                CognitoDeviceHelper.clearCachedDevice(usernameInternal, pool.getUserPoolId(),
                        context);
                return new Runnable() {
                    @Override
                    public void run() {
                        final AuthenticationContinuation authenticationContinuation = new AuthenticationContinuation(
                                cognitoUser, context, runInBackground, callback);
                        callback.getAuthenticationDetails(authenticationContinuation,
                                cognitoUser.getUserId());
                    }
                };
            } else {
                return new Runnable() {
                    @Override
                    public void run() {
                        callback.onFailure(rna);
                    }
                };
            }
        } catch (final Exception e) {
            return new Runnable() {
                @Override
                public void run() {
                    callback.onFailure(e);
                }
            };
        }
    }

    /**
     * This method starts the user authentication with user password
     * verification. Restarts authentication if the service cannot find a
     * device-key.
     *
     * @param authenticationDetails REQUIRED: {@link AuthenticationDetails}
     *            contains user details for authentication.
     * @param callback REQUIRED: {@link AuthenticationHandler} callback.
     * @param runInBackground REQUIRED: Boolean to indicate the current
     *            threading.
     * @return {@link Runnable} for the next step in user authentication.
     */
    private Runnable startWithUserSrpAuth(final AuthenticationDetails authenticationDetails,
            final AuthenticationHandler callback, final boolean runInBackground) {
        final AuthenticationHelper authenticationHelper = new AuthenticationHelper(
                pool.getUserPoolId());
        final InitiateAuthRequest initiateAuthRequest = initiateUserSrpAuthRequest(
                authenticationDetails, authenticationHelper);
        try {
            final InitiateAuthResult initiateAuthResult = cognitoIdentityProviderClient
                    .initiateAuth(initiateAuthRequest);
            updateInternalUsername(initiateAuthResult.getChallengeParameters());
            if (CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER
                    .equals(initiateAuthResult.getChallengeName())) {
                if (authenticationDetails.getPassword() != null) {
                    final RespondToAuthChallengeRequest challengeRequest = userSrpAuthRequest(
                            initiateAuthResult, authenticationDetails, authenticationHelper);
                    return respondToChallenge(challengeRequest, callback, runInBackground);
                }
            }
            return handleChallenge(initiateAuthResult, callback, runInBackground);
        } catch (final ResourceNotFoundException rna) {
            final CognitoUser cognitoUser = this;
            if (rna.getMessage().contains("Device")) {
                CognitoDeviceHelper.clearCachedDevice(usernameInternal, pool.getUserPoolId(),
                        context);
                return new Runnable() {
                    @Override
                    public void run() {
                        final AuthenticationContinuation authenticationContinuation = new AuthenticationContinuation(
                                cognitoUser, context, runInBackground, callback);
                        callback.getAuthenticationDetails(authenticationContinuation,
                                cognitoUser.getUserId());
                    }
                };
            } else {
                return new Runnable() {
                    @Override
                    public void run() {
                        callback.onFailure(rna);
                    }
                };
            }
        } catch (final Exception e) {
            return new Runnable() {
                @Override
                public void run() {
                    callback.onFailure(e);
                }
            };
        }
    }

    /**
     * This method starts the user authentication with a custom (developer
     * defined) flow.
     *
     * @param authenticationDetails REQUIRED: {@link AuthenticationDetails}
     *            contains details about the custom authentication flow.
     * @param callback REQUIRED: {@link AuthenticationHandler} callback.
     * @param runInBackground REQUIRED: Boolean to indicate the current
     *            threading.
     * @return {@link Runnable} for the next step in user authentication.
     */
    private Runnable startWithCustomAuth(final AuthenticationDetails authenticationDetails,
            final AuthenticationHandler callback, final boolean runInBackground) {
        final InitiateAuthRequest initiateAuthRequest = initiateCustomAuthRequest(
                authenticationDetails);
        try {
            final InitiateAuthResult initiateAuthResult = cognitoIdentityProviderClient
                    .initiateAuth(initiateAuthRequest);
            return handleChallenge(initiateAuthResult, callback, runInBackground);
        } catch (final Exception e) {
            return new Runnable() {
                @Override
                public void run() {
                    callback.onFailure(e);
                }
            };
        }
    }

    /**
     * Find the next step from the challenge. This is an important step in the
     * generic authentication flow. After the responding to a challenge, the
     * results are analyzed here to determine the next step in the
     * authentication process. Like all other methods in this SDK, this is
     * designed to work with Continuation objects. This method returns a
     * {@link Runnable} with the code to be executed, for the next step, to the
     * invoking Continuation. The possible steps are 1) Authentication was
     * successful and we have the tokens, in this case we call
     * {@code onSuccess()} to return the tokens. 2) User password is required,
     * an AuthenticationContinuation is created. 3) MFA validation is required,
     * a MultiFactorAuthenticationContinuation object is created. 4) Other
     * generic challenge, the challenge details are passed to the user.
     *
     * @param challenge REQUIRED: Current challenge details,
     *            {@link RespondToAuthChallengeResult}.
     * @param callback REQUIRED: {@link AuthenticationDetails} callback.
     * @param runInBackground REQUIRED: Boolean to indicate the current
     *            threading.
     * @return {@link Runnable} for the next step in user authentication.
     */
    private Runnable handleChallenge(final RespondToAuthChallengeResult challenge,
            final AuthenticationHandler callback, final boolean runInBackground) {
        Runnable nextTask;
        final CognitoUser cognitoUser = this;
        nextTask = new Runnable() {
            @Override
            public void run() {
                callback.onFailure(new CognitoInternalErrorException(
                        "Authentication failed due to an internal error"));
            }
        };

        if (challenge == null) {
            return nextTask;
        }

        updateInternalUsername(challenge.getChallengeParameters());
        final String challengeName = challenge.getChallengeName();
        if (challengeName == null) {
            final CognitoUserSession cognitoUserSession = getCognitoUserSession(
                    challenge.getAuthenticationResult());
            cacheTokens(cognitoUserSession);
            final NewDeviceMetadataType newDeviceMetadata = challenge.getAuthenticationResult()
                    .getNewDeviceMetadata();
            if (newDeviceMetadata == null) {
                nextTask = new Runnable() {
                    @Override
                    public void run() {
                        callback.onSuccess(cognitoUserSession, null);
                    }
                };
            } else {
                final ConfirmDeviceResult confirmDeviceResult = confirmDevice(newDeviceMetadata);
                if (confirmDeviceResult != null
                        && confirmDeviceResult.isUserConfirmationNecessary()) {
                    final CognitoDevice newDevice = new CognitoDevice(
                            newDeviceMetadata.getDeviceKey(), null, null, null, null, cognitoUser,
                            context);
                    nextTask = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(cognitoUserSession, newDevice);
                        }
                    };
                } else {
                    nextTask = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(cognitoUserSession, null);
                        }
                    };
                }
            }
        } else if (CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER.equals(challengeName)) {
            return nextTask;
        } else if (CognitoServiceConstants.CHLG_TYPE_SMS_MFA.equals(challengeName)
                || CognitoServiceConstants.CHLG_TYPE_SOFTWARE_TOKEN_MFA.equals(challengeName)) {
            final MultiFactorAuthenticationContinuation multiFactorAuthenticationContinuation = new MultiFactorAuthenticationContinuation(
                    cognitoUser, context, challenge, runInBackground, callback);
            nextTask = new Runnable() {
                @Override
                public void run() {
                    callback.getMFACode(multiFactorAuthenticationContinuation);
                }
            };
        } else if (CognitoServiceConstants.CHLG_TYPE_SELECT_MFA_TYPE.equals(challengeName)) {
            final ChooseMfaContinuation continuation = new ChooseMfaContinuation(
                    cognitoUser, context, usernameInternal, clientId, secretHash, challenge, runInBackground, callback);
            nextTask = new Runnable() {
                @Override
                public void run() {
                    callback.authenticationChallenge(continuation);
                }
            };
        } else if (CognitoServiceConstants.CHLG_TYPE_MFA_SETUP.equals(challengeName)) {
            final RegisterMfaContinuation continuation = new RegisterMfaContinuation(
                    cognitoUser, context, usernameInternal, clientId, secretHash, challenge, runInBackground, callback);
            nextTask = new Runnable() {
                @Override
                public void run() {
                    callback.authenticationChallenge(continuation);
                }
            };
        } else if (CognitoServiceConstants.CHLG_TYPE_DEVICE_SRP_AUTH.equals(challengeName)) {
            nextTask = deviceSrpAuthentication(challenge, callback, runInBackground);
        } else if (CognitoServiceConstants.CHLG_TYPE_NEW_PASSWORD_REQUIRED.equals(challengeName)) {
            final NewPasswordContinuation newPasswordContinuation = new NewPasswordContinuation(
                    cognitoUser, context, usernameInternal, clientId, secretHash, challenge,
                    runInBackground, callback);
            nextTask = new Runnable() {
                @Override
                public void run() {
                    callback.authenticationChallenge(newPasswordContinuation);
                }
            };
        } else {
            final ChallengeContinuation challengeContinuation = new ChallengeContinuation(
                    cognitoUser, context, usernameInternal, clientId, secretHash, challenge,
                    runInBackground, callback);
            nextTask = new Runnable() {
                @Override
                public void run() {
                    callback.authenticationChallenge(challengeContinuation);
                }
            };
        }
        return nextTask;
    }

    /**
     * Determines the next step from the challenge. This takes an object of type
     * {@link InitiateAuthResult} as parameter and creates an object of type
     * {@link RespondToAuthChallengeResult} and calls
     * {@code handleChallenge(RespondToAuthChallengeResult challenge, final AuthenticationHandler callback)}
     * method.
     *
     * @param authResult REQUIRED: Result from the {@code initiateAuth(...)}
     *            method.
     * @param callback REQUIRED: Callback for type {@link AuthenticationHandler}
     * @param runInBackground REQUIRED: Boolean to indicate the current
     *            threading.
     * @return {@link Runnable} for the next step in user authentication.
     */
    private Runnable handleChallenge(final InitiateAuthResult authResult,
            final AuthenticationHandler callback, final boolean runInBackground) {
        try {
            final RespondToAuthChallengeResult challenge = new RespondToAuthChallengeResult();
            challenge.setChallengeName(authResult.getChallengeName());
            challenge.setSession(authResult.getSession());
            challenge.setAuthenticationResult(authResult.getAuthenticationResult());
            challenge.setChallengeParameters(authResult.getChallengeParameters());
            return handleChallenge(challenge, callback, runInBackground);
        } catch (final Exception e) {
            return new Runnable() {
                @Override
                public void run() {
                    callback.onFailure(e);
                }
            };
        }
    }

    /**
     * Performs device SRP authentication to identify remembered devices.
     * Restarts authentication if the device verification does not succeed.
     *
     * @param challenge REQUIRED: {@link RespondToAuthChallengeResult}, contains
     *            the current challenge.
     * @param callback REQUIRED: {@link AuthenticationHandler} callback.
     * @param runInBackground REQUIRED: Boolean to indicate the current
     *            threading.
     * @return {@link Runnable} for the next step in user authentication.
     */
    private Runnable deviceSrpAuthentication(final RespondToAuthChallengeResult challenge,
            final AuthenticationHandler callback, final boolean runInBackground) {
        final String deviceSecret = CognitoDeviceHelper.getDeviceSecret(usernameInternal,
                pool.getUserPoolId(), context);
        final String deviceGroupKey = CognitoDeviceHelper.getDeviceGroupKey(usernameInternal,
                pool.getUserPoolId(), context);
        final AuthenticationHelper authenticationHelper = new AuthenticationHelper(deviceGroupKey);
        final RespondToAuthChallengeRequest devicesAuthRequest = initiateDevicesAuthRequest(
                authenticationHelper);
        try {
            final RespondToAuthChallengeResult initiateDeviceAuthResult = cognitoIdentityProviderClient
                    .respondToAuthChallenge(devicesAuthRequest);
            if (CognitoServiceConstants.CHLG_TYPE_DEVICE_PASSWORD_VERIFIER
                    .equals(initiateDeviceAuthResult.getChallengeName())) {
                final RespondToAuthChallengeRequest challengeResponse = deviceSrpAuthRequest(
                        initiateDeviceAuthResult, deviceSecret, deviceGroupKey,
                        authenticationHelper);
                final RespondToAuthChallengeResult deviceSRPAuthResult = cognitoIdentityProviderClient
                        .respondToAuthChallenge(challengeResponse);
                return handleChallenge(deviceSRPAuthResult, callback, runInBackground);
            } else {
                return handleChallenge(initiateDeviceAuthResult, callback, runInBackground);
            }
        } catch (final NotAuthorizedException na) {
            final CognitoUser cognitoUser = this;
            CognitoDeviceHelper.clearCachedDevice(usernameInternal, pool.getUserPoolId(), context);
            return new Runnable() {
                @Override
                public void run() {
                    final AuthenticationContinuation authenticationContinuation = new AuthenticationContinuation(
                            cognitoUser, context, runInBackground, callback);
                    callback.getAuthenticationDetails(authenticationContinuation,
                            cognitoUser.getUserId());
                }
            };
        } catch (final Exception e) {
            return new Runnable() {
                @Override
                public void run() {
                    callback.onFailure(e);
                }
            };
        }
    }

    /**
     * Creates a authentication request to start authentication with user SRP
     * verification.
     *
     * @param authenticationDetails REQUIRED: {@link AuthenticationDetails},
     *            contains details for user SRP authentication.
     * @param authenticationHelper REQUIRED: Internal helper class for SRP
     *            calculations.
     * @return {@link InitiateAuthRequest}, request to start with the user SRP
     *         authentication.
     */
    private InitiateAuthRequest initiateUserSrpAuthRequest(
            AuthenticationDetails authenticationDetails,
            AuthenticationHelper authenticationHelper) {
        userId = authenticationDetails.getUserId();
        final InitiateAuthRequest initiateAuthRequest = new InitiateAuthRequest();
        initiateAuthRequest.setAuthFlow(CognitoServiceConstants.AUTH_TYPE_INIT_USER_SRP);
        initiateAuthRequest.setClientId(clientId);
        initiateAuthRequest.addAuthParametersEntry(CognitoServiceConstants.AUTH_PARAM_SECRET_HASH,
                CognitoSecretHash.getSecretHash(userId, clientId, clientSecret));
        initiateAuthRequest.addAuthParametersEntry(CognitoServiceConstants.AUTH_PARAM_USERNAME,
                authenticationDetails.getUserId());
        initiateAuthRequest.addAuthParametersEntry(CognitoServiceConstants.AUTH_PARAM_SRP_A,
                authenticationHelper.getA().toString(SRP_RADIX));
        if (deviceKey == null) {
            initiateAuthRequest.addAuthParametersEntry(
                    CognitoServiceConstants.AUTH_PARAM_DEVICE_KEY, CognitoDeviceHelper.getDeviceKey(
                            authenticationDetails.getUserId(), pool.getUserPoolId(), context));
        } else {
            initiateAuthRequest.addAuthParametersEntry(
                    CognitoServiceConstants.AUTH_PARAM_DEVICE_KEY, deviceKey);
        }
        if (authenticationDetails.getValidationData() != null
                && authenticationDetails.getValidationData().size() > 0) {
            final Map<String, String> userValidationData = new HashMap<String, String>();
            for (final AttributeType attribute : authenticationDetails.getValidationData()) {
                userValidationData.put(attribute.getName(), attribute.getValue());
            }
            initiateAuthRequest.setClientMetadata(userValidationData);
        }
        final String pinpointEndpointId = this.pool.getPinpointEndpointId();
        if (pinpointEndpointId != null) {
            AnalyticsMetadataType amd = new AnalyticsMetadataType();
            amd.setAnalyticsEndpointId(pinpointEndpointId);
            initiateAuthRequest.setAnalyticsMetadata(amd);
        }
        initiateAuthRequest.setUserContextData(getUserContextData());
        return initiateAuthRequest;
    }

    /**
     * Creates a authentication request to start authentication with custom
     * authentication.
     *
     * @param authenticationDetails REQUIRED: {@link AuthenticationDetails},
     *            contains details required to start a custom authentication
     *            flow.
     * @return {@link InitiateAuthRequest}, request to start with the user SRP
     *         authentication.
     */
    private InitiateAuthRequest initiateCustomAuthRequest(
            AuthenticationDetails authenticationDetails) {
        final InitiateAuthRequest authRequest = new InitiateAuthRequest();
        authRequest.setAuthFlow(CognitoServiceConstants.AUTH_TYPE_INIT_CUSTOM_AUTH);
        authRequest.setClientId(clientId);
        authRequest.setAuthParameters(authenticationDetails.getAuthenticationParameters());
        if (authenticationDetails.getValidationData() != null
                && authenticationDetails.getValidationData().size() > 0) {
            final Map<String, String> userValidationData = new HashMap<String, String>();
            for (final AttributeType attribute : authenticationDetails.getValidationData()) {
                userValidationData.put(attribute.getName(), attribute.getValue());
            }
            authRequest.setClientMetadata(userValidationData);
        }
        authRequest.setUserContextData(getUserContextData());
        return authRequest;
    }

    /**
     * Creates a request to initiate device authentication.
     *
     * @param authenticationHelper REQUIRED: {@link AuthenticationDetails},
     *            contains details required to start a custom authentication
     *            flow.
     * @return {@link RespondToAuthChallengeRequest}, request to start device
     *         authentication.
     */
    private RespondToAuthChallengeRequest initiateDevicesAuthRequest(
            AuthenticationHelper authenticationHelper) {
        final RespondToAuthChallengeRequest initiateDevicesAuthRequest = new RespondToAuthChallengeRequest();
        initiateDevicesAuthRequest.setClientId(clientId);
        initiateDevicesAuthRequest
                .setChallengeName(CognitoServiceConstants.CHLG_TYPE_DEVICE_SRP_AUTH);
        initiateDevicesAuthRequest.addChallengeResponsesEntry(
                CognitoServiceConstants.CHLG_RESP_USERNAME, usernameInternal);
        initiateDevicesAuthRequest.addChallengeResponsesEntry(
                CognitoServiceConstants.CHLG_RESP_SRP_A,
                authenticationHelper.getA().toString(SRP_RADIX));
        initiateDevicesAuthRequest.addChallengeResponsesEntry(
                CognitoServiceConstants.CHLG_RESP_DEVICE_KEY, deviceKey);
        initiateDevicesAuthRequest.addChallengeResponsesEntry(
                CognitoServiceConstants.CHLG_RESP_SECRET_HASH, secretHash);

        initiateDevicesAuthRequest.setUserContextData(getUserContextData());
        return initiateDevicesAuthRequest;
    }

    /**
     * Creates a request to refresh tokens.
     *
     * @param currSession REQUIRED: Refresh token.
     * @return {@link InitiateAuthRequest}, request to refresh tokens.
     */
    private InitiateAuthRequest initiateRefreshTokenAuthRequest(CognitoUserSession currSession) {
        final InitiateAuthRequest initiateAuthRequest = new InitiateAuthRequest();
        initiateAuthRequest.addAuthParametersEntry(CognitoServiceConstants.AUTH_PARAM_REFRESH_TOKEN,
                currSession.getRefreshToken().getToken());
        if (deviceKey == null) {
            if (usernameInternal != null) {
                deviceKey = CognitoDeviceHelper.getDeviceKey(usernameInternal, pool.getUserPoolId(),
                        context);
            } else {
                deviceKey = CognitoDeviceHelper.getDeviceKey(currSession.getUsername(), 
                        pool.getUserPoolId(), context);
            }
        }
        initiateAuthRequest.addAuthParametersEntry(CognitoServiceConstants.AUTH_PARAM_DEVICE_KEY,
                deviceKey);
        initiateAuthRequest.addAuthParametersEntry(CognitoServiceConstants.AUTH_PARAM_SECRET_HASH,
                clientSecret);
        initiateAuthRequest.setClientId(clientId);
        initiateAuthRequest.setAuthFlow(CognitoServiceConstants.AUTH_TYPE_REFRESH_TOKEN);
        final String pinpointEndpointId = pool.getPinpointEndpointId();
        if (pinpointEndpointId != null) {
            AnalyticsMetadataType amd = new AnalyticsMetadataType();
            amd.setAnalyticsEndpointId(pinpointEndpointId);
            initiateAuthRequest.setAnalyticsMetadata(amd);
        }
        initiateAuthRequest.setUserContextData(getUserContextData());
        return initiateAuthRequest;
    }

    /**
     * Creates response for the second step of the SRP authentication.
     *
     * @param challenge REQUIRED: {@link InitiateAuthResult} contains next
     *            challenge.
     * @param authenticationDetails REQUIRED: {@link AuthenticationDetails} user
     *            authentication details.
     * @param authenticationHelper REQUIRED: Internal helper class for SRP
     *            calculations.
     * @return {@link RespondToAuthChallengeRequest}.
     */
    private RespondToAuthChallengeRequest userSrpAuthRequest(InitiateAuthResult challenge,
            AuthenticationDetails authenticationDetails,
            AuthenticationHelper authenticationHelper) {
        final String userIdForSRP = challenge.getChallengeParameters()
                .get(CognitoServiceConstants.CHLG_PARAM_USER_ID_FOR_SRP);
        this.usernameInternal = challenge.getChallengeParameters()
                .get(CognitoServiceConstants.CHLG_PARAM_USERNAME);
        this.deviceKey = CognitoDeviceHelper.getDeviceKey(usernameInternal, pool.getUserPoolId(),
                context);
        secretHash = CognitoSecretHash.getSecretHash(usernameInternal, clientId, clientSecret);

        final BigInteger srpB = new BigInteger(challenge.getChallengeParameters().get("SRP_B"), 16);
        if (srpB.mod(AuthenticationHelper.N).equals(BigInteger.ZERO)) {
            throw new CognitoInternalErrorException("SRP error, B cannot be zero");
        }

        final BigInteger salt = new BigInteger(challenge.getChallengeParameters().get("SALT"), 16);
        final byte[] key = authenticationHelper.getPasswordAuthenticationKey(userIdForSRP,
                authenticationDetails.getPassword(), srpB, salt);

        final Date timestamp = new Date();
        byte[] hmac;
        String dateString;
        try {
            final Mac mac = Mac.getInstance("HmacSHA256");
            final SecretKeySpec keySpec = new SecretKeySpec(key, "HmacSHA256");
            mac.init(keySpec);
            mac.update(pool.getUserPoolId().split("_", 2)[1].getBytes(StringUtils.UTF8));
            mac.update(userIdForSRP.getBytes(StringUtils.UTF8));
            final byte[] secretBlock = Base64
                    .decode(challenge.getChallengeParameters().get("SECRET_BLOCK"));
            mac.update(secretBlock);

            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                    "EEE MMM d HH:mm:ss z yyyy", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            dateString = simpleDateFormat.format(timestamp);
            final byte[] dateBytes = dateString.getBytes(StringUtils.UTF8);

            hmac = mac.doFinal(dateBytes);
        } catch (final Exception e) {
            throw new CognitoInternalErrorException("SRP error", e);
        }

        final Map<String, String> srpAuthResponses = new HashMap<String, String>();
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_PASSWORD_CLAIM_SECRET_BLOCK,
                challenge.getChallengeParameters()
                        .get(CognitoServiceConstants.CHLG_PARAM_SECRET_BLOCK));
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_PASSWORD_CLAIM_SIGNATURE,
                new String(Base64.encode(hmac), StringUtils.UTF8));
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_TIMESTAMP, dateString);
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_USERNAME, usernameInternal);
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_DEVICE_KEY, deviceKey);
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_SECRET_HASH, secretHash);

        final RespondToAuthChallengeRequest authChallengeRequest = new RespondToAuthChallengeRequest();
        authChallengeRequest.setChallengeName(challenge.getChallengeName());
        authChallengeRequest.setClientId(clientId);
        authChallengeRequest.setSession(challenge.getSession());
        authChallengeRequest.setChallengeResponses(srpAuthResponses);
        final String pinpointEndpointId = pool.getPinpointEndpointId();
        if (pinpointEndpointId != null) {
            AnalyticsMetadataType amd = new AnalyticsMetadataType();
            amd.setAnalyticsEndpointId(pinpointEndpointId);
            authChallengeRequest.setAnalyticsMetadata(amd);
        }
        authChallengeRequest.setUserContextData(getUserContextData());
        return authChallengeRequest;
    }

    /**
     * Creates request for device SRP verification.
     *
     * @param challenge REQUIRED: {@link RespondToAuthChallengeResult} contains
     *            next challenge.
     * @param deviceSecret REQUIRED: Device secret verifier.
     * @param authenticationHelper REQUIRED: Internal helper class for SRP
     *            calculations.
     * @param deviceGroupKey the device group key
     * @return {@link RespondToAuthChallengeRequest}.
     */
    public RespondToAuthChallengeRequest deviceSrpAuthRequest(
            RespondToAuthChallengeResult challenge,
            String deviceSecret,
            String deviceGroupKey,
            AuthenticationHelper authenticationHelper) {
        this.usernameInternal = challenge.getChallengeParameters()
                .get(CognitoServiceConstants.CHLG_PARAM_USERNAME);

        final BigInteger srpB = new BigInteger(challenge.getChallengeParameters().get("SRP_B"), 16);
        if (srpB.mod(AuthenticationHelper.N).equals(BigInteger.ZERO)) {
            throw new CognitoInternalErrorException("SRP error, B cannot be zero");
        }

        final BigInteger salt = new BigInteger(challenge.getChallengeParameters().get("SALT"), 16);
        final byte[] key = authenticationHelper.getPasswordAuthenticationKey(deviceKey,
                deviceSecret, srpB, salt);

        final Date timestamp = new Date();
        byte[] hmac;
        String dateString;
        try {
            final Mac mac = Mac.getInstance("HmacSHA256");
            final SecretKeySpec keySpec = new SecretKeySpec(key, "HmacSHA256");
            mac.init(keySpec);
            mac.update(deviceGroupKey.getBytes(StringUtils.UTF8));
            mac.update(deviceKey.getBytes(StringUtils.UTF8));
            final byte[] secretBlock = Base64.decode(challenge.getChallengeParameters()
                    .get(CognitoServiceConstants.CHLG_PARAM_SECRET_BLOCK));
            mac.update(secretBlock);

            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                    "EEE MMM d HH:mm:ss z yyyy", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            dateString = simpleDateFormat.format(timestamp);
            final byte[] dateBytes = dateString.getBytes(StringUtils.UTF8);

            hmac = mac.doFinal(dateBytes);
        } catch (final Exception e) {
            throw new CognitoInternalErrorException("SRP error", e);
        }

        secretHash = CognitoSecretHash.getSecretHash(usernameInternal, clientId, clientSecret);

        final Map<String, String> srpAuthResponses = new HashMap<String, String>();
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_PASSWORD_CLAIM_SECRET_BLOCK,
                challenge.getChallengeParameters()
                        .get(CognitoServiceConstants.CHLG_PARAM_SECRET_BLOCK));
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_PASSWORD_CLAIM_SIGNATURE,
                new String(Base64.encode(hmac), StringUtils.UTF8));
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_TIMESTAMP, dateString);
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_USERNAME, usernameInternal);
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_DEVICE_KEY, deviceKey);
        srpAuthResponses.put(CognitoServiceConstants.CHLG_RESP_SECRET_HASH, secretHash);

        final RespondToAuthChallengeRequest authChallengeRequest = new RespondToAuthChallengeRequest();
        authChallengeRequest.setChallengeName(challenge.getChallengeName());
        authChallengeRequest.setClientId(clientId);
        authChallengeRequest.setSession(challenge.getSession());
        authChallengeRequest.setChallengeResponses(srpAuthResponses);
        authChallengeRequest.setUserContextData(getUserContextData());
        return authChallengeRequest;
    }

    /**
     * Fetches the list of all remembered devices for this user.
     *
     * @param limit REQUIRED: Maximum number of devices to be returned in this
     *            call, defaults to 10.
     * @param paginationToken REQUIRED: Token to continue an earlier search.
     * @param callback REQUIRED: {@link DevicesHandler} callback.
     */
    public void listDevicesInBackground(final int limit, final String paginationToken,
            final DevicesHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        final CognitoUser user = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final ListDevicesResult listDevicesResult = listDevicesInternal(
                            user.getCachedSession(), limit, paginationToken);
                    final List<CognitoDevice> devicesList = new ArrayList<CognitoDevice>();
                    for (final DeviceType device : listDevicesResult.getDevices()) {
                        devicesList.add(new CognitoDevice(device, user, context));
                    }
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(devicesList);
                        }
                    };

                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(e);
                        }
                    };
                }
                handler.post(returnCallback);
            }
        }).start();
    }

    /**
     * Fetches the list of all remembered devices for this user, runs in current
     * thread.
     *
     * @param limit REQUIRED: Maximum number of devices to be returned in this
     *            call, defaults to 10.
     * @param paginationToken REQUIRED: Token to continue an earlier search.
     * @param callback REQUIRED: {@link DevicesHandler} callback.
     */
    public void listDevices(int limit, String paginationToken, DevicesHandler callback) {
        if (callback == null) {
            throw new CognitoParameterInvalidException("callback is null");
        }

        try {
            final ListDevicesResult listDevicesResult = listDevicesInternal(getCachedSession(),
                    limit, paginationToken);
            final List<CognitoDevice> devicesList = new ArrayList<CognitoDevice>();
            for (final DeviceType device : listDevicesResult.getDevices()) {
                devicesList.add(new CognitoDevice(device, this, context));
            }
            callback.onSuccess(devicesList);
        } catch (final Exception e) {
            callback.onFailure(e);
        }
    }

    /**
     * Returns the current device, if users in this pool can remember devices.
     * If a deviceKey is not found with the userId, the deviceKey is searched 
     * with the username in cached tokens, if any. 
     * @return {@link CognitoDevice} if the device is available, null otherwise.
     */
    public CognitoDevice thisDevice() {
        if (deviceKey == null) {
            if (usernameInternal != null) {
                deviceKey = CognitoDeviceHelper.getDeviceKey(usernameInternal, pool.getUserPoolId(),
                        context);
            } else if (userId != null) {
                deviceKey = CognitoDeviceHelper.getDeviceKey(userId, pool.getUserPoolId(), context);
                if (deviceKey == null) {
                    CognitoUserSession currSession = this.readCachedTokens();
                    deviceKey = CognitoDeviceHelper.getDeviceKey(currSession.getUsername(), 
                            this.pool.getUserPoolId(), this.context);
                }
            }
        }
        if (deviceKey != null) {
            return new CognitoDevice(deviceKey, null, null, null, null, this, context);
        } else {
            return null;
        }
    }

    /**
     * The method confirms a device. If this device can be remembered and if
     * this is a new device, a new device key is generated at the end of a
     * successful authentication. SRP verification is performed by the service,
     * during the next authentication attempts, to identify this device. This
     * method generates the necessary tokens to enable the device SRP
     * verification.
     *
     * @param deviceMetadata REQUIRED: Metadata for the new device.
     */
    private ConfirmDeviceResult confirmDevice(final NewDeviceMetadataType deviceMetadata) {
        final Map<String, String> deviceSrpVerifiers = CognitoDeviceHelper
                .generateVerificationParameters(deviceMetadata.getDeviceKey(),
                        deviceMetadata.getDeviceGroupKey());

        ConfirmDeviceResult confirmDeviceResult = new ConfirmDeviceResult();
        confirmDeviceResult.setUserConfirmationNecessary(false);
        try {
            confirmDeviceResult = confirmDeviceInternal(getCachedSession(),
                    deviceMetadata.getDeviceKey(), deviceSrpVerifiers.get("verifier"),
                    deviceSrpVerifiers.get("salt"), CognitoDeviceHelper.getDeviceName());
        } catch (final Exception e) {
            LOGGER.error("Device confirmation failed: ", e);
            return null;
        }
        CognitoDeviceHelper.cacheDeviceKey(usernameInternal, pool.getUserPoolId(),
                deviceMetadata.getDeviceKey(), context);
        CognitoDeviceHelper.cacheDeviceVerifier(usernameInternal, pool.getUserPoolId(),
                deviceSrpVerifiers.get("secret"), context);
        CognitoDeviceHelper.cacheDeviceGroupKey(usernameInternal, pool.getUserPoolId(),
                deviceMetadata.getDeviceGroupKey(), context);
        return confirmDeviceResult;
    }

    /**
     * Internal method to fetch all devices trusted by this user.
     *
     * @param session REQUIRED: A valid {@link CognitoUserSession}.
     * @param limit REQUIRED: Maximum number of devices to fetch.
     * @param paginationToken REQUIRED: Token to continue with the previous
     *            srearch.
     * @return {@link ListDevicesResult}, service response.
     */
    private ListDevicesResult listDevicesInternal(CognitoUserSession session, int limit,
            String paginationToken) {
        if (session != null && session.isValid()) {
            final ListDevicesRequest listDevicesRequest = new ListDevicesRequest();
            if (limit < 1) {
                listDevicesRequest.setLimit(CognitoDeviceHelper.DEFAULT_DEVICE_PAGINATION_LIMIT);
            } else {
                listDevicesRequest.setLimit(limit);
            }
            listDevicesRequest.setPaginationToken(paginationToken);
            listDevicesRequest.setAccessToken(session.getAccessToken().getJWTToken());
            return cognitoIdentityProviderClient.listDevices(listDevicesRequest);
        } else {
            throw new CognitoNotAuthorizedException("User is not authorized");
        }
    }

    /**
     * Internal method to confirm a device.
     *
     * @param session REQUIRED: A valid {@link CognitoUserSession}.
     * @param deviceKey REQUIRED: This is the device-key assigned the new
     *            device.
     * @param passwordVerifier REQUIRED: Random string generated by the SDK.
     * @param salt REQUIRED: Generated by the SDK to set the device verifier.
     * @param deviceName REQUIRED: A user identifiable string assigned to the
     *            device.
     * @return {@link ConfirmDeviceResult}, service response.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    private ConfirmDeviceResult confirmDeviceInternal(CognitoUserSession session, String deviceKey,
            String passwordVerifier, String salt, String deviceName) {
        if (session != null && session.isValid()) {
            if (deviceKey != null && deviceName != null) {
                final DeviceSecretVerifierConfigType deviceConfig = new DeviceSecretVerifierConfigType();
                deviceConfig.setPasswordVerifier(passwordVerifier);
                deviceConfig.setSalt(salt);
                final ConfirmDeviceRequest confirmDeviceRequest = new ConfirmDeviceRequest();
                confirmDeviceRequest.setAccessToken(session.getAccessToken().getJWTToken());
                confirmDeviceRequest.setDeviceKey(deviceKey);
                confirmDeviceRequest.setDeviceName(deviceName);
                confirmDeviceRequest.setDeviceSecretVerifierConfig(deviceConfig);
                return cognitoIdentityProviderClient.confirmDevice(confirmDeviceRequest);
            } else {
                if (deviceKey == null) {
                    throw new CognitoParameterInvalidException("Device key is null");
                } else {
                    throw new CognitoParameterInvalidException("Device name is null");
                }
            }
        } else {
            throw new CognitoNotAuthorizedException("User is not authorized");
        }
    }

    /**
     * Updates user's internal Username and device key from challenge
     * parameters.
     *
     * @param challengeParameters REQUIRED: Challenge parameters.
     */
    private void updateInternalUsername(Map<String, String> challengeParameters) {
        if (usernameInternal == null) {
            if (challengeParameters != null && challengeParameters
                    .containsKey(CognitoServiceConstants.CHLG_PARAM_USERNAME)) {
                usernameInternal = challengeParameters
                        .get(CognitoServiceConstants.CHLG_PARAM_USERNAME);
                deviceKey = CognitoDeviceHelper.getDeviceKey(usernameInternal, pool.getUserPoolId(),
                        context);
                if (secretHash == null) {
                    secretHash = CognitoSecretHash.getSecretHash(usernameInternal, clientId,
                            clientSecret);
                }
            }
        }
    }

    /**
     * Fetches the encoded user context.
     * @return user context.
     */
    private UserContextDataType getUserContextData() {
        return pool.getUserContextData(userId);
    }

    /**
     * Private class for SRP client side math.
     */
    @SuppressWarnings({
            "checkstyle:parametername", "checkstyle:localvariablename", "checkstyle:membername",
            "checkstyle:staticvariablename"
        })
    private static class AuthenticationHelper {
        private BigInteger a;
        private BigInteger A;
        private String poolName;

        public AuthenticationHelper(String userPoolName) {
            do {
                a = new BigInteger(EPHEMERAL_KEY_LENGTH, SECURE_RANDOM).mod(N);
                A = GG.modPow(a, N);
            } while (A.mod(N).equals(BigInteger.ZERO));

            if (userPoolName.contains("_")) {
                poolName = userPoolName.split("_", 2)[1];
            } else {
                poolName = userPoolName;
            }
        }

        public BigInteger geta() {
            return a;
        }

        public BigInteger getA() {
            return A;
        }

        private static final String HEX_N = "FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD1"
                + "29024E088A67CC74020BBEA63B139B22514A08798E3404DD"
                + "EF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245"
                + "E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7ED"
                + "EE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3D"
                + "C2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F"
                + "83655D23DCA3AD961C62F356208552BB9ED529077096966D"
                + "670C354E4ABC9804F1746C08CA18217C32905E462E36CE3B"
                + "E39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9"
                + "DE2BCBF6955817183995497CEA956AE515D2261898FA0510"
                + "15728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64"
                + "ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7"
                + "ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6B"
                + "F12FFA06D98A0864D87602733EC86A64521F2B18177B200C"
                + "BBE117577A615D6C770988C0BAD946E208E24FA074E5AB31"
                + "43DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF";
        private static final BigInteger N = new BigInteger(HEX_N, 16);
        private static final BigInteger GG = BigInteger.valueOf(2);
        private static final BigInteger KK;

        private static final int EPHEMERAL_KEY_LENGTH = 1024;
        private static final int DERIVED_KEY_SIZE = 16;
        private static final String DERIVED_KEY_INFO = "Caldera Derived Key";

        private static final ThreadLocal<MessageDigest> THREAD_MESSAGE_DIGEST = new ThreadLocal<MessageDigest>() {
            @Override
            protected MessageDigest initialValue() {
                try {
                    return MessageDigest.getInstance("SHA-256");
                } catch (final NoSuchAlgorithmException e) {
                    throw new CognitoInternalErrorException("Exception in authentication", e);
                }
            }
        };

        private static final SecureRandom SECURE_RANDOM;

        static {
            try {
                SECURE_RANDOM = SecureRandom.getInstance("SHA1PRNG");

                final MessageDigest messageDigest = THREAD_MESSAGE_DIGEST.get();
                messageDigest.reset();
                messageDigest.update(N.toByteArray());
                final byte[] digest = messageDigest.digest(GG.toByteArray());
                KK = new BigInteger(1, digest);
            } catch (final NoSuchAlgorithmException e) {
                throw new CognitoInternalErrorException(e.getMessage(), e);
            }
        }

        public byte[] getPasswordAuthenticationKey(String userId,
                String userPassword,
                BigInteger B,
                BigInteger salt) {
            // Authenticate the password
            // u = H(A, B)
            final MessageDigest messageDigest = THREAD_MESSAGE_DIGEST.get();
            messageDigest.reset();
            messageDigest.update(A.toByteArray());
            final BigInteger u = new BigInteger(1, messageDigest.digest(B.toByteArray()));
            if (u.equals(BigInteger.ZERO)) {
                throw new CognitoInternalErrorException("Hash of A and B cannot be zero");
            }

            // x = H(salt | H(poolName | userId | ":" | password))
            messageDigest.reset();
            messageDigest.update(poolName.getBytes(StringUtils.UTF8));
            messageDigest.update(userId.getBytes(StringUtils.UTF8));
            messageDigest.update(":".getBytes(StringUtils.UTF8));
            final byte[] userIdHash = messageDigest.digest(userPassword.getBytes(StringUtils.UTF8));

            messageDigest.reset();
            messageDigest.update(salt.toByteArray());
            final BigInteger x = new BigInteger(1, messageDigest.digest(userIdHash));
            final BigInteger s = (B.subtract(KK.multiply(GG.modPow(x, N)))
                    .modPow(a.add(u.multiply(x)), N)).mod(N);

            Hkdf hkdf = null;
            try {
                hkdf = Hkdf.getInstance("HmacSHA256");
            } catch (final NoSuchAlgorithmException e) {
                throw new CognitoInternalErrorException(e.getMessage(), e);
            }
            hkdf.init(s.toByteArray(), u.toByteArray());
            final byte[] key = hkdf.deriveKey(DERIVED_KEY_INFO, DERIVED_KEY_SIZE);
            return key;
        }
    }
}

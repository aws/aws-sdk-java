package com.amazonaws.connectors.cognitoidp.util;

import java.util.UUID;
import java.util.prefs.Preferences;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Handles shared user context with Amazon Pinpoint.
 */
public class CognitoPinpointSharedContext {
     private static final Log LOGGER = LogFactory.getLog(CognitoPinpointSharedContext.class);

    /**
     * Key to access Pinpoint endpoint id in
     * {@link android.content.SharedPreferences}.
     */
    private static final String UNIQUE_ID_KEY = "UniqueId";

    /**
     * Pinpoint SharedPreferences file.
     */
    private static final String PREFERENCES_AND_FILE_MANAGER_SUFFIX
            = "515d6767-01b7-49e5-8273-c8d11b0f331d";

    /**
     * Returns the pinpoint endpoint id for the provided Pinpoint App Id.
     *
     * @param pinpointAppId Required, the pinpoint appId.
     * @return The pinpoint endpoint id as a string.
     */
    public static String getPinpointEndpoint(String pinpointAppId) {
        return getPinpointEndpoint(pinpointAppId, UNIQUE_ID_KEY);
    }

    /**
     * Returns the pinpoint endpoint id for the provided Pinpoint App Id and
     * user.
     * <p>
     * Returns the pinpoint endpoint id for a the {@code pinpointAppId} and
     * {@code pinpointEndpointIdentifier}. Generates and stores a new pinpoint
     * endpoint id if a pinpoint endpoint id is not available for this
     * combination.
     * </p>
     *
     * @param pinpointAppId Required, the pinpoint appId.
     * @param pinpointEndpointIdentifier Required, the pinpoint user identifier.
     * @return The pinpoint endpoint id as a string.
     */
    public static String getPinpointEndpoint(String pinpointAppId,
            String pinpointEndpointIdentifier) {
        if (pinpointAppId == null || pinpointEndpointIdentifier == null) {
            return null;
        }
        
        try {
            Preferences prefsRoot = Preferences.userRoot();
            Preferences pinpointPreferences = prefsRoot
                    .node("com.aws.cognito" + "/" + pinpointAppId + PREFERENCES_AND_FILE_MANAGER_SUFFIX);

            String pinpointEndpointId = pinpointPreferences.get(pinpointEndpointIdentifier, null);
            if (pinpointEndpointId == null) {
                pinpointEndpointId = UUID.randomUUID().toString();
                pinpointPreferences.put(pinpointEndpointIdentifier, pinpointEndpointId);
            }
            return pinpointEndpointId;
        } catch (Exception e) {
            LOGGER.error("Error while reading from SharedPreferences", e);
            return null;
        }
    }
}

package com.amazonaws.mobileconnectors.cognitoidentityprovider;

/**
 * Represents user MFA settings in Cognito.
 * <p>
 *     Requires MFA name to instantiate.
 *     MFA enabled and preferred states are set to {@code false} by default.
 * </p>
 */

public class CognitoMfaSettings {
    /**
     * SMS MFA type.
     */
    public static final String SMS_MFA = "SMS_MFA";

    /**
     * Software token MFA type.
     */
    public static final String TOTP_MFA = "TOTP_MFA";

    /**
     * The MFA name for this settings.
     */
    private String mfaName;

    /**
     * Indicates if this MFA is enabled for this user.
     */
    private boolean enabled = false;

    /**
     * Indicates if this is the preferred MFA for the user.
     */
    private boolean preferred = false;

    /**
     * MFA type is required to instantiate this class.
     */
    private CognitoMfaSettings() {
        // MFA type is required to instantiate.
    }

    /**
     * Instantiates this class for an MFA.
     * @param mfaName Required: The MFA name.
     */
    public CognitoMfaSettings(String mfaName) {
        this.mfaName = mfaName;
    }

    /**
     * Returns MFA enabled state.
     * @return {@code true} if this MFA is enabled.
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets MFA state.
     * @param enabled set this to {@code true} to enable this MFA.
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Returns preferred state of this MFA.
     * @return {@code true} if this is set a the preferred MFA.
     */
    public boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets preferred state for this MFA.
     * @param preferred {@code true} if this MFA should be the preferred.
     */
    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }

    /**
     * Returns MFA name.
     * @return MFA name.
     */
    public String getMfaName() {
        return mfaName;
    }
}

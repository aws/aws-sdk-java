/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

/**
 * Error codes for acknowledgement events.
 */
public final class AckErrorCode {

    private final Values enumValue;
    private final String rawValue;

    private AckErrorCode(Values enumValue, String rawValue) {
        this.enumValue = enumValue;
        this.rawValue = rawValue;
    }

    /**
     * Create a new {@link AckErrorCode} from the String value.
     *
     * @param value String value of the error code.
     * @return An {@link AckErrorCode} or null if the value was null.
     */
    public static AckErrorCode of(String value) {
        return value == null ? null : new AckErrorCode(Values.fromValue(value), value);
    }

    /**
     * Create a new {@link AckErrorCode} from an enum value.
     *
     * @param value String value of the error code.
     * @return An {@link AckErrorCode} or null if the value was null.
     */
    public static AckErrorCode of(Values value) {
        if (value == Values.SDK_UNKNOWN) {
            throw new IllegalArgumentException("SDK_UNKNOWN cannot be used to create an AckErrorCode. Use the raw value to" +
                                               "create an AckErrorCode from a string instead");
        }
        return value == null ? null : new AckErrorCode(value, value.toString());
    }

    /**
     * @return String value of event type.
     */
    public String getRawValue() {
        return rawValue;
    }

    /**
     * @return Enum value of event type. Note that the enum may have the value {@link Values#SDK_UNKNOWN} which indicates
     * this version of the SDK does not know about that particular enum value. If processing an unknown value is required
     * you can get the raw string value from {@link #getRawValue()}.
     */
    public Values getEnumValue() {
        return enumValue;
    }

    @Override
    public String toString() {
        return rawValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AckErrorCode that = (AckErrorCode) o;

        return rawValue != null ? rawValue.equals(that.rawValue) : that.rawValue == null;
    }

    @Override
    public int hashCode() {
        return rawValue != null ? rawValue.hashCode() : 0;
    }

    /**
     * All known values for {@link AckErrorCode}. This will not include any values added after this version of the SDK
     * was released, if use of a new enum value is required you can either upgrade your SDK version or use the string
     * overloads of {@link AckErrorCode}, i.e. {@link AckErrorCode#of(String)} for creating an {@link AckErrorCode} and
     * {@link AckErrorCode#getRawValue()} for retrieving the value of the event type. When the SDK does not know
     * about a particular enum value it will unmarshall it into {@link Values#SDK_UNKNOWN}.
     */
    public enum Values {

        /**
         * Error when reading the input stream.
         */
        STREAM_READ_ERROR("STREAM_READ_ERROR"),

        /**
         * Fragment size is greater than allowed limit.
         */
        MAX_FRAGMENT_SIZE_REACHED("MAX_FRAGMENT_SIZE_REACHED"),

        /**
         * Fragment duration is greater than allowed limit.
         */
        MAX_FRAGMENT_DURATION_REACHED("MAX_FRAGMENT_DURATION_REACHED"),

        /**
         * Connection duration is greater than allowed threshold.
         */
        MAX_CONNECTION_DURATION_REACHED("MAX_CONNECTION_DURATION_REACHED"),

        /**
         * Fragment time code is less than previous time code.
         */
        FRAGMENT_TIMECODE_LESSER_THAN_PREVIOUS("FRAGMENT_TIMECODE_LESSER_THAN_PREVIOUS"),

        /**
         * Multiple MKV tracks found.
         */
        MORE_THAN_ONE_TRACK_FOUND("MORE_THAN_ONE_TRACK_FOUND"),

        /**
         * Error thrown by MKV stream parser.
         */
        INVALID_MKV_DATA("INVALID_MKV_DATA"),

        /**
         * Invalid producer side timestamp
         */
        INVALID_PRODUCER_TIMESTAMP("INVALID_PRODUCER_TIMESTAMP"),

        /**
         * Stream is not active.
         */
        STREAM_NOT_ACTIVE("STREAM_NOT_ACTIVE"),

        /**
         * Stream has been deleted.
         */
        STREAM_DELETED("STREAM_DELETED"),

        /**
         *  KMS access denied while encrypting data
         */
        KMS_KEY_ACCESS_DENIED("KMS_KEY_ACCESS_DENIED"),

        /**
         * KMS key is disabled while encrypting data
         */
        KMS_KEY_DISABLED("KMS_KEY_DISABLED"),

        /**
         * KMS throws validation error while encrypting data
         */
        KMS_KEY_VALIDATION_ERROR("KMS_KEY_VALIDATION_ERROR"),

        /**
         * KMS key unavailable while encrypting data
         */
        KMS_KEY_UNAVAILABLE("KMS_KEY_UNAVAILABLE"),

        /**
         * Invalid usage of the KMS key while encrypting data
         */
        KMS_KEY_INVALID_USAGE("KMS_KEY_INVALID_USAGE"),

        /**
         * Invalid state of the KMS key while encrypting data
         */
        KMS_KEY_INVALID_STATE("KMS_KEY_INVALID_STATE"),

        /**
         * KMS key not found while encrypting data
         */
        KMS_KEY_NOT_FOUND("KMS_KEY_NOT_FOUND"),

        /**
         * Persisting fragment to S3 fails.
         */
        ARCHIVAL_ERROR("ARCHIVAL_ERROR"),

        /**
         * Unexpected server error.
         */
        INTERNAL_ERROR("INTERNAL_ERROR"),

        /**
         * Special value indicating that this version of the  SDK does not know about this enum value.
         */
        SDK_UNKNOWN(null);

        private final String value;

        Values(String value) {
            this.value = value;
        }

        /**
         * It is recommended to use {@link AckErrorCode#getRawValue()} to get the string value of the enum as the value
         * returned by this toString method may be null when the enum value is {@link #SDK_UNKNOWN}.
         */
        @Override
        public String toString() {
            return this.value;
        }

        /**
         * Use this in place of valueOf.
         *
         * @param value real value
         * @return Values enum corresponding to the value
         */
        private static Values fromValue(String value) {
            if (value == null || "".equals(value)) {
                throw new IllegalArgumentException("Value cannot be null or empty!");
            }

            for (Values enumEntry : Values.values()) {
                if (value.equals(enumEntry.toString())) {
                    return enumEntry;
                }
            }

            return SDK_UNKNOWN;
        }
    }
}

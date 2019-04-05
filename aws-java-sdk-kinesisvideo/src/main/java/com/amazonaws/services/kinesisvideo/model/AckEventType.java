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
 * The type of acks for PutMedia API call.
 */
public final class AckEventType {

    private final Values enumValue;
    private final String rawValue;

    private AckEventType(Values enumValue, String rawValue) {
        this.enumValue = enumValue;
        this.rawValue = rawValue;
    }

    /**
     * Create a new {@link AckEventType} from the String value.
     *
     * @param value String value of the error code.
     * @return An {@link AckEventType} or null if the value was null.
     */
    public static AckEventType of(String value) {
        return value == null ? null : new AckEventType(Values.fromValue(value), value);
    }

    /**
     * Create a new {@link AckEventType} from an enum value.
     *
     * @param value String value of the error code.
     * @return An {@link AckEventType} or null if the value was null.
     */
    public static AckEventType of(Values value) {
        if (value == Values.SDK_UNKNOWN) {
            throw new IllegalArgumentException("SDK_UNKNOWN cannot be used to create an AckEventType. Use the raw value to" +
                                               "create an AckEventType from a string instead");
        }
        return value == null ? null : new AckEventType(value, value.toString());
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

        AckEventType that = (AckEventType) o;

        return rawValue != null ? rawValue.equals(that.rawValue) : that.rawValue == null;
    }

    @Override
    public int hashCode() {
        return rawValue != null ? rawValue.hashCode() : 0;
    }

    /**
     * All known values for {@link AckEventType}. This will not include any values added after this version of the SDK
     * was released, if use of a new enum value is required you can either upgrade your SDK version or use the string
     * overloads of {@link AckEventType}, i.e. {@link AckEventType#of(String)} for creating an {@link AckEventType} and
     * {@link AckEventType#getRawValue()} for retrieving the value of the event type. When the SDK does not know
     * about a particular enum value it will unmarshall it into {@link Values#SDK_UNKNOWN}.
     */
    public enum Values {

        // TODO documentation
        BUFFERING("BUFFERING"),
        RECEIVED("RECEIVED"),
        PERSISTED("PERSISTED"),
        ERROR("ERROR"),
        IDLE("IDLE"),

        /**
         * Special value indicating that this version of the  SDK does not know about this enum value.
         */
        SDK_UNKNOWN(null);

        private final String value;

        Values(String value) {
            this.value = value;
        }

        /**
         * It is recommended to use {@link AckEventType#getRawValue()} to get the string value of the enum as the value
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

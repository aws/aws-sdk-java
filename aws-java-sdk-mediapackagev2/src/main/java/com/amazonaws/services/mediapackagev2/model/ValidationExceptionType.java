/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ValidationExceptionType {

    CONTAINER_TYPE_IMMUTABLE("CONTAINER_TYPE_IMMUTABLE"),
    INVALID_PAGINATION_TOKEN("INVALID_PAGINATION_TOKEN"),
    INVALID_PAGINATION_MAX_RESULTS("INVALID_PAGINATION_MAX_RESULTS"),
    INVALID_POLICY("INVALID_POLICY"),
    INVALID_ROLE_ARN("INVALID_ROLE_ARN"),
    MANIFEST_NAME_COLLISION("MANIFEST_NAME_COLLISION"),
    ENCRYPTION_METHOD_CONTAINER_TYPE_MISMATCH("ENCRYPTION_METHOD_CONTAINER_TYPE_MISMATCH"),
    CENC_IV_INCOMPATIBLE("CENC_IV_INCOMPATIBLE"),
    ENCRYPTION_CONTRACT_WITHOUT_AUDIO_RENDITION_INCOMPATIBLE("ENCRYPTION_CONTRACT_WITHOUT_AUDIO_RENDITION_INCOMPATIBLE"),
    ENCRYPTION_CONTRACT_UNENCRYPTED("ENCRYPTION_CONTRACT_UNENCRYPTED"),
    ENCRYPTION_CONTRACT_SHARED("ENCRYPTION_CONTRACT_SHARED"),
    NUM_MANIFESTS_LOW("NUM_MANIFESTS_LOW"),
    NUM_MANIFESTS_HIGH("NUM_MANIFESTS_HIGH"),
    MANIFEST_DRM_SYSTEMS_INCOMPATIBLE("MANIFEST_DRM_SYSTEMS_INCOMPATIBLE"),
    DRM_SYSTEMS_ENCRYPTION_METHOD_INCOMPATIBLE("DRM_SYSTEMS_ENCRYPTION_METHOD_INCOMPATIBLE"),
    ROLE_ARN_NOT_ASSUMABLE("ROLE_ARN_NOT_ASSUMABLE"),
    ROLE_ARN_LENGTH_OUT_OF_RANGE("ROLE_ARN_LENGTH_OUT_OF_RANGE"),
    ROLE_ARN_INVALID_FORMAT("ROLE_ARN_INVALID_FORMAT"),
    URL_INVALID("URL_INVALID"),
    URL_SCHEME("URL_SCHEME"),
    URL_USER_INFO("URL_USER_INFO"),
    URL_PORT("URL_PORT"),
    URL_UNKNOWN_HOST("URL_UNKNOWN_HOST"),
    URL_LOCAL_ADDRESS("URL_LOCAL_ADDRESS"),
    URL_LOOPBACK_ADDRESS("URL_LOOPBACK_ADDRESS"),
    URL_LINK_LOCAL_ADDRESS("URL_LINK_LOCAL_ADDRESS"),
    URL_MULTICAST_ADDRESS("URL_MULTICAST_ADDRESS"),
    MEMBER_INVALID("MEMBER_INVALID"),
    MEMBER_MISSING("MEMBER_MISSING"),
    MEMBER_MIN_VALUE("MEMBER_MIN_VALUE"),
    MEMBER_MAX_VALUE("MEMBER_MAX_VALUE"),
    MEMBER_MIN_LENGTH("MEMBER_MIN_LENGTH"),
    MEMBER_MAX_LENGTH("MEMBER_MAX_LENGTH"),
    MEMBER_INVALID_ENUM_VALUE("MEMBER_INVALID_ENUM_VALUE"),
    MEMBER_DOES_NOT_MATCH_PATTERN("MEMBER_DOES_NOT_MATCH_PATTERN"),
    INVALID_MANIFEST_FILTER("INVALID_MANIFEST_FILTER"),
    INVALID_TIME_DELAY_SECONDS("INVALID_TIME_DELAY_SECONDS"),
    END_TIME_EARLIER_THAN_START_TIME("END_TIME_EARLIER_THAN_START_TIME"),
    TS_CONTAINER_TYPE_WITH_DASH_MANIFEST("TS_CONTAINER_TYPE_WITH_DASH_MANIFEST"),
    DIRECT_MODE_WITH_TIMING_SOURCE("DIRECT_MODE_WITH_TIMING_SOURCE"),
    NONE_MODE_WITH_TIMING_SOURCE("NONE_MODE_WITH_TIMING_SOURCE"),
    TIMING_SOURCE_MISSING("TIMING_SOURCE_MISSING"),
    UPDATE_PERIOD_SMALLER_THAN_SEGMENT_DURATION("UPDATE_PERIOD_SMALLER_THAN_SEGMENT_DURATION"),
    PERIOD_TRIGGERS_NONE_SPECIFIED_WITH_ADDITIONAL_VALUES("PERIOD_TRIGGERS_NONE_SPECIFIED_WITH_ADDITIONAL_VALUES"),
    DRM_SIGNALING_MISMATCH_SEGMENT_ENCRYPTION_STATUS("DRM_SIGNALING_MISMATCH_SEGMENT_ENCRYPTION_STATUS");

    private String value;

    private ValidationExceptionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ValidationExceptionType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ValidationExceptionType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ValidationExceptionType enumEntry : ValidationExceptionType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

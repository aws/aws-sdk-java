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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
 * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify
 * 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you specify a value
 * for Max resolution, the value that you specify for Min top rendition size must be less than, or equal to, Max
 * resolution. Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. *
 * The lowest resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If
 * you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you
 * specify a Min top rendition size rule, the value that you specify for Min bottom rendition size must be less than, or
 * equal to, Min top rendition size. Use Force include renditions to specify one or more resolutions to include your ABR
 * stack. * (Recommended) To optimize automated ABR, specify as few resolutions as possible. * (Required) The number of
 * resolutions that you specify must be equal to, or less than, the Max renditions setting. * If you specify a Min top
 * rendition size rule, specify at least one resolution that is equal to, or greater than, Min top rendition size. * If
 * you specify a Min bottom rendition size rule, only specify resolutions that are equal to, or greater than, Min bottom
 * rendition size. * If you specify a Force include renditions rule, do not specify a separate rule for Allowed
 * renditions. * Note: The ABR stack may include other resolutions that you do not specify here, depending on the Max
 * renditions setting. Use Allowed renditions to specify a list of possible resolutions in your ABR stack. * (Required)
 * The number of resolutions that you specify must be equal to, or greater than, the Max renditions setting. *
 * MediaConvert will create an ABR stack exclusively from the list of resolutions that you specify. * Some resolutions
 * in the Allowed renditions list may not be included, however you can force a resolution to be included by setting
 * Required to ENABLED. * You must specify at least one resolution that is greater than or equal to any resolutions that
 * you specify in Min top rendition size or Min bottom rendition size. * If you specify Allowed renditions, you must not
 * specify a separate rule for Force include renditions.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum RuleType {

    MIN_TOP_RENDITION_SIZE("MIN_TOP_RENDITION_SIZE"),
    MIN_BOTTOM_RENDITION_SIZE("MIN_BOTTOM_RENDITION_SIZE"),
    FORCE_INCLUDE_RENDITIONS("FORCE_INCLUDE_RENDITIONS"),
    ALLOWED_RENDITIONS("ALLOWED_RENDITIONS");

    private String value;

    private RuleType(String value) {
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
     * @return RuleType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static RuleType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (RuleType enumEntry : RuleType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

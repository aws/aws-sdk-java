/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import com.amazonaws.auth.policy.Resource;

import java.util.List;

/**
 * Utility methods related to IAM policies
 */
public class PolicyUtils {
    private static final String INVALID_RESOURCE = "Cannot have both a NotResource and a Resource in " +
            "the same statement";

    /**
     * Determines if a list of Resource objects is valid, containing either all NotResource elements or all Resource
     * elements
     *
     * @param resourceList the list of Resource objects
     * @throws IllegalArgumentException if the resource list is invalid
     */
    public static void validateResourceList(final List<Resource> resourceList) {
        boolean hasNotResource = false;
        boolean hasResource = false;
        for (Resource resource : resourceList) {
            if (resource.isNotType()) {
                hasNotResource = true;
            } else {
                hasResource = true;
            }
            if (hasResource && hasNotResource) {
                // right now only validate that there are only NotResource or only Resource elements
                // in the future could do more validation
                throw new IllegalArgumentException(PolicyUtils.INVALID_RESOURCE);
            }
        }
    }
}

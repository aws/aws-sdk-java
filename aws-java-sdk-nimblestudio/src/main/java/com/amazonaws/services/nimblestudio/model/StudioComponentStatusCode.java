/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import javax.annotation.Generated;

/**
 * <p>
 * The current status of the studio component resource.
 * </p>
 * <p>
 * When the resource is in the 'READY' state, the status code signals what the last mutation made to the resource was.
 * </p>
 * <p>
 * When the resource is in a CREATE_FAILED/UPDATE_FAILED/DELETE_FAILED state, the status code signals what went wrong
 * and why the mutation failed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum StudioComponentStatusCode {

    ACTIVE_DIRECTORY_ALREADY_EXISTS("ACTIVE_DIRECTORY_ALREADY_EXISTS"),
    STUDIO_COMPONENT_CREATED("STUDIO_COMPONENT_CREATED"),
    STUDIO_COMPONENT_UPDATED("STUDIO_COMPONENT_UPDATED"),
    STUDIO_COMPONENT_DELETED("STUDIO_COMPONENT_DELETED"),
    ENCRYPTION_KEY_ACCESS_DENIED("ENCRYPTION_KEY_ACCESS_DENIED"),
    ENCRYPTION_KEY_NOT_FOUND("ENCRYPTION_KEY_NOT_FOUND"),
    STUDIO_COMPONENT_CREATE_IN_PROGRESS("STUDIO_COMPONENT_CREATE_IN_PROGRESS"),
    STUDIO_COMPONENT_UPDATE_IN_PROGRESS("STUDIO_COMPONENT_UPDATE_IN_PROGRESS"),
    STUDIO_COMPONENT_DELETE_IN_PROGRESS("STUDIO_COMPONENT_DELETE_IN_PROGRESS"),
    INTERNAL_ERROR("INTERNAL_ERROR");

    private String value;

    private StudioComponentStatusCode(String value) {
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
     * @return StudioComponentStatusCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static StudioComponentStatusCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (StudioComponentStatusCode enumEntry : StudioComponentStatusCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

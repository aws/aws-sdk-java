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
 * The current state of the studio component resource.
 * </p>
 * <p>
 * While a studio component is being created, modified, or deleted, its state will equal "CREATE_IN_PROGRESS",
 * "UPDATE_IN_PROGRESS", or "DELETE_IN_PROGRESS"
 * </p>
 * <p>
 * These are called 'transition states'.
 * </p>
 * <p>
 * No modifications may be made to the studio component while it is in a transition state.
 * </p>
 * <p>
 * If creation of the resource fails, the state will change to `CREATE_FAILED`. The resource StatusCode and
 * StatusMessage will provide more information of why creation failed. The resource in this state will automatically be
 * deleted from your account after a period of time.
 * </p>
 * <p>
 * If updating the resource fails, the state will change to `UPDATE_FAILED`. The resource StatusCode and StatusMessage
 * will provide more information of why the update failed. The resource will be returned to the state it was in when the
 * update request was invoked.
 * </p>
 * <p>
 * If deleting the resource fails, the state will change to `DELETE_FAILED`. The resource StatusCode and StatusMessage
 * will provide more information of why the update failed. The resource will be returned to the state it was in when the
 * update request was invoked. After the resource is deleted successfully, it will change to the "DELETED" state. The
 * resource will no longer count against service quotas and cannot be used or acted upon any futher. It will be removed
 * from your account after a period of time.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum StudioComponentState {

    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    READY("READY"),
    UPDATE_IN_PROGRESS("UPDATE_IN_PROGRESS"),
    DELETE_IN_PROGRESS("DELETE_IN_PROGRESS"),
    DELETED("DELETED"),
    DELETE_FAILED("DELETE_FAILED"),
    CREATE_FAILED("CREATE_FAILED"),
    UPDATE_FAILED("UPDATE_FAILED");

    private String value;

    private StudioComponentState(String value) {
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
     * @return StudioComponentState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static StudioComponentState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (StudioComponentState enumEntry : StudioComponentState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

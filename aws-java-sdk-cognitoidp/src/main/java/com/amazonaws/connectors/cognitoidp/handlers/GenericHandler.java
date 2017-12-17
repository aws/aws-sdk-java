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

package com.math.pro.ak.util.cognito.handlers;

/**
 * Callback used for calls which do not return data and only indicate success or failure.
 */
public interface GenericHandler {
    /**
     * This callback method is invoked when the call has successfully completed.
     */
    public void onSuccess();

    /**
     * This callback method is invoked when call has failed. Probe {@code exception} for cause.
     *
     * @param exception REQUIRED: Failure details.
     */
    public void onFailure(Exception exception);
}

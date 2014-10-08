/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.core;

public interface ExternalTaskCancellationHandler {

    /**
     * Called when cancellation of the external task is requested. Use
     * {@link ExternalTaskCompletionHandle#complete()} to report task successful
     * completion or cancellation. Use
     * {@link ExternalTaskCompletionHandle#fail(Throwable)} to report task
     * completion or cancellation failure. 
     * @param cause the reason for the cancellation. May be <code>null</code>.
     */
    public void handleCancellation(Throwable cause);

}

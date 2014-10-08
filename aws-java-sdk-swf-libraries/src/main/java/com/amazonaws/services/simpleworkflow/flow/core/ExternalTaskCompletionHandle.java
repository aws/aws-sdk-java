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

/**
 * Used to complete or fail an external task initiated through
 * {@link ExternalTask#doExecute(ExternalTaskCompletionHandle)}.
 * <p>
 * Flow framework is not thread safe and expects that all asynchronous code is
 * executed in a single thread. Currently ExternalTaskCompletionHandle is the
 * only exception as it allows {@link #complete()} and {@link #fail(Throwable)}
 * be called from other threads.
 * 
 * @author fateev
 */
public interface ExternalTaskCompletionHandle {

    public void complete();

    public void fail(Throwable e);

}

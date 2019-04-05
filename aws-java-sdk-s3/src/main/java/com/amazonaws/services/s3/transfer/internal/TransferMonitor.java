/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.transfer.internal;

import java.util.concurrent.Future;


/**
 * Monitors long-running transfers.
 */
public interface TransferMonitor {

    /**
     * Returns a Future to wait on. Calling get() on this future will block
     * while the transfer progress is checked, but its return does not guarantee
     * the transfer is complete. Call isDone() to check for completion.  Repeated
     * calls to getFuture() can return different objects.
     */
    public Future<?> getFuture();

    /**
     * Returns whether the transfer is completed. A failure or cancellation
     * counts as completion as well; to gather any exceptions thrown, call
     * getFuture().get()
     */
    public boolean isDone();

}

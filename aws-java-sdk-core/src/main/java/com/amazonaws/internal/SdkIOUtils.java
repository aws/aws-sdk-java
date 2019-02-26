/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import java.io.Closeable;
import java.io.IOException;

import com.amazonaws.log.InternalLogApi;
import com.amazonaws.log.InternalLogFactory;

/**
 * Utilities for IO operations.
 */
enum SdkIOUtils {
    ;
    private static final InternalLogApi defaultLog = InternalLogFactory.getLog(SdkIOUtils.class);

    static void closeQuietly(Closeable is) {
        closeQuietly(is, null);
    }
    /**
     * Closes the given Closeable quietly.
     * @param is the given closeable
     * @param log logger used to log any failure should the close fail
     */
    static void closeQuietly(Closeable is, InternalLogApi log) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException ex) {
                InternalLogApi logger = log == null ? defaultLog : log;
                if (logger.isDebugEnabled())
                    logger.debug("Ignore failure in closing the Closeable", ex);
            }
        }
    }
}

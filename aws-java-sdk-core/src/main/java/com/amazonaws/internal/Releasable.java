/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Used for releasing a resource.
 * <p>
 * For example, the creation of a <code>ResettableInputStream</code> would entail
 * physically opening a file. If the opened file is meant to be closed only (in
 * a finally block) by the very same code block that created it, then it is
 * necessary that the release method must not be called while the execution is
 * made in other stack frames.
 * 
 * In such case, as other stack frames may inadvertently or indirectly call the
 * close method of the stream, the creator of the stream would need to
 * explicitly disable the accidental closing via
 * <code>ResettableInputStream#disableClose()</code>, so that the release method
 * becomes the only way to truly close the opened file.
 */
public interface Releasable {
    /**
     * Releases the allocated resource. This method should not be called except
     * by the caller who allocated the resource at the very top of the call
     * stack. This allows, typically, a {@link Closeable} resource to be not
     * unintentionally released owing to the calling of the
     * {@link Closeable#close()} methods by implementation deep down in the call
     * stack.
     * <p>
     * For example, the creation of a <code>ResettableInputStream</code> would entail
     * physically opening a file. If the opened file is meant to be closed only
     * (in a finally block) by the very same code block that created it, then it
     * is necessary that the release method must not be called while the
     * execution is made in other stack frames.
     * 
     * In such case, as other stack frames may inadvertently or indirectly call
     * the close method of the stream, the creator of the stream would need to
     * explicitly disable the accidental closing via
     * <code>ResettableInputStream#disableClose()</code>, so that the release method
     * becomes the only way to truly close the opened file.
     */
    public void release();
}

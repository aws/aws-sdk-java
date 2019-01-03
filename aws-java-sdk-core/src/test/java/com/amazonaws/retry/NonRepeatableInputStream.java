/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.retry;

import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.internal.SdkInputStream;

class NonRepeatableInputStream extends SdkInputStream {

    private final String nonRepeatableContent;
    private int pos;
    
    public NonRepeatableInputStream(String content) {
        nonRepeatableContent = content;
        pos = 0;
    }
    
    @Override
    public int read() throws IOException {
        if (pos >= nonRepeatableContent.length()) return -1;
        return nonRepeatableContent.charAt(pos++);
    }

    @Override
    protected InputStream getWrappedInputStream() {
        return null;
    }
    
}
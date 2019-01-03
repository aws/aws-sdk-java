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

package com.amazonaws.services.s3.model;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * An implementation of {@link InputStream} that loads the content from the S3 object that matched the select query. This is
 * usually acquired by a call to {@link SelectObjectContentEventStream#getRecordsInputStream()}.
 */
public class SelectRecordsInputStream extends SdkFilterInputStream {
    private final SdkFilterInputStream abortableHttpStream;

    SelectRecordsInputStream(InputStream selectResultStream,
                             SdkFilterInputStream abortableHttpStream) {
        super(selectResultStream);
        this.abortableHttpStream = abortableHttpStream;
    }

    /**
     * Equivalent to calling {@link SelectObjectContentEventStream#abort()}.
     */
    @Override
    public void abort() {
        super.abort();
        abortableHttpStream.abort();
    }

    /**
     * Equivalent to calling {@link SelectObjectContentEventStream#close()}.
     */
    @Override
    public void close() throws IOException {
        super.close();
        abortableHttpStream.close();
    }
}

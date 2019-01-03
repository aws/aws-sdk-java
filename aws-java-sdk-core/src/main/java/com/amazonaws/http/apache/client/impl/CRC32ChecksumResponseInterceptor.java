/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http.apache.client.impl;

import com.amazonaws.util.CRC32ChecksumCalculatingInputStream;
import com.amazonaws.util.IOUtils;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CRC32ChecksumResponseInterceptor implements HttpResponseInterceptor {

    @Override
    public void process(HttpResponse response, final HttpContext context)
            throws HttpException, IOException {
        final HttpEntity entity = response.getEntity();

        // Only Json protocol has this header, we only wrap CRC32ChecksumCalculatingInputStream in json protocol clients.
        Header[] headers = response.getHeaders("x-amz-crc32");
        if (entity == null || headers == null || headers.length == 0) {
            return;
        }
        HttpEntity crc32ResponseEntity = new HttpEntityWrapper(entity) {

            private final InputStream content = new CRC32ChecksumCalculatingInputStream(
                    wrappedEntity.getContent());

            @Override
            public InputStream getContent() throws IOException {
                return content;
            }

            /**
             * It's important to override writeTo. Some versions of Apache HTTP
             * client use writeTo for {@link org.apache.http.entity.BufferedHttpEntity}
             * and the default implementation just delegates to the wrapped entity
             * which completely bypasses our CRC32 calculating input stream. The
             * {@link org.apache.http.entity.BufferedHttpEntity} is used for the
             * request timeout and client execution timeout features.
             *
             * @see <a href="https://github.com/aws/aws-sdk-java/issues/526">Issue #526</a>
             *
             * @param outstream OutputStream to write contents to
             */
            @Override
            public void writeTo(OutputStream outstream) throws IOException {
                try {
                    IOUtils.copy(this.getContent(), outstream);
                } finally {
                    this.getContent().close();
                }
            }
        };

        response.setEntity(crc32ResponseEntity);
        context.setAttribute(CRC32ChecksumCalculatingInputStream.class.getName(),
                             crc32ResponseEntity.getContent());
    }

}

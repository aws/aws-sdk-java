/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3control.internal.handlers;

import static com.amazonaws.services.s3.Headers.CONTENT_LENGTH;

import com.amazonaws.Request;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3.request.S3HandlerContextKeys;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Turns on payload signing and prevents moving query params to body during a POST which S3 doesn't like.
 */
@SdkInternalApi
public final class S3ControlHandler extends RequestHandler2 {
    private static final String PROLOG = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    private static final String PROLOG_LENGTH = Integer.toString(PROLOG.length());
    private static final Log log = LogFactory.getLog(S3ControlHandler.class);

    @Override
    public void beforeRequest(Request<?> request) {
        request.addHandlerContext(S3HandlerContextKeys.IS_PAYLOAD_SIGNING_ENABLED, true);
        InputStream content = request.getContent();
        if (content == null && request.getHttpMethod() == HttpMethodName.POST) {
            request.setContent(new ByteArrayInputStream(new byte[0]));
            return;
        }

        // Remove <?xml version="1.0" encoding="UTF-8"?> if it's the only element in the payload
        if (mightOnlyContainsXmlProlog(request, content)) {

            try {
                String stringContent = IOUtils.toString(content);
                if (stringContent.equals(PROLOG)) {
                    request.setContent(new ByteArrayInputStream(new byte[0]));
                    request.getHeaders().put(CONTENT_LENGTH, "0");
                } else {
                    IOUtils.closeQuietly(content, log);
                    request.setContent(new StringInputStream(stringContent));
                }
            } catch (IOException e) {
                throw new SdkClientException("Fail to send the request", e);
            }
        }
    }

    /**
     * Checks if the payload only contains XML prolog based on the content length
     */
    private boolean mightOnlyContainsXmlProlog(Request<?> request, InputStream content) {
        return request.getHttpMethod() == HttpMethodName.PUT &&
               PROLOG_LENGTH.equals(request.getHeaders().get(CONTENT_LENGTH))
               && content != null;
    }
}

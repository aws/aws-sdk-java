/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.opensdk.protect.model.transform;

import com.amazonaws.opensdk.SdkResponseMetadata;
import com.amazonaws.opensdk.model.RawResult;
import com.amazonaws.opensdk.model.ResultContentConsumer;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.SdkHttpMetadata;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import java.io.IOException;

public class RawResultUnmarshaller implements Unmarshaller<RawResult, JsonUnmarshallerContext> {

    private final ResultContentConsumer resultContentConsumer;

    public RawResultUnmarshaller(ResultContentConsumer resultConsumer) {
        resultContentConsumer = resultConsumer;
    }

    @Override
    public RawResult unmarshall(JsonUnmarshallerContext in) throws IOException {
        HttpResponse response = in.getHttpResponse();

        RawResult result = new RawResult();
        result.sdkResponseMetadata(new SdkResponseMetadata(SdkHttpMetadata.from(response)));
        try {
            resultContentConsumer.consume(result, response.getContent());
        } finally {
            response.getContent().close();
        }

        return result;
    }
}

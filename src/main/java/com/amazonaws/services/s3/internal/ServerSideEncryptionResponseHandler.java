/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
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
package com.amazonaws.services.s3.internal;

import java.io.InputStream;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.transform.Unmarshaller;


/**
 * Base request handler for responses that include a server-side encryption
 * header
 */
public class ServerSideEncryptionResponseHandler <T extends ServerSideEncryptionResult> extends S3XmlResponseHandler<T>{

    public ServerSideEncryptionResponseHandler(Unmarshaller<T, InputStream> responseUnmarshaller) {
        super(responseUnmarshaller);
    }

    @Override
    public AmazonWebServiceResponse<T> handle(HttpResponse response) throws Exception {
        AmazonWebServiceResponse<T> awsResponse = super.handle(response);
        
        T result = awsResponse.getResult();
        if (result != null) {
            result.setServerSideEncryption(response.getHeaders().get(Headers.SERVER_SIDE_ENCRYPTION));
        }
        
        return awsResponse;
    }
}

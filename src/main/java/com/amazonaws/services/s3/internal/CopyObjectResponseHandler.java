/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.transform.Unmarshallers;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.CopyObjectResultHandler;

/**
 * Custom response handler for the CopyObject operation. Handling this response
 * is slightly different from other responses since it involves combining
 * information from the XML payload in the response with information from the
 * HTTP response headers (version ID).
 */
public class CopyObjectResponseHandler
        extends S3XmlResponseHandler<CopyObjectResultHandler> {

    public CopyObjectResponseHandler() {
        super(new Unmarshallers.CopyObjectUnmarshaller());
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.internal.S3XmlResponseHandler#handle(com.amazonaws.http.HttpResponse)
     */
    @Override
    public AmazonWebServiceResponse<CopyObjectResultHandler> handle(HttpResponse response) throws Exception {
        /*
         * TODO: Might be nice to handle the rest of CopyObject's custom logic
         *       here, instead of in the AmazonS3Client. We coudl detect an error
         *       XML response and throw the exception, otherwise just return the
         *       fully populated CopyObjectResult object.
         */
        AmazonWebServiceResponse<CopyObjectResultHandler> awsResponse = super.handle(response);
        CopyObjectResultHandler copyObjectResultHandler = awsResponse.getResult();
        if (copyObjectResultHandler != null) {
            copyObjectResultHandler.setVersionId(response.getHeaders().get(Headers.S3_VERSION_ID));
        }

        return awsResponse;
    }

}

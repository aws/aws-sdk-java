/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.JsonUnmarshallerContextImpl;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.VoidJsonUnmarshaller;
import com.amazonaws.util.CRC32ChecksumCalculatingInputStream;

/**
 * Default implementation of HttpResponseHandler that handles a successful
 * response from an AWS service and unmarshalls the result using a JSON
 * unmarshaller.
 *
 * @param <T>
 *            Indicates the type being unmarshalled by this response handler.
 */
public class JsonResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /** The JSON unmarshaller to use when handling the response */
    private Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller;

    /** Shared logger for profiling information */
    private static final Log log = LogFactory.getLog("com.amazonaws.request");

    private static JsonFactory jsonFactory = new JsonFactory();

    public boolean needsConnectionLeftOpen = false;

    private boolean isPayloadJson = true;

    /**
     * Constructs a new response handler that will use the specified JSON
     * unmarshaller to unmarshall the service response and uses the specified
     * response element path to find the root of the business data in the
     * service's response.
     *
     * @param responseUnmarshaller
     *            The JSON unmarshaller to use on the response.
     */
    public JsonResponseHandler(Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller) {
        this.responseUnmarshaller = responseUnmarshaller;

        /*
         * Even if the invoked operation just returns null, we still need an
         * unmarshaller to run so we can pull out response metadata.
         *
         * We might want to pass this in through the client class so that we
         * don't have to do this check here.
         */
        if (this.responseUnmarshaller == null) {
            this.responseUnmarshaller = new VoidJsonUnmarshaller<T>();
        }
    }


    /**
     * @see com.amazonaws.http.HttpResponseHandler#handle(com.amazonaws.http.HttpResponse)
     */
    public AmazonWebServiceResponse<T> handle(HttpResponse response) throws Exception {
        log.trace("Parsing service response JSON");

        String CRC32Checksum = response.getHeaders().get("x-amz-crc32");
        CRC32ChecksumCalculatingInputStream crc32ChecksumInputStream = null;

        JsonParser jsonParser = null;

        if (shouldParsePayloadAsJson()) {
            if (CRC32Checksum != null) {
                crc32ChecksumInputStream = new CRC32ChecksumCalculatingInputStream(response.getContent());
                jsonParser = jsonFactory.createParser(crc32ChecksumInputStream);
            } else {
                jsonParser = jsonFactory.createParser(response.getContent());
            }
        }

        try {
            AmazonWebServiceResponse<T> awsResponse = new AmazonWebServiceResponse<T>();
            JsonUnmarshallerContext unmarshallerContext = new JsonUnmarshallerContextImpl(
                    jsonParser, response);
            registerAdditionalMetadataExpressions(unmarshallerContext);

            T result = responseUnmarshaller.unmarshall(unmarshallerContext);

            if (CRC32Checksum != null) {
                long serverSideCRC = Long.parseLong(CRC32Checksum);
                long clientSideCRC = crc32ChecksumInputStream.getCRC32Checksum();
                if (clientSideCRC != serverSideCRC) {
                    throw new CRC32MismatchException("Client calculated crc32 checksum didn't match that calculated by server side");
                }
            }

            awsResponse.setResult(result);

            Map<String, String> metadata = unmarshallerContext.getMetadata();
            metadata.put(ResponseMetadata.AWS_REQUEST_ID, response.getHeaders().get(X_AMZN_REQUEST_ID_HEADER));
            awsResponse.setResponseMetadata(new ResponseMetadata(metadata));

            log.trace("Done parsing service response");
            return awsResponse;
        } finally {
            if (shouldParsePayloadAsJson()) {
                try {
                    jsonParser.close();
                } catch (IOException e) {
                    log.warn("Error closing json parser", e);
                }
            }
        }
    }

    /**
     * Hook for subclasses to override in order to collect additional metadata
     * from service responses.
     *
     * @param unmarshallerContext
     *            The unmarshaller context used to process a service's response
     *            data.
     */
    protected void registerAdditionalMetadataExpressions(JsonUnmarshallerContext unmarshallerContext) {}

    public boolean needsConnectionLeftOpen() {
        return needsConnectionLeftOpen;
    }

    public void setNeedsConnectionLeftOpen(boolean needsConnectionLeftOpen) {
        this.needsConnectionLeftOpen = needsConnectionLeftOpen;
    }

    /**
     * Sets whether the payload contains JSON.
     */
    public void setIsPayloadJson(boolean parsePayloadAsJson) {
        this.isPayloadJson = parsePayloadAsJson;
    }

    /**
     * @return True if the payload will be parsed as JSON, false otherwise.
     */
    private boolean shouldParsePayloadAsJson() {
        return !needsConnectionLeftOpen && isPayloadJson;
    }

}

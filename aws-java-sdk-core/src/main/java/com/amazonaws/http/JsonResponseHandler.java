/*
 *
 * Copyright (c) 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.JsonUnmarshallerContext.UnmarshallerType;
import com.amazonaws.transform.JsonUnmarshallerContextImpl;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.VoidJsonUnmarshaller;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.ValidationUtils;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Default implementation of HttpResponseHandler that handles a successful response from an AWS
 * service and unmarshalls the result using a JSON unmarshaller.
 *
 * @param <T> Indicates the type being unmarshalled by this response handler.
 */
@SdkInternalApi
public class JsonResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /**
     * The JSON unmarshaller to use when handling the response
     */
    private Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller;

    /**
     * Shared logger for profiling information
     */
    private static final Log log = LogFactory.getLog("com.amazonaws.request");

    private final JsonFactory jsonFactory;

    private final boolean needsConnectionLeftOpen;

    private final boolean isPayloadJson;

    private final Map<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>> simpleTypeUnmarshallers;
    private final Map<UnmarshallerType, Unmarshaller<?, JsonUnmarshallerContext>> customTypeMarshallers;

    /**
     * Constructs a new response handler that will use the specified JSON unmarshaller to unmarshall
     * the service response and uses the specified response element path to find the root of the
     * business data in the service's response.
     * @param responseUnmarshaller    The JSON unmarshaller to use on the response.
     * @param simpleTypeUnmarshallers List of unmarshallers to be used for scalar types.
     * @param customTypeMarshallers   List of custom unmarshallers to be used for special types.
     * @param jsonFactory             the json factory to be used for parsing the response.
     */
    public JsonResponseHandler(Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller,
                               Map<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>> simpleTypeUnmarshallers,
                               Map<UnmarshallerType, Unmarshaller<?, JsonUnmarshallerContext>> customTypeMarshallers,
                               JsonFactory jsonFactory, boolean needsConnectionLeftOpen,
                               boolean isPayloadJson) {
        /*
         * Even if the invoked operation just returns null, we still need an
         * unmarshaller to run so we can pull out response metadata.
         *
         * We might want to pass this in through the client class so that we
         * don't have to do this check here.
         */
        this.responseUnmarshaller =
                responseUnmarshaller != null ? responseUnmarshaller : new VoidJsonUnmarshaller<T>();

        this.needsConnectionLeftOpen = needsConnectionLeftOpen;
        this.isPayloadJson = isPayloadJson;

        this.simpleTypeUnmarshallers = ValidationUtils.assertNotNull(simpleTypeUnmarshallers, "simple type unmarshallers");
        this.customTypeMarshallers = ValidationUtils.assertNotNull(customTypeMarshallers, "custom type marshallers");
        this.jsonFactory = ValidationUtils.assertNotNull(jsonFactory, "JSONFactory");
    }


    /**
     * @see HttpResponseHandler#handle(HttpResponse)
     */
    public AmazonWebServiceResponse<T> handle(HttpResponse response) throws Exception {
        log.trace("Parsing service response JSON");

        String CRC32Checksum = response.getHeaders().get("x-amz-crc32");

        JsonParser jsonParser = null;

        if (shouldParsePayloadAsJson()) {
            jsonParser = jsonFactory.createParser(response.getContent());
        }

        try {
            AmazonWebServiceResponse<T> awsResponse = new AmazonWebServiceResponse<T>();
            JsonUnmarshallerContext unmarshallerContext = new JsonUnmarshallerContextImpl(
                    jsonParser, simpleTypeUnmarshallers, customTypeMarshallers, response);
            registerAdditionalMetadataExpressions(unmarshallerContext);

            T result = responseUnmarshaller.unmarshall(unmarshallerContext);

            // Make sure we read all the data to get an accurate CRC32 calculation.
            // See https://github.com/aws/aws-sdk-java/issues/1018
            if (shouldParsePayloadAsJson() && response.getContent() != null) {
                IOUtils.drainInputStream(response.getContent());
            }

            if (CRC32Checksum != null) {
                long serverSideCRC = Long.parseLong(CRC32Checksum);
                long clientSideCRC = response.getCRC32Checksum();
                if (clientSideCRC != serverSideCRC) {
                    throw new CRC32MismatchException(
                            "Client calculated crc32 checksum didn't match that calculated by server side");
                }
            }

            awsResponse.setResult(result);

            Map<String, String> metadata = unmarshallerContext.getMetadata();
            metadata.put(ResponseMetadata.AWS_REQUEST_ID,
                         response.getHeaders().get(X_AMZN_REQUEST_ID_HEADER));
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
     * Hook for subclasses to override in order to collect additional metadata from service
     * responses.
     *
     * @param unmarshallerContext
     *            The unmarshaller context used to configure a service's response
     *            data.
     */
    protected void registerAdditionalMetadataExpressions(
            JsonUnmarshallerContext unmarshallerContext) {
    }

    public boolean needsConnectionLeftOpen() {
        return needsConnectionLeftOpen;
    }

    /**
     * @return True if the payload will be parsed as JSON, false otherwise.
     */
    private boolean shouldParsePayloadAsJson() {
        return !needsConnectionLeftOpen && isPayloadJson;
    }

}

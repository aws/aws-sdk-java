package com.amazonaws.protocol.json;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import java.util.List;

/**
 * Common interface for creating generators (writers) and protocol handlers for JSON like protocols.
 * Current implementations include {@link SdkStructuredPlainJsonFactory} and {@link
 * SdkStructuredCborFactory}
 */
@SdkInternalApi
interface SdkStructuredJsonFactory {

    /**
     * Returns the {@link StructuredJsonGenerator} to be used for marshalling the request.
     *
     * @param protocolVersion AWS JSON/CBOR protocol version.
     */
    StructuredJsonGenerator createWriter(String protocolVersion);

    /**
     * Returns the response handler to be used for handling a successfull response.
     *
     * @param operationMetadata Additional context information about an operation to create the
     *                          appropriate response handler.
     */
    <T> JsonResponseHandler<T> createResponseHandler(JsonOperationMetadata operationMetadata, Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller);

    /**
     * Returns the error response handler for handling a error response.
     *
     * @param errorUnmarshallers Response unmarshallers to unamrshall the error responses.
     */
    JsonErrorResponseHandler createErrorResponseHandler(
            List<JsonErrorUnmarshaller> errorUnmarshallers, String customErrorCodeFieldName);
}

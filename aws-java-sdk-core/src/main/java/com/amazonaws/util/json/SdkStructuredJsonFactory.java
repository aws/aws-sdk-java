package com.amazonaws.util.json;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.JsonErrorResponseHandlerV2;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.transform.JsonErrorUnmarshallerV2;
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
     * @param responseUnmarshaller Response unmarshaller to unmarshall the specific response
     *                             object.
     */
    JsonResponseHandler createResponseHandler(
            Unmarshaller<?, JsonUnmarshallerContext> responseUnmarshaller);

    /**
     * Returns the error response handler for handling a error response.
     *
     * @param errorUnmarshallers Response unmarshallers to unamrshall the error responses.
     */
    JsonErrorResponseHandlerV2 createErrorResponseHandler(
            List<JsonErrorUnmarshallerV2> errorUnmarshallers);
}

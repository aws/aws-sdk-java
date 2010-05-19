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
package com.amazonaws.http;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.ResponseMetadata;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.VoidStaxUnmarshaller;

/**
 * Default implementation of HttpResponseHandler that handles a successful
 * response from an AWS service and unmarshalls the result using a StAX
 * unmarshaller.
 *
 * @param <T>
 *            Indicates the type being unmarshalled by this response handler.
 */
public class StaxResponseHandler<T> implements HttpResponseHandler<ResponseMetadata<T>> {

    /** The StAX unmarshaller to use when handling the response */
    private Unmarshaller<T, StaxUnmarshallerContext> responseUnmarshaller;

    /**
     * The optional Xpath location of the AWS request ID field in a response. If
     * not specified, the default request ID location will be used.
     */
    private String requestIdPath = null;

    /** Shared logger for profiling information */
    private static final Log log = LogFactory.getLog("com.amazonaws.request");

    /** Shared factory for creating XML event readers */
    private static XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

    static {
        /**
         * It's important that character event coalescing is enabled so that
         * when we pull character data out of an element, we get all of it in
         * one event and don't miss any. Without coalescing turned on, some
         * values (ex: newlines) can cause the data to be split into multiple
         * character events.
         */
        xmlInputFactory.setProperty(XMLInputFactory.IS_COALESCING, true);
    }


    /**
     * Constructs a new response handler that will use the specified StAX
     * unmarshaller to unmarshall the service response and uses the specified
     * response element path to find the root of the business data in the
     * service's response.
     *
     * @param responseUnmarshaller
     *            The StAX unmarshaller to use on the response.
     */
    public StaxResponseHandler(Unmarshaller<T, StaxUnmarshallerContext> responseUnmarshaller) {
        this.responseUnmarshaller = responseUnmarshaller;

        /*
         * Even if the invoked operation just returns null, we still need an
         * unmarshaller to run so we can pull out response metadata.
         *
         * We might want to pass this in through the client class so that we
         * don't have to do this check here.
         */
        if (this.responseUnmarshaller == null) {
            this.responseUnmarshaller = new VoidStaxUnmarshaller<T>();
        }
    }

    /**
     * Constructs a new response handler that will use the specified StAX
     * unmarshaller to unmarshall the service response, uses the specified
     * response element path to find the root of the business data in the
     * service's response, and uses the request ID path to locate the AWS
     * request ID in the response. This constructor should only be used if
     * handling a response from a service that doesn't use the standard AWS
     * response metadata format (i.e. EC2).
     *
     * @param responseUnmarshaller
     *            The StAX unmarshaller to use on the response.
     * @param requestIdPath
     *            The path to locate the AWS request ID in the service's
     *            response. This overrides the default location
     *            ("./ResponseMetadata/requestId").
     */
    public StaxResponseHandler(Unmarshaller<T, StaxUnmarshallerContext> responseUnmarshaller, String requestIdPath) {
        this(responseUnmarshaller);
        this.requestIdPath = requestIdPath;
    }

    /**
     * @see com.amazonaws.http.HttpResponseHandler#handle(com.amazonaws.http.HttpResponse)
     */
    public ResponseMetadata<T> handle(HttpResponse response) throws Exception {
        /*
         * TODO: We need to configure how to pull out the request ID since it varies
         *       Maybe by specifying rules based on depth, expressions, etc.
         */
        if (requestIdPath != null) {
        }

        log.trace("Parsing service response XML");
        XMLEventReader eventReader = xmlInputFactory.createXMLEventReader(response.getContent());
        try {
            ResponseMetadata<T> responseMetadata = new ResponseMetadata<T>();
            StaxUnmarshallerContext unmarshallerContext = new StaxUnmarshallerContext(eventReader, responseMetadata);
            T result = responseUnmarshaller.unmarshall(unmarshallerContext);
            responseMetadata.setResult(result);
            log.trace("Done parsing service response");
            return responseMetadata;
        } finally {
            try {eventReader.close();} catch (Exception e) {}
        }
    }

    /**
     * Since this response handler completely consumes all the data from the
     * underlying HTTP connection during the handle method, we don't need to
     * keep the HTTP connection open.
     *
     * @see com.amazonaws.http.HttpResponseHandler#needsConnectionLeftOpen()
     */
    public boolean needsConnectionLeftOpen() {
        return false;
    }

}

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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.amazonaws.ResponseMetadata;
import com.amazonaws.transform.ResponseMetadataUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.XpathUtils;

/**
 * Default implementation of HttpResponseHandler that handles a successful
 * response from an AWS service and unmarshalls the result using an Xpath
 * unmarshaller.
 *
 * @param <T>
 *            Indicates the type being unmarshalled by this response handler.
 */
public class DefaultResponseHandler<T> implements HttpResponseHandler<ResponseMetadata<T>> {

    /** The Xpath location of the actual results we want to expose to callers */
    private String responseElementPath;

    /** The Xpath unmarshaller to use when handling the response */
    private Unmarshaller<T, Node> responseUnmarshaller;

    /**
     * The optional Xpath location of the AWS request ID field in a response. If
     * not specified, the default request ID location will be used.
     */
    private String requestIdPath = null;

    /** Shared logger for profiling information */
    private static final Log log = LogFactory.getLog("com.amazonaws.request");


    /**
     * Constructs a new response handler that will use the specified Xpath
     * unmarshaller to unmarshall the service response and uses the specified
     * response element path to find the root of the business data in the
     * service's response.
     *
     * @param responseUnmarshaller
     *            The Xpath unmarshaller to use on the response.
     * @param responseElementPath
     *            The response element path to locate the root of the actual
     *            data we want to expose to callers from the service's response.
     */
    public DefaultResponseHandler(Unmarshaller<T, Node> responseUnmarshaller,
            String responseElementPath) {
        this.responseUnmarshaller = responseUnmarshaller;
        this.responseElementPath = responseElementPath;
    }

    /**
     * Constructs a new response handler that will use the specified Xpath
     * unmarshaller to unmarshall the service response, uses the specified
     * response element path to find the root of the business data in the
     * service's response, and uses the request ID path to locate the AWS
     * request ID in the response. This constructor should only be used if
     * handling a response from a service that doesn't use the standard AWS
     * response metadata format (i.e. EC2).
     *
     * @param responseUnmarshaller
     *            The Xpath unmarshaller to use on the response.
     * @param responseElementPath
     *            The response element path to locate the root of the actual
     *            data we want to expose to callers from the service's response.
     * @param requestIdPath
     *            The path to locate the AWS request ID in the service's
     *            response. This overrides the default location
     *            ("./ResponseMetadata/requestId").
     */
    public DefaultResponseHandler(Unmarshaller<T, Node> responseUnmarshaller,
            String responseElementPath, String requestIdPath) {
        this(responseUnmarshaller, responseElementPath);
        this.requestIdPath = requestIdPath;
    }


    /**
     * @see com.amazonaws.http.HttpResponseHandler#handle(com.amazonaws.http.HttpResponse)
     */
    public ResponseMetadata<T> handle(HttpResponse response) throws Exception {
        log.trace("Parsing service response XML into a DOM");
        Document document = XpathUtils.documentFrom(response.getContent());

        log.trace("Parsing data from the DOM");
        ResponseMetadataUnmarshaller<T> responseMetadataUnmarshaller = new ResponseMetadataUnmarshaller<T>();
        if (requestIdPath != null) {
            responseMetadataUnmarshaller.setRequestIdPath(requestIdPath);
        }
        ResponseMetadata<T> responseMetadata = responseMetadataUnmarshaller.unmarshall(document);

        if (responseUnmarshaller != null) {
            Node node = XpathUtils.asNode(responseElementPath, document);
            T result = responseUnmarshaller.unmarshall(node);

            responseMetadata.setResult(result);
        }

        log.trace("Done parsing service response");
        return responseMetadata;
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

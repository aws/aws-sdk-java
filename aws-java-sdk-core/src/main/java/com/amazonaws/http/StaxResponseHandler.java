/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.VoidStaxUnmarshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XmlUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.impl.io.EmptyInputStream;

/**
 * Default implementation of HttpResponseHandler that handles a successful
 * response from an AWS service and unmarshalls the result using a StAX
 * unmarshaller.
 *
 * @param <T> Indicates the type being unmarshalled by this response handler.
 */
public class StaxResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /**
     * The StAX unmarshaller to use when handling the response
     */
    private Unmarshaller<T, StaxUnmarshallerContext> responseUnmarshaller;

    /**
     * Shared logger for profiling information
     */
    private static final Log log = LogFactory.getLog("com.amazonaws.request");

    /**
     * Constructs a new response handler that will use the specified StAX
     * unmarshaller to unmarshall the service response and uses the specified
     * response element path to find the root of the business data in the
     * service's response.
     *
     * @param responseUnmarshaller The StAX unmarshaller to use on the response.
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
     * @see HttpResponseHandler#handle(HttpResponse)
     */
    public AmazonWebServiceResponse<T> handle(HttpResponse response) throws Exception {
        log.trace("Parsing service response XML");
        InputStream content = response.getContent();

        if (content == null) {
            content = new ByteArrayInputStream("<eof/>".getBytes(StringUtils.UTF8));
        } else if (content instanceof SdkFilterInputStream &&
                   ((SdkFilterInputStream) content).getDelegateStream() instanceof EmptyInputStream) {
            content = new ByteArrayInputStream("<eof/>".getBytes(StringUtils.UTF8));
        }

        XMLEventReader eventReader;
        try {
            eventReader = XmlUtils.getXmlInputFactory().createXMLEventReader(content);
        } catch (XMLStreamException e) {
            throw handleXmlStreamException(e);
        }

        try {
            AmazonWebServiceResponse<T> awsResponse = new AmazonWebServiceResponse<T>();
            StaxUnmarshallerContext unmarshallerContext = new StaxUnmarshallerContext(eventReader, response.getHeaders());
            unmarshallerContext.registerMetadataExpression("ResponseMetadata/RequestId", 2, ResponseMetadata.AWS_REQUEST_ID);
            unmarshallerContext.registerMetadataExpression("requestId", 2, ResponseMetadata.AWS_REQUEST_ID);
            registerAdditionalMetadataExpressions(unmarshallerContext);

            T result = responseUnmarshaller.unmarshall(unmarshallerContext);
            awsResponse.setResult(result);

            Map<String, String> metadata = unmarshallerContext.getMetadata();
            Map<String, String> responseHeaders = response.getHeaders();
            if (responseHeaders != null) {
                if (responseHeaders.get(X_AMZN_REQUEST_ID_HEADER) != null) {
                    metadata.put(ResponseMetadata.AWS_REQUEST_ID,
                                 responseHeaders.get(X_AMZN_REQUEST_ID_HEADER));
                }
                if (responseHeaders.get(X_AMZN_EXTENDED_REQUEST_ID_HEADER) != null) {
                    metadata.put(ResponseMetadata.AWS_EXTENDED_REQUEST_ID,
                                 responseHeaders.get(X_AMZN_EXTENDED_REQUEST_ID_HEADER));
                }
            }
            awsResponse.setResponseMetadata(getResponseMetadata(metadata));

            log.trace("Done parsing service response");
            return awsResponse;
        } catch (XMLStreamException e) {
            throw handleXmlStreamException(e);
        } finally {
            try {
                eventReader.close();
            } catch (XMLStreamException e) {
                log.warn("Error closing xml parser", e);
            }
        }
    }

    /**
     * If the exception was caused by an {@link IOException}, wrap it an another IOE so
     * that it will be exposed to the RetryPolicy.
     */
    private Exception handleXmlStreamException(XMLStreamException e) throws Exception {
        if (e.getNestedException() instanceof IOException) {
            return new IOException(e);
        }
        return e;
    }

    /**
     * Create the default {@link ResponseMetadata}. Subclasses may override this to create a
     * subclass of {@link ResponseMetadata}. Currently only SimpleDB does this.
     */
    protected ResponseMetadata getResponseMetadata(Map<String, String> metadata) {
        return new ResponseMetadata(metadata);
    }

    /**
     * Hook for subclasses to override in order to collect additional metadata
     * from service responses.
     *
     * @param unmarshallerContext The unmarshaller context used to configure a service's response
     *                            data.
     */
    protected void registerAdditionalMetadataExpressions(StaxUnmarshallerContext unmarshallerContext) {
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

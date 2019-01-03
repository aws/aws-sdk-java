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

import com.amazonaws.SdkClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XpathUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import static com.amazonaws.http.AmazonHttpClient.HEADER_SDK_TRANSACTION_ID;

/**
 * Implementation of HttpResponseHandler that handles only error responses from Amazon Web Services.
 * A list of unmarshallers is passed into the constructor, and while handling a response, each
 * unmarshaller is tried, in order, until one is found that can successfully unmarshall the error
 * response.  If no unmarshaller is found that can unmarshall the error response, a generic
 * AmazonServiceException is created and populated with the AWS error response information (error
 * message, AWS error code, AWS request ID, etc).
 */
@SdkProtectedApi
public class DefaultErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {
    private static final Log log = LogFactory.getLog(DefaultErrorResponseHandler.class);

    /**
     * The list of error response unmarshallers to try to apply to error responses.
     */
    private List<Unmarshaller<AmazonServiceException, Node>> unmarshallerList;

    /**
     * Constructs a new DefaultErrorResponseHandler that will handle error responses from Amazon
     * services using the specified list of unmarshallers. Each unmarshaller will be tried, in
     * order, until one is found that can unmarshall the error response.
     *
     * @param unmarshallerList The list of unmarshallers to try using when handling an error
     *                         response.
     */
    public DefaultErrorResponseHandler(
            List<Unmarshaller<AmazonServiceException, Node>> unmarshallerList) {
        this.unmarshallerList = unmarshallerList;
    }

    @Override
    public AmazonServiceException handle(HttpResponse errorResponse) throws Exception {
        AmazonServiceException ase = createAse(errorResponse);
        if (ase == null) {
            throw new SdkClientException("Unable to unmarshall error response from service");
        }
        ase.setHttpHeaders(errorResponse.getHeaders());
        if (StringUtils.isNullOrEmpty(ase.getErrorCode())) {
            ase.setErrorCode(errorResponse.getStatusCode() + " " + errorResponse.getStatusText());
        }
        return ase;
    }

    private AmazonServiceException createAse(HttpResponse errorResponse) throws Exception {
        // Try to parse the error response as XML
        final Document document = documentFromContent(errorResponse.getContent(), idString(errorResponse));

        /*
         * We need to select which exception unmarshaller is the correct one to
         * use from all the possible exceptions this operation can throw.
         * Currently we rely on the unmarshallers to return null if they can't
         * unmarshall the response, but we might need something a little more
         * sophisticated in the future.
         */
        for (Unmarshaller<AmazonServiceException, Node> unmarshaller : unmarshallerList) {
            AmazonServiceException ase = unmarshaller.unmarshall(document);
            if (ase != null) {
                ase.setStatusCode(errorResponse.getStatusCode());
                return ase;
            }
        }
        return null;
    }

    private Document documentFromContent(InputStream content, String idString) throws ParserConfigurationException, SAXException, IOException {
        try {
            return parseXml(contentToString(content, idString), idString);
        } catch (Exception e) {
            // Generate an empty document to make the unmarshallers happy. Ultimately the default
            // unmarshaller will be called to unmarshall into the service base exception.
            return XpathUtils.documentFrom("<empty/>");
        }
    }

    private String contentToString(InputStream content, String idString) throws Exception {
        try {
            return IOUtils.toString(content);
        } catch (Exception e) {
            log.debug(String.format("Unable to read input stream to string (%s)", idString), e);
            throw e;
        }
    }

    private Document parseXml(String xml, String idString) throws Exception {
        try {
            return XpathUtils.documentFrom(xml);
        } catch (Exception e) {
            log.debug(String.format("Unable to parse HTTP response (%s) content to XML document '%s' ", idString, xml), e);
            throw e;
        }
    }

    private String idString(HttpResponse errorResponse) {
        StringBuilder idString = new StringBuilder();
        try {
            if (errorResponse.getRequest().getHeaders().containsKey(HEADER_SDK_TRANSACTION_ID)) {
                idString.append("Invocation Id:").append(errorResponse.getRequest().getHeaders().get(HEADER_SDK_TRANSACTION_ID));
            }
            if (errorResponse.getHeaders().containsKey(X_AMZN_REQUEST_ID_HEADER)) {
                if (idString.length() > 0) {
                    idString.append(", ");
                }
                idString.append("Request Id:").append(errorResponse.getHeaders().get(X_AMZN_REQUEST_ID_HEADER));
            }
        } catch (NullPointerException npe){
            log.debug("Error getting Request or Invocation ID from response", npe);
        }
        return idString.length() > 0 ? idString.toString() : "Unknown";
    }

    /**
     * Since this response handler completely consumes all the data from the underlying HTTP
     * connection during the handle method, we don't need to keep the HTTP connection open.
     *
     * @see com.amazonaws.http.HttpResponseHandler#needsConnectionLeftOpen()
     */
    public boolean needsConnectionLeftOpen() {
        return false;
    }

}
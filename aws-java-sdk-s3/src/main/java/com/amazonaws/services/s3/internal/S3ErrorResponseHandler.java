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
package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.util.IOUtils;

import com.amazonaws.util.XmlUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import static com.amazonaws.util.StringUtils.UTF8;

/**
 * Response handler for S3 error responses. S3 error responses are different
 * from other AWS error responses in a few ways. Most error responses will
 * contain an XML body, but not all (ex: error responses to HEAD requests will
 * not), so this error handler has to account for that. The actual XML error
 * response body is slightly different than other services like SimpleDB or EC2
 * and some information isn't explicitly represented in the XML error response
 * body (ex: error type/fault information) so it has to be inferred from other
 * parts of the error response.
 */
public class S3ErrorResponseHandler implements
        HttpResponseHandler<AmazonServiceException> {
    /** Shared logger for profiling information */
    private static final Log log = LogFactory
            .getLog(S3ErrorResponseHandler.class);

    private enum S3ErrorTags {
        Error, Message, Code, RequestId, HostId
    };

    @Override
    public AmazonServiceException handle(HttpResponse httpResponse)
            throws XMLStreamException {
        final AmazonServiceException exception = createException(httpResponse);
        exception.setHttpHeaders(httpResponse.getHeaders());
        return exception;
    }

    private AmazonServiceException createException(HttpResponse httpResponse) throws
                                                                              XMLStreamException {
        final InputStream is = httpResponse.getContent();
        String xmlContent = null;
        /*
         * We don't always get an error response body back from S3. When we send
         * a HEAD request, we don't receive a body, so we'll have to just return
         * what we can.
         */
        if (is == null
                || httpResponse.getRequest().getHttpMethod() == HttpMethodName.HEAD) {
            return createExceptionFromHeaders(httpResponse, null);
        }

        String content = null;
        try {
            content = IOUtils.toString(is);
        } catch (IOException ioe) {
            if (log.isDebugEnabled())
                log.debug("Failed in parsing the error response : ", ioe);
            return createExceptionFromHeaders(httpResponse, null);
        }

        XMLStreamReader reader
            = XmlUtils.getXmlInputFactory().createXMLStreamReader(new ByteArrayInputStream(content.getBytes(UTF8)));

        try {
            /*
             * target depth is to determine if the XML Error response from the
             * server has any element inside <Error> tag have child tags.
             * Parsing such tags is not supported now. target depth is
             * incremented for every start tag and decremented after every end
             * tag is encountered.
             */
            int targetDepth = 0;
            final AmazonS3ExceptionBuilder exceptionBuilder = new AmazonS3ExceptionBuilder();
            exceptionBuilder.setErrorResponseXml(content);
            exceptionBuilder.setStatusCode(httpResponse.getStatusCode());
            exceptionBuilder.setCloudFrontId(httpResponse.getHeaders().get(Headers.CLOUD_FRONT_ID));
            String bucketRegion = httpResponse.getHeader(Headers.S3_BUCKET_REGION);
            if (bucketRegion != null) {
                exceptionBuilder.addAdditionalDetail(Headers.S3_BUCKET_REGION, bucketRegion);
            }

            boolean hasErrorTagVisited = false;
            while (reader.hasNext()) {
                int event = reader.next();

                switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    targetDepth++;
                    String tagName = reader.getLocalName();
                    if (targetDepth == 1
                            && !S3ErrorTags.Error.toString().equals(tagName))
                        return createExceptionFromHeaders(httpResponse,
                                "Unable to parse error response. Error XML Not in proper format."
                                        + content);
                    if (S3ErrorTags.Error.toString().equals(tagName)) {
                        hasErrorTagVisited = true;
                    }
                    continue;
                case XMLStreamConstants.CHARACTERS:
                    xmlContent = reader.getText();
                    if (xmlContent != null)
                        xmlContent = xmlContent.trim();
                    continue;
                case XMLStreamConstants.END_ELEMENT:
                    tagName = reader.getLocalName();
                    targetDepth--;
                    if (!(hasErrorTagVisited) || targetDepth > 1) {
                        return createExceptionFromHeaders(httpResponse,
                                "Unable to parse error response. Error XML Not in proper format."
                                        + content);
                    }
                    if (S3ErrorTags.Message.toString().equals(tagName)) {
                        exceptionBuilder.setErrorMessage(xmlContent);
                    } else if (S3ErrorTags.Code.toString().equals(tagName)) {
                        exceptionBuilder.setErrorCode(xmlContent);
                    } else if (S3ErrorTags.RequestId.toString().equals(tagName)) {
                        exceptionBuilder.setRequestId(xmlContent);
                    } else if (S3ErrorTags.HostId.toString().equals(tagName)) {
                        exceptionBuilder.setExtendedRequestId(xmlContent);
                    } else {
                        exceptionBuilder.addAdditionalDetail(tagName, xmlContent);
                    }
                    continue;
                case XMLStreamConstants.END_DOCUMENT:
                    return exceptionBuilder.build();
                }
            }
        } catch (Exception e) {
            if (log.isDebugEnabled())
                log.debug("Failed in parsing the error response : " + content,
                        e);
        }
        return createExceptionFromHeaders(httpResponse, content);
    }

    private AmazonS3Exception createExceptionFromHeaders(
            HttpResponse errorResponse, String errorResponseXml) {
        final Map<String, String> headers = errorResponse.getHeaders();
        final int statusCode = errorResponse.getStatusCode();
        final AmazonS3ExceptionBuilder exceptionBuilder = new AmazonS3ExceptionBuilder();
        exceptionBuilder.setErrorMessage(errorResponse.getStatusText());
        exceptionBuilder.setErrorResponseXml(errorResponseXml);
        exceptionBuilder.setStatusCode(statusCode);
        exceptionBuilder
                .setExtendedRequestId(headers.get(Headers.EXTENDED_REQUEST_ID));
        exceptionBuilder.setRequestId(headers.get(Headers.REQUEST_ID));
        exceptionBuilder.setCloudFrontId(headers.get(Headers.CLOUD_FRONT_ID));
        exceptionBuilder
                .setErrorCode(statusCode + " " + errorResponse.getStatusText());
        exceptionBuilder.addAdditionalDetail(Headers.S3_BUCKET_REGION,
                errorResponse.getHeaders().get(Headers.S3_BUCKET_REGION));
        return exceptionBuilder.build();
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

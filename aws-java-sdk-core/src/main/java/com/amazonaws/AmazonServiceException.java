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
package com.amazonaws;

import com.amazonaws.util.StringUtils;

import java.util.Map;

/**
 * Extension of SdkClientException that represents an error response returned
 * by an Amazon web service. Receiving an exception of this type indicates that
 * the caller's request was correctly transmitted to the service, but for some
 * reason, the service was not able to process it, and returned an error
 * response instead.
 * <p>
 * AmazonServiceException provides callers several pieces of
 * information that can be used to obtain more information about the error and
 * why it occurred. In particular, the errorType field can be used to determine
 * if the caller's request was invalid, or the service encountered an error on
 * the server side while processing it.
 */
public class AmazonServiceException extends SdkClientException {
    private static final long serialVersionUID = 1L;

    /**
     * Indicates who is responsible (if known) for a failed request.
     *
     * <p>For example, if a client is using an invalid AWS access key,
     * the returned exception will indicate that there is an error in the
     * request the caller is sending. Retrying that same request will *not*
     * result in a successful response. The Client ErrorType indicates that
     * there is a problem in the request the user is sending (ex: incorrect
     * access keys, invalid parameter value, missing parameter, etc.), and that
     * the caller must take some action to correct the request before it should
     * be resent. Client errors are typically associated an HTTP error code in
     * the 4xx range.
     *
     * <p>The Service ErrorType indicates that although the request the
     * caller sent was valid, the service was unable to fulfill the request
     * because of problems on the service's side. These types of errors can be
     * retried by the caller since the caller's request was valid and the
     * problem occurred while processing the request on the service side.
     * Service errors will be accompanied by an HTTP error code in the 5xx
     * range.
     *
     * <p>Finally, if there isn't enough information to determine who's
     * fault the error response is, an Unknown ErrorType will be set.
     */
    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    /**
     * The unique AWS identifier for the service request the caller made. The
     * AWS request ID can uniquely identify the AWS request, and is used for
     * reporting an error to AWS support team.
     */
    private String requestId;

    /**
     * The AWS error code represented by this exception (ex:
     * InvalidParameterValue).
     */
    private String errorCode;

    /**
     * Indicates (if known) whether this exception was the fault of the caller
     * or the service.
     *
     * @see ErrorType
     */
    private ErrorType errorType = ErrorType.Unknown;

    /**
     * The error message as returned by the service.
     */
    private String errorMessage;

    /** The HTTP status code that was returned with this error */
    private int statusCode;

    /**
     * The name of the Amazon service that sent this error response.
     */
    private String serviceName;

    /**
     * All HTTP headers in the response for additional context and debugging.
     */
    private Map<String, String> httpHeaders;

    /**
     * The raw response payload.
     */
    private byte[] rawResponse;

    /**
     * Constructs a new AmazonServiceException with the specified message.
     *
     * @param errorMessage
     *            An error message describing what went wrong.
     */
    public AmazonServiceException(String errorMessage) {
        super((String)null);
        this.errorMessage = errorMessage;
    }

    /**
     * Constructs a new AmazonServiceException with the specified message and
     * exception indicating the root cause.
     *
     * @param errorMessage
     *            An error message describing what went wrong.
     * @param cause
     *            The root exception that caused this exception to be thrown.
     */
    public AmazonServiceException(String errorMessage, Exception cause) {
        super(null, cause);
        this.errorMessage = errorMessage;
    }

    /**
     * Sets the AWS requestId for this exception.
     *
     * @param requestId
     *            The unique identifier for the service request the caller made.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Returns the AWS request ID that uniquely identifies the service request
     * the caller made.
     *
     * @return The AWS request ID that uniquely identifies the service request
     *         the caller made.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the name of the service that sent this error response.
     *
     * @param serviceName
     *            The name of the service that sent this error response.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Returns the name of the service that sent this error response.
     *
     * @return The name of the service that sent this error response.
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the AWS error code represented by this exception.
     *
     * @param errorCode
     *            The AWS error code represented by this exception.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Returns the AWS error code represented by this exception.
     *
     * @return The AWS error code represented by this exception.
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the type of error represented by this exception (sender, receiver,
     * or unknown), indicating if this exception was the caller's fault, or the
     * service's fault.
     *
     * @param errorType
     *            The type of error represented by this exception (sender or
     *            receiver), indicating if this exception was the caller's fault
     *            or the service's fault.
     */
    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    /**
     * Indicates who is responsible for this exception (caller, service,
     * or unknown).
     *
     * @return A value indicating who is responsible for this exception (caller, service, or unknown).
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * @return the human-readable error message provided by the service
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the human-readable error message provided by the service.
     *
     * NOTE: errorMessage by default is set to the same as the message value
     * passed to the constructor of AmazonServiceException.
     *
     * @see AmazonServiceException#AmazonServiceException(String)
     * @see AmazonServiceException#AmazonServiceException(String, Exception))
     */
    public void setErrorMessage(String value) {
        errorMessage = value;
    }

    /**
     * Sets the HTTP status code that was returned with this service exception.
     *
     * @param statusCode
     *            The HTTP status code that was returned with this service
     *            exception.
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Returns the HTTP status code that was returned with this service
     * exception.
     *
     * @return The HTTP status code that was returned with this service
     *         exception.
     */
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        return getErrorMessage()
            + " (Service: " + getServiceName()
            + "; Status Code: " + getStatusCode()
            + "; Error Code: " + getErrorCode()
            + "; Request ID: " + getRequestId() + ")";
    }

    /**
     * Typically only useful for debugging purpose if for some reason the SDK cannot parse the HTTP
     * response from a service
     *
     * @return The raw content of the HTTP response as a String.
     */
    public String getRawResponseContent() {
        return rawResponse == null ? null : new String(rawResponse, StringUtils.UTF8);
    }

    /**
     * Sets the raw response content.
     */
    public void setRawResponseContent(String rawResponseContent) {
        this.rawResponse = rawResponseContent == null ? null : rawResponseContent.getBytes
                (StringUtils.UTF8);
    }

    /**
     * Returns the response payload as bytes.
     */
    public byte[] getRawResponse() {
        return rawResponse == null ? null : rawResponse.clone();
    }

    /**
     * Sets the raw response content.
     */
    public void setRawResponse(byte[] rawResponse) {
        this.rawResponse = rawResponse == null ? null : rawResponse.clone();
    }

    /**
     * @return A Map of HTTP headers associated with the error response.
     */
    public Map<String, String> getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * Sets the headers present in the error response.
     */
    public void setHttpHeaders(Map<String, String> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }
}

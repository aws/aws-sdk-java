/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.InputStream;

/**
 * Represents a sign-able request being sent to an Amazon Web Service, including the
 * parameters being sent as part of the request, the endpoint to which the
 * request should be sent, etc.
 * <p>
 * This class is only intended for internal use inside the AWS client libraries.
 * Callers shouldn't ever interact directly with objects of this class.
 *
 * @param <T>
 *            The type of original, user facing request represented by this
 *            request.
 */
public interface SignableRequest<T> extends ImmutableRequest<T> {

    /**
     * Sets the specified header for this request.
     *
     * @param name
     *            The name of the header to set.
     * @param value
     *            The header's value.
     */
    void addHeader(String name, String value);

    /**
     * Adds the specified request parameter to this request.
     *
     * @param name
     *            The name of the request parameter.
     * @param value
     *            The value of the request parameter.
     */
    void addParameter(String name, String value);

    /**
     * Sets the optional stream containing the payload data to include for this
     * request. This is used, for example, for S3 chunk encoding.
     *
     * @param content
     *            The optional stream containing the payload data to include for
     *            this request.
     */
    void setContent(InputStream content);
}

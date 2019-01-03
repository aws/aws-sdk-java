/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * An error indicating that a particular service limit was exceeded. You can increase some service limits by contacting
 * AWS Support.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLimitExceededException extends com.amazonaws.services.fsx.model.AmazonFSxException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Enumeration of the service limit that was exceeded.
     * </p>
     */
    private String limit;

    /**
     * Constructs a new ServiceLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceLimitExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * Enumeration of the service limit that was exceeded.
     * </p>
     * 
     * @param limit
     *        Enumeration of the service limit that was exceeded.
     * @see ServiceLimit
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Limit")
    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Enumeration of the service limit that was exceeded.
     * </p>
     * 
     * @return Enumeration of the service limit that was exceeded.
     * @see ServiceLimit
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Limit")
    public String getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Enumeration of the service limit that was exceeded.
     * </p>
     * 
     * @param limit
     *        Enumeration of the service limit that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLimit
     */

    public ServiceLimitExceededException withLimit(String limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Enumeration of the service limit that was exceeded.
     * </p>
     * 
     * @param limit
     *        Enumeration of the service limit that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLimit
     */

    public ServiceLimitExceededException withLimit(ServiceLimit limit) {
        this.limit = limit.toString();
        return this;
    }

}

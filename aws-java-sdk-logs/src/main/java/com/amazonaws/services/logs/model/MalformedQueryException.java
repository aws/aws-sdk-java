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
package com.amazonaws.services.logs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The query string is not valid. Details about this error are displayed in a <code>QueryCompileError</code> object. For
 * more information, see .
 * </p>
 * <p>
 * For more information about valid query syntax, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights Query
 * Syntax</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MalformedQueryException extends com.amazonaws.services.logs.model.AWSLogsException {
    private static final long serialVersionUID = 1L;

    private QueryCompileError queryCompileError;

    /**
     * Constructs a new MalformedQueryException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public MalformedQueryException(String message) {
        super(message);
    }

    /**
     * @param queryCompileError
     */

    @com.fasterxml.jackson.annotation.JsonProperty("queryCompileError")
    public void setQueryCompileError(QueryCompileError queryCompileError) {
        this.queryCompileError = queryCompileError;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("queryCompileError")
    public QueryCompileError getQueryCompileError() {
        return this.queryCompileError;
    }

    /**
     * @param queryCompileError
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MalformedQueryException withQueryCompileError(QueryCompileError queryCompileError) {
        setQueryCompileError(queryCompileError);
        return this;
    }

}

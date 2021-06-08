/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftdataapi.model;

import javax.annotation.Generated;

/**
 * <p>
 * The SQL statement encountered an environmental error while running.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementException extends com.amazonaws.services.redshiftdataapi.model.AWSRedshiftDataAPIException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Statement identifier of the exception.
     * </p>
     */
    private String statementId;

    /**
     * Constructs a new ExecuteStatementException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ExecuteStatementException(String message) {
        super(message);
    }

    /**
     * <p>
     * Statement identifier of the exception.
     * </p>
     * 
     * @param statementId
     *        Statement identifier of the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("StatementId")
    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * Statement identifier of the exception.
     * </p>
     * 
     * @return Statement identifier of the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("StatementId")
    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * Statement identifier of the exception.
     * </p>
     * 
     * @param statementId
     *        Statement identifier of the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementException withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

}

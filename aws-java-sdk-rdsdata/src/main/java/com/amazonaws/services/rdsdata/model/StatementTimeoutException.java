/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model;

import javax.annotation.Generated;

/**
 * <p>
 * The execution of the SQL statement timed out.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatementTimeoutException extends com.amazonaws.services.rdsdata.model.AWSRDSDataException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The database connection ID that executed the SQL statement.
     * </p>
     */
    private Long dbConnectionId;

    /**
     * Constructs a new StatementTimeoutException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public StatementTimeoutException(String message) {
        super(message);
    }

    /**
     * <p>
     * The database connection ID that executed the SQL statement.
     * </p>
     * 
     * @param dbConnectionId
     *        The database connection ID that executed the SQL statement.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("dbConnectionId")
    public void setDbConnectionId(Long dbConnectionId) {
        this.dbConnectionId = dbConnectionId;
    }

    /**
     * <p>
     * The database connection ID that executed the SQL statement.
     * </p>
     * 
     * @return The database connection ID that executed the SQL statement.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("dbConnectionId")
    public Long getDbConnectionId() {
        return this.dbConnectionId;
    }

    /**
     * <p>
     * The database connection ID that executed the SQL statement.
     * </p>
     * 
     * @param dbConnectionId
     *        The database connection ID that executed the SQL statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatementTimeoutException withDbConnectionId(Long dbConnectionId) {
        setDbConnectionId(dbConnectionId);
        return this;
    }

}

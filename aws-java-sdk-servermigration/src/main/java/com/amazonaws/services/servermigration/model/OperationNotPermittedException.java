/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model;

/**
 * The specified operation is not allowed. This error can occur for a number of reasons; for example, you might be
 * trying to start a Replication Run before seed Replication Run.
 */
public class OperationNotPermittedException extends com.amazonaws.services.servermigration.model.AWSServerMigrationException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new OperationNotPermittedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public OperationNotPermittedException(String message) {
        super(message);
    }

}

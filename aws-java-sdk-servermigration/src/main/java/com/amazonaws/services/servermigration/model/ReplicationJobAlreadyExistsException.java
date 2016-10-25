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
 * An active Replication Job already exists for the specified server.
 */
public class ReplicationJobAlreadyExistsException extends com.amazonaws.services.servermigration.model.AWSServerMigrationException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ReplicationJobAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ReplicationJobAlreadyExistsException(String message) {
        super(message);
    }

}

/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

/**
 * Generic exception for problems occuring when mapping DynamoDB items to Java
 * objects or vice versa. Excludes service exceptions.
 */
public class DynamoDBMappingException extends RuntimeException {

    private static final long serialVersionUID = -4883173289978517967L;

    public DynamoDBMappingException() {
        super();
    }

    public DynamoDBMappingException(String message, Throwable cause) {
        super(message, cause);
    }

    public DynamoDBMappingException(String message) {
        super(message);
    }

    public DynamoDBMappingException(Throwable cause) {
        super(cause);
    }
    
}

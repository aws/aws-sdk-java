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
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * An existing data repository task is currently executing on the file system. Wait until the existing task has
 * completed, then create the new task.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataRepositoryTaskExecutingException extends com.amazonaws.services.fsx.model.AmazonFSxException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DataRepositoryTaskExecutingException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DataRepositoryTaskExecutingException(String message) {
        super(message);
    }

}

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
package com.amazonaws.services.codecommit.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified folder does not exist. Either the folder name is not correct, or you did not provide the full path to
 * the folder.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FolderDoesNotExistException extends com.amazonaws.services.codecommit.model.AWSCodeCommitException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new FolderDoesNotExistException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public FolderDoesNotExistException(String message) {
        super(message);
    }

}

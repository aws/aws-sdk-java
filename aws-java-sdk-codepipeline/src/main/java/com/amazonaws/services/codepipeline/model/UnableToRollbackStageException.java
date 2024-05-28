/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import javax.annotation.Generated;

/**
 * <p>
 * Unable to roll back the stage. The cause might be if the pipeline version has changed since the target pipeline
 * execution was deployed, the stage is currently running, or an incorrect target pipeline execution ID was provided.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnableToRollbackStageException extends com.amazonaws.services.codepipeline.model.AWSCodePipelineException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new UnableToRollbackStageException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnableToRollbackStageException(String message) {
        super(message);
    }

}

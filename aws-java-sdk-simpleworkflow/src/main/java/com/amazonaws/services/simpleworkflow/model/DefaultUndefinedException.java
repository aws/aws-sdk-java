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
package com.amazonaws.services.simpleworkflow.model;

import javax.annotation.Generated;

/**
 * <p>
 * The <code>StartWorkflowExecution</code> API action was called without the required parameters set.
 * </p>
 * <p>
 * Some workflow execution parameters, such as the decision <code>taskList</code>, must be set to start the execution.
 * However, these parameters might have been set as defaults when the workflow type was registered. In this case, you
 * can omit these parameters from the <code>StartWorkflowExecution</code> call and Amazon SWF uses the values defined in
 * the workflow type.
 * </p>
 * <note>
 * <p>
 * If these parameters aren't set and no default parameters were defined in the workflow type, this error is displayed.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultUndefinedException extends com.amazonaws.services.simpleworkflow.model.AmazonSimpleWorkflowException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DefaultUndefinedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DefaultUndefinedException(String message) {
        super(message);
    }

}

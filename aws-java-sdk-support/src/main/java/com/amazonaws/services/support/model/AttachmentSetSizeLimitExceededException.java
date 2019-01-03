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
package com.amazonaws.services.support.model;

import javax.annotation.Generated;

/**
 * <p>
 * A limit for the size of an attachment set has been exceeded. The limits are 3 attachments and 5 MB per attachment.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachmentSetSizeLimitExceededException extends com.amazonaws.services.support.model.AWSSupportException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new AttachmentSetSizeLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AttachmentSetSizeLimitExceededException(String message) {
        super(message);
    }

}

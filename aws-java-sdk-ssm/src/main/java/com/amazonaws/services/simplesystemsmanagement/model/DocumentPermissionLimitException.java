/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The document can't be shared with more Amazon Web Services user accounts. You can specify a maximum of 20 accounts
 * per API operation to share a private document.
 * </p>
 * <p>
 * By default, you can share a private document with a maximum of 1,000 accounts and publicly share up to five
 * documents.
 * </p>
 * <p>
 * If you need to increase the quota for privately or publicly shared Systems Manager documents, contact Amazon Web
 * Services Support.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentPermissionLimitException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DocumentPermissionLimitException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DocumentPermissionLimitException(String message) {
        super(message);
    }

}

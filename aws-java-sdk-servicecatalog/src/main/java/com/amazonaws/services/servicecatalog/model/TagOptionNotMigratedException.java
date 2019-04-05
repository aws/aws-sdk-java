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
package com.amazonaws.services.servicecatalog.model;

import javax.annotation.Generated;

/**
 * <p>
 * An operation requiring TagOptions failed because the TagOptions migration process has not been performed for this
 * account. Please use the AWS console to perform the migration process before retrying the operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagOptionNotMigratedException extends com.amazonaws.services.servicecatalog.model.AWSServiceCatalogException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TagOptionNotMigratedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TagOptionNotMigratedException(String message) {
        super(message);
    }

}

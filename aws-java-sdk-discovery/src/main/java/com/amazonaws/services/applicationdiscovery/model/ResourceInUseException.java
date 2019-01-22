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
package com.amazonaws.services.applicationdiscovery.model;

import javax.annotation.Generated;

/**
 * <p>
 * This issue occurs when the same <code>clientRequestToken</code> is used with the <code>StartImportTask</code> action,
 * but with different parameters. For example, you use the same request token but have two different import URLs, you
 * can encounter this issue. If the import tasks are meant to be different, use a different
 * <code>clientRequestToken</code>, and try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceInUseException extends com.amazonaws.services.applicationdiscovery.model.AWSApplicationDiscoveryException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceInUseException(String message) {
        super(message);
    }

}

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
package com.amazonaws.services.config.model;

import javax.annotation.Generated;

/**
 * <p>
 * The Config rule in the request is invalid. Verify that the rule is an organization Config Custom Policy rule, that
 * the rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NoSuchOrganizationConfigRuleException extends com.amazonaws.services.config.model.AmazonConfigException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new NoSuchOrganizationConfigRuleException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NoSuchOrganizationConfigRuleException(String message) {
        super(message);
    }

}

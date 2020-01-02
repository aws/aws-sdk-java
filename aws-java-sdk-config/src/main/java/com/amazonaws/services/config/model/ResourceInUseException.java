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
package com.amazonaws.services.config.model;

import javax.annotation.Generated;

/**
 * <p>
 * You see this exception in the following cases:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
 * </p>
 * </li>
 * <li>
 * <p>
 * For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
 * </p>
 * </li>
 * <li>
 * <p>
 * For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this rule. Delete
 * the remediation action associated with the rule before deleting the rule and try your request again later.
 * </p>
 * </li>
 * <li>
 * <p>
 * For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again later.
 * </p>
 * </li>
 * <li>
 * <p>
 * For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request again later.
 * </p>
 * </li>
 * <li>
 * <p>
 * For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and deletion is in
 * progress. Try your request again later.
 * </p>
 * </li>
 * <li>
 * <p>
 * For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your request again
 * later.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceInUseException extends com.amazonaws.services.config.model.AmazonConfigException {
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

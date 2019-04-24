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
package com.amazonaws.services.route53.model;

import javax.annotation.Generated;

/**
 * <p>
 * The cause of this error depends on whether you're trying to create a public or a private hosted zone:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Public hosted zone:</b> Two hosted zones that have the same name or that have a parent/child relationship
 * (example.com and test.example.com) can't have any common name servers. You tried to create a hosted zone that has the
 * same name as an existing hosted zone or that's the parent or child of an existing hosted zone, and you specified a
 * delegation set that shares one or more name servers with the existing hosted zone. For more information, see <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
 * >CreateReusableDelegationSet</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Private hosted zone:</b> You specified an Amazon VPC that you're already using for another hosted zone, and the
 * domain that you specified for one of the hosted zones is a subdomain of the domain that you specified for the other
 * hosted zone. For example, you can't use the same Amazon VPC for the hosted zones for example.com and
 * test.example.com.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictingDomainExistsException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConflictingDomainExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictingDomainExistsException(String message) {
        super(message);
    }

}

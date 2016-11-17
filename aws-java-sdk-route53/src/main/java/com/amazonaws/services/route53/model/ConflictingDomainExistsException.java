/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * You specified an Amazon VPC that you're already using for another hosted zone, and the domain that you specified for
 * one of the hosted zones is a subdomain of the domain that you specified for the other hosted zone. For example, you
 * can't use the same Amazon VPC for the hosted zones for example.com and test.example.com.
 * </p>
 */
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

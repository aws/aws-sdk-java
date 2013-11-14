/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request would exceed the allowed number of event subscriptions for this account. For information about increasing your quota, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html"> Limits in Amazon Redshift </a> in the <i>Amazon Redshift
 * Management Guide</i> .
 * 
 * </p>
 */        
public class EventSubscriptionQuotaExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new EventSubscriptionQuotaExceededException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public EventSubscriptionQuotaExceededException(String message) {
        super(message);
    }
    
}
    
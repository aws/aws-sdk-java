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
package com.amazonaws.services.kms.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because the specified AWS CloudHSM cluster has a different cluster certificate than the
 * original cluster. You cannot use the operation to specify an unrelated cluster.
 * </p>
 * <p>
 * Specify a cluster that shares a backup history with the original cluster. This includes clusters that were created
 * from a backup of the current cluster, and clusters that were created from the same backup that produced the current
 * cluster.
 * </p>
 * <p>
 * Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of a cluster,
 * use the <a
 * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
 * operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudHsmClusterNotRelatedException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CloudHsmClusterNotRelatedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CloudHsmClusterNotRelatedException(String message) {
        super(message);
    }

}

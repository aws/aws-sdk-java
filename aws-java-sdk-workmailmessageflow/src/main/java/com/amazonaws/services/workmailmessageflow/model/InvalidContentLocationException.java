/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmailmessageflow.model;

import javax.annotation.Generated;

/**
 * <p>
 * WorkMail could not access the updated email content. Possible reasons:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You made the request in a region other than your S3 bucket region.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-owner-condition.html">S3 bucket owner</a> is not
 * the same as the calling AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * You have an incomplete or missing S3 bucket policy. For more information about policies, see <a
 * href="https://docs.aws.amazon.com/workmail/latest/adminguide/update-with-lambda.html"> Updating message content with
 * AWS Lambda </a> in the <i>WorkMail Administrator Guide</i>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidContentLocationException extends com.amazonaws.services.workmailmessageflow.model.AmazonWorkMailMessageFlowException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidContentLocationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidContentLocationException(String message) {
        super(message);
    }

}

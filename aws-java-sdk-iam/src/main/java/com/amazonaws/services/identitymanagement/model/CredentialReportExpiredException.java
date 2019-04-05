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
package com.amazonaws.services.identitymanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because the most recent credential report has expired. To generate a new credential report,
 * use <a>GenerateCredentialReport</a>. For more information about credential report expiration, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting Credential Reports</a> in the
 * <i>IAM User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CredentialReportExpiredException extends com.amazonaws.services.identitymanagement.model.AmazonIdentityManagementException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CredentialReportExpiredException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CredentialReportExpiredException(String message) {
        super(message);
    }

}

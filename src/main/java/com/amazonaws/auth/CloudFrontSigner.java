/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.util.DateUtils;

/**
 * Implementation of AbstractAWSSigner for Amazon CloudFront's authentication
 * scheme.
 */
public class CloudFrontSigner extends AbstractAWSSigner {

    /** Shared log for signing debug output */
    private static final Log log = LogFactory.getLog(CloudFrontSigner.class);

    @Override
    public void sign(Request<?> request, AWSCredentials credentials) throws AmazonClientException {
        AWSCredentials sanitizedCredentials = sanitizeCredentials(credentials);
        if ( sanitizedCredentials instanceof AWSSessionCredentials ) {
            addSessionCredentials(request, (AWSSessionCredentials) sanitizedCredentials);
        }

        Date signDate = getSignatureDate(getTimeOffset(request));
        String date = new DateUtils().formatRfc822Date(signDate);
        request.addHeader("Date", date);
        String canonicalString = date;
        log.debug("Calculated string to sign:\n\"" + canonicalString + "\"");

        String signature = super.signAndBase64Encode(canonicalString, sanitizedCredentials.getAWSSecretKey(), SigningAlgorithm.HmacSHA1);
        request.addHeader("Authorization", "AWS " + sanitizedCredentials.getAWSAccessKeyId() + ":" + signature);
    }

    @Override
    protected void addSessionCredentials(Request<?> request, AWSSessionCredentials credentials) {
        request.addHeader("x-amz-security-token", credentials.getSessionToken());
    }

}

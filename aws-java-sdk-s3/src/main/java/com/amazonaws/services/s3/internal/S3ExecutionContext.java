/*
 * Copyright 2014-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import java.net.URI;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3URI;
import com.amazonaws.util.AwsHostNameUtils;

public class S3ExecutionContext extends ExecutionContext {

    private static final Log log = LogFactory.getLog(AmazonS3Client.class);

    private Signer signer;

    public S3ExecutionContext(List<RequestHandler2> requestHandler2s,
            boolean isMetricEnabled, AmazonWebServiceClient awsClient) {
        super(requestHandler2s, isMetricEnabled, awsClient);
    }

    @Override
    public void setSigner(Signer signer) {
        this.signer = signer;
    }

    /**
     * Returns the signer instance that should be used to sign the request sent
     * to the given URL. This method will be called before either the first
     * attempt of an S3 request, or a retry attempt for 307 redirect. In the
     * second case, the URL passed here will be the full redirect location which
     * includes not only the host component, but also the path, query
     * parameters, etc.
     */
    @Override
    public Signer getSignerByURI(URI uri) {
        // Don't modify the signer region, if the client is configured with region override
        AmazonWebServiceClient awsClient = getAwsClient();
        if (awsClient != null &&
            awsClient.getSignerRegionOverride() != null) {
            return signer;
        }

        // Otherwise, parse region name from the host component of the URL and
        // assign it to the signer
        if (signer instanceof RegionAwareSigner) {
            RegionAwareSigner regionSigner = (RegionAwareSigner)signer;

            try {
                regionSigner.setRegionName(AwsHostNameUtils.parseRegionName(
                        uri.getHost(), "s3"));

            } catch (RuntimeException e) {
                log.warn("Failed to parse the endpoint " + uri +
                        ", and skip re-assigning the signer region", e);
            }
        }

        return signer;
    }
}

/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.net.URI;
import java.net.URISyntaxException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Protocol;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.services.ec2.model.CopySnapshotRequest;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.util.StringUtils;

/**
 * RequestHandler that generates a pre-signed URL for copying encrypted
 * snapshots
 */
public class GeneratePreSignUrlRequestHandler extends CredentialsRequestHandler {

    @Override
    public void beforeRequest(Request<?> request) {

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        if (originalRequest instanceof CopySnapshotRequest) {

            CopySnapshotRequest originalCopySnapshotRequest = (CopySnapshotRequest) originalRequest;

            // Return if presigned url is already specified by the user.
            if (originalCopySnapshotRequest.getPresignedUrl() != null) return;

            String serviceName = "ec2";

            // The source regions where the snapshot currently resides.
            String sourceRegion = originalCopySnapshotRequest.getSourceRegion();
            String sourceSnapshotId = originalCopySnapshotRequest
                    .getSourceSnapshotId();

            /*
             * The region where the snapshot has to be copied from the source.
             * The original copy snap shot request will have the end point set
             * as the destination region in the client before calling this
             * request.
             */

            URI endPointDestination = request.getEndpoint();
            String destinationRegion = originalCopySnapshotRequest
                    .getDestinationRegion() != null ? originalCopySnapshotRequest
                    .getDestinationRegion() : AwsHostNameUtils
                    .parseRegionName(endPointDestination.getHost(), serviceName);

            URI endPointSource = createEndpoint(sourceRegion, serviceName);

            Request<CopySnapshotRequest> requestForPresigning = generateRequestForPresigning(
                    sourceSnapshotId, sourceRegion, destinationRegion);

            requestForPresigning.setEndpoint(endPointSource);
            requestForPresigning.setHttpMethod(HttpMethodName.GET);

            AWS4Signer signer = new AWS4Signer();
            signer.setServiceName(serviceName);

            signer.presignRequest(requestForPresigning, awsCredentials, null);

            originalCopySnapshotRequest
                    .setPresignedUrl(generateUrl(requestForPresigning));
            originalCopySnapshotRequest.setDestinationRegion(destinationRegion);
            request.addParameter("DestinationRegion", StringUtils
                    .fromString(originalCopySnapshotRequest
                            .getDestinationRegion()));
            request.addParameter("PresignedUrl", StringUtils
                    .fromString(originalCopySnapshotRequest.getPresignedUrl()));
        }

    }

    /**
     * Generates a Request object for the pre-signed URL.
     */
    private Request<CopySnapshotRequest> generateRequestForPresigning(
            String sourceSnapshotId, String sourceRegion,
            String destinationRegion) {

        CopySnapshotRequest copySnapshotRequest = new CopySnapshotRequest()
                .withSourceSnapshotId(sourceSnapshotId)
                .withSourceRegion(sourceRegion)
                .withDestinationRegion(destinationRegion);

        return new CopySnapshotRequestMarshaller()
                .marshall(copySnapshotRequest);

    }

    private String generateUrl(Request<?> request) {

        URI endpoint = request.getEndpoint();
        String uri = SdkHttpUtils.appendUri(endpoint.toString(),
                request.getResourcePath(), true);
        String encodedParams = SdkHttpUtils.encodeParameters(request);

        if (encodedParams != null) {
            uri += "?" + encodedParams;
        }

        return uri;

    }

    private URI createEndpoint(String regionName, String serviceName) {

        final Region region = RegionUtils.getRegion(regionName);

        if (region == null) {
            throw new AmazonClientException("{" + serviceName + ", " + regionName + "} was not "
                    + "found in region metadata. Update to latest version of SDK and try again.");
        }

        return toURI(region.getServiceEndpoint(serviceName));
    }

    /** Returns the endpoint as a URI. */
    private URI toURI(String endpoint) throws IllegalArgumentException {

        if (endpoint.contains("://") == false) {
            endpoint = Protocol.HTTPS + "://" + endpoint;
        }

        try {
            return new URI(endpoint);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {
    }

    @Override
    public void afterError(Request<?> request, Response<?> response, Exception e) {
    }
}

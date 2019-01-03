/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Protocol;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.SdkHttpUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/**
 * Abstract pre-sign handler that follows the pre-signing scheme outlined in the 'RDS Presigned URL for Cross-Region Copying' SEP.
 *
 * @param <T> The request type.
 */
abstract class PresignRequestHandler<T extends AmazonWebServiceRequest> extends RequestHandler2 {
    private static final String SERVICE_NAME = "rds";
    private static final String PARAM_SOURCE_REGION = "SourceRegion";
    private static final String PARAM_DESTINATION_REGION = "DestinationRegion";
    private static final String PARAM_PRESIGNED_URL = "PreSignedUrl";

    protected interface PresignableRequest {
        void setPreSignedUrl(String preSignedUrl);

        String getPreSignedUrl();

        String getSourceRegion();

        Request<?> marshall();
    }

    private final Class<T> requestClassToPreSign;

    protected PresignRequestHandler(Class<T> requestClassToPreSign) {
        this.requestClassToPreSign = requestClassToPreSign;
    }

    @Override
    public void beforeRequest(Request<?> request) {
        if (!requestClassToPreSign.isInstance(request.getOriginalRequest())) return;

        if (request.getParameters().containsKey(PARAM_PRESIGNED_URL)) return;

        PresignableRequest presignableRequest = adaptRequest(requestClassToPreSign.cast(
                request.getOriginalRequest()));

        String sourceRegion = presignableRequest.getSourceRegion();
        if (sourceRegion == null) return;

        String destinationRegion = AwsHostNameUtils.parseRegion(request.getEndpoint().getHost(),
                SERVICE_NAME);

        Request<?> requestToPresign = presignableRequest.marshall();
        requestToPresign.getParameters().remove(PARAM_SOURCE_REGION);
        requestToPresign.getParameters().put(PARAM_DESTINATION_REGION, Arrays.asList(destinationRegion));
        requestToPresign.setEndpoint(createEndpoint(sourceRegion, SERVICE_NAME));
        requestToPresign.setHttpMethod(HttpMethodName.GET);

        AWSCredentials credentials = request.getHandlerContext(HandlerContextKey.AWS_CREDENTIALS);

        requestToPresign = presignRequest(requestToPresign, credentials, sourceRegion);

        final String presignedUrl = generateUrl(requestToPresign);

        presignableRequest.setPreSignedUrl(presignedUrl);

        request.addParameter(PARAM_PRESIGNED_URL, presignedUrl);
        // Remove the unmodeled params to stop them getting onto the wire
        request.getParameters().remove(PARAM_SOURCE_REGION);
    }

    protected abstract PresignableRequest adaptRequest(T originalRequest);

    private Request<?> presignRequest(Request<?> request, AWSCredentials credentials, String signingRegion) {
        AWS4Signer signer = createNewSignerWithRegion(signingRegion);
        signer.presignRequest(request, credentials, null);
        return request;
    }

    private AWS4Signer createNewSignerWithRegion(String signingRegion) {
        AWS4Signer signer = new AWS4Signer(true);
        signer.setRegionName(signingRegion);
        signer.setServiceName(SERVICE_NAME);
        return signer;
    }

    private URI createEndpoint(String regionName, String serviceName) {
        final Region region = RegionUtils.getRegion(regionName);

        if (region == null) {
            throw new AmazonClientException("{" + serviceName + ", " + regionName + "} was not "
                    + "found in region metadata. Update to latest version of SDK and try again.");
        }

        return toURI(region.getServiceEndpoint(serviceName));
    }

    private String generateUrl(Request<?> request) {
        URI endpoint = request.getEndpoint();
        String uri = SdkHttpUtils.appendUri(endpoint.toString(),
                request.getResourcePath(), true);
        String encodedParams = SdkHttpUtils.encodeParameters(request);

        if (encodedParams != null && !encodedParams.isEmpty()) {
            uri += "?" + encodedParams;
        }

        return uri;

    }

    /** Returns the endpoint as a URI. */
    private static URI toURI(String endpoint) throws IllegalArgumentException {
        if (!endpoint.contains("://")) {
            endpoint = Protocol.HTTPS + "://" + endpoint;
        }

        try {
            return new URI(endpoint);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

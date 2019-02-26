/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.message;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.regions.DefaultAwsRegionProviderChain;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Unmarshalls an SNS message and validates it using the SNS public certificate.
 */
public class SnsMessageManager {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * HTTP client to download certificate from and visit subscription confirmation URLs.
     */
    private final HttpClient client = HttpClientBuilder.create().build();

    /**
     * Verifies the signature of the message.
     */
    private final SignatureVerifier signatureVerifier;

    /**
     * Unmarshalls message JSON into Java POJOs.
     */
    private final SnsMessageUnmarshaller messageUnmarshaller;

    /**
     * Expected endpoint for messages being published.
     */
    private final String endpoint;

    /**
     * Creates an {@link SnsMessageManager} using the AWS region obtained from the environment. See
     * <a href="http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html">Region Selection</a>
     * for more information.
     */
    public SnsMessageManager() {
        this(new DefaultAwsRegionProviderChain().getRegion());
    }

    /**
     * Creates an {@link SnsMessageManager} pinned to the given region. This handler will throw an exception if it
     * recieves a message from another region. If you must handle messages from multiple regions then you should
     * maintain a cache of region to {@link SnsMessageManager} instances.
     *
     * @param region Region to pin handler to.
     */
    public SnsMessageManager(String region) {
        this.endpoint = RegionUtils.getRegion(region).getServiceEndpoint(AmazonSNS.ENDPOINT_PREFIX);
        this.signatureVerifier = new SignatureVerifier(client, endpoint, resolveCertCommonName(region));
        this.messageUnmarshaller = new SnsMessageUnmarshaller(client);
    }

    @SdkTestInternalApi
    SnsMessageManager(String region, SignatureVerifier signatureVerifier) {
        this.endpoint = RegionUtils.getRegion(region).getServiceEndpoint(AmazonSNS.ENDPOINT_PREFIX);
        this.signatureVerifier = signatureVerifier;
        this.messageUnmarshaller = new SnsMessageUnmarshaller(client);
    }

    /**
     * Unmarshalls a message into a subclass of {@link SnsMessage}. This will automatically validate the authenticity of the
     * mesage to ensure it was sent by SNS. If the validity of the message cannot be verified an exception will be thrown.
     *
     * @param messageBody Input stream containing message JSON.
     * @return Unmarshalled message object.
     */
    public SnsMessage parseMessage(InputStream messageBody) {
        JsonNode messageJson = toJson(messageBody);
        signatureVerifier.verifySignature(messageJson);
        return messageUnmarshaller.unmarshall(messageJson);
    }

    /**
     * Unmarshalls a message and delivers it to the given handler.
     *
     * @param messageBody Input stream containing message JSON.
     * @param handler Handler to process message.
     */
    public void handleMessage(InputStream messageBody, SnsMessageHandler handler) {
        parseMessage(messageBody).handle(handler);
    }

    private JsonNode toJson(InputStream messageBody) {
        try {
            return MAPPER.readTree(messageBody);
        } catch (IOException e) {
            throw new SdkClientException("Could not parse message as JSON.", e);
        }
    }

    //TODO SNS team will use a consistent pattern for certificate naming. Then remove the special handling based on region
    private String resolveCertCommonName(String region) {
        if (Regions.CN_NORTH_1.getName().equals(region)) {
            return "sns-cn-north-1.amazonaws.com.cn";
        }

        if (Regions.CN_NORTHWEST_1.getName().equals(region)) {
            return "sns-cn-northwest-1.amazonaws.com.cn";
        }

        if (Regions.GovCloud.getName().equals(region)) {
            return "sns-us-gov-west-1.amazonaws.com";
        }

        return "sns." + RegionUtils.getRegion(region).getDomain();
    }
}

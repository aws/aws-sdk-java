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
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.apache.utils.ApacheUtils;
import com.amazonaws.services.sns.model.ConfirmSubscriptionResult;
import com.amazonaws.services.sns.model.transform.ConfirmSubscriptionResultStaxUnmarshaller;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

@SdkInternalApi
final class Utils {

    private Utils() {
    }

    /**
     * Helper method to create a {@link URL} without dealing with a checked exception.
     *
     * @param url String URL.
     * @return {@link URL} object.
     */
    public static URL createUrl(String url) {
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            throw new SdkClientException("Could not create URL: " + url, e);
        }
    }

    /**
     * Confirms a subscription by visiting the provided URL.
     *
     * @param httpClient Client to use to visit URL.
     * @param subscribeUrl Confirmation URL.
     * @return Result of subscription confirmation.
     */
    static ConfirmSubscriptionResult confirmSubscription(HttpClient httpClient, String subscribeUrl) {
        try {
            HttpGet request = new HttpGet(subscribeUrl);
            HttpResponse response = httpClient.execute(request);
            if (ApacheUtils.isRequestSuccessful(response)) {
                return new StaxResponseHandler<ConfirmSubscriptionResult>(ConfirmSubscriptionResultStaxUnmarshaller.getInstance())
                    .handle(ApacheUtils.createResponse(null, request, response, null)).getResult();
            } else {
                throw new HttpException("Could not confirm subscription", response);
            }
        } catch (Exception e) {
            throw new SdkClientException(e);
        }
    }
}

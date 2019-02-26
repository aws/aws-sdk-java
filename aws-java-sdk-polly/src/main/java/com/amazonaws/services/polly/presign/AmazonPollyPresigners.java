/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.polly.presign;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.SdkClock;
import com.amazonaws.auth.presign.PresignerFacade;
import com.amazonaws.auth.presign.PresignerParams;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.polly.AmazonPolly;
import com.amazonaws.services.polly.model.SynthesizeSpeechRequest;
import java.net.URI;
import java.net.URL;
import java.util.Date;
import org.joda.time.DateTime;

/**
 * Presigning extensions methods for {@link AmazonPolly}.
 */
public final class AmazonPollyPresigners {

    private static final int SYNTHESIZE_SPEECH_DEFAULT_EXPIRATION_MINUTES = 15;

    private final URI endpoint;
    private final PresignerFacade presignerFacade;
    private final SdkClock clock;

    @SdkInternalApi
    public AmazonPollyPresigners(PresignerParams presignerParams) {
        this.endpoint = presignerParams.endpoint();
        this.presignerFacade = new PresignerFacade(presignerParams);
        this.clock = presignerParams.clock();
    }

    /**
     * Presign a {@link SynthesizeSpeechRequest} to be vended to consumers. The expiration time of the presigned URL is {@value
     * #SYNTHESIZE_SPEECH_DEFAULT_EXPIRATION_MINUTES} from generation time.
     */
    public URL getPresignedSynthesizeSpeechUrl(SynthesizeSpeechPresignRequest synthesizeSpeechPresignRequest) {
        Request<?> request = newRequest(synthesizeSpeechPresignRequest.getSigningCredentials());
        request.setEndpoint(endpoint);
        request.setResourcePath("/v1/speech");
        request.setHttpMethod(HttpMethodName.GET);
        marshallIntoRequest(synthesizeSpeechPresignRequest, request);
        Date expirationDate = synthesizeSpeechPresignRequest.getExpirationDate() == null ?
                getDefaultExpirationDate() : synthesizeSpeechPresignRequest.getExpirationDate();
        return presignerFacade.presign(request, expirationDate);
    }

    private void marshallIntoRequest(SynthesizeSpeechPresignRequest synthesizeSpeechRequest, Request<?> request) {
        if (synthesizeSpeechRequest.getText() != null) {
            request.addParameter("Text", synthesizeSpeechRequest.getText());
        }

        if (synthesizeSpeechRequest.getTextType() != null) {
            request.addParameter("TextType", synthesizeSpeechRequest.getTextType());
        }

        if (synthesizeSpeechRequest.getVoiceId() != null) {
            request.addParameter("VoiceId", synthesizeSpeechRequest.getVoiceId());
        }

        if (synthesizeSpeechRequest.getSampleRate() != null) {
            request.addParameter("SampleRate", synthesizeSpeechRequest.getSampleRate());
        }

        if (synthesizeSpeechRequest.getOutputFormat() != null) {
            request.addParameter("OutputFormat", synthesizeSpeechRequest.getOutputFormat());
        }

        if (synthesizeSpeechRequest.getLexiconNames() != null) {
            for (String lexiconName : synthesizeSpeechRequest.getLexiconNames()) {
                request.addParameter("LexiconNames", lexiconName);
            }
        }

        if (synthesizeSpeechRequest.getSpeechMarkTypes() != null) {
            for (String speechMarkType : synthesizeSpeechRequest.getSpeechMarkTypes()) {
                request.addParameter("SpeechMarkTypes", speechMarkType);
            }
        }

        if (synthesizeSpeechRequest.getLanguageCode() != null) {
            request.addParameter("LanguageCode", synthesizeSpeechRequest.getLanguageCode());
        }
    }

    private Request<?> newRequest(AWSCredentialsProvider credentials) {
        return new DefaultRequest(new PresignerFacade.PresigningRequest().withRequestCredentialsProvider(credentials),
                                     "AmazonPolly");
    }

    private Date getDefaultExpirationDate() {
        return new DateTime(clock.currentTimeMillis())
                .plusMinutes(SYNTHESIZE_SPEECH_DEFAULT_EXPIRATION_MINUTES)
                .toDate();
    }

}

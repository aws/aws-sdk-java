/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.polly.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.polly.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * SynthesizeSpeechRequest Marshaller
 */
public class SynthesizeSpeechRequestMarshaller implements Marshaller<Request<SynthesizeSpeechRequest>, SynthesizeSpeechRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public SynthesizeSpeechRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SynthesizeSpeechRequest> marshall(SynthesizeSpeechRequest synthesizeSpeechRequest) {

        if (synthesizeSpeechRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SynthesizeSpeechRequest> request = new DefaultRequest<SynthesizeSpeechRequest>(synthesizeSpeechRequest, "AmazonPolly");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/speech";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.List<String> lexiconNamesList = synthesizeSpeechRequest.getLexiconNames();
            if (lexiconNamesList != null) {
                jsonGenerator.writeFieldName("LexiconNames");
                jsonGenerator.writeStartArray();
                for (String lexiconNamesListValue : lexiconNamesList) {
                    if (lexiconNamesListValue != null) {
                        jsonGenerator.writeValue(lexiconNamesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (synthesizeSpeechRequest.getOutputFormat() != null) {
                jsonGenerator.writeFieldName("OutputFormat").writeValue(synthesizeSpeechRequest.getOutputFormat());
            }
            if (synthesizeSpeechRequest.getSampleRate() != null) {
                jsonGenerator.writeFieldName("SampleRate").writeValue(synthesizeSpeechRequest.getSampleRate());
            }
            if (synthesizeSpeechRequest.getText() != null) {
                jsonGenerator.writeFieldName("Text").writeValue(synthesizeSpeechRequest.getText());
            }
            if (synthesizeSpeechRequest.getTextType() != null) {
                jsonGenerator.writeFieldName("TextType").writeValue(synthesizeSpeechRequest.getTextType());
            }
            if (synthesizeSpeechRequest.getVoiceId() != null) {
                jsonGenerator.writeFieldName("VoiceId").writeValue(synthesizeSpeechRequest.getVoiceId());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}

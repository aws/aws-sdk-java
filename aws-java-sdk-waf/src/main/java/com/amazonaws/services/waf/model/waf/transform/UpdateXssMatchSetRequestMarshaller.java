/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.waf.model.waf.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * UpdateXssMatchSetRequest Marshaller
 */
public class UpdateXssMatchSetRequestMarshaller implements Marshaller<Request<UpdateXssMatchSetRequest>, UpdateXssMatchSetRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateXssMatchSetRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateXssMatchSetRequest> marshall(UpdateXssMatchSetRequest updateXssMatchSetRequest) {

        if (updateXssMatchSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateXssMatchSetRequest> request = new DefaultRequest<UpdateXssMatchSetRequest>(updateXssMatchSetRequest, "AWSWAF");
        request.addHeader("X-Amz-Target", "AWSWAF_20150824.UpdateXssMatchSet");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateXssMatchSetRequest.getXssMatchSetId() != null) {
                jsonGenerator.writeFieldName("XssMatchSetId").writeValue(updateXssMatchSetRequest.getXssMatchSetId());
            }
            if (updateXssMatchSetRequest.getChangeToken() != null) {
                jsonGenerator.writeFieldName("ChangeToken").writeValue(updateXssMatchSetRequest.getChangeToken());
            }

            java.util.List<XssMatchSetUpdate> updatesList = updateXssMatchSetRequest.getUpdates();
            if (updatesList != null) {
                jsonGenerator.writeFieldName("Updates");
                jsonGenerator.writeStartArray();
                for (XssMatchSetUpdate updatesListValue : updatesList) {
                    if (updatesListValue != null) {

                        XssMatchSetUpdateJsonMarshaller.getInstance().marshall(updatesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}

/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model.transform;

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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Re Encrypt Request Marshaller
 */
public class ReEncryptRequestMarshaller implements Marshaller<Request<ReEncryptRequest>, ReEncryptRequest> {

    public Request<ReEncryptRequest> marshall(ReEncryptRequest reEncryptRequest) {
        if (reEncryptRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReEncryptRequest> request = new DefaultRequest<ReEncryptRequest>(reEncryptRequest, "AWSKMS");
        String target = "TrentService.ReEncrypt";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (reEncryptRequest.getCiphertextBlob() != null) {
                jsonWriter.key("CiphertextBlob").value(reEncryptRequest.getCiphertextBlob());
            }
            if (reEncryptRequest.getSourceEncryptionContext() != null && !reEncryptRequest.getSourceEncryptionContext().isEmpty()) {
                jsonWriter.key("SourceEncryptionContext");
                jsonWriter.object();
                for (Map.Entry<String, String> sourceEncryptionContextListValue : reEncryptRequest.getSourceEncryptionContext().entrySet()) {
                    if (sourceEncryptionContextListValue.getValue() != null) {
                        jsonWriter.key(sourceEncryptionContextListValue.getKey());

                        jsonWriter.value(sourceEncryptionContextListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }
            if (reEncryptRequest.getDestinationKeyId() != null) {
                jsonWriter.key("DestinationKeyId").value(reEncryptRequest.getDestinationKeyId());
            }
            if (reEncryptRequest.getDestinationEncryptionContext() != null && !reEncryptRequest.getDestinationEncryptionContext().isEmpty()) {
                jsonWriter.key("DestinationEncryptionContext");
                jsonWriter.object();
                for (Map.Entry<String, String> destinationEncryptionContextListValue : reEncryptRequest.getDestinationEncryptionContext().entrySet()) {
                    if (destinationEncryptionContextListValue.getValue() != null) {
                        jsonWriter.key(destinationEncryptionContextListValue.getKey());

                        jsonWriter.value(destinationEncryptionContextListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokensList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(reEncryptRequest.getGrantTokens());
            if (grantTokensList != null && !(grantTokensList.isAutoConstruct() && grantTokensList.isEmpty())) {

                jsonWriter.key("GrantTokens");
                jsonWriter.array();

                for (String grantTokensListValue : grantTokensList) {
                    if (grantTokensListValue != null) {
                        jsonWriter.value(grantTokensListValue);
                    }
                }
                jsonWriter.endArray();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}

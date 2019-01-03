/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;

import com.amazonaws.util.XMLWriter;

/**
 * UpdateFieldLevelEncryptionProfileRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFieldLevelEncryptionProfileRequestMarshaller implements
        Marshaller<Request<UpdateFieldLevelEncryptionProfileRequest>, UpdateFieldLevelEncryptionProfileRequest> {

    public Request<UpdateFieldLevelEncryptionProfileRequest> marshall(UpdateFieldLevelEncryptionProfileRequest updateFieldLevelEncryptionProfileRequest) {

        if (updateFieldLevelEncryptionProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateFieldLevelEncryptionProfileRequest> request = new DefaultRequest<UpdateFieldLevelEncryptionProfileRequest>(
                updateFieldLevelEncryptionProfileRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.PUT);

        if (updateFieldLevelEncryptionProfileRequest.getIfMatch() != null) {
            request.addHeader("If-Match", StringUtils.fromString(updateFieldLevelEncryptionProfileRequest.getIfMatch()));
        }

        String uriResourcePath = "/2018-11-05/field-level-encryption-profile/{Id}/config";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", updateFieldLevelEncryptionProfileRequest.getId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2018-11-05/");

            FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig = updateFieldLevelEncryptionProfileRequest
                    .getFieldLevelEncryptionProfileConfig();
            if (fieldLevelEncryptionProfileConfig != null) {
                xmlWriter.startElement("FieldLevelEncryptionProfileConfig");

                if (fieldLevelEncryptionProfileConfig.getName() != null) {
                    xmlWriter.startElement("Name").value(fieldLevelEncryptionProfileConfig.getName()).endElement();
                }

                if (fieldLevelEncryptionProfileConfig.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(fieldLevelEncryptionProfileConfig.getCallerReference()).endElement();
                }

                if (fieldLevelEncryptionProfileConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(fieldLevelEncryptionProfileConfig.getComment()).endElement();
                }

                EncryptionEntities encryptionEntities = fieldLevelEncryptionProfileConfig.getEncryptionEntities();
                if (encryptionEntities != null) {
                    xmlWriter.startElement("EncryptionEntities");

                    if (encryptionEntities.getQuantity() != null) {
                        xmlWriter.startElement("Quantity").value(encryptionEntities.getQuantity()).endElement();
                    }

                    com.amazonaws.internal.SdkInternalList<EncryptionEntity> encryptionEntitiesItemsList = (com.amazonaws.internal.SdkInternalList<EncryptionEntity>) encryptionEntities
                            .getItems();
                    if (!encryptionEntitiesItemsList.isEmpty() || !encryptionEntitiesItemsList.isAutoConstruct()) {
                        xmlWriter.startElement("Items");

                        for (EncryptionEntity encryptionEntitiesItemsListValue : encryptionEntitiesItemsList) {
                            xmlWriter.startElement("EncryptionEntity");

                            if (encryptionEntitiesItemsListValue.getPublicKeyId() != null) {
                                xmlWriter.startElement("PublicKeyId").value(encryptionEntitiesItemsListValue.getPublicKeyId()).endElement();
                            }

                            if (encryptionEntitiesItemsListValue.getProviderId() != null) {
                                xmlWriter.startElement("ProviderId").value(encryptionEntitiesItemsListValue.getProviderId()).endElement();
                            }

                            FieldPatterns fieldPatterns = encryptionEntitiesItemsListValue.getFieldPatterns();
                            if (fieldPatterns != null) {
                                xmlWriter.startElement("FieldPatterns");

                                if (fieldPatterns.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(fieldPatterns.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> fieldPatternsItemsList = (com.amazonaws.internal.SdkInternalList<String>) fieldPatterns
                                        .getItems();
                                if (!fieldPatternsItemsList.isEmpty() || !fieldPatternsItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String fieldPatternsItemsListValue : fieldPatternsItemsList) {
                                        xmlWriter.startElement("FieldPattern");
                                        xmlWriter.value(fieldPatternsItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }
                xmlWriter.endElement();
            }

            request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
            request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}

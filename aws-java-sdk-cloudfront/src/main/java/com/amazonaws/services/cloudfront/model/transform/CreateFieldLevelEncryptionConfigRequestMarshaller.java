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

import com.amazonaws.util.XMLWriter;

/**
 * CreateFieldLevelEncryptionConfigRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFieldLevelEncryptionConfigRequestMarshaller implements
        Marshaller<Request<CreateFieldLevelEncryptionConfigRequest>, CreateFieldLevelEncryptionConfigRequest> {

    public Request<CreateFieldLevelEncryptionConfigRequest> marshall(CreateFieldLevelEncryptionConfigRequest createFieldLevelEncryptionConfigRequest) {

        if (createFieldLevelEncryptionConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateFieldLevelEncryptionConfigRequest> request = new DefaultRequest<CreateFieldLevelEncryptionConfigRequest>(
                createFieldLevelEncryptionConfigRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2018-11-05/field-level-encryption";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2018-11-05/");

            FieldLevelEncryptionConfig fieldLevelEncryptionConfig = createFieldLevelEncryptionConfigRequest.getFieldLevelEncryptionConfig();
            if (fieldLevelEncryptionConfig != null) {
                xmlWriter.startElement("FieldLevelEncryptionConfig");

                if (fieldLevelEncryptionConfig.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(fieldLevelEncryptionConfig.getCallerReference()).endElement();
                }

                if (fieldLevelEncryptionConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(fieldLevelEncryptionConfig.getComment()).endElement();
                }

                QueryArgProfileConfig queryArgProfileConfig = fieldLevelEncryptionConfig.getQueryArgProfileConfig();
                if (queryArgProfileConfig != null) {
                    xmlWriter.startElement("QueryArgProfileConfig");

                    if (queryArgProfileConfig.getForwardWhenQueryArgProfileIsUnknown() != null) {
                        xmlWriter.startElement("ForwardWhenQueryArgProfileIsUnknown").value(queryArgProfileConfig.getForwardWhenQueryArgProfileIsUnknown())
                                .endElement();
                    }

                    QueryArgProfiles queryArgProfiles = queryArgProfileConfig.getQueryArgProfiles();
                    if (queryArgProfiles != null) {
                        xmlWriter.startElement("QueryArgProfiles");

                        if (queryArgProfiles.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(queryArgProfiles.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<QueryArgProfile> queryArgProfilesItemsList = (com.amazonaws.internal.SdkInternalList<QueryArgProfile>) queryArgProfiles
                                .getItems();
                        if (!queryArgProfilesItemsList.isEmpty() || !queryArgProfilesItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (QueryArgProfile queryArgProfilesItemsListValue : queryArgProfilesItemsList) {
                                xmlWriter.startElement("QueryArgProfile");

                                if (queryArgProfilesItemsListValue.getQueryArg() != null) {
                                    xmlWriter.startElement("QueryArg").value(queryArgProfilesItemsListValue.getQueryArg()).endElement();
                                }

                                if (queryArgProfilesItemsListValue.getProfileId() != null) {
                                    xmlWriter.startElement("ProfileId").value(queryArgProfilesItemsListValue.getProfileId()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }

                ContentTypeProfileConfig contentTypeProfileConfig = fieldLevelEncryptionConfig.getContentTypeProfileConfig();
                if (contentTypeProfileConfig != null) {
                    xmlWriter.startElement("ContentTypeProfileConfig");

                    if (contentTypeProfileConfig.getForwardWhenContentTypeIsUnknown() != null) {
                        xmlWriter.startElement("ForwardWhenContentTypeIsUnknown").value(contentTypeProfileConfig.getForwardWhenContentTypeIsUnknown())
                                .endElement();
                    }

                    ContentTypeProfiles contentTypeProfiles = contentTypeProfileConfig.getContentTypeProfiles();
                    if (contentTypeProfiles != null) {
                        xmlWriter.startElement("ContentTypeProfiles");

                        if (contentTypeProfiles.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(contentTypeProfiles.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<ContentTypeProfile> contentTypeProfilesItemsList = (com.amazonaws.internal.SdkInternalList<ContentTypeProfile>) contentTypeProfiles
                                .getItems();
                        if (!contentTypeProfilesItemsList.isEmpty() || !contentTypeProfilesItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (ContentTypeProfile contentTypeProfilesItemsListValue : contentTypeProfilesItemsList) {
                                xmlWriter.startElement("ContentTypeProfile");

                                if (contentTypeProfilesItemsListValue.getFormat() != null) {
                                    xmlWriter.startElement("Format").value(contentTypeProfilesItemsListValue.getFormat()).endElement();
                                }

                                if (contentTypeProfilesItemsListValue.getProfileId() != null) {
                                    xmlWriter.startElement("ProfileId").value(contentTypeProfilesItemsListValue.getProfileId()).endElement();
                                }

                                if (contentTypeProfilesItemsListValue.getContentType() != null) {
                                    xmlWriter.startElement("ContentType").value(contentTypeProfilesItemsListValue.getContentType()).endElement();
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

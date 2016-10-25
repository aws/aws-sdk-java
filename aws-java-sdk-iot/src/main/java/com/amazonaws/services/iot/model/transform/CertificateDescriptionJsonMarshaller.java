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
package com.amazonaws.services.iot.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CertificateDescriptionMarshaller
 */
public class CertificateDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CertificateDescription certificateDescription, StructuredJsonGenerator jsonGenerator) {

        if (certificateDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (certificateDescription.getCertificateArn() != null) {
                jsonGenerator.writeFieldName("certificateArn").writeValue(certificateDescription.getCertificateArn());
            }
            if (certificateDescription.getCertificateId() != null) {
                jsonGenerator.writeFieldName("certificateId").writeValue(certificateDescription.getCertificateId());
            }
            if (certificateDescription.getCaCertificateId() != null) {
                jsonGenerator.writeFieldName("caCertificateId").writeValue(certificateDescription.getCaCertificateId());
            }
            if (certificateDescription.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(certificateDescription.getStatus());
            }
            if (certificateDescription.getCertificatePem() != null) {
                jsonGenerator.writeFieldName("certificatePem").writeValue(certificateDescription.getCertificatePem());
            }
            if (certificateDescription.getOwnedBy() != null) {
                jsonGenerator.writeFieldName("ownedBy").writeValue(certificateDescription.getOwnedBy());
            }
            if (certificateDescription.getPreviousOwnedBy() != null) {
                jsonGenerator.writeFieldName("previousOwnedBy").writeValue(certificateDescription.getPreviousOwnedBy());
            }
            if (certificateDescription.getCreationDate() != null) {
                jsonGenerator.writeFieldName("creationDate").writeValue(certificateDescription.getCreationDate());
            }
            if (certificateDescription.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("lastModifiedDate").writeValue(certificateDescription.getLastModifiedDate());
            }
            if (certificateDescription.getTransferData() != null) {
                jsonGenerator.writeFieldName("transferData");
                TransferDataJsonMarshaller.getInstance().marshall(certificateDescription.getTransferData(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CertificateDescriptionJsonMarshaller instance;

    public static CertificateDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CertificateDescriptionJsonMarshaller();
        return instance;
    }

}

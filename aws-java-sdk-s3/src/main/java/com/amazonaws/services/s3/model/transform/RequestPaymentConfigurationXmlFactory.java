/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.RequestPaymentConfiguration;
import com.amazonaws.services.s3.model.RequestPaymentConfiguration.Payer;

/**
 * Converts Request Payment Configuration objects into XML byte arrays.
 */
public class RequestPaymentConfigurationXmlFactory {

    /**
     * Converts the specified request payment configuration into an XML byte
     * array to send to Amazon S3.
     *
     * Sample XML:
     * <RequestPaymentConfiguration xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
     * 		<Payer>Requester</Payer>
     * </RequestPaymentConfiguration>
     *
     * @param requestPaymentConfiguration
     *            The request payment configuration request to convert..
     * @return The XML byte array representation.
     */
    public byte[] convertToXmlByteArray(
            RequestPaymentConfiguration requestPaymentConfiguration) {
        XmlWriter xml = new XmlWriter();
        xml.start("RequestPaymentConfiguration", "xmlns",
                Constants.XML_NAMESPACE);

        Payer payer = requestPaymentConfiguration.getPayer();
        if (payer != null) {
            XmlWriter payerDocumentElement = xml.start("Payer");
            payerDocumentElement.value(payer.toString());
            payerDocumentElement.end();
        }
        xml.end();
        return xml.getBytes();
    }
}

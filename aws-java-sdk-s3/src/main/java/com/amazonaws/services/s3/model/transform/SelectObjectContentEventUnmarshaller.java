/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.internal.eventstreaming.HeaderType;
import com.amazonaws.services.s3.internal.eventstreaming.HeaderValue;
import com.amazonaws.services.s3.internal.eventstreaming.Message;
import com.amazonaws.services.s3.model.SelectObjectContentEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.ContinuationEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.EndEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.ProgressEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.RecordsEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.StatsEvent;
import com.amazonaws.services.s3.model.SelectObjectContentEventException;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.util.XmlUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

@SdkInternalApi
public abstract class SelectObjectContentEventUnmarshaller {
    public static SelectObjectContentEvent unmarshalMessage(Message message) {
        String messageType = getStringHeader(message, ":message-type");

        if ("error".equals(messageType)) {
            throw unmarshalErrorMessage(message);
        } else if ("event".equals(messageType)) {
            return unmarshalEventMessage(message);
        } else {
            throw new SelectObjectContentEventException("Service returned unknown message type: " + messageType);
        }
    }

    private static SelectObjectContentEventException unmarshalErrorMessage(Message message) {
        String errorCode = getStringHeader(message, ":error-code");
        String errorMessage = getStringHeader(message, ":error-message");
        SelectObjectContentEventException exception =
                new SelectObjectContentEventException("S3 returned an error: " + errorMessage + " (" + errorCode  + ")");
        exception.setErrorCode(errorCode);
        exception.setErrorMessage(errorMessage);
        return exception;
    }

    private static SelectObjectContentEvent unmarshalEventMessage(Message message) {
        String eventType = getStringHeader(message, ":event-type");
        try {
            return SelectObjectContentEventUnmarshaller.forEventType(eventType).unmarshal(message);
        } catch (Exception e) {
            throw new SelectObjectContentEventException("Failed to read response event of type " + eventType, e);
        }
    }

    public static SelectObjectContentEventUnmarshaller forEventType(String eventType) {
        if ("Records".equals(eventType)) {
            return new RecordsEventUnmarshaller();
        }
        if ("Stats".equals(eventType)) {
            return new StatsEventUnmarshaller();
        }
        if ("Progress".equals(eventType)) {
            return new ProgressEventUnmarshaller();
        }
        if ("Cont".equals(eventType)) {
            return new ContinuationEventUnmarshaller();
        }
        if ("End".equals(eventType)) {
            return new EndEventUnmarshaller();
        }
        return new UnknownEventUnmarshaller();
    }

    private static String getStringHeader(Message message, String headerName) {
        HeaderValue header = message.getHeaders().get(headerName);
        if (header == null) {
            throw new SelectObjectContentEventException("Unexpected lack of '" + headerName + "' header from service.");
        }
        if (header.getType() != HeaderType.STRING) {
            throw new SelectObjectContentEventException("Unexpected non-string '" + headerName + "' header: " + header.getType());
        }
        return header.getString();
    }

    public abstract SelectObjectContentEvent unmarshal(Message message) throws Exception;

    public static class RecordsEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override
        public RecordsEvent unmarshal(Message message) {
            return new RecordsEvent().withPayload(ByteBuffer.wrap(message.getPayload()));
        }
    }

    public static class StatsEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override
        public StatsEvent unmarshal(Message message) throws Exception {
            StaxUnmarshallerContext context = payloadUnmarshaller(message);
            return new StatsEvent().withDetails(StatsStaxUnmarshaller.getInstance().unmarshall(context));
        }
    }

    public static class ProgressEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override
        public ProgressEvent unmarshal(Message message) throws Exception {
            StaxUnmarshallerContext context = payloadUnmarshaller(message);
            return new ProgressEvent().withDetails(ProgressStaxUnmarshaller.getInstance().unmarshall(context));
        }
    }

    public static class ContinuationEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override
        public ContinuationEvent unmarshal(Message message) {
            return new ContinuationEvent();
        }
    }

    public static class EndEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override
        public EndEvent unmarshal(Message message) {
            return new EndEvent();
        }
    }

    public static class UnknownEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override
        public SelectObjectContentEvent unmarshal(Message message) {
            return new SelectObjectContentEvent();
        }
    }

    private static StaxUnmarshallerContext payloadUnmarshaller(Message message) throws XMLStreamException {
        InputStream payloadStream = new ByteArrayInputStream(message.getPayload());
        XMLEventReader xmlEventReader = XmlUtils.getXmlInputFactory().createXMLEventReader(payloadStream);
        return new StaxUnmarshallerContext(xmlEventReader);
    }
}

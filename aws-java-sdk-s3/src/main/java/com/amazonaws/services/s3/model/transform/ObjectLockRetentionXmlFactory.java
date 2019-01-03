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

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.ObjectLockRetention;

import java.util.Date;

import static com.amazonaws.services.s3.internal.XmlWriterUtils.addIfNotNull;

public final class ObjectLockRetentionXmlFactory {
    public byte[] convertToXmlByteArray(ObjectLockRetention retention) {
        XmlWriter writer = new XmlWriter();
        writer.start("Retention", "xmlns", Constants.XML_NAMESPACE);
        addIfNotNull(writer, "Mode", retention.getMode());
        addDateIfNotNull(writer, "RetainUntilDate", retention.getRetainUntilDate());
        writer.end();
        return writer.getBytes();
    }

    private static void addDateIfNotNull(XmlWriter writer, String tagName, Date tagValue) {
        if (tagValue != null) {
            writer.start(tagName).value(ServiceUtils.formatIso8601Date(tagValue)).end();
        }
    }
}

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
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.DefaultRetention;
import com.amazonaws.services.s3.model.ObjectLockConfiguration;
import com.amazonaws.services.s3.model.ObjectLockRule;

import static com.amazonaws.services.s3.internal.XmlWriterUtils.addIfNotNull;

public final class ObjectLockConfigurationXmlFactory {
    public byte[] convertToXmlByteArray(ObjectLockConfiguration config) {
        XmlWriter writer = new XmlWriter();
        writer.start("ObjectLockConfiguration", "xmlns", Constants.XML_NAMESPACE);
        addIfNotNull(writer, "ObjectLockEnabled", config.getObjectLockEnabled());
        addRuleIfNotNull(writer, config.getRule());
        writer.end();
        return writer.getBytes();
    }

    private static void addRuleIfNotNull(XmlWriter writer, ObjectLockRule rule) {
        if (rule == null) {
            return;
        }
        writer.start("Rule");
        writeDefaultRetention(writer, rule.getDefaultRetention());
        writer.end();
    }

    private static void writeDefaultRetention(XmlWriter writer, DefaultRetention retention) {
        if (retention == null) {
            return;
        }

        writer.start("DefaultRetention");
        addIfNotNull(writer, "Mode", retention.getMode());
        Integer days = retention.getDays();
        if (days != null) {
            writer.start("Days").value(Integer.toString(days)).end();
        }
        Integer years = retention.getYears();
        if (years != null) {
            writer.start("Years").value(Integer.toString(years)).end();
        }
        writer.end();
    }
}

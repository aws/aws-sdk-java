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

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate;

/**
 * Common function for  BucketConfigurationXmlFactory and visitor implementations.
 */
final class BucketConfigurationXmlFactoryFunctions {
    private BucketConfigurationXmlFactoryFunctions() {
    }

    static void addParameterIfNotNull(final XmlWriter xml, final String xmlTagName, final String value) {
        if (value != null) {
            xml.start(xmlTagName).value(value).end();
        }
    }

    static void writePrefix(final XmlWriter xml, final String prefix) {
        addParameterIfNotNull(xml, "Prefix", prefix);
    }

    static void writeTag(final XmlWriter xml, final Tag tag) {
        if (tag == null) {
            return;
        }
        xml.start("Tag");
        xml.start("Key").value(tag.getKey()).end();
        xml.start("Value").value(tag.getValue()).end();
        xml.end();
    }
}

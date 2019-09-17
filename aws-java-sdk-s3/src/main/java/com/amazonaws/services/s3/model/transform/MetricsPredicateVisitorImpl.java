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
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsPredicateVisitor;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;

import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writePrefix;
import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writeTag;

class MetricsPredicateVisitorImpl implements MetricsPredicateVisitor {
    private final XmlWriter xml;

    public MetricsPredicateVisitorImpl(XmlWriter xml) {
        this.xml = xml;
    }

    @Override
    public void visit(MetricsPrefixPredicate metricsPrefixPredicate) {
        writePrefix(xml, metricsPrefixPredicate.getPrefix());
    }

    @Override
    public void visit(MetricsTagPredicate metricsTagPredicate) {
        writeTag(xml, metricsTagPredicate.getTag());
    }

    @Override
    public void visit(MetricsAndOperator metricsAndOperator) {
        xml.start("And");
        for (MetricsFilterPredicate predicate : metricsAndOperator.getOperands()) {
            predicate.accept(this);
        }
        xml.end();
    }
}

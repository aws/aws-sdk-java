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
import com.amazonaws.services.s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilterPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsPredicateVisitor;
import com.amazonaws.services.s3.model.analytics.AnalyticsPrefixPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsTagPredicate;

import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writePrefix;
import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writeTag;

class AnalyticsPredicateVisitorImpl implements AnalyticsPredicateVisitor {
    private final XmlWriter xml;

    public AnalyticsPredicateVisitorImpl(XmlWriter xml) {
        this.xml = xml;
    }

    @Override
    public void visit(AnalyticsPrefixPredicate analyticsPrefixPredicate) {
        writePrefix(xml, analyticsPrefixPredicate.getPrefix());
    }

    @Override
    public void visit(AnalyticsTagPredicate analyticsTagPredicate) {
        writeTag(xml, analyticsTagPredicate.getTag());
    }

    @Override
    public void visit(AnalyticsAndOperator analyticsAndOperator) {
        xml.start("And");
        for (AnalyticsFilterPredicate predicate : analyticsAndOperator.getOperands()) {
            predicate.accept(this);
        }
        xml.end();
    }
}

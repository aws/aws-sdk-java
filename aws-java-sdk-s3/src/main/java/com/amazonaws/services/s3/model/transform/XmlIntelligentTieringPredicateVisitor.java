/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writePrefix;
import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writeTag;

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringAndOperator;
import com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringFilterPredicate;
import com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringPredicateVisitor;
import com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringPrefixPredicate;
import com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringTagPredicate;

class XmlIntelligentTieringPredicateVisitor implements IntelligentTieringPredicateVisitor {
    private final XmlWriter xml;

    public XmlIntelligentTieringPredicateVisitor(XmlWriter xml) {
        this.xml = xml;
    }

    @Override
    public void visit(IntelligentTieringPrefixPredicate prefixPredicate) {
        writePrefix(xml, prefixPredicate.getPrefix());
    }

    @Override
    public void visit(IntelligentTieringTagPredicate tagPredicate) {
        writeTag(xml, tagPredicate.getTag());
    }

    @Override
    public void visit(IntelligentTieringAndOperator andOperator) {
        xml.start("And");
        for (IntelligentTieringFilterPredicate predicate : andOperator.getOperands()) {
            predicate.accept(this);
        }
        xml.end();
    }
}

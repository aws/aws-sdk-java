/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writeObjectSizeGreaterThan;
import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writeObjectSizeLessThan;
import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writePrefix;
import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writeTag;

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleObjectSizeGreaterThanPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleObjectSizeLessThanPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePredicateVisitor;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;

class LifecyclePredicateVisitorImpl implements LifecyclePredicateVisitor {
    private final XmlWriter xml;

    public LifecyclePredicateVisitorImpl(XmlWriter xml) {
        this.xml = xml;
    }

    @Override
    public void visit(LifecyclePrefixPredicate lifecyclePrefixPredicate) {
        writePrefix(xml, lifecyclePrefixPredicate.getPrefix());
    }

    @Override
    public void visit(LifecycleTagPredicate lifecycleTagPredicate) {
        writeTag(xml, lifecycleTagPredicate.getTag());
    }

    @Override
    public void visit(LifecycleObjectSizeGreaterThanPredicate lifecycleObjectSizeGreaterThanPredicate) {
        writeObjectSizeGreaterThan(xml, lifecycleObjectSizeGreaterThanPredicate.getObjectSizeGreaterThan());
    }

    @Override
    public void visit(LifecycleObjectSizeLessThanPredicate lifecycleObjectSizeLessThanPredicate) {
        writeObjectSizeLessThan(xml, lifecycleObjectSizeLessThanPredicate.getObjectSizeLessThan());
    }

    @Override
    public void visit(LifecycleAndOperator lifecycleAndOperator) {
        xml.start("And");
        for (LifecycleFilterPredicate predicate : lifecycleAndOperator.getOperands()) {
            predicate.accept(this);
        }
        xml.end(); // </And>
    }
}

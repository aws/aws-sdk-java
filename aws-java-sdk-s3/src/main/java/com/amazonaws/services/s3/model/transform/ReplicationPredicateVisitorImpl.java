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
import com.amazonaws.services.s3.model.replication.ReplicationAndOperator;
import com.amazonaws.services.s3.model.replication.ReplicationFilterPredicate;
import com.amazonaws.services.s3.model.replication.ReplicationPredicateVisitor;
import com.amazonaws.services.s3.model.replication.ReplicationPrefixPredicate;
import com.amazonaws.services.s3.model.replication.ReplicationTagPredicate;

import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writePrefix;
import static com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactoryFunctions.writeTag;

class ReplicationPredicateVisitorImpl implements ReplicationPredicateVisitor {
    private final XmlWriter xml;

    public ReplicationPredicateVisitorImpl(XmlWriter xml) {
        this.xml = xml;
    }

    @Override
    public void visit(ReplicationPrefixPredicate replicationPrefixPredicate) {
        writePrefix(xml, replicationPrefixPredicate.getPrefix());
    }

    @Override
    public void visit(ReplicationTagPredicate replicationTagPredicate) {
        writeTag(xml, replicationTagPredicate.getTag());
    }

    @Override
    public void visit(ReplicationAndOperator replicationAndOperator) {
        xml.start("And");
        for (ReplicationFilterPredicate predicate : replicationAndOperator.getOperands()) {
            predicate.accept(this);
        }
        xml.end(); // </And>
    }
}

/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

import com.amazonaws.services.s3.model.PartitionedPrefix;
import com.amazonaws.services.s3.model.SimplePrefix;

/**
 * The target object key format of the {@link com.amazonaws.services.s3.model.BucketLoggingConfiguration}. The prefix
 * type will be either Simple or Partitioned, with Simple being the default.
 */
public class TargetObjectKeyFormat {
    private PartitionedPrefix partitionedPrefix;
    private SimplePrefix simplePrefix;

    public TargetObjectKeyFormat(PartitionedPrefix partitionedPrefix) {
        this.partitionedPrefix = partitionedPrefix;
    }

    public TargetObjectKeyFormat(SimplePrefix simplePrefix) {
        this.simplePrefix = simplePrefix;
    }

    public PartitionedPrefix getPartitionedPrefix() {
        return partitionedPrefix;
    }

    public SimplePrefix getSimplePrefix() {
        return simplePrefix;
    }

    public String toString() {
        String result = "";
        if (simplePrefix != null) {
            result += getSimplePrefix();
        }
        if (partitionedPrefix != null) {
            result += getPartitionedPrefix();
        }
        return result;
    }
}

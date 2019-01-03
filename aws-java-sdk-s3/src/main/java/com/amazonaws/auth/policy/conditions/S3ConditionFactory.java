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
package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.Condition;
import com.amazonaws.auth.policy.conditions.StringCondition.StringComparisonType;
import com.amazonaws.services.s3.model.CannedAccessControlList;

/**
 * Factory for creating access control policy conditions specific to Amazon S3.
 * This class provides access to the AWS access control policy condition keys
 * specific to Amazon S3, as well as methods for quickly creating common S3
 * specific policy conditions such as
 * {@link #newCannedACLCondition(CannedAccessControlList)}.
 */
public class S3ConditionFactory {

    /**
     * Condition key for the canned ACL specified by a request.
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String CANNED_ACL_CONDITION_KEY = "s3:x-amz-acl";

    /**
     * Condition key for the location constraint specified by a request.
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String LOCATION_CONSTRAINT_CONDITION_KEY = "s3:LocationConstraint";

    /**
     * Condition key for the prefix specified by a request.
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String PREFIX_CONDITION_KEY = "s3:prefix";

    /**
     * Condition key for the delimiter specified by a request.
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String DELIMITER_CONDITION_KEY = "s3:delimiter";

    /**
     * Condition key for the max keys specified by a request.
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String MAX_KEYS_CONDITION_KEY = "s3:max-keys";

    /**
     * Condition key for the source object specified by a request to copy an
     * object.
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String COPY_SOURCE_CONDITION_KEY = "s3:x-amz-copy-source";

    /**
     * Condition key for the metadata directive specified by a request to copy
     * an object.
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String METADATA_DIRECTIVE_CONDITION_KEY = "s3:x-amz-metadata-directive";

    /**
     * Condition key for the version ID of an object version specified by a
     * request.
     * <p>
     * This condition key may only be used with {@link StringCondition} objects.
     */
    public static final String VERSION_ID_CONDITION_KEY = "s3:VersionId";

    private S3ConditionFactory() {}

    /**
     * Constructs a new access policy condition that compares an Amazon S3
     * canned ACL with the canned ACL specified by an incoming request.
     * <p>
     * You can use this condition to ensure that any objects uploaded to an
     * Amazon S3 bucket have a specific canned ACL set.
     *
     * @param cannedAcl
     *            The Amazon S3 canned ACL to compare against.
     *
     * @return A new access control policy condition that compares the Amazon S3
     *         canned ACL specified in incoming requests against the value
     *         specified.
     */
    public static Condition newCannedACLCondition(CannedAccessControlList cannedAcl) {
        return new StringCondition(StringComparisonType.StringEquals,
                CANNED_ACL_CONDITION_KEY, cannedAcl.toString());
    }

}

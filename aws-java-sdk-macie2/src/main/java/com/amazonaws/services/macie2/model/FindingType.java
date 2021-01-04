/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.macie2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The type of finding. For details about each type, see <a
 * href="https://docs.aws.amazon.com/macie/latest/user/findings-types.html">Types of Amazon Macie findings</a> in the
 * <i>Amazon Macie User Guide</i>. Valid values are:
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum FindingType {

    SensitiveDataS3ObjectMultiple("SensitiveData:S3Object/Multiple"),
    SensitiveDataS3ObjectFinancial("SensitiveData:S3Object/Financial"),
    SensitiveDataS3ObjectPersonal("SensitiveData:S3Object/Personal"),
    SensitiveDataS3ObjectCredentials("SensitiveData:S3Object/Credentials"),
    SensitiveDataS3ObjectCustomIdentifier("SensitiveData:S3Object/CustomIdentifier"),
    PolicyIAMUserS3BucketPublic("Policy:IAMUser/S3BucketPublic"),
    PolicyIAMUserS3BucketSharedExternally("Policy:IAMUser/S3BucketSharedExternally"),
    PolicyIAMUserS3BucketReplicatedExternally("Policy:IAMUser/S3BucketReplicatedExternally"),
    PolicyIAMUserS3BucketEncryptionDisabled("Policy:IAMUser/S3BucketEncryptionDisabled"),
    PolicyIAMUserS3BlockPublicAccessDisabled("Policy:IAMUser/S3BlockPublicAccessDisabled");

    private String value;

    private FindingType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return FindingType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static FindingType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FindingType enumEntry : FindingType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

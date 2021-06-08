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
package com.amazonaws.services.waf.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed due to a problem with the migration. The failure cause is provided in the exception, in the
 * <code>MigrationErrorType</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ENTITY_NOT_SUPPORTED</code> - The web ACL has an unsupported entity but the <code>IgnoreUnsupportedType</code>
 * is not set to true.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ENTITY_NOT_FOUND</code> - The web ACL doesn't exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_BUCKET_NO_PERMISSION</code> - You don't have permission to perform the <code>PutObject</code> action to the
 * specified Amazon S3 bucket.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_BUCKET_NOT_ACCESSIBLE</code> - The bucket policy doesn't allow AWS WAF to perform the <code>PutObject</code>
 * action in the bucket.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_BUCKET_NOT_FOUND</code> - The S3 bucket doesn't exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_BUCKET_INVALID_REGION</code> - The S3 bucket is not in the same Region as the web ACL.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>S3_INTERNAL_ERROR</code> - AWS WAF failed to create the template in the S3 bucket for another reason.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFEntityMigrationException extends com.amazonaws.services.waf.model.AWSWAFException {
    private static final long serialVersionUID = 1L;

    private String migrationErrorType;

    private String migrationErrorReason;

    /**
     * Constructs a new WAFEntityMigrationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFEntityMigrationException(String message) {
        super(message);
    }

    /**
     * @param migrationErrorType
     * @see MigrationErrorType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("MigrationErrorType")
    public void setMigrationErrorType(String migrationErrorType) {
        this.migrationErrorType = migrationErrorType;
    }

    /**
     * @return
     * @see MigrationErrorType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("MigrationErrorType")
    public String getMigrationErrorType() {
        return this.migrationErrorType;
    }

    /**
     * @param migrationErrorType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationErrorType
     */

    public WAFEntityMigrationException withMigrationErrorType(String migrationErrorType) {
        setMigrationErrorType(migrationErrorType);
        return this;
    }

    /**
     * @param migrationErrorType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationErrorType
     */

    public WAFEntityMigrationException withMigrationErrorType(MigrationErrorType migrationErrorType) {
        this.migrationErrorType = migrationErrorType.toString();
        return this;
    }

    /**
     * @param migrationErrorReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("MigrationErrorReason")
    public void setMigrationErrorReason(String migrationErrorReason) {
        this.migrationErrorReason = migrationErrorReason;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("MigrationErrorReason")
    public String getMigrationErrorReason() {
        return this.migrationErrorReason;
    }

    /**
     * @param migrationErrorReason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WAFEntityMigrationException withMigrationErrorReason(String migrationErrorReason) {
        setMigrationErrorReason(migrationErrorReason);
        return this;
    }

}

package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;

/**
 * Logic for determining whether MD5 checksum validation should be performed or not.
 */
public class SkipMd5CheckStrategy {

    /**
     * System property to disable MD5 validation for GetObject. Any value set for this property will
     * disable validation.
     */
    public static final String DISABLE_GET_OBJECT_MD5_VALIDATION_PROPERTY = "com.amazonaws.services.s3.disableGetObjectMD5Validation";

    /**
     * System property to disable MD5 validation for both PutObject and UploadPart. Any value set
     * for this property will disable validation.
     */
    public static final String DISABLE_PUT_OBJECT_MD5_VALIDATION_PROPERTY = "com.amazonaws.services.s3.disablePutObjectMD5Validation";

    public static final SkipMd5CheckStrategy INSTANCE = new SkipMd5CheckStrategy();

    // Singleton
    private SkipMd5CheckStrategy() {
    }

    /**
     * Based on the given metadata of an S3 response, Returns whether the specified request should
     * skip MD5 check on the requested object content. Specifically, MD5 check should be skipped if
     * either SSE-KMS or SSE-C is involved.
     * <p>
     * The reason is that when SSE-KMS or SSE-C is involved, the MD5 returned from the server side
     * is the MD5 of the ciphertext, which will by definition mismatch the MD5 on the client side
     * which is computed based on the plaintext.
     */
    public boolean skipMd5CheckPerResponse(ObjectMetadata metadata) {
        return metadata != null && (metadata.getSSEAwsKmsKeyId() != null || metadata.getSSECustomerAlgorithm() != null);
    }

    /**
     * Based on the given {@link GetObjectRequest}, returns whether the specified request should
     * skip MD5 check on the requested object content. Specifically, MD5 check should be skipped if
     * one of the following conditions are true:
     * <ol>
     * <li>The system property -Dcom.amazonaws.services.s3.disableGetObjectMD5Validation is set.
     * </li>
     * <li>The request is a range-get operation</li>
     * <li>The request is a GET object operation that involves SSE-C</li>
     * </ol>
     * Otherwise, MD5 check should not be skipped.
     */
    public boolean skipMd5CheckPerRequest(GetObjectRequest request) {
        if (System.getProperty(DISABLE_GET_OBJECT_MD5_VALIDATION_PROPERTY) != null) {
            return true;
        }
        // Skip MD5 check for range get
        if (request.getRange() != null) {
            return true;
        }
        if (request.getSSECustomerKey() != null) {
            return true;
        }
        return false;
    }

    /**
     * Based on the given {@link PutObjectRequest}, returns whether the specified request should
     * skip MD5 check on the requested object content. Specifically, MD5 check should be skipped if
     * one of the following conditions are true:
     * <ol>
     * <li>The system property -Dcom.amazonaws.services.s3.disablePutObjectMD5Validation is
     * specified.</li>
     * <li>The request is a PUT object operation that involves SSE-C</li>
     * <li>The request is a PUT object operation that involves SSE-KMS</li>
     * </ol>
     * Otherwise, MD5 check should not be skipped.
     */
    public boolean skipMd5CheckPerRequest(PutObjectRequest request) {
        if (isPutObjectMd5ValidationDisabledByProperty()) {
            return true;
        }
        return request.getSSECustomerKey() != null || request.getSSEAwsKeyManagementParams() != null;
    }

    /**
     * Based on the given {@link UploadPartRequest}, returns whether the specified request should
     * skip MD5 check on the requested object content. Specifically, MD5 check should be skipped if
     * one of the following conditions are true:
     * <ol>
     * <li>The system property -Dcom.amazonaws.services.s3.disablePutObjectMD5Validation is
     * specified.</li>
     * <li>The request is an upload-part operation that involves SSE-C</li>
     * </ol>
     * Otherwise, MD5 check should not be skipped.
     */
    public boolean skipMd5CheckPerRequest(UploadPartRequest request) {
        if (isPutObjectMd5ValidationDisabledByProperty()) {
            return true;
        }
        return request.getSSECustomerKey() != null;
    }

    private boolean isPutObjectMd5ValidationDisabledByProperty() {
        return System.getProperty(DISABLE_PUT_OBJECT_MD5_VALIDATION_PROPERTY) != null;
    }
}

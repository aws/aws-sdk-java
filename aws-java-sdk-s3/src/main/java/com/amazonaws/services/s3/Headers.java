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
package com.amazonaws.services.s3;

/**
 * Common S3 HTTP header values used throughout the Amazon Web Services S3 Java client.
 */
public interface Headers {

    /*
     * Standard HTTP Headers
     */

    String CACHE_CONTROL = "Cache-Control";
    String CONTENT_DISPOSITION = "Content-Disposition";
    String CONTENT_ENCODING = "Content-Encoding";
    String CONTENT_LENGTH = "Content-Length";
    String CONTENT_RANGE = "Content-Range";
    String CONTENT_MD5 = "Content-MD5";
    String CONTENT_TYPE = "Content-Type";
    String CONTENT_LANGUAGE = "Content-Language";
    String DATE = "Date";
    String ETAG = "ETag";
    String LAST_MODIFIED = "Last-Modified";
    String SERVER = "Server";
    String CONNECTION = "Connection";

    /*
     * Amazon HTTP Headers
     */

    /** Prefix for general Amazon headers: x-amz- */
    String AMAZON_PREFIX = "x-amz-";

    /** S3's canned ACL header: x-amz-acl */
    String S3_CANNED_ACL = "x-amz-acl";

    /** Amazon's alternative date header: x-amz-date */
    String S3_ALTERNATE_DATE = "x-amz-date";

    /** Prefix for S3 user metadata: x-amz-meta- */
    String S3_USER_METADATA_PREFIX = "x-amz-meta-";

    /** S3's version ID header */
    String S3_VERSION_ID = "x-amz-version-id";

    /** S3's Multi-Factor Authentication header */
    String S3_MFA = "x-amz-mfa";

    /** S3 response header for a request's Amazon Web Services request ID */
    String REQUEST_ID = "x-amz-request-id";

    /** S3 response header for a request's extended debugging ID */
    String EXTENDED_REQUEST_ID = "x-amz-id-2";

    /** S3 response header in response from accelerate endpoint. */
    String CLOUD_FRONT_ID = "X-Amz-Cf-Id";

    /** S3 request header indicating how to handle metadata when copying an object */
    String METADATA_DIRECTIVE = "x-amz-metadata-directive";

    /** DevPay token header */
    String SECURITY_TOKEN = "x-amz-security-token";

    /** Header describing what class of storage a user wants */
    String STORAGE_CLASS = "x-amz-storage-class";

    /** Header describing what archive tier the object is in, if any */
    String ARCHIVE_STATUS = "x-amz-archive-status";

    /** Header for optional server-side encryption algorithm */
    String SERVER_SIDE_ENCRYPTION = "x-amz-server-side-encryption";

    /** Header for the encryption algorithm used when encrypting the object with customer-provided keys */
    String SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM = "x-amz-server-side-encryption-customer-algorithm";

    /** Header for the customer-provided key for server-side encryption */
    String SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY = "x-amz-server-side-encryption-customer-key";

    /** Header for the MD5 digest of the customer-provided key for server-side encryption */
    String SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5 = "x-amz-server-side-encryption-customer-key-MD5";

    /** Header for the encryption algorithm used when encrypting the object with customer-provided keys */
    String COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM = "x-amz-copy-source-server-side-encryption-customer-algorithm";

    /** Header for the customer-provided key for server-side encryption */
    String COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY = "x-amz-copy-source-server-side-encryption-customer-key";

    /** Header for the MD5 digest of the customer-provided key for server-side encryption */
    String COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5 = "x-amz-copy-source-server-side-encryption-customer-key-MD5";

    /** Header for the whether or not bucket key encryption is used */
    String SERVER_SIDE_ENCRYPTION_BUCKET_KEY_ENABLED = "x-amz-server-side-encryption-bucket-key-enabled";

    /** Header for optional object expiration */
    String EXPIRATION = "x-amz-expiration";

    /** Header for optional object expiration */
    String EXPIRES = "Expires";

    /** ETag matching constraint header for the copy object request */
    String COPY_SOURCE_IF_MATCH = "x-amz-copy-source-if-match";

    /** ETag non-matching constraint header for the copy object request */
    String COPY_SOURCE_IF_NO_MATCH = "x-amz-copy-source-if-none-match";

    /** Unmodified since constraint header for the copy object request */
    String COPY_SOURCE_IF_UNMODIFIED_SINCE = "x-amz-copy-source-if-unmodified-since";

    /** Modified since constraint header for the copy object request */
    String COPY_SOURCE_IF_MODIFIED_SINCE = "x-amz-copy-source-if-modified-since";

    /** Range header for the get object request */
    String RANGE = "Range";

    /**Range header for the copy part request */
    String COPY_PART_RANGE = "x-amz-copy-source-range";

    /** Modified since constraint header for the get object request */
    String GET_OBJECT_IF_MODIFIED_SINCE = "If-Modified-Since";

    /** Unmodified since constraint header for the get object request */
    String GET_OBJECT_IF_UNMODIFIED_SINCE = "If-Unmodified-Since";

    /** ETag matching constraint header for the get object request */
    String GET_OBJECT_IF_MATCH = "If-Match";

    /** ETag non-matching constraint header for the get object request */
    String GET_OBJECT_IF_NONE_MATCH = "If-None-Match";

    /**
     * Encrypted symmetric key header that is used in the Encryption Only (EO) envelope
     * encryption mechanism.
     */
    @Deprecated
    String CRYPTO_KEY = "x-amz-key";

    /**
     * Encrypted symmetric key header that is used in the Authenticated
     * Encryption (AE) cryptographic module. Older versions of S3 encryption
     * client with encryption-only capability would not be able to recognize
     * this AE key, and therefore will be prevented from mistakenly decrypting
     * ciphertext in AE format.
     */
    String CRYPTO_KEY_V2 = "x-amz-key-v2";

    /** Initialization vector (IV) header that is used in the symmetric and envelope encryption mechanisms */
    String CRYPTO_IV = "x-amz-iv";

    /** JSON-encoded description of encryption materials used during encryption */
    String MATERIALS_DESCRIPTION = "x-amz-matdesc";

    /** Instruction file header to be placed in the metadata of instruction files */
    String CRYPTO_INSTRUCTION_FILE = "x-amz-crypto-instr-file";

    /** Header for the original, unencrypted size of an encrypted object */
    String UNENCRYPTED_CONTENT_LENGTH = "x-amz-unencrypted-content-length";

    /** Header for the optional original unencrypted Content MD5 of an encrypted object */
    String UNENCRYPTED_CONTENT_MD5 = "x-amz-unencrypted-content-md5";

    /** Header for optional redirect location of an object */
    String REDIRECT_LOCATION = "x-amz-website-redirect-location";

    /** Header for the optional restore information of an object */
    String RESTORE = "x-amz-restore";

    /**
     * Key wrapping algorithm such as "AESWrap" and "RSA/ECB/OAEPWithSHA-256AndMGF1Padding".
     */
    String CRYPTO_KEYWRAP_ALGORITHM = "x-amz-wrap-alg";
    /**
     * Content encryption algorithm, such as "AES/GCM/NoPadding".
     */
    String CRYPTO_CEK_ALGORITHM = "x-amz-cek-alg";
    /**
     * Content encryption algorithm, such as "AES/GCM/NoPadding".
     */
    String AWS_CRYPTO_CEK_ALGORITHM = "aws:x-amz-cek-alg";
    /**
     * Tag length applicable to authenticated encrypt/decryption for the content.
     */
    String CRYPTO_TAG_LENGTH = "x-amz-tag-len";

    /**
     * Headers in request indicating that the requester must be charged for data
     * transfer.
     */
    String REQUESTER_PAYS_HEADER = "x-amz-request-payer";

    /**
     * Header in the response indicating that the requester has been charged for
     * the request.
     */
    String REQUESTER_CHARGED_HEADER = "x-amz-request-charged";

    /**
     * Header in the request and response indicating the Amazon Web Services Key Management
     * System key id used for Server Side Encryption.
     */
    String SERVER_SIDE_ENCRYPTION_AWS_KMS_KEYID = "x-amz-server-side-encryption-aws-kms-key-id";

    /**
     * Amazon Web Services KMS Encryption Context to use for object encryption
     */
    String SERVER_SIDE_ENCRYPTION_AWS_KMS_CONTEXT= "x-amz-server-side-encryption-context";

    /** Header for the replication status of an Amazon S3 Object.*/
    String OBJECT_REPLICATION_STATUS = "x-amz-replication-status";

    /** Region where the request is being served */
    String S3_SERVING_REGION = "x-amz-region";

    /** Region where the bucket is located. This header is returned only in HEAD bucket and ListObjects response. */
    String S3_BUCKET_REGION = "x-amz-bucket-region";

    /** Date when multipart upload will become eligible for abort operation by lifecycle. */
    String ABORT_DATE = "x-amz-abort-date";

    /** Id of the lifecycle rule that makes a multipart upload eligible for abort operation. */
    String ABORT_RULE_ID = "x-amz-abort-rule-id";

    /** S3 response header for a multipart object containing the number of parts in the object. */
    String S3_PARTS_COUNT = "x-amz-mp-parts-count";

    /** S3 request header for PUT object with a tag set */
    String S3_TAGGING = "x-amz-tagging";

    /** S3 response header the number of tags on an object */
    String S3_TAGGING_COUNT = "x-amz-tagging-count";

    String TAGGING_DIRECTIVE = "x-amz-tagging-directive";

    String REMOVE_SELF_BUCKET_ACCESS = "x-amz-confirm-remove-self-bucket-access";

    String S3_RESTORE_OUTPUT_PATH = "x-amz-restore-output-path";

    String OBJECT_LOCK_MODE = "x-amz-object-lock-mode";

    String OBJECT_LOCK_RETAIN_UNTIL_DATE = "x-amz-object-lock-retain-until-date";

    String OBJECT_LOCK_LEGAL_HOLD_STATUS = "x-amz-object-lock-legal-hold";

    String OBJECT_LOCK_TOKEN = "x-amz-bucket-object-lock-token";

    String OBJECT_LOCK_ENABLED_FOR_BUCKET = "x-amz-bucket-object-lock-enabled";

    String OBJECT_OWNERSHIP = "x-amz-object-ownership";

    String BYPASS_GOVERNANCE_RETENTION = "x-amz-bypass-governance-retention";

    String REQUEST_ROUTE = "x-amz-request-route";

    String REQUEST_TOKEN = "x-amz-request-token";

    String FWD_STATUS_CODE = "x-amz-fwd-status";

    String FWD_ERROR_CODE = "x-amz-fwd-error-code";

    String FWD_ERROR_MESSAGE = "x-amz-fwd-error-message";

    String FWD_ACCEPT_RANGES = "x-amz-fwd-header-accept-ranges";

    String FWD_CACHE_CONTROL = "x-amz-fwd-header-Cache-Control";

    String FWD_CONTENT_DISPOSITION = "x-amz-fwd-header-Content-Disposition";

    String FWD_CONTENT_ENCODING = "x-amz-fwd-header-Content-Encoding";

    String FWD_CONTENT_LANGUAGE = "x-amz-fwd-header-Content-Language";

    String FWD_CONTENT_RANGE = "x-amz-fwd-header-Content-Range";

    String FWD_CONTENT_TYPE = "x-amz-fwd-header-Content-Type";

    String FWD_DELETE_MARKER = "x-amz-fwd-header-x-amz-delete-marker";

    String FWD_ETAG = "x-amz-fwd-header-ETag";

    String FWD_EXPIRES = "x-amz-fwd-header-Expires";

    String FWD_EXPIRATION = "x-amz-fwd-header-x-amz-expiration";

    String FWD_LAST_MODIFIED = "x-amz-fwd-header-Last-Modified";

    String FWD_MISSING_META = "x-amz-fwd-header-x-amz-missing-meta";

    String FWD_OBJECT_LOCK_MODE = "x-amz-fwd-header-x-amz-object-lock-mode";

    String FWD_OBJECT_LOCK_LEGAL_HOLD = "x-amz-fwd-header-x-amz-object-lock-legal-hold";

    String FWD_OBJECT_LOCK_RETAIN_UNTIL_DATE = "x-amz-fwd-header-x-amz-object-lock-retain-until-date";

    String FWD_PARTS_COUNT = "x-amz-fwd-header-x-amz-mp-parts-count";

    String FWD_REPLICATION_STATUS = "x-amz-fwd-header-x-amz-replication-status";

    String FWD_REQUEST_CHARGED = "x-amz-fwd-header-x-amz-request-charged";

    String FWD_RESTORE = "x-amz-fwd-header-x-amz-restore";

    String FWD_SERVER = "-amz-fwd-header-Server";

    String FWD_SERVER_SIDE_ENCRYPTION = "x-amz-fwd-header-x-amz-server-side-encryption";

    String FWD_SSE_CUSTOMER_ALGORITHM = "x-amz-fwd-header-x-amz-server-side-encryption-customer-algorithm";

    String FWD_SSE_KMS_KEY_ID = "x-amz-fwd-header-x-amz-server-side-encryption-aws-kms-key-id";

    String FWD_SSE_CUSTOMER_KEY_MD5 = "x-amz-fwd-header-x-amz-server-side-encryption-customer-key-MD5";

    String FWD_STORAGE_CLASS = "x-amz-fwd-header-x-amz-storage-class";

    String FWD_TAG_COUNT = "x-amz-fwd-header-x-amz-tagging-count";

    String FWD_VERSION_ID = "x-amz-fwd-header-x-amz-version-id";

    String FWD_SSE_BUCKET_KEY_ENABLED = "x-amz-fwd-header-x-amz-server-side-encryption-bucket-key-enabled";
}

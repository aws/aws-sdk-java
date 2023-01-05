/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the status of a sensitive data finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ClassificationResultStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassificationResultStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For example, the
     * object is an archive file that contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object is a
     * file that uses an unsupported format.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * A brief description of the status of the finding. This value is null if the status (code) of the finding is
     * COMPLETE.
     * </p>
     * <p>
     * Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact your
     * analysis of the finding and the affected S3 object. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARCHIVE_CONTAINS_UNPROCESSED_FILES - The object is an archive file and Macie extracted and analyzed only some or
     * none of the files in the archive. To determine which files Macie analyzed, if any, you can refer to the
     * corresponding sensitive data discovery result for the finding (ClassificationDetails.detailedResultsLocation).
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_EXCEEDS_SIZE_LIMIT - The object is an archive file whose total storage size exceeds the size quota for
     * this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_NESTING_LEVEL_OVER_LIMIT - The object is an archive file whose nested depth exceeds the quota for the
     * maximum number of nested levels that Macie analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_TOTAL_BYTES_EXTRACTED_OVER_LIMIT - The object is an archive file that exceeds the quota for the maximum
     * amount of data that Macie extracts and analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_TOTAL_DOCUMENTS_PROCESSED_OVER_LIMIT - The object is an archive file that contains more than the maximum
     * number of files that Macie extracts and analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * FILE_EXCEEDS_SIZE_LIMIT - The storage size of the object exceeds the size quota for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ENCRYPTION - The object is encrypted using server-side encryption but Macie isn’t allowed to use the key.
     * Macie can’t decrypt and analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_KMS_KEY - The object is encrypted with an KMS key that was disabled or is being deleted. Macie can’t
     * decrypt and analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_OBJECT_STATE - The object doesn’t use a supported Amazon S3 storage class. For more information, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/data-classification.html">Discovering sensitive data</a> in
     * the <i>Amazon Macie User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * JSON_NESTING_LEVEL_OVER_LIMIT - The object contains JSON data and the nested depth of the data exceeds the quota
     * for the number of nested levels that Macie analyzes for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * MALFORMED_FILE - The object is a malformed or corrupted file. An error occurred when Macie attempted to detect
     * the file’s type or extract data from the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_VERSION_MISMATCH - The object was changed while Macie was analyzing it.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_SUCH_BUCKET_AVAILABLE - The object was in a bucket that was deleted shortly before or when Macie attempted to
     * analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * MALFORMED_OR_FILE_SIZE_EXCEEDS_LIMIT - The object is a Microsoft Office file that is malformed or exceeds the
     * size quota for this type of file. If the file is malformed, an error occurred when Macie attempted to extract
     * data from the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OOXML_UNCOMPRESSED_SIZE_EXCEEDS_LIMIT - The object is an Office Open XML file that exceeds the size quota for
     * this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OOXML_UNCOMPRESSED_RATIO_EXCEEDS_LIMIT - The object is an Office Open XML file whose compression ratio exceeds
     * the compression quota for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMISSION_DENIED - Macie isn’t allowed to access the object. The object’s permissions settings prevent Macie
     * from analyzing the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * SOURCE_OBJECT_NO_LONGER_AVAILABLE - The object was deleted shortly before or when Macie attempted to analyze it.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNABLE_TO_PARSE_FILE - The object is a file that contains structured data and an error occurred when Macie
     * attempted to parse the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FILE_TYPE_EXCEPTION - The object is a file that uses an unsupported file or storage format. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/discovery-supported-formats.html">Supported file and storage
     * formats</a> in the <i>Amazon Macie User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about sensitive data discovery quotas for files, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/macie-quotas.html">Amazon Macie quotas</a> in the <i>Amazon
     * Macie User Guide</i>.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The status of the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For example, the
     * object is an archive file that contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object is a
     * file that uses an unsupported format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        <p>
     *        The status of the finding. Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For
     *        example, the object is an archive file that contains files in an unsupported format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object
     *        is a file that uses an unsupported format.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status of the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For example, the
     * object is an archive file that contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object is a
     * file that uses an unsupported format.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <p>
     *         The status of the finding. Possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For
     *         example, the object is an archive file that contains files in an unsupported format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object
     *         is a file that uses an unsupported format.
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The status of the finding. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For example, the
     * object is an archive file that contains files in an unsupported format.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object is a
     * file that uses an unsupported format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        <p>
     *        The status of the finding. Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        COMPLETE - Amazon Macie successfully completed its analysis of the S3 object that the finding applies to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PARTIAL - Macie analyzed only a subset of the data in the S3 object that the finding applies to. For
     *        example, the object is an archive file that contains files in an unsupported format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED - Macie wasn't able to analyze the S3 object that the finding applies to. For example, the object
     *        is a file that uses an unsupported format.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResultStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A brief description of the status of the finding. This value is null if the status (code) of the finding is
     * COMPLETE.
     * </p>
     * <p>
     * Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact your
     * analysis of the finding and the affected S3 object. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARCHIVE_CONTAINS_UNPROCESSED_FILES - The object is an archive file and Macie extracted and analyzed only some or
     * none of the files in the archive. To determine which files Macie analyzed, if any, you can refer to the
     * corresponding sensitive data discovery result for the finding (ClassificationDetails.detailedResultsLocation).
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_EXCEEDS_SIZE_LIMIT - The object is an archive file whose total storage size exceeds the size quota for
     * this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_NESTING_LEVEL_OVER_LIMIT - The object is an archive file whose nested depth exceeds the quota for the
     * maximum number of nested levels that Macie analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_TOTAL_BYTES_EXTRACTED_OVER_LIMIT - The object is an archive file that exceeds the quota for the maximum
     * amount of data that Macie extracts and analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_TOTAL_DOCUMENTS_PROCESSED_OVER_LIMIT - The object is an archive file that contains more than the maximum
     * number of files that Macie extracts and analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * FILE_EXCEEDS_SIZE_LIMIT - The storage size of the object exceeds the size quota for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ENCRYPTION - The object is encrypted using server-side encryption but Macie isn’t allowed to use the key.
     * Macie can’t decrypt and analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_KMS_KEY - The object is encrypted with an KMS key that was disabled or is being deleted. Macie can’t
     * decrypt and analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_OBJECT_STATE - The object doesn’t use a supported Amazon S3 storage class. For more information, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/data-classification.html">Discovering sensitive data</a> in
     * the <i>Amazon Macie User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * JSON_NESTING_LEVEL_OVER_LIMIT - The object contains JSON data and the nested depth of the data exceeds the quota
     * for the number of nested levels that Macie analyzes for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * MALFORMED_FILE - The object is a malformed or corrupted file. An error occurred when Macie attempted to detect
     * the file’s type or extract data from the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_VERSION_MISMATCH - The object was changed while Macie was analyzing it.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_SUCH_BUCKET_AVAILABLE - The object was in a bucket that was deleted shortly before or when Macie attempted to
     * analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * MALFORMED_OR_FILE_SIZE_EXCEEDS_LIMIT - The object is a Microsoft Office file that is malformed or exceeds the
     * size quota for this type of file. If the file is malformed, an error occurred when Macie attempted to extract
     * data from the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OOXML_UNCOMPRESSED_SIZE_EXCEEDS_LIMIT - The object is an Office Open XML file that exceeds the size quota for
     * this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OOXML_UNCOMPRESSED_RATIO_EXCEEDS_LIMIT - The object is an Office Open XML file whose compression ratio exceeds
     * the compression quota for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMISSION_DENIED - Macie isn’t allowed to access the object. The object’s permissions settings prevent Macie
     * from analyzing the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * SOURCE_OBJECT_NO_LONGER_AVAILABLE - The object was deleted shortly before or when Macie attempted to analyze it.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNABLE_TO_PARSE_FILE - The object is a file that contains structured data and an error occurred when Macie
     * attempted to parse the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FILE_TYPE_EXCEPTION - The object is a file that uses an unsupported file or storage format. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/discovery-supported-formats.html">Supported file and storage
     * formats</a> in the <i>Amazon Macie User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about sensitive data discovery quotas for files, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/macie-quotas.html">Amazon Macie quotas</a> in the <i>Amazon
     * Macie User Guide</i>.
     * </p>
     * 
     * @param reason
     *        A brief description of the status of the finding. This value is null if the status (code) of the finding
     *        is COMPLETE.</p>
     *        <p>
     *        Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact
     *        your analysis of the finding and the affected S3 object. Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARCHIVE_CONTAINS_UNPROCESSED_FILES - The object is an archive file and Macie extracted and analyzed only
     *        some or none of the files in the archive. To determine which files Macie analyzed, if any, you can refer
     *        to the corresponding sensitive data discovery result for the finding
     *        (ClassificationDetails.detailedResultsLocation).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVE_EXCEEDS_SIZE_LIMIT - The object is an archive file whose total storage size exceeds the size quota
     *        for this type of archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVE_NESTING_LEVEL_OVER_LIMIT - The object is an archive file whose nested depth exceeds the quota for
     *        the maximum number of nested levels that Macie analyzes for this type of archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVE_TOTAL_BYTES_EXTRACTED_OVER_LIMIT - The object is an archive file that exceeds the quota for the
     *        maximum amount of data that Macie extracts and analyzes for this type of archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVE_TOTAL_DOCUMENTS_PROCESSED_OVER_LIMIT - The object is an archive file that contains more than the
     *        maximum number of files that Macie extracts and analyzes for this type of archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FILE_EXCEEDS_SIZE_LIMIT - The storage size of the object exceeds the size quota for this type of file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_ENCRYPTION - The object is encrypted using server-side encryption but Macie isn’t allowed to use
     *        the key. Macie can’t decrypt and analyze the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_KMS_KEY - The object is encrypted with an KMS key that was disabled or is being deleted. Macie
     *        can’t decrypt and analyze the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_OBJECT_STATE - The object doesn’t use a supported Amazon S3 storage class. For more information,
     *        see <a href="https://docs.aws.amazon.com/macie/latest/user/data-classification.html">Discovering sensitive
     *        data</a> in the <i>Amazon Macie User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JSON_NESTING_LEVEL_OVER_LIMIT - The object contains JSON data and the nested depth of the data exceeds the
     *        quota for the number of nested levels that Macie analyzes for this type of file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MALFORMED_FILE - The object is a malformed or corrupted file. An error occurred when Macie attempted to
     *        detect the file’s type or extract data from the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_VERSION_MISMATCH - The object was changed while Macie was analyzing it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_SUCH_BUCKET_AVAILABLE - The object was in a bucket that was deleted shortly before or when Macie
     *        attempted to analyze the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MALFORMED_OR_FILE_SIZE_EXCEEDS_LIMIT - The object is a Microsoft Office file that is malformed or exceeds
     *        the size quota for this type of file. If the file is malformed, an error occurred when Macie attempted to
     *        extract data from the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OOXML_UNCOMPRESSED_SIZE_EXCEEDS_LIMIT - The object is an Office Open XML file that exceeds the size quota
     *        for this type of file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OOXML_UNCOMPRESSED_RATIO_EXCEEDS_LIMIT - The object is an Office Open XML file whose compression ratio
     *        exceeds the compression quota for this type of file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PERMISSION_DENIED - Macie isn’t allowed to access the object. The object’s permissions settings prevent
     *        Macie from analyzing the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SOURCE_OBJECT_NO_LONGER_AVAILABLE - The object was deleted shortly before or when Macie attempted to
     *        analyze it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNABLE_TO_PARSE_FILE - The object is a file that contains structured data and an error occurred when Macie
     *        attempted to parse the data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_FILE_TYPE_EXCEPTION - The object is a file that uses an unsupported file or storage format.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/macie/latest/user/discovery-supported-formats.html">Supported file and
     *        storage formats</a> in the <i>Amazon Macie User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For information about sensitive data discovery quotas for files, see <a
     *        href="https://docs.aws.amazon.com/macie/latest/user/macie-quotas.html">Amazon Macie quotas</a> in the
     *        <i>Amazon Macie User Guide</i>.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A brief description of the status of the finding. This value is null if the status (code) of the finding is
     * COMPLETE.
     * </p>
     * <p>
     * Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact your
     * analysis of the finding and the affected S3 object. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARCHIVE_CONTAINS_UNPROCESSED_FILES - The object is an archive file and Macie extracted and analyzed only some or
     * none of the files in the archive. To determine which files Macie analyzed, if any, you can refer to the
     * corresponding sensitive data discovery result for the finding (ClassificationDetails.detailedResultsLocation).
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_EXCEEDS_SIZE_LIMIT - The object is an archive file whose total storage size exceeds the size quota for
     * this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_NESTING_LEVEL_OVER_LIMIT - The object is an archive file whose nested depth exceeds the quota for the
     * maximum number of nested levels that Macie analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_TOTAL_BYTES_EXTRACTED_OVER_LIMIT - The object is an archive file that exceeds the quota for the maximum
     * amount of data that Macie extracts and analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_TOTAL_DOCUMENTS_PROCESSED_OVER_LIMIT - The object is an archive file that contains more than the maximum
     * number of files that Macie extracts and analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * FILE_EXCEEDS_SIZE_LIMIT - The storage size of the object exceeds the size quota for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ENCRYPTION - The object is encrypted using server-side encryption but Macie isn’t allowed to use the key.
     * Macie can’t decrypt and analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_KMS_KEY - The object is encrypted with an KMS key that was disabled or is being deleted. Macie can’t
     * decrypt and analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_OBJECT_STATE - The object doesn’t use a supported Amazon S3 storage class. For more information, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/data-classification.html">Discovering sensitive data</a> in
     * the <i>Amazon Macie User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * JSON_NESTING_LEVEL_OVER_LIMIT - The object contains JSON data and the nested depth of the data exceeds the quota
     * for the number of nested levels that Macie analyzes for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * MALFORMED_FILE - The object is a malformed or corrupted file. An error occurred when Macie attempted to detect
     * the file’s type or extract data from the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_VERSION_MISMATCH - The object was changed while Macie was analyzing it.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_SUCH_BUCKET_AVAILABLE - The object was in a bucket that was deleted shortly before or when Macie attempted to
     * analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * MALFORMED_OR_FILE_SIZE_EXCEEDS_LIMIT - The object is a Microsoft Office file that is malformed or exceeds the
     * size quota for this type of file. If the file is malformed, an error occurred when Macie attempted to extract
     * data from the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OOXML_UNCOMPRESSED_SIZE_EXCEEDS_LIMIT - The object is an Office Open XML file that exceeds the size quota for
     * this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OOXML_UNCOMPRESSED_RATIO_EXCEEDS_LIMIT - The object is an Office Open XML file whose compression ratio exceeds
     * the compression quota for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMISSION_DENIED - Macie isn’t allowed to access the object. The object’s permissions settings prevent Macie
     * from analyzing the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * SOURCE_OBJECT_NO_LONGER_AVAILABLE - The object was deleted shortly before or when Macie attempted to analyze it.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNABLE_TO_PARSE_FILE - The object is a file that contains structured data and an error occurred when Macie
     * attempted to parse the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FILE_TYPE_EXCEPTION - The object is a file that uses an unsupported file or storage format. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/discovery-supported-formats.html">Supported file and storage
     * formats</a> in the <i>Amazon Macie User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about sensitive data discovery quotas for files, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/macie-quotas.html">Amazon Macie quotas</a> in the <i>Amazon
     * Macie User Guide</i>.
     * </p>
     * 
     * @return A brief description of the status of the finding. This value is null if the status (code) of the finding
     *         is COMPLETE.</p>
     *         <p>
     *         Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact
     *         your analysis of the finding and the affected S3 object. Possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ARCHIVE_CONTAINS_UNPROCESSED_FILES - The object is an archive file and Macie extracted and analyzed only
     *         some or none of the files in the archive. To determine which files Macie analyzed, if any, you can refer
     *         to the corresponding sensitive data discovery result for the finding
     *         (ClassificationDetails.detailedResultsLocation).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARCHIVE_EXCEEDS_SIZE_LIMIT - The object is an archive file whose total storage size exceeds the size
     *         quota for this type of archive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARCHIVE_NESTING_LEVEL_OVER_LIMIT - The object is an archive file whose nested depth exceeds the quota for
     *         the maximum number of nested levels that Macie analyzes for this type of archive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARCHIVE_TOTAL_BYTES_EXTRACTED_OVER_LIMIT - The object is an archive file that exceeds the quota for the
     *         maximum amount of data that Macie extracts and analyzes for this type of archive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARCHIVE_TOTAL_DOCUMENTS_PROCESSED_OVER_LIMIT - The object is an archive file that contains more than the
     *         maximum number of files that Macie extracts and analyzes for this type of archive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FILE_EXCEEDS_SIZE_LIMIT - The storage size of the object exceeds the size quota for this type of file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ENCRYPTION - The object is encrypted using server-side encryption but Macie isn’t allowed to use
     *         the key. Macie can’t decrypt and analyze the object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_KMS_KEY - The object is encrypted with an KMS key that was disabled or is being deleted. Macie
     *         can’t decrypt and analyze the object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_OBJECT_STATE - The object doesn’t use a supported Amazon S3 storage class. For more information,
     *         see <a href="https://docs.aws.amazon.com/macie/latest/user/data-classification.html">Discovering
     *         sensitive data</a> in the <i>Amazon Macie User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         JSON_NESTING_LEVEL_OVER_LIMIT - The object contains JSON data and the nested depth of the data exceeds
     *         the quota for the number of nested levels that Macie analyzes for this type of file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MALFORMED_FILE - The object is a malformed or corrupted file. An error occurred when Macie attempted to
     *         detect the file’s type or extract data from the file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OBJECT_VERSION_MISMATCH - The object was changed while Macie was analyzing it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NO_SUCH_BUCKET_AVAILABLE - The object was in a bucket that was deleted shortly before or when Macie
     *         attempted to analyze the object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MALFORMED_OR_FILE_SIZE_EXCEEDS_LIMIT - The object is a Microsoft Office file that is malformed or exceeds
     *         the size quota for this type of file. If the file is malformed, an error occurred when Macie attempted to
     *         extract data from the file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OOXML_UNCOMPRESSED_SIZE_EXCEEDS_LIMIT - The object is an Office Open XML file that exceeds the size quota
     *         for this type of file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OOXML_UNCOMPRESSED_RATIO_EXCEEDS_LIMIT - The object is an Office Open XML file whose compression ratio
     *         exceeds the compression quota for this type of file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PERMISSION_DENIED - Macie isn’t allowed to access the object. The object’s permissions settings prevent
     *         Macie from analyzing the object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SOURCE_OBJECT_NO_LONGER_AVAILABLE - The object was deleted shortly before or when Macie attempted to
     *         analyze it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNABLE_TO_PARSE_FILE - The object is a file that contains structured data and an error occurred when
     *         Macie attempted to parse the data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNSUPPORTED_FILE_TYPE_EXCEPTION - The object is a file that uses an unsupported file or storage format.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/macie/latest/user/discovery-supported-formats.html">Supported file and
     *         storage formats</a> in the <i>Amazon Macie User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about sensitive data discovery quotas for files, see <a
     *         href="https://docs.aws.amazon.com/macie/latest/user/macie-quotas.html">Amazon Macie quotas</a> in the
     *         <i>Amazon Macie User Guide</i>.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A brief description of the status of the finding. This value is null if the status (code) of the finding is
     * COMPLETE.
     * </p>
     * <p>
     * Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact your
     * analysis of the finding and the affected S3 object. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARCHIVE_CONTAINS_UNPROCESSED_FILES - The object is an archive file and Macie extracted and analyzed only some or
     * none of the files in the archive. To determine which files Macie analyzed, if any, you can refer to the
     * corresponding sensitive data discovery result for the finding (ClassificationDetails.detailedResultsLocation).
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_EXCEEDS_SIZE_LIMIT - The object is an archive file whose total storage size exceeds the size quota for
     * this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_NESTING_LEVEL_OVER_LIMIT - The object is an archive file whose nested depth exceeds the quota for the
     * maximum number of nested levels that Macie analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_TOTAL_BYTES_EXTRACTED_OVER_LIMIT - The object is an archive file that exceeds the quota for the maximum
     * amount of data that Macie extracts and analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVE_TOTAL_DOCUMENTS_PROCESSED_OVER_LIMIT - The object is an archive file that contains more than the maximum
     * number of files that Macie extracts and analyzes for this type of archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * FILE_EXCEEDS_SIZE_LIMIT - The storage size of the object exceeds the size quota for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ENCRYPTION - The object is encrypted using server-side encryption but Macie isn’t allowed to use the key.
     * Macie can’t decrypt and analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_KMS_KEY - The object is encrypted with an KMS key that was disabled or is being deleted. Macie can’t
     * decrypt and analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_OBJECT_STATE - The object doesn’t use a supported Amazon S3 storage class. For more information, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/data-classification.html">Discovering sensitive data</a> in
     * the <i>Amazon Macie User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * JSON_NESTING_LEVEL_OVER_LIMIT - The object contains JSON data and the nested depth of the data exceeds the quota
     * for the number of nested levels that Macie analyzes for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * MALFORMED_FILE - The object is a malformed or corrupted file. An error occurred when Macie attempted to detect
     * the file’s type or extract data from the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_VERSION_MISMATCH - The object was changed while Macie was analyzing it.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_SUCH_BUCKET_AVAILABLE - The object was in a bucket that was deleted shortly before or when Macie attempted to
     * analyze the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * MALFORMED_OR_FILE_SIZE_EXCEEDS_LIMIT - The object is a Microsoft Office file that is malformed or exceeds the
     * size quota for this type of file. If the file is malformed, an error occurred when Macie attempted to extract
     * data from the file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OOXML_UNCOMPRESSED_SIZE_EXCEEDS_LIMIT - The object is an Office Open XML file that exceeds the size quota for
     * this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * OOXML_UNCOMPRESSED_RATIO_EXCEEDS_LIMIT - The object is an Office Open XML file whose compression ratio exceeds
     * the compression quota for this type of file.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMISSION_DENIED - Macie isn’t allowed to access the object. The object’s permissions settings prevent Macie
     * from analyzing the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * SOURCE_OBJECT_NO_LONGER_AVAILABLE - The object was deleted shortly before or when Macie attempted to analyze it.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNABLE_TO_PARSE_FILE - The object is a file that contains structured data and an error occurred when Macie
     * attempted to parse the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNSUPPORTED_FILE_TYPE_EXCEPTION - The object is a file that uses an unsupported file or storage format. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/discovery-supported-formats.html">Supported file and storage
     * formats</a> in the <i>Amazon Macie User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about sensitive data discovery quotas for files, see <a
     * href="https://docs.aws.amazon.com/macie/latest/user/macie-quotas.html">Amazon Macie quotas</a> in the <i>Amazon
     * Macie User Guide</i>.
     * </p>
     * 
     * @param reason
     *        A brief description of the status of the finding. This value is null if the status (code) of the finding
     *        is COMPLETE.</p>
     *        <p>
     *        Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact
     *        your analysis of the finding and the affected S3 object. Possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARCHIVE_CONTAINS_UNPROCESSED_FILES - The object is an archive file and Macie extracted and analyzed only
     *        some or none of the files in the archive. To determine which files Macie analyzed, if any, you can refer
     *        to the corresponding sensitive data discovery result for the finding
     *        (ClassificationDetails.detailedResultsLocation).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVE_EXCEEDS_SIZE_LIMIT - The object is an archive file whose total storage size exceeds the size quota
     *        for this type of archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVE_NESTING_LEVEL_OVER_LIMIT - The object is an archive file whose nested depth exceeds the quota for
     *        the maximum number of nested levels that Macie analyzes for this type of archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVE_TOTAL_BYTES_EXTRACTED_OVER_LIMIT - The object is an archive file that exceeds the quota for the
     *        maximum amount of data that Macie extracts and analyzes for this type of archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVE_TOTAL_DOCUMENTS_PROCESSED_OVER_LIMIT - The object is an archive file that contains more than the
     *        maximum number of files that Macie extracts and analyzes for this type of archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FILE_EXCEEDS_SIZE_LIMIT - The storage size of the object exceeds the size quota for this type of file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_ENCRYPTION - The object is encrypted using server-side encryption but Macie isn’t allowed to use
     *        the key. Macie can’t decrypt and analyze the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_KMS_KEY - The object is encrypted with an KMS key that was disabled or is being deleted. Macie
     *        can’t decrypt and analyze the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_OBJECT_STATE - The object doesn’t use a supported Amazon S3 storage class. For more information,
     *        see <a href="https://docs.aws.amazon.com/macie/latest/user/data-classification.html">Discovering sensitive
     *        data</a> in the <i>Amazon Macie User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JSON_NESTING_LEVEL_OVER_LIMIT - The object contains JSON data and the nested depth of the data exceeds the
     *        quota for the number of nested levels that Macie analyzes for this type of file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MALFORMED_FILE - The object is a malformed or corrupted file. An error occurred when Macie attempted to
     *        detect the file’s type or extract data from the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_VERSION_MISMATCH - The object was changed while Macie was analyzing it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_SUCH_BUCKET_AVAILABLE - The object was in a bucket that was deleted shortly before or when Macie
     *        attempted to analyze the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MALFORMED_OR_FILE_SIZE_EXCEEDS_LIMIT - The object is a Microsoft Office file that is malformed or exceeds
     *        the size quota for this type of file. If the file is malformed, an error occurred when Macie attempted to
     *        extract data from the file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OOXML_UNCOMPRESSED_SIZE_EXCEEDS_LIMIT - The object is an Office Open XML file that exceeds the size quota
     *        for this type of file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OOXML_UNCOMPRESSED_RATIO_EXCEEDS_LIMIT - The object is an Office Open XML file whose compression ratio
     *        exceeds the compression quota for this type of file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PERMISSION_DENIED - Macie isn’t allowed to access the object. The object’s permissions settings prevent
     *        Macie from analyzing the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SOURCE_OBJECT_NO_LONGER_AVAILABLE - The object was deleted shortly before or when Macie attempted to
     *        analyze it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNABLE_TO_PARSE_FILE - The object is a file that contains structured data and an error occurred when Macie
     *        attempted to parse the data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNSUPPORTED_FILE_TYPE_EXCEPTION - The object is a file that uses an unsupported file or storage format.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/macie/latest/user/discovery-supported-formats.html">Supported file and
     *        storage formats</a> in the <i>Amazon Macie User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For information about sensitive data discovery quotas for files, see <a
     *        href="https://docs.aws.amazon.com/macie/latest/user/macie-quotas.html">Amazon Macie quotas</a> in the
     *        <i>Amazon Macie User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResultStatus withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationResultStatus == false)
            return false;
        ClassificationResultStatus other = (ClassificationResultStatus) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public ClassificationResultStatus clone() {
        try {
            return (ClassificationResultStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ClassificationResultStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

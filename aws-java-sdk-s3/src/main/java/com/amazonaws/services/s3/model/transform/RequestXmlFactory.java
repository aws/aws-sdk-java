/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.CSVInput;
import com.amazonaws.services.s3.model.CSVOutput;
import com.amazonaws.services.s3.model.Encryption;
import com.amazonaws.services.s3.model.GlacierJobParameters;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.MetadataEntry;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.OutputLocation;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.RestoreObjectRequest;

import com.amazonaws.services.s3.model.S3Location;
import com.amazonaws.services.s3.model.SelectParameters;
import com.amazonaws.services.s3.model.Tag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RequestXmlFactory {

    /**
     * Converts the specified list of PartETags to an XML fragment that can be
     * sent to the CompleteMultipartUpload operation of Amazon S3.
     *
     * @param partETags
     *            The list of part ETags containing the data to include in the
     *            new XML fragment.
     *
     * @return A byte array containing the data
     */
    public static byte[] convertToXmlByteArray(List<PartETag> partETags) {
        XmlWriter xml = new XmlWriter();
        xml.start("CompleteMultipartUpload");
        if (partETags != null) {
            List<PartETag> sortedPartETags = new ArrayList<PartETag>(partETags);
            Collections.sort(sortedPartETags, new Comparator<PartETag>() {
                public int compare(PartETag tag1, PartETag tag2) {
                    if (tag1.getPartNumber() < tag2.getPartNumber()) return -1;
                    if (tag1.getPartNumber() > tag2.getPartNumber()) return 1;
                    return 0;
                }
            });

            for (PartETag partEtag : sortedPartETags) {
                xml.start("Part");
                xml.start("PartNumber").value(Integer.toString(partEtag.getPartNumber())).end();
                xml.start("ETag").value(partEtag.getETag()).end();
                xml.end();
            }
        }
        xml.end();

        return xml.getBytes();
    }

    /**
     * Converts the RestoreObjectRequest to an XML fragment that can be sent to
     * the RestoreObject operation of Amazon S3.
     *
     * @param restoreObjectRequest
     *            The container which provides options for restoring an object,
     *            which was transitioned to the Glacier from S3 when it was
     *            expired, into S3 again.
     *
     * @return A byte array containing the data
     *
     * @throws SdkClientException
     */
    public static byte[] convertToXmlByteArray(RestoreObjectRequest restoreObjectRequest) throws SdkClientException {

        XmlWriter xml = new XmlWriter();

        xml.start("RestoreRequest");
        if (restoreObjectRequest.getExpirationInDays() != -1) {
            xml.start("Days").value(Integer.toString(restoreObjectRequest.getExpirationInDays())).end();
        }

        final GlacierJobParameters glacierJobParameters = restoreObjectRequest.getGlacierJobParameters();
        if (glacierJobParameters != null) {
            xml.start("GlacierJobParameters");
            addIfNotNull(xml, "Tier", glacierJobParameters.getTier());
            xml.end();
        }
        addIfNotNull(xml, "Type", restoreObjectRequest.getType());
        addIfNotNull(xml, "Tier", restoreObjectRequest.getTier());
        addIfNotNull(xml, "Description", restoreObjectRequest.getDescription());

        addSelectParametersIfNotNull(xml, restoreObjectRequest.getSelectParameters());
        addOutputLocationIfNotNull(xml, restoreObjectRequest.getOutputLocation());
        xml.end();

        return xml.getBytes();
    }


    private static void addSelectParametersIfNotNull(XmlWriter xml, SelectParameters selectParameters) {
        if (selectParameters == null) {
            return;
        }

        xml.start("SelectParameters");

        if (selectParameters.getInputSerialization() != null) {
            xml.start("InputSerialization");
            if (selectParameters.getInputSerialization().getCsv() != null) {
                xml.start("CSV");
                CSVInput csvInput = selectParameters.getInputSerialization().getCsv();
                addIfNotNull(xml, "FileHeaderInfo", csvInput.getFileHeaderInfo());
                addIfNotNull(xml, "Comments", csvInput.getComments());
                addIfNotNull(xml, "QuoteEscapeCharacter", csvInput.getQuoteEscapeCharacter());
                addIfNotNull(xml, "RecordDelimiter", csvInput.getRecordDelimiter());
                addIfNotNull(xml, "FieldDelimiter", csvInput.getFieldDelimiter());
                addIfNotNull(xml, "QuoteCharacter", csvInput.getQuoteCharacter());
                xml.end();
            }
            xml.end();
        }

        addIfNotNull(xml, "ExpressionType", selectParameters.getExpressionType());
        addIfNotNull(xml, "Expression", selectParameters.getExpression());

        if (selectParameters.getOutputSerialization() != null) {
            xml.start("OutputSerialization");

            if (selectParameters.getOutputSerialization().getCsv() != null) {
                xml.start("CSV");
                CSVOutput csvOutput = selectParameters.getOutputSerialization().getCsv();
                addIfNotNull(xml, "QuoteFields", csvOutput.getQuoteFields());
                addIfNotNull(xml, "QuoteEscapeCharacter", csvOutput.getQuoteEscapeCharacter());
                addIfNotNull(xml, "RecordDelimiter", csvOutput.getRecordDelimiter());
                addIfNotNull(xml, "FieldDelimiter", csvOutput.getFieldDelimiter());
                addIfNotNull(xml, "QuoteCharacter", csvOutput.getQuoteCharacter());
                xml.end();
            }
            xml.end();
        }
        xml.end();
    }

    private static void addTaggingIfNotNull(XmlWriter xml, ObjectTagging tagSet) {
        if (tagSet == null) {
            return;
        }

        xml.start("Tagging");
        xml.start("TagSet");
        for(Tag tag : tagSet.getTagSet()) {
            xml.start("Tag");
            xml.start("Key").value(tag.getKey()).end();
            xml.start("Value").value(tag.getValue()).end();
            xml.end();
        }
        xml.end();
        xml.end();
    }

    private static void addOutputLocationIfNotNull(XmlWriter xml, OutputLocation outputLocation) {
        if (outputLocation == null) {
            return;
        }

        xml.start("OutputLocation");
        if (outputLocation.getS3() != null) {
            S3Location s3 = outputLocation.getS3();
            xml.start("S3");

            addIfNotNull(xml, "BucketName", s3.getBucketName());
            addIfNotNull(xml, "Prefix", s3.getPrefix());

            if (s3.getEncryption() != null) {
                Encryption encryption = s3.getEncryption();
                xml.start("Encryption");
                addIfNotNull(xml, "EncryptionType", encryption.getEncryptionType());
                addIfNotNull(xml, "KMSKeyId", encryption.getKmsKeyId());
                addIfNotNull(xml, "KMSContext", encryption.getKmsContext());
                xml.end();
            }
            addIfNotNull(xml, "CannedACL", s3.getCannedACL());
            addGrantsIfNotNull(xml, s3.getAccessControlList());
            addTaggingIfNotNull(xml, s3.getTagging());
            addIfNotNull(xml, "StorageClass", s3.getStorageClass());

            addUserMetaDataIfNotNull(xml, s3.getUserMetadata());

            xml.end();
        }

        xml.end();
    }

    private static void addGrantsIfNotNull(XmlWriter xml, AccessControlList accessControlList) {
        if (accessControlList == null) {
            return;
        }

        AclXmlFactory aclXmlFactory = new AclXmlFactory();
        xml.start("AccessControlList");

        for(Grant grant: accessControlList.getGrantsAsList()) {
            xml.start("Grant");
            if (grant.getGrantee() != null) {
                 aclXmlFactory.convertToXml(grant.getGrantee(), xml);
            }
            addIfNotNull(xml, "Permission", grant.getPermission());
            xml.end();
        }
        xml.end();
    }

    private static void addUserMetaDataIfNotNull(XmlWriter xml, List<MetadataEntry> userMetadata) {
        if (userMetadata == null || userMetadata.isEmpty()) {
            return;
        }

        xml.start("UserMetadata");
        for(MetadataEntry metadataEntry: userMetadata) {
            xml.start("MetadataEntry");
            addIfNotNull(xml, "Name", metadataEntry.getName());
            addIfNotNull(xml, "Value", metadataEntry.getValue());
            xml.end();
        }
        xml.end();
    }

    private static void addIfNotNull(XmlWriter xml, String xmlTag, String value) {
        if (value != null) {
            xml.start(xmlTag).value(value).end();
        }
    }

    private static void addIfNotNull(XmlWriter xml, String xmlTag, Object value) {
        if (value != null && value.toString() != null) {
            xml.start(xmlTag).value(value.toString()).end();
        }
    }
}

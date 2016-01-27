/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.RestoreObjectRequest;

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
     * @throws AmazonClientException
     */
    public static byte[] convertToXmlByteArray(RestoreObjectRequest restoreObjectRequest) throws AmazonClientException {
        XmlWriter xml = new XmlWriter();

        xml.start("RestoreRequest");
        xml.start("Days").value(Integer.toString(restoreObjectRequest.getExpirationInDays())).end();
        xml.end();

        return xml.getBytes();
    }
}

/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.InputStream;
import java.util.List;

import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.BucketCrossOriginConfigurationHandler;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.CompleteMultipartUploadHandler;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.CopyObjectResultHandler;
import com.amazonaws.transform.Unmarshaller;

/**
 * Collection of unmarshallers for S3 XML responses.
 */
public class Unmarshallers {

    /**
     * Unmarshaller for the ListBuckets XML response.
     */
    public static final class ListBucketsUnmarshaller implements
            Unmarshaller<List<Bucket>, InputStream> {
        public List<Bucket> unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseListMyBucketsResponse(in).getBuckets();
        }
    }

    /**
     * Unmarshaller for the ListBuckets XML response, parsing out the owner
     * even if the list is empty.
     */
    public static final class ListBucketsOwnerUnmarshaller implements
            Unmarshaller<Owner, InputStream> {
        public Owner unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseListMyBucketsResponse(in).getOwner();
        }
    }

    /**
     * Unmarshaller for the ListObjects XML response.
     */
    public static final class ListObjectsUnmarshaller implements
            Unmarshaller<ObjectListing, InputStream> {
        public ObjectListing unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseListBucketObjectsResponse(in).getObjectListing();
        }
    }

    /**
     * Unmarshaller for the ListVersions XML response.
     */
    public static final class VersionListUnmarshaller implements
            Unmarshaller<VersionListing, InputStream> {
        public VersionListing unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseListVersionsResponse(in).getListing();
        }
    }

    /**
     * Unmarshaller for the AccessControlList XML response.
     */
    public static final class AccessControlListUnmarshaller implements
            Unmarshaller<AccessControlList, InputStream> {
        public AccessControlList unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseAccessControlListResponse(in).getAccessControlList();
        }
    }

    /**
     * Unmarshaller for the BucketLoggingStatus XML response.
     */
    public static final class BucketLoggingConfigurationnmarshaller implements
            Unmarshaller<BucketLoggingConfiguration, InputStream> {
        public BucketLoggingConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseLoggingStatusResponse(in).getBucketLoggingConfiguration();
        }
    }

    /**
     * Unmarshaller for the BucketLocation XML response.
     */
    public static final class BucketLocationUnmarshaller implements
            Unmarshaller<String, InputStream> {
        public String unmarshall(InputStream in) throws Exception {
            String location = new XmlResponsesSaxParser()
                    .parseBucketLocationResponse(in);

            /*
             * S3 treats the US location differently, and assumes that if the
             * reported location is null, then it's a US bucket.
             */
            if (location == null) location = "US";

            return location;
        }
    }

    /**
     * Unmarshaller for the BucketVersionConfiguration XML response.
     */
    public static final class BucketVersioningConfigurationUnmarshaller implements
            Unmarshaller<BucketVersioningConfiguration, InputStream> {
        public BucketVersioningConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseVersioningConfigurationResponse(in).getConfiguration();
        }
    }

    /**
     * Unmarshaller for the BucketWebsiteConfiguration XML response.
     */
    public static final class BucketWebsiteConfigurationUnmarshaller implements
            Unmarshaller<BucketWebsiteConfiguration, InputStream> {
        public BucketWebsiteConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseWebsiteConfigurationResponse(in).getConfiguration();
        }
    }

    /**
     * Unmarshaller for the BucketNotificationConfiguration XML response.
     */
    public static final class BucketNotificationConfigurationUnmarshaller implements
            Unmarshaller<BucketNotificationConfiguration, InputStream> {
        public BucketNotificationConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseNotificationConfigurationResponse(in).getConfiguration();
        }
    }
    
    /**
     * Unmarshaller for the BucketTaggingConfiguration XML response.
     */
    public static final class BucketTaggingConfigurationUnmarshaller implements
            Unmarshaller<BucketTaggingConfiguration, InputStream> {
        public BucketTaggingConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseTaggingConfigurationResponse(in).getConfiguration();
        }
    }

    /**
     * Unmarshaller for the a direct InputStream response.
     */
    public static final class InputStreamUnmarshaller implements
           Unmarshaller<InputStream, InputStream> {
        public InputStream unmarshall(InputStream in) throws Exception {
            return in;
        }
    }

    /**
     * Unmarshaller for the CopyObject XML response.
     */
    public static final class CopyObjectUnmarshaller implements
            Unmarshaller<CopyObjectResultHandler, InputStream> {
        public CopyObjectResultHandler unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseCopyObjectResponse(in);
        }
    }

    public static final class CompleteMultipartUploadResultUnmarshaller implements
            Unmarshaller<CompleteMultipartUploadHandler, InputStream> {
        public CompleteMultipartUploadHandler unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseCompleteMultipartUploadResponse(in);
        }
    }

    public static final class InitiateMultipartUploadResultUnmarshaller implements
            Unmarshaller<InitiateMultipartUploadResult, InputStream> {
        public InitiateMultipartUploadResult unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseInitiateMultipartUploadResponse(in)
                .getInitiateMultipartUploadResult();
        }
    }

    public static final class ListMultipartUploadsResultUnmarshaller implements
            Unmarshaller<MultipartUploadListing, InputStream> {
        public MultipartUploadListing unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseListMultipartUploadsResponse(in)
                .getListMultipartUploadsResult();
        }
    }

    public static final class ListPartsResultUnmarshaller implements
        Unmarshaller<PartListing, InputStream> {
        public PartListing unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseListPartsResponse(in)
                .getListPartsResult();
        }
    }
    
    public static final class DeleteObjectsResultUnmarshaller implements
            Unmarshaller<DeleteObjectsResponse, InputStream> {

        public DeleteObjectsResponse unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseDeletedObjectsResult(in).getDeleteObjectResult();
        }
    }
    
    public static final class BucketLifecycleConfigurationUnmarshaller implements
            Unmarshaller<BucketLifecycleConfiguration, InputStream> {

        public BucketLifecycleConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseBucketLifecycleConfigurationResponse(in).getConfiguration();
        }
    }
    
    public static final class BucketCrossOriginConfigurationUnmarshaller implements
    	Unmarshaller<BucketCrossOriginConfiguration, InputStream> {
    	public BucketCrossOriginConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseBucketCrossOriginConfigurationResponse(in).getConfiguration();
        }
    }

}

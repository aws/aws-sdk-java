/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.XMLWriter;

/**
 * CreateJobRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequestMarshaller implements Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {

        if (createJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.POST);

        if (createJobRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(createJobRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/jobs";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("CreateJobRequest");
            if (createJobRequest != null) {

                if (createJobRequest.getConfirmationRequired() != null) {
                    xmlWriter.startElement("ConfirmationRequired").value(createJobRequest.getConfirmationRequired()).endElement();
                }

                {
                    JobOperation operation = createJobRequest.getOperation();
                    if (operation != null) {
                        xmlWriter.startElement("Operation");

                        {
                            LambdaInvokeOperation lambdaInvoke = operation.getLambdaInvoke();
                            if (lambdaInvoke != null) {
                                xmlWriter.startElement("LambdaInvoke");

                                if (lambdaInvoke.getFunctionArn() != null) {
                                    xmlWriter.startElement("FunctionArn").value(lambdaInvoke.getFunctionArn()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            S3CopyObjectOperation s3PutObjectCopy = operation.getS3PutObjectCopy();
                            if (s3PutObjectCopy != null) {
                                xmlWriter.startElement("S3PutObjectCopy");

                                if (s3PutObjectCopy.getTargetResource() != null) {
                                    xmlWriter.startElement("TargetResource").value(s3PutObjectCopy.getTargetResource()).endElement();
                                }

                                if (s3PutObjectCopy.getCannedAccessControlList() != null) {
                                    xmlWriter.startElement("CannedAccessControlList").value(s3PutObjectCopy.getCannedAccessControlList()).endElement();
                                }

                                java.util.List<S3Grant> s3CopyObjectOperationAccessControlGrantsList = s3PutObjectCopy.getAccessControlGrants();
                                if (s3CopyObjectOperationAccessControlGrantsList != null) {
                                    xmlWriter.startElement("AccessControlGrants");

                                    for (S3Grant s3CopyObjectOperationAccessControlGrantsListValue : s3CopyObjectOperationAccessControlGrantsList) {
                                        xmlWriter.startElement("member");

                                        {
                                            S3Grantee grantee = s3CopyObjectOperationAccessControlGrantsListValue.getGrantee();
                                            if (grantee != null) {
                                                xmlWriter.startElement("Grantee");

                                                if (grantee.getTypeIdentifier() != null) {
                                                    xmlWriter.startElement("TypeIdentifier").value(grantee.getTypeIdentifier()).endElement();
                                                }

                                                if (grantee.getIdentifier() != null) {
                                                    xmlWriter.startElement("Identifier").value(grantee.getIdentifier()).endElement();
                                                }

                                                if (grantee.getDisplayName() != null) {
                                                    xmlWriter.startElement("DisplayName").value(grantee.getDisplayName()).endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }

                                        if (s3CopyObjectOperationAccessControlGrantsListValue.getPermission() != null) {
                                            xmlWriter.startElement("Permission").value(s3CopyObjectOperationAccessControlGrantsListValue.getPermission())
                                                    .endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                if (s3PutObjectCopy.getMetadataDirective() != null) {
                                    xmlWriter.startElement("MetadataDirective").value(s3PutObjectCopy.getMetadataDirective()).endElement();
                                }

                                if (s3PutObjectCopy.getModifiedSinceConstraint() != null) {
                                    xmlWriter.startElement("ModifiedSinceConstraint").value(s3PutObjectCopy.getModifiedSinceConstraint()).endElement();
                                }

                                {
                                    S3ObjectMetadata newObjectMetadata = s3PutObjectCopy.getNewObjectMetadata();
                                    if (newObjectMetadata != null) {
                                        xmlWriter.startElement("NewObjectMetadata");

                                        if (newObjectMetadata.getCacheControl() != null) {
                                            xmlWriter.startElement("CacheControl").value(newObjectMetadata.getCacheControl()).endElement();
                                        }

                                        if (newObjectMetadata.getContentDisposition() != null) {
                                            xmlWriter.startElement("ContentDisposition").value(newObjectMetadata.getContentDisposition()).endElement();
                                        }

                                        if (newObjectMetadata.getContentEncoding() != null) {
                                            xmlWriter.startElement("ContentEncoding").value(newObjectMetadata.getContentEncoding()).endElement();
                                        }

                                        if (newObjectMetadata.getContentLanguage() != null) {
                                            xmlWriter.startElement("ContentLanguage").value(newObjectMetadata.getContentLanguage()).endElement();
                                        }

                                        java.util.HashMap<String, String> s3ObjectMetadataUserMetadataMap = (java.util.HashMap<String, String>) newObjectMetadata
                                                .getUserMetadata();
                                        if (s3ObjectMetadataUserMetadataMap != null) {
                                            xmlWriter.startElement("UserMetadata");

                                            for (Map.Entry<String, String> s3ObjectMetadataUserMetadataMapValue : s3ObjectMetadataUserMetadataMap.entrySet()) {
                                                xmlWriter.startElement("entry");
                                                xmlWriter.startElement("key");
                                                xmlWriter.value(s3ObjectMetadataUserMetadataMapValue.getKey());
                                                xmlWriter.endElement();
                                                xmlWriter.startElement("value");
                                                xmlWriter.value(s3ObjectMetadataUserMetadataMapValue.getValue());
                                                xmlWriter.endElement();
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }

                                        if (newObjectMetadata.getContentLength() != null) {
                                            xmlWriter.startElement("ContentLength").value(newObjectMetadata.getContentLength()).endElement();
                                        }

                                        if (newObjectMetadata.getContentMD5() != null) {
                                            xmlWriter.startElement("ContentMD5").value(newObjectMetadata.getContentMD5()).endElement();
                                        }

                                        if (newObjectMetadata.getContentType() != null) {
                                            xmlWriter.startElement("ContentType").value(newObjectMetadata.getContentType()).endElement();
                                        }

                                        if (newObjectMetadata.getHttpExpiresDate() != null) {
                                            xmlWriter.startElement("HttpExpiresDate").value(newObjectMetadata.getHttpExpiresDate()).endElement();
                                        }

                                        if (newObjectMetadata.getRequesterCharged() != null) {
                                            xmlWriter.startElement("RequesterCharged").value(newObjectMetadata.getRequesterCharged()).endElement();
                                        }

                                        if (newObjectMetadata.getSSEAlgorithm() != null) {
                                            xmlWriter.startElement("SSEAlgorithm").value(newObjectMetadata.getSSEAlgorithm()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                java.util.List<S3Tag> s3CopyObjectOperationNewObjectTaggingList = s3PutObjectCopy.getNewObjectTagging();
                                if (s3CopyObjectOperationNewObjectTaggingList != null) {
                                    xmlWriter.startElement("NewObjectTagging");

                                    for (S3Tag s3CopyObjectOperationNewObjectTaggingListValue : s3CopyObjectOperationNewObjectTaggingList) {
                                        xmlWriter.startElement("member");

                                        if (s3CopyObjectOperationNewObjectTaggingListValue.getKey() != null) {
                                            xmlWriter.startElement("Key").value(s3CopyObjectOperationNewObjectTaggingListValue.getKey()).endElement();
                                        }

                                        if (s3CopyObjectOperationNewObjectTaggingListValue.getValue() != null) {
                                            xmlWriter.startElement("Value").value(s3CopyObjectOperationNewObjectTaggingListValue.getValue()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                if (s3PutObjectCopy.getRedirectLocation() != null) {
                                    xmlWriter.startElement("RedirectLocation").value(s3PutObjectCopy.getRedirectLocation()).endElement();
                                }

                                if (s3PutObjectCopy.getRequesterPays() != null) {
                                    xmlWriter.startElement("RequesterPays").value(s3PutObjectCopy.getRequesterPays()).endElement();
                                }

                                if (s3PutObjectCopy.getStorageClass() != null) {
                                    xmlWriter.startElement("StorageClass").value(s3PutObjectCopy.getStorageClass()).endElement();
                                }

                                if (s3PutObjectCopy.getUnModifiedSinceConstraint() != null) {
                                    xmlWriter.startElement("UnModifiedSinceConstraint").value(s3PutObjectCopy.getUnModifiedSinceConstraint()).endElement();
                                }

                                if (s3PutObjectCopy.getSSEAwsKmsKeyId() != null) {
                                    xmlWriter.startElement("SSEAwsKmsKeyId").value(s3PutObjectCopy.getSSEAwsKmsKeyId()).endElement();
                                }

                                if (s3PutObjectCopy.getTargetKeyPrefix() != null) {
                                    xmlWriter.startElement("TargetKeyPrefix").value(s3PutObjectCopy.getTargetKeyPrefix()).endElement();
                                }

                                if (s3PutObjectCopy.getObjectLockLegalHoldStatus() != null) {
                                    xmlWriter.startElement("ObjectLockLegalHoldStatus").value(s3PutObjectCopy.getObjectLockLegalHoldStatus()).endElement();
                                }

                                if (s3PutObjectCopy.getObjectLockMode() != null) {
                                    xmlWriter.startElement("ObjectLockMode").value(s3PutObjectCopy.getObjectLockMode()).endElement();
                                }

                                if (s3PutObjectCopy.getObjectLockRetainUntilDate() != null) {
                                    xmlWriter.startElement("ObjectLockRetainUntilDate").value(s3PutObjectCopy.getObjectLockRetainUntilDate()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            S3SetObjectAclOperation s3PutObjectAcl = operation.getS3PutObjectAcl();
                            if (s3PutObjectAcl != null) {
                                xmlWriter.startElement("S3PutObjectAcl");

                                {
                                    S3AccessControlPolicy accessControlPolicy = s3PutObjectAcl.getAccessControlPolicy();
                                    if (accessControlPolicy != null) {
                                        xmlWriter.startElement("AccessControlPolicy");

                                        {
                                            S3AccessControlList accessControlList = accessControlPolicy.getAccessControlList();
                                            if (accessControlList != null) {
                                                xmlWriter.startElement("AccessControlList");

                                                {
                                                    S3ObjectOwner owner = accessControlList.getOwner();
                                                    if (owner != null) {
                                                        xmlWriter.startElement("Owner");

                                                        if (owner.getID() != null) {
                                                            xmlWriter.startElement("ID").value(owner.getID()).endElement();
                                                        }

                                                        if (owner.getDisplayName() != null) {
                                                            xmlWriter.startElement("DisplayName").value(owner.getDisplayName()).endElement();
                                                        }
                                                        xmlWriter.endElement();
                                                    }
                                                }

                                                java.util.List<S3Grant> s3AccessControlListGrantsList = accessControlList.getGrants();
                                                if (s3AccessControlListGrantsList != null) {
                                                    xmlWriter.startElement("Grants");

                                                    for (S3Grant s3AccessControlListGrantsListValue : s3AccessControlListGrantsList) {
                                                        xmlWriter.startElement("member");

                                                        {
                                                            S3Grantee grantee = s3AccessControlListGrantsListValue.getGrantee();
                                                            if (grantee != null) {
                                                                xmlWriter.startElement("Grantee");

                                                                if (grantee.getTypeIdentifier() != null) {
                                                                    xmlWriter.startElement("TypeIdentifier").value(grantee.getTypeIdentifier()).endElement();
                                                                }

                                                                if (grantee.getIdentifier() != null) {
                                                                    xmlWriter.startElement("Identifier").value(grantee.getIdentifier()).endElement();
                                                                }

                                                                if (grantee.getDisplayName() != null) {
                                                                    xmlWriter.startElement("DisplayName").value(grantee.getDisplayName()).endElement();
                                                                }
                                                                xmlWriter.endElement();
                                                            }
                                                        }

                                                        if (s3AccessControlListGrantsListValue.getPermission() != null) {
                                                            xmlWriter.startElement("Permission").value(s3AccessControlListGrantsListValue.getPermission())
                                                                    .endElement();
                                                        }
                                                        xmlWriter.endElement();
                                                    }
                                                    xmlWriter.endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }

                                        if (accessControlPolicy.getCannedAccessControlList() != null) {
                                            xmlWriter.startElement("CannedAccessControlList").value(accessControlPolicy.getCannedAccessControlList())
                                                    .endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            S3SetObjectTaggingOperation s3PutObjectTagging = operation.getS3PutObjectTagging();
                            if (s3PutObjectTagging != null) {
                                xmlWriter.startElement("S3PutObjectTagging");

                                java.util.List<S3Tag> s3SetObjectTaggingOperationTagSetList = s3PutObjectTagging.getTagSet();
                                if (s3SetObjectTaggingOperationTagSetList != null) {
                                    xmlWriter.startElement("TagSet");

                                    for (S3Tag s3SetObjectTaggingOperationTagSetListValue : s3SetObjectTaggingOperationTagSetList) {
                                        xmlWriter.startElement("member");

                                        if (s3SetObjectTaggingOperationTagSetListValue.getKey() != null) {
                                            xmlWriter.startElement("Key").value(s3SetObjectTaggingOperationTagSetListValue.getKey()).endElement();
                                        }

                                        if (s3SetObjectTaggingOperationTagSetListValue.getValue() != null) {
                                            xmlWriter.startElement("Value").value(s3SetObjectTaggingOperationTagSetListValue.getValue()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            S3InitiateRestoreObjectOperation s3InitiateRestoreObject = operation.getS3InitiateRestoreObject();
                            if (s3InitiateRestoreObject != null) {
                                xmlWriter.startElement("S3InitiateRestoreObject");

                                if (s3InitiateRestoreObject.getExpirationInDays() != null) {
                                    xmlWriter.startElement("ExpirationInDays").value(s3InitiateRestoreObject.getExpirationInDays()).endElement();
                                }

                                if (s3InitiateRestoreObject.getGlacierJobTier() != null) {
                                    xmlWriter.startElement("GlacierJobTier").value(s3InitiateRestoreObject.getGlacierJobTier()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }

                {
                    JobReport report = createJobRequest.getReport();
                    if (report != null) {
                        xmlWriter.startElement("Report");

                        if (report.getBucket() != null) {
                            xmlWriter.startElement("Bucket").value(report.getBucket()).endElement();
                        }

                        if (report.getFormat() != null) {
                            xmlWriter.startElement("Format").value(report.getFormat()).endElement();
                        }

                        if (report.getEnabled() != null) {
                            xmlWriter.startElement("Enabled").value(report.getEnabled()).endElement();
                        }

                        if (report.getPrefix() != null) {
                            xmlWriter.startElement("Prefix").value(report.getPrefix()).endElement();
                        }

                        if (report.getReportScope() != null) {
                            xmlWriter.startElement("ReportScope").value(report.getReportScope()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                xmlWriter.startElement("ClientRequestToken").value(IdempotentUtils.resolveString(createJobRequest.getClientRequestToken())).endElement();

                {
                    JobManifest manifest = createJobRequest.getManifest();
                    if (manifest != null) {
                        xmlWriter.startElement("Manifest");

                        {
                            JobManifestSpec spec = manifest.getSpec();
                            if (spec != null) {
                                xmlWriter.startElement("Spec");

                                if (spec.getFormat() != null) {
                                    xmlWriter.startElement("Format").value(spec.getFormat()).endElement();
                                }

                                java.util.List<String> jobManifestSpecFieldsList = spec.getFields();
                                if (jobManifestSpecFieldsList != null) {
                                    xmlWriter.startElement("Fields");

                                    for (String jobManifestSpecFieldsListValue : jobManifestSpecFieldsList) {
                                        xmlWriter.startElement("member");
                                        xmlWriter.value(jobManifestSpecFieldsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            JobManifestLocation location = manifest.getLocation();
                            if (location != null) {
                                xmlWriter.startElement("Location");

                                if (location.getObjectArn() != null) {
                                    xmlWriter.startElement("ObjectArn").value(location.getObjectArn()).endElement();
                                }

                                if (location.getObjectVersionId() != null) {
                                    xmlWriter.startElement("ObjectVersionId").value(location.getObjectVersionId()).endElement();
                                }

                                if (location.getETag() != null) {
                                    xmlWriter.startElement("ETag").value(location.getETag()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }

                if (createJobRequest.getDescription() != null) {
                    xmlWriter.startElement("Description").value(createJobRequest.getDescription()).endElement();
                }

                if (createJobRequest.getPriority() != null) {
                    xmlWriter.startElement("Priority").value(createJobRequest.getPriority()).endElement();
                }

                if (createJobRequest.getRoleArn() != null) {
                    xmlWriter.startElement("RoleArn").value(createJobRequest.getRoleArn()).endElement();
                }
            }
            xmlWriter.endElement();

            request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
            request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}

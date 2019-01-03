/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonFSx}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonFSx implements AmazonFSx {

    protected AbstractAmazonFSx() {
    }

    @Override
    public CreateBackupResult createBackup(CreateBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFileSystemResult createFileSystem(CreateFileSystemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateFileSystemFromBackupResult createFileSystemFromBackup(CreateFileSystemFromBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBackupResult deleteBackup(DeleteBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteFileSystemResult deleteFileSystem(DeleteFileSystemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBackupsResult describeBackups(DescribeBackupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFileSystemsResult describeFileSystems(DescribeFileSystemsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateFileSystemResult updateFileSystem(UpdateFileSystemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}

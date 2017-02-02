/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.transfer;

import com.amazonaws.services.s3.model.ObjectTagging;

import java.io.File;

/**
 * This is the callback interface which is used by TransferManager.uploadDirectory and
 * TransferManager.uploadFileList. The callback is invoked for each file that is uploaded by
 * <code>TransferManager</code> and given an opportunity to specify the tags for each file.
 */
public interface ObjectTaggingProvider {

    /**
     * This method is called for every file that is uploaded by <code>TransferManager</code>
     * and gives an opportunity to specify the tags for the file.
     *
     * @param file
	 * 			The file being uploaded.
	 *
	 * @return ObjectTagging
	 *          The ObjectTagging to be used in the PutObjectRequest withTagging call.
	 *
	 * {@link TransferManager#uploadDirectory}
	 */
    public ObjectTagging provideObjectTags(final File file);
}

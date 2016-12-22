/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds;

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.services.rds.model.CopyDBSnapshotRequest;
import com.amazonaws.services.rds.model.transform.CopyDBSnapshotRequestMarshaller;

import java.util.Date;

/**
 * Handler for pre-signing {@link CopyDBSnapshotRequest}.
 */
public class CopyDBSnapshotPresignHandler extends PresignRequestHandler<CopyDBSnapshotRequest> {

    public CopyDBSnapshotPresignHandler() {
        super(CopyDBSnapshotRequest.class);
    }

    @SdkTestInternalApi
    CopyDBSnapshotPresignHandler(Date signingOverrideDate) {
        super(CopyDBSnapshotRequest.class, signingOverrideDate);
    }

    @Override
    protected PresignableRequest adaptRequest(final CopyDBSnapshotRequest originalRequest) {
        return new PresignableRequest() {
            @Override
            public void setPreSignedUrl(String preSignedUrl) {
                originalRequest.setPreSignedUrl(preSignedUrl);
            }

            @Override
            public String getPreSignedUrl() {
                return originalRequest.getPreSignedUrl();
            }

            @Override
            public String getSourceRegion() {
                return originalRequest.getSourceRegion();
            }

            @Override
            public Request<?> marshall() {
                return new CopyDBSnapshotRequestMarshaller().marshall(originalRequest);
            }
        };
    }
}

/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.transfer;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.glacier.AmazonGlacier;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sqs.AmazonSQS;

/**
 * Internal class to wrap all params needed by {@link ArchiveTransferManager}.  Used by {@link
 * ArchiveTransferManagerBuilder}.
 */
@SdkInternalApi
class ArchiveTransferManagerParams {
    private AmazonGlacier amazonGlacier;

    private AmazonSQS amazonSQS;

    private AmazonSNS amazonSNS;

    public AmazonGlacier getAmazonGlacier() {
        return amazonGlacier;
    }

    public void setAmazonGlacier(AmazonGlacier amazonGlacier) {
        this.amazonGlacier = amazonGlacier;
    }

    public ArchiveTransferManagerParams withAmazonGlacier(AmazonGlacier amazonGlacier) {
        setAmazonGlacier(amazonGlacier);
        return this;
    }

    public AmazonSQS getAmazonSQS() {
        return amazonSQS;
    }

    public void setAmazonSQS(AmazonSQS amazonSQS) {
        this.amazonSQS = amazonSQS;
    }

    public ArchiveTransferManagerParams withAmazonSQS(AmazonSQS amazonSQS) {
        setAmazonSQS(amazonSQS);
        return this;
    }

    public AmazonSNS getAmazonSNS() {
        return amazonSNS;
    }

    public void setAmazonSNS(AmazonSNS amazonSNS) {
        this.amazonSNS = amazonSNS;
    }

    public ArchiveTransferManagerParams withAmazonSNS(AmazonSNS amazonSNS) {
        setAmazonSNS(amazonSNS);
        return this;
    }
}

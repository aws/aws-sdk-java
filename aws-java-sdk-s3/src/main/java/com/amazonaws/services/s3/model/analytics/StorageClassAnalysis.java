/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

public class StorageClassAnalysis implements Serializable {

    private StorageClassAnalysisDataExport dataExport;

    /**
     * Returns the container used to describe how data related to the
     * storage class analysis should be exported.
     */
    public StorageClassAnalysisDataExport getDataExport() {
        return dataExport;
    }

    /**
     * Sets the container used to describe how data related to the
     * storage class analysis should be exported.
     */
    public void setDataExport(StorageClassAnalysisDataExport dataExport) {
        this.dataExport = dataExport;
    }

    /**
     * Sets the container used to describe how data related to the
     * storage class analysis should be exported.
     *
     * Returns this object for method chaining.
     */
    public StorageClassAnalysis withDataExport(StorageClassAnalysisDataExport dataExport) {
        setDataExport(dataExport);
        return this;
    }
}

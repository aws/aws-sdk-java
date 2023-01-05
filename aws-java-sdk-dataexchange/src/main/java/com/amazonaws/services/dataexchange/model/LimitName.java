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
package com.amazonaws.services.dataexchange.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LimitName {

    ProductsPerAccount("Products per account"),
    DataSetsPerAccount("Data sets per account"),
    DataSetsPerProduct("Data sets per product"),
    RevisionsPerDataSet("Revisions per data set"),
    AssetsPerRevision("Assets per revision"),
    AssetsPerImportJobFromAmazonS3("Assets per import job from Amazon S3"),
    AssetPerExportJobFromAmazonS3("Asset per export job from Amazon S3"),
    AssetSizeInGB("Asset size in GB"),
    ConcurrentInProgressJobsToExportAssetsToAmazonS3("Concurrent in progress jobs to export assets to Amazon S3"),
    ConcurrentInProgressJobsToExportAssetsToASignedURL("Concurrent in progress jobs to export assets to a signed URL"),
    ConcurrentInProgressJobsToImportAssetsFromAmazonS3("Concurrent in progress jobs to import assets from Amazon S3"),
    ConcurrentInProgressJobsToImportAssetsFromASignedURL("Concurrent in progress jobs to import assets from a signed URL"),
    ConcurrentInProgressJobsToExportRevisionsToAmazonS3("Concurrent in progress jobs to export revisions to Amazon S3"),
    EventActionsPerAccount("Event actions per account"),
    AutoExportEventActionsPerDataSet("Auto export event actions per data set"),
    AmazonRedshiftDatashareAssetsPerImportJobFromRedshift("Amazon Redshift datashare assets per import job from Redshift"),
    ConcurrentInProgressJobsToImportAssetsFromAmazonRedshiftDatashares("Concurrent in progress jobs to import assets from Amazon Redshift datashares"),
    RevisionsPerAmazonRedshiftDatashareDataSet("Revisions per Amazon Redshift datashare data set"),
    AmazonRedshiftDatashareAssetsPerRevision("Amazon Redshift datashare assets per revision"),
    ConcurrentInProgressJobsToImportAssetsFromAnAPIGatewayAPI("Concurrent in progress jobs to import assets from an API Gateway API"),
    AmazonAPIGatewayAPIAssetsPerRevision("Amazon API Gateway API assets per revision"),
    RevisionsPerAmazonAPIGatewayAPIDataSet("Revisions per Amazon API Gateway API data set"),
    ConcurrentInProgressJobsToImportAssetsFromAnAWSLakeFormationTagPolicy("Concurrent in progress jobs to import assets from an AWS Lake Formation tag policy"),
    AWSLakeFormationDataPermissionAssetsPerRevision("AWS Lake Formation data permission assets per revision"),
    RevisionsPerAWSLakeFormationDataPermissionDataSet("Revisions per AWS Lake Formation data permission data set"),
    RevisionsPerAmazonS3DataAccessDataSet("Revisions per Amazon S3 data access data set"),
    AmazonS3DataAccessAssetsPerRevision("Amazon S3 data access assets per revision"),
    ConcurrentInProgressJobsToCreateAmazonS3DataAccessAssetsFromS3Buckets("Concurrent in progress jobs to create Amazon S3 data access assets from S3 buckets");

    private String value;

    private LimitName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return LimitName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LimitName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LimitName enumEntry : LimitName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

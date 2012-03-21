/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.examples.splitmerge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;

public class AverageCalculatorActivitiesImpl implements AverageCalculatorActivities {

    private static final int ROW_SIZE = 7;

    private final AmazonS3 storage;

    public AverageCalculatorActivitiesImpl(AmazonS3 storage) {
        this.storage = storage;
    }

    @Override
    public int computeDataSizeForInputData(String bucketName, String filename) {
        ObjectMetadata metadata = storage.getObjectMetadata(bucketName, filename);
        long size = metadata.getContentLength();
        return (int) size / ROW_SIZE;
    }

    @Override
    public int computeSumForChunk(String bucketName, String filename, int chunkNumber, int chunkSize) throws IOException {
        int sum = 0;
        int from = chunkNumber * chunkSize;
        int to = from + chunkSize;

        int offset = chunkNumber * chunkSize * ROW_SIZE;
        int bytesToRead = chunkSize * ROW_SIZE;

        // Create a request to download content for computing the sum for this chunk
        GetObjectRequest getRequest = new GetObjectRequest(bucketName, filename);
        getRequest.setRange(offset, offset + bytesToRead - 1);

        // Download content
        S3Object obj = storage.getObject(getRequest);
        InputStream inputStream = obj.getObjectContent();
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            String line = null;
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);

            // Compute sum for downloaded content
            while ((line = reader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
        }
        finally {
            if (reader != null)
                reader.close();
            if (inputStreamReader != null)
                inputStreamReader.close();
            if (inputStream != null)
                inputStream.close();
        }

        System.out.printf("Sum from '%d' to '%d' is: '%d'\n", from + 1, to, sum);
        return sum;
    }

    @Override
    public void reportResult(double average) {
        System.out.printf("Average is: %6.2f.\n", average);
    }

}

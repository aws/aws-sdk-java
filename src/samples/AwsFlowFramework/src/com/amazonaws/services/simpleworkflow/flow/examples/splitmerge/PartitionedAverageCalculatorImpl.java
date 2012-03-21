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

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.annotations.Wait;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public class PartitionedAverageCalculatorImpl implements PartitionedAverageCalculator {

    private final AverageCalculatorActivitiesClient client = new AverageCalculatorActivitiesClientImpl();

    private final int numberOfWorkers;
    
    private final String bucketName;

    public PartitionedAverageCalculatorImpl(int numberOfWorkers, String bucketName) {
        this.numberOfWorkers = numberOfWorkers;
        this.bucketName = bucketName;
    }

    @Override
    public Promise<Double> computeAverage(String inputFile) {
        Promise<Integer> dataSize = client.computeDataSizeForInputData(bucketName, inputFile);
        return computeAverageDistributed(inputFile, dataSize);
    }

    @Asynchronous
    private Promise<Double> computeAverageDistributed(String inputFile, Promise<Integer> dataSize) {
        int chunkSize = dataSize.get() / numberOfWorkers;

        // Create an array list to hold the result returned by each worker
        List<Promise<Integer>> results = new ArrayList<Promise<Integer>>();
        for (int chunkNumber = 0; chunkNumber < numberOfWorkers; chunkNumber++) {
            // Splitting computation for each chunk as separate activity
            results.add(client.computeSumForChunk(bucketName, inputFile, chunkNumber, chunkSize));
        }
        // Merge phase
        return mergeSumAndComputeAverage(results, dataSize.get());
    }
    
    @Asynchronous
    private Promise<Double> mergeSumAndComputeAverage(@Wait List<Promise<Integer>> results, int dataSize){
    	int totalSum = 0;
    	for(Promise<Integer> workerSum: results){
    	    totalSum += workerSum.get();
    	}
        return Promise.asPromise((double) totalSum / (double) dataSize);
    }
    
    @Override
    @Asynchronous
    public void reportResult(Promise<Double> result){
    	client.reportResult(result);
    }
    
}

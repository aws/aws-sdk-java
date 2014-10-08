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
package com.amazonaws.services.simpleworkflow.flow.worker;

public class ExponentialRetryParameters {

    private long initialInterval = 500;

    private double backoffCoefficient = 2.0d;

    private int maximumRetries = Integer.MAX_VALUE;

    private long expirationInterval = 60000;

    private long maximumRetryInterval = 20000;

    private int minimumRetries;
    
    public long getInitialInterval() {
        return initialInterval;
    }
    
    public void setInitialInterval(long initialInterval) {
        this.initialInterval = initialInterval;
    }

    public double getBackoffCoefficient() {
        return backoffCoefficient;
    }

    public void setBackoffCoefficient(double backoffCoefficient) {
        this.backoffCoefficient = backoffCoefficient;
    }

    public int getMaximumRetries() {
        return maximumRetries;
    }

    public void setMaximumRetries(int maximumRetries) {
        this.maximumRetries = maximumRetries;
    }

    public long getExpirationInterval() {
        return expirationInterval;
    }

    public void setExpirationInterval(long expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    public long getMaximumRetryInterval() {
        return maximumRetryInterval;
    }

    
    public void setMaximumRetryInterval(long maximumRetryInterval) {
        this.maximumRetryInterval = maximumRetryInterval;
    }

    
    public int getMinimumRetries() {
        return minimumRetries;
    }

    
    public void setMinimumRetries(int minimumRetries) {
        this.minimumRetries = minimumRetries;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(backoffCoefficient);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + (int) (expirationInterval ^ (expirationInterval >>> 32));
        result = prime * result + (int) (initialInterval ^ (initialInterval >>> 32));
        result = prime * result + maximumRetries;
        result = prime * result + (int) (maximumRetryInterval ^ (maximumRetryInterval >>> 32));
        result = prime * result + minimumRetries;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ExponentialRetryParameters other = (ExponentialRetryParameters) obj;
        if (Double.doubleToLongBits(backoffCoefficient) != Double.doubleToLongBits(other.backoffCoefficient))
            return false;
        if (expirationInterval != other.expirationInterval)
            return false;
        if (initialInterval != other.initialInterval)
            return false;
        if (maximumRetries != other.maximumRetries)
            return false;
        if (maximumRetryInterval != other.maximumRetryInterval)
            return false;
        if (minimumRetries != other.minimumRetries)
            return false;
        return true;
    }
    
}

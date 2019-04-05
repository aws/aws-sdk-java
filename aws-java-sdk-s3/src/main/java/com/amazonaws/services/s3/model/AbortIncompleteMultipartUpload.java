/*
 * Copyright 2016-2019 Amazon Technologies, Inc.
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
package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.
 */
public class AbortIncompleteMultipartUpload implements Serializable {

    /**
     * Indicates the number of days that must pass since initiation for Lifecycle to abort an Incomplete Multipart Upload.
     */
    private int daysAfterInitiation;

    public int getDaysAfterInitiation() {
        return daysAfterInitiation;
    }

    public void setDaysAfterInitiation(int daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
    }

    public AbortIncompleteMultipartUpload withDaysAfterInitiation(int daysAfterInitiation) {
        setDaysAfterInitiation(daysAfterInitiation);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbortIncompleteMultipartUpload that = (AbortIncompleteMultipartUpload) o;

        return daysAfterInitiation == that.daysAfterInitiation;
    }

    @Override
    public int hashCode() {
        return daysAfterInitiation;
    }

    @Override
    protected AbortIncompleteMultipartUpload clone() throws CloneNotSupportedException {
        try {
            return (AbortIncompleteMultipartUpload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

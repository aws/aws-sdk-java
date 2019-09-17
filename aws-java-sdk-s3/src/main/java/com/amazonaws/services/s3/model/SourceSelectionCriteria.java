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
package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Container for filters that define which source objects should be replicated.
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3-2006-03-01/SourceSelectionCriteria" target="_top">AWS API
 * Documentation</a>
 */
public class SourceSelectionCriteria implements Serializable, Cloneable {

    private SseKmsEncryptedObjects sseKmsEncryptedObjects;

    /**
     * @return Container for filter information of selection of KMS Encrypted S3 objects.
     */
    public SseKmsEncryptedObjects getSseKmsEncryptedObjects() {
        return sseKmsEncryptedObjects;
    }

    /**
     * Sets the container for filter information of selection of KMS Encrypted S3 objects.
     *
     * @param sseKmsEncryptedObjects New container.
     */
    public void setSseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    /**
     * Sets the container for filter information of selection of KMS Encrypted S3 objects.
     *
     * @param sseKmsEncryptedObjects New container.
     * @return This object for method chaining.
     */
    public SourceSelectionCriteria withSseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
        setSseKmsEncryptedObjects(sseKmsEncryptedObjects);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSseKmsEncryptedObjects() != null) {
            sb.append("SseKmsEncryptedObjects: ").append(getSseKmsEncryptedObjects()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof SourceSelectionCriteria == false) {
            return false;
        }
        SourceSelectionCriteria other = (SourceSelectionCriteria) obj;
        if (other.getSseKmsEncryptedObjects() == null ^ this.getSseKmsEncryptedObjects() == null) {
            return false;
        }
        if (other.getSseKmsEncryptedObjects() != null &&
            other.getSseKmsEncryptedObjects().equals(this.getSseKmsEncryptedObjects()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSseKmsEncryptedObjects() == null) ? 0 :
                                       getSseKmsEncryptedObjects().hashCode());
        return hashCode;
    }

    @Override
    public SourceSelectionCriteria clone() {
        try {
            return (SourceSelectionCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

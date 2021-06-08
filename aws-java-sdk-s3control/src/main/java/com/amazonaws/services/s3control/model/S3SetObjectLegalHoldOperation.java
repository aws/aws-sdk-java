/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration for an S3 Object Lock legal hold operation that an S3 Batch Operations job passes every
 * object to the underlying <code>PutObjectLegalHold</code> API. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-legal-hold.html">Using S3 Object Lock legal hold with
 * S3 Batch Operations</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3SetObjectLegalHoldOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3SetObjectLegalHoldOperation implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the Object Lock legal hold status to be applied to all objects in the Batch Operations job.
     * </p>
     */
    private S3ObjectLockLegalHold legalHold;

    /**
     * <p>
     * Contains the Object Lock legal hold status to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @param legalHold
     *        Contains the Object Lock legal hold status to be applied to all objects in the Batch Operations job.
     */

    public void setLegalHold(S3ObjectLockLegalHold legalHold) {
        this.legalHold = legalHold;
    }

    /**
     * <p>
     * Contains the Object Lock legal hold status to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @return Contains the Object Lock legal hold status to be applied to all objects in the Batch Operations job.
     */

    public S3ObjectLockLegalHold getLegalHold() {
        return this.legalHold;
    }

    /**
     * <p>
     * Contains the Object Lock legal hold status to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @param legalHold
     *        Contains the Object Lock legal hold status to be applied to all objects in the Batch Operations job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SetObjectLegalHoldOperation withLegalHold(S3ObjectLockLegalHold legalHold) {
        setLegalHold(legalHold);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLegalHold() != null)
            sb.append("LegalHold: ").append(getLegalHold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3SetObjectLegalHoldOperation == false)
            return false;
        S3SetObjectLegalHoldOperation other = (S3SetObjectLegalHoldOperation) obj;
        if (other.getLegalHold() == null ^ this.getLegalHold() == null)
            return false;
        if (other.getLegalHold() != null && other.getLegalHold().equals(this.getLegalHold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLegalHold() == null) ? 0 : getLegalHold().hashCode());
        return hashCode;
    }

    @Override
    public S3SetObjectLegalHoldOperation clone() {
        try {
            return (S3SetObjectLegalHoldOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

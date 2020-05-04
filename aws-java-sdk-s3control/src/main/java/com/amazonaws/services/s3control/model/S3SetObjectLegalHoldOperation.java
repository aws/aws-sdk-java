/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the configuration parameters for a Set Object Legal Hold operation. Amazon S3 Batch Operations passes each
 * value through to the underlying PUT Object Legal Hold API. For more information about the parameters for this
 * operation, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.htmll#object-lock-legal-holds">PUT Object
 * Legal Hold</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3SetObjectLegalHoldOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3SetObjectLegalHoldOperation implements Serializable, Cloneable {

    /**
     * <p>
     * The Legal Hold contains the status to be applied to all objects in the Batch Operations job.
     * </p>
     */
    private S3ObjectLockLegalHold legalHold;

    /**
     * <p>
     * The Legal Hold contains the status to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @param legalHold
     *        The Legal Hold contains the status to be applied to all objects in the Batch Operations job.
     */

    public void setLegalHold(S3ObjectLockLegalHold legalHold) {
        this.legalHold = legalHold;
    }

    /**
     * <p>
     * The Legal Hold contains the status to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @return The Legal Hold contains the status to be applied to all objects in the Batch Operations job.
     */

    public S3ObjectLockLegalHold getLegalHold() {
        return this.legalHold;
    }

    /**
     * <p>
     * The Legal Hold contains the status to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @param legalHold
     *        The Legal Hold contains the status to be applied to all objects in the Batch Operations job.
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

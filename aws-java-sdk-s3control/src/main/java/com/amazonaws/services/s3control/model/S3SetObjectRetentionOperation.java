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
 * Contains the configuration parameters for a Set Object Retention operation. Amazon S3 Batch Operations passes each
 * value through to the underlying PUT Object Retention API. For more information about the parameters for this
 * operation, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes">PUT
 * Object Retention</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3SetObjectRetentionOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3SetObjectRetentionOperation implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates if the operation should be applied to objects in the Batch Operations job even if they have
     * Governance-type Object Lock in place.
     * </p>
     */
    private Boolean bypassGovernanceRetention;
    /**
     * <p>
     * Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations
     * job.
     * </p>
     */
    private S3Retention retention;

    /**
     * <p>
     * Indicates if the operation should be applied to objects in the Batch Operations job even if they have
     * Governance-type Object Lock in place.
     * </p>
     * 
     * @param bypassGovernanceRetention
     *        Indicates if the operation should be applied to objects in the Batch Operations job even if they have
     *        Governance-type Object Lock in place.
     */

    public void setBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
    }

    /**
     * <p>
     * Indicates if the operation should be applied to objects in the Batch Operations job even if they have
     * Governance-type Object Lock in place.
     * </p>
     * 
     * @return Indicates if the operation should be applied to objects in the Batch Operations job even if they have
     *         Governance-type Object Lock in place.
     */

    public Boolean getBypassGovernanceRetention() {
        return this.bypassGovernanceRetention;
    }

    /**
     * <p>
     * Indicates if the operation should be applied to objects in the Batch Operations job even if they have
     * Governance-type Object Lock in place.
     * </p>
     * 
     * @param bypassGovernanceRetention
     *        Indicates if the operation should be applied to objects in the Batch Operations job even if they have
     *        Governance-type Object Lock in place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SetObjectRetentionOperation withBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        setBypassGovernanceRetention(bypassGovernanceRetention);
        return this;
    }

    /**
     * <p>
     * Indicates if the operation should be applied to objects in the Batch Operations job even if they have
     * Governance-type Object Lock in place.
     * </p>
     * 
     * @return Indicates if the operation should be applied to objects in the Batch Operations job even if they have
     *         Governance-type Object Lock in place.
     */

    public Boolean isBypassGovernanceRetention() {
        return this.bypassGovernanceRetention;
    }

    /**
     * <p>
     * Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations
     * job.
     * </p>
     * 
     * @param retention
     *        Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch
     *        Operations job.
     */

    public void setRetention(S3Retention retention) {
        this.retention = retention;
    }

    /**
     * <p>
     * Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations
     * job.
     * </p>
     * 
     * @return Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch
     *         Operations job.
     */

    public S3Retention getRetention() {
        return this.retention;
    }

    /**
     * <p>
     * Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations
     * job.
     * </p>
     * 
     * @param retention
     *        Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch
     *        Operations job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SetObjectRetentionOperation withRetention(S3Retention retention) {
        setRetention(retention);
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
        if (getBypassGovernanceRetention() != null)
            sb.append("BypassGovernanceRetention: ").append(getBypassGovernanceRetention()).append(",");
        if (getRetention() != null)
            sb.append("Retention: ").append(getRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3SetObjectRetentionOperation == false)
            return false;
        S3SetObjectRetentionOperation other = (S3SetObjectRetentionOperation) obj;
        if (other.getBypassGovernanceRetention() == null ^ this.getBypassGovernanceRetention() == null)
            return false;
        if (other.getBypassGovernanceRetention() != null && other.getBypassGovernanceRetention().equals(this.getBypassGovernanceRetention()) == false)
            return false;
        if (other.getRetention() == null ^ this.getRetention() == null)
            return false;
        if (other.getRetention() != null && other.getRetention().equals(this.getRetention()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBypassGovernanceRetention() == null) ? 0 : getBypassGovernanceRetention().hashCode());
        hashCode = prime * hashCode + ((getRetention() == null) ? 0 : getRetention().hashCode());
        return hashCode;
    }

    @Override
    public S3SetObjectRetentionOperation clone() {
        try {
            return (S3SetObjectRetentionOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

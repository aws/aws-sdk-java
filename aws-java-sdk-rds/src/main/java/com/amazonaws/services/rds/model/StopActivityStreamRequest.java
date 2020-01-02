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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopActivityStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopActivityStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example,
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example,
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example,
     *        <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example,
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example,
     *         <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example,
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example,
     *        <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopActivityStreamRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the
     *        maintenance window for the database.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @return Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the
     *         maintenance window for the database.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the
     *        maintenance window for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopActivityStreamRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @return Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the
     *         maintenance window for the database.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopActivityStreamRequest == false)
            return false;
        StopActivityStreamRequest other = (StopActivityStreamRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public StopActivityStreamRequest clone() {
        return (StopActivityStreamRequest) super.clone();
    }

}

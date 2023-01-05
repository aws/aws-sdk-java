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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the scaling configuration of an Aurora Serverless v2 DB cluster.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.html">Using Amazon Aurora
 * Serverless v2</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ServerlessV2ScalingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerlessV2ScalingConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can
     * specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest value that you can use is
     * 0.5.
     * </p>
     */
    private Double minCapacity;
    /**
     * <p>
     * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can
     * specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The largest value that you can use
     * is 128.
     * </p>
     */
    private Double maxCapacity;

    /**
     * <p>
     * The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can
     * specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest value that you can use is
     * 0.5.
     * </p>
     * 
     * @param minCapacity
     *        The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster.
     *        You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest value that
     *        you can use is 0.5.
     */

    public void setMinCapacity(Double minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can
     * specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest value that you can use is
     * 0.5.
     * </p>
     * 
     * @return The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster.
     *         You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest value that
     *         you can use is 0.5.
     */

    public Double getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * <p>
     * The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can
     * specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest value that you can use is
     * 0.5.
     * </p>
     * 
     * @param minCapacity
     *        The minimum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster.
     *        You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest value that
     *        you can use is 0.5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessV2ScalingConfiguration withMinCapacity(Double minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can
     * specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The largest value that you can use
     * is 128.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster.
     *        You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The largest value
     *        that you can use is 128.
     */

    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can
     * specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The largest value that you can use
     * is 128.
     * </p>
     * 
     * @return The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster.
     *         You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The largest value
     *         that you can use is 128.
     */

    public Double getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster. You can
     * specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The largest value that you can use
     * is 128.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of Aurora capacity units (ACUs) for a DB instance in an Aurora Serverless v2 cluster.
     *        You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The largest value
     *        that you can use is 128.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessV2ScalingConfiguration withMaxCapacity(Double maxCapacity) {
        setMaxCapacity(maxCapacity);
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
        if (getMinCapacity() != null)
            sb.append("MinCapacity: ").append(getMinCapacity()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerlessV2ScalingConfiguration == false)
            return false;
        ServerlessV2ScalingConfiguration other = (ServerlessV2ScalingConfiguration) obj;
        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        return hashCode;
    }

    @Override
    public ServerlessV2ScalingConfiguration clone() {
        try {
            return (ServerlessV2ScalingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the target engine for the specified source database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RecommendationData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommendation of a target Amazon RDS database engine.
     * </p>
     */
    private RdsRecommendation rdsEngine;

    /**
     * <p>
     * The recommendation of a target Amazon RDS database engine.
     * </p>
     * 
     * @param rdsEngine
     *        The recommendation of a target Amazon RDS database engine.
     */

    public void setRdsEngine(RdsRecommendation rdsEngine) {
        this.rdsEngine = rdsEngine;
    }

    /**
     * <p>
     * The recommendation of a target Amazon RDS database engine.
     * </p>
     * 
     * @return The recommendation of a target Amazon RDS database engine.
     */

    public RdsRecommendation getRdsEngine() {
        return this.rdsEngine;
    }

    /**
     * <p>
     * The recommendation of a target Amazon RDS database engine.
     * </p>
     * 
     * @param rdsEngine
     *        The recommendation of a target Amazon RDS database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationData withRdsEngine(RdsRecommendation rdsEngine) {
        setRdsEngine(rdsEngine);
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
        if (getRdsEngine() != null)
            sb.append("RdsEngine: ").append(getRdsEngine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationData == false)
            return false;
        RecommendationData other = (RecommendationData) obj;
        if (other.getRdsEngine() == null ^ this.getRdsEngine() == null)
            return false;
        if (other.getRdsEngine() != null && other.getRdsEngine().equals(this.getRdsEngine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRdsEngine() == null) ? 0 : getRdsEngine().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationData clone() {
        try {
            return (RecommendationData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.RecommendationDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

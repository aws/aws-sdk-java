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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetRecoveryPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecoveryPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the recovery point to return information for.
     * </p>
     */
    private String recoveryPointId;

    /**
     * <p>
     * The unique identifier of the recovery point to return information for.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point to return information for.
     */

    public void setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point to return information for.
     * </p>
     * 
     * @return The unique identifier of the recovery point to return information for.
     */

    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point to return information for.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point to return information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryPointRequest withRecoveryPointId(String recoveryPointId) {
        setRecoveryPointId(recoveryPointId);
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
        if (getRecoveryPointId() != null)
            sb.append("RecoveryPointId: ").append(getRecoveryPointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecoveryPointRequest == false)
            return false;
        GetRecoveryPointRequest other = (GetRecoveryPointRequest) obj;
        if (other.getRecoveryPointId() == null ^ this.getRecoveryPointId() == null)
            return false;
        if (other.getRecoveryPointId() != null && other.getRecoveryPointId().equals(this.getRecoveryPointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryPointId() == null) ? 0 : getRecoveryPointId().hashCode());
        return hashCode;
    }

    @Override
    public GetRecoveryPointRequest clone() {
        return (GetRecoveryPointRequest) super.clone();
    }

}

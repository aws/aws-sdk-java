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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Output of a get workload call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetWorkload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkloadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Workload workload;

    /**
     * @param workload
     */

    public void setWorkload(Workload workload) {
        this.workload = workload;
    }

    /**
     * @return
     */

    public Workload getWorkload() {
        return this.workload;
    }

    /**
     * @param workload
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkloadResult withWorkload(Workload workload) {
        setWorkload(workload);
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
        if (getWorkload() != null)
            sb.append("Workload: ").append(getWorkload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkloadResult == false)
            return false;
        GetWorkloadResult other = (GetWorkloadResult) obj;
        if (other.getWorkload() == null ^ this.getWorkload() == null)
            return false;
        if (other.getWorkload() != null && other.getWorkload().equals(this.getWorkload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkload() == null) ? 0 : getWorkload().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkloadResult clone() {
        try {
            return (GetWorkloadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

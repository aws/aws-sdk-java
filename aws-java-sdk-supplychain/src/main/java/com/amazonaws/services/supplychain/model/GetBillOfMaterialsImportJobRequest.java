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
package com.amazonaws.services.supplychain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request parameters for GetBillOfMaterialsImportJob.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/GetBillOfMaterialsImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBillOfMaterialsImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The BillOfMaterialsImportJob identifier.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     * 
     * @param instanceId
     *        The AWS Supply Chain instance identifier.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     * 
     * @return The AWS Supply Chain instance identifier.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     * 
     * @param instanceId
     *        The AWS Supply Chain instance identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBillOfMaterialsImportJobRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob identifier.
     * </p>
     * 
     * @param jobId
     *        The BillOfMaterialsImportJob identifier.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob identifier.
     * </p>
     * 
     * @return The BillOfMaterialsImportJob identifier.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob identifier.
     * </p>
     * 
     * @param jobId
     *        The BillOfMaterialsImportJob identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBillOfMaterialsImportJobRequest withJobId(String jobId) {
        setJobId(jobId);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBillOfMaterialsImportJobRequest == false)
            return false;
        GetBillOfMaterialsImportJobRequest other = (GetBillOfMaterialsImportJobRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public GetBillOfMaterialsImportJobRequest clone() {
        return (GetBillOfMaterialsImportJobRequest) super.clone();
    }

}

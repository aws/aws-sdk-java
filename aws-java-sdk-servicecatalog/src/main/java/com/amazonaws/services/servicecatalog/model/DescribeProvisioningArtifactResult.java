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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningArtifact"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProvisioningArtifactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the provisioning artifact.
     * </p>
     */
    private ProvisioningArtifactDetail provisioningArtifactDetail;
    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3 or GitHub in JSON format.
     * </p>
     */
    private java.util.Map<String, String> info;
    /**
     * <p>
     * The status of the current request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     */
    private java.util.List<ProvisioningArtifactParameter> provisioningArtifactParameters;

    /**
     * <p>
     * Information about the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactDetail
     *        Information about the provisioning artifact.
     */

    public void setProvisioningArtifactDetail(ProvisioningArtifactDetail provisioningArtifactDetail) {
        this.provisioningArtifactDetail = provisioningArtifactDetail;
    }

    /**
     * <p>
     * Information about the provisioning artifact.
     * </p>
     * 
     * @return Information about the provisioning artifact.
     */

    public ProvisioningArtifactDetail getProvisioningArtifactDetail() {
        return this.provisioningArtifactDetail;
    }

    /**
     * <p>
     * Information about the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactDetail
     *        Information about the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactResult withProvisioningArtifactDetail(ProvisioningArtifactDetail provisioningArtifactDetail) {
        setProvisioningArtifactDetail(provisioningArtifactDetail);
        return this;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3 or GitHub in JSON format.
     * </p>
     * 
     * @return The URL of the CloudFormation template in Amazon S3 or GitHub in JSON format.
     */

    public java.util.Map<String, String> getInfo() {
        return info;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3 or GitHub in JSON format.
     * </p>
     * 
     * @param info
     *        The URL of the CloudFormation template in Amazon S3 or GitHub in JSON format.
     */

    public void setInfo(java.util.Map<String, String> info) {
        this.info = info;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3 or GitHub in JSON format.
     * </p>
     * 
     * @param info
     *        The URL of the CloudFormation template in Amazon S3 or GitHub in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactResult withInfo(java.util.Map<String, String> info) {
        setInfo(info);
        return this;
    }

    /**
     * Add a single Info entry
     *
     * @see DescribeProvisioningArtifactResult#withInfo
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactResult addInfoEntry(String key, String value) {
        if (null == this.info) {
            this.info = new java.util.HashMap<String, String>();
        }
        if (this.info.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.info.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Info.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactResult clearInfoEntries() {
        this.info = null;
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @return The status of the current request.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DescribeProvisioningArtifactResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @see Status
     */

    public void setStatus(Status status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DescribeProvisioningArtifactResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     * 
     * @return Information about the parameters used to provision the product.
     */

    public java.util.List<ProvisioningArtifactParameter> getProvisioningArtifactParameters() {
        return provisioningArtifactParameters;
    }

    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        Information about the parameters used to provision the product.
     */

    public void setProvisioningArtifactParameters(java.util.Collection<ProvisioningArtifactParameter> provisioningArtifactParameters) {
        if (provisioningArtifactParameters == null) {
            this.provisioningArtifactParameters = null;
            return;
        }

        this.provisioningArtifactParameters = new java.util.ArrayList<ProvisioningArtifactParameter>(provisioningArtifactParameters);
    }

    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningArtifactParameters(java.util.Collection)} or
     * {@link #withProvisioningArtifactParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        Information about the parameters used to provision the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactResult withProvisioningArtifactParameters(ProvisioningArtifactParameter... provisioningArtifactParameters) {
        if (this.provisioningArtifactParameters == null) {
            setProvisioningArtifactParameters(new java.util.ArrayList<ProvisioningArtifactParameter>(provisioningArtifactParameters.length));
        }
        for (ProvisioningArtifactParameter ele : provisioningArtifactParameters) {
            this.provisioningArtifactParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        Information about the parameters used to provision the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningArtifactResult withProvisioningArtifactParameters(
            java.util.Collection<ProvisioningArtifactParameter> provisioningArtifactParameters) {
        setProvisioningArtifactParameters(provisioningArtifactParameters);
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
        if (getProvisioningArtifactDetail() != null)
            sb.append("ProvisioningArtifactDetail: ").append(getProvisioningArtifactDetail()).append(",");
        if (getInfo() != null)
            sb.append("Info: ").append(getInfo()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProvisioningArtifactParameters() != null)
            sb.append("ProvisioningArtifactParameters: ").append(getProvisioningArtifactParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisioningArtifactResult == false)
            return false;
        DescribeProvisioningArtifactResult other = (DescribeProvisioningArtifactResult) obj;
        if (other.getProvisioningArtifactDetail() == null ^ this.getProvisioningArtifactDetail() == null)
            return false;
        if (other.getProvisioningArtifactDetail() != null && other.getProvisioningArtifactDetail().equals(this.getProvisioningArtifactDetail()) == false)
            return false;
        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProvisioningArtifactParameters() == null ^ this.getProvisioningArtifactParameters() == null)
            return false;
        if (other.getProvisioningArtifactParameters() != null
                && other.getProvisioningArtifactParameters().equals(this.getProvisioningArtifactParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisioningArtifactDetail() == null) ? 0 : getProvisioningArtifactDetail().hashCode());
        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactParameters() == null) ? 0 : getProvisioningArtifactParameters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisioningArtifactResult clone() {
        try {
            return (DescribeProvisioningArtifactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.marketplacecommerceanalytics.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the GenerateDataSet operation.
 */
public class GenerateDataSetRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    private String dataSetType;

    private java.util.Date dataSetPublicationDate;

    private String roleNameArn;

    private String destinationS3BucketName;

    private String destinationS3Prefix;

    private String snsTopicArn;

    /**
     * @param dataSetType
     * @see DataSetType
     */
    public void setDataSetType(String dataSetType) {
        this.dataSetType = dataSetType;
    }

    /**
     * @return
     * @see DataSetType
     */
    public String getDataSetType() {
        return this.dataSetType;
    }

    /**
     * @param dataSetType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DataSetType
     */
    public GenerateDataSetRequest withDataSetType(String dataSetType) {
        setDataSetType(dataSetType);
        return this;
    }

    /**
     * @param dataSetType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DataSetType
     */
    public void setDataSetType(DataSetType dataSetType) {
        this.dataSetType = dataSetType.toString();
    }

    /**
     * @param dataSetType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DataSetType
     */
    public GenerateDataSetRequest withDataSetType(DataSetType dataSetType) {
        setDataSetType(dataSetType);
        return this;
    }

    /**
     * @param dataSetPublicationDate
     */
    public void setDataSetPublicationDate(java.util.Date dataSetPublicationDate) {
        this.dataSetPublicationDate = dataSetPublicationDate;
    }

    /**
     * @return
     */
    public java.util.Date getDataSetPublicationDate() {
        return this.dataSetPublicationDate;
    }

    /**
     * @param dataSetPublicationDate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataSetRequest withDataSetPublicationDate(
            java.util.Date dataSetPublicationDate) {
        setDataSetPublicationDate(dataSetPublicationDate);
        return this;
    }

    /**
     * @param roleNameArn
     */
    public void setRoleNameArn(String roleNameArn) {
        this.roleNameArn = roleNameArn;
    }

    /**
     * @return
     */
    public String getRoleNameArn() {
        return this.roleNameArn;
    }

    /**
     * @param roleNameArn
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataSetRequest withRoleNameArn(String roleNameArn) {
        setRoleNameArn(roleNameArn);
        return this;
    }

    /**
     * @param destinationS3BucketName
     */
    public void setDestinationS3BucketName(String destinationS3BucketName) {
        this.destinationS3BucketName = destinationS3BucketName;
    }

    /**
     * @return
     */
    public String getDestinationS3BucketName() {
        return this.destinationS3BucketName;
    }

    /**
     * @param destinationS3BucketName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataSetRequest withDestinationS3BucketName(
            String destinationS3BucketName) {
        setDestinationS3BucketName(destinationS3BucketName);
        return this;
    }

    /**
     * @param destinationS3Prefix
     */
    public void setDestinationS3Prefix(String destinationS3Prefix) {
        this.destinationS3Prefix = destinationS3Prefix;
    }

    /**
     * @return
     */
    public String getDestinationS3Prefix() {
        return this.destinationS3Prefix;
    }

    /**
     * @param destinationS3Prefix
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataSetRequest withDestinationS3Prefix(
            String destinationS3Prefix) {
        setDestinationS3Prefix(destinationS3Prefix);
        return this;
    }

    /**
     * @param snsTopicArn
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * @return
     */
    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * @param snsTopicArn
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateDataSetRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataSetType() != null)
            sb.append("DataSetType: " + getDataSetType() + ",");
        if (getDataSetPublicationDate() != null)
            sb.append("DataSetPublicationDate: " + getDataSetPublicationDate()
                    + ",");
        if (getRoleNameArn() != null)
            sb.append("RoleNameArn: " + getRoleNameArn() + ",");
        if (getDestinationS3BucketName() != null)
            sb.append("DestinationS3BucketName: "
                    + getDestinationS3BucketName() + ",");
        if (getDestinationS3Prefix() != null)
            sb.append("DestinationS3Prefix: " + getDestinationS3Prefix() + ",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: " + getSnsTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateDataSetRequest == false)
            return false;
        GenerateDataSetRequest other = (GenerateDataSetRequest) obj;
        if (other.getDataSetType() == null ^ this.getDataSetType() == null)
            return false;
        if (other.getDataSetType() != null
                && other.getDataSetType().equals(this.getDataSetType()) == false)
            return false;
        if (other.getDataSetPublicationDate() == null
                ^ this.getDataSetPublicationDate() == null)
            return false;
        if (other.getDataSetPublicationDate() != null
                && other.getDataSetPublicationDate().equals(
                        this.getDataSetPublicationDate()) == false)
            return false;
        if (other.getRoleNameArn() == null ^ this.getRoleNameArn() == null)
            return false;
        if (other.getRoleNameArn() != null
                && other.getRoleNameArn().equals(this.getRoleNameArn()) == false)
            return false;
        if (other.getDestinationS3BucketName() == null
                ^ this.getDestinationS3BucketName() == null)
            return false;
        if (other.getDestinationS3BucketName() != null
                && other.getDestinationS3BucketName().equals(
                        this.getDestinationS3BucketName()) == false)
            return false;
        if (other.getDestinationS3Prefix() == null
                ^ this.getDestinationS3Prefix() == null)
            return false;
        if (other.getDestinationS3Prefix() != null
                && other.getDestinationS3Prefix().equals(
                        this.getDestinationS3Prefix()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null
                && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDataSetType() == null) ? 0 : getDataSetType().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataSetPublicationDate() == null) ? 0
                        : getDataSetPublicationDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getRoleNameArn() == null) ? 0 : getRoleNameArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationS3BucketName() == null) ? 0
                        : getDestinationS3BucketName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationS3Prefix() == null) ? 0
                        : getDestinationS3Prefix().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public GenerateDataSetRequest clone() {
        return (GenerateDataSetRequest) super.clone();
    }
}
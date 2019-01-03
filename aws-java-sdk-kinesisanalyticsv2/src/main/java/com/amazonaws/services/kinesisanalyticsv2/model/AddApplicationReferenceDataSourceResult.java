/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationReferenceDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationReferenceDataSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application is
     * updated.
     * </p>
     */
    private Long applicationVersionId;
    /**
     * <p>
     * Describes reference data sources configured for the application.
     * </p>
     */
    private java.util.List<ReferenceDataSourceDescription> referenceDataSourceDescriptions;

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationARN
     *        The application Amazon Resource Name (ARN).
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The application Amazon Resource Name (ARN).
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationARN
     *        The application Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationReferenceDataSourceResult withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application is
     * updated.
     * </p>
     * 
     * @param applicationVersionId
     *        The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application
     *        is updated.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application is
     * updated.
     * </p>
     * 
     * @return The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application
     *         is updated.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application is
     * updated.
     * </p>
     * 
     * @param applicationVersionId
     *        The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application
     *        is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationReferenceDataSourceResult withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * <p>
     * Describes reference data sources configured for the application.
     * </p>
     * 
     * @return Describes reference data sources configured for the application.
     */

    public java.util.List<ReferenceDataSourceDescription> getReferenceDataSourceDescriptions() {
        return referenceDataSourceDescriptions;
    }

    /**
     * <p>
     * Describes reference data sources configured for the application.
     * </p>
     * 
     * @param referenceDataSourceDescriptions
     *        Describes reference data sources configured for the application.
     */

    public void setReferenceDataSourceDescriptions(java.util.Collection<ReferenceDataSourceDescription> referenceDataSourceDescriptions) {
        if (referenceDataSourceDescriptions == null) {
            this.referenceDataSourceDescriptions = null;
            return;
        }

        this.referenceDataSourceDescriptions = new java.util.ArrayList<ReferenceDataSourceDescription>(referenceDataSourceDescriptions);
    }

    /**
     * <p>
     * Describes reference data sources configured for the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceDataSourceDescriptions(java.util.Collection)} or
     * {@link #withReferenceDataSourceDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param referenceDataSourceDescriptions
     *        Describes reference data sources configured for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationReferenceDataSourceResult withReferenceDataSourceDescriptions(ReferenceDataSourceDescription... referenceDataSourceDescriptions) {
        if (this.referenceDataSourceDescriptions == null) {
            setReferenceDataSourceDescriptions(new java.util.ArrayList<ReferenceDataSourceDescription>(referenceDataSourceDescriptions.length));
        }
        for (ReferenceDataSourceDescription ele : referenceDataSourceDescriptions) {
            this.referenceDataSourceDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes reference data sources configured for the application.
     * </p>
     * 
     * @param referenceDataSourceDescriptions
     *        Describes reference data sources configured for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationReferenceDataSourceResult withReferenceDataSourceDescriptions(
            java.util.Collection<ReferenceDataSourceDescription> referenceDataSourceDescriptions) {
        setReferenceDataSourceDescriptions(referenceDataSourceDescriptions);
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
        if (getApplicationARN() != null)
            sb.append("ApplicationARN: ").append(getApplicationARN()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId()).append(",");
        if (getReferenceDataSourceDescriptions() != null)
            sb.append("ReferenceDataSourceDescriptions: ").append(getReferenceDataSourceDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationReferenceDataSourceResult == false)
            return false;
        AddApplicationReferenceDataSourceResult other = (AddApplicationReferenceDataSourceResult) obj;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        if (other.getReferenceDataSourceDescriptions() == null ^ this.getReferenceDataSourceDescriptions() == null)
            return false;
        if (other.getReferenceDataSourceDescriptions() != null
                && other.getReferenceDataSourceDescriptions().equals(this.getReferenceDataSourceDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getReferenceDataSourceDescriptions() == null) ? 0 : getReferenceDataSourceDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationReferenceDataSourceResult clone() {
        try {
            return (AddApplicationReferenceDataSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
